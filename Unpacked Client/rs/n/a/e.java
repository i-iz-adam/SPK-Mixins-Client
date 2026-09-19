/*
 * Decompiled with CFR 0.152.
 */
package rs.n.a;

import rs.l.f_0;

public class e
extends rs.n.e {
    public static e a(int n2, String string) {
        e e2 = new e();
        e.H[n2] = e2;
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = new f_0(false, string);
        e2.aG = new f_0(false, string);
        e2.P = e2.E.n;
        e2.aR = e2.E.o;
        return e2;
    }

    public static e b(int n2, f_0 f_02) {
        e e2 = new e();
        e.H[n2] = e2;
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = f_02;
        e2.aG = f_02;
        e2.P = e2.E.n;
        e2.aR = e2.E.o;
        return e2;
    }

    public e a() {
        this.l = true;
        return this;
    }

    public e g(int n2, int n3) {
        this.P = n2;
        this.aR = n3;
        return this;
    }
}

