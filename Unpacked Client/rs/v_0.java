/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.Client;
import rs.a.a;
import rs.c_0;
import rs.d.h;
import rs.f.a;
import rs.g_0;
import rs.gui.Launcher;
import rs.h_0;
import rs.i_0;
import rs.j_0;
import rs.k.e;
import rs.l;
import rs.l.c;
import rs.l.e_0;
import rs.m;
import rs.n;
import rs.q_0;
import rs.s_0;
import rs.t_0;
import rs.u_0;

/*
 * Renamed from rs.V
 */
public final class v_0 {
    public static final int a = 7;
    public static final int b = 128;
    private static final int v = 128;
    private static final int w = 383;
    public static int c = 50;
    public static int d;
    public static int e;
    public static int f;
    public static boolean g;
    private boolean x;
    public static boolean h;
    private final int y;
    private final int z;
    private final int A;
    private final int[][][] B;
    public final h_0[][][] i;
    private int C;
    private int D;
    private final l[] E;
    private final l[] F;
    private final int[][][] G;
    private static int H;
    private static int I;
    private static int J;
    private static int K;
    private static int L;
    private static int M;
    private static int N;
    private static int O;
    private static int P;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    private static l[] Q;
    private static final int[] R;
    private static final int[] S;
    private static final int[] T;
    private static final int[] U;
    private static boolean V;
    private static int W;
    private static int X;
    public static boolean q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    private static final int Y;
    private static int[] Z;
    private static g_0[][] aa;
    private static int ab;
    private static final g_0[] ac;
    private static rs.h ad;
    private static final int[] ae;
    private static final int[] af;
    private static final int[] ag;
    private static final int[] ah;
    private static final int[] ai;
    private static final int[] aj;
    private static final int[] ak;
    private static final int[] al;
    private final int[] am;
    private final int[] an;
    private int ao;
    private final int[][] ap = new int[][]{new int[16], {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
    private final int[][] aq = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
    private static boolean[][][][] ar;
    private static boolean[][] as;
    private static int at;
    private static int au;
    private static int av;
    private static int aw;
    private static int ax;
    private static int ay;

    public static void a(boolean bl) {
        int n2;
        if (bl) {
            e = rs.k.e.a() ? 50 : d;
            f = 350;
            rs.a.h.j = 30000;
            c_0.he = 3000;
            c_0.hf = 1500;
        } else {
            e = d;
            f = 2000;
            rs.a.h.j = 3500;
            c_0.he = 1500;
            c_0.hf = 900;
        }
        int n3 = n2 = rs.f.a.ai == a.c.a ? c_0.he : c_0.hf;
        if (Client.al > n2) {
            Client.al = n2;
        }
    }

    public v_0(int[][][] nArray) {
        int n2 = 104;
        int n3 = 104;
        int n4 = 4;
        this.x = true;
        this.E = new l[5000];
        this.F = new l[5000];
        this.am = new int[10000];
        this.an = new int[10000];
        this.y = n4;
        this.z = n3;
        this.A = n2;
        this.i = new h_0[n4][n3][n2];
        this.G = new int[n4][n3 + 1][n2 + 1];
        this.B = nArray;
        this.b();
    }

    public static void a() {
        Q = null;
        Z = null;
        aa = null;
        ad = null;
        ar = null;
        as = null;
    }

    public void b() {
        int n2;
        int n3;
        for (n3 = 0; n3 < this.y; ++n3) {
            for (n2 = 0; n2 < this.z; ++n2) {
                for (int i2 = 0; i2 < this.A; ++i2) {
                    this.i[n3][n2][i2] = null;
                }
            }
        }
        for (n3 = 0; n3 < Y; ++n3) {
            for (n2 = 0; n2 < Z[n3]; ++n2) {
                v_0.aa[n3][n2] = null;
            }
            v_0.Z[n3] = 0;
        }
        for (n3 = 0; n3 < this.D; ++n3) {
            this.E[n3] = null;
            this.F[n3] = null;
        }
        this.D = 0;
        for (n3 = 0; n3 < Q.length; ++n3) {
            v_0.Q[n3] = null;
        }
    }

    public void a(int n2) {
        this.C = n2;
        for (int i2 = 0; i2 < this.z; ++i2) {
            for (int i3 = 0; i3 < this.A; ++i3) {
                if (this.i[n2][i2][i3] != null) continue;
                this.i[n2][i2][i3] = new h_0(n2, i2, i3);
            }
        }
    }

    public void a(int n2, int n3) {
        h_0 h_02 = this.i[0][n3][n2];
        for (int i2 = 0; i2 < 3; ++i2) {
            this.i[i2][n3][n2] = this.i[i2 + 1][n3][n2];
            h_0 h_03 = this.i[i2][n3][n2];
            if (h_03 == null) continue;
            --h_03.a;
            for (int i3 = 0; i3 < h_03.n; ++i3) {
                l l2 = h_03.o[i3];
                if ((l2.m >> 29 & 3) != 2 || l2.f != n3 || l2.h != n2) continue;
                --l2.b;
            }
        }
        if (this.i[0][n3][n2] == null) {
            this.i[0][n3][n2] = new h_0(0, n3, n2);
        }
        this.i[0][n3][n2].A = h_02;
        this.i[3][n3][n2] = null;
    }

    public h_0[][][] c() {
        return this.i;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        g_0 g_02 = new g_0();
        g_02.a = n3 / 128;
        g_02.b = n5 / 128;
        g_02.c = n8 / 128;
        g_02.d = n6 / 128;
        g_02.e = n9;
        g_02.f = n3;
        g_02.g = n5;
        g_02.h = n8;
        g_02.i = n6;
        g_02.j = n7;
        g_02.k = n4;
        int n10 = n2;
        int n11 = Z[n10];
        Z[n10] = n11 + 1;
        v_0.aa[n2][n11] = g_02;
    }

    public void a(int n2, int n3, int n4, int n5) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 != null) {
            this.i[n2][n3][n4].r = n5;
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21) {
        if (n5 == 0) {
            j_0 j_02 = new j_0(n12, n13, n14, n15, -1, n20, false);
            for (int i2 = n2; i2 >= 0; --i2) {
                if (this.i[i2][n3][n4] != null) continue;
                this.i[i2][n3][n4] = new h_0(i2, n3, n4);
            }
            this.i[n2][n3][n4].h = j_02;
            return;
        }
        if (n5 == 1) {
            j_0 j_03 = new j_0(n16, n17, n18, n19, n7, n21, n8 == n9 && n8 == n10 && n8 == n11);
            for (int i3 = n2; i3 >= 0; --i3) {
                if (this.i[i3][n3][n4] != null) continue;
                this.i[i3][n3][n4] = new h_0(i3, n3, n4);
            }
            this.i[n2][n3][n4].h = j_03;
            return;
        }
        i_0 i_02 = new i_0(n4, n16, n15, n10, n7, n18, n6, n12, n20, n14, n11, n9, n8, n5, n19, n17, n13, n3, n21);
        for (int i4 = n2; i4 >= 0; --i4) {
            if (this.i[i4][n3][n4] != null) continue;
            this.i[i4][n3][n4] = new h_0(i4, n3, n4);
        }
        this.i[n2][n3][n4].i = i_02;
    }

    public void a(int n2, int n3, int n4, a a2, byte by, int n5, int n6, int n7) {
        if (a2 == null) {
            return;
        }
        m m2 = new m();
        m2.c = a2;
        m2.n = n6 * 128 + 64;
        m2.o = n4 * 128 + 64;
        m2.b = n3;
        m2.m = n5;
        m2.d = by;
        m2.a = n7;
        if (this.i[n2][n6][n4] == null) {
            this.i[n2][n6][n4] = new h_0(n2, n6, n4);
        }
        this.i[n2][n6][n4].l = m2;
    }

    public void a(int n2, a a2, int n3, int n4, byte by, int n5, a a3, int n6, int n7, int n8, int n9) {
        if (a2 == null && a3 == null) {
            return;
        }
        u_0 u_02 = new u_0();
        u_02.m = n3;
        u_02.h = by;
        u_02.n = n5 * 128 + 64;
        u_02.o = n4 * 128 + 64;
        u_02.c = n6;
        u_02.f = a2;
        u_02.g = a3;
        u_02.d = n2;
        u_02.e = n7;
        u_02.b = n9;
        for (int i2 = n8; i2 >= 0; --i2) {
            if (this.i[i2][n5][n4] != null) continue;
            this.i[i2][n5][n4] = new h_0(i2, n5, n4);
        }
        this.i[n8][n5][n4].j = u_02;
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, a a2, int n8, byte by, int n9, int n10, int n11) {
        if (a2 == null) {
            return;
        }
        t_0 t_02 = new t_0();
        t_02.m = n2;
        t_02.f = by;
        t_02.n = n8 * 128 + 64 + n6;
        t_02.o = n3 * 128 + 64 + n9;
        t_02.b = n7;
        t_02.e = a2;
        t_02.c = n10;
        t_02.d = n4;
        t_02.a = n11;
        for (int i2 = n5; i2 >= 0; --i2) {
            if (this.i[i2][n8][n3] != null) continue;
            this.i[i2][n8][n3] = new h_0(i2, n8, n3);
        }
        this.i[n5][n8][n3].k = t_02;
    }

    public boolean a(int n2, byte by, int n3, int n4, a a2, int n5, int n6, int n7, int n8, int n9, int n10) {
        if (a2 == null) {
            return true;
        }
        int n11 = n9 * 128 + 64 * n5;
        int n12 = n8 * 128 + 64 * n4;
        return this.a(n6, n9, n8, n5, n4, n11, n12, n3, a2, n7, false, n2, by, n10);
    }

    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, a a2, boolean bl) {
        if (a2 == null) {
            return true;
        }
        int n9 = n8 - n7;
        int n10 = n6 - n7;
        int n11 = n8 + n7;
        int n12 = n6 + n7;
        if (bl) {
            if (n3 > 640 && n3 < 1408) {
                n12 += 128;
            }
            if (n3 > 1152 && n3 < 1920) {
                n11 += 128;
            }
            if (n3 > 1664 || n3 < 384) {
                n10 -= 128;
            }
            if (n3 > 128 && n3 < 896) {
                n9 -= 128;
            }
        }
        return this.a(n2, n9 /= 128, n10 /= 128, (n11 /= 128) - n9 + 1, (n12 /= 128) - n10 + 1, n8, n6, n4, a2, n3, true, n5, (byte)0, 0);
    }

