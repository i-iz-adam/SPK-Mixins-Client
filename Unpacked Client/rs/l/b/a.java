/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b;

import java.awt.Graphics;
import rs.Client;
import rs.a.h;
import rs.f.a;
import rs.gui.Launcher;
import rs.l.b.b;
import rs.l.c;
import rs.l.c_0;
import rs.l.e.f;
import rs.l.e_0;
import rs.l.f_0;
import rs.l.q;
import rs.n.c.ac_0;
import rs.n.c.f;
import rs.n.e;
import rs.runelite.events.GameStateChanged;

public class a {
    public static boolean a = true;
    public static boolean b = false;
    public static int c = 0;
    public static int d = 0;
    private static long e = System.currentTimeMillis();
    private static int f = 0;

    public static void a(Client client) {
        boolean bl;
        block54: {
            Graphics graphics;
            int n2;
            block56: {
                block55: {
                    rs.l.f.e.d().b();
                    q.a(!rs.l.b.a.b());
                    client.ez = -1;
                    if (!rs.l.b.a.b()) break block54;
                    if (client.ck != 0) {
                        client.ck = 0;
                    }
                    if (!b) break block55;
                    if (d != Client.ah) break block55;
                    if (c == Client.ai) break block56;
                }
                if (rs.f.a.ai == a.c.a) {
                    Client.aj = Client.ai;
                    Client.ak = Client.ah;
                    client.i();
                    client.j();
                }
                c = Client.ai;
                d = Client.ah;
                client.gZ = new c_0(Client.ai, Client.ah, client.B());
                client.gZ.a();
                b = true;
            }
            if (rs.l.b.a.a()) {
                return;
            }
            if (Client.ee == 2) {
                int n3;
                if (Client.cH != -1) {
                    client.j(client.dE, Client.cH);
                }
                if (!rs.l.b.a.a()) {
                    ++Client.gg;
                }
                int n4 = e_0.A;
                h.bt = true;
                h.bw = 0;
                h.bu = Client.hP + (Client.aj() ? 4 : 0);
                h.bv = Client.hQ + (Client.aj() ? 4 : 0);
                rs.l.c.d();
                if (rs.k.e.a()) {
                    client.b.a();
                }
                client.gZ.a();
                client.dF.d();
                client.ga = true;
                rs.l.e.f.o = 0;
                for (rs.l.e.f f2 : rs.l.e.f.k) {
                    f2.a(client, f.a.a);
                }
                n2 = rs.k.e.a() ? 0 : 0;
                int n5 = n3 = rs.k.e.a() ? 0 : 0;
                client.a(0, Client.aj() ? n2 : Client.ai / 2 - 356, rs.n.e.H[Client.cH], Client.aj() ? n3 : Client.ah / 2 - 255);
                client.f(n4);
                rs.l.e.f.o = 0;
                for (rs.l.e.f f3 : rs.l.e.f.k) {
                    f3.a(client, f.a.b);
                }
                rs.l.e.f.o = 0;
                for (rs.l.e.f f3 : rs.l.e.f.l) {
                    f3.a(client, f.a.b);
                }
                if (Client.w.b) {
                    Client.w.b();
                }
                if (!Client.dj) {
                    client.H();
                    client.X();
                } else {
                    client.b(0, 0);
                }
                client.dE = 0;
                q.d();
                rs.l.f.e.d().a(rs.l.f.a.A);
            }
            ++client.ck;
            Graphics graphics2 = graphics = rs.k.e.a() ? client.B().getGraphics() : client.hG;
            if (client.gZ != null && graphics != null) {
                client.gZ.a(client.ae(), client.hG, client.af());
                if (rs.k.e.a()) {
                    n2 = client.ak();
                    client.p(0);
                    client.a.g();
                    client.p(n2);
                }
            }
            rs.l.f.e.d().c();
            return;
        }
        if (b) {
            if (rs.f.a.ai == a.c.a) {
                Client.aj = 512;
                Client.ak = 334;
                client.i();
                client.j();
            }
            b = false;
        }
        if (client.ck != 0) {
            client.ck = 0;
        }
        if (Client.ee < 2) {
            client.a(1, "Loading, please wait..", null);
            client.gZ.a(0, client.hG, 0);
            if (rs.k.e.a()) {
                client.a.b(false);
            }
            return;
        }
        if (!client.cd) {
            if (rs.k.e.a()) {
                rs.k.e cfr_ignored_0 = client.a;
                rs.k.e.a(true);
                if (rs.k.b.i && rs.k.b.g != 0 && rs.k.b.h != 0 && !Client.ai()) {
                    rs.k.b.f();
                }
            }
            client.cd = true;
            GameStateChanged gameStateChanged = new GameStateChanged();
            gameStateChanged.setGameState(rs.runelite.a.c.g);
            client.p.post(gameStateChanged);
        }
        if (client.ga) {
            client.ga = false;
            Client.fM = true;
            Client.eM = true;
            if (Client.ee != 2) {
                // empty if block
            }
        }
        if (client.fu != -1) {
            client.j(client.dE, client.fu);
        }
        if (Client.ee == 2) {
            e_0.x = client.bx;
        }
        client.Q();
        if (client.gp == -1) {
            int n6;
            client.eu.V = Client.fA - Client.eD - 110;
            if (Client.hP >= 496) {
                if (Client.hP <= 511) {
                    if (Client.hQ > (rs.f.a.ai == a.c.a ? 345 : Client.ah - 158)) {
                        client.a(494, 110, Client.hP, Client.hQ - (rs.f.a.ai == a.c.a ? 345 : Client.ah - 158), client.eu, 0, false, Client.fA);
                    }
                }
            }
            if ((n6 = Client.fA - 110 - client.eu.V) < 0) {
                n6 = 0;
            }
            if (n6 > Client.fA - 110) {
                n6 = Client.fA - 110;
            }
            if (Client.eD != n6) {
                Client.eD = n6;
                Client.fM = true;
            }
        }
        if (client.gp != -1 && !rs.n.c.f.c && client.gp == 35112) {
            rs.n.c.f.c = true;
            rs.n.e.H[39002].E = ac_0.c;
        }
        if (client.gp != -1 && (bl = client.j(client.dE, client.gp))) {
            Client.fM = true;
        }
        if (client.fX == 3) {
            Client.fM = true;
        }
        if (client.eA == 3) {
            Client.fM = true;
        }
        if (client.cD != null) {
            Client.fM = true;
        }
        if (Client.dj && client.dH == 2) {
            Client.fM = true;
        }
        if (q.c()) {
            Client.fM = true;
        }
        if (Client.fM) {
            client.g();
            Client.fM = false;
        }
        if (Client.ee == 2) {
            rs.l.b.c.a(client);
        } else {
            client.Y();
        }
        if (!client.ai()) {
            if (rs.l.b.b.a == null || rs.l.b.b.b == null) {
                rs.l.b.b.a = new f_0("gameframe/backleft1");
                rs.l.b.b.b = new f_0("gameframe/backtop1");
            }
            rs.l.b.b.a.f(0, 4);
            rs.l.b.b.b.f(-4, 0);
        }
        if (client.er != -1) {
            Client.eM = true;
        }
        if (Client.eM) {
            if (client.er != -1) {
                if (client.er == Client.fL) {
                    client.er = -1;
                    Client.fv.a(120);
                    Client.fv.b(Client.fL);
                }
            }
            Client.eM = false;
        }
        client.dE = 0;
        q.d();
        rs.l.f.e.d().a(rs.l.f.a.A);
        client.gZ.a(client.ae(), client.hG, client.af());
        if (rs.k.e.a()) {
            client.a.g();
        }
        rs.l.f.e.d().c();
    }

    public static boolean a() {
        if (!Launcher.n().o().au()) {
            return false;
        }
        return !Launcher.n().o().bb();
    }

    public static boolean b() {
        if (!a) {
            return false;
        }
        return Client.cH > 0 && rs.n.e.H[Client.cH].bp;
    }
}

