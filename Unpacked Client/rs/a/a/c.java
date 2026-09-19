/*
 * Decompiled with CFR 0.152.
 */
package rs.a.a;

import rs.x.e;

public class c {
    private static final int b = 10;
    private static int c;
    public static e[] a;

    public static e a(byte[] byArray) {
        if (a[c] == null) {
            rs.a.a.c.a[rs.a.a.c.c] = new e(byArray);
        } else {
            a[c].b(byArray);
        }
        return a[c++];
    }

    public static void a() {
        for (int i2 = 0; i2 <= c; ++i2) {
            if (a[c] == null) continue;
            a[c].b(null);
        }
        c = 0;
    }

    static {
        a = new e[10];
    }
}

