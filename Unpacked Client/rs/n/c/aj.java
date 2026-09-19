/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class aj
extends c {
    public aj(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        e e2 = rs.n.c.aj.d(64600);
        e e3 = rs.n.c.aj.j(64601);
        int n3 = 24;
        int n4 = 0;
        for (n2 = 64602; n2 <= 64702; ++n2) {
            rs.n.c.aj.a(n2, "", "Select", this.a, 0, 16750623, false, true, 125);
        }
        n2 = 64602;
        e.H[n2++].at = "@yel@<u=16776960>Features / Tools";
        e.H[n2++].at = "<img=321> View collection logs";
        e.H[n2++].at = "<img=321> Collection log milestones";
        e.H[n2++].at = "<img=39> Search drops by monster";
        e.H[n2++].at = "<img=39> Search drops by item";
        e.H[n2++].at = "<img=153> View mail inbox";
        e.H[n2++].at = "";
        e.H[n2++].at = "@yel@<u=16776960>Item Guides";
        e.H[n2++].at = "<img=39> Search item guide";
        e.H[n2++].at = "<img=39> View all item guides";
        e.H[n2++].at = "";
        e.H[n2++].at = "@yel@<u=16776960>Miscellaneous";
        e.H[n2++].at = "<img=16> Donate to us";
        e.H[n2++].at = "<img=14> Vote for us";
        e.H[n2++].at = "<img=40> Forums";
        e.H[n2++].at = "<img=40> Discord";
        rs.n.c.aj.h(64703, "gameframe/sprite 6");
        e3.k(101);
        int n5 = 0;
        for (int i2 = 64602; n5 <= 100 && i2 <= 64702; ++n5, ++i2) {
            e3.b(n5, i2, 2, n5 == 0 ? 5 : e3.bc[n5 - 1] + 15);
        }
        e3.P = 168;
        e3.aR = 225 - n3;
        e3.aH = 1320;
        e2.k(6);
        e2.b(0, 64703, 0, 31 + n3 + n4);
        e2.b(1, 32000, 0, 0);
        e2.b(2, 16022, 0, 28 + n3 + n4);
        e2.b(3, 16022, 0, 255 + n4);
        e2.b(4, 16023, 4, 251 + n4);
        e2.b(5, 64601, 6, 30 + n3 + n4);
    }
}

