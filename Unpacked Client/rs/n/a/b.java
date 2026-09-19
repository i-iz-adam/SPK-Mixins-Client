/*
 * Decompiled with CFR 0.152.
 */
package rs.n.a;

import rs.l.f_0;
import rs.n.a.a;
import rs.n.e;

public class b
extends a {
    public static e k(int n2, String string) {
        e e2 = b.j(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.P = 512;
        e2.aR = 334;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = new f_0(false, string);
        e2.aG = new f_0(false, string);
        return e2;
    }

    public static e c(int n2, f_0 f_02) {
        e e2 = b.j(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.P = 512;
        e2.aR = 334;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = f_02;
        e2.aG = f_02;
        return e2;
    }

    public b h(int n2, int n3) {
        this.P = n2;
        this.aR = n3;
        return this;
    }

    @Override
    public /* synthetic */ a g(int n2, int n3) {
        return this.h(n2, n3);
    }
}

