/*
 * Decompiled with CFR 0.152.
 */
package rs.g;

import rs.g.b;
import rs.g.e;

public class c
extends b {
    long[] a = new long[10];
    int b = 256;
    int c = 1;
    long d = rs.g.c.b();
    int e = 0;
    int f;
    static long g;
    static long h;

    public c() {
        for (int i2 = 0; i2 < 10; ++i2) {
            this.a[i2] = this.d;
        }
    }

    @Override
    public void a() {
        for (int i2 = 0; i2 < 10; ++i2) {
            this.a[i2] = 0L;
        }
    }

    public static synchronized long b() {
        long l2 = System.currentTimeMillis();
        if (l2 < g) {
            h += g - l2;
        }
        g = l2;
        return h + l2;
    }

    @Override
    public int a(int n2, int n3) {
        int n4;
        int n5 = this.b;
        int n6 = this.c;
        this.b = 300;
        this.c = 1;
        this.d = rs.g.c.b();
        if (this.a[this.f] == 0L) {
            this.b = n5;
            this.c = n6;
        } else if (this.d > this.a[this.f]) {
            this.b = (int)((long)(n2 * 2560) / (this.d - this.a[this.f]));
        }
        if (this.b < 25) {
            this.b = 25;
        }
        if (this.b > 256) {
            this.b = 256;
            this.c = (int)((long)n2 - (this.d - this.a[this.f]) / 10L);
        }
        if (this.c > n2) {
            this.c = n2;
        }
        this.a[this.f] = this.d;
        this.f = (this.f + 1) % 10;
        if (this.c > 1) {
            for (n4 = 0; n4 < 10; ++n4) {
                if (this.a[n4] == 0L) continue;
                int n7 = n4;
                this.a[n7] = this.a[n7] + (long)this.c;
            }
        }
        if (this.c < n3) {
            this.c = n3;
        }
        rs.g.e.a(this.c);
        n4 = 0;
        while (this.e < 256) {
            ++n4;
            this.e += this.b;
        }
        this.e &= 0xFF;
        return n4;
    }
}

