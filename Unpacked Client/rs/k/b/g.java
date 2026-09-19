/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 */
package rs.k.b;

import gnu.trove.f.b.cc;

public class g {
    private static int a;
    private static final int b = 6048;
    private static final cc<g> c;
    private static final g[] d;
    private int e;
    private int f;
    private int g;

    public static void a() {
        a = 0;
        c.clear();
    }

    public static g a(int n2) {
        return (g)c.b(n2);
    }

    public static void a(int n2, g g2) {
        c.a(n2, (Object)g2);
    }

    public static g b() {
        return d[a++];
    }

    public int c() {
        return this.e;
    }

    public g b(int n2) {
        this.e = n2;
        return this;
    }

    public int d() {
        return this.f;
    }

    public g c(int n2) {
        this.f = n2;
        return this;
    }

    public int e() {
        return this.g;
    }

    public g d(int n2) {
        this.g = n2;
        return this;
    }

    static {
        c = new cc(6048);
        d = new g[6048];
        for (int i2 = 0; i2 < 6048; ++i2) {
            rs.k.b.g.d[i2] = new g();
        }
    }
}

