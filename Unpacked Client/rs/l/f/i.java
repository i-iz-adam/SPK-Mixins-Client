/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.L
 *  com.google.a.m.l
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.l.f;

import com.google.a.b.L;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.eventbus.EventBus;
import rs.eventbus.Subscribe;
import rs.f.a;
import rs.gui.Launcher;
import rs.gui.w;
import rs.l.f.a;
import rs.l.f.b;
import rs.l.f.c;
import rs.l.f.e;
import rs.l.f.g;
import rs.l.f.j;
import rs.l.f.l;
import rs.l.f.m;
import rs.runelite.events.FocusChanged;
import rs.s.h;
import rs.ui.f;

public class i {
    private static final Logger g = LoggerFactory.getLogger(i.class);
    private Rectangle h;
    private Rectangle i;
    private boolean j = false;
    private boolean k;
    private int l = -1;
    c a;
    c b;
    private boolean m;
    private final Point n = new Point();
    private final Point o = new Point();
    private g p;
    private g q;
    private Rectangle r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    g c;
    g d;
    private final e w;
    private final h x;
    private final rs.g.a.b y;
    private final f z;
    private final Client A;
    private final EventBus B;
    private final rs.e.i C;
    public static final String e = "Configure";
    private static final String D = "_preferredLocation";
    private static final String E = "_preferredPosition";
    private static final String F = "_preferredSize";
    private static final String G = h.class.getAnnotation(rs.e.e.class).a();
    private static final int H = 5;
    private static final int I = 20;
    private static final int J = 2;
    private static final int K = 5;
    private static final Dimension L = new Dimension(80, 80);
    private static final Color M = new Color(0, 255, 255, 50);
    private static final Color N = new Color(0, 255, 0, 100);
    private static final Color O = new Color(255, 255, 0, 100);
    private static final Color P = new Color(255, 255, 0, 200);
    private static final Color Q = Color.RED;
    private static final Color R = new Color(255, 0, 255, 200);

    public i(e e2, f f2, Client client, h h2, EventBus eventBus, rs.g.a.b b2, rs.e.i i2) {
        this.w = e2;
        this.C = i2;
        this.z = f2;
        this.A = client;
        this.B = eventBus;
        this.x = h2;
        this.y = b2;
        j j2 = new j(this, h2::x);
        b2.a(j2);
        eventBus.register(this);
    }

