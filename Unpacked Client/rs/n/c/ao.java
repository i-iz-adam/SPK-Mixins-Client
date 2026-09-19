/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class ao
extends c {
    public ao(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        e e2 = rs.n.c.ao.d(52000);
        rs.n.c.ao.a(51999, "<img=291>", this.a, 0, 16750623, true);
        rs.n.c.ao.a(52001, "Lottery title", this.a, 2, 16751360, true, true);
        rs.n.c.ao.a(52002, "@yel@The winning pot is currently..", this.a, 0, 16750623, false);
        rs.n.c.ao.a(52003, "Latest Raffle Winners", this.a, 1, 16750623, true);
        rs.n.c.ao.a(52004, "Time until the winner is announced..", this.a, 1, 16750623, true);
        rs.n.c.ao.a(52005, "@yel@5 hours 18 mins 48 secs", this.a, 0, 16750623, true);
        rs.n.c.ao.a(52006, "@or1@(There are @gre@23@or1@ participants in this lottery)", this.a, 0, 16750623, true);
        rs.n.c.ao.a(52007, false);
        rs.n.c.ao.H[52007].P = 4;
        rs.n.c.ao.H[52007].ac = 11;
        rs.n.c.ao.a(52008, false);
        rs.n.c.ao.H[52008].P = 4;
        rs.n.c.ao.H[52008].ac = 11;
        e e3 = rs.n.c.ao.d(52009);
        e3.aH = 50;
        e3.P = 350;
        e3.aR = 83;
        e3.bj = 87;
        e3.k(6);
        int n3 = 0;
        for (n2 = 0; n2 < 6; ++n2) {
            if (n3 == 2) {
                rs.n.c.ao.a(52014 + n2, "", this.a, 0, 16750623, true);
                n3 = 0;
            } else if (n3 == 0) {
                rs.n.c.ao.a(52014 + n2, "", this.a, 0, 16750623, true);
                ++n3;
            } else {
                rs.n.c.ao.a(52014 + n2, "", this.a, 0, 16750623, true);
                ++n3;
            }
            e3.b(n2, 52014 + n2, 197, 4 + n2 * 13);
        }
        rs.n.c.ao.a(52010, 5, 0, 52011, 1, "fountain/button", 70, 41, "Enter lottery");
        rs.n.c.ao.a(52011, 2, "fountain/button", 70, 41, 61198);
        rs.n.c.ao.h(52012, "fountain/icon 1");
        rs.n.c.ao.a(52013, "Buy-\\nentry", this.a, 0, 16751360, true, true);
        e2.k(17);
        e2.b(0, 61151, 55, 36);
        e2.b(1, 52001, 257, 44);
        e2.b(2, 52002, 125, 84);
        e2.b(3, 52003, 263, 118);
        e2.b(4, 52004, 327, 236);
        e2.b(5, 52005, 326, 256);
        e2.b(6, 52006, 326, 276);
        e2.b(7, 52007, 74, 247);
        e2.b(8, 52008, 362, 77);
        e2.b(9, 52009, 64, 136);
        n2 = -238;
        int n4 = 67;
        e2.b(10, 52010, 358 + n2, 174 + n4);
        e2.b(11, 52011, 358 + n2, 174 + n4);
        e2.b(12, 52012, 364 + n2, 184 + n4);
        e2.b(13, 52013, 405 + n2, 189 + n4 - 5);
        e2.b(14, 63740, 433, 44);
        e2.b(15, 63741, 433, 44);
        e2.b(16, 51999, 379, 85);
    }
}

