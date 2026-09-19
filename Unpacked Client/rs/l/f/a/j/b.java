/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.j;

import rs.Client;
import rs.d.k;
import rs.l.f.a;
import rs.l.f_0;

public class b
extends rs.l.f.b {
    private rs.l.f.a.j.a f;
    private String[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    public f_0[] e = null;
    private int[] l = null;
    private long m;
    private int n = 1;
    private String o = "";
    private final long p = 200L;

    public b() {
        this.a(rs.l.f.a.A);
    }

    @Override
    public void a() {
        if (this.f == null) {
            rs.s.s.b.f();
        }
        if (this.f != null) {
            this.b(this.f);
        }
        this.n();
    }

    public void a(rs.l.f.a.j.a a2) {
        this.f = a2;
    }

    public void a(String string, boolean bl) {
        this.f = new rs.l.f.a.j.a(string, bl);
    }

    private void b(rs.l.f.a.j.a a2) {
        int n2;
        if (a2.a() == null) {
            return;
        }
        this.h = Client.hP;
        this.i = Client.hQ + 20;
        Object object = a2.a();
        if (!((String)object).endsWith("\n")) {
            object = (String)object + "\n";
        }
        this.g = ((String)object).split("\n");
        this.k();
        b b2 = this;
        int n3 = b2.a.ai() ? Client.aj - 250 : Client.aj;
        b b3 = this;
        int n4 = n2 = b3.a.ai() ? Client.ak - 176 : 363;
        if (this.h >= n3) {
            this.h = Client.ai - this.j;
            this.h -= this.h + this.j - Client.hP;
        }
        if (this.i >= n2) {
            this.i = Client.ah - this.k;
            this.i -= this.i + this.k - Client.hQ + 20;
        }
        this.a(this.h, this.i, this.j, this.k);
        if (a2.e()) {
            this.a.aU.c(this.h + this.j - 14, this.i + 3);
        }
        this.i += 14;
        for (int i2 = 0; i2 < this.g.length; ++i2) {
            if (i2 == 0 && this.g[i2].startsWith(" 1 ")) {
                this.g[i2] = this.g[i2].substring(2);
            }
            if (i2 == 0 && a2.b()) {
                Client.gl.b(this.g[i2], this.h, this.i, 16760156, 0);
            } else {
                Client.gl.b(" " + this.g[i2], this.h, this.i, 0xFFFFFF, 0);
            }
            this.i += 16;
        }
        if (a2.d() != null) {
            this.l();
        }
        if (a2.c() != null) {
            this.m();
        }
    }

    private void k() {
        this.k = this.g.length * 16 + 3;
        this.j = 0;
        for (int i2 = 0; i2 < this.g.length; ++i2) {
            this.j = Math.max(this.j, (int)Math.floor(Client.gl.a(this.g[i2], true)) + 10);
        }
        if (this.f.c() != null && this.j < 150) {
            this.j = 150;
        }
        if (this.f.d() != null) {
            if (this.j < 141) {
                this.j = 141;
            }
            if (this.k < 179) {
                this.k = 179;
            }
        }
    }

    private void l() {
        int n2 = 15;
        boolean bl = false;
        this.i -= this.k - 3;
        Client.gl.c(this.f.d()[1].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + n2, this.i + 32, 0xFFFFFF, 0);
        Client.gl.c(this.f.d()[6].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + n2, this.i + 32, 0xFFFFFF, 0);
        Client.gl.c(this.f.d()[2].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + n2, this.i + 48, 0xFFFFFF, 0);
        Client.gl.c(this.f.d()[7].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + n2, this.i + 48, 0xFFFFFF, 0);
        Client.gl.c(this.f.d()[3].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + n2, this.i + 65, 0xFFFFFF, 0);
        Client.gl.c(this.f.d()[8].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + n2, this.i + 65, 0xFFFFFF, 0);
        Client.gl.c(this.f.d()[4].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + n2, this.i + 81, 0xFFFFFF, 0);
        Client.gl.c(this.f.d()[9].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + n2, this.i + 81, 0xFFFFFF, 0);
        Client.gl.c(this.f.d()[5].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + n2, this.i + 97, 0xFFFFFF, 0);
        Client.gl.c(this.f.d()[10].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + n2, this.i + 97, 0xFFFFFF, 0);
    }

    private void m() {
        int n2;
        int[] nArray = this.f.c();
        int n3 = 3;
        n3 = this.j / 40;
        if (n3 < 3) {
            n3 = 3;
        }
        if (this.e == null || !this.o.equals(this.f.a()) || System.currentTimeMillis() - this.m >= 200L) {
            this.e = new f_0[n3];
            this.l = new int[n3];
            if (this.n >= nArray.length) {
                this.n = 1;
            }
            n2 = this.n;
            for (int i2 = 0; i2 < n3; ++i2) {
                if (n2 >= nArray.length) {
                    n2 = 0;
                }
                this.e[i2] = rs.d.k.a(nArray[n2], 0, 0, 32);
                this.l[i2] = nArray[n2];
                ++n2;
            }
            this.o = this.f.a();
            ++this.n;
            this.m = System.currentTimeMillis();
        }
        this.i -= 10;
        this.a(this.h, this.i - 1, this.j, 32, rs.s.s.b.p, rs.s.s.b.r, rs.s.s.b.q);
        if (this.e != null) {
            for (n2 = 0; n2 < this.e.length; ++n2) {
                if (this.e[n2] == null) {
                    this.e[n2] = rs.d.k.a(this.l[n2], 0, 0, 32);
                }
                if (this.e[n2] == null) continue;
                this.e[n2].f(20 + this.h + n2 * 35, this.i);
            }
        }
    }

    private void n() {
        this.f = null;
    }
}

