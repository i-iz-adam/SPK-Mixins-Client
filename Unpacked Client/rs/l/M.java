/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.l.c;

public class M
extends c {
    public static int q;
    public static int r;
    public static int[] s;
    public static int t;
    public static int u;
    public static int[] v;
    public static int w;
    public static int x;
    public static int[] y;

    public static void f(int n2, int n3, int n4, int n5, int n6) {
        M.h(n2, n3, n4, n6);
        M.h(n2, n3 + n5 - 1, n4, n6);
        M.i(n2, n3, n5, n6);
        M.i(n2 + n4 - 1, n3, n5, n6);
    }

    public static void e() {
        t = 0;
        w = 0;
        r = u;
        x = q;
        M.h();
    }

    public static void g(int n2, int n3, int n4, int n5, int n6) {
        n4 -= n2;
        if ((n5 -= n3) == 0) {
            if (n4 >= 0) {
                M.h(n2, n3, n4 + 1, n6);
            } else {
                M.h(n2 + n4, n3, -n4 + 1, n6);
            }
        } else if (n4 == 0) {
            if (n5 >= 0) {
                M.i(n2, n3, n5 + 1, n6);
            } else {
                M.i(n2, n3 + n5, -n5 + 1, n6);
            }
        } else {
            if (n4 + n5 < 0) {
                n2 += n4;
                n4 = -n4;
                n3 += n5;
                n5 = -n5;
            }
            if (n4 > n5) {
                n3 <<= 16;
                n3 += 32768;
                int n7 = (int)Math.floor((double)(n5 <<= 16) / (double)n4 + 0.5);
                n4 += n2;
                if (n2 < t) {
                    n3 += n7 * (t - n2);
                    n2 = t;
                }
                if (n4 >= r) {
                    n4 = r - 1;
                }
                while (n2 <= n4) {
                    int n8 = n3 >> 16;
                    if (n8 >= w && n8 < x) {
                        M.v[n2 + n8 * n4] = n6;
                    }
                    n3 += n7;
                    ++n2;
                }
            } else {
                n2 <<= 16;
                n2 += 32768;
                int n9 = (int)Math.floor((double)(n4 <<= 16) / (double)n5 + 0.5);
                n5 += n3;
                if (n3 < w) {
                    n2 += n9 * (w - n3);
                    n3 = w;
                }
                if (n5 >= x) {
                    n5 = x - 1;
                }
                while (n3 <= n5) {
                    int n10 = n2 >> 16;
                    if (n10 >= t && n10 < r) {
                        M.v[n10 + n3 * n4] = n6;
                    }
                    n2 += n9;
                    ++n3;
                }
            }
        }
    }

    public static void f() {
        int n2 = 0;
        int n3 = u * q - 7;
        while (n2 < n3) {
            M.v[n2++] = 0;
            M.v[n2++] = 0;
            M.v[n2++] = 0;
            M.v[n2++] = 0;
            M.v[n2++] = 0;
            M.v[n2++] = 0;
            M.v[n2++] = 0;
            M.v[n2++] = 0;
        }
        n3 += 7;
        while (n2 < n3) {
            M.v[n2++] = 0;
        }
    }

    public static void a(int n2, int n3, int n4, int[] nArray, int[] nArray2) {
        int n5 = n2 + n3 * u;
        for (n3 = 0; n3 < nArray.length; ++n3) {
            int n6 = n5 + nArray[n3];
            for (n2 = -nArray2[n3]; n2 < 0; ++n2) {
                M.v[n6++] = n4;
            }
            n5 += u;
        }
    }

    public static void g() {
        v = null;
        s = null;
        y = null;
    }

    public static void h(int n2, int n3, int n4, int n5, int n6) {
        if (n2 >= t && n2 < r) {
            if (n3 < w) {
                n4 -= w - n3;
                n3 = w;
            }
            if (n3 + n4 > x) {
                n4 = x - n3;
            }
            int n7 = 256 - n6;
            int n8 = (n5 >> 16 & 0xFF) * n6;
            int n9 = (n5 >> 8 & 0xFF) * n6;
            int n10 = (n5 & 0xFF) * n6;
            int n11 = n2 + n3 * u;
            for (int i2 = 0; i2 < n4; ++i2) {
                int n12;
                int n13 = (v[n11] >> 16 & 0xFF) * n7;
                int n14 = (v[n11] >> 8 & 0xFF) * n7;
                int n15 = (v[n11] & 0xFF) * n7;
                M.v[n11] = n12 = (n8 + n13 >> 8 << 16) + (n9 + n14 >> 8 << 8) + (n10 + n15 >> 8);
                n11 += u;
            }
        }
    }

    public static void a(int[] nArray) {
        t = nArray[0];
        w = nArray[1];
        r = nArray[2];
        x = nArray[3];
        M.h();
    }

    public static void b(int n2, int n3, int n4) {
        if (n2 >= t && n3 >= w && n2 < r && n3 < x) {
            M.v[n2 + n3 * M.u] = n4;
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        if (nArray.length != x - w || nArray2.length != x - w) {
            throw new IllegalArgumentException();
        }
        s = nArray;
        y = nArray2;
    }

    public static void e(int n2, int n3, int n4, int n5) {
        if (n4 == 0) {
            M.b(n2, n3, n5);
        } else {
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            if (n4 < 0) {
                n4 = -n4;
            }
            if ((n11 = n3 - n4) < w) {
                n11 = w;
            }
            if ((n10 = n3 + n4 + 1) > x) {
                n10 = x;
            }
            int n12 = n11;
            int n13 = n4 * n4;
            int n14 = 0;
            int n15 = n3 - n12;
            int n16 = n15 * n15;
            int n17 = n16 - n15;
            if (n3 > n10) {
                n3 = n10;
            }
            while (n12 < n3) {
                while (n17 <= n13 || n16 <= n13) {
                    n16 += n14 + n14;
                    n17 += n14++ + n14;
                }
                n9 = n2 - n14 + 1;
                if (n9 < t) {
                    n9 = t;
                }
                if ((n8 = n2 + n14) > r) {
                    n8 = r;
                }
                n7 = n9 + n12 * u;
                for (n6 = n9; n6 < n8; ++n6) {
                    M.v[n7++] = n5;
                }
                ++n12;
                n16 -= n15-- + n15;
                n17 -= n15 + n15;
            }
            n14 = n4;
            n15 = n12 - n3;
            n17 = n15 * n15 + n13;
            n16 = n17 - n14;
            n17 -= n15;
            while (n12 < n10) {
                while (n17 > n13 && n16 > n13) {
                    n17 -= n14-- + n14;
                    n16 -= n14 + n14;
                }
                n9 = n2 - n14;
                if (n9 < t) {
                    n9 = t;
                }
                if ((n8 = n2 + n14) > r - 1) {
                    n8 = r - 1;
                }
                n7 = n9 + n12 * u;
                for (n6 = n9; n6 <= n8; ++n6) {
                    M.v[n7++] = n5;
                }
                ++n12;
                n17 += n15 + n15;
                n16 += n15++ + n15;
            }
        }
    }

    public static void f(int n2, int n3, int n4, int n5) {
        if (t < n2) {
            t = n2;
        }
        if (w < n3) {
            w = n3;
        }
        if (r > n4) {
            r = n4;
        }
        if (x > n5) {
            x = n5;
        }
        M.h();
    }

    public static void g(int n2, int n3, int n4, int n5) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        if (n4 > u) {
            n4 = u;
        }
        if (n5 > q) {
            n5 = q;
        }
        t = n2;
        w = n3;
        r = n4;
        x = n5;
        M.h();
    }

    public static void h(int n2, int n3, int n4, int n5) {
        if (n3 >= w && n3 < x) {
            if (n2 < t) {
                n4 -= t - n2;
                n2 = t;
            }
            if (n2 + n4 > r) {
                n4 = r - n2;
            }
            int n6 = n2 + n3 * u;
            for (int i2 = 0; i2 < n4; ++i2) {
                M.v[n6 + i2] = n5;
            }
        }
    }

    public static void i(int n2, int n3, int n4, int n5, int n6) {
        if (n3 >= w && n3 < x) {
            if (n2 < t) {
                n4 -= t - n2;
                n2 = t;
            }
            if (n2 + n4 > r) {
                n4 = r - n2;
            }
            int n7 = 256 - n6;
            int n8 = (n5 >> 16 & 0xFF) * n6;
            int n9 = (n5 >> 8 & 0xFF) * n6;
            int n10 = (n5 & 0xFF) * n6;
            int n11 = n2 + n3 * u;
            for (int i2 = 0; i2 < n4; ++i2) {
                int n12 = (v[n11] >> 16 & 0xFF) * n7;
                int n13 = (v[n11] >> 8 & 0xFF) * n7;
                int n14 = (v[n11] & 0xFF) * n7;
                int n15 = (n8 + n12 >> 8 << 16) + (n9 + n13 >> 8 << 8) + (n10 + n14 >> 8);
                M.v[n11++] = n15;
            }
        }
    }

    public static void i(int n2, int n3, int n4, int n5) {
        if (n2 >= t && n2 < r) {
            if (n3 < w) {
                n4 -= w - n3;
                n3 = w;
            }
            if (n3 + n4 > x) {
                n4 = x - n3;
            }
            int n6 = n2 + n3 * u;
            for (int i2 = 0; i2 < n4; ++i2) {
                M.v[n6 + i2 * M.u] = n5;
            }
        }
    }

    public static void b(int[] nArray, int n2, int n3) {
        v = nArray;
        u = n2;
        q = n3;
        M.g(0, 0, n2, n3);
    }

    public static void g(int n2, int n3, int n4, int n5, int n6, int n7) {
        M.i(n2, n3, n4, n6, n7);
        M.i(n2, n3 + n5 - 1, n4, n6, n7);
        if (n5 >= 3) {
            M.h(n2, n3 + 1, n5 - 2, n6, n7);
            M.h(n2 + n4 - 1, n3 + 1, n5 - 2, n6, n7);
        }
    }

    public static void j(int n2, int n3, int n4, int n5, int n6) {
        if (n6 != 0) {
            if (n6 == 256) {
                M.e(n2, n3, n4, n5);
            } else {
                int n7;
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                int n13;
                int n14;
                int n15;
                if (n4 < 0) {
                    n4 = -n4;
                }
                int n16 = 256 - n6;
                int n17 = (n5 >> 16 & 0xFF) * n6;
                int n18 = (n5 >> 8 & 0xFF) * n6;
                int n19 = (n5 & 0xFF) * n6;
                int n20 = n3 - n4;
                if (n20 < w) {
                    n20 = w;
                }
                if ((n15 = n3 + n4 + 1) > x) {
                    n15 = x;
                }
                int n21 = n20;
                int n22 = n4 * n4;
                int n23 = 0;
                int n24 = n3 - n21;
                int n25 = n24 * n24;
                int n26 = n25 - n24;
                if (n3 > n15) {
                    n3 = n15;
                }
                while (n21 < n3) {
                    while (n26 <= n22 || n25 <= n22) {
                        n25 += n23 + n23;
                        n26 += n23++ + n23;
                    }
                    n14 = n2 - n23 + 1;
                    if (n14 < t) {
                        n14 = t;
                    }
                    if ((n13 = n2 + n23) > r) {
                        n13 = r;
                    }
                    n12 = n14 + n21 * u;
                    for (n11 = n14; n11 < n13; ++n11) {
                        n10 = (v[n12] >> 16 & 0xFF) * n16;
                        n9 = (v[n12] >> 8 & 0xFF) * n16;
                        n8 = (v[n12] & 0xFF) * n16;
                        n7 = (n17 + n10 >> 8 << 16) + (n18 + n9 >> 8 << 8) + (n19 + n8 >> 8);
                        M.v[n12++] = n7;
                    }
                    ++n21;
                    n25 -= n24-- + n24;
                    n26 -= n24 + n24;
                }
                n23 = n4;
                n24 = -n24;
                n26 = n24 * n24 + n22;
                n25 = n26 - n23;
                n26 -= n24;
                while (n21 < n15) {
                    while (n26 > n22 && n25 > n22) {
                        n26 -= n23-- + n23;
                        n25 -= n23 + n23;
                    }
                    n14 = n2 - n23;
                    if (n14 < t) {
                        n14 = t;
                    }
                    if ((n13 = n2 + n23) > r - 1) {
                        n13 = r - 1;
                    }
                    n12 = n14 + n21 * u;
                    for (n11 = n14; n11 <= n13; ++n11) {
                        n10 = (v[n12] >> 16 & 0xFF) * n16;
                        n9 = (v[n12] >> 8 & 0xFF) * n16;
                        n8 = (v[n12] & 0xFF) * n16;
                        n7 = (n17 + n10 >> 8 << 16) + (n18 + n9 >> 8 << 8) + (n19 + n8 >> 8);
                        M.v[n12++] = n7;
                    }
                    ++n21;
                    n26 += n24 + n24;
                    n25 += n24++ + n24;
                }
            }
        }
    }

    public static void h(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 < t) {
            n4 -= t - n2;
            n2 = t;
        }
        if (n3 < w) {
            n5 -= w - n3;
            n3 = w;
        }
        if (n2 + n4 > r) {
            n4 = r - n2;
        }
        if (n3 + n5 > x) {
            n5 = x - n3;
        }
        n6 = ((n6 & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((n6 & 0xFF00) * n7 >> 8 & 0xFF00);
        int n8 = 256 - n7;
        int n9 = u - n4;
        int n10 = n2 + n3 * u;
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = -n4; i3 < 0; ++i3) {
                int n11 = v[n10];
                n11 = ((n11 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n11 & 0xFF00) * n8 >> 8 & 0xFF00);
                M.v[n10++] = n6 + n11;
            }
            n10 += n9;
        }
    }

    public static void b(int[] nArray) {
        nArray[0] = t;
        nArray[1] = w;
        nArray[2] = r;
        nArray[3] = x;
    }

    public static void i(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = 0;
        int n9 = 65536 / n5;
        if (n2 < t) {
            n4 -= t - n2;
            n2 = t;
        }
        if (n3 < w) {
            n8 += (w - n3) * n9;
            n5 -= w - n3;
            n3 = w;
        }
        if (n2 + n4 > r) {
            n4 = r - n2;
        }
        if (n3 + n5 > x) {
            n5 = x - n3;
        }
        int n10 = u - n4;
        int n11 = n2 + n3 * u;
        for (int i2 = -n5; i2 < 0; ++i2) {
            int n12 = 65536 - n8 >> 8;
            int n13 = n8 >> 8;
            int n14 = ((n6 & 0xFF00FF) * n12 + (n7 & 0xFF00FF) * n13 & 0xFF00FF00) + ((n6 & 0xFF00) * n12 + (n7 & 0xFF00) * n13 & 0xFF0000) >>> 8;
            for (int i3 = -n4; i3 < 0; ++i3) {
                M.v[n11++] = n14;
            }
            n11 += n10;
            n8 += n9;
        }
    }

    public static void h() {
        s = null;
        y = null;
    }

    public static void k(int n2, int n3, int n4, int n5, int n6) {
        if (n2 < t) {
            n4 -= t - n2;
            n2 = t;
        }
        if (n3 < w) {
            n5 -= w - n3;
            n3 = w;
        }
        if (n2 + n4 > r) {
            n4 = r - n2;
        }
        if (n3 + n5 > x) {
            n5 = x - n3;
        }
        int n7 = u - n4;
        int n8 = n2 + n3 * u;
        for (int i2 = -n5; i2 < 0; ++i2) {
            for (int i3 = -n4; i3 < 0; ++i3) {
                M.v[n8++] = n6;
            }
            n8 += n7;
        }
    }

    static {
        x = 0;
        r = 0;
        t = 0;
        w = 0;
    }
}

