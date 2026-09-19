/*
 * Decompiled with CFR 0.152.
 */
package rs.w;

import rs.x.e;

public final class a {
    private int d;
    private int[] e;
    private int[] f;
    public int a;
    public int b;
    public int c;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public void a(e e2) {
        this.c = e2.y();
        this.a = e2.D();
        this.b = e2.D();
        this.b(e2);
    }

    public void b(e e2) {
        this.d = e2.y();
        this.e = new int[this.d];
        this.f = new int[this.d];
        for (int i2 = 0; i2 < this.d; ++i2) {
            this.e[i2] = e2.A();
            this.f[i2] = e2.A();
        }
    }

    public void a() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    public int a(int n2) {
        if (this.k >= this.g) {
            this.j = this.f[this.h++] << 15;
            if (this.h >= this.d) {
                this.h = this.d - 1;
            }
            this.g = (int)((double)this.e[this.h] / 65536.0 * (double)n2);
            if (this.g > this.k) {
                this.i = ((this.f[this.h] << 15) - this.j) / (this.g - this.k);
            }
        }
        this.j += this.i;
        ++this.k;
        return this.j - this.i >> 15;
    }
}

