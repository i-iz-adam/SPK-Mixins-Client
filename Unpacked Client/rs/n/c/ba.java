/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.d;
import rs.n.e;

public class ba
extends c {
    public static int c = 46500;
    public static final int d = 46506;
    public static final int e = 46606;
    public static final int f = 46608;
    public static final int g = 46758;
    public static int bI;
    public static int bJ;
    public static int bK;
    public static int bL;
    public static int bM;
    public static int bN;

    public static void h() {
        bI = 46506;
        bJ = 3;
        bK = 3;
    }

    public static void i() {
        rs.n.e.H[46607].V = 0;
        bL = 46608;
        bM = 3;
        bN = 3;
    }

    public static void a(String string, boolean bl) {
        if (bI == 0) {
            rs.n.c.ba.h();
        }
        if (bI >= 46606) {
            System.out.println("[ERROR] OVERFLOW CATEGORY");
            return;
        }
        int n2 = bI - 46506;
        if (bl) {
            bJ = 3;
            if (n2 > 0) {
                bK += 3;
            }
            rs.n.c.ba.a(bI, string, rs.n.d.b, 2, 16751360, false, true);
            rs.n.e.H[46505].b(n2, bI, bJ, bK);
            bK += 19;
            bJ = 10;
        } else {
            rs.n.c.ba.a(bI, string, string, rs.n.d.b, 0, 16750623, false, true, 125);
            rs.n.e.H[46505].b(n2, bI, bJ, bK);
            bK += 15;
        }
        ++bI;
    }

    public static void b(String string) {
        if (bL == 0) {
            rs.n.c.ba.i();
        }
        if (bL >= 46758) {
            System.out.println("[ERROR] OVERFLOW DESCRIPTION");
            return;
        }
        String[] stringArray = string.split(",");
        int n2 = Integer.parseInt(stringArray[0]);
        int n3 = Integer.parseInt(stringArray[1]);
        int n4 = Integer.parseInt(stringArray[2]);
        int n5 = Integer.parseInt(stringArray[3]);
        if (n2 == -1) {
            bN += n5;
            return;
        }
        int n6 = bL - 46608;
        rs.n.c.ba.h(bL, "wiki/guide " + n2);
        rs.n.e.H[rs.n.c.ba.bL].l = true;
        rs.n.e.H[46607].b(n6, bL, bM + n3, bN + n4);
        bN += n5;
        ++bL;
    }

    public static void b(String string, boolean bl) {
        if (bL == 0) {
            rs.n.c.ba.i();
        }
        if (bL >= 46758) {
            System.out.println("[ERROR] OVERFLOW DESCRIPTION");
            return;
        }
        boolean bl2 = false;
        boolean bl3 = false;
        if (string.startsWith("{C}")) {
            string = string.replace("{C}", "");
            bl2 = true;
        }
        if (string.contains("{B}")) {
            string = string.replace("{B}", "");
            bl3 = true;
        }
        if (rs.n.e.H[bL] != null && rs.n.e.H[rs.n.c.ba.bL].aI == 5) {
            rs.n.e.H[rs.n.c.ba.bL].E = null;
            rs.n.e.H[rs.n.c.ba.bL].aG = null;
        }
        if (bl) {
            if (string.startsWith("{")) {
                String string2 = string.split("}")[1];
                String string3 = string.split("}")[0];
                int n2 = Integer.parseInt(string3.replace("{", ""));
                rs.n.c.ba.a(bL, string2, "Select option", rs.n.d.b, 0, n2, bl2, true, 500);
            } else {
                rs.n.c.ba.a(bL, string, "Select option", rs.n.d.b, 0, 16750623, bl2, true, 500);
            }
        } else if (bl3) {
            rs.n.c.ba.a(bL, string, rs.n.d.b, 1, 16751360, bl2, true);
        } else {
            rs.n.c.ba.a(bL, string, rs.n.d.b, 0, 16751360, bl2, true);
        }
        int n3 = bL - 46608;
        rs.n.e.H[46607].b(n3, bL, bM + (bl2 ? (bl ? -116 : 134) : 0), bN);
        bN += 15 + (bl3 ? 4 : 0);
        ++bL;
    }

    public static void j() {
        if (bI >= 46606) {
            return;
        }
        for (int i2 = bI; i2 < 46606; ++i2) {
            rs.n.e.H[i2].at = "";
        }
    }

    public static void k() {
        if (bL >= 46758) {
            return;
        }
        for (int i2 = bL; i2 < 46758; ++i2) {
            rs.n.e.H[i2].at = "";
            if (rs.n.e.H[i2].aI != 5) continue;
            rs.n.e.H[i2].E = null;
            rs.n.e.H[i2].aG = null;
        }
    }

    public static void c(String string) {
        int n2 = Integer.parseInt(string.replace("WIKI_SELECTED_", ""));
        for (int i2 = 46506; i2 < 46606; ++i2) {
            if (rs.n.e.H[i2] == null || rs.n.e.H[i2].at == null) continue;
            String string2 = "<img=39> ";
            if (rs.n.e.H[i2].at.contains(string2)) {
                rs.n.e.H[i2].at = rs.n.e.H[i2].at.replaceAll(string2, "");
            }
            if (i2 != n2) continue;
            rs.n.e.H[i2].at = string2 + rs.n.e.H[i2].at;
        }
    }

    public ba(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        e e2 = rs.n.c.ba.d(c);
        rs.n.c.ba.h(46501, "wiki/sprite 0");
        rs.n.c.ba.a(46502, "Official SpawnPK Knowledgebase", this.a, 2, 16751360, true, true);
        rs.n.c.ba.a(46503, "Category List", this.a, 2, 16751360, false, true);
        rs.n.c.ba.a(46504, "Selected Article Title Text", this.a, 2, 16751360, false, true);
        int n3 = 100;
        e e3 = rs.n.c.ba.d(46505);
        e3.aH = 1000;
        e3.P = 168;
        e3.aR = 261;
        e3.k(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            int n4 = 46506 + n2;
            rs.n.c.ba.a(n4, "", this.a, 0, 16751360, false, true);
            e3.b(n2, n4, 3, 3 + n2 * 15);
        }
        n2 = 150;
        e e4 = rs.n.c.ba.d(46607);
        e4.aH = 2000;
        e4.P = 277;
        e4.aR = 261;
        e4.k(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n5 = 46608 + i2;
            rs.n.c.ba.a(n5, "", this.a, 0, 16751360, false, true);
            e4.b(i2, n5, 3, 3 + i2 * 15);
        }
        rs.n.c.ba.h();
        rs.n.c.ba.j();
        rs.n.c.ba.a(46759, "drops/sprite", 3, 17, 17, "Go back", -1, 46760, 1);
        rs.n.c.ba.a(46760, "drops/sprite", 4, 17, 17, 46761);
        e2.k(10);
        e2.b(0, 46501, 2, 2);
        e2.b(1, 65418, 487, 9);
        e2.b(2, 65419, 487, 9);
        e2.b(3, 46502, 270, 10);
        e2.b(4, 46503, 16, 40);
        e2.b(5, 46504, 208, 40);
        e2.b(6, 46505, 13, 61);
        e2.b(7, 46607, 208, 61);
        e2.b(8, 46759, 9, 9);
        e2.b(9, 46760, 9, 9);
    }
}

