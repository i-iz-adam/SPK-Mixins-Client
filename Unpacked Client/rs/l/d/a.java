/*
 * Decompiled with CFR 0.152.
 */
package rs.l.d;

import java.awt.Color;
import rs.Client;
import rs.c_0;
import rs.l.d.c;
import rs.l.f_0;

public class a {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    private static final int h = 8;
    private static final int i = 256;
    private static final int j = 256;
    private final Color k = new Color(178, 120, 208);
    public static final Color[] g = rs.l.d.c.i;
    private static final f_0[][] l = new f_0[9][g.length];
    private static boolean m = false;
    private Client n;
    private f_0 o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final int t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public a(Client client, int n2, int n3, int n4) {
        this.n = client;
        this.p = n2;
        this.q = n3;
        this.r = n2 << 8;
        this.s = n3 << 8;
        this.t = n4;
        this.b();
    }

    public void a(boolean bl, int n2, int n3, int n4, int n5, boolean bl2, int n6, int n7, int n8, int n9, int n10) {
        boolean bl3;
        boolean bl4 = bl3 = bl2 && this.a(n7, n8, n9);
        if (this.x || bl3) {
            if (!bl2) {
                this.x = false;
                this.y = true;
            } else {
                if (!this.x) {
                    this.d();
                    this.x = true;
                }
                this.a(n6, n7, n8, n9, n10);
            }
        }
        if (!this.x && bl) {
            if (!this.w) {
                this.d();
            }
            this.b(n2, n3, n4, n5);
        } else if (!this.x && this.y) {
            this.e();
        } else if (!this.x) {
            this.g();
        }
        this.w = bl;
        this.o.c(this.p, this.q);
    }

    private void d() {
        this.u = this.r;
        this.v = this.s;
        this.y = true;
    }

    private boolean a(int n2, int n3, int n4) {
        int n5 = this.p + this.o.n / 2;
        int n6 = n5 - n2;
        int n7 = this.q + this.o.o / 2;
        int n8 = n7 - n3;
        int n9 = Math.max(this.o.n, this.o.o) / 2;
        int n10 = n4 + n9;
        return n6 * n6 + n8 * n8 <= n10 * n10;
    }

    public boolean a() {
        return this.x;
    }

    private void a(int n2, int n3, int n4, int n5, int n6) {
        switch (n6) {
            case 1: {
                this.a(n2, n3, n4, n5, 10, true);
                break;
            }
            case 2: {
                this.a(n2, n3, n4, n5, 3, false);
                break;
            }
            case 3: {
                this.a(n2, n3, n4, n5, 4, false);
                break;
            }
            case 4: {
                this.a(n2, n3, n4, n5);
                break;
            }
            default: {
                this.b(n2, n3, n4, n5);
            }
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6, boolean bl) {
        int n7 = this.t * n6;
        int n8 = n7 >> 11;
        int n9 = n7 & 0x7FF;
        int n10 = (n8 + 1) % n6;
        int n11 = n2 - 512;
        int n12 = bl && (n8 & 1) == 1 ? n5 * 2 / 5 : n5;
        int n13 = bl && (n10 & 1) == 1 ? n5 * 2 / 5 : n5;
        int n14 = n11 + n8 * 2048 / n6 & 0x7FF;
        int n15 = n11 + n10 * 2048 / n6 & 0x7FF;
        int n16 = c_0.hB[n14] * n12 >> 16;
        int n17 = c_0.hA[n14] * n12 >> 16;
        int n18 = c_0.hB[n15] * n13 >> 16;
        int n19 = c_0.hA[n15] * n13 >> 16;
        int n20 = n16 * (2048 - n9) + n18 * n9 >> 11;
        int n21 = n17 * (2048 - n9) + n19 * n9 >> 11;
        this.a(n3 + n20, n4 + n21);
    }

    private void a(int n2, int n3, int n4, int n5) {
        int n6 = this.t >> 10;
        int n7 = this.t & 0x3FF;
        int n8 = (n7 * n5 * 2 >> 10) - n5;
        int n9 = n2 + 256 + n6 * 512 & 0x7FF;
        int n10 = c_0.hB[n9] * n8 >> 16;
        int n11 = c_0.hA[n9] * n8 >> 16;
        this.a(n3 + n10, n4 + n11);
    }

    private void a(int n2, int n3) {
        int n4 = n2 - this.o.n / 2;
        int n5 = n3 - this.o.o / 2;
        this.r += (n4 << 8) - this.r >> 3;
        this.s += (n5 << 8) - this.s >> 3;
        this.f();
    }

    private void b(int n2, int n3, int n4, int n5) {
        int n6 = n2 + this.t & 0x7FF;
        int n7 = n3 + (c_0.hB[n6] * n5 >> 16) - this.o.n / 2;
        int n8 = n4 + (c_0.hA[n6] * n5 >> 16) - this.o.o / 2;
        this.a(n7 + this.o.n / 2, n8 + this.o.o / 2);
    }

    private void e() {
        int n2 = this.u - this.r;
        int n3 = this.v - this.s;
        if (Math.abs(n2) <= 256 && Math.abs(n3) <= 256) {
            this.r = this.u;
            this.s = this.v;
            this.y = false;
        } else {
            this.r += n2 >> 1;
            this.s += n3 >> 1;
        }
        this.f();
    }

    private void f() {
        this.p = this.r >> 8;
        this.q = this.s >> 8;
    }

    public void b() {
        int n2;
        this.z = Client.c(7, 9);
        if (Client.c(0, 20) == 0) {
            this.z = 9;
        }
        if (Client.c(0, 10) == 0) {
            int n3 = this.z = Client.c(1, 3) == 3 ? 1 : 6;
        }
        if (!m) {
            for (n2 = 0; n2 < l.length; ++n2) {
                int n4 = 0;
                for (Color color : g) {
                    String string = "orb " + (n2 + 1);
                    if (n2 + 1 >= 7) {
                        rs.l.d.a.l[n2][n4++] = new f_0("/assets/", string);
                        continue;
                    }
                    f_0 f_02 = new f_0("/assets/", string, this.k, color);
                    f_02 = new f_0("/assets/", string, this.k, color);
                    rs.l.d.a.l[n2][n4++] = f_02;
                }
            }
            m = true;
        }
        n2 = Client.c(0, g.length - 1);
        this.o = l[this.z - 1][n2];
    }

    public int c() {
        return this.z;
    }

    private void g() {
        if (this.z > 3) {
            this.z = Client.c(1, 3);
        }
        this.r += this.z << 8;
        this.s += this.z << 8;
        this.f();
        if (this.p >= this.n.hE + this.o.n) {
            this.b();
            this.p = -1 * this.o.n;
            this.r = this.p << 8;
        }
        if (this.q >= this.n.hF + this.o.o) {
            this.b();
            this.q = -1 * this.o.o;
            this.s = this.q << 8;
        }
    }
}

