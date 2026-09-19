package com.spk.mixins.mappings.fingerprint;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.spk.mixins.mappings.MappingSet;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

/**
 * Scans an obfuscated JAR, evaluates ClassFingerprints dynamically, and constructs
 * a resilient MappingSet that survives ProGuard name scrambling across client updates.
 */
public class HeuristicMappingResolver {

    public static MappingSet resolveMappings(File targetJar, InputStream fingerprintsStream) throws Exception {
        List<ClassFingerprint> fingerprints = parseFingerprints(fingerprintsStream);
        return resolveMappings(targetJar, fingerprints);
    }

    public static MappingSet resolveMappings(File targetJar, List<ClassFingerprint> fingerprints) throws Exception {
        MappingSet mappingSet = new MappingSet();

        // Read all ClassNodes from target JAR
        Map<String, ClassNode> classMap = new HashMap<>();
        try (JarInputStream jis = new JarInputStream(new FileInputStream(targetJar))) {
            JarEntry entry;
            byte[] buffer = new byte[8192];
            while ((entry = jis.getNextJarEntry()) != null) {
                if (entry.getName().endsWith(".class")) {
                    ClassReader cr = new ClassReader(jis);
                    ClassNode cn = new ClassNode();
                    cr.accept(cn, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                    classMap.put(cn.name, cn);
                }
            }
        }

        System.out.println("[HeuristicMappingResolver] Scanned " + classMap.size() + " classes from target client JAR.");

        // Match fingerprints against obfuscated classes
        for (ClassFingerprint fp : fingerprints) {
            String bestMatchObfClass = null;
            double bestScore = 0.0;

            for (Map.Entry<String, ClassNode> entry : classMap.entrySet()) {
                double score = ClassMatcher.calculateMatchScore(entry.getValue(), fp);
                if (score > bestScore && score >= 0.70) { // Threshold for confidence match
                    bestScore = score;
                    bestMatchObfClass = entry.getKey();
                }
            }

            if (bestMatchObfClass != null) {
                String obfClassName = bestMatchObfClass.replace('/', '.');
                System.out.println("[HeuristicMappingResolver] Matched " + fp.getNamedClass() + " -> " + obfClassName + " (Confidence: " + String.format("%.2f", bestScore * 100) + "%)");
                mappingSet.addClassMapping(obfClassName, fp.getNamedClass());
            } else {
                System.err.println("[HeuristicMappingResolver Warning] Could not resolve heuristic match for fingerprint: " + fp.getNamedClass());
            }
        }

        return mappingSet;
    }

    public static List<ClassFingerprint> parseFingerprints(InputStream stream) {
        List<ClassFingerprint> list = new ArrayList<>();
        Gson gson = new Gson();
        JsonObject root = gson.fromJson(new InputStreamReader(stream, StandardCharsets.UTF_8), JsonObject.class);

        if (root.has("fingerprints")) {
            JsonArray fpArray = root.getAsJsonArray("fingerprints");
            fpArray.forEach(elem -> {
                JsonObject obj = elem.getAsJsonObject();
                ClassFingerprint fp = new ClassFingerprint(obj.get("namedClass").getAsString());

                if (obj.has("superClass")) fp.withSuperClass(obj.get("superClass").getAsString());
                if (obj.has("interfaces")) {
                    obj.getAsJsonArray("interfaces").forEach(i -> fp.withInterface(i.getAsString()));
                }
                if (obj.has("stringConstants")) {
                    obj.getAsJsonArray("stringConstants").forEach(s -> fp.withStringConstant(s.getAsString()));
                }
                if (obj.has("fieldTypes")) {
                    obj.getAsJsonArray("fieldTypes").forEach(f -> fp.withFieldType(f.getAsString()));
                }
                list.add(fp);
            });
        }
        return list;
    }
}
