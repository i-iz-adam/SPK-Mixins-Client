package com.spk.mixins.mappings;

import java.util.*;

/**
 * Access Transformer specification for changing visibility (e.g. private to public)
 */
public class AccessTransformer {
    public enum AccessLevel {
        PUBLIC, PROTECTED, PACKAGE_PRIVATE, PRIVATE
    }

    private final String targetClass; // Obfuscated or Named class
    private final String targetMember; // Field or Method name (empty for class itself)
    private final String descriptor; // Optional descriptor for methods
    private final AccessLevel accessLevel;
    private final boolean makeFinal;
    private final boolean removeFinal;

    public AccessTransformer(String targetClass, String targetMember, String descriptor, AccessLevel accessLevel, boolean removeFinal) {
        this.targetClass = targetClass;
        this.targetMember = targetMember;
        this.descriptor = descriptor;
        this.accessLevel = accessLevel;
        this.makeFinal = false;
        this.removeFinal = removeFinal;
    }

    public String getTargetClass() { return targetClass; }
    public String getTargetMember() { return targetMember; }
    public String getDescriptor() { return descriptor; }
    public AccessLevel getAccessLevel() { return accessLevel; }
    public boolean isRemoveFinal() { return removeFinal; }
}
