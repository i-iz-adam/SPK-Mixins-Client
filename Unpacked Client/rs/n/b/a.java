/*
 * Decompiled with CFR 0.152.
 */
package rs.n.b;

import java.util.ArrayList;
import java.util.List;
import rs.n.b.a.c;
import rs.n.b.a.d;
import rs.n.b.b;

public abstract class a {
    public static List<b> a = new ArrayList<b>();
    public static b<c> b = rs.n.b.a.a(new b());
    public static b<rs.n.b.a.a> c = rs.n.b.a.a(new b());
    public static b<d> d = rs.n.b.a.a(new b());
    protected long e;
    protected long f;

    public static <T> b a(b b2) {
        a.add(b2);
        return b2;
    }

    public static void a() {
        for (b b2 : a) {
            b2.a();
        }
    }

    public void b() {
        long l2 = System.currentTimeMillis() - this.f;
        if (this.e == 0L || l2 >= this.e) {
            this.c();
            this.f = System.currentTimeMillis();
        }
    }

    public abstract void c();
}

