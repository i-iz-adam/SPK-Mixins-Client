/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.m.l
 */
package rs.ui.components.a;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.function.Consumer;
import javax.swing.JPanel;
import rs.ui.components.a.l;
import rs.ui.components.a.m;

public class k
extends JPanel {
    private static final int a = 15;
    private static final int b = 4;
    private final int c;
    private int d;
    private Consumer<Integer> e;

    k(int n2) {
        this.c = n2;
        this.setPreferredSize(new Dimension(15, n2));
        this.addMouseMotionListener(new l(this));
        this.addMouseListener(new m(this));
    }

    public void a(Color color) {
        this.d = this.b(color);
        this.paintImmediately(0, 0, 15, this.c);
    }

    private void a(int n2) {
        if ((n2 = com.google.a.m.l.a((int)n2, (int)0, (int)(this.c - 1))) == this.d) {
            return;
        }
        this.d = n2;
        this.paintImmediately(0, 0, 15, this.c);
        if (this.e != null) {
            this.e.accept(n2);
        }
    }

    private int b(Color color) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float f2 = fArray[0];
        int n2 = this.c - 1;
        return Math.round((float)n2 - f2 * (float)n2);
    }

    @Override
    public void paint(Graphics graphics) {
        int n2;
        for (n2 = 0; n2 < this.c; ++n2) {
            graphics.setColor(this.b(n2));
            graphics.fillRect(0, n2, 15, 1);
        }
        n2 = 2;
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, this.d - 1, 15, 4);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(0, this.d - 2, 15, this.d - 2);
        graphics.drawLine(0, this.d + 2, 15, this.d + 2);
    }

    private Color b(int n2) {
        return Color.getHSBColor(1.0f - (float)n2 / (float)(this.c - 1), 1.0f, 1.0f);
    }

    public int a() {
        return this.d;
    }

    public void a(Consumer<Integer> consumer) {
        this.e = consumer;
    }

    static /* synthetic */ void a(k k2, int n2) {
        k2.a(n2);
    }
}

