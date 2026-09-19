/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class q
extends c {
    public q(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        int n3;
        int n4;
        int n5;
        e e2 = rs.n.c.q.j(18128);
        rs.n.c.q.a(18129, "/clan/sprite", 6, 72, 32, "Join Chat", -1, 18130, 1);
        rs.n.c.q.a(18130, "/clan/sprite", 7, 72, 32, 18131);
        rs.n.c.q.a(18132, "/clan/sprite", 6, 72, 32, "Clan Setup", -1, 18133, 5);
        rs.n.c.q.a(18133, "/clan/sprite", 7, 72, 32, 18134);
        rs.n.c.q.a(18135, "Join Chat", this.a, 0, 16751360, true, true);
        rs.n.c.q.a(18136, "Clan Setup", this.a, 0, 16751360, true, true);
        rs.n.c.q.c(18137, 37, "/clan/sprite");
        rs.n.c.q.a(18138, "Clan Chat (0/100)", this.a, 2, 16751360, true, true);
        rs.n.c.q.a(18139, "Talking in: @yel@Not in chat", this.a, 0, 16751360, false, true);
        rs.n.c.q.a(18140, "Owner: @whi@None", this.a, 0, 16751360, false, true);
        e2.k(13);
        e2.b(0, 16126, 0, 221);
        e2.b(1, 16126, 0, 59);
        e2.b(2, 18137, 0, 57);
        e2.b(3, 18143, 0, 62);
        e2.b(4, 18129, 15, 226);
        e2.b(5, 18130, 15, 226);
        e2.b(6, 18132, 103, 226);
        e2.b(7, 18133, 103, 226);
        e2.b(8, 18135, 51, 237);
        e2.b(9, 18136, 139, 237);
        e2.b(10, 18138, 95, 3);
        e2.b(11, 18139, 10, 23);
        e2.b(12, 18140, 25, 38);
        e e3 = rs.n.c.q.j(18143);
        e3.k(298);
        for (n5 = 18144; n5 <= 18244; ++n5) {
            rs.n.c.q.a(n5, "<img=17> Ryan " + n5, "Manage clan member", this.a, 0, 16750623, false, false, 125);
        }
        for (n5 = 25800; n5 <= 25999; ++n5) {
            rs.n.c.q.a(n5, "<img=17> Ryan " + n5, "Manage clan member", this.a, 0, 16750623, false, false, 125);
        }
        n5 = 18144;
        for (n4 = 0; n5 <= 18243 && n4 <= 99; ++n5, ++n4) {
            e3.al[n4] = n5;
            e3.am[n4] = 15;
            n3 = 18144;
            for (n2 = 1; n3 <= 18243 && n2 <= 99; ++n3, ++n2) {
                e3.bc[0] = 2;
                e3.bc[n2] = e3.bc[n2 - 1] + 14;
            }
        }
        n5 = 25800;
        for (n4 = 100; n5 <= 25999 && n4 <= 297; ++n5, ++n4) {
            e3.al[n4] = n5;
            e3.am[n4] = 15;
            n3 = 25800;
            for (n2 = 101; n3 <= 25999 && n2 <= 297; ++n3, ++n2) {
                e3.bc[100] = 1402;
                e3.bc[n2] = e3.bc[n2 - 1] + 14;
            }
        }
        e3.aR = 153;
        e3.P = 174;
        e3.aH = 4200;
    }
}

