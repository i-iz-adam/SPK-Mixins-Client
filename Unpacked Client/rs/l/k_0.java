/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import java.util.Random;
import rs.l.c;
import rs.x.e;
import rs.x.f;

/*
 * Renamed from rs.l.K
 */
public class k_0
extends c {
    public String q;
    private final char[] s = new char[100];
    private final byte[][] t;
    private final int[] u;
    private final int[] v;
    private final int[] w;
    private final int[] x;
    private final int[] y;
    public int r;
    private final Random z;
    private boolean A;

    public k_0(boolean bl, String string, f f2) {
        int n2 = string.equals("hit_full") || string.equals("critical_full") ? 58 : 256;
        this.q = string;
        this.t = new byte[n2][];
        this.u = new int[n2];
        this.v = new int[n2];
        this.w = new int[n2];
        this.x = new int[n2];
        this.y = new int[n2];
        this.z = new Random();
        this.A = false;
        e e2 = new e(f2.a(string + ".dat"));
        e e3 = new e(f2.a("index.dat"));
        e3.h = e2.A() + 4;
        int n3 = e3.y();
        if (n3 > 0) {
            e3.h += 3 * (n3 - 1);
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            int n5;
            this.w[i2] = e3.y();
            this.x[i2] = e3.y();
            int n6 = this.u[i2] = e3.A();
            int n7 = this.v[i2] = e3.A();
            int n8 = e3.y();
            int n9 = n6 * n7;
            this.t[i2] = new byte[n9];
            if (n8 == 0) {
                for (n5 = 0; n5 < n9; ++n5) {
                    this.t[i2][n5] = e2.z();
                }
            } else if (n8 == 1) {
                for (n5 = 0; n5 < n6; ++n5) {
                    for (n4 = 0; n4 < n7; ++n4) {
                        this.t[i2][n5 + n4 * n6] = e2.z();
                    }
                }
            }
            if (n7 > this.r && i2 < 128) {
                this.r = n7;
            }
            this.w[i2] = 1;
            this.y[i2] = n6 + 2;
            n5 = 0;
            for (n4 = n7 / 7; n4 < n7; ++n4) {
                n5 += this.t[i2][n4 * n6];
            }
            if (n5 <= n7 / 7) {
                int n10 = i2;
                this.y[n10] = this.y[n10] - 1;
                this.w[i2] = 0;
            }
            n5 = 0;
            for (n4 = n7 / 7; n4 < n7; ++n4) {
                n5 += this.t[i2][n6 - 1 + n4 * n6];
            }
            if (n5 > n7 / 7) continue;
            int n11 = i2;
            this.y[n11] = this.y[n11] - 1;
        }
        this.y[32] = bl ? this.y[73] : this.y[105];
    }

    public void a(String string, int n2, int n3, int n4) {
        this.b(n3, string, n4, n2 - this.b(string));
    }

    public void a(int n2, String string, int n3, int n4) {
        this.b(n2, string, n3, n4 - this.b(string) / 2);
    }

    public void a(int n2, int n3, String string, int n4, boolean bl) {
        this.a(bl, n3 - this.a(string) / 2, n2, string, n4);
    }

    public void b(int n2, int n3, String string, int n4, boolean bl) {
        this.a(bl, n3, n2, string, n4);
    }

    public int a(String string) {
        if (string == null) {
            return 0;
        }
        int n2 = 0;
        boolean bl = false;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (string.charAt(i2) == '@' && i2 + 4 < string.length() && string.charAt(i2 + 4) == '@') {
                i2 += 4;
                continue;
            }
            if (bl) {
                if (string.charAt(i2) == '=' && i2 > 3 && string.charAt(i2 - 3) == 'i' && string.charAt(i2 - 2) == 'm' && string.charAt(i2 - 1) == 'g') {
                    n2 += 12;
                }
                if (string.charAt(i2) != '>') continue;
                bl = false;
                continue;
            }
            if (string.charAt(i2) == '<') {
                bl = true;
                continue;
            }
            n2 += this.y[string.charAt(i2)];
        }
        return n2;
    }

    public int b(String string) {
        if (string == null) {
            return 0;
        }
        int n2 = 0;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            n2 += this.y[string.charAt(i2)];
        }
        return n2;
    }

    public void b(int n2, String string, int n3, int n4) {
        if (string == null) {
            return;
        }
        n3 -= this.r;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 != ' ') {
                this.a(this.t[c2], n4 + this.w[c2], n3 + this.x[c2], this.u[c2], this.v[c2], n2);
            }
            n4 += this.y[c2];
        }
    }

    public void e(int n2, int n3, int n4, int n5) {
        int n6;
        n4 -= this.r;
        int n7 = 0;
        int n8 = 0;
        if (n3 == 0) {
            n6 = 48;
            n8 += this.y[n6];
            this.s[n7++] = n6;
        } else {
            while (n3 > 0) {
                n6 = (char)(n3 % 10 + 48);
                n8 += this.y[n6];
                this.s[n7++] = n6;
                n3 /= 10;
            }
        }
        if (n7 == 0) {
            return;
        }
        n5 -= n8 / 2;
        for (n6 = n7 - 1; n6 >= 0; --n6) {
            char c2 = this.s[n6];
            if (c2 != ' ') {
                this.a(this.t[c2], n5 + this.w[c2], n4 + this.x[c2], this.u[c2], this.v[c2], n2);
            }
            n5 += this.y[c2];
        }
    }

    public void a(int n2, String string, int n3, int n4, int n5) {
        if (string == null) {
            return;
        }
        n3 -= this.b(string) / 2;
        n5 -= this.r;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 != ' ') {
                this.a(this.t[c2], n3 + this.w[c2], n5 + this.x[c2] + (int)(Math.sin((double)i2 / 2.0 + (double)n4 / 5.0) * 5.0), this.u[c2], this.v[c2], n2);
            }
            n3 += this.y[c2];
        }
    }

    public void b(int n2, String string, int n3, int n4, int n5) {
        if (string == null) {
            return;
        }
        n2 -= this.b(string) / 2;
        n4 -= this.r;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 != ' ') {
                this.a(this.t[c2], n2 + this.w[c2] + (int)(Math.sin((double)i2 / 5.0 + (double)n3 / 5.0) * 5.0), n4 + this.x[c2] + (int)(Math.sin((double)i2 / 3.0 + (double)n3 / 5.0) * 5.0), this.u[c2], this.v[c2], n5);
            }
            n2 += this.y[c2];
        }
    }

    public void a(int n2, String string, int n3, int n4, int n5, int n6) {
        if (string == null) {
            return;
        }
        double d2 = 7.0 - (double)n2 / 8.0;
        if (d2 < 0.0) {
            d2 = 0.0;
        }
        n5 -= this.b(string) / 2;
        n4 -= this.r;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 != ' ') {
                this.a(this.t[c2], n5 + this.w[c2], n4 + this.x[c2] + (int)(Math.sin((double)i2 + (double)n3) * d2), this.u[c2], this.v[c2], n6);
            }
            n5 += this.y[c2];
        }
    }

    public void a(boolean bl, int n2, int n3, String string, int n4) {
        this.A = false;
        int n5 = n2;
        if (string == null) {
            return;
        }
        n4 -= this.r;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n6;
            if (string.charAt(i2) == '@' && i2 + 4 < string.length() && string.charAt(i2 + 4) == '@') {
                n6 = this.c(string.substring(i2 + 1, i2 + 4));
                if (n6 != -1) {
                    n3 = n6;
                }
                i2 += 4;
                continue;
            }
            n6 = string.charAt(i2);
            if (n6 != 32) {
                if (bl) {
                    this.a(this.t[n6], n2 + this.w[n6] + 1, n4 + this.x[n6] + 1, this.u[n6], this.v[n6], 0);
                }
                this.a(this.t[n6], n2 + this.w[n6], n4 + this.x[n6], this.u[n6], this.v[n6], n3);
            }
            n2 += this.y[n6];
        }
        if (this.A) {
            k_0.b(n4 + (int)((double)this.r * 0.7), 0x800000, n2 - n5, n5);
        }
    }

    public void a(int n2, int n3, String string, int n4, int n5) {
        if (string == null) {
            return;
        }
        this.z.setSeed(n4);
        int n6 = 192 + (this.z.nextInt() & 0x1F);
        n5 -= this.r;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n7;
            if (string.charAt(i2) == '@' && i2 + 4 < string.length() && string.charAt(i2 + 4) == '@') {
                n7 = this.c(string.substring(i2 + 1, i2 + 4));
                if (n7 != -1) {
                    n3 = n7;
                }
                i2 += 4;
                continue;
            }
            n7 = string.charAt(i2);
            if (n7 != 32) {
                this.a(192, n2 + this.w[n7] + 1, this.t[n7], this.u[n7], n5 + this.x[n7] + 1, this.v[n7], 0);
                this.a(n6, n2 + this.w[n7], this.t[n7], this.u[n7], n5 + this.x[n7], this.v[n7], n3);
            }
            n2 += this.y[n7];
            if ((this.z.nextInt() & 3) != 0) continue;
            ++n2;
        }
    }

    private int c(String string) {
        if (string.equals("red")) {
            return 0xFF0000;
        }
        if (string.equals("gre")) {
            return 65280;
        }
        if (string.equals("blu")) {
            return 255;
        }
        if (string.equals("yel")) {
            return 0xFFFF00;
        }
        if (string.equals("cya")) {
            return 65535;
        }
        if (string.equals("mag")) {
            return 0xFF00FF;
        }
        if (string.equals("whi")) {
            return 0xFFFFFF;
        }
        if (string.equals("bla")) {
            return 0;
        }
        if (string.equals("lre")) {
            return 16748608;
        }
        if (string.equals("dre")) {
            return 0x800000;
        }
        if (string.equals("dbl")) {
            return 128;
        }
        if (string.equals("or1")) {
            return 0xFFB000;
        }
        if (string.equals("or2")) {
            return 0xFF7000;
        }
        if (string.equals("or3")) {
            return 0xFF3000;
        }
        if (string.equals("gr1")) {
            return 0xC0FF00;
        }
        if (string.equals("gr2")) {
            return 0x80FF00;
        }
        if (string.equals("gr3")) {
            return 0x40FF00;
        }
        if (string.equals("str")) {
            this.A = true;
        }
        if (string.equals("end")) {
            this.A = false;
        }
        return -1;
    }

    private void a(byte[] byArray, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = n2 + n3 * h;
        int n9 = h - n4;
        int n10 = 0;
        int n11 = 0;
        if (n3 < j) {
            n7 = j - n3;
            n5 -= n7;
            n3 = j;
            n11 += n7 * n4;
            n8 += n7 * h;
        }
        if (n3 + n5 >= k) {
            n5 -= n3 + n5 - k + 1;
        }
        if (n2 < l) {
            n7 = l - n2;
            n4 -= n7;
            n2 = l;
            n11 += n7;
            n8 += n7;
            n10 += n7;
            n9 += n7;
        }
        if (n2 + n4 >= m) {
            n7 = n2 + n4 - m + 1;
            n4 -= n7;
            n10 += n7;
            n9 += n7;
        }
        if (n4 > 0 && n5 > 0) {
            this.a(g, byArray, n6, n11, n8, n4, n5, n9, n10);
        }
    }

    private void a(int[] nArray, byte[] byArray, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = -(n5 >> 2);
        n5 = -(n5 & 3);
        for (int i2 = -n6; i2 < 0; ++i2) {
            int n10;
            for (n10 = n9; n10 < 0; ++n10) {
                if (byArray[n3++] != 0) {
                    k_0.a(nArray, n4++, n2, n2, 255);
                } else {
                    ++n4;
                }
                if (byArray[n3++] != 0) {
                    k_0.a(nArray, n4++, n2, n2, 255);
                } else {
                    ++n4;
                }
                if (byArray[n3++] != 0) {
                    k_0.a(nArray, n4++, n2, n2, 255);
                } else {
                    ++n4;
                }
                if (byArray[n3++] != 0) {
                    k_0.a(nArray, n4++, n2, n2, 255);
                    continue;
                }
                ++n4;
            }
            for (n10 = n5; n10 < 0; ++n10) {
                if (byArray[n3++] != 0) {
                    k_0.a(nArray, n4++, n2, n2, 255);
                    continue;
                }
                ++n4;
            }
            n4 += n7;
            n3 += n8;
        }
    }

    private void a(int n2, int n3, byte[] byArray, int n4, int n5, int n6, int n7) {
        int n8;
        int n9 = n3 + n5 * h;
        int n10 = h - n4;
        int n11 = 0;
        int n12 = 0;
        if (n5 < j) {
            n8 = j - n5;
            n6 -= n8;
            n5 = j;
            n12 += n8 * n4;
            n9 += n8 * h;
        }
        if (n5 + n6 >= k) {
            n6 -= n5 + n6 - k + 1;
        }
        if (n3 < l) {
            n8 = l - n3;
            n4 -= n8;
            n3 = l;
            n12 += n8;
            n9 += n8;
            n11 += n8;
            n10 += n8;
        }
        if (n3 + n4 >= m) {
            n8 = n3 + n4 - m + 1;
            n4 -= n8;
            n11 += n8;
            n10 += n8;
        }
        if (n4 <= 0 || n6 <= 0) {
            return;
        }
        this.a(byArray, n6, n9, g, n12, n4, n11, n10, n7, n2);
    }

    private void a(byte[] byArray, int n2, int n3, int[] nArray, int n4, int n5, int n6, int n7, int n8, int n9) {
        n8 = ((n8 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n8 & 0xFF00) * n9 & 0xFF0000) >> 8;
        n9 = 256 - n9;
        for (int i2 = -n2; i2 < 0; ++i2) {
            for (int i3 = -n5; i3 < 0; ++i3) {
                if (byArray[n4++] != 0) {
                    int n10 = nArray[n3];
                    nArray[n3++] = (((n10 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n10 & 0xFF00) * n9 & 0xFF0000) >> 8) + n8;
                    continue;
                }
                ++n3;
            }
            n3 += n7;
            n4 += n6;
        }
    }
}