    public void a(a a2, List<g> list) {
        Object object2;
        Object object3;
        if (list.isEmpty()) {
            return;
        }
        Graphics2D graphics2D = this.a(a2);
        if (a2 == rs.l.f.a.A && this.u && this.p != null && this.p.I()) {
            object3 = this.b.a(-rs.l.f.i.L.width, -rs.l.f.i.L.height);
            object2 = graphics2D.getColor();
            for (Rectangle object4 : ((c)object3).a()) {
                graphics2D.setColor(object4.contains(this.o) ? N : M);
                graphics2D.fill(object4);
            }
            graphics2D.setColor((Color)object2);
        }
        object3 = graphics2D.getTransform();
        object2 = graphics2D.getStroke();
        Composite composite = graphics2D.getComposite();
        Paint paint = graphics2D.getPaint();
        RenderingHints renderingHints = graphics2D.getRenderingHints();
        Color color = graphics2D.getBackground();
        Rectangle rectangle = this.b(a2);
        graphics2D.setClip(rectangle);
        for (g g2 : list) {
            Point point;
            Serializable serializable;
            l l2 = this.c(g2);
            Rectangle rectangle2 = g2.r();
            Dimension dimension = rectangle2.getSize();
            Point point2 = g2.u();
            Rectangle rectangle3 = null;
            if (l2 != rs.l.f.l.b && l2 != rs.l.f.l.j && l2 != rs.l.f.l.a && point2 == null) {
                rectangle3 = this.b.a(l2);
                serializable = rs.l.f.m.a(l2, dimension);
                int n2 = rectangle3.x + serializable.x;
                int n3 = rectangle3.y + serializable.y;
                point = this.a(n2, n3, dimension.width, dimension.height, g2);
                this.a(g2, false);
            } else {
                point = point2 != null ? point2 : rectangle2.getLocation();
                point = this.a(point.x, point.y, dimension.width, dimension.height, g2);
                this.a(g2, true);
            }
            if (g2.w() != null) {
                point.translate(g2.w().x, g2.w().y);
            }
            if (g2.v() != null) {
                rectangle2.setSize(g2.v());
            }
            if (g2.f() == null) {
                g2.a(this.A);
            }
            this.a(g2, graphics2D, point);
            if (rectangle3 != null && rectangle2.width + rectangle2.height > 0) {
                rs.l.f.m.a(l2, rectangle3, rectangle2, 2);
            }
            graphics2D.setTransform((AffineTransform)object3);
            graphics2D.setStroke((Stroke)object2);
            graphics2D.setComposite(composite);
            graphics2D.setPaint(paint);
            graphics2D.setRenderingHints(renderingHints);
            graphics2D.setBackground(color);
            if (!graphics2D.getClip().equals(rectangle)) {
                graphics2D.setClip(rectangle);
            }
            if (rectangle2.isEmpty()) continue;
            if (this.s && g2.H()) {
                if (this.t && this.p == g2) {
                    serializable = R;
                } else if (this.u && this.p == g2) {
                    serializable = P;
                } else if (this.u && g2.G() && this.p.G() && this.p.r().intersects(rectangle2)) {
                    serializable = Q;
                    assert (this.p != g2);
                    this.q = g2;
                } else {
                    serializable = O;
                }
                graphics2D.setColor((Color)serializable);
                graphics2D.draw(rectangle2);
                graphics2D.setPaint(paint);
            }
            if (Client.dj || !rectangle2.contains(this.o)) continue;
            this.c = g2;
            if (!g2.l() || this.s) continue;
            g2.m();
        }
    }

