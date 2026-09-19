/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b.a.b;

import rs.l.b.a.d;
import rs.l.h;

public class a {
    private static final long a = 5000L;
    private String b;
    private long c;

    public a(String string) {
        this.b = string;
        this.c = System.currentTimeMillis();
    }

    public void a(int n2, int n3) {
        int n4 = h.ap;
        h.ap = (int)(256.0 - 256.0 * (double)((float)this.b() / 5000.0f) * 1.5);
        if (h.ap < 0) {
            h.ap = 0;
        }
        d.b.f.gn.a("@yel@[!] @whi@" + this.b, n2, n3, 16750623, 0, false);
        h.ap = n4;
    }

    public boolean a() {
        return this.b() < 5000L;
    }

    private long b() {
        return System.currentTimeMillis() - this.c;
    }
}

