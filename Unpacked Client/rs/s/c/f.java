/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.c;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.GeneralPath;
import javax.inject.Inject;
import rs.Client;
import rs.l.f.b;
import rs.l.f.e;
import rs.runelite.a.h;
import rs.runelite.a.i;
import rs.runelite.a.p;
import rs.s.c.a;
import rs.v_0;

public class f
extends b {
    private static final Color e = Color.GREEN;
    private static final Color f = Color.BLUE;
    private static final Color g = new Color(141, 220, 26);
    private static final Color h = new Color(73, 122, 18);
    private static final Color i = new Color(204, 42, 219);
    private static final Color j = Color.CYAN;
    private static final int k = 128;
    private static final int l = 8;
    private static final int m = 64;
    private static final int n = 16;
    private static final int o = 4;
    private static final int p = 20;
    private static final int q = -16;
    private final a r;
    private rs.runelite.a.f s;
    private rs.runelite.a.f t;

    @Inject
    public f(a a2) {
        this.r = a2;
        this.a(rs.l.f.a.p);
    }

    @Override
    public void a() {
        Object object;
        Object object2;
        if (this.r.c()) {
            this.a(rs.l.f.e.d().b(this.i()));
            if (v_0.t != -1 && v_0.u != -1) {
                object2 = rs.runelite.a.f.a(v_0.t, v_0.u);
                object = rs.runelite.a.h.a((rs.runelite.a.f)object2, Client.dw);
                this.a((i)object, v_0.t + Client.eh + "," + (v_0.u + Client.ei), Color.WHITE);
            }
        }
        if (!this.r.k()) {
            return;
        }
        if (Client.ch) {
            if (this.s == null) {
                if (v_0.t != -1 && v_0.u != -1) {
                    this.s = rs.runelite.a.f.a(v_0.t, v_0.u);
                } else {
                    return;
                }
            }
            if (v_0.t != -1 && v_0.u != -1) {
                this.t = rs.runelite.a.f.a(v_0.t, v_0.u);
            }
            this.a(this.s, Color.RED, 1.0, new Color(255, 0, 0, 50));
            if (this.t != null && this.t.b() != this.s.b() && this.t.c() != this.s.c()) {
                object2 = rs.runelite.a.p.a(this.s);
                object = rs.runelite.a.p.a(this.t);
                for (int i2 = Math.min(((p)object2).e(), ((p)object).e()); i2 <= Math.max(((p)object2).e(), ((p)object).e()); ++i2) {
                    for (int i3 = Math.min(((p)object2).f(), ((p)object).f()); i3 <= Math.max(((p)object2).f(), ((p)object).f()); ++i3) {
                        this.a(rs.runelite.a.f.a(new p(i2, i3, Client.dw)), Color.ORANGE, 1.0, new Color(255, 0, 0, 50));
                    }
                }
            }
        } else {
            if (this.s != null && this.t != null) {
                object2 = rs.runelite.a.p.a(this.s);
                object = rs.runelite.a.p.a(this.t);
                int n2 = Math.min(((p)object2).e(), ((p)object).e());
                int n3 = Math.min(((p)object2).f(), ((p)object).f());
                int n4 = Math.max(((p)object2).e(), ((p)object).e());
                int n5 = Math.max(((p)object2).f(), ((p)object).f());
                System.out.println("Range(" + n2 + ", " + n4 + ", " + n3 + ", " + n5 + ")");
            }
            this.k();
        }
    }

    private void k() {
        this.s = null;
        this.t = null;
    }

    private void a(Graphics2D graphics2D) {
        i i2;
        p p2;
        i i3;
        int n2;
        boolean bl;
        rs.runelite.a.f f2;
        rs.runelite.a.f f3;
        int n3;
        p p3 = this.a.aJ().g();
        int n4 = (p3.e() - 16 + 64 - 1) / 64 * 64;
        int n5 = (p3.f() - 16 + 64 - 1) / 64 * 64;
        int n6 = (p3.e() + 16) / 64 * 64;
        int n7 = (p3.f() + 16) / 64 * 64;
        graphics2D.setStroke(new BasicStroke(4.0f));
        graphics2D.setColor(e);
        GeneralPath generalPath = new GeneralPath();
        for (n3 = n4; n3 <= n6; n3 += 64) {
            f3 = rs.runelite.a.f.b(n3, p3.f() - 16);
            f2 = rs.runelite.a.f.b(n3, p3.f() + 16);
            bl = true;
            for (n2 = f3.c(); n2 <= f2.c(); n2 += 128) {
                i3 = rs.runelite.a.h.a(new rs.runelite.a.f(f3.b() - 64, n2 - 64), Client.dw);
                if (i3 == null) continue;
                if (n2 % 15 == 0) {
                    p2 = rs.runelite.a.p.a(new rs.runelite.a.f(n3, n2));
                    i2 = rs.runelite.a.h.a(new rs.runelite.a.f(f3.b() - 64 + 500, n2 - 64), Client.dw);
                    this.a(i2, "" + ((n3 >> 6) * 256 + (p2.f() >> 6)), e);
                    i2 = rs.runelite.a.h.a(new rs.runelite.a.f(f3.b() - 64 - 500, n2 - 64), Client.dw);
                    this.a(i2, "" + ((n3 - 1 >> 6) * 256 + (p2.f() >> 6)), e);
                }
                if (bl) {
                    generalPath.moveTo(i3.a(), i3.b());
                    bl = false;
                    continue;
                }
                generalPath.lineTo(i3.a(), i3.b());
            }
        }
        for (n3 = n5; n3 <= n7; n3 += 64) {
            f3 = rs.runelite.a.f.b(p3.e() - 16, n3);
            f2 = rs.runelite.a.f.b(p3.e() + 16, n3);
            bl = true;
            for (n2 = f3.b(); n2 <= f2.b(); n2 += 128) {
                i3 = rs.runelite.a.h.a(new rs.runelite.a.f(n2 - 64, f3.c() - 64), Client.dw);
                if (i3 == null) continue;
                if (n2 % 15 == 0) {
                    p2 = rs.runelite.a.p.a(new rs.runelite.a.f(n2, n3));
                    i2 = rs.runelite.a.h.a(new rs.runelite.a.f(n2 - 64, f3.c() - 64 + 500), Client.dw);
                    this.a(i2, "" + ((p2.e() >> 6) * 256 + (n3 >> 6)), e);
                    i2 = rs.runelite.a.h.a(new rs.runelite.a.f(n2 - 64, f3.c() - 64 - 500), Client.dw);
                    this.a(i2, "" + ((p2.e() >> 6) * 256 + (n3 - 1 >> 6)), e);
                }
                if (bl) {
                    generalPath.moveTo(i3.a(), i3.b());
                    bl = false;
                    continue;
                }
                generalPath.lineTo(i3.a(), i3.b());
            }
        }
        graphics2D.draw(generalPath);
    }

    private void a(rs.runelite.a.f f2, Color color, double d2, Color color2) {
        if (f2 == null) {
            return;
        }
        Polygon polygon = rs.runelite.a.h.a(f2);
        if (polygon == null) {
            return;
        }
        this.a(polygon, color, color2, new BasicStroke((float)d2));
    }
}

