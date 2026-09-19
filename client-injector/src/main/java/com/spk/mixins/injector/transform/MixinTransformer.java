package com.spk.mixins.injector.transform;

import com.spk.mixins.api.mixin.Inject;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Mixin Processor that takes bytecode from a Mixin class and weaves injected code
 * into the target class bytecode.
 */
public class MixinTransformer {

    private final Map<String, ClassNode> mixins = new HashMap<>();

    public void registerMixin(byte[] mixinBytecode) {
        ClassReader reader = new ClassReader(mixinBytecode);
        ClassNode node = new ClassNode();
        reader.accept(node, 0);
        mixins.put(node.name, node);
    }

    public byte[] transform(String className, byte[] targetBytecode) {
        // Look up if any registered Mixins target this class
        ClassReader reader = new ClassReader(targetBytecode);
        ClassNode targetNode = new ClassNode();
        reader.accept(targetNode, 0);

        boolean modified = false;

        for (ClassNode mixinNode : mixins.values()) {
            // Inspect mixin annotations and inject code into targetNode methods
            for (MethodNode mixinMethod : mixinNode.methods) {
                if (mixinMethod.visibleAnnotations != null) {
                    for (AnnotationNode ann : mixinMethod.visibleAnnotations) {
                        if (ann.desc.contains("Inject")) {
                            // Find target method and inject HEAD or RETURN
                            modified = applyInjection(targetNode, mixinMethod, ann);
                        }
                    }
                }
            }
        }

        if (modified) {
            org.objectweb.asm.ClassWriter writer = new org.objectweb.asm.ClassWriter(org.objectweb.asm.ClassWriter.COMPUTE_FRAMES | org.objectweb.asm.ClassWriter.COMPUTE_MAXS);
            targetNode.accept(writer);
            return writer.toByteArray();
        }

        return targetBytecode;
    }

    private boolean applyInjection(ClassNode targetNode, MethodNode mixinMethod, AnnotationNode injectAnn) {
        String targetMethodName = null;
        for (int i = 0; i < injectAnn.values.size(); i += 2) {
            if ("method".equals(injectAnn.values.get(i))) {
                targetMethodName = (String) injectAnn.values.get(i + 1);
            }
        }

        if (targetMethodName == null) return false;

        for (MethodNode targetMethod : targetNode.methods) {
            if (targetMethod.name.equals(targetMethodName)) {
                // Inject at HEAD
                InsnList insns = new InsnList();
                for (AbstractInsnNode insn : mixinMethod.instructions) {
                    if (insn.getOpcode() != Opcodes.RETURN) {
                        insns.add(insn.clone(null));
                    }
                }
                targetMethod.instructions.insert(insns);
                return true;
            }
        }
        return false;
    }
}
