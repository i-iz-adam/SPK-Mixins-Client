/*
 * Decompiled with CFR 0.152.
 */
package rs.n;

import rs.Client;
import rs.a;
import rs.a.h;
import rs.f_0;
import rs.k;
import rs.l.c;
import rs.l.e_0;
import rs.l.k_0;
import rs.n.b.a.b;
import rs.n.c.ad_0;
import rs.n.d;
import rs.o_0;
import rs.x.f;

public class e {
    public static int[] h = new int[]{4041, 4077, 4113, 4047, 4083, 4119, 4053, 4089, 4125, 4059, 4095, 4131, 4065, 4101, 4137, 4071, 4107, 4143, 4154, 12168, 13918};
    private int a;
    public rs.l.f_0 i;
    public rs.l.f_0 j;
    public String k;
    public boolean l;
    public boolean m;
    public static final f_0 n = new f_0(50);
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = 0;
    public boolean t = true;
    public static f u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int A;
    public int B;
    public int C = Integer.MAX_VALUE;
    public int D = Integer.MAX_VALUE;
    public rs.l.f_0 E;
    public int F;
    public rs.l.f_0[] G;
    public static e[] H;
    public int[] I;
    public int J;
    public int[] K;
    public int L;
    public int M;
    public String N;
    public int O;
    public int P;
    public String Q;
    public String R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public String[] W;
    public int[][] X;
    public boolean Y;
    public String Z;
    public String aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public int af;
    public boolean ag;
    public int ah;
    public int ai;
    private static f_0 b;
    private static f_0 c;
    public int aj;
    public int ak;
    public int[] al;
    public int[] am;
    public boolean an;
    public k_0 ao;
    public int ap;
    public int[] aq;
    public int ar;
    public int[] as;
    public String at;
    public String au;
    public boolean av;
    public int aw;
    public int[] ax;
    public String[] ay;
    public int[] az;
    public boolean aA = false;
    public int aB = 0;
    public byte aC;
    private int d;
    private int e;
    public int aD;
    public int aE;
    public boolean aF;
    public rs.l.f_0 aG;
    public int aH;
    public int aI;
    public int aJ;
    public boolean aK;
    public int aL = 0;
    public int aM = 0;
    public int aN = 0;
    public static final f_0 aO;
    public int aP;
    public boolean aQ;
    public int aR;
    public boolean aS;
    public int aT;
    public int aU;
    public int aV;
    public int aW = 128;
    public int aX = 128;
    public boolean aY = false;
    public boolean aZ = false;
    public int ba;
    public int bb;
    public int[] bc;
    public int bd;
    public boolean be;
    public boolean bf = true;
    public boolean bg = true;
    public boolean bh;
    public byte bi;
    public int bj;
    public int[] bk;
    public int[] bl;
    public boolean bm;
    public boolean bn = true;
    public boolean bo = false;
    public boolean bp = false;
    public int bq;
    public int br = 0;
    public short bs = 0;
    public short bt = 0;
    public int bu = 0;
    public boolean bv = false;
    public boolean bw = false;
    public boolean bx = false;
    public String by = null;
    public boolean bz = false;
    public int bA;
    public int bB;
    public int bC;
    public int bD = 32;
    public boolean bE;
    public boolean bF = false;
    public b bG = null;
    public b bH = null;

    public void a(int n2, int n3) {
        int n4 = this.az[n2];
        this.az[n2] = this.az[n3];
        this.az[n3] = n4;
        n4 = this.ax[n2];
        this.ax[n2] = this.ax[n3];
        this.ax[n3] = n4;
    }

    public static void a(f f2, k_0[] k_0Array, f f3) {
        int n2;
        b = new f_0(50000);
        c = new f_0(25000);
        rs.x.e e2 = new rs.x.e(f2.a("data"));
        int n3 = -1;
        int n4 = e2.A();
        H = new e[n4 + 70000];
        while (e2.h < e2.g.length) {
            int n5;
            int n6;
            int n7;
            n2 = e2.A();
            if (n2 == 65535) {
                n3 = e2.A();
                n2 = e2.A();
            }
            e e3 = rs.n.e.H[n2] = new e();
            e3.aw = n2;
            e3.ah = n3;
            e3.aI = e2.y();
            e3.M = e2.y();
            e3.J = e2.A();
            e3.P = e2.A();
            e3.aR = e2.A();
            e3.aC = (byte)e2.y();
            e3.ab = e2.y();
            e3.ab = e3.ab != 0 ? (e3.ab - 1 << 8) + e2.y() : -1;
            int n8 = e2.y();
            if (n8 > 0) {
                e3.aq = new int[n8];
                e3.I = new int[n8];
                for (n7 = 0; n7 < n8; ++n7) {
                    e3.aq[n7] = e2.y();
                    e3.I[n7] = e2.A();
                }
            }
            if ((n7 = e2.y()) > 0) {
                e3.X = new int[n7][];
                for (n6 = 0; n6 < n7; ++n6) {
                    n5 = e2.A();
                    e3.X[n6] = new int[n5];
                    for (int i2 = 0; i2 < n5; ++i2) {
                        e3.X[n6][i2] = e2.A();
                    }
                }
            }
            if (e3.aI == 0) {
                e3.v = false;
                e3.aH = e2.A();
                e3.aQ = e2.y() == 1;
                n6 = e2.A();
                e3.al = new int[n6];
                e3.am = new int[n6];
                e3.bc = new int[n6];
                for (n5 = 0; n5 < n6; ++n5) {
                    e3.al[n5] = e2.A();
                    e3.am[n5] = e2.B();
                    e3.bc[n5] = e2.B();
                }
            }
            if (e3.aI == 1) {
                e2.A();
                e2.y();
            }
            if (e3.aI == 2) {
                e3.az = new int[e3.P * e3.aR];
                e3.ax = new int[e3.P * e3.aR];
                e3.aF = e2.y() == 1;
                e3.av = e2.y() == 1;
                e3.an = e2.y() == 1;
                e3.ag = e2.y() == 1;
                e3.ac = e2.y();
                e3.ap = e2.y();
                e3.K = new int[20];
                e3.as = new int[20];
                e3.G = new rs.l.f_0[20];
                for (n6 = 0; n6 < 20; ++n6) {
                    n5 = e2.y();
                    if (n5 != 1) continue;
                    e3.K[n6] = e2.B();
                    e3.as[n6] = e2.B();
                    String string = e2.F();
                    if (f3 == null || string.length() <= 0) continue;
                    int n9 = string.lastIndexOf(",");
                    e3.G[n6] = rs.n.e.a(Integer.parseInt(string.substring(n9 + 1)), f3, string.substring(0, n9));
                }
                e3.W = new String[6];
                for (n6 = 0; n6 < 5; ++n6) {
                    e3.W[n6] = e2.F();
                    if (e3.W[n6].length() == 0) {
                        e3.W[n6] = null;
                    }
                    if (e3.ah == 3824) {
                        e3.W[4] = "Buy 100";
                        e3.W[5] = "Buy 1000";
                    }
                    if (e3.ah != 1644) continue;
                    e3.W[2] = "Operate";
                }
            }
            if (e3.aI == 3) {
                boolean bl = e3.Y = e2.y() == 1;
            }
            if (e3.aI == 4 || e3.aI == 1) {
                e3.S = e2.y() == 1;
                n6 = e2.y();
                if (k_0Array != null) {
                    e3.ao = k_0Array[n6];
                }
                boolean bl = e3.aS = e2.y() == 1;
            }
            if (e3.aI == 4) {
                e3.at = e2.F();
                e3.Z = e2.F();
            }
            if (e3.aI == 1 || e3.aI == 3 || e3.aI == 4) {
                e3.ad = e2.D();
            }
            if (e3.aI == 3 || e3.aI == 4) {
                e3.O = e2.D();
                e3.L = e2.D();
                e3.ak = e2.D();
            }
            if (e3.aI == 5) {
                e3.v = false;
                String string = e2.F();
                if (f3 != null && string.length() > 0) {
                    n5 = string.lastIndexOf(",");
                    e3.E = rs.n.e.a(Integer.parseInt(string.substring(n5 + 1)), f3, string.substring(0, n5));
                }
                string = e2.F();
                if (f3 != null && string.length() > 0) {
                    n5 = string.lastIndexOf(",");
                    e3.aG = rs.n.e.a(Integer.parseInt(string.substring(n5 + 1)), f3, string.substring(0, n5));
                }
            }
            if (e3.aI == 6) {
                int n10 = e2.y();
                if (n10 != 0) {
                    e3.ae = 1;
                    e3.af = (n10 - 1 << 8) + e2.y();
                }
                if ((n10 = e2.y()) != 0) {
                    e3.d = 1;
                    e3.e = (n10 - 1 << 8) + e2.y();
                }
                e3.aD = (n10 = e2.y()) != 0 ? (n10 - 1 << 8) + e2.y() : -1;
                n10 = e2.y();
                e3.aE = n10 != 0 ? (n10 - 1 << 8) + e2.y() : -1;
                e3.aT = e2.A();
                e3.aU = e2.A();
                e3.aV = e2.A();
            }
            if (e3.aI == 7) {
                e3.az = new int[e3.P * e3.aR];
                e3.ax = new int[e3.P * e3.aR];
                e3.S = e2.y() == 1;
                int n11 = e2.y();
                if (k_0Array != null) {
                    e3.ao = k_0Array[n11];
                }
                e3.aS = e2.y() == 1;
                e3.ad = e2.D();
                e3.ac = e2.B();
                e3.ap = e2.B();
                e3.av = e2.y() == 1;
                e3.W = new String[5];
                for (n5 = 0; n5 < 5; ++n5) {
                    e3.W[n5] = e2.F();
                    if (e3.W[n5].length() != 0) continue;
                    e3.W[n5] = null;
                }
            }
            if (e3.M == 2 || e3.aI == 2) {
                e3.R = e2.F();
                e3.N = e2.F();
                e3.ai = e2.A();
            }
            if (e3.aI == 8) {
                e3.at = e2.F();
            }
            if (e3.M == 1 || e3.M == 4 || e3.M == 5 || e3.M == 6) {
                e3.Q = e2.F();
                if (e3.Q.length() == 0) {
                    if (e3.M == 1) {
                        e3.Q = "Ok";
                    }
                    if (e3.M == 4) {
                        e3.Q = "Select";
                    }
                    if (e3.M == 5) {
                        e3.Q = "Select";
                    }
                    if (e3.M == 6) {
                        e3.Q = "Continue";
                    }
                }
            }
            if (e3.at == null) continue;
            e3.at = e3.at.replace("Runescape", rs.f.a.A);
            e3.at = e3.at.replace("RuneScape", rs.f.a.A);
            e3.at = e3.at.replace("runescape", rs.f.a.A.toLowerCase());
        }
        u = f2;
        rs.n.d.a(f2, k_0Array);
        b = null;
        c = null;
        for (n2 = 15239; n2 <= 15244; ++n2) {
            rs.n.e.H[n2].ao = k_0Array[0];
            rs.n.e.H[n2].S = true;
        }
        rs.n.e.H[15239].at = " @gre@Random player";
        rs.n.e.H[15240].at = " Mountain";
        rs.n.e.H[15241].at = " Trinity Outpost";
        rs.n.e.H[15242].at = " M. Settlement";
        rs.n.e.H[15243].at = " Debtor Hideout";
    }