    public boolean a(int n2, int n3, a a2, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        return a2 == null || this.a(n2, n8, n11, n9 - n8 + 1, n5 - n11 + 1, n6, n3, n7, a2, n4, true, n10, (byte)0, 0);
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, a a2, int n10, boolean bl, int n11, byte by, int n12) {
        int n13;
        for (int i2 = n3; i2 < n3 + n5; ++i2) {
            for (n13 = n4; n13 < n4 + n6; ++n13) {
                if (i2 < 0 || n13 < 0 || i2 >= this.z || n13 >= this.A) {
                    return false;
                }
                h_0 h_02 = this.i[n2][i2][n13];
                if (h_02 == null || h_02.n < 5) continue;
                return false;
            }
        }
        l l2 = null;
        if (bl && this.F[this.D] != null) {
            l2 = this.F[this.D];
        }
        if (l2 == null) {
            l2 = new l();
        }
        l2.m = n11;
        l2.l = by;
        l2.b = n2;
        l2.n = n7;
        l2.o = n8;
        l2.c = n9;
        l2.d = a2;
        l2.e = n10;
        l2.f = n3;
        l2.h = n4;
        l2.g = n3 + n5 - 1;
        l2.i = n4 + n6 - 1;
        l2.a = n12;
        for (n13 = n3; n13 < n3 + n5; ++n13) {
            for (int i3 = n4; i3 < n4 + n6; ++i3) {
                int n14 = 0;
                if (n13 > n3) {
                    ++n14;
                }
                if (n13 < n3 + n5 - 1) {
                    n14 += 4;
                }
                if (i3 > n4) {
                    n14 += 8;
                }
                if (i3 < n4 + n6 - 1) {
                    n14 += 2;
                }
                for (int i4 = n2; i4 >= 0; --i4) {
                    if (this.i[i4][n13][i3] != null) continue;
                    this.i[i4][n13][i3] = new h_0(i4, n13, i3);
                }
                h_0 h_03 = this.i[n2][n13][i3];
                h_03.o[h_03.n] = l2;
                h_03.p[h_03.n] = n14;
                h_03.q |= n14;
                ++h_03.n;
            }
        }
        if (bl) {
            this.E[this.D++] = l2;
        }
        return true;
    }

