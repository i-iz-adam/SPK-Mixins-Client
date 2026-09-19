/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import rs.Client;
import rs.a.a;
import rs.a.h;
import rs.d.r;
import rs.d.y;

public final class m
extends a {
    private int j;
    private final int[] k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private rs.d.a r;
    private int s;
    public static Client h;
    public final int i;
    private final int t;
    private final int u;

    @Override
    public h c() {
        r r2;
        int n2 = -1;
        if (this.r != null) {
            int n3 = Client.ff - this.s;
            if (n3 > 100 && this.r.h > 0) {
                n3 = 100;
            }
            if (this.r.b()) {
                int n4 = this.r.c();
                this.j += n3;
                n3 = 0;
                if (this.j >= n4) {
                    this.j = n4 - this.r.h;
                    if (this.j < 0 || this.j > n4) {
                        this.r = null;
                    }
                }
                this.s = Client.ff - n3;
                n2 = this.j;
            } else {
                while (n3 > this.r.a(this.j)) {
                    n3 -= this.r.a(this.j);
                    ++this.j;
                    if (this.j < this.r.d) continue;
                    this.j -= this.r.h;
                    if (this.j >= 0 && this.j < this.r.d) continue;
                    this.r = null;
                    break;
                }
                this.s = Client.ff - n3;
                if (this.r != null) {
                    n2 = this.r.e[this.j];
                }
            }
        }
        if ((r2 = this.k != null ? this.d() : rs.d.r.c(this.i)) == null) {
            return null;
        }
        return r2.a(this.t, this.u, this.n, this.o, this.p, this.q, n2, this.r != null ? this.r.r : -1);
    }

    private r d() {
        int n2 = -1;
        if (this.l != -1) {
            try {
                y y2 = y.a[this.l];
                int n3 = y2.b;
                int n4 = y2.c;
                int n5 = y2.d;
                int n6 = Client.fQ[n5 - n4];
                n2 = rs.a.m.h.dP[n3] >> n4 & n6;
            }
            catch (Exception exception) {}
        } else if (this.m != -1 && this.m < rs.a.m.h.dP.length) {
            n2 = rs.a.m.h.dP[this.m];
        }
        int n7 = n2 >= 0 && n2 < this.k.length ? this.k[n2] : this.k[this.k.length - 1];
        if (n2 == -1) {
            return null;
        }
        return n7 != -1 ? rs.d.r.c(this.k[n2]) : null;
    }

    public m(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl) {
        this(n2, n3, n4, n5, n6, n7, n8, n9, bl, null);
    }

    public m(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl, a a2) {
        this.i = n2;
        this.t = n4;
        this.u = n3;
        this.n = n7;
        this.o = n5;
        this.p = n6;
        this.q = n8;
        r r2 = rs.d.r.c(this.i);
        this.l = r2.ao;
        this.m = r2.Y;
        this.k = r2.ad;
        if (n9 != -1) {
            this.r = rs.d.a.a[n9];
            this.j = 0;
            this.s = Client.ff;
            if (this.r.q == 0 && a2 != null && a2 instanceof m) {
                m m2 = (m)a2;
                if (m2.r == this.r) {
                    this.j = m2.j;
                    this.s = m2.s;
                    return;
                }
            }
            if (bl && this.r.h != -1) {
                if (this.r.b()) {
                    this.j = (int)(Math.random() * (double)this.r.c());
                } else {
                    this.j = (int)(Math.random() * (double)this.r.d);
                    this.s -= (int)(Math.random() * (double)this.r.a(this.j));
                }
            }
        }
    }
}

