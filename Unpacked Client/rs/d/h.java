/*
 * Decompiled with CFR 0.152.
 */
package rs.d;

import java.awt.Color;
import java.io.File;
import rs.Client;
import rs.f.a;
import rs.x.e;
import rs.x.f;

public final class h {
    public static a a = rs.d.h$a.a;
    public static h[] b;
    public int c;
    public int d = -1;
    public boolean e = true;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public static void a(a a2) {
        e e2 = null;
        a = a2;
        switch (a2) {
            case a: {
                e2 = new e(Client.a(rs.v.a.f() + "flo.dat"));
                break;
            }
            case b: {
                e2 = new e(Client.a(rs.v.a.f() + "osrs_flo.dat"));
                break;
            }
            case c: {
                e2 = new e(Client.a(rs.v.a.f() + "osrs_config" + File.separator + "flo.dat"));
            }
        }
        int n2 = e2.A();
        if (b == null || b.length != n2) {
            b = new h[n2];
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (b[i2] == null) {
                rs.d.h.b[i2] = new h();
            }
            b[i2].a(e2);
        }
    }

    public static void a(f f2) {
        e e2 = null;
        e2 = new e(Client.a(rs.v.a.f() + "flo.dat"));
        int n2 = e2.A();
        if (b == null) {
            b = new h[n2];
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (b[i2] == null) {
                rs.d.h.b[i2] = new h();
            }
            b[i2].a(e2);
        }
    }

    private boolean a(e e2) {
        int n2;
        while ((n2 = e2.y()) != 0) {
            int n3;
            if (n2 == 1) {
                this.c = e2.C();
                if (rs.f.a.r != a.b.a) {
                    Color color = Color.decode("" + this.c);
                    n3 = 10;
                    if (Math.abs(color.getGreen() - color.getRed()) > n3 || Math.abs(color.getRed() - color.getBlue()) > n3 || Math.abs(color.getGreen() - color.getBlue()) > n3) {
                        if (rs.f.a.r == a.b.c && color.getGreen() > 50) {
                            this.c = 0x222922;
                        }
                        if (color.getGreen() > 100) {
                            this.c = rs.f.a.r.f;
                        }
                    }
                }
                this.a(this.c);
                continue;
            }
            if (n2 == 2) {
                this.d = e2.y();
                continue;
            }
            if (n2 == 3) {
                boolean bl = true;
                continue;
            }
            if (n2 == 5) {
                this.e = false;
                continue;
            }
            if (n2 == 6) {
                e2.F();
                continue;
            }
            if (n2 == 7) {
                int n4 = this.f;
                n3 = this.g;
                int n5 = this.h;
                int n6 = this.i;
                int n7 = e2.C();
                this.a(n7);
                this.f = n4;
                this.g = n3;
                this.h = n5;
                this.i = n6;
                this.j = n6;
                continue;
            }
            System.out.println("[FLO] Error unrecognised config code: " + n2);
        }
        return true;
    }

    private void a(int n2) {
        double d2;
        double d3 = (double)(n2 >> 16 & 0xFF) / 256.0;
        double d4 = (double)(n2 >> 8 & 0xFF) / 256.0;
        double d5 = (double)(n2 & 0xFF) / 256.0;
        double d6 = d3;
        if (d4 < d6) {
            d6 = d4;
        }
        if (d5 < d6) {
            d6 = d5;
        }
        if (d4 > (d2 = d3)) {
            d2 = d4;
        }
        if (d5 > d2) {
            d2 = d5;
        }
        double d7 = 0.0;
        double d8 = 0.0;
        double d9 = (d6 + d2) / 2.0;
        if (d6 != d2) {
            if (d9 < 0.5) {
                d8 = (d2 - d6) / (d2 + d6);
            }
            if (d9 >= 0.5) {
                d8 = (d2 - d6) / (2.0 - d2 - d6);
            }
            if (d3 == d2) {
                d7 = (d4 - d5) / (d2 - d6);
            } else if (d4 == d2) {
                d7 = 2.0 + (d5 - d3) / (d2 - d6);
            } else if (d5 == d2) {
                d7 = 4.0 + (d3 - d4) / (d2 - d6);
            }
        }
        this.f = (int)((d7 /= 6.0) * 256.0);
        this.g = (int)(d8 * 256.0);
        this.h = (int)(d9 * 256.0);
        if (this.g < 0) {
            this.g = 0;
        } else if (this.g > 255) {
            this.g = 255;
        }
        if (this.h < 0) {
            this.h = 0;
        } else if (this.h > 255) {
            this.h = 255;
        }
        this.j = d9 > 0.5 ? (int)((1.0 - d9) * d8 * 512.0) : (int)(d9 * d8 * 512.0);
        if (this.j < 1) {
            this.j = 1;
        }
        this.i = (int)(d7 * (double)this.j);
        int n3 = this.f + (int)(Math.random() * 16.0) - 8;
        if (n3 < 0) {
            n3 = 0;
        } else if (n3 > 255) {
            n3 = 255;
        }
        int n4 = this.g + (int)(Math.random() * 48.0) - 24;
        if (n4 < 0) {
            n4 = 0;
        } else if (n4 > 255) {
            n4 = 255;
        }
        int n5 = this.h + (int)(Math.random() * 48.0) - 24;
        if (n5 < 0) {
            n5 = 0;
        } else if (n5 > 255) {
            n5 = 255;
        }
        this.k = this.a(n3, n4, n5);
    }

    private int a(int n2, int n3, int n4) {
        if (n4 > 179) {
            n3 /= 2;
        }
        if (n4 > 192) {
            n3 /= 2;
        }
        if (n4 > 217) {
            n3 /= 2;
        }
        if (n4 > 243) {
            n3 /= 2;
        }
        return (n2 / 4 << 10) + (n3 / 32 << 7) + n4 / 2;
    }

    private h() {
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = rs.d.h$a.a();
        }
    }
}

