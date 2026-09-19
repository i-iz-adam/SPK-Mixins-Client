/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.dnd.DragSource;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;
import rs.ui.components.h;

public class g
extends JLayeredPane {
    private Point b;
    private Component c;
    private int d = 0;
    private int e = -1;
    private final List<c> f = new ArrayList<c>(0);

    public g() {
        this.setLayout(new a(null));
        b b2 = new b(null);
        this.addMouseListener(b2);
        this.addMouseMotionListener(b2);
    }

    @Override
    public void setLayout(LayoutManager layoutManager) {
        if (layoutManager != null && !(layoutManager instanceof a)) {
            throw new IllegalArgumentException("DragAndDropReorderPane only supports DragAndDropReorderLayoutManager");
        }
        super.setLayout(layoutManager);
    }

    public void a(c c2) {
        this.f.add(c2);
    }

    public void b(c c2) {
        this.f.remove(c2);
    }

    private void a(Point point) {
        this.c = this.d(this.b);
        if (this.c == null) {
            this.b = null;
            return;
        }
        this.d = SwingUtilities.convertPoint((Component)this, (Point)this.b, (Component)this.c).y;
        this.e = this.getPosition(this.c);
        this.setLayer(this.c, DRAG_LAYER);
        this.c(point);
    }

    private void b(Point point) {
        this.c(point);
        Component component = this.a(this.c.getBounds());
        if (component != null) {
            int n2;
            boolean bl;
            assert (component != this.c);
            int n3 = component.getY() + component.getHeight() / 2;
            int n4 = this.getPosition(component);
            boolean bl2 = bl = n4 < this.e;
            if (bl && this.c.getY() < n3) {
                n2 = n4;
            } else if (!bl && this.c.getY() + this.c.getHeight() > n3) {
                n2 = n4 + 1;
            } else {
                return;
            }
            assert (n2 != this.e);
            this.e = n2;
            this.revalidate();
        }
    }

    private void a() {
        if (this.c != null) {
            Component component = this.c;
            this.setLayer(this.c, DEFAULT_LAYER, this.e);
            this.c = null;
            this.d = 0;
            this.e = -1;
            this.revalidate();
            this.f.forEach(c2 -> c2.a(component));
        }
        this.b = null;
    }

    private void c(Point point) {
        int n2 = point.y - this.d;
        n2 = Math.max(n2, 0);
        n2 = Math.min(n2, this.getHeight() - this.c.getHeight());
        this.c.setLocation(new Point(0, n2));
    }

    private Component d(Point point) {
        for (Component component : this.getComponentsInLayer(DEFAULT_LAYER)) {
            if (!component.contains(point.x - component.getX(), point.y - component.getY())) continue;
            return component;
        }
        return null;
    }

    private Component a(Rectangle rectangle) {
        for (Component component : this.getComponentsInLayer(DEFAULT_LAYER)) {
            if (!rectangle.intersects(component.getBounds())) continue;
            return component;
        }
        return null;
    }

    private class a
    extends BoxLayout {
        private a() {
            super(g.this, 1);
        }

        @Override
        public void layoutContainer(Container container) {
            if (g.this.c != null) {
                Point point = g.this.c.getLocation();
                g.this.setLayer(g.this.c, JLayeredPane.DEFAULT_LAYER, g.this.e);
                g.this.revalidate();
                super.layoutContainer(container);
                g.this.setLayer(g.this.c, JLayeredPane.DRAG_LAYER);
                g.this.c.setLocation(point);
            } else {
                super.layoutContainer(container);
            }
        }

        /* synthetic */ a(h h2) {
            this();
        }
    }

    private class b
    extends MouseAdapter {
        private b() {
        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {
            if (SwingUtilities.isLeftMouseButton(mouseEvent) && g.this.getComponentCount() > 1) {
                g.this.b = mouseEvent.getPoint();
            }
        }

        @Override
        public void mouseDragged(MouseEvent mouseEvent) {
            if (SwingUtilities.isLeftMouseButton(mouseEvent) && g.this.b != null) {
                Point point = mouseEvent.getPoint();
                if (g.this.c != null) {
                    g.this.b(point);
                } else if (point.distance(g.this.b) > (double)DragSource.getDragThreshold()) {
                    g.this.a(point);
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {
            if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
                g.this.a();
            }
        }

        /* synthetic */ b(h h2) {
            this();
        }
    }

    @FunctionalInterface
    public static interface c {
        public void a(Component var1);
    }
}

