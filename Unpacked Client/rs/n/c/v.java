/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class v
extends c {
    public static f_0 c;
    public static f_0 d;
    public static f_0[] e;
    public static f_0 f;

    public v(k_0[] k_0Array) {
        super(k_0Array);
        this.b = true;
    }

    @Override
    public void a() {
        e e2 = rs.n.c.v.d(54300);
        rs.n.c.v.h(54301, "drops/collection 3");
        c = new f_0("drops/collection 1");
        d = new f_0("drops/collection 2");
        rs.n.c.v.e[0] = new f_0("drops/collection 4");
        rs.n.c.v.e[1] = new f_0("drops/collection 5");
        f = new f_0("drops/collection 6");
        rs.n.c.v.b(54302, 1, "drops/collection", "Bosses");
        rs.n.c.v.b(54303, 2, "drops/collection", "Boxes");
        rs.n.c.v.b(54304, 2, "drops/collection", "Minigames");
        rs.n.c.v.b(54305, 2, "drops/collection", "Other");
        rs.n.c.v.b(54306, 2, "drops/collection", "N/A");
        rs.n.c.v.a(54307, "Bosses", this.a, 1, 16750623);
        rs.n.c.v.a(54308, "Boxes", this.a, 1, 16750623);
        rs.n.c.v.a(54309, "Minigames", this.a, 1, 16750623);
        rs.n.c.v.a(54310, "Other", this.a, 1, 16750623);
        rs.n.c.v.a(54311, "N/A", this.a, 1, 16750623);
        rs.n.c.v.a(54312, "Collection Log <img=321>", this.a, 2, 16750623);
        e e3 = rs.n.c.v.d(54313);
        e3.aH = 750;
        e3.P = 190;
        e3.aR = 262;
        e3.k(100);
        int n2 = 54314;
        int n3 = 0;
        for (int i2 = 0; i2 < 50; ++i2) {
            rs.n.c.v.h(n2++, "");
            rs.n.e.H[n2 - 1].E = i2 == 0 ? f : e[i2 % 2 == 0 ? 0 : 1];
            rs.n.e.H[n2 - 1].aG = i2 == 0 ? f : e[i2 % 2 == 0 ? 0 : 1];
            rs.n.c.v.a(n2++, "", "Select collection log", this.a, 1, 16750623, false, true, 250);
            e3.b(n3++, n2 - 2, 3, 1 + i2 * 16);
            e3.b(n3++, n2 - 1, 5, 1 + i2 * 16);
        }
        rs.n.c.v.a(54414, "Collection name", this.a, 2, 16750623);
        rs.n.c.v.a(54415, "Obtained: @red@0/0", this.a, 0, 16750623);
        rs.n.c.v.c(54416, "Kill count: @whi@0", this.a, 0, 16750623, true);
        e e4 = rs.n.c.v.d(54417);
        e4.aH = 950;
        e4.P = 258;
        e4.aR = 185;
        e4.k(1);
        rs.n.c.v.a(54418, false);
        rs.n.c.v.H[54418].K = new int[120];
        rs.n.c.v.H[54418].ax = new int[120];
        rs.n.c.v.H[54418].az = new int[120];
        rs.n.c.v.H[54418].as = new int[120];
        rs.n.c.v.H[54418].P = 6;
        rs.n.c.v.H[54418].aR = 20;
        rs.n.c.v.H[54418].ac = 11;
        rs.n.c.v.H[54418].ap = 16;
        e4.b(0, 54418, 3, 3);
        rs.n.c.v.a(54419, "Complete this collection and receive..", this.a, 0, 16750623);
        rs.n.c.v.a(54420, "@yel@15M coins + 25,000 RX points + 150 boss points", this.a, 0, 16750623);
        rs.n.c.v.a(54421, "SCRIPT_HOLDER", this.a, 0, 16750623);
        rs.n.c.v.a(54422, "SCRIPT_HOLDER", this.a, 0, 16750623);
        e2.k(21);
        e2.b(0, 54301, 3, 3);
        e2.b(1, 54302, 12, 39);
        e2.b(2, 54303, 108, 39);
        e2.b(3, 54304, 204, 39);
        e2.b(4, 54305, 300, 39);
        e2.b(5, 54306, -5000, 39);
        e2.b(6, 54307, 17, 41);
        e2.b(7, 54308, 113, 41);
        e2.b(8, 54309, 209, 41);
        e2.b(9, 54310, 305, 41);
        e2.b(10, 54311, -5000, 41);
        e2.b(11, 54312, 214, 12);
        e2.b(12, 63740, 482, 13);
        e2.b(13, 63741, 482, 13);
        e2.b(14, 54313, 10, 60);
        e2.b(15, 54414, 223, 62);
        e2.b(16, 54415, 223, 84);
        e2.b(17, 54416, 494, 84);
        e2.b(18, 54417, 222, 101);
        e2.b(19, 54419, 220, 292);
        e2.b(20, 54420, 220, 308);
    }

    @Override
    public void a(int n2) {
    }

    @Override
    public void a(int n2, String string) {
        int n3;
        int n4;
        int n5;
        if (n2 == 54315) {
            for (n5 = 54315; n5 <= 54413; ++n5) {
                if (n5 % 2 == 0) continue;
                rs.n.e.H[n5].at = "";
            }
        }
        if (n2 == 54421) {
            n5 = 0;
            n4 = Integer.parseInt(string);
            for (n3 = 54314; n3 <= 54412; ++n3) {
                if (n3 % 2 != 0) continue;
                rs.n.e.H[n3].E = n3 == n4 ? f : e[n5];
                rs.n.e.H[n3].aG = n3 == n4 ? f : e[n5];
                n5 = n5 == 0 ? 1 : 0;
            }
            rs.n.c.v.H[54417].V = 0;
        }
        if (n2 == 54422) {
            n5 = Integer.parseInt(string);
            if (n5 >= 54302 && n5 <= 54306) {
                for (n4 = 54302; n4 <= 54306; ++n4) {
                    rs.n.e.H[n4].E = n5 == n4 ? c : d;
                    rs.n.e.H[n4].aG = n5 == n4 ? c : d;
                }
                rs.n.c.v.H[54313].V = 0;
            }
            n4 = 0;
            for (n3 = 54314; n3 <= 54412; ++n3) {
                if (n3 % 2 != 0) continue;
                rs.n.e.H[n3].E = e[n4];
                rs.n.e.H[n3].aG = e[n4];
                n4 = n4 == 0 ? 1 : 0;
            }
        }
    }

    @Override
    public void b() {
        int n2;
        int n3 = 0;
        for (n2 = 54314; n2 <= 54412; ++n2) {
            if (n2 % 2 != 0) continue;
            rs.n.e.H[n2].E = n2 == 54314 ? f : e[n3];
            rs.n.e.H[n2].aG = n2 == 54314 ? f : e[n3];
            n3 = n3 == 0 ? 1 : 0;
        }
        for (n2 = 54302; n2 <= 54306; ++n2) {
            rs.n.e.H[n2].E = 54302 == n2 ? c : d;
            rs.n.e.H[n2].aG = 54302 == n2 ? c : d;
        }
        rs.n.c.v.H[54313].V = 0;
        rs.n.c.v.H[54417].V = 0;
    }

    static {
        e = new f_0[2];
    }
}

