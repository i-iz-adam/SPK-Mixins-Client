/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class b
extends JButton {
    private static final int a = 120;
    private static final int b = 10;
    private Color c;

    public b(String string, Color color) {
        super(string);
        this.setContentAreaFilled(false);
        this.a(color);
    }

    public void a(Color color) {
        this.c = color;
        double d2 = (0.299 * (double)color.getRed() + 0.587 * (double)color.getGreen() + 0.114 * (double)color.getBlue()) / 255.0;
        Color color2 = d2 > 0.5 || color.getAlpha() < 120 ? Color.BLACK : Color.WHITE;
        this.setForeground(color2);
    }

    @Override
    public void paint(Graphics graphics) {
        if (this.c.getAlpha() != 255) {
            for (int i2 = 0; i2 < this.getWidth(); i2 += 10) {
                for (int i3 = 0; i3 < this.getHeight(); i3 += 10) {
                    int n2 = (i2 / 10 + i3 / 10) % 2;
                    graphics.setColor(n2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
                    graphics.fillRect(i2, i3, 10, 10);
                }
            }
        }
        graphics.setColor(this.c);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        super.paint(graphics);
    }

    public Color a() {
        return this.c;
    }
}

