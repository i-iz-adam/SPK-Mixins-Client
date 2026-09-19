/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cI
 *  gnu.trove.f.b.cc
 *  gnu.trove.i.a.m
 */
package rs.k.c;

import gnu.trove.f.b.cI;
import gnu.trove.f.b.cc;
import gnu.trove.i.a.m;
import java.util.ArrayList;
import java.util.List;
import rs.k.c.a;
import rs.k.c.d;
import rs.r.c_0;

public class c {
    private static final int a = 50;
    private static final int b = 50000;
    private static final long c = 60000L;
    private static final cc<d> d = new cc(100);
    private static final List<d> e = new ArrayList<d>(100);
    private static final cI<a> f = new cI(100000);
    private static final m g = new m(100000);
    private static final List<a> h = new ArrayList<a>(100000);
    private static long i;
    private static boolean j;

    public static a a(c_0 c_02, int n2, int n3, int n4, int n5) {
        if (f.size() >= 50000) {
            rs.k.c.c.c();
            System.out.println("[GPU] Reached max capacity of particle pool!");
            return null;
        }
        if (h.size() == 0) {
            a a2 = new a(c_02, n2, n3, n4, n5);
            a2.b();
            a2.a();
            rs.k.c.c.c(a2);
            return a2;
        }
        a a3 = h.get(0);
        a3.b();
        a3.a(c_02);
        a3.b(n2);
        a3.c(n3);
        a3.d(n4);
        a3.f(n5);
        a3.a();
        rs.k.c.c.c(a3);
        h.remove(0);
        return a3;
    }

    public static d a(int n2, boolean bl) {
        if (d.w_(n2)) {
            return (d)d.b(n2);
        }
        if (!bl) {
            return null;
        }
        if (d.size() >= 50) {
            rs.k.c.c.c();
            return null;
        }
        if (e.size() == 0) {
            d d2 = rs.k.c.d.a();
            d2.b(n2);
            d.a(n2, (Object)d2);
            return d2;
        }
        d d3 = e.get(0);
        d3.b(n2);
        d.a(n2, (Object)d3);
        e.remove(0);
        return d3;
    }

    public static boolean a() {
        return rs.l.b.a.a();
    }

    public static void b() {
        if (rs.k.c.c.a()) {
            return;
        }
        int[] nArray = d.b();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            d d2 = (d)d.b(nArray[i2]);
            if (System.currentTimeMillis() - d2.f() < 60000L) continue;
            rs.k.c.c.a(nArray[i2]);
        }
        long[] lArray = g.c();
        for (int i3 = 0; i3 < lArray.length; ++i3) {
            a a2 = rs.k.c.c.a(lArray[i3]);
            if (a2 == null) continue;
            a2.c();
            if (!a2.i()) continue;
            rs.k.c.c.a(a2);
        }
    }

    public static a a(long l2) {
        return (a)f.b(l2);
    }

    public static void a(a a2) {
        a2.a(true);
        rs.k.c.c.d(a2);
        if (h.size() < 50000) {
            h.add(a2);
        }
    }

    public static void a(int n2) {
        d d2 = (d)d.b(n2);
        if (d2 == null) {
            return;
        }
        d2.d();
        e.add(d2);
        d.c(n2);
    }

    public static void c() {
        g.clear();
        f.clear();
        h.clear();
    }

    public static boolean b(a a2) {
        return g.y_(a2.d());
    }

    private static void c(a a2) {
        f.a(a2.d(), (Object)a2);
        g.b(a2.d());
    }

    private static void d(a a2) {
        f.c(a2.d());
        g.c(a2.d());
    }
}

