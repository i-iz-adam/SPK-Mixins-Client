/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package rs.l.f;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import javax.annotation.Nullable;
import rs.Client;
import rs.gui.w;
import rs.l.f.a;
import rs.l.f.b;
import rs.l.f.e;
import rs.l.f.l;
import rs.ui.components.d;
import rs.ui.components.s;

public class g
extends b {
    protected final s e = new s();
    protected Rectangle f = new Rectangle();
    protected l g = rs.l.f.l.c;
    protected l h;
    protected Point i;
    protected Dimension j;
    protected Point k;
    private int r = 32;
    private boolean s = true;
    private boolean t = true;
    protected boolean l = false;
    protected String m = "None";
    protected float n = 0.0f;
    protected a o = null;
    protected boolean p = false;
    protected Color q;
    private boolean u = true;
    private boolean v = false;
    private boolean w;
    private boolean x = true;
    private boolean y = true;

    @Override
    public void a() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Dimension a(Graphics2D graphics2D) {
        Dimension dimension;
        Dimension dimension2 = this.e.b();
        if (this.v() != null) {
            this.e.a(this.v());
            if (this.v) {
                if ((double)this.v().width >= 167.70000000000002) {
                    graphics2D.setFont(rs.gui.w.c());
                } else if ((double)this.v().width <= 103.2) {
                    graphics2D.setFont(rs.gui.w.b());
                }
            }
        }
        Color color = this.e.c();
        if (this.D() != null && rs.ui.components.d.c.equals(color)) {
            this.e.a(this.D());
        }
        try {
            dimension = this.e.a(graphics2D);
        }
        finally {
            if (this.u) {
                this.e.d().clear();
            }
        }
        this.e.a(dimension2);
        this.e.a(color);
        return dimension;
    }

    public boolean k() {
        if (this.i().B) {
            return false;
        }
        if (this.i().ordinal() <= rs.l.f.a.q.ordinal()) {
            return Client.cH > 0;
        }
        return false;
    }

    public boolean l() {
        return !this.k();
    }

    public void m() {
    }

    public boolean n() {
        return false;
    }

    public boolean a(b b2) {
        return false;
    }

    public void a(l l2) {
        this.g = l2;
        switch (l2) {
            case j: 
            case b: {
                this.x = false;
                this.y = false;
                break;
            }
            case a: {
                this.x = true;
                this.y = false;
                break;
            }
            default: {
                this.x = true;
                this.y = true;
            }
        }
    }

    @Override
    public synchronized void b() {
        this.b((l)null);
        this.a((Dimension)null);
        this.a((Point)null);
        rs.l.f.e.d().m().a(this);
        this.o();
    }

    public void o() {
    }

    @Nullable
    public Rectangle p() {
        return null;
    }

    public s q() {
        return this.e;
    }

    public Rectangle r() {
        return this.f;
    }

    public l s() {
        return this.g;
    }

    public l t() {
        return this.h;
    }

    public Point u() {
        return this.i;
    }

    public Dimension v() {
        return this.j;
    }

    public Point w() {
        return this.k;
    }

    public int x() {
        return this.r;
    }

    public boolean y() {
        return this.s;
    }

    public boolean z() {
        return this.t;
    }

    public float A() {
        return this.n;
    }

    public a B() {
        return this.o;
    }

    public boolean C() {
        return this.p;
    }

    public Color D() {
        return this.q;
    }

    public boolean E() {
        return this.u;
    }

    public boolean F() {
        return this.v;
    }

    public boolean G() {
        return this.w;
    }

    public boolean H() {
        return this.x;
    }

    public boolean I() {
        return this.y;
    }

    public void a(Rectangle rectangle) {
        this.f = rectangle;
    }

    public void b(l l2) {
        this.h = l2;
    }

    public void a(Point point) {
        this.i = point;
    }

    public void a(Dimension dimension) {
        this.j = dimension;
    }

    public void b(Point point) {
        this.k = point;
    }

    public void a(int n2) {
        this.r = n2;
    }

    public void b(boolean bl) {
        this.s = bl;
    }

    public void c(boolean bl) {
        this.t = bl;
    }

    public void a(float f2) {
        this.n = f2;
    }

    public void c(a a2) {
        this.o = a2;
    }

    public void d(boolean bl) {
        this.p = bl;
    }

    public void a(Color color) {
        this.q = color;
    }

    public void e(boolean bl) {
        this.u = bl;
    }

    public void f(boolean bl) {
        this.v = bl;
    }

    public void g(boolean bl) {
        this.w = bl;
    }

    public void h(boolean bl) {
        this.x = bl;
    }

    public void i(boolean bl) {
        this.y = bl;
    }

    public boolean J() {
        return this.l;
    }

    protected void j(boolean bl) {
        this.l = bl;
    }

    public String K() {
        return this.m;
    }

    protected void a(String string) {
        this.m = string;
    }
}

