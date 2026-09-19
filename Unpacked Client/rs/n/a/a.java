/*
 * Decompiled with CFR 0.152.
 */
package rs.n.a;

import rs.l.f_0;
import rs.n.a.b;
import rs.n.e;

public class a
extends e {
    private boolean a;

    public static a b(int n2, String string, String string2) {
        a a2 = new a();
        rs.n.a.a.H[n2] = a2;
        a2.aw = n2;
        a2.ah = n2;
        a2.aI = 5;
        a2.M = 1;
        a2.J = 0;
        a2.aC = 0;
        a2.ab = 52;
        a2.E = new f_0(false, string);
        a2.aG = new f_0(false, string);
        a2.P = a2.E.n;
        a2.aR = a2.aG.o;
        a2.Q = string2;
        return a2;
    }

    public static a a(int n2, f_0 f_02, String string) {
        a a2 = new a();
        rs.n.a.a.H[n2] = a2;
        a2.aw = n2;
        a2.ah = n2;
        a2.aI = 5;
        a2.M = 1;
        a2.J = 0;
        a2.aC = 0;
        a2.ab = 52;
        a2.E = f_02;
        a2.aG = f_02;
        a2.P = a2.E.n;
        a2.aR = a2.aG.o;
        a2.Q = string;
        return a2;
    }

    public a g(int n2, int n3) {
        this.P = n2;
        this.aR = n3;
        return this;
    }

    public a a(f_0 f_02) {
        this.aG = f_02;
        this.bz = true;
        return this;
    }

    public a b(String string) {
        this.aG = new f_0(false, string);
        this.bz = true;
        return this;
    }

    public a c(String string) {
        this.a(this.aw + 1, string);
        return this;
    }

    public a b(f_0 f_02) {
        this.b(this.aw + 1, f_02);
        return this;
    }

    public b a(int n2, String string) {
        this.a = true;
        this.J = -1;
        this.ab = n2;
        int n3 = n2 + 1;
        e e2 = b.k(n3, string);
        b b2 = new b();
        rs.n.a.a.H[n2] = b2;
        b2.ah = n2;
        b2.aw = n2;
        b2.aI = 0;
        b2.M = 0;
        b2.P = e2.E.n;
        b2.aR = e2.aG.o;
        b2.aQ = true;
        b2.aC = 0;
        b2.ab = -1;
        b2.aH = 0;
        b2.k(1);
        b2.b(0, n3, 0, 0);
        return b2;
    }

    public b b(int n2, f_0 f_02) {
        this.a = true;
        this.J = -1;
        this.ab = n2;
        int n3 = n2 + 1;
        e e2 = b.c(n3, f_02);
        b b2 = new b();
        rs.n.a.a.H[n2] = b2;
        b2.ah = n2;
        b2.aw = n2;
        b2.aI = 0;
        b2.M = 0;
        b2.P = e2.E.n;
        b2.aR = e2.aG.o;
        b2.aQ = true;
        b2.aC = 0;
        b2.ab = -1;
        b2.aH = 0;
        b2.k(1);
        b2.b(0, n3, 0, 0);
        return b2;
    }

    public a a() {
        this.bx = true;
        return this;
    }

    public a d(String string) {
        this.by = string;
        this.bx = true;
        return this;
    }

    public boolean b() {
        return this.a;
    }
}

