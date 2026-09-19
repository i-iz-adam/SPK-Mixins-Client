package com.spk.mixins.injector.agent;

import com.spk.mixins.injector.transform.AccessTransformerVisitor;
import com.spk.mixins.injector.transform.MixinTransformer;
import com.spk.mixins.mappings.MappingSet;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * Java Agent allowing runtime bytecode modification of the target client JAR.
 */
public class ClientAgent {

    private static MappingSet mappings = new MappingSet();
    private static MixinTransformer mixinTransformer = new MixinTransformer();

    public static void agentmain(String agentArgs, Instrumentation inst) {
        init(inst);
    }

    public static void premain(String agentArgs, Instrumentation inst) {
        init(inst);
    }

    private static void init(Instrumentation inst) {
        System.out.println("[SPK-Mixins-Agent] Initializing Java Agent Instrumentation...");
        inst.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
                                    ProtectionDomain protectionDomain, byte[] classfileBuffer) {
                if (className == null) return classfileBuffer;

                try {
                    // Apply Access Transformers
                    ClassReader reader = new ClassReader(classfileBuffer);
                    ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_MAXS);
                    AccessTransformerVisitor visitor = new AccessTransformerVisitor(writer, mappings);
                    reader.accept(visitor, 0);
                    byte[] transformed = writer.toByteArray();

                    // Apply Mixin Transformations
                    return mixinTransformer.transform(className, transformed);
                } catch (Exception e) {
                    System.err.println("[SPK-Mixins-Agent] Failed transforming class: " + className);
                    e.printStackTrace();
                    return classfileBuffer;
                }
            }
        }, true);
    }
}
