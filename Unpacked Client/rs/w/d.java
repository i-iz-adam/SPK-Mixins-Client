/*
 * Decompiled with CFR 0.152.
 */
package rs.w;

import rs.w.a;
import rs.w.b;
import rs.x.e;

final class d {
    private a c;
    private a d;
    private a e;
    private a f;
    private a g;
    private a h;
    private a i;
    private a j;
    private final int[] k = new int[5];
    private final int[] l = new int[5];
    private final int[] m = new int[5];
    private int n;
    private int o = 100;
    private b p;
    private a q;
    int a = 500;
    int b;
    private static int[] r;
    private static int[] s;
    private static int[] t;
    private static final int[] u;
    private static final int[] v;
    private static final int[] w;
    private static final int[] x;
    private static final int[] y;

    public static void a() {
        int n2;
        s = new int[32768];
        for (n2 = 0; n2 < 32768; ++n2) {
            rs.w.d.s[n2] = Math.random() > 0.5 ? 1 : -1;
        }
        t = new int[32768];
        for (n2 = 0; n2 < 32768; ++n2) {
            rs.w.d.t[n2] = (int)(Math.sin((double)n2 / 5215.1903) * 16384.0);
        }
        r = new int[220500];
    }

    public int[] a(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        for (int i2 = 0; i2 < n2; ++i2) {
            rs.w.d.r[i2] = 0;
        }
        if (n3 < 10) {
            return r;
        }
        double d2 = (double)n2 / (double)n3;
        this.c.a();
        this.d.a();
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        if (this.e != null) {
            this.e.a();
            this.f.a();
            n11 = (int)((double)(this.e.b - this.e.a) * 32.768 / d2);
            n12 = (int)((double)this.e.a * 32.768 / d2);
        }
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        if (this.g != null) {
            this.g.a();
            this.h.a();
            n14 = (int)((double)(this.g.b - this.g.a) * 32.768 / d2);
            n15 = (int)((double)this.g.a * 32.768 / d2);
        }
        for (n10 = 0; n10 < 5; ++n10) {
            if (this.k[n10] == 0) continue;
            rs.w.d.u[n10] = 0;
            rs.w.d.v[n10] = (int)((double)this.m[n10] * d2);
            rs.w.d.w[n10] = (this.k[n10] << 14) / 100;
            rs.w.d.x[n10] = (int)((double)(this.c.b - this.c.a) * 32.768 * Math.pow(1.0057929410678534, this.l[n10]) / d2);
            rs.w.d.y[n10] = (int)((double)this.c.a * 32.768 / d2);
        }
        for (n10 = 0; n10 < n2; ++n10) {
            n9 = this.c.a(n2);
            n8 = this.d.a(n2);
            if (this.e != null) {
                n7 = this.e.a(n2);
                n6 = this.f.a(n2);
                n9 += this.a(n6, n13, this.e.c) >> 1;
                n13 += (n7 * n11 >> 16) + n12;
            }
            if (this.g != null) {
                n7 = this.g.a(n2);
                n6 = this.h.a(n2);
                n8 = n8 * ((this.a(n6, n16, this.g.c) >> 1) + 32768) >> 15;
                n16 += (n7 * n14 >> 16) + n15;
            }
            for (n7 = 0; n7 < 5; ++n7) {
                if (this.k[n7] == 0 || (n6 = n10 + v[n7]) >= n2) continue;
                int n17 = n6;
                r[n17] = r[n17] + this.a(n8 * w[n7] >> 15, u[n7], this.c.c);
                int n18 = n7;
                u[n18] = u[n18] + ((n9 * x[n7] >> 16) + y[n7]);
            }
        }
        if (this.i != null) {
            this.i.a();
            this.j.a();
            n10 = 0;
            n9 = 0;
            n8 = 1;
            for (n7 = 0; n7 < n2; ++n7) {
                n6 = this.i.a(n2);
                n5 = this.j.a(n2);
                n4 = n8 != 0 ? this.i.a + ((this.i.b - this.i.a) * n6 >> 8) : this.i.a + ((this.i.b - this.i.a) * n5 >> 8);
                if ((n10 += 256) >= n4) {
                    n10 = 0;
                    int n19 = n8 = n8 == 0 ? 1 : 0;
                }
                if (n8 == 0) continue;
                rs.w.d.r[n7] = 0;
            }
        }
        if (this.n > 0 && this.o > 0) {
            for (n9 = n10 = (int)((double)this.n * d2); n9 < n2; ++n9) {
                int n20 = n9;
                r[n20] = r[n20] + r[n9 - n10] * this.o / 100;
            }
        }
        if (this.p.a[0] > 0 || this.p.a[1] > 0) {
            this.q.a();
            n10 = this.q.a(n2 + 1);
            n9 = this.p.a(0, (float)n10 / 65536.0f);
            n8 = this.p.a(1, (float)n10 / 65536.0f);
            if (n2 >= n9 + n8) {
                int n21;
                n7 = 0;
                n6 = n8;
                if (n6 > n2 - n9) {
                    n6 = n2 - n9;
                }
                while (n7 < n6) {
                    n5 = (int)((long)r[n7 + n9] * (long)rs.w.b.c >> 16);
                    for (n4 = 0; n4 < n9; ++n4) {
                        n5 += (int)((long)r[n7 + n9 - 1 - n4] * (long)rs.w.b.b[0][n4] >> 16);
                    }
                    for (n4 = 0; n4 < n7; ++n4) {
                        n5 -= (int)((long)r[n7 - 1 - n4] * (long)rs.w.b.b[1][n4] >> 16);
                    }
                    rs.w.d.r[n7] = n5;
                    n10 = this.q.a(n2 + 1);
                    ++n7;
                }
                n6 = n5 = 128;
                while (true) {
                    if (n6 > n2 - n9) {
                        n6 = n2 - n9;
                    }
                    while (n7 < n6) {
                        n4 = (int)((long)r[n7 + n9] * (long)rs.w.b.c >> 16);
                        for (n21 = 0; n21 < n9; ++n21) {
                            n4 += (int)((long)r[n7 + n9 - 1 - n21] * (long)rs.w.b.b[0][n21] >> 16);
                        }
                        for (n21 = 0; n21 < n8; ++n21) {
                            n4 -= (int)((long)r[n7 - 1 - n21] * (long)rs.w.b.b[1][n21] >> 16);
                        }
                        rs.w.d.r[n7] = n4;
                        n10 = this.q.a(n2 + 1);
                        ++n7;
                    }
                    if (n7 >= n2 - n9) break;
                    n9 = this.p.a(0, (float)n10 / 65536.0f);
                    n8 = this.p.a(1, (float)n10 / 65536.0f);
                    n6 += n5;
                }
                while (n7 < n2) {
                    n4 = 0;
                    for (n21 = n7 + n9 - n2; n21 < n9; ++n21) {
                        n4 += (int)((long)r[n7 + n9 - 1 - n21] * (long)rs.w.b.b[0][n21] >> 16);
                    }
                    for (n21 = 0; n21 < n8; ++n21) {
                        n4 -= (int)((long)r[n7 - 1 - n21] * (long)rs.w.b.b[1][n21] >> 16);
                    }
                    rs.w.d.r[n7] = n4;
                    n21 = this.q.a(n2 + 1);
                    ++n7;
                }
            }
        }
        for (n10 = 0; n10 < n2; ++n10) {
            if (r[n10] < Short.MIN_VALUE) {
                rs.w.d.r[n10] = Short.MIN_VALUE;
            }
            if (r[n10] <= Short.MAX_VALUE) continue;
            rs.w.d.r[n10] = Short.MAX_VALUE;
        }
        return r;
    }

