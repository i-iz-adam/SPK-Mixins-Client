/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.d;

import rs.n.a.d;
import rs.n.a.e;
import rs.n.a.f;
import rs.n.c.d.a;
import rs.n.d.c;

public class b {
    public static void a() {
        int n2 = 32487;
        int n3 = 32516;
        String string = "<img=291><tab=150><img=291><tab=225><img=291>";
        for (int i2 = n2; i2 <= n3; ++i2) {
            a.l((int)i2).at = "<img=291><tab=150><img=291><tab=225><img=291>";
        }
    }

    public static void b() {
        int n2 = 32487;
        int n3 = 32516;
        String string = "---<tab=150>--<tab=225>---------";
        for (int i2 = n2; i2 <= n3; ++i2) {
            a.l((int)i2).at = "---<tab=150>--<tab=225>---------";
        }
    }

    public static void a(c c2) {
        c2.a(e.a(32480, "raids/list")).b(32301, 11, 50);
        d d2 = d.a(32481).g(469, 235).m(560);
        d2.a(f.a(32486, "")).a(0, 0);
        int n2 = 32487;
        int n3 = 32516;
        int n4 = 10;
        int n5 = 3;
        for (int i2 = n2; i2 <= n3; ++i2) {
            f.a(i2, "---<tab=150>--<tab=225>---------").a("Join party", 483).l();
            d2.n(i2).a(n4, n5 + (i2 - n2) * 18);
        }
        d2.a();
        c2.a(d2).b(32480, 3, 24);
        c2.a(f.a(32482, "Party<tab=150>Size<tab=225>Raid Type & Difficulty").j().m()).b(32480, n4 + 2, 5);
        c2.a(rs.n.a.a.b(32597, "raids/refresh 1", "Refresh party list").a().a("raids/refresh 2")).b(32301, 483, 53);
        c2.a(rs.n.a.a.b(32595, "raids/close1", "Close interface").b("raids/close2")).b(32301, 493, 3);
    }
}

