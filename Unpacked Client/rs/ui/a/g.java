/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 *  lombok.NonNull
 */
package rs.ui.a;

import com.google.a.b.as;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import lombok.NonNull;
import rs.Client;
import rs.eventbus.EventBus;
import rs.gui.w;
import rs.l.f.l;
import rs.s.h.a;
import rs.s.h.b;
import rs.ui.a.c;
import rs.ui.a.d;
import rs.ui.a.f;
import rs.ui.components.e;
import rs.ui.components.q;

public class g
extends rs.l.f.g {
    private static final int r = 1;
    private static final int s = 6;
    private final f t;
    private final EventBus u;
    private final b v;
    private e w;
    private final List<c> x = new CopyOnWriteArrayList<c>();

    g(f f2, Client client, EventBus eventBus, String string, b b2, @NonNull e e2) {
        if (e2 == null) {
            throw new NullPointerException("orientation is marked non-null but is null");
        }
        this.t = f2;
        this.a = client;
        this.u = eventBus;
        this.m = string;
        this.w = e2;
        this.v = b2;
        if (string.equalsIgnoreCase("Boosts")) {
            this.a(rs.l.f.l.g);
        } else {
            this.a(rs.l.f.l.c);
        }
        this.e(false);
        this.g(true);
        this.e.a(true);
        this.e.a((Color)null);
        this.e.a(new Rectangle());
        this.e.b(new Point(1, 1));
        this.a(rs.l.f.a.q);
        this.c(rs.l.f.a.A);
    }

    @Override
    public Dimension a(Graphics2D graphics2D) {
        d d2;
        boolean bl = Client.dj;
        if (!rs.s.h.a.b) {
            return null;
        }
        if (this.x.isEmpty()) {
            return null;
        }
        int n2 = this.v.q();
        this.e.a(new Dimension(6 * (n2 + 1), 6 * (n2 + 1)));
        this.e.a(this.w);
        Font font = rs.gui.w.b();
        boolean bl2 = this.v.r();
        Color color = rs.ui.components.d.c;
        Dimension dimension = new Dimension(n2, n2);
        for (c object2 : this.x) {
            if (!object2.e() || rs.s.h.a.d.contains(object2.j()) || rs.s.h.a.c.contains(object2.h())) continue;
            if (object2.g()) {
                this.x.remove(object2);
                continue;
            }
            String string = object2.a();
            Color color2 = object2.b();
            d2 = new d();
            if (this.v.q() <= 25) {
                object2.a(true);
            } else {
                object2.a(false);
            }
            d2.b(string);
            d2.a(font);
            if (color2 != null) {
                d2.a(color2);
            }
            d2.a(bl2);
            d2.a(object2.l());
            d2.a(object2.n());
            d2.a(dimension);
            d2.b(color);
            d2.a(object2);
            this.e.d().add(d2);
        }
        Dimension dimension2 = super.a(graphics2D);
        Point point = new Point(Client.hP, Client.hQ);
        for (q q2 : this.e.d()) {
            String string;
            d2 = (d)q2;
            if (this.k()) continue;
            Rectangle rectangle = new Rectangle(d2.a());
            rectangle.translate(this.r().x, this.r().y);
            if (!rectangle.contains(point)) continue;
            if (this.v.s() && !as.c((String)(string = d2.b())) && !bl) {
                rs.l.f.e.d().f().a(string, false);
            }
            if (bl) break;
            this.t.e(d2.c());
            break;
        }
        this.e.d().clear();
        return dimension2;
    }

    @Override
    public boolean a(rs.l.f.b b2) {
        if (!(b2 instanceof g)) {
            return false;
        }
        this.t.a((g)b2, this);
        return true;
    }

    e L() {
        this.w = this.w == rs.ui.components.e.a ? rs.ui.components.e.b : rs.ui.components.e.a;
        return this.w;
    }

    public List<c> M() {
        return this.x;
    }
}

