/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.l.c;
import rs.l.e_0;

public class j {
    private float b;
    public static int a = 0;

    public void a(boolean bl, int n2, int n3, int n4) {
        this.a(a);
        int n5 = e_0.x[0];
        int n6 = (int)((float)n2 + this.b);
        int n7 = (int)((float)n3 + this.b);
        for (int i2 = 0; i2 < c.k; ++i2) {
            for (int i3 = 0; i3 < c.n; ++i3) {
                if (c.f[n5] >= (float)n7) {
                    c.g[n5] = a;
                } else if (c.f[n5] >= (float)n6) {
                    int n8 = (int)(c.f[n5] - (float)n6) / n4;
                    int n9 = ((a & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((a & 0xFF00) * n8 >> 8 & 0xFF00);
                    n8 = 256 - n8;
                    int n10 = c.g[n5];
                    n10 = ((n10 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n10 & 0xFF00) * n8 >> 8 & 0xFF00);
                    c.g[n5] = n9 + n10;
                }
                ++n5;
            }
            n5 += c.h - c.n;
        }
    }

    public void a(float f2) {
        this.b = f2;
    }

    public void a(int n2) {
        a = n2;
    }
}

