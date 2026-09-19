/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 */
package rs.n.d;

import gnu.trove.f.b.cc;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import rs.n.a.a;
import rs.n.a.d;
import rs.n.d.b;
import rs.n.e;

public class c {
    private e a;
    private List<b> b;
    private cc<b> c;
    private HashMap<Integer, Point> d;

    public c(e e2) {
        this.a = e2;
        this.b = new ArrayList<b>();
        this.c = new cc();
        this.d = new HashMap();
        if (rs.f.a.c()) {
            rs.s.c.c.c.put(e2.aw, this);
        }
    }

    public b a(int n2) {
        return this.a(n2, true);
    }

    public b a(int n2, boolean bl) {
        b b2 = new b(this, n2);
        this.b.add(b2);
        this.c.a(n2, (Object)b2);
        if (e.l(n2) instanceof rs.n.a.a.a) {
            rs.n.a.a.a a2 = (rs.n.a.a.a)e.l(n2);
            a2.o(this.b.size());
            this.a(rs.n.a.a.c.c).b(n2, 0, a2.aR + 1);
            return b2;
        }
        return b2;
    }

    public b a(e e2) {
        a a2;
        if (e2 instanceof d) {
            ((d)e2).a();
        }
        if (e2 instanceof a && (a2 = (a)e2).b()) {
            b b2 = this.a(e2.aw);
            b b3 = this.a(e2.aw + 1);
            b3.b(e2.aw, 0, 0);
            return b2;
        }
        return this.a(e2.aw);
    }

    public void a() {
        this.a.k(this.b.size());
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            int n2;
            int n3;
            Object object;
            b b2 = this.b.get(i2);
            int n4 = b2.f();
            int n5 = b2.g();
            if (b2.h() > 0) {
                object = (b)this.c.b(b2.h());
                n3 = ((b)object).f();
                n2 = ((b)object).g();
                n4 = n3 + b2.i();
                n5 = n2 + b2.j();
            }
            if (b2.k() > 0) {
                object = this.d.get(b2.k());
                n4 = ((Point)object).x + b2.l();
                n5 = ((Point)object).y + b2.m();
            }
            if (b2.e() != null) {
                object = (b)this.c.b(b2.e().a());
                n3 = ((b)object).a();
                n2 = ((b)object).b();
                if (b2.e().h() > 0 && n3 > b2.e().h()) {
                    n3 = b2.e().h();
                }
                if (b2.e().i() > 0 && n2 > b2.e().i()) {
                    n2 = b2.e().i();
                }
                n4 = ((b)object).f() + (b2.e().d() ? (int)((float)n3 * b2.e().f()) : 0) + b2.e().b();
                n5 = ((b)object).g() + (b2.e().e() ? (int)((float)n2 * b2.e().g()) : 0) + b2.e().c();
                if (((b)object).h() > 0) {
                    b b3 = (b)this.c.b(((b)object).h());
                    n4 += b3.f() + ((b)object).i();
                    n5 += b3.g() + ((b)object).j();
                }
            }
            this.a.b(i2, b2.c(), n4, n5);
            this.d.put(b2.c(), new Point(n4, n5));
        }
        e.H[this.a.aw] = this.a;
    }

    public void b() {
        this.b.clear();
    }

    public b b(int n2) {
        return (b)this.c.b(n2);
    }

    public e c() {
        return this.a;
    }

    public List<b> d() {
        return this.b;
    }

    public cc<b> e() {
        return this.c;
    }

    public HashMap<Integer, Point> f() {
        return this.d;
    }
}

