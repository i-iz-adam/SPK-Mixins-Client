/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class y
extends JPanel {
    private int a = 1;
    private int b;

    public y() {
        this.setForeground(Color.GREEN);
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 4));
        this.setMinimumSize(new Dimension(0, 4));
        this.setPreferredSize(new Dimension(0, 4));
        this.setSize(new Dimension(0, 4));
        this.setOpaque(true);
    }

    public double a() {
        return this.b * 100 / this.a;
    }

    @Override
    public void setForeground(Color color) {
        super.setForeground(color);
        this.setBackground(color.darker().darker());
    }

    public void a(int n2) {
        if (n2 < 1) {
            n2 = 1;
        }
        this.a = n2;
        this.repaint();
    }

    public void b(int n2) {
        this.b = n2;
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        int n2 = this.getWidth();
        int n3 = this.getHeight();
        int n4 = this.b * n2 / this.a;
        graphics.setColor(this.getBackground());
        graphics.fillRect(n4, 0, n2, n3);
        graphics.setColor(this.getForeground());
        graphics.fillRect(0, 0, n4, n3);
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }
}

