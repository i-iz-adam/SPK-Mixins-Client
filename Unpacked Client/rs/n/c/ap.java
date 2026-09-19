/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rs.Client;
import rs.gui.Launcher;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.c.v_0;
import rs.n.e;

public class ap
extends rs.n.c {
    private static int[] g;
    private static int[] bI;
    public static int c;
    public static boolean d;
    public static boolean e;
    public static final List<a> f;
    private static f_0 bJ;
    private static f_0 bK;
    private static f_0 bL;
    private static f_0 bM;
    private static f_0 bN;
    private static f_0 bO;
    private static f_0 bP;
    private static int bQ;

    public static void h() {
        d = !d;
        rs.n.c.ap.j();
        rs.n.c.ap.i();
        rs.f.a.d();
    }

    public static void i() {
        if (d) {
            rs.n.e.H[1151].bc[0] = 5;
            rs.n.e.H[1151].am[1] = 75;
            rs.n.e.H[1151].am[2] = 82;
        } else {
            rs.n.e.H[1151].bc[0] = 15;
            rs.n.e.H[1151].am[1] = -5000;
            rs.n.e.H[1151].am[2] = -5000;
            rs.n.e.H[12424].am = Arrays.copyOf(g, g.length);
            rs.n.e.H[12424].bc = Arrays.copyOf(bI, bI.length);
        }
    }

    public static void j() {
        for (c c2 : rs.n.c.ap$c.values()) {
            rs.n.c.ap.a(c2);
        }
    }

    public static void a(c c2) {
        if (!d) {
            return;
        }
        if (c2 == rs.n.c.ap$c.a) {
            int n2;
            int n3;
            int n4;
            int n5;
            e e2 = H[12424];
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
            for (n5 = 0; n5 < e2.al.length; ++n5) {
                n4 = 0;
                a a2 = rs.n.c.ap$a.c;
                b b2 = rs.n.c.ap$b.a(e2.al[n5]);
                if (b2 != null) {
                    a2 = b2.R;
                    n4 = b2.Q;
                }
                n3 = 1;
                if (e || n4 >= Launcher.n().o().eo[6] / 2) {
                    for (a a3 : f) {
                        if (a2 != a3) continue;
                        n3 = 0;
                    }
                }
                if (n3 != 0) continue;
                if (e2.al[n5] == 7455) {
                    arrayList2.add(e2.al[n5]);
                    continue;
                }
                arrayList.add(e2.al[n5]);
            }
            n5 = 3;
            n4 = 5;
            int n6 = 0;
            int n7 = 5;
            n3 = 35;
            int n8 = 35;
            if (arrayList.size() <= 32) {
                n5 = 5;
                n7 = 4;
                n3 = 45;
                n8 = arrayList.size() <= 24 ? 38 : 29;
            }
            if (arrayList.size() > 35) {
                n5 = 0;
                n7 = 7;
                n3 = 25;
                n8 = 25;
            }
            int n9 = n5;
            int n10 = n4;
            for (n2 = 0; n2 < e2.al.length; ++n2) {
                if (!arrayList.contains(e2.al[n2])) {
                    e2.am[n2] = -5000;
                    continue;
                }
                e2.am[n2] = n9;
                e2.bc[n2] = n10;
                n9 += n3;
                if (++n6 < n7) continue;
                n6 = 0;
                n9 = n5;
                n10 += n8;
            }
            for (n2 = 0; n2 < e2.al.length; ++n2) {
                if (!arrayList2.contains(e2.al[n2])) continue;
                e2.am[n2] = n9 - 1;
                e2.bc[n2] = n10 - 1;
                n9 += n3;
                if (++n6 < n7) continue;
                n6 = 0;
                n9 = n5;
                n10 += n8;
            }
        }
    }

    public ap(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        f.add(rs.n.c.ap$a.a);
        f.add(rs.n.c.ap$a.b);
        this.l();
        this.m();
        this.n();
        this.o();
        rs.n.c.ap.j();
        bJ = new f_0("icons/pktele");
        bK = new f_0("icons/skilltele");
        bL = new f_0("icons/moneytele");
        bO = new f_0("magic/home 2");
        bP = new f_0("magic/bounty");
        bM = new f_0("icons/bosstele");
        bN = new f_0("icons/storetele");
        rs.n.e.H[30064].E = rs.n.e.H[30064].aG = bL;
        rs.n.e.H[13035].E = rs.n.e.H[13035].aG = bL;
        rs.n.e.H[1164].E = rs.n.e.H[1164].aG = bL;
        rs.n.e.H[13037].at = "@gre@Money Making Teleports";
        rs.n.e.H[1300].at = "@gre@Money Making Teleports";
        rs.n.e.H[30065].at = "Opens a selection of teleports";
        rs.n.e.H[13038].at = "Opens a selection of teleports";
        rs.n.e.H[1301].at = "Opens a selection of teleports";
        rs.n.e.H[30075].E = rs.n.e.H[30075].aG = bK;
        rs.n.e.H[13045].E = rs.n.e.H[13045].aG = bK;
        rs.n.e.H[1167].E = rs.n.e.H[1167].aG = bK;
        rs.n.e.H[13047].at = "@gre@Training Teleports";
        rs.n.e.H[1325].at = "@gre@Training Teleports";
        rs.n.e.H[30076].at = "Opens a selection of teleports";
        rs.n.e.H[13048].at = "Opens a selection of teleports";
        rs.n.e.H[1326].at = "Opens a selection of teleports";
        rs.n.e.H[30083].E = rs.n.e.H[30083].aG = bM;
        rs.n.e.H[13053].E = rs.n.e.H[13053].aG = bM;
        rs.n.e.H[1170].E = rs.n.e.H[1170].aG = bM;
        rs.n.e.H[13055].at = "@gre@Boss Teleports";
        rs.n.e.H[1350].at = "@gre@Boss Teleports";
        rs.n.e.H[30084].at = "Opens a selection of teleports";
        rs.n.e.H[13056].at = "Opens a selection of teleports";
        rs.n.e.H[1351].at = "Opens a selection of teleports";
        rs.n.e.H[13061].E = rs.n.e.H[13061].aG = bJ;
        rs.n.e.H[30106].E = rs.n.e.H[30106].aG = bJ;
        rs.n.e.H[1174].E = rs.n.e.H[1174].aG = bJ;
        rs.n.e.H[13063].at = "@gre@PK Teleports";
        rs.n.e.H[1382].at = "@gre@PK Teleports";
        rs.n.e.H[30107].at = "Opens a selection of teleports";
        rs.n.e.H[13064].at = "Opens a selection of teleports";
        rs.n.e.H[1383].at = "Opens a selection of teleports";
        rs.n.e.H[30114].E = rs.n.e.H[30114].aG = bN;
        rs.n.e.H[13069].E = rs.n.e.H[13069].aG = bN;
        rs.n.e.H[1540].E = rs.n.e.H[1540].aG = bN;
        rs.n.e.H[13071].at = "@gre@Minigame Teleports";
        rs.n.e.H[1415].at = "@gre@Minigame Teleports";
        rs.n.e.H[30115].at = "Opens a selection of teleports";
        rs.n.e.H[13072].at = "Opens a selection of teleports";
        rs.n.e.H[1416].at = "Opens a selection of teleports";
        rs.n.e.H[13079].E = rs.n.e.H[13079].aG = bO;
        rs.n.e.H[30138].E = rs.n.e.H[30138].aG = bO;
        rs.n.e.H[1541].E = rs.n.e.H[1541].aG = bO;
        rs.n.e.H[13081].at = "@gre@Teleport to House";
        rs.n.e.H[1454].at = "@gre@Teleport to House";
        rs.n.e.H[30139].at = "Teleport to your PoH";
        rs.n.e.H[13082].at = "Teleport to your PoH";
        rs.n.e.H[1455].at = "Teleport to your PoH";
        rs.n.e.H[13095].E = rs.n.e.H[13095].aG = bP;
        rs.n.e.H[30162].E = rs.n.e.H[30162].aG = bP;
        rs.n.e.H[7455].E = rs.n.e.H[7455].aG = bP;
        rs.n.e.H[13097].at = "@gre@Teleport to Bounty Target";
        rs.n.e.H[7457].at = "@gre@Teleport to Bounty Target";
        rs.n.e.H[30163].at = "Surprise your opponent!";
        rs.n.e.H[13098].at = "Surprise your opponent!";
        rs.n.e.H[7458].at = "Surprise your opponent!";
    }

    public static void m(int n2) {
        if (n2 == 41900) {
            if (Client.eT[6] != 41902) {
                bQ = Client.eT[6];
            }
            rs.n.c.ap.k();
            Client.eT[6] = 41902;
        }
        if (n2 == 41903 && bQ != -1) {
            rs.n.c.ap.j();
            Client.eT[6] = bQ;
        }
        if (n2 == 41910 || n2 == 41911 || n2 == 41912) {
            a a2 = rs.n.c.ap$a.a;
            if (n2 == 41911) {
                a2 = rs.n.c.ap$a.b;
            }
            if (n2 == 41912) {
                a2 = rs.n.c.ap$a.c;
            }
            if (f.contains((Object)a2)) {
                f.remove((Object)a2);
            } else {
                f.add(a2);
            }
            rs.n.c.ap.k();
            rs.f.a.d();
        }
        if (n2 == 41913) {
            e = !e;
            rs.n.c.ap.k();
            rs.f.a.d();
        }
    }

    public static void k() {
        rs.n.e.H[41906].E = f.contains((Object)rs.n.c.ap$a.a) ? v_0.f : v_0.g;
        rs.n.e.H[41907].E = f.contains((Object)rs.n.c.ap$a.b) ? v_0.f : v_0.g;
        rs.n.e.H[41908].E = f.contains((Object)rs.n.c.ap$a.c) ? v_0.f : v_0.g;
        rs.n.e.H[41909].E = e ? v_0.f : v_0.g;
    }

    public void l() {
        e e2 = rs.n.c.ap.d(41902);
        e2.k(12);
        rs.n.c.ap.a(41903, "magic/filter 2", "Magic spellbook filter");
        rs.n.c.ap.a(41904, "Filters", this.a, 0, 16750623);
        rs.n.c.ap.h(41905, "magic/filter 3");
        rs.n.c.ap.c(41906, 1, "gambling/SPRITE");
        rs.n.c.ap.c(41907, 1, "gambling/SPRITE");
        rs.n.c.ap.c(41908, 1, "gambling/SPRITE");
        rs.n.c.ap.c(41909, 1, "gambling/SPRITE");
        rs.n.c.ap.a(41910, "<tab=20><col=0xFF981F>Show @whi@Combat</col><col=0xFF981F> spells", "Select filter", this.a, 0, 16750623, false, true, 150);
        rs.n.c.ap.a(41911, "<tab=20><col=0xFF981F>Show @whi@Teleport</col><col=0xFF981F> spells", "Select filter", this.a, 0, 16750623, false, true, 150);
        rs.n.c.ap.a(41912, "<tab=20><col=0xFF981F>Show @whi@Utility</col><col=0xFF981F> spells", "Select filter", this.a, 0, 16750623, false, true, 150);
        rs.n.c.ap.a(41913, "<tab=20><col=0xFF981F>Show spells that require less\\n<tab=20><col=0xFF981F>than half your magic level", "Select filter", this.a, 0, 16750623, false, true, 150);
        rs.n.c.ap.a(41914, "Spell Filters", this.a, 2, 16750623);
        e2.b(0, 41903, 75, 240);
        e2.b(1, 41904, 82, 243);
        e2.b(2, 41905, 7, 25);
        e2.b(3, 41914, 56, 30);
        e2.b(4, 41906, 15, 57);
        e2.b(5, 41907, 15, 82);
        e2.b(6, 41908, 15, 107);
        e2.b(7, 41909, 15, 132);
        e2.b(8, 41910, 15, 59);
        e2.b(9, 41911, 15, 84);
        e2.b(10, 41912, 15, 109);
        e2.b(11, 41913, 15, 131);
    }

    public void m() {
        int n2;
        int n3;
        e e2 = rs.n.c.ap.j(1151);
        e e3 = rs.n.c.ap.j(1196);
        e e4 = H[12424];
        e4.aH = 0;
        e4.aR = 260;
        e4.P = 190;
        int[] nArray = new int[]{1196, 1199, 1206, 1215, 1224, 1231, 1240, 1249, 1258, 1267, 1274, 1283, 1573, 1290, 1299, 1308, 1315, 1324, 1333, 1340, 1349, 1358, 1367, 1374, 1381, 1388, 1397, 1404, 1583, 12038, 1414, 1421, 1430, 1437, 1446, 1453, 1460, 1469, 15878, 1602, 1613, 1624, 7456, 1478, 1485, 1494, 1503, 1512, 1521, 1530, 1544, 1553, 1563, 1593, 1635, 12426, 12436, 12446, 12456, 6004, 18471, 19101, 19111, 19151, 19131};
        int n4 = 0;
        int n5 = e4.al.length;
        int[] nArray2 = Arrays.copyOf(e4.al, n5);
        int[] nArray3 = Arrays.copyOf(e4.am, n5);
        int[] nArray4 = Arrays.copyOf(e4.bc, n5);
        e4.k(nArray.length);
        e4.b(n4++, 1195, 0, 0);
        for (n3 = 0; n3 < n5; ++n3) {
            e4.b(n4++, nArray2[n3], nArray3[n3], nArray4[n3]);
        }
        e4.b(n4++, 19100, 122, 196);
        e4.b(n4++, 19110, 145, 196);
        e4.b(n4++, 19150, 1, 220);
        e4.b(n4++, 19130, 26, 220);
        e2.k(68);
        n3 = 5;
        e2.b(0, 12424, 13, 24 - n3 - 14);
        rs.n.c.ap.b(1195, 1, "magic/home", "Cast @gre@Home Teleport");
        rs.n.c.ap.a(19100, 20987, 556, 0, 6, 30005, 81, "Air surge", "A single attack surge spell", this.a, 9, 10, 2);
        rs.n.e.H[19100].X[1] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
        rs.n.e.H[19106].X[0] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
        rs.n.c.ap.a(19110, 20987, 555, 556, 0, 9, 6, 30004, 30005, 85, "Water surge", "A single attack surge spell", this.a, 10, 10, 2);
        rs.n.e.H[19110].X[1] = new int[]{4, 3214, 555, 4, 3214, 4694, 4, 3214, 4695, 4, 3214, 4698, 10, 1688, 1383, 10, 1688, 1395, 10, 1688, 1403, 10, 1688, 6562, 10, 1688, 6563, 0};
        rs.n.e.H[19116].X[0] = new int[]{4, 3214, 555, 4, 3214, 4694, 4, 3214, 4695, 4, 3214, 4698, 10, 1688, 1383, 10, 1688, 1395, 10, 1688, 1403, 10, 1688, 6562, 10, 1688, 6563, 0};
        rs.n.e.H[19110].X[2] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
        rs.n.e.H[19117].X[0] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
        rs.n.c.ap.a(19150, 20987, 557, 556, 0, 9, 6, 30006, 30005, 90, "Earth surge", "A single attack surge spell", this.a, 11, 10, 2);
        rs.n.e.H[19150].X[1] = new int[]{4, 3214, 557, 4, 3214, 4696, 4, 3214, 4699, 4, 3214, 4698, 10, 1688, 1385, 10, 1688, 1399, 10, 1688, 1407, 10, 1688, 3053, 10, 1688, 3054, 10, 1688, 6562, 10, 1688, 6563, 0};
        rs.n.e.H[19156].X[0] = new int[]{4, 3214, 557, 4, 3214, 4696, 4, 3214, 4699, 4, 3214, 4698, 10, 1688, 1385, 10, 1688, 1399, 10, 1688, 1407, 10, 1688, 3053, 10, 1688, 3054, 10, 1688, 6562, 10, 1688, 6563, 0};
        rs.n.e.H[19150].X[2] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
        rs.n.e.H[19157].X[0] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
        rs.n.c.ap.a(19130, 20987, 554, 556, 0, 9, 6, 30003, 30005, 95, "Fire surge", "A single attack surge spell", this.a, 12, 10, 2);
        rs.n.e.H[19130].X[1] = new int[]{4, 3214, 554, 10, 1688, 1387, 0};
        rs.n.e.H[19136].X[0] = new int[]{4, 3214, 554, 10, 1688, 1387, 0};
        rs.n.e.H[19130].X[2] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
        rs.n.e.H[19137].X[0] = new int[]{4, 3214, 556, 10, 1688, 1381, 0};
        for (n2 = 0; n2 < nArray.length; ++n2) {
            int n6 = n2 > 35 ? 8 : 183;
            e2.b(n2 + 1 + 2, nArray[n2], 5, n6);
            e e5 = H[1195];
            e5.ab = 1196;
        }
        rs.n.c.ap.a(41900, "magic/filter 1", "Magic spellbook filter");
        rs.n.c.ap.a(41901, "Filters", this.a, 0, 16750623);
        e2.b(1, 41900, 75, 240);
        e2.b(2, 41901, 82, 243);
        for (n2 = 0; n2 < nArray.length; ++n2) {
            if (n2 < 61 && n2 != 0) {
                e4.am[n2] = e4.am[n2] + 24;
            }
            if (n2 != 7 && n2 != 13 && n2 != 20 && n2 != 36 && n2 != 42 && n2 != 45 && n2 != 50 && n2 != 52) continue;
            e4.am[n2] = 0;
        }
        e4.bc[7] = 24;
        e4.bc[13] = 48;
        e4.bc[20] = 72;
        e4.bc[50] = 96;
        e4.bc[45] = 120;
        e4.bc[52] = 144;
        e4.bc[36] = 170;
        e4.bc[42] = 192;
        e3.aQ = true;
        rs.n.c.ap.a(1197, "Level 0: Home Teleport", this.a, 1, 16685087, true, true);
        e e6 = H[1197];
        e6.P = 174;
        e6.aR = 68;
        rs.n.c.ap.a(1198, "A teleport which requires no", this.a, 0, 11495962, true, true);
        rs.n.c.ap.a(18998, "runes and no required level that", this.a, 0, 11495962, true, true);
        rs.n.c.ap.a(18999, "teleports you to the main land.", this.a, 0, 11495962, true, true);
        e3.k(4);
        e3.b(0, 1197, 3, 4);
        e3.b(1, 1198, 91, 23);
        e3.b(2, 18998, 91, 34);
        e3.b(3, 18999, 91, 45);
        g = Arrays.copyOf(e4.am, e4.am.length);
        bI = Arrays.copyOf(e4.bc, e4.bc.length);
    }

    public void n() {
        e e2 = rs.n.c.ap.d(12855);
        rs.n.c.ap.b(12856, 1, "Magic/Home", "Cast @gre@Home Teleport");
        e e3 = H[12856];
        e3.ab = 1196;
        rs.n.c.ap.c(45149, 9075, 562, 557, 0, 1, 0, 30011, 30006, 60, "Miasmic rush", "A single attack miasmic spell", this.a, 8, 10, 2);
        rs.n.c.ap.c(45751, 9075, 562, 557, 1, 3, 1, 30011, 30006, 72, "Miasmic burst", "A multi-target miasmic spell", this.a, 7, 10, 2);
        rs.n.c.ap.c(45743, 9075, 565, 557, 2, 1, 2, 30014, 30006, 84, "Miasmic blitz", "A single target miasmic spell", this.a, 6, 10, 2);
        rs.n.c.ap.c(45694, 9075, 565, 557, 3, 3, 3, 30014, 30006, 96, "Miasmic barrage", "A multi-target miasmic spell", this.a, 5, 10, 2);
        int[] nArray = new int[]{12856, 12939, 12987, 13035, 12901, 12861, 13045, 12963, 13011, 13053, 12919, 12881, 13061, 12951, 12999, 13069, 12911, 12871, 13079, 13095, 12975, 13023, 13087, 12929, 12891, 45149, 45751, 45743, 45694, 1196, 12940, 12988, 13036, 12902, 12862, 13046, 12964, 13012, 13054, 12920, 12882, 13062, 12952, 13000, 13070, 12912, 12872, 13080, 12976, 13024, 13088, 12930, 12892, 13096, 45150, 45752, 45744, 45695};
        e2.k(nArray.length);
        int n2 = 30;
        int n3 = 0;
        int n4 = 18;
        int n5 = 8;
        while (n3 < nArray.length) {
            if (n4 > 175) {
                n4 = 18;
                n5 += 28;
            }
            int n6 = n4;
            int n7 = n5;
            if (n3 <= 28) {
                n6 += 4;
                n7 += 2;
            }
            if (n3 < n2) {
                if (nArray[n3] == 45149) {
                    n6 -= 3;
                    n7 += 3;
                }
                if (nArray[n3] == 45751) {
                    --n7;
                    --n6;
                }
                if (nArray[n3] == 45743) {
                    n6 -= 2;
                }
                if (nArray[n3] == 45694) {
                    --n6;
                    ++n7;
                }
            }
            if (n3 < n2) {
                e2.b(n3, nArray[n3], n6, n7);
            }
            if (n3 > n2 - 1) {
                n5 = n3 < 41 ? 181 : 1;
                e2.b(n3, nArray[n3], 4, n5);
            }
            ++n3;
            n4 += 45;
        }
    }

    public void o() {
        this.p();
        rs.n.c.ap.d();
        rs.n.c.ap.b(30003, 1, "Fire");
        rs.n.c.ap.b(30004, 2, "Water");
        rs.n.c.ap.b(30005, 3, "Air");
        rs.n.c.ap.b(30006, 4, "Earth");
        rs.n.c.ap.b(30007, 5, "Mind");
        rs.n.c.ap.b(30008, 6, "Body");
        rs.n.c.ap.b(30009, 7, "Death");
        rs.n.c.ap.b(30010, 8, "Nature");
        rs.n.c.ap.b(30011, 9, "Chaos");
        rs.n.c.ap.b(30012, 10, "Law");
        rs.n.c.ap.b(30013, 11, "Cosmic");
        rs.n.c.ap.b(30014, 12, "Blood");
        rs.n.c.ap.b(30015, 13, "Soul");
        rs.n.c.ap.b(30016, 14, "Astral");
        rs.n.c.ap.b(19200, 15, "Wrath");
        rs.n.c.ap.b(30017, 9075, 554, 555, 0, 4, 3, 30003, 30004, 64, "Bake Pie", "Bake pies without a stove", this.a, 0, 16, 2);
        rs.n.c.ap.b(30025, 9075, 557, 0, 7, 30006, 65, "Cure Plant", "Cure disease on farming patch", this.a, 1, 4, 2);
        rs.n.c.ap.d(30032, 9075, 564, 558, 0, 0, 0, 30013, 30007, 65, "Monster Examine", "Detect the combat statistics of a\\nmonster", this.a, 2, 2, 2);
        rs.n.c.ap.b(30040, 9075, 564, 556, 0, 0, 1, 30013, 30005, 66, "NPC Contact", "Speak with varied NPCs", this.a, 3, 0, 2);
        rs.n.c.ap.b(30048, 9075, 563, 557, 0, 0, 9, 30012, 30006, 67, "Cure Other", "Cure poisoned players", this.a, 4, 8, 2);
        rs.n.c.ap.b(30056, 9075, 555, 554, 0, 2, 0, 30004, 30003, 67, "Humidify", "fills certain vessels with water", this.a, 5, 0, 5);
        rs.n.c.ap.b(30064, 9075, 563, 557, 1, 0, 1, 30012, 30006, 68, "@gre@Money Making", "Teleport to money areas", this.a, 6, 0, 5);
        rs.n.c.ap.d(30075, 9075, 563, 557, 1, 0, 3, 30012, 30006, 69, "@gre@Training & Slayer", "Teleport to various monsters", this.a, 7, 0, 5);
        rs.n.c.ap.b(30083, 9075, 563, 557, 1, 0, 5, 30012, 30006, 70, "@gre@Boss Teleports", "Teleport to powerful foes", this.a, 8, 0, 5);
        rs.n.c.ap.b(30091, 9075, 564, 563, 1, 1, 0, 30013, 30012, 70, "Cure Me", "Cures Poison", this.a, 9, 0, 5);
        rs.n.c.ap.b(30099, 9075, 557, 1, 1, 30006, 70, "Skilling Kit", "Get skilling tools!", this.a, 10, 0, 5);
        rs.n.c.ap.b(30106, 9075, 563, 555, 1, 0, 0, 30012, 30004, 71, "@gre@PK Teleports", "Teleport Pking spots", this.a, 11, 0, 5);
        rs.n.c.ap.d(30114, 9075, 563, 555, 1, 0, 4, 30012, 30004, 72, "@gre@Minigame Teleport", "Teleport to shop areas", this.a, 12, 0, 5);
        rs.n.c.ap.b(30122, 9075, 564, 563, 1, 1, 1, 30013, 30012, 73, "Cure Group", "Cures Poison on players", this.a, 13, 0, 5);
        rs.n.c.ap.d(30130, 9075, 564, 559, 1, 1, 4, 30013, 30008, 74, "Stat Spy", "Cast on another player to see their\\nskill levels", this.a, 14, 8, 2);
        rs.n.c.ap.d(30138, 9075, 563, 554, 1, 1, 2, 30012, 30003, 74, "@gre@Teleport to House", "Teleports you to your PoH", this.a, 15, 0, 5);
        rs.n.c.ap.d(30146, 9075, 563, 554, 1, 1, 5, 30012, 30003, 75, "Tele Group Barbarian", "Teleports players to the Barbarian\\noutpost", this.a, 16, 0, 5);
        rs.n.c.ap.b(30154, 9075, 554, 556, 1, 5, 9, 30003, 30005, 76, "Superglass Make", "Make glass without a furnace", this.a, 17, 16, 2);
        rs.n.c.ap.b(30162, 9075, 563, 555, 1, 1, 3, 30012, 30004, 77, "@gre@Teleport to Target", "Teleports you to Bounty Target", this.a, 18, 0, 5);
        rs.n.c.ap.b(30170, 9075, 563, 555, 1, 1, 7, 30012, 30004, 78, "Tele Group Khazard", "Teleports players to Port khazard", this.a, 19, 0, 5);
        rs.n.c.ap.d(30178, 9075, 564, 559, 1, 0, 4, 30013, 30008, 78, "Dream", "Take a rest and restore hitpoints 3\\n times faster", this.a, 20, 0, 5);
        rs.n.c.ap.b(30186, 9075, 557, 555, 1, 9, 4, 30006, 30004, 79, "String Jewellery", "String amulets without wool", this.a, 21, 0, 5);
        rs.n.c.ap.e(30194, 9075, 557, 555, 1, 9, 9, 30006, 30004, 80, "Stat Restore Pot\\nShare", "Share a potion with up to 4 nearby\\nplayers", this.a, 22, 0, 5);
        rs.n.c.ap.b(30202, 9075, 554, 555, 1, 6, 6, 30003, 30004, 81, "Magic Imbue", "Combine runes without a talisman", this.a, 23, 0, 5);
        rs.n.c.ap.d(30210, 9075, 561, 557, 2, 1, 14, 30010, 30006, 82, "Fertile Soil", "Fertilise a farming patch with super\\ncompost", this.a, 24, 4, 2);
        rs.n.c.ap.d(30218, 9075, 557, 555, 2, 11, 9, 30006, 30004, 83, "Boost Potion Share", "Shares a potion with up to 4 nearby\\nplayers", this.a, 25, 0, 5);
        rs.n.c.ap.b(30226, 9075, 563, 555, 2, 2, 9, 30012, 30004, 84, "Fishing Guild Teleport", "Teleports you to the fishing guild", this.a, 26, 0, 5);
        rs.n.c.ap.e(30234, 9075, 563, 555, 1, 2, 13, 30012, 30004, 85, "Tele Group Fishing\\nGuild", "Teleports players to the Fishing\\nGuild", this.a, 27, 0, 5);
        rs.n.c.ap.b(30242, 9075, 557, 561, 2, 14, 0, 30006, 30010, 85, "Plank Make", "Turn Logs into planks", this.a, 28, 16, 5);
        rs.n.c.ap.b(30250, 9075, 563, 555, 2, 2, 9, 30012, 30004, 86, "Catherby Teleport", "Teleports you to Catherby", this.a, 29, 0, 5);
        rs.n.c.ap.b(30258, 9075, 563, 555, 2, 2, 14, 30012, 30004, 87, "Tele Group Catherby", "Teleports players to Catherby", this.a, 30, 0, 5);
        rs.n.c.ap.b(30266, 9075, 563, 555, 2, 2, 7, 30012, 30004, 88, "Ice Plateau Teleport", "Teleports you to Ice Plateau", this.a, 31, 0, 5);
        rs.n.c.ap.d(30274, 9075, 563, 555, 2, 2, 15, 30012, 30004, 89, "Tele Group Ice\\n Plateau", "Teleports players to Ice Plateau", this.a, 32, 0, 5);
        rs.n.c.ap.d(30282, 9075, 563, 561, 2, 1, 0, 30012, 30010, 90, "Energy Transfer", "Spend hitpoints and SA Energy to\\n give another player hitpoints and run energy", this.a, 33, 8, 2);
        rs.n.c.ap.d(30290, 9075, 563, 565, 2, 2, 0, 30012, 30014, 91, "Heal Other", "Transfer up to 75% of hitpoints\\n to another player", this.a, 34, 8, 2);
        rs.n.c.ap.d(30298, 9075, 560, 557, 2, 1, 9, 30009, 30006, 92, "Vengeance Other", "Allows another player to rebound\\ndamage to an opponent", this.a, 35, 8, 2);
        rs.n.c.ap.b(30306, 9075, 560, 557, 3, 1, 9, 30009, 30006, 93, "Vengeance", "Rebound damage to an opponent", this.a, 36, 0, 5);
        rs.n.c.ap.d(30314, 9075, 565, 563, 3, 2, 5, 30014, 30012, 94, "Heal Group", "Transfer up to 75% of hitpoints to a group", this.a, 37, 0, 5);
        rs.n.c.ap.d(30322, 9075, 564, 563, 2, 1, 0, 30013, 30012, 95, "Spellbook Swap", "Change to another spellbook for 1\\nspell cast", this.a, 38, 0, 5);
    }

    public void p() {
        e e2 = rs.n.c.ap.d(29999);
        e2.k(80);
        rs.n.c.ap.b(30000, 11, 10, 0, e2);
        rs.n.c.ap.b(30017, 40, 9, 1, e2);
        rs.n.c.ap.b(30025, 71, 12, 2, e2);
        rs.n.c.ap.b(30032, 103, 10, 3, e2);
        rs.n.c.ap.b(30040, 135, 12, 4, e2);
        rs.n.c.ap.b(30048, 165, 10, 5, e2);
        rs.n.c.ap.b(30056, 8, 38, 6, e2);
        rs.n.c.ap.b(30064, 39, 39, 7, e2);
        rs.n.c.ap.b(30075, 71, 39, 8, e2);
        rs.n.c.ap.b(30083, 103, 39, 9, e2);
        rs.n.c.ap.b(30091, 135, 39, 10, e2);
        rs.n.c.ap.b(30099, 165, 37, 11, e2);
        rs.n.c.ap.b(30106, 12, 68, 12, e2);
        rs.n.c.ap.b(30114, 42, 68, 13, e2);
        rs.n.c.ap.b(30122, 71, 68, 14, e2);
        rs.n.c.ap.b(30130, 103, 68, 15, e2);
        rs.n.c.ap.b(30138, 135, 68, 16, e2);
        rs.n.c.ap.b(30146, 165, 68, 17, e2);
        rs.n.c.ap.b(30154, 14, 97, 18, e2);
        rs.n.c.ap.b(30162, 42, 97, 19, e2);
        rs.n.c.ap.b(30170, 71, 97, 20, e2);
        rs.n.c.ap.b(30178, 101, 97, 21, e2);
        rs.n.c.ap.b(30186, 135, 98, 22, e2);
        rs.n.c.ap.b(30194, 168, 98, 23, e2);
        rs.n.c.ap.b(30202, 11, 125, 24, e2);
        rs.n.c.ap.b(30210, 42, 124, 25, e2);
        rs.n.c.ap.b(30218, 74, 125, 26, e2);
        rs.n.c.ap.b(30226, 103, 125, 27, e2);
        rs.n.c.ap.b(30234, 135, 125, 28, e2);
        rs.n.c.ap.b(30242, 164, 126, 29, e2);
        rs.n.c.ap.b(30250, 10, 155, 30, e2);
        rs.n.c.ap.b(30258, 42, 155, 31, e2);
        rs.n.c.ap.b(30266, 71, 155, 32, e2);
        rs.n.c.ap.b(30274, 103, 155, 33, e2);
        rs.n.c.ap.b(30282, 136, 155, 34, e2);
        rs.n.c.ap.b(30290, 165, 155, 35, e2);
        rs.n.c.ap.b(30298, 13, 185, 36, e2);
        rs.n.c.ap.b(30306, 42, 185, 37, e2);
        rs.n.c.ap.b(30314, 71, 184, 38, e2);
        rs.n.c.ap.b(30322, 104, 184, 39, e2);
        rs.n.c.ap.b(30001, 6, 184, 40, e2);
        rs.n.c.ap.b(30018, 5, 176, 41, e2);
        rs.n.c.ap.b(30026, 5, 176, 42, e2);
        rs.n.c.ap.b(30033, 5, 163, 43, e2);
        rs.n.c.ap.b(30041, 5, 176, 44, e2);
        rs.n.c.ap.b(30049, 5, 176, 45, e2);
        rs.n.c.ap.b(30057, 5, 176, 46, e2);
        rs.n.c.ap.b(30065, 5, 176, 47, e2);
        rs.n.c.ap.b(30076, 5, 163, 48, e2);
        rs.n.c.ap.b(30084, 5, 176, 49, e2);
        rs.n.c.ap.b(30092, 5, 176, 50, e2);
        rs.n.c.ap.b(30100, 5, 176, 51, e2);
        rs.n.c.ap.b(30107, 5, 176, 52, e2);
        rs.n.c.ap.b(30115, 5, 163, 53, e2);
        rs.n.c.ap.b(30123, 5, 176, 54, e2);
        rs.n.c.ap.b(30131, 5, 163, 55, e2);
        rs.n.c.ap.b(30139, 5, 163, 56, e2);
        rs.n.c.ap.b(30147, 5, 163, 57, e2);
        rs.n.c.ap.b(30155, 5, 176, 58, e2);
        rs.n.c.ap.b(30163, 5, 176, 59, e2);
        rs.n.c.ap.b(30171, 5, 176, 60, e2);
        rs.n.c.ap.b(30179, 5, 163, 61, e2);
        rs.n.c.ap.b(30187, 5, 176, 62, e2);
        rs.n.c.ap.b(30195, 5, 149, 63, e2);
        rs.n.c.ap.b(30203, 5, 176, 64, e2);
        rs.n.c.ap.b(30211, 5, 163, 65, e2);
        rs.n.c.ap.b(30219, 5, 163, 66, e2);
        rs.n.c.ap.b(30227, 5, 176, 67, e2);
        rs.n.c.ap.b(30235, 5, 149, 68, e2);
        rs.n.c.ap.b(30243, 5, 176, 69, e2);
        rs.n.c.ap.b(30251, 5, 5, 70, e2);
        rs.n.c.ap.b(30259, 5, 5, 71, e2);
        rs.n.c.ap.b(30267, 5, 5, 72, e2);
        rs.n.c.ap.b(30275, 5, 5, 73, e2);
        rs.n.c.ap.b(30283, 5, 5, 74, e2);
        rs.n.c.ap.b(30291, 5, 5, 75, e2);
        rs.n.c.ap.b(30299, 5, 5, 76, e2);
        rs.n.c.ap.b(30307, 5, 5, 77, e2);
        rs.n.c.ap.b(30323, 5, 5, 78, e2);
        rs.n.c.ap.b(30315, 5, 5, 79, e2);
    }

    static {
        c = 0;
        d = true;
        e = true;
        f = new ArrayList<a>();
        bQ = -1;
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            d = rs.n.c.ap$c.a();
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = rs.n.c.ap$a.a();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(1152, 1, rs.n.c.ap$a.a);
        public static final /* enum */ b b = new b(1153, 3, rs.n.c.ap$a.a);
        public static final /* enum */ b c = new b(1154, 5, rs.n.c.ap$a.a);
        public static final /* enum */ b d = new b(1156, 9, rs.n.c.ap$a.a);
        public static final /* enum */ b e = new b(1157, 11, rs.n.c.ap$a.a);
        public static final /* enum */ b f = new b(1158, 13, rs.n.c.ap$a.a);
        public static final /* enum */ b g = new b(1160, 17, rs.n.c.ap$a.a);
        public static final /* enum */ b h = new b(1161, 19, rs.n.c.ap$a.a);
        public static final /* enum */ b i = new b(1163, 23, rs.n.c.ap$a.a);
        public static final /* enum */ b j = new b(1166, 29, rs.n.c.ap$a.a);
        public static final /* enum */ b k = new b(1169, 35, rs.n.c.ap$a.a);
        public static final /* enum */ b l = new b(1171, 39, rs.n.c.ap$a.a);
        public static final /* enum */ b m = new b(1172, 41, rs.n.c.ap$a.a);
        public static final /* enum */ b n = new b(1175, 47, rs.n.c.ap$a.a);
        public static final /* enum */ b o = new b(1177, 53, rs.n.c.ap$a.a);
        public static final /* enum */ b p = new b(1181, 59, rs.n.c.ap$a.a);
        public static final /* enum */ b q = new b(1183, 62, rs.n.c.ap$a.a);
        public static final /* enum */ b r = new b(1185, 65, rs.n.c.ap$a.a);
        public static final /* enum */ b s = new b(1188, 70, rs.n.c.ap$a.a);
        public static final /* enum */ b t = new b(1189, 75, rs.n.c.ap$a.a);
        public static final /* enum */ b u = new b(1190, 60, rs.n.c.ap$a.a);
        public static final /* enum */ b v = new b(1191, 60, rs.n.c.ap$a.a);
        public static final /* enum */ b w = new b(1192, 60, rs.n.c.ap$a.a);
        public static final /* enum */ b x = new b(1193, 80, rs.n.c.ap$a.a);
        public static final /* enum */ b y = new b(1562, 80, rs.n.c.ap$a.a);
        public static final /* enum */ b z = new b(1572, 20, rs.n.c.ap$a.a);
        public static final /* enum */ b A = new b(1582, 50, rs.n.c.ap$a.a);
        public static final /* enum */ b B = new b(1592, 79, rs.n.c.ap$a.a);
        public static final /* enum */ b C = new b(12445, 85, rs.n.c.ap$a.a);
        public static final /* enum */ b D = new b(19100, 82, rs.n.c.ap$a.a);
        public static final /* enum */ b E = new b(19110, 86, rs.n.c.ap$a.a);
        public static final /* enum */ b F = new b(19150, 91, rs.n.c.ap$a.a);
        public static final /* enum */ b G = new b(19130, 96, rs.n.c.ap$a.a);
        public static final /* enum */ b H = new b(1195, 100, rs.n.c.ap$a.b);
        public static final /* enum */ b I = new b(1164, 100, rs.n.c.ap$a.b);
        public static final /* enum */ b J = new b(1167, 100, rs.n.c.ap$a.b);
        public static final /* enum */ b K = new b(1170, 100, rs.n.c.ap$a.b);
        public static final /* enum */ b L = new b(1174, 100, rs.n.c.ap$a.b);
        public static final /* enum */ b M = new b(1540, 100, rs.n.c.ap$a.b);
        public static final /* enum */ b N = new b(1541, 100, rs.n.c.ap$a.b);
        public static final /* enum */ b O = new b(7455, 100, rs.n.c.ap$a.b);
        public int P;
        public int Q;
        public a R;
        private static final /* synthetic */ b[] S;

        public static b[] values() {
            return (b[])S.clone();
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        private b(int n3, int n4, a a2) {
            this.P = n3;
            this.Q = n4;
            this.R = a2;
        }

        public static b a(int n2) {
            for (b b2 : rs.n.c.ap$b.values()) {
                if (b2.P != n2) continue;
                return b2;
            }
            return null;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O};
        }

        static {
            S = rs.n.c.ap$b.a();
        }
    }
}

