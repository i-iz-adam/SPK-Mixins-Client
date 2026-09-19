/*
 * Decompiled with CFR 0.152.
 */
package rs.u;

import rs.u.a;
import rs.u.f;
import rs.u.h;
import rs.u.i;
import rs.x.e;

public class g {
    boolean a;
    boolean b;
    boolean c = true;
    boolean d;
    i e;
    i f;
    a[] g;
    float h;
    float i;
    float j;
    float k;
    float[] l = new float[4];
    float[] m = new float[4];
    float[] n;
    int o = 0;
    int p;
    int q;

    public int a(e e2, int n2) {
        int n3;
        int n4 = e2.o();
        e2.y();
        this.f = rs.u.i.a(e2.y());
        this.e = rs.u.i.a(e2.y());
        this.b = e2.y() != 0;
        this.g = new a[n4];
        a a2 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            a a3 = new a();
            a3.a(e2, n2);
            this.g[n3] = a3;
            if (null != a2) {
                a2.a = a3;
            }
            a2 = a3;
        }
        this.p = this.g[0].g;
        this.q = this.g[this.d() - 1].g;
        this.n = new float[this.c() + 1];
        for (n3 = this.a(); n3 <= this.b(); ++n3) {
            this.n[n3 - this.a()] = rs.u.g.a(this, (float)n3);
        }
        this.g = null;
        this.j = rs.u.g.a(this, (float)(this.a() - 1));
        this.k = rs.u.g.a(this, (float)(this.b() + 1));
        return n4;
    }

    public float a(int n2) {
        if (n2 < this.a()) {
            return this.j;
        }
        return n2 > this.b() ? this.k : this.n[n2 - this.a()];
    }

    int a() {
        return this.p;
    }

    int b() {
        return this.q;
    }

    int c() {
        return this.b() - this.a();
    }

    int a(float f2) {
        if (this.o >= 0 && (float)this.g[this.o].g <= f2 && (null == this.g[this.o].a || (float)this.g[this.o].a.g > f2)) {
            return this.o;
        }
        if (!(f2 < (float)this.a()) && !(f2 > (float)this.b())) {
            int n2 = this.d();
            int n3 = this.o;
            if (n2 > 0) {
                int n4 = 0;
                int n5 = n2 - 1;
                do {
                    int n6 = n5 + n4 >> 1;
                    if (f2 < (float)this.g[n6].g) {
                        if (f2 > (float)this.g[n6 - 1].g) {
                            n3 = n6 - 1;
                            break;
                        }
                        n5 = n6 - 1;
                        continue;
                    }
                    if (!(f2 > (float)this.g[n6].g)) {
                        n3 = n6;
                        break;
                    }
                    if (f2 < (float)this.g[n6 + 1].g) {
                        n3 = n6;
                        break;
                    }
                    n4 = n6 + 1;
                } while (n4 <= n5);
            }
            if (n3 != this.o) {
                this.o = n3;
                this.c = true;
            }
            return this.o;
        }
        return -1;
    }

    a b(float f2) {
        int n2 = this.a(f2);
        return n2 >= 0 && n2 < this.g.length ? this.g[n2] : null;
    }

    int d() {
        return this.g == null ? 0 : this.g.length;
    }

    static float a(g g2, float f2) {
        if (g2 == null || g2.d() == 0) {
            return 0.0f;
        }
        if (f2 < (float)g2.g[0].g) {
            return rs.u.i.a == g2.f ? g2.g[0].b : rs.u.g.a(g2, f2, true);
        }
        if (f2 > (float)g2.g[g2.d() - 1].g) {
            return g2.e == rs.u.i.a ? g2.g[g2.d() - 1].b : rs.u.g.a(g2, f2, false);
        }
        if (g2.a) {
            return g2.g[0].b;
        }
        a a2 = g2.b(f2);
        boolean bl = false;
        boolean bl2 = false;
        if (null == a2) {
            return 0.0f;
        }
        if ((double)a2.e == 0.0 && 0.0 == (double)a2.f) {
            bl = true;
        } else if (Float.MAX_VALUE == a2.e && Float.MAX_VALUE == a2.f) {
            bl2 = true;
        } else if (a2.a == null) {
            bl = true;
        } else if (g2.c) {
            float[] fArray = new float[4];
            float[] fArray2 = new float[4];
            fArray[0] = a2.g;
            fArray2[0] = a2.b;
            fArray[1] = fArray[0] + 0.33333334f * a2.e;
            fArray2[1] = 0.33333334f * a2.f + fArray2[0];
            fArray[3] = a2.a.g;
            fArray2[3] = a2.a.b;
            fArray[2] = fArray[3] - a2.a.d * 0.33333334f;
            fArray2[2] = fArray2[3] - a2.a.c * 0.33333334f;
            if (g2.b) {
                rs.u.g.b(g2, fArray, fArray2);
            } else {
                rs.u.g.a(g2, fArray, fArray2);
            }
            g2.c = false;
        }
        if (bl) {
            return a2.b;
        }
        if (bl2) {
            return (float)a2.g != f2 && a2.a != null ? a2.a.b : a2.b;
        }
        return g2.b ? rs.u.g.c(g2, f2) : rs.u.g.b(g2, f2);
    }

    private static void b(g g2, float[] fArray, float[] fArray2) {
        float f2;
        if (null != g2 && (double)(f2 = fArray[3] - fArray[0]) != 0.0) {
            float f3 = fArray[1] - fArray[0];
            float f4 = fArray[2] - fArray[0];
            Float f5 = Float.valueOf(f3 / f2);
            Float f6 = Float.valueOf(f4 / f2);
            g2.d = f5.floatValue() == 0.33333334f && f6.floatValue() == 0.6666667f;
            float f7 = f5.floatValue();
            float f8 = f6.floatValue();
            if ((double)f5.floatValue() < 0.0) {
                f5 = Float.valueOf(0.0f);
            }
            if ((double)f6.floatValue() > 1.0) {
                f6 = Float.valueOf(1.0f);
            }
            if ((double)f5.floatValue() > 1.0 || f6.floatValue() < -1.0f) {
                float f9;
                Float f10 = f5;
                Float f11 = Float.valueOf(1.0f - f6.floatValue());
                if (f5.floatValue() < 0.0f) {
                    f10 = Float.valueOf(0.0f);
                }
                if (f11.floatValue() < 0.0f) {
                    f11 = Float.valueOf(0.0f);
                }
                if ((f10.floatValue() > 1.0f || f11.floatValue() > 1.0f) && rs.u.f.a + (f9 = (float)((double)(f10.floatValue() * (f10.floatValue() - 2.0f + f11.floatValue())) + (double)f11.floatValue() * ((double)f11.floatValue() - 2.0) + 1.0)) > 0.0f) {
                    float[] fArray3 = rs.u.g.a(f10.floatValue(), f11.floatValue());
                    f10 = Float.valueOf(fArray3[0]);
                    f11 = Float.valueOf(fArray3[1]);
                }
                f11 = Float.valueOf(1.0f - f11.floatValue());
                f5 = f10;
                f6 = f11;
            }
            if (f5.floatValue() != f7) {
                fArray[1] = fArray[0] + f5.floatValue() * f2;
                if (0.0 != (double)f7) {
                    fArray2[1] = fArray2[0] + (fArray2[1] - fArray2[0]) * f5.floatValue() / f7;
                }
            }
            if (f6.floatValue() != f8) {
                fArray[2] = fArray[0] + f6.floatValue() * f2;
                if ((double)f8 != 1.0) {
                    fArray2[2] = (float)((double)fArray2[3] - (double)(fArray2[3] - fArray2[2]) * (1.0 - (double)f6.floatValue()) / (1.0 - (double)f8));
                }
            }
            g2.h = fArray[0];
            g2.i = fArray[3];
            float f12 = f5.floatValue();
            float f13 = f6.floatValue();
            float[] fArray4 = g2.l;
            float f14 = f12 - 0.0f;
            float f15 = f13 - f12;
            float f16 = 1.0f - f13;
            float f17 = f15 - f14;
            fArray4[3] = f16 - f15 - f17;
            fArray4[2] = f17 + f17 + f17;
            fArray4[1] = f14 + f14 + f14;
            fArray4[0] = 0.0f;
            float f18 = fArray2[0];
            float f19 = fArray2[1];
            float f20 = fArray2[2];
            float f21 = fArray2[3];
            float[] fArray5 = g2.m;
            float f22 = f19 - f18;
            float f23 = f20 - f19;
            float f24 = f21 - f20;
            float f25 = f23 - f22;
            fArray5[3] = f24 - f23 - f25;
            fArray5[2] = f25 + f25 + f25;
            fArray5[1] = f22 + f22 + f22;
            fArray5[0] = f18;
        }
    }

    static float a(g g2, float f2, boolean bl) {
        if (g2 == null || g2.d() == 0) {
            return 0.0f;
        }
        float f3 = g2.g[g2.d() - 1].g;
        float f4 = g2.g[0].g;
        float f5 = f3 - f4;
        if ((double)f5 == 0.0) {
            return g2.g[0].b;
        }
        float f6 = 0.0f;
        f6 = f2 > f3 ? (f2 - f3) / f5 : (f2 - f4) / f5;
        double d2 = (int)f6;
        float f7 = Math.abs((float)((double)f6 - d2));
        float f8 = f5 * f7;
        double d3 = Math.abs(d2 + 1.0);
        double d4 = d3 / 2.0;
        double d5 = (int)d4;
        float f9 = (float)(d4 - d5);
        if (bl) {
            if (g2.f == rs.u.i.c) {
                f8 = (double)f9 == 0.0 ? f3 - f8 : (f8 += f4);
            } else if (rs.u.i.e == g2.f || rs.u.i.d == g2.f) {
                f8 = f3 - f8;
            } else if (g2.f == rs.u.i.b) {
                f8 = f4 - f2;
                float f10 = g2.g[0].d;
                float f11 = g2.g[0].c;
                float f12 = g2.g[0].b;
                if ((double)f10 != 0.0) {
                    f12 -= f8 * f11 / f10;
                }
                return f12;
            }
        } else if (rs.u.i.c == g2.e) {
            f8 = (double)f9 == 0.0 ? (f8 += f4) : f3 - f8;
        } else if (rs.u.i.e == g2.e || rs.u.i.d == g2.e) {
            f8 += f4;
        } else if (rs.u.i.b == g2.e) {
            f8 = f2 - f3;
            float f13 = g2.g[g2.d() - 1].e;
            float f14 = g2.g[g2.d() - 1].f;
            float f15 = g2.g[g2.d() - 1].b;
            if (0.0 != (double)f13) {
                f15 += f8 * f14 / f13;
            }
            return f15;
        }
        float f16 = rs.u.g.a(g2, f8);
        if (bl && rs.u.i.d == g2.f) {
            float f17 = g2.g[g2.d() - 1].b - g2.g[0].b;
            f16 = (float)((double)f16 - (double)f17 * d3);
        } else if (!bl && rs.u.i.d == g2.e) {
            float f18 = g2.g[g2.d() - 1].b - g2.g[0].b;
            f16 = (float)((double)f16 + d3 * (double)f18);
        }
        return f16;
    }

    static void a(g g2, float[] fArray, float[] fArray2) {
        if (g2 != null) {
            g2.h = fArray[0];
            float f2 = fArray[3] - fArray[0];
            float f3 = fArray2[3] - fArray2[0];
            float f4 = fArray[1] - fArray[0];
            float f5 = 0.0f;
            float f6 = 0.0f;
            if ((double)f4 != 0.0) {
                f5 = (fArray2[1] - fArray2[0]) / f4;
            }
            if (0.0 != (double)(f4 = fArray[3] - fArray[2])) {
                f6 = (fArray2[3] - fArray2[2]) / f4;
            }
            float f7 = 1.0f / (f2 * f2);
            float f8 = f2 * f5;
            float f9 = f6 * f2;
            g2.l[0] = f7 * (f9 + f8 - f3 - f3) / f2;
            g2.l[1] = f7 * (f3 + f3 + f3 - f8 - f8 - f9);
            g2.l[2] = f5;
            g2.l[3] = fArray2[0];
        }
    }

    static float b(g g2, float f2) {
        if (g2 == null) {
            return 0.0f;
        }
        float f3 = f2 - g2.h;
        return g2.l[3] + (g2.l[2] + (f3 * g2.l[0] + g2.l[1]) * f3) * f3;
    }

    static float c(g g2, float f2) {
        float[] fArray;
        float[] fArray2;
        int n2;
        if (g2 == null) {
            return 0.0f;
        }
        float f3 = g2.h == f2 ? 0.0f : (g2.i == f2 ? 1.0f : (f2 - g2.h) / (g2.i - g2.h));
        float f4 = g2.d ? f3 : ((n2 = rs.u.g.a(fArray2 = new float[]{g2.l[0] - f3, g2.l[1], g2.l[2], g2.l[3]}, 3, 0.0f, true, 1.0f, true, fArray = new float[5])) == 1 ? fArray[0] : 0.0f);
        return f4 * (g2.m[1] + f4 * (g2.m[2] + f4 * g2.m[3])) + g2.m[0];
    }

    public static int a(float[] fArray, int n2, float f2, boolean bl, float f3, boolean bl2, float[] fArray2) {
        float[] fArray3;
        int n3;
        float f4 = 0.0f;
        for (int i2 = 0; i2 < 1 + n2; ++i2) {
            f4 += Math.abs(fArray[i2]);
        }
        float f5 = (Math.abs(f2) + Math.abs(f3)) * (float)(n2 + 1) * rs.u.f.a;
        if (f4 <= f5) {
            return -1;
        }
        float[] fArray4 = new float[n2 + 1];
        for (n3 = 0; n3 < n2 + 1; ++n3) {
            fArray4[n3] = fArray[n3] * (1.0f / f4);
        }
        while (Math.abs(fArray4[n2]) < f5) {
            --n2;
        }
        n3 = 0;
        if (n2 == 0) {
            return n3;
        }
        if (n2 == 1) {
            boolean bl3;
            fArray2[0] = -fArray4[0] / fArray4[1];
            boolean bl4 = bl ? f2 < fArray2[0] + f5 : (bl3 = f2 < fArray2[0] - f5);
            boolean bl5 = bl2 ? f3 > fArray2[0] - f5 : f3 > fArray2[0] + f5;
            int n4 = n3 = bl3 && bl5 ? 1 : 0;
            if (n3 > 0) {
                if (bl && fArray2[0] < f2) {
                    fArray2[0] = f2;
                } else if (bl2 && fArray2[0] > f3) {
                    fArray2[0] = f3;
                }
            }
            return n3;
        }
        h h2 = new h(fArray4, n2);
        float[] fArray5 = rs.u.h.a(n2, fArray4);
        int n5 = rs.u.g.a(fArray5, n2 - 1, f2, false, f3, false, fArray3 = new float[n2 + 1]);
        if (n5 == -1) {
            return 0;
        }
        boolean bl6 = false;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i3 = 0; i3 <= n5; ++i3) {
            float f9;
            if (n3 > n2) {
                return n3;
            }
            if (i3 == 0) {
                f9 = f2;
                f7 = rs.u.h.a(fArray4, n2, f2);
                if (Math.abs(f7) <= f5 && bl) {
                    fArray2[n3++] = f2;
                }
            } else {
                f9 = f8;
                f7 = f6;
            }
            if (i3 == n5) {
                f8 = f3;
                bl6 = false;
            } else {
                f8 = fArray3[i3];
            }
            f6 = rs.u.h.a(fArray4, n2, f8);
            if (bl6) {
                bl6 = false;
                continue;
            }
            if (Math.abs(f6) < f5) {
                if (i3 == n5 && !bl2) continue;
                fArray2[n3++] = f8;
                bl6 = true;
                continue;
            }
            if (!(f7 < 0.0f && f6 > 0.0f) && (!(f7 > 0.0f) || !(f6 < 0.0f))) continue;
            fArray2[n3++] = rs.u.g.a(h2, f9, f8, 0.0f);
            if (n3 <= 1 || !(fArray2[n3 - 2] >= fArray2[n3 - 1] - f5)) continue;
            fArray2[n3 - 2] = 0.5f * (fArray2[n3 - 1] + fArray2[n3 - 2]);
            --n3;
        }
        return n3;
    }

    public static float a(h h2, float f2, float f3, float f4) {
        float f5 = rs.u.h.a(h2.a, h2.b, f2);
        if (Math.abs(f5) < rs.u.f.a) {
            return f2;
        }
        float f6 = rs.u.h.a(h2.a, h2.b, f3);
        if (Math.abs(f6) < rs.u.f.a) {
            return f3;
        }
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        boolean bl = true;
        boolean bl2 = false;
        do {
            boolean bl3;
            bl2 = false;
            if (bl) {
                f7 = f2;
                f10 = f5;
                f9 = f8 = f3 - f2;
                bl = false;
            }
            if (Math.abs(f10) < Math.abs(f6)) {
                f2 = f3;
                f3 = f7;
                f7 = f2;
                f5 = f6;
                f6 = f10;
                f10 = f5;
            }
            float f11 = rs.u.f.b * Math.abs(f3) + f4 * 0.5f;
            float f12 = 0.5f * (f7 - f3);
            boolean bl4 = bl3 = Math.abs(f12) > f11 && 0.0f != f6;
            if (!bl3) continue;
            if (Math.abs(f9) < f11 || Math.abs(f5) <= Math.abs(f6)) {
                f8 = f12;
                f9 = f12;
            } else {
                float f13;
                float f14;
                float f15 = f6 / f5;
                if (f7 == f2) {
                    f14 = f12 * 2.0f * f15;
                    f13 = 1.0f - f15;
                } else {
                    f13 = f5 / f10;
                    float f16 = f6 / f10;
                    f14 = f15 * (f13 * f12 * 2.0f * (f13 - f16) - (f3 - f2) * (f16 - 1.0f));
                    f13 = (f15 - 1.0f) * (f16 - 1.0f) * (f13 - 1.0f);
                }
                if ((double)f14 > 0.0) {
                    f13 = -f13;
                } else {
                    f14 = -f14;
                }
                f15 = f9;
                f9 = f8;
                if (2.0f * f14 < f13 * f12 * 3.0f - Math.abs(f11 * f13) && f14 < Math.abs(f13 * f15 * 0.5f)) {
                    f8 = f14 / f13;
                } else {
                    f8 = f12;
                    f9 = f12;
                }
            }
            f2 = f3;
            f5 = f6;
            f3 = Math.abs(f8) > f11 ? (f3 += f8) : ((double)f12 > 0.0 ? (f3 += f11) : (f3 -= f11));
            f6 = rs.u.h.a(h2.a, h2.b, f3);
            if ((double)(f6 * (f10 / Math.abs(f10))) > 0.0) {
                bl = true;
                bl2 = true;
                continue;
            }
            bl2 = true;
        } while (bl2);
        return f3;
    }

    public static float[] a(float f2, float f3) {
        if (f2 + rs.u.f.a < 1.3333334f) {
            float f4 = f2 - 2.0f;
            float f5 = f2 - 1.0f;
            float f6 = (float)Math.sqrt(f4 * f4 - f5 * f5 * 4.0f);
            float f7 = 0.5f * (f6 + -f4);
            if (f3 + rs.u.f.a > f7) {
                f3 = f7 - rs.u.f.a;
            } else {
                f7 = 0.5f * (-f4 - f6);
                if (f3 < f7 + rs.u.f.a) {
                    f3 = rs.u.f.a + f7;
                }
            }
        } else {
            f2 = 1.3333334f - rs.u.f.a;
            f3 = 0.33333334f - rs.u.f.a;
        }
        return new float[]{f2, f3};
    }
}

