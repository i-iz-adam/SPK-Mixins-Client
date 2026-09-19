/*
 * Decompiled with CFR 0.152.
 */
package rs.d;

import rs.a.h;
import rs.x.e;
import rs.x.f;

public final class j {
    public static int a;
    public static j[] b;
    public int c = -1;
    public int[] d;
    private final int[] f;
    private final int[] g;
    private final int[] h = new int[]{-1, -1, -1, -1, -1};
    public boolean e = false;

    public static void a(f f2) {
        e e2 = new e(f2.a("idk.dat"));
        a = e2.A();
        if (b == null) {
            b = new j[a];
        }
        for (int i2 = 0; i2 < a; ++i2) {
            if (b[i2] == null) {
                j.b[i2] = new j();
            }
            b[i2].a(e2);
        }
    }

    private void a(e e2) {
        int n2;
        block0: while ((n2 = e2.y()) != 0) {
            if (n2 == 1) {
                this.c = e2.y();
                continue;
            }
            if (n2 == 2) {
                int n3 = e2.y();
                this.d = new int[n3];
                int n4 = 0;
                while (true) {
                    if (n4 >= n3) continue block0;
                    this.d[n4] = e2.A();
                    ++n4;
                }
            }
            if (n2 == 3) {
                this.e = true;
                continue;
            }
            if (n2 >= 40 && n2 < 50) {
                this.f[n2 - 40] = e2.A();
                continue;
            }
            if (n2 >= 50 && n2 < 60) {
                this.g[n2 - 50] = e2.A();
                continue;
            }
            if (n2 >= 60 && n2 < 70) {
                this.h[n2 - 60] = e2.A();
                continue;
            }
            System.out.println("[IDK] Error unrecognised config code: " + n2);
        }
        return;
    }

    public boolean a() {
        if (this.d == null) {
            return true;
        }
        boolean bl = true;
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            if (rs.a.h.f(this.d[i2])) continue;
            bl = false;
        }
        return bl;
    }

    public h b() {
        if (this.d == null) {
            return null;
        }
        h[] hArray = new h[this.d.length];
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            hArray[i2] = rs.a.h.e(this.d[i2]);
            if (hArray[i2] == null) {
                return null;
            }
            int[] nArray = new int[]{0};
            int[] nArray2 = new int[]{1};
            for (int i3 = 0; i3 < nArray.length; ++i3) {
                hArray[i2].i(nArray[i3], nArray2[i3]);
            }
        }
        h h2 = hArray.length == 1 ? hArray[0] : new h(hArray.length, hArray);
        for (int i4 = 0; i4 < 6 && this.f[i4] != 0; ++i4) {
            h2.i(this.f[i4], this.g[i4]);
        }
        return h2;
    }

    public boolean c() {
        boolean bl = true;
        for (int i2 = 0; i2 < 5; ++i2) {
            if (this.h[i2] == -1 || rs.a.h.f(this.h[i2])) continue;
            bl = false;
        }
        return bl;
    }

    public h d() {
        h[] hArray = new h[5];
        int n2 = 0;
        for (int i2 = 0; i2 < 5; ++i2) {
            if (this.h[i2] == -1) continue;
            hArray[n2++] = rs.a.h.e(this.h[i2]);
        }
        h h2 = new h(n2, hArray);
        for (int i3 = 0; i3 < 6 && this.f[i3] != 0; ++i3) {
            h2.i(this.f[i3], this.g[i3]);
        }
        return h2;
    }

    private j() {
        this.f = new int[6];
        this.g = new int[6];
    }
}

