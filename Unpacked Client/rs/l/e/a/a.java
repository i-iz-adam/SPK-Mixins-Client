/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e.a;

import rs.Client;
import rs.f.a;
import rs.l.e.a.b;
import rs.l.e.f;

public class a
extends f {
    public boolean p = false;
    public int q;
    public String r = "";
    public int s;
    public String t = "";
    public int u;
    public String v;
    public static rs.q.a.a.a w = new b();

    @Override
    public void b() {
        this.r = "Killcount: @yel@" + this.q;
        this.t = "Drop rate: @gre@+" + this.s + "%";
        this.v = "Essence bonus: @gre@+" + this.u + "%";
    }

    @Override
    public boolean a(Client client) {
        return this.p;
    }

    @Override
    public void b(Client client, f.a a2) {
        if (a2 == f.a.a) {
            return;
        }
        int n2 = 397;
        int n3 = 2;
        if (rs.f.a.ai == a.c.b) {
            n2 = 200 + (Client.ai - 560);
            n3 = 25;
        }
        Client.gl.a(this.r, n2 + 110, n3 + 17 + 1, 0xFFFFFF, 0);
        Client.gl.a(this.t, n2 + 110, n3 + 17 + 15 + 1, 0xFFFFFF, 0);
        Client.gl.a(this.v, n2 + 110, n3 + 17 + 15 + 15 + 1, 0xFFFFFF, 0);
    }

    @Override
    public void c() {
        this.p = false;
    }
}

