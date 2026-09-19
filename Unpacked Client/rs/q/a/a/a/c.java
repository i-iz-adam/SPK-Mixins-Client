/*
 * Decompiled with CFR 0.152.
 */
package rs.q.a.a.a;

import rs.a.j;
import rs.q.a.a.a;

public class c
extends a {
    @Override
    public void a() {
        int n2;
        j j2;
        int n3 = this.e();
        if (n3 == 1 && (j2 = this.b(n2 = this.g())) != null) {
            j2.h.c().clear();
        }
    }

    private j b(int n2) {
        if (n2 >= 0 && n2 < this.c.cA.length) {
            return this.c.cA[n2];
        }
        return null;
    }
}

