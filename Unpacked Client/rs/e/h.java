/*
 * Decompiled with CFR 0.152.
 */
package rs.e;

import java.lang.reflect.Type;
import rs.e.a;
import rs.e.g;
import rs.e.j;
import rs.e.o;
import rs.e.q;

public final class h
implements j {
    private final g a;
    private final Type b;
    private final o c;
    private final a d;
    private final q e;

    @Override
    public String a() {
        return this.a.b();
    }

    @Override
    public String b() {
        return this.a.c();
    }

    @Override
    public int c() {
        return this.a.a();
    }

    public h(g g2, Type type, o o2, a a2, q q2) {
        this.a = g2;
        this.b = type;
        this.c = o2;
        this.d = a2;
        this.e = q2;
    }

    public g d() {
        return this.a;
    }

    public Type e() {
        return this.b;
    }

    public o f() {
        return this.c;
    }

    public a g() {
        return this.d;
    }

    public q h() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        h h2 = (h)object;
        g g2 = this.d();
        g g3 = h2.d();
        if (g2 == null ? g3 != null : !g2.equals(g3)) {
            return false;
        }
        Type type = this.e();
        Type type2 = h2.e();
        if (type == null ? type2 != null : !type.equals(type2)) {
            return false;
        }
        o o2 = this.f();
        o o3 = h2.f();
        if (o2 == null ? o3 != null : !o2.equals(o3)) {
            return false;
        }
        a a2 = this.g();
        a a3 = h2.g();
        if (a2 == null ? a3 != null : !a2.equals(a3)) {
            return false;
        }
        q q2 = this.h();
        q q3 = h2.h();
        return !(q2 == null ? q3 != null : !q2.equals(q3));
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        g g2 = this.d();
        n3 = n3 * 59 + (g2 == null ? 43 : g2.hashCode());
        Type type = this.e();
        n3 = n3 * 59 + (type == null ? 43 : type.hashCode());
        o o2 = this.f();
        n3 = n3 * 59 + (o2 == null ? 43 : o2.hashCode());
        a a2 = this.g();
        n3 = n3 * 59 + (a2 == null ? 43 : a2.hashCode());
        q q2 = this.h();
        n3 = n3 * 59 + (q2 == null ? 43 : q2.hashCode());
        return n3;
    }

    public String toString() {
        return "ConfigItemDescriptor(item=" + String.valueOf(this.d()) + ", type=" + String.valueOf(this.e()) + ", range=" + String.valueOf(this.f()) + ", alpha=" + String.valueOf(this.g()) + ", units=" + String.valueOf(this.h()) + ")";
    }
}

