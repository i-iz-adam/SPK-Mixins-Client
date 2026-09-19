/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class av
extends c {
    public static int c = 55021;
    public static int d = 55018;
    public static int e = 55015;
    public static int[] f = new int[]{c, d, e};
    public static Map<Integer, List<String>> g = new HashMap<Integer, List<String>>();
    public static int bI = 1;

    public av(k_0[] k_0Array) {
        super(k_0Array);
    }

    public static void m(int n2) {
        int n3;
        int n4 = -1;
        bI = n2;
        if (n2 == 1) {
            n4 = c;
        } else if (n2 == 2) {
            n4 = d;
        } else if (n2 == 3) {
            n4 = e;
        }
        for (int n5 : f) {
            if (n5 != n4) {
                rs.n.e.H[n5].E = new f_0("achievements/sprite 6");
                rs.n.e.H[n5 + 1].E = new f_0("achievements/sprite 6");
                continue;
            }
            rs.n.e.H[n5].E = new f_0("achievements/sprite 5");
            rs.n.e.H[n5 + 1].E = new f_0("achievements/sprite 5");
        }
        for (n3 = 60412; n3 <= 60424; ++n3) {
            if (rs.n.e.H[n3] == null || rs.n.e.H[n3].at == null) continue;
            rs.n.e.H[n3].at = "";
        }
        n3 = 60412;
        List<String> list = g.get(n2);
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String string;
            rs.n.e.H[n3].at = string = iterator.next();
            ++n3;
        }
    }

    @Override
    public void a() {
        int n2;
        e e2 = rs.n.c.av.j(18551);
        rs.n.c.av.c(55000, 16, "teleport/SPRITE");
        e e3 = rs.n.c.av.d(55001);
        e3.aH = 250;
        e3.P = 165;
        e3.aR = 78;
        e3.bj = 87;
        e3.k(17);
        for (int i2 = 0; i2 < 17; ++i2) {
            e3.b(i2, 60427 + i2, 0, 3 + i2 * 13);
        }
        rs.n.c.av.a(55002, "teleport/button", 1, 91, 41, "Track this activity", -1, 55003, 1);
        rs.n.c.av.a(55003, "teleport/button", 2, 91, 41, 55036);
        rs.n.c.av.a(55004, "Track", this.a, 1, 16751360, false, true);
        rs.n.c.av.a(55005, "Fill up the bar for rewards!", this.a, 1, 16751360, false, true);
        rs.n.c.av.a(55789, "@or1@Daily reward bonus", this.a, 1, 16751360, false, true);
        rs.n.c.av.a(55788, "@or1@Daily Money Making Activities", this.a, 2, 16751360, true, true);
        e e4 = rs.n.c.av.d(55006);
        e4.aH = 350;
        e4.P = 325;
        e4.aR = 42;
        e4.bj = 87;
        e4.k(1);
        rs.n.c.av.a(55007, false);
        rs.n.c.av.H[55007].P = 6;
        rs.n.c.av.H[55007].ac = 18;
        rs.n.c.av.H[55007].ap = 10;
        for (n2 = 0; n2 < 12; ++n2) {
            rs.n.c.av.H[55007].az[n2] = 995;
            rs.n.c.av.H[55007].ax[n2] = n2 + 1;
        }
        e4.b(0, 55007, 33, 5);
        rs.n.c.av.c(55790, 12, "teleport/sprite");
        rs.n.c.av.c(55791, 13, "teleport/sprite");
        rs.n.e.H[55791].E = new f_0("teleport/sprite 13", 0, 15);
        rs.n.c.av.a(55792, "0% (0/100)", this.a, 0, 0, true, false);
        rs.n.c.av.a(55793, "Kill 100 green dragons", this.a, 1, 16751360, true, true);
        rs.n.c.av.a(55794, "@or1@Activities", this.a, 1, 16751360, true, true);
        rs.n.c.av.c(55009, 12, "teleport/sprite");
        rs.n.c.av.c(55010, 13, "teleport/sprite");
        rs.n.e.H[55010].E = new f_0("teleport/sprite 13", 0, 15);
        rs.n.c.av.a(55011, "0% (0/100)", this.a, 0, 0, true, false);
        rs.n.c.av.a(55012, "teleport/button", 1, 91, 41, "Teleport to this activity", -1, 55013, 1);
        rs.n.c.av.a(55013, "teleport/button", 2, 91, 41, 55035);
        rs.n.c.av.a(55014, "Teleport", this.a, 1, 16751360, true, true);
        rs.n.c.av.a(55015, 5, 0, 55016, 6, "achievements/SPRITE", 54, 21, "Hard money making tasks");
        rs.n.c.av.a(55016, 5, "achievements/SPRITE", 54, 21, 55017);
        rs.n.c.av.a(55018, 5, 0, 55019, 6, "achievements/SPRITE", 54, 21, "Medium money making tasks");
        rs.n.c.av.a(55019, 5, "achievements/SPRITE", 54, 21, 55020);
        rs.n.c.av.a(55021, 5, 0, 55022, 6, "achievements/SPRITE", 54, 21, "Easy money making tasks");
        rs.n.c.av.a(55022, 5, "achievements/SPRITE", 54, 21, 55023);
        rs.n.c.av.a(55024, "@or1@Easy", this.a, 0, 16751360, false, true);
        rs.n.c.av.a(55025, "@or1@Med.", this.a, 0, 16751360, false, true);
        rs.n.c.av.a(55026, "@or1@Hard", this.a, 0, 16751360, false, true);
        rs.n.c.av.a(55030, "<u=16776960>Location</u>", this.a, 2, 16751360, true, true);
        rs.n.c.av.a(55032, "<img=8> @or2@Lvl. 46 wild <img=8>", this.a, 1, 16751360, true, true);
        rs.n.c.av.a(55031, "<img=53> @or2@Singles <img=53>", this.a, 1, 16751360, true, true);
        rs.n.c.av.h(55027, "teleport/icon 1");
        rs.n.c.av.h(55028, "teleport/icon 2");
        rs.n.c.av.a(55029, "@or1@Activity name", this.a, 0, 16751360, true, true);
        n2 = 10;
        e2.k(50);
        e2.b(0, 55000, 7, 16);
        e2.b(1, 60405, -10321, 54 + n2);
        e2.b(2, 55794, 73, 51 + n2);
        e2.b(3, 60407, 319, -1000);
        e2.b(4, 60408, 281, 183 + n2);
        e2.b(5, 55789, 190, 165 + n2);
        e2.b(6, 55788, 310, 18 + n2);
        e2.b(7, 60411, 180, 112 + n2 + 7);
        int n3 = 75;
        int n4 = -3;
        int n5 = 18;
        e2.b(8, 60412, n4, n3 + n2);
        e2.b(9, 60413, n4, n3 + n5 * 1 + n2);
        e2.b(10, 60414, n4, n3 + n5 * 2 + n2);
        e2.b(11, 60415, n4, n3 + n5 * 3 + n2);
        e2.b(12, 60416, n4, n3 + n5 * 4 + n2);
        e2.b(13, 60417, n4, n3 + n5 * 5 + n2);
        e2.b(14, 60418, n4, n3 + n5 * 6 + n2);
        e2.b(15, 60419, n4, n3 + n5 * 7 + n2);
        e2.b(16, 60420, n4, n3 + n5 * 8 + n2);
        e2.b(17, 60421, n4, n3 + n5 * 9 + n2);
        e2.b(18, 60422, n4, n3 + n5 * 10 + n2);
        e2.b(19, 60423, n4, n3 + n5 * 11 + n2);
        e2.b(20, 60424, n4, n3 + n5 * 12 + n2);
        e2.b(21, 55012, 292, 68);
        e2.b(22, 55013, 292, 68);
        e2.b(23, 55014, 348, 81);
        e2.b(24, 63740, 479, 22 + n2 - 5);
        e2.b(25, 63741, 479, 22 + n2 - 5);
        int n6 = -70;
        e2.b(26, 55790, 176, 258 + n6 + n2 + 2);
        e2.b(27, 55791, 176, 258 + n6 + n2 + 2);
        e2.b(28, 55792, 325, 260 + n6 + n2 + 2);
        e2.b(29, 55793, 324, 219);
        e2.b(30, 55002, 292, 120);
        e2.b(31, 55003, 292, 120);
        e2.b(32, 55004, 330, 132);
        e2.b(33, 55005, 189, 249);
        e2.b(34, 55006, 136, 267);
        int n7 = 3;
        int n8 = -4;
        e2.b(35, 55015, 107 + n7, 30 + n8);
        e2.b(36, 55016, 107 + n7, 30 + n8);
        e2.b(37, 55018, 59 + n7, 30 + n8);
        e2.b(38, 55019, 59 + n7, 30 + n8);
        e2.b(39, 55021, 11 + n7, 30 + n8);
        e2.b(40, 55022, 11 + n7, 30 + n8);
        e2.b(41, 55024, 21 + n7, 36 + n8);
        e2.b(42, 55025, 69 + n7, 36 + n8);
        e2.b(43, 55026, 114 + n7, 36 + n8);
        e2.b(44, 55030, 446, 79);
        e2.b(45, 55032, 447, 99);
        e2.b(46, 55031, 446, 116);
        e2.b(47, 55027, 301, 78);
        e2.b(48, 55028, 309, 130);
        e2.b(49, 55029, 222, 64);
        e e5 = rs.n.c.av.d(55008);
        e5.k(3);
        int n9 = -80;
        n6 = 55;
        e5.b(0, 55009, 176 + n9, 6);
        e5.b(1, 55010, 176 + n9, 6);
        e5.b(2, 55011, 325 + n9, 8);
    }
}

