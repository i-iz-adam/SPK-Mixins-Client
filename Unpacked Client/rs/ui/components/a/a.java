/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.m.l
 */
package rs.ui.components.a;

import com.google.a.m.l;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.function.Consumer;
import javax.swing.JPanel;
import rs.ui.components.a.b;
import rs.ui.components.a.c;

public class a
extends JPanel {
    private static final int a = 7;
    private final int b;
    private final BufferedImage c;
    private Point d;
    private int e;
    private boolean f;
    private Consumer<Color> g;

    a(int n2) {
        this.b = n2;
        this.c = new BufferedImage(n2, n2, 1);
        this.d = new Point(n2, 0);
        this.setPreferredSize(new Dimension(n2, n2));
        this.addMouseMotionListener(new b(this));
        this.addMouseListener(new c(this));
    }

    void a(int n2) {
        if (this.e == n2) {
            return;
        }
        this.e = n2;
        this.a();
        if (this.g != null) {
            this.g.accept(this.a(this.d.x, this.d.y));
        }
        this.paintImmediately(0, 0, this.b, this.b);
    }

    void a(int n2, Color color) {
        Point point = this.a(color);
        if (this.e == n2 && point.x == this.d.x && point.y == this.d.y) {
            return;
        }
        this.e = n2;
        this.a();
        this.a(point.x, point.y, false);
    }

    private Point a(Color color) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        int n2 = this.b - 1;
        return new Point((int)(fArray[1] * (float)n2), n2 - (int)(fArray[2] * (float)n2));
    }

    private void a(int n2, int n3, boolean bl) {
        if (this.d.x == n2 && this.d.y == n3 && !this.f) {
            return;
        }
        n2 = l.a((int)n2, (int)0, (int)(this.b - 1));
        n3 = l.a((int)n3, (int)0, (int)(this.b - 1));
        this.d = new Point(n2, n3);
        this.paintImmediately(0, 0, this.b, this.b);
        if (this.g != null && bl) {
            this.g.accept(this.a(n2, n3));
        }
        this.f = false;
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.drawImage(this.c, 0, 0, null);
        int n2 = this.d.x - 3;
        int n3 = this.d.y - 3;
        graphics.setColor(Color.WHITE);
        graphics.fillOval(n2, n3, 7, 7);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(n2, n3, 7, 7);
    }

    private void a() {
        Color color = Color.getHSBColor(1.0f - (float)this.e / (float)(this.b - 1), 1.0f, 1.0f);
        Graphics2D graphics2D = this.c.createGraphics();
        GradientPaint gradientPaint = new GradientPaint(0.0f, 0.0f, Color.WHITE, this.b - 1, 0.0f, color);
        GradientPaint gradientPaint2 = new GradientPaint(0.0f, 0.0f, new Color(0, 0, 0, 0), 0.0f, this.b - 1, Color.BLACK);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillRect(0, 0, this.b, this.b);
        graphics2D.setPaint(gradientPaint2);
        graphics2D.fillRect(0, 0, this.b, this.b);
        graphics2D.dispose();
        this.f = true;
    }

    private Color a(int n2, int n3) {
        n2 = l.a((int)n2, (int)0, (int)(this.b - 1));
        n3 = l.a((int)n3, (int)0, (int)(this.b - 1));
        return new Color(this.c.getRGB(n2, n3));
    }

    public void a(Consumer<Color> consumer) {
        this.g = consumer;
    }

    static /* synthetic */ void a(a a2, int n2, int n3, boolean bl) {
        a2.a(n2, n3, bl);
    }
}

