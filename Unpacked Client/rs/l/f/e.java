/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.l.f;

import gnu.trove.f.b.cc;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.a.j;
import rs.a.k;
import rs.eventbus.EventBus;
import rs.gui.Launcher;
import rs.l.f.a.d.d;
import rs.l.f.b.a;
import rs.l.f.b.b;
import rs.l.f.b.c;
import rs.l.f.g;
import rs.l.f.i;
import rs.s.h;
import rs.ui.f;

@Singleton
public class e {
    private static final Logger b = LoggerFactory.getLogger(e.class);
    private final ConcurrentHashMap<rs.l.f.a, List<rs.l.f.b>> c = new ConcurrentHashMap();
    final ConcurrentHashMap<rs.l.f.a, CopyOnWriteArrayList<g>> a = new ConcurrentHashMap();
    private final cc<List<rs.l.f.b.d>> d = new cc();
    private final List<rs.l.f.b.d> e = new ArrayList<rs.l.f.b.d>();
    private final rs.l.f.a.j.b f = new rs.l.f.a.j.b();
    private final rs.l.f.a.f.c g = new rs.l.f.a.f.c();
    private final rs.l.f.a.a.c h = new rs.l.f.a.a.c();
    private final rs.l.f.a.h.a i = new rs.l.f.a.h.a();
    private final rs.l.f.a.d.c j = new rs.l.f.a.d.c();
    private final rs.l.f.a.d.a k = new rs.l.f.a.d.a();
    private final d l = new d();
    private Graphics2D m = null;
    private final i n;
    private final h o;
    private final Client p;
    private boolean q = false;
    private static e r;

    @Inject
    public e(Client client, h h2, f f2, EventBus eventBus, rs.g.a.b b2, rs.e.i i2) {
        r = this;
        this.n = new i(this, f2, client, h2, eventBus, b2, i2);
        this.p = client;
        this.o = h2;
        for (rs.l.f.a a2 : rs.l.f.a.values()) {
            this.c.put(a2, new CopyOnWriteArrayList());
            this.a.put(a2, new CopyOnWriteArrayList());
        }
        this.a(this.f);
        if (rs.f.a.c == 1) {
            this.a(this.j);
            this.a(this.k);
            this.a(this.l);
        }
        this.a(this.g);
        this.a(this.h);
        this.a(this.i);
    }

