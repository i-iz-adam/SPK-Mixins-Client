/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.M
 *  gnu.trove.f.b.cc
 */
package rs.l.f.a.e;

import gnu.trove.f.M;
import gnu.trove.f.b.cc;
import rs.Client;
import rs.l.f.a.e.b;

public class a
extends rs.l.f.b.b {
    private final M<a> i;

    public a() {
        this.a(rs.l.f.a.i);
        rs.l.f.a.e.b.a(this);
        this.i = new cc();
    }

    @Override
    public void a() {
        if (!this.i.w_((int)this.e.aG.x)) {
            return;
        }
        a a2 = (a)this.i.b((int)this.e.aG.x);
        this.a(this.e.ac + a2.b, this.e.ad + a2.c, this.e.r + a2.d);
        Client.fE[a2.a].f(this.c, this.d);
    }

    @Override
    public void c() {
        this.k();
    }

    public void a(int n2, int n3, int n4, int n5, int n6) {
        this.i.a(n2, (Object)new a(n3, n4, n5, n6));
    }

    public void a(int n2) {
        this.i.c(n2);
    }

    public void k() {
        this.i.clear();
    }

    class a {
        int a;
        int b;
        int c;
        int d;

        public a(int n2, int n3, int n4, int n5) {
            this.a = n2;
            this.b = n3;
            this.c = n4;
            this.d = n5;
        }
    }
}

