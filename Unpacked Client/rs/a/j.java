/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import rs.Client;
import rs.a.c;
import rs.a.h;
import rs.a.k;
import rs.d.d;
import rs.d.x;
import rs.f.a;
import rs.l.f_0;

public final class j
extends c {
    public boolean av;
    public int aw;
    public int ax;
    public int ay;
    public short az;
    public int aA = 0;
    public int aB = -1;
    public int aC = 0;
    public int aD = 7;
    public int aE = 7;
    public int aF = -1;
    public d aG;
    public boolean aH;

    public h m() {
        if (this.F >= 0 && this.I == 0) {
            if (this.d()[this.F].b()) {
                int n2 = this.G;
                int n3 = -1;
                if (this.w >= 0 && this.w != this.t) {
                    n3 = this.d()[this.w].b() ? this.x : this.d()[this.w].e[this.x];
                    return this.aG.a(n3, n2, this.d()[this.F].i, this.F, this.w);
                }
                return this.aG.a(-1, n2, this.d()[this.F].i, this.F, this.w);
            }
            int n4 = this.d()[this.F].e[this.G];
            int n5 = -1;
            if (this.w >= 0 && this.w != this.t) {
                n5 = this.d()[this.w].e[this.x];
            }
            return this.aG.a(n5, n4, this.d()[this.F].i, this.F, this.w);
        }
        int n6 = -1;
        if (this.w >= 0) {
            n6 = this.d()[this.w].b() ? this.x : this.d()[this.w].e[this.x];
        }
        return this.aG.a(-1, n6, null, this.w);
    }

    public int n() {
        return this.aG == null ? -1 : (int)this.aG.x;
    }

    public String o() {
        return this.aG == null ? "null" : this.aG.o;
    }

    public int p() {
        return -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public h c() {
        h h2;
        if (this.aG == null) {
            return null;
        }
        if (this.aG.x == 1337L) {
            if (this.m < 0) {
                return null;
            }
            if (this.m >= 32768) {
                int n2 = this.m - 32768;
                k k2 = Client.do[n2];
                if (n2 == Client.di) {
                    h h3;
                    rs.a.k.aJ = true;
                    try {
                        h3 = Client.eR.c();
                        h3.b(90, 90, 90);
                    }
                    finally {
                        rs.a.k.aJ = false;
                    }
                    return h3;
                }
                if (k2 != null) {
                    h h4;
                    boolean bl = false;
                    if (k2.aU) {
                        bl = true;
                        k2.aU = false;
                    }
                    rs.a.k.aJ = true;
                    try {
                        h4 = k2.c();
                        h4.b(90, 90, 90);
                    }
                    finally {
                        rs.a.k.aJ = false;
                    }
                    if (bl) {
                        k2.aU = true;
                    }
                    return h4;
                }
                return null;
            }
        }
        if (this.aG.x == 1336L || this.aG.x == 1335L || this.aG.x == 1334L || this.aG.x == 8210L) {
            if (this.m < 0) {
                return null;
            }
            if (this.m >= 32768) {
                int n3 = this.m - 32768;
                k k3 = Client.do[n3];
                if (n3 == Client.di) {
                    h h5;
                    boolean bl = rs.f.a.N;
                    if (!rs.f.a.N) {
                        rs.f.a.N = true;
                    }
                    rs.a.k.aJ = true;
                    try {
                        h5 = Client.eR.c();
                    }
                    finally {
                        rs.a.k.aJ = false;
                    }
                    rs.f.a.N = bl;
                    return h5;
                }
                if (k3 != null) {
                    h h6;
                    boolean bl = false;
                    if (k3.aU) {
                        bl = true;
                        k3.aU = false;
                    }
                    rs.a.k.aJ = true;
                    try {
                        h6 = k3.c();
                    }
                    finally {
                        rs.a.k.aJ = false;
                    }
                    if (bl) {
                        k3.aU = true;
                    }
                    return h6;
                }
                return null;
            }
        }
        if ((h2 = this.m()) == null) {
            return null;
        }
        this.r = h2.g;
        if (this.z != -1 && this.A != -1) {
            x x2 = rs.d.x.c[this.z];
            h h7 = null;
            h7 = x2.g != null && x2.g.b() ? x2.c(this.A) : x2.a();
            if (h7 != null) {
                h h8 = null;
                if (!x2.g.b()) {
                    int n4 = x2.g.e[this.A];
                    h8 = new h(true, rs.k.g(n4), false, h7);
                    h8.a(0, -this.D, 0);
                    h8.n();
                    h8.f(n4, x2.g.r);
                } else {
                    h8 = h7;
                    h8.a(0, -this.D, 0);
                }
                h8.aM = null;
                h8.aL = null;
                if (x2.j != 128 || x2.k != 128) {
                    h8.b(x2.j, x2.j, x2.k);
                }
                h8.b(64 + x2.m, 850 + x2.n, -30, -50, -30, true);
                h[] hArray = new h[]{h2, h8};
                h2 = new h(hArray);
                h2.f();
            }
        }
        h2.aN = this.aG.r == 1;
        if (this.aG.aa > -1) {
            this.ar = (byte)this.aG.aa;
            this.ap = (byte)this.aG.ac;
            this.aq = (byte)this.aG.ad;
            this.ao = (byte)this.aG.ab;
        }
        if (this.ar > 0) {
            h2.S = this.ar;
            h2.T = this.ap;
            h2.U = this.aq;
            h2.V = this.ar;
        } else {
            h2.V = 0;
        }
        return h2;
    }

    public boolean q() {
        return this.aH && this.m - 32768 != Client.di;
    }

    @Override
    public boolean l() {
        return this.aG != null;
    }

    public void a(f_0 f_02, int n2, int n3) {
        if (!rs.l.b.a.a()) {
            if (this.aB == 0) {
                this.aA += this.aD;
                if (this.aA >= 225) {
                    this.aB = 1;
                }
            } else if (this.aB == 1) {
                this.aA -= this.aE;
                if (this.aA <= 0) {
                    this.aA = 0;
                    --this.aC;
                    if (this.aC <= 0) {
                        this.aB = -1;
                        this.aC = 0;
                    } else {
                        this.aB = 0;
                    }
                }
            }
        }
        f_02.g(n2, n3, this.aA);
    }
}

