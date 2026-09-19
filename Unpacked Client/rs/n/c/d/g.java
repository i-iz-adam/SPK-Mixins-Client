/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.d;

import rs.l.c;
import rs.l.f.b.d;
import rs.n.e;

public class g
extends d {
    private final int h;
    private final int i;

    @Override
    public void a() {
        boolean bl = false;
        e e2 = rs.n.e.l(this.h);
        int n2 = e2.bC - e2.V + 1;
        int n3 = e2.P + e2.P / 3;
        for (int i2 = 0; i2 < this.i; ++i2) {
            int n4 = bl ? 4274480 : 3814187;
            rs.l.c.c(n4, n2, n3, 128, 255, this.e);
            bl = !bl;
            n2 += 18;
        }
    }

    public g(int n2, int n3) {
        this.h = n2;
        this.i = n3;
    }
}

