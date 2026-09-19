package com.spk.mixins.mappings;

import java.util.*;

/**
 * Encapsulates mappings between obfuscated names and clean named symbols.
 * Handles Classes, Fields, Methods, and Access Transformers.
 */
public class MappingSet {

    // Named -> Obfuscated & Obfuscated -> Named map for Classes
    private final Map<String, String> classNamedToObf = new HashMap<>();
    private final Map<String, String> classObfToNamed = new HashMap<>();

    // Key: ObfClass.ObfField -> NamedField
    private final Map<String, String> fieldObfToNamed = new HashMap<>();
    // Key: NamedClass.NamedField -> ObfField
    private final Map<String, String> fieldNamedToObf = new HashMap<>();

    // Key: ObfClass.ObfMethod + Descriptor -> NamedMethod
    private final Map<String, String> methodObfToNamed = new HashMap<>();
    // Key: NamedClass.NamedMethod + Descriptor -> ObfMethod
    private final Map<String, String> methodNamedToObf = new HashMap<>();

    private final List<AccessTransformer> accessTransformers = new ArrayList<>();

    public void addClassMapping(String obfuscated, String named) {
        classObfToNamed.put(obfuscated, named);
        classNamedToObf.put(named, obfuscated);
    }

    public void addFieldMapping(String obfClass, String obfField, String namedClass, String namedField) {
        fieldObfToNamed.put(obfClass + "." + obfField, namedField);
        fieldNamedToObf.put(namedClass + "." + namedField, obfField);
    }

    public void addMethodMapping(String obfClass, String obfMethod, String obfDesc, String namedClass, String namedMethod) {
        methodObfToNamed.put(obfClass + "." + obfMethod + obfDesc, namedMethod);
        methodNamedToObf.put(namedClass + "." + namedMethod + obfDesc, obfMethod);
    }

    public String mapFieldName(String obfClass, String obfField) {
        return fieldObfToNamed.getOrDefault(obfClass + "." + obfField, obfField);
    }

    public String mapMethodName(String obfClass, String obfMethod, String descriptor) {
        return methodObfToNamed.getOrDefault(obfClass + "." + obfMethod + descriptor, obfMethod);
    }

    public void addAccessTransformer(AccessTransformer at) {
        accessTransformers.add(at);
    }

    public String mapClassToObf(String named) {
        return classNamedToObf.getOrDefault(named, named);
    }

    public String mapClassToNamed(String obf) {
        return classObfToNamed.getOrDefault(obf, obf);
    }

    public Map<String, String> getClassNamedToObfMap() {
        return Collections.unmodifiableMap(classNamedToObf);
    }

    public Map<String, String> getClassObfToNamedMap() {
        return Collections.unmodifiableMap(classObfToNamed);
    }

    public List<AccessTransformer> getAccessTransformers() {
        return Collections.unmodifiableList(accessTransformers);
    }
}
