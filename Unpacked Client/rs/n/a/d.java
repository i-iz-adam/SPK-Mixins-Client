/*
 * Decompiled with CFR 0.152.
 */
package rs.n.a;

import rs.n.d.b;
import rs.n.d.c;
import rs.n.e;

public class d
extends e {
    protected c a;

    public static d a(int n2) {
        d d2 = new d();
        d.H[n2] = d2;
        d2.aw = n2;
        d2.al = new int[0];
        d2.am = new int[0];
        d2.bc = new int[0];
        d2.aH = 500;
        d2.bj = 87;
        d2.k(0);
        return d2;
    }

    public static d f(int n2, int n3, int n4) {
        return d.a(n2).g(n3, n4);
    }

    public d g(int n2, int n3) {
        this.P = n2;
        this.aR = n3;
        return this;
    }

    public d m(int n2) {
        this.aH = n2;
        return this;
    }

    public b a(b b2) {
        return this.n(b2.c());
    }

    public b a(e e2) {
        return this.n(e2.aw);
    }

    public b n(int n2) {
        if (this.a == null) {
            this.a = new c(this);
        }
        return this.a.a(n2);
    }

    public void a() {
        if (this.a != null) {
            this.a.a();
        }
    }
}

