/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.d.k;
import rs.l.k_0;
import rs.n.a.a;
import rs.n.a.f;
import rs.n.c;
import rs.n.c.ao_0;
import rs.n.e;

public class ac
extends c {
    public static rs.n.d.c c;
    public static int d;
    public static final int e = 5;
    public static int f;
    public static int g;
    public static int bI;
    public static boolean bJ;
    private static final int bU = 32;
    private static final int bV = 20;
    public static int bK;
    public static int bL;
    public static final String bM = "";
    public static final int bN = 700;
    public static final int[] bO;
    public static final int[] bP;
    public static final String[] bQ;
    public static final String[] bR;
    public static final String[] bS;
    public static final int[] bT;

    public ac(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        e e2 = rs.n.c.ac.d(36000);
        c = new rs.n.d.c(e2);
        rs.n.a.e.a(36800, "list/bg");
        rs.n.a.e.a(36801, "list/bg bottom");
        rs.n.a.e.a((int)36802, (String)"list/bg top").bf = false;
        rs.n.a.e.a(36803, "list/bg foot");
        c.a(36800).a(13, 13);
        c.a(36801).a(36800, false, true, 6, -39);
        c.a(36802).a(36800, false, false, 9, 25);
        c.a(36803).a(36800, false, true, 0, -9);
        for (n2 = 0; n2 < 5; ++n2) {
            rs.n.a.a.b(36804 + n2, "slayer/image 10", " Select tab");
            rs.n.c.ac.a(36809 + n2, "Tab 1", this.a, 0, 16750623, true, true);
            int n3 = 13 + 91 * n2;
            int n4 = 28;
            c.a(36804 + n2).a(36800, n3, n4);
            c.a(36809 + n2).a(36800, n3 + 41, n4 + 4);
        }
        c.a(63740).a(476, 17);
        c.a(63741).a(476, 17);
        rs.n.c.ac.a(36001, "Item List Title", this.a, 2, 16751360, true, true);
        c.a(36001).a(258, 18);
        rs.n.c.ac.a(36002, "Description Line 1", this.a, 1, 16751360, false, true);
        rs.n.c.ac.a(36003, "Description Line 1 (small)", this.a, 0, 12171349, false, true);
        c.a(36002).a(25, 283);
        c.a(36003).a(25, 299);
        rs.n.a.f.a(36814, bM).a().m(16751360);
        rs.n.a.f.a(36815, bM).a().m(16751360);
        rs.n.a.f.a(36816, bM).a().m(16751360);
        rs.n.a.f.a(36817, bM).a().m(16751360);
        for (n2 = 36814; n2 <= 36817; ++n2) {
            c.a(n2).a(36800, false, true, 0, 0);
        }
        rs.n.c.ac.a(36004, 5, 36005, 17, "bank/bank", 35, 25, "Deposit all to inventory", 36006, 18, "bank/bank", 36007, "Empty your backpack into\nyour bank", 0, 20);
        c.a(36004).a(415, 284);
        c.a(36005).a(400, 224);
        rs.n.c.ac.a(36008, 5, 36009, 31, "bank/bank", 31, 25, "Deposit all to bank", 36010, 31, "bank/bank", 36011, "Empty your backpack into\nyour bank", 0, 20);
        c.a(36008).a(455, 284);
        c.a(36009).a(440, 224);
        rs.n.a.a.b(36012, "wiki/button 1", " Search by item").a(36013, "wiki/button 2");
        rs.n.c.ac.a(36015, "<img=39> Search for an item", this.a, 0, 16751360, true, true);
        c.a(36012).a(21, 281);
        c.a(36013).a(21, 281);
        c.a(36015).a(110, 292);
        rs.n.a.a.b(36016, "drops/sprite 3", " Go back").a(36017, "drops/sprite 4");
        c.a(36016).a(19, 17);
        c.a(36017).a(19, 17);
        rs.n.c.ac.a(36019, "Search description text", this.a, 0, 16751360, false, true);
        c.a(36019).a(215, 293);
        e e3 = rs.n.c.ac.d(30073);
        e e4 = rs.n.c.ac.d(30074);
        rs.n.a.c.g(30074, 28).a(4).h(10, 4);
        e3.k(1);
        e3.b(0, 30074, 16, 8);
        e e5 = rs.n.c.ac.d(36026);
        e5.al = new int[1];
        e5.am = new int[1];
        e5.bc = new int[1];
        e5.aH = 500;
        e5.P = 455;
        e5.aR = 243;
        e5.bj = 87;
        e5.k(701);
        e5.b(0, 36025, 15, 10);
        c.a(36026).a(36800, false, false, 8, 25);
        rs.n.a.c.g(36025, 700).a(7).h(g, bI);
        int n5 = 36027;
        int n6 = 1;
        int n7 = 0;
        int n8 = 30;
        int n9 = 44;
        int n10 = n8;
        int n11 = n9 + 1;
        for (int i2 = n5; i2 < n5 + 700; ++i2) {
            rs.n.c.ac.a(i2, bM, this.a, 0, 16750623, true);
            e5.b(n6++, i2, n10, n11);
            n10 += rs.n.c.ac.l((int)36025).ac + 32;
            if (++n7 < rs.n.e.l((int)36025).P) continue;
            n7 = 0;
            n10 = n8;
            n11 += rs.n.c.ac.l((int)36025).ap + 32;
        }
        rs.n.c.ac.j();
        c.a();
    }

    public static void b(String string) {
        if (f >= 5) {
            return;
        }
        int n2 = f++;
        if (!rs.n.c.ac.m().bf) {
            rs.n.c.ac.c(true);
        }
        rs.n.c.ac.l((int)(36804 + n2)).bf = true;
        rs.n.c.ac.l((int)(36809 + n2)).at = string;
    }

    public static void m(int n2) {
        if (n2 + 1 > f) {
            return;
        }
        for (int i2 = 0; i2 < f; ++i2) {
            int n3 = 36804 + i2;
            if (n2 == i2) {
                rs.n.e.H[n3].E = ao_0.d;
                rs.n.e.H[n3].aG = ao_0.d;
                continue;
            }
            rs.n.e.H[n3].E = ao_0.e;
            rs.n.e.H[n3].aG = ao_0.e;
        }
    }

    public static void c(String string) {
        int n2;
        rs.n.c.ac.l((int)36025).bf = false;
        int n3 = 0;
        for (n2 = 0; n2 < d; ++n2) {
            k k2;
            int n4 = rs.n.c.ac.l((int)36025).az[n2] - 1;
            int n5 = rs.n.c.ac.l((int)36025).ax[n2];
            String string2 = rs.n.c.ac.l((int)(36027 + n2)).at;
            if (n4 <= 0 || (k2 = (k)rs.d.k.c.b(n4)) == null || k2.w == null || !k2.w.toLowerCase().contains(string.toLowerCase())) continue;
            rs.n.c.ac.bO[n3] = n4;
            rs.n.c.ac.bP[n3] = n5;
            rs.n.c.ac.bQ[n3] = string2;
            ++n3;
        }
        rs.n.c.ac.j();
        for (n2 = 0; n2 < n3; ++n2) {
            rs.n.c.ac.e(bO[n2], bP[n2], bQ[n2]);
        }
        rs.n.c.ac.l((int)36001).at = "<img=39> Search: @yel@\"" + string + "\" @gre@(" + n3 + " results)";
        rs.n.c.ac.l((int)36025).bf = true;
    }

    public static void e(int n2, int n3, String string) {
        if (d >= 700) {
            return;
        }
        rs.n.c.ac.d(d++, n2, n3, string);
    }

    public static void d(int n2, int n3, int n4, String string) {
        rs.n.c.ac.l((int)(36027 + n2)).at = string;
        rs.n.c.ac.l((int)36025).az[n2] = n3 == 0 ? 0 : n3 + 1;
        rs.n.c.ac.l((int)36025).ax[n2] = n4;
    }

    public static void h() {
        bK = 431;
        bL = 431;
        rs.n.c.ac.c(false);
        rs.n.c.ac.d(true);
        rs.n.c.ac.o().P = 455;
        rs.n.c.ac.o().aR = 244;
        rs.n.c.ac.n(7);
        rs.n.a.c c2 = (rs.n.a.c)rs.n.c.ac.l(36025);
        if (c2.ac != 32 || c2.ap != 20) {
            rs.n.c.ac.g(32, 20);
        }
        rs.n.c.ac.i();
    }

    public static void i() {
        rs.n.c.ac.l((int)36026).V = 0;
        rs.n.c.ac.l((int)36026).aH = 500;
        f = 0;
        for (int i2 = 0; i2 < 5; ++i2) {
            rs.n.c.ac.l((int)(36804 + i2)).bf = false;
            rs.n.c.ac.l((int)(36809 + i2)).at = bM;
        }
        rs.n.c.ac.j();
        rs.n.c.ac.l((int)36002).at = bM;
        rs.n.c.ac.l((int)36003).at = bM;
        rs.n.c.ac.l((int)36019).at = bM;
        for (int n2 : bT) {
            rs.n.c.ac.l((int)n2).bf = false;
        }
        rs.n.c.ac.e(false);
    }

    public static void j() {
        d = 0;
        for (int i2 = 0; i2 < 700; ++i2) {
            rs.n.c.ac.d(i2, 0, 0, bM);
        }
        rs.n.c.ac.g(g, bI);
    }

    public static void k() {
        int n2 = d / rs.n.e.l((int)36025).P;
        int n3 = n2 * (rs.n.c.ac.l((int)36025).ap + 32);
        int n4 = 100;
        if (n3 >= n4) {
            n4 = n3 + (rs.n.c.ac.l((int)36025).ap + 32) * 3;
        }
        rs.n.c.ac.l((int)36026).aH = n4;
    }

    public static void g(int n2, int n3) {
        rs.n.a.c c2 = (rs.n.a.c)rs.n.e.l(36025);
        c2.h(n2, n3);
        g = n2;
        bI = n3;
        rs.n.c.ac.l();
        rs.n.c.ac.k();
    }

    public static void n(int n2) {
        rs.n.a.c c2 = (rs.n.a.c)rs.n.e.l(36025);
        c2.a(n2);
        rs.n.d.a a2 = c.b(rs.n.c.ac.o().aw).e();
        if (n2 >= 10) {
            if (a2.b() == 8) {
                rs.n.c.ac.o().P = 464;
                a2.a(1);
                c.a();
            }
        } else if (a2.b() != 8) {
            rs.n.c.ac.o().P = 455;
            a2.a(8);
            c.a();
        }
        rs.n.c.ac.l();
    }

    public static void l() {
        int n2 = 36027;
        int n3 = 1;
        int n4 = 0;
        int n5 = 30;
        int n6 = 44;
        int n7 = n5;
        int n8 = n6 + 1;
        for (int i2 = n2; i2 < n2 + 700; ++i2) {
            rs.n.c.ac.o().b(n3++, i2, n7, n8);
            n7 += rs.n.c.ac.l((int)36025).ac + 32;
            if (++n4 < rs.n.e.l((int)36025).P) continue;
            n4 = 0;
            n7 = n5;
            n8 += rs.n.c.ac.l((int)36025).ap + 32;
        }
    }

    public static void a(boolean bl) {
        rs.n.c.ac.l((int)36025).W = bl ? bR : new String[]{null, null, null, null, null};
    }

    public static void b(boolean bl) {
        rs.n.c.ac.l((int)30074).W = bl ? bS : new String[]{null, null, null, null, null};
    }

    public static void c(boolean bl) {
        int n2 = 0;
        if (bl) {
            if (!rs.n.c.ac.m().bf) {
                n2 = -25;
            }
            rs.n.c.ac.m().bf = true;
        } else {
            if (rs.n.c.ac.m().bf) {
                n2 = 25;
            }
            rs.n.c.ac.m().bf = false;
        }
        if (n2 != 0) {
            rs.n.d.a a2 = c.b(rs.n.c.ac.o().aw).e();
            rs.n.c.ac.o().aR += n2;
            a2.b(a2.c() - n2);
            c.a();
        }
    }

    public static void d(boolean bl) {
        if (bl) {
            if (!rs.n.c.ac.n().bf) {
                rs.n.c.ac.o().aR -= 32;
            }
            rs.n.c.ac.n().bf = true;
        } else {
            if (rs.n.c.ac.n().bf) {
                rs.n.c.ac.o().aR += 32;
            }
            rs.n.c.ac.n().bf = false;
            for (int n2 : bT) {
                rs.n.c.ac.l((int)n2).bf = false;
            }
            rs.n.c.ac.l((int)36002).at = bM;
            rs.n.c.ac.l((int)36003).at = bM;
            rs.n.c.ac.l((int)36019).at = bM;
            rs.n.c.ac.e(false);
        }
    }

    public static void e(boolean bl) {
        rs.n.c.ac.l((int)36012).bf = bl;
        rs.n.c.ac.l((int)36013).bf = bl;
        rs.n.c.ac.l((int)36015).bf = bl;
    }

    public static void f(boolean bl) {
        rs.n.c.ac.l((int)36016).bf = bl;
    }

    public static void o(int n2) {
        if (n2 == 0) {
            for (int n3 : bT) {
                rs.n.c.ac.l((int)n3).bf = false;
            }
        } else {
            for (int n4 : bT) {
                if (n2 == 1 && n4 <= 36007 || n2 == 3 && n4 >= 36008) continue;
                rs.n.c.ac.l((int)n4).bf = true;
            }
            if (n2 == 1) {
                c.b(36008).a(455, 284);
                c.b(36009).a(440, 224);
            } else if (n2 == 2) {
                c.b(36008).a(415, 284);
                c.b(36009).a(400, 224);
                c.b(36004).a(455, 284);
                c.b(36005).a(440, 224);
            } else if (n2 == 3) {
                c.b(36004).a(455, 284);
                c.b(36005).a(440, 224);
            }
            c.a();
        }
    }

    public static e m() {
        return rs.n.c.ac.l(36802);
    }

    public static e n() {
        return rs.n.c.ac.l(36801);
    }

    public static e o() {
        return rs.n.c.ac.l(36026);
    }

    static {
        d = 0;
        f = 0;
        g = 32;
        bI = 20;
        bJ = true;
        bK = 431;
        bL = 431;
        bO = new int[700];
        bP = new int[700];
        bQ = new String[700];
        bR = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", null};
        bS = new String[]{"Deposit 1", "Deposit 5", "Deposit 10", "Deposit All", null};
        bT = new int[]{36004, 36005, 36006, 36008, 36009, 36010};
    }
}

