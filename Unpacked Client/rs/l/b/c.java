/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b;

import java.awt.Graphics2D;
import rs.Client;
import rs.a.h;
import rs.c_0;
import rs.l.b.a;
import rs.l.b.b;
import rs.l.e.j;
import rs.l.e.n;
import rs.l.e_0;
import rs.n.e;

public class c {
    public static void a(Client client) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        ++Client.gf;
        if (!a.a()) {
            ++Client.gg;
        }
        client.e(true);
        client.d(true);
        client.e(false);
        client.d(false);
        client.r();
        client.R();
        if (!client.fe) {
            n8 = client.fs;
            if (client.dQ / 256 > n8) {
                n8 = client.dQ / 256;
            }
            if (client.dh[4] && client.fy[4] + 128 > n8) {
                n8 = client.fy[4] + 128;
            }
            n7 = client.ft + client.dp & 0x7FF;
            n6 = -50;
            n5 = 200;
            if (Client.al < n5) {
                n6 -= (n5 - Client.al) / 5;
            }
            client.b(Client.al + n8 * 3, n8, client.eb, client.c(Client.dw, Client.eR.ad, Client.eR.ac) + n6, n7, client.ec);
        }
        n8 = !client.fe ? client.U() : client.V();
        n7 = Client.cJ;
        n6 = Client.cK;
        n5 = Client.cL;
        int n9 = client.cR;
        int n10 = client.cS;
        for (n4 = 0; n4 < 5; ++n4) {
            if (!client.dh[n4]) continue;
            n3 = (int)(Math.random() * (double)(client.dg[n4] * 2 + 1) - (double)client.dg[n4] + Math.sin((double)client.eg[n4] * ((double)client.dy[n4] / 100.0)) * (double)client.fy[n4]);
            if (n4 == 0) {
                Client.cJ += n3;
            }
            if (n4 == 1) {
                Client.cK += n3;
            }
            if (n4 == 2) {
                Client.cL += n3;
            }
            if (n4 == 3) {
                client.cS = client.cS + n3 & 0x7FF;
            }
            if (n4 != 4) continue;
            client.cR += n3;
            if (client.cR < 128) {
                client.cR = 128;
            }
            if (client.cR <= 383) continue;
            client.cR = 383;
        }
        n4 = e_0.A;
        h.bt = true;
        h.bw = 0;
        h.bu = Client.hP;
        h.bv = Client.hQ;
        rs.l.c.d();
        if (rs.k.e.a()) {
            client.b.a();
        }
        n3 = rs.f.a.H;
        if (Client.cH > 0) {
            if (e.l((int)Client.cH).bw) {
                n3 = 0;
            }
        }
        if (n3 != 0) {
            e_0.x = client.bx;
            n2 = Client.aj() ? 4 : 0;
            rs.l.c.c(client.as() + n2, n2, client.at() + n2, n2);
            client.dF.a(Client.cJ, Client.cL, client.cS, Client.cK, n8, client.cR);
            client.gZ.a();
        }
        client.dF.d();
        if (rs.f.a.az && !rs.f.a.ah && !rs.k.e.a()) {
            n2 = 0;
            while (true) {
                if (n2 >= Client.by.length) break;
                if (Client.by[n2].b().size() > 0) {
                    Client.by[n2].a();
                }
                ++n2;
            }
        }
        if (rs.k.e.a()) {
            rs.k.c.c.b();
            c.b(client);
        }
        rs.l.f.e.d().a(rs.l.f.a.n);
        client.o();
        client.t();
        client.f(n4);
        rs.l.f.e.d().a(rs.l.f.a.o);
        b.a(client);
        client.Y();
        client.g();
        client.Q();
        Client.cJ = n7;
        Client.cK = n6;
        Client.cL = n5;
        client.cR = n9;
        client.cS = n10;
        if (Client.cM == -1 || !a.a()) {
            Client.cM = Client.cJ;
            Client.cN = Client.cK;
            Client.cO = Client.cL;
            Client.cP = client.cS;
            Client.cQ = client.cR;
        }
    }

    public static void b(Client client) {
        if (Client.cH != -1) {
            return;
        }
        try {
            boolean bl;
            block18: {
                block17: {
                    block16: {
                        block15: {
                            bl = false;
                            if (Client.ab.d.size() > 0) break block15;
                            if (Client.ab.c.size() <= 0) break block16;
                        }
                        bl = true;
                    }
                    if (Client.aa.c.size() > 0) break block17;
                    if (Client.aa.b.size() <= 0) break block18;
                }
                bl = true;
            }
            if (bl) {
                Graphics2D graphics2D = rs.l.c.a(rs.l.c.g, rs.l.c.h, rs.l.c.i);
                for (int n2 : Client.ab.c.b()) {
                    j j2 = (j)Client.ab.c.b(n2);
                    if (j2.a == null) continue;
                    c_0.a(graphics2D, j2.a, j2.a(), j2.b());
                }
                Object object = Client.aa.c.iterator();
                while (object.hasNext()) {
                    n n3 = (n)object.next();
                    if (n3.a == null) continue;
                    c_0.a(graphics2D, n3.a, n3.b(), n3.c());
                }
                for (n n4 : Client.aa.b.values()) {
                    if (n4.a == null) continue;
                    c_0.a(graphics2D, n4.a, n4.b(), n4.c());
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

