package com.spk.mixins.mappings.fingerprint;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.AbstractInsnNode;

import java.util.*;

/**
 * Matches obfuscated ClassNodes against ClassFingerprints using heuristic analysis.
 */
public class ClassMatcher {

    public static double calculateMatchScore(ClassNode classNode, ClassFingerprint fingerprint) {
        double score = 0.0;
        double maxScore = 0.0;

        // Check SuperClass
        if (fingerprint.getSuperClass() != null) {
            maxScore += 2.0;
            if (classNode.superName != null && classNode.superName.replace('/', '.').equals(fingerprint.getSuperClass())) {
                score += 2.0;
            }
        }

        // Check Interfaces
        if (!fingerprint.getInterfaces().isEmpty()) {
            maxScore += fingerprint.getInterfaces().size();
            for (String iface : fingerprint.getInterfaces()) {
                if (classNode.interfaces != null && classNode.interfaces.stream().anyMatch(i -> i.replace('/', '.').equals(iface))) {
                    score += 1.0;
                }
            }
        }

        // Check String Constants (LDC instructions)
        if (!fingerprint.getStringConstants().isEmpty()) {
            maxScore += fingerprint.getStringConstants().size() * 3.0; // High weight for distinct string literals
            Set<String> stringsInClass = extractStrings(classNode);
            for (String strConstant : fingerprint.getStringConstants()) {
                if (stringsInClass.contains(strConstant)) {
                    score += 3.0;
                }
            }
        }

        // Check Field Types
        if (!fingerprint.getFieldTypes().isEmpty()) {
            maxScore += fingerprint.getFieldTypes().size();
            List<String> currentFields = new ArrayList<>();
            if (classNode.fields != null) {
                for (FieldNode fn : classNode.fields) {
                    currentFields.add(fn.desc);
                }
            }
            for (String fieldType : fingerprint.getFieldTypes()) {
                if (currentFields.contains(fieldType)) {
                    score += 1.0;
                }
            }
        }

        return maxScore > 0 ? (score / maxScore) : 0.0;
    }

    private static Set<String> extractStrings(ClassNode classNode) {
        Set<String> strings = new HashSet<>();
        if (classNode.methods == null) return strings;

        for (MethodNode mn : classNode.methods) {
            if (mn.instructions == null) continue;
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof LdcInsnNode) {
                    LdcInsnNode ldc = (LdcInsnNode) insn;
                    if (ldc.cst instanceof String) {
                        strings.add((String) ldc.cst);
                    }
                }
            }
        }
        return strings;
    }
}
