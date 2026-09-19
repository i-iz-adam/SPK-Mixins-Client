/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e.a;

import rs.Client;
import rs.f.a;
import rs.l.e.f;

public class e
extends f {
    @Override
    public void b() {
    }

    @Override
    public void b(Client client, f.a a2) {
        if (a2 != f.a.b) {
            return;
        }
        int n2 = 375;
        int n3 = 20;
        if (rs.f.a.ai == a.c.b) {
            n2 = 200 + (Client.ai - 560);
            n3 = 25;
        }
        if (rs.l.e.f.a.e() || rs.l.e.f.e.e() || rs.l.e.f.f.e() || rs.l.e.f.g.e()) {
            n3 += 80 + (rs.f.a.ai == a.c.b ? 20 : 0);
        }
        int n4 = Client.eh + (Client.eR.ac - 6 >> 7);
        int n5 = Client.ei + (Client.eR.ad - 6 >> 7);
        client.gn.b("Coords: @gre@" + n4 + ", " + n5, n2, n3, 0xFFFF00, 0);
        int n6 = n4 >> 6;
        int n7 = n5 >> 6;
        int n8 = n6 * 256 + n7;
        client.gn.b("Region ID: @whi@" + n8, n2, n3 += 15, 0xFFFF00, 0);
    }

    @Override
    public boolean a(Client client) {
        return rs.f.a.ao;
    }

    @Override
    public void c() {
    }
}

