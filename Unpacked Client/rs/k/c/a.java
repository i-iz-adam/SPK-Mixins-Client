/*
 * Decompiled with CFR 0.152.
 */
package rs.k.c;

import rs.r.c_0;

public class a {
    private static long d = 0L;
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    private final long e = d++;
    private c_0 f = null;
    private int g;
    private float h;
    private float i;
    private byte j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q = 0;
    private int r;
    private int s;
    private int t;

    public a(c_0 c_02, int n2, int n3, int n4, int n5) {
        this.f = c_02;
        this.l = n2;
        this.m = n3;
        this.n = n4;
        this.p = n5;
    }

    public void a() {
        this.g = this.f.l();
        this.h = this.f.j();
        this.i = this.f.c();
        this.r = this.f.n().a() + this.f.a(-1, 1);
        this.s = this.f.n().b() + this.f.a(0, 1);
        this.t = this.f.n().c() + this.f.a(-1, 1);
    }

    public void b() {
        this.q = 0;
        this.k = false;
        this.o = -1;
        this.p = -1;
    }

    public void c() {
        if (this.f == null) {
            this.k = true;
            return;
        }
        ++this.q;
        if (this.q >= this.f.q()) {
            this.k = true;
            return;
        }
        this.g += this.f.t();
        this.h += this.f.r();
        this.i += this.f.e();
        this.l += this.r;
        this.m += this.s;
        this.n += this.t;
        this.r += this.f.s().a();
        this.s += this.f.s().b();
        this.t += this.f.s().c();
        if (this.f.a() != null) {
            this.l += this.f.a().a();
            this.m += this.f.a().b();
            this.n += this.f.a().c();
        }
    }

    public long d() {
        return this.e;
    }

    public void a(c_0 c_02) {
        this.f = c_02;
    }

    public int e() {
        return this.g;
    }

    public void a(int n2) {
        this.g = n2;
    }

    public float f() {
        return this.h;
    }

    public void a(float f2) {
        this.h = f2;
    }

    public float g() {
        return this.i;
    }

    public void b(float f2) {
        this.i = f2;
    }

    public byte h() {
        return this.j;
    }

    public void a(byte by) {
        this.j = by;
    }

    public boolean i() {
        return this.k;
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    public int j() {
        return this.l;
    }

    public int k() {
        return this.m;
    }

    public int l() {
        return this.n;
    }

    public void b(int n2) {
        this.l = n2;
    }

    public void c(int n2) {
        this.m = n2;
    }

    public void d(int n2) {
        this.n = n2;
    }

    public int m() {
        return this.o;
    }

    public void e(int n2) {
        this.o = n2;
    }

    public int n() {
        return this.p;
    }

    public void f(int n2) {
        this.p = n2;
    }
}

