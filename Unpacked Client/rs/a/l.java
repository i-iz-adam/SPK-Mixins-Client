/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import rs.a.a;
import rs.a.h;
import rs.d.x;
import rs.k;

public final class l
extends a {
    public final int h;
    public final int i;
    private double q;
    private double r;
    private double s;
    private double t;
    private double u;
    private boolean v = false;
    private final int w;
    private final int x;
    private final int y;
    public final int j;
    public double k;
    public double l;
    public double m;
    private final int z;
    private final int A;
    public final int n;
    private final x B;
    private int C;
    private int D;
    public int o;
    private int E;
    public final int p;

    public void a(int n2, int n3, int n4, int n5) {
        double d2;
        if (!this.v) {
            d2 = n5 - this.w;
            double d3 = n3 - this.x;
            double d4 = Math.sqrt(d2 * d2 + d3 * d3);
            this.k = (double)this.w + d2 * (double)this.A / d4;
            this.l = (double)this.x + d3 * (double)this.A / d4;
            this.m = this.y;
        }
        d2 = this.i + 1 - n2;
        this.q = ((double)n5 - this.k) / d2;
        this.r = ((double)n3 - this.l) / d2;
        this.s = Math.sqrt(this.q * this.q + this.r * this.r);
        if (!this.v) {
            this.t = -this.s * Math.tan((double)this.z * 0.02454369);
        }
        this.u = 2.0 * ((double)n4 - this.m - this.t * d2) / (d2 * d2);
    }

    @Override
    public h c() {
        h h2 = this.B.a();
        if (h2 == null) {
            return null;
        }
        int n2 = -1;
        if (this.B.g != null) {
            n2 = this.B.g.e != null && this.B.g.e.length > 0 ? this.B.g.e[this.C] : this.D;
        }
        boolean bl = false;
        rs.a.a.a a2 = rs.a.h.h;
        h h3 = null;
        if (n2 != -1) {
            if (this.B.g.b()) {
                h3 = this.B.g.a(h2, n2);
            } else {
                a2 = (rs.a.a.a)rs.d.x.q.a(this.B.d);
                if (a2 == null) {
                    a2 = new rs.a.a.a(true);
                    bl = true;
                    a2.e();
                }
                h3 = new h(true, rs.k.g(n2), false, h2);
                h3.i = a2;
                h3.n();
                h3.f(n2, this.B.g.r);
            }
            h3.aM = null;
            h3.aL = null;
        } else {
            h3 = new h(true, rs.k.g(n2), false, h2, a2);
            h3.i = a2;
        }
        if (h3 != null) {
            if (this.B.j != 128 || this.B.k != 128) {
                h3.b(this.B.j, this.B.j, this.B.k);
            }
            h3.j(this.E);
            h3.b(64 + this.B.m, 850 + this.B.n, -30, -50, -30, true);
            h3.i = rs.a.h.h;
            if (bl) {
                rs.d.x.q.a(a2, this.B.d);
            }
        }
        return h3;
    }

    public l(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        this.B = rs.d.x.c[n12];
        this.p = n7;
        this.w = n10;
        this.x = n9;
        this.y = n8;
        this.h = n4;
        this.i = n5;
        this.z = n2;
        this.A = n6;
        this.n = n11;
        this.j = n3;
        this.v = false;
    }

    public void a(int n2) {
        this.v = true;
        this.k += this.q * (double)n2;
        this.l += this.r * (double)n2;
        this.m += this.t * (double)n2 + 0.5 * this.u * (double)n2 * (double)n2;
        this.t += this.u * (double)n2;
        this.o = (int)(Math.atan2(this.q, this.r) * 325.949) + 1024 & 0x7FF;
        this.E = (int)(Math.atan2(this.t, this.s) * 325.949) & 0x7FF;
        if (this.B.g != null) {
            if (this.B.g.b()) {
                this.D += n2;
                int n3 = this.B.g.c();
                if (this.D >= n3) {
                    this.D = n3 - this.B.g.h;
                }
            } else {
                this.D += n2;
                while (this.D > this.B.g.a(this.C)) {
                    this.D -= this.B.g.a(this.C) + 1;
                    ++this.C;
                    if (this.C < this.B.g.d) continue;
                    this.C = 0;
                }
            }
        }
    }
}

