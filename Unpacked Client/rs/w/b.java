/*
 * Decompiled with CFR 0.152.
 */
package rs.w;

import rs.w.a;
import rs.x.e;

public final class b {
    public final int[] a = new int[2];
    private final int[][][] d = new int[2][2][4];
    private final int[][][] e = new int[2][2][4];
    private final int[] f = new int[2];
    private static final float[][] g = new float[2][8];
    public static final int[][] b = new int[2][8];
    private static float h;
    public static int c;

    private float a(int n2, int n3, float f2) {
        float f3 = (float)this.e[n2][0][n3] + f2 * (float)(this.e[n2][1][n3] - this.e[n2][0][n3]);
        return 1.0f - (float)Math.pow(10.0, -(f3 *= 0.001525879f) / 20.0f);
    }

    private float a(float f2) {
        float f3 = 32.7032f * (float)Math.pow(2.0, f2);
        return f3 * 3.141593f / 11025.0f;
    }

    private float a(float f2, int n2, int n3) {
        float f3 = (float)this.d[n3][0][n2] + f2 * (float)(this.d[n3][1][n2] - this.d[n3][0][n2]);
        return this.a(f3 *= 1.220703E-4f);
    }

    public int a(int n2, float f2) {
        int n3;
        float f3;
        if (n2 == 0) {
            f3 = (float)this.f[0] + (float)(this.f[1] - this.f[0]) * f2;
            h = (float)Math.pow(0.1, (f3 *= 0.003051758f) / 20.0f);
            c = (int)(h * 65536.0f);
        }
        if (this.a[n2] == 0) {
            return 0;
        }
        f3 = this.a(n2, 0, f2);
        rs.w.b.g[n2][0] = -2.0f * f3 * (float)Math.cos(this.a(f2, 0, n2));
        rs.w.b.g[n2][1] = f3 * f3;
        for (n3 = 1; n3 < this.a[n2]; ++n3) {
            float f4 = this.a(n2, n3, f2);
            float f5 = -2.0f * f4 * (float)Math.cos(this.a(f2, n3, n2));
            float f6 = f4 * f4;
            rs.w.b.g[n2][n3 * 2 + 1] = g[n2][n3 * 2 - 1] * f6;
            rs.w.b.g[n2][n3 * 2] = g[n2][n3 * 2 - 1] * f5 + g[n2][n3 * 2 - 2] * f6;
            for (int i2 = n3 * 2 - 1; i2 >= 2; --i2) {
                float[] fArray = g[n2];
                int n4 = i2;
                fArray[n4] = fArray[n4] + (g[n2][i2 - 1] * f5 + g[n2][i2 - 2] * f6);
            }
            float[] fArray = g[n2];
            fArray[1] = fArray[1] + (g[n2][0] * f5 + f6);
            float[] fArray2 = g[n2];
            fArray2[0] = fArray2[0] + f5;
        }
        if (n2 == 0) {
            n3 = 0;
            while (n3 < this.a[0] * 2) {
                float[] fArray = g[0];
                int n5 = n3++;
                fArray[n5] = fArray[n5] * h;
            }
        }
        for (n3 = 0; n3 < this.a[n2] * 2; ++n3) {
            rs.w.b.b[n2][n3] = (int)(g[n2][n3] * 65536.0f);
        }
        return this.a[n2] * 2;
    }

    public void a(e e2, a a2) {
        int n2 = e2.y();
        this.a[0] = n2 >> 4;
        this.a[1] = n2 & 0xF;
        if (n2 != 0) {
            int n3;
            int n4;
            this.f[0] = e2.A();
            this.f[1] = e2.A();
            int n5 = e2.y();
            for (n4 = 0; n4 < 2; ++n4) {
                for (n3 = 0; n3 < this.a[n4]; ++n3) {
                    this.d[n4][0][n3] = e2.A();
                    this.e[n4][0][n3] = e2.A();
                }
            }
            for (n4 = 0; n4 < 2; ++n4) {
                for (n3 = 0; n3 < this.a[n4]; ++n3) {
                    if ((n5 & 1 << n4 * 4 << n3) != 0) {
                        this.d[n4][1][n3] = e2.A();
                        this.e[n4][1][n3] = e2.A();
                        continue;
                    }
                    this.d[n4][1][n3] = this.d[n4][0][n3];
                    this.e[n4][1][n3] = this.e[n4][0][n3];
                }
            }
            if (n5 != 0 || this.f[1] != this.f[0]) {
                a2.b(e2);
            }
        } else {
            this.f[1] = 0;
            this.f[0] = 0;
        }
    }
}

