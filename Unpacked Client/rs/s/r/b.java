/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.r;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import javax.inject.Inject;
import rs.Client;
import rs.runelite.a.f;
import rs.runelite.a.h;
import rs.s.r.a;
import rs.v_0;

public class b
extends rs.l.f.b {
    private final a e;

    @Inject
    public b(a a2) {
        this.e = a2;
        this.a(rs.l.f.a.p);
    }

    @Override
    public void a() {
        f f2;
        if (this.e.e() && v_0.t != -1 && v_0.u != -1) {
            f2 = f.a(v_0.t, v_0.u);
            this.a(f2, this.e.f(), this.e.d(), this.e.g());
        }
        if (this.e.a() && this.a.gd > 0 && this.a.ge > 0) {
            f2 = f.a(this.a.gd, this.a.ge);
            this.a(f2, this.e.b(), this.e.d(), this.e.c());
        }
        if (this.e.i() && (f2 = f.a(Client.eR.g())) != null) {
            this.a(f2, this.e.j(), this.e.l(), this.e.k());
        }
    }

    private void a(f f2, Color color, double d2, Color color2) {
        if (f2 == null) {
            return;
        }
        Polygon polygon = h.a(f2);
        if (polygon == null) {
            return;
        }
        this.a(polygon, color, color2, new BasicStroke((float)d2));
    }
}

