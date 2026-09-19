/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package rs.runelite.a;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.ArrayList;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import rs.Client;
import rs.gui.Launcher;
import rs.runelite.a.a;
import rs.runelite.a.e;
import rs.runelite.a.f;
import rs.runelite.a.i;
import rs.runelite.a.j;
import rs.runelite.a.l;
import rs.runelite.a.m;

public class h {
    public static final int a = 7;
    public static final int b = 128;
    public static final int c = 104;
    public static final double d = 0.0030679615757712823;
    public static final int[] e = new int[2048];
    public static final int[] f = new int[2048];

    public static i a(@Nonnull f f2, int n2) {
        return h.a(f2, n2, 0);
    }

    public static i a(@Nonnull f f2, int n2, int n3) {
        int n4 = h.d(f2, n2);
        return h.a(f2.b(), f2.c(), n4 - n3);
    }

    public static i a(int n2, int n3, int n4) {
        if (n2 >= 128 && n3 >= 128 && n2 <= 13056 && n3 <= 13056) {
            Client client = Launcher.n().o();
            n2 -= Client.cJ;
            n3 -= Client.cL;
            n4 -= Client.cK;
            int n5 = client.cR;
            int n6 = client.cS;
            int n7 = e[n5];
            int n8 = f[n5];
            int n9 = e[n6];
            int n10 = f[n6];
            int n11 = n2 * n10 + n3 * n9 >> 16;
            int n12 = n3 * n10 - n2 * n9 >> 16;
            int n13 = n4 * n8 - n12 * n7 >> 16;
            int n14 = n12 * n8 + n4 * n7 >> 16;
            if (n14 >= 50) {
                int n15 = client.aL();
                int n16 = client.at() / 2 + n11 * n15 / n14;
                int n17 = client.as() / 2 + n13 * n15 / n14;
                return new i(n16 + client.ag(), n17 + client.ah());
            }
        }
        return null;
    }

    public static Polygon a(@Nonnull f f2) {
        return h.c(f2, 1);
    }

    public static Polygon b(@Nonnull f f2, int n2) {
        return h.a(f2, 1, 1, Client.dw, n2);
    }

    public static Polygon c(@Nonnull f f2, int n2) {
        return h.a(f2, n2, n2, Client.dw, 0);
    }

    public static Polygon a(@Nonnull f f2, int n2, int n3, int n4, int n5) {
        if (!f2.a()) {
            return null;
        }
        byte[][][] byArray = Launcher.n().o().gc;
        int n6 = f2.d();
        int n7 = f2.e();
        int n8 = n4;
        if (n4 < 3 && (byArray[1][n6][n7] & 2) == 2) {
            n8 = n4 + 1;
        }
        int n9 = f2.b() - n2 * 128 / 2;
        int n10 = f2.c() - n3 * 128 / 2;
        int n11 = f2.b() + n2 * 128 / 2;
        int n12 = f2.c() + n3 * 128 / 2;
        int n13 = n9;
        int n14 = n12;
        int n15 = n11;
        int n16 = n10;
        int n17 = h.b(n9, n10, n8) - n5;
        int n18 = h.b(n15, n16, n8) - n5;
        int n19 = h.b(n11, n12, n8) - n5;
        int n20 = h.b(n13, n14, n8) - n5;
        i i2 = h.a(n9, n10, n17);
        i i3 = h.a(n15, n16, n18);
        i i4 = h.a(n11, n12, n19);
        i i5 = h.a(n13, n14, n20);
        if (i2 == null || i3 == null || i4 == null || i5 == null) {
            return null;
        }
        Polygon polygon = new Polygon();
        polygon.addPoint(i2.a(), i2.b());
        polygon.addPoint(i3.a(), i3.b());
        polygon.addPoint(i4.a(), i4.b());
        polygon.addPoint(i5.a(), i5.b());
        return polygon;
    }

    public static int d(@Nonnull f f2, int n2) {
        int n3 = f2.d();
        int n4 = f2.e();
        if (n3 >= 0 && n4 >= 0 && n3 < 104 && n4 < 104) {
            byte[][][] byArray = Launcher.n().o().gc;
            int[][][] nArray = Launcher.n().o().fC;
            int n5 = n2;
            if (n2 < 3 && (byArray[1][n3][n4] & 2) == 2) {
                n5 = n2 + 1;
            }
            int n6 = f2.b() & 0x7F;
            int n7 = f2.c() & 0x7F;
            int n8 = n6 * nArray[n5][n3 + 1][n4] + (128 - n6) * nArray[n5][n3][n4] >> 7;
            int n9 = nArray[n5][n3][n4 + 1] * (128 - n6) + n6 * nArray[n5][n3 + 1][n4 + 1] >> 7;
            return (128 - n7) * n8 + n7 * n9 >> 7;
        }
        return 0;
    }

