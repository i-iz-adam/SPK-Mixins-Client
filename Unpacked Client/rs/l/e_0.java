/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.i.a.i
 */
package rs.l;

import gnu.trove.i.a.i;
import rs.Client;
import rs.gui.Launcher;
import rs.k.e;
import rs.l.a;
import rs.l.b_0;
import rs.l.c;
import rs.x.f;

/*
 * Renamed from rs.l.E
 */
public final class e_0
extends b_0 {
    public static int f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static double j;
    private static final i C;
    public static float[] k;
    public static final int l = 340;
    public static final int m = -477;
    public static boolean n;
    public static boolean o;
    private static boolean D;
    public static boolean p;
    public static boolean q;
    public static int r;
    public static int s;
    public static int t;
    private static int[] E;
    public static final int[] u;
    public static int[] v;
    public static int[] w;
    public static int[] x;
    private static int F;
    public static a[] y;
    private static boolean[] G;
    private static int[] H;
    private static int I;
    private static int[][] J;
    private static int[][] K;
    public static int[] z;
    public static int A;
    public static int[] B;
    private static int[][] L;

    public static double c() {
        return j;
    }

    public static void a(double d2) {
        j = d2;
    }

    public static int d() {
        return Client.aj + 4 + (Client.ak + 4) * 765;
    }

    public static boolean a(int n2) {
        return false;
    }

    public static void e() {
        E = null;
        E = null;
        v = null;
        w = null;
        x = null;
        y = null;
        G = null;
        H = null;
        J = null;
        K = null;
        z = null;
        B = null;
        L = null;
    }

    public static int a(int n2, int n3, int n4, int n5) {
        return n2 * n3 + n4 * n4;
    }

    public static int a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        int n13 = n4 - n2;
        int n14 = n5 - n3;
        int n15 = n6 - n2;
        int n16 = n7 - n3;
        int n17 = n11 - n2;
        int n18 = n12 - n3;
        float f2 = e_0.a(n13, n13, n14, n14);
        float f3 = e_0.a(n13, n15, n14, n16);
        float f4 = e_0.a(n15, n15, n16, n16);
        float f5 = e_0.a(n17, n13, n18, n14);
        float f6 = e_0.a(n17, n15, n18, n16);
        float f7 = f2 * f4 - f3 * f3;
        float f8 = (f4 * f5 - f3 * f6) / f7;
        float f9 = (f2 * f6 - f3 * f5) / f7;
        float f10 = 1.0f - f8 - f9;
        return (int)(f10 * (float)n8 + f8 * (float)n9 + f9 * (float)n10);
    }

    public static void f() {
        x = new int[rs.l.c.i];
        for (int i2 = 0; i2 < rs.l.c.i; ++i2) {
            e_0.x[i2] = rs.l.c.h * i2;
        }
        s = rs.l.c.h / 2;
        t = rs.l.c.i / 2;
    }

    public static void a(int n2, int n3) {
        x = new int[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            e_0.x[i2] = n2 * i2;
        }
        s = n2 / 2;
        t = n3 / 2;
    }

    public static void g() {
        J = null;
        for (int i2 = 0; i2 < 340; ++i2) {
            e_0.K[i2] = null;
        }
    }

    public static void h() {
        if (J == null) {
            I = 20;
            J = n ? new int[I][16384] : new int[I][65536];
            for (int i2 = 0; i2 < 340; ++i2) {
                e_0.K[i2] = null;
            }
        }
    }

    public static void a(f f2) {
        F = 0;
        for (int i2 = 0; i2 < 340; ++i2) {
            try {
                e_0.y[i2] = new a(f2, String.valueOf(i2), 0);
                if (e_0.y[i2].n * e_0.y[i2].o > 16384) {
                    if (rs.f.a.f.booleanValue()) {
                        System.out.println("[!!!] Invalid texture size (too big) for ID " + i2 + ": " + e_0.y[i2].n + "x" + e_0.y[i2].o + " (replacing it to texture ID 0)");
                    }
                    e_0.y[i2] = null;
                    e_0.y[i2] = y[0];
                }
                if (n && e_0.y[i2].n == 128) {
                    y[i2].e();
                } else {
                    y[i2].f();
                }
                ++F;
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static int b(int n2) {
        int n3;
        if (H[n2] != 0) {
            return H[n2];
        }
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = L[n2].length;
        for (n3 = 0; n3 < n7; ++n3) {
            n4 += L[n2][n3] >> 16 & 0xFF;
            n5 += L[n2][n3] >> 8 & 0xFF;
            n6 += L[n2][n3] & 0xFF;
        }
        n3 = (n4 / n7 << 16) + (n5 / n7 << 8) + n6 / n7;
        if ((n3 = e_0.a(n3, 1.4)) == 0) {
            n3 = 1;
        }
        e_0.H[n2] = n3;
        return n3;
    }

    public static void c(int n2) {
        if (K[n2] == null) {
            return;
        }
        e_0.J[e_0.I++] = K[n2];
        e_0.K[n2] = null;
    }

    public static int[] d(int n2) {
        int n3;
        int[] nArray;
        ++A;
        if (K[n2] != null) {
            return K[n2];
        }
        if (I > 0 && J != null) {
            nArray = J[--I];
            e_0.J[e_0.I] = null;
        } else {
            int n4 = 0;
            int n5 = -1;
            for (n3 = 0; n3 < F; ++n3) {
                if (K[n3] == null || z[n3] >= n4 && n5 != -1) continue;
                n4 = z[n3];
                n5 = n3;
            }
            nArray = K[n5];
            e_0.K[n5] = null;
        }
        e_0.K[n2] = nArray;
        a a2 = y[n2];
        int[] nArray2 = L[n2];
        if (n) {
            e_0.G[n2] = false;
            for (n3 = 0; n3 < 4096; ++n3) {
                nArray[n3] = nArray2[a2.i[n3]] & 0xF8F8FF;
                int n6 = nArray[n3];
                if (n6 == 0) {
                    e_0.G[n2] = true;
                }
                nArray[4096 + n3] = n6 - (n6 >>> 3) & 0xF8F8FF;
                nArray[8192 + n3] = n6 - (n6 >>> 2) & 0xF8F8FF;
                nArray[12288 + n3] = n6 - (n6 >>> 2) - (n6 >>> 3) & 0xF8F8FF;
            }
        } else {
            int n7;
            if (a2.j == 64) {
                for (n3 = 0; n3 < 128; ++n3) {
                    for (n7 = 0; n7 < 128; ++n7) {
                        nArray[n7 + (n3 << 7)] = nArray2[a2.i[(n7 >> 1) + (n3 >> 1 << 6)]];
                    }
                }
            } else {
                for (n3 = 0; n3 < 16384; ++n3) {
                    nArray[n3] = nArray2[a2.i[n3]];
                }
            }
            e_0.G[n2] = false;
            for (n3 = 0; n3 < 16384; ++n3) {
                int n8 = n3;
                nArray[n8] = nArray[n8] & 0xF8F8FF;
                n7 = nArray[n3];
                if (n7 == 0) {
                    e_0.G[n2] = true;
                }
                nArray[16384 + n3] = n7 - (n7 >>> 3) & 0xF8F8FF;
                nArray[32768 + n3] = n7 - (n7 >>> 2) & 0xF8F8FF;
                nArray[49152 + n3] = n7 - (n7 >>> 2) - (n7 >>> 3) & 0xF8F8FF;
            }
        }
        return nArray;
    }

    public static void b(double d2) {
        int n2;
        j = d2;
        d2 += Math.random() * 0.03 - 0.015;
        int n3 = 0;
        for (n2 = 0; n2 < 512; ++n2) {
            double d3 = (double)(n2 / 8) / 64.0 + 0.0078125;
            double d4 = (double)(n2 & 7) / 8.0 + 0.0625;
            for (int i2 = 0; i2 < 128; ++i2) {
                double d5;
                double d6 = d5 = (double)i2 / 128.0;
                double d7 = d5;
                double d8 = d5;
                if (d4 != 0.0) {
                    double d9 = d5 < 0.5 ? d5 * (1.0 + d4) : d5 + d4 - d5 * d4;
                    double d10 = 2.0 * d5 - d9;
                    double d11 = d3 + 0.3333333333333333;
                    if (d11 > 1.0) {
                        d11 -= 1.0;
                    }
                    double d12 = d3;
                    double d13 = d3 - 0.3333333333333333;
                    if (d13 < 0.0) {
                        d13 += 1.0;
                    }
                    d6 = 6.0 * d11 < 1.0 ? d10 + (d9 - d10) * 6.0 * d11 : (2.0 * d11 < 1.0 ? d9 : (3.0 * d11 < 2.0 ? d10 + (d9 - d10) * (0.6666666666666666 - d11) * 6.0 : d10));
                    d7 = 6.0 * d12 < 1.0 ? d10 + (d9 - d10) * 6.0 * d12 : (2.0 * d12 < 1.0 ? d9 : (3.0 * d12 < 2.0 ? d10 + (d9 - d10) * (0.6666666666666666 - d12) * 6.0 : d10));
                    d8 = 6.0 * d13 < 1.0 ? d10 + (d9 - d10) * 6.0 * d13 : (2.0 * d13 < 1.0 ? d9 : (3.0 * d13 < 2.0 ? d10 + (d9 - d10) * (0.6666666666666666 - d13) * 6.0 : d10));
                }
                int n4 = (int)(d6 * 256.0);
                int n5 = (int)(d7 * 256.0);
                int n6 = (int)(d8 * 256.0);
                int n7 = (n4 << 16) + (n5 << 8) + n6;
                if ((n7 = e_0.a(n7, d2)) == 0) {
                    n7 = 1;
                }
                e_0.B[n3++] = n7;
            }
        }
        for (n2 = 0; n2 < 340; ++n2) {
            if (y[n2] == null) continue;
            int[] nArray = e_0.y[n2].h;
            e_0.L[n2] = new int[nArray.length];
            for (int i3 = 0; i3 < nArray.length; ++i3) {
                e_0.L[n2][i3] = e_0.a(nArray[i3], d2);
                if ((L[n2][i3] & 0xF8F8FF) != 0 || i3 == 0) continue;
                e_0.L[n2][i3] = 1;
            }
        }
        for (n2 = 0; n2 < 340; ++n2) {
            e_0.c(n2);
        }
    }

    public static int a(int n2, double d2) {
        double d3 = (double)(n2 >> 16) / 256.0;
        double d4 = (double)(n2 >> 8 & 0xFF) / 256.0;
        double d5 = (double)(n2 & 0xFF) / 256.0;
        d3 = Math.pow(d3, d2);
        d4 = Math.pow(d4, d2);
        d5 = Math.pow(d5, d2);
        int n3 = (int)(d3 * 256.0);
        int n4 = (int)(d4 * 256.0);
        int n5 = (int)(d5 * 256.0);
        return (n3 << 16) + (n4 << 8) + n5;
    }

    public static int a(int n2, byte by, byte by2, byte by3, byte by4) {
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

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        if ((i || rs.k.e.a()) && p) {
            e_0.c(n2, n3, n4, n5, n6, n7, n8, n9, n10);
        } else {
            e_0.b(n2, n3, n4, n5, n6, n7, n8, n9, n10);
        }
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        if (rs.k.e.a() && !h) {
            return;
        }
        int n11 = 0;
        int n12 = 0;
        if (n3 != n2) {
            n11 = (n6 - n5 << 16) / (n3 - n2);
            n12 = (n9 - n8 << 15) / (n3 - n2);
        }
        int n13 = 0;
        int n14 = 0;
        if (n4 != n3) {
            n13 = (n7 - n6 << 16) / (n4 - n3);
            n14 = (n10 - n9 << 15) / (n4 - n3);
        }
        int n15 = 0;
        int n16 = 0;
        if (n4 != n2) {
            n15 = (n5 - n7 << 16) / (n2 - n4);
            n16 = (n8 - n10 << 15) / (n2 - n4);
        }
        if (n2 <= n3 && n2 <= n4) {
            if (n2 >= rs.l.c.k) {
                return;
            }
            if (n3 > rs.l.c.k) {
                n3 = rs.l.c.k;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n3 < n4) {
                n7 = n5 <<= 16;
                n10 = n8 <<= 15;
                if (n2 < 0) {
                    n7 -= n15 * n2;
                    n5 -= n11 * n2;
                    n10 -= n16 * n2;
                    n8 -= n12 * n2;
                    n2 = 0;
                }
                n6 <<= 16;
                n9 <<= 15;
                if (n3 < 0) {
                    n6 -= n13 * n3;
                    n9 -= n14 * n3;
                    n3 = 0;
                }
                if (n2 != n3 && n15 < n11 || n2 == n3 && n15 > n13) {
                    n4 -= n3;
                    n3 -= n2;
                    n2 = x[n2];
                    while (--n3 >= 0) {
                        e_0.a(rs.l.c.g, n2, n7 >> 16, n5 >> 16, n10 >> 7, n8 >> 7);
                        n7 += n15;
                        n5 += n11;
                        n10 += n16;
                        n8 += n12;
                        n2 += rs.l.c.h;
                    }
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n2, n7 >> 16, n6 >> 16, n10 >> 7, n9 >> 7);
                        n7 += n15;
                        n6 += n13;
                        n10 += n16;
                        n9 += n14;
                        n2 += rs.l.c.h;
                    }
                    return;
                }
                n4 -= n3;
                n3 -= n2;
                n2 = x[n2];
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n5 >> 16, n7 >> 16, n8 >> 7, n10 >> 7);
                    n7 += n15;
                    n5 += n11;
                    n10 += n16;
                    n8 += n12;
                    n2 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n6 >> 16, n7 >> 16, n9 >> 7, n10 >> 7);
                    n7 += n15;
                    n6 += n13;
                    n10 += n16;
                    n9 += n14;
                    n2 += rs.l.c.h;
                }
                return;
            }
            n6 = n5 <<= 16;
            n9 = n8 <<= 15;
            if (n2 < 0) {
                n6 -= n15 * n2;
                n5 -= n11 * n2;
                n9 -= n16 * n2;
                n8 -= n12 * n2;
                n2 = 0;
            }
            n7 <<= 16;
            n10 <<= 15;
            if (n4 < 0) {
                n7 -= n13 * n4;
                n10 -= n14 * n4;
                n4 = 0;
            }
            if (n2 != n4 && n15 < n11 || n2 == n4 && n13 > n11) {
                n3 -= n4;
                n4 -= n2;
                n2 = x[n2];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n6 >> 16, n5 >> 16, n9 >> 7, n8 >> 7);
                    n6 += n15;
                    n5 += n11;
                    n9 += n16;
                    n8 += n12;
                    n2 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n7 >> 16, n5 >> 16, n10 >> 7, n8 >> 7);
                    n7 += n13;
                    n5 += n11;
                    n10 += n14;
                    n8 += n12;
                    n2 += rs.l.c.h;
                }
                return;
            }
            n3 -= n4;
            n4 -= n2;
            n2 = x[n2];
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n2, n5 >> 16, n6 >> 16, n8 >> 7, n9 >> 7);
                n6 += n15;
                n5 += n11;
                n9 += n16;
                n8 += n12;
                n2 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n2, n5 >> 16, n7 >> 16, n8 >> 7, n10 >> 7);
                n7 += n13;
                n5 += n11;
                n10 += n14;
                n8 += n12;
                n2 += rs.l.c.h;
            }
            return;
        }
        if (n3 <= n4) {
            if (n3 >= rs.l.c.k) {
                return;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n2 > rs.l.c.k) {
                n2 = rs.l.c.k;
            }
            if (n4 < n2) {
                n5 = n6 <<= 16;
                n8 = n9 <<= 15;
                if (n3 < 0) {
                    n5 -= n11 * n3;
                    n6 -= n13 * n3;
                    n8 -= n12 * n3;
                    n9 -= n14 * n3;
                    n3 = 0;
                }
                n7 <<= 16;
                n10 <<= 15;
                if (n4 < 0) {
                    n7 -= n15 * n4;
                    n10 -= n16 * n4;
                    n4 = 0;
                }
                if (n3 != n4 && n11 < n13 || n3 == n4 && n11 > n15) {
                    n2 -= n4;
                    n4 -= n3;
                    n3 = x[n3];
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n3, n5 >> 16, n6 >> 16, n8 >> 7, n9 >> 7);
                        n5 += n11;
                        n6 += n13;
                        n8 += n12;
                        n9 += n14;
                        n3 += rs.l.c.h;
                    }
                    while (--n2 >= 0) {
                        e_0.a(rs.l.c.g, n3, n5 >> 16, n7 >> 16, n8 >> 7, n10 >> 7);
                        n5 += n11;
                        n7 += n15;
                        n8 += n12;
                        n10 += n16;
                        n3 += rs.l.c.h;
                    }
                    return;
                }
                n2 -= n4;
                n4 -= n3;
                n3 = x[n3];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n6 >> 16, n5 >> 16, n9 >> 7, n8 >> 7);
                    n5 += n11;
                    n6 += n13;
                    n8 += n12;
                    n9 += n14;
                    n3 += rs.l.c.h;
                }
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n7 >> 16, n5 >> 16, n10 >> 7, n8 >> 7);
                    n5 += n11;
                    n7 += n15;
                    n8 += n12;
                    n10 += n16;
                    n3 += rs.l.c.h;
                }
                return;
            }
            n7 = n6 <<= 16;
            n10 = n9 <<= 15;
            if (n3 < 0) {
                n7 -= n11 * n3;
                n6 -= n13 * n3;
                n10 -= n12 * n3;
                n9 -= n14 * n3;
                n3 = 0;
            }
            n5 <<= 16;
            n8 <<= 15;
            if (n2 < 0) {
                n5 -= n15 * n2;
                n8 -= n16 * n2;
                n2 = 0;
            }
            if (n11 < n13) {
                n4 -= n2;
                n2 -= n3;
                n3 = x[n3];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n7 >> 16, n6 >> 16, n10 >> 7, n9 >> 7);
                    n7 += n11;
                    n6 += n13;
                    n10 += n12;
                    n9 += n14;
                    n3 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n5 >> 16, n6 >> 16, n8 >> 7, n9 >> 7);
                    n5 += n15;
                    n6 += n13;
                    n8 += n16;
                    n9 += n14;
                    n3 += rs.l.c.h;
                }
                return;
            }
            n4 -= n2;
            n2 -= n3;
            n3 = x[n3];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n3, n6 >> 16, n7 >> 16, n9 >> 7, n10 >> 7);
                n7 += n11;
                n6 += n13;
                n10 += n12;
                n9 += n14;
                n3 += rs.l.c.h;
            }
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n3, n6 >> 16, n5 >> 16, n9 >> 7, n8 >> 7);
                n5 += n15;
                n6 += n13;
                n8 += n16;
                n9 += n14;
                n3 += rs.l.c.h;
            }
            return;
        }
        if (n4 >= rs.l.c.k) {
            return;
        }
        if (n2 > rs.l.c.k) {
            n2 = rs.l.c.k;
        }
        if (n3 > rs.l.c.k) {
            n3 = rs.l.c.k;
        }
        if (n2 < n3) {
            n6 = n7 <<= 16;
            n9 = n10 <<= 15;
            if (n4 < 0) {
                n6 -= n13 * n4;
                n7 -= n15 * n4;
                n9 -= n14 * n4;
                n10 -= n16 * n4;
                n4 = 0;
            }
            n5 <<= 16;
            n8 <<= 15;
            if (n2 < 0) {
                n5 -= n11 * n2;
                n8 -= n12 * n2;
                n2 = 0;
            }
            if (n13 < n15) {
                n3 -= n2;
                n2 -= n4;
                n4 = x[n4];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n4, n6 >> 16, n7 >> 16, n9 >> 7, n10 >> 7);
                    n6 += n13;
                    n7 += n15;
                    n9 += n14;
                    n10 += n16;
                    n4 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n4, n6 >> 16, n5 >> 16, n9 >> 7, n8 >> 7);
                    n6 += n13;
                    n5 += n11;
                    n9 += n14;
                    n8 += n12;
                    n4 += rs.l.c.h;
                }
                return;
            }
            n3 -= n2;
            n2 -= n4;
            n4 = x[n4];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n7 >> 16, n6 >> 16, n10 >> 7, n9 >> 7);
                n6 += n13;
                n7 += n15;
                n9 += n14;
                n10 += n16;
                n4 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n5 >> 16, n6 >> 16, n8 >> 7, n9 >> 7);
                n6 += n13;
                n5 += n11;
                n9 += n14;
                n8 += n12;
                n4 += rs.l.c.h;
            }
            return;
        }
        n5 = n7 <<= 16;
        n8 = n10 <<= 15;
        if (n4 < 0) {
            n5 -= n13 * n4;
            n7 -= n15 * n4;
            n8 -= n14 * n4;
            n10 -= n16 * n4;
            n4 = 0;
        }
        n6 <<= 16;
        n9 <<= 15;
        if (n3 < 0) {
            n6 -= n11 * n3;
            n9 -= n12 * n3;
            n3 = 0;
        }
        if (n13 < n15) {
            n2 -= n3;
            n3 -= n4;
            n4 = x[n4];
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n5 >> 16, n7 >> 16, n8 >> 7, n10 >> 7);
                n5 += n13;
                n7 += n15;
                n8 += n14;
                n10 += n16;
                n4 += rs.l.c.h;
            }
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n6 >> 16, n7 >> 16, n9 >> 7, n10 >> 7);
                n6 += n11;
                n7 += n15;
                n9 += n12;
                n10 += n16;
                n4 += rs.l.c.h;
            }
            return;
        }
        n2 -= n3;
        n3 -= n4;
        n4 = x[n4];
        while (--n3 >= 0) {
            e_0.a(rs.l.c.g, n4, n7 >> 16, n5 >> 16, n10 >> 7, n8 >> 7);
            n5 += n13;
            n7 += n15;
            n8 += n14;
            n10 += n16;
            n4 += rs.l.c.h;
        }
        while (--n2 >= 0) {
            e_0.a(rs.l.c.g, n4, n7 >> 16, n6 >> 16, n10 >> 7, n9 >> 7);
            n6 += n11;
            n7 += n15;
            n9 += n12;
            n10 += n16;
            n4 += rs.l.c.h;
        }
    }

    private static void a(int[] nArray, int n2, int n3, int n4, int n5, int n6) {
        if (rs.k.e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ai() && q && n2 <= e_0.d()) {
            n2 += 3064;
        }
        if (p) {
            int n7;
            int n8;
            if (o) {
                n8 = n4 - n3 > 3 ? (n6 - n5) / (n4 - n3) : 0;
                if (n4 > rs.l.c.n) {
                    n4 = rs.l.c.n;
                }
                if (n3 < 0) {
                    n5 -= n3 * n8;
                    n3 = 0;
                }
                if (n3 >= n4) {
                    return;
                }
                n2 += n3;
                n7 = n4 - n3 >> 2;
                n8 <<= 2;
            } else {
                if (n3 >= n4) {
                    return;
                }
                n2 += n3;
                n7 = n4 - n3 >> 2;
                n8 = n7 > 0 ? (n6 - n5) * E[n7] >> 15 : 0;
            }
            if (r == 0) {
                int n9;
                while (--n7 >= 0) {
                    n9 = B[n5 >> 8];
                    n5 += n8;
                    nArray[n2++] = n9;
                    nArray[n2++] = n9;
                    nArray[n2++] = n9;
                    nArray[n2++] = n9;
                }
                n7 = n4 - n3 & 3;
                if (n7 > 0) {
                    n9 = B[n5 >> 8];
                    do {
                        nArray[n2++] = n9;
                    } while (--n7 > 0);
                    return;
                }
            } else {
                int n10;
                int n11 = r;
                int n12 = 256 - r;
                while (--n7 >= 0) {
                    n10 = B[n5 >> 8];
                    n5 += n8;
                    n10 = ((n10 & 0xFF00FF) * n12 >> 8 & 0xFF00FF) + ((n10 & 0xFF00) * n12 >> 8 & 0xFF00);
                    nArray[n2++] = n10 + ((nArray[n2] & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n11 >> 8 & 0xFF00);
                    nArray[n2++] = n10 + ((nArray[n2] & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n11 >> 8 & 0xFF00);
                    nArray[n2++] = n10 + ((nArray[n2] & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n11 >> 8 & 0xFF00);
                    nArray[n2++] = n10 + ((nArray[n2] & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n11 >> 8 & 0xFF00);
                }
                n7 = n4 - n3 & 3;
                if (n7 > 0) {
                    n10 = B[n5 >> 8];
                    n10 = ((n10 & 0xFF00FF) * n12 >> 8 & 0xFF00FF) + ((n10 & 0xFF00) * n12 >> 8 & 0xFF00);
                    do {
                        nArray[n2++] = n10 + ((nArray[n2] & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n11 >> 8 & 0xFF00);
                    } while (--n7 > 0);
                }
            }
            return;
        }
        if (n3 >= n4) {
            return;
        }
        int n13 = (n6 - n5) / (n4 - n3);
        if (o) {
            if (n4 > rs.l.c.n) {
                n4 = rs.l.c.n;
            }
            if (n3 < 0) {
                n5 -= n3 * n13;
                n3 = 0;
            }
            if (n3 >= n4) {
                return;
            }
        }
        n2 += n3;
        int n14 = n4 - n3;
        if (r == 0) {
            do {
                nArray[n2++] = B[n5 >> 8];
                n5 += n13;
            } while (--n14 > 0);
            return;
        }
        int n15 = r;
        int n16 = 256 - r;
        do {
            int n17 = B[n5 >> 8];
            n5 += n13;
            n17 = ((n17 & 0xFF00FF) * n16 >> 8 & 0xFF00FF) + ((n17 & 0xFF00) * n16 >> 8 & 0xFF00);
            nArray[n2++] = n17 + ((nArray[n2] & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n15 >> 8 & 0xFF00);
        } while (--n14 > 0);
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        if (rs.k.e.a() && !h) {
            return;
        }
        int n11 = B[n8];
        int n12 = B[n9];
        int n13 = B[n10];
        int n14 = n11 >> 16 & 0xFF;
        int n15 = n11 >> 8 & 0xFF;
        int n16 = n11 & 0xFF;
        int n17 = n12 >> 16 & 0xFF;
        int n18 = n12 >> 8 & 0xFF;
        int n19 = n12 & 0xFF;
        int n20 = n13 >> 16 & 0xFF;
        int n21 = n13 >> 8 & 0xFF;
        int n22 = n13 & 0xFF;
        int n23 = 0;
        int n24 = 0;
        int n25 = 0;
        int n26 = 0;
        if (n3 != n2) {
            n23 = (n6 - n5 << 16) / (n3 - n2);
            n24 = (n17 - n14 << 16) / (n3 - n2);
            n25 = (n18 - n15 << 16) / (n3 - n2);
            n26 = (n19 - n16 << 16) / (n3 - n2);
        }
        int n27 = 0;
        int n28 = 0;
        int n29 = 0;
        int n30 = 0;
        if (n4 != n3) {
            n27 = (n7 - n6 << 16) / (n4 - n3);
            n28 = (n20 - n17 << 16) / (n4 - n3);
            n29 = (n21 - n18 << 16) / (n4 - n3);
            n30 = (n22 - n19 << 16) / (n4 - n3);
        }
        int n31 = 0;
        int n32 = 0;
        int n33 = 0;
        int n34 = 0;
        if (n4 != n2) {
            n31 = (n5 - n7 << 16) / (n2 - n4);
            n32 = (n14 - n20 << 16) / (n2 - n4);
            n33 = (n15 - n21 << 16) / (n2 - n4);
            n34 = (n16 - n22 << 16) / (n2 - n4);
        }
        if (n2 <= n3 && n2 <= n4) {
            if (n2 >= rs.l.c.k) {
                return;
            }
            if (n3 > rs.l.c.k) {
                n3 = rs.l.c.k;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n3 < n4) {
                n7 = n5 <<= 16;
                n20 = n14 <<= 16;
                n21 = n15 <<= 16;
                n22 = n16 <<= 16;
                if (n2 < 0) {
                    n7 -= n31 * n2;
                    n5 -= n23 * n2;
                    n20 -= n32 * n2;
                    n21 -= n33 * n2;
                    n22 -= n34 * n2;
                    n14 -= n24 * n2;
                    n15 -= n25 * n2;
                    n16 -= n26 * n2;
                    n2 = 0;
                }
                n6 <<= 16;
                n17 <<= 16;
                n18 <<= 16;
                n19 <<= 16;
                if (n3 < 0) {
                    n6 -= n27 * n3;
                    n17 -= n28 * n3;
                    n18 -= n29 * n3;
                    n19 -= n30 * n3;
                    n3 = 0;
                }
                if (n2 != n3 && n31 < n23 || n2 == n3 && n31 > n27) {
                    n4 -= n3;
                    n3 -= n2;
                    n2 = x[n2];
                    while (--n3 >= 0) {
                        e_0.a(rs.l.c.g, n2, n7 >> 16, n5 >> 16, n20, n21, n22, n14, n15, n16);
                        n7 += n31;
                        n5 += n23;
                        n20 += n32;
                        n21 += n33;
                        n22 += n34;
                        n14 += n24;
                        n15 += n25;
                        n16 += n26;
                        n2 += rs.l.c.h;
                    }
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n2, n7 >> 16, n6 >> 16, n20, n21, n22, n17, n18, n19);
                        n7 += n31;
                        n6 += n27;
                        n20 += n32;
                        n21 += n33;
                        n22 += n34;
                        n17 += n28;
                        n18 += n29;
                        n19 += n30;
                        n2 += rs.l.c.h;
                    }
                    return;
                }
                n4 -= n3;
                n3 -= n2;
                n2 = x[n2];
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n5 >> 16, n7 >> 16, n14, n15, n16, n20, n21, n22);
                    n7 += n31;
                    n5 += n23;
                    n20 += n32;
                    n21 += n33;
                    n22 += n34;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    n2 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n6 >> 16, n7 >> 16, n17, n18, n19, n20, n21, n22);
                    n7 += n31;
                    n6 += n27;
                    n20 += n32;
                    n21 += n33;
                    n22 += n34;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    n2 += rs.l.c.h;
                }
                return;
            }
            n6 = n5 <<= 16;
            n17 = n14 <<= 16;
            n18 = n15 <<= 16;
            n19 = n16 <<= 16;
            if (n2 < 0) {
                n6 -= n31 * n2;
                n5 -= n23 * n2;
                n17 -= n32 * n2;
                n18 -= n33 * n2;
                n19 -= n34 * n2;
                n14 -= n24 * n2;
                n15 -= n25 * n2;
                n16 -= n26 * n2;
                n2 = 0;
            }
            n7 <<= 16;
            n20 <<= 16;
            n21 <<= 16;
            n22 <<= 16;
            if (n4 < 0) {
                n7 -= n27 * n4;
                n20 -= n28 * n4;
                n21 -= n29 * n4;
                n22 -= n30 * n4;
                n4 = 0;
            }
            if (n2 != n4 && n31 < n23 || n2 == n4 && n27 > n23) {
                n3 -= n4;
                n4 -= n2;
                n2 = x[n2];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n6 >> 16, n5 >> 16, n17, n18, n19, n14, n15, n16);
                    n6 += n31;
                    n5 += n23;
                    n17 += n32;
                    n18 += n33;
                    n19 += n34;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    n2 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n7 >> 16, n5 >> 16, n20, n21, n22, n14, n15, n16);
                    n7 += n27;
                    n5 += n23;
                    n20 += n28;
                    n21 += n29;
                    n22 += n30;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    n2 += rs.l.c.h;
                }
                return;
            }
            n3 -= n4;
            n4 -= n2;
            n2 = x[n2];
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n2, n5 >> 16, n6 >> 16, n14, n15, n16, n17, n18, n19);
                n6 += n31;
                n5 += n23;
                n17 += n32;
                n18 += n33;
                n19 += n34;
                n14 += n24;
                n15 += n25;
                n16 += n26;
                n2 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n2, n5 >> 16, n7 >> 16, n14, n15, n16, n20, n21, n22);
                n7 += n27;
                n5 += n23;
                n20 += n28;
                n21 += n29;
                n22 += n30;
                n14 += n24;
                n15 += n25;
                n16 += n26;
                n2 += rs.l.c.h;
            }
            return;
        }
        if (n3 <= n4) {
            if (n3 >= rs.l.c.k) {
                return;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n2 > rs.l.c.k) {
                n2 = rs.l.c.k;
            }
            if (n4 < n2) {
                n5 = n6 <<= 16;
                n14 = n17 <<= 16;
                n15 = n18 <<= 16;
                n16 = n19 <<= 16;
                if (n3 < 0) {
                    n5 -= n23 * n3;
                    n6 -= n27 * n3;
                    n14 -= n24 * n3;
                    n15 -= n25 * n3;
                    n16 -= n26 * n3;
                    n17 -= n28 * n3;
                    n18 -= n29 * n3;
                    n19 -= n30 * n3;
                    n3 = 0;
                }
                n7 <<= 16;
                n20 <<= 16;
                n21 <<= 16;
                n22 <<= 16;
                if (n4 < 0) {
                    n7 -= n31 * n4;
                    n20 -= n32 * n4;
                    n21 -= n33 * n4;
                    n22 -= n34 * n4;
                    n4 = 0;
                }
                if (n3 != n4 && n23 < n27 || n3 == n4 && n23 > n31) {
                    n2 -= n4;
                    n4 -= n3;
                    n3 = x[n3];
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n3, n5 >> 16, n6 >> 16, n14, n15, n16, n17, n18, n19);
                        n5 += n23;
                        n6 += n27;
                        n14 += n24;
                        n15 += n25;
                        n16 += n26;
                        n17 += n28;
                        n18 += n29;
                        n19 += n30;
                        n3 += rs.l.c.h;
                    }
                    while (--n2 >= 0) {
                        e_0.a(rs.l.c.g, n3, n5 >> 16, n7 >> 16, n14, n15, n16, n20, n21, n22);
                        n5 += n23;
                        n7 += n31;
                        n14 += n24;
                        n15 += n25;
                        n16 += n26;
                        n20 += n32;
                        n21 += n33;
                        n22 += n34;
                        n3 += rs.l.c.h;
                    }
                    return;
                }
                n2 -= n4;
                n4 -= n3;
                n3 = x[n3];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n6 >> 16, n5 >> 16, n17, n18, n19, n14, n15, n16);
                    n5 += n23;
                    n6 += n27;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    n3 += rs.l.c.h;
                }
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n7 >> 16, n5 >> 16, n20, n21, n22, n14, n15, n16);
                    n5 += n23;
                    n7 += n31;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    n20 += n32;
                    n21 += n33;
                    n22 += n34;
                    n3 += rs.l.c.h;
                }
                return;
            }
            n7 = n6 <<= 16;
            n20 = n17 <<= 16;
            n21 = n18 <<= 16;
            n22 = n19 <<= 16;
            if (n3 < 0) {
                n7 -= n23 * n3;
                n6 -= n27 * n3;
                n20 -= n24 * n3;
                n21 -= n25 * n3;
                n22 -= n26 * n3;
                n17 -= n28 * n3;
                n18 -= n29 * n3;
                n19 -= n30 * n3;
                n3 = 0;
            }
            n5 <<= 16;
            n14 <<= 16;
            n15 <<= 16;
            n16 <<= 16;
            if (n2 < 0) {
                n5 -= n31 * n2;
                n14 -= n32 * n2;
                n15 -= n33 * n2;
                n16 -= n34 * n2;
                n2 = 0;
            }
            if (n23 < n27) {
                n4 -= n2;
                n2 -= n3;
                n3 = x[n3];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n7 >> 16, n6 >> 16, n20, n21, n22, n17, n18, n19);
                    n7 += n23;
                    n6 += n27;
                    n20 += n24;
                    n21 += n25;
                    n22 += n26;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    n3 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n5 >> 16, n6 >> 16, n14, n15, n16, n17, n18, n19);
                    n5 += n31;
                    n6 += n27;
                    n14 += n32;
                    n15 += n33;
                    n16 += n34;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    n3 += rs.l.c.h;
                }
                return;
            }
            n4 -= n2;
            n2 -= n3;
            n3 = x[n3];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n3, n6 >> 16, n7 >> 16, n17, n18, n19, n20, n21, n22);
                n7 += n23;
                n6 += n27;
                n20 += n24;
                n21 += n25;
                n22 += n26;
                n17 += n28;
                n18 += n29;
                n19 += n30;
                n3 += rs.l.c.h;
            }
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n3, n6 >> 16, n5 >> 16, n17, n18, n19, n14, n15, n16);
                n5 += n31;
                n6 += n27;
                n14 += n32;
                n15 += n33;
                n16 += n34;
                n17 += n28;
                n18 += n29;
                n19 += n30;
                n3 += rs.l.c.h;
            }
            return;
        }
        if (n4 >= rs.l.c.k) {
            return;
        }
        if (n2 > rs.l.c.k) {
            n2 = rs.l.c.k;
        }
        if (n3 > rs.l.c.k) {
            n3 = rs.l.c.k;
        }
        if (n2 < n3) {
            n6 = n7 <<= 16;
            n17 = n20 <<= 16;
            n18 = n21 <<= 16;
            n19 = n22 <<= 16;
            if (n4 < 0) {
                n6 -= n27 * n4;
                n7 -= n31 * n4;
                n17 -= n28 * n4;
                n18 -= n29 * n4;
                n19 -= n30 * n4;
                n20 -= n32 * n4;
                n21 -= n33 * n4;
                n22 -= n34 * n4;
                n4 = 0;
            }
            n5 <<= 16;
            n14 <<= 16;
            n15 <<= 16;
            n16 <<= 16;
            if (n2 < 0) {
                n5 -= n23 * n2;
                n14 -= n24 * n2;
                n15 -= n25 * n2;
                n16 -= n26 * n2;
                n2 = 0;
            }
            if (n27 < n31) {
                n3 -= n2;
                n2 -= n4;
                n4 = x[n4];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n4, n6 >> 16, n7 >> 16, n17, n18, n19, n20, n21, n22);
                    n6 += n27;
                    n7 += n31;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    n20 += n32;
                    n21 += n33;
                    n22 += n34;
                    n4 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n4, n6 >> 16, n5 >> 16, n17, n18, n19, n14, n15, n16);
                    n6 += n27;
                    n5 += n23;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    n4 += rs.l.c.h;
                }
                return;
            }
            n3 -= n2;
            n2 -= n4;
            n4 = x[n4];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n7 >> 16, n6 >> 16, n20, n21, n22, n17, n18, n19);
                n6 += n27;
                n7 += n31;
                n17 += n28;
                n18 += n29;
                n19 += n30;
                n20 += n32;
                n21 += n33;
                n22 += n34;
                n4 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n5 >> 16, n6 >> 16, n14, n15, n16, n17, n18, n19);
                n6 += n27;
                n5 += n23;
                n17 += n28;
                n18 += n29;
                n19 += n30;
                n14 += n24;
                n15 += n25;
                n16 += n26;
                n4 += rs.l.c.h;
            }
            return;
        }
        n5 = n7 <<= 16;
        n14 = n20 <<= 16;
        n15 = n21 <<= 16;
        n16 = n22 <<= 16;
        if (n4 < 0) {
            n5 -= n27 * n4;
            n7 -= n31 * n4;
            n14 -= n28 * n4;
            n15 -= n29 * n4;
            n16 -= n30 * n4;
            n20 -= n32 * n4;
            n21 -= n33 * n4;
            n22 -= n34 * n4;
            n4 = 0;
        }
        n6 <<= 16;
        n17 <<= 16;
        n18 <<= 16;
        n19 <<= 16;
        if (n3 < 0) {
            n6 -= n23 * n3;
            n17 -= n24 * n3;
            n18 -= n25 * n3;
            n19 -= n26 * n3;
            n3 = 0;
        }
        if (n27 < n31) {
            n2 -= n3;
            n3 -= n4;
            n4 = x[n4];
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n5 >> 16, n7 >> 16, n14, n15, n16, n20, n21, n22);
                n5 += n27;
                n7 += n31;
                n14 += n28;
                n15 += n29;
                n16 += n30;
                n20 += n32;
                n21 += n33;
                n22 += n34;
                n4 += rs.l.c.h;
            }
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n6 >> 16, n7 >> 16, n17, n18, n19, n20, n21, n22);
                n6 += n23;
                n7 += n31;
                n17 += n24;
                n18 += n25;
                n19 += n26;
                n20 += n32;
                n21 += n33;
                n22 += n34;
                n4 += rs.l.c.h;
            }
            return;
        }
        n2 -= n3;
        n3 -= n4;
        n4 = x[n4];
        while (--n3 >= 0) {
            e_0.a(rs.l.c.g, n4, n7 >> 16, n5 >> 16, n20, n21, n22, n14, n15, n16);
            n5 += n27;
            n7 += n31;
            n14 += n28;
            n15 += n29;
            n16 += n30;
            n20 += n32;
            n21 += n33;
            n22 += n34;
            n4 += rs.l.c.h;
        }
        while (--n2 >= 0) {
            e_0.a(rs.l.c.g, n4, n7 >> 16, n6 >> 16, n20, n21, n22, n17, n18, n19);
            n6 += n23;
            n7 += n31;
            n17 += n24;
            n18 += n25;
            n19 += n26;
            n20 += n32;
            n21 += n33;
            n22 += n34;
            n4 += rs.l.c.h;
        }
    }

    public static void a(int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        block14: {
            if (rs.k.e.a() && !h) {
                return;
            }
            int n11 = n4 - n3;
            if (n11 <= 0) {
                return;
            }
            Launcher.n().o();
            if (!Client.ai() && q && n2 <= e_0.d()) {
                n2 += 3064;
            }
            n8 = (n8 - n5) / n11;
            n9 = (n9 - n6) / n11;
            n10 = (n10 - n7) / n11;
            if (o) {
                if (n4 > rs.l.c.n) {
                    n11 -= n4 - rs.l.c.n;
                    n4 = rs.l.c.n;
                }
                if (n3 < 0) {
                    n11 = n4;
                    n5 -= n3 * n8;
                    n6 -= n3 * n9;
                    n7 -= n3 * n10;
                    n3 = 0;
                }
            }
            if (n3 >= n4) break block14;
            n2 += n3;
            if (r == 0) {
                while (--n11 >= 0) {
                    if (rs.k.e.a()) {
                        rs.l.c.a(nArray, n2, n5 & 0xFF0000 | n6 >> 8 & 0xFF00 | n7 >> 16 & 0xFF, n5 & 0xFF0000 | n6 >> 8 & 0xFF00 | n7 >> 16 & 0xFF, 255);
                    } else {
                        nArray[n2] = n5 & 0xFF0000 | n6 >> 8 & 0xFF00 | n7 >> 16 & 0xFF;
                    }
                    n5 += n8;
                    n6 += n9;
                    n7 += n10;
                    ++n2;
                }
            } else {
                int n12 = r;
                int n13 = 256 - r;
                while (--n11 >= 0) {
                    int n14 = n5 & 0xFF0000 | n6 >> 8 & 0xFF00 | n7 >> 16 & 0xFF;
                    n14 = ((n14 & 0xFF00FF) * n13 >> 8 & 0xFF00FF) + ((n14 & 0xFF00) * n13 >> 8 & 0xFF00);
                    int n15 = nArray[n2];
                    if (rs.k.e.a()) {
                        rs.l.c.a(nArray, n2, n14 + ((n15 & 0xFF00FF) * n12 >> 8 & 0xFF00FF) + ((n15 & 0xFF00) * n12 >> 8 & 0xFF00), n14 + ((n15 & 0xFF00FF) * n12 >> 8 & 0xFF00FF) + ((n15 & 0xFF00) * n12 >> 8 & 0xFF00), 255);
                    } else {
                        nArray[n2] = n14 + ((n15 & 0xFF00FF) * n12 >> 8 & 0xFF00FF) + ((n15 & 0xFF00) * n12 >> 8 & 0xFF00);
                    }
                    n5 += n8;
                    n6 += n9;
                    n7 += n10;
                    ++n2;
                }
            }
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (rs.k.e.a() && !h) {
            return;
        }
        int n9 = 0;
        if (n3 != n2) {
            n9 = (n6 - n5 << 16) / (n3 - n2);
        }
        int n10 = 0;
        if (n4 != n3) {
            n10 = (n7 - n6 << 16) / (n4 - n3);
        }
        int n11 = 0;
        if (n4 != n2) {
            n11 = (n5 - n7 << 16) / (n2 - n4);
        }
        if (n2 <= n3 && n2 <= n4) {
            if (n2 >= rs.l.c.k) {
                return;
            }
            if (n3 > rs.l.c.k) {
                n3 = rs.l.c.k;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n3 < n4) {
                n7 = n5 <<= 16;
                if (n2 < 0) {
                    n7 -= n11 * n2;
                    n5 -= n9 * n2;
                    n2 = 0;
                }
                n6 <<= 16;
                if (n3 < 0) {
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                if (n2 != n3 && n11 < n9 || n2 == n3 && n11 > n10) {
                    n4 -= n3;
                    n3 -= n2;
                    n2 = x[n2];
                    while (--n3 >= 0) {
                        e_0.a(rs.l.c.g, n2, n8, n7 >> 16, n5 >> 16);
                        n7 += n11;
                        n5 += n9;
                        n2 += rs.l.c.h;
                    }
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n2, n8, n7 >> 16, n6 >> 16);
                        n7 += n11;
                        n6 += n10;
                        n2 += rs.l.c.h;
                    }
                    return;
                }
                n4 -= n3;
                n3 -= n2;
                n2 = x[n2];
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n5 >> 16, n7 >> 16);
                    n7 += n11;
                    n5 += n9;
                    n2 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n6 >> 16, n7 >> 16);
                    n7 += n11;
                    n6 += n10;
                    n2 += rs.l.c.h;
                }
                return;
            }
            n6 = n5 <<= 16;
            if (n2 < 0) {
                n6 -= n11 * n2;
                n5 -= n9 * n2;
                n2 = 0;
            }
            n7 <<= 16;
            if (n4 < 0) {
                n7 -= n10 * n4;
                n4 = 0;
            }
            if (n2 != n4 && n11 < n9 || n2 == n4 && n10 > n9) {
                n3 -= n4;
                n4 -= n2;
                n2 = x[n2];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n6 >> 16, n5 >> 16);
                    n6 += n11;
                    n5 += n9;
                    n2 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n7 >> 16, n5 >> 16);
                    n7 += n10;
                    n5 += n9;
                    n2 += rs.l.c.h;
                }
                return;
            }
            n3 -= n4;
            n4 -= n2;
            n2 = x[n2];
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n2, n8, n5 >> 16, n6 >> 16);
                n6 += n11;
                n5 += n9;
                n2 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n2, n8, n5 >> 16, n7 >> 16);
                n7 += n10;
                n5 += n9;
                n2 += rs.l.c.h;
            }
            return;
        }
        if (n3 <= n4) {
            if (n3 >= rs.l.c.k) {
                return;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n2 > rs.l.c.k) {
                n2 = rs.l.c.k;
            }
            if (n4 < n2) {
                n5 = n6 <<= 16;
                if (n3 < 0) {
                    n5 -= n9 * n3;
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                n7 <<= 16;
                if (n4 < 0) {
                    n7 -= n11 * n4;
                    n4 = 0;
                }
                if (n3 != n4 && n9 < n10 || n3 == n4 && n9 > n11) {
                    n2 -= n4;
                    n4 -= n3;
                    n3 = x[n3];
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n3, n8, n5 >> 16, n6 >> 16);
                        n5 += n9;
                        n6 += n10;
                        n3 += rs.l.c.h;
                    }
                    while (--n2 >= 0) {
                        e_0.a(rs.l.c.g, n3, n8, n5 >> 16, n7 >> 16);
                        n5 += n9;
                        n7 += n11;
                        n3 += rs.l.c.h;
                    }
                    return;
                }
                n2 -= n4;
                n4 -= n3;
                n3 = x[n3];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n6 >> 16, n5 >> 16);
                    n5 += n9;
                    n6 += n10;
                    n3 += rs.l.c.h;
                }
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n7 >> 16, n5 >> 16);
                    n5 += n9;
                    n7 += n11;
                    n3 += rs.l.c.h;
                }
                return;
            }
            n7 = n6 <<= 16;
            if (n3 < 0) {
                n7 -= n9 * n3;
                n6 -= n10 * n3;
                n3 = 0;
            }
            n5 <<= 16;
            if (n2 < 0) {
                n5 -= n11 * n2;
                n2 = 0;
            }
            if (n9 < n10) {
                n4 -= n2;
                n2 -= n3;
                n3 = x[n3];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n7 >> 16, n6 >> 16);
                    n7 += n9;
                    n6 += n10;
                    n3 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n5 >> 16, n6 >> 16);
                    n5 += n11;
                    n6 += n10;
                    n3 += rs.l.c.h;
                }
                return;
            }
            n4 -= n2;
            n2 -= n3;
            n3 = x[n3];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n3, n8, n6 >> 16, n7 >> 16);
                n7 += n9;
                n6 += n10;
                n3 += rs.l.c.h;
            }
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n3, n8, n6 >> 16, n5 >> 16);
                n5 += n11;
                n6 += n10;
                n3 += rs.l.c.h;
            }
            return;
        }
        if (n4 >= rs.l.c.k) {
            return;
        }
        if (n2 > rs.l.c.k) {
            n2 = rs.l.c.k;
        }
        if (n3 > rs.l.c.k) {
            n3 = rs.l.c.k;
        }
        if (n2 < n3) {
            n6 = n7 <<= 16;
            if (n4 < 0) {
                n6 -= n10 * n4;
                n7 -= n11 * n4;
                n4 = 0;
            }
            n5 <<= 16;
            if (n2 < 0) {
                n5 -= n9 * n2;
                n2 = 0;
            }
            if (n10 < n11) {
                n3 -= n2;
                n2 -= n4;
                n4 = x[n4];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n4, n8, n6 >> 16, n7 >> 16);
                    n6 += n10;
                    n7 += n11;
                    n4 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n4, n8, n6 >> 16, n5 >> 16);
                    n6 += n10;
                    n5 += n9;
                    n4 += rs.l.c.h;
                }
                return;
            }
            n3 -= n2;
            n2 -= n4;
            n4 = x[n4];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n7 >> 16, n6 >> 16);
                n6 += n10;
                n7 += n11;
                n4 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n5 >> 16, n6 >> 16);
                n6 += n10;
                n5 += n9;
                n4 += rs.l.c.h;
            }
            return;
        }
        n5 = n7 <<= 16;
        if (n4 < 0) {
            n5 -= n10 * n4;
            n7 -= n11 * n4;
            n4 = 0;
        }
        n6 <<= 16;
        if (n3 < 0) {
            n6 -= n9 * n3;
            n3 = 0;
        }
        if (n10 < n11) {
            n2 -= n3;
            n3 -= n4;
            n4 = x[n4];
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n5 >> 16, n7 >> 16);
                n5 += n10;
                n7 += n11;
                n4 += rs.l.c.h;
            }
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n6 >> 16, n7 >> 16);
                n6 += n9;
                n7 += n11;
                n4 += rs.l.c.h;
            }
            return;
        }
        n2 -= n3;
        n3 -= n4;
        n4 = x[n4];
        while (--n3 >= 0) {
            e_0.a(rs.l.c.g, n4, n8, n7 >> 16, n5 >> 16);
            n5 += n10;
            n7 += n11;
            n4 += rs.l.c.h;
        }
        while (--n2 >= 0) {
            e_0.a(rs.l.c.g, n4, n8, n7 >> 16, n6 >> 16);
            n6 += n9;
            n7 += n11;
            n4 += rs.l.c.h;
        }
    }

    private static void a(int[] nArray, int n2, int n3, int n4, int n5) {
        if (rs.k.e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ai() && q && n2 <= e_0.d()) {
            n2 += 3064;
        }
        if (o) {
            if (n5 > rs.l.c.n) {
                n5 = rs.l.c.n;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n2 += n4;
        int n6 = n5 - n4 >> 2;
        if (r == 0) {
            while (--n6 >= 0) {
                if (rs.k.e.a()) {
                    rs.l.c.a(nArray, n2++, n3, n3, 256 - r);
                    rs.l.c.a(nArray, n2++, n3, n3, 256 - r);
                    rs.l.c.a(nArray, n2++, n3, n3, 256 - r);
                    rs.l.c.a(nArray, n2++, n3, n3, 256 - r);
                    continue;
                }
                nArray[n2++] = n3;
                nArray[n2++] = n3;
                nArray[n2++] = n3;
                nArray[n2++] = n3;
            }
            n6 = n5 - n4 & 3;
            while (--n6 >= 0) {
                if (rs.k.e.a()) {
                    rs.l.c.a(nArray, n2++, n3, n3, 256 - r);
                    continue;
                }
                nArray[n2++] = n3;
            }
            return;
        }
        int n7 = r;
        int n8 = 256 - r;
        n3 = ((n3 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n3 & 0xFF00) * n8 >> 8 & 0xFF00);
        while (--n6 >= 0) {
            if (rs.k.e.a()) {
                int n9 = n3 + ((nArray[n2 + 1] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2 + 1] & 0xFF00) * n7 >> 8 & 0xFF00);
                rs.l.c.a(nArray, n2++, n9, n9, n7);
                n9 = n3 + ((nArray[n2 + 1] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2 + 1] & 0xFF00) * n7 >> 8 & 0xFF00);
                rs.l.c.a(nArray, n2++, n9, n9, n7);
                n9 = n3 + ((nArray[n2 + 1] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2 + 1] & 0xFF00) * n7 >> 8 & 0xFF00);
                rs.l.c.a(nArray, n2++, n9, n9, n7);
                n9 = n3 + ((nArray[n2 + 1] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2 + 1] & 0xFF00) * n7 >> 8 & 0xFF00);
                rs.l.c.a(nArray, n2++, n9, n9, n7);
                continue;
            }
            nArray[n2++] = n3 + ((nArray[n2] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n7 >> 8 & 0xFF00);
            nArray[n2++] = n3 + ((nArray[n2] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n7 >> 8 & 0xFF00);
            nArray[n2++] = n3 + ((nArray[n2] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n7 >> 8 & 0xFF00);
            nArray[n2++] = n3 + ((nArray[n2] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n7 >> 8 & 0xFF00);
        }
        n6 = n5 - n4 & 3;
        while (--n6 >= 0) {
            if (rs.k.e.a()) {
                rs.l.c.a(nArray, n2++, n3 + ((nArray[n2] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n7 >> 8 & 0xFF00), n3 + ((nArray[n2] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n7 >> 8 & 0xFF00), n7);
                continue;
            }
            nArray[n2++] = n3 + ((nArray[n2] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n7 >> 8 & 0xFF00);
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20) {
        if (rs.k.e.a() && !h) {
            return;
        }
        if ((rs.k.e.a() || i) && p) {
            e_0.c(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20);
        } else {
            e_0.b(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20);
        }
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20) {
        if (rs.k.e.a() && !h) {
            return;
        }
        int[] nArray = e_0.d(n20);
        D = !G[n20];
        n12 = n11 - n12;
        n15 = n14 - n15;
        n18 = n17 - n18;
        int n21 = (n13 -= n11) * n14 - (n16 -= n14) * n11 << 14;
        int n22 = n16 * n17 - (n19 -= n17) * n14 << 8;
        int n23 = n19 * n11 - n13 * n17 << 5;
        int n24 = n12 * n14 - n15 * n11 << 14;
        int n25 = n15 * n17 - n18 * n14 << 8;
        int n26 = n18 * n11 - n12 * n17 << 5;
        int n27 = n15 * n13 - n12 * n16 << 14;
        int n28 = n18 * n16 - n15 * n19 << 8;
        int n29 = n12 * n19 - n18 * n13 << 5;
        int n30 = 0;
        int n31 = 0;
        if (n3 != n2) {
            n30 = (n6 - n5 << 16) / (n3 - n2);
            n31 = (n9 - n8 << 16) / (n3 - n2);
        }
        int n32 = 0;
        int n33 = 0;
        if (n4 != n3) {
            n32 = (n7 - n6 << 16) / (n4 - n3);
            n33 = (n10 - n9 << 16) / (n4 - n3);
        }
        int n34 = 0;
        int n35 = 0;
        if (n4 != n2) {
            n34 = (n5 - n7 << 16) / (n2 - n4);
            n35 = (n8 - n10 << 16) / (n2 - n4);
        }
        if (n2 <= n3 && n2 <= n4) {
            if (n2 >= rs.l.c.k) {
                return;
            }
            if (n3 > rs.l.c.k) {
                n3 = rs.l.c.k;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n3 < n4) {
                n7 = n5 <<= 16;
                n10 = n8 <<= 16;
                if (n2 < 0) {
                    n7 -= n34 * n2;
                    n5 -= n30 * n2;
                    n10 -= n35 * n2;
                    n8 -= n31 * n2;
                    n2 = 0;
                }
                n6 <<= 16;
                n9 <<= 16;
                if (n3 < 0) {
                    n6 -= n32 * n3;
                    n9 -= n33 * n3;
                    n3 = 0;
                }
                int n36 = n2 - t;
                n21 += n23 * n36;
                n24 += n26 * n36;
                n27 += n29 * n36;
                if (n2 != n3 && n34 < n30 || n2 == n3 && n34 > n32) {
                    n4 -= n3;
                    n3 -= n2;
                    n2 = x[n2];
                    while (--n3 >= 0) {
                        e_0.a(rs.l.c.g, nArray, n2, n7 >> 16, n5 >> 16, n10 >> 8, n8 >> 8, n21, n24, n27, n22, n25, n28);
                        n7 += n34;
                        n5 += n30;
                        n10 += n35;
                        n8 += n31;
                        n2 += rs.l.c.h;
                        n21 += n23;
                        n24 += n26;
                        n27 += n29;
                    }
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, nArray, n2, n7 >> 16, n6 >> 16, n10 >> 8, n9 >> 8, n21, n24, n27, n22, n25, n28);
                        n7 += n34;
                        n6 += n32;
                        n10 += n35;
                        n9 += n33;
                        n2 += rs.l.c.h;
                        n21 += n23;
                        n24 += n26;
                        n27 += n29;
                    }
                    return;
                }
                n4 -= n3;
                n3 -= n2;
                n2 = x[n2];
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n2, n5 >> 16, n7 >> 16, n8 >> 8, n10 >> 8, n21, n24, n27, n22, n25, n28);
                    n7 += n34;
                    n5 += n30;
                    n10 += n35;
                    n8 += n31;
                    n2 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n2, n6 >> 16, n7 >> 16, n9 >> 8, n10 >> 8, n21, n24, n27, n22, n25, n28);
                    n7 += n34;
                    n6 += n32;
                    n10 += n35;
                    n9 += n33;
                    n2 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                return;
            }
            n6 = n5 <<= 16;
            n9 = n8 <<= 16;
            if (n2 < 0) {
                n6 -= n34 * n2;
                n5 -= n30 * n2;
                n9 -= n35 * n2;
                n8 -= n31 * n2;
                n2 = 0;
            }
            n7 <<= 16;
            n10 <<= 16;
            if (n4 < 0) {
                n7 -= n32 * n4;
                n10 -= n33 * n4;
                n4 = 0;
            }
            int n37 = n2 - t;
            n21 += n23 * n37;
            n24 += n26 * n37;
            n27 += n29 * n37;
            if (n2 != n4 && n34 < n30 || n2 == n4 && n32 > n30) {
                n3 -= n4;
                n4 -= n2;
                n2 = x[n2];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n2, n6 >> 16, n5 >> 16, n9 >> 8, n8 >> 8, n21, n24, n27, n22, n25, n28);
                    n6 += n34;
                    n5 += n30;
                    n9 += n35;
                    n8 += n31;
                    n2 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n2, n7 >> 16, n5 >> 16, n10 >> 8, n8 >> 8, n21, n24, n27, n22, n25, n28);
                    n7 += n32;
                    n5 += n30;
                    n10 += n33;
                    n8 += n31;
                    n2 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                return;
            }
            n3 -= n4;
            n4 -= n2;
            n2 = x[n2];
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, nArray, n2, n5 >> 16, n6 >> 16, n8 >> 8, n9 >> 8, n21, n24, n27, n22, n25, n28);
                n6 += n34;
                n5 += n30;
                n9 += n35;
                n8 += n31;
                n2 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, nArray, n2, n5 >> 16, n7 >> 16, n8 >> 8, n10 >> 8, n21, n24, n27, n22, n25, n28);
                n7 += n32;
                n5 += n30;
                n10 += n33;
                n8 += n31;
                n2 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            return;
        }
        if (n3 <= n4) {
            if (n3 >= rs.l.c.k) {
                return;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n2 > rs.l.c.k) {
                n2 = rs.l.c.k;
            }
            if (n4 < n2) {
                n5 = n6 <<= 16;
                n8 = n9 <<= 16;
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n32 * n3;
                    n8 -= n31 * n3;
                    n9 -= n33 * n3;
                    n3 = 0;
                }
                n7 <<= 16;
                n10 <<= 16;
                if (n4 < 0) {
                    n7 -= n34 * n4;
                    n10 -= n35 * n4;
                    n4 = 0;
                }
                int n38 = n3 - t;
                n21 += n23 * n38;
                n24 += n26 * n38;
                n27 += n29 * n38;
                if (n3 != n4 && n30 < n32 || n3 == n4 && n30 > n34) {
                    n2 -= n4;
                    n4 -= n3;
                    n3 = x[n3];
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, nArray, n3, n5 >> 16, n6 >> 16, n8 >> 8, n9 >> 8, n21, n24, n27, n22, n25, n28);
                        n5 += n30;
                        n6 += n32;
                        n8 += n31;
                        n9 += n33;
                        n3 += rs.l.c.h;
                        n21 += n23;
                        n24 += n26;
                        n27 += n29;
                    }
                    while (--n2 >= 0) {
                        e_0.a(rs.l.c.g, nArray, n3, n5 >> 16, n7 >> 16, n8 >> 8, n10 >> 8, n21, n24, n27, n22, n25, n28);
                        n5 += n30;
                        n7 += n34;
                        n8 += n31;
                        n10 += n35;
                        n3 += rs.l.c.h;
                        n21 += n23;
                        n24 += n26;
                        n27 += n29;
                    }
                    return;
                }
                n2 -= n4;
                n4 -= n3;
                n3 = x[n3];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n3, n6 >> 16, n5 >> 16, n9 >> 8, n8 >> 8, n21, n24, n27, n22, n25, n28);
                    n5 += n30;
                    n6 += n32;
                    n8 += n31;
                    n9 += n33;
                    n3 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n3, n7 >> 16, n5 >> 16, n10 >> 8, n8 >> 8, n21, n24, n27, n22, n25, n28);
                    n5 += n30;
                    n7 += n34;
                    n8 += n31;
                    n10 += n35;
                    n3 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                return;
            }
            n7 = n6 <<= 16;
            n10 = n9 <<= 16;
            if (n3 < 0) {
                n7 -= n30 * n3;
                n6 -= n32 * n3;
                n10 -= n31 * n3;
                n9 -= n33 * n3;
                n3 = 0;
            }
            n5 <<= 16;
            n8 <<= 16;
            if (n2 < 0) {
                n5 -= n34 * n2;
                n8 -= n35 * n2;
                n2 = 0;
            }
            int n39 = n3 - t;
            n21 += n23 * n39;
            n24 += n26 * n39;
            n27 += n29 * n39;
            if (n30 < n32) {
                n4 -= n2;
                n2 -= n3;
                n3 = x[n3];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n3, n7 >> 16, n6 >> 16, n10 >> 8, n9 >> 8, n21, n24, n27, n22, n25, n28);
                    n7 += n30;
                    n6 += n32;
                    n10 += n31;
                    n9 += n33;
                    n3 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n3, n5 >> 16, n6 >> 16, n8 >> 8, n9 >> 8, n21, n24, n27, n22, n25, n28);
                    n5 += n34;
                    n6 += n32;
                    n8 += n35;
                    n9 += n33;
                    n3 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                return;
            }
            n4 -= n2;
            n2 -= n3;
            n3 = x[n3];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, nArray, n3, n6 >> 16, n7 >> 16, n9 >> 8, n10 >> 8, n21, n24, n27, n22, n25, n28);
                n7 += n30;
                n6 += n32;
                n10 += n31;
                n9 += n33;
                n3 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, nArray, n3, n6 >> 16, n5 >> 16, n9 >> 8, n8 >> 8, n21, n24, n27, n22, n25, n28);
                n5 += n34;
                n6 += n32;
                n8 += n35;
                n9 += n33;
                n3 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            return;
        }
        if (n4 >= rs.l.c.k) {
            return;
        }
        if (n2 > rs.l.c.k) {
            n2 = rs.l.c.k;
        }
        if (n3 > rs.l.c.k) {
            n3 = rs.l.c.k;
        }
        if (n2 < n3) {
            n6 = n7 <<= 16;
            n9 = n10 <<= 16;
            if (n4 < 0) {
                n6 -= n32 * n4;
                n7 -= n34 * n4;
                n9 -= n33 * n4;
                n10 -= n35 * n4;
                n4 = 0;
            }
            n5 <<= 16;
            n8 <<= 16;
            if (n2 < 0) {
                n5 -= n30 * n2;
                n8 -= n31 * n2;
                n2 = 0;
            }
            int n40 = n4 - t;
            n21 += n23 * n40;
            n24 += n26 * n40;
            n27 += n29 * n40;
            if (n32 < n34) {
                n3 -= n2;
                n2 -= n4;
                n4 = x[n4];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n4, n6 >> 16, n7 >> 16, n9 >> 8, n10 >> 8, n21, n24, n27, n22, n25, n28);
                    n6 += n32;
                    n7 += n34;
                    n9 += n33;
                    n10 += n35;
                    n4 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n4, n6 >> 16, n5 >> 16, n9 >> 8, n8 >> 8, n21, n24, n27, n22, n25, n28);
                    n6 += n32;
                    n5 += n30;
                    n9 += n33;
                    n8 += n31;
                    n4 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                return;
            }
            n3 -= n2;
            n2 -= n4;
            n4 = x[n4];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, nArray, n4, n7 >> 16, n6 >> 16, n10 >> 8, n9 >> 8, n21, n24, n27, n22, n25, n28);
                n6 += n32;
                n7 += n34;
                n9 += n33;
                n10 += n35;
                n4 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, nArray, n4, n5 >> 16, n6 >> 16, n8 >> 8, n9 >> 8, n21, n24, n27, n22, n25, n28);
                n6 += n32;
                n5 += n30;
                n9 += n33;
                n8 += n31;
                n4 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            return;
        }
        n5 = n7 <<= 16;
        n8 = n10 <<= 16;
        if (n4 < 0) {
            n5 -= n32 * n4;
            n7 -= n34 * n4;
            n8 -= n33 * n4;
            n10 -= n35 * n4;
            n4 = 0;
        }
        n6 <<= 16;
        n9 <<= 16;
        if (n3 < 0) {
            n6 -= n30 * n3;
            n9 -= n31 * n3;
            n3 = 0;
        }
        int n41 = n4 - t;
        n21 += n23 * n41;
        n24 += n26 * n41;
        n27 += n29 * n41;
        if (n32 < n34) {
            n2 -= n3;
            n3 -= n4;
            n4 = x[n4];
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, nArray, n4, n5 >> 16, n7 >> 16, n8 >> 8, n10 >> 8, n21, n24, n27, n22, n25, n28);
                n5 += n32;
                n7 += n34;
                n8 += n33;
                n10 += n35;
                n4 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, nArray, n4, n6 >> 16, n7 >> 16, n9 >> 8, n10 >> 8, n21, n24, n27, n22, n25, n28);
                n6 += n30;
                n7 += n34;
                n9 += n31;
                n10 += n35;
                n4 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            return;
        }
        n2 -= n3;
        n3 -= n4;
        n4 = x[n4];
        while (--n3 >= 0) {
            e_0.a(rs.l.c.g, nArray, n4, n7 >> 16, n5 >> 16, n10 >> 8, n8 >> 8, n21, n24, n27, n22, n25, n28);
            n5 += n32;
            n7 += n34;
            n8 += n33;
            n10 += n35;
            n4 += rs.l.c.h;
            n21 += n23;
            n24 += n26;
            n27 += n29;
        }
        while (--n2 >= 0) {
            e_0.a(rs.l.c.g, nArray, n4, n7 >> 16, n6 >> 16, n10 >> 8, n9 >> 8, n21, n24, n27, n22, n25, n28);
            n6 += n30;
            n7 += n34;
            n9 += n31;
            n10 += n35;
            n4 += rs.l.c.h;
            n21 += n23;
            n24 += n26;
            n27 += n29;
        }
    }

    private static void a(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        int n13;
        int n14;
        int n15;
        int n16;
        if (rs.k.e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ai() && q && n2 <= e_0.d()) {
            n2 += 3064;
        }
        int n17 = 0;
        int n18 = 0;
        if (n3 >= n4) {
            return;
        }
        if (o) {
            n16 = (n6 - n5) / (n4 - n3);
            if (n4 > rs.l.c.n) {
                n4 = rs.l.c.n;
            }
            if (n3 < 0) {
                n5 -= n3 * n16;
                n3 = 0;
            }
            if (n3 >= n4) {
                return;
            }
            n15 = n4 - n3 >> 3;
            n16 <<= 12;
            n5 <<= 9;
        } else {
            if (n4 - n3 > 7) {
                n15 = n4 - n3 >> 3;
                n16 = (n6 - n5) * E[n15] >> 6;
            } else {
                n15 = 0;
                n16 = 0;
            }
            n5 <<= 9;
        }
        n2 += n3;
        if (n) {
            int n19;
            int n20 = 0;
            int n21 = 0;
            int n22 = n3 - s;
            n7 += (n10 >> 3) * n22;
            n8 += (n11 >> 3) * n22;
            int n23 = (n9 += (n12 >> 3) * n22) >> 12;
            if (n23 != 0) {
                n17 = n7 / n23;
                n18 = n8 / n23;
                if (n17 < 0) {
                    n17 = 0;
                } else if (n17 > 4032) {
                    n17 = 4032;
                }
            }
            n7 += n10;
            n8 += n11;
            n23 = (n9 += n12) >> 12;
            if (n23 != 0) {
                n20 = n7 / n23;
                n21 = n8 / n23;
                if (n20 < 7) {
                    n20 = 7;
                } else if (n20 > 4032) {
                    n20 = 4032;
                }
            }
            int n24 = n20 - n17 >> 3;
            int n25 = n21 - n18 >> 3;
            n17 += (n5 & 0x600000) >> 3;
            int n26 = n5 >> 23;
            if (D) {
                while (n15-- > 0) {
                    nArray[n2++] = nArray2[(n18 & 0xFC0) + (n17 >> 6)] >>> n26;
                    nArray[n2++] = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                    nArray[n2++] = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                    nArray[n2++] = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                    nArray[n2++] = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                    nArray[n2++] = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                    nArray[n2++] = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                    nArray[n2++] = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                    n17 = n20;
                    n18 = n21;
                    n7 += n10;
                    n8 += n11;
                    int n27 = (n9 += n12) >> 12;
                    if (n27 != 0) {
                        n20 = n7 / n27;
                        n21 = n8 / n27;
                        if (n20 < 7) {
                            n20 = 7;
                        } else if (n20 > 4032) {
                            n20 = 4032;
                        }
                    }
                    n24 = n20 - n17 >> 3;
                    n25 = n21 - n18 >> 3;
                    n17 += ((n5 += n16) & 0x600000) >> 3;
                    n26 = n5 >> 23;
                }
                n15 = n4 - n3 & 7;
                while (n15-- > 0) {
                    nArray[n2++] = nArray2[(n18 & 0xFC0) + (n17 >> 6)] >>> n26;
                    n17 += n24;
                    n18 += n25;
                }
                return;
            }
            while (n15-- > 0) {
                n19 = nArray2[(n18 & 0xFC0) + (n17 >> 6)] >>> n26;
                if (n19 != 0) {
                    nArray[n2] = n19;
                }
                ++n2;
                n19 = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                if (n19 != 0) {
                    nArray[n2] = n19;
                }
                ++n2;
                n19 = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                if (n19 != 0) {
                    nArray[n2] = n19;
                }
                ++n2;
                n19 = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                if (n19 != 0) {
                    nArray[n2] = n19;
                }
                ++n2;
                n19 = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                if (n19 != 0) {
                    nArray[n2] = n19;
                }
                ++n2;
                n19 = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                if (n19 != 0) {
                    nArray[n2] = n19;
                }
                ++n2;
                n19 = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                if (n19 != 0) {
                    nArray[n2] = n19;
                }
                ++n2;
                n19 = nArray2[((n18 += n25) & 0xFC0) + ((n17 += n24) >> 6)] >>> n26;
                if (n19 != 0) {
                    nArray[n2] = n19;
                }
                ++n2;
                n17 = n20;
                n18 = n21;
                n7 += n10;
                n8 += n11;
                int n28 = (n9 += n12) >> 12;
                if (n28 != 0) {
                    n20 = n7 / n28;
                    n21 = n8 / n28;
                    if (n20 < 7) {
                        n20 = 7;
                    } else if (n20 > 4032) {
                        n20 = 4032;
                    }
                }
                n24 = n20 - n17 >> 3;
                n25 = n21 - n18 >> 3;
                n17 += ((n5 += n16) & 0x600000) >> 3;
                n26 = n5 >> 23;
            }
            n15 = n4 - n3 & 7;
            while (n15-- > 0) {
                n19 = nArray2[(n18 & 0xFC0) + (n17 >> 6)] >>> n26;
                if (n19 != 0) {
                    nArray[n2] = n19;
                }
                ++n2;
                n17 += n24;
                n18 += n25;
            }
            return;
        }
        int n29 = 0;
        int n30 = 0;
        int n31 = n3 - s;
        n7 += (n10 >> 3) * n31;
        n8 += (n11 >> 3) * n31;
        int n32 = (n9 += (n12 >> 3) * n31) >> 14;
        if (n32 != 0) {
            n17 = n7 / n32;
            n18 = n8 / n32;
            if (n17 < 0) {
                n17 = 0;
            } else if (n17 > 16256) {
                n17 = 16256;
            }
        }
        n7 += n10;
        n8 += n11;
        n32 = (n9 += n12) >> 14;
        if (n32 != 0) {
            n29 = n7 / n32;
            n30 = n8 / n32;
            if (n29 < 7) {
                n29 = 7;
            } else if (n29 > 16256) {
                n29 = 16256;
            }
        }
        int n33 = n29 - n17 >> 3;
        int n34 = n30 - n18 >> 3;
        n17 += n5 & 0x600000;
        int n35 = n5 >> 23;
        if (D) {
            while (n15-- > 0) {
                nArray[n2++] = nArray2[(n18 & 0x3F80) + (n17 >> 7)] >>> n35;
                nArray[n2++] = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
                nArray[n2++] = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
                nArray[n2++] = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
                nArray[n2++] = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
                nArray[n2++] = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
                nArray[n2++] = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
                nArray[n2++] = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
                n17 = n29;
                n18 = n30;
                n7 += n10;
                n8 += n11;
                int n36 = (n9 += n12) >> 14;
                if (n36 != 0) {
                    n29 = n7 / n36;
                    n30 = n8 / n36;
                    if (n29 < 7) {
                        n29 = 7;
                    } else if (n29 > 16256) {
                        n29 = 16256;
                    }
                }
                n33 = n29 - n17 >> 3;
                n34 = n30 - n18 >> 3;
                n17 += (n5 += n16) & 0x600000;
                n35 = n5 >> 23;
            }
            n15 = n4 - n3 & 7;
            while (n15-- > 0) {
                nArray[n2++] = nArray2[(n18 & 0x3F80) + (n17 >> 7)] >>> n35;
                n17 += n33;
                n18 += n34;
            }
            return;
        }
        while (n15-- > 0) {
            n14 = nArray2[(n18 & 0x3F80) + (n17 >> 7)] >>> n35;
            if (n14 != 0) {
                nArray[n2] = n14;
            }
            ++n2;
            n14 = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
            if (n14 != 0) {
                nArray[n2] = n14;
            }
            ++n2;
            n14 = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
            if (n14 != 0) {
                nArray[n2] = n14;
            }
            ++n2;
            n14 = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
            if (n14 != 0) {
                nArray[n2] = n14;
            }
            ++n2;
            n14 = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
            if (n14 != 0) {
                nArray[n2] = n14;
            }
            ++n2;
            n14 = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
            if (n14 != 0) {
                nArray[n2] = n14;
            }
            ++n2;
            n14 = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
            if (n14 != 0) {
                nArray[n2] = n14;
            }
            ++n2;
            n14 = nArray2[((n18 += n34) & 0x3F80) + ((n17 += n33) >> 7)] >>> n35;
            if (n14 != 0) {
                nArray[n2] = n14;
            }
            ++n2;
            n17 = n29;
            n18 = n30;
            n7 += n10;
            n8 += n11;
            n13 = (n9 += n12) >> 14;
            if (n13 != 0) {
                n29 = n7 / n13;
                n30 = n8 / n13;
                if (n29 < 7) {
                    n29 = 7;
                } else if (n29 > 16256) {
                    n29 = 16256;
                }
            }
            n33 = n29 - n17 >> 3;
            n34 = n30 - n18 >> 3;
            n17 += (n5 += n16) & 0x600000;
            n35 = n5 >> 23;
        }
        n14 = n4 - n3 & 7;
        while (n14-- > 0) {
            n13 = nArray2[(n18 & 0x3F80) + (n17 >> 7)] >>> n35;
            if (n13 != 0) {
                nArray[n2] = n13;
            }
            ++n2;
            n17 += n33;
            n18 += n34;
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, float f2, float f3, float f4) {
        if (rs.k.e.a() && !h) {
            return;
        }
        if (g) {
            e_0.c(n2, n3, n4, n5, n6, n7, n8, n9, n10);
            return;
        }
        if (f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            return;
        }
        int n11 = B[n8];
        int n12 = B[n9];
        int n13 = B[n10];
        int n14 = n11 >> 16 & 0xFF;
        int n15 = n11 >> 8 & 0xFF;
        int n16 = n11 & 0xFF;
        int n17 = n12 >> 16 & 0xFF;
        int n18 = n12 >> 8 & 0xFF;
        int n19 = n12 & 0xFF;
        int n20 = n13 >> 16 & 0xFF;
        int n21 = n13 >> 8 & 0xFF;
        int n22 = n13 & 0xFF;
        int n23 = 0;
        int n24 = 0;
        int n25 = 0;
        int n26 = 0;
        if (n3 != n2) {
            n23 = (n6 - n5 << 16) / (n3 - n2);
            n24 = (n17 - n14 << 16) / (n3 - n2);
            n25 = (n18 - n15 << 16) / (n3 - n2);
            n26 = (n19 - n16 << 16) / (n3 - n2);
        }
        int n27 = 0;
        int n28 = 0;
        int n29 = 0;
        int n30 = 0;
        if (n4 != n3) {
            n27 = (n7 - n6 << 16) / (n4 - n3);
            n28 = (n20 - n17 << 16) / (n4 - n3);
            n29 = (n21 - n18 << 16) / (n4 - n3);
            n30 = (n22 - n19 << 16) / (n4 - n3);
        }
        int n31 = 0;
        int n32 = 0;
        int n33 = 0;
        int n34 = 0;
        if (n4 != n2) {
            n31 = (n5 - n7 << 16) / (n2 - n4);
            n32 = (n14 - n20 << 16) / (n2 - n4);
            n33 = (n15 - n21 << 16) / (n2 - n4);
            n34 = (n16 - n22 << 16) / (n2 - n4);
        }
        float f5 = n6 - n5;
        float f6 = n3 - n2;
        float f7 = n7 - n5;
        float f8 = n4 - n2;
        float f9 = f3 - f2;
        float f10 = f4 - f2;
        float f11 = f5 * f8 - f7 * f6;
        float f12 = (f9 * f8 - f10 * f6) / f11;
        float f13 = (f10 * f5 - f9 * f7) / f11;
        if (n2 <= n3 && n2 <= n4) {
            if (n2 >= rs.l.c.k) {
                return;
            }
            if (n3 > rs.l.c.k) {
                n3 = rs.l.c.k;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            f2 = f2 - f12 * (float)n5 + f12;
            if (n3 < n4) {
                n7 = n5 <<= 16;
                n20 = n14 <<= 16;
                n21 = n15 <<= 16;
                n22 = n16 <<= 16;
                if (n2 < 0) {
                    n7 -= n31 * n2;
                    n5 -= n23 * n2;
                    n20 -= n32 * n2;
                    n21 -= n33 * n2;
                    n22 -= n34 * n2;
                    n14 -= n24 * n2;
                    n15 -= n25 * n2;
                    n16 -= n26 * n2;
                    f2 -= f13 * (float)n2;
                    n2 = 0;
                }
                n6 <<= 16;
                n17 <<= 16;
                n18 <<= 16;
                n19 <<= 16;
                if (n3 < 0) {
                    n6 -= n27 * n3;
                    n17 -= n28 * n3;
                    n18 -= n29 * n3;
                    n19 -= n30 * n3;
                    n3 = 0;
                }
                if (n2 != n3 && n31 < n23 || n2 == n3 && n31 > n27) {
                    n4 -= n3;
                    n3 -= n2;
                    n2 = x[n2];
                    while (--n3 >= 0) {
                        e_0.a(rs.l.c.g, n2, n7 >> 16, n5 >> 16, n20, n21, n22, n14, n15, n16, f2, f12);
                        n7 += n31;
                        n5 += n23;
                        n20 += n32;
                        n21 += n33;
                        n22 += n34;
                        n14 += n24;
                        n15 += n25;
                        n16 += n26;
                        f2 += f13;
                        n2 += rs.l.c.h;
                    }
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n2, n7 >> 16, n6 >> 16, n20, n21, n22, n17, n18, n19, f2, f12);
                        n7 += n31;
                        n6 += n27;
                        n20 += n32;
                        n21 += n33;
                        n22 += n34;
                        n17 += n28;
                        n18 += n29;
                        n19 += n30;
                        n2 += rs.l.c.h;
                        f2 += f13;
                    }
                    return;
                }
                n4 -= n3;
                n3 -= n2;
                n2 = x[n2];
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n5 >> 16, n7 >> 16, n14, n15, n16, n20, n21, n22, f2, f12);
                    n7 += n31;
                    n5 += n23;
                    n20 += n32;
                    n21 += n33;
                    n22 += n34;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    f2 += f13;
                    n2 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n6 >> 16, n7 >> 16, n17, n18, n19, n20, n21, n22, f2, f12);
                    n7 += n31;
                    n6 += n27;
                    n20 += n32;
                    n21 += n33;
                    n22 += n34;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    n2 += rs.l.c.h;
                    f2 += f13;
                }
                return;
            }
            n6 = n5 <<= 16;
            n17 = n14 <<= 16;
            n18 = n15 <<= 16;
            n19 = n16 <<= 16;
            if (n2 < 0) {
                n6 -= n31 * n2;
                n5 -= n23 * n2;
                n17 -= n32 * n2;
                n18 -= n33 * n2;
                n19 -= n34 * n2;
                n14 -= n24 * n2;
                n15 -= n25 * n2;
                n16 -= n26 * n2;
                f2 -= f13 * (float)n2;
                n2 = 0;
            }
            n7 <<= 16;
            n20 <<= 16;
            n21 <<= 16;
            n22 <<= 16;
            if (n4 < 0) {
                n7 -= n27 * n4;
                n20 -= n28 * n4;
                n21 -= n29 * n4;
                n22 -= n30 * n4;
                n4 = 0;
            }
            if (n2 != n4 && n31 < n23 || n2 == n4 && n27 > n23) {
                n3 -= n4;
                n4 -= n2;
                n2 = x[n2];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n6 >> 16, n5 >> 16, n17, n18, n19, n14, n15, n16, f2, f12);
                    n6 += n31;
                    n5 += n23;
                    n17 += n32;
                    n18 += n33;
                    n19 += n34;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    f2 += f13;
                    n2 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n7 >> 16, n5 >> 16, n20, n21, n22, n14, n15, n16, f2, f12);
                    n7 += n27;
                    n5 += n23;
                    n20 += n28;
                    n21 += n29;
                    n22 += n30;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    n2 += rs.l.c.h;
                    f2 += f13;
                }
                return;
            }
            n3 -= n4;
            n4 -= n2;
            n2 = x[n2];
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n2, n5 >> 16, n6 >> 16, n14, n15, n16, n17, n18, n19, f2, f12);
                n6 += n31;
                n5 += n23;
                n17 += n32;
                n18 += n33;
                n19 += n34;
                n14 += n24;
                n15 += n25;
                n16 += n26;
                f2 += f13;
                n2 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n2, n5 >> 16, n7 >> 16, n14, n15, n16, n20, n21, n22, f2, f12);
                n7 += n27;
                n5 += n23;
                n20 += n28;
                n21 += n29;
                n22 += n30;
                n14 += n24;
                n15 += n25;
                n16 += n26;
                n2 += rs.l.c.h;
                f2 += f13;
            }
            return;
        }
        if (n3 <= n4) {
            if (n3 >= rs.l.c.k) {
                return;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n2 > rs.l.c.k) {
                n2 = rs.l.c.k;
            }
            f3 = f3 - f12 * (float)n6 + f12;
            if (n4 < n2) {
                n5 = n6 <<= 16;
                n14 = n17 <<= 16;
                n15 = n18 <<= 16;
                n16 = n19 <<= 16;
                if (n3 < 0) {
                    n5 -= n23 * n3;
                    n6 -= n27 * n3;
                    n14 -= n24 * n3;
                    n15 -= n25 * n3;
                    n16 -= n26 * n3;
                    n17 -= n28 * n3;
                    n18 -= n29 * n3;
                    n19 -= n30 * n3;
                    f3 -= f13 * (float)n3;
                    n3 = 0;
                }
                n7 <<= 16;
                n20 <<= 16;
                n21 <<= 16;
                n22 <<= 16;
                if (n4 < 0) {
                    n7 -= n31 * n4;
                    n20 -= n32 * n4;
                    n21 -= n33 * n4;
                    n22 -= n34 * n4;
                    n4 = 0;
                }
                if (n3 != n4 && n23 < n27 || n3 == n4 && n23 > n31) {
                    n2 -= n4;
                    n4 -= n3;
                    n3 = x[n3];
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n3, n5 >> 16, n6 >> 16, n14, n15, n16, n17, n18, n19, f3, f12);
                        n5 += n23;
                        n6 += n27;
                        n14 += n24;
                        n15 += n25;
                        n16 += n26;
                        n17 += n28;
                        n18 += n29;
                        n19 += n30;
                        f3 += f13;
                        n3 += rs.l.c.h;
                    }
                    while (--n2 >= 0) {
                        e_0.a(rs.l.c.g, n3, n5 >> 16, n7 >> 16, n14, n15, n16, n20, n21, n22, f3, f12);
                        n5 += n23;
                        n7 += n31;
                        n14 += n24;
                        n15 += n25;
                        n16 += n26;
                        n20 += n32;
                        n21 += n33;
                        n22 += n34;
                        n3 += rs.l.c.h;
                        f3 += f13;
                    }
                    return;
                }
                n2 -= n4;
                n4 -= n3;
                n3 = x[n3];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n6 >> 16, n5 >> 16, n17, n18, n19, n14, n15, n16, f3, f12);
                    n5 += n23;
                    n6 += n27;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    f3 += f13;
                    n3 += rs.l.c.h;
                }
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n7 >> 16, n5 >> 16, n20, n21, n22, n14, n15, n16, f3, f12);
                    n5 += n23;
                    n7 += n31;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    n20 += n32;
                    n21 += n33;
                    n22 += n34;
                    n3 += rs.l.c.h;
                    f3 += f13;
                }
                return;
            }
            n7 = n6 <<= 16;
            n20 = n17 <<= 16;
            n21 = n18 <<= 16;
            n22 = n19 <<= 16;
            if (n3 < 0) {
                n7 -= n23 * n3;
                n6 -= n27 * n3;
                n20 -= n24 * n3;
                n21 -= n25 * n3;
                n22 -= n26 * n3;
                n17 -= n28 * n3;
                n18 -= n29 * n3;
                n19 -= n30 * n3;
                f3 -= f13 * (float)n3;
                n3 = 0;
            }
            n5 <<= 16;
            n14 <<= 16;
            n15 <<= 16;
            n16 <<= 16;
            if (n2 < 0) {
                n5 -= n31 * n2;
                n14 -= n32 * n2;
                n15 -= n33 * n2;
                n16 -= n34 * n2;
                n2 = 0;
            }
            if (n23 < n27) {
                n4 -= n2;
                n2 -= n3;
                n3 = x[n3];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n7 >> 16, n6 >> 16, n20, n21, n22, n17, n18, n19, f3, f12);
                    n7 += n23;
                    n6 += n27;
                    n20 += n24;
                    n21 += n25;
                    n22 += n26;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    f3 += f13;
                    n3 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n5 >> 16, n6 >> 16, n14, n15, n16, n17, n18, n19, f3, f12);
                    n5 += n31;
                    n6 += n27;
                    n14 += n32;
                    n15 += n33;
                    n16 += n34;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    n3 += rs.l.c.h;
                    f3 += f13;
                }
                return;
            }
            n4 -= n2;
            n2 -= n3;
            n3 = x[n3];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n3, n6 >> 16, n7 >> 16, n17, n18, n19, n20, n21, n22, f3, f12);
                n7 += n23;
                n6 += n27;
                n20 += n24;
                n21 += n25;
                n22 += n26;
                n17 += n28;
                n18 += n29;
                n19 += n30;
                f3 += f13;
                n3 += rs.l.c.h;
            }
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n3, n6 >> 16, n5 >> 16, n17, n18, n19, n14, n15, n16, f3, f12);
                n5 += n31;
                n6 += n27;
                n14 += n32;
                n15 += n33;
                n16 += n34;
                n17 += n28;
                n18 += n29;
                n19 += n30;
                n3 += rs.l.c.h;
                f3 += f13;
            }
            return;
        }
        if (n4 >= rs.l.c.k) {
            return;
        }
        if (n2 > rs.l.c.k) {
            n2 = rs.l.c.k;
        }
        if (n3 > rs.l.c.k) {
            n3 = rs.l.c.k;
        }
        f4 = f4 - f12 * (float)n7 + f12;
        if (n2 < n3) {
            n6 = n7 <<= 16;
            n17 = n20 <<= 16;
            n18 = n21 <<= 16;
            n19 = n22 <<= 16;
            if (n4 < 0) {
                n6 -= n27 * n4;
                n7 -= n31 * n4;
                n17 -= n28 * n4;
                n18 -= n29 * n4;
                n19 -= n30 * n4;
                n20 -= n32 * n4;
                n21 -= n33 * n4;
                n22 -= n34 * n4;
                f4 -= f13 * (float)n4;
                n4 = 0;
            }
            n5 <<= 16;
            n14 <<= 16;
            n15 <<= 16;
            n16 <<= 16;
            if (n2 < 0) {
                n5 -= n23 * n2;
                n14 -= n24 * n2;
                n15 -= n25 * n2;
                n16 -= n26 * n2;
                n2 = 0;
            }
            if (n27 < n31) {
                n3 -= n2;
                n2 -= n4;
                n4 = x[n4];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n4, n6 >> 16, n7 >> 16, n17, n18, n19, n20, n21, n22, f4, f12);
                    n6 += n27;
                    n7 += n31;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    n20 += n32;
                    n21 += n33;
                    n22 += n34;
                    f4 += f13;
                    n4 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n4, n6 >> 16, n5 >> 16, n17, n18, n19, n14, n15, n16, f4, f12);
                    n6 += n27;
                    n5 += n23;
                    n17 += n28;
                    n18 += n29;
                    n19 += n30;
                    n14 += n24;
                    n15 += n25;
                    n16 += n26;
                    n4 += rs.l.c.h;
                    f4 += f13;
                }
                return;
            }
            n3 -= n2;
            n2 -= n4;
            n4 = x[n4];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n7 >> 16, n6 >> 16, n20, n21, n22, n17, n18, n19, f4, f12);
                n6 += n27;
                n7 += n31;
                n17 += n28;
                n18 += n29;
                n19 += n30;
                n20 += n32;
                n21 += n33;
                n22 += n34;
                f4 += f13;
                n4 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n5 >> 16, n6 >> 16, n14, n15, n16, n17, n18, n19, f4, f12);
                n6 += n27;
                n5 += n23;
                n17 += n28;
                n18 += n29;
                n19 += n30;
                n14 += n24;
                n15 += n25;
                n16 += n26;
                f4 += f13;
                n4 += rs.l.c.h;
            }
            return;
        }
        n5 = n7 <<= 16;
        n14 = n20 <<= 16;
        n15 = n21 <<= 16;
        n16 = n22 <<= 16;
        if (n4 < 0) {
            n5 -= n27 * n4;
            n7 -= n31 * n4;
            n14 -= n28 * n4;
            n15 -= n29 * n4;
            n16 -= n30 * n4;
            n20 -= n32 * n4;
            n21 -= n33 * n4;
            n22 -= n34 * n4;
            f4 -= f13 * (float)n4;
            n4 = 0;
        }
        n6 <<= 16;
        n17 <<= 16;
        n18 <<= 16;
        n19 <<= 16;
        if (n3 < 0) {
            n6 -= n23 * n3;
            n17 -= n24 * n3;
            n18 -= n25 * n3;
            n19 -= n26 * n3;
            n3 = 0;
        }
        if (n27 < n31) {
            n2 -= n3;
            n3 -= n4;
            n4 = x[n4];
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n5 >> 16, n7 >> 16, n14, n15, n16, n20, n21, n22, f4, f12);
                n5 += n27;
                n7 += n31;
                n14 += n28;
                n15 += n29;
                n16 += n30;
                n20 += n32;
                n21 += n33;
                n22 += n34;
                f4 += f13;
                n4 += rs.l.c.h;
            }
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n6 >> 16, n7 >> 16, n17, n18, n19, n20, n21, n22, f4, f12);
                n6 += n23;
                n7 += n31;
                n17 += n24;
                n18 += n25;
                n19 += n26;
                n20 += n32;
                n21 += n33;
                n22 += n34;
                f4 += f13;
                n4 += rs.l.c.h;
            }
            return;
        }
        n2 -= n3;
        n3 -= n4;
        n4 = x[n4];
        while (--n3 >= 0) {
            e_0.a(rs.l.c.g, n4, n7 >> 16, n5 >> 16, n20, n21, n22, n14, n15, n16, f4, f12);
            n5 += n27;
            n7 += n31;
            n14 += n28;
            n15 += n29;
            n16 += n30;
            n20 += n32;
            n21 += n33;
            n22 += n34;
            f4 += f13;
            n4 += rs.l.c.h;
        }
        while (--n2 >= 0) {
            e_0.a(rs.l.c.g, n4, n7 >> 16, n6 >> 16, n20, n21, n22, n17, n18, n19, f4, f12);
            n6 += n23;
            n7 += n31;
            n17 += n24;
            n18 += n25;
            n19 += n26;
            n20 += n32;
            n21 += n33;
            n22 += n34;
            n4 += rs.l.c.h;
            f4 += f13;
        }
    }

    public static void a(int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, float f2, float f3) {
        block10: {
            int n11;
            if (rs.k.e.a() && !h) {
                return;
            }
            Launcher.n().o();
            if (!Client.ai() && q && n2 <= e_0.d()) {
                n2 += 3064;
            }
            if ((n11 = n4 - n3) <= 0) {
                return;
            }
            n8 = (n8 - n5) / n11;
            n9 = (n9 - n6) / n11;
            n10 = (n10 - n7) / n11;
            if (o) {
                if (n4 > rs.l.c.n) {
                    n11 -= n4 - rs.l.c.n;
                    n4 = rs.l.c.n;
                }
                if (n3 < 0) {
                    n11 = n4;
                    n5 -= n3 * n8;
                    n6 -= n3 * n9;
                    n7 -= n3 * n10;
                    n3 = 0;
                }
            }
            if (n3 >= n4) break block10;
            n2 += n3;
            f2 += f3 * (float)n3;
            if (r == 0) {
                while (--n11 >= 0) {
                    nArray[n2] = n5 & 0xFF0000 | n6 >> 8 & 0xFF00 | n7 >> 16 & 0xFF;
                    rs.l.c.f[n2] = f2;
                    f2 += f3;
                    n5 += n8;
                    n6 += n9;
                    n7 += n10;
                    ++n2;
                }
            } else {
                int n12 = r;
                int n13 = 256 - r;
                while (--n11 >= 0) {
                    int n14 = n5 & 0xFF0000 | n6 >> 8 & 0xFF00 | n7 >> 16 & 0xFF;
                    n14 = ((n14 & 0xFF00FF) * n13 >> 8 & 0xFF00FF) + ((n14 & 0xFF00) * n13 >> 8 & 0xFF00);
                    int n15 = nArray[n2];
                    nArray[n2] = n14 + ((n15 & 0xFF00FF) * n12 >> 8 & 0xFF00FF) + ((n15 & 0xFF00) * n12 >> 8 & 0xFF00);
                    rs.l.c.f[n2] = f2;
                    f2 += f3;
                    n5 += n8;
                    n6 += n9;
                    n7 += n10;
                    ++n2;
                }
            }
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, float f2, float f3, float f4) {
        if (rs.k.e.a() && !h) {
            return;
        }
        if (f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            return;
        }
        int n9 = 0;
        if (n3 != n2) {
            n9 = (n6 - n5 << 16) / (n3 - n2);
        }
        int n10 = 0;
        if (n4 != n3) {
            n10 = (n7 - n6 << 16) / (n4 - n3);
        }
        int n11 = 0;
        if (n4 != n2) {
            n11 = (n5 - n7 << 16) / (n2 - n4);
        }
        float f5 = n6 - n5;
        float f6 = n3 - n2;
        float f7 = n7 - n5;
        float f8 = n4 - n2;
        float f9 = f3 - f2;
        float f10 = f4 - f2;
        float f11 = f5 * f8 - f7 * f6;
        float f12 = (f9 * f8 - f10 * f6) / f11;
        float f13 = (f10 * f5 - f9 * f7) / f11;
        if (n2 <= n3 && n2 <= n4) {
            if (n2 >= rs.l.c.k) {
                return;
            }
            if (n3 > rs.l.c.k) {
                n3 = rs.l.c.k;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            f2 = f2 - f12 * (float)n5 + f12;
            if (n3 < n4) {
                n7 = n5 <<= 16;
                if (n2 < 0) {
                    n7 -= n11 * n2;
                    n5 -= n9 * n2;
                    f2 -= f13 * (float)n2;
                    n2 = 0;
                }
                n6 <<= 16;
                if (n3 < 0) {
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                if (n2 != n3 && n11 < n9 || n2 == n3 && n11 > n10) {
                    n4 -= n3;
                    n3 -= n2;
                    n2 = x[n2];
                    while (--n3 >= 0) {
                        e_0.a(rs.l.c.g, n2, n8, n7 >> 16, n5 >> 16, f2, f12);
                        n7 += n11;
                        n5 += n9;
                        f2 += f13;
                        n2 += rs.l.c.h;
                    }
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n2, n8, n7 >> 16, n6 >> 16, f2, f12);
                        n7 += n11;
                        n6 += n10;
                        n2 += rs.l.c.h;
                        f2 += f13;
                    }
                    return;
                }
                n4 -= n3;
                n3 -= n2;
                n2 = x[n2];
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n5 >> 16, n7 >> 16, f2, f12);
                    n7 += n11;
                    n5 += n9;
                    f2 += f13;
                    n2 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n6 >> 16, n7 >> 16, f2, f12);
                    n7 += n11;
                    n6 += n10;
                    n2 += rs.l.c.h;
                    f2 += f13;
                }
                return;
            }
            n6 = n5 <<= 16;
            if (n2 < 0) {
                n6 -= n11 * n2;
                n5 -= n9 * n2;
                f2 -= f13 * (float)n2;
                n2 = 0;
            }
            n7 <<= 16;
            if (n4 < 0) {
                n7 -= n10 * n4;
                n4 = 0;
            }
            if (n2 != n4 && n11 < n9 || n2 == n4 && n10 > n9) {
                n3 -= n4;
                n4 -= n2;
                n2 = x[n2];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n6 >> 16, n5 >> 16, f2, f12);
                    f2 += f13;
                    n6 += n11;
                    n5 += n9;
                    n2 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n7 >> 16, n5 >> 16, f2, f12);
                    f2 += f13;
                    n7 += n10;
                    n5 += n9;
                    n2 += rs.l.c.h;
                }
                return;
            }
            n3 -= n4;
            n4 -= n2;
            n2 = x[n2];
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n2, n8, n5 >> 16, n6 >> 16, f2, f12);
                f2 += f13;
                n6 += n11;
                n5 += n9;
                n2 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n2, n8, n5 >> 16, n7 >> 16, f2, f12);
                f2 += f13;
                n7 += n10;
                n5 += n9;
                n2 += rs.l.c.h;
            }
            return;
        }
        if (n3 <= n4) {
            if (n3 >= rs.l.c.k) {
                return;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n2 > rs.l.c.k) {
                n2 = rs.l.c.k;
            }
            f3 = f3 - f12 * (float)n6 + f12;
            if (n4 < n2) {
                n5 = n6 <<= 16;
                if (n3 < 0) {
                    n5 -= n9 * n3;
                    n6 -= n10 * n3;
                    f3 -= f13 * (float)n3;
                    n3 = 0;
                }
                n7 <<= 16;
                if (n4 < 0) {
                    n7 -= n11 * n4;
                    n4 = 0;
                }
                if (n3 != n4 && n9 < n10 || n3 == n4 && n9 > n11) {
                    n2 -= n4;
                    n4 -= n3;
                    n3 = x[n3];
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n3, n8, n5 >> 16, n6 >> 16, f3, f12);
                        f3 += f13;
                        n5 += n9;
                        n6 += n10;
                        n3 += rs.l.c.h;
                    }
                    while (--n2 >= 0) {
                        e_0.a(rs.l.c.g, n3, n8, n5 >> 16, n7 >> 16, f3, f12);
                        f3 += f13;
                        n5 += n9;
                        n7 += n11;
                        n3 += rs.l.c.h;
                    }
                    return;
                }
                n2 -= n4;
                n4 -= n3;
                n3 = x[n3];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n6 >> 16, n5 >> 16, f3, f12);
                    f3 += f13;
                    n5 += n9;
                    n6 += n10;
                    n3 += rs.l.c.h;
                }
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n7 >> 16, n5 >> 16, f3, f12);
                    f3 += f13;
                    n5 += n9;
                    n7 += n11;
                    n3 += rs.l.c.h;
                }
                return;
            }
            n7 = n6 <<= 16;
            if (n3 < 0) {
                n7 -= n9 * n3;
                n6 -= n10 * n3;
                f3 -= f13 * (float)n3;
                n3 = 0;
            }
            n5 <<= 16;
            if (n2 < 0) {
                n5 -= n11 * n2;
                n2 = 0;
            }
            if (n9 < n10) {
                n4 -= n2;
                n2 -= n3;
                n3 = x[n3];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n7 >> 16, n6 >> 16, f3, f12);
                    f3 += f13;
                    n7 += n9;
                    n6 += n10;
                    n3 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n5 >> 16, n6 >> 16, f3, f12);
                    f3 += f13;
                    n5 += n11;
                    n6 += n10;
                    n3 += rs.l.c.h;
                }
                return;
            }
            n4 -= n2;
            n2 -= n3;
            n3 = x[n3];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n3, n8, n6 >> 16, n7 >> 16, f3, f12);
                f3 += f13;
                n7 += n9;
                n6 += n10;
                n3 += rs.l.c.h;
            }
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n3, n8, n6 >> 16, n5 >> 16, f3, f12);
                f3 += f13;
                n5 += n11;
                n6 += n10;
                n3 += rs.l.c.h;
            }
            return;
        }
        if (n4 >= rs.l.c.k) {
            return;
        }
        if (n2 > rs.l.c.k) {
            n2 = rs.l.c.k;
        }
        if (n3 > rs.l.c.k) {
            n3 = rs.l.c.k;
        }
        f4 = f4 - f12 * (float)n7 + f12;
        if (n2 < n3) {
            n6 = n7 <<= 16;
            if (n4 < 0) {
                n6 -= n10 * n4;
                n7 -= n11 * n4;
                f4 -= f13 * (float)n4;
                n4 = 0;
            }
            n5 <<= 16;
            if (n2 < 0) {
                n5 -= n9 * n2;
                n2 = 0;
            }
            if (n10 < n11) {
                n3 -= n2;
                n2 -= n4;
                n4 = x[n4];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n4, n8, n6 >> 16, n7 >> 16, f4, f12);
                    f4 += f13;
                    n6 += n10;
                    n7 += n11;
                    n4 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n4, n8, n6 >> 16, n5 >> 16, f4, f12);
                    f4 += f13;
                    n6 += n10;
                    n5 += n9;
                    n4 += rs.l.c.h;
                }
                return;
            }
            n3 -= n2;
            n2 -= n4;
            n4 = x[n4];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n7 >> 16, n6 >> 16, f4, f12);
                f4 += f13;
                n6 += n10;
                n7 += n11;
                n4 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n5 >> 16, n6 >> 16, f4, f12);
                f4 += f13;
                n6 += n10;
                n5 += n9;
                n4 += rs.l.c.h;
            }
            return;
        }
        n5 = n7 <<= 16;
        if (n4 < 0) {
            n5 -= n10 * n4;
            n7 -= n11 * n4;
            f4 -= f13 * (float)n4;
            n4 = 0;
        }
        n6 <<= 16;
        if (n3 < 0) {
            n6 -= n9 * n3;
            n3 = 0;
        }
        if (n10 < n11) {
            n2 -= n3;
            n3 -= n4;
            n4 = x[n4];
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n5 >> 16, n7 >> 16, f4, f12);
                f4 += f13;
                n5 += n10;
                n7 += n11;
                n4 += rs.l.c.h;
            }
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n6 >> 16, n7 >> 16, f4, f12);
                f4 += f13;
                n6 += n9;
                n7 += n11;
                n4 += rs.l.c.h;
            }
            return;
        }
        n2 -= n3;
        n3 -= n4;
        n4 = x[n4];
        while (--n3 >= 0) {
            e_0.a(rs.l.c.g, n4, n8, n7 >> 16, n5 >> 16, f4, f12);
            f4 += f13;
            n5 += n10;
            n7 += n11;
            n4 += rs.l.c.h;
        }
        while (--n2 >= 0) {
            e_0.a(rs.l.c.g, n4, n8, n7 >> 16, n6 >> 16, f4, f12);
            f4 += f13;
            n6 += n9;
            n7 += n11;
            n4 += rs.l.c.h;
        }
    }

    private static void a(int[] nArray, int n2, int n3, int n4, int n5, float f2, float f3) {
        if (rs.k.e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ai() && q && n2 <= e_0.d()) {
            n2 += 3064;
        }
        if (o) {
            if (n5 > rs.l.c.n) {
                n5 = rs.l.c.n;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n2 += n4;
        int n6 = n5 - n4 >> 2;
        f2 += f3 * (float)n4;
        if (r == 0) {
            while (--n6 >= 0) {
                for (int i2 = 0; i2 < 4; ++i2) {
                    if (rs.k.e.a()) {
                        rs.l.c.a(nArray, n2, n3, n3, 256 - r);
                    } else {
                        nArray[n2] = n3;
                    }
                    rs.l.c.f[n2] = f2;
                    ++n2;
                    f2 += f3;
                }
            }
            n6 = n5 - n4 & 3;
            while (--n6 >= 0) {
                if (rs.k.e.a()) {
                    rs.l.c.a(nArray, n2, n3, n3, 256 - r);
                } else {
                    nArray[n2] = n3;
                }
                rs.l.c.f[n2] = f2;
                ++n2;
                f2 += f3;
            }
            return;
        }
        int n7 = r;
        int n8 = 256 - r;
        n3 = ((n3 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n3 & 0xFF00) * n8 >> 8 & 0xFF00);
        while (--n6 >= 0) {
            for (int i3 = 0; i3 < 4; ++i3) {
                if (rs.k.e.a()) {
                    rs.l.c.a(nArray, n2, n3 + (nArray[n2] & 0xFF00FF) + (nArray[n2] & 0xFF00), n3 + (nArray[n2] & 0xFF00FF) + (nArray[n2] & 0xFF00), n7);
                } else {
                    nArray[n2] = n3 + ((nArray[n2] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n7 >> 8 & 0xFF00);
                }
                rs.l.c.f[n2] = f2;
                ++n2;
                f2 += f3;
            }
        }
        n6 = n5 - n4 & 3;
        while (--n6 >= 0) {
            if (rs.k.e.a()) {
                rs.l.c.a(nArray, n2, n3 + (nArray[n2] & 0xFF00FF) + (nArray[n2] & 0xFF00), n3 + (nArray[n2] & 0xFF00FF) + (nArray[n2] & 0xFF00), n7);
            } else {
                nArray[n2] = n3 + ((nArray[n2] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n7 >> 8 & 0xFF00);
            }
            rs.l.c.f[n2] = f2;
            ++n2;
            f2 += f3;
        }
    }

    private static void b(int[] nArray, int n2, int n3, int n4, int n5, float f2, float f3) {
        if (rs.k.e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ai() && q && n2 <= e_0.d()) {
            n2 += 3064;
        }
        if (o) {
            if (n5 > rs.l.c.n) {
                n5 = rs.l.c.n;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n2 += n4;
        int n6 = n5 - n4 >> 2;
        f2 += f3 * (float)n4;
        if (r == 0) {
            while (--n6 >= 0) {
                for (int i2 = 0; i2 < 4; ++i2) {
                    nArray[n2] = n3;
                    rs.l.c.f[n2] = f2;
                    ++n2;
                    f2 += f3;
                }
            }
            n6 = n5 - n4 & 3;
            while (--n6 >= 0) {
                nArray[n2] = n3;
                rs.l.c.f[n2] = f2;
                ++n2;
                f2 += f3;
            }
            return;
        }
        int n7 = r;
        int n8 = 256 - r;
        n3 = ((n3 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n3 & 0xFF00) * n8 >> 8 & 0xFF00);
        while (--n6 >= 0) {
            for (int i3 = 0; i3 < 4; ++i3) {
                nArray[n2] = n3 + ((nArray[n2] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n7 >> 8 & 0xFF00);
                rs.l.c.f[n2] = f2;
                ++n2;
                f2 += f3;
            }
        }
        n6 = n5 - n4 & 3;
        while (--n6 >= 0) {
            nArray[n2] = n3 + ((nArray[n2] & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((nArray[n2] & 0xFF00) * n7 >> 8 & 0xFF00);
            rs.l.c.f[n2] = f2;
            ++n2;
            f2 += f3;
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, float f2, float f3, float f4) {
        if (rs.k.e.a() && !p) {
            e_0.a(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20);
        } else {
            e_0.a(-1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, f2, f3, f4);
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, float f2, float f3, float f4) {
        if (rs.k.e.a() && !h) {
            return;
        }
        if (g) {
            e_0.c(n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21);
            return;
        }
        if (f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            return;
        }
        int[] nArray = e_0.d(n21);
        D = !G[n21];
        n13 = n12 - n13;
        n16 = n15 - n16;
        n19 = n18 - n19;
        int n22 = (n14 -= n12) * n15 - (n17 -= n15) * n12 << 14;
        int n23 = n17 * n18 - (n20 -= n18) * n15 << 8;
        int n24 = n20 * n12 - n14 * n18 << 5;
        int n25 = n13 * n15 - n16 * n12 << 14;
        int n26 = n16 * n18 - n19 * n15 << 8;
        int n27 = n19 * n12 - n13 * n18 << 5;
        int n28 = n16 * n14 - n13 * n17 << 14;
        int n29 = n19 * n17 - n16 * n20 << 8;
        int n30 = n13 * n20 - n19 * n14 << 5;
        int n31 = 0;
        int n32 = 0;
        if (n4 != n3) {
            n31 = (n7 - n6 << 16) / (n4 - n3);
            n32 = (n10 - n9 << 16) / (n4 - n3);
        }
        int n33 = 0;
        int n34 = 0;
        if (n5 != n4) {
            n33 = (n8 - n7 << 16) / (n5 - n4);
            n34 = (n11 - n10 << 16) / (n5 - n4);
        }
        int n35 = 0;
        int n36 = 0;
        if (n5 != n3) {
            n35 = (n6 - n8 << 16) / (n3 - n5);
            n36 = (n9 - n11 << 16) / (n3 - n5);
        }
        float f5 = n7 - n6;
        float f6 = n4 - n3;
        float f7 = n8 - n6;
        float f8 = n5 - n3;
        float f9 = f3 - f2;
        float f10 = f4 - f2;
        float f11 = f5 * f8 - f7 * f6;
        float f12 = (f9 * f8 - f10 * f6) / f11;
        float f13 = (f10 * f5 - f9 * f7) / f11;
        if (n3 <= n4 && n3 <= n5) {
            if (n3 >= rs.l.c.k) {
                return;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n5 > rs.l.c.k) {
                n5 = rs.l.c.k;
            }
            f2 = f2 - f12 * (float)n6 + f12;
            if (n4 < n5) {
                n8 = n6 <<= 16;
                n11 = n9 <<= 16;
                if (n3 < 0) {
                    n8 -= n35 * n3;
                    n6 -= n31 * n3;
                    f2 -= f13 * (float)n3;
                    n11 -= n36 * n3;
                    n9 -= n32 * n3;
                    n3 = 0;
                }
                n7 <<= 16;
                n10 <<= 16;
                if (n4 < 0) {
                    n7 -= n33 * n4;
                    n10 -= n34 * n4;
                    n4 = 0;
                }
                int n37 = n3 - t;
                n22 += n24 * n37;
                n25 += n27 * n37;
                n28 += n30 * n37;
                if (n3 != n4 && n35 < n31 || n3 == n4 && n35 > n33) {
                    n5 -= n4;
                    n4 -= n3;
                    n3 = x[n3];
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, nArray, n3, n8 >> 16, n6 >> 16, n11 >> 8, n9 >> 8, n22, n25, n28, n23, n26, n29, f2, f12);
                        n8 += n35;
                        n6 += n31;
                        f2 += f13;
                        n11 += n36;
                        n9 += n32;
                        n3 += rs.l.c.h;
                        n22 += n24;
                        n25 += n27;
                        n28 += n30;
                    }
                    while (--n5 >= 0) {
                        e_0.a(rs.l.c.g, nArray, n3, n8 >> 16, n7 >> 16, n11 >> 8, n10 >> 8, n22, n25, n28, n23, n26, n29, f2, f12);
                        n8 += n35;
                        n7 += n33;
                        f2 += f13;
                        n11 += n36;
                        n10 += n34;
                        n3 += rs.l.c.h;
                        n22 += n24;
                        n25 += n27;
                        n28 += n30;
                    }
                    return;
                }
                n5 -= n4;
                n4 -= n3;
                n3 = x[n3];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n3, n6 >> 16, n8 >> 16, n9 >> 8, n11 >> 8, n22, n25, n28, n23, n26, n29, f2, f12);
                    n8 += n35;
                    n6 += n31;
                    f2 += f13;
                    n11 += n36;
                    n9 += n32;
                    n3 += rs.l.c.h;
                    n22 += n24;
                    n25 += n27;
                    n28 += n30;
                }
                while (--n5 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n3, n7 >> 16, n8 >> 16, n10 >> 8, n11 >> 8, n22, n25, n28, n23, n26, n29, f2, f12);
                    n8 += n35;
                    n7 += n33;
                    f2 += f13;
                    n11 += n36;
                    n10 += n34;
                    n3 += rs.l.c.h;
                    n22 += n24;
                    n25 += n27;
                    n28 += n30;
                }
                return;
            }
            n7 = n6 <<= 16;
            n10 = n9 <<= 16;
            if (n3 < 0) {
                n7 -= n35 * n3;
                n6 -= n31 * n3;
                f2 -= f13 * (float)n3;
                n10 -= n36 * n3;
                n9 -= n32 * n3;
                n3 = 0;
            }
            n8 <<= 16;
            n11 <<= 16;
            if (n5 < 0) {
                n8 -= n33 * n5;
                n11 -= n34 * n5;
                n5 = 0;
            }
            int n38 = n3 - t;
            n22 += n24 * n38;
            n25 += n27 * n38;
            n28 += n30 * n38;
            if (n3 != n5 && n35 < n31 || n3 == n5 && n33 > n31) {
                n4 -= n5;
                n5 -= n3;
                n3 = x[n3];
                while (--n5 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n3, n7 >> 16, n6 >> 16, n10 >> 8, n9 >> 8, n22, n25, n28, n23, n26, n29, f2, f12);
                    n7 += n35;
                    n6 += n31;
                    n10 += n36;
                    n9 += n32;
                    f2 += f13;
                    n3 += rs.l.c.h;
                    n22 += n24;
                    n25 += n27;
                    n28 += n30;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n3, n8 >> 16, n6 >> 16, n11 >> 8, n9 >> 8, n22, n25, n28, n23, n26, n29, f2, f12);
                    n8 += n33;
                    n6 += n31;
                    n11 += n34;
                    n9 += n32;
                    f2 += f13;
                    n3 += rs.l.c.h;
                    n22 += n24;
                    n25 += n27;
                    n28 += n30;
                }
                return;
            }
            n4 -= n5;
            n5 -= n3;
            n3 = x[n3];
            while (--n5 >= 0) {
                e_0.a(rs.l.c.g, nArray, n3, n6 >> 16, n7 >> 16, n9 >> 8, n10 >> 8, n22, n25, n28, n23, n26, n29, f2, f12);
                n7 += n35;
                n6 += n31;
                n10 += n36;
                n9 += n32;
                f2 += f13;
                n3 += rs.l.c.h;
                n22 += n24;
                n25 += n27;
                n28 += n30;
            }
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, nArray, n3, n6 >> 16, n8 >> 16, n9 >> 8, n11 >> 8, n22, n25, n28, n23, n26, n29, f2, f12);
                n8 += n33;
                n6 += n31;
                n11 += n34;
                n9 += n32;
                f2 += f13;
                n3 += rs.l.c.h;
                n22 += n24;
                n25 += n27;
                n28 += n30;
            }
            return;
        }
        if (n4 <= n5) {
            if (n4 >= rs.l.c.k) {
                return;
            }
            if (n5 > rs.l.c.k) {
                n5 = rs.l.c.k;
            }
            if (n3 > rs.l.c.k) {
                n3 = rs.l.c.k;
            }
            f3 = f3 - f12 * (float)n7 + f12;
            if (n5 < n3) {
                n6 = n7 <<= 16;
                n9 = n10 <<= 16;
                if (n4 < 0) {
                    n6 -= n31 * n4;
                    n7 -= n33 * n4;
                    f3 -= f13 * (float)n4;
                    n9 -= n32 * n4;
                    n10 -= n34 * n4;
                    n4 = 0;
                }
                n8 <<= 16;
                n11 <<= 16;
                if (n5 < 0) {
                    n8 -= n35 * n5;
                    n11 -= n36 * n5;
                    n5 = 0;
                }
                int n39 = n4 - t;
                n22 += n24 * n39;
                n25 += n27 * n39;
                n28 += n30 * n39;
                if (n4 != n5 && n31 < n33 || n4 == n5 && n31 > n35) {
                    n3 -= n5;
                    n5 -= n4;
                    n4 = x[n4];
                    while (--n5 >= 0) {
                        e_0.a(rs.l.c.g, nArray, n4, n6 >> 16, n7 >> 16, n9 >> 8, n10 >> 8, n22, n25, n28, n23, n26, n29, f3, f12);
                        n6 += n31;
                        n7 += n33;
                        n9 += n32;
                        n10 += n34;
                        f3 += f13;
                        n4 += rs.l.c.h;
                        n22 += n24;
                        n25 += n27;
                        n28 += n30;
                    }
                    while (--n3 >= 0) {
                        e_0.a(rs.l.c.g, nArray, n4, n6 >> 16, n8 >> 16, n9 >> 8, n11 >> 8, n22, n25, n28, n23, n26, n29, f3, f12);
                        n6 += n31;
                        n8 += n35;
                        n9 += n32;
                        n11 += n36;
                        f3 += f13;
                        n4 += rs.l.c.h;
                        n22 += n24;
                        n25 += n27;
                        n28 += n30;
                    }
                    return;
                }
                n3 -= n5;
                n5 -= n4;
                n4 = x[n4];
                while (--n5 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n4, n7 >> 16, n6 >> 16, n10 >> 8, n9 >> 8, n22, n25, n28, n23, n26, n29, f3, f12);
                    n6 += n31;
                    n7 += n33;
                    n9 += n32;
                    n10 += n34;
                    f3 += f13;
                    n4 += rs.l.c.h;
                    n22 += n24;
                    n25 += n27;
                    n28 += n30;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n4, n8 >> 16, n6 >> 16, n11 >> 8, n9 >> 8, n22, n25, n28, n23, n26, n29, f3, f12);
                    n6 += n31;
                    n8 += n35;
                    n9 += n32;
                    n11 += n36;
                    f3 += f13;
                    n4 += rs.l.c.h;
                    n22 += n24;
                    n25 += n27;
                    n28 += n30;
                }
                return;
            }
            n8 = n7 <<= 16;
            n11 = n10 <<= 16;
            if (n4 < 0) {
                n8 -= n31 * n4;
                n7 -= n33 * n4;
                f3 -= f13 * (float)n4;
                n11 -= n32 * n4;
                n10 -= n34 * n4;
                n4 = 0;
            }
            n6 <<= 16;
            n9 <<= 16;
            if (n3 < 0) {
                n6 -= n35 * n3;
                n9 -= n36 * n3;
                n3 = 0;
            }
            int n40 = n4 - t;
            n22 += n24 * n40;
            n25 += n27 * n40;
            n28 += n30 * n40;
            if (n31 < n33) {
                n5 -= n3;
                n3 -= n4;
                n4 = x[n4];
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n4, n8 >> 16, n7 >> 16, n11 >> 8, n10 >> 8, n22, n25, n28, n23, n26, n29, f3, f12);
                    n8 += n31;
                    n7 += n33;
                    n11 += n32;
                    n10 += n34;
                    f3 += f13;
                    n4 += rs.l.c.h;
                    n22 += n24;
                    n25 += n27;
                    n28 += n30;
                }
                while (--n5 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n4, n6 >> 16, n7 >> 16, n9 >> 8, n10 >> 8, n22, n25, n28, n23, n26, n29, f3, f12);
                    n6 += n35;
                    n7 += n33;
                    n9 += n36;
                    n10 += n34;
                    f3 += f13;
                    n4 += rs.l.c.h;
                    n22 += n24;
                    n25 += n27;
                    n28 += n30;
                }
                return;
            }
            n5 -= n3;
            n3 -= n4;
            n4 = x[n4];
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, nArray, n4, n7 >> 16, n8 >> 16, n10 >> 8, n11 >> 8, n22, n25, n28, n23, n26, n29, f3, f12);
                n8 += n31;
                n7 += n33;
                n11 += n32;
                n10 += n34;
                f3 += f13;
                n4 += rs.l.c.h;
                n22 += n24;
                n25 += n27;
                n28 += n30;
            }
            while (--n5 >= 0) {
                e_0.a(rs.l.c.g, nArray, n4, n7 >> 16, n6 >> 16, n10 >> 8, n9 >> 8, n22, n25, n28, n23, n26, n29, f3, f12);
                n6 += n35;
                n7 += n33;
                n9 += n36;
                n10 += n34;
                f3 += f13;
                n4 += rs.l.c.h;
                n22 += n24;
                n25 += n27;
                n28 += n30;
            }
            return;
        }
        if (n5 >= rs.l.c.k) {
            return;
        }
        if (n3 > rs.l.c.k) {
            n3 = rs.l.c.k;
        }
        if (n4 > rs.l.c.k) {
            n4 = rs.l.c.k;
        }
        f4 = f4 - f12 * (float)n8 + f12;
        if (n3 < n4) {
            n7 = n8 <<= 16;
            n10 = n11 <<= 16;
            if (n5 < 0) {
                n7 -= n33 * n5;
                n8 -= n35 * n5;
                f4 -= f13 * (float)n5;
                n10 -= n34 * n5;
                n11 -= n36 * n5;
                n5 = 0;
            }
            n6 <<= 16;
            n9 <<= 16;
            if (n3 < 0) {
                n6 -= n31 * n3;
                n9 -= n32 * n3;
                n3 = 0;
            }
            int n41 = n5 - t;
            n22 += n24 * n41;
            n25 += n27 * n41;
            n28 += n30 * n41;
            if (n33 < n35) {
                n4 -= n3;
                n3 -= n5;
                n5 = x[n5];
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n5, n7 >> 16, n8 >> 16, n10 >> 8, n11 >> 8, n22, n25, n28, n23, n26, n29, f4, f12);
                    n7 += n33;
                    n8 += n35;
                    n10 += n34;
                    n11 += n36;
                    f4 += f13;
                    n5 += rs.l.c.h;
                    n22 += n24;
                    n25 += n27;
                    n28 += n30;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, nArray, n5, n7 >> 16, n6 >> 16, n10 >> 8, n9 >> 8, n22, n25, n28, n23, n26, n29, f4, f12);
                    n7 += n33;
                    n6 += n31;
                    n10 += n34;
                    n9 += n32;
                    f4 += f13;
                    n5 += rs.l.c.h;
                    n22 += n24;
                    n25 += n27;
                    n28 += n30;
                }
                return;
            }
            n4 -= n3;
            n3 -= n5;
            n5 = x[n5];
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, nArray, n5, n8 >> 16, n7 >> 16, n11 >> 8, n10 >> 8, n22, n25, n28, n23, n26, n29, f4, f12);
                n7 += n33;
                n8 += n35;
                n10 += n34;
                n11 += n36;
                f4 += f13;
                n5 += rs.l.c.h;
                n22 += n24;
                n25 += n27;
                n28 += n30;
            }
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, nArray, n5, n6 >> 16, n7 >> 16, n9 >> 8, n10 >> 8, n22, n25, n28, n23, n26, n29, f4, f12);
                n7 += n33;
                n6 += n31;
                n10 += n34;
                n9 += n32;
                f4 += f13;
                n5 += rs.l.c.h;
                n22 += n24;
                n25 += n27;
                n28 += n30;
            }
            return;
        }
        n6 = n8 <<= 16;
        n9 = n11 <<= 16;
        if (n5 < 0) {
            n6 -= n33 * n5;
            n8 -= n35 * n5;
            f4 -= f13 * (float)n5;
            n9 -= n34 * n5;
            n11 -= n36 * n5;
            n5 = 0;
        }
        n7 <<= 16;
        n10 <<= 16;
        if (n4 < 0) {
            n7 -= n31 * n4;
            n10 -= n32 * n4;
            n4 = 0;
        }
        int n42 = n5 - t;
        n22 += n24 * n42;
        n25 += n27 * n42;
        n28 += n30 * n42;
        if (n33 < n35) {
            n3 -= n4;
            n4 -= n5;
            n5 = x[n5];
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, nArray, n5, n6 >> 16, n8 >> 16, n9 >> 8, n11 >> 8, n22, n25, n28, n23, n26, n29, f4, f12);
                n6 += n33;
                n8 += n35;
                n9 += n34;
                n11 += n36;
                f4 += f13;
                n5 += rs.l.c.h;
                n22 += n24;
                n25 += n27;
                n28 += n30;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, nArray, n5, n7 >> 16, n8 >> 16, n10 >> 8, n11 >> 8, n22, n25, n28, n23, n26, n29, f4, f12);
                n7 += n31;
                n8 += n35;
                n10 += n32;
                n11 += n36;
                f4 += f13;
                n5 += rs.l.c.h;
                n22 += n24;
                n25 += n27;
                n28 += n30;
            }
            return;
        }
        n3 -= n4;
        n4 -= n5;
        n5 = x[n5];
        while (--n4 >= 0) {
            e_0.a(rs.l.c.g, nArray, n5, n8 >> 16, n6 >> 16, n11 >> 8, n9 >> 8, n22, n25, n28, n23, n26, n29, f4, f12);
            n6 += n33;
            n8 += n35;
            n9 += n34;
            n11 += n36;
            f4 += f13;
            n5 += rs.l.c.h;
            n22 += n24;
            n25 += n27;
            n28 += n30;
        }
        while (--n3 >= 0) {
            e_0.a(rs.l.c.g, nArray, n5, n8 >> 16, n7 >> 16, n11 >> 8, n10 >> 8, n22, n25, n28, n23, n26, n29, f4, f12);
            n7 += n31;
            n8 += n35;
            n10 += n32;
            n11 += n36;
            f4 += f13;
            n5 += rs.l.c.h;
            n22 += n24;
            n25 += n27;
            n28 += n30;
        }
    }

    public static void a(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, float f2, float f3) {
        int n13;
        int n14;
        int n15;
        int n16;
        if (rs.k.e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ai() && q && n2 <= e_0.d()) {
            n2 += 3064;
        }
        int n17 = 0;
        int n18 = 0;
        if (n3 >= n4) {
            return;
        }
        if (o) {
            n16 = (n6 - n5) / (n4 - n3);
            if (n4 > rs.l.c.n) {
                n4 = rs.l.c.n;
            }
            if (n3 < 0) {
                n5 -= n3 * n16;
                n3 = 0;
            }
            if (n3 >= n4) {
                return;
            }
            n15 = n4 - n3 >> 3;
            n16 <<= 12;
            n5 <<= 9;
        } else {
            if (n4 - n3 > 7) {
                n15 = n4 - n3 >> 3;
                n16 = (n6 - n5) * E[n15] >> 6;
            } else {
                n15 = 0;
                n16 = 0;
            }
            n5 <<= 9;
        }
        n2 += n3;
        f2 += f3 * (float)n3;
        if (n) {
            int n19;
            int n20 = 0;
            int n21 = 0;
            int n22 = n3 - s;
            n7 += (n10 >> 3) * n22;
            n8 += (n11 >> 3) * n22;
            int n23 = (n9 += (n12 >> 3) * n22) >> 12;
            if (n23 != 0) {
                n17 = n7 / n23;
                n18 = n8 / n23;
                if (n17 < 0) {
                    n17 = 0;
                } else if (n17 > 4032) {
                    n17 = 4032;
                }
            }
            n7 += n10;
            n8 += n11;
            n23 = (n9 += n12) >> 12;
            if (n23 != 0) {
                n20 = n7 / n23;
                n21 = n8 / n23;
                if (n20 < 7) {
                    n20 = 7;
                } else if (n20 > 4032) {
                    n20 = 4032;
                }
            }
            int n24 = n20 - n17 >> 3;
            int n25 = n21 - n18 >> 3;
            n17 += (n5 & 0x600000) >> 3;
            int n26 = n5 >> 23;
            if (D) {
                while (n15-- > 0) {
                    int n27;
                    for (n27 = 0; n27 < 8; ++n27) {
                        rs.l.c.a(nArray, n2, nArray2[(n18 & 0xFC0) + (n17 >> 6)] >>> n26, nArray2[(n18 & 0xFC0) + (n17 >> 6)] >>> n26, 255);
                        rs.l.c.f[n2] = f2;
                        ++n2;
                        f2 += f3;
                        n17 += n24;
                        n18 += n25;
                    }
                    n17 = n20;
                    n18 = n21;
                    n7 += n10;
                    n8 += n11;
                    n27 = (n9 += n12) >> 12;
                    if (n27 != 0) {
                        n20 = n7 / n27;
                        n21 = n8 / n27;
                        if (n20 < 7) {
                            n20 = 7;
                        } else if (n20 > 4032) {
                            n20 = 4032;
                        }
                    }
                    n24 = n20 - n17 >> 3;
                    n25 = n21 - n18 >> 3;
                    n17 += ((n5 += n16) & 0x600000) >> 3;
                    n26 = n5 >> 23;
                }
                n15 = n4 - n3 & 7;
                while (n15-- > 0) {
                    rs.l.c.a(nArray, n2, nArray2[(n18 & 0xFC0) + (n17 >> 6)] >>> n26, nArray2[(n18 & 0xFC0) + (n17 >> 6)] >>> n26, 255);
                    rs.l.c.f[n2] = f2;
                    ++n2;
                    f2 += f3;
                    n17 += n24;
                    n18 += n25;
                }
                return;
            }
            while (n15-- > 0) {
                int n28;
                for (n28 = 0; n28 < 8; ++n28) {
                    n19 = nArray2[(n18 & 0xFC0) + (n17 >> 6)] >>> n26;
                    if (n19 != 0) {
                        rs.l.c.a(nArray, n2, n19, n19, 255);
                        rs.l.c.f[n2] = f2;
                    }
                    ++n2;
                    f2 += f3;
                    n17 += n24;
                    n18 += n25;
                }
                n17 = n20;
                n18 = n21;
                n7 += n10;
                n8 += n11;
                n28 = (n9 += n12) >> 12;
                if (n28 != 0) {
                    n20 = n7 / n28;
                    n21 = n8 / n28;
                    if (n20 < 7) {
                        n20 = 7;
                    } else if (n20 > 4032) {
                        n20 = 4032;
                    }
                }
                n24 = n20 - n17 >> 3;
                n25 = n21 - n18 >> 3;
                n17 += ((n5 += n16) & 0x600000) >> 3;
                n26 = n5 >> 23;
            }
            n15 = n4 - n3 & 7;
            while (n15-- > 0) {
                n19 = nArray2[(n18 & 0xFC0) + (n17 >> 6)] >>> n26;
                if (n19 != 0) {
                    rs.l.c.a(nArray, n2, n19, n19, 255);
                    rs.l.c.f[n2] = f2;
                }
                ++n2;
                f2 += f3;
                n17 += n24;
                n18 += n25;
            }
            return;
        }
        int n29 = 0;
        int n30 = 0;
        int n31 = n3 - s;
        n7 += (n10 >> 3) * n31;
        n8 += (n11 >> 3) * n31;
        int n32 = (n9 += (n12 >> 3) * n31) >> 14;
        if (n32 != 0) {
            n17 = n7 / n32;
            n18 = n8 / n32;
            if (n17 < 0) {
                n17 = 0;
            } else if (n17 > 16256) {
                n17 = 16256;
            }
        }
        n7 += n10;
        n8 += n11;
        n32 = (n9 += n12) >> 14;
        if (n32 != 0) {
            n29 = n7 / n32;
            n30 = n8 / n32;
            if (n29 < 7) {
                n29 = 7;
            } else if (n29 > 16256) {
                n29 = 16256;
            }
        }
        int n33 = n29 - n17 >> 3;
        int n34 = n30 - n18 >> 3;
        n17 += n5 & 0x600000;
        int n35 = n5 >> 23;
        if (D) {
            while (n15-- > 0) {
                int n36;
                for (n36 = 0; n36 < 8; ++n36) {
                    rs.l.c.a(nArray, n2, nArray2[(n18 & 0x3F80) + (n17 >> 7)] >>> n35, nArray2[(n18 & 0x3F80) + (n17 >> 7)] >>> n35, 255);
                    rs.l.c.f[n2] = f2;
                    f2 += f3;
                    ++n2;
                    n17 += n33;
                    n18 += n34;
                }
                n17 = n29;
                n18 = n30;
                n7 += n10;
                n8 += n11;
                n36 = (n9 += n12) >> 14;
                if (n36 != 0) {
                    n29 = n7 / n36;
                    n30 = n8 / n36;
                    if (n29 < 7) {
                        n29 = 7;
                    } else if (n29 > 16256) {
                        n29 = 16256;
                    }
                }
                n33 = n29 - n17 >> 3;
                n34 = n30 - n18 >> 3;
                n17 += (n5 += n16) & 0x600000;
                n35 = n5 >> 23;
            }
            n15 = n4 - n3 & 7;
            while (n15-- > 0) {
                rs.l.c.a(nArray, n2, nArray2[(n18 & 0x3F80) + (n17 >> 7)] >>> n35, nArray2[(n18 & 0x3F80) + (n17 >> 7)] >>> n35, 255);
                rs.l.c.f[n2] = f2;
                ++n2;
                f2 += f3;
                n17 += n33;
                n18 += n34;
            }
            return;
        }
        while (n15-- > 0) {
            for (n14 = 0; n14 < 8; ++n14) {
                n13 = nArray2[(n18 & 0x3F80) + (n17 >> 7)] >>> n35;
                if (n13 != 0) {
                    rs.l.c.a(nArray, n2, n13, n13, 255);
                    rs.l.c.f[n2] = f2;
                }
                ++n2;
                f2 += f3;
                n17 += n33;
                n18 += n34;
            }
            n17 = n29;
            n18 = n30;
            n7 += n10;
            n8 += n11;
            n14 = (n9 += n12) >> 14;
            if (n14 != 0) {
                n29 = n7 / n14;
                n30 = n8 / n14;
                if (n29 < 7) {
                    n29 = 7;
                } else if (n29 > 16256) {
                    n29 = 16256;
                }
            }
            n33 = n29 - n17 >> 3;
            n34 = n30 - n18 >> 3;
            n17 += (n5 += n16) & 0x600000;
            n35 = n5 >> 23;
        }
        n13 = n4 - n3 & 7;
        while (n13-- > 0) {
            n14 = nArray2[(n18 & 0x3F80) + (n17 >> 7)] >>> n35;
            if (n14 != 0) {
                rs.l.c.a(nArray, n2, n14, n14, 255);
                rs.l.c.f[n2] = f2;
            }
            f2 += f3;
            ++n2;
            n17 += n33;
            n18 += n34;
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, float f2, float f3, float f4) {
        block66: {
            float f5;
            float f6;
            int n8;
            int n9;
            int n10;
            block67: {
                block65: {
                    if (rs.k.e.a() && !h) {
                        return;
                    }
                    n10 = 0;
                    if (n6 != n5) {
                        n10 = (n3 - n2 << 16) / (n6 - n5);
                    }
                    n9 = 0;
                    if (n7 != n6) {
                        n9 = (n4 - n3 << 16) / (n7 - n6);
                    }
                    n8 = 0;
                    if (n7 != n5) {
                        n8 = (n2 - n4 << 16) / (n5 - n7);
                    }
                    float f7 = n3 - n2;
                    float f8 = n6 - n5;
                    float f9 = n4 - n2;
                    float f10 = n7 - n5;
                    float f11 = f3 - f2;
                    float f12 = f4 - f2;
                    float f13 = f7 * f10 - f9 * f8;
                    f6 = (f11 * f10 - f12 * f8) / f13;
                    f5 = (f12 * f7 - f11 * f9) / f13;
                    if (n5 > n6 || n5 > n7) break block65;
                    if (n5 >= rs.l.c.k) break block66;
                    if (n6 > rs.l.c.k) {
                        n6 = rs.l.c.k;
                    }
                    if (n7 > rs.l.c.k) {
                        n7 = rs.l.c.k;
                    }
                    f2 = f2 - f6 * (float)n2 + f6;
                    if (n6 < n7) {
                        n4 = n2 <<= 16;
                        if (n5 < 0) {
                            n4 -= n8 * n5;
                            n2 -= n10 * n5;
                            f2 -= f5 * (float)n5;
                            n5 = 0;
                        }
                        n3 <<= 16;
                        if (n6 < 0) {
                            n3 -= n9 * n6;
                            n6 = 0;
                        }
                        if (n5 != n6 && n8 < n10 || n5 == n6 && n8 > n9) {
                            n7 -= n6;
                            n6 -= n5;
                            n5 = x[n5];
                            while (--n6 >= 0) {
                                e_0.a(n5, n4 >> 16, n2 >> 16, f2, f6);
                                n4 += n8;
                                n2 += n10;
                                f2 += f5;
                                n5 += rs.l.c.h;
                            }
                            while (--n7 >= 0) {
                                e_0.a(n5, n4 >> 16, n3 >> 16, f2, f6);
                                n4 += n8;
                                n3 += n9;
                                f2 += f5;
                                n5 += rs.l.c.h;
                            }
                        } else {
                            n7 -= n6;
                            n6 -= n5;
                            n5 = x[n5];
                            while (--n6 >= 0) {
                                e_0.a(n5, n2 >> 16, n4 >> 16, f2, f6);
                                n4 += n8;
                                n2 += n10;
                                f2 += f5;
                                n5 += rs.l.c.h;
                            }
                            while (--n7 >= 0) {
                                e_0.a(n5, n3 >> 16, n4 >> 16, f2, f6);
                                n4 += n8;
                                n3 += n9;
                                f2 += f5;
                                n5 += rs.l.c.h;
                            }
                        }
                    } else {
                        n3 = n2 <<= 16;
                        if (n5 < 0) {
                            n3 -= n8 * n5;
                            n2 -= n10 * n5;
                            f2 -= f5 * (float)n5;
                            n5 = 0;
                        }
                        n4 <<= 16;
                        if (n7 < 0) {
                            n4 -= n9 * n7;
                            n7 = 0;
                        }
                        if (n5 != n7 && n8 < n10 || n5 == n7 && n9 > n10) {
                            n6 -= n7;
                            n7 -= n5;
                            n5 = x[n5];
                            while (--n7 >= 0) {
                                e_0.a(n5, n3 >> 16, n2 >> 16, f2, f6);
                                n3 += n8;
                                n2 += n10;
                                f2 += f5;
                                n5 += rs.l.c.h;
                            }
                            while (--n6 >= 0) {
                                e_0.a(n5, n4 >> 16, n2 >> 16, f2, f6);
                                n4 += n9;
                                n2 += n10;
                                f2 += f5;
                                n5 += rs.l.c.h;
                            }
                        } else {
                            n6 -= n7;
                            n7 -= n5;
                            n5 = x[n5];
                            while (--n7 >= 0) {
                                e_0.a(n5, n2 >> 16, n3 >> 16, f2, f6);
                                n3 += n8;
                                n2 += n10;
                                f2 += f5;
                                n5 += rs.l.c.h;
                            }
                            while (--n6 >= 0) {
                                e_0.a(n5, n2 >> 16, n4 >> 16, f2, f6);
                                n4 += n9;
                                n2 += n10;
                                f2 += f5;
                                n5 += rs.l.c.h;
                            }
                        }
                    }
                    break block66;
                }
                if (n6 > n7) break block67;
                if (n6 >= rs.l.c.k) break block66;
                if (n7 > rs.l.c.k) {
                    n7 = rs.l.c.k;
                }
                if (n5 > rs.l.c.k) {
                    n5 = rs.l.c.k;
                }
                f3 = f3 - f6 * (float)n3 + f6;
                if (n7 < n5) {
                    n2 = n3 <<= 16;
                    if (n6 < 0) {
                        n2 -= n10 * n6;
                        n3 -= n9 * n6;
                        f3 -= f5 * (float)n6;
                        n6 = 0;
                    }
                    n4 <<= 16;
                    if (n7 < 0) {
                        n4 -= n8 * n7;
                        n7 = 0;
                    }
                    if (n6 != n7 && n10 < n9 || n6 == n7 && n10 > n8) {
                        n5 -= n7;
                        n7 -= n6;
                        n6 = x[n6];
                        while (--n7 >= 0) {
                            e_0.a(n6, n2 >> 16, n3 >> 16, f3, f6);
                            n2 += n10;
                            n3 += n9;
                            f3 += f5;
                            n6 += rs.l.c.h;
                        }
                        while (--n5 >= 0) {
                            e_0.a(n6, n2 >> 16, n4 >> 16, f3, f6);
                            n2 += n10;
                            n4 += n8;
                            f3 += f5;
                            n6 += rs.l.c.h;
                        }
                    } else {
                        n5 -= n7;
                        n7 -= n6;
                        n6 = x[n6];
                        while (--n7 >= 0) {
                            e_0.a(n6, n3 >> 16, n2 >> 16, f3, f6);
                            n2 += n10;
                            n3 += n9;
                            f3 += f5;
                            n6 += rs.l.c.h;
                        }
                        while (--n5 >= 0) {
                            e_0.a(n6, n4 >> 16, n2 >> 16, f3, f6);
                            n2 += n10;
                            n4 += n8;
                            f3 += f5;
                            n6 += rs.l.c.h;
                        }
                    }
                } else {
                    n4 = n3 <<= 16;
                    if (n6 < 0) {
                        n4 -= n10 * n6;
                        n3 -= n9 * n6;
                        f3 -= f5 * (float)n6;
                        n6 = 0;
                    }
                    n2 <<= 16;
                    if (n5 < 0) {
                        n2 -= n8 * n5;
                        n5 = 0;
                    }
                    if (n10 < n9) {
                        n7 -= n5;
                        n5 -= n6;
                        n6 = x[n6];
                        while (--n5 >= 0) {
                            e_0.a(n6, n4 >> 16, n3 >> 16, f3, f6);
                            n4 += n10;
                            n3 += n9;
                            f3 += f5;
                            n6 += rs.l.c.h;
                        }
                        while (--n7 >= 0) {
                            e_0.a(n6, n2 >> 16, n3 >> 16, f3, f6);
                            n2 += n8;
                            n3 += n9;
                            f3 += f5;
                            n6 += rs.l.c.h;
                        }
                    } else {
                        n7 -= n5;
                        n5 -= n6;
                        n6 = x[n6];
                        while (--n5 >= 0) {
                            e_0.a(n6, n3 >> 16, n4 >> 16, f3, f6);
                            n4 += n10;
                            n3 += n9;
                            f3 += f5;
                            n6 += rs.l.c.h;
                        }
                        while (--n7 >= 0) {
                            e_0.a(n6, n3 >> 16, n2 >> 16, f3, f6);
                            n2 += n8;
                            n3 += n9;
                            f3 += f5;
                            n6 += rs.l.c.h;
                        }
                    }
                }
                break block66;
            }
            if (n7 < rs.l.c.k) {
                if (n5 > rs.l.c.k) {
                    n5 = rs.l.c.k;
                }
                if (n6 > rs.l.c.k) {
                    n6 = rs.l.c.k;
                }
                f4 = f4 - f6 * (float)n4 + f6;
                if (n5 < n6) {
                    n3 = n4 <<= 16;
                    if (n7 < 0) {
                        n3 -= n9 * n7;
                        n4 -= n8 * n7;
                        f4 -= f5 * (float)n7;
                        n7 = 0;
                    }
                    n2 <<= 16;
                    if (n5 < 0) {
                        n2 -= n10 * n5;
                        n5 = 0;
                    }
                    if (n9 < n8) {
                        n6 -= n5;
                        n5 -= n7;
                        n7 = x[n7];
                        while (--n5 >= 0) {
                            e_0.a(n7, n3 >> 16, n4 >> 16, f4, f6);
                            n3 += n9;
                            n4 += n8;
                            f4 += f5;
                            n7 += rs.l.c.h;
                        }
                        while (--n6 >= 0) {
                            e_0.a(n7, n3 >> 16, n2 >> 16, f4, f6);
                            n3 += n9;
                            n2 += n10;
                            f4 += f5;
                            n7 += rs.l.c.h;
                        }
                    } else {
                        n6 -= n5;
                        n5 -= n7;
                        n7 = x[n7];
                        while (--n5 >= 0) {
                            e_0.a(n7, n4 >> 16, n3 >> 16, f4, f6);
                            n3 += n9;
                            n4 += n8;
                            f4 += f5;
                            n7 += rs.l.c.h;
                        }
                        while (--n6 >= 0) {
                            e_0.a(n7, n2 >> 16, n3 >> 16, f4, f6);
                            n3 += n9;
                            n2 += n10;
                            f4 += f5;
                            n7 += rs.l.c.h;
                        }
                    }
                } else {
                    n2 = n4 <<= 16;
                    if (n7 < 0) {
                        n2 -= n9 * n7;
                        n4 -= n8 * n7;
                        f4 -= f5 * (float)n7;
                        n7 = 0;
                    }
                    n3 <<= 16;
                    if (n6 < 0) {
                        n3 -= n10 * n6;
                        n6 = 0;
                    }
                    if (n9 < n8) {
                        n5 -= n6;
                        n6 -= n7;
                        n7 = x[n7];
                        while (--n6 >= 0) {
                            e_0.a(n7, n2 >> 16, n4 >> 16, f4, f6);
                            n2 += n9;
                            n4 += n8;
                            f4 += f5;
                            n7 += rs.l.c.h;
                        }
                        while (--n5 >= 0) {
                            e_0.a(n7, n3 >> 16, n4 >> 16, f4, f6);
                            n3 += n10;
                            n4 += n8;
                            f4 += f5;
                            n7 += rs.l.c.h;
                        }
                    } else {
                        n5 -= n6;
                        n6 -= n7;
                        n7 = x[n7];
                        while (--n6 >= 0) {
                            e_0.a(n7, n4 >> 16, n2 >> 16, f4, f6);
                            n2 += n9;
                            n4 += n8;
                            f4 += f5;
                            n7 += rs.l.c.h;
                        }
                        while (--n5 >= 0) {
                            e_0.a(n7, n4 >> 16, n3 >> 16, f4, f6);
                            n3 += n10;
                            n4 += n8;
                            f4 += f5;
                            n7 += rs.l.c.h;
                        }
                    }
                }
            }
        }
    }

    private static void a(int n2, int n3, int n4, float f2, float f3) {
        if (rs.k.e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ai() && q && n2 <= e_0.d()) {
            n2 += 3064;
        }
        int n5 = rs.l.c.f.length;
        if (o) {
            if (n4 > rs.l.c.h) {
                n4 = rs.l.c.h;
            }
            if (n3 < 0) {
                n3 = 0;
            }
        }
        if (n3 >= n4) {
            return;
        }
        n2 += n3 - 1;
        int n6 = n4 - n3 >> 2;
        f2 += f3 * (float)n3;
        if (r == 0) {
            while (--n6 >= 0) {
                if (++n2 >= 0 && n2 < n5) {
                    rs.l.c.f[n2] = f2;
                }
                f2 += f3;
                if (++n2 >= 0 && n2 < n5) {
                    rs.l.c.f[n2] = f2;
                }
                f2 += f3;
                if (++n2 >= 0 && n2 < n5) {
                    rs.l.c.f[n2] = f2;
                }
                f2 += f3;
                if (++n2 >= 0 && n2 < n5) {
                    rs.l.c.f[n2] = f2;
                }
                f2 += f3;
            }
            n6 = n4 - n3 & 3;
            while (--n6 >= 0) {
                if (++n2 >= 0 && n2 < n5) {
                    rs.l.c.f[n2] = f2;
                }
                f2 += f3;
            }
            return;
        }
        while (--n6 >= 0) {
            if (++n2 >= 0 && n2 < n5) {
                rs.l.c.f[n2] = f2;
            }
            f2 += f3;
            if (++n2 >= 0 && n2 < n5) {
                rs.l.c.f[n2] = f2;
            }
            f2 += f3;
            if (++n2 >= 0 && n2 < n5) {
                rs.l.c.f[n2] = f2;
            }
            f2 += f3;
            if (++n2 >= 0 && n2 < n5) {
                rs.l.c.f[n2] = f2;
            }
            f2 += f3;
        }
        n6 = n4 - n3 & 3;
        while (--n6 >= 0) {
            if (++n2 >= 0 && n2 < n5) {
                rs.l.c.f[n2] = f2;
            }
            f2 += f3;
        }
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20) {
        if (rs.k.e.a() && !h) {
            return;
        }
        n8 = 127 - n8 << 1;
        n9 = 127 - n9 << 1;
        n10 = 127 - n10 << 1;
        int[] nArray = e_0.d(n20);
        D = !G[n20];
        n12 = n11 - n12;
        n15 = n14 - n15;
        n18 = n17 - n18;
        int n21 = (n13 -= n11) * n14 - (n16 -= n14) * n11 << 14;
        int n22 = n16 * n17 - (n19 -= n17) * n14 << 8;
        int n23 = n19 * n11 - n13 * n17 << 5;
        int n24 = n12 * n14 - n15 * n11 << 14;
        int n25 = n15 * n17 - n18 * n14 << 8;
        int n26 = n18 * n11 - n12 * n17 << 5;
        int n27 = n15 * n13 - n12 * n16 << 14;
        int n28 = n18 * n16 - n15 * n19 << 8;
        int n29 = n12 * n19 - n18 * n13 << 5;
        int n30 = 0;
        int n31 = 0;
        if (n3 != n2) {
            n30 = (n6 - n5 << 16) / (n3 - n2);
            n31 = (n9 - n8 << 16) / (n3 - n2);
        }
        int n32 = 0;
        int n33 = 0;
        if (n4 != n3) {
            n32 = (n7 - n6 << 16) / (n4 - n3);
            n33 = (n10 - n9 << 16) / (n4 - n3);
        }
        int n34 = 0;
        int n35 = 0;
        if (n4 != n2) {
            n34 = (n5 - n7 << 16) / (n2 - n4);
            n35 = (n8 - n10 << 16) / (n2 - n4);
        }
        if (n2 <= n3 && n2 <= n4) {
            if (n2 >= rs.l.c.k) {
                return;
            }
            if (n3 > rs.l.c.k) {
                n3 = rs.l.c.k;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n3 < n4) {
                n7 = n5 <<= 16;
                n10 = n8 <<= 16;
                if (n2 < 0) {
                    n7 -= n34 * n2;
                    n5 -= n30 * n2;
                    n10 -= n35 * n2;
                    n8 -= n31 * n2;
                    n2 = 0;
                }
                n6 <<= 16;
                n9 <<= 16;
                if (n3 < 0) {
                    n6 -= n32 * n3;
                    n9 -= n33 * n3;
                    n3 = 0;
                }
                int n36 = n2 - t;
                n21 += n23 * n36;
                n24 += n26 * n36;
                n27 += n29 * n36;
                if (n2 != n3 && n34 < n30 || n2 == n3 && n34 > n32) {
                    n4 -= n3;
                    n3 -= n2;
                    n2 = x[n2];
                    while (--n3 >= 0) {
                        e_0.b(rs.l.c.g, nArray, n2, n7 >> 16, n5 >> 16, n10, n8, n21, n24, n27, n22, n25, n28);
                        n7 += n34;
                        n5 += n30;
                        n10 += n35;
                        n8 += n31;
                        n2 += rs.l.c.h;
                        n21 += n23;
                        n24 += n26;
                        n27 += n29;
                    }
                    while (--n4 >= 0) {
                        e_0.b(rs.l.c.g, nArray, n2, n7 >> 16, n6 >> 16, n10, n9, n21, n24, n27, n22, n25, n28);
                        n7 += n34;
                        n6 += n32;
                        n10 += n35;
                        n9 += n33;
                        n2 += rs.l.c.h;
                        n21 += n23;
                        n24 += n26;
                        n27 += n29;
                    }
                    return;
                }
                n4 -= n3;
                n3 -= n2;
                n2 = x[n2];
                while (--n3 >= 0) {
                    e_0.b(rs.l.c.g, nArray, n2, n5 >> 16, n7 >> 16, n8, n10, n21, n24, n27, n22, n25, n28);
                    n7 += n34;
                    n5 += n30;
                    n10 += n35;
                    n8 += n31;
                    n2 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                while (--n4 >= 0) {
                    e_0.b(rs.l.c.g, nArray, n2, n6 >> 16, n7 >> 16, n9, n10, n21, n24, n27, n22, n25, n28);
                    n7 += n34;
                    n6 += n32;
                    n10 += n35;
                    n9 += n33;
                    n2 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                return;
            }
            n6 = n5 <<= 16;
            n9 = n8 <<= 16;
            if (n2 < 0) {
                n6 -= n34 * n2;
                n5 -= n30 * n2;
                n9 -= n35 * n2;
                n8 -= n31 * n2;
                n2 = 0;
            }
            n7 <<= 16;
            n10 <<= 16;
            if (n4 < 0) {
                n7 -= n32 * n4;
                n10 -= n33 * n4;
                n4 = 0;
            }
            int n37 = n2 - t;
            n21 += n23 * n37;
            n24 += n26 * n37;
            n27 += n29 * n37;
            if (n2 != n4 && n34 < n30 || n2 == n4 && n32 > n30) {
                n3 -= n4;
                n4 -= n2;
                n2 = x[n2];
                while (--n4 >= 0) {
                    e_0.b(rs.l.c.g, nArray, n2, n6 >> 16, n5 >> 16, n9, n8, n21, n24, n27, n22, n25, n28);
                    n6 += n34;
                    n5 += n30;
                    n9 += n35;
                    n8 += n31;
                    n2 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                while (--n3 >= 0) {
                    e_0.b(rs.l.c.g, nArray, n2, n7 >> 16, n5 >> 16, n10, n8, n21, n24, n27, n22, n25, n28);
                    n7 += n32;
                    n5 += n30;
                    n10 += n33;
                    n8 += n31;
                    n2 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                return;
            }
            n3 -= n4;
            n4 -= n2;
            n2 = x[n2];
            while (--n4 >= 0) {
                e_0.b(rs.l.c.g, nArray, n2, n5 >> 16, n6 >> 16, n8, n9, n21, n24, n27, n22, n25, n28);
                n6 += n34;
                n5 += n30;
                n9 += n35;
                n8 += n31;
                n2 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            while (--n3 >= 0) {
                e_0.b(rs.l.c.g, nArray, n2, n5 >> 16, n7 >> 16, n8, n10, n21, n24, n27, n22, n25, n28);
                n7 += n32;
                n5 += n30;
                n10 += n33;
                n8 += n31;
                n2 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            return;
        }
        if (n3 <= n4) {
            if (n3 >= rs.l.c.k) {
                return;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n2 > rs.l.c.k) {
                n2 = rs.l.c.k;
            }
            if (n4 < n2) {
                n5 = n6 <<= 16;
                n8 = n9 <<= 16;
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n32 * n3;
                    n8 -= n31 * n3;
                    n9 -= n33 * n3;
                    n3 = 0;
                }
                n7 <<= 16;
                n10 <<= 16;
                if (n4 < 0) {
                    n7 -= n34 * n4;
                    n10 -= n35 * n4;
                    n4 = 0;
                }
                int n38 = n3 - t;
                n21 += n23 * n38;
                n24 += n26 * n38;
                n27 += n29 * n38;
                if (n3 != n4 && n30 < n32 || n3 == n4 && n30 > n34) {
                    n2 -= n4;
                    n4 -= n3;
                    n3 = x[n3];
                    while (--n4 >= 0) {
                        e_0.b(rs.l.c.g, nArray, n3, n5 >> 16, n6 >> 16, n8, n9, n21, n24, n27, n22, n25, n28);
                        n5 += n30;
                        n6 += n32;
                        n8 += n31;
                        n9 += n33;
                        n3 += rs.l.c.h;
                        n21 += n23;
                        n24 += n26;
                        n27 += n29;
                    }
                    while (--n2 >= 0) {
                        e_0.b(rs.l.c.g, nArray, n3, n5 >> 16, n7 >> 16, n8, n10, n21, n24, n27, n22, n25, n28);
                        n5 += n30;
                        n7 += n34;
                        n8 += n31;
                        n10 += n35;
                        n3 += rs.l.c.h;
                        n21 += n23;
                        n24 += n26;
                        n27 += n29;
                    }
                    return;
                }
                n2 -= n4;
                n4 -= n3;
                n3 = x[n3];
                while (--n4 >= 0) {
                    e_0.b(rs.l.c.g, nArray, n3, n6 >> 16, n5 >> 16, n9, n8, n21, n24, n27, n22, n25, n28);
                    n5 += n30;
                    n6 += n32;
                    n8 += n31;
                    n9 += n33;
                    n3 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                while (--n2 >= 0) {
                    e_0.b(rs.l.c.g, nArray, n3, n7 >> 16, n5 >> 16, n10, n8, n21, n24, n27, n22, n25, n28);
                    n5 += n30;
                    n7 += n34;
                    n8 += n31;
                    n10 += n35;
                    n3 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                return;
            }
            n7 = n6 <<= 16;
            n10 = n9 <<= 16;
            if (n3 < 0) {
                n7 -= n30 * n3;
                n6 -= n32 * n3;
                n10 -= n31 * n3;
                n9 -= n33 * n3;
                n3 = 0;
            }
            n5 <<= 16;
            n8 <<= 16;
            if (n2 < 0) {
                n5 -= n34 * n2;
                n8 -= n35 * n2;
                n2 = 0;
            }
            int n39 = n3 - t;
            n21 += n23 * n39;
            n24 += n26 * n39;
            n27 += n29 * n39;
            if (n30 < n32) {
                n4 -= n2;
                n2 -= n3;
                n3 = x[n3];
                while (--n2 >= 0) {
                    e_0.b(rs.l.c.g, nArray, n3, n7 >> 16, n6 >> 16, n10, n9, n21, n24, n27, n22, n25, n28);
                    n7 += n30;
                    n6 += n32;
                    n10 += n31;
                    n9 += n33;
                    n3 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                while (--n4 >= 0) {
                    e_0.b(rs.l.c.g, nArray, n3, n5 >> 16, n6 >> 16, n8, n9, n21, n24, n27, n22, n25, n28);
                    n5 += n34;
                    n6 += n32;
                    n8 += n35;
                    n9 += n33;
                    n3 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                return;
            }
            n4 -= n2;
            n2 -= n3;
            n3 = x[n3];
            while (--n2 >= 0) {
                e_0.b(rs.l.c.g, nArray, n3, n6 >> 16, n7 >> 16, n9, n10, n21, n24, n27, n22, n25, n28);
                n7 += n30;
                n6 += n32;
                n10 += n31;
                n9 += n33;
                n3 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            while (--n4 >= 0) {
                e_0.b(rs.l.c.g, nArray, n3, n6 >> 16, n5 >> 16, n9, n8, n21, n24, n27, n22, n25, n28);
                n5 += n34;
                n6 += n32;
                n8 += n35;
                n9 += n33;
                n3 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            return;
        }
        if (n4 >= rs.l.c.k) {
            return;
        }
        if (n2 > rs.l.c.k) {
            n2 = rs.l.c.k;
        }
        if (n3 > rs.l.c.k) {
            n3 = rs.l.c.k;
        }
        if (n2 < n3) {
            n6 = n7 <<= 16;
            n9 = n10 <<= 16;
            if (n4 < 0) {
                n6 -= n32 * n4;
                n7 -= n34 * n4;
                n9 -= n33 * n4;
                n10 -= n35 * n4;
                n4 = 0;
            }
            n5 <<= 16;
            n8 <<= 16;
            if (n2 < 0) {
                n5 -= n30 * n2;
                n8 -= n31 * n2;
                n2 = 0;
            }
            int n40 = n4 - t;
            n21 += n23 * n40;
            n24 += n26 * n40;
            n27 += n29 * n40;
            if (n32 < n34) {
                n3 -= n2;
                n2 -= n4;
                n4 = x[n4];
                while (--n2 >= 0) {
                    e_0.b(rs.l.c.g, nArray, n4, n6 >> 16, n7 >> 16, n9, n10, n21, n24, n27, n22, n25, n28);
                    n6 += n32;
                    n7 += n34;
                    n9 += n33;
                    n10 += n35;
                    n4 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                while (--n3 >= 0) {
                    e_0.b(rs.l.c.g, nArray, n4, n6 >> 16, n5 >> 16, n9, n8, n21, n24, n27, n22, n25, n28);
                    n6 += n32;
                    n5 += n30;
                    n9 += n33;
                    n8 += n31;
                    n4 += rs.l.c.h;
                    n21 += n23;
                    n24 += n26;
                    n27 += n29;
                }
                return;
            }
            n3 -= n2;
            n2 -= n4;
            n4 = x[n4];
            while (--n2 >= 0) {
                e_0.b(rs.l.c.g, nArray, n4, n7 >> 16, n6 >> 16, n10, n9, n21, n24, n27, n22, n25, n28);
                n6 += n32;
                n7 += n34;
                n9 += n33;
                n10 += n35;
                n4 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            while (--n3 >= 0) {
                e_0.b(rs.l.c.g, nArray, n4, n5 >> 16, n6 >> 16, n8, n9, n21, n24, n27, n22, n25, n28);
                n6 += n32;
                n5 += n30;
                n9 += n33;
                n8 += n31;
                n4 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            return;
        }
        n5 = n7 <<= 16;
        n8 = n10 <<= 16;
        if (n4 < 0) {
            n5 -= n32 * n4;
            n7 -= n34 * n4;
            n8 -= n33 * n4;
            n10 -= n35 * n4;
            n4 = 0;
        }
        n6 <<= 16;
        n9 <<= 16;
        if (n3 < 0) {
            n6 -= n30 * n3;
            n9 -= n31 * n3;
            n3 = 0;
        }
        int n41 = n4 - t;
        n21 += n23 * n41;
        n24 += n26 * n41;
        n27 += n29 * n41;
        if (n32 < n34) {
            n2 -= n3;
            n3 -= n4;
            n4 = x[n4];
            while (--n3 >= 0) {
                e_0.b(rs.l.c.g, nArray, n4, n5 >> 16, n7 >> 16, n8, n10, n21, n24, n27, n22, n25, n28);
                n5 += n32;
                n7 += n34;
                n8 += n33;
                n10 += n35;
                n4 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            while (--n2 >= 0) {
                e_0.b(rs.l.c.g, nArray, n4, n6 >> 16, n7 >> 16, n9, n10, n21, n24, n27, n22, n25, n28);
                n6 += n30;
                n7 += n34;
                n9 += n31;
                n10 += n35;
                n4 += rs.l.c.h;
                n21 += n23;
                n24 += n26;
                n27 += n29;
            }
            return;
        }
        n2 -= n3;
        n3 -= n4;
        n4 = x[n4];
        while (--n3 >= 0) {
            e_0.b(rs.l.c.g, nArray, n4, n7 >> 16, n5 >> 16, n10, n8, n21, n24, n27, n22, n25, n28);
            n5 += n32;
            n7 += n34;
            n8 += n33;
            n10 += n35;
            n4 += rs.l.c.h;
            n21 += n23;
            n24 += n26;
            n27 += n29;
        }
        while (--n2 >= 0) {
            e_0.b(rs.l.c.g, nArray, n4, n7 >> 16, n6 >> 16, n10, n9, n21, n24, n27, n22, n25, n28);
            n6 += n30;
            n7 += n34;
            n9 += n31;
            n10 += n35;
            n4 += rs.l.c.h;
            n21 += n23;
            n24 += n26;
            n27 += n29;
        }
    }

    private static void b(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        int n13;
        int n14;
        int n15;
        if (rs.k.e.a() && !h) {
            return;
        }
        Launcher.n().o();
        if (!Client.ai() && q && n2 <= e_0.d()) {
            n2 += 3064;
        }
        int n16 = 0;
        int n17 = 0;
        if (n3 >= n4) {
            return;
        }
        int n18 = (n6 - n5) / (n4 - n3);
        if (o) {
            if (n4 > rs.l.c.n) {
                n4 = rs.l.c.n;
            }
            if (n3 < 0) {
                n5 -= n3 * n18;
                n3 = 0;
            }
        }
        if (n3 >= n4) {
            return;
        }
        int n19 = n4 - n3 >> 3;
        n2 += n3;
        if (n || rs.k.e.a()) {
            int n20;
            int n21;
            int n22 = 0;
            int n23 = 0;
            int n24 = n3 - s;
            n7 += (n10 >> 3) * n24;
            n8 += (n11 >> 3) * n24;
            int n25 = (n9 += (n12 >> 3) * n24) >> 12;
            if (n25 != 0) {
                n16 = n7 / n25;
                n17 = n8 / n25;
                if (n16 < 0) {
                    n16 = 0;
                } else if (n16 > 4032) {
                    n16 = 4032;
                }
            }
            n7 += n10;
            n8 += n11;
            n25 = (n9 += n12) >> 12;
            if (n25 != 0) {
                n22 = n7 / n25;
                n23 = n8 / n25;
                if (n22 < 7) {
                    n22 = 7;
                } else if (n22 > 4032) {
                    n22 = 4032;
                }
            }
            int n26 = n22 - n16 >> 3;
            int n27 = n23 - n17 >> 3;
            if (D) {
                int n28;
                int n29;
                while (n19-- > 0) {
                    n29 = nArray2[(n17 & 0xFC0) + (n16 >> 6)];
                    n28 = n5 >> 16;
                    rs.l.c.a(nArray, n2++, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, 255);
                    n29 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                    n28 = (n5 += n18) >> 16;
                    rs.l.c.a(nArray, n2++, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, 255);
                    n29 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                    n28 = (n5 += n18) >> 16;
                    rs.l.c.a(nArray, n2++, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, 255);
                    n29 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                    n28 = (n5 += n18) >> 16;
                    rs.l.c.a(nArray, n2++, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, 255);
                    n29 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                    n28 = (n5 += n18) >> 16;
                    rs.l.c.a(nArray, n2++, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, 255);
                    n29 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                    n28 = (n5 += n18) >> 16;
                    rs.l.c.a(nArray, n2++, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, 255);
                    n29 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                    n28 = (n5 += n18) >> 16;
                    rs.l.c.a(nArray, n2++, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, 255);
                    n29 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                    n28 = (n5 += n18) >> 16;
                    rs.l.c.a(nArray, n2++, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, 255);
                    n16 += n26;
                    n17 += n27;
                    n5 += n18;
                    n7 += n10;
                    n8 += n11;
                    int n30 = (n9 += n12) >> 12;
                    if (n30 != 0) {
                        n22 = n7 / n30;
                        n23 = n8 / n30;
                        if (n22 < 7) {
                            n22 = 7;
                        } else if (n22 > 4032) {
                            n22 = 4032;
                        }
                    }
                    n26 = n22 - n16 >> 3;
                    n27 = n23 - n17 >> 3;
                    n5 += n18;
                }
                n19 = n4 - n3 & 7;
                while (n19-- > 0) {
                    n29 = nArray2[(n17 & 0xFC0) + (n16 >> 6)];
                    n28 = n5 >> 16;
                    rs.l.c.a(nArray, n2++, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, ((n29 & 0xFF00FF) * n28 & 0xFF00FF00) + ((n29 & 0xFF00) * n28 & 0xFF0000) >> 8, 255);
                    n16 += n26;
                    n17 += n27;
                    n5 += n18;
                }
                return;
            }
            while (n19-- > 0) {
                n21 = nArray2[(n17 & 0xFC0) + (n16 >> 6)];
                if (n21 != 0) {
                    n20 = n5 >> 16;
                    rs.l.c.a(nArray, n2, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, 255);
                }
                ++n2;
                n5 += n18;
                n21 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                if (n21 != 0) {
                    n20 = n5 >> 16;
                    rs.l.c.a(nArray, n2, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, 255);
                }
                ++n2;
                n5 += n18;
                n21 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                if (n21 != 0) {
                    n20 = n5 >> 16;
                    rs.l.c.a(nArray, n2, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, 255);
                }
                ++n2;
                n5 += n18;
                n21 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                if (n21 != 0) {
                    n20 = n5 >> 16;
                    rs.l.c.a(nArray, n2, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, 255);
                }
                ++n2;
                n5 += n18;
                n21 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                if (n21 != 0) {
                    n20 = n5 >> 16;
                    rs.l.c.a(nArray, n2, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, 255);
                }
                ++n2;
                n5 += n18;
                n21 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                if (n21 != 0) {
                    n20 = n5 >> 16;
                    rs.l.c.a(nArray, n2, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, 255);
                }
                ++n2;
                n5 += n18;
                n21 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                if (n21 != 0) {
                    n20 = n5 >> 16;
                    rs.l.c.a(nArray, n2, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, 255);
                }
                ++n2;
                n5 += n18;
                n21 = nArray2[((n17 += n27) & 0xFC0) + ((n16 += n26) >> 6)];
                if (n21 != 0) {
                    n20 = n5 >> 16;
                    rs.l.c.a(nArray, n2, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, 255);
                }
                ++n2;
                n16 += n26;
                n17 += n27;
                n5 += n18;
                n7 += n10;
                n8 += n11;
                int n31 = (n9 += n12) >> 12;
                if (n31 != 0) {
                    n22 = n7 / n31;
                    n23 = n8 / n31;
                    if (n22 < 7) {
                        n22 = 7;
                    } else if (n22 > 4032) {
                        n22 = 4032;
                    }
                }
                n26 = n22 - n16 >> 3;
                n27 = n23 - n17 >> 3;
                n5 += n18;
            }
            n19 = n4 - n3 & 7;
            while (n19-- > 0) {
                n21 = nArray2[(n17 & 0xFC0) + (n16 >> 6)];
                if (n21 != 0) {
                    n20 = n5 >> 16;
                    rs.l.c.a(nArray, n2, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, ((n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n21 & 0xFF00) * n20 & 0xFF0000) >> 8, 255);
                }
                ++n2;
                n16 += n26;
                n17 += n27;
                n5 += n18;
            }
            return;
        }
        int n32 = 0;
        int n33 = 0;
        int n34 = n3 - s;
        n7 += (n10 >> 3) * n34;
        n8 += (n11 >> 3) * n34;
        int n35 = (n9 += (n12 >> 3) * n34) >> 14;
        if (n35 != 0) {
            n16 = n7 / n35;
            n17 = n8 / n35;
            if (n16 < 0) {
                n16 = 0;
            } else if (n16 > 16256) {
                n16 = 16256;
            }
        }
        n7 += n10;
        n8 += n11;
        n35 = (n9 += n12) >> 14;
        if (n35 != 0) {
            n32 = n7 / n35;
            n33 = n8 / n35;
            if (n32 < 7) {
                n32 = 7;
            } else if (n32 > 16256) {
                n32 = 16256;
            }
        }
        int n36 = n32 - n16 >> 3;
        int n37 = n33 - n17 >> 3;
        if (D) {
            int n38;
            int n39;
            while (n19-- > 0) {
                n39 = nArray2[(n17 & 0x3F80) + (n16 >> 7)];
                n38 = n5 >> 16;
                nArray[n2++] = ((n39 & 0xFF00FF) * n38 & 0xFF00FF00) + ((n39 & 0xFF00) * n38 & 0xFF0000) >> 8;
                n39 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
                n38 = (n5 += n18) >> 16;
                nArray[n2++] = ((n39 & 0xFF00FF) * n38 & 0xFF00FF00) + ((n39 & 0xFF00) * n38 & 0xFF0000) >> 8;
                n39 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
                n38 = (n5 += n18) >> 16;
                nArray[n2++] = ((n39 & 0xFF00FF) * n38 & 0xFF00FF00) + ((n39 & 0xFF00) * n38 & 0xFF0000) >> 8;
                n39 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
                n38 = (n5 += n18) >> 16;
                nArray[n2++] = ((n39 & 0xFF00FF) * n38 & 0xFF00FF00) + ((n39 & 0xFF00) * n38 & 0xFF0000) >> 8;
                n39 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
                n38 = (n5 += n18) >> 16;
                nArray[n2++] = ((n39 & 0xFF00FF) * n38 & 0xFF00FF00) + ((n39 & 0xFF00) * n38 & 0xFF0000) >> 8;
                n39 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
                n38 = (n5 += n18) >> 16;
                nArray[n2++] = ((n39 & 0xFF00FF) * n38 & 0xFF00FF00) + ((n39 & 0xFF00) * n38 & 0xFF0000) >> 8;
                n39 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
                n38 = (n5 += n18) >> 16;
                nArray[n2++] = ((n39 & 0xFF00FF) * n38 & 0xFF00FF00) + ((n39 & 0xFF00) * n38 & 0xFF0000) >> 8;
                n39 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
                n38 = (n5 += n18) >> 16;
                nArray[n2++] = ((n39 & 0xFF00FF) * n38 & 0xFF00FF00) + ((n39 & 0xFF00) * n38 & 0xFF0000) >> 8;
                n16 += n36;
                n17 += n37;
                n5 += n18;
                n7 += n10;
                n8 += n11;
                int n40 = (n9 += n12) >> 14;
                if (n40 != 0) {
                    n32 = n7 / n40;
                    n33 = n8 / n40;
                    if (n32 < 7) {
                        n32 = 7;
                    } else if (n32 > 16256) {
                        n32 = 16256;
                    }
                }
                n36 = n32 - n16 >> 3;
                n37 = n33 - n17 >> 3;
                n5 += n18;
            }
            n19 = n4 - n3 & 7;
            while (n19-- > 0) {
                n39 = nArray2[(n17 & 0x3F80) + (n16 >> 7)];
                n38 = n5 >> 16;
                nArray[n2++] = ((n39 & 0xFF00FF) * n38 & 0xFF00FF00) + ((n39 & 0xFF00) * n38 & 0xFF0000) >> 8;
                n16 += n36;
                n17 += n37;
                n5 += n18;
            }
            return;
        }
        while (n19-- > 0) {
            n15 = nArray2[(n17 & 0x3F80) + (n16 >> 7)];
            if (n15 != 0) {
                n14 = n5 >> 16;
                nArray[n2] = ((n15 & 0xFF00FF) * n14 & 0xFF00FF00) + ((n15 & 0xFF00) * n14 & 0xFF0000) >> 8;
            }
            ++n2;
            n5 += n18;
            n15 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
            if (n15 != 0) {
                n14 = n5 >> 16;
                nArray[n2] = ((n15 & 0xFF00FF) * n14 & 0xFF00FF00) + ((n15 & 0xFF00) * n14 & 0xFF0000) >> 8;
            }
            ++n2;
            n5 += n18;
            n15 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
            if (n15 != 0) {
                n14 = n5 >> 16;
                nArray[n2] = ((n15 & 0xFF00FF) * n14 & 0xFF00FF00) + ((n15 & 0xFF00) * n14 & 0xFF0000) >> 8;
            }
            ++n2;
            n5 += n18;
            n15 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
            if (n15 != 0) {
                n14 = n5 >> 16;
                nArray[n2] = ((n15 & 0xFF00FF) * n14 & 0xFF00FF00) + ((n15 & 0xFF00) * n14 & 0xFF0000) >> 8;
            }
            ++n2;
            n5 += n18;
            n15 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
            if (n15 != 0) {
                n14 = n5 >> 16;
                nArray[n2] = ((n15 & 0xFF00FF) * n14 & 0xFF00FF00) + ((n15 & 0xFF00) * n14 & 0xFF0000) >> 8;
            }
            ++n2;
            n5 += n18;
            n15 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
            if (n15 != 0) {
                n14 = n5 >> 16;
                nArray[n2] = ((n15 & 0xFF00FF) * n14 & 0xFF00FF00) + ((n15 & 0xFF00) * n14 & 0xFF0000) >> 8;
            }
            ++n2;
            n5 += n18;
            n15 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
            if (n15 != 0) {
                n14 = n5 >> 16;
                nArray[n2] = ((n15 & 0xFF00FF) * n14 & 0xFF00FF00) + ((n15 & 0xFF00) * n14 & 0xFF0000) >> 8;
            }
            ++n2;
            n5 += n18;
            n15 = nArray2[((n17 += n37) & 0x3F80) + ((n16 += n36) >> 7)];
            if (n15 != 0) {
                n14 = n5 >> 16;
                nArray[n2] = ((n15 & 0xFF00FF) * n14 & 0xFF00FF00) + ((n15 & 0xFF00) * n14 & 0xFF0000) >> 8;
            }
            ++n2;
            n16 += n36;
            n17 += n37;
            n5 += n18;
            n7 += n10;
            n8 += n11;
            n13 = (n9 += n12) >> 14;
            if (n13 != 0) {
                n32 = n7 / n13;
                n33 = n8 / n13;
                if (n32 < 7) {
                    n32 = 7;
                } else if (n32 > 16256) {
                    n32 = 16256;
                }
            }
            n36 = n32 - n16 >> 3;
            n37 = n33 - n17 >> 3;
            n5 += n18;
        }
        n15 = n4 - n3 & 7;
        while (n15-- > 0) {
            n14 = nArray2[(n17 & 0x3F80) + (n16 >> 7)];
            if (n14 != 0) {
                n13 = n5 >> 16;
                nArray[n2] = ((n14 & 0xFF00FF) * n13 & 0xFF00FF00) + ((n14 & 0xFF00) * n13 & 0xFF0000) >> 8;
            }
            ++n2;
            n16 += n36;
            n17 += n37;
            n5 += n18;
        }
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (rs.k.e.a() && !h) {
            return;
        }
        int n9 = 0;
        if (n3 != n2) {
            n9 = (n6 - n5 << 16) / (n3 - n2);
        }
        int n10 = 0;
        if (n4 != n3) {
            n10 = (n7 - n6 << 16) / (n4 - n3);
        }
        int n11 = 0;
        if (n4 != n2) {
            n11 = (n5 - n7 << 16) / (n2 - n4);
        }
        if (n2 <= n3 && n2 <= n4) {
            if (n2 >= rs.l.c.k) {
                return;
            }
            if (n3 > rs.l.c.k) {
                n3 = rs.l.c.k;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n3 < n4) {
                n7 = n5 <<= 16;
                if (n2 < 0) {
                    n7 -= n11 * n2;
                    n5 -= n9 * n2;
                    n2 = 0;
                }
                n6 <<= 16;
                if (n3 < 0) {
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                if (n2 != n3 && n11 < n9 || n2 == n3 && n11 > n10) {
                    n4 -= n3;
                    n3 -= n2;
                    n2 = x[n2];
                    while (--n3 >= 0) {
                        e_0.a(rs.l.c.g, n2, n8, n7 >> 16, n5 >> 16);
                        n7 += n11;
                        n5 += n9;
                        n2 += rs.l.c.h;
                    }
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n2, n8, n7 >> 16, n6 >> 16);
                        n7 += n11;
                        n6 += n10;
                        n2 += rs.l.c.h;
                    }
                    return;
                }
                n4 -= n3;
                n3 -= n2;
                n2 = x[n2];
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n5 >> 16, n7 >> 16);
                    n7 += n11;
                    n5 += n9;
                    n2 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n6 >> 16, n7 >> 16);
                    n7 += n11;
                    n6 += n10;
                    n2 += rs.l.c.h;
                }
                return;
            }
            n6 = n5 <<= 16;
            if (n2 < 0) {
                n6 -= n11 * n2;
                n5 -= n9 * n2;
                n2 = 0;
            }
            n7 <<= 16;
            if (n4 < 0) {
                n7 -= n10 * n4;
                n4 = 0;
            }
            if (n2 != n4 && n11 < n9 || n2 == n4 && n10 > n9) {
                n3 -= n4;
                n4 -= n2;
                n2 = x[n2];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n6 >> 16, n5 >> 16);
                    n6 += n11;
                    n5 += n9;
                    n2 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n2, n8, n7 >> 16, n5 >> 16);
                    n7 += n10;
                    n5 += n9;
                    n2 += rs.l.c.h;
                }
                return;
            }
            n3 -= n4;
            n4 -= n2;
            n2 = x[n2];
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n2, n8, n5 >> 16, n6 >> 16);
                n6 += n11;
                n5 += n9;
                n2 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n2, n8, n5 >> 16, n7 >> 16);
                n7 += n10;
                n5 += n9;
                n2 += rs.l.c.h;
            }
            return;
        }
        if (n3 <= n4) {
            if (n3 >= rs.l.c.k) {
                return;
            }
            if (n4 > rs.l.c.k) {
                n4 = rs.l.c.k;
            }
            if (n2 > rs.l.c.k) {
                n2 = rs.l.c.k;
            }
            if (n4 < n2) {
                n5 = n6 <<= 16;
                if (n3 < 0) {
                    n5 -= n9 * n3;
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                n7 <<= 16;
                if (n4 < 0) {
                    n7 -= n11 * n4;
                    n4 = 0;
                }
                if (n3 != n4 && n9 < n10 || n3 == n4 && n9 > n11) {
                    n2 -= n4;
                    n4 -= n3;
                    n3 = x[n3];
                    while (--n4 >= 0) {
                        e_0.a(rs.l.c.g, n3, n8, n5 >> 16, n6 >> 16);
                        n5 += n9;
                        n6 += n10;
                        n3 += rs.l.c.h;
                    }
                    while (--n2 >= 0) {
                        e_0.a(rs.l.c.g, n3, n8, n5 >> 16, n7 >> 16);
                        n5 += n9;
                        n7 += n11;
                        n3 += rs.l.c.h;
                    }
                    return;
                }
                n2 -= n4;
                n4 -= n3;
                n3 = x[n3];
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n6 >> 16, n5 >> 16);
                    n5 += n9;
                    n6 += n10;
                    n3 += rs.l.c.h;
                }
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n7 >> 16, n5 >> 16);
                    n5 += n9;
                    n7 += n11;
                    n3 += rs.l.c.h;
                }
                return;
            }
            n7 = n6 <<= 16;
            if (n3 < 0) {
                n7 -= n9 * n3;
                n6 -= n10 * n3;
                n3 = 0;
            }
            n5 <<= 16;
            if (n2 < 0) {
                n5 -= n11 * n2;
                n2 = 0;
            }
            if (n9 < n10) {
                n4 -= n2;
                n2 -= n3;
                n3 = x[n3];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n7 >> 16, n6 >> 16);
                    n7 += n9;
                    n6 += n10;
                    n3 += rs.l.c.h;
                }
                while (--n4 >= 0) {
                    e_0.a(rs.l.c.g, n3, n8, n5 >> 16, n6 >> 16);
                    n5 += n11;
                    n6 += n10;
                    n3 += rs.l.c.h;
                }
                return;
            }
            n4 -= n2;
            n2 -= n3;
            n3 = x[n3];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n3, n8, n6 >> 16, n7 >> 16);
                n7 += n9;
                n6 += n10;
                n3 += rs.l.c.h;
            }
            while (--n4 >= 0) {
                e_0.a(rs.l.c.g, n3, n8, n6 >> 16, n5 >> 16);
                n5 += n11;
                n6 += n10;
                n3 += rs.l.c.h;
            }
            return;
        }
        if (n4 >= rs.l.c.k) {
            return;
        }
        if (n2 > rs.l.c.k) {
            n2 = rs.l.c.k;
        }
        if (n3 > rs.l.c.k) {
            n3 = rs.l.c.k;
        }
        if (n2 < n3) {
            n6 = n7 <<= 16;
            if (n4 < 0) {
                n6 -= n10 * n4;
                n7 -= n11 * n4;
                n4 = 0;
            }
            n5 <<= 16;
            if (n2 < 0) {
                n5 -= n9 * n2;
                n2 = 0;
            }
            if (n10 < n11) {
                n3 -= n2;
                n2 -= n4;
                n4 = x[n4];
                while (--n2 >= 0) {
                    e_0.a(rs.l.c.g, n4, n8, n6 >> 16, n7 >> 16);
                    n6 += n10;
                    n7 += n11;
                    n4 += rs.l.c.h;
                }
                while (--n3 >= 0) {
                    e_0.a(rs.l.c.g, n4, n8, n6 >> 16, n5 >> 16);
                    n6 += n10;
                    n5 += n9;
                    n4 += rs.l.c.h;
                }
                return;
            }
            n3 -= n2;
            n2 -= n4;
            n4 = x[n4];
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n7 >> 16, n6 >> 16);
                n6 += n10;
                n7 += n11;
                n4 += rs.l.c.h;
            }
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n5 >> 16, n6 >> 16);
                n6 += n10;
                n5 += n9;
                n4 += rs.l.c.h;
            }
            return;
        }
        n5 = n7 <<= 16;
        if (n4 < 0) {
            n5 -= n10 * n4;
            n7 -= n11 * n4;
            n4 = 0;
        }
        n6 <<= 16;
        if (n3 < 0) {
            n6 -= n9 * n3;
            n3 = 0;
        }
        if (n10 < n11) {
            n2 -= n3;
            n3 -= n4;
            n4 = x[n4];
            while (--n3 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n5 >> 16, n7 >> 16);
                n5 += n10;
                n7 += n11;
                n4 += rs.l.c.h;
            }
            while (--n2 >= 0) {
                e_0.a(rs.l.c.g, n4, n8, n6 >> 16, n7 >> 16);
                n6 += n9;
                n7 += n11;
                n4 += rs.l.c.h;
            }
            return;
        }
        n2 -= n3;
        n3 -= n4;
        n4 = x[n4];
        while (--n3 >= 0) {
            e_0.a(rs.l.c.g, n4, n8, n7 >> 16, n5 >> 16);
            n5 += n10;
            n7 += n11;
            n4 += rs.l.c.h;
        }
        while (--n2 >= 0) {
            e_0.a(rs.l.c.g, n4, n8, n7 >> 16, n6 >> 16);
            n6 += n9;
            n7 += n11;
            n4 += rs.l.c.h;
        }
    }

    public static final int b(int n2, int n3, int n4, int n5) {
        return n2 * n4 - n5 * n3 >> 16;
    }

    public static final int c(int n2, int n3, int n4, int n5) {
        return n5 * n2 + n4 * n3 >> 16;
    }

    public static final int d(int n2, int n3, int n4, int n5) {
        return n2 * n4 + n5 * n3 >> 16;
    }

    public static final int e(int n2, int n3, int n4, int n5) {
        return n4 * n3 - n5 * n2 >> 16;
    }

    static {
        int n2;
        f = 512;
        g = false;
        h = false;
        i = !rs.f.a.ah;
        C = new i();
        n = true;
        p = true;
        q = true;
        y = new a[340];
        G = new boolean[340];
        H = new int[340];
        K = new int[340][];
        z = new int[340];
        B = new int[65536];
        L = new int[340][];
        E = new int[512];
        u = new int[2048];
        v = new int[2048];
        w = new int[2048];
        for (n2 = 1; n2 < 512; ++n2) {
            e_0.E[n2] = 32768 / n2;
        }
        for (n2 = 1; n2 < 2048; ++n2) {
            e_0.u[n2] = 65536 / n2;
        }
        for (n2 = 0; n2 < 2048; ++n2) {
            e_0.v[n2] = (int)(65536.0 * Math.sin((double)n2 * 0.0030679615));
            e_0.w[n2] = (int)(65536.0 * Math.cos((double)n2 * 0.0030679615));
        }
    }
}

