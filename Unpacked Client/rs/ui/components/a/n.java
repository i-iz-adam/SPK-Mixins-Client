/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components.a;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class n
extends JPanel {
    private static final int a = 10;
    private Color b;

    n() {
    }

    void a(Color color) {
        this.b = color;
        this.paintImmediately(0, 0, this.getWidth(), this.getHeight());
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        if (this.b.getAlpha() != 255) {
            for (int i2 = 0; i2 < this.getWidth(); i2 += 10) {
                for (int i3 = 0; i3 < this.getHeight(); i3 += 10) {
                    int n2 = (i2 / 10 + i3 / 10) % 2;
                    graphics.setColor(n2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
                    graphics.fillRect(i2, i3, 10, 10);
                }
            }
        }
        graphics.setColor(this.b);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    public Color a() {
        return this.b;
    }
}

