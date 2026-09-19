/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.l.b_0;
import rs.l.c;
import rs.x.e;
import rs.x.f;

public final class a
extends b_0 {
    float f;
    float g;
    public final int[] h;
    public byte[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public float c() {
        return this.f;
    }

    public void a(float f2) {
        this.f = f2;
    }

    public float d() {
        return this.g;
    }

    public void b(float f2) {
        this.g = f2;
    }

    public a(f f2, String string, int n2) {
        int n3;
        e e2 = new e(f2.a(string + ".dat"));
        e e3 = new e(f2.a("index.dat"));
        e3.h = e2.A();
        this.n = e3.A();
        this.o = e3.A();
        int n4 = e3.y();
        this.h = new int[n4];
        for (n3 = 0; n3 < n4 - 1; ++n3) {
            this.h[n3 + 1] = e3.C();
        }
        for (n3 = 0; n3 < n2; ++n3) {
            e3.h += 2;
            e2.h += e3.A() * e3.A();
            ++e3.h;
        }
        this.l = e3.y();
        this.m = e3.y();
        this.j = e3.A();
        this.k = e3.A();
        n3 = e3.y();
        int n5 = this.j * this.k;
        this.i = new byte[n5];
        if (n3 == 0) {
            for (int i2 = 0; i2 < n5; ++i2) {
                this.i[i2] = e2.z();
            }
            return;
        }
        if (n3 == 1) {
            for (int i3 = 0; i3 < this.j; ++i3) {
                for (int i4 = 0; i4 < this.k; ++i4) {
                    this.i[i3 + i4 * this.j] = e2.z();
                }
            }
        }
    }

    public void a(int n2, int n3) {
        int n4;
        int n5 = (n2 += this.l) + (n3 += this.m) * rs.l.c.h;
        int n6 = 0;
        int n7 = this.k;
        int n8 = this.j;
        int n9 = rs.l.c.h - n8;
        int n10 = 0;
        if (n3 < rs.l.c.j) {
            n4 = rs.l.c.j - n3;
            n7 -= n4;
            n3 = rs.l.c.j;
            n6 += n4 * n8;
            n5 += n4 * rs.l.c.h;
        }
        if (n3 + n7 > rs.l.c.k) {
            n7 -= n3 + n7 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n4 = rs.l.c.l - n2;
            n8 -= n4;
            n2 = rs.l.c.l;
            n6 += n4;
            n5 += n4;
            n10 += n4;
            n9 += n4;
        }
        if (n2 + n8 > rs.l.c.m) {
            n4 = n2 + n8 - rs.l.c.m;
            n8 -= n4;
            n10 += n4;
            n9 += n4;
        }
        if (n8 > 0 && n7 > 0) {
            this.a(n7, rs.l.c.g, this.i, n9, n5, n8, n6, this.h, n10);
        }
    }

    public void e() {
        this.n /= 2;
        this.o /= 2;
        byte[] byArray = new byte[this.n * this.o];
        int n2 = 0;
        for (int i2 = 0; i2 < this.k; ++i2) {
            for (int i3 = 0; i3 < this.j; ++i3) {
                byArray[(i3 + this.l >> 1) + (i2 + this.m >> 1) * this.n] = this.i[n2++];
            }
        }
        this.i = byArray;
        this.j = this.n;
        this.k = this.o;
        this.l = 0;
        this.m = 0;
    }

    public void f() {
        if (this.j == this.n && this.k == this.o) {
            return;
        }
        if (this.n * this.o > 16384) {
            System.out.println("Blocked background: " + this.n * this.o);
            return;
        }
        byte[] byArray = new byte[this.n * this.o];
        int n2 = 0;
        for (int i2 = 0; i2 < this.k; ++i2) {
            for (int i3 = 0; i3 < this.j; ++i3) {
                byArray[i3 + this.l + (i2 + this.m) * this.n] = this.i[n2++];
            }
        }
        this.i = byArray;
        this.j = this.n;
        this.k = this.o;
        this.l = 0;
        this.m = 0;
    }

    public void g() {
        byte[] byArray = new byte[this.j * this.k];
        int n2 = 0;
        for (int i2 = 0; i2 < this.k; ++i2) {
            for (int i3 = this.j - 1; i3 >= 0; --i3) {
                byArray[n2++] = this.i[i3 + i2 * this.j];
            }
        }
        this.i = byArray;
        this.l = this.n - this.j - this.l;
    }

    public void h() {
        byte[] byArray = new byte[this.j * this.k];
        int n2 = 0;
        for (int i2 = this.k - 1; i2 >= 0; --i2) {
            for (int i3 = 0; i3 < this.j; ++i3) {
                byArray[n2++] = this.i[i3 + i2 * this.j];
            }
        }
        this.i = byArray;
        this.m = this.o - this.k - this.m;
    }

    public void a(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.h.length; ++i2) {
            int n5 = this.h[i2] >> 16 & 0xFF;
            if ((n5 += n2) < 0) {
                n5 = 0;
            } else if (n5 > 255) {
                n5 = 255;
            }
            int n6 = this.h[i2] >> 8 & 0xFF;
            if ((n6 += n3) < 0) {
                n6 = 0;
            } else if (n6 > 255) {
                n6 = 255;
            }
            int n7 = this.h[i2] & 0xFF;
            if ((n7 += n4) < 0) {
                n7 = 0;
            } else if (n7 > 255) {
                n7 = 255;
            }
            this.h[i2] = (n5 << 16) + (n6 << 8) + n7;
        }
    }

    public void b(int n2, int n3) {
        int n4;
        int n5 = (n2 += this.l) + (n3 += this.m) * rs.l.c.h;
        int n6 = 0;
        int n7 = this.k;
        int n8 = this.j;
        int n9 = rs.l.c.h - n8;
        int n10 = 0;
        if (n3 < rs.l.c.j) {
            n4 = rs.l.c.j - n3;
            n7 -= n4;
            n3 = rs.l.c.j;
            n6 += n4 * n8;
            n5 += n4 * rs.l.c.h;
        }
        if (n3 + n7 > rs.l.c.k) {
            n7 -= n3 + n7 - rs.l.c.k;
        }
        if (n2 < rs.l.c.l) {
            n4 = rs.l.c.l - n2;
            n8 -= n4;
            n2 = rs.l.c.l;
            n6 += n4;
            n5 += n4;
            n10 += n4;
            n9 += n4;
        }
        if (n2 + n8 > rs.l.c.m) {
            n4 = n2 + n8 - rs.l.c.m;
            n8 -= n4;
            n10 += n4;
            n9 += n4;
        }
        if (n8 > 0 && n7 > 0) {
            this.a(n7, rs.l.c.g, this.i, n9, n5, n8, n6, this.h, n10);
        }
    }

    private void a(int n2, int[] nArray, byte[] byArray, int n3, int n4, int n5, int n6, int[] nArray2, int n7) {
        int n8 = -(n5 >> 2);
        n5 = -(n5 & 3);
        for (int i2 = -n2; i2 < 0; ++i2) {
            byte by;
            int n9;
            for (n9 = n8; n9 < 0; ++n9) {
                if ((by = byArray[n6++]) != 0) {
                    rs.l.a.b(nArray, n4++, nArray2[by & 0xFF], nArray2[by & 0xFF], 255);
                } else {
                    ++n4;
                }
                by = byArray[n6++];
                if (by != 0) {
                    rs.l.a.b(nArray, n4++, nArray2[by & 0xFF], nArray2[by & 0xFF], 255);
                } else {
                    ++n4;
                }
                by = byArray[n6++];
                if (by != 0) {
                    rs.l.a.b(nArray, n4++, nArray2[by & 0xFF], nArray2[by & 0xFF], 255);
                } else {
                    ++n4;
                }
                by = byArray[n6++];
                if (by != 0) {
                    rs.l.a.b(nArray, n4++, nArray2[by & 0xFF], nArray2[by & 0xFF], 255);
                    continue;
                }
                ++n4;
            }
            for (n9 = n5; n9 < 0; ++n9) {
                if ((by = byArray[n6++]) != 0) {
                    rs.l.a.b(nArray, n4++, nArray2[by & 0xFF], nArray2[by & 0xFF], 255);
                    continue;
                }
                ++n4;
            }
            n4 += n3;
            n6 += n7;
        }
    }

    public int i() {
        return 3;
    }

    public int j() {
        return 1;
    }
}

