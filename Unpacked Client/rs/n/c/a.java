/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class a
extends c {
    public a(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        int n3;
        int n4;
        e e2 = rs.n.c.a.d(64272);
        rs.n.c.a.c(64273, 0, "achievements/SPRITE");
        rs.n.c.a.a(64271, "@or1@Completed (0/100)", this.a, 2, 16751360, true, true);
        rs.n.c.a.a(64274, "@or1@SpawnPK Achievement Diary", this.a, 2, 16751360, true, true);
        rs.n.c.a.a(64275, 3, 0, 64276, 1, "achievements/SPRITE", 17, 17, "Close Window");
        rs.n.c.a.a(64276, 2, "achievements/SPRITE", 17, 17, 64277);
        rs.n.c.a.a(43509, "achievements/SPRITE", 7, 17, 17, "Collect all rewards", -1, 43510, 1);
        rs.n.c.a.a(43510, "achievements/SPRITE", 8, 17, 17, 43511);
        rs.n.c.a.a(64278, "@or2@Title of the achievement", this.a, 2, 16751360, false, true);
        rs.n.c.a.a(64279, "@whi@Progress: @gre@0% (0/1)", this.a, 2, 16751360, false, true);
        int n5 = 4;
        for (n4 = 0; n4 < n5; ++n4) {
            rs.n.c.a.a(64280 + n4, "Description " + (n4 + 1), this.a, 0, 0xFFFFFF, false, false);
        }
        n4 = 64280 + n5;
        rs.n.c.a.a(n4, "@or2@Bonuses you'll receive..", this.a, 0, 16751360, false, true);
        rs.n.c.a.a(n4 + 1, "@or2@Items you'll receive..", this.a, 0, 16751360, false, true);
        e e3 = rs.n.c.a.d(n4 + 2);
        rs.n.c.a.a(n4 + 3, "None!", this.a, 0, 0xFFFFFF, false, false);
        rs.n.c.a.a(n4 + 4, "", this.a, 0, 0xFFFFFF, false, false);
        rs.n.c.a.a(n4 + 5, "", this.a, 0, 0xFFFFFF, false, false);
        rs.n.c.a.a(n4 + 6, "", this.a, 0, 0xFFFFFF, false, false);
        int n6 = 5;
        int n7 = 5;
        int n8 = 15;
        e3.al = new int[4];
        e3.am = new int[4];
        e3.bc = new int[4];
        for (int i2 = 0; i2 < 4; ++i2) {
            e3.b(i2, n4 + 3 + i2, n6, n7 + n8 * i2);
        }
        e3 = rs.n.c.a.d(n4 + 7);
        e3.al = new int[1];
        e3.am = new int[1];
        e3.bc = new int[1];
        rs.n.c.a.a(n4 + 8, false);
        rs.n.c.a.H[n4 + 8].P = 2;
        rs.n.c.a.H[n4 + 8].ac = 15;
        rs.n.c.a.H[n4 + 8].ap = 10;
        rs.n.c.a.H[n4 + 8].az[0] = 996;
        rs.n.c.a.H[n4 + 8].ax[0] = 1337;
        rs.n.c.a.H[n4 + 8].az[1] = 538;
        rs.n.c.a.H[n4 + 8].ax[1] = 69;
        rs.n.c.a.H[n4 + 8].az[2] = 538;
        rs.n.c.a.H[n4 + 8].ax[2] = 69;
        rs.n.c.a.H[n4 + 8].az[3] = 538;
        rs.n.c.a.H[n4 + 8].ax[3] = 69;
        e3.b(0, n4 + 8, 11, 5);
        e3.aH = 200;
        e3.P = 109;
        e3.aR = 78;
        e3.bj = 87;
        e e4 = rs.n.c.a.d(n4 + 9);
        int n9 = 100;
        e4.aH = 1505;
        e4.P = 134;
        e4.aR = 248;
        e4.bj = 87;
        e4.al = new int[n9];
        e4.am = new int[n9];
        e4.bc = new int[n9];
        for (n3 = 0; n3 < n9; ++n3) {
            rs.n.c.a.a(n4 + 10 + n3, "", "Select achievement", this.a, 0, 16723715, false, false, 125);
            e4.b(n3, n4 + 10 + n3, 5, 5 + n3 * 15);
        }
        n3 = 64500;
        rs.n.c.a.a(n3 + 1, 4, 0, n3 + 2, 3, "achievements/SPRITE", 35, 25, "Collect reward");
        rs.n.c.a.a(n3 + 2, 4, "achievements/SPRITE", 35, 25, n3 + 3);
        int n10 = 16 + n5;
        e2.al = new int[n10];
        e2.am = new int[n10];
        e2.bc = new int[n10];
        e2.b(0, 64273, 5, 20);
        e2.b(1, 64274, 333, 31);
        e2.b(2, 64275, 475, 31);
        e2.b(3, 64276, 475, 31);
        e2.b(4, 64278, 224, 77);
        e2.b(5, 64279, 186, 104);
        for (n2 = 0; n2 < n5; ++n2) {
            e2.b(6 + n2, 64280 + n2, 186, 124 + n2 * 15);
        }
        n2 = 6 + n5;
        e2.b(n2++, n4, 182, 204);
        e2.b(n2++, n4 + 1, 354, 204);
        e2.b(n2++, n4 + 2, 178, 218);
        e2.b(n2++, n4 + 7, 354, 218);
        e2.b(n2++, n4 + 9, 11, 57);
        e2.b(n2++, n3 + 1, 183, 71);
        e2.b(n2++, n3 + 2, 183, 71);
        e2.b(n2++, 64271, 84, 31);
        e2.b(n2++, 43509, 455, 31);
        e2.b(n2++, 43510, 455, 31);
    }
}

