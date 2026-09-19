/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.HashMap;
import java.util.Map;
import rs.a.h;
import rs.d.k;
import rs.l.k_0;
import rs.n.c;
import rs.n.d;
import rs.n.e;

public class ab
extends c {
    public static final int c = 47505;
    public static final int d = 47704;
    public static final int e = 47709;
    public static final int f = 47808;
    public static final int g = 7;
    public static h bI = null;
    public static h bJ = null;
    public static Map<String, Integer> bK = new HashMap<String, Integer>();
    public static int bL = 808;
    public static boolean bM = false;
    public static int bN;
    public static int bO;
    public static int bP;
    public static int bQ;
    public static int bR;
    public static int bS;
    public static boolean bT;

    public static void a(boolean bl) {
        if (bl) {
            for (int i2 = 47819; i2 <= 47837; ++i2) {
                rs.n.e.H[i2].bf = true;
            }
        } else {
            for (int i3 = 47819; i3 <= 47837; ++i3) {
                rs.n.e.H[i3].bf = false;
            }
        }
        bT = bl;
    }

    public static void h() {
        for (int i2 = 47505; i2 <= 47704; ++i2) {
            rs.n.e.a(i2, "", rs.n.d.b, 0, 16751360, false, true);
        }
        bN = 47505;
        bO = 3;
        bP = 3;
    }

    public static void i() {
        if (bQ >= 47808) {
            return;
        }
        for (int i2 = bQ; i2 < 47808; ++i2) {
            rs.n.e.H[i2].at = "";
            if (rs.n.e.H[i2].aI != 5) continue;
            rs.n.e.H[i2].E = null;
            rs.n.e.H[i2].aG = null;
        }
    }

    public static void j() {
        if (bN >= 47704) {
            return;
        }
        for (int i2 = bN; i2 < 47704; ++i2) {
            rs.n.e.H[i2].at = "";
        }
    }

    public static void k() {
        rs.n.c.ab.h(47706, "wiki/item 1");
        rs.n.e.H[47708].am[3] = 16;
        rs.n.e.H[47708].am[4] = 16;
        rs.n.e.H[47708].V = 0;
        bQ = 47709;
        bR = 3;
        bS = 210;
    }

    public static void l() {
        bK.clear();
        bM = false;
        bI = null;
        bJ = null;
        bL = 808;
        for (int i2 = 0; i2 < 15; ++i2) {
            rs.n.c.ab.H[47707].az[i2] = 0;
            rs.n.c.ab.H[47707].ax[i2] = 0;
        }
    }

    public static void m() {
        bI = null;
        bJ = null;
        rs.n.e.aO.a();
    }

    public static void a(String object, boolean bl, boolean bl2) {
        if (bN == 0) {
            rs.n.c.ab.h();
        }
        if (bN >= 47704) {
            System.out.println("[ERROR] OVERFLOW CATEGORY");
            return;
        }
        int n2 = bN - 47505;
        if (bl) {
            int n3 = bO = bl2 ? 15 : 3;
            if (n2 > 0) {
                bP += 3;
            }
            object = !bl2 ? "<u=16776960>" + (String)object + ":" : "<col=C0981F>" + (String)object;
            rs.n.c.ab.a(bN, (String)object, rs.n.d.b, 2, 16751360, false, true);
            rs.n.e.H[47504].b(n2, bN, bO, bP);
            bP += 19;
            bO = bl2 ? 30 : 15;
        } else {
            rs.n.c.ab.a(bN, (String)object, (String)object, rs.n.d.b, 0, 16750623, false, true, 125);
            rs.n.e.H[47504].b(n2, bN, bO, bP);
            bP += 15;
        }
        ++bN;
    }

    public static void a(String string, boolean bl) {
        if (bQ == 0) {
            rs.n.c.ab.k();
        }
        if (bQ >= 47808) {
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
        if (rs.n.e.H[bQ] != null && rs.n.e.H[rs.n.c.ab.bQ].aI == 5) {
            rs.n.e.H[rs.n.c.ab.bQ].E = null;
            rs.n.e.H[rs.n.c.ab.bQ].aG = null;
        }
        if (bl) {
            rs.n.c.ab.a(bQ, string, "Select option", rs.n.d.b, 0, 16750623, bl2, true, 500);
        } else if (bl3) {
            rs.n.c.ab.a(bQ, string, rs.n.d.b, 2, 16751360, bl2, true);
        } else {
            rs.n.c.ab.a(bQ, string, rs.n.d.b, 1, 16751360, bl2, true);
        }
        int n2 = bQ - 47709 + 7;
        rs.n.e.H[47708].b(n2, bQ, bR + (bl2 ? (bl ? -116 : 134) + 150 : 0), bS + 30);
        bS += 15 + (bl3 ? 5 : 0);
        ++bQ;
    }

    public static void b(String string) {
        if (bQ == 0) {
            rs.n.c.ab.k();
        }
        if (bQ >= 47808) {
            System.out.println("[ERROR] OVERFLOW DESCRIPTION");
            return;
        }
        String[] stringArray = string.split(",");
        int n2 = Integer.parseInt(stringArray[0]);
        int n3 = Integer.parseInt(stringArray[1]);
        int n4 = Integer.parseInt(stringArray[2]);
        int n5 = Integer.parseInt(stringArray[3]);
        if (n2 == -1) {
            bS += n5;
            return;
        }
        int n6 = bQ - 47709 + 7;
        rs.n.c.ab.h(bQ, "wiki/guide " + n2);
        rs.n.e.H[rs.n.c.ab.bQ].l = true;
        rs.n.e.H[47708].b(n6, bQ, bR + n3, bS + n4);
        bS += n5;
        ++bQ;
    }

    public static void c(String string) {
        int n2 = Integer.parseInt(string.replace("ITEM_GUIDE_SELECTED_", ""));
        for (int i2 = 47505; i2 < 47704; ++i2) {
            if (rs.n.e.H[i2] == null || rs.n.e.H[i2].at == null) continue;
            String string2 = "<img=24>";
            if (rs.n.e.H[i2].at.contains(string2)) {
                rs.n.e.H[i2].at = rs.n.e.H[i2].at.replaceAll("<img=24> ", "");
            }
            if (i2 != n2) continue;
            rs.n.e.H[i2].at = "<img=24> " + rs.n.e.H[i2].at;
        }
    }

    public ab(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        e e2 = rs.n.c.ab.d(47500);
        e2.f();
        rs.n.c.ab.a(47501, "Official SpawnPK Item Library", this.a, 2, 16751360, true, true);
        rs.n.c.ab.a(47502, "", this.a, 2, 16751360, false, true);
        rs.n.c.ab.a(47503, "Selected Item Guide Title Text", this.a, 2, 16751360, false, true);
        e e3 = rs.n.c.ab.d(47504);
        e3.aH = 2350;
        e3.P = 168;
        e3.aR = 436;
        e3.k(200);
        for (n2 = 0; n2 < 200; ++n2) {
            int n3 = 47505 + n2;
            rs.n.c.ab.a(n3, "", this.a, 0, 16751360, false, true);
            e3.b(n2, n3, 3, 3 + n2 * 15);
        }
        rs.n.c.ab.a(47705, 110, 250);
        rs.n.e.H[47705].af = n2 = 4907;
        rs.n.e.H[47705].aT = 750;
        rs.n.e.H[47705].aV = 1550;
        rs.n.e.H[47705].ar = 0;
        rs.n.e.H[47705].F = 0;
        rs.n.e.H[47705].aD = rs.d.d.c((int)n2).w;
        rs.n.e.H[47705].aE = rs.d.d.c((int)n2).w;
        rs.n.c.ab.a(47813, 110, 250);
        rs.n.e.H[47813].af = n2 = 4908;
        rs.n.e.H[47813].aT = 750;
        rs.n.e.H[47813].aV = 1550;
        rs.n.e.H[47813].ar = 0;
        rs.n.e.H[47813].F = 0;
        rs.n.e.H[47813].aD = rs.d.d.c((int)n2).w;
        rs.n.e.H[47813].aE = rs.d.d.c((int)n2).w;
        rs.n.c.ab.h(47706, "wiki/item 1");
        rs.n.c.ab.h(47839, "wiki/item 8");
        rs.n.c.ab.a(47707, false);
        rs.n.c.ab.H[47707].P = 3;
        rs.n.c.ab.H[47707].ac = 9;
        rs.n.c.ab.H[47707].ap = 8;
        e e4 = rs.n.c.ab.d(47708);
        rs.n.c.ab.a(47816, "wiki/item", 3, 37, 35, "View equipment bonuses", -1, 47817, 1);
        rs.n.c.ab.a(47817, "wiki/item", 4, 37, 35, 47818);
        e4.aH = 1000;
        e4.P = 536;
        e4.aR = 436;
        e4.k(107);
        int n4 = 20;
        e4.b(0, 47706, 10, 5 + n4 - 10);
        e4.b(1, 47707, 27, 6 + n4 - 10);
        e4.b(2, 47705, 215, 0 + n4 - 5);
        e4.b(3, 47816, 26, 7 + n4 - 10);
        e4.b(4, 47817, 26, 7 + n4 - 10);
        e4.b(5, 47813, 375, 0 + n4 - 5);
        e4.b(6, 47839, 0, 230);
        for (int i2 = 0; i2 < 100; ++i2) {
            int n5 = 47709 + i2;
            rs.n.c.ab.a(n5, "", this.a, 0, 16751360, false, true);
            e4.b(7 + i2, n5, 253, 210 + i2 * 15 + 25);
        }
        rs.n.c.ab.a(47809, "wiki/button", 1, 185, 32, "Search by item", -1, 47810, 1);
        rs.n.c.ab.a(47810, "wiki/button", 2, 185, 25, 47811);
        rs.n.c.ab.a(47812, "<img=39> Search for an item", this.a, 0, 16751360, true, true);
        rs.n.c.ab.c(47814, 1, "wiki/sprite");
        rs.n.c.ab.c(47815, 2, "wiki/sprite");
        rs.n.c.ab.c(47819, 5, "wiki/item");
        rs.n.c.ab.a(47820, "Attack bonus", this.a, 2, 14983494, false, true);
        rs.n.c.ab.a(47821, "Stab: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47822, "Slash: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47823, "Crush: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47824, "Magic: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47825, "Range: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47826, "Defence bonus", this.a, 2, 14983494, false, true);
        rs.n.c.ab.a(47827, "Stab: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47828, "Slash: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47829, "Crush: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47830, "Magic: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47831, "Range: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47832, "Other bonuses", this.a, 2, 14983494, false, true);
        rs.n.c.ab.a(47833, "Strength: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47834, "Range strength: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47835, "Prayer: +0", this.a, 1, 14983494, false, true);
        rs.n.c.ab.a(47836, "wiki/item", 6, 24, 23, "Close preview", -1, 47837, 1);
        rs.n.c.ab.a(47837, "wiki/item", 7, 24, 23, 47838);
        rs.n.c.ab.a(false);
        rs.n.c.ab.h();
        rs.n.c.ab.j();
        e2.k(32);
        e2.b(0, 47814, 2, 2);
        e2.b(1, 65418, 746, 9);
        e2.b(2, 65419, 746, 9);
        e2.b(3, 47501, 395, 10);
        e2.b(4, 47502, 16, 40);
        e2.b(5, 47504, 13, 61);
        e2.b(6, 47708, 208, 61);
        e2.b(7, 47809, 11, 31);
        e2.b(8, 47810, 11, 31);
        e2.b(9, 47812, 100, 42);
        e2.b(10, 47815, 442, 26);
        e2.b(11, 47815, 242, 26);
        e2.b(12, 47503, 208, 40);
        e2.b(13, 47819, 11, 61);
        e2.b(14, 47820, 17, 64);
        e2.b(15, 47821, 22, 80);
        e2.b(16, 47822, 22, 95);
        e2.b(17, 47823, 22, 110);
        e2.b(18, 47824, 22, 125);
        e2.b(19, 47825, 22, 140);
        e2.b(20, 47826, 17, 162);
        e2.b(21, 47827, 22, 178);
        e2.b(22, 47828, 22, 193);
        e2.b(23, 47829, 22, 208);
        e2.b(24, 47830, 22, 223);
        e2.b(25, 47831, 22, 238);
        e2.b(26, 47832, 17, 260);
        e2.b(27, 47833, 22, 275);
        e2.b(28, 47834, 22, 289);
        e2.b(29, 47835, 22, 304);
        e2.b(30, 47836, 169, 64);
        e2.b(31, 47837, 169, 64);
    }

    public static h b(boolean bl) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = 0;
        if (bK.get("WEAPON") != null) {
            n8 = bK.get("WEAPON") + 512;
        }
        int n9 = n7 = bl ? 313 : 274;
        if (bK.get("CHEST") != null) {
            n7 = bK.get("CHEST") + 512;
        }
        int n10 = 0;
        if (bK.get("ARM") != null) {
            n10 = bK.get("ARM") + 512;
        }
        int n11 = n6 = bl ? 319 : 282;
        if (bK.get("WRIST") != null) {
            n6 = bK.get("WRIST");
        }
        int n12 = 0;
        if (bK.get("HEAD") != null) {
            n12 = bK.get("HEAD") + 512;
        }
        int n13 = n5 = bl ? 306 : 256;
        if (bK.get("HAIR") != null) {
            n5 = bK.get("HAIR");
        }
        int n14 = n4 = bl ? 0 : 266;
        if (bK.get("BEARD") != null) {
            n4 = bK.get("BEARD");
        }
        int n15 = 298;
        if (bK.get("FEET") != null) {
            n15 = bK.get("FEET") + 512;
        }
        int n16 = n3 = bl ? 330 : 292;
        if (bK.get("LEGS") != null) {
            n3 = bK.get("LEGS") + 512;
        }
        int n17 = n2 = bl ? 323 : 289;
        if (bK.get("HANDS") != null) {
            n2 = bK.get("HANDS") + 512;
        }
        int n18 = 0;
        if (bK.get("AMULET") != null) {
            n18 = bK.get("AMULET") + 512;
        }
        int n19 = 0;
        if (bK.get("CAPE") != null) {
            n19 = bK.get("CAPE") + 512;
        }
        rs.n.e.H[47705].aD = bL;
        rs.n.e.H[47705].aE = bL;
        rs.n.e.H[47813].aD = bL;
        rs.n.e.H[47813].aE = bL;
        if (bl) {
            return rs.a.k.a(n8, n7, n10, n6, n12, n5, n4, n15, n3, n2, n18, n19, 1);
        }
        return rs.a.k.a(n8, n7, n10, n6, n12, n5, n4, n15, n3, n2, n18, n19, 0);
    }

    public static void a(String string, int n2) {
        if (string.startsWith("SLOT_")) {
            int n3 = Integer.parseInt(string.replace("SLOT_", "")) - 1;
            rs.n.c.ab.H[47707].az[n3] = n2 + 1;
            rs.n.c.ab.H[47707].ax[n3] = 1;
            return;
        }
        if (string.equals("ANIMATION")) {
            bL = n2;
            return;
        }
        int n4 = -1;
        switch (string) {
            case "HEAD": {
                n4 = 1;
                break;
            }
            case "WEAPON": {
                n4 = 6;
                break;
            }
            case "CHEST": {
                n4 = 7;
                break;
            }
            case "FEET": {
                n4 = 13;
                break;
            }
            case "LEGS": {
                n4 = 10;
                break;
            }
            case "HANDS": {
                n4 = 12;
                break;
            }
            case "AMULET": {
                n4 = 4;
                break;
            }
            case "CAPE": {
                n4 = 3;
                break;
            }
            case "RING": {
                n4 = 14;
                break;
            }
            case "ARROWS": {
                n4 = 5;
                break;
            }
            case "ARM": {
                n4 = 8;
            }
        }
        if (n4 != -1 && rs.n.e.H[47708].am[3] != -5000) {
            Object object;
            rs.n.c.ab.H[47707].az[n4] = n2 + 1;
            rs.n.c.ab.H[47707].ax[n4] = 1;
            if (n4 == 5 && (object = rs.d.k.f(n2)) != null && ((k)object).w != null && !((k)object).w.toLowerCase().contains("blessing")) {
                rs.n.c.ab.H[47707].ax[n4] = 1000;
            }
        }
        bK.put(string, n2);
    }
}

