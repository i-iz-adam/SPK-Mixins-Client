/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.e.a.k
 */
package rs.k.c;

import gnu.trove.e.a.k;
import rs.k.c.a;
import rs.k.c.c;

public class d {
    private static final int a = 1000;
    private final k b = new k(1000);
    private final k c = new k(1000);
    private long d;
    private int e;

    public static d a() {
        return new d();
    }

    public boolean b() {
        this.d = System.currentTimeMillis();
        return this.b.size() < 1000;
    }

    public boolean a(a a2) {
        this.d = System.currentTimeMillis();
        this.b.b(a2.d());
        return true;
    }

    public void c() {
        int n2;
        this.c.clear();
        for (n2 = 0; n2 < this.b.size(); ++n2) {
            long l2 = this.b.a(n2);
            a a2 = rs.k.c.c.a(l2);
            if (a2 == null) {
                this.c.b(l2);
                continue;
            }
            if (a2.m() != this.e) {
                this.c.b(l2);
                continue;
            }
            if (!a2.i() && rs.k.c.c.b(a2)) continue;
            this.c.b(l2);
        }
        for (n2 = 0; n2 < this.c.size(); ++n2) {
            this.b.c(this.c.a(n2));
        }
    }

    public void d() {
        this.c.clear();
        this.b.clear();
        this.e = -1;
    }

    public a a(int n2) {
        return rs.k.c.c.a(this.b.a(n2));
    }

    public int e() {
        return this.b.size();
    }

    public long f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public void b(int n2) {
        this.e = n2;
    }
}

