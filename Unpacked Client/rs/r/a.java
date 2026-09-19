/*
 * Decompiled with CFR 0.152.
 */
package rs.r;

import rs.r.c_0;

public class a {
    private static long a = 0L;
    private c_0 b = null;
    private int c = 0;
    private int d;
    private float e;
    private float f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n = false;
    private long o = a++;

    public a(c_0 c_02, int n2, int n3, int n4, int n5) {
        this.b = c_02;
        this.g = n2;
        this.h = n3;
        this.i = n4;
        this.j = n5;
        this.a();
    }

    public void a() {
        this.d = this.b.l();
        this.e = this.b.j();
        this.f = this.b.c();
        this.k = this.b.n().a() + this.b.a(-1, 1);
        this.l = this.b.n().b() + this.b.a(0, 1);
        this.m = this.b.n().c() + this.b.a(-1, 1);
    }

    public void b() {
        this.c = 0;
        this.n = false;
    }

    public void c() {
        if (this.b == null) {
            this.n = true;
            return;
        }
        ++this.c;
        if (this.c >= this.b.q()) {
            this.n = true;
            return;
        }
        this.d += this.b.t();
        this.e += this.b.r();
        this.f += this.b.e();
        this.h += this.k;
        this.i += this.l;
        this.j += this.m;
        this.k += this.b.s().a();
        this.l += this.b.s().b();
        this.m += this.b.s().c();
        if (this.b.a() != null) {
            this.h += this.b.a().a();
            this.i += this.b.a().b();
            this.j += this.b.a().c();
        }
    }

    public c_0 d() {
        return this.b;
    }

    public void a(c_0 c_02) {
        this.b = c_02;
    }

    public float e() {
        return this.f;
    }

    public void a(float f2) {
        this.f = f2;
    }

    public boolean f() {
        return this.n;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.g;
    }

    public void a(int n2) {
        this.g = n2;
    }

    public void b(int n2) {
        this.c = n2;
    }

    public int i() {
        return this.d;
    }

    public void c(int n2) {
        this.d = n2;
    }

    public float j() {
        return this.e;
    }

    public void b(float f2) {
        this.e = f2;
    }

    public int k() {
        return this.h;
    }

    public int l() {
        return this.i;
    }

    public int m() {
        return this.j;
    }

    public void d(int n2) {
        this.h = n2;
    }

    public void e(int n2) {
        this.i = n2;
    }

    public void f(int n2) {
        this.j = n2;
    }

    public long n() {
        return this.o;
    }

    public void a(boolean bl) {
        this.n = bl;
    }
}

