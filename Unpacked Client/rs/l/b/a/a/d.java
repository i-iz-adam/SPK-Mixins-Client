/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b.a.a;

import java.awt.Color;
import java.awt.Polygon;
import rs.Client;
import rs.a.h;
import rs.k;
import rs.l.b.a.a.a;
import rs.l.e.j;
import rs.v_0;

public class d
extends a {
    private int t;
    private int[] u = new int[]{0, 10, 18, 26, 33, 36, 42};
    private int[] v = new int[]{0, 0, 0, 0, 0};
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;

    @Override
    protected void b() {
        this.q();
        this.d(808);
    }

    @Override
    protected void c() {
        rs.d.a a2 = rs.d.a.a[this.h];
        int n2 = a2.e[this.i];
        h h2 = this.o();
        if (h2 != null) {
            h h3 = rs.a.h.ac;
            h3.a(h2, rs.k.g(n2) & rs.k.g(-1));
            h3.f(n2, this.h);
            h3.k();
            h3.aM = null;
            h3.aL = null;
            h3.aN = true;
            Polygon polygon = h3.b(this.b, this.c, this.d - v_0.k + Client.cK, 0);
            j j2 = new j(this, polygon, Color.GREEN, Color.BLACK, this.f);
            j2.f = Color.BLACK;
            Client.ab.c.a(this.f, (Object)j2);
            h3.a(this.e, v_0.m, v_0.n, v_0.o, v_0.p, this.b - v_0.j, this.d - v_0.k, this.c - v_0.l, this.f, 0);
            h3.K = (short)256;
            if (j2.g && rs.l.b.a.d.b.j) {
                if (rs.l.b.a.d.b.k == 1) {
                    rs.l.b.a.d.b.c("Selected @gre@Player entity #" + (this.m + 1));
                    this.n = true;
                    rs.l.b.a.d.b.f();
                } else {
                    this.o = false;
                    rs.l.b.a.d.b.c("Deleted @red@Player entity #" + (this.m + 1));
                }
                rs.l.b.a.d.b.j = false;
            }
            this.c(h3.g + 10);
            if (rs.l.b.a.d.e) {
                Client.gl.a((this.n ? "@gre@" : "") + (this.m + 1), this.k, this.l, 0xFFFFFF, 0, false);
            }
        }
    }

    public rs.a.k n() {
        rs.a.k k2 = new rs.a.k();
        k2.aY = this.t;
        System.arraycopy(this.v, 0, k2.aV, 0, k2.aV.length);
        k2.br[0] = this.a(this.z, 512);
        k2.br[1] = this.a(this.B, 512);
        k2.br[2] = this.a(this.C, 512);
        k2.br[3] = this.a(this.w, 512);
        k2.br[4] = this.x == 0 ? this.a(this.u[2], 256) : this.a(this.x, 512);
        k2.br[5] = this.a(this.E, 512);
        k2.br[6] = this.x == 0 || !this.s() ? this.a(this.u[3], 256) : 0;
        k2.br[7] = this.y == 0 ? this.a(this.u[5], 256) : this.a(this.y, 512);
        k2.br[8] = this.z == 0 || !this.t() && !this.u() ? this.a(this.u[0], 256) : 0;
        k2.br[9] = this.D == 0 ? this.a(this.u[4], 256) : this.a(this.D, 512);
        k2.br[10] = this.A == 0 ? this.a(this.u[6], 256) : this.a(this.A, 512);
        k2.br[11] = this.z != 0 && this.t() || this.t == 1 ? 0 : this.a(this.u[1], 256);
        k2.t = this.h;
        k2.bm = true;
        k2.aU = true;
        return k2;
    }

    private int a(int n2, int n3) {
        if (n2 == 0 && n3 != 256) {
            return 0;
        }
        return n3 + n2;
    }

    public h o() {
        h h2 = this.n().m();
        if (h2 == null) {
            return null;
        }
        h2.aN = true;
        return h2;
    }

    public void p() {
        this.d(808);
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.G = false;
        this.H = false;
    }

    public void q() {
        this.t = 0;
    }

    public void r() {
        this.t = 1;
    }

    public void g(int n2) {
        this.w = n2;
    }

    public void h(int n2) {
        this.x = n2;
    }

    public void i(int n2) {
        this.y = n2;
    }

    public void j(int n2) {
        this.z = n2;
    }

    public void k(int n2) {
        this.A = n2;
    }

    public void l(int n2) {
        this.B = n2;
    }

    public void m(int n2) {
        this.C = n2;
    }

    public void n(int n2) {
        this.D = n2;
    }

    public void o(int n2) {
        this.E = n2;
    }

    public boolean s() {
        return this.F;
    }

    public void b(boolean bl) {
        this.F = bl;
    }

    public boolean t() {
        return this.G;
    }

    public void c(boolean bl) {
        this.G = bl;
    }

    public boolean u() {
        return this.H;
    }

    public void d(boolean bl) {
        this.H = bl;
    }
}

