/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.l.f_0;
import rs.l.l_0;

public final class n {
    private static final int a = 128;
    private static final int b = 32;
    private static final int c = 4;
    private static final int d = 65536;
    private static final f_0[] e = new f_0[128];
    private static final f_0[] f = new f_0[128];
    private static final int[] g = new int[128];
    private static final int[] h = new int[128];
    private static final int[] i = new int[32];

    private n() {
    }

    public static f_0 a(f_0 f_02, int n2) {
        return n.a(f_02, n2, 0);
    }

    public static f_0 a(f_0 f_02, int n2, int n3) {
        int n4;
        if (f_02 == null || n2 == 0 && n3 == 0) {
            return f_02;
        }
        int n5 = f_02.n + n3;
        int n6 = f_02.o + n3;
        if ((long)n5 * (long)n6 > 65536L) {
            return f_02;
        }
        int n7 = System.identityHashCode(f_02) * 31 + n2 * 17 + n3 & 0x1F;
        int n8 = n7 * 4;
        for (n4 = 0; n4 < 4; ++n4) {
            int n9 = n8 + n4;
            if (e[n9] != f_02 || g[n9] != n2 || h[n9] != n3) continue;
            return f[n9];
        }
        n4 = n8 + i[n7];
        n.i[n7] = i[n7] + 1 & 3;
        f_0 f_03 = new f_0(n5, n6);
        f_03.r = n5;
        f_03.s = n6;
        f_03.p = 0;
        f_03.q = 0;
        boolean bl = n2 > 255;
        int n10 = bl ? n2 - 256 : l_0.a(n2);
        for (int i2 = 0; i2 < n6; ++i2) {
            int n11 = i2 * f_02.o / n6;
            int n12 = bl ? n10 + i2 * 255 / Math.max(1, n6 - 1) & 0xFF : n10;
            for (int i3 = 0; i3 < n5; ++i3) {
                int n13 = i3 * f_02.n / n5;
                int n14 = f_02.m[n13 + n11 * f_02.n];
                f_03.m[i3 + i2 * n5] = n14 == 0 || n12 == 0 ? n14 : n14 & 0xFF000000 | l_0.b(n14 & 0xFFFFFF, n12);
            }
        }
        n.e[n4] = f_02;
        n.g[n4] = n2;
        n.h[n4] = n3;
        n.f[n4] = f_03;
        return f_03;
    }
}

