/*
 * Decompiled with CFR 0.152.
 */
package rs.k.b;

import java.util.Arrays;
import rs.a.h;

public class f {
    private h a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private static final int[] h = new int[4];

    public void a(h h2) {
        this.a = h2;
    }

    public int a() {
        return Arrays.hashCode(new int[]{this.b, this.c, this.d, this.e, this.f, this.g, this.a.V, this.a.S, this.a.T, this.a.U});
    }

    public int b() {
        rs.k.b.f.h[0] = Arrays.hashCode(this.a.ae);
        rs.k.b.f.h[1] = Arrays.hashCode(this.a.af);
        rs.k.b.f.h[2] = Arrays.hashCode(this.a.ag);
        rs.k.b.f.h[3] = Arrays.hashCode(this.a.ar);
        return Arrays.hashCode(h);
    }
}

