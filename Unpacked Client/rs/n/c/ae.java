/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.ArrayList;
import java.util.List;
import rs.d.k;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class ae
extends c {
    public static List<Integer[]> c = new ArrayList<Integer[]>();
    public static int d = 22952;
    public static int e = 79938;
    public static int f = 59902;

    public ae(k_0[] k_0Array) {
        super(k_0Array);
    }

    public static void a(List<Integer[]> list) {
        c = new ArrayList<Integer[]>(list);
    }

    public static void a(Integer[] integerArray) {
        c.add(integerArray);
    }

    public static void h() {
        e e2 = rs.n.e.H[59901];
        rs.n.c.ae.a(f, false);
        int n2 = c.size() + 1;
        int n3 = 3;
        while (n2 % n3 != 0) {
            ++n2;
        }
        rs.n.e.H[rs.n.c.ae.f].az = new int[500];
        rs.n.e.H[rs.n.c.ae.f].ax = new int[500];
        rs.n.e.H[rs.n.c.ae.f].P = n3;
        rs.n.e.H[rs.n.c.ae.f].aR = 10;
        rs.n.e.H[rs.n.c.ae.f].ac = 11;
        rs.n.e.H[rs.n.c.ae.f].ap = 10;
        int n4 = 0;
        int n5 = 0;
        int n6 = e;
        int n7 = 2;
        int n8 = 3;
        e2.k(c.size() + 1);
        for (int i2 = 0; i2 < c.size(); ++i2) {
            int n9 = c.get(i2)[0];
            int n10 = c.get(i2)[1];
            String string = "Select item " + rs.d.k.f((int)n9).w;
            rs.n.e.H[rs.n.c.ae.f].az[n5] = n9 + 1;
            rs.n.e.H[rs.n.c.ae.f].ax[n5] = n10;
            ++n5;
            int n11 = n6++;
            e e3 = rs.n.c.ae.H[n11] = new e();
            e3.aw = n11;
            e3.ah = n11;
            e3.aI = 5;
            e3.M = 1;
            e3.J = 0;
            e3.aC = 0;
            e3.ab = 52;
            e3.E = new f_0("vote/sprite " + (i2 == 0 ? 2 : 1));
            e3.aG = new f_0("vote/sprite " + (i2 == 0 ? 2 : 1));
            e3.P = e3.E.n;
            e3.aR = e3.aG.o;
            e3.Q = string;
            e2.b(n4++, n11, n7, n8);
            if (n7 >= 82) {
                n7 = 2;
                n8 += 41;
                continue;
            }
            n7 += 42;
        }
        e2.b(n4++, f, 4, 5);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.ae.d(d);
        rs.n.c.ae.c(59900, 0, "vote/sprite");
        rs.n.c.ae.a(59990, "vote/SPRITE", 3, 100, 32, "Teleport to boss", -1, 59991, 1);
        rs.n.c.ae.a(59991, "vote/SPRITE", 4, 100, 32, 59992);
        rs.n.c.ae.a(59993, "Purchase", this.a, 0, 16751360, true, true);
        rs.n.c.ae.a(59994, "Item Sale Listings", this.a, 1, 16750623, true, true);
        rs.n.c.ae.a(59995, "Item Title", this.a, 1, 16750623, true, true);
        rs.n.c.ae.a(22953, "@whi@Price: @gre@500 VP", this.a, 0, 16750623, true, true);
        rs.n.c.ae.a(22954, "Description Line", this.a, 0, 16750623, true, true);
        rs.n.c.ae.a(22955, "Description Line", this.a, 0, 16750623, true, true);
        rs.n.c.ae.a(22956, "Description Line", this.a, 0, 16750623, true, true);
        rs.n.c.ae.a(22957, "Description Line", this.a, 0, 16750623, true, true);
        int n2 = 6;
        e e3 = rs.n.e.d(59901);
        e3.aH = 350;
        e3.P = 127;
        e3.aR = 182;
        e3.bj = 87;
        e3.k(n2 * 2);
        rs.n.c.ae.h();
        e2.k(14);
        e2.b(0, 59900, 85, 33);
        e2.b(1, 59994, 174, 54);
        e2.b(2, 59995, 358, 110);
        e2.b(3, 59901, 104, 76);
        e2.b(4, 59990, 307, 208);
        e2.b(5, 59991, 307, 208);
        e2.b(6, 59993, 358, 214);
        int n3 = 12;
        e2.b(7, 22953, 356, 124 + n3);
        e2.b(8, 22954, 356, 139 + n3);
        e2.b(9, 22955, 356, 151 + n3);
        e2.b(10, 22956, 356, 163 + n3);
        e2.b(11, 22957, 356, 175 + n3);
        e2.b(12, 65418, 431, 86);
        e2.b(13, 65419, 431, 86);
    }
}

