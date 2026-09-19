/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class n
extends c {
    public n(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        e e2 = rs.n.c.n.d(61150);
        rs.n.c.n.h(61151, "fountain/sprite 22");
        rs.n.c.n.a(61152, "Bloodcore Token Lottery", this.a, 2, 16751360, true, true);
        rs.n.c.n.a(61153, "The lottery's pot is currently..", this.a, 0, 16750623, false);
        rs.n.c.n.a(61154, "@yel@Latest Bloodcore Lottery Winners", this.a, 1, 16750623, true);
        rs.n.c.n.a(61155, "Time until the winner is announced..", this.a, 0, 16750623, true);
        rs.n.c.n.a(61156, "@yel@5 hours 18 mins 48 secs", this.a, 0, 16750623, true);
        rs.n.c.n.a(61157, "@or1@(There are @gre@23@or1@ participants in this lottery)", this.a, 0, 16750623, true);
        rs.n.c.n.a(61158, false);
        rs.n.c.n.H[61158].P = 4;
        rs.n.c.n.H[61158].ac = 11;
        rs.n.c.n.H[61158].az[0] = 22844;
        rs.n.c.n.H[61158].ax[0] = 250;
        rs.n.c.n.a(61159, false);
        rs.n.c.n.H[61159].P = 4;
        rs.n.c.n.H[61159].ac = 11;
        rs.n.c.n.H[61159].az[0] = 22844;
        rs.n.c.n.H[61159].ax[0] = 10000;
        e e3 = rs.n.c.n.d(61160);
        e3.aH = 475;
        e3.P = 350;
        e3.aR = 83;
        e3.bj = 87;
        e3.k(35);
        int n3 = 0;
        for (n2 = 0; n2 < 35; ++n2) {
            if (n3 == 2) {
                rs.n.c.n.a(61161 + n2, "", this.a, 0, 16750623, true);
                n3 = 0;
            } else if (n3 == 0) {
                rs.n.c.n.a(61161 + n2, "", this.a, 0, 16750623, true);
                ++n3;
            } else {
                rs.n.c.n.a(61161 + n2, "", this.a, 0, 16750623, true);
                ++n3;
            }
            e3.b(n2, 61161 + n2, 197, 8 + n2 * 13);
        }
        rs.n.c.n.a(61196, 5, 0, 61197, 1, "fountain/button", 70, 41, "Enter bloodcore lottery");
        rs.n.c.n.a(61197, 2, "fountain/button", 70, 41, 61198);
        rs.n.c.n.h(61199, "fountain/icon 1");
        rs.n.c.n.a(61200, "Enter", this.a, 0, 16751360, true, true);
        e2.k(14);
        e2.b(0, 61151, 55, 36);
        e2.b(1, 61152, 257, 44);
        e2.b(2, 61153, 125, 84);
        e2.b(3, 61154, 263, 118);
        e2.b(4, 61155, 327, 236);
        e2.b(5, 61156, 326, 254);
        e2.b(6, 61157, 326, 276);
        e2.b(7, 61158, 74, 247);
        e2.b(8, 61159, 362, 77);
        e2.b(9, 61160, 64, 136);
        n2 = -238;
        int n4 = 67;
        e2.b(10, 61196, 358 + n2, 174 + n4);
        e2.b(11, 61197, 358 + n2, 174 + n4);
        e2.b(12, 61199, 364 + n2, 184 + n4);
        e2.b(13, 61200, 405 + n2, 189 + n4);
    }
}

