/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.t;

public final class h {
    private final t a;
    private t b;

    public h() {
        this.a.d = this.a = new t();
        this.a.e = this.a;
    }

    public void a(t t2) {
        if (t2.e != null) {
            t2.b();
        }
        t2.e = this.a.e;
        t2.d = this.a;
        t2.e.d = t2;
        t2.d.e = t2;
    }

    public void b(t t2) {
        if (t2.e != null) {
            t2.b();
        }
        t2.e = this.a;
        t2.d = this.a.d;
        t2.e.d = t2;
        t2.d.e = t2;
    }

    public t a() {
        t t2 = this.a.d;
        if (t2 == this.a) {
            return null;
        }
        t2.b();
        return t2;
    }

    public t b() {
        t t2 = this.a.d;
        if (t2 == this.a) {
            this.b = null;
            return null;
        }
        this.b = t2.d;
        return t2;
    }

    public t c() {
        t t2 = this.a.e;
        if (t2 == this.a) {
            this.b = null;
            return null;
        }
        this.b = t2.e;
        return t2;
    }

    public t d() {
        t t2 = this.b;
        if (t2 == this.a) {
            this.b = null;
            return null;
        }
        this.b = t2.d;
        return t2;
    }

    public t e() {
        t t2 = this.b;
        if (t2 == this.a) {
            this.b = null;
            return null;
        }
        this.b = t2.e;
        return t2;
    }

    public void f() {
        if (this.a.d == this.a) {
            return;
        }
        t t2;
        while ((t2 = this.a.d) != this.a) {
            t2.b();
        }
        return;
    }
}

