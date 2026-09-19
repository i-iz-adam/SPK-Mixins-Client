/*
 * Decompiled with CFR 0.152.
 */
package rs.w;

import rs.w.d;

public final class e {
    private static final e[] b = new e[105000];
    public static final int[] a = new int[105000];
    private static byte[] c;
    private static rs.x.e d;
    private final d[] e = new d[10];
    private int f;
    private int g;

    private e() {
    }

    public static void a(rs.x.e e2) {
        c = new byte[441000];
        d = new rs.x.e(c);
        rs.w.d.a();
        int n2;
        while ((n2 = e2.A()) != 65535) {
            rs.w.e.b[n2] = new e();
            b[n2].b(e2);
            rs.w.e.a[n2] = b[n2].a();
        }
        return;
    }

    public static rs.x.e a(int n2, int n3) {
        if (b[n3] != null) {
            e e2 = b[n3];
            return e2.a(n2);
        }
        return null;
    }

    private void b(rs.x.e e2) {
        for (int i2 = 0; i2 < 10; ++i2) {
            int n2 = e2.y();
            if (n2 == 0) continue;
            --e2.h;
            this.e[i2] = new d();
            this.e[i2].a(e2);
        }
        this.f = e2.A();
        this.g = e2.A();
    }

    private int a() {
        int n2;
        int n3 = 9999999;
        for (n2 = 0; n2 < 10; ++n2) {
            if (this.e[n2] == null || this.e[n2].b / 20 >= n3) continue;
            n3 = this.e[n2].b / 20;
        }
        if (this.f < this.g && this.f / 20 < n3) {
            n3 = this.f / 20;
        }
        if (n3 == 9999999 || n3 == 0) {
            return 0;
        }
        for (n2 = 0; n2 < 10; ++n2) {
            if (this.e[n2] == null) continue;
            this.e[n2].b -= n3 * 20;
        }
        if (this.f < this.g) {
            this.f -= n3 * 20;
            this.g -= n3 * 20;
        }
        return n3;
    }

    private rs.x.e a(int n2) {
        int n3 = this.b(n2);
        rs.w.e.d.h = 0;
        d.g(1380533830);
        d.h(36 + n3);
        d.g(1463899717);
        d.g(1718449184);
        d.h(16);
        d.e(1);
        d.e(1);
        d.h(22050);
        d.h(22050);
        d.e(1);
        d.e(8);
        d.g(1684108385);
        d.h(n3);
        rs.w.e.d.h += n3;
        return d;
    }

    private int b(int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = 0;
        for (n6 = 0; n6 < 10; ++n6) {
            if (this.e[n6] == null || this.e[n6].a + this.e[n6].b <= n7) continue;
            n7 = this.e[n6].a + this.e[n6].b;
        }
        if (n7 == 0) {
            return 0;
        }
        n6 = 22050 * n7 / 1000;
        int n8 = 22050 * this.f / 1000;
        int n9 = 22050 * this.g / 1000;
        if (n8 < 0 || n8 > n6 || n9 < 0 || n9 > n6 || n8 >= n9) {
            n2 = 0;
        }
        int n10 = n6 + (n9 - n8) * (n2 - 1);
        for (n5 = 44; n5 < n10 + 44; ++n5) {
            rs.w.e.c[n5] = -128;
        }
        for (n5 = 0; n5 < 10; ++n5) {
            if (this.e[n5] == null) continue;
            n4 = this.e[n5].a * 22050 / 1000;
            n3 = this.e[n5].b * 22050 / 1000;
            int[] nArray = this.e[n5].a(n4, this.e[n5].a);
            for (int i2 = 0; i2 < n4; ++i2) {
                int n11 = i2 + n3 + 44;
                c[n11] = (byte)(c[n11] + (byte)(nArray[i2] >> 8));
            }
        }
        if (n2 > 1) {
            n8 += 44;
            n9 += 44;
            n5 = (n10 += 44) - (n6 += 44);
            for (n4 = n6 - 1; n4 >= n9; --n4) {
                rs.w.e.c[n4 + n5] = c[n4];
            }
            for (n4 = 1; n4 < n2; ++n4) {
                n3 = (n9 - n8) * n4;
                System.arraycopy(c, n8, c, n8 + n3, n9 - n8);
            }
            n10 -= 44;
        }
        return n10;
    }
}

