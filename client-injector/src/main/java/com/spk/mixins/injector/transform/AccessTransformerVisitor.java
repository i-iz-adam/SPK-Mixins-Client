package com.spk.mixins.injector.transform;

import com.spk.mixins.mappings.AccessTransformer;
import com.spk.mixins.mappings.MappingSet;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * ASM ClassVisitor that modifies access flags (e.g. private to public, removing final)
 * based on AccessTransformer definitions.
 */
public class AccessTransformerVisitor extends ClassVisitor {

    private final MappingSet mappingSet;
    private String className;

    public AccessTransformerVisitor(ClassVisitor classVisitor, MappingSet mappingSet) {
        super(Opcodes.ASM9, classVisitor);
        this.mappingSet = mappingSet;
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        this.className = name;
        int modifiedAccess = transformAccess(name, "", "", access);
        super.visit(version, modifiedAccess, name, signature, superName, interfaces);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        int modifiedAccess = transformAccess(className, name, descriptor, access);
        return super.visitField(modifiedAccess, name, descriptor, signature, value);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        int modifiedAccess = transformAccess(className, name, descriptor, access);
        return super.visitMethod(modifiedAccess, name, descriptor, signature, exceptions);
    }

    private int transformAccess(String targetClass, String memberName, String descriptor, int currentAccess) {
        int access = currentAccess;
        for (AccessTransformer at : mappingSet.getAccessTransformers()) {
            if (at.getTargetClass().replace('.', '/').equals(targetClass)) {
                if (at.getTargetMember().isEmpty() || at.getTargetMember().equals(memberName)) {
                    if (at.getAccessLevel() != null) {
                        // Clear existing access flags
                        access &= ~(Opcodes.ACC_PUBLIC | Opcodes.ACC_PROTECTED | Opcodes.ACC_PRIVATE);
                        switch (at.getAccessLevel()) {
                            case PUBLIC: access |= Opcodes.ACC_PUBLIC; break;
                            case PROTECTED: access |= Opcodes.ACC_PROTECTED; break;
                            case PRIVATE: access |= Opcodes.ACC_PRIVATE; break;
                            default: break;
                        }
                    }
                    if (at.isRemoveFinal()) {
                        access &= ~Opcodes.ACC_FINAL;
                    }
                }
            }
        }
        return access;
    }
}
