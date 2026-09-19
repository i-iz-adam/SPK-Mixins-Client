/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 */
package rs.ui.b;

import com.google.inject.Singleton;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import rs.Client;
import rs.a.c;
import rs.a.j;
import rs.a.k;
import rs.d.d;
import rs.gui.Launcher;
import rs.l;
import rs.m;
import rs.q_0;
import rs.runelite.a.f;
import rs.runelite.a.h;
import rs.t_0;
import rs.u_0;

@Singleton
public class b {
    private static final int a = 50;
    private static final int b = 4;
    private static final int c = 10;
    private final int[] d = new int[6500];
    private final int[] e = new int[6500];
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int[] p = new int[0];
    private final rs.ui.b.a q = new rs.ui.b.a();
    private int[][] r = new int[0][];
    private int[] s = new int[0];
    private int[] t;
    private int u;
    private b[][][] v = new b[0][][];
    private a[][][] w = new a[0][][];
    private static final b x = new b();

    public static b a() {
        return x;
    }

    private static int a(int n2) {
        --n2;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return ++n2;
    }

    private static boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return (n5 - n3) * (n6 - n4) - (n4 - n2) * (n7 - n5) <= 0;
    }

    private b[] a(int n2, int n3) {
        if (this.v.length <= n2) {
            this.v = (b[][][])Arrays.copyOf(this.v, n2 + 1);
        }
        if (this.v[n2] == null) {
            this.v[n2] = new b[n3 + 1][];
        } else if (this.v[n2].length <= n3) {
            this.v[n2] = (b[][])Arrays.copyOf(this.v[n2], n3 + 1);
        }
        if (this.v[n2][n3] == null) {
            double d2 = (double)n3 / 4.0 * ((double)n2 - 0.5);
            ArrayList<b> arrayList = new ArrayList<b>();
            for (int i2 = 0; i2 <= n2; ++i2) {
                for (int i3 = 0; i3 <= n2; ++i3) {
                    double d3;
                    if (i2 == 0 && i3 == 0 || (d3 = Math.hypot(i2, i3)) > (double)n2) continue;
                    double d4 = (double)n2 - d3 + 0.5;
                    double d5 = d4 < d2 ? d4 / d2 : 1.0;
                    arrayList.add(new b(d3, i2 + i3 * this.u, d5));
                }
            }
            arrayList.sort(Comparator.comparingDouble(object -> ((b)object).a()));
            this.v[n2][n3] = arrayList.toArray(new b[0]);
        }
        return this.v[n2][n3];
    }

    private void b(int n2) {
        int n3;
        int n4;
        if (this.w.length <= n2) {
            this.w = (a[][][])Arrays.copyOf(this.w, n2 + 1);
        }
        if (this.w[n2] == null) {
            this.w[n2] = new a[4][];
        }
        if (this.w[n2][0] != null) {
            return;
        }
        ArrayList<a> arrayList = new ArrayList<a>();
        for (n4 = -n2; n4 <= n2; ++n4) {
            for (n3 = 1; n3 <= n2; ++n3) {
                double d2;
                if (Math.abs(n4) > n3 || (d2 = Math.hypot(n3, n4)) > (double)n2) continue;
                arrayList.add(new a(n3, n4));
            }
        }
        for (n4 = 0; n4 < 4; ++n4) {
            this.w[n2][n4] = arrayList.toArray(new a[0]);
            for (n3 = 0; n3 < arrayList.size(); ++n3) {
                a a2 = (a)arrayList.get(n3);
                arrayList.set(n3, new a(a2.b, -a2.a));
            }
        }
    }

    private void a(int n2, int n3, int n4) {
        if (this.t[n2] == 1024) {
            int n5 = this.s[n2] + 1;
            if (n5 > this.r[n2].length) {
                this.r[n2] = Arrays.copyOf(this.r[n2], rs.ui.b.b.a(n5));
            }
            this.r[n2][this.s[n2]] = this.q.b();
            int n6 = n2;
            this.s[n6] = this.s[n6] + 1;
            this.t[n2] = 0;
        }
        int[] nArray = this.q.a();
        int n7 = this.r[n2][this.s[n2] - 1];
        int n8 = n2;
        int n9 = this.t[n8];
        this.t[n8] = n9 + 1;
        int n10 = n9;
        nArray[(n7 << 10) + n10] = n4 << 16 | n3;
    }

    private void c(int n2) {
        int n3 = n2 >>> 5;
        if (this.p.length < n3) {
            this.p = new int[rs.ui.b.b.a(n3)];
        }
        Arrays.fill(this.p, 0, n3, 0);
    }

    private void b() {
        int n2;
        int n3 = this.u * this.u;
        if (this.s.length < n3) {
            this.r = new int[n3][];
            this.s = new int[n3];
            this.t = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.r[n2] = new int[0];
            }
        }
        for (n2 = 0; n2 < n3; ++n2) {
            this.t[n2] = 1024;
        }
    }

    private void c() {
        for (int i2 = 0; i2 < this.u * this.u; ++i2) {
            while (this.s[i2] > 0) {
                int n2 = i2;
                this.s[n2] = this.s[n2] - 1;
                this.q.a(this.r[i2][this.s[i2]]);
            }
            this.t[i2] = 1024;
        }
    }

    private void b(int n2, int n3, int n4) {
        if (n4 > this.h) {
            n4 = this.h;
        }
        if (n3 < this.f) {
            n3 = this.f;
        }
        if (n3 >= n4) {
            return;
        }
        int n5 = (n2 - this.k) * this.n + (n3 - this.j);
        int n6 = n5 >> 5;
        int n7 = n5 + n4 - n3;
        int n8 = n7 >> 5;
        if (n6 == n8) {
            int n9 = n6;
            this.p[n9] = this.p[n9] | (1 << (n7 & 0x1F)) - 1 ^ (1 << (n5 & 0x1F)) - 1;
        } else {
            int n10 = n6;
            this.p[n10] = this.p[n10] | -(1 << (n5 & 0x1F));
            int n11 = n8;
            this.p[n11] = this.p[n11] | (1 << (n7 & 0x1F)) - 1;
            for (int i2 = n6 + 1; i2 < n8; ++i2) {
                this.p[i2] = -1;
            }
        }
    }

    private void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        int n9;
        if (n3 > n5) {
            n9 = n3;
            n8 = n2;
            n3 = n5;
            n5 = n9;
            n2 = n4;
            n4 = n8;
        }
        if (n5 > n7) {
            n9 = n5;
            n8 = n4;
            n5 = n7;
            n7 = n9;
            n4 = n6;
            n6 = n8;
        }
        if (n3 > n5) {
            n9 = n3;
            n8 = n2;
            n3 = n5;
            n5 = n9;
            n2 = n4;
            n4 = n8;
        }
        if (n3 > this.i) {
            return;
        }
        n9 = 0;
        if (n3 != n5) {
            n9 = (n4 - n2 << 14) / (n5 - n3);
        }
        n8 = 0;
        if (n7 != n5) {
            n8 = (n6 - n4 << 14) / (n7 - n5);
        }
        int n10 = 0;
        if (n3 != n7) {
            n10 = (n2 - n6 << 14) / (n3 - n7);
        }
        if (n5 > this.i) {
            n5 = this.i;
        }
        if (n7 > this.i) {
            n7 = this.i;
        }
        if (n3 == n7 || n7 < this.g) {
            return;
        }
        n4 <<= 14;
        n6 = n2 <<= 14;
        if (n3 < this.g) {
            n6 -= (n3 - this.g) * n10;
            n2 -= (n3 - this.g) * n9;
            n3 = this.g;
        }
        if (n5 < this.g) {
            n4 -= (n5 - this.g) * n8;
            n5 = this.g;
        }
        int n11 = n3;
        int n12 = n5 - n3;
        int n13 = n7 - n5;
        if (n3 != n5 && n10 < n9 || n3 == n5 && n10 > n8) {
            while (n12-- > 0) {
                this.b(n11, n6 >> 14, n2 >> 14);
                n6 += n10;
                n2 += n9;
                ++n11;
            }
            while (n13-- > 0) {
                this.b(n11, n6 >> 14, n4 >> 14);
                n6 += n10;
                n4 += n8;
                ++n11;
            }
        } else {
            while (n12-- > 0) {
                this.b(n11, n2 >> 14, n6 >> 14);
                n2 += n9;
                n6 += n10;
                ++n11;
            }
            while (n13-- > 0) {
                this.b(n11, n4 >> 14, n6 >> 14);
                n6 += n10;
                n4 += n8;
                ++n11;
            }
        }
    }

    private boolean a(rs.a.h h2, int n2, int n3, int n4, int n5) {
        int n6 = h2.z();
        rs.runelite.a.h.a(n6, n2, n3, n4, n5, h2.A(), h2.C(), h2.B(), this.d, this.e);
        boolean bl = false;
        for (int i2 = 0; i2 < n6; ++i2) {
            int n7 = this.d[i2];
            int n8 = this.e[i2];
            if (n8 != Integer.MIN_VALUE) {
                boolean bl2 = n7 >= this.f && n7 < this.h;
                boolean bl3 = n8 >= this.g && n8 < this.i;
                bl |= bl2 && bl3;
                this.j = Math.min(this.j, n7);
                this.l = Math.max(this.l, n7 + 1);
                this.k = Math.min(this.k, n8);
                this.m = Math.max(this.m, n8 + 1);
                continue;
            }
            this.e[i2] = Integer.MIN_VALUE;
        }
        return bl;
    }

    private void a(rs.a.h h2) {
        int n2 = h2.G();
        int[] nArray = h2.D();
        int[] nArray2 = h2.E();
        int[] nArray3 = h2.F();
        int[] nArray4 = h2.H();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            if (this.e[nArray[i2]] == Integer.MIN_VALUE || this.e[nArray2[i2]] == Integer.MIN_VALUE || this.e[nArray3[i2]] == Integer.MIN_VALUE || nArray4 != null && (nArray4[i2] & 0xFF) >= 254 || rs.ui.b.b.a(n11 = this.d[n10 = nArray[i2]], n9 = this.e[n10], n8 = this.d[n7 = nArray2[i2]], n6 = this.e[n7], n5 = this.d[n4 = nArray3[i2]], n3 = this.e[n4])) continue;
            this.b(n11, n9, n8, n6, n5, n3);
        }
    }

    private void a(int[] nArray, int n2, int n3, int n4, a[] aArray, int n5) {
        for (a a2 : aArray) {
            int n6 = n3 + a2.a;
            int n7 = n4 + a2.b;
            int n8 = (n7 - this.k) * this.n + (n6 - this.j);
            if (n6 < this.f || n6 >= this.h || n7 < this.g || n7 >= this.i || (this.p[n8 >> 5] & 1 << (n8 & 0x1F)) != 0) continue;
            nArray[n7 * n2 + n6] = n5;
        }
    }

    private void a(boolean bl, Color color, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        BufferedImage bufferedImage = Launcher.n().o().gZ.e;
        int n9 = bufferedImage.getWidth();
        int[] nArray = ((DataBufferInt)bufferedImage.getRaster().getDataBuffer()).getData();
        int n10 = color.getRGB();
        for (n8 = 0; n8 < this.n; n8 += 32) {
            n7 = this.p[n8 >> 5];
            for (n6 = 1; n6 < this.o; ++n6) {
                n5 = this.p[n6 * this.n + n8 >> 5];
                if (n7 != n5) {
                    if (bl) {
                        if (n2 == 1) {
                            for (n4 = 0; n4 < 32; ++n4) {
                                int n11 = n7 >>> n4 & 1;
                                n3 = n5 >>> n4 & 1;
                                if (n11 == n3) continue;
                                nArray[(this.k + n6 - n3) * n9 + (this.j + n8 + n4)] = n10;
                            }
                        } else {
                            a[] aArray = this.w[n2][3];
                            a[] aArray2 = this.w[n2][1];
                            for (n3 = 0; n3 < 32; ++n3) {
                                int n12 = n7 >>> n3 & 1;
                                int n13 = n5 >>> n3 & 1;
                                if (n12 == 1 && n13 == 0) {
                                    this.a(nArray, n9, this.j + n8 + n3, this.k + n6 - 1, aArray, n10);
                                    continue;
                                }
                                if (n12 != 0 || n13 != 1) continue;
                                this.a(nArray, n9, this.j + n8 + n3, this.k + n6, aArray2, n10);
                            }
                        }
                    } else {
                        for (n4 = 0; n4 < 32; ++n4) {
                            int n14 = n7 >>> n4 & 1;
                            n3 = n5 >>> n4 & 1;
                            if (n14 == n3) continue;
                            this.a(this.u, this.j + n8 + n4, this.k + n6 - n3);
                        }
                    }
                }
                n7 = n5;
            }
        }
        for (n8 = 0; n8 < this.o; ++n8) {
            n7 = n8 * this.n;
            n6 = 0;
            for (n5 = 0; n5 < this.n; n5 += 32) {
                n4 = this.p[n7 + n5 >> 5];
                if (n4 != 0 && n4 != -1) {
                    int n15 = Math.min(32, this.h - this.j - n5);
                    n3 = n4 & 1;
                    if (bl) {
                        if (n2 == 1) {
                            for (int i2 = 1; i2 < n15; ++i2) {
                                int n16 = n4 >>> i2 & 1;
                                if (n16 != n3) {
                                    nArray[(this.k + n8) * n9 + (this.j + n5 + i2 - n16)] = n10;
                                }
                                n3 = n16;
                            }
                        } else {
                            a[] aArray = this.w[n2][0];
                            a[] aArray3 = this.w[n2][2];
                            for (int i3 = 1; i3 < n15; ++i3) {
                                int n17 = n4 >>> i3 & 1;
                                if (n17 == 1 && n3 == 0) {
                                    this.a(nArray, n9, this.j + n5 + i3, this.k + n8, aArray3, n10);
                                } else if (n17 == 0 && n3 == 1) {
                                    this.a(nArray, n9, this.j + n5 + i3 - 1, this.k + n8, aArray, n10);
                                }
                                n3 = n17;
                            }
                        }
                    } else {
                        for (int i4 = 1; i4 < n15; ++i4) {
                            int n18 = n4 >>> i4 & 1;
                            if (n18 != n3) {
                                this.a(1, this.j + n5 + i4 - n18, this.k + n8);
                            }
                            n3 = n18;
                        }
                    }
                }
                if (n6 >>> 31 != (n4 & 1) && n5 > 0) {
                    if (bl) {
                        if (n2 == 1) {
                            nArray[(this.k + n8) * n9 + (this.j + n5 - (n4 & 1))] = n10;
                        } else if ((n4 & 1) == 1) {
                            a[] aArray = this.w[n2][2];
                            this.a(nArray, n9, this.j + n5, this.k + n8, aArray, n10);
                        } else {
                            a[] aArray = this.w[n2][0];
                            this.a(nArray, n9, this.j + n5 - 1, this.k + n8, aArray, n10);
                        }
                    } else {
                        this.a(1, this.j + n5 - (n4 & 1), this.k + n8);
                    }
                }
                n6 = n4;
            }
        }
    }

    private void a(int n2, Color color, int n3) {
        b[] bArray;
        BufferedImage bufferedImage = Launcher.n().o().gZ.e;
        int n4 = bufferedImage.getWidth();
        int[] nArray = ((DataBufferInt)bufferedImage.getRaster().getDataBuffer()).getData();
        for (b b2 : bArray = this.a(n2, n3)) {
            int[] nArray2 = this.q.a();
            int n5 = (int)Math.round((double)color.getAlpha() * b2.c);
            int n6 = 256 - n5;
            int n7 = n5 << 24 | color.getRed() * n5 / 255 << 16 | color.getGreen() * n5 / 255 << 8 | color.getBlue() * n5 / 255;
            n5 = b2.b;
            int n8 = n5 + this.u;
            int n9 = n5 + 1;
            while (this.s[n5] > 0) {
                int n10 = this.r[n5][this.s[n5] - 1];
                int n11 = n10 << 10;
                int n12 = n11 + this.t[n5];
                for (int i2 = n11; i2 < n12; ++i2) {
                    int n13 = nArray2[i2] >>> 16;
                    int n14 = nArray2[i2] & 0xFFFF;
                    int n15 = (n13 - this.k) * this.n + (n14 - this.j);
                    if ((this.p[n15 >> 5] & 1 << (n15 & 0x1F)) != 0) continue;
                    int n16 = n15 >> 5;
                    this.p[n16] = this.p[n16] | 1 << (n15 & 0x1F);
                    int n17 = n13 * n4 + n14;
                    int n18 = nArray[n17];
                    nArray[n17] = (n7 & 0xFF00FF00) + ((n18 & 0xFF00FF00) * n6 >>> 8) & 0xFF00FF00 | (n7 & 0xFF00FF) + ((n18 & 0xFF00FF) * n6 >>> 8) & 0xFF00FF;
                    if (n14 - 1 >= this.f) {
                        this.a(n9, n14 - 1, n13);
                    }
                    if (n14 + 1 < this.h) {
                        this.a(n9, n14 + 1, n13);
                    }
                    if (n13 - 1 >= this.g) {
                        this.a(n8, n14, n13 - 1);
                    }
                    if (n13 + 1 >= this.i) continue;
                    this.a(n8, n14, n13 + 1);
                }
                this.q.a(n10);
                int n19 = n5;
                this.s[n19] = this.s[n19] - 1;
                this.t[n5] = 1024;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(rs.a.h h2, int n2, int n3, int n4, int n5, int n6, Color color, int n7) {
        boolean bl;
        if (n6 <= 0 || color.getAlpha() == 0 || h2 == null) {
            return;
        }
        if (n6 > 50) {
            n6 = 50;
        }
        if (n7 < 0) {
            n7 = 0;
        } else if (n7 > 4) {
            n7 = 4;
        }
        this.j = Integer.MAX_VALUE;
        this.l = Integer.MIN_VALUE;
        this.k = Integer.MAX_VALUE;
        this.m = Integer.MIN_VALUE;
        this.f = Launcher.n().o().ag();
        this.g = Launcher.n().o().ah();
        this.h = Launcher.n().o().at() + this.f;
        this.i = Launcher.n().o().as() + this.g;
        if (!this.a(h2, n2, n3, n4, n5)) {
            return;
        }
        this.j = Math.max(this.j - n6, this.f);
        this.l = Math.min(this.l + n6, this.h);
        this.l += ~(this.l - this.j - 1) & 0x1F;
        this.k = Math.max(this.k - n6, this.g);
        this.m = Math.min(this.m + n6, this.i);
        this.n = this.l - this.j;
        this.o = this.m - this.k;
        this.c(this.n * this.o);
        this.a(h2);
        boolean bl2 = bl = color.getAlpha() == 255 && n6 <= 10 && (n7 == 0 || n6 == 1);
        if (bl) {
            this.b(n6);
        } else {
            this.u = n6 + 2;
            this.b();
        }
        try {
            this.a(bl, color, n6);
            if (!bl) {
                this.a(n6, color, n7);
            }
        }
        finally {
            this.c();
        }
    }

    public void a(j j2, int n2, Color color, int n3) {
        f f2;
        byte by = 1;
        d d2 = j2.aG;
        if (d2 != null) {
            by = d2.r;
        }
        if ((f2 = new f(j2.ac, j2.ad)) != null) {
            this.a(j2.c(), f2.b(), f2.c(), rs.runelite.a.h.d(f2, Client.dw), j2.ae, n2, color, n3);
        }
    }

    public void a(k k2, int n2, Color color, int n3) {
        f f2 = new f(k2.ac, k2.ad);
        if (f2 != null) {
            this.a(k2.c(), f2.b(), f2.c(), rs.runelite.a.h.d(f2, Client.dw), k2.ae, n2, color, n3);
        }
    }

    public void a(c c2, int n2, Color color, int n3) {
        if (c2 instanceof j) {
            this.a((j)c2, n2, color, n3);
        } else if (c2 instanceof k) {
            this.a((k)c2, n2, color, n3);
        }
    }

    private void a(l l2, int n2, Color color, int n3) {
        rs.a.a a2 = l2.a();
        if (a2 != null) {
            rs.a.h h2;
            rs.a.h h3 = h2 = a2 instanceof rs.a.h ? (rs.a.h)a2 : a2.c();
            if (h2 != null) {
                this.a(h2, l2.n, l2.o, l2.c, l2.e, n2, color, n3);
            }
        }
    }

    private void a(m m2, int n2, Color color, int n3) {
        rs.a.a a2 = m2.a();
        if (a2 != null) {
            rs.a.h h2;
            rs.a.h h3 = h2 = a2 instanceof rs.a.h ? (rs.a.h)a2 : a2.c();
            if (h2 != null) {
                this.a(h2, m2.n, m2.o, m2.b, 0, n2, color, n3);
            }
        }
    }

    private void a(u_0 u_02, int n2, Color color, int n3) {
        rs.a.a a2;
        rs.a.a a3 = u_02.a();
        if (a3 != null) {
            rs.a.a a4 = a2 = a3 instanceof rs.a.h ? (rs.a.h)a3 : a3.c();
            if (a2 != null) {
                this.a((rs.a.h)a2, u_02.n, u_02.o, u_02.c, 0, n2, color, n3);
            }
        }
        if ((a2 = u_02.b()) != null) {
            rs.a.h h2;
            rs.a.h h3 = h2 = a2 instanceof rs.a.h ? (rs.a.h)a2 : a2.c();
            if (h2 != null) {
                this.a(h2, u_02.n, u_02.o, u_02.c, 0, n2, color, n3);
            }
        }
    }

    private void a(t_0 t_02, int n2, Color color, int n3) {
        rs.a.a a2 = t_02.a();
        if (a2 != null) {
            rs.a.h h2;
            rs.a.h h3 = h2 = a2 instanceof rs.a.h ? (rs.a.h)a2 : a2.c();
            if (h2 != null) {
                this.a(h2, t_02.n, t_02.o, t_02.b, t_02.d, n2, color, n3);
            }
        }
    }

    public void a(q_0 q_02, int n2, Color color, int n3) {
        if (q_02 instanceof l) {
            this.a((l)q_02, n2, color, n3);
        } else if (q_02 instanceof m) {
            this.a((m)q_02, n2, color, n3);
        } else if (q_02 instanceof t_0) {
            this.a((t_0)q_02, n2, color, n3);
        } else if (q_02 instanceof u_0) {
            this.a((u_0)q_02, n2, color, n3);
        }
    }

    private static class b {
        private final double a;
        private final int b;
        private final double c;

        public b(double d2, int n2, double d3) {
            this.a = d2;
            this.b = n2;
            this.c = d3;
        }

        private double a() {
            return this.a;
        }
    }

    private static class a {
        private final int a;
        private final int b;

        public a(int n2, int n3) {
            this.a = n2;
            this.b = n3;
        }
    }
}

