package com.spk.mixins.api.mixin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Injects code into a target method at specified points (e.g. HEAD, RETURN).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Inject {
    enum At {
        HEAD,
        RETURN
    }

    String method();
    At at() default At.HEAD;
}