    public void a(rs.l.f.b b2) {
        if (b2 instanceof g) {
            g g2 = (g)b2;
            this.n.b(g2);
            g2.a(this.o.s());
            List list = this.a.get((Object)b2.i());
            if (g2.A() > 0.0f) {
                int n2 = list.size();
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    if (!(((g)list.get(i2)).A() < g2.A())) continue;
                    n2 = i2;
                    break;
                }
                list.add(n2, g2);
            } else {
                list.add((g)b2);
            }
        } else {
            this.c.get((Object)b2.i()).add(b2);
        }
    }

    public void b(rs.l.f.b b2) {
        if (b2 instanceof g) {
            this.a.get((Object)b2.i()).remove(b2);
        } else {
            this.c.get((Object)b2.i()).remove(b2);
        }
    }

    public boolean c(rs.l.f.b b2) {
        if (b2 instanceof g) {
            return this.a.get((Object)b2.i()).contains(b2);
        }
        return this.c.get((Object)b2.i()).contains(b2);
    }

    public void a(rs.l.f.b.d d2, int n2) {
        if (this.d.b(n2) == null) {
            this.d.a(n2, new ArrayList());
        }
        if (((List)this.d.b(n2)).contains(d2)) {
            ((List)this.d.b(n2)).remove(d2);
        }
        d2.d(n2);
        ((List)this.d.b(n2)).add(d2);
    }

    public void a(rs.l.f.b.d d2) {
        if (this.d.b(d2.s()) == null) {
            return;
        }
        ((List)this.d.b(d2.s())).remove(d2);
    }

    public void a(int n2, int n3, int n4) {
        if (!this.e.isEmpty()) {
            for (rs.l.f.b.d d2 : this.e) {
                d2.a(Launcher.n().o());
                d2.b(n3);
                d2.c(n4);
                d2.d(n2);
                d2.a();
            }
        }
        if (this.d.b(n2) == null) {
            return;
        }
        for (int i2 = 0; i2 < ((List)this.d.b(n2)).size(); ++i2) {
            rs.l.f.b.d d2;
            d2 = (rs.l.f.b.d)((List)this.d.b(n2)).get(i2);
            d2.a(Launcher.n().o());
            d2.b(n3);
            d2.c(n4);
            d2.a();
        }
    }

    public void a(rs.l.f.a a2) {
        if (this.m != null) {
            this.m.dispose();
        }
        this.m = (Graphics2D)Launcher.n().o().gZ.e.getGraphics();
        this.m.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.n.a(a2, (List<g>)this.a.get((Object)a2));
        if (!this.c.get((Object)a2).isEmpty()) {
            List<rs.l.f.b> list = this.c.get((Object)a2);
            for (int i2 = 0; i2 < list.size(); ++i2) {
                rs.l.f.b b2 = list.get(i2);
                if (!b2.g()) continue;
                this.d(b2);
                b2.b();
            }
        }
    }

    public void a(rs.l.f.a a2, Object object, rs.a.h h2) {
        if (this.c.get((Object)a2) == null) {
            return;
        }
        if (a2 != rs.l.f.a.e && h2 == null) {
            return;
        }
        this.a(this.c.get((Object)a2), object, h2);
    }

    public void a(rs.l.f.a a2, rs.a.a a3, rs.a.h h2) {
        if (this.c.get((Object)a2) == null) {
            return;
        }
        this.a(this.c.get((Object)a2), (Object)a3, h2);
    }

    public void a() {
        for (List<rs.l.f.b> list : this.c.values()) {
            for (rs.l.f.b b2 : list) {
                b2.c();
            }
        }
        for (List<rs.l.f.b> list : this.a.values()) {
            for (g g2 : list) {
                g2.c();
            }
        }
        for (rs.l.f.a a2 : rs.l.f.a.values()) {
            this.a.put(a2, new CopyOnWriteArrayList());
        }
    }

    public void b() {
        this.q = false;
        if (this.p.fc) {
            if (this.n.a()) {
                this.n.a = this.n.b();
            }
            this.n.b = new rs.l.f.c(this.n.a);
        }
    }

    public void c() {
        this.n.d = this.n.c;
        this.n.c = null;
    }

    public Graphics2D b(rs.l.f.a a2) {
        return this.m;
    }

    Point a(Point point) {
        return rs.l.f.e.a(point.x, point.y);
    }

    public static Point a(float f2, float f3) {
        Client client = Launcher.n().o();
        if (!Client.ai() && client.ax()) {
            return new Point(client.b((int)f2, false), client.c((int)f3, false));
        }
        return new Point((int)f2, (int)f3);
    }

    private void a(List<rs.l.f.b> list, Object object, rs.a.h h2) {
        if (object == null) {
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); ++i2) {
            rs.l.f.b b2 = list.get(i2);
            if (!b2.g()) continue;
            if (b2 instanceof b && object instanceof j) {
                ((b)b2).a((j)object);
                ((b)b2).a(h2);
                this.d(b2);
                b2.b();
                continue;
            }
            if (b2 instanceof c && object instanceof k) {
                ((c)b2).a((k)object);
                this.d(b2);
                b2.b();
                continue;
            }
            if (!(b2 instanceof a)) continue;
            ((a)b2).a(object);
            ((a)b2).a(h2);
            this.d(b2);
            b2.b();
        }
    }

    private void d(rs.l.f.b b2) {
        if (b2.f() == null) {
            b2.a(Launcher.n().o());
        }
        b2.a();
    }

    public static e d() {
        return r;
    }

    public List<rs.l.f.b.d> e() {
        return this.e;
    }

    public rs.l.f.a.j.b f() {
        return this.f;
    }

    public rs.l.f.a.f.c g() {
        return this.g;
    }

    public rs.l.f.a.a.c h() {
        return this.h;
    }

    public rs.l.f.a.h.a i() {
        return this.i;
    }

    public rs.l.f.a.d.c j() {
        return this.j;
    }

    public rs.l.f.a.d.a k() {
        return this.k;
    }

    public d l() {
        return this.l;
    }

    public i m() {
        return this.n;
    }
}

