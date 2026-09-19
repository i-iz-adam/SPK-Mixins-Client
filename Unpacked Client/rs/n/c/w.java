/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import rs.Client;
import rs.d.d;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.c.ab;
import rs.n.e;

public class w
extends c {
    public static boolean c = false;
    public static String d = "setyellcolors";
    public static String e = "FE0002";
    public static String f = "0";
    public static Map<Integer, String> g = new HashMap<Integer, String>();
    public static Map<Integer, Integer> bI = new HashMap<Integer, Integer>();
    public static int[] bJ = new int[]{924, 924, 62575, 62575, 6015, 0};
    public static int bK = 0;

    public w(k_0[] k_0Array) {
        super(k_0Array);
    }

    public static void h() {
        rs.n.e.H[63026].at = f == null ? "<col=" + e + ">Sample on chat background" : "<shad=" + f + "><col=" + e + ">Sample on chat background";
    }

    public static void i() {
        rs.n.c.ab.l();
        rs.n.c.ab.m();
        rs.n.c.ab.bM = true;
        rs.n.c.ab.a("CAPE", 23063);
        rs.n.c.w.o(rs.n.c.w.b(bJ[bK], bK != 5));
    }

    public static void m(int n2) {
        if (Client.cH == 63000) {
            if (n2 == 63027) {
                String string = "::" + d + " " + e;
                if (f != null) {
                    string = string + " " + f;
                }
                Client.ap = string;
            }
            if (c && n2 == 63024) {
                rs.n.e.H[63022].E = new f_0("gambling/sprite 2");
                rs.n.e.H[63023].E = new f_0("gambling/sprite 1");
                c = false;
                rs.n.c.w.h();
            }
            if (!c && n2 == 63025) {
                rs.n.e.H[63022].E = new f_0("gambling/sprite 1");
                rs.n.e.H[63023].E = new f_0("gambling/sprite 2");
                c = true;
                rs.n.c.w.h();
            }
            if (n2 >= 63002 && n2 <= 63021) {
                if (c) {
                    f = g.get(n2);
                } else {
                    e = g.get(n2);
                }
                rs.n.c.w.h();
            }
        } else if (Client.cH == 63036) {
            if (n2 == 63027) {
                Object object = "::compcolors ";
                int[] nArray = new int[bJ.length];
                for (int i2 = 0; i2 < bJ.length; ++i2) {
                    nArray[i2] = rs.n.c.w.b(bJ[i2], i2 != 5) - 63002;
                }
                object = (String)object + nArray[4] + " ";
                object = (String)object + nArray[0] + " ";
                object = (String)object + nArray[2] + " ";
                object = (String)object + nArray[1] + " ";
                object = (String)object + nArray[3] + " ";
                object = (String)object + nArray[5];
                Client.ap = (String)object;
            }
            if (n2 >= 63002 && n2 <= 63021) {
                int n3 = rs.n.c.w.b("#" + g.get(n2));
                int n4 = bJ[bK];
                if (bK == 5) {
                    n3 = Integer.parseInt(g.get(n2), 16);
                }
                bI.put(57343, 57443);
                rs.n.c.w.bJ[rs.n.c.w.bK] = n3;
                if (n4 != n3) {
                    rs.n.c.ab.m();
                    rs.n.c.ab.bM = true;
                }
                rs.n.c.w.o(n2);
            }
            if (n2 >= 63046 && n2 <= 63051) {
                bK = n2 - 63046;
                rs.n.c.w.o(rs.n.c.w.b(bJ[bK], bK != 5));
                for (int i3 = 63040; i3 <= 63045; ++i3) {
                    rs.n.e.H[i3].E = new f_0(i3 != 63040 + bK ? "gambling/sprite 1" : "gambling/sprite 2");
                }
            }
        }
    }

    public static int a(int n2, boolean bl) {
        if (!bl) {
            return Integer.parseInt(g.get(63002 + n2), 16);
        }
        return rs.n.c.w.b("#" + g.get(63002 + n2));
    }

    public static int b(String string) {
        Color color = Color.decode(string);
        return rs.n.c.w.f(color.getRed(), color.getGreen(), color.getBlue());
    }

    public static int f(int n2, int n3, int n4) {
        float f2;
        int n5;
        float f3;
        int n6;
        float[] fArray = Color.RGBtoHSB(n2, n3, n4, null);
        float f4 = fArray[0];
        int n7 = (int)(f4 * 63.0f);
        int n8 = (n7 << 10) + ((n6 = (int)((f3 = fArray[1]) * 7.0f)) << 7) + (n5 = (int)((f2 = fArray[2]) * 127.0f));
        if (bI.get(n8) != null) {
            n8 = bI.get(n8);
        }
        return n8;
    }

    public static int n(int n2) {
        int n3 = n2 >> 10 & 0x3F;
        int n4 = n2 >> 7 & 7;
        int n5 = n2 & 0x7F;
        return Color.HSBtoRGB((float)n3 / 63.0f, (float)n4 / 7.0f, (float)n5 / 127.0f);
    }

    public static int b(int n2, boolean bl) {
        for (Integer n3 : g.keySet()) {
            int n4 = bl ? rs.n.c.w.b("#" + g.get(n3)) : Integer.parseInt(g.get(n3), 16);
            if (n4 != n2) continue;
            return n3;
        }
        return 63002;
    }

    @Override
    public void a() {
        int n2;
        int n3;
        e e2 = rs.n.c.w.d(63000);
        rs.n.c.w.h(63001, "options/colors/0");
        for (n3 = 1; n3 <= 20; ++n3) {
            rs.n.c.w.a(63001 + n3, "options/colors/" + n3, "Select color");
        }
        rs.n.c.w.c(63022, 2, "gambling/sprite");
        rs.n.c.w.c(63023, 1, "gambling/sprite");
        rs.n.c.w.a(63024, "<tab=20>Font color", "Select color type", this.a, 0, 16750623, false, true, 150);
        rs.n.c.w.a(63025, "<tab=20>Shadow color", "Select color type", this.a, 0, 16750623, false, true, 150);
        rs.n.c.w.a(63026, "<shad=", "Select color type", this.a, 0, 16750623, false, true, 150);
        rs.n.c.w.a(63026, "<shad=" + f + "><col=" + e + ">Sample on chat background", this.a, 1, 16750623, true, false);
        rs.n.c.w.a(63027, "teleport/SPRITE", 10, 100, 32, "Confirm colors", -1, 63028, 1);
        rs.n.c.w.a(63028, "teleport/SPRITE", 11, 100, 32, 63029);
        rs.n.c.w.a(63030, "<img=24> Confirm", this.a, 0, 16751360, true, true);
        rs.n.c.w.a(63031, "teleport/SPRITE", 10, 100, 32, "Cancel colors", -1, 63032, 1);
        rs.n.c.w.a(63032, "teleport/SPRITE", 11, 100, 32, 63033);
        rs.n.c.w.a(63034, "<img=25> Cancel", this.a, 0, 16751360, true, true);
        rs.n.c.w.a(63035, "Text Color Selection Menu", this.a, 2, 16751360, true, true);
        e2.k(33);
        e2.b(0, 63001, 108, 17);
        n3 = 162;
        int n4 = 162;
        int n5 = 50;
        int n6 = 0;
        for (int i2 = 1; i2 <= 20; ++i2) {
            e2.b(i2, 63001 + i2, n3, n5);
            n3 += 40;
            if (++n6 != 5) continue;
            n5 += 50;
            n3 = n4;
            n6 = 0;
        }
        g.put(63002, "FE0002");
        g.put(63003, "FEFF01");
        g.put(63004, "FF1BFF");
        g.put(63005, "FF4DFF");
        g.put(63006, "B07EFF");
        g.put(63007, "0");
        g.put(63008, "363435");
        g.put(63009, "DFD6D7");
        g.put(63010, "7DFFFF");
        g.put(63011, "940000");
        g.put(63012, "9FFF9F");
        g.put(63013, "008200");
        g.put(63014, "FF8F8D");
        g.put(63015, "FF9620");
        g.put(63016, "FF6F00");
        g.put(63017, "FF5153");
        g.put(63018, "01FFFF");
        g.put(63019, "00AFFF");
        g.put(63020, "0000FE");
        g.put(63021, "01FF02");
        e2.b(21, 63022, 125, 245);
        e2.b(22, 63024, 125, 247);
        e2.b(23, 63023, 125, 263);
        e2.b(24, 63025, 125, 265);
        e2.b(25, 63026, 310, 253);
        e2.b(26, 63027, 152, 284);
        e2.b(27, 63028, 152, 284);
        e2.b(28, 63030, 199, 294);
        e2.b(29, 63031, 262, 284);
        e2.b(30, 63032, 262, 284);
        e2.b(31, 63034, 309, 294);
        e2.b(32, 63035, 256, 22);
        e e3 = rs.n.c.w.d(63036);
        rs.n.c.w.a(63037, "Cape Color Selection Menu", this.a, 2, 16751360, true, true);
        rs.n.c.w.a(63038, 110, 250);
        rs.n.e.H[63038].af = n2 = 4907;
        rs.n.e.H[63038].aT = 750;
        rs.n.e.H[63038].aV = 1550;
        rs.n.e.H[63038].ar = 0;
        rs.n.e.H[63038].F = 0;
        rs.n.e.H[63038].aD = rs.d.d.c((int)n2).w;
        rs.n.e.H[63038].aE = rs.d.d.c((int)n2).w;
        rs.n.c.w.h(63039, "options/colors/cape");
        rs.n.c.w.c(63040, 2, "gambling/sprite");
        rs.n.c.w.c(63041, 1, "gambling/sprite");
        rs.n.c.w.c(63042, 1, "gambling/sprite");
        rs.n.c.w.c(63043, 1, "gambling/sprite");
        rs.n.c.w.c(63044, 1, "gambling/sprite");
        rs.n.c.w.c(63045, 1, "gambling/sprite");
        rs.n.c.w.a(63046, "<tab=20>Detail color 1", "Select color type", this.a, 0, 16750623, false, true, 150);
        rs.n.c.w.a(63047, "<tab=20>Detail color 2", "Select color type", this.a, 0, 16750623, false, true, 150);
        rs.n.c.w.a(63048, "<tab=20>Background color 1", "Select color type", this.a, 0, 16750623, false, true, 150);
        rs.n.c.w.a(63049, "<tab=20>Background color 2", "Select color type", this.a, 0, 16750623, false, true, 150);
        rs.n.c.w.a(63050, "<tab=20>Trim color", "Select color type", this.a, 0, 16750623, false, true, 150);
        rs.n.c.w.a(63051, "<tab=20>Particle color", "Select color type", this.a, 0, 16750623, false, true, 150);
        rs.n.c.w.h(63052, "options/colors/highlight");
        e3.k(42);
        e3.b(0, 63039, 70, 17);
        n3 = 0;
        n3 = 162;
        n4 = 162;
        n5 = 50;
        n6 = 0;
        for (int i3 = 1; i3 <= 20; ++i3) {
            e3.b(i3, 63001 + i3, n3 - 38, n5);
            n3 += 40;
            if (++n6 != 5) continue;
            n5 += 50;
            n3 = n4;
            n6 = 0;
        }
        e3.b(21, 63027, 152, 284);
        e3.b(22, 63028, 152, 284);
        e3.b(23, 63030, 199, 294);
        e3.b(24, 63031, 262, 284);
        e3.b(25, 63032, 262, 284);
        e3.b(26, 63034, 309, 294);
        e3.b(27, 63037, 256, 22);
        e3.b(28, 63038, 321, 35);
        e3.b(29, 63040, 93, 242);
        e3.b(30, 63046, 93, 244);
        e3.b(31, 63041, 93, 262);
        e3.b(32, 63047, 93, 264);
        e3.b(33, 63042, 193, 242);
        e3.b(34, 63048, 193, 244);
        e3.b(35, 63043, 193, 262);
        e3.b(36, 63049, 193, 264);
        e3.b(37, 63044, 323, 242);
        e3.b(38, 63050, 323, 244);
        e3.b(39, 63045, 323, 262);
        e3.b(40, 63051, 323, 264);
        e3.b(41, 63052, e3.am[5] - 2, e3.bc[5] - 2);
    }

    public static void o(int n2) {
        int n3 = -1;
        e e2 = rs.n.e.H[63036];
        for (int i2 = 1; i2 <= 20; ++i2) {
            if (e2.al[i2] != n2) continue;
            n3 = i2;
            break;
        }
        if (n3 == -1) {
            return;
        }
        e2.am[41] = e2.am[n3] - 2;
        e2.bc[41] = e2.bc[n3] - 2;
    }

    static {
        bI.put(969, 924);
        bI.put(64510, 970);
        bI.put(0, 1);
        bI.put(5119, 332770);
        bI.put(32639, 35838);
        bI.put(35839, 44031);
        bI.put(44030, 305970);
    }
}

