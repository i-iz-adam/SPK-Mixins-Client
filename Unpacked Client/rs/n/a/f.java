/*
 * Decompiled with CFR 0.152.
 */
package rs.n.a;

import rs.l.k_0;
import rs.n.e;

public class f
extends e {
    public static k_0[] a = null;

    public static f a(int n2, String string) {
        f f2 = new f();
        f.H[n2] = f2;
        f2.ah = n2;
        f2.aw = n2;
        f2.aI = 4;
        f2.M = 0;
        f2.P = 0;
        f2.aR = 11;
        f2.J = 0;
        f2.aC = 0;
        f2.ab = -1;
        f2.S = false;
        f2.aS = true;
        f2.at = string;
        f2.Z = "";
        f2.O = 0;
        f2.L = 0;
        f2.ak = 0;
        f2.a();
        return f2;
    }

    public f a(String string, int n2) {
        this.Q = string;
        this.M = 1;
        this.P = n2;
        this.aR = 11;
        this.bo = true;
        this.L = 0xFFFFFF;
        return this;
    }

    public f a(int n2) {
        return this.a("Select option", n2);
    }

    public f a() {
        this.ao = a[0];
        return this;
    }

    public f b() {
        this.S = true;
        this.U = false;
        return this;
    }

    public f c() {
        this.U = true;
        this.S = false;
        return this;
    }

    public f h() {
        this.U = false;
        this.S = false;
        return this;
    }

    public f i() {
        this.ao = a[1];
        return this;
    }

    public f j() {
        this.ao = a[2];
        return this;
    }

    public f m(int n2) {
        this.ad = n2;
        return this;
    }

    public f k() {
        return this.m(0xFFFFFF);
    }

    public f l() {
        return this.m(12171349);
    }

    public f m() {
        return this.m(16750623);
    }

    public f n() {
        return this.b().j();
    }

    public f o() {
        return this.b().i();
    }
}

