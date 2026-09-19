/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Binder
 *  com.google.inject.Injector
 *  com.google.inject.Module
 */
package rs.s;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Module;
import rs.s.e;

public abstract class a
implements Module {
    protected Injector a;

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object object) {
        return super.equals(object);
    }

    public void configure(Binder binder) {
    }

    protected void a() {
    }

    protected void b() {
    }

    public void c() {
    }

    public final Injector d() {
        return this.a;
    }

    public String e() {
        return this.getClass().getAnnotation(e.class).a();
    }
}

