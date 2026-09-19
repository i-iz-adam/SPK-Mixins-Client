package com.spk.mixins.injector.transform;

import com.spk.mixins.mappings.MappingSet;
import org.objectweb.asm.commons.Remapper;

/**
 * Custom ASM Remapper that dynamically translates obfuscated class/field/method names 
 * into readable named symbols (or vice-versa).
 */
public class ClientRemapper extends Remapper {

    private final MappingSet mappingSet;

    public ClientRemapper(MappingSet mappingSet) {
        this.mappingSet = mappingSet;
    }

    @Override
    public String map(String internalName) {
        String named = mappingSet.mapClassToNamed(internalName);
        return named != null ? named : internalName;
    }

    @Override
    public String mapFieldName(String owner, String name, String descriptor) {
        return super.mapFieldName(owner, name, descriptor);
    }

    @Override
    public String mapMethodName(String owner, String name, String descriptor) {
        return super.mapMethodName(owner, name, descriptor);
    }
}
