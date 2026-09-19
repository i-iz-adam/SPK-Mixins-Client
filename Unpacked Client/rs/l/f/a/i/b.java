/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.i;

import rs.Client;
import rs.l.f.a.i.g;
import rs.l.f.b.d;
import rs.l.f.e;

public class b
extends d {
    private static b h = null;
    private static g i = null;
    private final rs.l.f.a.i.e j;
    private final int k;
    private final int l;
    private boolean m = false;

    public b(rs.l.f.a.i.e e2, int n2, int n3) {
        this.j = e2;
        this.k = n2;
        this.l = n3;
    }

    @Override
    public void a() {
        if (Client.ff % 20 < 10) {
            this.j.a().f(this.e + this.k, this.f + this.l);
        }
    }

    public static b k() {
        return h;
    }

    public static boolean l() {
        return h != null;
    }

    public static void m() {
        i = null;
        if (h == null) {
            return;
        }
        try {
            rs.l.f.e.d().a(h);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            i = null;
            h = null;
        }
    }

    public static void a(int n2, rs.l.f.a.i.e e2, int n3, int n4) {
        rs.l.f.a.i.b.m();
        h = new b(e2, n3, n4);
        rs.l.f.e.d().a(h, n2);
    }

    public static void a(int n2) {
        int n3 = 0;
        int n4 = 0;
        rs.l.f.a.i.e e2 = rs.l.f.a.i.e.b;
        if (rs.n.e.H[n2].E != null) {
            int n5 = rs.n.e.H[n2].E.n;
            int n6 = rs.n.e.H[n2].E.o;
            switch (e2) {
                case b: {
                    n3 = -30;
                    n4 = n6 / 2 - 15;
                }
            }
        } else {
            n4 = -10;
        }
        rs.l.f.a.i.b.a(n2, e2, n3, n4);
        rs.l.f.a.i.b.k().b(false);
    }

    public static void a(g g2) {
        i = g2;
    }

    public static g n() {
        return i;
    }

    public rs.l.f.a.i.e o() {
        return this.j;
    }

    public int p() {
        return this.k;
    }

    public int q() {
        return this.l;
    }

    public boolean r() {
        return this.m;
    }

    public void b(boolean bl) {
        this.m = bl;
    }
}

