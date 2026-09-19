/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.k.e;

/*
 * Renamed from rs.I
 */
public final class i_0 {
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public final int[] d;
    public final int[] e;
    public final int[] f;
    public final int[] g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public final int[] k;
    public final int[] l;
    int[] m;
    public final boolean n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public static final int[] s = new int[6];
    public static final int[] t = new int[6];
    public static final int[] u = new int[6];
    public static final int[] v = new int[6];
    public static final int[] w = new int[6];
    public static final int[] x = new int[6];
    public static final int[] y = new int[]{1, 0};
    public static final int[] z = new int[]{2, 1};
    public static final int[] A = new int[]{3, 3};
    private static final int[][] B = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
    private static final int[][] C = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};

    public void a(int n2) {
        this.a = n2;
    }

    public void b(int n2) {
        this.b = n2;
    }

    public void c(int n2) {
        this.c = n2;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int[] d() {
        return this.d;
    }

    public int[] e() {
        return this.e;
    }

    public int[] f() {
        return this.f;
    }

    public int[] g() {
        return rs.k.e.a ? this.m : null;
    }

    public int[] h() {
        return this.j;
    }

    public int[] i() {
        return this.k;
    }

    public int[] j() {
        return this.l;
    }

    public int[] k() {
        return this.g;
    }

    public int[] l() {
        return this.h;
    }

    public int[] m() {
        return this.i;
    }

    public i_0(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20) {
        int n21;
        int n22;
        int n23;
        int n24;
        int n25;
        int n26;
        this.n = n14 == n13 && n14 == n5 && n14 == n12;
        this.o = n15;
        this.p = n8;
        this.q = n10;
        this.r = n20;
        int n27 = 128;
        int n28 = n27 / 2;
        int n29 = n27 / 4;
        int n30 = n27 * 3 / 4;
        int[] nArray = B[n15];
        int n31 = nArray.length;
        this.d = new int[n31];
        this.e = new int[n31];
        this.f = new int[n31];
        int[] nArray2 = new int[n31];
        int[] nArray3 = new int[n31];
        int n32 = n19 * n27;
        int n33 = n2 * n27;
        for (int i2 = 0; i2 < n31; ++i2) {
            n26 = nArray[i2];
            if ((n26 & 1) == 0 && n26 <= 8) {
                n26 = (n26 - n8 - n8 - 1 & 7) + 1;
            }
            if (n26 > 8 && n26 <= 12) {
                n26 = (n26 - 9 - n8 & 3) + 9;
            }
            if (n26 > 12 && n26 <= 16) {
                n26 = (n26 - 13 - n8 & 3) + 13;
            }
            if (n26 == 1) {
                n25 = n32;
                n24 = n33;
                n23 = n14;
                n22 = n9;
                n21 = n3;
            } else if (n26 == 2) {
                n25 = n32 + n28;
                n24 = n33;
                n23 = n14 + n13 >> 1;
                n22 = n9 + n18 >> 1;
                n21 = n3 + n17 >> 1;
            } else if (n26 == 3) {
                n25 = n32 + n27;
                n24 = n33;
                n23 = n13;
                n22 = n18;
                n21 = n17;
            } else if (n26 == 4) {
                n25 = n32 + n27;
                n24 = n33 + n28;
                n23 = n13 + n5 >> 1;
                n22 = n18 + n11 >> 1;
                n21 = n17 + n7 >> 1;
            } else if (n26 == 5) {
                n25 = n32 + n27;
                n24 = n33 + n27;
                n23 = n5;
                n22 = n11;
                n21 = n7;
            } else if (n26 == 6) {
                n25 = n32 + n28;
                n24 = n33 + n27;
                n23 = n5 + n12 >> 1;
                n22 = n11 + n4 >> 1;
                n21 = n7 + n16 >> 1;
            } else if (n26 == 7) {
                n25 = n32;
                n24 = n33 + n27;
                n23 = n12;
                n22 = n4;
                n21 = n16;
            } else if (n26 == 8) {
                n25 = n32;
                n24 = n33 + n28;
                n23 = n12 + n14 >> 1;
                n22 = n4 + n9 >> 1;
                n21 = n16 + n3 >> 1;
            } else if (n26 == 9) {
                n25 = n32 + n28;
                n24 = n33 + n29;
                n23 = n14 + n13 >> 1;
                n22 = n9 + n18 >> 1;
                n21 = n3 + n17 >> 1;
            } else if (n26 == 10) {
                n25 = n32 + n30;
                n24 = n33 + n28;
                n23 = n13 + n5 >> 1;
                n22 = n18 + n11 >> 1;
                n21 = n17 + n7 >> 1;
            } else if (n26 == 11) {
                n25 = n32 + n28;
                n24 = n33 + n30;
                n23 = n5 + n12 >> 1;
                n22 = n11 + n4 >> 1;
                n21 = n7 + n16 >> 1;
            } else if (n26 == 12) {
                n25 = n32 + n29;
                n24 = n33 + n28;
                n23 = n12 + n14 >> 1;
                n22 = n4 + n9 >> 1;
                n21 = n16 + n3 >> 1;
            } else if (n26 == 13) {
                n25 = n32 + n29;
                n24 = n33 + n29;
                n23 = n14;
                n22 = n9;
                n21 = n3;
            } else if (n26 == 14) {
                n25 = n32 + n30;
                n24 = n33 + n29;
                n23 = n13;
                n22 = n18;
                n21 = n17;
            } else if (n26 == 15) {
                n25 = n32 + n30;
                n24 = n33 + n30;
                n23 = n5;
                n22 = n11;
                n21 = n7;
            } else {
                n25 = n32 + n29;
                n24 = n33 + n30;
                n23 = n12;
                n22 = n4;
                n21 = n16;
            }
            this.d[i2] = n25;
            this.e[i2] = n23;
            this.f[i2] = n24;
            nArray2[i2] = n22;
            nArray3[i2] = n21;
        }
        int[] nArray4 = C[n15];
        n26 = nArray4.length / 4;
        this.j = new int[n26];
        this.k = new int[n26];
        this.l = new int[n26];
        this.g = new int[n26];
        this.h = new int[n26];
        this.i = new int[n26];
        if (n6 != -1) {
            this.m = new int[n26];
        }
        n25 = 0;
        for (n24 = 0; n24 < n26; ++n24) {
            n23 = nArray4[n25];
            n22 = nArray4[n25 + 1];
            n21 = nArray4[n25 + 2];
            int n34 = nArray4[n25 + 3];
            n25 += 4;
            if (n22 < 4) {
                n22 = n22 - n8 & 3;
            }
            if (n21 < 4) {
                n21 = n21 - n8 & 3;
            }
            if (n34 < 4) {
                n34 = n34 - n8 & 3;
            }
            this.j[n24] = n22;
            this.k[n24] = n21;
            this.l[n24] = n34;
            if (n23 == 0) {
                this.g[n24] = nArray2[n22];
                this.h[n24] = nArray2[n21];
                this.i[n24] = nArray2[n34];
                if (this.m == null) continue;
                this.m[n24] = -1;
                continue;
            }
            this.g[n24] = nArray3[n22];
            this.h[n24] = nArray3[n21];
            this.i[n24] = nArray3[n34];
            if (this.m == null) continue;
            this.m[n24] = n6;
        }
        n24 = n14;
        n23 = n13;
        if (n13 < n24) {
            n24 = n13;
        }
        if (n13 > n23) {
            n23 = n13;
        }
        if (n5 < n24) {
            n24 = n5;
        }
        if (n5 > n23) {
            n23 = n5;
        }
        if (n12 < n24) {
            n24 = n12;
        }
        if (n12 > n23) {
            n23 = n12;
        }
        n24 /= 14;
        n23 /= 14;
    }
}

