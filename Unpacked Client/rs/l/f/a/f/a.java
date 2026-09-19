/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.f;

import rs.Client;
import rs.l.c;
import rs.l.f.a.f.b;

public class a {
    private static long a = 0L;
    private static long b = 3000L;
    private long c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h = 1;
    private b i = rs.l.f.a.f.b.a;
    private int j = 0xFF0000;
    private int k = 10;
    private int l = 10;
    private long m;
    private long n;
    private double o;
    private double p;
    private int q = 255;
    private int r;

    public a(int n2, int n3, int n4) {
        this.j = n4;
        this.c = a++;
        this.p = 1.0;
        this.n = 250 + 250 * Client.d(3);
        this.a(n2, n3);
    }

    public void a() {
        int n2 = (int)((double)this.q * this.f());
        int n3 = this.q - n2;
        if (n3 > 255) {
            n3 = 255;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        rs.l.c.a(this.d, this.e, this.k, this.l, this.j, n3);
    }

    public void b() {
        ++this.r;
        this.d = this.i == rs.l.f.a.f.b.a ? (this.d += this.h) : (this.d -= this.h);
        double d2 = 5.0;
        int n2 = (int)((double)this.r / d2 * Math.log((double)this.r / d2 * this.o) + this.o) / 2;
        this.e = (int)((double)this.e + this.p * (double)n2);
    }

    public void a(int n2, int n3) {
        this.r = 0;
        this.f = this.d = n2;
        this.g = this.e = n3;
        this.m = System.currentTimeMillis();
        this.o = 1 + Client.d(25);
    }

    public void b(int n2, int n3) {
        this.k = n2;
        this.l = n3;
    }

    public boolean c() {
        return this.d() < this.n;
    }

    public long d() {
        return System.currentTimeMillis() - this.m;
    }

    public long e() {
        return System.currentTimeMillis() - (this.m + this.n);
    }

    public double f() {
        return (double)this.d() / (double)this.n;
    }

    public long g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return this.e;
    }

    public void a(int n2) {
        this.d = n2;
    }

    public void b(int n2) {
        this.e = n2;
    }

    public int j() {
        return this.f;
    }

    public int k() {
        return this.g;
    }

    public void c(int n2) {
        this.f = n2;
    }

    public void d(int n2) {
        this.g = n2;
    }

    public int l() {
        return this.h;
    }

    public void e(int n2) {
        this.h = n2;
    }

    public b m() {
        return this.i;
    }

    public void a(b b2) {
        this.i = b2;
    }

    public int n() {
        return this.j;
    }

    public void f(int n2) {
        this.j = n2;
    }

    public int o() {
        return this.k;
    }

    public int p() {
        return this.l;
    }

    public void g(int n2) {
        this.k = n2;
    }

    public void h(int n2) {
        this.l = n2;
    }

    public long q() {
        return this.m;
    }

    public void a(long l2) {
        this.m = l2;
    }

    public long r() {
        return this.n;
    }

    public void b(long l2) {
        this.n = l2;
    }

    public double s() {
        return this.o;
    }

    public void a(double d2) {
        this.o = d2;
    }

    public double t() {
        return this.p;
    }

    public void b(double d2) {
        this.p = d2;
    }

    public void i(int n2) {
        this.q = n2;
    }
}

