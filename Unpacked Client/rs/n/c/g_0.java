/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rs.Client;
import rs.f.a;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.G
 */
public class g_0
extends c {
    public static Map<Integer, List<String>> c = new HashMap<Integer, List<String>>();
    public static int d = 50247;
    public static int e = 50244;
    public static int f = 50241;
    public static int[] g = new int[]{d, e, f};
    public static f_0 bI = null;
    public static f_0 bJ = null;
    public static int bK = 1;
    public static int bL = 287;
    public static int bM = 0;
    public static int bN = -1;

    public g_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    public static void m(int n2) {
        bM = n2;
        bL = n2 < 2 ? 0 : 285;
        if (n2 == 2) {
            bN = 150;
        }
    }

    public static void h() {
        if (Client.cH != 31244 || bM == 0) {
            return;
        }
        int n2 = 197;
        int n3 = 283;
        if (rs.f.a.ai == a.c.b) {
            n3 += Client.ah / 2 - 230;
            n2 += Client.ai / 2 - 356;
        } else {
            n3 += 4;
            n2 += 4;
        }
        int n4 = 0xFFFF00;
        if (!rs.l.b.a.a() && bL < 285 && (bL += 10) > 285) {
            bL = 285;
        }
        if (bL >= 285 && bM >= 2) {
            n4 = bM == 2 ? 65280 : 16718848;
        }
        rs.l.c.b(13, n3, n2, n4, bL, 255);
        if (bL >= 285 && bM >= 2) {
            if (bM == 2) {
                int n5 = 0xFFFA00;
                int n6 = 150 - Client.bN;
                if (n6 < 50) {
                    n5 = 0xFF0000 + 5 * n6;
                } else if (n6 < 100) {
                    n5 = 0xFF00FF - 327680 * (n6 - 50);
                } else if (n6 < 150) {
                    n5 = 255 + 327680 * (n6 - 100) - 5 * (n6 - 100);
                }
                Client.gh.a(150 - bN, "Congratulations!", Client.gg, n3 + 11, n2 + 144, n5);
                Client.gh.a(150 - bN, "Congratulations!", Client.gg, n3 + 11 + 1, n2 + 144 + 1, n5);
                if (bN > 1 && !rs.l.b.a.a()) {
                    --bN;
                }
            } else {
                Client.gl.c(bM == 2 ? "<img=24> @dgr@Success! Congratulations! <img=24>" : "@bla@Enchantment failed!", n2 + 144, n3 + 11, 0xFFFFFF, -1);
            }
        } else {
            Client.gl.c("@bla@Preparing enchantment..", n2 + 144, n3 + 11, 0xFFFFFF, -1);
        }
    }

    @Override
    public void a() {
        int n2;
        int n3;
        e e2 = g_0.d(31244);
        g_0.c(49999, 17, "fountain/sprite");
        g_0.a(49998, "@or1@Item Enchantment Chest", this.a, 2, 16751360, true, true);
        g_0.a(49997, "Enchantments", this.a, 2, 16751360, false, true);
        g_0.a(49996, "Item name", this.a, 2, 16751360, false, true);
        g_0.a(49995, "Categories", this.a, 2, 16751360, false, true);
        g_0.a(49991, "fountain/SPRITE", 27, 250, 34, "Enchant", -1, 49990, 1);
        g_0.a(49990, "fountain/SPRITE", 28, 250, 34, 49989);
        g_0.a(49988, "Attempt Enchantment", this.a, 2, 16751360, true, true);
        g_0.c(49987, 2, "fountain/icon");
        e e3 = g_0.d(50241);
        e3.aw = 50241;
        e3.W = new String[5];
        e3.K = new int[20];
        e3.ax = new int[30];
        e3.az = new int[30];
        e3.as = new int[20];
        e3.al = new int[0];
        e3.am = new int[0];
        e3.bc = new int[0];
        e3.t = false;
        e3.ac = 24;
        e3.ap = 24;
        e3.aR = 1;
        e3.P = 1;
        e3.aI = 2;
        g_0.a(50242, 5, "achievements/SPRITE", 54, 21, 50243);
        g_0.a(50245, "Category", this.a, 1, 16751360, false, true);
        g_0.a(50248, "", this.a, 0, 16751360, true, true);
        g_0.a(50249, "Success chance: @gre@N/A", this.a, 1, 16751360, false, true);
        g_0.a(50250, "Select a category", this.a, 2, 16751360, false, true);
        g_0.a(50251, "", this.a, 1, 16751360, false, true);
        g_0.a(50252, "Ingredients @yel@(cost to attempt)", this.a, 1, 16751360, false, true);
        e e4 = g_0.d(49994);
        e4.aH = 420;
        e4.P = 299;
        e4.aR = 87;
        g_0.a(49993, false);
        g_0.H[49993].ac = 15;
        g_0.H[49993].ap = 10;
        g_0.H[49993].P = 6;
        g_0.H[49993].aR = 5;
        int n4 = g_0.H[49993].P * g_0.H[49993].aR;
        g_0.H[49993].az = new int[n4];
        g_0.H[49993].ax = new int[n4];
        e4.k(1);
        e4.b(0, 49993, 27, 8);
        e e5 = g_0.d(49992);
        e5.aw = 49992;
        e5.W = new String[5];
        e5.K = new int[20];
        e5.ax = new int[30];
        e5.az = new int[30];
        e5.as = new int[20];
        e5.al = new int[0];
        e5.am = new int[0];
        e5.bc = new int[0];
        e5.t = false;
        e5.ac = 24;
        e5.ap = 24;
        e5.aR = 5;
        e5.P = 6;
        e5.aI = 2;
        e e6 = g_0.d(49986);
        e6.aH = 420;
        e6.P = 170;
        e6.aR = 202;
        e6.k(16);
        for (int i2 = 49970; i2 <= 49985; ++i2) {
            n3 = i2 - 49970;
            g_0.a(i2, "Category #" + (n3 + 1), "Select enchantment", this.a, 2, 0xFFFF00, false, false, 100);
            e6.b(n3, i2, 40, 4 + n3 * 18);
        }
        e e7 = g_0.d(50244);
        e7.aH = 845;
        e7.P = 170;
        e7.aR = 202;
        e7.k(1);
        g_0.a(50253, false, 60);
        g_0.H[50253].ac = 10;
        g_0.H[50253].ap = 10;
        g_0.H[50253].W = new String[]{"Select item", null, null, null, null};
        g_0.H[50253].P = 3;
        g_0.H[50253].aR = 20;
        e7.k(61);
        n3 = 44;
        int n5 = 8;
        bI = new f_0("fountain/sprite 30");
        bJ = new f_0("fountain/sprite 29");
        for (n2 = 0; n2 < 60; ++n2) {
            g_0.a(50254 + n2, n2 == 0 ? bI : bJ);
            e7.b(n2, 50254 + n2, n3 - 3, n5 - 3);
            if ((n3 += 42) != 170) continue;
            n3 = 44;
            n5 += 42;
        }
        e7.b(60, 50253, 44, 8);
        g_0.a(50314, "drops/button", 1, 100, 32, "Search by name", -1, 50315, 1);
        g_0.a(50315, "drops/button", 2, 100, 32, 50316);
        g_0.a(50317, "Search item", this.a, 0, 16751360, false, true);
        g_0.c(50318, 0, "drops/icon");
        g_0.a(50319, "fountain/sprite", 31, 30, 19, "Back", -1, 50320, 1);
        g_0.a(50320, "fountain/sprite", 32, 30, 19, 50321);
        g_0.a(50322, "Back @yel@(Categories)", this.a, 1, 16751360, false, true);
        g_0.c(50323, 12, "teleport/sprite");
        g_0.c(50324, 13, "teleport/sprite");
        g_0.c(50325, 17, "teleport/sprite");
        g_0.c(50326, 18, "teleport/sprite");
        rs.n.e.H[50324].E = new f_0("teleport/sprite 13", 0, 15);
        rs.n.e.H[50325].E = new f_0("teleport/sprite 17", 0, 15);
        rs.n.e.H[50326].E = new f_0("teleport/sprite 18", 0, 15);
        n2 = -40;
        int n6 = -30;
        e2.k(27);
        e2.b(0, 49999, 10, 19);
        e2.b(1, 49998, 268, 26);
        e2.b(2, 49997, 27, 83);
        e2.b(3, 49996, 281 + n2 - 3, 85 + n6);
        e2.b(4, 49995, -2264, 208);
        e2.b(5, 49994, 172, 119);
        e2.b(6, 49992, 195, 56);
        e2.b(7, 49991, 215, 242);
        e2.b(8, 49990, 215, 242);
        e2.b(9, 49987, -5000, 0);
        e2.b(10, 49988, 342, 252);
        e2.b(11, 50244, -14, 101);
        e2.b(12, 65418, 478, 25);
        e2.b(13, 65419, 478, 25);
        int n7 = 90;
        int n8 = 50;
        e2.b(14, 50241, -451, 56);
        e2.b(15, 50245, 238, 73);
        e2.b(16, 50248, 264, 223);
        e2.b(17, 50249, 220, 216);
        e2.b(18, 50251, 373, 100);
        e2.b(19, 50252, 221, 101);
        e2.b(20, 50322, 69, 59);
        e2.b(21, 50319, 31, 57);
        e2.b(22, 50320, 31, 57);
        e2.b(23, 50323, 196, 282);
        e2.b(24, 50324, 196, 282);
        e2.b(25, 50325, 196, 282);
        e2.b(26, 50326, 196, 282);
        e e8 = g_0.d(31243);
        g_0.b(50327, 33, "fountain/sprite", "Select category");
        g_0.a(50328, "@yel@Armor", this.a, 1, 16751360, true, true);
        g_0.b(50329, 33, "fountain/sprite", "Select category");
        g_0.a(50330, "@yel@Weapons", this.a, 1, 16751360, true, true);
        g_0.b(50331, 33, "fountain/sprite", "Select category");
        g_0.a(50332, "@yel@Capes", this.a, 1, 16751360, true, true);
        g_0.b(50333, 33, "fountain/sprite", "Select category");
        g_0.a(50334, "@yel@Trinkets & Tools", this.a, 1, 16751360, true, true);
        g_0.b(50335, 33, "fountain/sprite", "Select category");
        g_0.a(50336, "@yel@Pets/Accessories", this.a, 1, 16751360, true, true);
        g_0.b(50337, 33, "fountain/sprite", "Select category");
        g_0.a(50338, "@yel@Cosmetics", this.a, 1, 16751360, true, true);
        g_0.b(50339, 33, "fountain/sprite", "Select category");
        g_0.a(50340, "@yel@Miscellaneous", this.a, 1, 16751360, true, true);
        e8.k(39);
        e8.b(0, 49999, 10, 19);
        e8.b(1, 49998, 268, 26);
        e8.b(2, 49995, 27, 83);
        e8.b(3, 49996, 281 + n2 - 3, 85 + n6);
        e8.b(4, 49995, -2264, 208);
        e8.b(5, 49994, 172, 119);
        e8.b(6, 49992, 195, 56);
        e8.b(7, 49991, 215, 242);
        e8.b(8, 49990, 215, 242);
        e8.b(9, 49988, 342, 252);
        e8.b(10, 65418, 478, 25);
        e8.b(11, 65419, 478, 25);
        e8.b(12, 50248, 264, 223);
        e8.b(13, 50249, 220, 216);
        e8.b(14, 50251, 373, 100);
        e8.b(15, 50252, 221, 101);
        e8.b(16, 50314, 22, 48);
        e8.b(17, 50315, 22, 48);
        e8.b(18, 50317, 49, 59);
        e8.b(19, 50318, 28, 55);
        e8.b(20, 50323, 196, 282);
        e8.b(21, 50324, 196, 282);
        e8.b(22, 50325, 196, 282);
        e8.b(23, 50326, 196, 282);
        e8.b(24, 50245, 238, 73);
        int n9 = 27;
        e8.b(25, 50327, 37, 111);
        e8.b(26, 50328, 98, 114);
        e8.b(27, 50329, 37, 109 + n9);
        e8.b(28, 50330, 98, 112 + n9);
        e8.b(29, 50331, 37, 109 + n9 * 2);
        e8.b(30, 50332, 98, 112 + n9 * 2);
        e8.b(31, 50333, 37, 109 + n9 * 3);
        e8.b(32, 50334, 98, 112 + n9 * 3);
        e8.b(33, 50335, 37, 109 + n9 * 4);
        e8.b(34, 50336, 98, 112 + n9 * 4);
        e8.b(35, 50337, 37, 109 + n9 * 5);
        e8.b(36, 50338, 98, 112 + n9 * 5);
        e8.b(37, 50339, 37, 109 + n9 * 6);
        e8.b(38, 50340, 98, 112 + n9 * 6);
    }
}

