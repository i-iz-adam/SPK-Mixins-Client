/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class t
extends c {
    public t(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2 = 60;
        int n3 = 25;
        e e2 = rs.n.c.t.d(51318);
        e2.k(3);
        e e3 = rs.n.c.t.d(51319);
        e3.P = 345;
        e3.aR = 230;
        e3.aH = 10000;
        e3.k(600);
        for (int i2 = 51320; i2 < 51920; ++i2) {
            int n4 = i2 - 51320;
            rs.n.c.t.a(i2, "", "Select", this.a, 1, 0, true, false, 200);
            e.H[i2].bo = true;
            e3.b(n4, i2, n2 + 20, n3 - 25 + n4 * 17);
        }
        rs.n.c.t.a(51920, "", this.a, 2, 0, true, false);
        e2.b(0, 8135, n2, n3);
        e2.b(1, 51319, n2 + 5, n3 + 40);
        e2.b(2, 51920, n2 + 185, n3 + 20);
    }
}

