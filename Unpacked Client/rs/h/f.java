/*
 * Decompiled with CFR 0.152.
 */
package rs.h;

import java.io.FileNotFoundException;
import rs.Client;
import rs.a.j;
import rs.d.k;
import rs.d.m;
import rs.d.p;
import rs.d.w;
import rs.f.a;
import rs.n.e;
import rs.s.c.c;
import rs.t.a.d;

public class f {
    public static boolean a = false;
    public static boolean b = false;

    public static boolean a(Client client) {
        if (!a || !rs.f.a.d.booleanValue()) {
            return false;
        }
        a = false;
        try {
            m.a();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        k.b = new d();
        k.b.a();
        k.c.clear();
        client.M();
        k.k.a();
        k.m.a();
        k.l.a();
        client.b();
        if (rs.f.a.d.booleanValue() && c.b.f()) {
            c.b.a(Client.bb, true);
        }
        try {
            p.a();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        try {
            w.a();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        return true;
    }

    public static boolean b(Client client) {
        int n2;
        if (!b || !rs.f.a.d.booleanValue()) {
            return false;
        }
        b = false;
        rs.d.d.M.a();
        rs.d.d.N.a();
        rs.d.d.c.a();
        rs.d.d.M.a();
        rs.d.d.N.a();
        rs.d.d.z = new rs.d.d[20];
        for (n2 = 0; n2 < 20; ++n2) {
            rs.d.d.z[n2] = new rs.d.d();
        }
        for (n2 = 0; n2 < client.cB; ++n2) {
            j j2 = client.cA[client.cC[n2]];
            if (j2.aG == null) continue;
            j2.aG = rs.d.d.c((int)j2.aG.x);
            j2.S = j2.aG.r;
            j2.o = j2.aG.y;
            j2.ag = j2.aG.q;
            j2.ah = j2.aG.l;
            j2.ai = j2.aG.B;
            j2.aj = j2.aG.j;
            j2.t = j2.aG.w;
        }
        e.aO.a();
        rs.l.f.e.d().j().a(rs.l.f.e.d().j().u(), true);
        if (c.b.e()) {
            c.b.a(rs.l.f.e.d().j().u(), true);
        }
        return true;
    }
}

