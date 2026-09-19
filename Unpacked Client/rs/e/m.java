/*
 * Decompiled with CFR 0.152.
 */
package rs.e;

import rs.e.j;
import rs.e.l;

public final class m
implements j {
    private final String a;
    private final l b;

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public String b() {
        return this.b.a();
    }

    @Override
    public int c() {
        return this.b.c();
    }

    public m(String string, l l2) {
        this.a = string;
        this.b = l2;
    }

    public String d() {
        return this.a;
    }

    public l e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        m m2 = (m)object;
        String string = this.d();
        String string2 = m2.d();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        l l2 = this.e();
        l l3 = m2.e();
        return !(l2 == null ? l3 != null : !l2.equals(l3));
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        String string = this.d();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        l l2 = this.e();
        n3 = n3 * 59 + (l2 == null ? 43 : l2.hashCode());
        return n3;
    }

    public String toString() {
        return "ConfigSectionDescriptor(key=" + this.d() + ", section=" + String.valueOf(this.e()) + ")";
    }
}

