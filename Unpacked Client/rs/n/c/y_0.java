/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.Client;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.c.b;
import rs.n.e;

/*
 * Renamed from rs.n.c.Y
 */
public class y_0
extends c {
    public static final int[] c = new int[]{32001, 32005, 32009, 32015, 32017};
    public static f_0 d;
    public static f_0 e;
    public static int f;

    public static void m(int n2) {
        if (n2 == 32001) {
            y_0.n(n2);
            rs.n.e.H[32014].at = "Achievements";
            Client.eT[2] = 44100;
            Client.fb = true;
            Client.eM = true;
        }
        if (n2 == 32005) {
            y_0.n(n2);
            rs.n.e.H[32014].at = "Account Information";
            Client.eT[2] = 638;
            Client.fb = true;
            Client.eM = true;
        }
        if (n2 == 32009) {
            y_0.n(n2);
            rs.n.e.H[32014].at = "Knowledgebase";
            Client.eT[2] = 64600;
            Client.fb = true;
            Client.eM = true;
        }
        if (n2 == 32015) {
            y_0.n(n2);
            rs.n.e.H[32014].at = "World Events";
            Client.eT[2] = 40087;
            Client.fb = true;
            Client.eM = true;
        }
        if (n2 == 32017) {
            y_0.n(n2);
            rs.n.e.H[32014].at = "<img=253> PK Ratings";
            Client.eT[2] = 40403;
            Client.fb = true;
            Client.eM = true;
        }
        if (Client.eT[Client.fL] == 44100) {
            rs.n.c.b.m(n2);
        }
    }

    public static void n(int n2) {
        boolean bl = false;
        f = n2;
        for (int n3 : c) {
            if (n3 != n2) continue;
            bl = true;
        }
        if (!bl) {
            return;
        }
        for (int n3 : c) {
            if (n3 == n2) {
                rs.n.e.H[n3].E = d;
                rs.n.e.H[n3].aG = d;
                continue;
            }
            rs.n.e.H[n3].E = e;
            rs.n.e.H[n3].aG = e;
        }
    }

    public y_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = y_0.d(32000);
        d = new f_0("gameframe/tab/sprite 2");
        e = new f_0("gameframe/tab/sprite 1");
        y_0.b(32001, 2, "gameframe/tab/sprite", "Open achievement tab");
        y_0.h(32004, "gameframe/tab/achievement");
        rs.n.e.H[32004].bn = false;
        y_0.b(32015, 2, "gameframe/tab/sprite", "Open events");
        y_0.h(32016, "gameframe/tab/event");
        rs.n.e.H[32016].bn = false;
        y_0.b(32017, 2, "gameframe/tab/sprite", "Open pk ratings");
        y_0.h(32018, "gameframe/tab/ratings");
        rs.n.e.H[32018].bn = false;
        y_0.b(32005, 2, "gameframe/tab/sprite", "Open account information");
        y_0.h(32008, "gameframe/tab/player");
        rs.n.e.H[32008].bn = false;
        y_0.b(32009, 2, "gameframe/tab/sprite", "Open guides");
        y_0.h(32012, "gameframe/tab/info");
        rs.n.e.H[32012].bn = false;
        y_0.h(32013, "gameframe/tab/sprite 3");
        y_0.a(32014, "Title placeholder", this.a, 2, 16750623, false, true);
        y_0.m(32001);
        e2.k(12);
        int n2 = 2;
        int n3 = 2;
        int n4 = 0;
        e2.b(n4++, 32013, n2 + 1, n3 + 25);
        e2.b(n4++, 32014, n2 + 5, n3 + 29);
        e2.b(n4++, 32001, 0 + n2, 0 + n3);
        e2.b(n4++, 32004, 7 + n2, 4 + n3);
        e2.b(n4++, 32015, 31 + n2, 0 + n3);
        e2.b(n4++, 32016, 38 + n2, 4 + n3);
        e2.b(n4++, 32017, 62 + n2, 0 + n3);
        e2.b(n4++, 32018, 69 + n2, 4 + n3);
        e2.b(n4++, 32005, 93 + n2, 0 + n3);
        e2.b(n4++, 32008, 100 + n2, 4 + n3);
        e2.b(n4++, 32009, 124 + n2, 0 + n3);
        e2.b(n4++, 32012, 131 + n2, 4 + n3);
    }

    static {
        f = 0;
    }
}

