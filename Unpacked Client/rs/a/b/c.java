/*
 * Decompiled with CFR 0.152.
 */
package rs.a.b;

import rs.a.b.a;
import rs.a.b.d;
import rs.a.b.e;
import rs.a.h;

public class c {
    private d a;
    private e b;
    private a c;
    private int d = Integer.MAX_VALUE;

    public c(c c2) {
        this.a(c2.f());
        this.a(c2.g());
        this.a(c2.h());
        this.a(c2.i());
    }

    public c() {
    }

    public void a(h h2) {
        int n2;
        if (this.b()) {
            this.c.a(h2);
        }
        if (this.d()) {
            this.a.a(h2);
        }
        if (this.e() && h2.aq == null) {
            h2.aq = new int[h2.ah];
        }
        for (n2 = 0; n2 < h2.ah; ++n2) {
            if (this.b()) {
                this.c.a(h2, n2);
            }
            if (this.d()) {
                this.a.a(h2, n2);
            }
            if (!this.e()) continue;
            h2.aq[n2] = 100 - this.d;
        }
        if (this.c()) {
            this.b.a(h2);
            for (n2 = 0; n2 < h2.ah; ++n2) {
                this.b.a(h2, n2);
            }
        }
    }

    public e a() {
        if (this.b == null) {
            this.b = new e();
        }
        return this.b;
    }

    public boolean b() {
        return this.c != null;
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean d() {
        return this.a != null;
    }

    public boolean e() {
        return this.d != Integer.MAX_VALUE;
    }

    public d f() {
        return this.a;
    }

    public void a(d d2) {
        this.a = d2;
    }

    public e g() {
        return this.b;
    }

    public void a(e e2) {
        this.b = e2;
    }

    public a h() {
        return this.c;
    }

    public void a(a a2) {
        this.c = a2;
    }

    public int i() {
        return this.d;
    }

    public void a(int n2) {
        this.d = n2;
    }
}

