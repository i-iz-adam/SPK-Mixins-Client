/*
 * Decompiled with CFR 0.152.
 */
package rs.d;

import rs.x.e;
import rs.x.f;

public final class z {
    public static z[] a;
    private static int d;
    private static int[] e;
    public int b;
    public boolean c = false;

    public static void a(f f2) {
        e e2 = new e(f2.a("varp.dat"));
        d = 0;
        int n2 = e2.A();
        if (a == null) {
            a = new z[n2 + 10000];
        }
        if (e == null) {
            e = new int[n2];
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (a[i2] == null) {
                z.a[i2] = new z();
            }
            a[i2].a(e2, i2);
        }
        if (e2.h != e2.g.length) {
            System.out.println("varptype load mismatch");
        }
    }

    private void a(e e2, int n2) {
        int n3;
        while ((n3 = e2.y()) != 0) {
            int n4;
            if (n3 == 1) {
                e2.y();
                continue;
            }
            if (n3 == 2) {
                e2.y();
                continue;
            }
            if (n3 == 3) {
                z.e[z.d++] = n2;
                continue;
            }
            if (n3 == 4) {
                n4 = 2;
                continue;
            }
            if (n3 == 5) {
                this.b = e2.A();
                continue;
            }
            if (n3 == 6) {
                n4 = 2;
                continue;
            }
            if (n3 == 7) {
                e2.D();
                continue;
            }
            if (n3 == 8) {
                this.c = true;
                continue;
            }
            if (n3 == 10) {
                e2.F();
                continue;
            }
            if (n3 == 11) {
                this.c = true;
                continue;
            }
            if (n3 == 12) {
                e2.D();
                continue;
            }
            if (n3 == 13) {
                n4 = 2;
                continue;
            }
            System.out.println("[VARP] Error unrecognised config code: " + n3);
        }
        return;
    }

    private z() {
    }
}

