/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.a;

import rs.Client;
import rs.runelite.a.p;

public class f {
    private final int a;
    private final int b;

    public f(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public boolean a() {
        return this.a >= 0 && this.a < 13312 && this.b >= 0 && this.b < 13312;
    }

    public int a(f f2) {
        return (int)Math.hypot(this.b() - f2.b(), this.c() - f2.c());
    }

    public static f a(int n2, int n3) {
        return new f((n2 << 7) + 64, (n3 << 7) + 64);
    }

    public static f a(p p2) {
        if (Client.dw != p2.g()) {
            return null;
        }
        return f.b(p2.e(), p2.f());
    }

    public static f b(int n2, int n3) {
        if (!p.a(n2, n3)) {
            return null;
        }
        int n4 = Client.eh;
        int n5 = Client.ei;
        return f.a(n2 - n4, n3 - n5);
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.a >>> 7;
    }

    public int e() {
        return this.b >>> 7;
    }
}

