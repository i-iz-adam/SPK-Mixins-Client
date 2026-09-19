/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 */
package rs.l.f;

import com.google.a.b.as;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import rs.a.g_0;
import rs.gui.w;
import rs.k.e;
import rs.l.f.l;
import rs.runelite.a.i;

public class m {
    private static final int b = 4;
    private static final Stroke c = new BasicStroke(2.0f);
    private static final Stroke d = new BasicStroke(1.0f);
    public static final Color a = new Color(0, 0, 0, 50);

    public static void a(Graphics2D graphics2D, Shape shape, Color color) {
        m.a(graphics2D, shape, color, m.a());
    }

    public static void a(Graphics2D graphics2D, Shape shape, Color color, Stroke stroke) {
        m.a(graphics2D, shape, color, a, stroke);
    }

    public static void a(Graphics2D graphics2D, Shape shape, Color color, Color color2, Stroke stroke) {
        graphics2D.setColor(color);
        Stroke stroke2 = graphics2D.getStroke();
        graphics2D.setStroke(stroke);
        graphics2D.draw(shape);
        graphics2D.setColor(color2);
        graphics2D.fill(shape);
        graphics2D.setStroke(stroke2);
    }

    public static void b(Graphics2D graphics2D, Shape shape, Color color, Color color2, Stroke stroke) {
        graphics2D.setColor(color);
        Stroke stroke2 = graphics2D.getStroke();
        graphics2D.setStroke(stroke);
        graphics2D.draw(shape);
        graphics2D.setColor(g_0.a(color2, color2.getAlpha() / 5));
        graphics2D.fill(shape);
        graphics2D.setStroke(stroke2);
    }

    public static void a(Graphics2D graphics2D, i i2, String string, Color color) {
        if (as.c((String)string)) {
            return;
        }
        int n2 = i2.a();
        int n3 = i2.b();
        graphics2D.setFont(w.b());
        graphics2D.setColor(Color.BLACK);
        graphics2D.drawString(string, n2 + 1, n3 + 1);
        graphics2D.setColor(g_0.a(color, 255));
        graphics2D.drawString(string, n2, n3);
    }

    public static Stroke a() {
        if (e.a()) {
            return d;
        }
        return c;
    }

    static void a(l l2, Rectangle rectangle, Rectangle rectangle2, int n2) {
        int n3 = rectangle.x;
        int n4 = rectangle.y;
        switch (l2) {
            case f: {
                n3 = Math.max(n3, rectangle2.x + rectangle2.width + n2);
                break;
            }
            case g: {
                n3 = Math.min(n3, rectangle2.x - n2);
                break;
            }
            case c: 
            case d: 
            case i: 
            case e: {
                n4 = Math.max(n4, rectangle2.y + rectangle2.height + n2);
                break;
            }
            case h: {
                n4 = Math.min(n4, rectangle2.y - n2);
                break;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
        rectangle.x = n3;
        rectangle.y = n4;
    }

    public static Point a(l l2, Dimension dimension) {
        Point point = new Point();
        switch (l2) {
            case c: {
                break;
            }
            case d: {
                point.x = -dimension.width / 2;
                break;
            }
            case f: {
                point.y = -dimension.height;
                break;
            }
            case g: 
            case h: {
                point.y = -dimension.height;
            }
            case i: 
            case e: {
                point.x = -dimension.width;
                break;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
        return point;
    }
}

