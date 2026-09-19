/*
 * Decompiled with CFR 0.152.
 */
package rs.n.a.a;

import rs.Client;
import rs.l.c;
import rs.n.a.a.a;
import rs.n.a.a.e;
import rs.n.a.d;
import rs.n.a.f;

public class b
extends d {
    public static final int b = 32431;
    public static final int c = 32432;
    public static final int d = 32457;
    static final int e = 1;
    static final int f = 20;
    private final e[] g = new e[25];
    private a bI;
    private int bJ;

    public b() {
        this.aw = 32431;
        this.al = new int[0];
        this.am = new int[0];
        this.bc = new int[0];
        this.aH = 500;
        this.bj = 87;
        this.k(0);
        this.bf = false;
        rs.n.a.a.b.H[32431] = this;
    }

    @Override
    public void f(int n2, int n3) {
        if (this.bI == null) {
            return;
        }
        int n4 = this.bI.h() % 2 != 0 ? 4668980 : 3814187;
        rs.l.c.a(n2 - 1, n3, this.bI.P, this.bI.n(), n4, 255);
        rs.l.c.d(n2 - 1, this.bI.P + 2, this.aR + 2, 2630172, n3 - 1);
    }

    public boolean b() {
        return Client.hP >= this.bB && Client.hP <= this.bB + this.P + (this.k() ? 20 : 0) && Client.hQ >= this.bC && Client.hQ <= this.bC + this.aR;
    }

    public void a(a a2) {
        int n2;
        for (n2 = 0; n2 < this.g.length; ++n2) {
            this.g[n2] = rs.n.a.a.e.k(32432 + n2, "test");
        }
        this.bI = a2;
        this.bJ = a2.p();
        int n3 = n2 = a2.k() == 1 ? 5 : 0;
        if (a2.o() == 0) {
            a2.n(20 * a2.h() - 1 + n2);
        }
        for (int i2 = 0; i2 < a2.h(); ++i2) {
            this.g[i2].bA = a2.aw;
            this.g[i2].at = a2.i().get(i2).a();
            this.g[i2].ao = rs.n.a.f.a[a2.k()];
            this.g[i2].m(a2.l());
            this.g[i2].a(a2.P);
            if (a2.m()) {
                this.g[i2].b();
            } else {
                this.g[i2].h();
            }
            if (a2.i().get(i2).b().equalsIgnoreCase("Select")) {
                this.g[i2].bx = false;
            } else {
                this.g[i2].by = a2.i().get(i2).b();
                this.g[i2].bx = true;
            }
            this.g[i2].Q = "Select";
        }
        this.aR = a2.n();
        this.aH = Math.max(a2.n(), 20 * a2.h() + n2);
        this.bA = a2.aw;
        this.P = a2.P - (this.k() ? 15 : 0);
        this.j();
    }

    private void j() {
        if (this.a != null) {
            this.a.b();
        }
        int n2 = this.m();
        int n3 = this.l();
        if (this.k()) {
            n2 -= 7;
        }
        for (int i2 = 0; i2 < this.bI.h(); ++i2) {
            int n4 = 0;
            this.n(this.g[i2].aw).a(n2, n3 + i2 * 20 + n4);
        }
        super.a();
    }

    private boolean k() {
        return this.bI.n() < this.aH;
    }

    private int l() {
        return 10 - this.g[0].aR / 2;
    }

    private int m() {
        return this.g[0].S ? 1 : 12;
    }

    public e[] c() {
        return this.g;
    }

    public a h() {
        return this.bI;
    }

    public int i() {
        return this.bJ;
    }
}

