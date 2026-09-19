/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.e.a.k
 *  gnu.trove.f.b.cI
 */
package rs.r;

import gnu.trove.e.a.k;
import gnu.trove.f.b.cI;
import rs.l.e_0;
import rs.r.a;
import rs.r.c_0;

/*
 * Renamed from rs.r.J
 */
public class j_0 {
    private static final int a = 100000;
    private static final cI<a> b = new cI(100010, 1.0f);
    private static final k c = new k();
    private static int d = 0;

    public static a a(c_0 c_02, int n2, int n3, int n4, int n5) {
        if (!e_0.q) {
            return null;
        }
        if (d >= 100000) {
            if (rs.f.a.f.booleanValue()) {
                System.out.println("[CPU] Reached max capacity of particle pool!");
            }
            return null;
        }
        if (c.size() == 0) {
            a a2 = new a(c_02, n2, n3, n4, n5);
            j_0.b(a2);
            return a2;
        }
        a a3 = (a)b.b(c.a(0));
        a3.b();
        a3.a(c_02);
        a3.a(n2);
        a3.d(n3);
        a3.e(n4);
        a3.f(n5);
        a3.a();
        j_0.b(a3);
        c.b(0);
        return a3;
    }

    public static void a(a a2) {
        a2.a(true);
        j_0.c(a2);
    }

    public static void a() {
    }

    private static void b(a a2) {
        ++d;
        b.a(a2.n(), (Object)a2);
    }

    private static void c(a a2) {
        --d;
        j_0.d(a2);
    }

    private static void d(a a2) {
        if (c.size() < 100000) {
            c.b(a2.n());
        } else {
            b.c(a2.n());
        }
    }
}

