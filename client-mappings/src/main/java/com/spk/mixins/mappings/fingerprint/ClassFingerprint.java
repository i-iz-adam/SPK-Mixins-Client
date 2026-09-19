package com.spk.mixins.mappings.fingerprint;

import java.util.ArrayList;
import java.util.List;

/**
 * Fingerprint definition for identifying a target class across ProGuard obfuscation scrambles.
 */
public class ClassFingerprint {
    private String namedClass;
    private String superClass;
    private List<String> interfaces = new ArrayList<>();
    private List<String> stringConstants = new ArrayList<>();
    private List<String> fieldTypes = new ArrayList<>();

    public ClassFingerprint(String namedClass) {
        this.namedClass = namedClass;
    }

    public ClassFingerprint withSuperClass(String superClass) {
        this.superClass = superClass;
        return this;
    }

    public ClassFingerprint withInterface(String interfaceName) {
        this.interfaces.add(interfaceName);
        return this;
    }

    public ClassFingerprint withStringConstant(String stringConstant) {
        this.stringConstants.add(stringConstant);
        return this;
    }

    public ClassFingerprint withFieldType(String fieldType) {
        this.fieldTypes.add(fieldType);
        return this;
    }

    public String getNamedClass() { return namedClass; }
    public String getSuperClass() { return superClass; }
    public List<String> getInterfaces() { return interfaces; }
    public List<String> getStringConstants() { return stringConstants; }
    public List<String> getFieldTypes() { return fieldTypes; }
}