    public int a(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 == null || h_02.j == null) {
            return 0;
        }
        return h_02.j.m;
    }

    public int b(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 == null || h_02.j == null) {
            return 0;
        }
        return h_02.j.b;
    }

    public int c(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 == null || h_02.k == null) {
            return 0;
        }
        return h_02.k.m;
    }

    public int d(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 == null || h_02.k == null) {
            return 0;
        }
        return h_02.k.a;
    }

    public int e(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 == null) {
            return 0;
        }
        for (int i2 = 0; i2 < h_02.n; ++i2) {
            l l2 = h_02.o[i2];
            if ((l2.m >> 29 & 3) != 2 || l2.f != n3 || l2.h != n4) continue;
            return l2.m;
        }
        return 0;
    }

    public int f(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 == null) {
            return 0;
        }
        for (int i2 = 0; i2 < h_02.n; ++i2) {
            l l2 = h_02.o[i2];
            if ((l2.m >> 29 & 3) != 2 || l2.f != n3 || l2.h != n4) continue;
            return l2.a;
        }
        return 0;
    }

    public int g(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 == null || h_02.l == null) {
            return 0;
        }
        return h_02.l.m;
    }

    public int h(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 == null || h_02.l == null) {
            return 0;
        }
        return h_02.l.a;
    }

    public int b(int n2, int n3, int n4, int n5) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 == null) {
            return -1;
        }
        if (h_02.j != null && h_02.j.m == n5) {
            return h_02.j.h & 0xFF;
        }
        if (h_02.k != null && h_02.k.m == n5) {
            return h_02.k.f & 0xFF;
        }
        if (h_02.l != null && h_02.l.m == n5) {
            return h_02.l.d & 0xFF;
        }
        for (int i2 = 0; i2 < h_02.n; ++i2) {
            if (h_02.o[i2].m != n5) continue;
            return h_02.o[i2].l & 0xFF;
        }
        return -1;
    }

    public void a(int n2, int n3, int n4, a a2, byte by, int n5, int n6) {
        if (a2 == null) {
            return;
        }
        m m2 = new m();
        m2.c = a2;
        m2.n = n6 * 128 + 64;
        m2.o = n4 * 128 + 64;
        m2.b = n3;
        m2.m = n5;
        m2.d = by;
        if (this.i[n2][n6][n4] == null) {
            this.i[n2][n6][n4] = new h_0(n2, n6, n4);
        }
        this.i[n2][n6][n4].l = m2;
    }

    public void a(int n2, int n3, a a2, int n4, a a3, a a4, int n5, int n6) {
        n n7 = new n();
        n7.e = a4;
        n7.c = n2 * 128 + 64;
        n7.d = n6 * 128 + 64;
        n7.b = n4;
        n7.h = n3;
        n7.f = a2;
        n7.g = a3;
        int n8 = 0;
        h_0 h_02 = this.i[n5][n2][n6];
        if (h_02 != null) {
            for (int i2 = 0; i2 < h_02.n; ++i2) {
                int n9;
                if (!(h_02.o[i2].d instanceof rs.a.h) || (n9 = ((rs.a.h)h_02.o[i2].d).aH) <= n8) continue;
                n8 = n9;
            }
        }
        n7.i = n8;
        if (this.i[n5][n2][n6] == null) {
            this.i[n5][n2][n6] = new h_0(n5, n2, n6);
        }
        this.i[n5][n2][n6].m = n7;
    }

    public void a(int n2, a a2, int n3, int n4, byte by, int n5, a a3, int n6, int n7, int n8) {
        if (a2 == null && a3 == null) {
            return;
        }
        u_0 u_02 = new u_0();
        u_02.m = n3;
        u_02.h = by;
        u_02.n = n5 * 128 + 64;
        u_02.o = n4 * 128 + 64;
        u_02.c = n6;
        u_02.f = a2;
        u_02.g = a3;
        u_02.d = n2;
        u_02.e = n7;
        for (int i2 = n8; i2 >= 0; --i2) {
            if (this.i[i2][n5][n4] != null) continue;
            this.i[i2][n5][n4] = new h_0(i2, n5, n4);
        }
        this.i[n8][n5][n4].j = u_02;
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, a a2, int n8, byte by, int n9, int n10) {
        if (a2 == null) {
            return;
        }
        t_0 t_02 = new t_0();
        t_02.m = n2;
        t_02.f = by;
        t_02.n = n8 * 128 + 64 + n6;
        t_02.o = n3 * 128 + 64 + n9;
        t_02.b = n7;
        t_02.e = a2;
        t_02.c = n10;
        t_02.d = n4;
        for (int i2 = n5; i2 >= 0; --i2) {
            if (this.i[i2][n8][n3] != null) continue;
            this.i[i2][n8][n3] = new h_0(i2, n8, n3);
        }
        this.i[n5][n8][n3].k = t_02;
    }

    public boolean a(int n2, byte by, int n3, int n4, a a2, int n5, int n6, int n7, int n8, int n9) {
        if (a2 == null) {
            return true;
        }
        int n10 = n9 * 128 + 64 * n5;
        int n11 = n8 * 128 + 64 * n4;
        return this.a(n6, n9, n8, n5, n4, n10, n11, n3, a2, n7, false, n2, by);
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, a a2, int n10, boolean bl, int n11, byte by) {
        int n12;
        for (int i2 = n3; i2 < n3 + n5; ++i2) {
            for (n12 = n4; n12 < n4 + n6; ++n12) {
                if (i2 < 0 || n12 < 0 || i2 >= this.z || n12 >= this.A) {
                    return false;
                }
                h_0 h_02 = this.i[n2][i2][n12];
                if (h_02 == null || h_02.n < 5) continue;
                return false;
            }
        }
        l l2 = new l();
        l2.m = n11;
        l2.l = by;
        l2.b = n2;
        l2.n = n7;
        l2.o = n8;
        l2.c = n9;
        l2.d = a2;
        l2.e = n10;
        l2.f = n3;
        l2.h = n4;
        l2.g = n3 + n5 - 1;
        l2.i = n4 + n6 - 1;
        for (n12 = n3; n12 < n3 + n5; ++n12) {
            for (int i3 = n4; i3 < n4 + n6; ++i3) {
                int n13 = 0;
                if (n12 > n3) {
                    ++n13;
                }
                if (n12 < n3 + n5 - 1) {
                    n13 += 4;
                }
                if (i3 > n4) {
                    n13 += 8;
                }
                if (i3 < n4 + n6 - 1) {
                    n13 += 2;
                }
                for (int i4 = n2; i4 >= 0; --i4) {
                    if (this.i[i4][n12][i3] != null) continue;
                    this.i[i4][n12][i3] = new h_0(i4, n12, i3);
                }
                h_0 h_03 = this.i[n2][n12][i3];
                h_03.o[h_03.n] = l2;
                h_03.p[h_03.n] = n13;
                h_03.q |= n13;
                ++h_03.n;
            }
        }
        if (bl) {
            this.E[this.D++] = l2;
        }
        return true;
    }

    public void d() {
        for (int i2 = 0; i2 < this.D; ++i2) {
            l l2 = this.E[i2];
            this.a(l2);
            if (l2 != null) {
                l2.a = 0;
                l2.m = 0;
                l2.d = null;
                this.F[i2] = l2;
            }
            this.E[i2] = null;
        }
        this.D = 0;
    }

    private void a(l l2) {
        for (int i2 = l2.f; i2 <= l2.g; ++i2) {
            for (int i3 = l2.h; i3 <= l2.i; ++i3) {
                int n2;
                h_0 h_02 = this.i[l2.b][i2][i3];
                if (h_02 == null) continue;
                for (n2 = 0; n2 < h_02.n; ++n2) {
                    if (h_02.o[n2] != l2) continue;
                    --h_02.n;
                    for (int i4 = n2; i4 < h_02.n; ++i4) {
                        h_02.o[i4] = h_02.o[i4 + 1];
                        h_02.p[i4] = h_02.p[i4 + 1];
                    }
                    h_02.o[h_02.n] = null;
                    break;
                }
                h_02.q = 0;
                for (n2 = 0; n2 < h_02.n; ++n2) {
                    h_02.q |= h_02.p[n2];
                }
            }
        }
    }

    public void c(int n2, int n3, int n4, int n5) {
        h_0 h_02 = this.i[n5][n4][n2];
        if (h_02 == null) {
            return;
        }
        t_0 t_02 = h_02.k;
        if (t_02 != null) {
            int n6 = n4 * 128 + 64;
            int n7 = n2 * 128 + 64;
            t_02.n = n6 + (t_02.n - n6) * n3 / 16;
            t_02.o = n7 + (t_02.o - n7) * n3 / 16;
        }
    }

    public void a(int n2, int n3, int n4, byte by) {
        h_0 h_02 = this.i[n3][n2][n4];
        if (by != -119) {
            boolean bl = this.x = !this.x;
        }
        if (h_02 != null) {
            h_02.j = null;
        }
    }

    public void i(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n3][n4][n2];
        if (h_02 != null) {
            h_02.k = null;
        }
    }

    public void j(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 == null) {
            return;
        }
        for (int i2 = 0; i2 < h_02.n; ++i2) {
            l l2 = h_02.o[i2];
            if ((l2.m >> 29 & 3) != 2 || l2.f != n3 || l2.h != n4) continue;
            this.a(l2);
            return;
        }
    }

    public void k(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n4][n3];
        if (h_02 == null) {
            return;
        }
        h_02.l = null;
    }

    public void l(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 != null) {
            h_02.m = null;
        }
    }

    public u_0 m(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n2][n3][n4];
        if (h_02 == null) {
            return null;
        }
        return h_02.j;
    }

    public t_0 n(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n4][n2][n3];
        if (h_02 == null) {
            return null;
        }
        return h_02.k;
    }

    public l o(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n4][n2][n3];
        if (h_02 == null) {
            return null;
        }
        for (int i2 = 0; i2 < h_02.n; ++i2) {
            l l2 = h_02.o[i2];
            if ((l2.m >> 29 & 3) != 2 || l2.f != n2 || l2.h != n3) continue;
            return l2;
        }
        return null;
    }

    public m p(int n2, int n3, int n4) {
        h_0 h_02 = this.i[n4][n3][n2];
        if (h_02 == null || h_02.l == null) {
            return null;
        }
        return h_02.l;
    }

    public void q(int n2, int n3, int n4) {
        int n5 = 65;
        int n6 = 768;
        int n7 = (int)Math.sqrt(n3 * n3 + n2 * n2 + n4 * n4);
        int n8 = n6 * n7 >> 8;
        for (int i2 = 0; i2 < this.y; ++i2) {
            for (int i3 = 0; i3 < this.z; ++i3) {
                for (int i4 = 0; i4 < this.A; ++i4) {
                    h_0 h_02 = this.i[i2][i3][i4];
                    if (h_02 == null) continue;
                    u_0 u_02 = h_02.j;
                    if (u_02 != null && u_02.f != null && u_02.f.f != null) {
                        this.a(i2, 1, 1, i3, i4, (rs.a.h)u_02.f);
                        if (u_02.g != null && u_02.g.f != null) {
                            this.a(i2, 1, 1, i3, i4, (rs.a.h)u_02.g);
                            this.a((rs.a.h)u_02.f, (rs.a.h)u_02.g, 0, 0, 0, false);
                            ((rs.a.h)u_02.g).z = true;
                            ((rs.a.h)u_02.g).a(n5, n8, n3, n2, n4);
                        }
                        ((rs.a.h)u_02.f).z = true;
                        ((rs.a.h)u_02.f).a(n5, n8, n3, n2, n4);
                    }
                    for (int i5 = 0; i5 < h_02.n; ++i5) {
                        l l2 = h_02.o[i5];
                        if (l2 == null || l2.d == null || l2.d.f == null) continue;
                        this.a(i2, l2.g - l2.f + 1, l2.i - l2.h + 1, i3, i4, (rs.a.h)l2.d);
                        ((rs.a.h)l2.d).z = true;
                        ((rs.a.h)l2.d).a(n5, n8, n3, n2, n4);
                    }
                    m m2 = h_02.l;
                    if (m2 == null || m2.c.f == null) continue;
                    this.a(i3, i2, (rs.a.h)m2.c, i4);
                    ((rs.a.h)m2.c).z = true;
                    ((rs.a.h)m2.c).a(n5, n8, n3, n2, n4);
                }
            }
        }
    }

    private void a(int n2, int n3, rs.a.h h2, int n4) {
        h_0 h_02;
        if (n2 < this.z && (h_02 = this.i[n3][n2 + 1][n4]) != null && h_02.l != null && h_02.l.c.f != null) {
            this.a(h2, (rs.a.h)h_02.l.c, 128, 0, 0, true);
        }
        if (n4 < this.z && (h_02 = this.i[n3][n2][n4 + 1]) != null && h_02.l != null && h_02.l.c.f != null) {
            this.a(h2, (rs.a.h)h_02.l.c, 0, 0, 128, true);
        }
        if (n2 < this.z && n4 < this.A && (h_02 = this.i[n3][n2 + 1][n4 + 1]) != null && h_02.l != null && h_02.l.c.f != null) {
            this.a(h2, (rs.a.h)h_02.l.c, 128, 0, 128, true);
        }
        if (n2 < this.z && n4 > 0 && (h_02 = this.i[n3][n2 + 1][n4 - 1]) != null && h_02.l != null && h_02.l.c.f != null) {
            this.a(h2, (rs.a.h)h_02.l.c, 128, 0, -128, true);
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6, rs.a.h h2) {
        boolean bl = true;
        int n7 = n5;
        int n8 = n5 + n3;
        int n9 = n6 - 1;
        int n10 = n6 + n4;
        for (int i2 = n2; i2 <= n2 + 1; ++i2) {
            if (i2 == this.y) continue;
            for (int i3 = n7; i3 <= n8; ++i3) {
                if (i3 < 0 || i3 >= this.z) continue;
                for (int i4 = n9; i4 <= n10; ++i4) {
                    h_0 h_02;
                    if (i4 < 0 || i4 >= this.A || bl && i3 < n8 && i4 < n10 && (i4 >= n6 || i3 == n5) || (h_02 = this.i[i2][i3][i4]) == null) continue;
                    int n11 = (this.B[i2][i3][i4] + this.B[i2][i3 + 1][i4] + this.B[i2][i3][i4 + 1] + this.B[i2][i3 + 1][i4 + 1]) / 4 - (this.B[n2][n5][n6] + this.B[n2][n5 + 1][n6] + this.B[n2][n5][n6 + 1] + this.B[n2][n5 + 1][n6 + 1]) / 4;
                    u_0 u_02 = h_02.j;
                    if (u_02 != null && u_02.f != null && u_02.f.f != null) {
                        this.a(h2, (rs.a.h)u_02.f, (i3 - n5) * 128 + (1 - n3) * 64, n11, (i4 - n6) * 128 + (1 - n4) * 64, bl);
                    }
                    if (u_02 != null && u_02.g != null && u_02.g.f != null) {
                        this.a(h2, (rs.a.h)u_02.g, (i3 - n5) * 128 + (1 - n3) * 64, n11, (i4 - n6) * 128 + (1 - n4) * 64, bl);
                    }
                    for (int i5 = 0; i5 < h_02.n; ++i5) {
                        l l2 = h_02.o[i5];
                        if (l2 == null || l2.d == null || l2.d.f == null) continue;
                        int n12 = l2.g - l2.f + 1;
                        int n13 = l2.i - l2.h + 1;
                        this.a(h2, (rs.a.h)l2.d, (l2.f - n5) * 128 + (n12 - n3) * 64, n11, (l2.h - n6) * 128 + (n13 - n4) * 64, bl);
                    }
                }
            }
            --n7;
            bl = false;
        }
    }

    private void a(rs.a.h h2, rs.a.h h3, int n2, int n3, int n4, boolean bl) {
        int n5;
        ++this.ao;
        int n6 = 0;
        int[] nArray = h3.ae;
        int n7 = h3.ad;
        s_0 s_02 = h2.f;
        s_0 s_03 = h2.aO;
        for (n5 = 0; n5 < h2.ad; ++n5) {
            int n8;
            int n9;
            int n10;
            if (s_03.d(n5) == 0 || (n10 = h2.af[n5] - n3) > h3.aE || (n9 = h2.ae[n5] - n2) < h3.az || n9 > h3.aA || (n8 = h2.ag[n5] - n4) < h3.aC || n8 > h3.aB) continue;
            s_0 s_04 = h3.f;
            s_0 s_05 = h3.aO;
            for (int i2 = 0; i2 < n7; ++i2) {
                if (n9 != nArray[i2] || n8 != h3.ag[i2] || n10 != h3.af[i2] || s_05.d(i2) == 0) continue;
                s_02.e(n5, s_05.a(i2));
                s_02.f(n5, s_05.b(i2));
                s_02.g(n5, s_05.c(i2));
                s_02.h(n5, s_05.d(i2));
                s_04.e(i2, s_03.a(n5));
                s_04.f(i2, s_03.b(n5));
                s_04.g(i2, s_03.c(n5));
                s_04.h(i2, s_03.d(n5));
                ++n6;
                this.am[n5] = this.ao;
                this.an[i2] = this.ao;
            }
        }
        if (n6 < 3 || !bl) {
            return;
        }
        for (n5 = 0; n5 < h2.ah; ++n5) {
            if (this.am[h2.ai[n5]] != this.ao || this.am[h2.aj[n5]] != this.ao || this.am[h2.ak[n5]] != this.ao) continue;
            h2.ao[n5] = -1;
        }
        for (n5 = 0; n5 < h3.ah; ++n5) {
            if (this.an[h3.ai[n5]] != this.ao || this.an[h3.aj[n5]] != this.ao || this.an[h3.ak[n5]] != this.ao) continue;
            h3.ao[n5] = -1;
        }
    }

    public void a(int[] nArray, int n2, int n3, int n4, int n5) {
        int n6 = 512;
        h_0 h_02 = this.i[n3][n4][n5];
        if (h_02 == null) {
            return;
        }
        j_0 j_02 = h_02.h;
        if (j_02 != null) {
            int n7 = j_02.g;
            if (n7 == 0) {
                return;
            }
            for (int i2 = 0; i2 < 4; ++i2) {
                nArray[n2] = n7;
                nArray[n2 + 1] = n7;
                nArray[n2 + 2] = n7;
                nArray[n2 + 3] = n7;
                n2 += n6;
            }
            return;
        }
        i_0 i_02 = h_02.i;
        if (i_02 == null) {
            return;
        }
        int n8 = i_02.o;
        int n9 = i_02.p;
        int n10 = i_02.q;
        int n11 = i_02.r;
        int[] nArray2 = this.ap[n8];
        int[] nArray3 = this.aq[n9];
        int n12 = 0;
        if (n10 != 0) {
            for (int i3 = 0; i3 < 4; ++i3) {
                nArray[n2] = nArray2[nArray3[n12++]] != 0 ? n11 : n10;
                nArray[n2 + 1] = nArray2[nArray3[n12++]] != 0 ? n11 : n10;
                nArray[n2 + 2] = nArray2[nArray3[n12++]] != 0 ? n11 : n10;
                nArray[n2 + 3] = nArray2[nArray3[n12++]] != 0 ? n11 : n10;
                n2 += n6;
            }
            return;
        }
        for (int i4 = 0; i4 < 4; ++i4) {
            if (nArray2[nArray3[n12++]] != 0) {
                nArray[n2] = n11;
            }
            if (nArray2[nArray3[n12++]] != 0) {
                nArray[n2 + 1] = n11;
            }
            if (nArray2[nArray3[n12++]] != 0) {
                nArray[n2 + 2] = n11;
            }
            if (nArray2[nArray3[n12++]] != 0) {
                nArray[n2 + 3] = n11;
            }
            n2 += n6;
        }
    }

    public static void d(int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int[] nArray = new int[9];
        for (int i2 = 0; i2 < 9; ++i2) {
            n12 = 128 + i2 * 32 + 15;
            n11 = 600 + n12 * 3;
            nArray[i2] = n11 * e_0.v[n12] >> 16;
        }
        av = 0;
        aw = 0;
        ax = n4;
        ay = n5;
        at = n4 / 2;
        au = n5 / 2;
        boolean[][][][] blArray = new boolean[9][32][e * 2 + 3][e * 2 + 3];
        for (n12 = 128; n12 <= 384; n12 += 32) {
            for (n11 = 0; n11 < 2048; n11 += 64) {
                m = rs.a.h.bA[n12];
                n = rs.a.h.bB[n12];
                o = rs.a.h.bA[n11];
                p = rs.a.h.bB[n11];
                n10 = (n12 - 128) / 32;
                n9 = n11 / 64;
                for (n8 = -26; n8 <= 26; ++n8) {
                    for (n7 = -26; n7 <= 26; ++n7) {
                        n6 = n8 * 128;
                        int n13 = n7 * 128;
                        boolean bl = false;
                        for (int i3 = -n2; i3 <= n3; i3 += 128) {
                            if (!v_0.r(nArray[n10] + i3, n13, n6)) continue;
                            bl = true;
                            break;
                        }
                        blArray[n10][n9][n8 + v_0.e + 1][n7 + v_0.e + 1] = bl;
                    }
                }
            }
        }
        for (n12 = 0; n12 < 8; ++n12) {
            for (n11 = 0; n11 < 32; ++n11) {
                for (n10 = -1 * e; n10 < e; ++n10) {
                    for (n9 = -1 * e; n9 < e; ++n9) {
                        n8 = 0;
                        block10: for (n7 = -1; n7 <= 1; ++n7) {
                            for (n6 = -1; n6 <= 1; ++n6) {
                                if (blArray[n12][n11][n10 + n7 + e + 1][n9 + n6 + e + 1]) {
                                    n8 = 1;
                                    break block10;
                                }
                                if (blArray[n12][(n11 + 1) % 31][n10 + n7 + e + 1][n9 + n6 + e + 1]) {
                                    n8 = 1;
                                    break block10;
                                }
                                if (blArray[n12 + 1][n11][n10 + n7 + e + 1][n9 + n6 + e + 1]) {
                                    n8 = 1;
                                    break block10;
                                }
                                if (!blArray[n12 + 1][(n11 + 1) % 31][n10 + n7 + e + 1][n9 + n6 + e + 1]) continue;
                                n8 = 1;
                                break block10;
                            }
                        }
                        if (n10 + e >= 51 || n9 + e >= 51) continue;
                        v_0.ar[n12][n11][n10 + v_0.e][n9 + v_0.e] = n8;
                    }
                }
            }
        }
    }

    private static boolean r(int n2, int n3, int n4) {
        int n5 = n3 * o + n4 * p >> 16;
        int n6 = n3 * p - n4 * o >> 16;
        int n7 = n2 * m + n6 * n >> 16;
        int n8 = n2 * n - n6 * m >> 16;
        if (n7 < 50 || n7 > 3500) {
            return false;
        }
        int n9 = at + (n5 << 9) / n7;
        int n10 = au + (n8 << 9) / n7;
        return n9 >= av && n9 <= ax && n10 >= aw && n10 <= ay;
    }

    public void b(int n2, int n3) {
        q = false;
        V = true;
        W = n3;
        X = n2;
        r = -1;
        s = -1;
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        h_0 h_02;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        h_0[][] h_0Array;
        int n13;
        int n14;
        boolean bl = rs.f.a.aO;
        int n15 = n14 = bl ? 40 : d;
        if (rs.k.e.a()) {
            Launcher.n().o().a.a(n2, n3, n4, n5, n6, n7);
        }
        boolean bl2 = Client.dj;
        int n16 = n2;
        int n17 = n3;
        int n18 = n5;
        int n19 = this.z;
        int n20 = this.y;
        int n21 = this.A;
        int n22 = this.C;
        h_0[][][] h_0Array2 = this.i;
        if (n2 < 0) {
            n2 = 0;
        } else if (n2 >= n19 * 128) {
            n2 = n19 * 128 - 1;
        }
        if (n3 < 0) {
            n3 = 0;
        } else if (n3 >= n21 * 128) {
            n3 = n21 * 128 - 1;
        }
        int n23 = n7;
        if (n7 < 128) {
            n7 = 128;
        } else if (n7 > 383) {
            n7 = 383;
        }
        ++J;
        m = rs.a.h.bA[n7];
        n = rs.a.h.bB[n7];
        o = rs.a.h.bA[n4];
        p = rs.a.h.bB[n4];
        as = ar[(n7 - 128) / 32][n4 / 64];
        j = n16;
        k = n18;
        l = n17;
        O = n2 / 128;
        P = n3 / 128;
        I = n6;
        K = O - n14;
        if (K < 0) {
            K = 0;
        }
        if ((M = P - n14) < 0) {
            M = 0;
        }
        if ((L = O + n14) > n19) {
            L = n19;
        }
        if ((N = P + n14) > n21) {
            N = n21;
        }
        this.e();
        H = 0;
        for (n13 = n22; n13 < n20; ++n13) {
            h_0Array = this.i[n13];
            for (n12 = K; n12 < L; ++n12) {
                for (n11 = M; n11 < N; ++n11) {
                    h_0 h_03 = h_0Array[n12][n11];
                    if (h_03 == null) continue;
                    if (h_03.r > n6 || !bl && !as[n12 - O + e][n11 - P + e] && this.B[n13][n12][n11] - n5 < 2000) {
                        h_03.s = false;
                        h_03.u = false;
                        h_03.w = 0;
                        continue;
                    }
                    h_03.s = true;
                    h_03.u = true;
                    h_03.v = h_03.n > 0;
                    ++H;
                }
            }
        }
        Client.ab.d.clear();
        Client.ab.c.clear();
        for (n13 = n22; n13 < n20; ++n13) {
            h_0Array = this.i[n13];
            for (n12 = -n14; n12 <= 0; ++n12) {
                n11 = O + n12;
                int n24 = O - n12;
                if (n11 < K && n24 >= L) continue;
                for (n10 = -n14; n10 <= 0; ++n10) {
                    n9 = P + n10;
                    n8 = P - n10;
                    if (n11 >= K) {
                        if (n9 >= M && (h_02 = h_0Array[n11][n9]) != null && h_02.s) {
                            this.b(h_02, true);
                        }
                        if (n8 < N && (h_02 = h_0Array[n11][n8]) != null && h_02.s) {
                            this.b(h_02, true);
                        }
                    }
                    if (n24 < L) {
                        if (n9 >= M && (h_02 = h_0Array[n24][n9]) != null && h_02.s) {
                            this.b(h_02, true);
                        }
                        if (n8 < N && (h_02 = h_0Array[n24][n8]) != null && h_02.s) {
                            this.b(h_02, true);
                        }
                    }
                    if (H != 0) continue;
                    if (rs.k.e.a()) {
                        Launcher.n().o().a.f();
                    }
                    V = false;
                    return;
                }
            }
        }
        if (!bl2) {
            u = -1;
            t = -1;
        }
        for (n13 = n22; n13 < n20; ++n13) {
            h_0Array = this.i[n13];
            for (n12 = -n14; n12 <= 0; ++n12) {
                n11 = O + n12;
                int n25 = O - n12;
                if (n11 < K && n25 >= L) continue;
                for (n10 = -n14; n10 <= 0; ++n10) {
                    n9 = P + n10;
                    n8 = P - n10;
                    if (n11 >= K) {
                        if (n9 >= M && (h_02 = h_0Array[n11][n9]) != null && h_02.s) {
                            this.a(h_02, false);
                        }
                        if (n8 < N && (h_02 = h_0Array[n11][n8]) != null && h_02.s) {
                            this.a(h_02, false);
                        }
                    }
                    if (n25 < L) {
                        if (n9 >= M && (h_02 = h_0Array[n25][n9]) != null && h_02.s) {
                            this.a(h_02, false);
                        }
                        if (n8 < N && (h_02 = h_0Array[n25][n8]) != null && h_02.s) {
                            this.a(h_02, false);
                        }
                    }
                    if (H != 0) continue;
                    V = false;
                    if (rs.k.e.a()) {
                        Launcher.n().o().a.f();
                    }
                    return;
                }
            }
        }
        V = false;
        if (rs.k.e.a()) {
            Launcher.n().o().a.f();
        }
    }

    private void a(h_0 h_02, boolean bl) {
        this.b(h_02, bl);
    }

    private void b(h_0 h_02, boolean bl) {
        ad.a(h_02);
        h_0 h_03;
        while ((h_03 = (h_0)ad.a()) != null) {
            h_0 h_04;
            h_0 h_05;
            h_0 h_06;
            h_0 h_07;
            h_0 h_08;
            h_0 h_09;
            h_0 h_010;
            h_0 h_011;
            h_0 h_012;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            if (!h_03.u) continue;
            int n8 = h_03.b;
            int n9 = h_03.f;
            int n10 = h_03.a;
            int n11 = h_03.g;
            h_0[][] h_0Array = this.i[n10];
            if (h_03.s) {
                q_0 q_02;
                h_0 h_013;
                if (bl) {
                    if (n10 > 0 && (h_013 = this.i[n10 - 1][n8][n9]) != null && h_013.u || n8 <= O && n8 > K && (h_013 = h_0Array[n8 - 1][n9]) != null && h_013.u && (h_013.s || (h_03.q & 1) == 0) || n8 >= O && n8 < L - 1 && (h_013 = h_0Array[n8 + 1][n9]) != null && h_013.u && (h_013.s || (h_03.q & 4) == 0) || n9 <= P && n9 > M && (h_013 = h_0Array[n8][n9 - 1]) != null && h_013.u && (h_013.s || (h_03.q & 8) == 0) || n9 >= P && n9 < N - 1 && (h_013 = h_0Array[n8][n9 + 1]) != null && h_013.u && (h_013.s || (h_03.q & 2) == 0)) {
                        continue;
                    }
                } else {
                    bl = true;
                }
                h_03.s = false;
                if (h_03.A != null) {
                    u_0 u_02;
                    h_013 = h_03.A;
                    if (h_013.h != null) {
                        if (!this.s(0, n8, n9)) {
                            this.a(h_013.h, 0, m, n, o, p, n8, n9);
                        }
                    } else if (h_013.i != null && !this.s(0, n8, n9)) {
                        this.a(n8, m, o, h_013.i, n, n9, p);
                    }
                    if ((u_02 = h_013.j) != null) {
                        u_02.f.a(0, m, n, o, p, u_02.n - j, u_02.c - k, u_02.o - l, u_02.m, u_02.b);
                    }
                    for (n7 = 0; n7 < h_013.n; ++n7) {
                        q_02 = h_013.o[n7];
                        if (q_02 == null) continue;
                        ((l)q_02).d.a(((l)q_02).e, m, n, o, p, ((l)q_02).n - j, ((l)q_02).c - k, ((l)q_02).o - l, ((l)q_02).m, ((l)q_02).a);
                    }
                }
                boolean bl2 = false;
                if (h_03.h != null) {
                    if (!this.s(n11, n8, n9)) {
                        bl2 = true;
                        this.a(h_03.h, n11, m, n, o, p, n8, n9);
                    }
                } else if (h_03.i != null && !this.s(n11, n8, n9)) {
                    bl2 = true;
                    this.a(n8, m, o, h_03.i, n, n9, p);
                }
                int n12 = 0;
                n7 = 0;
                q_02 = h_03.j;
                t_0 t_02 = h_03.k;
                if (q_02 != null || t_02 != null) {
                    if (O == n8) {
                        ++n12;
                    } else if (O < n8) {
                        n12 += 2;
                    }
                    if (P == n9) {
                        n12 += 3;
                    } else if (P > n9) {
                        n12 += 6;
                    }
                    n7 = ae[n12];
                    h_03.z = ag[n12];
                }
                if (q_02 != null) {
                    if ((q_02.d & af[n12]) != 0) {
                        if (q_02.d == 16) {
                            h_03.w = 3;
                            h_03.x = ah[n12];
                            h_03.y = 3 - h_03.x;
                        } else if (q_02.d == 32) {
                            h_03.w = 6;
                            h_03.x = ai[n12];
                            h_03.y = 6 - h_03.x;
                        } else if (q_02.d == 64) {
                            h_03.w = 12;
                            h_03.x = aj[n12];
                            h_03.y = 12 - h_03.x;
                        } else {
                            h_03.w = 9;
                            h_03.x = ak[n12];
                            h_03.y = 9 - h_03.x;
                        }
                    } else {
                        h_03.w = 0;
                    }
                    if ((q_02.d & n7) != 0 && !this.e(n11, n8, n9, q_02.d)) {
                        q_02.f.a(0, m, n, o, p, q_02.n - j, q_02.c - k, q_02.o - l, q_02.m, q_02.b);
                    }
                    if ((q_02.e & n7) != 0 && !this.e(n11, n8, n9, q_02.e)) {
                        q_02.g.a(0, m, n, o, p, q_02.n - j, q_02.c - k, q_02.o - l, q_02.m, q_02.b);
                    }
                }
                if (t_02 != null && !this.f(n11, n8, n9, t_02.e.g)) {
                    if ((t_02.c & n7) != 0) {
                        t_02.e.a(t_02.d, m, n, o, p, t_02.n - j, t_02.b - k, t_02.o - l, t_02.m, t_02.a);
                    } else if ((t_02.c & 0x300) != 0) {
                        int n13;
                        int n14;
                        n6 = t_02.n - j;
                        n5 = t_02.b - k;
                        n4 = t_02.o - l;
                        n3 = t_02.d;
                        n2 = n3 == 1 || n3 == 2 ? -n6 : n6;
                        int n15 = n3 == 2 || n3 == 3 ? -n4 : n4;
                        if ((t_02.c & 0x100) != 0 && n15 < n2) {
                            n14 = n6 + R[n3];
                            n13 = n4 + S[n3];
                            t_02.e.a(n3 * 512 + 256, m, n, o, p, n14, n5, n13, t_02.m, t_02.a);
                        }
                        if ((t_02.c & 0x200) != 0 && n15 > n2) {
                            n14 = n6 + T[n3];
                            n13 = n4 + U[n3];
                            t_02.e.a(n3 * 512 + 1280 & 0x7FF, m, n, o, p, n14, n5, n13, t_02.m, t_02.a);
                        }
                    }
                }
                if (bl2) {
                    n n16;
                    m m2 = h_03.l;
                    if (m2 != null) {
                        m2.c.a(0, m, n, o, p, m2.n - j, m2.b - k, m2.o - l, m2.m, m2.a);
                    }
                    if ((n16 = h_03.m) != null && n16.i == 0) {
                        if (n16.f != null) {
                            n16.f.a(0, m, n, o, p, n16.c - j, n16.b - k, n16.d - l, n16.h, n16.a);
                        }
                        if (n16.g != null) {
                            n16.g.a(0, m, n, o, p, n16.c - j, n16.b - k, n16.d - l, n16.h, n16.a);
                        }
                        if (n16.e != null) {
                            n16.e.a(0, m, n, o, p, n16.c - j, n16.b - k, n16.d - l, n16.h, n16.a);
                        }
                    }
                }
                if ((n6 = h_03.q) != 0) {
                    h_0 h_014;
                    h_0 h_015;
                    h_0 h_016;
                    h_0 h_017;
                    if (n8 < O && (n6 & 4) != 0 && (h_017 = h_0Array[n8 + 1][n9]) != null && h_017.u) {
                        ad.a(h_017);
                    }
                    if (n9 < P && (n6 & 2) != 0 && (h_016 = h_0Array[n8][n9 + 1]) != null && h_016.u) {
                        ad.a(h_016);
                    }
                    if (n8 > O && (n6 & 1) != 0 && (h_015 = h_0Array[n8 - 1][n9]) != null && h_015.u) {
                        ad.a(h_015);
                    }
                    if (n9 > P && (n6 & 8) != 0 && (h_014 = h_0Array[n8][n9 - 1]) != null && h_014.u) {
                        ad.a(h_014);
                    }
                }
            }
            if (h_03.w != 0) {
                boolean bl3 = true;
                for (int i2 = 0; i2 < h_03.n; ++i2) {
                    if (h_03.o[i2].k == J || (h_03.p[i2] & h_03.w) != h_03.x) continue;
                    bl3 = false;
                    break;
                }
                if (bl3) {
                    u_0 u_03 = h_03.j;
                    if (!this.e(n11, n8, n9, u_03.d)) {
                        u_03.f.a(0, m, n, o, p, u_03.n - j, u_03.c - k, u_03.o - l, u_03.m, u_03.b);
                    }
                    h_03.w = 0;
                }
            }
            if (h_03.v) {
                try {
                    int n17 = h_03.n;
                    h_03.v = false;
                    int n18 = 0;
                    block5: for (n7 = 0; n7 < n17; ++n7) {
                        int n19;
                        int n20;
                        l l2 = h_03.o[n7];
                        if (l2.k == J) continue;
                        for (n20 = l2.f; n20 <= l2.g; ++n20) {
                            for (n6 = l2.h; n6 <= l2.i; ++n6) {
                                h_0 h_018 = h_0Array[n20][n6];
                                if (h_018.s) {
                                    h_03.v = true;
                                    continue block5;
                                }
                                if (h_018.w == 0) continue;
                                n4 = 0;
                                if (n20 > l2.f) {
                                    ++n4;
                                }
                                if (n20 < l2.g) {
                                    n4 += 4;
                                }
                                if (n6 > l2.h) {
                                    n4 += 8;
                                }
                                if (n6 < l2.i) {
                                    n4 += 2;
                                }
                                if ((n4 & h_018.w) != h_03.y) continue;
                                h_03.v = true;
                                continue block5;
                            }
                        }
                        v_0.Q[n18++] = l2;
                        n6 = l2.g - O;
                        n20 = O - l2.f;
                        if (n6 > n20) {
                            n20 = n6;
                        }
                        l2.j = (n4 = l2.i - P) > (n19 = P - l2.h) ? n20 + n4 : n20 + n19;
                    }
                    block8: while (true) {
                        n7 = -50;
                        int n21 = -1;
                        for (int i3 = 0; i3 < n18; ++i3) {
                            int n22;
                            int n23;
                            l l3 = Q[i3];
                            if (l3.k == J) continue;
                            if (l3.j > n7) {
                                n7 = l3.j;
                                n21 = i3;
                                continue;
                            }
                            if (l3.j != n7 || (n23 = l3.n - j) * n23 + (n22 = l3.o - l) * n22 <= (n3 = v_0.Q[n21].n - j) * n3 + (n2 = v_0.Q[n21].o - l) * n2) continue;
                            n21 = i3;
                        }
                        if (n21 == -1) break;
                        l l4 = Q[n21];
                        l4.k = J;
                        if (!this.b(n11, l4.f, l4.g, l4.h, l4.i, l4.d.g) && !h_03.t) {
                            l4.d.a(l4.e, m, n, o, p, l4.n - j, l4.c - k, l4.o - l, l4.m, l4.a);
                        }
                        int n24 = l4.f;
                        while (true) {
                            if (n24 > l4.g) continue block8;
                            for (int i4 = l4.h; i4 <= l4.i; ++i4) {
                                h_0 h_019 = h_0Array[n24][i4];
                                if (h_019.w != 0) {
                                    ad.a(h_019);
                                    continue;
                                }
                                if (n24 == n8 && i4 == n9 || !h_019.u) continue;
                                ad.a(h_019);
                            }
                            ++n24;
                        }
                        break;
                    }
                    if (h_03.v) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    h_03.v = false;
                }
            }
            if (!h_03.u || h_03.w != 0 || n8 <= O && n8 > K && (h_012 = h_0Array[n8 - 1][n9]) != null && h_012.u || n8 >= O && n8 < L - 1 && (h_011 = h_0Array[n8 + 1][n9]) != null && h_011.u || n9 <= P && n9 > M && (h_010 = h_0Array[n8][n9 - 1]) != null && h_010.u || n9 >= P && n9 < N - 1 && (h_09 = h_0Array[n8][n9 + 1]) != null && h_09.u) continue;
            h_03.u = false;
            --H;
            n n25 = h_03.m;
            if (n25 != null && n25.i != 0) {
                if (n25.f != null) {
                    n25.f.a(0, m, n, o, p, n25.c - j, n25.b - k - n25.i, n25.d - l, n25.h, n25.a);
                }
                if (n25.g != null) {
                    n25.g.a(0, m, n, o, p, n25.c - j, n25.b - k - n25.i, n25.d - l, n25.h, n25.a);
                }
                if (n25.e != null) {
                    n25.e.a(0, m, n, o, p, n25.c - j, n25.b - k - n25.i, n25.d - l, n25.h, n25.a);
                }
            }
            if (h_03.z != 0) {
                u_0 u_04;
                t_0 t_03 = h_03.k;
                if (t_03 != null && !this.f(n11, n8, n9, t_03.e.g)) {
                    if ((t_03.c & h_03.z) != 0) {
                        t_03.e.a(t_03.d, m, n, o, p, t_03.n - j, t_03.b - k, t_03.o - l, t_03.m, t_03.a);
                    } else if ((t_03.c & 0x300) != 0) {
                        n7 = t_03.n - j;
                        int n26 = t_03.b - k;
                        int n27 = t_03.o - l;
                        n6 = t_03.d;
                        n5 = n6 == 1 || n6 == 2 ? -n7 : n7;
                        n4 = n6 == 2 || n6 == 3 ? -n27 : n27;
                        if ((t_03.c & 0x100) != 0 && n4 >= n5) {
                            n3 = n7 + R[n6];
                            n2 = n27 + S[n6];
                            t_03.e.a(n6 * 512 + 256, m, n, o, p, n3, n26, n2, t_03.m, t_03.a);
                        }
                        if ((t_03.c & 0x200) != 0 && n4 <= n5) {
                            n3 = n7 + T[n6];
                            n2 = n27 + U[n6];
                            t_03.e.a(n6 * 512 + 1280 & 0x7FF, m, n, o, p, n3, n26, n2, t_03.m, t_03.a);
                        }
                    }
                }
                if ((u_04 = h_03.j) != null) {
                    if ((u_04.e & h_03.z) != 0 && !this.e(n11, n8, n9, u_04.e)) {
                        u_04.g.a(0, m, n, o, p, u_04.n - j, u_04.c - k, u_04.o - l, u_04.m, u_04.b);
                    }
                    if ((u_04.d & h_03.z) != 0 && !this.e(n11, n8, n9, u_04.d)) {
                        u_04.f.a(0, m, n, o, p, u_04.n - j, u_04.c - k, u_04.o - l, u_04.m, u_04.b);
                    }
                }
            }
            if (n10 < this.y - 1 && (h_08 = this.i[n10 + 1][n8][n9]) != null && h_08.u) {
                ad.a(h_08);
            }
            if (n8 < O && (h_07 = h_0Array[n8 + 1][n9]) != null && h_07.u) {
                ad.a(h_07);
            }
            if (n9 < P && (h_06 = h_0Array[n8][n9 + 1]) != null && h_06.u) {
                ad.a(h_06);
            }
            if (n8 > O && (h_05 = h_0Array[n8 - 1][n9]) != null && h_05.u) {
                ad.a(h_05);
            }
            if (n9 <= P || (h_04 = h_0Array[n8][n9 - 1]) == null || !h_04.u) continue;
            ad.a(h_04);
        }
        return;
    }

    private void a(j_0 j_02, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9;
        boolean bl;
        int n10;
        int n11;
        int n12;
        int n13;
        byte[][][] byArray = Launcher.n().o().gc;
        int n14 = n2;
        if ((byArray[1][n7][n8] & 2) != 0) {
            n14 = n2 - 1;
        }
        if (rs.k.e.a()) {
            Launcher.n().o().a.a(0, n3, n4, n5, n6, -j, -k, -l, j_02, n2, n7, n8, Launcher.n().o().aM(), at, au);
        }
        int n15 = n13 = (n7 << 7) - j;
        int n16 = n12 = (n8 << 7) - l;
        int n17 = n11 = n15 + 128;
        int n18 = n10 = n16 + 128;
        int n19 = this.B[n2][n7][n8] - k;
        int n20 = this.B[n2][n7 + 1][n8] - k;
        int n21 = this.B[n2][n7 + 1][n8 + 1] - k;
        int n22 = this.B[n2][n7][n8 + 1] - k;
        int n23 = n16 * n5 + n15 * n6 >> 16;
        n16 = n16 * n6 - n15 * n5 >> 16;
        n15 = n23;
        n23 = n19 * n4 - n16 * n3 >> 16;
        n16 = n19 * n3 + n16 * n4 >> 16;
        n19 = n23;
        if (n16 < 50) {
            return;
        }
        n23 = n12 * n5 + n17 * n6 >> 16;
        n12 = n12 * n6 - n17 * n5 >> 16;
        n17 = n23;
        n23 = n20 * n4 - n12 * n3 >> 16;
        n12 = n20 * n3 + n12 * n4 >> 16;
        n20 = n23;
        if (n12 < 50) {
            return;
        }
        n23 = n18 * n5 + n11 * n6 >> 16;
        n18 = n18 * n6 - n11 * n5 >> 16;
        n11 = n23;
        n23 = n21 * n4 - n18 * n3 >> 16;
        n18 = n21 * n3 + n18 * n4 >> 16;
        n21 = n23;
        if (n18 < 50) {
            return;
        }
        n23 = n10 * n5 + n13 * n6 >> 16;
        n10 = n10 * n6 - n13 * n5 >> 16;
        n13 = n23;
        n23 = n22 * n4 - n10 * n3 >> 16;
        n10 = n22 * n3 + n10 * n4 >> 16;
        n22 = n23;
        if (n10 < 50) {
            return;
        }
        int n24 = e_0.s + (n15 << 9) / n16;
        int n25 = e_0.t + (n19 << 9) / n16;
        int n26 = e_0.s + (n17 << 9) / n12;
        int n27 = e_0.t + (n20 << 9) / n12;
        int n28 = e_0.s + (n11 << 9) / n18;
        int n29 = e_0.t + (n21 << 9) / n18;
        int n30 = e_0.s + (n13 << 9) / n10;
        int n31 = e_0.t + (n22 << 9) / n10;
        e_0.r = 0;
        boolean bl2 = bl = rs.d.h.a != h.a.c || Client.dw == n14;
        if ((n28 - n30) * (n27 - n31) - (n29 - n31) * (n26 - n30) > 0) {
            boolean bl3 = e_0.o = n28 < 0 || n30 < 0 || n26 < 0 || n28 > rs.l.c.n || n30 > rs.l.c.n || n26 > rs.l.c.n;
            if (bl && V && this.b(W, X, n29, n31, n27, n28, n30, n26)) {
                r = n7;
                s = n8;
            }
            if (this.b(Client.hP + (Client.ai() ? 0 : -4), Client.hQ + (Client.ai() ? 0 : -4), n29, n31, n27, n28, n30, n26) && n14 == Client.dw) {
                t = n7;
                u = n8;
            }
            if (j_02.e == -1) {
                if (j_02.c != 12345678) {
                    if (rs.f.a.av) {
                        e_0.a(n29, n31, n27, n28, n30, n26, j_02.c, j_02.d, j_02.b, (float)n18, (float)n10, (float)n12);
                    } else {
                        e_0.a(n29, n31, n27, n28, n30, n26, j_02.c, j_02.d, j_02.b);
                    }
                }
            } else if (!h) {
                if (j_02.f) {
                    if (rs.f.a.av) {
                        e_0.a(n29, n31, n27, n28, n30, n26, j_02.c, j_02.d, j_02.b, n15, n17, n13, n19, n20, n22, n16, n12, n10, j_02.e, n18, n10, n12);
                    } else {
                        e_0.a(n29, n31, n27, n28, n30, n26, j_02.c, j_02.d, j_02.b, n15, n17, n13, n19, n20, n22, n16, n12, n10, j_02.e);
                    }
                } else if (rs.f.a.av) {
                    e_0.a(n29, n31, n27, n28, n30, n26, j_02.c, j_02.d, j_02.b, n11, n13, n17, n21, n22, n20, n18, n10, n12, j_02.e, n18, n10, n12);
                } else {
                    e_0.a(n29, n31, n27, n28, n30, n26, j_02.c, j_02.d, j_02.b, n11, n13, n17, n21, n22, n20, n18, n10, n12, j_02.e);
                }
            } else {
                n9 = al[j_02.e];
                if (rs.f.a.av) {
                    e_0.a(n29, n31, n27, n28, n30, n26, this.c(n9, j_02.c), this.c(n9, j_02.d), this.c(n9, j_02.b), (float)n18, (float)n10, (float)n12);
                } else {
                    e_0.a(n29, n31, n27, n28, n30, n26, this.c(n9, j_02.c), this.c(n9, j_02.d), this.c(n9, j_02.b));
                }
            }
        }
        if ((n24 - n26) * (n31 - n27) - (n25 - n27) * (n30 - n26) > 0) {
            boolean bl4 = e_0.o = n24 < 0 || n26 < 0 || n30 < 0 || n24 > rs.l.c.n || n26 > rs.l.c.n || n30 > rs.l.c.n;
            if (bl && V && this.b(W, X, n25, n27, n31, n24, n26, n30)) {
                r = n7;
                s = n8;
            }
            if (this.b(Client.hP + (Client.ai() ? 0 : -4), Client.hQ + (Client.ai() ? 0 : -4), n25, n27, n31, n24, n26, n30) && n14 == Client.dw) {
                t = n7;
                u = n8;
            }
            if (j_02.e == -1) {
                if (j_02.a != 12345678) {
                    if (rs.f.a.av) {
                        e_0.a(n25, n27, n31, n24, n26, n30, j_02.a, j_02.b, j_02.d, (float)n16, (float)n12, (float)n10);
                    } else {
                        e_0.a(n25, n27, n31, n24, n26, n30, j_02.a, j_02.b, j_02.d);
                    }
                }
            } else {
                if (!h) {
                    if (rs.f.a.av) {
                        e_0.a(n25, n27, n31, n24, n26, n30, j_02.a, j_02.b, j_02.d, n15, n17, n13, n19, n20, n22, n16, n12, n10, j_02.e, n16, n12, n10);
                    } else {
                        e_0.a(n25, n27, n31, n24, n26, n30, j_02.a, j_02.b, j_02.d, n15, n17, n13, n19, n20, n22, n16, n12, n10, j_02.e);
                    }
                    return;
                }
                n9 = al[j_02.e];
                if (rs.f.a.av) {
                    e_0.a(n25, n27, n31, n24, n26, n30, this.c(n9, j_02.a), this.c(n9, j_02.b), this.c(n9, j_02.d), (float)n16, (float)n12, (float)n10);
                } else {
                    e_0.a(n25, n27, n31, n24, n26, n30, this.c(n9, j_02.a), this.c(n9, j_02.b), this.c(n9, j_02.d));
                }
            }
        }
    }

    private void a(int n2, int n3, int n4, i_0 i_02, int n5, int n6, int n7) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        if (rs.k.e.a()) {
            n13 = j;
            n12 = k;
            n11 = l;
            n10 = Launcher.n().o().aM();
            n9 = Launcher.n().o().al();
            n8 = Launcher.n().o().am();
            e e2 = Launcher.n().o().a;
            int n14 = -n13;
            int n15 = -n12;
            int n16 = -n11;
            Launcher.n().o();
            e2.a(0, n3, n5, n4, n7, n14, n15, n16, i_02, Client.dw, n2, n6, n10, n9, n8);
        }
        n13 = i_02.d.length;
        for (n12 = 0; n12 < n13; ++n12) {
            n11 = i_02.d[n12] - j;
            n10 = i_02.e[n12] - k;
            n9 = i_02.f[n12] - l;
            n8 = n9 * n4 + n11 * n7 >> 16;
            n9 = n9 * n7 - n11 * n4 >> 16;
            n11 = n8;
            n8 = n10 * n5 - n9 * n3 >> 16;
            n9 = n10 * n3 + n9 * n5 >> 16;
            n10 = n8;
            if (n9 < 50) {
                return;
            }
            if (i_02.m != null) {
                i_0.u[n12] = n11;
                i_0.v[n12] = n10;
                i_0.w[n12] = n9;
            }
            i_0.s[n12] = e_0.s + (n11 << 9) / n9;
            i_0.t[n12] = e_0.t + (n10 << 9) / n9;
            i_0.x[n12] = n9;
        }
        e_0.r = 0;
        n13 = i_02.j.length;
        for (n12 = 0; n12 < n13; ++n12) {
            n11 = i_02.j[n12];
            n8 = i_0.s[n11];
            n10 = i_02.k[n12];
            int n17 = i_0.s[n10];
            n9 = i_02.l[n12];
            int n18 = i_0.t[n9];
            int n19 = i_0.t[n10];
            int n20 = i_0.t[n11];
            int n21 = i_0.s[n9];
            if ((n8 - n17) * (n18 - n19) - (n20 - n19) * (n21 - n17) <= 0) continue;
            boolean bl = e_0.o = n8 < 0 || n17 < 0 || n21 < 0 || n8 > rs.l.c.n || n17 > rs.l.c.n || n21 > rs.l.c.n;
            if (V && this.b(W, X, n20, n19, n18, n8, n17, n21)) {
                r = n2;
                s = n6;
            }
            if (this.b(Client.hP + (Client.ai() ? 0 : -4), Client.hQ + (Client.ai() ? 0 : -4), n20, n19, n18, n8, n17, n21)) {
                t = n2;
                u = n6;
            }
            if (rs.f.a.av) {
                e_0.a(n8, n17, n21, n20, n19, n18, (float)i_0.x[n11], (float)i_0.x[n10], (float)i_0.x[n9]);
            }
            if (i_02.m == null || i_02.m[n12] == -1) {
                if (i_02.g[n12] == 12345678) continue;
                if (rs.f.a.av) {
                    e_0.a(n20, n19, n18, n8, n17, n21, i_02.g[n12], i_02.h[n12], i_02.i[n12], (float)i_0.x[n11], (float)i_0.x[n10], (float)i_0.x[n9]);
                    continue;
                }
                e_0.a(n20, n19, n18, n8, n17, n21, i_02.g[n12], i_02.h[n12], i_02.i[n12]);
                continue;
            }
            if (!h) {
                if (i_02.n) {
                    if (rs.f.a.av) {
                        e_0.a(n20, n19, n18, n8, n17, n21, i_02.g[n12], i_02.h[n12], i_02.i[n12], i_0.u[0], i_0.u[1], i_0.u[3], i_0.v[0], i_0.v[1], i_0.v[3], i_0.w[0], i_0.w[1], i_0.w[3], i_02.m[n12], i_0.x[n11], i_0.x[n10], i_0.x[n9]);
                        continue;
                    }
                    e_0.a(n20, n19, n18, n8, n17, n21, i_02.g[n12], i_02.h[n12], i_02.i[n12], i_0.u[0], i_0.u[1], i_0.u[3], i_0.v[0], i_0.v[1], i_0.v[3], i_0.w[0], i_0.w[1], i_0.w[3], i_02.m[n12]);
                    continue;
                }
                if (rs.f.a.av) {
                    e_0.a(n20, n19, n18, n8, n17, n21, i_02.g[n12], i_02.h[n12], i_02.i[n12], i_0.u[n11], i_0.u[n10], i_0.u[n9], i_0.v[n11], i_0.v[n10], i_0.v[n9], i_0.w[n11], i_0.w[n10], i_0.w[n9], i_02.m[n12], i_0.x[n11], i_0.x[n10], i_0.x[n9]);
                    continue;
                }
                e_0.a(n20, n19, n18, n8, n17, n21, i_02.g[n12], i_02.h[n12], i_02.i[n12], i_0.u[n11], i_0.u[n10], i_0.u[n9], i_0.v[n11], i_0.v[n10], i_0.v[n9], i_0.w[n11], i_0.w[n10], i_0.w[n9], i_02.m[n12]);
                continue;
            }
            int n22 = al[i_02.m[n12]];
            if (rs.f.a.av) {
                e_0.a(n20, n19, n18, n8, n17, n21, this.c(n22, i_02.g[n12]), this.c(n22, i_02.h[n12]), this.c(n22, i_02.i[n12]), (float)i_0.x[n11], (float)i_0.x[n10], (float)i_0.x[n9]);
                continue;
            }
            e_0.a(n20, n19, n18, n8, n17, n21, this.c(n22, i_02.g[n12]), this.c(n22, i_02.h[n12]), this.c(n22, i_02.i[n12]));
        }
    }

    private int c(int n2, int n3) {
        n3 = 127 - n3;
        if ((n3 = n3 * (n2 & 0x7F) / 160) < 2) {
            n3 = 2;
        } else if (n3 > 126) {
            n3 = 126;
        }
        return (n2 & 0xFF80) + n3;
    }

    private boolean b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n3 < n4 && n3 < n5 && n3 < n6) {
            return false;
        }
        if (n3 > n4 && n3 > n5 && n3 > n6) {
            return false;
        }
        if (n2 < n7 && n2 < n8 && n2 < n9) {
            return false;
        }
        if (n2 > n7 && n2 > n8 && n2 > n9) {
            return false;
        }
        int n10 = (n3 - n4) * (n8 - n7) - (n2 - n7) * (n5 - n4);
        int n11 = (n3 - n6) * (n7 - n9) - (n2 - n9) * (n4 - n6);
        int n12 = (n3 - n5) * (n9 - n8) - (n2 - n8) * (n6 - n5);
        return n10 * n12 > 0 && n12 * n11 > 0;
    }

    private void e() {
        int n2 = Z[I];
        g_0[] g_0Array = aa[I];
        ab = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            g_0 g_02 = g_0Array[i2];
            if (g_02.e == 1) {
                n7 = g_02.a - O + d;
                if (n7 < 0 || n7 > 50) continue;
                n6 = g_02.c - P + d;
                if (n6 < 0) {
                    n6 = 0;
                }
                if ((n5 = g_02.d - P + d) > 50) {
                    n5 = 50;
                }
                n4 = 0;
                while (n6 <= n5) {
                    if (!as[n7][n6++]) continue;
                    n4 = 1;
                    break;
                }
                if (n4 == 0) continue;
                n3 = j - g_02.f;
                if (n3 > 32) {
                    g_02.l = 1;
                } else {
                    if (n3 >= -32) continue;
                    g_02.l = 2;
                    n3 = -n3;
                }
                g_02.o = (g_02.h - l << 8) / n3;
                g_02.p = (g_02.i - l << 8) / n3;
                g_02.q = (g_02.j - k << 8) / n3;
                g_02.r = (g_02.k - k << 8) / n3;
                v_0.ac[v_0.ab++] = g_02;
                continue;
            }
            if (g_02.e == 2) {
                n7 = g_02.c - P + d;
                if (n7 < 0 || n7 > 50) continue;
                n6 = g_02.a - O + d;
                if (n6 < 0) {
                    n6 = 0;
                }
                if ((n5 = g_02.b - O + d) > 50) {
                    n5 = 50;
                }
                n4 = 0;
                while (n6 <= n5) {
                    if (!as[n6++][n7]) continue;
                    n4 = 1;
                    break;
                }
                if (n4 == 0) continue;
                n3 = l - g_02.h;
                if (n3 > 32) {
                    g_02.l = 3;
                } else {
                    if (n3 >= -32) continue;
                    g_02.l = 4;
                    n3 = -n3;
                }
                g_02.m = (g_02.f - j << 8) / n3;
                g_02.n = (g_02.g - j << 8) / n3;
                g_02.q = (g_02.j - k << 8) / n3;
                g_02.r = (g_02.k - k << 8) / n3;
                v_0.ac[v_0.ab++] = g_02;
                continue;
            }
            if (g_02.e != 4 || (n7 = g_02.j - k) <= 128) continue;
            n6 = g_02.c - P + e;
            if (n6 < 0) {
                n6 = 0;
            }
            if ((n5 = g_02.d - P + e) > 50) {
                n5 = 50;
            }
            if (n6 > n5) continue;
            n4 = g_02.a - O + e;
            if (n4 < 0) {
                n4 = 0;
            }
            if ((n3 = g_02.b - O + e) > 50) {
                n3 = 50;
            }
            boolean bl = false;
            block3: for (int i3 = n4; i3 <= n3; ++i3) {
                for (int i4 = n6; i4 <= n5; ++i4) {
                    if (!as[i3][i4]) continue;
                    bl = true;
                    break block3;
                }
            }
            if (!bl) continue;
            g_02.l = 5;
            g_02.m = (g_02.f - j << 8) / n7;
            g_02.n = (g_02.g - j << 8) / n7;
            g_02.o = (g_02.h - l << 8) / n7;
            g_02.p = (g_02.i - l << 8) / n7;
            v_0.ac[v_0.ab++] = g_02;
        }
    }

    private boolean s(int n2, int n3, int n4) {
        int n5 = this.G[n2][n3][n4];
        if (n5 == -J) {
            return false;
        }
        if (n5 == J) {
            return true;
        }
        int n6 = n3 << 7;
        int n7 = n4 << 7;
        if (this.t(n6 + 1, this.B[n2][n3][n4], n7 + 1) && this.t(n6 + 128 - 1, this.B[n2][n3 + 1][n4], n7 + 1) && this.t(n6 + 128 - 1, this.B[n2][n3 + 1][n4 + 1], n7 + 128 - 1) && this.t(n6 + 1, this.B[n2][n3][n4 + 1], n7 + 128 - 1)) {
            this.G[n2][n3][n4] = J;
            return true;
        }
        this.G[n2][n3][n4] = -J;
        return false;
    }

    private boolean e(int n2, int n3, int n4, int n5) {
        if (!this.s(n2, n3, n4)) {
            return false;
        }
        int n6 = n3 << 7;
        int n7 = n4 << 7;
        int n8 = this.B[n2][n3][n4] - 1;
        int n9 = n8 - 120;
        int n10 = n8 - 230;
        int n11 = n8 - 238;
        if (n5 < 16) {
            if (n5 == 1) {
                if (n6 > j) {
                    if (!this.t(n6, n8, n7)) {
                        return false;
                    }
                    if (!this.t(n6, n8, n7 + 128)) {
                        return false;
                    }
                }
                if (n2 > 0) {
                    if (!this.t(n6, n9, n7)) {
                        return false;
                    }
                    if (!this.t(n6, n9, n7 + 128)) {
                        return false;
                    }
                }
                return this.t(n6, n10, n7) && this.t(n6, n10, n7 + 128);
            }
            if (n5 == 2) {
                if (n7 < l) {
                    if (!this.t(n6, n8, n7 + 128)) {
                        return false;
                    }
                    if (!this.t(n6 + 128, n8, n7 + 128)) {
                        return false;
                    }
                }
                if (n2 > 0) {
                    if (!this.t(n6, n9, n7 + 128)) {
                        return false;
                    }
                    if (!this.t(n6 + 128, n9, n7 + 128)) {
                        return false;
                    }
                }
                return this.t(n6, n10, n7 + 128) && this.t(n6 + 128, n10, n7 + 128);
            }
            if (n5 == 4) {
                if (n6 < j) {
                    if (!this.t(n6 + 128, n8, n7)) {
                        return false;
                    }
                    if (!this.t(n6 + 128, n8, n7 + 128)) {
                        return false;
                    }
                }
                if (n2 > 0) {
                    if (!this.t(n6 + 128, n9, n7)) {
                        return false;
                    }
                    if (!this.t(n6 + 128, n9, n7 + 128)) {
                        return false;
                    }
                }
                return this.t(n6 + 128, n10, n7) && this.t(n6 + 128, n10, n7 + 128);
            }
            if (n5 == 8) {
                if (n7 > l) {
                    if (!this.t(n6, n8, n7)) {
                        return false;
                    }
                    if (!this.t(n6 + 128, n8, n7)) {
                        return false;
                    }
                }
                if (n2 > 0) {
                    if (!this.t(n6, n9, n7)) {
                        return false;
                    }
                    if (!this.t(n6 + 128, n9, n7)) {
                        return false;
                    }
                }
                return this.t(n6, n10, n7) && this.t(n6 + 128, n10, n7);
            }
        }
        if (!this.t(n6 + 64, n11, n7 + 64)) {
            return false;
        }
        if (n5 == 16) {
            return this.t(n6, n10, n7 + 128);
        }
        if (n5 == 32) {
            return this.t(n6 + 128, n10, n7 + 128);
        }
        if (n5 == 64) {
            return this.t(n6 + 128, n10, n7);
        }
        if (n5 == 128) {
            return this.t(n6, n10, n7);
        }
        System.out.println("Warning unsupported wall type");
        return true;
    }

    private boolean f(int n2, int n3, int n4, int n5) {
        if (!this.s(n2, n3, n4)) {
            return false;
        }
        int n6 = n3 << 7;
        int n7 = n4 << 7;
        return this.t(n6 + 1, this.B[n2][n3][n4] - n5, n7 + 1) && this.t(n6 + 128 - 1, this.B[n2][n3 + 1][n4] - n5, n7 + 1) && this.t(n6 + 128 - 1, this.B[n2][n3 + 1][n4 + 1] - n5, n7 + 128 - 1) && this.t(n6 + 1, this.B[n2][n3][n4 + 1] - n5, n7 + 128 - 1);
    }

    private boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        int n9;
        if (n3 == n4 && n5 == n6) {
            if (!this.s(n2, n3, n5)) {
                return false;
            }
            int n10 = n3 << 7;
            int n11 = n5 << 7;
            return this.t(n10 + 1, this.B[n2][n3][n5] - n7, n11 + 1) && this.t(n10 + 128 - 1, this.B[n2][n3 + 1][n5] - n7, n11 + 1) && this.t(n10 + 128 - 1, this.B[n2][n3 + 1][n5 + 1] - n7, n11 + 128 - 1) && this.t(n10 + 1, this.B[n2][n3][n5 + 1] - n7, n11 + 128 - 1);
        }
        for (n9 = n3; n9 <= n4; ++n9) {
            for (n8 = n5; n8 <= n6; ++n8) {
                if (this.G[n2][n9][n8] != -J) continue;
                return false;
            }
        }
        n9 = (n3 << 7) + 1;
        int n12 = this.B[n2][n3][n5] - n7;
        n8 = (n5 << 7) + 2;
        if (!this.t(n9, n12, n8)) {
            return false;
        }
        int n13 = (n4 << 7) - 1;
        if (!this.t(n13, n12, n8)) {
            return false;
        }
        int n14 = (n6 << 7) - 1;
        return this.t(n9, n12, n14) && this.t(n13, n12, n14);
    }

    private boolean t(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < ab; ++i2) {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            g_0 g_02 = ac[i2];
            if (g_02.l == 1) {
                n9 = g_02.f - n2;
                if (n9 <= 0) continue;
                n8 = g_02.h + (g_02.o * n9 >> 8);
                n7 = g_02.i + (g_02.p * n9 >> 8);
                n6 = g_02.j + (g_02.q * n9 >> 8);
                n5 = g_02.k + (g_02.r * n9 >> 8);
                if (n4 < n8 || n4 > n7 || n3 < n6 || n3 > n5) continue;
                return true;
            }
            if (g_02.l == 2) {
                n9 = n2 - g_02.f;
                if (n9 <= 0) continue;
                n8 = g_02.h + (g_02.o * n9 >> 8);
                n7 = g_02.i + (g_02.p * n9 >> 8);
                n6 = g_02.j + (g_02.q * n9 >> 8);
                n5 = g_02.k + (g_02.r * n9 >> 8);
                if (n4 < n8 || n4 > n7 || n3 < n6 || n3 > n5) continue;
                return true;
            }
            if (g_02.l == 3) {
                n9 = g_02.h - n4;
                if (n9 <= 0) continue;
                n8 = g_02.f + (g_02.m * n9 >> 8);
                n7 = g_02.g + (g_02.n * n9 >> 8);
                n6 = g_02.j + (g_02.q * n9 >> 8);
                n5 = g_02.k + (g_02.r * n9 >> 8);
                if (n2 < n8 || n2 > n7 || n3 < n6 || n3 > n5) continue;
                return true;
            }
            if (g_02.l == 4) {
                n9 = n4 - g_02.h;
                if (n9 <= 0) continue;
                n8 = g_02.f + (g_02.m * n9 >> 8);
                n7 = g_02.g + (g_02.n * n9 >> 8);
                n6 = g_02.j + (g_02.q * n9 >> 8);
                n5 = g_02.k + (g_02.r * n9 >> 8);
                if (n2 < n8 || n2 > n7 || n3 < n6 || n3 > n5) continue;
                return true;
            }
            if (g_02.l != 5 || (n9 = n3 - g_02.j) <= 0) continue;
            n8 = g_02.f + (g_02.m * n9 >> 8);
            n7 = g_02.g + (g_02.n * n9 >> 8);
            n6 = g_02.h + (g_02.o * n9 >> 8);
            n5 = g_02.i + (g_02.p * n9 >> 8);
            if (n2 < n8 || n2 > n7 || n4 < n6 || n4 > n5) continue;
            return true;
        }
        return false;
    }

    static {
        e = d = 25;
        f = 500;
        h = true;
        Q = new l[100];
        R = new int[]{53, -53, -53, 53};
        S = new int[]{-53, -53, 53, 53};
        T = new int[]{-45, 45, 45, -45};
        U = new int[]{45, 45, -45, -45};
        r = -1;
        s = -1;
        t = -1;
        u = -1;
        ac = new g_0[500];
        ad = new rs.h();
        ae = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
        af = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
        ag = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
        ah = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
        ai = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
        aj = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
        ak = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
        al = new int[]{41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41};
        ar = new boolean[8][32][51][51];
        Y = 4;
        Z = new int[Y];
        aa = new g_0[Y][500];
    }
}

