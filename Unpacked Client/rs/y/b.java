/*
 * Decompiled with CFR 0.152.
 */
package rs.y;

import java.lang.reflect.Method;
import java.time.Instant;
import rs.y.a;

public class b {
    private final a a;
    private final Method b;
    private final Object c;
    private final Runnable d;
    private Instant e = Instant.now();

    public b(a a2, Method method, Object object, Runnable runnable) {
        this.a = a2;
        this.b = method;
        this.c = object;
        this.d = runnable;
    }

    public String toString() {
        return "ScheduledMethod(schedule=" + String.valueOf(this.a()) + ", method=" + String.valueOf(this.b()) + ", object=" + String.valueOf(this.c()) + ", lambda=" + String.valueOf(this.d()) + ", last=" + String.valueOf(this.e()) + ")";
    }

    public a a() {
        return this.a;
    }

    public Method b() {
        return this.b;
    }

    public Object c() {
        return this.c;
    }

    public Runnable d() {
        return this.d;
    }

    public Instant e() {
        return this.e;
    }

    public void a(Instant instant) {
        this.e = instant;
    }
}

