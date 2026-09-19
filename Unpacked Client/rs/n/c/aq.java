/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.HashMap;
import rs.Client;
import rs.d.e;
import rs.gui.Launcher;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.c.ar;
import rs.n.e;
import rs.q.a.a.a;

public class aq
extends c {
    private static HashMap<Integer, Integer> g = new HashMap();
    private static final int[] bI = new int[]{55303, 55304, 55305, 55306, 55307, 55308, 55309, 55310, 55311, 55312};
    private static final int[] bJ = new int[]{55290, 55291, 55292, 55293, 55333};
    private static final int[][] bK = new int[][]{{55313, 55321}, {55315, 55323}, {55317, 55325}, {55319, 55327}, {55329}};
    public static long[] c = new long[5];
    public static f_0 d = null;
    public static f_0 e = null;
    public static a f = new ar();

    public aq(k_0[] k_0Array) {
        super(k_0Array);
    }

    public static boolean a(String string, int n2) {
        f_0 f_02;
        if (string.startsWith("npc_")) {
            int n3 = Integer.parseInt(string.substring(4));
            f_02 = rs.d.e.a(e.a.a, n3, 64);
            if (f_02 == null) {
                long l2 = c[n2];
                String string2 = "load_npc_head_" + n3;
                if (!rs.h.c.a(string2)) {
                    rs.h.c.a(string2, () -> {
                        if (System.currentTimeMillis() - l2 >= 10000L || c[n2] != l2) {
                            return false;
                        }
                        return !rs.n.c.aq.a(string, n2);
                    });
                }
            }
        } else {
            f_02 = new f_0(string);
            if (f_02.n < 32 && f_02.o < 32) {
                f_02.b(f_02.n * 2, f_02.o * 2);
            }
        }
        if (f_02 == null) {
            rs.n.c.aq.a(Client.fE[291], n2);
            return false;
        }
        rs.n.c.aq.a(f_02, n2);
        return true;
    }

    public static void a(f_0 f_02, int n2) {
        int n3 = 55314;
        if (n2 == 1) {
            n3 = 55316;
        }
        if (n2 == 2) {
            n3 = 55318;
        }
        if (n2 == 3) {
            n3 = 55320;
        }
        rs.n.c.aq.a(n3, f_02);
        rs.n.e.H[n3].bn = false;
        rs.n.e.H[n3].aJ = (64 - f_02.n) / 2;
        rs.n.e.H[n3].aP = (64 - f_02.o) / 2;
        n3 = 55322;
        if (n2 == 1) {
            n3 = 55324;
        }
        if (n2 == 2) {
            n3 = 55326;
        }
        if (n2 == 3) {
            n3 = 55328;
        }
        if (n2 == 4) {
            n3 = 55330;
        }
        rs.n.c.aq.a(n3, f_02);
        rs.n.e.H[n3].bn = false;
        rs.n.e.H[n3].aJ = (55 - f_02.n) / 2;
        rs.n.e.H[n3].aP = (55 - f_02.o) / 2;
    }

    @Override
    public void a() {
        Object object;
        int n2;
        e = new f_0("options/make/sprite 3");
        d = new f_0("options/make/sprite 4");
        rs.n.c.aq.a(55301, "How many would you like to make?", this.a, 2, 4206624, true, false);
        rs.n.c.aq.a(55302, "Choose a quantity, then click an image to begin.", this.a, 0, 6312008, true, false);
        rs.n.c.aq.b(55303, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
        rs.n.c.aq.a(55304, "1", this.a, 0, 4206624, true, false);
        rs.n.c.aq.b(55305, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
        rs.n.c.aq.a(55306, "5", this.a, 0, 4206624, true, false);
        rs.n.c.aq.b(55307, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
        rs.n.c.aq.a(55308, "10", this.a, 0, 4206624, true, false);
        rs.n.c.aq.b(55309, 3, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
        rs.n.c.aq.a(55310, "X", this.a, 0, 4206624, true, false);
        rs.n.c.aq.b(55311, 4, "options/make/sprite", "Select quantity").a("options/make/sprite 2");
        rs.n.c.aq.a(55312, "@whi@All", this.a, 0, 4206624, true, false);
        rs.n.c.aq.b(55313, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
        rs.n.c.aq.c(55314, 379, 64);
        rs.n.e.H[55314].bq = 100;
        rs.n.c.aq.b(55315, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
        rs.n.c.aq.c(55316, 379, 64);
        rs.n.e.H[55316].bq = 100;
        rs.n.c.aq.b(55317, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
        rs.n.c.aq.c(55318, 379, 64);
        rs.n.e.H[55318].bq = 100;
        rs.n.c.aq.b(55319, 1, "options/make/sprite", "Select").a("options/make/sprite 2");
        rs.n.c.aq.c(55320, 379, 64);
        rs.n.e.H[55320].bq = 100;
        rs.n.c.aq.b(55321, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
        rs.n.c.aq.c(55322, 379, 55);
        rs.n.e.H[55322].bq = 100;
        rs.n.c.aq.b(55323, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
        rs.n.c.aq.c(55324, 379, 55);
        rs.n.e.H[55324].bq = 100;
        rs.n.c.aq.b(55325, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
        rs.n.c.aq.c(55326, 379, 55);
        rs.n.e.H[55326].bq = 100;
        rs.n.c.aq.b(55327, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
        rs.n.c.aq.c(55328, 379, 55);
        rs.n.e.H[55328].bq = 100;
        rs.n.c.aq.b(55329, 5, "options/make/sprite", "Select").a("options/make/sprite 6");
        rs.n.c.aq.c(55330, 379, 55);
        rs.n.e.H[55330].bq = 100;
        for (n2 = 0; n2 < bK.length; ++n2) {
            for (int n5 : object = bK[n2]) {
                rs.n.e.H[n5].bG = (n3, n4) -> {
                    if (rs.n.e.H[n2].bx) {
                        int n5 = 45;
                        if (n5 >= 55321) {
                            n5 -= 3;
                        }
                        Client.gl.c(rs.n.e.H[n2].Q, n3 + rs.n.e.H[n2].E.n / 2 - 1, n4 - 5, 0, -1);
                    }
                };
                String string = n2 + 1 + ".";
                rs.n.e.H[n5].bH = (n3, n4) -> {
                    if (rs.n.e.H[n2].bx) {
                        Launcher.n().o().gm.b(string, n3 + 6, n4 + 17, 0xFFFFFF, 0);
                    }
                };
            }
        }
        n2 = 0;
        object = rs.n.c.aq.d(55290);
        ((e)object).k(14);
        n2 = this.a((e)object);
        ((e)object).b(n2++, 55313, 195, 36);
        ((e)object).b(n2++, 55314, 212, 41);
        Object object2 = rs.n.c.aq.d(55291);
        ((e)object2).k(16);
        n2 = this.a((e)object2);
        ((e)object2).b(n2++, 55313, 135, 36);
        ((e)object2).b(n2++, 55314, 152, 41);
        ((e)object2).b(n2++, 55315, 255, 36);
        ((e)object2).b(n2++, 55316, 272, 41);
        e e2 = rs.n.c.aq.d(55292);
        e2.k(18);
        n2 = this.a(e2);
        e2.b(n2++, 55313, 85, 36);
        e2.b(n2++, 55314, 102, 41);
        e2.b(n2++, 55315, 195, 36);
        e2.b(n2++, 55316, 212, 41);
        e2.b(n2++, 55317, 305, 36);
        e2.b(n2++, 55318, 322, 41);
        e e3 = rs.n.c.aq.d(55293);
        e3.k(20);
        n2 = this.a(e3);
        e3.b(n2++, 55313, 15, 36);
        e3.b(n2++, 55314, 32, 41);
        e3.b(n2++, 55315, 135, 36);
        e3.b(n2++, 55316, 152, 41);
        e3.b(n2++, 55317, 255, 36);
        e3.b(n2++, 55318, 272, 41);
        e3.b(n2++, 55319, 375, 36);
        e3.b(n2++, 55320, 392, 41);
        e e4 = rs.n.c.aq.d(55333);
        e4.k(22);
        n2 = this.a(e4);
        int n6 = -5;
        int n7 = -2 + n6;
        int n8 = 0;
        e4.b(n2++, 55321, 5 + n6, 36);
        e4.b(n2++, 55322, 22 + n7, 41 + n8);
        e4.b(n2++, 55323, 103 + n6, 36);
        e4.b(n2++, 55324, 120 + n7, 41 + n8);
        e4.b(n2++, 55325, 201 + n6, 36);
        e4.b(n2++, 55326, 218 + n7, 41 + n8);
        e4.b(n2++, 55327, 299 + n6, 36);
        e4.b(n2++, 55328, 316 + n7, 41 + n8);
        e4.b(n2++, 55329, 397 + n6, 36);
        e4.b(n2++, 55330, 414 + n7, 41 + n8);
    }

    public int a(e e2) {
        int n2 = 0;
        e2.b(n2++, 55301, 150, 0);
        e2.b(n2++, 55302, 150, 17);
        e2.b(n2++, 55303, 285, 0);
        e2.b(n2++, 55304, 302, 9);
        e2.b(n2++, 55305, 325, 0);
        e2.b(n2++, 55306, 342, 9);
        e2.b(n2++, 55307, 365, 0);
        e2.b(n2++, 55308, 382, 9);
        e2.b(n2++, 55309, 405, 0);
        e2.b(n2++, 55310, 422, 9);
        e2.b(n2++, 55311, 445, 0);
        e2.b(n2++, 55312, 462, 9);
        return n2;
    }

    static /* synthetic */ int[] h() {
        return bJ;
    }

    static /* synthetic */ int[] i() {
        return bI;
    }

    static /* synthetic */ int[][] j() {
        return bK;
    }
}

