/*
 * Decompiled with CFR 0.152.
 */
package rs.a.b;

import rs.a.b.b;
import rs.a.h;

public class d
extends b {
    private final int a;

    public d(int n2) {
        this.a = n2;
    }

    @Override
    public void a(h h2) {
    }

    @Override
    public void a(h h2, int n2) {
        if (h2.as != null && h2.as[n2]) {
            return;
        }
        h2.ar[n2] = this.a;
    }

    public int a() {
        return this.a;
    }
}

