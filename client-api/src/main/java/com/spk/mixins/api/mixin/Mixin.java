package com.spk.mixins.api.mixin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a class as a Mixin targeting a specific deobfuscated target class name.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Mixin {
    /**
     * Target deobfuscated class name, e.g. "Client" or "Entity".
     */
    String target();
}
