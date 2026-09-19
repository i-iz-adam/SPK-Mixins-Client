/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import rs.ui.components.d;
import rs.ui.components.w;

public class a
implements w {
    private static final int a = 2;
    private static final float b = 0.2f;
    private static final float c = 0.8f;
    private static final float d = 1.2f;
    private static final float e = 1.4f;
    private Color f = rs.ui.components.d.c;
    private Rectangle g = new Rectangle();
    private boolean h = true;

    @Override
    public Dimension a(Graphics2D graphics2D) {
        Color color = new Color((int)((float)this.f.getRed() * 0.8f), (int)((float)this.f.getGreen() * 0.8f), (int)((float)this.f.getBlue() * 0.8f), Math.min(255, (int)((float)this.f.getAlpha() * 1.4f)));
        Color color2 = new Color(Math.min(255, (int)((float)this.f.getRed() * 1.2f)), Math.min(255, (int)((float)this.f.getGreen() * 1.2f)), Math.min(255, (int)((float)this.f.getBlue() * 1.2f)), Math.min(255, (int)((float)this.f.getAlpha() * 1.4f)));
        if (this.h) {
            graphics2D.setColor(this.f);
            graphics2D.fill(this.g);
        }
        Rectangle rectangle = new Rectangle();
        rectangle.setLocation(this.g.x, this.g.y);
        rectangle.setSize(this.g.width - 1, this.g.height - 1);
        graphics2D.setColor(color);
        graphics2D.draw(rectangle);
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setLocation(this.g.x + 1, this.g.y + 1);
        rectangle2.setSize(this.g.width - 2 - 1, this.g.height - 2 - 1);
        graphics2D.setColor(color2);
        graphics2D.draw(rectangle2);
        return new Dimension(this.g.getSize());
    }

    public a() {
    }

    public a(Color color, Rectangle rectangle, boolean bl) {
        this.f = color;
        this.g = rectangle;
        this.h = bl;
    }

    public void a(Color color) {
        this.f = color;
    }

    public void a(Rectangle rectangle) {
        this.g = rectangle;
    }

    public void a(boolean bl) {
        this.h = bl;
    }
}

