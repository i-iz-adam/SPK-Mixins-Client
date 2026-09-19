/*
 * Decompiled with CFR 0.152.
 */
package rs.y;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.temporal.ChronoUnit;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
public @interface a {
    public long a();

    public ChronoUnit b();

    public boolean c() default false;
}

