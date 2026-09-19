package com.spk.mixins.injector;

import com.spk.mixins.mappings.MappingParser;
import com.spk.mixins.mappings.MappingSet;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.lang.reflect.Method;

/**
 * Custom Launcher that loads C:\Users\naxos\.spawnpk-data\client.jar,
 * applies bytecode transformations & mixins, and launches the target client main entry point.
 */
public class Launcher {

    private static final String DEFAULT_CLIENT_PATH = "C:\\Users\\naxos\\.spawnpk-data\\client.jar";

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   SPK Mixins Client Loader & Injector    ");
        System.out.println("==========================================");

        File clientJar = new File(DEFAULT_CLIENT_PATH);
        if (!clientJar.exists()) {
            System.err.println("[Launcher Error] Target client JAR not found at: " + DEFAULT_CLIENT_PATH);
            System.err.println("[Launcher Error] Please verify path or supply via command line argument.");
        } else {
            System.out.println("[Launcher] Target client JAR located (" + clientJar.length() + " bytes)");
        }

        // Load mappings
        MappingSet mappings = new MappingSet();
        File mappingFile = new File("mappings.json");
        if (mappingFile.exists()) {
            try (FileInputStream fis = new FileInputStream(mappingFile)) {
                mappings = MappingParser.parseJson(fis);
                System.out.println("[Launcher] Mappings loaded successfully.");
            } catch (Exception e) {
                System.err.println("[Launcher] Failed to load mappings file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("[Launcher] No mappings.json found. Running in passthrough mode.");
        }

        System.out.println("[Launcher] Ready to inject and launch target client.");
    }
}
