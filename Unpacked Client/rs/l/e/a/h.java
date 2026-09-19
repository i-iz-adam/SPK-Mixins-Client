/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e.a;

import java.util.HashMap;
import java.util.Map;
import rs.Client;
import rs.f.a;
import rs.l.a.b;
import rs.l.c;
import rs.l.e.a.j;
import rs.l.e.f;
import rs.l.e.i;
import rs.l.f_0;
import rs.n.e;
import rs.q.a.a.a;

public class h
extends f {
    public static final int p = 2;
    private static f_0 E;
    private static f_0 F;
    public static boolean q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static int z;
    public static String A;
    public static String B;
    private static int G;
    public static final Map<Integer, Boolean> C;
    public static final a D;
    private static final String H = "@yel@?";
    private static final String I = "None";

    @Override
    public void b() {
        E = new f_0("fountain/event 3");
        F = new f_0("fountain/event 4");
        this.a(60612, (i)new j(this));
    }

    @Override
    public boolean a(Client client) {
        return Client.cH == 60600;
    }

    @Override
    public void b(Client client, f.a a2) {
        if (a2 == f.a.b) {
            int n2;
            int n3;
            int n4;
            int n5;
            if (G == 0) {
                G = rs.n.e.H[60600].am[5];
            } else {
                rs.n.e.H[60600].am[5] = G;
            }
            int n6 = rs.f.a.ai == a.c.a ? 0 : Client.ai / 2 - 356;
            int n7 = rs.f.a.ai == a.c.a ? 0 : Client.ah / 2 - 230;
            if (!client.ai()) {
                n6 += 4;
                n7 += 4;
            }
            int n8 = 0;
            if (!client.ai() && client.v.h() && !client.f()) {
                n7 += 50;
                n8 = 50;
            }
            if (rs.n.e.H[60612].az[0] <= 0) {
                client.gn.c(H, 408, 266 + n8, 16750623, 1);
                client.gm.c(I, 458, 266 + n8, 16750623, 1);
            } else if (rs.n.e.H[60612].az[1] <= 0) {
                client.gn.c(H, 458 + (rs.f.a.ai == a.c.a ? 0 : Client.ai / 2 - 356), 266 + (rs.f.a.ai == a.c.a ? 0 : Client.ah / 2 - 230) + n8, 16750623, 1);
            }
            if (r == t) {
                n5 = n6;
                n4 = n7;
                n5 = n6 + 20;
                n4 = n7 + 48;
                n3 = 457;
                n2 = 185;
                rs.l.c.a(n5, n4, n3, n2, 0xFF0000, 50);
                Client.gl.c("<img=81> You must roll all the items from the previous tier! <img=81>", n5 + n3 / 2, n4 + n2 / 2 + 85, 16750623, 1);
                n5 = n6 + rs.n.e.H[60600].am[2];
                n4 = n7 + rs.n.e.H[60600].bc[2];
                n3 = 70;
                n2 = 41;
                rs.l.c.a(n5, n4, n3, n2, 0xFF0000, 50);
                if (Client.hP >= n5 && Client.hP <= n5 + n3 && Client.hQ >= n4 && Client.hQ <= n4 + n2) {
                    client.b(Client.hP - 10, Client.hQ - 10, " <img=81> Locked!");
                }
            } else if (r == v) {
                n5 = n6;
                n4 = n7;
                n5 = n6 + 20;
                n4 = n7 + 48;
                n3 = 457;
                n2 = 185;
                rs.l.c.a(n5, n4, n3, n2, 65280, 20);
                if (s == 2) {
                    rs.n.e.H[60600].am[5] = G + 4;
                    Client.gl.c("@gre@Congratulations! You've completed the entire event!", n5 + n3 / 2, n4 + n2 / 2 + 85, 16750623, 1);
                } else {
                    Client.gl.c("<img=46> @gre@You've completed this tier of the event! <img=46>", n5 + n3 / 2, n4 + n2 / 2 + 85, 16750623, 1);
                }
            } else {
                n5 = n6 + rs.n.e.H[60600].am[2];
                n4 = n7 + rs.n.e.H[60600].bc[2];
                n3 = 70;
                n2 = 41;
                if (Client.hP >= n5 && Client.hP <= n5 + n3 && Client.hQ >= n4 && Client.hQ <= n4 + n2) {
                    client.b(Client.hP - 10, Client.hQ - 10, B);
                }
            }
            if (w > y) {
                y += 5;
            }
            if (w < y) {
                y = w;
            }
            n5 = y == x ? 65280 : 0xFFC000;
            n4 = y == x ? 150 : 200;
            rs.l.c.a(n6 + 192, n7 + 288, y, z, n5, n4);
            Client.gl.c(A, n6 + 335, n7 + 299, 0, -1);
            n3 = n6 + rs.n.e.H[60600].am[17];
            n2 = n7 + rs.n.e.H[60600].bc[17];
            if (r == v) {
                int n9 = 34;
                int n10 = 32;
                rs.l.c.a(n3, n2, n9, n10, 65280, 25);
            } else {
                int n11 = 125;
                rs.l.a.b.a.a(n3 - 5, n2, n11);
                rs.l.a.b.a.a(n3 - 5, n2 + 2 + 15, n11);
                rs.l.a.b.a.a(n3 + 25, n2, n11);
                rs.l.a.b.a.a(n3 + 25, n2 + 2 + 15, n11);
            }
        }
    }

    @Override
    public void c() {
        C.clear();
        q = false;
    }

    static /* synthetic */ f_0 f() {
        return E;
    }

    static /* synthetic */ f_0 g() {
        return F;
    }

    static {
        t = 0;
        u = 1;
        v = 2;
        x = 285;
        y = 0;
        z = 13;
        A = "";
        B = "";
        G = 0;
        C = new HashMap<Integer, Boolean>();
        D = new rs.l.e.a.i();
    }
}

