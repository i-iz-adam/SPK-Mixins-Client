/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class at
extends c {
    public static final int c = 25;

    public at(k_0[] k_0Array) {
        super(k_0Array);
    }

    public static void h() {
        int n2 = 25127;
        for (int i2 = 0; i2 < 25; ++i2) {
            ++n2;
            ++n2;
            ++n2;
            int n3 = ++n2;
            rs.n.c.at.c(n3, 0, 32);
            int n4 = ++n2;
            e.H[n4].at = "";
            int n5 = ++n2;
            e.H[n5].at = "";
            int n6 = ++n2;
            ++n2;
            e.H[n6].at = "";
        }
    }

    @Override
    public void a() {
        e e2 = rs.n.c.at.d(24535);
        rs.n.c.at.c(65786, 2, "pos/SPRITE");
        rs.n.c.at.c(65804, 5, "pos/SPRITE");
        rs.n.c.at.a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        rs.n.c.at.a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        rs.n.c.at.a(25341, "@or1@SpawnPK Marketplace Search Results <img=39>", this.a, 2, 16751360, true, true);
        rs.n.c.at.a(24561, "Icon", this.a, 0, 16751360, true, true);
        rs.n.c.at.a(24562, "Name/Quantity", this.a, 0, 16751360, true, true);
        rs.n.c.at.a(24563, "Price (each) <img=23>", "Toggle ascending/descending", this.a, 0, 16751360, true, true, 50);
        rs.n.c.at.a(24564, "Seller", this.a, 0, 16751360, true, true);
        rs.n.c.at.a(65792, "pos/button", 1, 100, 32, "Go back", -1, 65793, 1);
        rs.n.c.at.a(65793, "pos/button", 2, 100, 32, 65794);
        rs.n.c.at.a(65795, "Go back", this.a, 0, 16751360, true, true);
        rs.n.c.at.a(65796, "pos/button", 1, 100, 32, "Select option", -1, 65797, 1);
        rs.n.c.at.a(65797, "pos/button", 2, 100, 32, 65798);
        rs.n.c.at.a(24565, "Modify", this.a, 0, 16751360, true, true);
        rs.n.c.at.a(44000, "Total offers: 0", this.a, 0, 16751360, true, true);
        rs.n.c.at.a(65800, "pos/button", 1, 100, 32, "Select option", -1, 65801, 1);
        rs.n.c.at.a(65801, "pos/button", 2, 100, 32, 65802);
        rs.n.c.at.a(24566, "Refresh", this.a, 0, 16751360, true, true);
        rs.n.c.at.a(48991, "pos/button", 5, 16, 16, "Previous page", -1, 48990, 1);
        rs.n.c.at.a(48990, "pos/button", 6, 16, 16, 48989);
        rs.n.c.at.a(48988, "Last page", "Previous page", this.a, 0, 16751360, false, true, 50);
        rs.n.c.at.a(48987, "pos/button", 7, 16, 16, "Next page", -1, 48986, 1);
        rs.n.c.at.a(48986, "pos/button", 8, 16, 16, 48985);
        rs.n.c.at.a(48984, "Next page", "Next page", this.a, 0, 16751360, false, true, 50);
        e e3 = rs.n.c.at.d(65803);
        e3.P = 461;
        e3.aR = 210;
        e3.aH = 1100;
        int n2 = 25127;
        int n3 = 0;
        e3.k(181);
        for (int i2 = 0; i2 < 25; ++i2) {
            int n4 = 42 * i2;
            rs.n.c.at.c(n2, 3, "pos/SPRITE");
            e3.b(n3++, n2++, 1, 37 + n4);
            rs.n.c.at.a(n2, "pos/button", 0, 476, 37, "Select this market listing", -1, n2 + 1, 1);
            e3.b(n3++, n2++, 0, 1 + n4);
            rs.n.c.at.a(n2, "pos/sprite", 4, 476, 37, n2 + 1);
            e3.b(n3++, n2++, 0, 1 + n4);
            rs.n.c.at.c(++n2, 0, 32);
            e3.b(n3++, n2++, 5, 3 + n4);
            rs.n.c.at.a(n2, "", this.a, 0, 16751360, true, true);
            e3.b(n3++, n2++, 113, 14 + n4);
            rs.n.c.at.a(n2, "", this.a, 0, 1048575, true, true);
            e3.b(n3++, n2++, 270, 14 + n4);
            rs.n.c.at.a(n2, "", this.a, 0, 0xFFFFFF, true, true);
            e3.b(n3++, n2++, 415, 14 + n4);
        }
        e3.b(n3++, 48991, 10, 1061);
        e3.b(n3++, 48990, 10, 1061);
        e3.b(n3++, 48988, 31, 1064);
        e3.b(n3++, 48987, 435, 1061);
        e3.b(n3++, 48986, 435, 1061);
        e3.b(n3++, 48984, 378, 1063);
        e2.k(20);
        e2.b(0, 65786, 12, 7);
        e2.b(1, 65803, 17, 67);
        e2.b(2, 65804, 12, 7);
        e2.b(3, 65418, 475, 15);
        e2.b(4, 65419, 475, 15);
        e2.b(5, 25341, 256, 15);
        e2.b(6, 24561, 37, 46);
        e2.b(7, 24562, 132, 46);
        e2.b(8, 24563, 267, 46);
        e2.b(9, 24564, 433, 46);
        e2.b(10, 65792, 24, 282);
        e2.b(11, 65793, 24, 282);
        e2.b(12, 65795, 73, 292);
        e2.b(13, 65796, 387, 282);
        e2.b(14, 65797, 387, 282);
        e2.b(15, 24565, 438, 292);
        e2.b(16, 65800, 277, 282);
        e2.b(17, 65801, 277, 282);
        e2.b(18, 24566, 328, 292);
        e2.b(19, 44000, 200, 293);
    }
}