    private int a(int n2, int n3, int n4) {
        if (n4 == 1) {
            if ((n3 & Short.MAX_VALUE) < 16384) {
                return n2;
            }
            return -n2;
        }
        if (n4 == 2) {
            return t[n3 & Short.MAX_VALUE] * n2 >> 14;
        }
        if (n4 == 3) {
            return ((n3 & Short.MAX_VALUE) * n2 >> 14) - n2;
        }
        if (n4 == 4) {
            return s[n3 / 2607 & Short.MAX_VALUE] * n2;
        }
        return 0;
    }

    public void a(e e2) {
        int n2;
        this.c = new a();
        this.c.a(e2);
        this.d = new a();
        this.d.a(e2);
        int n3 = e2.y();
        if (n3 != 0) {
            --e2.h;
            this.e = new a();
            this.e.a(e2);
            this.f = new a();
            this.f.a(e2);
        }
        if ((n3 = e2.y()) != 0) {
            --e2.h;
            this.g = new a();
            this.g.a(e2);
            this.h = new a();
            this.h.a(e2);
        }
        if ((n3 = e2.y()) != 0) {
            --e2.h;
            this.i = new a();
            this.i.a(e2);
            this.j = new a();
            this.j.a(e2);
        }
        for (int i2 = 0; i2 < 10 && (n2 = e2.f()) != 0; ++i2) {
            this.k[i2] = n2;
            this.l[i2] = e2.n();
            this.m[i2] = e2.f();
        }
        this.n = e2.f();
        this.o = e2.f();
        this.a = e2.A();
        this.b = e2.A();
        this.p = new b();
        this.q = new a();
        this.p.a(e2, this.q);
    }

    static {
        u = new int[5];
        v = new int[5];
        w = new int[5];
        x = new int[5];
        y = new int[5];
    }
}

