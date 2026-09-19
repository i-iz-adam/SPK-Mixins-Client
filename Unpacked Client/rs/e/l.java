/*
 * Decompiled with CFR 0.152.
 */
package rs.e;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface l {
    public String a();

    public String b();

    public int c();

    public boolean d() default false;
}

