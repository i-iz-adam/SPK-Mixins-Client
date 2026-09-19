/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 */
package rs.l.e;

import gnu.trove.f.b.cc;
import java.util.ArrayList;
import java.util.List;
import rs.Client;
import rs.l.e.a.c;
import rs.l.e.a.e;
import rs.l.e.a.h;
import rs.l.e.a.k;
import rs.l.e.a.m;
import rs.l.e.a.o;
import rs.l.e.a.q;
import rs.l.e.a.r;
import rs.l.e.a.t;
import rs.l.e.a.u;
import rs.l.e.a.v;
import rs.l.e.i;
import rs.n.c.v_0;

public abstract class f {
    public static final f a = new o();
    public static final f b = new e();
    public static final f c = new t();
    public static final f d = new r();
    public static final m e = new m();
    public static final rs.l.e.a.a f = new rs.l.e.a.a();
    public static final v g = new v();
    public static final k h = new k();
    public static final q i = new q();
    public static final u j = new u();
    public static final List<f> k = new ArrayList<f>();
    public static final List<f> l = new ArrayList<f>();
    public static final List<f> m = new ArrayList<f>();
    public static final List<rs.l.e.a> n = new ArrayList<rs.l.e.a>();
    public static int o = 0;
    private cc<i> p = new cc();
    private boolean q = false;

    public static void a() {
        if (k.size() > 0) {
            k.clear();
        }
        if (l.size() > 0) {
            l.clear();
        }
        rs.l.e.f.a(f);
        rs.l.e.f.a(g);
        rs.l.e.f.a(a);
        rs.l.e.f.a(b);
        rs.l.e.f.a(c);
        rs.l.e.f.a(d);
        rs.l.e.f.a(new h());
        rs.l.e.f.a(new c());
        rs.l.e.f.a(v_0.bJ);
        rs.l.e.f.a(new rs.l.e.a.f());
        rs.l.e.f.b(e);
        rs.l.e.f.a(j);
        rs.l.e.f.b(i);
        rs.l.e.f.b(h);
    }

    public static void a(f f2) {
        f2.d().clear();
        f2.b();
        if (f2.d().size() > 0) {
            m.add(f2);
        }
        if (f2 instanceof rs.l.e.a) {
            n.add((rs.l.e.a)f2);
        }
        k.add(f2);
    }

    public static void b(f f2) {
        f2.d().clear();
        f2.b();
        if (f2.d().size() > 0) {
            m.add(f2);
        }
        if (f2 instanceof rs.l.e.a) {
            n.add((rs.l.e.a)f2);
        }
        l.add(f2);
    }

    protected void a(int[] nArray, i i2) {
        for (int n2 : nArray) {
            this.p.a(n2, (Object)i2);
        }
    }

    protected void a(int n2, i i2) {
        this.a(new int[]{n2}, i2);
    }

    public void a(Client client, a a2) {
        if (this.a(client)) {
            this.q = true;
            this.b(client, a2);
        } else {
            this.q = false;
        }
    }

    public abstract void b();

    public abstract boolean a(Client var1);

    public abstract void b(Client var1, a var2);

    public abstract void c();

    public cc<i> d() {
        return this.p;
    }

    public boolean e() {
        return this.q;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = rs.l.e.f$a.a();
        }
    }
}

