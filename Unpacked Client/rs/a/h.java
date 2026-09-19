/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.a.b.a.b
 */
package rs.a;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rs.Client;
import rs.a.a.a;
import rs.a.a.c;
import rs.a.d;
import rs.a.i;
import rs.c_0;
import rs.gui.Launcher;
import rs.k;
import rs.k_0;
import rs.l.e_0;
import rs.r.b;
import rs.r.j_0;
import rs.runelite.a.m;
import rs.runelite.a.o;
import rs.s_0;
import rs.u.g;
import rs.u.j;
import rs.v;
import rs.x.e;

public class h
extends rs.a.a {
    public static a h = new a(false);
    public a i = rs.a.h.h;
    public static int j = 30000;
    public int k;
    public boolean l = false;
    public transient float[] m;
    private int bJ;
    public int n;
    public static v[] o;
    public static boolean[] p;
    public int q = 0;
    public int r = 0;
    public static int[] s;
    public static int[] t;
    public static int[] u;
    public static String v;
    public static String w;
    public static String x;
    public static String y;
    public boolean z = false;
    public boolean A = false;
    public int B = 0;
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public boolean F = false;
    public boolean G;
    public static int H;
    public int I = -1;
    public int J = 0;
    public short K = (short)256;
    public int[] L;
    public byte[] M;
    public boolean N = false;
    public int O = 20;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public byte S;
    public byte T;
    public byte U;
    public byte V;
    public int[][] W;
    public int[][] X;
    public short[] Y;
    public short[] Z;
    public byte[] aa;
    private int bK;
    private boolean bL;
    private int bM;
    private int bN;
    private boolean bO;
    private static int bP;
    public static int ab;
    public static h ac;
    private static int[] bQ;
    private static byte[] bR;
    private static int[] bS;
    private static int[] bT;
    private static int[] bU;
    private static int[] bV;
    public int ad;
    public int[] ae;
    public int[] af;
    public int[] ag;
    public int ah;
    public int[] ai;
    public int[] aj;
    public int[] ak;
    public int[] al;
    public int[] am;
    public int[] an;
    public int[] ao;
    public int[] ap;
    public int[] aq;
    public int[] ar;
    public boolean[] as;
    public boolean[] at;
    public int au;
    public int av;
    public int[] aw;
    public int[] ax;
    public int[] ay;
    public int az;
    public int aA;
    public int aB;
    public int aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public int aH;
    public int aI;
    public int[] aJ;
    public int[] aK;
    public int[][] aL;
    public int[][] aM;
    public boolean aN;
    public s_0 aO;
    public s_0 aP;
    public d aQ;
    static com.a.b.a.b aR;
    static com.a.b.a.b aS;
    static com.a.b.a.b aT;
    static rs.cache.e aU;
    static int aV;
    static final int aW = 8192;
    static boolean[] aX;
    static boolean[] aY;
    static int[] aZ;
    static int[] ba;
    static int[] bb;
    static int[] bc;
    static int[] bd;
    static int[] be;
    static int[] bf;
    static int[] bg;
    static int[][] bh;
    static int[] bi;
    static int[][] bj;
    static int[] bk;
    static int[] bl;
    static int[] bm;
    static int[] bn;
    static int[] bo;
    static int[] bp;
    static int bq;
    static int br;
    static int bs;
    public static boolean bt;
    public static int bu;
    public static int bv;
    public static int bw;
    public static int[] bx;
    public static int[] by;
    public static int[] bz;
    public static int[] bA;
    public static int[] bB;
    static int[] bC;
    static int[] bD;
    public static boolean bE;
    public static boolean bF;
    public static int bG;
    HashMap<Integer, rs.runelite.a.a> bH;
    public int bI;

    public boolean d() {
        return this.av > 0;
    }

    public boolean a(int n2) {
        if (!this.d() || this.ao == null || n2 >= this.ao.length) {
            return false;
        }
        if (this.ao[n2] <= 0) {
            return false;
        }
        if ((this.ao[n2] & 1) == 1 && this.ao[n2] < 3) {
            return false;
        }
        return this.ao[n2] > 0;
    }

    public float a(int n2, int n3) {
        return this.m[this.c(n2, n3)];
    }

    public float b(int n2, int n3) {
        return this.m[this.d(n2, n3)];
    }

    public int c(int n2, int n3) {
        return n2 * 6 + n3;
    }

    public int d(int n2, int n3) {
        return n2 * 6 + n3 + 3;
    }

    public float[] e() {
        return this.m;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void f() {
        if (!rs.k.e.a()) {
            return;
        }
        if (this.m != null) {
            return;
        }
        if (this.Z == null && !this.d()) {
            return;
        }
        if (this.i.f()) {
            this.i.c();
            this.m = this.i.n;
        } else {
            this.m = new float[this.ah * 6];
        }
        for (int i2 = 0; i2 < this.ah; ++i2) {
            int n2;
            int n3;
            int n4;
            boolean bl;
            int n5 = this.Y == null ? -1 : this.Y[i2] & 0xFFFF;
            boolean bl2 = bl = this.ao != null && (n5 == -1 || this.Y != null && this.Y[i2] <= 0) && this.a(i2);
            if (bl) {
                n5 = this.ar[i2];
            }
            this.m[this.c((int)i2, (int)0)] = 1.0f;
            this.m[this.d((int)i2, (int)0)] = 1.0f;
            this.m[this.c((int)i2, (int)1)] = 1.0f;
            this.m[this.d((int)i2, (int)1)] = 1.0f;
            this.m[this.c((int)i2, (int)2)] = 0.0f;
            this.m[this.d((int)i2, (int)2)] = 0.0f;
            if (this.aq != null && this.aq[i2] == 255) {
                n5 = -1;
            }
            if (n5 == -1) continue;
            int n6 = -1;
            n6 = bl ? this.ao[i2] >> 2 : (this.Z != null && this.Z[i2] != -1 ? this.Z[i2] : this.ai[i2]);
            if (bl && this.aw[this.ao[i2] >> 2] > this.ae.length) {
                n6 = this.ai[i2];
                bl = false;
            }
            if (n6 == -1) continue;
            int n7 = this.ai[i2];
            int n8 = this.aj[i2];
            int n9 = this.ak[i2];
            if (bl) {
                n4 = this.aw[this.ao[i2] >> 2];
                n3 = this.ax[this.ao[i2] >> 2];
                n2 = this.ay[this.ao[i2] >> 2];
            } else if (this.Z != null && this.Z[i2] >= 0) {
                if (this.aw.length <= 0) return;
                n4 = this.aw[this.Z[i2]];
                n3 = this.ax[this.Z[i2]];
                n2 = this.ay[this.Z[i2]];
            } else {
                n4 = this.ai[i2];
                n3 = this.aj[i2];
                n2 = this.ak[i2];
            }
            float f2 = this.ae[n4];
            float f3 = this.af[n4];
            float f4 = this.ag[n4];
            float f5 = (float)this.ae[n3] - f2;
            float f6 = (float)this.af[n3] - f3;
            float f7 = (float)this.ag[n3] - f4;
            float f8 = (float)this.ae[n2] - f2;
            float f9 = (float)this.af[n2] - f3;
            float f10 = (float)this.ag[n2] - f4;
            float f11 = (float)this.ae[n7] - f2;
            float f12 = (float)this.af[n7] - f3;
            float f13 = (float)this.ag[n7] - f4;
            float f14 = (float)this.ae[n8] - f2;
            float f15 = (float)this.af[n8] - f3;
            float f16 = (float)this.ag[n8] - f4;
            float f17 = (float)this.ae[n9] - f2;
            float f18 = (float)this.af[n9] - f3;
            float f19 = (float)this.ag[n9] - f4;
            float f20 = f6 * f10 - f7 * f9;
            float f21 = f7 * f8 - f5 * f10;
            float f22 = f5 * f9 - f6 * f8;
            float f23 = f9 * f22 - f10 * f21;
            float f24 = f10 * f20 - f8 * f22;
            float f25 = f8 * f21 - f9 * f20;
            float f26 = 1.0f / (f23 * f5 + f24 * f6 + f25 * f7);
            this.m[this.c((int)i2, (int)0)] = (f23 * f11 + f24 * f12 + f25 * f13) * f26;
            this.m[this.c((int)i2, (int)1)] = (f23 * f14 + f24 * f15 + f25 * f16) * f26;
            this.m[this.c((int)i2, (int)2)] = (f23 * f17 + f24 * f18 + f25 * f19) * f26;
            f23 = f6 * f22 - f7 * f21;
            f24 = f7 * f20 - f5 * f22;
            f25 = f5 * f21 - f6 * f20;
            f26 = 1.0f / (f23 * f8 + f24 * f9 + f25 * f10);
            this.m[this.d((int)i2, (int)0)] = (f23 * f11 + f24 * f12 + f25 * f13) * f26;
            this.m[this.d((int)i2, (int)1)] = (f23 * f14 + f24 * f15 + f25 * f16) * f26;
            this.m[this.d((int)i2, (int)2)] = (f23 * f17 + f24 * f18 + f25 * f19) * f26;
        }
        this.l = true;
    }

    public static void g() {
        o = null;
        aX = null;
        aY = null;
        ba = null;
        bb = null;
        bd = null;
        be = null;
        bf = null;
        bg = null;
        bh = null;
        bi = null;
        bj = null;
        bk = null;
        bl = null;
        bm = null;
        bA = null;
        bB = null;
        bC = null;
        bD = null;
    }

    public m a(int n2, int n3, int n4, int n5) {
        int[] nArray = new int[this.z()];
        int[] nArray2 = new int[this.z()];
        rs.runelite.a.h.a(this.z(), n2, n3, n5, n4, this.A(), this.C(), this.B(), nArray, nArray2);
        return rs.runelite.a.e.a(nArray, nArray2);
    }

    public Polygon b(int n2, int n3, int n4, int n5) {
        ArrayList<o> arrayList = new ArrayList<o>();
        for (int i2 = 0; i2 < this.ad; ++i2) {
            int n6 = this.ae[i2];
            int n7 = this.af[i2];
            int n8 = this.ag[i2];
            o o2 = new o(n6, n7, n8);
            o2 = o2.a(n5);
            arrayList.add(o2);
        }
        List<rs.runelite.a.i> list = new ArrayList<rs.runelite.a.i>();
        for (o o3 : arrayList) {
            rs.runelite.a.i i3 = c_0.a(Launcher.n().o(), n2 - o3.a(), n3 - o3.c(), n4 + o3.b());
            if (i3 == null) continue;
            list.add(i3);
        }
        if ((list = c_0.a(list)) == null) {
            return null;
        }
        Polygon polygon = new Polygon();
        for (rs.runelite.a.i i4 : list) {
            polygon.addPoint(i4.a(), i4.b());
        }
        return polygon;
    }

    public void a(int n2, int n3, byte by) {
        this.L[n2] = n3;
        this.M[n2] = by;
    }

    public void e(int n2, int n3) {
        int n4;
        int n5 = 0;
        int n6 = 0;
        if (this.ar == null) {
            return;
        }
        for (n4 = 0; n4 < this.ar.length; ++n4) {
            if (n2 != this.ar[n4]) continue;
            ++n5;
        }
        this.av = n5;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[n5];
        }
        this.aw = new int[n5];
        this.ax = new int[n5];
        this.ay = new int[n5];
        this.as = new boolean[this.ah];
        n4 = 0;
        for (int i2 = 0; i2 < this.ah; ++i2) {
            if (n2 != this.ar[i2]) continue;
            this.ar[i2] = n3;
            this.ao[i2] = 3 + n6;
            this.as[i2] = true;
            n6 += 4;
            this.aw[n4] = this.ai[i2];
            this.ax[n4] = this.aj[i2];
            this.ay[n4] = this.ak[i2];
            ++n4;
        }
    }

    public void a(int[] nArray, int n2) {
        int n3;
        int n4 = 0;
        int n5 = 0;
        for (n3 = 0; n3 < this.ar.length; ++n3) {
            for (int n6 : nArray) {
                if (n6 != this.ar[n3]) continue;
                ++n4;
            }
        }
        this.av = n4;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[n4];
        }
        this.aw = new int[n4];
        this.ax = new int[n4];
        this.ay = new int[n4];
        n3 = 0;
        for (int i2 = 0; i2 < this.ah; ++i2) {
            for (int n7 : nArray) {
                if (n7 != this.ar[i2]) continue;
                this.ar[i2] = n2;
                this.ao[i2] = 3 + n5;
                n5 += 4;
                this.aw[n3] = this.ai[i2];
                this.ax[n3] = this.aj[i2];
                this.ay[n3] = this.ak[i2];
                ++n3;
            }
        }
    }

    public void h() {
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
        int n2 = 0;
        Object object = "";
        for (int i2 = 0; i2 < this.ah; ++i2) {
            if (hashMap.get(this.ar[i2]) != null) continue;
            object = (String)object + this.ar[i2] + ",";
            hashMap.put(this.ar[i2], true);
            ++n2;
        }
        System.out.println();
        System.out.println((String)object);
        System.out.println("Total colors: " + (n2 + 1));
        System.out.println();
    }

    public void a(Map<Integer, Boolean> map) {
        try {
            int n2 = 0;
            Object object = "";
            for (int i2 = 0; i2 < this.ah; ++i2) {
                if (map.get(this.ar[i2]) != null) continue;
                object = (String)object + this.ar[i2] + ",";
                map.put(this.ar[i2], true);
                ++n2;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void a(int[] nArray) {
        int n2 = 0;
        for (int i2 = 0; i2 < this.ah; ++i2) {
            this.ar[i2] = nArray[n2++];
            if (n2 < nArray.length) continue;
            n2 = 0;
        }
    }

    public void a(int n2, int[] nArray) {
        int n3 = 0;
        for (int i2 = 0; i2 < this.ah; ++i2) {
            if (n2 != this.ar[i2]) continue;
            this.ar[i2] = nArray[n3++];
            if (n3 < nArray.length) continue;
            n3 = 0;
        }
    }

    public void a(int[] nArray, int[] nArray2) {
        int n2 = 0;
        for (int i2 = 0; i2 < this.ah; ++i2) {
            for (int n3 : nArray) {
                if (n3 != this.ar[i2]) continue;
                this.ar[i2] = nArray2[n2++];
                if (n2 < nArray2.length) continue;
                n2 = 0;
            }
        }
    }

    public void b(int[] nArray, int[] nArray2) {
        int n2;
        int n3;
        int n4;
        int n5 = 0;
        int n6 = 0;
        for (n4 = 0; n4 < this.ar.length; ++n4) {
            int[] nArray3 = nArray;
            n3 = nArray3.length;
            for (n2 = 0; n2 < n3; ++n2) {
                int n7 = nArray3[n2];
                if (n7 != this.ar[n4]) continue;
                ++n5;
            }
        }
        this.av = n5;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[n5];
        }
        this.aw = new int[n5];
        this.ax = new int[n5];
        this.ay = new int[n5];
        n4 = 0;
        for (int i2 = 0; i2 < this.ah; ++i2) {
            for (n3 = 0; n3 < nArray.length; ++n3) {
                n2 = nArray[n3];
                if (n2 != this.ar[i2]) continue;
                this.ar[i2] = nArray2[n3];
                this.ao[i2] = 3 + n6;
                n6 += 4;
                this.aw[n4] = this.ai[i2];
                this.ax[n4] = this.aj[i2];
                this.ay[n4] = this.ak[i2];
                ++n4;
            }
        }
    }

    public void b(int n2) {
        this.av = this.ah;
        int n3 = 0;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[this.ah];
        }
        this.aw = new int[this.ah];
        this.ax = new int[this.ah];
        this.ay = new int[this.ah];
        for (int i2 = 0; i2 < this.ah; ++i2) {
            this.ar[i2] = n2;
            this.ao[i2] = 3 + n3;
            n3 += 4;
            this.aw[i2] = this.ai[i2];
            this.ax[i2] = this.aj[i2];
            this.ay[i2] = this.ak[i2];
        }
    }

    public void b(int[] nArray) {
        this.av = this.ah;
        int n2 = 0;
        if (this.ao == null) {
            this.ao = new int[this.ah];
        }
        if (this.ar == null) {
            this.ar = new int[this.ah];
        }
        this.aw = new int[this.ah];
        this.ax = new int[this.ah];
        this.ay = new int[this.ah];
        int n3 = 0;
        for (int i2 = 0; i2 < this.ah; ++i2) {
            n3 = n3 >= nArray.length - 1 ? 0 : ++n3;
            this.ar[i2] = nArray[n3];
            this.ao[i2] = 3 + n2;
            n2 += 4;
            this.aw[i2] = this.ai[i2];
            this.ax[i2] = this.aj[i2];
            this.ay[i2] = this.ak[i2];
        }
    }

    public void a(byte[] byArray, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        e e2 = new e(byArray);
        e e3 = new e(byArray);
        e e4 = new e(byArray);
        e e5 = new e(byArray);
        e e6 = new e(byArray);
        e e7 = new e(byArray);
        e e8 = new e(byArray);
        e2.h = byArray.length - 26;
        int n11 = e2.o();
        int n12 = e2.o();
        int n13 = e2.y();
        int n14 = e2.y();
        int n15 = e2.y();
        int n16 = e2.y();
        int n17 = e2.y();
        int n18 = e2.y();
        int n19 = e2.y();
        int n20 = e2.y();
        int n21 = e2.o();
        int n22 = e2.o();
        int n23 = e2.o();
        int n24 = e2.o();
        int n25 = e2.o();
        int n26 = e2.o();
        int n27 = 0;
        int n28 = 0;
        int n29 = 0;
        byte[] byArray2 = new byte[]{};
        if (n13 > 0) {
            byArray2 = new byte[n13];
            e2.h = 0;
            for (n10 = 0; n10 < n13; ++n10) {
                byArray2[n10] = e2.z();
                n9 = byArray2[n10];
                if (n9 == 0) {
                    ++n27;
                }
                if (n9 >= 1 && n9 <= 3) {
                    ++n28;
                }
                if (n9 != 2) continue;
                ++n29;
            }
        }
        n9 = n10 = n13 + n11;
        if (n14 == 1) {
            n10 += n12;
        }
        int n30 = n10;
        int n31 = n10 += n12;
        if (n15 == 255) {
            n10 += n12;
        }
        int n32 = n10;
        if (n17 == 1) {
            n10 += n12;
        }
        int n33 = n10;
        int n34 = n10 += n26;
        if (n16 == 1) {
            n10 += n12;
        }
        int n35 = n10;
        int n36 = n10 += n24;
        if (n18 == 1) {
            n10 += n12 * 2;
        }
        int n37 = n10;
        int n38 = n10 += n25;
        int n39 = n10 += n12 * 2;
        int n40 = n10 += n21;
        int n41 = n10 += n22;
        int n42 = n10 += n23;
        int n43 = n10 += n27 * 6;
        int n44 = n10 += n28 * 6;
        int n45 = n10 += n28 * 6;
        int n46 = n10 += n28 * 2;
        int n47 = n10 += n28;
        n10 = n10 + n28 * 2 + n29 * 2;
        this.L = new int[n11];
        this.M = new byte[n11];
        this.ad = n11;
        this.ah = n12;
        this.av = n13;
        this.ae = new int[n11];
        this.af = new int[n11];
        this.ag = new int[n11];
        this.ai = new int[n12];
        this.aj = new int[n12];
        this.ak = new int[n12];
        if (n19 == 1) {
            this.aJ = new int[n11];
        }
        if (n14 == 1) {
            this.ao = new int[n12];
        }
        if (n15 == 255) {
            this.ap = new int[n12];
        } else {
            this.au = (byte)n15;
        }
        if (n16 == 1) {
            this.aq = new int[n12];
        }
        if (n17 == 1) {
            this.aK = new int[n12];
        }
        if (n18 == 1) {
            this.Y = new short[n12];
        }
        if (n18 == 1 && n13 > 0) {
            this.Z = new short[n12];
        }
        if (n20 == 1) {
            this.W = new int[n11][];
            this.X = new int[n11][];
        }
        this.ar = new int[n12];
        if (n13 > 0) {
            this.aw = new int[n13];
            this.ax = new int[n13];
            this.ay = new int[n13];
        }
        e2.h = n13;
        e3.h = n39;
        e4.h = n40;
        e5.h = n41;
        e6.h = n33;
        int n48 = 0;
        int n49 = 0;
        int n50 = 0;
        for (n8 = 0; n8 < n11; ++n8) {
            n7 = e2.y();
            n6 = 0;
            if ((n7 & 1) != 0) {
                n6 = e3.n();
            }
            n5 = 0;
            if ((n7 & 2) != 0) {
                n5 = e4.n();
            }
            n4 = 0;
            if ((n7 & 4) != 0) {
                n4 = e5.n();
            }
            this.ae[n8] = n48 + n6;
            this.af[n8] = n49 + n5;
            this.ag[n8] = n50 + n4;
            n48 = this.ae[n8];
            n49 = this.af[n8];
            n50 = this.ag[n8];
            if (n19 != 1) continue;
            this.aJ[n8] = e6.y();
        }
        if (n20 == 1) {
            for (n8 = 0; n8 < n11; ++n8) {
                n7 = e6.y();
                this.W[n8] = new int[n7];
                this.X[n8] = new int[n7];
                for (n6 = 0; n6 < n7; ++n6) {
                    this.W[n8][n6] = e6.y();
                    this.X[n8][n6] = e6.y();
                }
            }
        }
        e2.h = n38;
        e3.h = n9;
        e4.h = n31;
        e5.h = n34;
        e6.h = n32;
        e7.h = n36;
        e8.h = n37;
        for (n8 = 0; n8 < n12; ++n8) {
            this.ar[n8] = (short)e2.o();
            if (n14 == 1) {
                this.ao[n8] = e3.z();
            }
            if (n15 == 255) {
                this.ap[n8] = e4.z();
            }
            if (n16 == 1) {
                this.aq[n8] = e5.z();
                if (this.aq[n8] < 0) {
                    this.aq[n8] = 256 + this.aq[n8];
                }
            }
            if (n17 == 1) {
                this.aK[n8] = e6.y();
            }
            if (n18 == 1) {
                this.Y[n8] = (byte)(e7.o() - 1);
                if (this.Y[n8] != -1) {
                    if (this.Y[n8] == 90 || this.Y[n8] == 96 || this.Y[n8] == 97) {
                        this.Y[n8] = -1;
                    } else if (this.Y[n8] == 116) {
                        this.Y[n8] = -1;
                    } else if (this.Y[n8] == 60) {
                        this.Y[n8] = 8;
                    }
                }
            }
            if (this.Z == null || this.Y[n8] == -1) continue;
            this.Z[n8] = (byte)(e8.y() - 1);
        }
        e2.h = n35;
        e3.h = n30;
        n8 = 0;
        n7 = 0;
        n6 = 0;
        n5 = 0;
        for (n4 = 0; n4 < n12; ++n4) {
            n3 = e3.y();
            if (n3 == 1) {
                n8 = e2.n() + n5;
                n7 = e2.n() + n8;
                n5 = n6 = e2.n() + n7;
                this.ai[n4] = n8;
                this.aj[n4] = n7;
                this.ak[n4] = n6;
            }
            if (n3 == 2) {
                n7 = n6;
                n5 = n6 = e2.n() + n5;
                this.ai[n4] = n8;
                this.aj[n4] = n7;
                this.ak[n4] = n6;
            }
            if (n3 == 3) {
                n8 = n6;
                n5 = n6 = e2.n() + n5;
                this.ai[n4] = n8;
                this.aj[n4] = n7;
                this.ak[n4] = n6;
            }
            if (n3 != 4) continue;
            int n51 = n8;
            n8 = n7;
            n7 = n51;
            n5 = n6 = e2.n() + n5;
            this.ai[n4] = n8;
            this.aj[n4] = n51;
            this.ak[n4] = n6;
        }
        e2.h = n42;
        e3.h = n43;
        e4.h = n44;
        e5.h = n45;
        e6.h = n46;
        e7.h = n47;
        for (n4 = 0; n4 < n13; ++n4) {
            n3 = byArray2[n4] & 0xFF;
            if (n3 != 0) continue;
            this.aw[n4] = (short)e2.o();
            this.ax[n4] = (short)e2.o();
            this.ay[n4] = (short)e2.o();
        }
        e2.h = n10;
        n4 = e2.y();
        if (n4 != 0) {
            e2.o();
            e2.o();
            e2.o();
            e2.p();
        }
    }

    public void b(byte[] byArray, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        boolean bl = false;
        boolean bl2 = false;
        e e2 = new e(byArray);
        e e3 = new e(byArray);
        e e4 = new e(byArray);
        e e5 = new e(byArray);
        e e6 = new e(byArray);
        e2.h = byArray.length - 23;
        int n11 = e2.A();
        int n12 = e2.A();
        int n13 = e2.y();
        int n14 = e2.y();
        int n15 = e2.y();
        int n16 = e2.y();
        int n17 = e2.y();
        int n18 = e2.y();
        int n19 = e2.y();
        int n20 = e2.A();
        int n21 = e2.A();
        int n22 = e2.A();
        int n23 = e2.A();
        int n24 = e2.A();
        v v2 = new v();
        rs.a.h.j()[n2] = v2;
        v v3 = v2;
        v3.a = byArray;
        v3.b = n11;
        v3.c = n12;
        v3.d = n13;
        int n25 = 0;
        int n26 = n10 = n25 + n11;
        int n27 = n10 += n12;
        if (n15 == 255) {
            n10 += n12;
        }
        int n28 = n10;
        if (n17 == 1) {
            n10 += n12;
        }
        int n29 = n10;
        if (n14 == 1) {
            n10 += n12;
        }
        int n30 = n10;
        int n31 = n10 += n24;
        if (n16 == 1) {
            n10 += n12;
        }
        int n32 = n10;
        int n33 = n10 += n23;
        int n34 = n10 += n12 * 2;
        int n35 = n10 += n13 * 6;
        int n36 = n10 += n20;
        int n37 = (n10 += n21) + n22;
        this.ad = n11;
        this.ah = n12;
        this.av = n13;
        this.L = new int[n11];
        this.M = new byte[n11];
        this.ae = new int[n11];
        this.af = new int[n11];
        this.ag = new int[n11];
        this.ai = new int[n12];
        this.aj = new int[n12];
        this.ak = new int[n12];
        if (this.av > 0) {
            this.aw = new int[n13];
            this.ax = new int[n13];
            this.ay = new int[n13];
        }
        if (n18 == 1) {
            this.aJ = new int[n11];
        }
        if (n14 == 1) {
            this.ao = new int[n12];
            this.Z = new short[n12];
            this.Y = new short[n12];
        }
        if (n15 == 255) {
            this.ap = new int[n12];
        } else {
            this.au = (byte)n15;
        }
        if (n16 == 1) {
            this.aq = new int[n12];
        }
        if (n17 == 1) {
            this.aK = new int[n12];
        }
        if (n19 == 1) {
            this.W = new int[n11][];
            this.X = new int[n11][];
        }
        this.ar = new int[n12];
        e2.h = n25;
        e3.h = n35;
        e4.h = n36;
        e5.h = n10;
        e6.h = n30;
        int n38 = 0;
        int n39 = 0;
        int n40 = 0;
        for (n9 = 0; n9 < n11; ++n9) {
            n8 = e2.y();
            n7 = 0;
            if ((n8 & 1) != 0) {
                n7 = e3.n();
            }
            n6 = 0;
            if ((n8 & 2) != 0) {
                n6 = e4.n();
            }
            n5 = 0;
            if ((n8 & 4) != 0) {
                n5 = e5.n();
            }
            this.ae[n9] = n38 + n7;
            this.af[n9] = n39 + n6;
            this.ag[n9] = n40 + n5;
            n38 = this.ae[n9];
            n39 = this.af[n9];
            n40 = this.ag[n9];
            if (n18 != 1) continue;
            this.aJ[n9] = e6.y();
        }
        if (n19 == 1) {
            for (n9 = 0; n9 < n11; ++n9) {
                n8 = e6.y();
                this.W[n9] = new int[n8];
                this.X[n9] = new int[n8];
                for (n7 = 0; n7 < n8; ++n7) {
                    this.W[n9][n7] = e6.y();
                    this.X[n9][n7] = e6.y();
                }
            }
        }
        e2.h = n33;
        e3.h = n29;
        e4.h = n27;
        e5.h = n31;
        e6.h = n28;
        for (n9 = 0; n9 < n12; ++n9) {
            this.ar[n9] = (short)e2.o();
            if (n14 == 1) {
                n8 = e3.y();
                if ((n8 & 1) == 1) {
                    this.ao[n9] = 1;
                    bl = true;
                } else {
                    this.ao[n9] = 0;
                }
                if ((n8 & 2) == 2) {
                    this.Z[n9] = (byte)(n8 >> 2);
                    this.Y[n9] = (short)this.ar[n9];
                    this.ar[n9] = 127;
                    if (this.Y[n9] != -1) {
                        bl2 = true;
                    }
                } else {
                    this.Z[n9] = -1;
                    this.Y[n9] = -1;
                }
            }
            if (n15 == 255) {
                this.ap[n9] = e4.z();
            }
            if (n16 == 1) {
                this.aq[n9] = e5.z();
                if (this.aq[n9] < 0) {
                    this.aq[n9] = 256 + this.aq[n9];
                }
            }
            if (n17 != 1) continue;
            this.aK[n9] = e6.y();
        }
        e2.h = n32;
        e3.h = n26;
        n9 = 0;
        n8 = 0;
        n7 = 0;
        n6 = 0;
        for (n5 = 0; n5 < n12; ++n5) {
            n4 = e3.y();
            if (n4 == 1) {
                n9 = e2.n() + n6;
                n8 = e2.n() + n9;
                n6 = n7 = e2.n() + n8;
                this.ai[n5] = n9;
                this.aj[n5] = n8;
                this.ak[n5] = n7;
            }
            if (n4 == 2) {
                n8 = n7;
                n6 = n7 = e2.n() + n6;
                this.ai[n5] = n9;
                this.aj[n5] = n8;
                this.ak[n5] = n7;
            }
            if (n4 == 3) {
                n9 = n7;
                n6 = n7 = e2.n() + n6;
                this.ai[n5] = n9;
                this.aj[n5] = n8;
                this.ak[n5] = n7;
            }
            if (n4 != 4) continue;
            n3 = n9;
            n9 = n8;
            n8 = n3;
            n6 = n7 = e2.n() + n6;
            this.ai[n5] = n9;
            this.aj[n5] = n3;
            this.ak[n5] = n7;
        }
        e2.h = n34;
        for (n5 = 0; n5 < n13; ++n5) {
            this.aw[n5] = (short)e2.o();
            this.ax[n5] = (short)e2.o();
            this.ay[n5] = (short)e2.o();
        }
        if (this.Z != null) {
            boolean bl3 = false;
            for (n4 = 0; n4 < n12; ++n4) {
                n3 = this.Z[n4] & 0xFF;
                if (n3 == 255) continue;
                if (this.ai[n4] == (this.aw[n3] & 0xFFFF) && this.aj[n4] == (this.ax[n3] & 0xFFFF) && this.ak[n4] == (this.ay[n3] & 0xFFFF)) {
                    this.Z[n4] = -1;
                    continue;
                }
                bl3 = true;
            }
            if (!bl3) {
                this.Z = null;
            }
        }
        if (!bl2) {
            this.Y = null;
        }
        if (!bl) {
            this.ao = null;
        }
    }

    public void c(byte[] byArray, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        e e2 = new e(byArray);
        e e3 = new e(byArray);
        e e4 = new e(byArray);
        e e5 = new e(byArray);
        e e6 = new e(byArray);
        e e7 = new e(byArray);
        e e8 = new e(byArray);
        e2.h = byArray.length - 23;
        int n11 = e2.A();
        int n12 = e2.A();
        int n13 = e2.y();
        v v2 = new v();
        rs.a.h.j()[n2] = v2;
        v v3 = v2;
        v3.a = byArray;
        v3.b = n11;
        v3.c = n12;
        v3.d = n13;
        int n14 = e2.y();
        boolean bl = ~(1 & n14) == -2;
        boolean bl2 = ~(n14 & 2) == -3;
        int n15 = e2.y();
        int n16 = e2.y();
        int n17 = e2.y();
        int n18 = e2.y();
        int n19 = e2.y();
        int n20 = e2.A();
        int n21 = e2.A();
        int n22 = e2.A();
        int n23 = e2.A();
        int n24 = e2.A();
        int n25 = 0;
        int n26 = 0;
        int n27 = 0;
        int n28 = 0;
        int n29 = 0;
        int n30 = 0;
        boolean bl3 = false;
        byte[] byArray2 = null;
        byte[] byArray3 = null;
        short[] sArray = null;
        if (n13 > 0) {
            byArray3 = new byte[n13];
            e2.h = 0;
            for (n10 = 0; n10 < n13; ++n10) {
                byArray3[n10] = e2.z();
                n9 = byArray3[n10];
                if (n9 == 0) {
                    ++n25;
                }
                if (n9 >= 1 && n9 <= 3) {
                    ++n26;
                }
                if (n9 != 2) continue;
                ++n27;
            }
        }
        n9 = n10 = n13;
        int n31 = n10 += n11;
        if (n14 == 1) {
            n10 += n12;
        }
        int n32 = n10;
        int n33 = n10 += n12;
        if (n15 == 255) {
            n10 += n12;
        }
        int n34 = n10;
        if (n17 == 1) {
            n10 += n12;
        }
        int n35 = n10;
        if (n19 == 1) {
            n10 += n11;
        }
        int n36 = n10;
        if (n16 == 1) {
            n10 += n12;
        }
        int n37 = n10;
        int n38 = n10 += n23;
        if (n18 == 1) {
            n10 += n12 * 2;
        }
        int n39 = n10;
        int n40 = n10 += n24;
        int n41 = n10 += n12 * 2;
        int n42 = n10 += n20;
        int n43 = n10 += n21;
        int n44 = n10 += n22;
        int n45 = n10 += n25 * 6;
        int n46 = n10 += n26 * 6;
        int n47 = n10 += n26 * 6;
        int n48 = n10 += n26;
        int n49 = n10 += n26;
        n10 += n26 + n27 * 2;
        n28 = n11;
        n29 = n12;
        n30 = n13;
        this.L = rs.f.a.ah ? new int[]{} : new int[n11];
        this.M = new byte[n11];
        int[] nArray = new int[n11];
        int[] nArray2 = new int[n11];
        int[] nArray3 = new int[n11];
        int[] nArray4 = new int[n12];
        int[] nArray5 = new int[n12];
        int[] nArray6 = new int[n12];
        this.aJ = new int[n11];
        this.ao = new int[n12];
        this.ap = new int[n12];
        this.aq = new int[n12];
        this.aK = new int[n12];
        if (n19 == 1) {
            this.aJ = new int[n11];
        }
        if (bl) {
            this.ao = new int[n12];
        }
        if (n15 == 255) {
            this.ap = new int[n12];
        } else {
            this.au = (byte)n15;
        }
        if (n16 == 1) {
            this.aq = new int[n12];
        }
        if (n17 == 1) {
            this.aK = new int[n12];
        }
        if (n18 == 1) {
            sArray = new short[n12];
        }
        if (n18 == 1 && n13 > 0) {
            byArray2 = new byte[n12];
        }
        int[] nArray7 = new int[n12];
        int n50 = n10;
        e2.h = n9;
        e3.h = n41;
        e4.h = n42;
        e5.h = n43;
        e6.h = n35;
        int n51 = 0;
        int n52 = 0;
        int n53 = 0;
        for (n8 = 0; n8 < n11; ++n8) {
            n7 = e2.y();
            n6 = 0;
            if ((n7 & 1) != 0) {
                n6 = e3.L();
            }
            n5 = 0;
            if ((n7 & 2) != 0) {
                n5 = e4.L();
            }
            n4 = 0;
            if ((n7 & 4) != 0) {
                n4 = e5.L();
            }
            nArray[n8] = n51 + n6;
            nArray2[n8] = n52 + n5;
            nArray3[n8] = n53 + n4;
            n51 = nArray[n8];
            n52 = nArray2[n8];
            n53 = nArray3[n8];
            if (this.aJ == null) continue;
            this.aJ[n8] = e6.y();
        }
        e2.h = n40;
        e3.h = n31;
        e4.h = n33;
        e5.h = n36;
        e6.h = n34;
        e7.h = n38;
        e8.h = n39;
        for (n8 = 0; n8 < n12; ++n8) {
            nArray7[n8] = e2.A();
            if (n14 == 1) {
                this.ao[n8] = e3.z();
                if (this.ao[n8] == 2) {
                    nArray7[n8] = 65535;
                }
                this.ao[n8] = 0;
            }
            if (n15 == 255) {
                this.ap[n8] = e4.z();
            }
            if (n16 == 1) {
                this.aq[n8] = e5.z();
                if (this.aq[n8] < 0) {
                    this.aq[n8] = 256 + this.aq[n8];
                }
            }
            if (n17 == 1) {
                this.aK[n8] = e6.y();
            }
            if (n18 == 1) {
                sArray[n8] = (short)(e7.A() - 1);
            }
            if (byArray2 == null) continue;
            byArray2[n8] = sArray[n8] != -1 ? (int)(e8.y() - 1) : -1;
        }
        e2.h = n37;
        e3.h = n32;
        n8 = 0;
        n7 = 0;
        n6 = 0;
        n5 = 0;
        for (n4 = 0; n4 < n12; ++n4) {
            n3 = e3.y();
            if (n3 == 1) {
                n5 = n8 = e2.L() + n5;
                n5 = n7 = e2.L() + n5;
                n5 = n6 = e2.L() + n5;
                nArray4[n4] = n8;
                nArray5[n4] = n7;
                nArray6[n4] = n6;
            }
            if (n3 == 2) {
                n7 = n6;
                n5 = n6 = e2.L() + n5;
                nArray4[n4] = n8;
                nArray5[n4] = n7;
                nArray6[n4] = n6;
            }
            if (n3 == 3) {
                n8 = n6;
                n5 = n6 = e2.L() + n5;
                nArray4[n4] = n8;
                nArray5[n4] = n7;
                nArray6[n4] = n6;
            }
            if (n3 != 4) continue;
            int n54 = n8;
            n8 = n7;
            n7 = n54;
            n5 = n6 = e2.L() + n5;
            nArray4[n4] = n8;
            nArray5[n4] = n7;
            nArray6[n4] = n6;
        }
        e2.h = n44;
        e3.h = n45;
        e4.h = n46;
        e5.h = n47;
        e6.h = n48;
        e7.h = n49;
        for (n4 = 0; n4 < n13; ++n4) {
            n3 = byArray3[n4] & 0xFF;
            if (n3 == 0) {
                e2.A();
                e2.A();
                e2.A();
            }
            if (n3 == 1) {
                e3.A();
                e3.A();
                e3.A();
                e4.A();
                e4.A();
                e4.A();
                e5.z();
                e6.z();
                e7.z();
            }
            if (n3 == 2) {
                e3.A();
                e3.A();
                e3.A();
                e4.A();
                e4.A();
                e4.A();
                e5.z();
                e6.z();
                e7.z();
                e7.z();
                e7.z();
            }
            if (n3 != 3) continue;
            e3.A();
            e3.A();
            e3.A();
            e4.A();
            e4.A();
            e4.A();
            e5.z();
            e6.z();
            e7.z();
        }
        if (n15 != 255) {
            for (n4 = 0; n4 < n12; ++n4) {
                this.ap[n4] = n15;
            }
        }
        this.ar = nArray7;
        this.ad = n11;
        this.ah = n12;
        this.ae = nArray;
        this.af = nArray2;
        this.ag = nArray3;
        this.ai = nArray4;
        this.aj = nArray5;
        this.ak = nArray6;
    }

    public boolean i() {
        return this.k == 1 || this.bJ == 2467 || this.bJ == 42467;
    }

    public h(int n2) {
        this(n2, h);
    }

    /*
     * Opcode count of 18710 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     * Unable to fully structure code
     */
    public h(int var1_1, a var2_2) {
        super();
        this.bH = new HashMap<K, V>();
        this.bI = -1;
        this.bJ = var1_1;
        var3_3 = rs.a.h.j()[var1_1].a;
        if (var3_3.length > 0) {
            if (var3_3[var3_3.length - 1] == -3 && var3_3[var3_3.length - 2] == -1) {
                this.a(var3_3, var1_1);
                this.k = 3;
            } else if (var3_3[var3_3.length - 1] == -2 && var3_3[var3_3.length - 2] == -1) {
                this.b(var3_3, var1_1);
                this.k = 2;
            } else if (var3_3[var3_3.length - 1] == -1 && var3_3[var3_3.length - 2] == -1) {
                rs.a.a.c.a();
                this.a(var3_3, var1_1, var2_2);
                this.k = 1;
            } else {
                this.k = 0;
                rs.a.a.c.a();
                this.b(var1_1, var2_2);
            }
        }
        if (rs.a.h.p[var1_1]) {
            this.b(32, 32, 32);
            this.a(0, 6, 0);
        }
        if (var1_1 == 2361) {
            this.ap = new int[this.ah];
            for (var4_4 = 0; var4_4 < this.ah; ++var4_4) {
                this.ap[var4_4] = 10;
            }
        }
        if ((rs.a.h.p[var1_1] || var1_1 == 2467 || var1_1 == 42467) && rs.a.h.bG >= 0 && this.ap != null) {
            block7: for (var4_4 = 0; var4_4 < this.ap.length; ++var4_4) {
                switch (rs.a.h.bG) {
                    case 0: {
                        if (var1_1 != 62739 && var1_1 != 62756 || this.ap[var4_4] != 0) continue block7;
                        this.ap[var4_4] = 7;
                        continue block7;
                    }
                    case 1: {
                        this.ap[var4_4] = 10;
                        continue block7;
                    }
                    case 4: {
                        if (this.ap[var4_4] == 5) {
                            this.ap[var4_4] = 3;
                        }
                        if (this.ap[var4_4] != 0) continue block7;
                        this.ap[var4_4] = 4;
                        continue block7;
                    }
                    case 7: {
                        if (this.ap[var4_4] == 4) {
                            this.ap[var4_4] = 2;
                        }
                        if (this.ap[var4_4] != 0) continue block7;
                        this.ap[var4_4] = 10;
                    }
                }
            }
        }
        if (!rs.f.a.ah) {
            if (var1_1 == 41893 || var1_1 == 41895 || var1_1 == 49546 || var1_1 == 41886 || var1_1 == 49560 || var1_1 == 41890 || var1_1 == 49554) {
                var4_4 = 25;
                var5_8 = 15;
                if (var1_1 == 41895 || var1_1 == 49546) {
                    var4_4 = 19;
                }
                if (var1_1 == 41886 || var1_1 == 49560) {
                    var4_4 = 30;
                    var5_8 = 14;
                }
                if (var1_1 == 41890 || var1_1 == 49554) {
                    var4_4 = 17;
                    var5_8 = 10;
                }
                var6_9 = 0;
                for (var7_11 = 0; var7_11 < this.L.length; ++var7_11) {
                    if (var6_9 < var5_8) {
                        ++var6_9;
                        continue;
                    }
                    var6_9 = 0;
                    this.a(var7_11, var4_4 + 1, (byte)2);
                }
            }
            if (var1_1 == 42671) {
                var4_4 = 0;
                for (var5_8 = 0; var5_8 < this.L.length; ++var5_8) {
                    if (var4_4 < 2) {
                        ++var4_4;
                        continue;
                    }
                    var4_4 = 0;
                    this.a(var5_8, 2, (byte)1);
                }
            }
            if (var1_1 == 56202 || var1_1 == 56208) {
                var4_4 = 0;
                for (var5_8 = 0; var5_8 < this.L.length; ++var5_8) {
                    if (var4_4 < 4) {
                        ++var4_4;
                        continue;
                    }
                    var4_4 = 0;
                    this.a(var5_8, (var1_1 == 56202 ? 26 : 29) + 1, (byte)0);
                }
            }
            if (var1_1 == 42001 || var1_1 == 42002) {
                for (var4_4 = 10; var4_4 < 60; ++var4_4) {
                    if (var4_4 >= 20 && var4_4 <= 40 || var4_4 >= 10 && var4_4 <= 15 || var4_4 == 19) continue;
                    this.a(var4_4, (var1_1 == 42001 ? 26 : 29) + 1, (byte)0);
                }
            }
            if (var1_1 >= 56203 && var1_1 <= 56207) {
                var4_4 = 27;
                var5_8 = 0;
                for (var6_9 = 0; var6_9 < this.L.length; ++var6_9) {
                    if (var5_8 < 6) {
                        ++var5_8;
                        continue;
                    }
                    var5_8 = 0;
                    this.a(var6_9, var4_4 + 1, (byte)0);
                }
            }
            if (var1_1 == 22012) {
                var4_4 = 17;
                for (var5_8 = 0; var5_8 < this.L.length; ++var5_8) {
                    this.a(var5_8, var4_4 + 1, (byte)0);
                }
            }
            if (var1_1 == 42669) {
                var4_4 = 21;
                for (var5_8 = 0; var5_8 < this.L.length; ++var5_8) {
                    if (var5_8 % 2 == 0) continue;
                    this.a(var5_8, var4_4 + 1, (byte)0);
                }
            }
            if (var1_1 == 41037 || var1_1 == 41038) {
                for (var4_4 = 0; var4_4 < this.L.length; ++var4_4) {
                    if (var4_4 % 4 == 0) continue;
                    this.L[var4_4] = 23;
                }
            }
            if (var1_1 == 48626) {
                var4_4 = 0;
                for (var5_8 = 0; var5_8 < this.L.length; ++var5_8) {
                    if (var5_8 % 4 == 0) continue;
                    this.L[var5_8] = 24;
                }
            }
            if (var1_1 == 40024) {
                var4_4 = 3;
                for (var5_8 = 60; var5_8 < 65; ++var5_8) {
                    this.L[var5_8] = var4_4 + 1;
                }
                var5_8 = 0;
                for (var6_9 = 0; var6_9 < 40; ++var6_9) {
                    if (var6_9 > 50 || var6_9 % 2 == 0) continue;
                    v0 = var7_11 = var1_1 == 40319 || var1_1 == 40318 ? 3 : 1;
                    if (var5_8 < var7_11) {
                        ++var5_8;
                        continue;
                    }
                    var5_8 = 0;
                    this.L[var6_9] = var4_4 + 1;
                }
            }
            if (var1_1 == 40948 || var1_1 == 40947 || var1_1 == 40946) {
                var4_4 = 0;
                var5_8 = 26;
                if (var1_1 == 40947) {
                    var5_8 = 2;
                }
                if (var1_1 == 40946) {
                    var5_8 = 13;
                }
                for (var6_9 = 0; var6_9 < 168; ++var6_9) {
                    if (var4_4 == 3) {
                        this.L[var6_9] = var5_8 + 1;
                        var4_4 = 0;
                        continue;
                    }
                    ++var4_4;
                }
            }
            if (var1_1 >= 40949 && var1_1 <= 40954) {
                var4_4 = 0;
                var5_8 = 26;
                if (var1_1 == 40953 || var1_1 == 40954) {
                    var5_8 = 19;
                }
                if (var1_1 == 40949 || var1_1 == 40950) {
                    var5_8 = 13;
                }
                for (var6_9 = 0; var6_9 < this.L.length; ++var6_9) {
                    if (var4_4 == 20) {
                        this.L[var6_9] = var5_8 + 1;
                        var4_4 = 0;
                        continue;
                    }
                    ++var4_4;
                }
            }
            if (var1_1 == 209 || var1_1 == 386) {
                var4_4 = 0;
                var5_8 = 13;
                for (var6_9 = 0; var6_9 < this.L.length; ++var6_9) {
                    if (var4_4 == 2) {
                        this.L[var6_9] = var5_8 + 1;
                        if (Client.d(3) == 1) {
                            this.L[var6_9] = 18;
                        }
                        var4_4 = 0;
                        continue;
                    }
                    ++var4_4;
                }
            }
            if (var1_1 == 40319 || var1_1 == 40318) {
                var4_4 = var1_1 == 40019 || var1_1 == 40018 ? 2 : 11;
                for (var5_8 = 60; var5_8 < 65; ++var5_8) {
                    this.L[var5_8] = var4_4 + 1;
                }
                var5_8 = 0;
                for (var6_9 = 0; var6_9 < 40; ++var6_9) {
                    if (var6_9 > 50) continue;
                    v1 = var7_11 = var1_1 == 40319 || var1_1 == 40318 ? 3 : 1;
                    if (var5_8 < var7_11) {
                        ++var5_8;
                        continue;
                    }
                    var5_8 = 0;
                    this.L[var6_9] = var4_4 + 1;
                }
            }
            if (var1_1 == 41052) {
                for (var4_4 = 0; var4_4 < this.L.length; ++var4_4) {
                    if (var4_4 % 4 == 0) continue;
                    this.L[var4_4] = 2;
                }
            }
            if (var1_1 == 44403) {
                for (var4_4 = 0; var4_4 < this.L.length; ++var4_4) {
                    if (var4_4 % 4 == 0 || var4_4 % 2 == 0) continue;
                    this.L[var4_4] = 23;
                }
            }
            if (var1_1 == 50939) {
                var4_4 = 0;
                for (var5_8 = 0; var5_8 < 130; ++var5_8) {
                    if (var4_4 != 2) {
                        ++var4_4;
                        continue;
                    }
                    var4_4 = 0;
                    this.L[var5_8] = 21;
                }
            }
            if (var1_1 == 47780) {
                var4_4 = 0;
                for (var5_8 = 0; var5_8 < 30; ++var5_8) {
                    if (var4_4 != 10) {
                        ++var4_4;
                        continue;
                    }
                    this.L[var5_8] = 19;
                }
            }
            ** if ((var4_5 = rs.r.b.a((int)var1_1)) == null) goto lbl275
            for (var5_8 = 0; var5_8 < var4_5.length; ++var5_8) {
                var6_10 = var4_5[var5_8];
                if (var6_10[0] == -1) {
                    for (var7_11 = 0; var7_11 < this.ai.length; ++var7_11) {
                        this.L[this.ai[var7_11]] = var6_10[1] + 1;
                    }
                    continue;
                }
                if (var6_10[0] == -2) {
                    for (var7_11 = 0; var7_11 < this.aj.length; ++var7_11) {
                        this.L[this.aj[var7_11]] = var6_10[1] + 1;
                    }
                    continue;
                }
                if (var6_10[0] == -3) {
                    for (var7_11 = 0; var7_11 < this.ak.length; ++var7_11) {
                        this.L[this.ak[var7_11]] = var6_10[1] + 1;
                    }
                    continue;
                }
                if (var6_10[0] == -4) {
                    for (var7_11 = 0; var7_11 < this.ai.length; ++var7_11) {
                        this.L[this.ai[var7_11]] = var6_10[1] + 1;
                    }
                    for (var7_11 = 0; var7_11 < this.aj.length; ++var7_11) {
                        this.L[this.aj[var7_11]] = var6_10[1] + 1;
                    }
                    for (var7_11 = 0; var7_11 < this.ak.length; ++var7_11) {
                        this.L[this.ak[var7_11]] = var6_10[1] + 1;
                    }
                    continue;
                }
                this.L[var6_10[0]] = var6_10[1] + 1;
lbl-1000:
                // 2 sources

                {
                    continue;
                }
            }
        }
lbl275:
        // 4 sources

        if (var1_1 == 40017) {
            this.e(127, rs.f.a.aQ != false ? 57 : 117);
        }
        if (var1_1 == 40019 || var1_1 == 40018 || var1_1 == 40319 || var1_1 == 40318 || var1_1 == 40024) {
            this.av = 3;
            this.ao = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2};
            this.ar = new int[]{5056, 5066, 8, 8, 8, 12, 924, 924, 924, 924, 924, 924, 924, 924, 5056, 5056, 924, 924, 8, 8, 12, 12, 924, 924, 924, 12, 127, 127, 127, 12, 924, 924, 924, 924, 924, 924, 12, 8, 924, 924, 924, 8, 8, 8, 924, 924, 924, 8, 8, 8, 924, 924, 8, 8, 924, 924, 8, 8, 8, 924, 924, 924, 924, 8, 8, 8, 924, 924, 8, 8, 924, 924, 8, 8, 8, 924, 924, 924, 8, 8, 12, 12, 8, 924, 924, 924, 924, 924, 8, 8, 5066, 5056, 924, 924, 924, 924, 8, 5056, 924, 924, 5056, 12, 12, 924, 924, 924, 12, 12, 8, 8, 8, 924, 924, 924, 924, 924, 924, 12, 12, 8, 924, 924, 8, 12, 127, 127, 127, 127, 924, 924, 924, 924, 924, 8, 8, 12, 12, 924, 924, 924, 924, 12, 12, 12, 8, 924, 924, 924, 924, 127, 127, 12, 12, 924, 924, 924, 127, 12, 12, 12, 924, 924, 924, 924, 12, 12, 924, 924, 12, 12, 12, 12, 12, 924, 924, 924, 924, 12, 12, 12, 924, 924, 12, 5056, 5056, 8, 8, 5056, 5056, 924, 924, 924, 924, 924, 924, 924, 3005, 3005, 924, 8, 12, 12, 12, 8, 924, 924, 924, 924, 8, 8, 924, 924, 8, 8, 3005, 3005, 924, 924, 924, 127, 127, 127, 127, 127, 127, 127, 924, 924, 924, 924, 924, 924, 924, 924, 8, 12, 12, 924, 924, 924, 20, 12, 24, 24, 24, 924, 924, 924, 924, 924, 12, 24, 924, 924, 24, 28, 28, 28, 28, 924, 924, 924, 924, 924, 28, 28, 924, 924, 28, 20, 924, 924, 20, 16, 924, 924, 16, 8, 924, 924, 8, 8, 924, 924, 924, 8, 8, 12, 20, 924, 924, 924, 16, 16, 20, 20, 924, 924, 924, 127, 8, 8, 8, 924, 924, 924, 924, 924, 127, 8, 8, 20, 20, 924, 924, 924, 20, 20, 924, 924, 20, 12, 924, 924, 12, 12, 24, 24, 924, 924, 924, 924, 12, 24, 924, 924, 24, 28, 924, 924, 28, 20, 924, 127, 924, 924, 127, 127, 924, 924, 127, 127, 924, 924, 127, 127, 127, 924, 924, 924, 127, 127, 127, 924, 924, 24, 924, 924, 28, 28, 924, 20, 20, 924, 924, 12, 924, 924, 24, 924, 924, 12, 16, 924, 12, 20, 20, 20, 16, 16, 924, 924, 924, 924, 924, 924, 924, 924, 8, 8, 8, 8, 924, 924, 924, 16, 24, 28, 28, 924, 924, 924, 20, 28, 924, 924, 924, 20, 16, 16, 924, 924, 20, 924, 8, 924, 924, 924, 924, 924, 924, 924, 0};
            this.aw = new int[]{133, 130, 132};
            this.ax = new int[]{134, 131, 136};
            this.ay = new int[]{135, 132, 133};
            this.Y = new short[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, 59, 59, -1, -1, 59, 59, -1, -1, 59, 59, 59, -1, -1, -1, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            this.Z = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.aa = new byte[]{0, 0, 0};
            for (var4_6 = 0; var4_6 < this.Y.length; ++var4_6) {
                if (this.Y[var4_6] == -1) continue;
                this.Y[var4_6] = var1_1 == 40319 || var1_1 == 40318 ? 64 : (var1_1 == 40024 ? 66 : (short)(rs.f.a.aQ != false ? 57 : 117));
                this.ar[var4_6] = this.Y[var4_6];
            }
            for (var4_6 = 0; var4_6 < this.ar.length; ++var4_6) {
                if (this.ar[var4_6] != 0) continue;
                this.ar[var4_6] = 65535;
            }
        }
        if (var1_1 == 32815) {
            this.e(127, 57);
        }
        if (var1_1 == 32809) {
            this.av = 3;
            this.ao = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2};
            this.ar = new int[]{24, 24, 0, 0, 0, 24, 24, 24, 12, 24, 24, 12, 24, 24, 24, 24, 24, 24, 0, 0, 24, 24, 24, 24, 0, 0, 24, 24, 24, 24, 24, 24, 12, 24, 41, 12, 12, 12, 12, 12, 12, 41, 41, 24, 12, 24, 24, 24, 24, 24, 24, 24, 24, 24, 12, 12, 12, 12, 12, 0, 24, 24, 12, 24, 0, 0, 24, 24, 24, 24, 24, 24, 24, 24, 12, 12, 12, 12, 12, 24, 24, 0, 24, 24, 12, 12, 12, 24, 24, 24, 24, 24, 24, 24, 24, 0, 24, 24, 24, 12, 41, 41, 33, 33, 33, 41, 41, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 41, 41, 41, 41, 20, 20, 902, 902, 902, 902, 902, 902, 0, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 0, 0, 902, 902, 902, 902, 902, 20, 20, 33, 33, 945, 945, 945, 945, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 20, 20, 20, 20, 12, 12, 12, 12, 12, 0, 0, 0, 0, 12, 12, 12, 12, 12, 12, 12, 12, 0, 0, 0, 33, -22479, 41, 12, 12, 12, 902, 12, 20, 20, 20, 20, 33, 33, 33, 41, 41, 0, 33, 33, 33, 41, 12, 12, 12, 24, 24, 8, 8, 33, 33, 960, 960, 960, 33, 33, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 41, 41, 41, 33, 33, 960, 968, 978, 978, 968, 33, -22479, 41, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 0, 0, 24, 24, 24, 24, 0, 0, 12, 12, 12, 0, 24, 24, 24, 24, 24, 522, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 24, 0, 41, 24, 12, 12, 12, 12, 12, 0, 127, 12, 12, 0, 12, 8, 8, 127, 12, 960, 960, 968, 978, 960, 960, 33, 33, 33, 33, 33, 33, -22479, -22479, -22479, 20, 20, 20, 12, 12, 20, 20, 12, 12, 12, 12, 12, 12, 12, 12, 20, 20, 12, 12, 12, 12, 24, 41, -22479, -22479, 33, 960, 960, 33, 41, 41, 24, 24, 24, 24, 33, 33, 12, 12, 12, 12, 12, 12, 0, 0, 12, 12, 12, 12, 24, 0, 24, 24, 0, 24, 0, 12, 33, 24, 41, 41, 24, 12, 24, 24, 24, 0, 24, 24, 24, 24, 24, 24, 12, 12, 12, 12, 12, 12, 12, 12, 0, 24, 24, 12, 12, 12, 12, 0, 24, 24, 0, 0, 0, 12, 12, 12, 24, 24, 24, 12, 0, 522, 24, 24, 24, 24, 24, 12, 12, 0, 24, 0, 8, 127, 127, 12, 12, 8, 12, 960, 33, 33, 0, 0, 968, -22479, -22479, 33, 960, 978, 20, 20, 20, 41, -22479, 33, 33, 33, 945, 945, 945, 945, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 127, 12, 12, 12, 0};
            this.aw = new int[]{343, 340, 342};
            this.ax = new int[]{344, 341, 346};
            this.ay = new int[]{345, 342, 343};
            this.Y = new short[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, -1, -1, -1, -1};
            this.Z = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.aa = new byte[]{0, 0, 0};
            for (var4_7 = 0; var4_7 < this.Y.length; ++var4_7) {
                if (this.Y[var4_7] != 59) continue;
                this.Y[var4_7] = (short)(rs.f.a.aQ != false ? 57 : 117);
                this.ar[var4_7] = this.Y[var4_7];
            }
            for (var4_7 = 0; var4_7 < this.ar.length; ++var4_7) {
                if (this.ar[var4_7] != 0) continue;
                this.ar[var4_7] = 65535;
            }
        }
    }

    public void c(int n2) {
        for (int i2 = 0; i2 < this.ad; ++i2) {
            this.ae[i2] = this.ae[i2] / n2;
            this.af[i2] = this.af[i2] / n2;
            this.ag[i2] = this.ag[i2] / n2;
        }
    }

    public void a(byte[] byArray, int n2, a a2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        boolean bl;
        e e2 = rs.a.a.c.a(byArray);
        e e3 = rs.a.a.c.a(byArray);
        e e4 = rs.a.a.c.a(byArray);
        e e5 = rs.a.a.c.a(byArray);
        e e6 = rs.a.a.c.a(byArray);
        e e7 = rs.a.a.c.a(byArray);
        e e8 = rs.a.a.c.a(byArray);
        e2.h = byArray.length - 23;
        int n11 = e2.A();
        int n12 = e2.A();
        int n13 = e2.y();
        v v2 = new v();
        rs.a.h.j()[n2] = v2;
        v v3 = v2;
        v3.a = byArray;
        v3.b = n11;
        v3.c = n12;
        v3.d = n13;
        int n14 = e2.y();
        boolean bl2 = ~(1 & n14) == -2;
        boolean bl3 = ~(n14 & 2) == -3;
        boolean bl4 = (4 & n14) == 4;
        boolean bl5 = bl = (8 & n14) == 8;
        if (!bl) {
            this.c(byArray, n2);
            return;
        }
        int n15 = 0;
        if (bl) {
            e2.h -= 7;
            n15 = e2.y();
            e2.h += 6;
        }
        if (n15 == 15) {
            rs.a.h.p[n2] = true;
        }
        this.n = n15;
        int n16 = e2.y();
        int n17 = e2.y();
        int n18 = e2.y();
        int n19 = e2.y();
        int n20 = e2.y();
        int n21 = e2.A();
        int n22 = e2.A();
        int n23 = e2.A();
        int n24 = e2.A();
        int n25 = e2.A();
        int n26 = 0;
        int n27 = 0;
        int n28 = 0;
        int n29 = 0;
        int n30 = 0;
        int n31 = 0;
        boolean bl6 = false;
        byte[] byArray2 = null;
        if (n13 > 0) {
            byArray2 = new byte[n13];
            e2.h = 0;
            for (n10 = 0; n10 < n13; ++n10) {
                byArray2[n10] = e2.z();
                n9 = byArray2[n10];
                if (n9 == 0) {
                    ++n26;
                }
                if (n9 >= 1 && n9 <= 3) {
                    ++n27;
                }
                if (n9 != 2) continue;
                ++n28;
            }
        }
        n9 = n10 = n13;
        int n32 = n10 += n11;
        if (bl2) {
            n10 += n12;
        }
        if (n14 == 1) {
            n10 += n12;
        }
        int n33 = n10;
        int n34 = n10 += n12;
        if (n16 == 255) {
            n10 += n12;
        }
        int n35 = n10;
        if (n18 == 1) {
            n10 += n12;
        }
        int n36 = n10;
        if (n20 == 1) {
            n10 += n11;
        }
        int n37 = n10;
        if (n17 == 1) {
            n10 += n12;
        }
        int n38 = n10;
        int n39 = n10 += n24;
        if (n19 == 1) {
            n10 += n12 * 2;
        }
        int n40 = n10;
        int n41 = n10 += n25;
        int n42 = n10 += n12 * 2;
        int n43 = n10 += n21;
        int n44 = n10 += n22;
        int n45 = n10 += n23;
        int n46 = n10 += n26 * 6;
        n10 += n27 * 6;
        int n47 = 6;
        if (n15 != 14) {
            if (n15 >= 15) {
                n47 = 9;
            }
        } else {
            n47 = 7;
        }
        int n48 = n10;
        int n49 = n10 += n47 * n27;
        int n50 = n10 += n27;
        int n51 = n10 += n27;
        n10 += n27 + n28 * 2;
        n29 = n11;
        n30 = n12;
        n31 = n13;
        a2.b(n12, n11);
        a2.e();
        this.L = a2.a(a.b.p);
        this.M = a2.c(a.b.q);
        int[] nArray = a2.a(a.b.m);
        int[] nArray2 = a2.a(a.b.n);
        int[] nArray3 = a2.a(a.b.o);
        int[] nArray4 = a2.a(a.b.a);
        int[] nArray5 = a2.a(a.b.b);
        int[] nArray6 = a2.a(a.b.c);
        this.aJ = a2.a(a.b.l);
        this.ao = a2.a(a.b.g);
        this.ap = a2.a(a.b.h);
        this.aq = a2.a(a.b.i);
        this.aK = a2.a(a.b.k);
        if (n20 == 1) {
            this.aJ = a2.a(a.b.l);
        }
        if (bl2) {
            this.ao = a2.a(a.b.g);
        }
        if (n16 == 255) {
            this.ap = a2.a(a.b.h);
        } else {
            this.au = n16;
        }
        if (n17 == 1) {
            this.aq = a2.a(a.b.i);
        }
        if (n18 == 1) {
            this.aK = a2.a(a.b.k);
        }
        int[] nArray7 = a2.a(a.b.j);
        boolean bl7 = false;
        if (n19 == 1 && n13 > 0) {
            bl7 = true;
        }
        int n52 = n10;
        if (n13 > 0) {
            if (n27 > 0) {
                // empty if block
            }
            if (n28 > 0) {
                // empty if block
            }
        }
        e2.h = n9;
        e3.h = n42;
        e4.h = n43;
        e5.h = n44;
        e6.h = n36;
        int n53 = 0;
        int n54 = 0;
        int n55 = 0;
        for (n8 = 0; n8 < n11; ++n8) {
            n7 = e2.y();
            n6 = 0;
            if ((n7 & 1) != 0) {
                n6 = e3.L();
            }
            n5 = 0;
            if ((n7 & 2) != 0) {
                n5 = e4.L();
            }
            n4 = 0;
            if ((n7 & 4) != 0) {
                n4 = e5.L();
            }
            nArray[n8] = n53 + n6;
            nArray2[n8] = n54 + n5;
            nArray3[n8] = n55 + n4;
            n53 = nArray[n8];
            n54 = nArray2[n8];
            n55 = nArray3[n8];
            if (this.aJ == null) continue;
            this.aJ[n8] = e6.y();
        }
        e2.h = n41;
        e3.h = n32;
        e4.h = n34;
        e5.h = n37;
        e6.h = n35;
        e7.h = n39;
        e8.h = n40;
        for (n8 = 0; n8 < n12; ++n8) {
            nArray7[n8] = e2.A();
            if (nArray7[n8] == 0) {
                nArray7[n8] = 65535;
            }
            if (n14 == 1) {
                this.ao[n8] = e3.z();
                if (this.ao[n8] == 2) {
                    nArray7[n8] = 65535;
                }
                this.ao[n8] = 0;
            }
            if (n16 == 255) {
                this.ap[n8] = e4.z();
            }
            if (n17 == 1) {
                this.aq[n8] = e5.z();
                if (this.aq[n8] < 0) {
                    this.aq[n8] = 256 + this.aq[n8];
                }
            }
            if (n18 == 1) {
                this.aK[n8] = e6.y();
            }
            n7 = 0;
            if (n19 == 1) {
                n7 = (short)(e7.A() - 1);
            }
            if (!bl7 || n7 == -1) continue;
            e8.y();
        }
        e2.h = n38;
        e3.h = n33;
        n8 = 0;
        n7 = 0;
        n6 = 0;
        n5 = 0;
        for (n4 = 0; n4 < n12; ++n4) {
            n3 = e3.y();
            if (n3 == 1) {
                n5 = n8 = e2.L() + n5;
                n5 = n7 = e2.L() + n5;
                n5 = n6 = e2.L() + n5;
                nArray4[n4] = n8;
                nArray5[n4] = n7;
                nArray6[n4] = n6;
            }
            if (n3 == 2) {
                n7 = n6;
                n5 = n6 = e2.L() + n5;
                nArray4[n4] = n8;
                nArray5[n4] = n7;
                nArray6[n4] = n6;
            }
            if (n3 == 3) {
                n8 = n6;
                n5 = n6 = e2.L() + n5;
                nArray4[n4] = n8;
                nArray5[n4] = n7;
                nArray6[n4] = n6;
            }
            if (n3 != 4) continue;
            int n56 = n8;
            n8 = n7;
            n7 = n56;
            n5 = n6 = e2.L() + n5;
            nArray4[n4] = n8;
            nArray5[n4] = n7;
            nArray6[n4] = n6;
        }
        e2.h = n45;
        e3.h = n46;
        e4.h = n48;
        e5.h = n49;
        e6.h = n50;
        e7.h = n51;
        for (n4 = 0; n4 < n13; ++n4) {
            n3 = byArray2[n4] & 0xFF;
            if (n3 == 0) {
                e2.A();
                e2.A();
                e2.A();
            }
            if (n3 == 1) {
                e3.A();
                e3.A();
                e3.A();
                if (n15 < 15) {
                    e4.A();
                    if (n15 >= 14) {
                        e4.c(-1);
                    } else {
                        e4.A();
                    }
                    e4.A();
                } else {
                    e4.c(-1);
                    e4.c(-1);
                    e4.c(-1);
                }
                e5.z();
                e5.z();
                e5.z();
            }
            if (n3 == 2) {
                e3.A();
                e3.A();
                e3.A();
                if (n15 >= 15) {
                    e4.c(-1);
                    e4.c(-1);
                    e4.c(-1);
                } else {
                    e4.A();
                    if (n15 < 14) {
                        e4.A();
                    } else {
                        e4.c(-1);
                    }
                    e4.A();
                }
                e5.z();
                e5.z();
                e5.z();
                e5.z();
                e5.z();
            }
            if (n3 != 3) continue;
            e3.A();
            e3.A();
            e3.A();
            if (n15 < 15) {
                e4.A();
                if (n15 < 14) {
                    e4.A();
                } else {
                    e4.c(-1);
                }
                e4.A();
            } else {
                e4.c(-1);
                e4.c(-1);
                e4.c(-1);
            }
            e5.z();
            e5.z();
            e5.z();
        }
        if (n16 != 255) {
            for (n4 = 0; n4 < n12; ++n4) {
                this.ap[n4] = n16;
            }
        }
        this.ar = nArray7;
        this.ad = n11;
        this.ah = n12;
        this.ae = nArray;
        this.af = nArray2;
        this.ag = nArray3;
        this.ai = nArray4;
        this.aj = nArray5;
        this.ak = nArray6;
    }

    private void b(int n2, a a2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = -870;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ++ab;
        v v2 = rs.a.h.j()[n2];
        this.ad = v2.b;
        this.ah = v2.c;
        this.av = v2.d;
        a2.b(this.ah, this.ad);
        a2.e();
        this.L = a2.a(a.b.p);
        this.M = a2.c(a.b.q);
        this.ae = a2.a(a.b.m);
        this.af = a2.a(a.b.n);
        this.ag = a2.a(a.b.o);
        this.ai = a2.a(a.b.a);
        this.aj = a2.a(a.b.b);
        while (n8 >= 0) {
            this.bO = !this.bO;
        }
        this.ak = a2.a(a.b.c);
        this.aw = new int[this.av];
        this.ax = new int[this.av];
        this.ay = new int[this.av];
        if (v2.i >= 0) {
            this.aJ = a2.a(a.b.l);
        }
        if (v2.m >= 0) {
            this.ao = a2.a(a.b.g);
        }
        if (v2.n >= 0) {
            this.ap = a2.a(a.b.h);
        } else {
            this.au = -v2.n - 1;
        }
        if (v2.o >= 0) {
            this.aq = a2.a(a.b.i);
        }
        if (v2.p >= 0) {
            this.aK = a2.a(a.b.k);
        }
        this.ar = a2.a(a.b.j);
        e e2 = rs.a.a.c.a(v2.a);
        e2.h = v2.e;
        e e3 = rs.a.a.c.a(v2.a);
        e3.h = v2.f;
        e e4 = rs.a.a.c.a(v2.a);
        e4.h = v2.g;
        e e5 = rs.a.a.c.a(v2.a);
        e5.h = v2.h;
        e e6 = rs.a.a.c.a(v2.a);
        e6.h = v2.i;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        for (n7 = 0; n7 < this.ad; ++n7) {
            n6 = e2.y();
            n5 = 0;
            if ((n6 & 1) != 0) {
                n5 = e3.L();
            }
            n4 = 0;
            if ((n6 & 2) != 0) {
                n4 = e4.L();
            }
            n3 = 0;
            if ((n6 & 4) != 0) {
                n3 = e5.L();
            }
            this.ae[n7] = n9 + n5;
            this.af[n7] = n10 + n4;
            this.ag[n7] = n11 + n3;
            n9 = this.ae[n7];
            n10 = this.af[n7];
            n11 = this.ag[n7];
            if (this.aJ == null) continue;
            this.aJ[n7] = e6.y();
        }
        e2.h = v2.l;
        e3.h = v2.m;
        e4.h = v2.n;
        e5.h = v2.o;
        e6.h = v2.p;
        for (n7 = 0; n7 < this.ah; ++n7) {
            this.ar[n7] = e2.A();
            if (this.ao != null) {
                this.ao[n7] = e3.y();
            }
            if (this.ap != null) {
                this.ap[n7] = e4.y();
            }
            if (this.aq != null) {
                this.aq[n7] = e5.y();
            }
            if (this.aK == null) continue;
            this.aK[n7] = e6.y();
        }
        e2.h = v2.j;
        e3.h = v2.k;
        n7 = 0;
        n6 = 0;
        n5 = 0;
        n4 = 0;
        for (n3 = 0; n3 < this.ah; ++n3) {
            int n12 = e3.y();
            if (n12 == 1) {
                n4 = n7 = e2.L() + n4;
                n4 = n6 = e2.L() + n4;
                n4 = n5 = e2.L() + n4;
                this.ai[n3] = n7;
                this.aj[n3] = n6;
                this.ak[n3] = n5;
            }
            if (n12 == 2) {
                n6 = n5;
                n4 = n5 = e2.L() + n4;
                this.ai[n3] = n7;
                this.aj[n3] = n6;
                this.ak[n3] = n5;
            }
            if (n12 == 3) {
                n7 = n5;
                n4 = n5 = e2.L() + n4;
                this.ai[n3] = n7;
                this.aj[n3] = n6;
                this.ak[n3] = n5;
            }
            if (n12 != 4) continue;
            int n13 = n7;
            n7 = n6;
            n6 = n13;
            n4 = n5 = e2.L() + n4;
            this.ai[n3] = n7;
            this.aj[n3] = n6;
            this.ak[n3] = n5;
        }
        e2.h = v2.q;
        for (n3 = 0; n3 < this.av; ++n3) {
            this.aw[n3] = e2.A();
            this.ax[n3] = e2.A();
            this.ay[n3] = e2.A();
        }
    }

    public static v[] j() {
        return rs.a.h.b(rs.cache.osrs.c.a());
    }

    public static v[] b(boolean bl) {
        return bl ? rs.cache.osrs.c.b() : o;
    }

    public static void a(byte[] byArray, int n2, boolean bl) {
        int n3;
        if (byArray == null) {
            v v2 = new v();
            rs.a.h.b((boolean)bl)[n2] = v2;
            v v3 = v2;
            v3.b = 0;
            v3.c = 0;
            v3.d = 0;
            return;
        }
        e e2 = new e(byArray);
        e2.h = byArray.length - 18;
        v v4 = new v();
        rs.a.h.b((boolean)bl)[n2] = v4;
        v v5 = v4;
        v5.a = byArray;
        v5.b = e2.A();
        v5.c = e2.A();
        if (e2.h < 0) {
            e2.h = 0;
            return;
        }
        v5.d = e2.y();
        int n4 = e2.y();
        int n5 = e2.y();
        int n6 = e2.y();
        int n7 = e2.y();
        int n8 = e2.y();
        int n9 = e2.A();
        int n10 = e2.A();
        int n11 = e2.A();
        int n12 = e2.A();
        v5.e = n3 = 0;
        v5.k = n3 += v5.b;
        v5.n = n3 += v5.c;
        if (n5 == 255) {
            n3 += v5.c;
        } else {
            v5.n = -n5 - 1;
        }
        v5.p = n3;
        if (n7 == 1) {
            n3 += v5.c;
        } else {
            v5.p = -1;
        }
        v5.m = n3;
        if (n4 == 1) {
            n3 += v5.c;
        } else {
            v5.m = -1;
        }
        v5.i = n3;
        if (n8 == 1) {
            n3 += v5.b;
        } else {
            v5.i = -1;
        }
        v5.o = n3;
        if (n6 == 1) {
            n3 += v5.c;
        } else {
            v5.o = -1;
        }
        v5.j = n3;
        v5.l = n3 += n12;
        v5.q = n3 += v5.c * 2;
        v5.f = n3 += v5.d * 6;
        v5.g = n3 += n9;
        v5.h = n3 += n10;
        n3 += n11;
    }

    public static void a(int n2, rs.cache.e e2) {
        rs.cache.osrs.c.a(new v[70000]);
        o = new v[80000];
        p = new boolean[100000];
        aU = e2;
    }

    public static void d(int n2) {
        rs.cache.osrs.c.a(null);
        rs.a.h.o[n2] = null;
    }

    public static h e(int n2) {
        return rs.a.h.a(n2, h);
    }

    public static h a(int n2, boolean bl) {
        rs.cache.osrs.c.a(bl);
        try {
            h h2 = rs.a.h.a(n2, h);
            return h2;
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
    }

    public static h a(int n2, a a2) {
        if (rs.a.h.j() == null) {
            return null;
        }
        v v2 = rs.a.h.j()[n2];
        if (v2 == null) {
            aU.a(n2);
            return null;
        }
        return new h(n2, a2);
    }

    public static boolean b(int n2, boolean bl) {
        rs.cache.osrs.c.a(bl);
        try {
            boolean bl2 = rs.a.h.f(n2);
            return bl2;
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
    }

    public static boolean f(int n2) {
        if (rs.a.h.j() == null) {
            return false;
        }
        v v2 = rs.a.h.j()[n2];
        if (v2 == null) {
            aU.a(n2);
            return false;
        }
        return true;
    }

    private h(boolean bl) {
        this.bH = new HashMap();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        if (!bl) {
            this.bO = !this.bO;
        }
    }

    public h(int n2, h[] hArray, boolean bl) {
        h h2;
        int n3;
        this.bH = new HashMap();
        this.bI = -1;
        this.bO = true;
        this.aN = false;
        ++ab;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        this.au = -1;
        for (n3 = 0; n3 < n2; ++n3) {
            h2 = hArray[n3];
            if (h2 == null) continue;
            this.ad += h2.ad;
            this.ah += h2.ah;
            this.av += h2.av;
            bl2 |= h2.ao != null;
            if (h2.ap != null) {
                bl3 = true;
            } else {
                if (this.au == -1) {
                    this.au = h2.au;
                }
                if (this.au != h2.au) {
                    bl3 = true;
                }
            }
            bl4 |= h2.aq != null;
            bl5 |= h2.aK != null;
        }
        this.ae = new int[this.ad];
        this.af = new int[this.ad];
        this.ag = new int[this.ad];
        this.aJ = new int[this.ad];
        this.ai = new int[this.ah];
        this.aj = new int[this.ah];
        this.ak = new int[this.ah];
        this.aw = new int[this.av];
        this.ax = new int[this.av];
        this.ay = new int[this.av];
        if (bl2) {
            this.ao = new int[this.ah];
        }
        if (bl3) {
            this.ap = new int[this.ah];
        }
        if (bl4) {
            this.aq = new int[this.ah];
        }
        if (bl5) {
            this.aK = new int[this.ah];
        }
        this.ar = new int[this.ah];
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            h2 = hArray[i2];
            if (h2 == null) continue;
            for (n4 = 0; n4 < h2.ah; ++n4) {
                if (bl2) {
                    if (h2.ao == null) {
                        this.ao[this.ah] = 0;
                    } else {
                        int n5 = h2.ao[n4];
                        if ((n5 & 2) == 2) {
                            n5 += n3 << 2;
                        }
                        this.ao[this.ah] = n5;
                    }
                }
                if (bl3) {
                    this.ap[this.ah] = h2.ap == null ? h2.au : h2.ap[n4];
                }
                if (bl4) {
                    this.aq[this.ah] = h2.aq == null ? 0 : h2.aq[n4];
                }
                if (bl5 && h2.aK != null) {
                    this.aK[this.ah] = h2.aK[n4];
                }
                this.ar[this.ah] = h2.ar[n4];
                this.ai[this.ah] = this.a(h2, h2.ai[n4]);
                this.aj[this.ah] = this.a(h2, h2.aj[n4]);
                this.ak[this.ah] = this.a(h2, h2.ak[n4]);
                ++this.ah;
            }
            for (n4 = 0; n4 < h2.av; ++n4) {
                this.aw[this.av] = this.a(h2, h2.aw[n4]);
                this.ax[this.av] = this.a(h2, h2.ax[n4]);
                this.ay[this.av] = this.a(h2, h2.ay[n4]);
                ++this.av;
            }
            n3 += h2.av;
        }
    }

    public h(int n2, h[] hArray) {
        this(n2, hArray, h);
    }

    public h(int n2, h[] hArray, a a2) {
        h h2;
        int n3;
        this.bH = new HashMap();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ++ab;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        this.au = -1;
        for (n3 = 0; n3 < n2; ++n3) {
            h2 = hArray[n3];
            if (h2 == null) continue;
            this.ad += h2.ad;
            this.ah += h2.ah;
            this.av += h2.av;
            bl |= h2.ao != null;
            if (h2.ap != null) {
                bl2 = true;
            } else {
                if (this.au == -1) {
                    this.au = h2.au;
                }
                if (this.au != h2.au) {
                    bl2 = true;
                }
            }
            bl3 |= h2.aq != null;
            bl4 |= h2.aK != null;
            bl5 |= h2.Y != null;
            bl6 |= h2.Z != null;
            bl7 |= h2.W != null;
            if (h2.I == -1) continue;
            this.I = h2.I;
        }
        a2.a(this.ah, this.ad);
        this.L = a2.a(a.b.p);
        this.M = a2.c(a.b.q);
        this.ae = a2.a(a.b.m);
        this.af = a2.a(a.b.n);
        this.ag = a2.a(a.b.o);
        this.aJ = a2.a(a.b.l);
        this.ai = a2.a(a.b.a);
        this.aj = a2.a(a.b.b);
        this.ak = a2.a(a.b.c);
        this.ar = a2.a(a.b.j);
        this.aw = new int[this.av];
        this.ax = new int[this.av];
        this.ay = new int[this.av];
        if (bl) {
            this.ao = a2.a(a.b.g);
        }
        if (bl2) {
            this.ap = a2.a(a.b.h);
        }
        if (bl3) {
            this.aq = a2.a(a.b.i);
        }
        if (bl4) {
            this.aK = a2.a(a.b.k);
        }
        if (bl5) {
            this.Y = new short[this.ah];
        }
        if (bl6) {
            this.Z = new short[this.ah];
        }
        if (bl7) {
            this.W = new int[this.ad][];
            this.X = new int[this.ad][];
        }
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        if (this.av > 0) {
            this.aa = new byte[this.av];
        }
        n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            h2 = hArray[i2];
            if (h2 == null) continue;
            for (n4 = 0; n4 < h2.ah; ++n4) {
                int n5;
                if (bl) {
                    if (h2.ao == null) {
                        this.ao[this.ah] = 0;
                    } else {
                        n5 = h2.ao[n4];
                        if ((n5 & 2) == 2) {
                            n5 += n3 << 2;
                        }
                        this.ao[this.ah] = n5;
                    }
                }
                if (bl2) {
                    this.ap[this.ah] = h2.ap == null ? h2.au : h2.ap[n4];
                }
                if (bl3) {
                    this.aq[this.ah] = h2.aq == null ? 0 : h2.aq[n4];
                }
                if (bl5) {
                    this.Y[this.ah] = h2.Y != null ? h2.Y[n4] : -1;
                }
                if (bl6) {
                    if (h2.Z != null && h2.Z[n4] != -1) {
                        n5 = h2.Z[n4] + n3;
                        this.Z[this.ah] = (short)(h2.Z[n4] + n3);
                        if (n5 != this.Z[this.ah]) {
                            System.out.println(n5 + " -> " + this.Z[this.ah]);
                        }
                    } else {
                        this.Z[this.ah] = -1;
                    }
                }
                if (bl4 && h2.aK != null && n4 < h2.aK.length) {
                    this.aK[this.ah] = h2.aK[n4];
                }
                this.ar[this.ah] = h2.ar[n4];
                this.ai[this.ah] = this.a(h2, h2.ai[n4]);
                this.aj[this.ah] = this.a(h2, h2.aj[n4]);
                this.ak[this.ah] = this.a(h2, h2.ak[n4]);
                ++this.ah;
            }
            for (n4 = 0; n4 < h2.av; ++n4) {
                this.aw[this.av] = this.a(h2, h2.aw[n4]);
                this.ax[this.av] = this.a(h2, h2.ax[n4]);
                this.ay[this.av] = this.a(h2, h2.ay[n4]);
                ++this.av;
            }
            n3 += h2.av;
        }
    }

    public h(h[] hArray) {
        this(hArray, h);
    }

    public h(h[] hArray, a a2) {
        int n2;
        this.bH = new HashMap();
        this.bI = -1;
        int n3 = 2;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ++ab;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        this.au = -1;
        for (n2 = 0; n2 < n3; ++n2) {
            if (hArray[n2] == null) continue;
            this.ad += hArray[n2].ad;
            this.ah += hArray[n2].ah;
            this.av += hArray[n2].av;
            bl |= hArray[n2].ao != null;
            if (hArray[n2].ap != null) {
                bl2 = true;
            } else {
                if (this.au == -1) {
                    this.au = hArray[n2].au;
                }
                if (this.au != hArray[n2].au) {
                    bl2 = true;
                }
            }
            bl3 |= hArray[n2].aq != null;
            bl4 |= hArray[n2].ar != null;
            bl5 |= hArray[n2].Y != null;
            bl6 |= hArray[n2].Z != null;
            bl7 |= hArray[n2].W != null;
            if (hArray[n2].I == -1) continue;
            this.I = hArray[n2].I;
        }
        a2.a(this.ah, this.ad);
        this.L = a2.a(a.b.p);
        this.M = a2.c(a.b.q);
        this.ae = a2.a(a.b.m);
        this.af = a2.a(a.b.n);
        this.ag = a2.a(a.b.o);
        this.aJ = a2.a(a.b.l);
        this.ai = a2.a(a.b.a);
        this.aj = a2.a(a.b.b);
        this.ak = a2.a(a.b.c);
        this.al = a2.a(a.b.d);
        this.am = a2.a(a.b.e);
        this.an = a2.a(a.b.f);
        this.ar = a2.a(a.b.j);
        this.aw = new int[this.av];
        this.ax = new int[this.av];
        this.ay = new int[this.av];
        if (bl) {
            this.ao = a2.a(a.b.g);
        }
        if (bl2) {
            this.ap = a2.a(a.b.h);
        }
        if (bl3) {
            this.aq = a2.a(a.b.i);
        }
        if (bl4) {
            this.aK = a2.a(a.b.k);
        }
        if (bl5) {
            this.Y = new short[this.ah];
        }
        if (bl6) {
            this.Z = new short[this.ah];
        }
        if (bl7) {
            this.W = new int[this.ad][];
            this.X = new int[this.ad][];
        }
        this.ad = 0;
        this.ah = 0;
        this.av = 0;
        n2 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            if (hArray[i2] == null) continue;
            int n5 = this.ad;
            for (n4 = 0; n4 < hArray[i2].ad; ++n4) {
                if (a2.f()) {
                    a2.e(this.ad);
                }
                if (!rs.f.a.ah) {
                    this.L[this.ad] = hArray[i2].L[n4];
                    this.M[this.ad] = hArray[i2].M[n4];
                }
                this.ae[this.ad] = hArray[i2].ae[n4];
                this.af[this.ad] = hArray[i2].af[n4];
                this.ag[this.ad] = hArray[i2].ag[n4];
                ++this.ad;
            }
            for (n4 = 0; n4 < hArray[i2].ah; ++n4) {
                if (a2.f()) {
                    a2.d(this.ah);
                }
                this.ai[this.ah] = hArray[i2].ai[n4] + n5;
                this.aj[this.ah] = hArray[i2].aj[n4] + n5;
                this.ak[this.ah] = hArray[i2].ak[n4] + n5;
                this.al[this.ah] = hArray[i2].al[n4];
                this.am[this.ah] = hArray[i2].am[n4];
                this.an[this.ah] = hArray[i2].an[n4];
                if (bl) {
                    if (hArray[i2].ao == null) {
                        this.ao[this.ah] = 0;
                    } else {
                        int n6 = hArray[i2].ao[n4];
                        if ((n6 & 2) == 2) {
                            n6 += n2 << 2;
                        }
                        this.ao[this.ah] = n6;
                    }
                }
                if (bl2) {
                    this.ap[this.ah] = hArray[i2].ap == null ? hArray[i2].au : hArray[i2].ap[n4];
                }
                if (bl3) {
                    this.aq[this.ah] = hArray[i2].aq == null ? 0 : hArray[i2].aq[n4];
                }
                if (bl4 && hArray[i2].ar != null) {
                    this.ar[this.ah] = hArray[i2].ar[n4];
                }
                if (bl5) {
                    this.Y[this.ah] = hArray[i2].Y != null ? hArray[i2].Y[this.ah] : -1;
                }
                if (bl6) {
                    this.Z[this.ah] = hArray[i2].Z != null && hArray[i2].Z[this.ah] != -1 ? (int)(hArray[i2].Z[this.ah] + this.av) : -1;
                }
                ++this.ah;
            }
            for (n4 = 0; n4 < hArray[i2].av; ++n4) {
                this.aw[this.av] = hArray[i2].aw[n4] + n5;
                this.ax[this.av] = hArray[i2].ax[n4] + n5;
                this.ay[this.av] = hArray[i2].ay[n4] + n5;
                ++this.av;
            }
            n2 += hArray[i2].av;
        }
        this.k();
    }

    public h(boolean bl, boolean bl2, boolean bl3, h h2) {
        this(bl, bl2, bl3, h2, h);
    }

    public h(boolean bl, boolean bl2, boolean bl3, h h2, a a2) {
        int n2;
        boolean bl4;
        this.bH = new HashMap();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ++ab;
        this.ad = h2.ad;
        this.ah = h2.ah;
        this.av = h2.av;
        a2.a(this.ah, this.ad);
        boolean bl5 = bl4 = !a2.f();
        if (!bl3 && h2.Y != null) {
            this.Y = new short[this.ah];
            for (n2 = 0; n2 < this.ah; ++n2) {
                if (!bl4) {
                    a2.d(n2);
                    bl4 = true;
                }
                this.Y[n2] = h2.Y[n2];
            }
        } else {
            this.Y = h2.Y;
        }
        if (bl3) {
            this.L = h2.L;
            this.M = h2.M;
            this.ae = h2.ae;
            this.af = h2.af;
            this.ag = h2.ag;
        } else {
            if (h2.L != null) {
                this.L = a2.a(a.b.p);
                this.M = a2.c(a.b.q);
            }
            this.ae = a2.a(a.b.m);
            this.af = a2.a(a.b.n);
            this.ag = a2.a(a.b.o);
            for (n2 = 0; n2 < this.ad; ++n2) {
                if (a2.f()) {
                    a2.e(n2);
                }
                if (!rs.f.a.ah && h2.L != null) {
                    this.L[n2] = h2.L[n2];
                    this.M[n2] = h2.M[n2];
                }
                this.ae[n2] = h2.ae[n2];
                this.af[n2] = h2.af[n2];
                this.ag[n2] = h2.ag[n2];
            }
        }
        if (bl) {
            this.ar = h2.ar;
        } else {
            this.ar = a2.a(a.b.j);
            for (n2 = 0; n2 < this.ah; ++n2) {
                if (!bl4) {
                    a2.d(n2);
                    bl4 = true;
                }
                this.ar[n2] = h2.ar[n2];
            }
        }
        if (bl2) {
            this.aq = h2.aq;
        } else {
            this.aq = a2.a(a.b.i);
            if (h2.aq == null) {
                for (n2 = 0; n2 < this.ah; ++n2) {
                    if (!bl4) {
                        a2.d(n2);
                        bl4 = true;
                    }
                    this.aq[n2] = 0;
                }
            } else {
                for (n2 = 0; n2 < this.ah; ++n2) {
                    if (!bl4) {
                        a2.d(n2);
                        bl4 = true;
                    }
                    this.aq[n2] = h2.aq[n2];
                }
            }
        }
        this.I = h2.I;
        this.L = h2.L;
        this.M = h2.M;
        this.aJ = h2.aJ;
        this.aK = h2.aK;
        this.ao = h2.ao;
        this.ai = h2.ai;
        this.aj = h2.aj;
        this.ak = h2.ak;
        this.ap = h2.ap;
        this.Z = h2.Z;
        this.aa = h2.aa;
        this.au = h2.au;
        this.aw = h2.aw;
        this.ax = h2.ax;
        this.ay = h2.ay;
        this.X = h2.X;
        this.W = h2.W;
    }

    public h(boolean bl, boolean bl2, h h2) {
        this.bH = new HashMap();
        this.bI = -1;
        this.bK = 9;
        this.bL = false;
        this.bM = 360;
        this.bN = 1;
        this.bO = true;
        this.aN = false;
        ++ab;
        this.ad = h2.ad;
        this.ah = h2.ah;
        this.av = h2.av;
        if (bl) {
            this.af = new int[this.ad];
            if (h2.ae != null) {
                System.arraycopy(h2.af, 0, this.af, 0, this.ad);
            } else {
                this.af = null;
            }
        } else {
            this.af = h2.af;
        }
        if (bl2) {
            int n2;
            this.al = new int[this.ah];
            this.am = new int[this.ah];
            this.an = new int[this.ah];
            for (n2 = 0; n2 < this.ah; ++n2) {
                this.al[n2] = h2.al[n2];
                this.am[n2] = h2.am[n2];
                this.an[n2] = h2.an[n2];
            }
            this.ao = new int[this.ah];
            if (h2.ao == null) {
                for (n2 = 0; n2 < this.ah; ++n2) {
                    this.ao[n2] = 0;
                }
            } else {
                for (n2 = 0; n2 < this.ah; ++n2) {
                    this.ao[n2] = h2.ao[n2];
                }
            }
            this.f = new s_0(this.ad);
            for (n2 = 0; n2 < this.ad; ++n2) {
                this.f.a(n2, h2.f.a(n2));
                this.f.b(n2, h2.f.b(n2));
                this.f.c(n2, h2.f.c(n2));
                this.f.d(n2, h2.f.d(n2));
            }
            this.aO = h2.aO;
        } else {
            this.al = h2.al;
            this.am = h2.am;
            this.an = h2.an;
            this.ao = h2.ao;
        }
        this.ae = h2.ae;
        this.ag = h2.ag;
        this.ar = h2.ar;
        this.aq = h2.aq;
        this.Y = h2.Y;
        this.Z = h2.Z;
        this.aa = h2.aa;
        this.ap = h2.ap;
        this.au = h2.au;
        this.ai = h2.ai;
        this.aj = h2.aj;
        this.ak = h2.ak;
        this.aw = h2.aw;
        this.ax = h2.ax;
        this.ay = h2.ay;
        this.g = h2.g;
        this.aD = h2.aD;
        this.aG = h2.aG;
        this.aF = h2.aF;
        this.W = h2.W;
        this.X = h2.X;
        this.az = h2.az;
        this.aB = h2.aB;
        this.aC = h2.aC;
        this.aA = h2.aA;
    }

    public void a(h h2, boolean bl) {
        int n2;
        this.m = h2.m;
        this.ad = h2.ad;
        this.ah = h2.ah;
        this.av = h2.av;
        if (bS.length < this.ad) {
            bS = new int[this.ad + 10000];
            bT = new int[this.ad + 10000];
            bU = new int[this.ad + 10000];
            bQ = new int[this.ad + 10000];
            bR = new byte[this.ad + 10000];
        }
        this.L = bQ;
        this.M = bR;
        this.ae = bS;
        this.af = bT;
        this.ag = bU;
        for (n2 = 0; n2 < this.ad; ++n2) {
            if (!rs.f.a.ah && this.L != null) {
                this.L[n2] = h2.L[n2];
                if (this.M != null) {
                    this.M[n2] = h2.M[n2];
                }
            }
            this.ae[n2] = h2.ae[n2];
            this.af[n2] = h2.af[n2];
            this.ag[n2] = h2.ag[n2];
        }
        if (bl) {
            this.aq = h2.aq;
        } else {
            if (bV.length < this.ah) {
                bV = new int[this.ah + 100];
            }
            this.aq = bV;
            if (h2.aq == null) {
                for (n2 = 0; n2 < this.ah; ++n2) {
                    this.aq[n2] = 0;
                }
            } else {
                for (n2 = 0; n2 < this.ah; ++n2) {
                    this.aq[n2] = h2.aq[n2];
                }
            }
        }
        this.ao = h2.ao;
        this.ar = h2.ar;
        this.ap = h2.ap;
        this.au = h2.au;
        this.aM = h2.aM;
        this.aL = h2.aL;
        this.ai = h2.ai;
        this.aj = h2.aj;
        this.ak = h2.ak;
        this.al = h2.al;
        this.am = h2.am;
        this.an = h2.an;
        this.aw = h2.aw;
        this.ax = h2.ax;
        this.ay = h2.ay;
        this.Z = h2.Z;
        this.aa = h2.aa;
        this.Y = h2.Y;
        this.I = h2.I;
        this.W = h2.W;
        this.X = h2.X;
    }

    private final int a(h h2, int n2) {
        int n3 = -1;
        int n4 = rs.f.a.ah || h2.L == null ? 0 : h2.L[n2];
        byte by = rs.f.a.ah || h2.M == null ? (byte)0 : h2.M[n2];
        int n5 = h2.ae[n2];
        int n6 = h2.af[n2];
        int n7 = h2.ag[n2];
        for (int i2 = 0; i2 < this.ad; ++i2) {
            if (n5 != this.ae[i2] || n6 != this.af[i2] || n7 != this.ag[i2]) continue;
            n3 = i2;
            break;
        }
        if (n3 == -1) {
            if (!rs.f.a.ah && h2.L != null) {
                this.L[this.ad] = n4;
            }
            if (!rs.f.a.ah && h2.M != null) {
                this.M[this.ad] = by;
            }
            this.ae[this.ad] = n5;
            this.af[this.ad] = n6;
            this.ag[this.ad] = n7;
            if (h2.aJ != null) {
                this.aJ[this.ad] = h2.aJ[n2];
            }
            if (h2.W != null) {
                this.W[this.ad] = h2.W[n2];
                this.X[this.ad] = h2.X[n2];
            }
            n3 = this.ad++;
        }
        return n3;
    }

    public void k() {
        this.g = 0;
        this.aD = 0;
        this.aE = 0;
        for (int i2 = 0; i2 < this.ad; ++i2) {
            int n2;
            int n3 = this.ae[i2];
            int n4 = this.af[i2];
            int n5 = this.ag[i2];
            if (-n4 > this.g) {
                this.g = -n4;
            }
            if (n4 > this.aE) {
                this.aE = n4;
            }
            if ((n2 = n3 * n3 + n5 * n5) <= this.aD) continue;
            this.aD = n2;
        }
        this.aD = (int)(Math.sqrt(this.aD) + 0.99);
        this.aG = (int)(Math.sqrt(this.aD * this.aD + this.g * this.g) + 0.99);
        this.aF = this.aG + (int)(Math.sqrt(this.aD * this.aD + this.aE * this.aE) + 0.99);
    }

    public void a(int[][] nArray, int n2, int n3, int n4, boolean bl, int n5) {
        this.l();
        int n6 = n2 - this.aD;
        int n7 = n2 + this.aD;
        int n8 = n4 - this.aD;
        int n9 = n4 + this.aD;
        if (n6 >= 0 && n7 + 128 >> 7 < nArray.length && n8 >= 0 && n9 + 128 >> 7 < nArray[0].length) {
            n7 = n7 + 127 >> 7;
            n9 = n9 + 127 >> 7;
            if (n3 == nArray[n6 >>= 7][n8 >>= 7] && n3 == nArray[n7][n8] && n3 == nArray[n6][n9] && n3 == nArray[n7][n9]) {
                return;
            }
            if (n5 == 0) {
                for (int i2 = 0; i2 < this.ad; ++i2) {
                    int n10 = n2 + this.ae[i2];
                    int n11 = n4 + this.ag[i2];
                    int n12 = n10 & 0x7F;
                    int n13 = n11 & 0x7F;
                    int n14 = n10 >> 7;
                    int n15 = n11 >> 7;
                    int n16 = nArray[n14][n15] * (128 - n12) + nArray[n14 + 1][n15] * n12 >> 7;
                    int n17 = nArray[n14][n15 + 1] * (128 - n12) + n12 * nArray[n14 + 1][n15 + 1] >> 7;
                    int n18 = n16 * (128 - n13) + n17 * n13 >> 7;
                    this.af[i2] = n18 + this.af[i2] - n3;
                }
            }
            this.l();
        }
    }

    public void l() {
        this.g = 0;
        this.aE = 0;
        for (int i2 = 0; i2 < this.ad; ++i2) {
            int n2 = this.af[i2];
            if (-n2 > this.g) {
                this.g = -n2;
            }
            if (n2 <= this.aE) continue;
            this.aE = n2;
        }
        this.aG = (int)(Math.sqrt(this.aD * this.aD + this.g * this.g) + 0.99);
        this.aF = this.aG + (int)(Math.sqrt(this.aD * this.aD + this.aE * this.aE) + 0.99);
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = 0;
        int n11 = this.aA - this.az;
        int n12 = this.aE - this.g;
        int n13 = this.aB - this.aC;
        double d2 = (double)n8 / (double)n11;
        double d3 = -((double)n9 / (double)n12);
        double d4 = Math.min(d2, d3);
        n6 = Math.abs(n12 / 2);
        int n14 = (int)((double)n13 / d4);
        int n15 = (n14 -= n12) < n7 / 2 ? n7 / 2 : n7;
        n14 = (int)Math.ceil((double)n14 / (double)n15) * n15;
        n14 = Math.max(n14, n7 / 2);
        n14 = (int)((double)n14 - (double)n4 / d4 * 4.0);
        n7 = e_0.w[n10] * Math.max(n7 / 2, n14) >> 16;
        this.a(n2, n3, 0, n5, n6, n7);
        this.r = n8 * n9;
    }

    public void m() {
        this.g = 0;
        this.aD = 0;
        this.aE = 0;
        this.az = 999999;
        this.aA = -999999;
        this.aB = -99999;
        this.aC = 99999;
        for (int i2 = 0; i2 < this.ad; ++i2) {
            int n2;
            int n3 = this.ae[i2];
            int n4 = this.af[i2];
            int n5 = this.ag[i2];
            if (n3 < this.az) {
                this.az = n3;
            }
            if (n3 > this.aA) {
                this.aA = n3;
            }
            if (n5 < this.aC) {
                this.aC = n5;
            }
            if (n5 > this.aB) {
                this.aB = n5;
            }
            if (-n4 > this.g) {
                this.g = -n4;
            }
            if (n4 > this.aE) {
                this.aE = n4;
            }
            if ((n2 = n3 * n3 + n5 * n5) <= this.aD) continue;
            this.aD = n2;
        }
        this.aD = (int)Math.sqrt(this.aD);
        this.aG = (int)Math.sqrt(this.aD * this.aD + this.g * this.g);
        this.aF = this.aG + (int)Math.sqrt(this.aD * this.aD + this.aE * this.aE);
    }

    public void n() {
        int n2;
        int n3;
        int n4;
        if (this.i.l != null) {
            this.aL = this.i.l;
            this.aJ = null;
        }
        if (this.i.m != null) {
            this.aM = this.i.m;
            this.aK = null;
        }
        if (this.aJ != null) {
            n4 = 0;
            System.arraycopy(s, 0, t, 0, 256);
            for (n3 = 0; n3 < this.ad; ++n3) {
                int n5 = n2 = this.aJ[n3];
                t[n5] = t[n5] + 1;
                if (n2 <= n4) continue;
                n4 = n2;
            }
            this.aL = new int[n4 + 1][];
            for (n3 = 0; n3 <= n4; ++n3) {
                this.aL[n3] = new int[t[n3]];
                rs.a.h.t[n3] = 0;
            }
            n3 = 0;
            while (n3 < this.ad) {
                int n6 = n2 = this.aJ[n3];
                int n7 = t[n6];
                t[n6] = n7 + 1;
                this.aL[n2][n7] = n3++;
            }
            if (this.i.f()) {
                this.i.l = (int[][])Arrays.copyOf(this.aL, this.aL.length);
            }
            this.aJ = null;
        }
        if (this.aK != null) {
            System.arraycopy(s, 0, u, 0, 256);
            n4 = 0;
            for (n3 = 0; n3 < this.ah; ++n3) {
                int n8 = n2 = this.aK[n3];
                u[n8] = u[n8] + 1;
                if (n2 <= n4) continue;
                n4 = n2;
            }
            this.aM = new int[n4 + 1][];
            for (n3 = 0; n3 <= n4; ++n3) {
                this.aM[n3] = new int[u[n3]];
                rs.a.h.u[n3] = 0;
            }
            n3 = 0;
            while (n3 < this.ah) {
                int n9 = n2 = this.aK[n3];
                int n10 = u[n9];
                u[n9] = n10 + 1;
                this.aM[n2][n10] = n3++;
            }
            if (this.i.f()) {
                this.i.m = (int[][])Arrays.copyOf(this.aM, this.aM.length);
            }
            this.aK = null;
        }
    }

    public h c(boolean bl) {
        h h2 = new h(true, bl, false, this);
        h2.n();
        return h2;
    }

    public h d(boolean bl) {
        h h2 = ac;
        h2.a(this, bl);
        h2.k();
        h2.n();
        return h2;
    }

    public void a(rs.u.b b2, int n2) {
        if (n2 == -1) {
            return;
        }
        if (b2 == null) {
            return;
        }
        k_0 k_02 = b2.base;
        j j2 = k_02.b();
        if (j2 != null) {
            j2.a(b2, n2);
            this.a(j2, b2.c());
        }
        if (b2.d()) {
            this.b(b2, n2);
        }
        this.k();
        this.aM = null;
        this.aL = null;
    }

    void a(j j2, int n2) {
        if (this.W != null) {
            for (int i2 = 0; i2 < this.ad; ++i2) {
                int[] nArray = this.W[i2];
                if (nArray == null || nArray.length == 0) continue;
                int[] nArray2 = this.X[i2];
                aR.f();
                for (int i3 = 0; i3 < nArray.length; ++i3) {
                    int n3 = nArray[i3];
                    rs.u.d d2 = j2.a(n3);
                    if (d2 == null) continue;
                    aS.a((float)nArray2[i3] / 255.0f);
                    aT.a(d2.d(n2));
                    aT.c(aS);
                    aR.b(aT);
                }
                this.a(i2, aR);
            }
        }
    }

    void a(int n2, com.a.b.a.b b2) {
        float f2 = this.ae[n2];
        float f3 = -this.af[n2];
        float f4 = -this.ag[n2];
        float f5 = 1.0f;
        this.ae[n2] = (int)(b2.e[0] * f2 + b2.e[4] * f3 + b2.e[8] * f4 + b2.e[12] * f5);
        this.af[n2] = -((int)(b2.e[1] * f2 + b2.e[5] * f3 + b2.e[9] * f4 + b2.e[13] * f5));
        this.ag[n2] = -((int)(b2.e[2] * f2 + b2.e[6] * f3 + b2.e[10] * f4 + b2.e[14] * f5));
    }

    void b(rs.u.b b2, int n2) {
        k_0 k_02 = b2.base;
        for (int i2 = 0; i2 < k_02.b; ++i2) {
            int n3 = k_02.d[i2];
            if (n3 != 5 || b2.e == null || b2.e[i2] == null || b2.e[i2][0] == null || this.aM == null || this.aq == null) continue;
            g g2 = b2.e[i2][0];
            for (int n4 : k_02.e[i2]) {
                if (n4 >= this.aM.length) continue;
                int[] nArray = this.aM[n4];
                for (int i3 = 0; i3 < nArray.length; ++i3) {
                    int n5 = nArray[i3];
                    int n6 = (int)((float)(this.aq[n5] & 0xFF) + g2.a(n2) * 255.0f);
                    if (n6 < 0) {
                        n6 = 0;
                    } else if (n6 > 255) {
                        n6 = 255;
                    }
                    this.aq[n5] = n6;
                }
            }
        }
    }

    public void a(k_0 k_02, rs.u.b b2, int n2, boolean[] blArray, boolean bl, boolean bl2) {
        j j2 = k_02.b();
        if (j2 != null) {
            j2.a(b2, n2, blArray, bl);
            if (bl2) {
                this.a(j2, b2.c());
            }
        }
        if (!bl && b2.d()) {
            this.b(b2, n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f(int n2, int n3) {
        k k2;
        if (this.aL == null) {
            return;
        }
        if (n2 == -1) {
            return;
        }
        try {
            rs.cache.osrs.c.a(rs.d.a.a[n3].w);
            k2 = rs.k.c(n2, n3);
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
        if (k2 == null) {
            return;
        }
        k_0 k_02 = k2.g;
        bq = 0;
        br = 0;
        bs = 0;
        for (int i2 = 0; i2 < k2.h; ++i2) {
            int n4 = k2.k[i2];
            this.a(k_02.d[n4], k_02.e[n4], k2.l[i2], k2.m[i2], k2.n[i2]);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int[] nArray, int n2, int n3, int n4) {
        int n5;
        int n6;
        if (n3 == -1) {
            return;
        }
        if (nArray == null || n2 == -1) {
            this.f(n3, n4);
            return;
        }
        k k2 = null;
        try {
            rs.cache.osrs.c.a(rs.d.a.a[n4].w);
            k2 = rs.k.c(n3, n4);
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
        if (k2 == null) {
            return;
        }
        k k3 = null;
        try {
            rs.cache.osrs.c.a(rs.d.a.a[n4].w);
            k3 = rs.k.c(n2, n4);
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
        if (k3 == null) {
            this.f(n3, n4);
            return;
        }
        k_0 k_02 = k2.g;
        bq = 0;
        br = 0;
        bs = 0;
        int n7 = 0;
        if (n7 > nArray.length - 1) {
            this.f(n3, n4);
            return;
        }
        int n8 = nArray[n7++];
        for (n6 = 0; n6 < k2.h; ++n6) {
            n5 = k2.k[n6];
            while (n5 > n8) {
                n8 = nArray[n7++];
            }
            if (n5 == n8 && k_02.d[n5] != 0) continue;
            this.a(k_02.d[n5], k_02.e[n5], k2.l[n6], k2.m[n6], k2.n[n6]);
        }
        bq = 0;
        br = 0;
        bs = 0;
        n7 = 0;
        if (n7 > nArray.length - 1) {
            this.f(n3, n4);
            return;
        }
        n8 = nArray[n7++];
        for (n6 = 0; n6 < k3.h; ++n6) {
            n5 = k3.k[n6];
            while (n5 > n8) {
                n8 = nArray[n7++];
            }
            if (n5 != n8 && k_02.d[n5] != 0) continue;
            this.a(k_02.d[n5], k_02.e[n5], k3.l[n6], k3.m[n6], k3.n[n6]);
        }
    }

    private void a(int n2, int[] nArray, int n3, int n4, int n5) {
        int n6 = nArray.length;
        if (n2 == 0) {
            int n7 = 0;
            bq = 0;
            br = 0;
            bs = 0;
            for (int i2 = 0; i2 < n6; ++i2) {
                int n8 = nArray[i2];
                if (n8 >= this.aL.length) continue;
                int[] nArray2 = this.aL[n8];
                for (int i3 = 0; i3 < nArray2.length; ++i3) {
                    int n9 = nArray2[i3];
                    bq += this.ae[n9];
                    br += this.af[n9];
                    bs += this.ag[n9];
                    ++n7;
                }
            }
            if (n7 > 0) {
                bq = bq / n7 + n3;
                br = br / n7 + n4;
                bs = bs / n7 + n5;
                return;
            }
            bq = n3;
            br = n4;
            bs = n5;
            return;
        }
        if (n2 == 1) {
            for (int i4 = 0; i4 < n6; ++i4) {
                int n10 = nArray[i4];
                if (n10 >= this.aL.length) continue;
                int[] nArray3 = this.aL[n10];
                for (int i5 = 0; i5 < nArray3.length; ++i5) {
                    int n11;
                    int n12 = n11 = nArray3[i5];
                    this.ae[n12] = this.ae[n12] + n3;
                    int n13 = n11;
                    this.af[n13] = this.af[n13] + n4;
                    int n14 = n11;
                    this.ag[n14] = this.ag[n14] + n5;
                }
            }
            return;
        }
        if (n2 == 2) {
            for (int i6 = 0; i6 < n6; ++i6) {
                int n15 = nArray[i6];
                if (n15 >= this.aL.length) continue;
                int[] nArray4 = this.aL[n15];
                for (int i7 = 0; i7 < nArray4.length; ++i7) {
                    int n16;
                    int n17;
                    int n18;
                    int n19;
                    int n20 = n19 = nArray4[i7];
                    this.ae[n20] = this.ae[n20] - bq;
                    int n21 = n19;
                    this.af[n21] = this.af[n21] - br;
                    int n22 = n19;
                    this.ag[n22] = this.ag[n22] - bs;
                    int n23 = (n3 & 0xFF) * 8;
                    int n24 = (n4 & 0xFF) * 8;
                    int n25 = (n5 & 0xFF) * 8;
                    if (n25 != 0) {
                        n18 = bA[n25];
                        n17 = bB[n25];
                        n16 = this.af[n19] * n18 + this.ae[n19] * n17 >> 16;
                        this.af[n19] = this.af[n19] * n17 - this.ae[n19] * n18 >> 16;
                        this.ae[n19] = n16;
                    }
                    if (n23 != 0) {
                        n18 = bA[n23];
                        n17 = bB[n23];
                        n16 = this.af[n19] * n17 - this.ag[n19] * n18 >> 16;
                        this.ag[n19] = this.af[n19] * n18 + this.ag[n19] * n17 >> 16;
                        this.af[n19] = n16;
                    }
                    if (n24 != 0) {
                        n18 = bA[n24];
                        n17 = bB[n24];
                        n16 = this.ag[n19] * n18 + this.ae[n19] * n17 >> 16;
                        this.ag[n19] = this.ag[n19] * n17 - this.ae[n19] * n18 >> 16;
                        this.ae[n19] = n16;
                    }
                    int n26 = n19;
                    this.ae[n26] = this.ae[n26] + bq;
                    int n27 = n19;
                    this.af[n27] = this.af[n27] + br;
                    int n28 = n19;
                    this.ag[n28] = this.ag[n28] + bs;
                }
            }
            return;
        }
        if (n2 == 3) {
            for (int i8 = 0; i8 < n6; ++i8) {
                int n29 = nArray[i8];
                if (n29 >= this.aL.length) continue;
                int[] nArray5 = this.aL[n29];
                for (int i9 = 0; i9 < nArray5.length; ++i9) {
                    int n30;
                    int n31 = n30 = nArray5[i9];
                    this.ae[n31] = this.ae[n31] - bq;
                    int n32 = n30;
                    this.af[n32] = this.af[n32] - br;
                    int n33 = n30;
                    this.ag[n33] = this.ag[n33] - bs;
                    this.ae[n30] = this.ae[n30] * n3 / 128;
                    this.af[n30] = this.af[n30] * n4 / 128;
                    this.ag[n30] = this.ag[n30] * n5 / 128;
                    int n34 = n30;
                    this.ae[n34] = this.ae[n34] + bq;
                    int n35 = n30;
                    this.af[n35] = this.af[n35] + br;
                    int n36 = n30;
                    this.ag[n36] = this.ag[n36] + bs;
                }
            }
            return;
        }
        if (n2 == 5 && this.aM != null && this.aq != null) {
            for (int i10 = 0; i10 < n6; ++i10) {
                int n37 = nArray[i10];
                if (n37 >= this.aM.length) continue;
                int[] nArray6 = this.aM[n37];
                for (int i11 = 0; i11 < nArray6.length; ++i11) {
                    int n38;
                    int n39 = n38 = nArray6[i11];
                    this.aq[n39] = this.aq[n39] + n3 * 8;
                    if (this.aq[n38] < 0) {
                        this.aq[n38] = 0;
                    }
                    if (this.aq[n38] <= 255) continue;
                    this.aq[n38] = 255;
                }
            }
        }
    }

    public void b(int[] nArray, int n2) {
        if (this.aq == null) {
            this.aq = new int[this.ah];
        }
        for (int i2 = 0; i2 < this.ah; ++i2) {
            for (int n3 : nArray) {
                if (n3 != this.ar[i2]) continue;
                this.aq[i2] = 100 - n2;
            }
        }
    }

    public void g(int n2, int n3) {
        if (this.aq == null) {
            this.aq = new int[this.ah];
        }
        if (n3 != -1) {
            this.aq[n3] = n2;
        } else {
            for (int i2 = 0; i2 < this.ah; ++i2) {
                this.aq[i2] = 100 - n2;
            }
        }
    }

    public void g(int n2) {
        for (int i2 = 0; i2 < this.ah; ++i2) {
            if (this.ar[i2] >= 40 && this.ar[i2] <= 100) continue;
            this.ar[i2] = n2;
        }
    }

    public void h(int n2) {
        for (int i2 = 0; i2 < this.ah; ++i2) {
            if (this.ar[i2] >= 15 && this.ar[i2] <= 255) continue;
            this.ar[i2] = n2;
        }
    }

    public void h(int n2, int n3) {
        for (int i2 = 0; i2 < this.ah; ++i2) {
            if (this.ar[i2] <= n3) continue;
            this.ar[i2] = n2;
        }
    }

    public void i(int n2) {
        for (int i2 = 0; i2 < this.ah; ++i2) {
            if (this.ar[i2] <= 1) continue;
            this.ar[i2] = n2;
        }
    }

    public void o() {
        for (int i2 = 0; i2 < this.ad; ++i2) {
            int n2 = this.ae[i2];
            this.ae[i2] = this.ag[i2];
            this.ag[i2] = -n2;
        }
    }

    public void j(int n2) {
        int n3 = bA[n2];
        int n4 = bB[n2];
        for (int i2 = 0; i2 < this.ad; ++i2) {
            int n5 = this.af[i2] * n4 - this.ag[i2] * n3 >> 16;
            this.ag[i2] = this.af[i2] * n3 + this.ag[i2] * n4 >> 16;
            this.af[i2] = n5;
        }
    }

    public void a(int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < this.ad) {
            int n6 = n5;
            this.ae[n6] = this.ae[n6] + n2;
            int n7 = n5;
            this.af[n7] = this.af[n7] + n3;
            int n8 = n5++;
            this.ag[n8] = this.ag[n8] + n4;
        }
    }

    public void i(int n2, int n3) {
        for (int i2 = 0; i2 < this.ah; ++i2) {
            if (this.ar[i2] != n2) continue;
            this.ar[i2] = n3;
        }
    }

    public void p() {
        int n2;
        for (n2 = 0; n2 < this.ad; ++n2) {
            this.ag[n2] = -this.ag[n2];
        }
        for (n2 = 0; n2 < this.ah; ++n2) {
            int n3 = this.ai[n2];
            this.ai[n2] = this.ak[n2];
            this.ak[n2] = n3;
        }
    }

    public void b(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.ad; ++i2) {
            this.ae[i2] = this.ae[i2] * n2 / 128;
            this.af[i2] = this.af[i2] * n4 / 128;
            this.ag[i2] = this.ag[i2] * n3 / 128;
        }
    }

    public void q() {
        if (this.f == null) {
            this.f = this.i.b(this.ad);
            for (int i2 = 0; i2 < this.ah; ++i2) {
                boolean bl;
                int n2;
                int n3 = this.ai[i2];
                int n4 = this.aj[i2];
                int n5 = this.ak[i2];
                int n6 = this.ae[n4] - this.ae[n3];
                int n7 = this.af[n4] - this.af[n3];
                int n8 = this.ag[n4] - this.ag[n3];
                int n9 = this.ae[n5] - this.ae[n3];
                int n10 = this.af[n5] - this.af[n3];
                int n11 = this.ag[n5] - this.ag[n3];
                int n12 = n7 * n11 - n10 * n8;
                int n13 = n8 * n9 - n11 * n6;
                for (n2 = n6 * n10 - n9 * n7; n12 > 8192 || n13 > 8192 || n2 > 8192 || n12 < -8192 || n13 < -8192 || n2 < -8192; n12 >>= 1, n13 >>= 1, n2 >>= 1) {
                }
                int n14 = (int)Math.sqrt(n12 * n12 + n13 * n13 + n2 * n2);
                if (n14 <= 0) {
                    n14 = 1;
                }
                n12 = n12 * 256 / n14;
                n13 = n13 * 256 / n14;
                n2 = n2 * 256 / n14;
                if (this.ao == null) {
                    bl = false;
                } else {
                    boolean bl2 = bl = (this.ao[i2] & 1) == 1;
                }
                if (!bl) {
                    this.f.e(n3, n12);
                    this.f.f(n3, n13);
                    this.f.g(n3, n2);
                    this.f.h(n3, 1);
                    this.f.e(n4, n12);
                    this.f.f(n4, n13);
                    this.f.g(n4, n2);
                    this.f.h(n4, 1);
                    this.f.e(n5, n12);
                    this.f.f(n5, n13);
                    this.f.g(n5, n2);
                    this.f.h(n5, 1);
                    continue;
                }
                if (!bl) continue;
                if (this.aQ == null) {
                    this.aQ = this.i.a(this.ah);
                }
                this.aQ.a(i2, n12);
                this.aQ.b(i2, n13);
                this.aQ.c(i2, n2);
            }
        }
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, boolean bl) {
        int n7;
        int n8 = (int)Math.sqrt(n4 * n4 + n5 * n5 + n6 * n6);
        int n9 = n3 * n8 >> 8;
        if (this.al == null) {
            this.i.a(this.ah, this.ad);
            this.al = this.i.a(a.b.d);
            this.am = this.i.a(a.b.e);
            this.an = this.i.a(a.b.f);
        }
        if (this.f == null) {
            this.f = this.i.b(this.ad);
        }
        for (n7 = 0; n7 < this.ah; ++n7) {
            int n10;
            if (this.ar != null && this.aq != null && (this.ar[n7] == 65535 || this.ar[n7] == 0 && this.k == 1 || this.ar[n7] == 16705)) {
                this.aq[n7] = 255;
            }
            int n11 = this.ai[n7];
            int n12 = this.aj[n7];
            int n13 = this.ak[n7];
            int n14 = this.ae[n12] - this.ae[n11];
            int n15 = this.af[n12] - this.af[n11];
            int n16 = this.ag[n12] - this.ag[n11];
            int n17 = this.ae[n13] - this.ae[n11];
            int n18 = this.af[n13] - this.af[n11];
            int n19 = this.ag[n13] - this.ag[n11];
            int n20 = n15 * n19 - n18 * n16;
            int n21 = n16 * n17 - n19 * n14;
            for (n10 = n14 * n18 - n17 * n15; n20 > 8192 || n21 > 8192 || n10 > 8192 || n20 < -8192 || n21 < -8192 || n10 < -8192; n20 >>= 1, n21 >>= 1, n10 >>= 1) {
            }
            int n22 = (int)Math.sqrt(n20 * n20 + n21 * n21 + n10 * n10);
            if (n22 <= 0) {
                n22 = 1;
            }
            n20 = n20 * 256 / n22;
            n21 = n21 * 256 / n22;
            n10 = n10 * 256 / n22;
            if (this.ao == null || (this.ao[n7] & 1) == 0) {
                this.f.e(n11, n20);
                this.f.f(n11, n21);
                this.f.g(n11, n10);
                this.f.h(n11, 1);
                this.f.e(n12, n20);
                this.f.f(n12, n21);
                this.f.g(n12, n10);
                this.f.h(n12, 1);
                this.f.e(n13, n20);
                this.f.f(n13, n21);
                this.f.g(n13, n10);
                this.f.h(n13, 1);
                continue;
            }
            int n23 = n2;
            int n24 = n4;
            int n25 = n5;
            int n26 = n6;
            if (this.Y != null && n7 < this.Y.length && n7 > 0 && this.Y[n7] != -1) {
                n23 = 64;
                n24 = -30;
                n25 = -50;
                n26 = -30;
            }
            int n27 = n23 + (n24 * n20 + n25 * n21 + n26 * n10) / (n9 + n9 / 2);
            this.al[n7] = rs.a.h.c(this.ar[n7], n27, this.ao[n7]);
        }
        if (bl) {
            this.a(n2, n9, n4, n5, n6);
        } else {
            this.aO = this.i.c(this.ad);
            for (n7 = 0; n7 < this.ad; ++n7) {
                this.aO.a(n7, this.f.a(n7));
                this.aO.b(n7, this.f.b(n7));
                this.aO.c(n7, this.f.c(n7));
                this.aO.d(n7, this.f.d(n7));
            }
        }
        if (bl) {
            this.k();
        } else {
            this.m();
        }
    }

    public final void b(int n2, int n3, int n4, int n5, int n6, boolean bl) {
        int n7;
        if (!rs.k.e.a() || e_0.h) {
            this.a(n2, n3, n4, n5, n6, bl);
            return;
        }
        int n8 = (int)Math.sqrt(n4 * n4 + n5 * n5 + n6 * n6);
        int n9 = n3 * n8 >> 8;
        if (this.al == null) {
            this.i.a(this.ah, this.ad);
            this.al = this.i.a(a.b.d);
            this.am = this.i.a(a.b.e);
            this.an = this.i.a(a.b.f);
        }
        this.q();
        for (n7 = 0; n7 < this.ah; ++n7) {
            int n10;
            s_0 s_02;
            int n11;
            if (this.ar != null && this.aq != null && (this.ar[n7] == 65535 || this.ar[n7] == 0 && this.k == 1 || this.ar[n7] == 16705)) {
                this.aq[n7] = 255;
            }
            int n12 = this.ao == null ? 0 : ((this.ao[n7] & 1) == 1 ? 1 : 0);
            int n13 = this.aq == null ? 0 : this.aq[n7];
            int n14 = this.Y == null ? (this.a(n7) ? (int)((short)this.ar[n7]) : -1) : (this.Y[n7] <= 0 && this.a(n7) ? (int)((short)this.ar[n7]) : this.Y[n7]);
            if (n13 == -2) {
                n12 = 3;
            }
            if (n13 == -1) {
                n12 = 2;
            }
            if (n14 == -1) {
                if (n12 == 0) {
                    n11 = this.ar[n7] & 0xFFFF;
                    int n15 = this.ai[n7];
                    s_02 = this.aP != null && !this.aP.e(this.ai[n7]) ? this.aP : this.f;
                    n10 = (n5 * s_02.b(n15) + n6 * s_02.c(n15) + n4 * s_02.a(n15)) / (n9 * s_02.d(n15)) + n2;
                    n15 = this.aj[n7];
                    this.al[n7] = rs.a.h.j(n11, n10);
                    s_02 = this.aP != null && !this.aP.e(this.aj[n7]) ? this.aP : this.f;
                    n10 = (n5 * s_02.b(n15) + n6 * s_02.c(n15) + n4 * s_02.a(n15)) / (n9 * s_02.d(n15)) + n2;
                    n15 = this.ak[n7];
                    this.am[n7] = rs.a.h.j(n11, n10);
                    s_02 = this.aP != null && !this.aP.e(this.ak[n7]) ? this.aP : this.f;
                    n10 = (n5 * s_02.b(n15) + n6 * s_02.c(n15) + n4 * s_02.a(n15)) / (n9 * s_02.d(n15)) + n2;
                    this.an[n7] = rs.a.h.j(n11, n10);
                    continue;
                }
                if (n12 == 1) {
                    n10 = (n5 * this.aQ.b(n7) + n6 * this.aQ.c(n7) + n4 * this.aQ.a(n7)) / (n9 / 2 + n9) + n2;
                    this.al[n7] = rs.a.h.j(this.ar[n7] & 0xFFFF, n10);
                    this.an[n7] = -1;
                    continue;
                }
                if (n12 == 3) {
                    this.al[n7] = 128;
                    this.an[n7] = -1;
                    continue;
                }
                this.an[n7] = -2;
                continue;
            }
            if (n12 == 0) {
                n11 = this.ai[n7];
                s_02 = this.aP != null && !this.aP.e(this.ai[n7]) ? this.aP : this.f;
                n10 = (n5 * s_02.b(n11) + n6 * s_02.c(n11) + n4 * s_02.a(n11)) / (n9 * s_02.d(n11)) + n2;
                n11 = this.aj[n7];
                this.al[n7] = rs.a.h.k(n10);
                s_02 = this.aP != null && !this.aP.e(this.aj[n7]) ? this.aP : this.f;
                n10 = (n5 * s_02.b(n11) + n6 * s_02.c(n11) + n4 * s_02.a(n11)) / (n9 * s_02.d(n11)) + n2;
                n11 = this.ak[n7];
                this.am[n7] = rs.a.h.k(n10);
                s_02 = this.aP != null && !this.aP.e(this.ak[n7]) ? this.aP : this.f;
                n10 = (n5 * s_02.b(n11) + n6 * s_02.c(n11) + n4 * s_02.a(n11)) / (n9 * s_02.d(n11)) + n2;
                this.an[n7] = rs.a.h.k(n10);
                continue;
            }
            if (n12 == 1) {
                n10 = (n5 * this.aQ.b(n7) + n6 * this.aQ.c(n7) + n4 * this.aQ.a(n7)) / (n9 / 2 + n9) + n2;
                this.al[n7] = rs.a.h.k(n10);
                this.an[n7] = -1;
                continue;
            }
            this.an[n7] = -2;
        }
        if (bl) {
            this.a(n2, n9, n4, n5, n6);
        } else {
            this.aO = this.i.c(this.ad);
            for (n7 = 0; n7 < this.ad; ++n7) {
                this.aO.a(n7, this.f.a(n7));
                this.aO.b(n7, this.f.b(n7));
                this.aO.c(n7, this.f.c(n7));
                this.aO.d(n7, this.f.d(n7));
            }
        }
        if (bl) {
            this.k();
        } else {
            this.m();
        }
    }

    public final void a(int n2, int n3, int n4, int n5, int n6) {
        int n7;
        s_0 s_02 = null;
        for (n7 = 0; n7 < this.ah; ++n7) {
            int n8;
            int n9;
            int n10 = this.ai[n7];
            int n11 = this.aj[n7];
            int n12 = this.ak[n7];
            int n13 = n2;
            int n14 = n3;
            int n15 = n4;
            int n16 = n5;
            int n17 = n6;
            if (rs.k.e.a() && n7 >= 0 && this.a(n7) && (this.z || this.A)) {
                n15 *= -1;
                n17 *= -1;
                n13 = 50;
            }
            s_02 = this.f;
            if (this.ao == null) {
                n9 = this.ar[n7];
                n8 = n13 + (n15 * s_02.a(n10) + n16 * s_02.b(n10) + n17 * s_02.c(n10)) / (n14 * s_02.d(n10));
                this.al[n7] = rs.a.h.c(n9, n8, 0);
                n8 = n13 + (n15 * s_02.a(n11) + n16 * s_02.b(n11) + n17 * s_02.c(n11)) / (n14 * s_02.d(n11));
                this.am[n7] = rs.a.h.c(n9, n8, 0);
                n8 = n13 + (n15 * s_02.a(n12) + n16 * s_02.b(n12) + n17 * s_02.c(n12)) / (n14 * s_02.d(n12));
                this.an[n7] = rs.a.h.c(n9, n8, 0);
                continue;
            }
            if ((this.ao[n7] & 1) != 0) continue;
            n9 = this.ar[n7];
            n8 = this.ao[n7];
            int n18 = n13 + (n15 * s_02.a(n10) + n16 * s_02.b(n10) + n17 * s_02.c(n10)) / (n14 * s_02.d(n10));
            this.al[n7] = rs.a.h.c(n9, n18, n8);
            n18 = n13 + (n15 * s_02.a(n11) + n16 * s_02.b(n11) + n17 * s_02.c(n11)) / (n14 * s_02.d(n11));
            this.am[n7] = rs.a.h.c(n9, n18, n8);
            n18 = n13 + (n15 * s_02.a(n12) + n16 * s_02.b(n12) + n17 * s_02.c(n12)) / (n14 * s_02.d(n12));
            this.an[n7] = rs.a.h.c(n9, n18, n8);
        }
        if (rs.k.e.a()) {
            this.f();
        }
        this.f = null;
        this.aO = null;
        this.aJ = null;
        this.aK = null;
        if (this.ao != null) {
            for (n7 = 0; n7 < this.ah; ++n7) {
                if ((this.ao[n7] & 2) != 2) continue;
                return;
            }
        }
        this.ar = null;
    }

    static final int k(int n2) {
        if (n2 < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = 126;
        }
        return n2;
    }

    static final int j(int n2, int n3) {
        if ((n3 = (n2 & 0x7F) * n3 >> 7) < 2) {
            n3 = 2;
        } else if (n3 > 126) {
            n3 = 126;
        }
        return (n2 & 0xFF80) + n3;
    }

    public static final int c(int n2, int n3, int n4) {
        if (n2 == 65535) {
            return 0;
        }
        if ((n4 & 2) == 2) {
            if (n3 < 0) {
                n3 = 0;
            } else if (n3 > 127) {
                n3 = 127;
            }
            n3 = 127 - n3;
            return n3;
        }
        if ((n3 = n3 * (n2 & 0x7F) >> 7) < 2) {
            n3 = 2;
        } else if (n3 > 126) {
            n3 = 126;
        }
        return (n2 & 0xFF80) + n3;
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = 0;
        int n9 = e_0.s;
        int n10 = e_0.t;
        int n11 = bA[n8];
        int n12 = bB[n8];
        int n13 = bA[n2];
        int n14 = bB[n2];
        int n15 = bA[n3];
        int n16 = bB[n3];
        int n17 = bA[n4];
        int n18 = bB[n4];
        int n19 = n6 * n17 + n7 * n18 >> 16;
        for (int i2 = 0; i2 < this.ad; ++i2) {
            int n20;
            int n21 = this.ae[i2];
            int n22 = this.af[i2];
            int n23 = this.ag[i2];
            if (n3 != 0) {
                n20 = n22 * n15 + n21 * n16 >> 16;
                n22 = n22 * n16 - n21 * n15 >> 16;
                n21 = n20;
            }
            if (n8 != 0) {
                n20 = n22 * n12 - n23 * n11 >> 16;
                n23 = n22 * n11 + n23 * n12 >> 16;
                n22 = n20;
            }
            if (n2 != 0) {
                n20 = n23 * n13 + n21 * n14 >> 16;
                n23 = n23 * n14 - n21 * n13 >> 16;
                n21 = n20;
            }
            n21 += n5;
            n20 = (n22 += n6) * n18 - (n23 += n7) * n17 >> 16;
            n23 = n22 * n17 + n23 * n18 >> 16;
            n22 = n20;
            rs.a.h.bb[i2] = n23 - n19;
            if (rs.f.a.av) {
                rs.a.h.bc[i2] = 0;
            }
            rs.a.h.aZ[i2] = n9 + (n21 << 9) / n23;
            rs.a.h.ba[i2] = n10 + (n22 << 9) / n23;
            if (this.av <= 0) continue;
            rs.a.h.bd[i2] = n21;
            rs.a.h.be[i2] = n22;
            rs.a.h.bf[i2] = n23;
        }
        try {
            this.a(false, false, 0, 0);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    void a(rs.k.c.d d2, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        if (d2 == null) {
            return;
        }
        for (int i2 = 0; i2 < d2.e(); ++i2) {
            rs.k.c.a a2 = d2.a(i2);
            if (a2 == null) continue;
            if (a2.h() == 1 || this.N) {
                if (!bl) continue;
                Launcher.n().o().a.a(a2, n2, n3, n4, n5, true);
                Launcher.n().o().a.a(a2, n2, n3, n4, n5, false);
                continue;
            }
            if (a2.h() == 2) {
                if (bl) continue;
                Launcher.n().o().a.a(a2, n2, n3, n4, n5, true);
                Launcher.n().o().a.a(a2, n2, n3, n4, n5, false);
                continue;
            }
            Launcher.n().o().a.a(a2, n2, n3, n4, n5, bl);
        }
    }

    void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        try {
            if (this.L != null && this.M != null && rs.f.a.az && !rs.f.a.ah && !rs.l.b.a.b() && !rs.k.c.c.a()) {
                int n11 = -1;
                int n12 = -1;
                int n13 = 0;
                int n14 = 100;
                for (int i2 = 0; i2 < this.ad && i2 < this.L.length; ++i2) {
                    int n15;
                    int n16;
                    int n17;
                    int n18;
                    int n19;
                    int n20;
                    int n21 = this.L[i2] - 1;
                    if (n21 < 0) continue;
                    rs.k.c.d d2 = rs.k.c.c.a(n10, true);
                    if (d2 == null || !d2.b()) break;
                    if (n11 == -1) {
                        int n22 = Client.eR.ac;
                        n20 = Client.eR.ad;
                        n19 = n7 + Client.cJ;
                        n18 = this.aD;
                        n17 = n9 + Client.cL;
                        int n23 = Client.cJ;
                        n16 = -Client.cK;
                        n15 = Client.cL;
                        n12 = (int)Math.sqrt((n19 - n22) * (n19 - n22) + (n17 - n20) * (n17 - n20));
                        n11 = (int)Math.sqrt((n19 - n23) * (n19 - n23) + (n17 - n15) * (n17 - n15));
                    }
                    rs.r.c_0 c_02 = rs.r.c_0.c[n21];
                    n20 = this.ae[i2];
                    n19 = this.af[i2] * -1;
                    n18 = this.ag[i2];
                    if (n21 == 2 || n21 == 3) {
                        n19 -= 11;
                    }
                    n17 = c_02.h();
                    float f2 = 0.0f;
                    n16 = 750;
                    if (n12 == 0) {
                        n16 *= 2;
                    }
                    if ((n15 = n11 / n16) > 0) {
                        n17 = c_02.a(0, n15 * 4) <= Math.max(1, n15 / 2) ? 1 : 0;
                        f2 = n15 * 4 - 1;
                    }
                    if (n17 < 0 || n15 > 10) {
                        n17 = 0;
                    }
                    for (int i3 = 0; i3 < n17 && n13++ < n14; ++i3) {
                        boolean bl;
                        ++this.J;
                        rs.k.c.a a2 = rs.k.c.c.a(c_02, n20, n19, n18, i2);
                        if (a2 == null) continue;
                        a2.e(n10);
                        if (c_02.p() && this.I != -1) {
                            a2.a(this.I);
                        }
                        a2.a(this.M[i2]);
                        a2.a(Math.min(12.0f, a2.f() + f2));
                        boolean bl2 = bl = this.J % 2 != 0;
                        if (!bl) continue;
                        d2.a(a2);
                    }
                }
            }
            rs.k.c.d d3 = null;
            if (rs.f.a.az && !rs.f.a.ah && (d3 = rs.k.c.c.a(n10, false)) != null) {
                d3.c();
            }
            if (d3 != null) {
                this.a(d3, n2, n7, n8, n9, n10, false);
            }
            Launcher.n().o().a.a(this, n2, n3, n4, n5, n6, n7, n8, n9, n10);
            if (d3 != null) {
                this.a(d3, n2, n7, n8, n9, n10, true);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private final void a(boolean bl, boolean bl2, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        boolean bl3 = rs.k.e.a() && e_0.p && !e_0.h;
        for (n13 = 0; n13 < this.aF; ++n13) {
            rs.a.h.bg[n13] = 0;
        }
        for (n13 = 0; n13 < this.ah; ++n13) {
            if (this.ao != null && this.ao[n13] == -1 || this.aq != null && this.aq[n13] >= 255) continue;
            n12 = this.ai[n13];
            n11 = this.aj[n13];
            int n14 = this.ak[n13];
            n10 = aZ[n12];
            n9 = aZ[n11];
            n8 = aZ[n14];
            if (bl3) {
                if (n10 == -5000 || n9 == -5000 || n8 == -5000 || !bl2 || !this.b(bu, bv, ba[n12], ba[n11], ba[n14], n10, n9, n8)) continue;
                rs.a.h.bz[rs.a.h.bw] = n3;
                rs.a.h.by[rs.a.h.bw] = n3;
                rs.a.h.bx[rs.a.h.bw++] = n2;
                bl2 = false;
                continue;
            }
            if (bl && (n10 == -5000 || n9 == -5000 || n8 == -5000)) {
                rs.a.h.aY[n13] = true;
                int n15 = n7 = (bb[n12] + bb[n11] + bb[n14]) / 3 + this.aG;
                int n16 = bg[n15];
                bg[n15] = n16 + 1;
                rs.a.h.bh[n7][n16] = n13;
                continue;
            }
            if (bl2 && this.b(bu, bv, ba[n12], ba[n11], ba[n14], n10, n9, n8)) {
                rs.a.h.bz[rs.a.h.bw] = n3;
                rs.a.h.by[rs.a.h.bw] = n3;
                rs.a.h.bx[rs.a.h.bw++] = n2;
                bl2 = false;
            }
            if ((n10 - n9) * (ba[n14] - ba[n11]) - (ba[n12] - ba[n11]) * (n8 - n9) <= 0) continue;
            rs.a.h.aY[n13] = false;
            rs.a.h.aX[n13] = n10 < 0 || n9 < 0 || n8 < 0 || n10 > rs.l.c.n || n9 > rs.l.c.n || n8 > rs.l.c.n;
            int n17 = n7 = (bb[n12] + bb[n11] + bb[n14]) / 3 + this.aG;
            int n18 = bg[n17];
            bg[n17] = n18 + 1;
            rs.a.h.bh[n7][n18] = n13;
        }
        if (bl3) {
            return;
        }
        if (this.L != null && this.L.length > 0) {
            block2: for (n13 = 0; n13 < this.ad; ++n13) {
                n12 = n13;
                n11 = this.L[n12] - 1;
                if (n11 < 0) continue;
                rs.r.c_0 c_02 = rs.r.c_0.c[n11];
                n10 = this.ae[n12];
                n9 = this.af[n12];
                n8 = this.ag[n12];
                n7 = bc[n12];
                if (this.E != 0) {
                    n6 = bA[this.E];
                    n5 = bB[this.E];
                    n4 = n8 * n6 + n10 * n5 >> 16;
                    n8 = n8 * n5 - n10 * n6 >> 16;
                    n10 = n4;
                }
                n10 += this.B;
                n8 += this.D;
                if (n11 == 2 || n11 == 3) {
                    n9 -= 11;
                }
                for (n6 = 0; n6 < c_02.h(); ++n6) {
                    ++this.J;
                    if (!rs.f.a.az || rs.f.a.ah || this.J % 2 == 0) continue;
                    rs.r.a a2 = j_0.a(c_02, n7, n10, -n9, n8);
                    if (a2 == null) continue block2;
                    if (c_02.p() && this.I != -1) {
                        a2.c(this.I);
                    }
                    Client.a(a2);
                }
            }
        }
        if (this.ap == null) {
            for (n13 = this.aF - 1; n13 >= 0; --n13) {
                n12 = bg[n13];
                if (n12 <= 0) continue;
                for (n11 = 0; n11 < n12; ++n11) {
                    this.q(bh[n13][n11]);
                }
            }
            return;
        }
        for (n13 = 0; n13 < 12; ++n13) {
            rs.a.h.bi[n13] = 0;
            rs.a.h.bm[n13] = 0;
        }
        for (n13 = this.aF - 1; n13 >= 0; --n13) {
            n12 = bg[n13];
            if (n12 <= 0) continue;
            for (n11 = 0; n11 < n12; ++n11) {
                int n19 = bh[n13][n11];
                int n20 = n10 = this.ap[n19];
                bi[n20] = bi[n20] + 1;
                rs.a.h.bj[n10][n9] = n19;
                if (n10 < 10) {
                    int n21 = n10;
                    bm[n21] = bm[n21] + n13;
                    continue;
                }
                if (n10 == 10) {
                    rs.a.h.bk[n9] = n13;
                    continue;
                }
                rs.a.h.bl[n9] = n13;
            }
        }
        n13 = 0;
        if (bi[1] > 0 || bi[2] > 0) {
            n13 = (bm[1] + bm[2]) / (bi[1] + bi[2]);
        }
        n12 = 0;
        if (bi[3] > 0 || bi[4] > 0) {
            n12 = (bm[3] + bm[4]) / (bi[3] + bi[4]);
        }
        n11 = 0;
        if (bi[6] > 0 || bi[8] > 0) {
            n11 = (bm[6] + bm[8]) / (bi[6] + bi[8]);
        }
        int n22 = 0;
        n10 = bi[10];
        n9 = 10;
        n8 = 0;
        if (n22 == n10) {
            n22 = 0;
            n10 = bi[11];
            n9 = 11;
            n8 = 1;
        }
        n7 = n22 < n10 ? (n8 != 0 ? rs.a.h.bl[n22] : bk[n22]) : -1000;
        for (n6 = 0; n6 < 10; ++n6) {
            while (n6 == 0 && n7 > n13) {
                this.q(bj[n9][n22++]);
                if (n22 == n10 && n9 != 11) {
                    n22 = 0;
                    n10 = bi[11];
                    n9 = 11;
                    n8 = 1;
                }
                if (n22 < n10) {
                    n7 = n8 != 0 ? rs.a.h.bl[n22] : bk[n22];
                    continue;
                }
                n7 = -1000;
            }
            while (n6 == 3 && n7 > n12) {
                this.q(bj[n9][n22++]);
                if (n22 == n10 && n9 != 11) {
                    n22 = 0;
                    n10 = bi[11];
                    n9 = 11;
                    n8 = 1;
                }
                if (n22 < n10) {
                    n7 = n8 != 0 ? rs.a.h.bl[n22] : bk[n22];
                    continue;
                }
                n7 = -1000;
            }
            while (n6 == 5 && n7 > n11) {
                this.q(bj[n9][n22++]);
                if (n22 == n10 && n9 != 11) {
                    n22 = 0;
                    n10 = bi[11];
                    n9 = 11;
                    n8 = 1;
                }
                if (n22 < n10) {
                    n7 = n8 != 0 ? rs.a.h.bl[n22] : bk[n22];
                    continue;
                }
                n7 = -1000;
            }
            n5 = bi[n6];
            for (n4 = 0; n4 < n5; ++n4) {
                this.q(bj[n6][n4]);
            }
        }
        n6 = 0;
        while (n7 != -1000) {
            ++n6;
            this.q(bj[n9][n22++]);
            if (n22 == n10 && n9 != 11) {
                n22 = 0;
                n9 = 11;
                n10 = bi[11];
                n8 = 1;
            }
            if (n22 < n10) {
                n7 = n8 != 0 ? rs.a.h.bl[n22] : bk[n22];
                continue;
            }
            n7 = -1000;
        }
    }

    public void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        this.B = n7 + Client.cJ;
        this.C = n8 + Client.cK;
        this.D = n9 + Client.cL;
        this.E = n2;
        int n12 = n9 * n6 - n7 * n5 >> 16;
        int n13 = n8 * n3 + n12 * n4 >> 16;
        int n14 = this.aD * n4 >> 16;
        int n15 = n13 + n14;
        if (n15 <= 50 || n13 >= j) {
            return;
        }
        int n16 = n9 * n5 + n7 * n6 >> 16;
        int n17 = n16 - this.aD << 9;
        if (n17 / n15 >= rs.l.c.o) {
            return;
        }
        int n18 = n16 + this.aD << 9;
        if (n18 / n15 <= -rs.l.c.o) {
            return;
        }
        int n19 = n8 * n4 - n12 * n3 >> 16;
        int n20 = this.aD * n3 >> 16;
        int n21 = n19 + n20 << 9;
        if (n21 / n15 <= -rs.l.c.p) {
            return;
        }
        int n22 = n20 + (this.g * n4 >> 16);
        int n23 = n19 - n22 << 9;
        if (n23 / n15 >= rs.l.c.p) {
            return;
        }
        int n24 = n14 + (this.g * n3 >> 16);
        boolean bl = false;
        if (n13 - n24 <= 50) {
            bl = true;
        }
        boolean bl2 = false;
        if (n10 > 0 && bt) {
            int n25 = n13 - n14;
            if (n25 <= 50) {
                n25 = 50;
            }
            if (n16 > 0) {
                n17 /= n15;
                n18 /= n25;
            } else {
                n18 /= n15;
                n17 /= n25;
            }
            if (n19 > 0) {
                n23 /= n15;
                n21 /= n25;
            } else {
                n21 /= n15;
                n23 /= n25;
            }
            int n26 = bu - e_0.s;
            int n27 = bv - e_0.t;
            Object var29_29 = null;
            boolean bl3 = false;
            boolean bl4 = false;
            int n28 = 0;
            boolean bl5 = false;
            if (bl5 || n26 > n17 && n26 < n18 && n27 > n23 && n27 < n21) {
                if (bl5 || this.aN) {
                    rs.a.h.by[rs.a.h.bw] = n11;
                    int n29 = rs.a.h.bx[rs.a.h.bw++] = bl4 && n28 != 0 ? n28 : n10;
                    if (bl3) {
                        var29_29.g = true;
                    }
                } else {
                    bl2 = true;
                }
            }
            bl4 = false;
        }
    }

    public void l(int n2) {
        if (!this.bH.containsKey(n2)) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = bB[n2];
            int n10 = bA[n2];
            for (int i2 = 0; i2 < this.ad; ++i2) {
                int n11 = e_0.e(this.ae[i2], this.ag[i2], n9, n10);
                int n12 = this.af[i2];
                int n13 = e_0.e(this.ae[i2], this.ag[i2], n9, n10);
                if (n11 < n3) {
                    n3 = n11;
                }
                if (n11 > n6) {
                    n6 = n11;
                }
                if (n12 < n4) {
                    n4 = n12;
                }
                if (n12 > n7) {
                    n7 = n12;
                }
                if (n13 < n5) {
                    n5 = n13;
                }
                if (n13 <= n8) continue;
                n8 = n13;
            }
            i i3 = new i((n6 + n3) / 2, (n7 + n4) / 2, (n8 + n5) / 2, (n6 - n3 + 1) / 2, (n7 - n4 + 1) / 2, (n8 - n5 + 1) / 2);
            if (i3.d < 32) {
                i3.d = 32;
            }
            if (i3.f < 32) {
                i3.f = 32;
            }
            if (this.aN) {
                i3.d += 8;
                i3.f += 8;
            }
            this.bH.put(n2, i3);
        }
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        boolean bl;
        this.B = n7 + Client.cJ;
        this.C = n8 + Client.cK;
        this.D = n9 + Client.cL;
        this.E = n2;
        if (!rs.f.a.I && n11 != 0) {
            return;
        }
        int n19 = n9 * n6 - n7 * n5 >> 16;
        int n20 = n8 * n3 + n19 * n4 >> 16;
        int n21 = this.aD * n4 >> 16;
        int n22 = n20 + n21;
        boolean bl2 = bl = rs.k.e.a() && e_0.p;
        if (n22 <= 50 || n20 >= j) {
            return;
        }
        int n23 = n9 * n5 + n7 * n6 >> 16;
        int n24 = n23 - this.aD << 9;
        if (n24 / n22 >= rs.l.c.o) {
            return;
        }
        int n25 = n23 + this.aD << 9;
        if (n25 / n22 <= -rs.l.c.o) {
            return;
        }
        int n26 = n8 * n4 - n19 * n3 >> 16;
        int n27 = this.aD * n3 >> 16;
        int n28 = n26 + n27 << 9;
        if (n28 / n22 <= -rs.l.c.p) {
            return;
        }
        int n29 = n27 + (this.g * n4 >> 16);
        int n30 = n26 - n29 << 9;
        if (n30 / n22 >= rs.l.c.p) {
            return;
        }
        int n31 = n21 + (this.g * n3 >> 16);
        boolean bl3 = false;
        if (n20 - n31 <= 50) {
            bl3 = true;
        }
        boolean bl4 = false;
        if (n10 > 0 && bt) {
            n18 = n20 - n21;
            if (n18 <= 50) {
                n18 = 50;
            }
            if (n23 > 0) {
                n24 /= n22;
                n25 /= n18;
            } else {
                n25 /= n22;
                n24 /= n18;
            }
            if (n26 > 0) {
                n30 /= n22;
                n28 /= n18;
            } else {
                n28 /= n22;
                n30 /= n18;
            }
            n17 = bu - e_0.s;
            n16 = bv - e_0.t;
            rs.l.e.j j2 = null;
            n15 = 0;
            n14 = 0;
            n13 = 0;
            if ((n10 >> 29 & 3) == 1 || rs.l.b.a.d.d) {
                j2 = (rs.l.e.j)Client.ab.c.b(n10);
                int n32 = n15 = j2 != null && j2.b != null && j2.a != null ? 1 : 0;
                if (n15 != 0) {
                    j2.g = false;
                    if (j2.a.contains(bu, bv)) {
                        n14 = 1;
                        n13 = j2.h;
                        j2.g = true;
                    }
                }
            }
            if ((n10 >> 29 & 3) == 2 && Client.ab.e.size() > 0) {
                j2 = (rs.l.e.j)Client.ab.e.b(n10);
                int n33 = n15 = j2 != null && j2.b != null && j2.a != null ? 1 : 0;
                if (n15 != 0) {
                    j2.g = false;
                    if (j2.a.contains(bu, bv)) {
                        n14 = 1;
                        n13 = j2.h;
                        j2.g = true;
                    }
                }
            }
            int n34 = n12 = n14 != 0 && n13 != 0 ? 1 : 0;
            if (n12 != 0 || n17 > n24 && n17 < n25 && n16 > n30 && n16 < n28) {
                if (n12 != 0 || this.aN) {
                    rs.a.h.by[rs.a.h.bw] = n11;
                    int n35 = rs.a.h.bx[rs.a.h.bw++] = n14 != 0 && n13 != 0 ? n13 : n10;
                    if (n15 != 0) {
                        j2.g = true;
                    }
                    if (bl) {
                        this.a(n2, n3, n4, n5, n6, n7, n8, n9, n10);
                        return;
                    }
                } else {
                    bl4 = true;
                }
            }
            n14 = 0;
        }
        n18 = e_0.s;
        n17 = e_0.t;
        n16 = 0;
        int n36 = 0;
        if (n2 != 0) {
            n16 = bA[n2];
            n36 = bB[n2];
        }
        for (n15 = 0; n15 < this.ad; ++n15) {
            int n37;
            n14 = this.ae[n15];
            n13 = this.af[n15];
            n12 = this.ag[n15];
            if (n2 != 0) {
                n37 = n12 * n16 + n14 * n36 >> 16;
                n12 = n12 * n36 - n14 * n16 >> 16;
                n14 = n37;
            }
            n37 = (n12 += n9) * n5 + (n14 += n7) * n6 >> 16;
            n12 = n12 * n6 - n14 * n5 >> 16;
            n14 = n37;
            n37 = (n13 += n8) * n4 - n12 * n3 >> 16;
            n12 = n13 * n3 + n12 * n4 >> 16;
            n13 = n37;
            rs.a.h.bb[n15] = n12 - n20;
            if (rs.f.a.av) {
                rs.a.h.bc[n15] = n12;
            }
            if (n12 >= 50) {
                rs.a.h.aZ[n15] = n18 + (n14 << 9) / n12;
                rs.a.h.ba[n15] = n17 + (n13 << 9) / n12;
            } else {
                rs.a.h.aZ[n15] = -5000;
                bl3 = true;
            }
            if (!bl3 && this.av <= 0 || bl) continue;
            rs.a.h.bd[n15] = n14;
            rs.a.h.be[n15] = n13;
            rs.a.h.bf[n15] = n12;
        }
        try {
            if (!bl || bl4 && !(Math.sqrt(n7 * n7 + n9 * n9) > 4480.0)) {
                this.a(bl3, bl4, n10, n11);
            }
            if (bl) {
                this.a(n2, n3, n4, n5, n6, n7, n8, n9, n10);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private final void q(int n2) {
        int n3;
        if (aY[n2]) {
            this.r(n2);
            return;
        }
        int n4 = this.ai[n2];
        int n5 = this.aj[n2];
        int n6 = this.ak[n2];
        e_0.o = aX[n2];
        e_0.r = this.aq == null ? 0 : this.aq[n2];
        if (this.K <= 255) {
            e_0.r = this.K;
        }
        if (this.ao == null) {
            n3 = 0;
        } else {
            int n7 = n3 = H != -1 ? H : this.ao[n2] & 3;
            if (H != -1) {
                n3 = 1;
            }
        }
        if (this.F && (ba[this.ai[n2]] < rs.l.c.j - 20 || ba[this.aj[n2]] < rs.l.c.j - 20 || ba[this.ak[n2]] < rs.l.c.j - 20)) {
            return;
        }
        if (!e_0.q) {
            if (ba[this.ai[n2]] < rs.l.c.j - this.O) {
                rs.a.h.ba[this.ai[n2]] = rs.l.c.j - this.O;
            }
            if (ba[this.aj[n2]] < rs.l.c.j - this.O) {
                rs.a.h.ba[this.aj[n2]] = rs.l.c.j - this.O;
            }
            if (ba[this.ak[n2]] < rs.l.c.j - this.O) {
                rs.a.h.ba[this.ak[n2]] = rs.l.c.j - this.O;
            }
            if (aZ[this.ai[n2]] < rs.l.c.l) {
                rs.a.h.aZ[this.ai[n2]] = rs.l.c.l;
            }
            if (aZ[this.aj[n2]] < rs.l.c.l) {
                rs.a.h.aZ[this.aj[n2]] = rs.l.c.l;
            }
            if (aZ[this.ak[n2]] < rs.l.c.l) {
                rs.a.h.aZ[this.ak[n2]] = rs.l.c.l;
            }
        }
        if (this.Y != null && this.Y[n2] != -1 && H == -1) {
            int n8;
            int n9 = n4;
            int n10 = n5;
            int n11 = n6;
            if (this.Z != null && this.Z[n2] != -1) {
                n8 = this.Z[n2];
                n9 = this.aw[n8];
                n10 = this.ax[n8];
                n11 = this.ay[n8];
            }
            int n12 = n8 = H != -1 ? H : this.an[n2];
            if (n8 == -1 || n3 == 3) {
                e_0.a(ba[n4], ba[n5], ba[n6], aZ[n4], aZ[n5], aZ[n6], H != -1 ? H : this.al[n2], H != -1 ? H : this.al[n2], H != -1 ? H : this.al[n2], bd[n9], bd[n10], bd[n11], be[n9], be[n10], be[n11], bf[n9], bf[n10], bf[n11], this.Y[n2], bc[n4], bc[n5], bc[n6]);
                return;
            }
            if (rs.f.a.ah) {
                e_0.a(ba[n4], ba[n5], ba[n6], aZ[n4], aZ[n5], aZ[n6], H != -1 ? H : this.al[n2], H != -1 ? H : this.am[n2], H != -1 ? H : this.an[n2], bd[n9], bd[n10], bd[n11], be[n9], be[n10], be[n11], bf[n9], bf[n10], bf[n11], this.Y[n2]);
            } else {
                e_0.a(ba[n4], ba[n5], ba[n6], aZ[n4], aZ[n5], aZ[n6], H != -1 ? H : this.al[n2], H != -1 ? H : this.am[n2], H != -1 ? H : this.an[n2], bd[n9], bd[n10], bd[n11], be[n9], be[n10], be[n11], bf[n9], bf[n10], bf[n11], this.Y[n2], bc[n4], bc[n5], bc[n6]);
            }
            return;
        }
        if (n3 == 0) {
            if (rs.f.a.av && !rs.k.e.a()) {
                if (this.V > 0) {
                    int n13 = e_0.a(this.al[n2], this.S, this.T, this.U, this.V);
                    int n14 = e_0.a(this.am[n2], this.S, this.T, this.U, this.V);
                    int n15 = e_0.a(this.an[n2], this.S, this.T, this.U, this.V);
                    e_0.a(ba[this.ai[n2]], ba[this.aj[n2]], ba[this.ak[n2]], aZ[this.ai[n2]], aZ[this.aj[n2]], aZ[this.ak[n2]], H != -1 ? H : n13, H != -1 ? H : n14, H != -1 ? H : n15, (float)bc[this.ai[n2]], (float)bc[this.aj[n2]], (float)bc[this.ak[n2]]);
                } else {
                    e_0.a(ba[n4], ba[n5], ba[n6], aZ[n4], aZ[n5], aZ[n6], H != -1 ? H : this.al[n2], H != -1 ? H : this.am[n2], H != -1 ? H : this.an[n2], (float)bc[n4], (float)bc[n5], (float)bc[n6]);
                }
            } else if (this.V > 0) {
                int n16 = e_0.a(this.al[n2], this.S, this.T, this.U, this.V);
                int n17 = e_0.a(this.am[n2], this.S, this.T, this.U, this.V);
                int n18 = e_0.a(this.an[n2], this.S, this.T, this.U, this.V);
                e_0.a(ba[this.ai[n2]], ba[this.aj[n2]], ba[this.ak[n2]], aZ[this.ai[n2]], aZ[this.aj[n2]], aZ[this.ak[n2]], n16, n17, n18);
            } else {
                e_0.a(ba[n4], ba[n5], ba[n6], aZ[n4], aZ[n5], aZ[n6], H != -1 ? H : this.al[n2], H != -1 ? H : this.am[n2], H != -1 ? H : this.an[n2]);
            }
            return;
        }
        if (n3 == 1) {
            int n19 = bC[H != -1 ? H : this.al[n2]];
            if (this.aI > 0) {
                n19 = this.aI;
            }
            if (rs.f.a.av) {
                e_0.a(ba[n4], ba[n5], ba[n6], aZ[n4], aZ[n5], aZ[n6], n19, (float)bc[n4], (float)bc[n5], (float)bc[n6]);
            } else {
                e_0.a(ba[n4], ba[n5], ba[n6], aZ[n4], aZ[n5], aZ[n6], n19);
            }
            return;
        }
        if (n3 == 2) {
            int n20 = (H != -1 ? H : this.ao[n2]) >> 2;
            int n21 = this.aw[n20];
            int n22 = this.ax[n20];
            int n23 = this.ay[n20];
            if (rs.f.a.av && (!rs.k.e.a() || rs.k.e.a() && e_0.p)) {
                e_0.a(this.bJ, ba[n4], ba[n5], ba[n6], aZ[n4], aZ[n5], aZ[n6], H != -1 ? H : this.al[n2], H != -1 ? H : this.am[n2], H != -1 ? H : this.an[n2], bd[n21], bd[n22], bd[n23], be[n21], be[n22], be[n23], bf[n21], bf[n22], bf[n23], this.ar[n2], bc[n4], bc[n5], bc[n6]);
            } else {
                e_0.a(ba[n4], ba[n5], ba[n6], aZ[n4], aZ[n5], aZ[n6], H != -1 ? H : this.al[n2], H != -1 ? H : this.am[n2], H != -1 ? H : this.an[n2], bd[n21], bd[n22], bd[n23], be[n21], be[n22], be[n23], bf[n21], bf[n22], bf[n23], this.ar[n2]);
            }
            return;
        }
        if (n3 == 3) {
            int n24;
            int n25 = this.ao[n2] >> 2;
            int n26 = 0;
            int n27 = 0;
            int n28 = 0;
            if (n25 >= this.aw.length) {
                n24 = 0;
            } else {
                n26 = this.aw[n25];
                n27 = this.ax[n25];
                n28 = this.ay[n25];
            }
            if (rs.f.a.av || rs.k.e.a()) {
                if (this.V > 0) {
                    n24 = e_0.a(this.al[n2], this.S, this.T, this.U, this.V);
                    int n29 = e_0.a(this.am[n2], this.S, this.T, this.U, this.V);
                    int n30 = e_0.a(this.an[n2], this.S, this.T, this.U, this.V);
                    e_0.a(ba[this.ai[n2]], ba[this.aj[n2]], ba[this.ak[n2]], aZ[this.ai[n2]], aZ[this.aj[n2]], aZ[this.ak[n2]], n24, n29, n30, (float)bc[this.ai[n2]], (float)bc[this.aj[n2]], (float)bc[this.ak[n2]]);
                } else {
                    e_0.a(ba[n4], ba[n5], ba[n6], aZ[n4], aZ[n5], aZ[n6], H != -1 ? H : this.al[n2], H != -1 ? H : this.al[n2], H != -1 ? H : this.al[n2], bd[n26], bd[n27], bd[n28], be[n26], be[n27], be[n28], bf[n26], bf[n27], bf[n28], this.ar[n2], bc[n4], bc[n5], bc[n6]);
                }
            } else if (this.V > 0) {
                n24 = e_0.a(this.al[n2], this.S, this.T, this.U, this.V);
                int n31 = e_0.a(this.am[n2], this.S, this.T, this.U, this.V);
                int n32 = e_0.a(this.an[n2], this.S, this.T, this.U, this.V);
                e_0.a(ba[this.ai[n2]], ba[this.aj[n2]], ba[this.ak[n2]], aZ[this.ai[n2]], aZ[this.aj[n2]], aZ[this.ak[n2]], n24, n31, n32);
            } else {
                e_0.a(ba[n4], ba[n5], ba[n6], aZ[n4], aZ[n5], aZ[n6], H != -1 ? H : this.al[n2], H != -1 ? H : this.al[n2], H != -1 ? H : this.al[n2], bd[n26], bd[n27], bd[n28], be[n26], be[n27], be[n28], bf[n26], bf[n27], bf[n28], this.ar[n2]);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void r(int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        if (this.ar != null && this.ar[n2] == 65535) {
            return;
        }
        int n12 = e_0.s;
        int n13 = e_0.t;
        int n14 = 0;
        int n15 = this.ai[n2];
        int n16 = this.aj[n2];
        int n17 = this.ak[n2];
        int n18 = bf[n15];
        int n19 = bf[n16];
        int n20 = bf[n17];
        if (n18 >= 50) {
            rs.a.h.bn[n14] = aZ[n15];
            rs.a.h.bo[n14] = ba[n15];
            rs.a.h.bp[n14++] = this.al[n2];
        } else {
            n11 = bd[n15];
            n10 = be[n15];
            n9 = this.al[n2];
            if (n20 >= 50) {
                n8 = (50 - n18) * bD[n20 - n18];
                rs.a.h.bn[n14] = n12 + (n11 + ((bd[n17] - n11) * n8 >> 16) << 9) / 50;
                rs.a.h.bo[n14] = n13 + (n10 + ((be[n17] - n10) * n8 >> 16) << 9) / 50;
                rs.a.h.bp[n14++] = n9 + ((this.an[n2] - n9) * n8 >> 16);
            }
            if (n19 >= 50) {
                n8 = (50 - n18) * bD[n19 - n18];
                rs.a.h.bn[n14] = n12 + (n11 + ((bd[n16] - n11) * n8 >> 16) << 9) / 50;
                rs.a.h.bo[n14] = n13 + (n10 + ((be[n16] - n10) * n8 >> 16) << 9) / 50;
                rs.a.h.bp[n14++] = n9 + ((this.am[n2] - n9) * n8 >> 16);
            }
        }
        if (n19 >= 50) {
            rs.a.h.bn[n14] = aZ[n16];
            rs.a.h.bo[n14] = ba[n16];
            rs.a.h.bp[n14++] = this.am[n2];
        } else {
            n11 = bd[n16];
            n10 = be[n16];
            n9 = this.am[n2];
            if (n18 >= 50) {
                n8 = (50 - n19) * bD[n18 - n19];
                rs.a.h.bn[n14] = n12 + (n11 + ((bd[n15] - n11) * n8 >> 16) << 9) / 50;
                rs.a.h.bo[n14] = n13 + (n10 + ((be[n15] - n10) * n8 >> 16) << 9) / 50;
                rs.a.h.bp[n14++] = n9 + ((this.al[n2] - n9) * n8 >> 16);
            }
            if (n20 >= 50) {
                n8 = (50 - n19) * bD[n20 - n19];
                rs.a.h.bn[n14] = n12 + (n11 + ((bd[n17] - n11) * n8 >> 16) << 9) / 50;
                rs.a.h.bo[n14] = n13 + (n10 + ((be[n17] - n10) * n8 >> 16) << 9) / 50;
                rs.a.h.bp[n14++] = n9 + ((this.an[n2] - n9) * n8 >> 16);
            }
        }
        if (n20 >= 50) {
            rs.a.h.bn[n14] = aZ[n17];
            rs.a.h.bo[n14] = ba[n17];
            rs.a.h.bp[n14++] = this.an[n2];
        } else {
            n11 = bd[n17];
            n10 = be[n17];
            n9 = this.an[n2];
            if (n19 >= 50) {
                n8 = (50 - n20) * bD[n19 - n20];
                rs.a.h.bn[n14] = n12 + (n11 + ((bd[n16] - n11) * n8 >> 16) << 9) / 50;
                rs.a.h.bo[n14] = n13 + (n10 + ((be[n16] - n10) * n8 >> 16) << 9) / 50;
                rs.a.h.bp[n14++] = n9 + ((this.am[n2] - n9) * n8 >> 16);
            }
            if (n18 >= 50) {
                n8 = (50 - n20) * bD[n18 - n20];
                rs.a.h.bn[n14] = n12 + (n11 + ((bd[n15] - n11) * n8 >> 16) << 9) / 50;
                rs.a.h.bo[n14] = n13 + (n10 + ((be[n15] - n10) * n8 >> 16) << 9) / 50;
                rs.a.h.bp[n14++] = n9 + ((this.al[n2] - n9) * n8 >> 16);
            }
        }
        n11 = bn[0];
        n10 = bn[1];
        n9 = bn[2];
        n8 = bo[0];
        int n21 = bo[1];
        int n22 = bo[2];
        if ((n11 - n10) * (n22 - n21) - (n8 - n21) * (n9 - n10) <= 0) return;
        e_0.o = false;
        int n23 = n15;
        int n24 = n16;
        int n25 = n17;
        if (n14 == 3) {
            if (n11 < 0 || n10 < 0 || n9 < 0 || n11 > rs.l.c.n || n10 > rs.l.c.n || n9 > rs.l.c.n) {
                e_0.o = true;
            }
            n7 = this.ao == null ? 0 : this.ao[n2] & 3;
            if (this.Y != null && this.Y[n2] != -1) {
                if (this.Z != null && this.Z[n2] != -1) {
                    n6 = this.Z[n2];
                    n23 = this.aw[n6];
                    n24 = this.ax[n6];
                    n25 = this.ay[n6];
                }
                if (this.an[n2] == -1) {
                    e_0.a(n8, n21, n22, n11, n10, n9, this.al[n2], this.al[n2], this.al[n2], bd[n23], bd[n24], bd[n25], be[n23], be[n24], be[n25], bf[n23], bf[n24], bf[n25], this.Y[n2], bc[n15], bc[n16], bc[n17]);
                } else {
                    e_0.a(n8, n21, n22, n11, n10, n9, bp[0], bp[1], bp[2], bd[n23], bd[n24], bd[n25], be[n23], be[n24], be[n25], bf[n23], bf[n24], bf[n25], this.Y[n2], bc[n15], bc[n16], bc[n17]);
                }
            } else if (n7 == 0) {
                if (rs.f.a.av) {
                    e_0.a(n8, n21, n22, n11, n10, n9, bp[0], bp[1], bp[2], -1.0f, -1.0f, -1.0f);
                } else {
                    e_0.a(n8, n21, n22, n11, n10, n9, bp[0], bp[1], bp[2]);
                }
            } else if (n7 == 1) {
                if (rs.f.a.av) {
                    e_0.a(n8, n21, n22, n11, n10, n9, bC[this.al[n2]], -1.0f, -1.0f, -1.0f);
                } else {
                    e_0.a(n8, n21, n22, n11, n10, n9, bC[this.al[n2]]);
                }
            } else if (n7 == 2) {
                n6 = this.ao[n2] >> 2;
                n5 = this.aw[n6];
                n4 = this.ax[n6];
                n3 = this.ay[n6];
                if (rs.f.a.av) {
                    e_0.a(n8, n21, n22, n11, n10, n9, bp[0], bp[1], bp[2], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2], bc[n15], bc[n16], bc[n17]);
                } else {
                    e_0.a(n8, n21, n22, n11, n10, n9, bp[0], bp[1], bp[2], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2]);
                }
            } else if (n7 == 3) {
                n6 = this.ao[n2] >> 2;
                n5 = this.aw[n6];
                n4 = this.ax[n6];
                n3 = this.ay[n6];
                if (rs.f.a.av) {
                    e_0.a(n8, n21, n22, n11, n10, n9, this.al[n2], this.al[n2], this.al[n2], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2], bc[n15], bc[n16], bc[n17]);
                } else {
                    e_0.a(n8, n21, n22, n11, n10, n9, this.al[n2], this.al[n2], this.al[n2], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2]);
                }
            }
        }
        if (n14 != 4) return;
        if (n11 < 0 || n10 < 0 || n9 < 0 || n11 > rs.l.c.n || n10 > rs.l.c.n || n9 > rs.l.c.n || bn[3] < 0 || bn[3] > rs.l.c.n) {
            e_0.o = true;
        }
        n7 = this.ao == null ? 0 : this.ao[n2] & 3;
        if (this.Y != null && this.Y[n2] != -1) {
            if (this.Z != null && this.Z[n2] != -1) {
                n6 = this.Z[n2];
                n23 = this.aw[n6];
                n24 = this.ax[n6];
                n25 = this.ay[n6];
            }
            if (this.an[n2] == -1) {
                e_0.a(n8, n21, n22, n11, n10, n9, this.al[n2], this.al[n2], this.al[n2], bd[n23], bd[n24], bd[n25], be[n23], be[n24], be[n25], bf[n23], bf[n24], bf[n25], this.Y[n2], bc[n15], bc[n16], bc[n17]);
                e_0.a(n8, n22, bo[3], n11, n9, bn[3], this.al[n2], this.al[n2], this.al[n2], bd[n23], bd[n24], bd[n25], be[n23], be[n24], be[n25], bf[n23], bf[n24], bf[n25], this.Y[n2], bc[n15], bc[n16], bc[n17]);
                return;
            }
            e_0.a(n8, n21, n22, n11, n10, n9, bp[0], bp[1], bp[2], bd[n23], bd[n24], bd[n25], be[n23], be[n24], be[n25], bf[n23], bf[n24], bf[n25], this.Y[n2], bc[n15], bc[n16], bc[n17]);
            e_0.a(n8, n22, bo[3], n11, n9, bn[3], bp[0], bp[2], bp[3], bd[n23], bd[n24], bd[n25], be[n23], be[n24], be[n25], bf[n23], bf[n24], bf[n25], this.Y[n2], bc[n15], bc[n16], bc[n17]);
            return;
        }
        if (n7 == 0) {
            if (rs.f.a.av) {
                e_0.a(n8, n21, n22, n11, n10, n9, bp[0], bp[1], bp[2], -1.0f, -1.0f, -1.0f);
                e_0.a(n8, n22, bo[3], n11, n9, bn[3], bp[0], bp[2], bp[3], (float)bc[n15], (float)bc[n16], (float)bc[n17]);
                return;
            }
            e_0.a(n8, n21, n22, n11, n10, n9, bp[0], bp[1], bp[2]);
            e_0.a(n8, n22, bo[3], n11, n9, bn[3], bp[0], bp[2], bp[3]);
            return;
        }
        if (n7 == 1) {
            n6 = bC[this.al[n2]];
            if (rs.f.a.av) {
                e_0.a(n8, n21, n22, n11, n10, n9, n6, -1.0f, -1.0f, -1.0f);
                e_0.a(n8, n22, bo[3], n11, n9, bn[3], n6, (float)bc[n15], (float)bc[n16], (float)bc[n17]);
                return;
            }
            e_0.a(n8, n21, n22, n11, n10, n9, n6);
            e_0.a(n8, n22, bo[3], n11, n9, bn[3], n6);
            return;
        }
        if (n7 == 2) {
            n6 = this.ao[n2] >> 2;
            n5 = this.aw[n6];
            n4 = this.ax[n6];
            n3 = this.ay[n6];
            if (rs.f.a.av) {
                e_0.a(n8, n21, n22, n11, n10, n9, bp[0], bp[1], bp[2], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2], bc[n15], bc[n16], bc[n17]);
                e_0.a(n8, n22, bo[3], n11, n9, bn[3], bp[0], bp[2], bp[3], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2], bc[n15], bc[n16], bc[n17]);
                return;
            }
            e_0.a(n8, n21, n22, n11, n10, n9, bp[0], bp[1], bp[2], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2]);
            e_0.a(n8, n22, bo[3], n11, n9, bn[3], bp[0], bp[2], bp[3], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2]);
            return;
        }
        if (n7 != 3) return;
        n6 = this.ao[n2] >> 2;
        n5 = this.aw[n6];
        n4 = this.ax[n6];
        n3 = this.ay[n6];
        if (rs.f.a.av) {
            e_0.a(n8, n21, n22, n11, n10, n9, this.al[n2], this.al[n2], this.al[n2], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2], bc[n15], bc[n16], bc[n17]);
            e_0.a(n8, n22, bo[3], n11, n9, bn[3], this.al[n2], this.al[n2], this.al[n2], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2], bc[n15], bc[n16], bc[n17]);
            return;
        }
        e_0.a(n8, n21, n22, n11, n10, n9, this.al[n2], this.al[n2], this.al[n2], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2]);
        e_0.a(n8, n22, bo[3], n11, n9, bn[3], this.al[n2], this.al[n2], this.al[n2], bd[n5], bd[n4], bd[n3], be[n5], be[n4], be[n3], bf[n5], bf[n4], bf[n3], this.ar[n2]);
    }

    private final boolean b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n3 < n4 && n3 < n5 && n3 < n6) {
            return false;
        }
        if (n3 > n4 && n3 > n5 && n3 > n6) {
            return false;
        }
        if (n2 < n7 && n2 < n8 && n2 < n9) {
            return false;
        }
        return n2 <= n7 || n2 <= n8 || n2 <= n9;
    }

    public void m(int n2) {
        this.P = n2;
    }

    public int r() {
        return this.P;
    }

    public void n(int n2) {
        this.Q = n2;
    }

    public void o(int n2) {
        this.R = n2;
    }

    public int s() {
        return this.R;
    }

    public int t() {
        return this.Q;
    }

    public int u() {
        return this.aD;
    }

    public int v() {
        return this.aG;
    }

    public int w() {
        return this.aF;
    }

    public static void e(boolean bl) {
        bE = bl;
    }

    public int x() {
        return this.bI;
    }

    public HashMap<Integer, rs.runelite.a.a> y() {
        return this.bH;
    }

    public rs.runelite.a.a p(int n2) {
        this.l(n2);
        this.bI = n2;
        return this.y().get(this.bI);
    }

    public int z() {
        return this.ad;
    }

    public int[] A() {
        return this.ae;
    }

    public int[] B() {
        return this.af;
    }

    public int[] C() {
        return this.ag;
    }

    public int[] D() {
        return this.ai;
    }

    public int[] E() {
        return this.aj;
    }

    public int[] F() {
        return this.ak;
    }

    public int G() {
        return this.ah;
    }

    public int[] H() {
        return this.aq;
    }

    static {
        s = new int[256];
        t = new int[256];
        u = new int[256];
        v = "Cla";
        w = "at Cl";
        x = "nt";
        y = v + "n Ch" + w + "ie" + x + " ";
        H = -1;
        bP = -192;
        ac = new h(true);
        bQ = new int[2000];
        bR = new byte[2000];
        bS = new int[2000];
        bT = new int[2000];
        bU = new int[2000];
        bV = new int[2000];
        aR = new com.a.b.a.b();
        aS = new com.a.b.a.b();
        aT = new com.a.b.a.b();
        aV = 3;
        aX = new boolean[8192];
        aY = new boolean[8192];
        aZ = new int[8192];
        ba = new int[8192];
        bb = new int[8192];
        bc = new int[8192];
        bd = new int[8192];
        be = new int[8192];
        bf = new int[8192];
        bg = new int[8192];
        bh = new int[8192][512];
        bi = new int[12];
        bj = new int[12][2000];
        bk = new int[2000];
        bl = new int[2000];
        bm = new int[12];
        bn = new int[10];
        bo = new int[10];
        bp = new int[10];
        bx = new int[1000];
        by = new int[1000];
        bz = new int[1000];
        bA = e_0.v;
        bB = e_0.w;
        bC = e_0.B;
        bD = e_0.u;
    }
}

