/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.aX
 */
public class ax_0
extends c {
    public ax_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = ax_0.d(27400);
        int n2 = 0;
        int n3 = 0;
        ax_0.h(56000, "tournament/sprite 0");
        ax_0.a(56001, "<img=128> SpawnPK World Tournaments <img=128>", this.a, 2, 16750623, true);
        ax_0.a(56002, "Next world tournament: @yel@Dharok PK Tournament", this.a, 2, 16750623, true);
        ax_0.a(56003, "", this.a, 0, 16750623, true);
        ax_0.a(56004, "This tournament's prize will be..", this.a, 0, 16750623, false);
        ax_0.a(56005, "@yel@Previous Tournament Winners", this.a, 1, 16750623, true);
        ax_0.a(56006, "@yel@Tournament point shop", this.a, 1, 16750623, true);
        ax_0.a(56007, false);
        ax_0.H[56007].P = 4;
        ax_0.H[56007].ac = 11;
        ax_0.H[56007].ap = 10;
        ax_0.H[56007].az[0] = 16002;
        ax_0.H[56007].ax[0] = 1;
        e e3 = ax_0.d(56008);
        e3.aH = 475;
        e3.P = 255;
        e3.aR = 112;
        e3.bj = 87;
        e3.k(35);
        int n4 = 0;
        for (int i2 = 0; i2 < 35; ++i2) {
            if (n4 == 2) {
                ax_0.a(56009 + i2, "", this.a, 0, 16750623, true);
                n4 = 0;
            } else if (n4 == 0) {
                ax_0.a(56009 + i2, "Random player won @yel@x1 $10.00 bond", this.a, 0, 16750623, true);
                ++n4;
            } else {
                ax_0.a(56009 + i2, "from @or2@Dharok PK Tournament @yel@" + (i2 + 1) * 6 + " hours ago", this.a, 0, 16750623, true);
                ++n4;
            }
            e3.b(i2, 56009 + i2, 131, 6 + i2 * 13);
        }
        ax_0.a(56044, "tournament/sprite", 2, 130, 32, "Enter tournament", -1, 56045, 1);
        ax_0.a(56045, "tournament/sprite", 1, 130, 32, 56046);
        ax_0.a(56047, "Enter Tournament <img=51>", this.a, 0, 16750623, true);
        ax_0.a(56048, "Receive points for placing\\ntop 5 in a tournament", this.a, 0, 16750623, true);
        ax_0.a(56049, "tournament/sprite", 2, 130, 32, "Spectate tournament", -1, 56050, 1);
        ax_0.a(56050, "tournament/sprite", 1, 130, 32, 56051);
        ax_0.a(56052, "Spectate Tournament", this.a, 0, 16750623, true);
        ax_0.a(56053, "fountain/button", 1, 70, 41, "View tournament shop", -1, 56054, 1);
        ax_0.a(56054, "fountain/button", 2, 70, 41, 56055);
        ax_0.a(56056, "Shop", this.a, 0, 16750623, true);
        ax_0.h(56057, "fountain/coins");
        e2.k(22);
        e2.b(0, 56000, 7 + n2, 15 + n3);
        e2.b(1, 56001, 270 + n2, 19 + n3);
        e2.b(2, 56002, 259 + n2, 54 + n3);
        e2.b(3, 56003, 258 + n2, 88 + n3);
        e2.b(4, 56004, 29 + n2, 135 + n3);
        e2.b(5, 56005, 161 + n2, 170 + n3);
        e2.b(6, 56006, 411 + n2, 169 + n3 + 42);
        e2.b(7, 56007, 267 + n2, 126 + n3);
        e2.b(8, 56008, 30 + n2, 187 + n3);
        e2.b(9, 63740, 483, 19);
        e2.b(10, 63741, 483, 19);
        e2.b(11, 56044, 350, 126);
        e2.b(12, 56045, 350, 126);
        e2.b(13, 56047, 412, 137);
        e2.b(14, 56048, 409, 276);
        e2.b(15, 56049, 350, 168);
        e2.b(16, 56050, 350, 168);
        e2.b(17, 56052, 412, 179);
        e2.b(18, 56053, 375, 233);
        e2.b(19, 56054, 375, 233);
        e2.b(20, 56056, 394, 248);
        e2.b(21, 56057, 411, 239);
    }
}

