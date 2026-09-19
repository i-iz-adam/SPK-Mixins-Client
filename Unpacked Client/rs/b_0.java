/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.a;

/*
 * Renamed from rs.B
 */
public final class b_0 {
    private final a a;
    private a b;

    public b_0() {
        this.a.a = this.a = new a();
        this.a.b = this.a;
    }

    public void a(a a2) {
        if (a2.b != null) {
            a2.a();
        }
        a2.b = this.a.b;
        a2.a = this.a;
        a2.b.a = a2;
        a2.a.b = a2;
    }

    public a a() {
        a a2 = this.a.a;
        if (a2 == this.a) {
            return null;
        }
        a2.a();
        return a2;
    }

    public a b() {
        a a2 = this.a.a;
        if (a2 == this.a) {
            this.b = null;
            return null;
        }
        this.b = a2.a;
        return a2;
    }

    public a c() {
        a a2 = this.b;
        if (a2 == this.a) {
            this.b = null;
            return null;
        }
        this.b = a2.a;
        return a2;
    }

    public int d() {
        int n2 = 0;
        a a2 = this.a.a;
        while (a2 != this.a) {
            ++n2;
            a2 = a2.a;
        }
        return n2;
    }
}

