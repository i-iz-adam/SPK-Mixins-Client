package com.spk.mixins.injector;

import com.spk.mixins.injector.transform.JarRemapper;
import com.spk.mixins.mappings.MappingParser;
import com.spk.mixins.mappings.MappingSet;

import java.io.File;
import java.io.FileInputStream;

/**
 * Launcher pipeline that processes input obfuscated client.jar into client-remapped.jar,
 * applying class/field/method renames and access transformers before running.
 */
public class Launcher {

    private static final String DEFAULT_CLIENT_PATH = "C:\\Users\\naxos\\.spawnpk-data\\client.jar";
    private static final String DEFAULT_OUTPUT_PATH = "client-remapped.jar";

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   SPK Mixins Client Loader & Remapper    ");
        System.out.println("==========================================");

        String inputPath = args.length > 0 ? args[0] : DEFAULT_CLIENT_PATH;
        String outputPath = args.length > 1 ? args[1] : DEFAULT_OUTPUT_PATH;

        File clientJar = new File(inputPath);
        File outputJar = new File(outputPath);

        if (!clientJar.exists()) {
            System.err.println("[Launcher Warning] Target client JAR not found at: " + inputPath);
            System.err.println("[Launcher Warning] Pass input path as argument: java -jar client-injector.jar <input.jar> <output.jar>");
            return;
        }

        // Load mappings
        MappingSet mappings = new MappingSet();
        File mappingFile = new File("mappings.json");
        if (mappingFile.exists()) {
            try (FileInputStream fis = new FileInputStream(mappingFile)) {
                mappings = MappingParser.parseJson(fis);
                System.out.println("[Launcher] Mappings loaded successfully from mappings.json.");
            } catch (Exception e) {
                System.err.println("[Launcher Error] Failed to load mappings file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("[Launcher] No mappings.json found. Processing in default passthrough mode.");
        }

        try {
            JarRemapper remapper = new JarRemapper(mappings);
            remapper.processJar(clientJar, outputJar);
            System.out.println("[Launcher] Remapped JAR output ready at: " + outputJar.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("[Launcher Error] Failed during JAR remapping process.");
            e.printStackTrace();
        }
    }
}
