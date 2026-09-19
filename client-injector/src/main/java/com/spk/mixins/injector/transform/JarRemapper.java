package com.spk.mixins.injector.transform;

import com.spk.mixins.mappings.MappingSet;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.commons.ClassRemapper;

import java.io.*;
import java.util.jar.*;

/**
 * Reads an input JAR (e.g. obfuscated client.jar), transforms all class definitions and member references
 * using ClientRemapper and AccessTransformerVisitor, and outputs a deobfuscated/remapped target JAR.
 */
public class JarRemapper {

    private final MappingSet mappingSet;

    public JarRemapper(MappingSet mappingSet) {
        this.mappingSet = mappingSet;
    }

    public void processJar(File inputJar, File outputJar) throws IOException {
        System.out.println("[JarRemapper] Remapping JAR: " + inputJar.getName() + " -> " + outputJar.getName());

        ClientRemapper remapper = new ClientRemapper(mappingSet);

        try (JarInputStream jis = new JarInputStream(new FileInputStream(inputJar));
             JarOutputStream jos = new JarOutputStream(new FileOutputStream(outputJar), jis.getManifest())) {

            JarEntry entry;
            byte[] buffer = new byte[8192];

            while ((entry = jis.getNextJarEntry()) != null) {
                String entryName = entry.getName();

                if (entryName.endsWith(".class")) {
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    int bytesRead;
                    while ((bytesRead = jis.read(buffer)) != -1) {
                        baos.write(buffer, 0, bytesRead);
                    }
                    byte[] classBytes = baos.toByteArray();

                    byte[] transformedBytes = remapClass(classBytes, remapper);

                    // Determine new class entry name after remapping
                    ClassReader reader = new ClassReader(transformedBytes);
                    String remappedClassName = reader.getClassName() + ".class";

                    JarEntry newEntry = new JarEntry(remappedClassName);
                    jos.putNextEntry(newEntry);
                    jos.write(transformedBytes);
                    jos.closeEntry();
                } else if (!entryName.equals(JarFile.MANIFEST_NAME) && !entry.isDirectory()) {
                    // Pass-through non-class resources
                    JarEntry newEntry = new JarEntry(entryName);
                    jos.putNextEntry(newEntry);
                    int bytesRead;
                    while ((bytesRead = jis.read(buffer)) != -1) {
                        jos.write(buffer, 0, bytesRead);
                    }
                    jos.closeEntry();
                }
            }
        }
        System.out.println("[JarRemapper] Successfully remapped JAR to: " + outputJar.getAbsolutePath());
    }

    private byte[] remapClass(byte[] originalClassBytes, ClientRemapper remapper) {
        ClassReader reader = new ClassReader(originalClassBytes);
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);

        // Chain: AccessTransformerVisitor -> ClassRemapper -> ClassWriter
        AccessTransformerVisitor atVisitor = new AccessTransformerVisitor(writer, mappingSet);
        ClassRemapper classRemapper = new ClassRemapper(atVisitor, remapper);

        reader.accept(classRemapper, ClassReader.EXPAND_FRAMES);
        return writer.toByteArray();
    }
}
