/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.aW
 */
public class aw_0
extends c {
    public aw_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        e e2 = aw_0.d(61011);
        aw_0.h(61012, "misc/hs 5");
        aw_0.a(61013, "World Tournament Leaderboards", this.a, 2, 16750623, true);
        aw_0.a(61014, "<img=14> Top Players", this.a, 2, 16750623, false);
        aw_0.a(61015, "<img=16> Top Clans", this.a, 2, 16750623, false);
        aw_0.a(61016, "This week", "View weekly leaderboard", this.a, 0, 12171349, false, true, 45);
        aw_0.a(61017, "All time", "View all time leaderboard", this.a, 0, 12171349, false, true, 45);
        aw_0.c(61018, 2, "gambling/SPRITE");
        aw_0.c(61019, 1, "gambling/SPRITE");
        aw_0.a(61020, "This week", "View weekly leaderboard", this.a, 0, 12171349, false, true, 45);
        aw_0.a(61021, "All time", "View all time leaderboard", this.a, 0, 12171349, false, true, 45);
        aw_0.c(61022, 2, "gambling/SPRITE");
        aw_0.c(61023, 1, "gambling/SPRITE");
        e e3 = aw_0.d(61024);
        e3.aH = 600;
        e3.P = 220;
        e3.aR = 261;
        e3.bj = 87;
        e3.k(26);
        int n3 = 5;
        for (int i2 = 0; i2 < 26; ++i2) {
            n2 = 61025 + i2;
            if (i2 % 2 == 0) {
                aw_0.a(n2, "", this.a, 0, 16750623, true);
                e3.b(i2, n2, 100, n3);
                n3 += 15;
                continue;
            }
            aw_0.a(n2, "", this.a, 1, 16750623, true);
            e3.b(i2, n2, 100, n3);
            n3 += 30;
        }
        e e4 = aw_0.d(61051);
        e4.aH = 600;
        e4.P = 220;
        e4.aR = 261;
        e4.bj = 87;
        e4.k(26);
        n3 = 5;
        for (n2 = 0; n2 < 26; ++n2) {
            int n4 = 61052 + n2;
            if (n2 % 2 == 0) {
                aw_0.a(n4, "", this.a, 0, 16750623, true);
                e4.b(n2, n4, 100, n3);
                n3 += 15;
                continue;
            }
            aw_0.a(n4, "", this.a, 1, 16750623, true);
            e4.b(n2, n4, 100, n3);
            n3 += 30;
        }
        e2.k(16);
        e2.b(0, 61012, 2, 2);
        e2.b(1, 61013, 251, 9);
        e2.b(2, 61014, 16, 39);
        e2.b(3, 61015, 266, 39);
        e2.b(4, 61016, 138, 42);
        e2.b(5, 61017, 211, 42);
        e2.b(6, 61018, 120, 40);
        e2.b(7, 61019, 193, 40);
        e2.b(8, 61020, 388, 42);
        e2.b(9, 61021, 461, 42);
        e2.b(10, 61022, 370, 40);
        e2.b(11, 61023, 443, 40);
        e2.b(12, 61024, 18, 61);
        e2.b(13, 61051, 268, 61);
        e2.b(14, 63740, 487, 10);
        e2.b(15, 63741, 487, 10);
    }
}

