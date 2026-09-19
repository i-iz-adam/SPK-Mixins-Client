/*
 * Decompiled with CFR 0.152.
 */
package rs.k;

import rs.Client;
import rs.a.a;
import rs.a.h;
import rs.d.r;
import rs.gui.Launcher;
import rs.h_0;
import rs.i_0;
import rs.j_0;
import rs.k.c;
import rs.k.d;
import rs.k.e;
import rs.m;
import rs.runelite.a.i;
import rs.t_0;
import rs.u_0;
import rs.v_0;

class l {
    final int a = 10;
    int b = (int)System.nanoTime();
    private int c;
    private int d;
    private int e;
    private int f;
    private static int[] g;
    private static char[] h;
    private static char[][] i;
    private static float[] j;
    private static float[] k;
    private static int[] l;
    private static int[] m;
    private static int[] n;
    private static int[] o;
    private static int[] p;
    private static int[] q;
    private static int[] r;
    private static int[][] s;

    l() {
    }

    void a(v_0 v_02, d d2, c c2) {
        ++this.b;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        d2.b();
        c2.b();
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 104; ++i3) {
                for (int i4 = 0; i4 < 104; ++i4) {
                    h_0 h_02 = v_02.c()[i2][i3][i4];
                    if (h_02 == null) continue;
                    this.a(h_02, d2, c2);
                }
            }
        }
        if (rs.f.a.d.booleanValue()) {
            System.out.println();
            System.out.println("Objects loaded: " + this.e + " (reloadAttempts=" + this.f + "\tobj_type=" + rs.d.r.E.name() + ")");
        }
        if (this.e == 0) {
            if (rs.f.a.d.booleanValue()) {
                System.out.println("..checking reload validity");
            }
            if (this.f < 10 && rs.d.r.E == r.a.d) {
                if (rs.f.a.d.booleanValue()) {
                    System.out.println("..attempting reload");
                }
                rs.h.c.a(() -> {
                    Launcher.n().o();
                    Client.ee = 1;
                });
                ++this.f;
            }
        } else {
            if (rs.f.a.d.booleanValue()) {
                System.out.println("..reset attempt counter");
            }
            this.f = 0;
        }
    }

    private void a(h_0 h_02, d d2, c c2) {
        rs.l[] lArray;
        Object object;
        Object object2;
        u_0 u_02;
        int n2;
        Object object3;
        j_0 j_02;
        h_0 h_03 = h_02.d();
        if (h_03 != null) {
            this.a(h_03, d2, c2);
        }
        if ((j_02 = h_02.a()) != null) {
            j_02.a(this.c);
            if (j_02.e() != -1) {
                j_02.b(this.d);
            } else {
                j_02.b(-1);
            }
            object3 = new i(h_02.k(), h_02.l());
            n2 = this.a(j_02, h_02.j(), ((i)object3).a(), ((i)object3).b(), d2, c2, false);
            j_02.c(n2);
            this.c += n2;
            if (j_02.e() != -1) {
                this.d += n2;
            }
        }
        if ((object3 = h_02.c()) != null) {
            ((i_0)object3).a(this.c);
            if (((i_0)object3).g() != null) {
                ((i_0)object3).b(this.d);
            } else {
                ((i_0)object3).b(-1);
            }
            n2 = this.a((i_0)object3, h_02.k(), h_02.l(), d2, c2);
            ((i_0)object3).c(n2);
            this.c += n2;
            if (((i_0)object3).g() != null) {
                this.d += n2;
            }
        }
        if ((u_02 = h_02.e()) != null) {
            object2 = u_02.a();
            if (object2 instanceof h) {
                this.a((h)object2, d2, c2);
            }
            if ((object = u_02.b()) instanceof h) {
                this.a((h)object, d2, c2);
            }
        }
        if ((object2 = h_02.g()) != null && (object = ((m)object2).a()) instanceof h) {
            this.a((h)object, d2, c2);
        }
        if ((object = h_02.f()) != null && (lArray = ((t_0)object).a()) instanceof h) {
            this.a((h)lArray, d2, c2);
        }
        for (rs.l l2 : lArray = h_02.i()) {
            a a2;
            if (l2 == null || !((a2 = l2.a()) instanceof h)) continue;
            this.a((h)l2.a(), d2, c2);
            ++this.e;
        }
    }

    public int a(j_0 j_02, int n2, int n3, int n4, d d2, c c2, boolean bl) {
        int[][][] nArray = Launcher.n().o().aQ();
        int n5 = bl ? 128 * n3 : 0;
        int n6 = bl ? 128 * n4 : 0;
        int n7 = nArray[n2][n3][n4];
        int n8 = nArray[n2][n3 + 1][n4];
        int n9 = nArray[n2][n3 + 1][n4 + 1];
        int n10 = nArray[n2][n3][n4 + 1];
        int n11 = j_02.c();
        int n12 = j_02.d();
        int n13 = j_02.b();
        int n14 = j_02.a();
        if (n11 == 12345678) {
            return 0;
        }
        d2.a(24);
        c2.a(24);
        int n15 = n5;
        int n16 = n6;
        int n17 = n7;
        int n18 = n14;
        int n19 = n5 + 128;
        int n20 = n6;
        int n21 = n8;
        int n22 = n13;
        int n23 = n5 + 128;
        int n24 = n6 + 128;
        int n25 = n9;
        int n26 = n11;
        int n27 = n5;
        int n28 = n6 + 128;
        int n29 = n10;
        int n30 = n12;
        d2.a(n23, n25, n24, n26);
        d2.a(n27, n29, n28, n30);
        d2.a(n19, n21, n20, n22);
        d2.a(n15, n17, n16, n18);
        d2.a(n19, n21, n20, n22);
        d2.a(n27, n29, n28, n30);
        if (bl || j_02.e() != -1) {
            float f2 = (float)j_02.e() + 1.0f;
            c2.a(f2, 1.0f, 1.0f, 0.0f);
            c2.a(f2, 0.0f, 1.0f, 0.0f);
            c2.a(f2, 1.0f, 0.0f, 0.0f);
            c2.a(f2, 0.0f, 0.0f, 0.0f);
            c2.a(f2, 1.0f, 0.0f, 0.0f);
            c2.a(f2, 0.0f, 1.0f, 0.0f);
        }
        return 6;
    }

    private int a(i_0 i_02, int n2, int n3, d d2, c c2) {
        int[] nArray = i_02.h();
        int[] nArray2 = i_02.i();
        int[] nArray3 = i_02.j();
        int[] nArray4 = i_02.d();
        int[] nArray5 = i_02.e();
        int[] nArray6 = i_02.f();
        int[] nArray7 = i_02.k();
        int[] nArray8 = i_02.l();
        int[] nArray9 = i_02.m();
        int[] nArray10 = i_02.g();
        int n4 = nArray.length;
        d2.a(n4 * 12);
        c2.a(n4 * 12);
        int n5 = 128 * n2;
        int n6 = 128 * n3;
        int n7 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n8 = nArray[i2];
            int n9 = nArray2[i2];
            int n10 = nArray3[i2];
            int n11 = nArray7[i2];
            int n12 = nArray8[i2];
            int n13 = nArray9[i2];
            if (n11 == 12345678) continue;
            n7 += 3;
            int n14 = nArray4[n8] - n5;
            int n15 = nArray6[n8] - n6;
            int n16 = nArray4[n9] - n5;
            int n17 = nArray6[n9] - n6;
            int n18 = nArray4[n10] - n5;
            int n19 = nArray6[n10] - n6;
            d2.a(n14, nArray5[n8], n15, n11);
            d2.a(n16, nArray5[n9], n17, n12);
            d2.a(n18, nArray5[n10], n19, n13);
            if (nArray10 == null) continue;
            if (nArray10[i2] != -1) {
                float f2 = (float)nArray10[i2] + 1.0f;
                c2.a(f2, (float)n14 / 128.0f, (float)n15 / 128.0f, 0.0f);
                c2.a(f2, (float)n16 / 128.0f, (float)n17 / 128.0f, 0.0f);
                c2.a(f2, (float)n18 / 128.0f, (float)n19 / 128.0f, 0.0f);
                continue;
            }
            c2.a(0.0f, 0.0f, 0.0f, 0.0f);
            c2.a(0.0f, 0.0f, 0.0f, 0.0f);
            c2.a(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return n7;
    }

    int a(j_0 j_02, int n2, int n3, int n4, d d2, c c2, int n5, int n6, boolean bl) {
        int[][][] nArray = Launcher.n().o().aQ();
        int n7 = n5;
        int n8 = n6;
        int n9 = nArray[n2][n3][n4];
        int n10 = nArray[n2][n3 + 1][n4];
        int n11 = nArray[n2][n3 + 1][n4 + 1];
        int n12 = nArray[n2][n3][n4 + 1];
        int n13 = j_02.c();
        int n14 = j_02.d();
        int n15 = j_02.b();
        int n16 = j_02.a();
        if (n13 == 12345678) {
            return 0;
        }
        d2.a(24);
        c2.a(24);
        int n17 = n7;
        int n18 = n8;
        int n19 = n9;
        int n20 = n16;
        int n21 = n7 + 128;
        int n22 = n8;
        int n23 = n10;
        int n24 = n15;
        int n25 = n7 + 128;
        int n26 = n8 + 128;
        int n27 = n11;
        int n28 = n13;
        int n29 = n7;
        int n30 = n8 + 128;
        int n31 = n12;
        int n32 = n14;
        d2.a(n25, n27, n26, n28);
        d2.a(n29, n31, n30, n32);
        d2.a(n21, n23, n22, n24);
        d2.a(n17, n19, n18, n20);
        d2.a(n21, n23, n22, n24);
        d2.a(n29, n31, n30, n32);
        if (bl || j_02.e() != -1) {
            float f2 = (float)j_02.e() + 1.0f;
            c2.a(f2, 1.0f, 1.0f, 0.0f);
            c2.a(f2, 0.0f, 1.0f, 0.0f);
            c2.a(f2, 1.0f, 0.0f, 0.0f);
            c2.a(f2, 0.0f, 0.0f, 0.0f);
            c2.a(f2, 1.0f, 0.0f, 0.0f);
            c2.a(f2, 0.0f, 1.0f, 0.0f);
        }
        return 6;
    }

    private void a(h h2, d d2, c c2) {
        if (h2.t() > 0) {
            return;
        }
        h2.n(this.c);
        if (rs.k.e.a && (h2.Y != null || h2.d())) {
            h2.o(this.d);
        } else {
            h2.o(-1);
        }
        h2.m(this.b);
        d2.a(h2.ah * 12);
        c2.a(h2.ah * 12);
        int n2 = h2.ah;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 += this.a(h2, i2, d2, c2);
        }
        this.c += n3;
        if (rs.k.e.a && (h2.Y != null || h2.d())) {
            this.d += n3;
        }
    }

    int a(h h2, int n2, d d2, c c2) {
        int[] nArray = h2.ae;
        int[] nArray2 = h2.af;
        int[] nArray3 = h2.ag;
        int[] nArray4 = h2.ai;
        int[] nArray5 = h2.aj;
        int[] nArray6 = h2.ak;
        int[] nArray7 = h2.al;
        int[] nArray8 = h2.am;
        int[] nArray9 = h2.an;
        int[] nArray10 = h2.aq;
        short[] sArray = h2.Y;
        int[] nArray11 = h2.ap;
        byte by = h2.V;
        byte by2 = h2.S;
        byte by3 = h2.T;
        byte by4 = h2.U;
        boolean bl = h2.d();
        int n3 = nArray4[n2];
        int n4 = nArray5[n2];
        int n5 = nArray6[n2];
        int n6 = nArray7[n2];
        int n7 = nArray8[n2];
        int n8 = nArray9[n2];
        int n9 = 65535;
        boolean bl2 = false;
        int n10 = 0;
        if (nArray10 != null && (sArray == null || sArray[n2] == -1)) {
            n10 = (nArray10[n2] & 0xFF) << 24;
            if (nArray10[n2] == 255) {
                n8 = -2;
            }
        }
        int n11 = 0;
        if (nArray11 != null) {
            n11 = (nArray11[n2] & 0xFF) << 16;
        }
        if (n8 == -1) {
            n7 = n8 = n6;
        } else if (n8 == -2) {
            d2.a(0, 0, 0, 0);
            d2.a(0, 0, 0, 0);
            d2.a(0, 0, 0, 0);
            if (rs.k.e.a && (sArray != null || bl)) {
                c2.a(0.0f, 0.0f, 0.0f, 0.0f);
                c2.a(0.0f, 0.0f, 0.0f, 0.0f);
                c2.a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            return 3;
        }
        if ((sArray == null || sArray[n2] == -1) && by > 0) {
            n6 = rs.k.l.a(n6, by2, by3, by4, by);
            n7 = rs.k.l.a(n7, by2, by3, by4, by);
            n8 = rs.k.l.a(n8, by2, by3, by4, by);
        }
        int n12 = nArray[n3];
        int n13 = nArray2[n3];
        int n14 = nArray3[n3];
        d2.a(n12, n13, n14, n10 | n11 | (bl2 ? n9 : n6));
        n12 = nArray[n4];
        n13 = nArray2[n4];
        n14 = nArray3[n4];
        d2.a(n12, n13, n14, n10 | n11 | (bl2 ? n9 : n7));
        n12 = nArray[n5];
        n13 = nArray2[n5];
        n14 = nArray3[n5];
        d2.a(n12, n13, n14, n10 | n11 | (bl2 ? n9 : n8));
        if (rs.k.e.a && (sArray != null || h2.d())) {
            try {
                if (h2.e() != null) {
                    float f2 = 0.0f;
                    f2 = h2.d() && (sArray == null || sArray[n2] <= 0) ? (h2.ao == null ? 0.0f : ((h2.ao[n2] & 1) == 1 ? (h2.ao[n2] >= 3 ? (h2.ao[n2] > 0 ? (float)h2.ar[n2] + 1.0f : 0.0f) : 0.0f) : (h2.ao[n2] > 0 ? (float)h2.ar[n2] + 1.0f : 0.0f))) : (float)sArray[n2] + 1.0f;
                    c2.a(f2, h2.a(n2, 0), h2.b(n2, 0), 0.0f);
                    c2.a(f2, h2.a(n2, 1), h2.b(n2, 1), 0.0f);
                    c2.a(f2, h2.a(n2, 2), h2.b(n2, 2), 0.0f);
                } else {
                    c2.a(0.0f, 0.0f, 0.0f, 0.0f);
                    c2.a(0.0f, 0.0f, 0.0f, 0.0f);
                    c2.a(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                h2.l = false;
            }
        }
        return 3;
    }

    private static int a(int n2, byte by, byte by2, byte by3, byte by4) {
        int n3 = n2 >> 10 & 0x3F;
        int n4 = n2 >> 7 & 7;
        int n5 = n2 & 0x7F;
        int n6 = by4 & 0xFF;
        if (by != -1) {
            n3 += n6 * (by - n3) >> 7;
        }
        if (by2 != -1) {
            n4 += n6 * (by2 - n4) >> 7;
        }
        if (by3 != -1) {
            n5 += n6 * (by3 - n5) >> 7;
        }
        return (n3 << 10 | n4 << 7 | n5) & 0xFFFF;
    }

    void a() {
        int n2 = 6500;
        int n3 = 6000;
        g = new int[n2];
        h = new char[n3];
        i = new char[n3][512];
        j = new float[n2];
        k = new float[n2];
        l = new int[n2];
        m = new int[n2];
        n = new int[n2];
        o = new int[12];
        p = new int[2000];
        q = new int[2000];
        r = new int[12];
        s = new int[12][2000];
    }

    void b() {
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
    }
}

