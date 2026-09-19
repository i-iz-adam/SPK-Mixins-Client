/*
 * Decompiled with CFR 0.152.
 */
package rs.s;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
@Documented
public @interface e {
    public String a();

    public String b() default "";

    public String c() default "";

    public String[] d() default {};

    public String[] e() default {};

    public boolean f() default true;

    public boolean g() default false;

    public boolean h() default false;

    public boolean i() default false;

    public boolean j() default true;

    public boolean k() default false;

    public boolean l() default false;
}

