/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import java.awt.Polygon;
import rs.Client;
import rs.a.e;
import rs.a.j;
import rs.gui.Launcher;
import rs.runelite.a.f;
import rs.runelite.a.p;

public class c
extends rs.a.a {
    public e h;
    public boolean i;
    public final int j = -1;
    public final int[] k = new int[10];
    public final int[] l = new int[10];
    public int m = -1;
    public int n;
    public int o = 32;
    public int p = -1;
    public String q;
    public int r = 200;
    public int s;
    public int t = -1;
    public int u = -1;
    public int v;
    public int w = -1;
    public int x;
    public int y;
    public int z = -1;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F = -1;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L = -1000;
    public int M;
    public int N;
    public int O = 100;
    public int P;
    public int Q;
    public int R;
    public int S = 1;
    public boolean T = false;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public final boolean[] af;
    public int ag = -1;
    public int ah = -1;
    public int ai = -1;
    public int aj = -1;
    public int ak;
    public int al;
    public int am;
    public int an;
    public byte ao;
    public byte ap;
    public byte aq;
    public byte ar;
    public int as;
    public int at;
    public int au;

    public final rs.d.a[] d() {
        if (this instanceof j) {
            int n2;
            if (!(rs.f.a.aj || (n2 = (int)((j)this).aG.x) != 212 && n2 != 1596 && n2 != 6370 && n2 != 599 && n2 != 373 && n2 != 949 && n2 != 1917 && n2 != 6570 && n2 != 6750 && n2 != 554 && n2 != 1699 && n2 != 7482 && n2 != 315 && n2 != 401 && n2 != 2575)) {
                return rs.d.a.a;
            }
            return rs.d.a.c;
        }
        return rs.d.a.a;
    }

    public final void a(int n2, int n3, boolean bl) {
        if (this.F != -1 && this.d()[this.F].p == 1) {
            this.F = -1;
        }
        if (!bl) {
            int n4 = n2 - this.k[0];
            int n5 = n3 - this.l[0];
            if (n4 >= -8 && n4 <= 8 && n5 >= -8 && n5 <= 8) {
                if (this.E < 9) {
                    ++this.E;
                }
                for (int i2 = this.E; i2 > 0; --i2) {
                    this.k[i2] = this.k[i2 - 1];
                    this.l[i2] = this.l[i2 - 1];
                    this.af[i2] = this.af[i2 - 1];
                }
                this.k[0] = n2;
                this.l[0] = n3;
                this.af[0] = false;
                return;
            }
        }
        this.E = 0;
        this.U = 0;
        this.n = 0;
        this.k[0] = n2;
        this.l[0] = n3;
        this.ac = this.k[0] * 128 + this.S * 64;
        this.ad = this.l[0] * 128 + this.S * 64;
    }

    public final void e() {
        this.E = 0;
        this.U = 0;
    }

    public final void f() {
        this.h.a();
    }

    public final boolean a(int n2, int n3, int n4, int n5) {
        return this.h.a(n2, n3, n4, n5, true);
    }

    public final void a(boolean bl, int n2) {
        int n3 = this.k[0];
        int n4 = this.l[0];
        if (n2 == 0) {
            --n3;
            ++n4;
        }
        if (n2 == 1) {
            ++n4;
        }
        if (n2 == 2) {
            ++n3;
            ++n4;
        }
        if (n2 == 3) {
            --n3;
        }
        if (n2 == 4) {
            ++n3;
        }
        if (n2 == 5) {
            --n3;
            --n4;
        }
        if (n2 == 6) {
            --n4;
        }
        if (n2 == 7) {
            ++n3;
            --n4;
        }
        if (this.F != -1 && this.d()[this.F].p == 1) {
            this.F = -1;
        }
        if (this.E < 9) {
            ++this.E;
        }
        for (int i2 = this.E; i2 > 0; --i2) {
            this.k[i2] = this.k[i2 - 1];
            this.l[i2] = this.l[i2 - 1];
            this.af[i2] = this.af[i2 - 1];
        }
        this.k[0] = n3;
        this.l[0] = n4;
        this.af[0] = bl;
    }

    public Polygon a(int n2) {
        return Launcher.n().o().a(new f(this.ac, this.ad), n2);
    }

    public p g() {
        int n2 = (this.k[0] << 7) + 64;
        int n3 = (this.l[0] << 7) + 64;
        return rs.runelite.a.p.a(n2, n3, Client.dw);
    }

    public boolean h() {
        if (!(this instanceof j)) {
            return false;
        }
        j j2 = (j)this;
        return j2.aG != null && j2.aG.h;
    }

    public boolean i() {
        if (!this.h()) {
            return false;
        }
        if (this.m != -1 && this.m < 32768) {
            j j2 = Launcher.n().o().cA[this.m];
            return j2 != null && j2.aG != null && j2.aG.h;
        }
        return false;
    }

    public boolean j() {
        return this.h() && this.m - 32768 == Client.di;
    }

    public boolean k() {
        if (!this.i()) {
            return false;
        }
        if (this.m != -1 && this.m < 32768) {
            j j2 = Launcher.n().o().cA[this.m];
            return j2.j();
        }
        return false;
    }

    public boolean l() {
        return false;
    }

    c() {
        this.h = new e();
        this.af = new boolean[10];
    }

    static class a {
        public int a;
        public int b;
        public int c;
        public int d;

        public a(int n2, int n3, int n4) {
            this.a = n2;
            this.b = n3;
            this.c = n4;
        }
    }
}

