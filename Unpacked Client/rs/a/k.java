/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import rs.Client;
import rs.a;
import rs.a.c;
import rs.a.h;
import rs.d.j;
import rs.d.x;
import rs.f_0;
import rs.l.b.a.a.d;
import rs.n.c.w;
import rs.x.e;

public final class k
extends c {
    public static k av = new d().n();
    public static int aw = 0;
    public static int ax = 0;
    public int ay;
    public long az;
    public int aA;
    public static h aB = null;
    private boolean bA = false;
    public int aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public int aH;
    public int aI;
    public static boolean aJ = false;
    public static boolean aK = false;
    public static f_0 aL = new f_0(260);
    public static f_0 aM = new f_0(260);
    public static f_0 aN = new f_0(260);
    public static f_0 aO = new f_0(260);
    public static f_0 aP = new f_0(25);
    public static f_0 aQ = new f_0(25);
    public boolean aR;
    public int[] aS;
    private long bB = -1L;
    public rs.d.d aT;
    public boolean aU = false;
    public final int[] aV;
    public final int[] aW = new int[28];
    public int aX;
    public int aY;
    public String aZ;
    public String ba;
    public int bb;
    public int bc;
    public int bd;
    public int be;
    public int bf;
    public int bg;
    public int bh;
    public int bi;
    public int bj;
    public int bk;
    public int bl;
    public boolean bm = false;
    public int bn;
    public int bo;
    public int bp;
    public h bq;
    public final int[] br;
    public int bs;
    private long bC;
    public int bt;
    public int bu;
    public int bv;
    public int bw;
    public int bx;
    public int by;
    public long bz;

    public h b(boolean bl) {
        boolean bl2;
        Object object;
        if (!this.bm) {
            return null;
        }
        if (this.q() && !rs.f.a.N) {
            return null;
        }
        if (this.aC == 25 && !rs.f.a.bp && this.m == -1) {
            return null;
        }
        h h2 = null;
        h2 = this.c(bl);
        if (h2 == null) {
            return null;
        }
        h h3 = null;
        if (this.z != -1 && this.A != -1 && bl) {
            object = rs.d.x.c[this.z];
            h3 = ((x)object).g != null && ((x)object).g.b() ? ((x)object).c(this.A) : ((x)object).a();
            boolean bl3 = bl2 = this.z >= 1181 && this.z <= 1183;
            if (this.z == 769 && this.A <= 12) {
                bl2 = true;
            }
            if (h3 != null && bl2) {
                h h4 = null;
                if (!((x)object).g.b()) {
                    h4 = new h(true, rs.k.g(this.A), false, h3);
                    h4.a(0, -this.D, 0);
                    h4.n();
                    h4.f(((x)object).g.e[this.A], ((x)object).g.r);
                }
                h4.aM = null;
                h4.aL = null;
                if (((x)object).j != 128 || ((x)object).k != 128) {
                    h4.b(((x)object).j, ((x)object).j, ((x)object).k);
                }
                h4.b(64 + ((x)object).m, 850 + ((x)object).n, -30, -50, -30, true);
                return h4;
            }
        }
        this.r = h2.g;
        h2.aN = true;
        if (this.aU) {
            return h2;
        }
        if (h3 != null) {
            object = rs.d.x.c[this.z];
            bl2 = false;
            rs.a.a.a a2 = rs.a.h.h;
            h h5 = null;
            if (!((x)object).g.b()) {
                if (rs.a.k.u() && (a2 = (rs.a.a.a)rs.d.x.q.a(this.z)) == null) {
                    a2 = new rs.a.a.a(true);
                    a2.e();
                    bl2 = true;
                }
                h5 = new h(true, rs.k.g(this.A), false, h3, a2);
                h5.i = a2;
                h5.a(0, -this.D, 0);
                h5.n();
                h5.f(((x)object).g.e[this.A], ((x)object).g.r);
            } else {
                h5 = h3;
                h5.a(0, -this.D, 0);
            }
            h5.aM = null;
            h5.aL = null;
            if (((x)object).j != 128 || ((x)object).k != 128) {
                h5.b(((x)object).j, ((x)object).j, ((x)object).k);
            }
            h5.b(64 + ((x)object).m, 850 + ((x)object).n, -30, -50, -30, true);
            if (bl2) {
                rs.d.x.q.a(a2, this.z);
            }
            h[] hArray = new h[]{h2, h5};
            long l2 = this.bC + (long)(1000000 + this.z);
            a2 = rs.a.h.h;
            bl2 = false;
            h2 = new h(hArray, a2);
            h2.i = a2;
            h2.f();
        }
        if (this.bq != null) {
            if (Client.ff >= this.bk) {
                this.bq = null;
            }
            if (Client.ff >= this.bj && Client.ff < this.bk) {
                object = this.bq;
                ((h)object).a(this.bn - this.ac, this.bo - this.bl, this.bp - this.ad);
                if (bl) {
                    if (this.s == 512) {
                        ((h)object).o();
                        ((h)object).o();
                        ((h)object).o();
                    } else if (this.s == 1024) {
                        ((h)object).o();
                        ((h)object).o();
                    } else if (this.s == 1536) {
                        ((h)object).o();
                    }
                }
                h[] hArray = new h[]{h2, object};
                h2 = new h(hArray);
                if (bl) {
                    if (this.s == 512) {
                        ((h)object).o();
                    } else if (this.s == 1024) {
                        ((h)object).o();
                        ((h)object).o();
                    } else if (this.s == 1536) {
                        ((h)object).o();
                        ((h)object).o();
                        ((h)object).o();
                    }
                }
                ((h)object).a(this.ac - this.bn, this.bl - this.bo, this.ad - this.bp);
            }
        }
        if (this.ar > 0) {
            h2.S = this.ar;
            h2.T = this.ap;
            h2.U = this.aq;
            h2.V = this.ar;
        } else {
            h2.V = 0;
        }
        h2.aN = true;
        return h2;
    }

    @Override
    public h c() {
        return this.b(true);
    }

    public static h a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        return rs.a.k.a(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, 0);
    }

    public static h a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        int n16;
        int[] nArray = new int[]{n6, n13, n12, n2, n15, n3, n4, n5, n10, n7, n11, n9, n8};
        int n17 = -1;
        int n18 = -1;
        h h2 = null;
        boolean bl = false;
        for (int i2 = 0; i2 < 13; ++i2) {
            n16 = nArray[i2];
            if (n16 >= 256 && n16 < 512 && !rs.d.j.b[n16 - 256].c()) {
                bl = true;
            }
            if (n16 < 512 || rs.d.k.f(n16 - 512).a(n14)) continue;
            bl = true;
        }
        if (bl) {
            return null;
        }
        h[] hArray = new h[12];
        n16 = 0;
        for (int i3 = 0; i3 < 13; ++i3) {
            Object object;
            int n19 = nArray[i3];
            if (n18 >= 0 && i3 == 3) {
                n19 = n18;
            }
            if (n17 >= 0 && i3 == 5) {
                n19 = n17;
            }
            if (n19 >= 256 && n19 < 512) {
                object = rs.d.j.b[n19 - 256].b();
                if (object != null) {
                    hArray[n16++] = object;
                } else {
                    bl = true;
                }
            }
            if (n19 < 512) continue;
            object = rs.d.k.f(n19 - 512);
            h h3 = ((rs.d.k)object).d(n14);
            if (h3 != null) {
                if (rs.a.k.b(n19 - 512)) {
                    int[] nArray2 = rs.n.c.w.bJ;
                    h3.ar = rs.a.k.b(nArray2[4], nArray2[0], nArray2[2], nArray2[1], nArray2[3], nArray2[5]);
                }
                hArray[n16++] = h3;
                continue;
            }
            bl = true;
        }
        if (bl) {
            hArray = null;
            return null;
        }
        h2 = new h(n16, hArray);
        return h2;
    }

    public static boolean b(int n2) {
        return n2 == 23063 || n2 == 21963 || n2 == 21964;
    }

    public void a(e e2) {
        int n2;
        int n3;
        int n4;
        int n5;
        e2.h = 0;
        this.aY = e2.y();
        this.bd = e2.y();
        this.bf = e2.y();
        this.bg = e2.y();
        this.bh = e2.y();
        this.aC = e2.B();
        if (rs.f.a.d.booleanValue()) {
            Client.cx.add("\t\t---> gender=" + this.aY + ",headIcon=" + this.bd + ",skullIcon=" + this.bf + ",orbIcon=" + this.bg + ",miscIcon=" + this.bh + ",privilege=" + this.aC);
        }
        this.aT = null;
        this.aX = 0;
        for (n5 = 0; n5 < 12; ++n5) {
            n4 = e2.y();
            if (n4 == 0) {
                this.br[n5] = 0;
                continue;
            }
            n3 = e2.y();
            this.br[n5] = (n4 << 8) + n3;
            if (n5 == 0 && this.br[0] == 65535) {
                this.ay = e2.A();
                this.aT = rs.d.d.c(this.ay);
                break;
            }
            if (this.br[n5] < 512 || this.br[n5] - 512 >= rs.d.k.ad || (n2 = rs.d.k.f((int)(this.br[n5] - 512)).ac) == 0) continue;
            this.aX = n2;
        }
        this.bs = (n5 = e2.y()) == 1 ? e2.A() : -1;
        if (rs.f.a.d.booleanValue()) {
            Client.cx.add("\t\t---> cosmetic=" + n5);
        }
        for (n4 = 0; n4 < 5; ++n4) {
            n3 = e2.y();
            if (n3 < 0 || n3 >= Client.dU[n4].length) {
                n3 = 0;
            }
            this.aV[n4] = n3;
        }
        n4 = -1;
        if (this.br != null && this.br.length > 3) {
            n4 = this.br[3] - 512;
        }
        this.t = e2.A();
        if (this.t == 65535) {
            this.t = -1;
        }
        if (rs.f.a.aj && this.t == 7047) {
            this.t = 7053;
        }
        if (!rs.f.a.aj && this.t == 7518) {
            this.t = 1662;
        }
        if (!(rs.f.a.aj || this.t != 808 || n4 != 4151 && n4 != 25000 && n4 != 20523 && n4 != 20689)) {
            this.t = 11973;
        }
        this.u = e2.A();
        if (this.u == 65535) {
            this.u = -1;
        }
        if (rs.f.a.aj && this.u == 7044) {
            this.u = 7044;
        }
        this.ag = e2.A();
        if (this.ag == 65535) {
            this.ag = -1;
        }
        if (rs.f.a.aj && this.ag == 7046) {
            this.ag = 7052;
        }
        if (!rs.f.a.aj && this.ag == 7520) {
            this.ag = 1663;
        }
        if (!rs.f.a.aj && this.ag == 1422) {
            this.ag = 819;
        }
        this.ah = e2.A();
        if (this.ah == 65535) {
            this.ah = -1;
        }
        this.ai = e2.A();
        if (this.ai == 65535) {
            this.ai = -1;
        }
        this.aj = e2.A();
        if (this.aj == 65535) {
            this.aj = -1;
        }
        this.p = e2.A();
        if (this.p == 65535) {
            this.p = -1;
        }
        if (rs.f.a.aj && this.p == 7039) {
            this.p = 7043;
        }
        if (!rs.f.a.aj && this.p == 7519) {
            this.p = 1664;
        }
        if (!rs.f.a.aj && this.p == 15523) {
            this.p = 1210;
        }
        if (this.aT != null && this.ay > 0) {
            this.t = this.aT.w;
            this.u = this.aT.w;
            this.ag = this.aT.q;
            this.p = this.aT.q;
            this.ah = this.aT.l;
            this.ai = this.aT.j;
            this.aj = this.aT.B;
        }
        this.bb = e2.y();
        if (this.bb != 0) {
            this.ba = e2.F();
        }
        this.aZ = e2.F();
        if (rs.f.a.d.booleanValue()) {
            Client.cx.add("\t\t---> name=" + this.aZ);
        }
        this.bc = e2.y();
        this.by = e2.A();
        if (this.by > 0) {
            this.bz = System.currentTimeMillis();
        }
        this.ar = (byte)e2.y();
        if (this.ar > 0) {
            this.ao = (byte)e2.y();
            this.ap = (byte)e2.y();
            this.aq = (byte)e2.y();
        }
        int n6 = n3 = e2.y() == 1 ? 1 : 0;
        if (rs.f.a.d.booleanValue()) {
            Client.cx.add("\t\t---> hasCompColors=" + (n3 != 0));
        }
        if (n3 != 0) {
            n2 = rs.n.c.w.a(e2.y(), true);
            int n7 = rs.n.c.w.a(e2.y(), true);
            int n8 = rs.n.c.w.a(e2.y(), true);
            int n9 = rs.n.c.w.a(e2.y(), true);
            int n10 = rs.n.c.w.a(e2.y(), true);
            int n11 = rs.n.c.w.a(e2.y(), false);
            if (rs.f.a.d.booleanValue()) {
                Client.cx.add("\t\t---> compColors=" + n2 + "," + n7 + "," + n8 + "," + n9 + "," + n10 + "," + n11);
            }
            this.a(n2, n7, n8, n9, n10, n11);
        }
        this.bm = true;
        this.bC = 0L;
        for (n2 = 0; n2 < 12; ++n2) {
            this.bC <<= 4;
            if (this.br[n2] < 256) continue;
            if (n2 == 1 && rs.a.k.b(this.br[n2] - 512)) {
                this.bC += (long)(50000 + this.aH + this.aF + this.aG + this.aE + this.aD + this.aI);
                continue;
            }
            this.bC += (long)(this.br[n2] - 256);
        }
        if (this.bs > 0) {
            this.bC += (long)(this.bs - 256);
        }
        if (this.br[0] >= 256) {
            this.bC += (long)(this.br[0] - 256 >> 4);
        }
        if (this.br[1] >= 256) {
            if (rs.a.k.b(this.br[1] - 512)) {
                n2 = 50000 + this.aH + this.aF + this.aG + this.aE + this.aD + this.aI;
                this.bC += (long)(n2 - 256 >> 8);
            } else {
                this.bC += (long)(this.br[1] - 256 >> 8);
            }
        }
        this.aR = false;
        if (this.br[1] - 512 == 19000 || this.br[1] - 512 == 3789 || this.br[1] - 512 == 23490 || this.br[1] - 512 == 23465 || this.br[1] - 512 == 22123 || this.br[1] - 512 == 22122 || this.br[1] - 512 == 21634 || this.br[1] - 512 == 21633 || this.br[1] - 512 >= 24151 && this.br[1] - 512 <= 24146) {
            this.aR = true;
        }
        for (n2 = 0; n2 < 5; ++n2) {
            this.bC <<= 3;
            this.bC += (long)this.aV[n2];
        }
        this.bC <<= 1;
        this.bC += (long)this.aY;
    }

    public rs.d.a c(int n2) {
        if (n2 < 0) {
            return null;
        }
        rs.d.a a2 = rs.d.a.a[n2];
        if (this.F > 0 && a2 != null) {
            boolean bl;
            rs.d.a a3 = rs.d.a.a[this.F];
            boolean bl2 = bl = !rs.f.a.aj;
            if (bl && a3 != null && a3.w && !a2.w && rs.d.a.c[n2] != null) {
                return rs.d.a.c[n2];
            }
        }
        return a2;
    }

    public h m() {
        return this.c(true);
    }

    public h c(boolean bl) {
        int n2;
        boolean bl2;
        Object object;
        int n3;
        int n4;
        int n5 = this.p();
        if (!bl) {
            n5 = 808;
        }
        if (this.F == 7533 && !rs.f.a.aj) {
            n5 = 808;
        }
        if (this.F == 451) {
            this.F = !rs.f.a.aj ? 13039 : 390;
        }
        if (this.F == 426 && rs.f.a.aj) {
            this.F = 15409;
        }
        if (this.F == 10961 && rs.f.a.aj) {
            this.F = 7514;
        }
        if (this.F == 7516 && !rs.f.a.aj) {
            this.F = 13055;
        }
        if (this.F == 7517 && !rs.f.a.aj) {
            this.F = 13054;
        }
        if (this.F == 2067 && !rs.f.a.aj) {
            this.F = 2066;
        }
        if ((this.F == 6381 || this.F == 7074) && rs.f.a.aj) {
            this.F = 7061;
        }
        if (this.F == 7042 && rs.f.a.aj) {
            this.F = 7055;
        }
        if (this.F == 7049 && rs.f.a.aj) {
            this.F = 7045;
        }
        if (this.F == 7041 && rs.f.a.aj) {
            this.F = 7054;
        }
        if (this.F == 7048 && rs.f.a.aj) {
            this.F = 7045;
        }
        if (this.F == 13051 && rs.f.a.aj) {
            this.F = 7056;
        }
        if (this.F == 8145 && !rs.f.a.aj) {
            this.F = 13049;
        }
        rs.d.a a2 = this.c(n5);
        if (bl) {
            if (this.x < 0) {
                this.x = 0;
            }
            if (a2 != null && !a2.b() && this.x >= a2.e.length) {
                this.x = a2.e.length - 1;
            }
        }
        if ((n4 = this.x) < 0) {
            n4 = 0;
        }
        if (a2 != null && n4 >= a2.e.length) {
            n4 = a2.e.length - 1;
        }
        if (this.aT != null) {
            int n6 = -1;
            if (this.F >= 0 && this.I == 0) {
                n6 = rs.d.a.a[this.F].b() ? this.G : rs.d.a.a[this.F].e[this.G];
            } else if (n5 >= 0) {
                n6 = rs.d.a.a[n5].b() ? n4 : rs.d.a.a[n5].e[n4];
            }
            return this.aT.a(-1, n6, null, this.F >= 0 && this.I == 0 ? this.F : n5);
        }
        long l2 = this.bC;
        int n7 = -1;
        int n8 = -1;
        int n9 = -1;
        int n10 = -1;
        int n11 = n3 = rs.f.a.bb ? this.bs : 0;
        if (this.F >= 0 && this.I == 0 && bl) {
            object = rs.d.a.a[this.F];
            n7 = ((rs.d.a)object).e[this.G];
            if (a2 != null && n5 != this.t) {
                n8 = a2.e[n4];
            }
            if (((rs.d.a)object).l >= 0) {
                n9 = ((rs.d.a)object).l;
                l2 += (long)(n9 - this.br[5] << 40);
            }
            if (((rs.d.a)object).m >= 0) {
                n10 = ((rs.d.a)object).m;
                l2 += (long)(n10 - this.br[3] << 48);
            } else if (this.br[3] == 28560) {
                n10 = 28561;
                l2 += (long)(n10 - this.br[3] << 48);
            }
        } else {
            if (a2 != null) {
                n7 = a2.e[n4];
            }
            if (n5 != this.t && this.br[3] == 28560) {
                n10 = 28561;
                l2 += (long)(n10 - this.br[3] << 48);
            }
        }
        object = null;
        object = (h)rs.a.k.r().a(l2);
        int n12 = 512;
        if (object == null || this.i) {
            bl2 = false;
            for (n2 = 0; n2 < 12; ++n2) {
                int n13 = this.br[n2];
                if (n10 >= 0 && n2 == 3) {
                    n13 = n10;
                }
                if (n9 >= 0 && n2 == 5) {
                    n13 = n9;
                }
                if (n13 >= 256 && n13 < 512 && !rs.d.j.b[n13 - 256].a()) {
                    bl2 = true;
                }
                if (n13 < 512 || rs.d.k.f(n13 - 512).c(this.aY)) continue;
                bl2 = true;
            }
            if (n3 > 0 && !rs.d.k.f(n3).c(this.aY)) {
                bl2 = true;
            }
            if (n3 == 28760 && !rs.d.k.f(28758).c(this.aY)) {
                bl2 = true;
            }
            if (bl2) {
                if (this.bB != -1L) {
                    object = (h)rs.a.k.r().a(this.bB);
                }
                if (object == null) {
                    return null;
                }
            }
        }
        if (object == null || this.i) {
            int n14;
            if (!rs.f.a.J) {
                return null;
            }
            bl2 = this.i;
            n2 = 0;
            h[] hArray = new h[n3 > 0 ? 14 : 12];
            int n15 = 0;
            rs.a.h.bF = false;
            rs.a.h.e(true);
            for (int i2 = 0; i2 < 12; ++i2) {
                Object object2;
                int n16;
                int n17;
                Object object3;
                h h2;
                n14 = this.br[i2];
                if (n10 >= 0 && i2 == 3) {
                    n14 = n10;
                }
                if (n9 >= 0 && i2 == 5) {
                    n14 = n9;
                }
                if (n14 >= 256 && n14 < 512) {
                    rs.a.h.bG = i2;
                    h2 = rs.d.j.b[n14 - 256].b();
                    if (h2 != null) {
                        if (Client.dU[4][this.aV[4]] == 10 || Client.dU[4][this.aV[4]] == 491769) {
                            h2.b(new int[]{4550}, -50);
                        } else {
                            object3 = Client.dV;
                            n17 = ((Object)object3).length;
                            for (n16 = 0; n16 < n17; ++n16) {
                                object2 = object3[n16];
                                if (Client.dU[4][this.aV[4]] != object2[0]) continue;
                                h2.e(4550, (int)object2[1]);
                            }
                        }
                        hArray[n15++] = h2;
                    }
                }
                if (n14 >= 512) {
                    rs.a.h.bG = i2;
                    h2 = rs.d.k.f(n14 - 512).d(this.aY);
                    if (h2 != null) {
                        if (!(i2 != 0 && i2 != 4 && i2 != 7 && i2 != 9 && i2 != 10 || rs.d.k.a(null, n14 - 512))) {
                            if (Client.dU[4][this.aV[4]] == 10 || Client.dU[4][this.aV[4]] == 491769) {
                                h2.b(new int[]{4550}, -50);
                            } else {
                                object3 = Client.dV;
                                n17 = ((Object)object3).length;
                                for (n16 = 0; n16 < n17; ++n16) {
                                    object2 = object3[n16];
                                    if (Client.dU[4][this.aV[4]] != object2[0]) continue;
                                    h2.e(4550, (int)object2[1]);
                                }
                            }
                        }
                        if (rs.a.k.b(n14 - 512)) {
                            bl2 = true;
                            h2.ar = this.aS;
                            h2.I = this.aI;
                        }
                        hArray[n15++] = h2;
                    }
                }
                if (i2 != 1 || n3 <= 0) continue;
                rs.a.h.bG = i2;
                h2 = rs.d.k.f(n3).d(this.aY);
                if (h2 != null) {
                    hArray[n15++] = h2;
                }
                if (n3 != 28760 || (object3 = rs.d.k.f(28758).d(this.aY)) == null) continue;
                hArray[n15++] = object3;
            }
            rs.a.a.a a3 = rs.a.h.h;
            n14 = 0;
            rs.a.h.bG = -1;
            rs.a.h.e(false);
            object = new h(n15, hArray, a3);
            for (int i3 = 0; i3 < 5; ++i3) {
                if (this.aV[i3] == 0) continue;
                ((h)object).i(Client.dU[i3][0], Client.dU[i3][this.aV[i3]]);
                if (i3 == 4) {
                    ((h)object).i(Client.aZ[0], Client.dU[i3][this.aV[i3]]);
                }
                if (i3 != 1) continue;
                ((h)object).i(Client.fz[0], Client.fz[this.aV[i3]]);
            }
            ((h)object).n();
            if (rs.f.a.aQ) {
                ((h)object).b(84, 1000, -90, -580, -90, true);
            } else {
                ((h)object).b(64, 850, -30, -50, -30, true);
            }
            if (!rs.l.b.a.d.c) {
                rs.a.k.r().a((a)object, l2);
            }
            this.bB = l2;
        }
        if (this.aU || aK) {
            return object;
        }
        h h3 = rs.a.h.ac;
        h3.a((h)object, rs.k.g(n7) & rs.k.g(n8));
        if (n7 != -1 && n8 != -1 && bl) {
            h3.a(rs.d.a.a[this.F].i, n8, n7, this.F);
        } else if (n7 != -1) {
            h3.f(n7, this.F >= 0 && this.I == 0 && bl ? this.F : n5);
        }
        h3.k();
        h3.aM = null;
        h3.aL = null;
        return h3;
    }

    @Override
    public boolean l() {
        return this.bm;
    }

    public h n() {
        int n2;
        int n3;
        if (!this.bm) {
            return null;
        }
        if (this.q() && !rs.f.a.N) {
            return null;
        }
        if (this.aT != null) {
            return this.aT.b();
        }
        boolean bl = false;
        for (int i2 = 0; i2 < 12; ++i2) {
            n3 = this.br[i2];
            if (n3 >= 256 && n3 < 512 && !rs.d.j.b[n3 - 256].c()) {
                bl = true;
            }
            if (n3 < 512 || rs.d.k.f(n3 - 512).a(this.aY)) continue;
            bl = true;
        }
        if (this.bs > 0 && !rs.d.k.f(this.bs).a(this.aY)) {
            bl = true;
        }
        if (bl) {
            return null;
        }
        h[] hArray = new h[this.bs > 0 ? 13 : 12];
        n3 = 0;
        for (int i3 = 0; i3 < 12; ++i3) {
            h h2;
            n2 = this.br[i3];
            if (n2 >= 256 && n2 < 512 && (h2 = rs.d.j.b[n2 - 256].d()) != null) {
                for (int[] nArray : Client.dV) {
                    if (Client.dU[4][this.aV[4]] == 10 || Client.dU[4][this.aV[4]] == 491769) {
                        h2.b(new int[]{4550}, -50);
                        continue;
                    }
                    if (Client.dU[4][this.aV[4]] != nArray[0]) continue;
                    h2.e(4550, nArray[1]);
                }
                hArray[n3++] = h2;
            }
            if (n2 >= 512 && (h2 = rs.d.k.f(n2 - 512).b(this.aY)) != null) {
                hArray[n3++] = h2;
            }
            if (i3 != 1 || this.bs <= 0 || (h2 = rs.d.k.f(this.bs).b(this.aY)) == null) continue;
            hArray[n3++] = h2;
        }
        h h3 = new h(n3, hArray);
        for (n2 = 0; n2 < 5; ++n2) {
            if (this.aV[n2] == 0) continue;
            h3.i(Client.dU[n2][0], Client.dU[n2][this.aV[n2]]);
            if (n2 != 1) continue;
            h3.i(Client.fz[0], Client.fz[this.aV[n2]]);
        }
        return h3;
    }

    public k() {
        this.aV = new int[5];
        this.br = new int[12];
    }

    public String o() {
        return this.d(false);
    }

    public String d(boolean bl) {
        return this.a(bl, null);
    }

    public String a(boolean bl, String string) {
        String string2;
        String string3 = this.aZ;
        String string4 = string2 = bl ? "@bla@" : "@whi@";
        if (this.bb > 0) {
            if (this.bb == 1) {
                return "@red@" + this.ba + (string == null ? string2 : string) + " " + string3;
            }
            if (string != null) {
                return string + string3 + " @red@" + this.ba + string2;
            }
            return string3 + " @red@" + this.ba + string2;
        }
        return string != null ? string + this.aZ : this.aZ;
    }

    public String a(boolean bl, String string, String string2) {
        Object object;
        String string3 = this.aZ;
        Object object2 = object = bl ? "@bla@" : "@whi@";
        if (this.bb > 0) {
            if (string2 != null) {
                object = (String)object + string2;
            }
            if (this.bb == 1) {
                return "@red@" + this.ba + (String)object + " " + string3;
            }
            return string3 + " @red@" + this.ba + (String)object;
        }
        return string2 != null ? string2 + this.aZ : this.aZ;
    }

    public int p() {
        int n2 = this.w;
        int n3 = -1;
        if (this.br != null && this.br.length > 3) {
            n3 = this.br[3] - 512;
        }
        if (!(n2 != 244 || n3 != 21584 && n3 != 21585 && n3 != 21602 && n3 != 23908 && n3 != 24250 && n3 != 25555 && n3 != 25556 && n3 != 28187 || rs.f.a.aj)) {
            n2 = 808;
        }
        if (!(n2 != 247 || n3 != 21584 && n3 != 21585 && n3 != 21602 && n3 != 23908 && n3 != 24250 && n3 != 25555 && n3 != 25556 && n3 != 28187 || rs.f.a.aj)) {
            n2 = 819;
        }
        if (n2 == 7220 && !rs.f.a.aj) {
            n2 = 2074;
        }
        if (n2 == 7221 && !rs.f.a.aj) {
            n2 = 2077;
        }
        if (n2 == 7223 && !rs.f.a.aj) {
            n2 = 2076;
        }
        if (!(n2 != 7518 && n2 != 15512 || rs.f.a.aj)) {
            n2 = 1662;
        }
        if (!(n2 != 7520 && n2 != 15513 || rs.f.a.aj)) {
            n2 = 1663;
        }
        if (!(n2 != 7519 && n2 != 15514 || rs.f.a.aj)) {
            n2 = 1664;
        }
        if (!(n2 != 808 || n3 != 4151 && n3 != 25000 && n3 != 20523 && n3 != 20689 || rs.f.a.aj)) {
            n2 = 11973;
        }
        if (n2 == 2561 && !rs.f.a.aj) {
            n2 = 7047;
        }
        if (n2 == 824 && n3 == 4718 && !rs.f.a.aj) {
            n2 = 1664;
        }
        if (n2 == 809 && !rs.f.a.aj) {
            n2 = 813;
        }
        if (n2 == 1659 && !rs.f.a.aj) {
            n2 = 11974;
        }
        return n2;
    }

    public boolean q() {
        if (Client.eR != null) {
            return this == Client.eR;
        }
        return false;
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.aD = n2;
        this.aE = n3;
        this.aF = n4;
        this.aG = n5;
        this.aH = n6;
        this.aI = n7;
        this.aS = new int[1206];
        for (int i2 = 0; i2 < this.aS.length; ++i2) {
            this.aS[i2] = n2;
        }
        int[] nArray = new int[]{71, 73, 74, 75, 76, 77, 78, 84, 336, 340, 341, 364, 369, 370, 374, 375, 495, 496, 497, 498, 499, 500, 530, 531, 532, 533, 534, 548, 549, 596, 801, 802, 803, 831, 832, 833, 839, 840, 852, 853, 854, 855, 856, 857, 858, 862, 863, 865, 872, 873, 874, 875, 876, 877, 878, 879, 880, 912, 913, 914, 915, 916, 917, 918, 919, 950, 951, 952, 953, 954, 955, 956, 968, 969, 970, 971, 972, 973, 983, 986, 987, 988};
        int[] nArray2 = new int[]{46, 47, 48, 49, 50, 67, 68, 69, 70, 72, 79, 80, 81, 82, 83, 269, 270, 273, 274, 275, 276, 277, 278, 279, 280, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 307, 308, 339, 342, 357, 358, 359, 365, 366, 376, 377, 378, 379, 383, 409, 410, 423, 424, 434, 435, 436, 449, 450, 451, 454, 455, 462, 463, 464, 465, 473, 476, 477, 478, 482, 483, 484, 485, 486, 487, 488, 492, 493, 494, 501, 502, 508, 509, 510, 511, 526, 527, 528, 529, 544, 545, 546, 547, 550, 551, 561, 562, 563, 567, 568, 569, 570, 571, 572, 573, 574, 575, 597, 781, 799, 841, 842, 843, 844, 845, 846, 847, 848, 849, 882, 883, 884, 885, 896, 897, 904, 905, 908, 909, 923, 924, 925, 926, 927, 936, 940, 941, 942, 943, 957, 958, 959, 977, 982};
        int[] nArray3 = new int[]{111, 112, 166, 167, 183, 184, 217, 218, 228, 240, 241, 242, 243, 244, 253, 254, 262, 263, 287, 430, 470, 471, 589, 590, 815, 816, 817, 818, 819, 820, 859, 860, 861, 864, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 906, 907, 928, 929, 930, 931, 932, 933, 934, 935, 944, 945, 946, 947, 948, 949, 960, 961, 978, 989, 318, 319, 386, 413, 619, 620};
        int[] nArray4 = new int[]{113, 128, 129, 144, 145, 163, 164, 165, 168, 169, 170, 171, 176, 179, 180, 181, 182, 190, 191, 195, 196, 199, 200, 201, 202, 205, 206, 210, 211, 219, 220, 221, 224, 225, 229, 230, 238, 239, 249, 250, 251, 252, 255, 256, 257, 260, 264, 265, 284, 285, 286, 288, 291, 292, 293, 311, 396, 428, 429, 468, 469, 591, 628, 629, 630, 631, 632, 633, 634, 635, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 661, 662, 666, 667, 668, 669, 670, 671, 672, 673, 678, 692, 693, 702, 703, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 735, 736, 737, 738, 739, 740, 741, 743, 744, 745, 746, 749, 754, 755, 758, 759, 760, 761, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 1011, 1036, 1061};
        for (int n8 : nArray) {
            this.aS[n8] = n3;
        }
        for (int n8 : nArray2) {
            this.aS[n8] = n4;
        }
        for (int n8 : nArray3) {
            this.aS[n8] = n5;
        }
        for (int n8 : nArray4) {
            this.aS[n8] = n6;
        }
    }

    public static int[] b(int n2, int n3, int n4, int n5, int n6, int n7) {
        int[] nArray = new int[1206];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            nArray[i2] = n2;
        }
        int[] nArray2 = new int[]{71, 73, 74, 75, 76, 77, 78, 84, 336, 340, 341, 364, 369, 370, 374, 375, 495, 496, 497, 498, 499, 500, 530, 531, 532, 533, 534, 548, 549, 596, 801, 802, 803, 831, 832, 833, 839, 840, 852, 853, 854, 855, 856, 857, 858, 862, 863, 865, 872, 873, 874, 875, 876, 877, 878, 879, 880, 912, 913, 914, 915, 916, 917, 918, 919, 950, 951, 952, 953, 954, 955, 956, 968, 969, 970, 971, 972, 973, 983, 986, 987, 988};
        int[] nArray3 = new int[]{46, 47, 48, 49, 50, 67, 68, 69, 70, 72, 79, 80, 81, 82, 83, 269, 270, 273, 274, 275, 276, 277, 278, 279, 280, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 307, 308, 339, 342, 357, 358, 359, 365, 366, 376, 377, 378, 379, 383, 409, 410, 423, 424, 434, 435, 436, 449, 450, 451, 454, 455, 462, 463, 464, 465, 473, 476, 477, 478, 482, 483, 484, 485, 486, 487, 488, 492, 493, 494, 501, 502, 508, 509, 510, 511, 526, 527, 528, 529, 544, 545, 546, 547, 550, 551, 561, 562, 563, 567, 568, 569, 570, 571, 572, 573, 574, 575, 597, 781, 799, 841, 842, 843, 844, 845, 846, 847, 848, 849, 882, 883, 884, 885, 896, 897, 904, 905, 908, 909, 923, 924, 925, 926, 927, 936, 940, 941, 942, 943, 957, 958, 959, 977, 982};
        int[] nArray4 = new int[]{111, 112, 166, 167, 183, 184, 217, 218, 228, 240, 241, 242, 243, 244, 253, 254, 262, 263, 287, 430, 470, 471, 589, 590, 815, 816, 817, 818, 819, 820, 859, 860, 861, 864, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 906, 907, 928, 929, 930, 931, 932, 933, 934, 935, 944, 945, 946, 947, 948, 949, 960, 961, 978, 989, 318, 319, 386, 413, 619, 620};
        int[] nArray5 = new int[]{113, 128, 129, 144, 145, 163, 164, 165, 168, 169, 170, 171, 176, 179, 180, 181, 182, 190, 191, 195, 196, 199, 200, 201, 202, 205, 206, 210, 211, 219, 220, 221, 224, 225, 229, 230, 238, 239, 249, 250, 251, 252, 255, 256, 257, 260, 264, 265, 284, 285, 286, 288, 291, 292, 293, 311, 396, 428, 429, 468, 469, 591, 628, 629, 630, 631, 632, 633, 634, 635, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 661, 662, 666, 667, 668, 669, 670, 671, 672, 673, 678, 692, 693, 702, 703, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 735, 736, 737, 738, 739, 740, 741, 743, 744, 745, 746, 749, 754, 755, 758, 759, 760, 761, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 1011, 1036, 1061};
        for (int n8 : nArray2) {
            nArray[n8] = n3;
        }
        for (int n8 : nArray3) {
            nArray[n8] = n4;
        }
        for (int n8 : nArray4) {
            nArray[n8] = n5;
        }
        for (int n8 : nArray5) {
            nArray[n8] = n6;
        }
        return nArray;
    }

    public static f_0 r() {
        return !aJ ? aL : aO;
    }

    public static f_0 s() {
        return !aJ ? aM : aP;
    }

    public static f_0 t() {
        return !aJ ? aN : aQ;
    }

    public static boolean u() {
        return true;
    }

    public static void v() {
        aL.a();
        aM.a();
        aN.a();
        aO.a();
        aP.a();
        aQ.a();
    }
}

