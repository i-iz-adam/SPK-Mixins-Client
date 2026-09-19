/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e.a;

import rs.Client;
import rs.d.k;
import rs.f.a;
import rs.l.c;
import rs.l.e.a.g;
import rs.l.e.f;
import rs.q.a.a.a;

public class f
extends rs.l.e.f {
    public static int p = 0;
    public static int q = 0;
    public static String r = null;
    public static final a s = new g();

    @Override
    public void b() {
        this.f();
    }

    @Override
    public boolean a(Client client) {
        return Client.cH == 31244;
    }

    @Override
    public void b(Client client, f.a a2) {
        if (a2 != f.a.b) {
            return;
        }
        if (p == 0 || q == 0) {
            return;
        }
        if (r == null) {
            r = rs.d.k.f((int)rs.l.e.a.f.q).w;
        }
        if (Client.br != 49991) {
            return;
        }
        int n2 = 1;
        int n3 = 220;
        int n4 = 37;
        int n5 = Client.hP - n3 / 2 + 5;
        int n6 = Client.hQ - n4 + 3;
        if (rs.f.a.ai == a.c.a && n5 > 288) {
            n5 = 288;
        }
        rs.l.c.d(n5 - n2, n3 + n2 * 2, n4 + n2 * 2, 2367511, n6 - 15 - n2);
        rs.l.c.b(n4, n6 - 15, n5, 1595156, n3, 200);
        Client.gl.b("You have a @gre@" + p + "% @whi@chance to save ingredients", n5 + 2, n6, 0xFFFFFF, 0);
        Client.gl.b("on failed attempts @or2@(consumes on save!)", n5 + 2, n6 + 16, 0xFFFFFF, 0);
        n4 = 17;
        rs.l.c.d(n5 - n2, n3 + n2 * 2, n4 + n2 * 2, 2367511, (n6 -= 17) - 15 - n2);
        rs.l.c.b(n4, n6 - 15, n5, 1595156, n3, 200);
        rs.d.k.a(q, 1, 32, 25).e(n5 - 4, n6 - 23, 0);
        Client.gl.b("@or1@" + r, n5 + 25, n6 - 1, 0xFFFFFF, 0);
    }

    @Override
    public void c() {
        this.f();
    }

    public void f() {
        q = 0;
        p = 0;
        r = null;
    }
}

