package com.spk.mixins.injector;

import com.spk.mixins.injector.transform.JarRemapper;
import com.spk.mixins.mappings.MappingParser;
import com.spk.mixins.mappings.MappingSet;
import com.spk.mixins.mappings.fingerprint.HeuristicMappingResolver;

import java.io.File;
import java.io.FileInputStream;

/**
 * Update-resilient Launcher pipeline that dynamically matches client bytecode using fingerprints,
 * produces client-remapped.jar, and prepares execution across ProGuard update scrambles.
 */
public class Launcher {

    private static final String DEFAULT_CLIENT_PATH = "C:\\Users\\naxos\\.spawnpk-data\\client.jar";
    private static final String DEFAULT_OUTPUT_PATH = "client-remapped.jar";

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   SPK Mixins Client Update-Resilient Loader     ");
        System.out.println("=================================================");

        String inputPath = args.length > 0 ? args[0] : DEFAULT_CLIENT_PATH;
        String outputPath = args.length > 1 ? args[1] : DEFAULT_OUTPUT_PATH;

        File clientJar = new File(inputPath);
        File outputJar = new File(outputPath);

        if (!clientJar.exists()) {
            System.err.println("[Launcher Warning] Target client JAR not found at: " + inputPath);
            System.err.println("[Launcher Warning] Run with arguments: java -jar client-injector.jar <input.jar> <output.jar>");
            return;
        }

        MappingSet mappings = new MappingSet();

        // Step 1: Heuristic Fingerprint Matching (Dynamic Deobfuscation for Update Resilience)
        File fingerprintFile = new File("fingerprints.json");
        if (fingerprintFile.exists()) {
            try (FileInputStream fis = new FileInputStream(fingerprintFile)) {
                System.out.println("[Launcher] Running Heuristic Matching Engine against client JAR...");
                mappings = HeuristicMappingResolver.resolveMappings(clientJar, fis);
            } catch (Exception e) {
                System.err.println("[Launcher Error] Heuristic mapping resolution failed.");
                e.printStackTrace();
            }
        } else {
            System.out.println("[Launcher] No fingerprints.json found. Skipping heuristic resolution.");
        }

        // Step 2: Merge Static Mappings if present
        File mappingFile = new File("mappings.json");
        if (mappingFile.exists()) {
            try (FileInputStream fis = new FileInputStream(mappingFile)) {
                MappingSet staticSet = MappingParser.parseJson(fis);
                staticSet.getClassObfToNamedMap().forEach(mappings::addClassMapping);
                System.out.println("[Launcher] Static mappings merged from mappings.json.");
            } catch (Exception e) {
                System.err.println("[Launcher Error] Failed to load static mappings file.");
                e.printStackTrace();
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
}
