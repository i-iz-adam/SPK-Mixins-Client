/*
 * Decompiled with CFR 0.152.
 */
package rs.n.a.a;

import rs.Client;
import rs.gui.Launcher;
import rs.l.b.d;
import rs.l.f_0;
import rs.n.a.a.a;
import rs.n.a.a.b;
import rs.n.e;

public class c {
    public static f_0 a;
    public static f_0 b;
    public static b c;

    public static void a() {
        Client.cI = -1;
        b = new f_0("misc/dd1");
        a = new f_0("misc/dd2");
        c = new b();
    }

    public static void a(a a2, int n2, int n3, boolean bl) {
        if (Client.cH <= 0) {
            return;
        }
        if (Client.cI != a2.aw || bl) {
            // empty if block
        }
        e e2 = e.H[Client.cH];
        int n4 = 1;
        Client client = Launcher.n().o();
        rs.l.c.a(n2, n3, a2.P, a2.aR, 4602929, 255);
        rs.l.c.d(n2 - n4, a2.P + n4 * 2, a2.aR + n4 * 2, 2630172, n3 - n4);
        rs.l.c.d(n2 - n4, a2.P + n4 * 2, a2.aR + n4 * 2, 2630172, n3 - n4);
        rs.l.c.d(n2, a2.P, a2.aR, 0x454441, n3);
        f_0 f_02 = Client.cI == a2.aw ? a : b;
        int n5 = n2 + n4 - f_02.n / 2;
        int n6 = n3 + a2.aR / 2 - a2.ao.r / 2;
        d.a(Launcher.n().o(), e2, a2, n5, n6);
        int n7 = n2 + a2.P - f_02.n - n4;
        int n8 = n3 + a2.aR / 2 - f_02.o / 2;
        f_02.f(n7, n8);
        if (client.em == a2.aw || client.em == a2.aw || client.ef == a2.aw) {
            rs.l.c.a(n2, n3, a2.P, a2.aR, 1, 75);
        }
    }

    public static void a(int n2) {
        if (e.H[n2] == null || !(e.H[n2] instanceof a)) {
            new IllegalArgumentException("The interface ID " + n2 + " is not a drop down component").printStackTrace();
            return;
        }
        a a2 = (a)e.H[n2];
        c.a(a2);
        rs.n.a.a.c.c.bf = true;
        Client.cI = n2;
    }

    public static void b() {
        Client.cI = -1;
        if (c != null) {
            rs.n.a.a.c.c.bf = false;
        }
    }

    public static boolean c() {
        if (c == null || c.h() == null) {
            return false;
        }
        if (Client.cI <= 0) {
            return false;
        }
        return c.b();
    }
}

