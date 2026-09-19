/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e;

import java.util.ArrayList;
import java.util.List;
import rs.Client;
import rs.f.a;
import rs.gui.Launcher;
import rs.l.e.g;
import rs.l.f_0;

public class h {
    private static final int c = 460;
    private static final int d = 30;
    public final List<g> a = new ArrayList<g>();
    public final List<g> b = new ArrayList<g>();
    private final List<g> e = new ArrayList<g>();
    private f_0 f;
    private Client g;
    private int h;
    private long i;

    public h(Client client) {
        this.g = client;
        this.f = new f_0("popups/drop bar");
    }

    public void a(int n2, long l2) {
        this.a(n2, l2, 0);
    }

    public void a(int n2, long l2, int n3) {
        g g2 = new g(n2, 1);
        g2.g = 460;
        g2.h = 15;
        g2.m = l2;
        g2.l = n3;
        if (System.currentTimeMillis() - this.i < 100L && !this.a.isEmpty()) {
            this.a.get((int)(this.a.size() - 1)).i += n2;
            this.a.get((int)(this.a.size() - 1)).f = this.a.get((int)(this.a.size() - 1)).i == 0 ? new f_0("popups/block drop") : new f_0("popups/hit drop");
            return;
        }
        if (!this.b()) {
            if (this.b.size() > 5) {
                this.b.remove(0);
            }
            this.b.add(g2);
            return;
        }
        this.a.add(g2);
        this.h += n2;
        this.i = System.currentTimeMillis();
    }

    public void a() {
        int n2;
        if (this.b()) {
            g g2;
            g g3 = g2 = this.b.size() > 0 ? this.b.get(0) : null;
            if (g2 != null) {
                this.b.remove(g2);
                this.a.add(g2);
                this.h += g2.i;
            }
        }
        for (n2 = 0; n2 < this.a.size(); ++n2) {
            int n3;
            int n4;
            g g4 = this.a.get(n2);
            g4.a();
            int n5 = rs.f.a.ai == a.c.b ? Client.ai - 750 : 0;
            Launcher.n().o();
            n5 += Client.ai() ? 0 : 4;
            Launcher.n().o();
            int n6 = n4 = Client.ai() ? 0 : 0;
            if (this.g.v.f()) {
                g4.f.g(g4.g + 24 + n5, g4.h - 1, g4.k);
                if (g4.l > 0) {
                    f_0 f_02;
                    f_0 f_03 = g4.l == 1 ? rs.l.e.g.c : (f_02 = g4.l == 2 ? rs.l.e.g.d : rs.l.e.g.e);
                    if (g4.i == 0) {
                        f_02.g(g4.g + 24 + n5 - 30, g4.h - 4, g4.k);
                    } else {
                        f_02.g(g4.g + 24 + n5 - 30, g4.h - 2, g4.k);
                    }
                }
            }
            int n7 = g4.i == 0 ? 35 : 35;
            int n8 = n3 = g4.i == 0 ? 14 : 15;
            if (this.g.v.f()) {
                Client.gl.d(Integer.toString(g4.i), g4.g + n7 + n5, g4.h + n3 + n4, 0xFFFFFF, g4.i > 0 ? 0x340000 : 100, g4.k);
            }
            if (!(255.0 - (double)g4.h * 1.05 <= -10.0)) continue;
            this.e.add(g4);
        }
        if (this.e.size() > 0) {
            for (n2 = 0; n2 < this.e.size(); ++n2) {
                this.a.remove(this.e.get(n2));
            }
            this.e.clear();
        }
    }

    private boolean b() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            if (this.a.get((int)i2).h > 65) continue;
            return false;
        }
        return true;
    }
}

