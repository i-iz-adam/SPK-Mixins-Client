/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.e;

import rs.l.f.a.e.a;

public class b
extends rs.q.a.a.a {
    private static a d;

    @Override
    public void a() {
        int n2 = this.e();
        if (n2 == 0) {
            d.b();
            return;
        }
        if (n2 == 1) {
            int n3 = this.c();
            int n4 = this.c();
            int n5 = this.c();
            int n6 = this.c();
            int n7 = this.c();
            d.a(n3, n4, n5, n6, n7);
            return;
        }
        if (n2 == 2) {
            int n8 = this.c();
            d.a(n8);
            return;
        }
    }

    public static a b() {
        return d;
    }

    public static void a(a a2) {
        d = a2;
    }
}

