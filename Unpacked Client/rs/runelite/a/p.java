/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.a;

import java.util.Collection;
import java.util.Collections;
import rs.Client;
import rs.runelite.a.f;

public final class p {
    private static final int[] a = new int[]{12894, 8755, 12895, 8756, 13150, 9011, 13151, 9012};
    private final int b;
    private final int c;
    private final int d;

    public p a(int n2) {
        return new p(this.b + n2, this.c, this.d);
    }

    public p b(int n2) {
        return new p(this.b, this.c + n2, this.d);
    }

    public p c(int n2) {
        return new p(this.b, this.c, this.d + n2);
    }

    public static boolean a(int n2, int n3) {
        int n4 = Client.eh;
        int n5 = Client.ei;
        int n6 = n4 + 104;
        int n7 = n5 + 104;
        return n2 >= n4 && n2 < n6 && n3 >= n5 && n3 < n7;
    }

    public static boolean a(Client client, int n2, int n3) {
        int n4 = client.aR();
        int n5 = client.aS();
        int n6 = n4 + 104;
        int n7 = n5 + 104;
        return n2 >= n4 && n2 < n6 && n3 >= n5 && n3 < n7;
    }

    public boolean a() {
        return Client.dw == this.d && p.a(this.b, this.c);
    }

    public static p a(f f2) {
        return p.a(f2.b(), f2.c(), Client.dw);
    }

    public static p a(int n2, int n3, int n4) {
        return new p((n2 >>> 7) + Client.eh, (n3 >>> 7) + Client.ei, n4);
    }

    private static p a(p p2, int n2) {
        int n3 = p2.e() & 0xFFFFFFF8;
        int n4 = p2.f() & 0xFFFFFFF8;
        int n5 = p2.e() & 7;
        int n6 = p2.f() & 7;
        switch (n2) {
            case 1: {
                return new p(n3 + n6, n4 + (7 - n5), p2.g());
            }
            case 2: {
                return new p(n3 + (7 - n5), n4 + (7 - n6), p2.g());
            }
            case 3: {
                return new p(n3 + (7 - n6), n4 + n5, p2.g());
            }
        }
        return p2;
    }

    public int a(p p2) {
        if (p2.d != this.d) {
            return Integer.MAX_VALUE;
        }
        return this.b(p2);
    }

    public int b(p p2) {
        return Math.max(Math.abs(this.e() - p2.e()), Math.abs(this.f() - p2.f()));
    }

    public int b() {
        return this.b >> 6 << 8 | this.c >> 6;
    }

    public static p a(int n2, int n3, int n4, int n5) {
        return new p((n2 >>> 8 << 6) + n3, ((n2 & 0xFF) << 6) + n4, n5);
    }

    public int c() {
        return p.d(this.b);
    }

    public int d() {
        return p.d(this.c);
    }

    private static int d(int n2) {
        return n2 & 0x3F;
    }

    public static p a(p p2, boolean bl) {
        int n2 = p2.b();
        for (int i2 = 0; i2 < a.length; i2 += 2) {
            int n3 = a[i2];
            int n4 = a[i2 + 1];
            if (n2 != (bl ? n3 : n4)) continue;
            return p.a(bl ? n4 : n3, p2.c(), p2.d(), p2.g());
        }
        return p2;
    }

    public static Collection<p> c(p p2) {
        return Collections.singleton(p2);
    }

    public p(int n2, int n3, int n4) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof p)) {
            return false;
        }
        p p2 = (p)object;
        if (this.e() != p2.e()) {
            return false;
        }
        if (this.f() != p2.f()) {
            return false;
        }
        return this.g() == p2.g();
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + this.e();
        n3 = n3 * 59 + this.f();
        n3 = n3 * 59 + this.g();
        return n3;
    }

    public String toString() {
        return "WorldPoint(x=" + this.e() + ", y=" + this.f() + ", plane=" + this.g() + ")";
    }
}

