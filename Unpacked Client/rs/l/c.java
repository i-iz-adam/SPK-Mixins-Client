/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.util.Hashtable;
import rs.f.a;
import rs.k.e;
import rs.l.b_0;
import rs.l.e_0;

public class c
extends b_0 {
    private static final ColorModel q = new DirectColorModel(32, 0xFF0000, 65280, 255);
    public static float[] f;
    public static int[] g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;

    public static void a(int n2, int n3, int[] nArray, float[] fArray) {
        g = nArray;
        h = n2;
        i = n3;
        rs.l.c.c(n3, 0, n2, 0);
        if (rs.f.a.av && fArray != null) {
            e_0.k = fArray;
            f = fArray;
        }
    }

    public static void a(int n2, int n3, int[] nArray) {
        g = nArray;
        h = n2;
        i = n3;
        rs.l.c.c(n3, 0, n2, 0);
        if (rs.f.a.av) {
            e_0.k = f;
        }
    }

    public static void a(int[] nArray, int n2, int n3, int n4, int n5) {
        if (!rs.k.e.a()) {
            nArray[n2] = n3;
            return;
        }
        if (n5 <= 0 || n2 >= nArray.length || n2 < 0) {
            return;
        }
        int n6 = nArray[n2];
        if ((n6 & 0xFF000000) == 0 || n5 == 255) {
            nArray[n2] = n4 & 0xFFFFFF | n5 << 24;
            return;
        }
        if ((n6 & 0xFF000000) == -16777216) {
            nArray[n2] = n3 | 0xFF000000;
            return;
        }
        int n7 = (n6 >>> 24) * (255 - n5) >>> 8;
        int n8 = n5 + n7;
        int n9 = (n5 << 8) / n8;
        int n10 = (n7 << 8) / n8;
        int n11 = ((n4 & 0xFF00FF) * n9 + (n6 & 0xFF00FF) * n10 & 0xFF00FF00 | (n4 & 0xFF00) * n9 + (n6 & 0xFF00) * n10 & 0xFF0000) >>> 8;
        nArray[n2] = n11 | n8 << 24;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        rs.l.c.b(n5, n3, n2, n6, n4, n7);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = 256 - n8;
        if (n4 < l) {
            n6 -= l - n4;
            n4 = l;
        }
        if (n3 < j) {
            n2 -= j - n3;
            n3 = j;
        }
        if (n4 + n6 > m) {
            n6 = m - n4;
        }
        if (n3 + n2 > k) {
            n2 = k - n3;
        }
        int n10 = h - n6;
        int n11 = n4 + n3 * h;
        if (n7 != 0) {
            p = -374;
        }
        for (int i2 = -n2; i2 < 0; ++i2) {
            for (int i3 = -n6; i3 < 0; ++i3) {
                int n12 = g[n11];
                rs.l.c.a(g, n11++, ((n5 & 0xFF00FF) * n8 + (n12 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n5 & 0xFF00) * n8 + (n12 & 0xFF00) * n9 & 0xFF0000) >> 8, ((n5 & 0xFF00FF) * n8 + (n12 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n5 & 0xFF00) * n8 + (n12 & 0xFF00) * n9 & 0xFF0000) >> 8, n8);
            }
            n11 += n10;
        }
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = 256 - n7;
        if (n4 < l) {
            n6 -= l - n4;
            n4 = l;
        }
        if (n3 < j) {
            n2 -= j - n3;
            n3 = j;
        }
        if (n4 + n6 > m) {
            n6 = m - n4;
        }
        if (n3 + n2 > k) {
            n2 = k - n3;
        }
        int n9 = h - n6;
        int n10 = n4 + n3 * h;
        for (int i2 = -n2; i2 < 0; ++i2) {
            for (int i3 = -n6; i3 < 0; ++i3) {
                int n11 = g[n10];
                rs.l.c.a(g, n10++, ((n5 & 0xFF00FF) * n7 + (n11 & 0xFF00FF) * n8 & 0xFF00FF00) + ((n5 & 0xFF00) * n7 + (n11 & 0xFF00) * n8 & 0xFF0000) >> 8, ((n5 & 0xFF00FF) * n7 + (n11 & 0xFF00FF) * n8 & 0xFF00FF00) + ((n5 & 0xFF00) * n7 + (n11 & 0xFF00) * n8 & 0xFF0000) >> 8, n7);
            }
            n10 += n9;
        }
    }

    public static void a(int n2, int n3, int n4, int n5) {
        if (n3 >= j && n3 < k) {
            if (n2 < l) {
                n4 -= l - n2;
                n2 = l;
            }
            if (n2 + n4 > m) {
                n4 = m - n2;
            }
            int n6 = n2 + n3 * h;
            for (int i2 = 0; i2 < n4; ++i2) {
                rs.l.c.a(g, n6 + i2, n5, n5, 255);
            }
        }
    }

    public static void b(int n2, int n3, int n4, int n5) {
        if (n3 <= j || n3 >= k) {
            return;
        }
        if (n2 < l) {
            n4 -= l - n2;
            n2 = l;
        }
        if (n2 + n4 > m) {
            n4 = m - n2;
        }
        int n6 = n2 + n3 * h;
        for (int i2 = 0; i2 < n4; ++i2) {
            rs.l.c.a(g, n6 + i2, n5, n5, 255);
        }
    }

    public static void c() {
        l = 0;
        j = 0;
        m = h;
        k = i;
        n = m - 1;
        o = m / 2;
    }

    public static void c(int n2, int n3, int n4, int n5) {
        if (n3 < 0) {
            n3 = 0;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        if (n4 > h) {
            n4 = h;
        }
        if (n2 > i) {
            n2 = i;
        }
        l = n3;
        j = n5;
        m = n4;
        k = n2;
        n = m - 1;
        o = m / 2;
        p = k / 2;
    }

    public static void d() {
        int n2 = h * i;
        for (int i2 = 0; i2 < n2 && i2 < g.length; ++i2) {
            rs.l.c.g[i2] = 0;
            if (!rs.f.a.av || i2 >= f.length) continue;
            rs.l.c.f[i2] = Float.MAX_VALUE;
        }
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n7 < l) {
            n4 -= l - n7;
            n7 = l;
        }
        if (n3 < j) {
            n5 -= j - n3;
            n3 = j;
        }
        if (n7 + n4 > m) {
            n4 = m - n7;
        }
        if (n3 + n5 > k) {
            n5 = k - n3;
        }
        int n8 = 256 - n6;
        int n9 = (n2 >> 16 & 0xFF) * n6;
        int n10 = (n2 >> 8 & 0xFF) * n6;
        int n11 = (n2 & 0xFF) * n6;
        int n12 = h - n4;
        int n13 = n7 + n3 * h;
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = -n4; i3 < 0; ++i3) {
                int n14 = (g[n13] >> 16 & 0xFF) * n8;
                int n15 = (g[n13] >> 8 & 0xFF) * n8;
                int n16 = (g[n13] & 0xFF) * n8;
                int n17 = (n9 + n14 >> 8 << 16) + (n10 + n15 >> 8 << 8) + (n11 + n16 >> 8);
                rs.l.c.a(g, n13++, n17, n17, 255);
            }
            n13 += n12;
        }
    }

    public static Graphics2D a(int[] nArray, int n2, int n3) {
        return new BufferedImage(q, Raster.createWritableRaster(q.createCompatibleSampleModel(n2, n3), new DataBufferInt(nArray, n2 * n3), null), false, new Hashtable()).createGraphics();
    }

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 < l) {
            n4 -= l - n2;
            n2 = l;
        }
        if (n3 < j) {
            n5 -= j - n3;
            n3 = j;
        }
        if (n2 + n4 > m) {
            n4 = m - n2;
        }
        if (n3 + n5 > k) {
            n5 = k - n3;
        }
        int n8 = 256 - n7;
        int n9 = (n6 >> 16 & 0xFF) * n7;
        int n10 = (n6 >> 8 & 0xFF) * n7;
        int n11 = (n6 & 0xFF) * n7;
        int n12 = h - n4;
        int n13 = n2 + n3 * h;
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = -n4; i3 < 0; ++i3) {
                int n14 = (g[n13] >> 16 & 0xFF) * n8;
                int n15 = (g[n13] >> 8 & 0xFF) * n8;
                int n16 = (g[n13] & 0xFF) * n8;
                int n17 = (n9 + n14 >> 8 << 16) + (n10 + n15 >> 8 << 8) + (n11 + n16 >> 8);
                rs.l.c.a(g, n13++, n17, n17, n7);
            }
            n13 += n12;
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        if (n4 < l) {
            n6 -= l - n4;
            n4 = l;
        }
        if (n3 < j) {
            n2 -= j - n3;
            n3 = j;
        }
        if (n4 + n6 > m) {
            n6 = m - n4;
        }
        if (n3 + n2 > k) {
            n2 = k - n3;
        }
        int n7 = h - n6;
        int n8 = n4 + n3 * h;
        for (int i2 = -n2; i2 < 0; ++i2) {
            for (int i3 = -n6; i3 < 0; ++i3) {
                rs.l.c.a(g, n8++, n5, n5, 255);
            }
            n8 += n7;
        }
    }

    public static int a(int n2, int n3, int n4) {
        int n5 = 256 - n4;
        int n6 = g[n3];
        return ((n2 & 0xFF00FF) * n4 + (n6 & 0xFF00FF) * n5 & 0xFF00FF00) + ((n2 & 0xFF00) * n4 + (n6 & 0xFF00) * n5 & 0xFF0000) >> 8;
    }

    public static void e(int n2, int n3, int n4, int n5, int n6, int n7) {
        rs.l.c.b(n6, n5, n3, n2, n7);
        rs.l.c.b(n6 + n4 - 1, n5, n3, n2, n7);
        rs.l.c.c(n6, n5, n4, n2, n7);
        rs.l.c.c(n6, n5, n4, n2 + n3 - 1, n7);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        if (n2 < j || n2 >= k) {
            return;
        }
        if (n5 < l) {
            n4 -= l - n5;
            n5 = l;
        }
        if (n5 + n4 > m) {
            n4 = m - n5;
        }
        int n7 = n5 + n2 * h;
        for (int i2 = 0; i2 < n4; ++i2) {
            rs.l.c.a(g, n7 + i2, rs.l.c.a(n3, n7 + i2, n6), rs.l.c.a(n3, n7 + i2, n6), n6);
        }
    }

    public static void c(int n2, int n3, int n4, int n5, int n6) {
        if (n5 < l || n5 >= m) {
            return;
        }
        if (n2 < j) {
            n4 -= j - n2;
            n2 = j;
        }
        if (n2 + n4 > k) {
            n4 = k - n2;
        }
        int n7 = n5 + n2 * h;
        for (int i2 = 0; i2 < n4; ++i2) {
            rs.l.c.a(g, n7 + i2 * h, rs.l.c.a(n3, n7 + i2 * h, n6), rs.l.c.a(n3, n7 + i2 * h, n6), n6);
        }
    }

    public static void d(int n2, int n3, int n4, int n5, int n6) {
        rs.l.c.b(n2, n6, n3, n5);
        rs.l.c.b(n2, n6 + n4 - 1, n3, n5);
        rs.l.c.d(n6, n5, n4, n2);
        rs.l.c.d(n6, n5, n4, n2 + n3 - 1);
    }

    public static void f(int n2, int n3, int n4, int n5, int n6, int n7) {
        rs.l.c.f(n5, n6, n2, n4, n7);
        rs.l.c.f(n5, n6, n2 + n3 - 1, n4, n7);
        if (n3 >= 3) {
            rs.l.c.g(n5, n7, n4, n2 + 1, n3 - 2);
            rs.l.c.g(n5, n7 + n6 - 1, n4, n2 + 1, n3 - 2);
        }
    }

    private static void f(int n2, int n3, int n4, int n5, int n6) {
        if (n4 < j || n4 >= k) {
            return;
        }
        if (n6 < l) {
            n3 -= l - n6;
            n6 = l;
        }
        if (n6 + n3 > m) {
            n3 = m - n6;
        }
        int n7 = 256 - n5;
        int n8 = (n2 >> 16 & 0xFF) * n5;
        int n9 = (n2 >> 8 & 0xFF) * n5;
        int n10 = (n2 & 0xFF) * n5;
        int n11 = n6 + n4 * h;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n12 = (g[n11] >> 16 & 0xFF) * n7;
            int n13 = (g[n11] >> 8 & 0xFF) * n7;
            int n14 = (g[n11] & 0xFF) * n7;
            int n15 = (n8 + n12 >> 8 << 16) + (n9 + n13 >> 8 << 8) + (n10 + n14 >> 8);
            rs.l.c.a(g, n11++, n15, n15, n5);
        }
    }

    public static void d(int n2, int n3, int n4, int n5) {
        if (n5 < l || n5 >= m) {
            return;
        }
        if (n2 < j) {
            n4 -= j - n2;
            n2 = j;
        }
        if (n2 + n4 > k) {
            n4 = k - n2;
        }
        int n6 = n5 + n2 * h;
        for (int i2 = 0; i2 < n4; ++i2) {
            rs.l.c.a(g, n6 + i2 * h, n3, n3, 255);
        }
    }

    private static void g(int n2, int n3, int n4, int n5, int n6) {
        if (n3 < l || n3 >= m) {
            return;
        }
        if (n5 < j) {
            n6 -= j - n5;
            n5 = j;
        }
        if (n5 + n6 > k) {
            n6 = k - n5;
        }
        int n7 = 256 - n4;
        int n8 = (n2 >> 16 & 0xFF) * n4;
        int n9 = (n2 >> 8 & 0xFF) * n4;
        int n10 = (n2 & 0xFF) * n4;
        int n11 = n3 + n5 * h;
        for (int i2 = 0; i2 < n6; ++i2) {
            int n12 = (g[n11] >> 16 & 0xFF) * n7;
            int n13 = (g[n11] >> 8 & 0xFF) * n7;
            int n14 = (g[n11] & 0xFF) * n7;
            int n15 = (n8 + n12 >> 8 << 16) + (n9 + n13 >> 8 << 8) + (n10 + n14 >> 8);
            rs.l.c.a(g, n11 += h, n15, n15, n4);
            n11 += h;
        }
    }

    public static void e(int n2, int n3, int n4, int n5, int n6) {
        rs.l.c.a(n2, n3, n4, n5, n6, false);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, boolean bl) {
        if (n2 < l) {
            n4 -= l - n2;
            n2 = l;
        }
        if (n3 < j) {
            n5 -= j - n3;
            n3 = j;
        }
        if (n2 + n4 > m) {
            n4 = m - n2;
        }
        if (n3 + n5 > k) {
            n5 = k - n3;
        }
        int n7 = h - n4;
        int n8 = n2 + n3 * h;
        for (int i2 = -n5; i2 < 0; ++i2) {
            for (int i3 = -n4; i3 < 0; ++i3) {
                rs.l.c.a(g, n8++, n6, n6, bl ? 0 : 255);
            }
            n8 += n7;
        }
    }

    c() {
    }
}