    private static int b(int n2, int n3, int n4) {
        int n5 = n2 >> 7;
        int n6 = n3 >> 7;
        if (n5 >= 0 && n6 >= 0 && n5 < 104 && n6 < 104) {
            int[][][] nArray = Launcher.n().o().fC;
            int n7 = n2 & 0x7F;
            int n8 = n3 & 0x7F;
            int n9 = n7 * nArray[n4][n5 + 1][n6] + (128 - n7) * nArray[n4][n5][n6] >> 7;
            int n10 = nArray[n4][n5][n6 + 1] * (128 - n7) + n7 * nArray[n4][n5 + 1][n6 + 1] >> 7;
            return (128 - n8) * n9 + n8 * n10 >> 7;
        }
        return 0;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5) {
        if (rs.k.e.a()) {
            h.b(n2, n3, n4, n5, n6, nArray, nArray2, nArray3, nArray4, nArray5);
        } else {
            h.c(n2, n3, n4, n5, n6, nArray, nArray2, nArray3, nArray4, nArray5);
        }
    }

    private static void b(int n2, int n3, int n4, int n5, int n6, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5) {
        Client client = Launcher.n().o();
        int n7 = client.cR;
        int n8 = client.cS;
        float f2 = (float)e[n7] / 65536.0f;
        float f3 = (float)f[n7] / 65536.0f;
        float f4 = (float)e[n8] / 65536.0f;
        float f5 = (float)f[n8] / 65536.0f;
        float f6 = (float)e[n6] / 65536.0f;
        float f7 = (float)f[n6] / 65536.0f;
        float f8 = n3 - Client.cJ;
        float f9 = n4 - Client.cL;
        float f10 = n5 - Client.cK;
        float f11 = (float)client.at() / 2.0f;
        float f12 = (float)client.as() / 2.0f;
        float f13 = 4.0f;
        float f14 = 4.0f;
        float f15 = client.aL();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n9;
            int n10;
            float f16;
            float f17 = nArray[i2];
            float f18 = nArray2[i2];
            float f19 = nArray3[i2];
            if (n6 != 0) {
                f16 = f17;
                f17 = f16 * f7 + f18 * f6;
                f18 = f18 * f7 - f16 * f6;
            }
            f16 = (f17 += f8) * f5 + (f18 += f9) * f4;
            float f20 = f18 * f5 - f17 * f4;
            float f21 = (f19 += f10) * f3 - f20 * f2;
            float f22 = f20 * f3 + f19 * f2;
            if (f22 < 50.0f) {
                n10 = Integer.MIN_VALUE;
                n9 = Integer.MIN_VALUE;
            } else {
                n10 = Math.round(f11 + f16 * f15 / f22 + 4.0f);
                n9 = Math.round(f12 + f21 * f15 / f22 + 4.0f);
            }
            nArray4[i2] = n10;
            nArray5[i2] = n9;
        }
    }

    private static void c(int n2, int n3, int n4, int n5, int n6, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5) {
        Client client = Launcher.n().o();
        int n7 = client.cR;
        int n8 = client.cS;
        int n9 = e[n7];
        int n10 = f[n7];
        int n11 = e[n8];
        int n12 = f[n8];
        int n13 = e[n6];
        int n14 = f[n6];
        int n15 = n3 - Client.cJ;
        int n16 = n4 - Client.cL;
        int n17 = n5 - Client.cK;
        int n18 = client.at() / 2;
        int n19 = client.as() / 2;
        int n20 = client.ag();
        int n21 = client.ah();
        int n22 = client.aL();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n23;
            int n24;
            int n25;
            int n26 = nArray[i2];
            int n27 = nArray2[i2];
            int n28 = nArray3[i2];
            if (n6 != 0) {
                n25 = n26;
                n26 = n25 * n14 + n27 * n13 >> 16;
                n27 = n27 * n14 - n25 * n13 >> 16;
            }
            n25 = (n26 += n15) * n12 + (n27 += n16) * n11 >> 16;
            int n29 = n27 * n12 - n26 * n11 >> 16;
            int n30 = (n28 += n17) * n10 - n29 * n9 >> 16;
            int n31 = n29 * n10 + n28 * n9 >> 16;
            if (n31 < 50) {
                n24 = Integer.MIN_VALUE;
                n23 = Integer.MIN_VALUE;
            } else {
                n24 = n18 + n25 * n22 / n31 + n20;
                n23 = n19 + n30 * n22 / n31 + n21;
            }
            nArray4[i2] = n24;
            nArray5[i2] = n23;
        }
    }

    public static i a(@Nonnull Graphics2D graphics2D, @Nonnull f f2, @Nullable String string, int n2) {
        if (string == null) {
            return null;
        }
        int n3 = Client.dw;
        i i2 = h.a(f2, n3, n2);
        if (i2 == null) {
            return null;
        }
        return new i(i2.a(), i2.b());
    }

    @Nullable
    public static Shape a(rs.a.h h2, int n2, int n3, int n4, int n5) {
        Client client = Launcher.n().o();
        if (h2 == null) {
            return null;
        }
        m m2 = h.b(h2, n2, n3, n4, n5);
        if (m2 == null) {
            return null;
        }
        if (h2.aN) {
            return m2;
        }
        l<m> l2 = h.c(h2, n2, n3, n4, n5);
        if (l2 == null) {
            return null;
        }
        for (m m3 : l2.a()) {
            m3.b(m2);
        }
        return l2;
    }

    private static m b(rs.a.h h2, int n2, int n3, int n4, int n5) {
        Client client = Launcher.n().o();
        a a2 = h2.p(n2);
        int n6 = a2.a();
        int n7 = a2.c();
        int n8 = a2.b();
        int n9 = a2.d();
        int n10 = a2.f();
        int n11 = a2.e();
        int n12 = n6 + n9;
        int n13 = n7 + n10;
        int n14 = n8 + n11;
        int[] nArray = new int[]{n6 -= n9, n12, n6, n12, n6, n12, n6, n12};
        int[] nArray2 = new int[]{n7 -= n10, n7, n13, n13, n7, n7, n13, n13};
        int[] nArray3 = new int[]{n8 -= n11, n8, n8, n8, n14, n14, n14, n14};
        int[] nArray4 = new int[8];
        int[] nArray5 = new int[8];
        h.c(8, n3, n4, n5, 0, nArray, nArray2, nArray3, nArray4, nArray5);
        return rs.runelite.a.e.a(nArray4, nArray5);
    }

    private static l<m> c(rs.a.h h2, int n2, int n3, int n4, int n5) {
        Client client = Launcher.n().o();
        int[] nArray = new int[h2.z()];
        int[] nArray2 = new int[h2.z()];
        int[] nArray3 = h2.an;
        h.c(h2.z(), n3, n4, n5, n2, h2.A(), h2.C(), h2.B(), nArray, nArray2);
        int n6 = 5;
        int[][] nArrayArray = new int[][]{h2.D(), h2.E(), h2.F()};
        int n7 = client.ag();
        int n8 = client.ag();
        int n9 = n7 + client.at();
        int n10 = n8 + client.as();
        ArrayList<j.c> arrayList = new ArrayList<j.c>(h2.G());
        block0: for (int i2 = 0; i2 < h2.G(); ++i2) {
            if (nArray3[i2] == -2) continue;
            int n11 = Integer.MAX_VALUE;
            int n12 = Integer.MAX_VALUE;
            int n13 = Integer.MIN_VALUE;
            int n14 = Integer.MIN_VALUE;
            for (int[] nArray4 : nArrayArray) {
                int n15 = nArray4[i2];
                int n16 = nArray[n15];
                int n17 = nArray2[n15];
                if (n16 == Integer.MIN_VALUE || n17 == Integer.MIN_VALUE) continue block0;
                if (n16 < n11) {
                    n11 = n16;
                }
                if (n16 > n13) {
                    n13 = n16;
                }
                if (n17 < n12) {
                    n12 = n17;
                }
                if (n17 <= n14) continue;
                n14 = n17;
            }
            if (n7 > (n13 += 5) || n9 < (n11 -= 5) || n8 > (n14 += 5) || n10 < (n12 -= 5)) continue;
            j.c c2 = new j.c(n11, n12, n13, n14);
            arrayList.add(c2);
        }
        return j.a(arrayList);
    }

    static {
        for (int i2 = 0; i2 < 2048; ++i2) {
            h.e[i2] = (int)(65536.0 * Math.sin((double)i2 * 0.0030679615757712823));
            h.f[i2] = (int)(65536.0 * Math.cos((double)i2 * 0.0030679615757712823));
        }
    }
}

