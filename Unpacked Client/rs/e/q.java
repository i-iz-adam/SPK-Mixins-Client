/*
 * Decompiled with CFR 0.152.
 */
package rs.e;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
@Documented
public @interface q {
    public static final String a = "ms";
    public static final String b = " mins";
    public static final String c = "%";
    public static final String d = "px";
    public static final String e = "s";
    public static final String f = " ticks";

    public String a();
}

