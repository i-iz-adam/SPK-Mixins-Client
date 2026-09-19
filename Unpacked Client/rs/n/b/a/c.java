/*
 * Decompiled with CFR 0.152.
 */
package rs.n.b.a;

import java.util.HashSet;
import rs.Client;
import rs.f.a;
import rs.n.b.a;

public abstract class c
extends a {
    public static HashSet<c> g = new HashSet();
    private boolean h;

    public static void d() {
        if (g.size() == 0) {
            return;
        }
        for (c c2 : g) {
            c2.e();
        }
        g.clear();
    }

    public c(long l2) {
        this.e = l2;
    }

    @Override
    public void c() {
        g.add(this);
    }

    public abstract void e();

    public int f() {
        return Client.hP + (rs.f.a.ai == a.c.a ? -526 : -10);
    }

    public int g() {
        return Client.hQ + (rs.f.a.ai == a.c.a ? -178 : -10);
    }
}

