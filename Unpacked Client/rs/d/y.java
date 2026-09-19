/*
 * Decompiled with CFR 0.152.
 */
package rs.d;

import rs.d.z;
import rs.x.e;
import rs.x.f;

public final class y {
    public static y[] a;
    public int b;
    public int c;
    public int d;
    private boolean e = false;

    public static void a(f f2) {
        e e2 = new e(f2.a("varbit.dat"));
        int n2 = e2.A();
        if (a == null) {
            a = new y[n2];
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (a[i2] == null) {
                y.a[i2] = new y();
            }
            a[i2].a(e2);
            if (!y.a[i2].e) continue;
            z.a[y.a[i2].b].c = true;
        }
        if (e2.h != e2.g.length) {
            System.out.println("varbit load mismatch");
        }
    }

    private void a(e e2) {
        int n2;
        while ((n2 = e2.y()) != 0) {
            if (n2 == 1) {
                this.b = e2.A();
                this.c = e2.y();
                this.d = e2.y();
                continue;
            }
            if (n2 == 10) {
                e2.F();
                continue;
            }
            if (n2 == 2) {
                this.e = true;
                continue;
            }
            if (n2 == 3) {
                e2.D();
                continue;
            }
            if (n2 == 4) {
                e2.D();
                continue;
            }
            System.out.println("[VARB] Error unrecognised config code: " + n2);
        }
        return;
    }

    private y() {
    }
}

