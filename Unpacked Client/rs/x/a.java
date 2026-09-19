/*
 * Decompiled with CFR 0.152.
 */
package rs.x;

import rs.x.b;

final class a {
    private static final b a = new b();

    a() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(byte[] byArray, int n2, byte[] byArray2, int n3, int n4) {
        b b2 = a;
        synchronized (b2) {
            rs.x.a.a.a = byArray2;
            rs.x.a.a.b = n4;
            rs.x.a.a.f = byArray;
            rs.x.a.a.g = 0;
            rs.x.a.a.c = n3;
            rs.x.a.a.h = n2;
            rs.x.a.a.o = 0;
            rs.x.a.a.n = 0;
            rs.x.a.a.d = 0;
            rs.x.a.a.e = 0;
            rs.x.a.a.i = 0;
            rs.x.a.a.j = 0;
            rs.x.a.a.q = 0;
            rs.x.a.b(a);
            return n2 -= rs.x.a.a.h;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void a(b var0) {
        var1_1 = var0.k;
        var2_2 = var0.l;
        var3_3 = var0.v;
        var4_4 = var0.t;
        var5_5 = b.x;
        var6_6 = var0.s;
        var7_7 = var0.f;
        var8_8 = var0.g;
        var10_10 = var9_9 = var0.h;
        var11_11 = var0.L + 1;
        block0: while (true) {
            if (var2_2 <= 0) ** GOTO lbl26
            while (var9_9 != 0) {
                if (var2_2 != 1) {
                    var7_7[var8_8] = var1_1;
                    --var2_2;
                    ++var8_8;
                    --var9_9;
                    continue;
                }
                if (var9_9 == 0) {
                    var2_2 = 1;
                    break block0;
                }
                var7_7[var8_8] = var1_1;
                ++var8_8;
                --var9_9;
lbl26:
                // 2 sources

                var12_12 = 1;
                while (var12_12 != 0) {
                    var12_12 = 0;
                    if (var3_3 == var11_11) {
                        var2_2 = 0;
                        break block0;
                    }
                    var1_1 = (byte)var4_4;
                    var6_6 = var5_5[var6_6];
                    var13_13 = (byte)(var6_6 & 255);
                    var6_6 >>= 8;
                    ++var3_3;
                    if (var13_13 != var4_4) {
                        var4_4 = var13_13;
                        if (var9_9 == 0) {
                            var2_2 = 1;
                            break block0;
                        }
                        var7_7[var8_8] = var1_1;
                        ++var8_8;
                        --var9_9;
                        var12_12 = 1;
                        continue;
                    }
                    if (var3_3 != var11_11) continue;
                    if (var9_9 == 0) {
                        var2_2 = 1;
                        break block0;
                    }
                    var7_7[var8_8] = var1_1;
                    ++var8_8;
                    --var9_9;
                    var12_12 = 1;
                }
                var2_2 = 2;
                var6_6 = var5_5[var6_6];
                var13_13 = (byte)(var6_6 & 255);
                var6_6 >>= 8;
                if (++var3_3 == var11_11) continue block0;
                if (var13_13 != var4_4) {
                    var4_4 = var13_13;
                    continue block0;
                }
                var2_2 = 3;
                var6_6 = var5_5[var6_6];
                var14_14 = (byte)(var6_6 & 255);
                var6_6 >>= 8;
                if (++var3_3 == var11_11) continue block0;
                if (var14_14 != var4_4) {
                    var4_4 = var14_14;
                    continue block0;
                }
                var6_6 = var5_5[var6_6];
                var15_15 = (byte)(var6_6 & 255);
                var6_6 >>= 8;
                ++var3_3;
                var2_2 = (var15_15 & 255) + 4;
                var6_6 = var5_5[var6_6];
                var4_4 = (byte)(var6_6 & 255);
                var6_6 >>= 8;
                ++var3_3;
                continue block0;
            }
            break;
        }
        var12_12 = var0.i;
        var0.i += var10_10 - var9_9;
        if (var0.i < var12_12) {
            ++var0.j;
        }
        var0.k = var1_1;
        var0.l = var2_2;
        var0.v = var3_3;
        var0.t = var4_4;
        b.x = var5_5;
        var0.s = var6_6;
        var0.f = var7_7;
        var0.g = var8_8;
        var0.h = var9_9;
    }

    private static void b(b b2) {
        int n2 = 0;
        int[] nArray = null;
        int[] nArray2 = null;
        int[] nArray3 = null;
        b2.p = 1;
        if (b.x == null) {
            b.x = new int[b2.p * 100000];
        }
        boolean bl = true;
        while (bl) {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            byte by = rs.x.a.c(b2);
            if (by == 23) {
                return;
            }
            by = rs.x.a.c(b2);
            by = rs.x.a.c(b2);
            by = rs.x.a.c(b2);
            by = rs.x.a.c(b2);
            by = rs.x.a.c(b2);
            ++b2.q;
            by = rs.x.a.c(b2);
            by = rs.x.a.c(b2);
            by = rs.x.a.c(b2);
            by = rs.x.a.c(b2);
            by = rs.x.a.d(b2);
            boolean bl2 = b2.m = by != 0;
            if (b2.m) {
                System.out.println("PANIC! RANDOMISED BLOCK!");
            }
            b2.r = 0;
            by = rs.x.a.c(b2);
            b2.r = b2.r << 8 | by & 0xFF;
            by = rs.x.a.c(b2);
            b2.r = b2.r << 8 | by & 0xFF;
            by = rs.x.a.c(b2);
            b2.r = b2.r << 8 | by & 0xFF;
            for (n12 = 0; n12 < 16; ++n12) {
                n11 = rs.x.a.d(b2);
                b2.A[n12] = n11 == 1;
            }
            for (n12 = 0; n12 < 256; ++n12) {
                b2.z[n12] = false;
            }
            for (n12 = 0; n12 < 16; ++n12) {
                if (!b2.A[n12]) continue;
                for (n11 = 0; n11 < 16; ++n11) {
                    n10 = rs.x.a.d(b2);
                    if (n10 != 1) continue;
                    b2.z[n12 * 16 + n11] = true;
                }
            }
            rs.x.a.e(b2);
            n12 = b2.y + 2;
            n11 = rs.x.a.a(3, b2);
            n10 = rs.x.a.a(15, b2);
            for (int i2 = 0; i2 < n10; ++i2) {
                n9 = 0;
                while ((n8 = rs.x.a.d(b2)) != 0) {
                    ++n9;
                }
                b2.F[i2] = (byte)n9;
            }
            byte[] byArray = new byte[6];
            for (n9 = 0; n9 < n11; n9 = (int)((byte)(n9 + 1))) {
                byArray[n9] = n9;
            }
            for (n9 = 0; n9 < n10; ++n9) {
                n7 = byArray[n8];
                for (n8 = b2.F[n9]; n8 > 0; n8 = (int)((byte)(n8 - 1))) {
                    byArray[n8] = byArray[n8 - 1];
                }
                byArray[0] = n7;
                b2.E[n9] = n7;
            }
            for (n9 = 0; n9 < n11; ++n9) {
                n8 = rs.x.a.a(5, b2);
                for (n7 = 0; n7 < n12; ++n7) {
                    while ((n6 = rs.x.a.d(b2)) != 0) {
                        n6 = rs.x.a.d(b2);
                        if (n6 == 0) {
                            ++n8;
                            continue;
                        }
                        --n8;
                    }
                    b2.G[n9][n7] = (byte)n8;
                }
            }
            for (n9 = 0; n9 < n11; ++n9) {
                n8 = 32;
                n7 = 0;
                for (n6 = 0; n6 < n12; ++n6) {
                    if (b2.G[n9][n6] > n7) {
                        n7 = b2.G[n9][n6];
                    }
                    if (b2.G[n9][n6] >= n8) continue;
                    n8 = b2.G[n9][n6];
                }
                rs.x.a.a(b2.H[n9], b2.I[n9], b2.J[n9], b2.G[n9], n8, n7, n12);
                b2.K[n9] = n8;
            }
            n9 = b2.y + 1;
            n8 = -1;
            n7 = 0;
            for (n6 = 0; n6 <= 255; ++n6) {
                b2.u[n6] = 0;
            }
            n6 = 4095;
            for (n5 = 15; n5 >= 0; --n5) {
                for (n4 = 15; n4 >= 0; --n4) {
                    b2.C[n6] = (byte)(n5 * 16 + n4);
                    --n6;
                }
                b2.D[n5] = n6 + 1;
            }
            n5 = 0;
            if (n7 == 0) {
                n7 = 50;
                n4 = b2.E[++n8];
                n2 = b2.K[n4];
                nArray = b2.H[n4];
                nArray3 = b2.J[n4];
                nArray2 = b2.I[n4];
            }
            --n7;
            n4 = n2;
            int n13 = rs.x.a.a(n4, b2);
            while (n13 > nArray[n4]) {
                ++n4;
                byte by2 = rs.x.a.d(b2);
                n13 = n13 << 1 | by2;
            }
            int n14 = nArray3[n13 - nArray2[n4]];
            while (n14 != n9) {
                int n15;
                int n16;
                int n17;
                int n18;
                if (n14 == 0 || n14 == 1) {
                    n3 = -1;
                    n18 = 1;
                    do {
                        if (n14 == 0) {
                            n3 += n18;
                        } else if (n14 == 1) {
                            n3 += 2 * n18;
                        }
                        n18 *= 2;
                        if (n7 == 0) {
                            n7 = 50;
                            n16 = b2.E[++n8];
                            n2 = b2.K[n16];
                            nArray = b2.H[n16];
                            nArray3 = b2.J[n16];
                            nArray2 = b2.I[n16];
                        }
                        --n7;
                        n16 = n2;
                        n17 = rs.x.a.a(n16, b2);
                        while (n17 > nArray[n16]) {
                            ++n16;
                            n15 = rs.x.a.d(b2);
                            n17 = n17 << 1 | n15;
                        }
                    } while ((n14 = nArray3[n17 - nArray2[n16]]) == 0 || n14 == 1);
                    n16 = b2.B[b2.C[b2.D[0]] & 0xFF];
                    int n19 = n16 & 0xFF;
                    b2.u[n19] = b2.u[n19] + ++n3;
                    while (n3 > 0) {
                        b.x[n5] = n16 & 0xFF;
                        ++n5;
                        --n3;
                    }
                    continue;
                }
                n3 = n14 - true;
                if (n3 < 16) {
                    n16 = b2.D[0];
                    n18 = b2.C[n16 + n3];
                    while (n3 > 3) {
                        n17 = n16 + n3;
                        b2.C[n17] = b2.C[n17 - 1];
                        b2.C[n17 - 1] = b2.C[n17 - 2];
                        b2.C[n17 - 2] = b2.C[n17 - 3];
                        b2.C[n17 - 3] = b2.C[n17 - 4];
                        n3 -= 4;
                    }
                    while (n3 > 0) {
                        b2.C[n16 + n3] = b2.C[n16 + n3 - 1];
                        --n3;
                    }
                    b2.C[n16] = n18;
                } else {
                    n16 = n3 / 16;
                    n17 = n3 % 16;
                    n18 = b2.C[n15];
                    for (n15 = b2.D[n16] + n17; n15 > b2.D[n16]; --n15) {
                        b2.C[n15] = b2.C[n15 - 1];
                    }
                    int n20 = n16;
                    b2.D[n20] = b2.D[n20] + 1;
                    while (n16 > 0) {
                        int n21 = n16;
                        b2.D[n21] = b2.D[n21] - 1;
                        b2.C[b2.D[n16]] = b2.C[b2.D[n16 - 1] + 16 - 1];
                        --n16;
                    }
                    b2.D[0] = b2.D[0] - 1;
                    b2.C[b2.D[0]] = n18;
                    if (b2.D[0] == 0) {
                        int n22 = 4095;
                        for (int i3 = 15; i3 >= 0; --i3) {
                            for (int i4 = 15; i4 >= 0; --i4) {
                                b2.C[n22] = b2.C[b2.D[i3] + i4];
                                --n22;
                            }
                            b2.D[i3] = n22 + 1;
                        }
                    }
                }
                int n23 = b2.B[n18 & 0xFF] & 0xFF;
                b2.u[n23] = b2.u[n23] + 1;
                b.x[n5] = b2.B[n18 & 0xFF] & 0xFF;
                ++n5;
                if (n7 == 0) {
                    n7 = 50;
                    n16 = b2.E[++n8];
                    n2 = b2.K[n16];
                    nArray = b2.H[n16];
                    nArray3 = b2.J[n16];
                    nArray2 = b2.I[n16];
                }
                --n7;
                n16 = n2;
                n17 = rs.x.a.a(n16, b2);
                while (n17 > nArray[n16]) {
                    ++n16;
                    n15 = rs.x.a.d(b2);
                    n17 = n17 << 1 | n15;
                }
                n14 = nArray3[n17 - nArray2[n16]];
            }
            b2.l = 0;
            b2.k = 0;
            b2.w[0] = 0;
            for (n14 = 1; n14 <= 256; ++n14) {
                b2.w[n14] = b2.u[n14 - 1];
            }
            for (n14 = 1; n14 <= 256; ++n14) {
                int n24 = n14;
                b2.w[n24] = b2.w[n24] + b2.w[n14 - 1];
            }
            for (n14 = 0; n14 < n5; ++n14) {
                n3 = (byte)(b.x[n14] & 0xFF);
                int n25 = b2.w[n3 & 0xFF];
                b.x[n25] = b.x[n25] | n14 << 8;
                int n26 = n3 & 0xFF;
                b2.w[n26] = b2.w[n26] + 1;
            }
            b2.s = b.x[b2.r] >> 8;
            b2.v = 0;
            b2.s = b.x[b2.s];
            b2.t = (byte)(b2.s & 0xFF);
            b2.s >>= 8;
            ++b2.v;
            b2.L = n5;
            rs.x.a.a(b2);
            bl = b2.v == b2.L + 1 && b2.l == 0;
        }
    }

    private static byte c(b b2) {
        return (byte)rs.x.a.a(8, b2);
    }

    private static byte d(b b2) {
        return (byte)rs.x.a.a(1, b2);
    }

    private static int a(int n2, b b2) {
        int n3;
        while (true) {
            if (b2.o >= n2) {
                n3 = b2.n >> b2.o - n2 & (1 << n2) - 1;
                b2.o -= n2;
                break;
            }
            b2.n = b2.n << 8 | b2.a[b2.b] & 0xFF;
            b2.o += 8;
            ++b2.b;
            --b2.c;
            ++b2.d;
            if (b2.d != 0) continue;
            ++b2.e;
        }
        int n4 = n3;
        return n4;
    }

    private static void e(b b2) {
        b2.y = 0;
        for (int i2 = 0; i2 < 256; ++i2) {
            if (!b2.z[i2]) continue;
            b2.B[b2.y] = (byte)i2;
            ++b2.y;
        }
    }

    private static void a(int[] nArray, int[] nArray2, int[] nArray3, byte[] byArray, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = 0;
        for (n6 = n2; n6 <= n3; ++n6) {
            for (n5 = 0; n5 < n4; ++n5) {
                if (byArray[n5] != n6) continue;
                nArray3[n7] = n5;
                ++n7;
            }
        }
        for (n6 = 0; n6 < 23; ++n6) {
            nArray2[n6] = 0;
        }
        for (n6 = 0; n6 < n4; ++n6) {
            int n8 = byArray[n6] + 1;
            nArray2[n8] = nArray2[n8] + 1;
        }
        for (n6 = 1; n6 < 23; ++n6) {
            int n9 = n6;
            nArray2[n9] = nArray2[n9] + nArray2[n6 - 1];
        }
        for (n6 = 0; n6 < 23; ++n6) {
            nArray[n6] = 0;
        }
        n6 = 0;
        for (n5 = n2; n5 <= n3; ++n5) {
            nArray[n5] = (n6 += nArray2[n5 + 1] - nArray2[n5]) - 1;
            n6 <<= 1;
        }
        for (n5 = n2 + 1; n5 <= n3; ++n5) {
            nArray2[n5] = (nArray[n5 - 1] + 1 << 1) - nArray2[n5];
        }
    }
}

