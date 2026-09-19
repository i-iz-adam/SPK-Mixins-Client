/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.i;

import rs.l.f.a.i.b;
import rs.l.f.a.i.e;
import rs.l.f.a.i.g;
import rs.q.a.a.a;

public class d
extends a {
    @Override
    public void a() {
        int n2;
        int n3 = this.e();
        if (n3 == 0) {
            rs.l.f.a.i.b.m();
        }
        if (n3 == 1) {
            e e2;
            n2 = this.g();
            int n4 = this.e();
            int n5 = this.c();
            int n6 = this.c();
            boolean bl = this.e() == 1;
            switch (n4) {
                case 1: {
                    e2 = e.c;
                    break;
                }
                case 2: {
                    e2 = e.d;
                    break;
                }
                case 3: {
                    e2 = e.a;
                    break;
                }
                default: {
                    e2 = e.b;
                }
            }
            rs.l.f.a.i.b.a(n2, e2, n5, n6);
            if (rs.l.f.a.i.b.l() && bl) {
                rs.l.f.a.i.b.k().b(true);
            }
        }
        if (n3 == 3) {
            n2 = this.e();
            g g2 = null;
            switch (n2) {
                case 0: {
                    g2 = null;
                    break;
                }
                case 1: {
                    g2 = g.a;
                    break;
                }
                case 2: {
                    g2 = g.b;
                    break;
                }
                case 3: {
                    g2 = g.c;
                    break;
                }
                case 4: {
                    g2 = g.d;
                    break;
                }
                case 5: {
                    g2 = g.e;
                    break;
                }
                case 6: {
                    g2 = g.f;
                }
            }
            rs.l.f.a.i.b.a(g2);
        }
        if (n3 == 4) {
            n2 = this.g();
            rs.l.f.a.i.b.k();
            rs.l.f.a.i.b.a(n2);
        }
    }
}

