package com.spk.mixins.injector;

import com.spk.mixins.injector.transform.JarRemapper;
import com.spk.mixins.mappings.MappingParser;
import com.spk.mixins.mappings.MappingSet;
import com.spk.mixins.mappings.fingerprint.ClassFingerprint;
import com.spk.mixins.mappings.fingerprint.HeuristicMappingResolver;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Update-resilient Launcher pipeline supporting modular JSON configs (mappings/ directory and fingerprints/ directory).
 */
public class Launcher {

    private static final String DEFAULT_CLIENT_PATH = "C:\\Users\\naxos\\.spawnpk-data\\client.jar";
    private static final String DEFAULT_OUTPUT_PATH = "client-remapped.jar";

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   SPK Mixins Modular Update-Resilient Loader    ");
        System.out.println("=================================================");

        String inputPath = args.length > 0 ? args[0] : DEFAULT_CLIENT_PATH;
        String outputPath = args.length > 1 ? args[1] : DEFAULT_OUTPUT_PATH;

        File clientJar = new File(inputPath);
        File outputJar = new File(outputPath);

        if (!clientJar.exists()) {
            System.err.println("[Launcher Warning] Target client JAR not found at: " + inputPath);
            return;
        }

        MappingSet mappings = new MappingSet();

        // Step 1: Load all fingerprints from fingerprints/ folder + fingerprints.json
        List<ClassFingerprint> allFingerprints = new ArrayList<>();
        loadFingerprintsFile(new File("fingerprints.json"), allFingerprints);

        File fingerprintsDir = new File("fingerprints");
        if (fingerprintsDir.exists() && fingerprintsDir.isDirectory()) {
            File[] files = fingerprintsDir.listFiles((dir, name) -> name.endsWith(".json"));
            if (files != null) {
                for (File f : files) {
                    loadFingerprintsFile(f, allFingerprints);
                }
            }
        }

        if (!allFingerprints.isEmpty()) {
            try {
                System.out.println("[Launcher] Resolving " + allFingerprints.size() + " class fingerprints against client JAR...");
                MappingSet dynamicSet = HeuristicMappingResolver.resolveMappings(clientJar, allFingerprints);
                dynamicSet.getClassObfToNamedMap().forEach(mappings::addClassMapping);
            } catch (Exception e) {
                System.err.println("[Launcher Error] Dynamic fingerprint matching failed.");
                e.printStackTrace();
            }
        }

        // Step 2: Load modular mappings from mappings/ directory + mappings.json
        loadMappingsFile(new File("mappings.json"), mappings);

        File mappingsDir = new File("mappings");
        if (mappingsDir.exists() && mappingsDir.isDirectory()) {
            File[] files = mappingsDir.listFiles((dir, name) -> name.endsWith(".json"));
            if (files != null) {
                for (File f : files) {
                    loadMappingsFile(f, mappings);
                }
            }
        }

        // Step 3: Deobfuscate & Remap JAR
        try {
            JarRemapper remapper = new JarRemapper(mappings);
            remapper.processJar(clientJar, outputJar);
            System.out.println("[Launcher] Output client JAR generated successfully: " + outputJar.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("[Launcher Error] Failed during JAR remapping process.");
            e.printStackTrace();
        }
    }

    private static void loadFingerprintsFile(File file, List<ClassFingerprint> list) {
        if (!file.exists()) return;
        try (FileInputStream fis = new FileInputStream(file)) {
            list.addAll(HeuristicMappingResolver.parseFingerprints(fis));
            System.out.println("[Launcher] Loaded fingerprints from: " + file.getName());
        } catch (Exception e) {
            System.err.println("[Launcher Error] Failed to read fingerprint file: " + file.getName());
        }
    }

    private static void loadMappingsFile(File file, MappingSet mappings) {
        if (!file.exists()) return;
        try (FileInputStream fis = new FileInputStream(file)) {
            MappingParser.parseJson(fis, mappings);
            System.out.println("[Launcher] Loaded mappings from: " + file.getName());
        } catch (Exception e) {
            System.err.println("[Launcher Error] Failed to read mapping file: " + file.getName());
        }
    }
}