    public static void a(int n2, String string, k_0[] k_0Array, int n3, int n4, boolean bl) {
        e e2 = rs.n.e.H[n2] = new e();
        if (bl) {
            e2.S = true;
        }
        e2.aS = true;
        e2.ao = k_0Array[n3];
        e2.at = string;
        e2.ad = n4;
        e2.aw = n2;
        e2.aI = 4;
    }

    public static void b(int n2, int n3) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.P = 26;
        e2.aR = 34;
        e2.aC = 0;
        e2.ab = 0;
        e2.E = rs.n.e.j(n3, "Interfaces/Skill");
        e2.aG = rs.n.e.j(n3, "Interfaces/Skill");
    }

    public static void b(int n2, String string) {
        e e2 = rs.n.e.j(n2);
        e2.ah = n2;
        e2.aI = 0;
        e2.aQ = true;
        e2.ab = -1;
        rs.n.e.e(n2 + 1, string);
        e2.k(1);
        e2.b(0, n2 + 1, 0, 0);
    }

    public static void d() {
        e e2 = rs.n.e.d(30000);
        e2.Q = "Cast @gre@Lunar Home Teleport";
        e2.aw = 30000;
        e2.ah = 30000;
        e2.aI = 5;
        e2.M = 5;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 30001;
        e2.E = rs.n.e.j(1, "lunar/SPRITE");
        e2.P = 20;
        e2.aR = 20;
        e e3 = rs.n.e.d(30001);
        e3.aQ = true;
        e3.ab = -1;
        rs.n.e.a(1, e3);
        rs.n.e.a(30002, 0, "SPRITE");
        rs.n.e.b(30002, 0, 0, 0, e3);
    }

    public static void a(int n2, String string, int n3, int n4) {
        e e2 = rs.n.e.j(n2);
        e2.aw = n2;
        e2.aI = 0;
        e2.aQ = true;
        e2.ab = -1;
        rs.n.e.e(n2 + 1, string);
        e2.k(1);
        e2.b(0, n2 + 1, 0, 0);
        e2.aR = n3;
        e2.P = n4;
    }

    public static void a(int n2, int n3, int n4, String string, String string2, int n5, int n6, int n7) {
        e e2 = rs.n.e.j(n2);
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 5;
        e2.M = n6;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = -1;
        e2.aq = new int[1];
        e2.I = new int[1];
        e2.aq[0] = 1;
        e2.I[0] = n5;
        e2.X = new int[1][3];
        e2.X[0][0] = 5;
        e2.X[0][1] = n7;
        e2.X[0][2] = 0;
        e2.E = rs.n.e.j(n3, string);
        e2.aG = rs.n.e.j(n4, string);
        e2.P = e2.E.n;
        e2.aR = e2.E.o;
        e2.Q = string2;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, String string, int n7, int n8, int n9, int n10, String string2, int n11, int n12, int n13, String string3, int n14, String string4, String string5, int n15, int n16) {
        e e2 = rs.n.e.j(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = n3;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = n4;
        e2.E = rs.n.e.j(n5, string);
        e2.aG = rs.n.e.j(n6, string);
        e2.P = n7;
        e2.Q = string2;
        e2.aR = n8;
        e2.aq = new int[1];
        e2.I = new int[1];
        e2.aq[0] = 1;
        e2.I[0] = n10;
        e2.X = new int[1][3];
        e2.X[0][0] = 5;
        e2.X[0][1] = n9;
        e2.X[0][2] = 0;
        e2 = rs.n.e.j(n4);
        e2.ah = n4;
        e2.aw = n4;
        e2.aI = 0;
        e2.M = 0;
        e2.P = 550;
        e2.aR = 334;
        e2.aQ = true;
        e2.ab = -1;
        rs.n.e.a(n11, n12, n13, string3, n10, n9);
        rs.n.e.a(n14, n2, string4, string5, n10, n9);
        rs.n.e.a(2, e2);
        rs.n.e.b(n11, 15, 60, 0, e2);
        rs.n.e.b(n14, n15, n16, 1, e2);
    }

    public static void a(int n2, int n3, String string, String string2, int n4, int n5) {
        e e2 = rs.n.e.j(n2);
        e2.aw = n2;
        e2.ah = n3;
        e2.ao = Client.bk[0];
        e2.aI = 8;
        e2.Z = string;
        e2.at = string2;
        e2.aq = new int[1];
        e2.I = new int[1];
        e2.aq[0] = 1;
        e2.I[0] = n4;
        e2.X = new int[1][3];
        e2.X[0][0] = 5;
        e2.X[0][1] = n5;
        e2.X[0][2] = 0;
    }

    public static void a(int n2, int n3, int n4, String string, int n5, int n6) {
        e e2 = rs.n.e.j(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.P = 512;
        e2.aR = 334;
        e2.aC = 0;
        e2.ab = -1;
        e2.aq = new int[1];
        e2.I = new int[1];
        e2.aq[0] = 1;
        e2.I[0] = n5;
        e2.X = new int[1][3];
        e2.X[0][0] = 5;
        e2.X[0][1] = n6;
        e2.X[0][2] = 0;
        if (string == null) {
            e2.q = -1;
            e2.o = n3;
            e2.r = 70;
            e2.p = n4;
        } else {
            e2.E = rs.n.e.j(n3, string);
            e2.aG = rs.n.e.j(n4, string);
        }
    }

    public static void b(int n2) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.W = new String[5];
        e2.K = new int[20];
        e2.ax = new int[30];
        e2.az = new int[30];
        e2.as = new int[20];
        e2.al = new int[0];
        e2.am = new int[0];
        e2.bc = new int[0];
        e2.W[0] = "Take 1";
        e2.W[1] = "Take 5";
        e2.W[2] = "Take 10";
        e2.W[3] = "Take All";
        e2.S = false;
        e2.Y = false;
        e2.ag = false;
        e2.an = false;
        e2.av = false;
        e2.aF = true;
        e2.aS = false;
        e2.bj = -1;
        e2.ac = 24;
        e2.ap = 21;
        e2.aR = 5;
        e2.P = 6;
        e2.ah = 40601;
        e2.aw = 40600;
        e2.aI = 2;
    }

    public static void a(k_0[] k_0Array) {
        e e2 = rs.n.e.j(2700);
        rs.n.e.c(2701, 20, "popups/kharazi/SUMMON");
        rs.n.e.c(2702);
        rs.n.e.a(2703, "popups/kharazi/SPRITE", 1, 21, 21, "Close", 250, 2704, 3);
        rs.n.e.a(2704, "popups/kharazi/SPRITE", 3, 21, 21, 2705);
        e2.k(4);
        e2.b(0, 2701, 90, 14);
        e2.b(1, 2702, 100, 56);
        e2.b(2, 2703, 431, 23);
        e2.b(3, 2704, 431, 23);
        e e3 = rs.n.e.j(40600);
        rs.n.e.b(40601);
        rs.n.e.a(40602, "Kharazi storage chest", k_0Array, 2, 16750623, true);
        rs.n.e.a(40603, "popups/kharazi/extend", 1, 16, 16, "Extend slots", -1, 40604, 1);
        rs.n.e.a(40604, "popups/kharazi/extend", 2, 16, 16, 40605);
        e3.k(7);
        e3.b(0, 2701, 90, 14);
        e3.b(1, 40601, 100, 56);
        e3.b(2, 2703, 431, 23);
        e3.b(3, 2704, 431, 23);
        e3.b(4, 40602, 277, 23);
        e3.b(5, 40603, 428, 64);
        e3.b(6, 40604, 428, 64);
    }

    public static void c(int n2) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.W = new String[5];
        e2.K = new int[20];
        e2.ax = new int[30];
        e2.az = new int[30];
        e2.as = new int[20];
        e2.al = new int[0];
        e2.am = new int[0];
        e2.bc = new int[0];
        e2.W[0] = "Take 1";
        e2.W[1] = "Take 5";
        e2.W[2] = "Take 10";
        e2.W[3] = "Take All";
        e2.S = false;
        e2.Y = false;
        e2.ag = false;
        e2.an = false;
        e2.av = false;
        e2.aF = true;
        e2.aS = false;
        e2.bj = -1;
        e2.ac = 24;
        e2.ap = 24;
        e2.aR = 5;
        e2.P = 6;
        e2.ah = 2702;
        e2.aw = 2700;
        e2.aI = 2;
    }

    public static void a(int n2, int n3, int n4, int n5, String string, int n6, int n7, String string2, int n8, int n9, String string3, int n10, String string4, int n11, int n12) {
        e e2 = rs.n.e.j(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = n3;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = n4;
        e2.E = rs.n.e.j(n5, string);
        e2.P = n6;
        e2.Q = string2;
        e2.aR = n7;
        e2 = rs.n.e.j(n4);
        e2.ah = n4;
        e2.aw = n4;
        e2.aI = 0;
        e2.M = 0;
        e2.P = 550;
        e2.aR = 334;
        e2.aQ = true;
        e2.ab = -1;
        rs.n.e.a(n8, n9, n9, string3, 0, 0);
        rs.n.e.a(1, e2);
        rs.n.e.b(n8, 15, 60, 0, e2);
    }

    public static void b(int n2, int n3, int n4, int n5, String string, int n6, int n7, String string2, int n8, int n9, String string3, int n10, String string4, int n11, int n12) {
        e e2 = rs.n.e.j(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = n3;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = n4;
        e2.E = rs.n.e.j(n5, string);
        e2.P = n6;
        e2.Q = string2;
        e2.aR = n7;
        e2 = rs.n.e.j(n4);
        e2.ah = n4;
        e2.aw = n4;
        e2.aI = 0;
        e2.M = 0;
        e2.P = 550;
        e2.aR = 334;
        e2.aQ = true;
        e2.ab = -1;
        rs.n.e.a(n8, n9, n9, string3, 0, 0);
        rs.n.e.a(1, e2);
        rs.n.e.b(n8, 15, 65, 0, e2);
    }

    public static void a(int n2, rs.l.f_0 f_02) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = f_02;
        e2.aG = f_02;
        e2.P = 512;
        e2.aR = 334;
    }

    public static void a(int n2, Boolean bl, int n3) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.W = new String[5];
        e2.K = new int[20];
        e2.ax = new int[n3];
        e2.az = new int[n3];
        e2.as = new int[20];
        e2.al = new int[0];
        e2.am = new int[0];
        e2.bc = new int[0];
        e2.t = false;
        e2.ac = 24;
        e2.ap = 24;
        e2.aR = 5;
        e2.P = 6;
        e2.ah = 5292;
        e2.aw = n2;
        e2.aI = 2;
    }

    public static void a(int n2, Boolean bl) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.W = new String[5];
        e2.K = new int[20];
        e2.ax = new int[30];
        e2.az = new int[30];
        e2.as = new int[20];
        e2.al = new int[0];
        e2.am = new int[0];
        e2.bc = new int[0];
        e2.t = false;
        e2.ac = 24;
        e2.ap = 24;
        e2.aR = 5;
        e2.P = 6;
        e2.ah = 5292;
        e2.aw = n2;
        e2.aI = 2;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, String string, String string2, k_0[] k_0Array, int n9, int n10, int n11) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = 1151;
        e2.aI = 5;
        e2.M = n11;
        e2.J = 0;
        e2.ab = n2 + 1;
        e2.ai = n10;
        e2.R = "Cast on";
        e2.P = 20;
        e2.aR = 20;
        e2.Q = "Cast @gre@" + string;
        e2.N = string;
        e2.aq = new int[3];
        e2.I = new int[3];
        e2.aq[0] = 3;
        e2.I[0] = n5;
        e2.aq[1] = 3;
        e2.I[1] = n6;
        e2.aq[2] = 3;
        e2.I[2] = n8;
        e2.X = new int[4][];
        e2.X[0] = new int[4];
        e2.X[0][0] = 4;
        e2.X[0][1] = 3214;
        e2.X[0][2] = n3;
        e2.X[0][3] = 0;
        e2.X[1] = new int[4];
        e2.X[1][0] = 4;
        e2.X[1][1] = 3214;
        e2.X[1][2] = n4;
        e2.X[1][3] = 0;
        e2.X[2] = new int[3];
        e2.X[2][0] = 1;
        e2.X[2][1] = 6;
        e2.X[2][2] = 0;
        e2.aG = rs.n.e.j(n9, "magic/on");
        e2.E = rs.n.e.j(n9, "magic/off");
        e e3 = rs.n.e.d(n2 + 1);
        e3.aQ = true;
        e3.ab = -1;
        rs.n.e.a(7, e3);
        rs.n.e.a(n2 + 2, 0, "BOX");
        rs.n.e.b(n2 + 2, 0, 0, 0, e3);
        rs.n.e.a(n2 + 3, "Level " + (n8 + 1) + ": " + string, 16750623, true, true, 52, k_0Array, 1);
        rs.n.e.b(n2 + 3, 90, 4, 1, e3);
        rs.n.e.a(n2 + 4, string2, 11495962, true, true, 52, k_0Array, 0);
        rs.n.e.b(n2 + 4, 90, 19, 2, e3);
        rs.n.e.b(19200, 14, 35, 3, e3);
        rs.n.e.b(n7, 74, 35, 4, e3);
        rs.n.e.a(n2 + 5, n5 + 1, n3, k_0Array);
        rs.n.e.b(n2 + 5, 26, 66, 5, e3);
        rs.n.e.a(n2 + 6, n6 + 1, n4, k_0Array);
        rs.n.e.b(n2 + 6, 87, 66, 6, e3);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, String string, String string2, k_0[] k_0Array, int n12, int n13, int n14) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = 1151;
        e2.aI = 5;
        e2.M = n14;
        e2.J = 0;
        e2.ab = n2 + 1;
        e2.ai = n13;
        e2.R = "Cast on";
        e2.P = 20;
        e2.aR = 20;
        e2.Q = "Cast @gre@" + string;
        e2.N = string;
        e2.aq = new int[4];
        e2.I = new int[4];
        e2.aq[0] = 3;
        e2.I[0] = n6;
        e2.aq[1] = 3;
        e2.I[1] = n7;
        e2.aq[2] = 3;
        e2.I[2] = n8;
        e2.aq[3] = 3;
        e2.I[3] = n11;
        e2.X = new int[4][];
        e2.X[0] = new int[4];
        e2.X[0][0] = 4;
        e2.X[0][1] = 3214;
        e2.X[0][2] = n3;
        e2.X[0][3] = 0;
        e2.X[1] = new int[4];
        e2.X[1][0] = 4;
        e2.X[1][1] = 3214;
        e2.X[1][2] = n4;
        e2.X[1][3] = 0;
        e2.X[2] = new int[4];
        e2.X[2][0] = 4;
        e2.X[2][1] = 3214;
        e2.X[2][2] = n5;
        e2.X[2][3] = 0;
        e2.X[3] = new int[3];
        e2.X[3][0] = 1;
        e2.X[3][1] = 6;
        e2.X[3][2] = 0;
        e2.aG = rs.n.e.j(n12, "magic/on");
        e2.E = rs.n.e.j(n12, "magic/off");
        e e3 = rs.n.e.d(n2 + 1);
        e3.aQ = true;
        e3.ab = -1;
        rs.n.e.a(9, e3);
        rs.n.e.a(n2 + 2, 0, "BOX");
        rs.n.e.b(n2 + 2, 0, 0, 0, e3);
        rs.n.e.a(n2 + 3, "Level " + (n11 + 1) + ": " + string, 16750623, true, true, 52, k_0Array, 1);
        rs.n.e.b(n2 + 3, 90, 4, 1, e3);
        rs.n.e.a(n2 + 4, string2, 11495962, true, true, 52, k_0Array, 0);
        rs.n.e.b(n2 + 4, 90, 19, 2, e3);
        rs.n.e.b(19200, 14, 35, 3, e3);
        rs.n.e.b(n9, 74, 35, 4, e3);
        rs.n.e.b(n10, 130, 35, 5, e3);
        rs.n.e.a(n2 + 5, n6 + 1, n3, k_0Array);
        rs.n.e.b(n2 + 5, 26, 66, 6, e3);
        rs.n.e.a(n2 + 6, n7 + 1, n4, k_0Array);
        rs.n.e.b(n2 + 6, 87, 66, 7, e3);
        rs.n.e.a(n2 + 7, n8 + 1, n5, k_0Array);
        rs.n.e.b(n2 + 7, 142, 66, 8, e3);
    }

    public static void a(int n2, int n3, String string) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 5;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = rs.n.e.a(n3, string);
        e2.P = 500;
        e2.aR = 500;
        e2.Q = "";
    }

    public static void b(int n2, int n3, String string) {
        e e2 = rs.n.e.d(n2);
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = rs.n.e.a(n3, "RUNE");
        e2.P = 500;
        e2.aR = 500;
    }

    public static void b(int n2, int n3, String string, String string2, int n4, int n5) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = n5;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = n4;
        e2.E = rs.n.e.j(n3, string);
        e2.aG = rs.n.e.j(n3, string);
        e2.P = e2.E.n;
        e2.aR = e2.aG.o;
        e2.Q = string2;
        e2.bh = true;
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, String string, String string2, k_0[] k_0Array, int n9, int n10, int n11) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = 1151;
        e2.aI = 5;
        e2.M = n11;
        e2.J = 0;
        e2.ab = n2 + 1;
        e2.ai = n10;
        e2.R = "Cast On";
        e2.P = 20;
        e2.aR = 20;
        e2.Q = "Cast @gre@" + string;
        e2.N = string;
        e2.aq = new int[3];
        e2.I = new int[3];
        e2.aq[0] = 3;
        e2.I[0] = n5;
        e2.aq[1] = 3;
        e2.I[1] = n6;
        e2.aq[2] = 3;
        e2.I[2] = n8;
        e2.X = new int[3][];
        e2.X[0] = new int[4];
        e2.X[0][0] = 4;
        e2.X[0][1] = 3214;
        e2.X[0][2] = n3;
        e2.X[0][3] = 0;
        e2.X[1] = new int[4];
        e2.X[1][0] = 4;
        e2.X[1][1] = 3214;
        e2.X[1][2] = n4;
        e2.X[1][3] = 0;
        e2.X[2] = new int[3];
        e2.X[2][0] = 1;
        e2.X[2][1] = 6;
        e2.X[2][2] = 0;
        e2.aG = rs.n.e.j(n9, "lunar/LUNARON");
        e2.E = rs.n.e.j(n9, "lunar/LUNAROFF");
        e e3 = rs.n.e.d(n2 + 1);
        e3.aQ = true;
        e3.ab = -1;
        rs.n.e.a(7, e3);
        rs.n.e.a(n2 + 2, 0, "BOX");
        rs.n.e.b(n2 + 2, 0, 0, 0, e3);
        rs.n.e.a(n2 + 3, "Level " + (n8 + 1) + ": " + string, 16750623, true, true, 52, k_0Array, 1);
        rs.n.e.b(n2 + 3, 90, 4, 1, e3);
        rs.n.e.a(n2 + 4, string2, 11495962, true, true, 52, k_0Array, 0);
        rs.n.e.b(n2 + 4, 90, 19, 2, e3);
        rs.n.e.b(30016, 37, 35, 3, e3);
        rs.n.e.b(n7, 112, 35, 4, e3);
        rs.n.e.a(n2 + 5, n5 + 1, n3, k_0Array);
        rs.n.e.b(n2 + 5, 50, 66, 5, e3);
        rs.n.e.a(n2 + 6, n6 + 1, n4, k_0Array);
        rs.n.e.b(n2 + 6, 123, 66, 6, e3);
    }

    public static void a(int n2, int n3, int n4, k_0[] k_0Array) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = 1151;
        e2.aI = 4;
        e2.M = 0;
        e2.J = 0;
        e2.P = 0;
        e2.aR = 14;
        e2.aC = 0;
        e2.ab = -1;
        e2.aq = new int[1];
        e2.I = new int[1];
        e2.aq[0] = 3;
        e2.I[0] = n3;
        e2.X = new int[1][4];
        e2.X[0][0] = 4;
        e2.X[0][1] = 3214;
        e2.X[0][2] = n4;
        e2.X[0][3] = 0;
        e2.S = true;
        e2.ao = k_0Array[0];
        e2.aS = true;
        e2.at = "%1/" + n3;
        e2.Z = "";
        e2.ad = 0xC00000;
        e2.O = 49152;
    }

    public static void a(int n2, int n3, int n4) {
        e e2 = rs.n.e.j(n2);
        e2.aI = 6;
        e2.ae = 10;
        e2.af = 941;
        rs.d.d d2 = rs.d.d.c(e2.af);
        e2.aT = d2.r == 1 ? 1750 : d2.r * 500;
        e2.aK = true;
        e2.aD = d2.w;
        e2.aU = 40;
        e2.aV = 1900;
        e2.aR = n4;
        e2.P = n3;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        e e2 = rs.n.e.H[n2] = new e();
        rs.d.k k2 = rs.d.k.f(n3);
        e2.aU = k2.M;
        e2.aV = k2.Z;
        e2.aI = 6;
        e2.ae = 4;
        e2.af = n3;
        e2.aT = n6;
        e2.P = n4;
        e2.aR = n5;
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, String string, String string2, k_0[] k_0Array, int n12, int n13, int n14) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = 1151;
        e2.aI = 5;
        e2.M = n14;
        e2.J = 0;
        e2.ab = n2 + 1;
        e2.ai = n13;
        e2.R = "Cast on";
        e2.P = 20;
        e2.aR = 20;
        e2.Q = "Cast @gre@" + string;
        e2.N = string;
        e2.aq = new int[4];
        e2.I = new int[4];
        e2.aq[0] = 3;
        e2.I[0] = n6;
        e2.aq[1] = 3;
        e2.I[1] = n7;
        e2.aq[2] = 3;
        e2.I[2] = n8;
        e2.aq[3] = 3;
        e2.I[3] = n11;
        e2.X = new int[4][];
        e2.X[0] = new int[4];
        e2.X[0][0] = 4;
        e2.X[0][1] = 3214;
        e2.X[0][2] = n3;
        e2.X[0][3] = 0;
        e2.X[1] = new int[4];
        e2.X[1][0] = 4;
        e2.X[1][1] = 3214;
        e2.X[1][2] = n4;
        e2.X[1][3] = 0;
        e2.X[2] = new int[4];
        e2.X[2][0] = 4;
        e2.X[2][1] = 3214;
        e2.X[2][2] = n5;
        e2.X[2][3] = 0;
        e2.X[3] = new int[3];
        e2.X[3][0] = 1;
        e2.X[3][1] = 6;
        e2.X[3][2] = 0;
        e2.aG = rs.n.e.j(n12, "lunar/LUNARON");
        e2.E = rs.n.e.j(n12, "lunar/LUNAROFF");
        e e3 = rs.n.e.d(n2 + 1);
        e3.aQ = true;
        e3.ab = -1;
        rs.n.e.a(9, e3);
        rs.n.e.a(n2 + 2, 0, "BOX");
        rs.n.e.b(n2 + 2, 0, 0, 0, e3);
        rs.n.e.a(n2 + 3, "Level " + (n11 + 1) + ": " + string, 16750623, true, true, 52, k_0Array, 1);
        rs.n.e.b(n2 + 3, 90, 4, 1, e3);
        rs.n.e.a(n2 + 4, string2, 11495962, true, true, 52, k_0Array, 0);
        rs.n.e.b(n2 + 4, 90, 19, 2, e3);
        rs.n.e.b(30016, 14, 35, 3, e3);
        rs.n.e.b(n9, 74, 35, 4, e3);
        rs.n.e.b(n10, 130, 35, 5, e3);
        rs.n.e.a(n2 + 5, n6 + 1, n3, k_0Array);
        rs.n.e.b(n2 + 5, 26, 66, 6, e3);
        rs.n.e.a(n2 + 6, n7 + 1, n4, k_0Array);
        rs.n.e.b(n2 + 6, 87, 66, 7, e3);
        rs.n.e.a(n2 + 7, n8 + 1, n5, k_0Array);
        rs.n.e.b(n2 + 7, 142, 66, 8, e3);
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, String string, String string2, k_0[] k_0Array, int n12, int n13, int n14) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = 1151;
        e2.aI = 5;
        e2.M = n14;
        e2.J = 0;
        e2.ab = n2 + 1;
        e2.ai = n13;
        e2.R = "Cast on";
        e2.P = 20;
        e2.aR = 20;
        e2.Q = "Cast @gre@" + string;
        e2.N = string;
        e2.aq = new int[4];
        e2.I = new int[4];
        e2.aq[0] = 3;
        e2.I[0] = n6;
        e2.aq[1] = 3;
        e2.I[1] = n7;
        e2.aq[2] = 3;
        e2.I[2] = n8;
        e2.aq[3] = 3;
        e2.I[3] = n11;
        e2.X = new int[4][];
        e2.X[0] = new int[4];
        e2.X[0][0] = 4;
        e2.X[0][1] = 3214;
        e2.X[0][2] = n3;
        e2.X[0][3] = 0;
        e2.X[1] = new int[4];
        e2.X[1][0] = 4;
        e2.X[1][1] = 3214;
        e2.X[1][2] = n4;
        e2.X[1][3] = 0;
        e2.X[2] = new int[4];
        e2.X[2][0] = 4;
        e2.X[2][1] = 3214;
        e2.X[2][2] = n5;
        e2.X[2][3] = 0;
        e2.X[3] = new int[3];
        e2.X[3][0] = 1;
        e2.X[3][1] = 6;
        e2.X[3][2] = 0;
        e2.aG = rs.n.e.j(n12, "magic/on");
        e2.E = rs.n.e.j(n12, "magic/off");
        e e3 = rs.n.e.d(n2 + 1);
        e3.aQ = true;
        e3.ab = -1;
        rs.n.e.a(9, e3);
        rs.n.e.a(n2 + 2, 0, "BOX");
        rs.n.e.b(n2 + 2, 0, 0, 0, e3);
        rs.n.e.a(n2 + 3, "Level " + (n11 + 1) + ": " + string, 16750623, true, true, 52, k_0Array, 1);
        rs.n.e.b(n2 + 3, 90, 4, 1, e3);
        rs.n.e.a(n2 + 4, string2, 11495962, true, true, 52, k_0Array, 0);
        rs.n.e.b(n2 + 4, 90, 19, 2, e3);
        rs.n.e.b(30016, 14, 35, 3, e3);
        rs.n.e.b(n9, 74, 35, 4, e3);
        rs.n.e.b(n10, 130, 35, 5, e3);
        rs.n.e.a(n2 + 5, n6 + 1, n3, k_0Array);
        rs.n.e.b(n2 + 5, 26, 66, 6, e3);
        rs.n.e.a(n2 + 6, n7 + 1, n4, k_0Array);
        rs.n.e.b(n2 + 6, 87, 66, 7, e3);
        rs.n.e.a(n2 + 7, n8 + 1, n5, k_0Array);
        rs.n.e.b(n2 + 7, 142, 66, 8, e3);
    }

    protected static void a(int n2, int n3, String string, int n4) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.a = (byte)n4;
        e2.bj = 52;
        e2.E = rs.n.e.j(n3, string);
        e2.aG = rs.n.e.j(n3, string);
        e2.P = 512;
        e2.aR = 334;
        e2.v = true;
    }

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, String string, String string2, k_0[] k_0Array, int n12, int n13, int n14) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = 1151;
        e2.aI = 5;
        e2.M = n14;
        e2.J = 0;
        e2.ab = n2 + 1;
        e2.ai = n13;
        e2.R = "Cast on";
        e2.P = 20;
        e2.aR = 20;
        e2.Q = "Cast @gre@" + string;
        e2.N = string;
        e2.aq = new int[4];
        e2.I = new int[4];
        e2.aq[0] = 3;
        e2.I[0] = n6;
        e2.aq[1] = 3;
        e2.I[1] = n7;
        e2.aq[2] = 3;
        e2.I[2] = n8;
        e2.aq[3] = 3;
        e2.I[3] = n11;
        e2.X = new int[4][];
        e2.X[0] = new int[4];
        e2.X[0][0] = 4;
        e2.X[0][1] = 3214;
        e2.X[0][2] = n3;
        e2.X[0][3] = 0;
        e2.X[1] = new int[4];
        e2.X[1][0] = 4;
        e2.X[1][1] = 3214;
        e2.X[1][2] = n4;
        e2.X[1][3] = 0;
        e2.X[2] = new int[4];
        e2.X[2][0] = 4;
        e2.X[2][1] = 3214;
        e2.X[2][2] = n5;
        e2.X[2][3] = 0;
        e2.X[3] = new int[3];
        e2.X[3][0] = 1;
        e2.X[3][1] = 6;
        e2.X[3][2] = 0;
        e2.aG = rs.n.e.j(n12, "lunar/LUNARON");
        e2.E = rs.n.e.j(n12, "lunar/LUNAROFF");
        e e3 = rs.n.e.d(n2 + 1);
        e3.aQ = true;
        e3.ab = -1;
        rs.n.e.a(9, e3);
        rs.n.e.a(n2 + 2, 1, "BOX");
        rs.n.e.b(n2 + 2, 0, 0, 0, e3);
        rs.n.e.a(n2 + 3, "Level " + (n11 + 1) + ": " + string, 16750623, true, true, 52, k_0Array, 1);
        rs.n.e.b(n2 + 3, 90, 4, 1, e3);
        rs.n.e.a(n2 + 4, string2, 11495962, true, true, 52, k_0Array, 0);
        rs.n.e.b(n2 + 4, 90, 21, 2, e3);
        rs.n.e.b(30016, 14, 48, 3, e3);
        rs.n.e.b(n9, 74, 48, 4, e3);
        rs.n.e.b(n10, 130, 48, 5, e3);
        rs.n.e.a(n2 + 5, n6 + 1, n3, k_0Array);
        rs.n.e.b(n2 + 5, 26, 79, 6, e3);
        rs.n.e.a(n2 + 6, n7 + 1, n4, k_0Array);
        rs.n.e.b(n2 + 6, 87, 79, 7, e3);
        rs.n.e.a(n2 + 7, n8 + 1, n5, k_0Array);
        rs.n.e.b(n2 + 7, 142, 79, 8, e3);
    }

    public static void e(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, String string, String string2, k_0[] k_0Array, int n12, int n13, int n14) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = 1151;
        e2.aI = 5;
        e2.M = n14;
        e2.J = 0;
        e2.ab = n2 + 1;
        e2.ai = n13;
        e2.R = "Cast on";
        e2.P = 20;
        e2.aR = 20;
        e2.Q = "Cast @gre@" + string;
        e2.N = string;
        e2.aq = new int[4];
        e2.I = new int[4];
        e2.aq[0] = 3;
        e2.I[0] = n6;
        e2.aq[1] = 3;
        e2.I[1] = n7;
        e2.aq[2] = 3;
        e2.I[2] = n8;
        e2.aq[3] = 3;
        e2.I[3] = n11;
        e2.X = new int[4][];
        e2.X[0] = new int[4];
        e2.X[0][0] = 4;
        e2.X[0][1] = 3214;
        e2.X[0][2] = n3;
        e2.X[0][3] = 0;
        e2.X[1] = new int[4];
        e2.X[1][0] = 4;
        e2.X[1][1] = 3214;
        e2.X[1][2] = n4;
        e2.X[1][3] = 0;
        e2.X[2] = new int[4];
        e2.X[2][0] = 4;
        e2.X[2][1] = 3214;
        e2.X[2][2] = n5;
        e2.X[2][3] = 0;
        e2.X[3] = new int[3];
        e2.X[3][0] = 1;
        e2.X[3][1] = 6;
        e2.X[3][2] = 0;
        e2.aG = rs.n.e.j(n12, "lunar/LUNARON");
        e2.E = rs.n.e.j(n12, "lunar/LUNAROFF");
        e e3 = rs.n.e.d(n2 + 1);
        e3.aQ = true;
        e3.ab = -1;
        rs.n.e.a(9, e3);
        rs.n.e.a(n2 + 2, 2, "BOX");
        rs.n.e.b(n2 + 2, 0, 0, 0, e3);
        rs.n.e.a(n2 + 3, "Level " + (n11 + 1) + ": " + string, 16750623, true, true, 52, k_0Array, 1);
        rs.n.e.b(n2 + 3, 90, 4, 1, e3);
        rs.n.e.a(n2 + 4, string2, 11495962, true, true, 52, k_0Array, 0);
        rs.n.e.b(n2 + 4, 90, 34, 2, e3);
        rs.n.e.b(30016, 14, 61, 3, e3);
        rs.n.e.b(n9, 74, 61, 4, e3);
        rs.n.e.b(n10, 130, 61, 5, e3);
        rs.n.e.a(n2 + 5, n6 + 1, n3, k_0Array);
        rs.n.e.b(n2 + 5, 26, 92, 6, e3);
        rs.n.e.a(n2 + 6, n7 + 1, n4, k_0Array);
        rs.n.e.b(n2 + 6, 87, 92, 7, e3);
        rs.n.e.a(n2 + 7, n8 + 1, n5, k_0Array);
        rs.n.e.b(n2 + 7, 142, 92, 8, e3);
    }

    private static rs.l.f_0 a(int n2, String string) {
        rs.l.f_0 f_02 = rs.n.e.j(n2, "/Lunar/" + string);
        return f_02;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, String string) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.E = rs.n.e.d(n3, "");
        e2.aG = n4 == n3 ? rs.n.e.d(n3, "a") : rs.n.e.d(n4, "");
        e2.Q = string;
        e2.J = 0;
        e2.M = 1;
        e2.P = n5;
        e2.ab = 52;
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 5;
        e2.aR = n6;
    }

    public static void a(int n2, int n3, String string, String string2, int n4, int n5, int n6, int n7) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = n5;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = n4;
        e2.E = rs.n.e.j(n3, string);
        e2.aG = rs.n.e.j(n3, string);
        e2.P = n6;
        e2.aR = n7;
        e2.Q = string2;
        e2.bh = true;
    }

    public static void a(int n2, String string, k_0[] k_0Array, int n3, int n4) {
        e e2 = rs.n.e.f(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 4;
        e2.M = 0;
        e2.P = 174;
        e2.aR = 11;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = -1;
        e2.S = false;
        e2.aS = true;
        e2.ao = k_0Array[n3];
        e2.at = string;
        e2.Z = "";
        e2.ad = n4;
        e2.O = 0;
        e2.L = 0;
        e2.ak = 0;
    }

    public static void c(int n2, int n3) {
        e e2 = H[n2];
        e2.E = rs.n.e.d(n3, "");
    }

    public static e d(int n2) {
        rs.n.e.H[n2] = new e();
        rs.n.e.H[n2].aw = n2;
        rs.n.e.H[n2].ah = n2;
        rs.n.e.H[n2].P = 512;
        rs.n.e.H[n2].aR = 334;
        return H[n2];
    }

    public static void b(int n2, int n3, int n4) {
        e e2 = rs.n.e.j(n2);
        e2.aI = 6;
        e2.ae = 10;
        e2.af = 941;
        rs.d.d d2 = rs.d.d.c(e2.af);
        e2.aT = d2.r == 1 ? 1750 : d2.r * 500;
        e2.aD = d2.w;
        e2.aU = 40;
        e2.aV = 1900;
        e2.aR = n4;
        e2.P = n3;
    }

    public static void d(int n2, int n3) {
        e e2 = rs.n.e.j(n2);
        e2.aI = 21;
        e2.af = 941;
        e2.aR = n3;
        e2.P = n3;
    }

    public static void a(int n2, int n3, int n4, int n5, e e2) {
        e2.al[n2] = n3;
        e2.am[n2] = n4;
        e2.bc[n2] = n5;
    }

    public static void a(int n2, int n3, int n4, boolean bl, int n5, int n6, String string) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.bd = n4;
        e2.be = bl;
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 3;
        e2.M = 5;
        e2.J = 0;
        e2.bi = (byte)n3;
        e2.P = n5;
        e2.aR = n6;
        e2.Q = "Build " + string;
    }

    public static void e(int n2) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.W = new String[5];
        e2.W = new String[]{"Build", null, null, null, null};
        e2.K = new int[20];
        e2.ax = new int[30];
        e2.az = new int[30];
        e2.as = new int[20];
        e2.al = new int[0];
        e2.am = new int[0];
        e2.bc = new int[0];
        e2.be = false;
        e2.an = false;
        e2.av = false;
        e2.ac = 164;
        e2.ap = 37;
        e2.aI = 2;
        e2.ah = 39982;
        e2.aw = 39980;
        e2.P = 2;
        e2.aR = 4;
    }

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        e e2 = rs.n.e.d(n2);
        e2.P = n3;
        e2.aR = n4;
        e2.az = new int[n3 * n4];
        e2.ax = new int[n3 * n4];
        e2.an = false;
        e2.av = false;
        e2.ac = n5;
        e2.ap = n6;
        e2.K = new int[20];
        e2.as = new int[20];
        e2.G = new rs.l.f_0[20];
        e2.aI = 2;
    }

    public static void c(int n2, int n3, int n4) {
        rs.n.e.a(n2, n3, 0, n4);
    }

    public static void a(int n2, int n3, int n4, int n5) {
        e e2 = rs.n.e.j(n2);
        if (n3 == 0) {
            return;
        }
        e2.aI = 20;
        e2.af = n3;
        e2.aR = n5;
        e2.P = n5;
        e2.bq = n4;
    }

    public static void a(int n2, String string, String string2, k_0[] k_0Array, int n3, int n4, boolean bl, boolean bl2, int n5) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 4;
        e2.M = 1;
        e2.P = n5;
        e2.aR = 11;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = -1;
        e2.S = bl;
        e2.aS = bl2;
        e2.ao = k_0Array[n3];
        e2.at = string;
        e2.Z = "";
        e2.ad = n4;
        e2.O = 0;
        e2.L = 0xFFFFFF;
        e2.ak = 0;
        e2.Q = string2;
    }

    public static void b(int n2, String string, String string2, k_0[] k_0Array, int n3, int n4, boolean bl, boolean bl2, int n5) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 4;
        e2.M = 1;
        e2.P = n5;
        e2.aR = 11;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = -1;
        e2.S = bl;
        e2.aS = bl2;
        e2.ao = k_0Array[n3];
        e2.at = string;
        e2.Z = "";
        e2.ad = n4;
        e2.O = 0;
        e2.L = 0xFFFFFF;
        e2.ak = 0;
        e2.Q = string2;
        e2.bo = true;
    }

    public static e f(int n2) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 0;
        e2.M = 0;
        e2.J = 0;
        e2.P = 512;
        e2.aR = 334;
        e2.aC = 0;
        e2.ab = 0;
        return e2;
    }

    public static void a(int n2, String string, int n3, int n4, int n5, int n6, int n7, String string2) {
        e e2 = rs.n.e.d(n2);
        e2.E = rs.n.e.j(n3, string);
        e2.aG = rs.n.e.j(n4, string);
        e2.I = new int[1];
        e2.I[0] = 1;
        e2.aq = new int[1];
        e2.aq[0] = 1;
        e2.X = new int[1][3];
        e2.X[0][0] = 5;
        e2.X[0][1] = n5;
        e2.X[0][2] = 0;
        e2.M = 4;
        e2.P = n6;
        e2.ab = -1;
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 5;
        e2.aR = n7;
        e2.Q = string2;
    }

    public static void a(int n2, int n3, int n4, int n5, String string, int n6, int n7, String string2, int n8, int n9, int n10) {
        e e2 = rs.n.e.j(n2);
        e2.ah = n3;
        e2.aw = n2;
        e2.aI = 5;
        e2.M = n9;
        e2.J = 0;
        e2.P = n6;
        e2.aR = n7;
        e2.aC = 0;
        e2.ab = -1;
        e2.aq = new int[1];
        e2.I = new int[1];
        e2.aq[0] = 1;
        e2.I[0] = n8;
        e2.X = new int[1][3];
        e2.X[0][0] = 5;
        e2.X[0][1] = n10;
        e2.X[0][2] = 0;
        e2.E = rs.n.e.j(n4, string);
        e2.aG = rs.n.e.j(n5, string);
        e2.Q = string2;
    }

    public static void e(int n2, int n3) {
        rs.l.c.a(71, n3 - 1, n2 - 2, 7496785, 1);
        rs.l.c.a(69, n3, n2 + 174, 7496785, 1);
        rs.l.c.a(1, n3 - 2, n2 - 2, 7496785, 178);
        rs.l.c.a(1, n3 + 68, n2, 7496785, 174);
        rs.l.c.a(71, n3 - 1, n2 - 1, 3025699, 1);
        rs.l.c.a(71, n3 - 1, n2 + 175, 3025699, 1);
        rs.l.c.a(1, n3 - 1, n2, 3025699, 175);
        rs.l.c.a(1, n3 + 69, n2, 3025699, 175);
        rs.l.c.d(n2, n3, 174, 68, 0, 220);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, String string, int n7) {
        e e2 = rs.n.e.j(n2);
        e2.aw = n2;
        e2.ah = 22500;
        e2.aI = 5;
        e2.M = 4;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = n7;
        e2.E = rs.n.e.j(0, "prayer/curses/GLOW");
        e2.aG = rs.n.e.j(1, "prayer/curses/GLOW");
        e2.P = 34;
        e2.aR = 34;
        e2.aq = new int[1];
        e2.I = new int[1];
        e2.aq[0] = 1;
        e2.I[0] = n3;
        e2.X = new int[1][3];
        e2.X[0][0] = 5;
        e2.X[0][1] = n4;
        e2.X[0][2] = 0;
        e2.Q = "Activate@or1@ " + string;
        e2 = rs.n.e.j(n2 + 1);
        e2.aw = n2 + 1;
        e2.ah = 22500;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.E = rs.n.e.j(n6, "prayer/curses/PRAYON");
        e2.aG = rs.n.e.j(n6, "prayer/curses/PRAYOFF");
        e2.P = 34;
        e2.aR = 34;
        e2.aq = new int[1];
        e2.I = new int[1];
        e2.aq[0] = 2;
        e2.I[0] = n5 + 1;
        e2.X = new int[1][3];
        e2.X[0][0] = 2;
        e2.X[0][1] = 5;
        e2.X[0][2] = 0;
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, String string) {
        e e2 = rs.n.e.j(n2);
        e2.aw = n2;
        e2.ah = 5608;
        e2.aI = 5;
        e2.M = 4;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = -1;
        e2.E = rs.n.e.a(0, "PRAYERGLOW", true);
        e2.aG = rs.n.e.a(1, "PRAYERGLOW", true);
        e2.P = 34;
        e2.aR = 34;
        e2.aq = new int[1];
        e2.I = new int[1];
        e2.aq[0] = 1;
        e2.I[0] = n3;
        e2.X = new int[1][3];
        e2.X[0][0] = 5;
        e2.X[0][1] = n4;
        e2.X[0][2] = 0;
        e2.Q = "Activate@or2@ " + string;
        e e3 = rs.n.e.j(n2 + 1);
        e3.aw = n2 + 1;
        e3.ah = 5608;
        e3.aI = 5;
        e3.M = 0;
        e3.J = 0;
        e3.aC = 0;
        e3.ab = -1;
        e3.E = rs.n.e.j(n6, "Prayer/PRAYON");
        e3.aG = rs.n.e.j(n6, "Prayer/PRAYOFF");
        e3.P = 34;
        e3.aR = 34;
        e3.aq = new int[1];
        e3.I = new int[1];
        e3.aq[0] = 2;
        e3.I[0] = n5 + 1;
        e3.X = new int[1][3];
        e3.X[0][0] = 2;
        e3.X[0][1] = 5;
        e3.X[0][2] = 0;
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, String string) {
        e e2 = rs.n.e.d(n2);
        e2.E = rs.n.e.d(n3, "");
        e2.aG = rs.n.e.d(n3, "a");
        e2.I = new int[1];
        e2.I[0] = 1;
        e2.aq = new int[1];
        e2.aq[0] = 1;
        e2.X = new int[1][3];
        e2.X[0][0] = 5;
        e2.X[0][1] = n4;
        e2.X[0][2] = 0;
        e2.M = 4;
        e2.P = n5;
        e2.ab = -1;
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 5;
        e2.aR = n6;
        e2.Q = string;
    }

    public static void g(int n2) {
        e e2 = rs.n.e.H[n2] = new e();
    }

    public static void b(int n2, int n3, int n4, int n5, e e2) {
        e2.al[n5] = n2;
        e2.am[n5] = n3;
        e2.bc[n5] = n4;
    }

    public static void a(int n2, k_0[] k_0Array, int n3) {
        e e2 = H[n2];
        e2.ao = k_0Array[n3];
    }

    protected static void c(int n2, String string) {
        e e2 = H[n2];
        e2.Q = "Activate@or2@ " + string;
    }

    public static void a(int n2, int n3, int n4, String string) {
        e e2 = rs.n.e.j(n2);
        e2.aw = n2;
        e2.ah = 5608;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = n3;
        e2.aG = rs.n.e.j(0, "tabs/prayer/hover/PRAYERH");
        e2.E = rs.n.e.j(0, "tabs/prayer/hover/PRAYERH");
        e2.P = 34;
        e2.aR = 34;
        e2 = rs.n.e.j(n3);
        e2.aw = n3;
        e2.ah = 5608;
        e2.aI = 0;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = -1;
        e2.P = 512;
        e2.aR = 334;
        e2.aQ = true;
        rs.n.e.a(n3 + 1, 0, false, 0, string);
        rs.n.e.a(1, e2);
        rs.n.e.b(n3 + 1, 0, 0, 0, e2);
    }

    public static void h(int n2) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 6;
        e2.M = 0;
        e2.J = 328;
        e2.P = 136;
        e2.aR = 168;
        e2.aC = 0;
        e2.ab = 0;
        e2.aT = 560;
        e2.aU = 150;
        e2.aV = 0;
        e2.aD = -1;
        e2.aE = -1;
    }

    public static void b(int n2, int n3, int n4, String string) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.E = rs.n.e.a(n3, u, string);
        e2.aG = rs.n.e.a(n4, u, string);
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 5;
    }

    public void a(int n2, k_0[] k_0Array) {
        rs.n.e.a(n2 - 12, 7587, -1, 150, 26, "Use @gre@Special Attack");
        for (int i2 = n2 - 11; i2 < n2; ++i2) {
            rs.n.e.g(i2);
        }
        e e2 = H[n2 - 12];
        e2.P = 150;
        e2.aR = 26;
        e2.ab = 40005;
        e2 = H[n2];
        e2.P = 150;
        e2.aR = 26;
        e2.b(0, n2 - 12, 0, 0);
        e2.b(12, n2 + 1, 3, 7);
        e2.b(23, n2 + 12, 16, 8);
        int n3 = 13;
        while (n3 < 23) {
            int n4 = n3++;
            e2.bc[n4] = e2.bc[n4] - 1;
        }
        e2 = H[n2 + 1];
        e2.aI = 5;
        e2.E = rs.n.e.d(7600, "");
        for (n3 = n2 + 2; n3 < n2 + 12; ++n3) {
            e2 = H[n3];
            e2.aI = 5;
        }
        rs.n.e.c(n2 + 2, 7601);
        rs.n.e.c(n2 + 3, 7602);
        rs.n.e.c(n2 + 4, 7603);
        rs.n.e.c(n2 + 5, 7604);
        rs.n.e.c(n2 + 6, 7605);
        rs.n.e.c(n2 + 7, 7606);
        rs.n.e.c(n2 + 8, 7607);
        rs.n.e.c(n2 + 9, 7608);
        rs.n.e.c(n2 + 10, 7609);
        rs.n.e.c(n2 + 11, 7610);
        e2 = rs.n.e.d(40005);
        e2.aQ = true;
        e2.aI = 0;
        e2.M = 0;
        e2.ab = -1;
        e2.ah = 40005;
        e2.aw = 40005;
        rs.n.e.a(40006, 0, false, 0, "Select to perform a special\nattack.");
        rs.n.e.a(1, e2);
        rs.n.e.b(40006, 0, 0, 0, e2);
    }

    public static void a(int n2, int n3, String string, k_0[] k_0Array) {
        e e2 = H[n2];
        e2.ab = n3;
        e2 = rs.n.e.d(n3);
        e2.aQ = true;
        e2.aI = 0;
        e2.M = 0;
        e2.ab = -1;
        e2.ah = n3;
        e2.aw = n3;
        rs.n.e.a(n3 + 1, 0, false, 0, string);
        rs.n.e.a(1, e2);
        rs.n.e.b(n3 + 1, 0, 0, 0, e2);
    }

    public static void b(int n2, String string, k_0[] k_0Array, int n3, int n4, boolean bl) {
        e e2 = rs.n.e.H[n2] = new e();
        if (bl) {
            e2.S = true;
        }
        e2.aS = true;
        e2.ao = k_0Array[n3];
        e2.at = string;
        e2.ad = n4;
        e2.aw = n2;
        e2.aI = 4;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, String string, int n7, int n8, int n9, String string2, k_0[] k_0Array) {
        e e2 = rs.n.e.d(n2);
        e2.E = rs.n.e.d(n3, "");
        e2.aG = rs.n.e.d(n3, "a");
        e2.aq = new int[1];
        e2.aq[0] = 1;
        e2.I = new int[1];
        e2.I[0] = 1;
        e2.X = new int[1][3];
        e2.X[0][0] = 5;
        e2.X[0][1] = n4;
        e2.X[0][2] = 0;
        e2.M = 4;
        e2.P = n5;
        e2.ab = n7;
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 5;
        e2.aR = n6;
        e2.Q = string;
        e2 = rs.n.e.d(n7);
        e2.aQ = true;
        e2.aI = 0;
        e2.M = 0;
        e2.ab = -1;
        e2.ah = n7;
        e2.aw = n7;
    }

    public static void a(int n2, int n3, boolean bl, int n4, String string) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 9;
        e2.aC = (byte)n3;
        e2.Y = bl;
        e2.ab = -1;
        e2.M = 0;
        e2.J = 0;
        e2.ad = n4;
        e2.at = string;
    }

    public static void a(int n2, e e2) {
        e2.al = new int[n2];
        e2.am = new int[n2];
        e2.bc = new int[n2];
    }

    protected static rs.l.f_0 d(int n2, String string) {
        long l2 = (o_0.b(string) << 8) + (long)n2;
        rs.l.f_0 f_02 = (rs.l.f_0)b.a(l2);
        if (f_02 != null) {
            return f_02;
        }
        try {
            f_02 = new rs.l.f_0("/Attack/" + n2 + string);
            b.a(f_02, l2);
        }
        catch (Exception exception) {
            return null;
        }
        return f_02;
    }

    public static void e(int n2, String string) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 9;
        e2.at = string;
    }

    public static void f(int n2, String string) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.aI = 0;
        e2.aQ = true;
        e2.ab = -1;
        rs.n.e.e(n2 + 1, string);
        e2.k(1);
        e2.b(0, n2 + 1, 0, 0);
    }

    public static void c(int n2, String string, k_0[] k_0Array, int n3, int n4, boolean bl) {
        e e2 = rs.n.e.j(n2);
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 4;
        e2.M = 0;
        e2.P = 0;
        e2.aR = 11;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = -1;
        e2.U = true;
        e2.aS = bl;
        e2.ao = k_0Array[n3];
        e2.at = string;
        e2.Z = "";
        e2.ad = n4;
        e2.O = 0;
        e2.L = 0;
        e2.ak = 0;
    }

    public static void a(int n2, String string, int n3, boolean bl, boolean bl2, int n4, k_0[] k_0Array, int n5) {
        e e2 = rs.n.e.d(n2);
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 4;
        e2.M = 0;
        e2.P = 0;
        e2.aR = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = n4;
        e2.S = bl;
        e2.aS = bl2;
        e2.ao = k_0Array[n5];
        e2.at = string;
        e2.Z = "";
        e2.ad = n3;
    }

    public static void d(int n2, int n3, int n4) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 1;
        e2.J = 0;
        e2.P = 20;
        e2.aR = 20;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = rs.n.e.j(n3, "Equipment/SPRITE");
        e2.aG = rs.n.e.j(n4, "Equipment/SPRITE");
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, String string, int n7, int n8, String string2) {
        e e2 = rs.n.e.d(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = n3;
        e2.J = n4;
        e2.ab = n5;
        e2.E = rs.n.e.j(n6, string);
        e2.aG = rs.n.e.j(n6, string);
        e2.P = n7;
        e2.aR = n8;
        e2.Q = string2;
    }

    public static void a(int n2, int n3, String string, int n4, int n5, int n6) {
        e e2 = rs.n.e.d(n2);
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 0;
        e2.M = 0;
        e2.P = n4;
        e2.aR = n5;
        e2.aQ = true;
        e2.ab = -1;
        rs.n.e.c(n6, n3, string);
        rs.n.e.a(1, e2);
        rs.n.e.b(n6, 0, 0, 0, e2);
    }

    public static void a(int n2, String string, k_0[] k_0Array, int n3, int n4, boolean bl, boolean bl2) {
        e e2 = rs.n.e.j(n2);
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 4;
        e2.M = 0;
        e2.P = 0;
        e2.aR = 11;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = -1;
        e2.S = bl;
        e2.aS = bl2;
        e2.ao = k_0Array[n3];
        e2.at = string;
        e2.Z = "";
        e2.ad = n4;
        e2.O = 0;
        e2.L = 0;
        e2.ak = 0;
    }

    public e e() {
        this.ay = new String[this.az.length];
        return this;
    }

    public static void a(int n2, String string, k_0[] k_0Array, k_0 k_02, int n3, boolean bl, boolean bl2) {
        e e2 = rs.n.e.j(n2);
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 4;
        e2.M = 0;
        e2.P = 0;
        e2.aR = 11;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = -1;
        e2.S = bl;
        e2.aS = bl2;
        e2.ao = k_02;
        e2.at = string;
        e2.Z = "";
        e2.ad = n3;
        e2.O = 0;
        e2.L = 0;
        e2.ak = 0;
    }

    public static void g(int n2, String string) {
        e e2 = H[n2];
        e2.aw = n2;
        e2.ah = n2;
        e2.aQ = true;
        e2.aI = 8;
        e2.k = string;
    }

    public static void a(int n2, int n3, String string, String string2) {
        string = string.toLowerCase();
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.l = true;
        e2.M = 1;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        if (string.equalsIgnoreCase("fountain/sprite") && n3 == 1) {
            e2.E = ad_0.c;
            e2.aG = ad_0.c;
        } else {
            e2.E = rs.n.e.j(n3, string);
            e2.aG = rs.n.e.j(n3, string);
        }
        e2.P = e2.E.n;
        e2.aR = e2.aG.o;
        e2.Q = string2;
    }

    public static e b(int n2, int n3, String string, String string2) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 1;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = rs.n.e.j(n3, string);
        e2.aG = rs.n.e.j(n3, string);
        e2.P = e2.E.n;
        e2.aR = e2.aG.o;
        e2.Q = string2;
        return e2;
    }

    public static void a(int n2, String string, String string2) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 1;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = new rs.l.f_0(false, string);
        e2.aG = new rs.l.f_0(false, string);
        e2.P = e2.E.n;
        e2.aR = e2.aG.o;
        e2.Q = string2;
    }

    public e a(String string) {
        this.aG = new rs.l.f_0(false, string);
        this.bz = true;
        return this;
    }

    public static void c(int n2, int n3, String string) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = rs.n.e.j(n3, string);
        e2.aG = rs.n.e.j(n3, string);
        e2.P = 512;
        e2.aR = 334;
    }

    public void f() {
        this.bp = true;
        this.P = 765;
        this.aR = 503;
    }

    public static void h(int n2, String string) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = new rs.l.f_0(false, string);
        e2.aG = new rs.l.f_0(false, string);
        e2.P = 512;
        e2.aR = 334;
    }

    public static void i(int n2, String string) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = new rs.l.f_0(false, string);
        e2.aG = new rs.l.f_0(false, string);
        e2.E.j = true;
        e2.aG.j = true;
        e2.P = 512;
        e2.aR = 334;
    }

    public static void a(int n2, String string, int n3, int n4, int n5, String string2, int n6, int n7, int n8) {
        e e2 = rs.n.e.j(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = n8;
        e2.J = n6;
        e2.aC = 0;
        e2.ab = n7;
        e2.E = rs.n.e.j(n3, string);
        e2.aG = rs.n.e.j(n3, string);
        e2.P = n4;
        e2.aR = n5;
        e2.Q = string2;
    }

    public static void a(int n2, String string, int n3, int n4, int n5, int n6) {
        e e2 = rs.n.e.j(n2);
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 0;
        e2.M = 0;
        e2.P = n4;
        e2.aR = n5;
        e2.aQ = true;
        e2.aC = 0;
        e2.ab = -1;
        e2.aH = 0;
        rs.n.e.c(n6, n3, n3, string);
        e2.k(1);
        e2.b(0, n6, 0, 0);
    }

    public static void c(int n2, int n3, int n4, String string) {
        e e2 = rs.n.e.j(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.P = 512;
        e2.aR = 334;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = rs.n.e.j(n3, string);
        e2.aG = rs.n.e.j(n4, string);
    }

    public static void d(int n2, int n3, String string) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = 52;
        e2.E = rs.n.e.j(n3, string);
        e2.aG = rs.n.e.j(n3, string);
        e2.P = 512;
        e2.aR = 334;
        e2.v = true;
    }

    public static e i(int n2) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 0;
        e2.M = 0;
        e2.J = 0;
        e2.P = 512;
        e2.aR = 334;
        e2.aC = 0;
        e2.ab = 0;
        return e2;
    }

    public static e j(int n2) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 0;
        e2.M = 0;
        e2.J = 0;
        e2.P = 512;
        e2.aR = 700;
        e2.aC = 0;
        e2.ab = -1;
        return e2;
    }

    public static e a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        e e2 = rs.n.e.H[n2] = new e();
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 15;
        e2.M = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = -1;
        e2.P = n3;
        e2.aR = n4;
        e2.B = n5;
        e2.A = n6;
        e2.x = n7;
        e2.y = n8;
        e2.z = n9;
        return e2;
    }

    public static e e(int n2, int n3, int n4) {
        return rs.n.e.a(n2, n3, n4, 1, 1, 0x797979, 0xFFC000, 65280);
    }

    public static rs.l.f_0 j(int n2, String string) {
        return rs.n.e.a(n2, string, false);
    }

    public static rs.l.f_0 a(int n2, String string, boolean bl) {
        f_0 f_02;
        if (string == null) {
            return null;
        }
        long l2 = (o_0.b(string) << 8) + (long)n2;
        rs.l.f_0 f_03 = null;
        f_0 f_04 = f_02 = bl ? b : c;
        if (c != null && f_03 == null) {
            f_03 = (rs.l.f_0)f_02.a(l2);
        }
        if (b != null && f_03 == null) {
            f_03 = (rs.l.f_0)f_02.a(l2);
        }
        if (f_03 != null) {
            return f_03;
        }
        try {
            f_03 = bl ? (string.endsWith("/") ? new rs.l.f_0(string + n2) : new rs.l.f_0(string + " " + n2)) : (string.endsWith("/") ? new rs.l.f_0(false, string + n2) : new rs.l.f_0(false, string + " " + n2));
            if (f_02 != null) {
                f_02.a(f_03, l2);
            }
        }
        catch (Exception exception) {
            return null;
        }
        return f_03;
    }

    public void g() {
        if (this.E != null && !this.E.i) {
            this.E.c();
        }
        if (this.aG != null && !this.aG.i) {
            this.aG.c();
        }
    }

    public void b(int n2, int n3, int n4, int n5) {
        this.al[n2] = n3;
        this.am[n2] = n4;
        this.bc[n2] = n5;
    }

    public void c(int n2, int n3, int n4, int n5) {
        this.al[n2] = n3;
        this.am[n2] = n4;
        this.bc[n2] = n5 - 19;
    }

    public void k(int n2) {
        this.al = new int[n2];
        this.am = new int[n2];
        this.bc = new int[n2];
    }

    private h g(int n2, int n3) {
        h h2 = (h)aO.a(((long)n2 << 16) + (long)n3);
        if (h2 != null) {
            return h2;
        }
        if (n2 == 1) {
            h2 = rs.a.h.e(n3);
        }
        if (n2 == 2) {
            h2 = rs.d.d.c(n3).b();
        }
        if (n2 == 3) {
            h2 = Client.eR.n();
        }
        if (n2 == 4) {
            h2 = rs.d.k.f(n3).i(50);
        }
        if (n2 == 5) {
            h2 = null;
        }
        if (n2 == 10) {
            h2 = rs.d.d.c(n3).a();
        }
        if (h2 != null) {
            aO.a(h2, (n2 << 16) + n3);
        }
        return h2;
    }

    private static rs.l.f_0 a(int n2, f f2, String string) {
        long l2 = (o_0.b(string) << 8) + (long)n2;
        rs.l.f_0 f_02 = (rs.l.f_0)b.a(l2);
        if (f_02 != null) {
            return f_02;
        }
        try {
            f_02 = new rs.l.f_0(f2, string, n2);
            b.a(f_02, l2);
        }
        catch (Exception exception) {
            return null;
        }
        return f_02;
    }

    public static void a(boolean bl, h h2) {
        int n2 = 0;
        int n3 = 5;
        if (bl) {
            return;
        }
        aO.a();
        if (h2 != null && n3 != 4) {
            aO.a(h2, (n3 << 16) + n2);
        }
    }

    public static void a(int n2, String string, String string2, int n3, int n4, boolean bl, boolean bl2, int n5, int n6) {
        try {
            e e2 = rs.n.e.j(n2);
            e2.ah = n2;
            e2.aw = n2;
            e2.aI = 4;
            e2.M = 0;
            e2.P = 0;
            e2.aR = 0;
            e2.J = 0;
            e2.aC = 0;
            e2.bj = n5;
            e2.S = bl;
            e2.bm = bl2;
            e2.ao = Client.bk[n6];
            e2.at = string;
            e2.Z = string2;
            e2.bd = n3;
            e2.ad = n4;
            e2.O = n4;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public h a(int n2, int n3, boolean bl, int n4, int n5) {
        Object object;
        h h2 = bl ? this.g(this.d, this.e) : this.g(this.ae, this.af);
        if (h2 == null) {
            return null;
        }
        if (n3 == -1 && n2 == -1 && h2.ar == null) {
            return h2;
        }
        h h3 = null;
        if (n4 > 0 && rs.d.a.a[n4].b()) {
            h3 = n5 > 0 && n5 != n4 ? rs.d.a.a[n4].a(h2, n3, rs.d.a.a[n5], n2) : rs.d.a.a[n4].a(h2, n3);
        } else {
            h3 = new h(true, rs.k.g(n3) & rs.k.g(n2), false, h2);
            if (n3 != -1 || n2 != -1) {
                h3.n();
            }
            if (n3 != -1) {
                h3.f(n3, n4);
            }
            if (n2 != -1) {
                h3.f(n2, n5);
            }
        }
        if (this.af == 4907) {
            if (h3 != null && h3.ar != null) {
                try {
                    h3.b(84, 1000, -90, -580, -90, true);
                }
                catch (Exception exception) {}
            }
        } else {
            if (this.aN > 0 && (object = rs.d.k.f(this.aN)) != null) {
                boolean bl2 = ((rs.d.k)object).U;
                ((rs.d.k)object).U = true;
                try {
                    rs.d.k.a((rs.d.k)object, this.aN);
                    h h4 = ((rs.d.k)object).h(this.bq);
                    return h4;
                }
                finally {
                    ((rs.d.k)object).U = bl2;
                }
            }
            e_0.h = true;
            h3.b(64, 768, -50, -10, -50, true);
            e_0.h = false;
        }
        if (this.aW != 128 || this.aX != 128) {
            h3.b(this.aW, this.aW, this.aW);
        }
        if (this.aY && h3 != null) {
            object = (rs.runelite.a.d)n.a(this.af);
            if (object == null) {
                h3.m();
                object = new rs.runelite.a.d();
                ((rs.runelite.a.d)object).f = h3.az;
                ((rs.runelite.a.d)object).i = h3.aA;
                ((rs.runelite.a.d)object).g = h3.g;
                ((rs.runelite.a.d)object).j = h3.aE;
                ((rs.runelite.a.d)object).h = h3.aC;
                ((rs.runelite.a.d)object).k = h3.aB;
                ((rs.runelite.a.d)object).l = h3.aG;
                ((rs.runelite.a.d)object).m = h3.aF;
            }
            h3.g = ((rs.runelite.a.d)object).g;
            h3.aE = ((rs.runelite.a.d)object).j;
            h3.aA = ((rs.runelite.a.d)object).i;
            h3.az = ((rs.runelite.a.d)object).f;
            h3.aB = ((rs.runelite.a.d)object).k;
            h3.aC = ((rs.runelite.a.d)object).h;
            h3.aF = ((rs.runelite.a.d)object).m;
            h3.aG = ((rs.runelite.a.d)object).l;
            n.a((a)object, this.af);
        }
        return h3;
    }

    public void f(int n2, int n3) {
    }

    public static e l(int n2) {
        return H[n2];
    }

    static {
        aO = new f_0(30);
    }
}

