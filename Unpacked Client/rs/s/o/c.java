/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.o;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Shape;
import javax.inject.Inject;
import rs.Client;
import rs.l.f.b.b;
import rs.runelite.a.f;
import rs.runelite.a.h;
import rs.runelite.a.i;
import rs.s.o.a;
import rs.s.o.d;
import rs.s.o.e;

public class c
extends b {
    public static boolean i = true;
    private final d j;
    private final e k;

    @Inject
    public c(d d2, e e2) {
        this.j = d2;
        this.k = e2;
        this.a(rs.l.f.a.f);
    }

    @Override
    public void a() {
        if (this.g == null) {
            return;
        }
        if (this.e == null || this.e.aG == null) {
            return;
        }
        if (this.e.aG.h) {
            return;
        }
        a a2 = this.k.a(this.e);
        if (a2 != null) {
            try {
                this.a(a2);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private void a(a a2) {
        f f2;
        Object object;
        Color color = a2.c();
        float f3 = a2.m();
        Color color2 = a2.d();
        BasicStroke basicStroke = new BasicStroke(f3);
        if (a2.e()) {
            object = this.l();
            if (i && object.contains(Client.hP, Client.hQ)) {
                rs.a.h.by[rs.a.h.bw] = this.n().au;
                rs.a.h.bx[rs.a.h.bw++] = this.n().at;
                this.b((Shape)object, color.brighter(), color.brighter(), basicStroke);
            } else {
                this.b((Shape)object, color, color2, basicStroke);
            }
        }
        if (a2.f()) {
            object = this.e.a(this.e.aG.r);
            this.a((Shape)object, color, color2, basicStroke);
        }
        if (a2.g() && (object = rs.runelite.a.f.a(this.e.g())) != null) {
            byte by = this.e.aG.r;
            f f4 = new f(((f)object).b() + 128 * (by - 1) / 2, ((f)object).c() + 128 * (by - 1) / 2);
            Polygon polygon = rs.runelite.a.h.c(f4, by);
            this.a(polygon, color, color2, basicStroke);
        }
        if (a2.h()) {
            byte by = this.e.aG.r;
            f f5 = new f(this.e.ac, this.e.ad);
            int n2 = f5.b() - (by - 1) * 128 / 2;
            int n3 = f5.c() - (by - 1) * 128 / 2;
            Polygon polygon = rs.runelite.a.h.a(new f(n2, n3));
            this.a(polygon, color, color2, basicStroke);
        }
        if (a2.i() && (f2 = rs.runelite.a.f.a(this.e.g())) != null) {
            Polygon polygon = rs.runelite.a.h.a(f2);
            this.a(polygon, color, color2, basicStroke);
        }
        if (a2.j()) {
            rs.ui.b.b.a().a(this.e, (int)f3, color, a2.n());
        }
        if (a2.k()) {
            f f6 = new f(this.e.ac, this.e.ad);
            i i2 = rs.runelite.a.h.a(rs.l.f.e.d().b(this.i()), f6, this.e.o(), this.e.r);
            if (i2 != null) {
                Client.gl.c(this.e.o(), i2.a(), i2.b(), color.getRGB(), 0);
            }
        }
    }

    private void a(f f2, Color color, double d2, Color color2) {
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

