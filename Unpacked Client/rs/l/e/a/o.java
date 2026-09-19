/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e.a;

import rs.Client;
import rs.f.a;
import rs.l.c;
import rs.l.e.a.p;
import rs.l.e.f;
import rs.l.e.i;
import rs.l.f_0;
import rs.l.h;
import rs.n.e;

public class o
extends f {
    private static final String O = "HG";
    private static final String P = "<img=79> @gre@H'ween Hunger Games Lobby <img=79>";
    private static final String Q = "<img=244> @gr1@(There must be 5-15 players for a match to start) <img=244>";
    private static final String R = "<img=233>";
    private static final String S = "<img=121>";
    private static final String T = "@or1@Next event: @whi@<img=230>";
    private static final String U = "@or1@Next power-up: @whi@<img=231>";
    private static final String V = "@gre@Ceasefire time: <img=37>";
    private static final String W = "<img=91> @lre@Players can't fight yet";
    private static final String X = "<img=246> @gre@Players can open chests!";
    private static final String Y = "@cya@Safety Countdown: <img=37>";
    private static final String Z = "<img=91> @lre@Players can't fight yet";
    private static final String aa = "<img=247> @lre@Players can't open chests yet";
    private static final String ab = "@or1@Match Type:";
    public static String p = "";
    public static String q = "";
    public static String r = "";
    public static String s = "@whi@Wins: 0 | Matches: 0 | Points: 0";
    public static String t = "";
    public static String u = "";
    public static final String v = "...";
    public static final String w = "...";
    public static long x = 0L;
    public static long y = 0L;
    public static long z = 0L;
    public static boolean A = false;
    public static boolean B = false;
    public static int C = 0;
    public static final int D = 135;
    public static boolean E = false;
    public static int F = -1;
    public static long G = 0L;
    public static long H = 0L;
    public static int I = 0;
    public static String J = "Match Style: @gre@N/A";
    public static String K = "";
    public static String L = "";
    public static String M = "";
    public static f_0 N;

    @Override
    public void b() {
        N = new f_0("popups/cancel");
        this.a(new int[]{18032, 18033, 18034, 18041, 18042, 18043, 18044}, (i)new p(this));
    }

    @Override
    public void b(Client client, f.a a2) {
        if (a2 == f.a.a) {
            if (B && !client.aJ) {
                int n2 = rs.f.a.ai == a.c.b ? 180 : 10;
                client.gm.c("<img=50> You're in the fog! Go to the <img=73> Safe Zone, south of the map! <img=50>", 256, Client.ak - n2, 0xFFFFFF, 0);
                rs.l.c.b(Client.ak, 0, 0, 15282688, Client.aj, 60);
            }
            if (Client.ed == 197 && rs.n.e.H[199].at.contains(O)) {
                this.d(client);
            }
            return;
        }
        if (client.aJ) {
            this.b(client);
        } else if (Client.ed == 197 && rs.n.e.H[199].at.contains(O)) {
            this.c(client);
        }
    }

    @Override
    public boolean a(Client client) {
        return client.aJ || Client.ed == 197 && rs.n.e.H[199].at.contains(O);
    }

    public void b(Client client) {
        int n2 = 120;
        int n3 = 15;
        if (rs.f.a.ai == a.c.b) {
            n3 = 5;
            n2 = Client.aj / 2 - 150;
        }
        int n4 = rs.l.h.ap;
        int n5 = 125;
        rs.l.c.b(60, n3, n2, 4884594, 300, n5);
        rs.l.c.b(58, n3 + 1, n2 + 1, 4863488, 298, n5);
        client.gm.c(r, n2 + 150, n3 + 18, 0xFFFFFF, 0);
        Client.gl.c(Q, n2 + 150, n3 + 35, 0xFFFFFF, 0);
        Client.gl.c(s, n2 + 150, n3 + 53, 0xFFFFFF, 0);
        rs.l.h.ap = n4;
    }

    public void c(Client client) {
        int n2 = 397;
        int n3 = 2;
        if (rs.f.a.ai == a.c.b) {
            n2 = 200 + (Client.ai - 560);
            n3 = 25;
        }
        rs.l.c.b(41, n3, n2, 12884294, 113, 50);
        rs.l.c.b(35, n3 + 3, n2 + 3, 4863488, 107, 100);
        Client.gl.b(R, n2 + 9, n3 + 17, 0xFFFFFF, 0);
        Client.gl.b(S, n2 + 8, n3 + 18 + 14 + 1, 0xFFFFFF, 0);
        Client.gl.b(t, n2 + 8 + 17, n3 + 17 + 1, 0xFFFFFF, 0);
        Client.gl.b(u, n2 + 8 + 17, n3 + 18 + 14 + 1, 0xFFFFFF, 0);
        if (!A) {
            return;
        }
        if (C <= 1) {
            client.gm.a(C == 0 ? Y : V, n2 + 110 - 15, n3 + 55, 0xFFFFFF, 0);
            long l2 = (z - System.currentTimeMillis()) / 1000L;
            if (l2 < 0L) {
                l2 = 0L;
            }
            if (F == C) {
                this.f();
                ++F;
            }
            client.gm.b("" + l2, n2 + 97, n3 + 55, 0xFFFFFF, 0);
            Client.gl.a(C == 0 ? aa : X, n2 + 110, n3 + 55 + 16, 0xFFFFFF, 0);
            Client.gl.a(C == 0 ? "<img=91> @lre@Players can't fight yet" : "<img=91> @lre@Players can't fight yet", n2 + 110, n3 + 55 + 16 + 16, 0xFFFFFF, 0);
        } else {
            long l3;
            Client.gl.a(T, n2 + 110 - 15, n3 + 54, 0xFFFFFF, 0);
            if (x > System.currentTimeMillis()) {
                l3 = (x - System.currentTimeMillis()) / 1000L;
                Client.gl.b("" + l3, n2 + 97, n3 + 54, 0xFFFFFF, 0);
            } else {
                Client.gl.b("...", n2 + 97, n3 + 54, 0xFFFFFF, 0);
            }
            Client.gl.a(U, n2 + 110 - 15, n3 + 54 + 15, 0xFFFFFF, 0);
            if (y > System.currentTimeMillis()) {
                l3 = (y - System.currentTimeMillis()) / 1000L;
                Client.gl.b("" + l3, n2 + 97, n3 + 55 + 15, 0xFFFFFF, 0);
            } else {
                Client.gl.b("...", n2 + 97, n3 + 55 + 15, 0xFFFFFF, 0);
            }
        }
    }

    public void d(Client client) {
        int n2 = 397;
        int n3 = 2;
        if (rs.f.a.ai == a.c.b) {
            n2 = 200 + (Client.ai - 560);
            n3 = 25;
        }
        if (I > 0 || E) {
            long l2;
            if (E) {
                if ((I += 2) >= 135) {
                    E = false;
                }
            } else {
                if (H == 0L) {
                    H = System.currentTimeMillis() + G;
                }
                if (System.currentTimeMillis() > H) {
                    --I;
                }
            }
            if (I <= 0) {
                I = 0;
            }
            if (I > 135) {
                I = 135;
            }
            n2 = 120;
            n3 = 250;
            if (rs.f.a.ai == a.c.b) {
                n3 = 300;
                n2 = Client.aj / 2 - 150;
            }
            if ((l2 = (z - System.currentTimeMillis()) / 1000L) < 0L) {
                l2 = 0L;
            }
            if (C == 0) {
                K = "<img=49> @gre@Safety Countdown <img=49>";
                L = "Contestants can not fight or open chests yet!";
                M = "<img=247> @yel@Chests unlock in " + l2 + " seconds! <img=247>";
            }
            if (C == 1) {
                K = "<img=73> @gre@Ceasefire Stage <img=73>";
                L = "@yel@Contestants can now safely loot chests!";
                M = "<img=50> @or1@PvP enables in " + l2 + " seconds! <img=50>";
            }
            rs.l.c.b(65, n3, n2, 12884294, 300, I);
            rs.l.c.b(59, n3 + 3, n2 + 3, 4863488, 294, I);
            int n4 = rs.l.h.ap;
            rs.l.h.ap = (int)((double)I * 1.5);
            if (rs.l.h.ap > 255) {
                rs.l.h.ap = 255;
            }
            client.gn.c(K, n2 + 150, n3 + 20, 0xFFFFFF, 0);
            client.gm.c(L, n2 + 150, n3 + 3 + 34, 0xFFFFFF, 0);
            client.gm.c(M, n2 + 150, n3 + 3 + 51, 0xFFFFFF, 0);
            rs.l.h.ap = n4;
        }
    }

    @Override
    public void c() {
    }

    private void f() {
        E = true;
        G = 3500L;
        H = 0L;
    }
}

