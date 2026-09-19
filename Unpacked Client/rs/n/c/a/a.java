/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.a;

import rs.l.k_0;
import rs.n.c;
import rs.n.c.a.b;
import rs.n.c.a_0;
import rs.n.e;

public class a
extends c {
    public static int c = 30700;
    public static rs.n.d.c d;
    public static final rs.q.a.a.a e;

    public a(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.a.a.d(c);
        d = new rs.n.d.c(e2);
        rs.n.c.a.a.h();
    }

    public static void m(int n2) {
        a_0.i();
        d.b();
        rs.n.c.a.a.i();
    }

    public static void a(int n2, int n3, boolean bl) {
        a_0.i();
        d.b();
        a_0.a(14171, n2, n3, 167, 123, bl);
        rs.n.c.a.a.i();
    }

    public static void h() {
        int n2 = 2;
        int n3 = 2;
        int n4 = 10;
        d = new rs.n.d.c(rs.n.e.l(c));
        a_0.a(14171, 21235, 1, 167, 123, false);
        d.a(6181).a(n2, n4 + n3);
        d.a(6182).a(n2, n4 + 15 + n3);
        d.a(6183).a(n2, n4 + 30 + n3);
        d.a(6184).a(n2, n4 + 45 + n3);
        d.a(4892).a(n2 + 67, 77 + n3);
        d.a();
    }

    private static void i() {
        int n2 = 5;
        int n3 = -10;
        int n4 = 10;
        d.a(6181).a(52, n4 + n2);
        d.a(6182).a(52, n4 + 15 + n2);
        d.a(6183).a(52, n4 + 30 + n2);
        d.a(6184).a(52, n4 + 45 + n2);
        d.a(4892).a(117, 77 + n2);
        d.a(14171).a(-16, n3 + n2);
        d.a();
    }

    static {
        e = new b();
    }
}

