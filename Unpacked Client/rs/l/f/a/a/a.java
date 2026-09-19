/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.a;

import rs.Client;
import rs.gui.Launcher;
import rs.l.c;
import rs.l.f.a.a.e;

public class a {
    private static final int a = 200;
    private String b;
    private String c;
    private String d;
    private long e;
    private e f;
    private int g = 175;
    private int h = 0;
    private int i = 5;
    private int j = 200;
    private int k = 256;

    public a(String string, String string2, String string3) {
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = System.currentTimeMillis();
        this.f = rs.l.f.a.a.e.a;
        this.g();
    }

    public void a() {
        switch (this.f) {
            case a: {
                this.h();
                break;
            }
            case b: {
                this.i();
            }
        }
        if (rs.f.a.bl) {
            this.j();
        }
    }

    private void g() {
        int n2 = Launcher.n().o().gn.c(this.b) + 12;
        Launcher.n().o();
        int n3 = Client.gl.c(this.c) + 6;
        Launcher.n().o();
        int n4 = Client.gl.c(this.d) + 6;
        int n5 = Math.max(n2, Math.max(n3, n4));
        if (n5 > this.g) {
            this.g = Math.min(n5, 200);
        }
    }

    private void h() {
        int n2 = this.k() - this.g;
        if (!rs.l.b.a.a()) {
            this.h += 4;
        }
        int n3 = this.k() - this.g / 2 - this.h / 2;
        if (this.h >= this.g) {
            this.h = this.g;
            this.f = rs.l.f.a.a.e.b;
        }
    }

    private void i() {
        int n2 = 60;
        int n3 = this.k() - n2;
        if (!rs.l.b.a.a()) {
            this.i += 3;
        }
        if (this.i >= n2) {
            this.i = n2;
            this.f = rs.l.f.a.a.e.c;
        }
    }

    private void j() {
        int n2 = this.k() - this.h / 2;
        int n3 = this.l() - this.i / 2;
        this.a(n2, n3, this.h, this.i);
        if (this.i >= 20) {
            Launcher.n().o().gn.d(this.b, n2 + this.h / 2, n3 + 15, 16750623, 0, this.k);
            rs.l.c.d(n2, n3 + 20, this.h, 2, 2367511, this.j);
        }
        if (this.i >= 30) {
            Launcher.n().o();
            Client.gl.d(this.c, n2 + this.h / 2, n3 + 37, 16750623, 0, this.k);
        }
        if (this.i >= 60) {
            Launcher.n().o();
            Client.gl.d(this.d, n2 + this.h / 2, n3 + 54, 0xFFFFFF, 0, this.k);
        }
        if (this.m() >= 3 && !rs.l.b.a.a()) {
            this.j -= 3;
            this.k -= 3;
            if (this.j <= 1) {
                this.j = 1;
            }
            if (this.k <= 1) {
                this.k = 1;
            }
        }
    }

    private int k() {
        return Client.aj / 2;
    }

    private int l() {
        return 40;
    }

    private void a(int n2, int n3, int n4, int n5) {
        int n6 = 3681824;
        int n7 = 5918522;
        int n8 = 2367511;
        rs.l.c.b(n5, n3, n2, n6, n4, this.j);
        rs.l.c.e(n2, n4, n5, n8, n3, this.j);
        int n9 = 1;
        rs.l.c.e(n2 - n9, n4 + n9 * 2, n5 + n9 * 2, n7, n3 - n9, this.j);
    }

    private int m() {
        return (int)((System.currentTimeMillis() - this.e) / 1000L);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public long e() {
        return this.e;
    }

    public void a(long l2) {
        this.e = l2;
    }

    public e f() {
        return this.f;
    }
}

