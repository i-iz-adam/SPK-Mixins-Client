/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.c.an_0;
import rs.n.e;
import rs.q.a.a.a;

/*
 * Renamed from rs.n.c.aM
 */
public class am_0
extends c {
    public static a c = new an_0();
    public static final int d = 50;
    public static k_0[] e;
    public static e f;
    public static int g;
    public static int bI;
    public static int bJ;

    public am_0(k_0[] k_0Array) {
        super(k_0Array);
        e = k_0Array;
    }

    public static void k(int n2, String string) {
        rs.n.e.H[40405 + n2].at = string;
    }

    public static void b(int n2, String string, boolean bl) {
        int n3 = g++;
        int n4 = 19;
        if (bl) {
            am_0.a(n3, string, "Select", e, n2, 12171349, false, true, 125);
            rs.n.e.H[n3].br = 0xFFFFFF;
        } else {
            am_0.a(n3, string, e, n2, 16750623);
        }
        f.b(bI++, n3, 6, bJ);
        bJ += 17;
        if (n2 == 1) {
            bJ += 3;
        }
        if (n2 == 2) {
            bJ += 5;
        }
    }

    @Override
    public void a() {
        e e2 = am_0.d(40403);
        am_0.c(40402, 8, "gameframe/SPRITE");
        int n2 = 24;
        boolean bl = false;
        boolean bl2 = false;
        int n3 = 0;
        f = am_0.j(40404);
        f.k(50);
        bJ = 10;
        bI = 0;
        g = 40405;
        int n4 = 50 - bI;
        for (int i2 = 0; i2 < n4; ++i2) {
            am_0.b(0, "", false);
        }
        am_0.f.P = 168;
        am_0.f.aR = 225 - n2;
        am_0.f.aH = 1320;
        n3 = 0;
        e2.k(6);
        e2.b(n3++, 40402, 0, 31 + n2);
        e2.b(n3++, 16022, 0, 28 + n2);
        e2.b(n3++, 16022, 0, 255);
        e2.b(n3++, 16023, 4, 251);
        e2.b(n3++, 32000, 0, 0);
        e2.b(n3++, 40404, 6, 30 + n2);
    }
}

