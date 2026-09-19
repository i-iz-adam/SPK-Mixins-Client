/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class az
extends c {
    public az(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        int n3;
        e e2 = rs.n.c.az.d(38975);
        rs.n.c.az.c(47000, 0, "drops/sprite");
        rs.n.c.az.a(47001, "@or1@Monster item drop search", this.a, 2, 16751360, true, true);
        rs.n.c.az.a(47002, "drops/button", 1, 100, 32, "Search by item", -1, 47003, 1);
        rs.n.c.az.a(47003, "drops/button", 2, 100, 25, 25350);
        rs.n.c.az.a(47004, "Search item", this.a, 0, 16751360, false, true);
        rs.n.c.az.c(47005, 0, "drops/icon");
        rs.n.c.az.a(47006, "drops/button", 1, 100, 32, "Search by monster", -1, 47007, 1);
        rs.n.c.az.a(47007, "drops/button", 2, 100, 25, 25350);
        rs.n.c.az.a(47008, "Search npc", this.a, 0, 16751360, false, true);
        rs.n.c.az.c(47009, 0, "drops/icon");
        e e3 = rs.n.c.az.d(47010);
        e3.P = 93;
        e3.aR = 191;
        e3.aH = 1500;
        e3.k(100);
        int n4 = 47011;
        for (int i2 = 0; i2 < 100; ++i2) {
            rs.n.c.az.a(n4 + i2, "", "Select this monster", this.a, 0, 16750623, false, true, 115);
            e3.b(i2, n4 + i2, 1, 3 + i2 * 15);
        }
        rs.n.c.az.a(47111, "@or1@Item", this.a, 2, 16751360, true, true);
        rs.n.c.az.a(47112, "@or1@Quantity", this.a, 2, 16751360, true, true);
        rs.n.c.az.a(47113, "@or1@Rarity", this.a, 2, 16751360, true, true);
        e e4 = rs.n.c.az.d(47114);
        e4.P = 342;
        e4.aR = 233;
        e4.aH = 1500;
        e4.k(215);
        int n5 = 0;
        n4 = 47115;
        int n6 = 1;
        for (n3 = 0; n3 < 43; ++n3) {
            n2 = n3 * 35 - 5;
            rs.n.c.az.c(n4++, n6, "drops/sprite");
            e4.b(n5++, n4 - 1, 0, n2);
            rs.n.c.az.c(n4++, 0, 27);
            e4.b(n5++, n4 - 1, 3, n2 + 3);
            rs.n.c.az.a(n4++, "", this.a, 0, 0xFFFFFF, true);
            e4.b(n5++, n4 - 1, 92, n2 + 13);
            rs.n.c.az.a(n4++, "", this.a, 0, 0xFFFFFF, true);
            e4.b(n5++, n4 - 1, 190, n2 + 13);
            rs.n.c.az.a(n4++, "", this.a, 0, 0xFFFFFF, true);
            e4.b(n5++, n4 - 1, 290, n2 + 13);
            n6 = n6 == 1 ? 2 : 1;
        }
        rs.n.c.az.a(47330, "drops/sprite", 3, 17, 17, "Go back", -1, 47331, 1);
        rs.n.c.az.a(47331, "drops/sprite", 4, 17, 17, 47332);
        rs.n.c.az.a(47333, "@yel@Note:@whi@ Boosted rate display does NOT include dynamic boosts (monster specific boosts, etc.)", this.a, 0, 16751360, true, true);
        e2.k(20);
        n3 = 0;
        n2 = 10;
        e2.b(0, 47000, 6, 17 - n2);
        e2.b(1, 47001, 270, 24 - n2);
        e2.b(2, 64275, 482, 24 - n2);
        e2.b(3, 64276, 482, 24 - n2);
        e2.b(4, 47002, 23, 50 - n2);
        e2.b(5, 47003, 23, 50 - n2);
        e2.b(6, 47004, 51, 61 - n2);
        e2.b(7, 47005, 29, 57 - n2);
        int n7 = 27;
        e2.b(8, 47006, 23, 50 + n7 - n2);
        e2.b(9, 47007, 23, 50 + n7 - n2);
        e2.b(10, 47008, 51, 61 + n7 - n2);
        e2.b(11, 47009, 29, 57 + n7 - n2);
        e2.b(12, 47010, 19, 114 - n2);
        e2.b(13, 47111, 216, 53 - n2);
        e2.b(14, 47112, 331, 53 - n2);
        e2.b(15, 47113, 433, 53 - n2);
        e2.b(16, 47114, 140, 76 - n2);
        e2.b(17, 47330, 13, 24 - n2);
        e2.b(18, 47331, 13, 24 - n2);
        e2.b(19, 47333, 254, 316 - n2);
    }
}

