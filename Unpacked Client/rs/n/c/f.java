/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class f
extends c {
    public static boolean c = false;

    public f(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        f.a(35113, "<u>Player attack options", this.a, 1, 0, true, false);
        f.a(35114, "<u>NPC/Bot attack options", this.a, 1, 0, true, false);
        f.c(35115, 1, "gambling/SPRITE");
        f.a(35116, "<tab=20><img=14> Always right-click clan members", "Select option", this.a, 0, 0, false, false, 150);
        e e2 = f.d(35112);
        e2.k(13);
        int n2 = 15;
        int n3 = 125;
        int n4 = 25;
        int n5 = n2 + 50;
        e2.b(0, 35115, n3 + 100, 53 + n2);
        e2.b(1, 35116, n3 + 100, 55 + n2);
        e2.b(2, 35109, n3 - 55, n2 + 20);
        e2.b(3, 35108, n3 + 10, n2 + 5 + 20);
        e2.b(4, 35114, n3 + 16, 1 + n2);
        e2.b(5, 35102, n3 + n4 - 5, n5);
        e2.b(6, 35107, n3 + n4 - 57 - 5, n5 + 4);
        n5 = n2;
        e2.b(7, 35098, (n3 += 180) - 55, n2 + 20);
        e2.b(8, 35097, n3 + 10, n2 + 5 + 20);
        e2.b(9, 35113, n3 + 15, 1 + n2);
        e2.b(10, 35091, n3 + n4 - 5, n5);
        e2.b(11, 35096, n3 + n4 - 57 - 5, n5 + 4);
        e2.b(12, 54195, 400, 1);
        e.H[35112].b(5, 35102, -600, -600);
        e.H[35112].b(6, 35107, -600, -600);
        e.H[35112].b(10, 35091, -600, -600);
        e.H[35112].b(11, 35096, -600, -600);
    }
}

