/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class o
extends c {
    public static final int c = 18616;

    public o(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        e e2 = rs.n.c.o.j(18616);
        rs.n.c.o.c(60404, 6, "teleport/SPRITE");
        rs.n.c.o.a(60405, "@or1@Name of Boss", this.a, 0, 16751360, true, true);
        rs.n.c.o.a(60406, "@or1@Bosses", this.a, 1, 16751360, true, true);
        rs.n.c.o.a(60407, "@or1@Description", this.a, 1, 16751360, false, true);
        rs.n.c.o.a(60408, "", this.a, 1, 16751360, true, true);
        rs.n.c.o.a(60409, "@or1@Possible drops and rewards", this.a, 1, 16751360, false, true);
        rs.n.c.o.a(60410, "@or1@Boss Teleportation Network", this.a, 2, 16751360, true, true);
        rs.n.c.o.b(60411, 75, 50);
        rs.n.c.o.a(60412, "Teleport #1", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60413, "Teleport #2", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60414, "Teleport #3", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60415, "Teleport #4", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60416, "Teleport #5", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60417, "Teleport #6", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60418, "Teleport #7", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60419, "Teleport #8", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60420, "Teleport #9", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60421, "Teleport #10", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60422, "Teleport #11", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60423, "Teleport #12", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60424, "Teleport #13", "Select this teleport", this.a, 0, 16750623, true, true, 150);
        rs.n.c.o.a(60448, "teleport/SPRITE", 10, 100, 32, "Teleport to boss", -1, 60449, 1);
        rs.n.c.o.a(60449, "teleport/SPRITE", 11, 100, 32, 60450);
        rs.n.c.o.a(60451, "Teleport <img=149>", this.a, 0, 16751360, true, true);
        e e3 = rs.n.c.o.d(60426);
        e3.aH = 250;
        e3.P = 165;
        e3.aR = 123;
        e3.bj = 87;
        e3.k(17);
        rs.n.c.o.a(60427, "@yel@Information & Stats:", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60428, "Combat level: @whi@100", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60429, "Wilderness level: @whi@Safe", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60430, "Combat zone: @whi@Single", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60431, "", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60432, "@yel@Available achievements:", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60433, "@yel@-@whi@ Placeholder I", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60434, "@yel@-@whi@ Placeholder II", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60435, "@yel@-@whi@ Placeholder III", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60436, "", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60437, "Line 11", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60438, "Line 12", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60439, "Line 13", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60440, "Line 14", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60441, "Line 15", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60442, "Line 16", this.a, 0, 16750623, false, true);
        rs.n.c.o.a(60443, "Line 17", this.a, 0, 16750623, false, true);
        for (int i2 = 0; i2 < 17; ++i2) {
            e3.b(i2, 60427 + i2, 0, 3 + i2 * 13);
        }
        rs.n.c.o.a(60444, "Safe", this.a, 0, 16750623, true, true);
        rs.n.c.o.a(60445, "No", this.a, 0, 16750623, true, true);
        e e4 = rs.n.c.o.d(60446);
        e4.aH = 350;
        e4.P = 326;
        e4.aR = 46;
        e4.bj = 87;
        e4.k(1);
        rs.n.c.o.a(60447, false);
        rs.n.c.o.H[60447].P = 6;
        rs.n.c.o.H[60447].ac = 15;
        rs.n.c.o.H[60447].ap = 10;
        for (n2 = 0; n2 < 12; ++n2) {
            rs.n.c.o.H[60447].az[n2] = 995;
            rs.n.c.o.H[60447].ax[n2] = n2 + 1;
        }
        e4.b(0, 60447, 33, 5);
        rs.n.c.o.a(39873, 4, 0, 39874, 14, "teleport/SPRITE", 85, 13, "View full drop table");
        rs.n.c.o.a(39874, 15, "teleport/SPRITE", 85, 13, 39875);
        rs.n.c.o.a(39876, "@yel@View All", this.a, 0, 0, true, true);
        e2.k(31);
        e2.b(0, 60404, 7, 16);
        e2.b(1, 60405, 321, 54);
        e2.b(2, 60406, 73, 51);
        e2.b(3, 60407, 319, 80);
        e2.b(4, 60408, 281, 183);
        e2.b(5, 60409, 190, 234);
        e2.b(6, 60410, 279, 23);
        e2.b(7, 60411, 180, 136);
        n2 = 75;
        int n3 = -3;
        int n4 = 18;
        e2.b(8, 60412, n3, n2);
        e2.b(9, 60413, n3, n2 + n4 * 1);
        e2.b(10, 60414, n3, n2 + n4 * 2);
        e2.b(11, 60415, n3, n2 + n4 * 3);
        e2.b(12, 60416, n3, n2 + n4 * 4);
        e2.b(13, 60417, n3, n2 + n4 * 5);
        e2.b(14, 60418, n3, n2 + n4 * 6);
        e2.b(15, 60419, n3, n2 + n4 * 7);
        e2.b(16, 60420, n3, n2 + n4 * 8);
        e2.b(17, 60421, n3, n2 + n4 * 9);
        e2.b(18, 60422, n3, n2 + n4 * 10);
        e2.b(19, 60423, n3, n2 + n4 * 11);
        e2.b(20, 60424, n3, n2 + n4 * 12);
        e2.b(21, 60448, 172, 189);
        e2.b(22, 60449, 172, 189);
        e2.b(23, 60451, 222, 199);
        e2.b(24, 60426, 296, 101);
        e2.b(25, 60446, 135, 253);
        e2.b(26, 63740, 483, 22);
        e2.b(27, 63741, 483, 22);
        e2.b(28, 39873, 390, 234);
        e2.b(29, 39874, 390, 234);
        e2.b(30, 39876, 426, 235);
    }
}

