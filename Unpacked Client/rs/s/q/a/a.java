/*
 * Decompiled with CFR 0.152.
 */
package rs.s.q.a;

import rs.s.q.a.b;

public class a {
    private b a = new b("N/A");
    private b b = new b("N/A");
    private int c;

    public void a(int n2, b b2) {
        this.c += n2;
        b2.a(n2);
    }

    public boolean a() {
        return this.a.a() > this.b.a();
    }

    public boolean b() {
        return this.a.b() > this.b.b();
    }

    public boolean c() {
        return this.a.k().equalsIgnoreCase("N/A") || this.b.k().equalsIgnoreCase("N/A");
    }

    public b d() {
        return this.a;
    }

    public void a(b b2) {
        this.a = b2;
    }

    public b e() {
        return this.b;
    }

    public void b(b b2) {
        this.b = b2;
    }

    public int f() {
        return this.c;
    }

    public void a(int n2) {
        this.c = n2;
    }
}

