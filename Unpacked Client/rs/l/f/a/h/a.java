/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.h;

import rs.Client;
import rs.l.f.b;

public class a
extends b {
    private String e = null;
    private String f = null;
    private String g = null;
    private String h = null;
    private String i = null;
    private String j = null;
    private String k = null;
    private String l = null;
    private String m = null;
    private String n = null;
    private String o = null;
    private String p = null;

    public a() {
        this.a(rs.l.f.a.p);
    }

    @Override
    public void a() {
        a a2 = this;
        int n2 = a2.a.ai() ? Client.aj - 780 : 0;
        a a3 = this;
        int n3 = a3.a.ai() ? Client.ak - 503 : 0;
        boolean bl = false;
        boolean bl2 = System.currentTimeMillis() - this.a.z.w < 20000L;
        int n4 = 13;
        if (Client.cH == -1) {
            if (bl2) {
                a a4 = this;
                n4 = 50 + (a4.a.ai() ? 0 : 4);
            } else if (this.a.eV >= 2 || this.a.gr > 0 || this.a.eW > 0) {
                n4 = 13;
            }
        }
        if (Client.aj() && this.a.v.h() && !this.a.f()) {
            n3 += 135;
        }
        if (this.e != null) {
            this.a.gm.a(this.e, 512 + n2, bl ? 75 : 20, 0xFFFF00, 0);
        }
        if (this.f != null) {
            this.a.gm.a(this.f, 512 + n2, (bl ? 75 : 20) + 17, 0xFFFF00, 0);
        }
        if (this.g != null) {
            this.a.gm.a(this.g, 512 + n2, (bl ? 75 : 20) + 17 + 17, 0xFFFF00, 0);
        }
        if (this.n != null) {
            this.a.gm.a(this.n, 512, 330 + n3, 0xFFFF00, 0);
        }
        if (this.o != null) {
            this.a.gm.a(this.o, 512, 313 + n3, 0xFFFF00, 0);
        }
        if (this.p != null) {
            this.a.gm.a(this.p, 512, 296 + n3, 0xFFFF00, 0);
        }
        if (this.k != null) {
            this.a.gm.b(this.k, 10, 330 + n3, 0xFFFF00, 0);
        }
        if (this.l != null) {
            this.a.gm.b(this.l, 10, 313 + n3, 0xFFFF00, 0);
        }
        if (this.m != null) {
            this.a.gm.b(this.m, 10, 296 + n3, 0xFFFF00, 0);
        }
        if (this.h != null) {
            this.a.gm.b(this.h, 10, 20 + n4, 0xFFFF00, 0);
        }
        if (this.i != null) {
            this.a.gm.b(this.i, 10, 37 + n4, 0xFFFF00, 0);
        }
        if (this.j != null) {
            this.a.gm.b(this.j, 10, 54 + n4, 0xFFFF00, 0);
        }
    }

    public void k() {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override
    public void c() {
        super.c();
        this.k();
    }

    public String l() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
    }

    public String m() {
        return this.f;
    }

    public void b(String string) {
        this.f = string;
    }

    public String n() {
        return this.g;
    }

    public void c(String string) {
        this.g = string;
    }

    public String o() {
        return this.h;
    }

    public void d(String string) {
        this.h = string;
    }

    public String p() {
        return this.i;
    }

    public void e(String string) {
        this.i = string;
    }

    public String q() {
        return this.j;
    }

    public void f(String string) {
        this.j = string;
    }

    public String r() {
        return this.k;
    }

    public void g(String string) {
        this.k = string;
    }

    public String s() {
        return this.l;
    }

    public void h(String string) {
        this.l = string;
    }

    public String t() {
        return this.m;
    }

    public void i(String string) {
        this.m = string;
    }

    public String u() {
        return this.n;
    }

    public void j(String string) {
        this.n = string;
    }

    public String v() {
        return this.o;
    }

    public void k(String string) {
        this.o = string;
    }

    public String w() {
        return this.p;
    }

    public void l(String string) {
        this.p = string;
    }
}

