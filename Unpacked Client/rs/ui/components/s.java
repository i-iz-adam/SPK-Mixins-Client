/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import rs.ui.components.a;
import rs.ui.components.d;
import rs.ui.components.e;
import rs.ui.components.q;

public class s
implements q {
    private final Rectangle a = new Rectangle();
    private Point b = new Point();
    private Dimension c = new Dimension(129, 0);
    private Color d = rs.ui.components.d.c;
    private final List<q> e = new ArrayList<q>();
    private e f = rs.ui.components.e.b;
    private boolean g = false;
    private Rectangle h = new Rectangle(4, 4, 4, 4);
    private Point i = new Point(0, 0);
    private final Dimension j = new Dimension();

    @Override
    public Dimension a(Graphics2D graphics2D) {
        if (this.e.isEmpty()) {
            return null;
        }
        Dimension dimension = new Dimension(this.h.x + this.j.width + this.h.width, this.h.y + this.j.height + this.h.height);
        if (this.d != null) {
            a a2 = new a();
            a2.a(new Rectangle(this.b, dimension));
            a2.a(this.d);
            a2.a(graphics2D);
        }
        int n2 = this.b.x + this.h.x;
        int n3 = this.b.y + this.h.y;
        int n4 = 0;
        int n5 = 0;
        int n6 = n2;
        int n7 = n3;
        Dimension dimension2 = new Dimension(this.c.width - this.h.x - this.h.width, this.c.height - this.h.y - this.h.height);
        int n8 = 0;
        int n9 = 0;
        for (q q2 : this.e) {
            if (!this.g) {
                switch (this.f) {
                    case b: {
                        q2.a(new Dimension(dimension2.width, 0));
                        break;
                    }
                    case a: {
                        q2.a(new Dimension(0, dimension2.height));
                    }
                }
            }
            q2.a(new Point(n6, n7));
            Dimension dimension3 = q2.a(graphics2D);
            switch (this.f) {
                case b: {
                    n7 = n3 + (n5 += dimension3.height + this.i.y);
                    n4 = Math.max(n4, dimension3.width);
                    break;
                }
                case a: {
                    n6 = n2 + (n4 += dimension3.width + this.i.x);
                    n5 = Math.max(n5, dimension3.height);
                }
            }
            n9 = Math.max(n9, n4);
            n8 = Math.max(n8, n5);
            if (!this.g) continue;
            switch (this.f) {
                case b: {
                    if (dimension2.height <= 0 || n5 < dimension2.height) break;
                    n5 = 0;
                    n7 = n3;
                    int n10 = dimension3.width + this.i.x;
                    n6 += n10;
                    n4 += n10;
                    break;
                }
                case a: {
                    if (dimension2.width <= 0 || n4 < dimension2.width) break;
                    n4 = 0;
                    n6 = n2;
                    int n10 = dimension3.height + this.i.y;
                    n7 += n10;
                    n5 += n10;
                }
            }
        }
        if (this.f == rs.ui.components.e.a) {
            n9 -= this.i.x;
        } else {
            n8 -= this.i.y;
        }
        this.j.setSize(n9, n8);
        this.a.setLocation(this.b);
        this.a.setSize(dimension);
        return dimension;
    }

    @Override
    public Rectangle a() {
        return this.a;
    }

    @Override
    public void a(Point point) {
        this.b = point;
    }

    @Override
    public void a(Dimension dimension) {
        this.c = dimension;
    }

    public Dimension b() {
        return this.c;
    }

    public void a(Color color) {
        this.d = color;
    }

    public Color c() {
        return this.d;
    }

    public List<q> d() {
        return this.e;
    }

    public void a(e e2) {
        this.f = e2;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public void a(Rectangle rectangle) {
        this.h = rectangle;
    }

    public void b(Point point) {
        this.i = point;
    }
}