    public MouseEvent a(MouseEvent mouseEvent) {
        Point point = this.w.a(mouseEvent.getPoint());
        this.o.setLocation(point);
        this.p = this.d;
        if (this.p == null) {
            return mouseEvent;
        }
        if (!this.s) {
            boolean bl;
            boolean bl2 = bl = this.p.l() || this.p.J();
            if (bl && this.p.n()) {
                mouseEvent.consume();
            }
            return mouseEvent;
        }
        if (!this.p.H()) {
            return mouseEvent;
        }
        if (SwingUtilities.isRightMouseButton(mouseEvent)) {
            if (this.p.y()) {
                this.p.b();
            }
        } else if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            Point point2 = new Point(point.x, point.y);
            point2.translate(-this.p.r().x, -this.p.r().y);
            this.n.setLocation(point2);
            this.t = this.p != null && this.p.z() && this.z.i() != this.z.j();
            this.u = !this.t;
            this.v = true;
            this.r = new Rectangle(this.p.r());
        } else {
            return mouseEvent;
        }
        mouseEvent.consume();
        return mouseEvent;
    }

    public void b(MouseEvent mouseEvent) {
        Point point = this.w.a(mouseEvent.getPoint());
        this.o.setLocation(point);
        if (!this.s) {
            return;
        }
        if (!this.t && !this.u) {
            this.p = this.d;
        }
        if (this.p == null || !this.p.z()) {
            this.z.a(this.z.j());
            return;
        }
        Rectangle rectangle = new Rectangle(this.p.r());
        rectangle.grow(-5, -5);
        int n2 = rectangle.outcode(point);
        switch (n2) {
            case 2: {
                this.z.a(Cursor.getPredefinedCursor(8));
                break;
            }
            case 3: {
                this.z.a(Cursor.getPredefinedCursor(6));
                break;
            }
            case 1: {
                this.z.a(Cursor.getPredefinedCursor(10));
                break;
            }
            case 9: {
                this.z.a(Cursor.getPredefinedCursor(4));
                break;
            }
            case 8: {
                this.z.a(Cursor.getPredefinedCursor(9));
                break;
            }
            case 12: {
                this.z.a(Cursor.getPredefinedCursor(5));
                break;
            }
            case 4: {
                this.z.a(Cursor.getPredefinedCursor(11));
                break;
            }
            case 6: {
                this.z.a(Cursor.getPredefinedCursor(7));
                break;
            }
            default: {
                this.z.a(this.z.j());
            }
        }
    }

    public void c(MouseEvent mouseEvent) {
        Rectangle rectangle;
        Point point = this.w.a(mouseEvent.getPoint());
        this.o.setLocation(point);
        if (!this.s) {
            return;
        }
        if (this.p == null) {
            return;
        }
        if (this.q != null && !this.p.r().intersects(this.q.r())) {
            this.q = null;
        }
        if (!(rectangle = new Rectangle(this.A.aE())).contains(point)) {
            return;
        }
        if (this.t) {
            int n2 = point.x - this.r.x;
            int n3 = point.y - this.r.y;
            int n4 = this.r.x;
            int n5 = this.r.y;
            int n6 = n4;
            int n7 = n5;
            int n8 = this.r.width;
            int n9 = this.r.height;
            switch (this.z.i().getType()) {
                case 8: {
                    n7 += n3;
                    n9 -= n3;
                    break;
                }
                case 6: {
                    n6 += n2;
                    n7 += n3;
                    n8 -= n2;
                    n9 -= n3;
                    break;
                }
                case 10: {
                    n6 += n2;
                    n8 -= n2;
                    break;
                }
                case 4: {
                    n6 += n2;
                    n8 -= n2;
                    n9 = n3;
                    break;
                }
                case 9: {
                    n9 = n3;
                    break;
                }
                case 5: {
                    n8 = n2;
                    n9 = n3;
                    break;
                }
                case 11: {
                    n8 = n2;
                    break;
                }
                case 7: {
                    n7 += n3;
                    n8 = n2;
                    n9 -= n3;
                    break;
                }
            }
            int n10 = this.p.x();
            int n11 = Math.max(0, n10 - n8);
            int n12 = Math.max(0, n10 - n9);
            int n13 = n6 - n4;
            int n14 = n7 - n5;
            if (n11 > 0) {
                n8 = n10;
                if (n13 > 0) {
                    n6 -= n11;
                }
            }
            if (n12 > 0) {
                n9 = n10;
                if (n14 > 0) {
                    n7 -= n12;
                }
            }
            this.r.setRect(n6, n7, n8, n9);
            this.p.a(new Dimension(this.r.width, this.r.height));
            if (this.p.u() != null) {
                this.p.a(this.r.getLocation());
            }
        } else if (this.u) {
            Point point2 = new Point(point);
            point2.translate(-this.n.x, -this.n.y);
            Rectangle rectangle2 = this.p.r();
            point2 = this.a(point2.x, point2.y, rectangle2.width, rectangle2.height, this.p);
            this.p.b((l)null);
            this.p.a(point2);
        } else {
            return;
        }
        if (this.v) {
            this.v = false;
        }
    }

    public void d(MouseEvent mouseEvent) {
        Point point = this.w.a(mouseEvent.getPoint());
        this.o.setLocation(point);
        if (!this.s || this.p == null || !this.u && !this.t) {
            return;
        }
        if (this.q != null && this.q.a(this.p)) {
            mouseEvent.consume();
            this.c();
            return;
        }
        if (this.p.I() && this.u) {
            c c2 = this.b.a(-rs.l.f.i.L.width, -rs.l.f.i.L.height);
            for (Rectangle rectangle : c2.a()) {
                if (!rectangle.contains(point)) continue;
                l l2 = c2.a(rectangle);
                if (l2 == this.c(this.p)) {
                    l2 = null;
                }
                this.p.b(l2);
                this.p.a((Point)null);
                this.p.o();
                if (this.p.B() == null || this.p.i() != this.p.B()) break;
                this.p.b(this.p.j());
                this.w.a.get((Object)this.p.B()).remove(this.p);
                this.w.a.get((Object)this.p.j()).add(this.p);
                break;
            }
        }
        this.a(this.p);
        this.c();
        mouseEvent.consume();
    }

    @Subscribe
    public void onFocusChanged(FocusChanged focusChanged) {
        if (!focusChanged.isFocused()) {
            if (this.s) {
                this.s = false;
                this.c();
            }
            this.c = null;
        }
    }

    private void a(g g2, Graphics2D graphics2D, Point point) {
        Dimension dimension;
        l l2 = g2.s();
        if (l2 == rs.l.f.l.b || l2 == rs.l.f.l.a) {
            graphics2D.setFont(rs.gui.w.b());
        } else if (l2 == rs.l.f.l.j) {
            graphics2D.setFont(rs.gui.w.b());
        } else {
            graphics2D.setFont(rs.gui.w.b());
        }
        if (point.x > Client.ai - g2.r().getSize().width || point.y > Client.ah - g2.r().getSize().height || point.x < 0 || point.y < 0) {
            point = new Point(Math.max(0, Math.min(Client.ai - g2.r().getSize().width, point.x)), Math.max(0, Math.min(Client.ah - g2.r().getSize().height, point.y)));
        }
        if (rs.f.a.ai == a.c.a && !g2.i().B && !g2.C() && g2.B() == null) {
            int n2 = point.x;
            int n3 = point.y;
            if (point.x + g2.r().width >= Client.aj) {
                n2 = Client.aj - g2.r().getSize().width;
            }
            if (point.y + g2.r().getSize().height >= Client.ak) {
                n3 = Client.ak - g2.r().getSize().height;
            }
            if (n2 != point.x || n3 != point.y) {
                point = new Point(n2, n3);
            }
        }
        graphics2D.translate(point.x, point.y);
        g2.r().setLocation(point);
        try {
            dimension = g2.a(graphics2D);
        }
        catch (Exception exception) {
            return;
        }
        Dimension dimension2 = (Dimension)com.google.a.b.L.a((Object)dimension, (Object)new Dimension());
        g2.r().setSize(dimension2);
    }

    private Rectangle b(a a2) {
        if (!this.k && !a2.B) {
            return new Rectangle(this.A.ag(), this.A.ah(), this.A.at(), this.A.as());
        }
        return new Rectangle(0, 0, this.A.av(), this.A.aw());
    }

    private void c() {
        this.t = false;
        this.u = false;
        this.p = null;
        this.q = null;
        this.r = null;
        Launcher.n().p().a(Launcher.n().p().j());
    }

    private l c(g g2) {
        l l2 = g2.s();
        if (g2.t() != null) {
            l2 = g2.t();
        }
        if (!this.k) {
            switch (l2) {
                case i: {
                    l2 = rs.l.f.l.e;
                    break;
                }
                case h: {
                    l2 = rs.l.f.l.g;
                }
            }
        }
        return l2;
    }

    boolean a() {
        Rectangle rectangle;
        boolean bl = this.k != Client.ai();
        int n2 = -1;
        boolean bl2 = false;
        if (this.l != -1) {
            this.l = -1;
            bl2 = true;
        }
        if (bl) {
            this.k = Client.ai();
            bl2 = true;
        }
        if (this.i == null || bl2) {
            int n3 = !Client.ai() ? 338 : Client.ah - 165;
            this.i = new Rectangle(0, n3, 519, 165);
            bl2 = true;
        }
        if (!(rectangle = new Rectangle(this.A.at(), this.A.as())).equals(this.h)) {
            this.h = rectangle;
            bl2 = true;
        }
        return bl2;
    }

    c b() {
        Point point;
        Point point2 = new Point(this.h.x + 5, this.h.y + 20);
        Point point3 = new Point(this.h.x + this.h.width / 2, this.h.y + 5);
        Point point4 = new Point(this.h.x + this.h.width - 5, point3.y);
        Point point5 = new Point(point2.x, this.h.y + this.h.height - 5);
        Point point6 = new Point(point4.x, point5.y);
        if (this.k) {
            if (!this.j) {
                point5.y -= this.i.height;
            }
            point4.x -= 241;
            point6.x -= 241;
            point6.y -= 100;
        }
        if (!this.k) {
            // empty if block
        }
        Point point7 = this.k ? new Point(this.h.x + this.i.width - 5, point5.y) : point6;
        Point point8 = point = this.k ? new Point((int)this.A.aE().getWidth(), 0) : point4;
        if (!this.k) {
            point2.x += 4;
            point2.y += 4;
            point3.x += 4;
            point3.y += 4;
            point4.x += 4;
            point5.x += 0;
            point5.y += 8;
            point6.x += 4;
            point6.y += 4;
            point7.x += 4;
            point7.y += 4;
            point.x += 4;
            point.y += 4;
        }
        return new c(new Rectangle(point2, L), new Rectangle(point3, L), new Rectangle(point4, L), new Rectangle(point5, L), new Rectangle(point6, L), new Rectangle(point7, L), new Rectangle(point, L));
    }

    private Point a(int n2, int n3, int n4, int n5, g g2) {
        Rectangle rectangle = g2.p();
        if (rectangle == null || rectangle.isEmpty()) {
            Dimension dimension = Launcher.n().o().aE();
            rectangle = new Rectangle(0, 0, dimension.width, dimension.height);
        }
        return new Point(com.google.a.m.l.a((int)n2, (int)rectangle.x, (int)Math.max(rectangle.x, rectangle.x + rectangle.width - n4)), com.google.a.m.l.a((int)n3, (int)rectangle.y, (int)Math.max(rectangle.y, rectangle.y + rectangle.height - n5)));
    }

    public synchronized void a(g g2) {
        this.f(g2);
        this.e(g2);
        this.d(g2);
    }

    void b(g g2) {
        Point point = this.g(g2);
        Dimension dimension = this.h(g2);
        l l2 = this.i(g2);
        if (g2.H()) {
            g2.a(point);
        } else if (point != null) {
            g2.a((Point)null);
            this.d(g2);
        }
        g2.a(dimension);
        if (g2.I()) {
            g2.b(l2);
        } else if (l2 != null) {
            g2.b((l)null);
            this.f(g2);
        }
    }

    private void a(b b2) {
        if (b2 instanceof g) {
            ((g)b2).a(this.x.s());
        }
    }

    private void d(g g2) {
        String string = g2.K() + D;
        if (g2.u() != null) {
            this.C.a(G, string, g2.u());
        } else {
            this.C.b(G, string);
        }
    }

    private void e(g g2) {
        String string = g2.K() + F;
        if (g2.v() != null) {
            this.C.a(G, string, g2.v());
        } else {
            this.C.b(G, string);
        }
    }

    private void f(g g2) {
        String string = g2.K() + E;
        if (g2.t() != null) {
            this.C.a(G, string, g2.t());
        } else {
            this.C.b(G, string);
        }
    }

    private Point g(g g2) {
        String string = g2.K() + D;
        return (Point)this.C.a(G, string, (Type)((Object)Point.class));
    }

    private Dimension h(g g2) {
        String string = g2.K() + F;
        return (Dimension)this.C.a(G, string, (Type)((Object)Dimension.class));
    }

    private l i(g g2) {
        String string = g2.K() + E;
        return (l)((Object)this.C.a(G, string, (Type)((Object)l.class)));
    }

    private void a(g g2, boolean bl) {
        if (g2.B() == null) {
            return;
        }
        g g3 = g2;
        rs.h.c.a(() -> {
            if (!this.w.a.get((Object)g3.i()).contains(g3)) {
                return;
            }
            if (!bl && g3.i() == g3.B()) {
                this.w.b(g3);
                g3.b(g3.j());
                this.w.a(g3);
            }
            if (bl && g3.i() == g3.j()) {
                this.w.b(g3);
                g3.b(g3.B());
                this.w.a(g3);
            }
        });
    }

    public Graphics2D a(a a2) {
        return this.w.b(a2);
    }

    static /* synthetic */ boolean a(i i2, boolean bl) {
        i2.s = bl;
        return i2.s;
    }

    static /* synthetic */ boolean a(i i2) {
        return i2.s;
    }

    static /* synthetic */ void b(i i2) {
        i2.c();
    }
}

