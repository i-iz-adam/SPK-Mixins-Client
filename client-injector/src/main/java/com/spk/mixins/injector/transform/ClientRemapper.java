package com.spk.mixins.injector.transform;

import com.spk.mixins.mappings.MappingSet;
import org.objectweb.asm.commons.Remapper;

/**
 * Custom ASM Remapper that dynamically translates obfuscated class/field/method names 
 * into readable named symbols (and vice-versa).
 */
public class ClientRemapper extends Remapper {

    private final MappingSet mappingSet;

    public ClientRemapper(MappingSet mappingSet) {
        this.mappingSet = mappingSet;
    }

    @Override
    public String map(String internalName) {
        if (internalName == null) return null;
        String mapped = mappingSet.mapClassToNamed(internalName.replace('/', '.'));
        return mapped != null ? mapped.replace('.', '/') : internalName;
    }

    @Override
    public String mapFieldName(String owner, String name, String descriptor) {
        String ownerClass = owner.replace('/', '.');
        return mappingSet.mapFieldName(ownerClass, name);
    }

    @Override
    public String mapMethodName(String owner, String name, String descriptor) {
        String ownerClass = owner.replace('/', '.');
        return mappingSet.mapMethodName(ownerClass, name, descriptor);
    }
}
