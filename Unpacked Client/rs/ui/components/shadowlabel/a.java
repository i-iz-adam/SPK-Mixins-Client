/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components.shadowlabel;

import java.awt.Color;
import java.awt.Point;
import javax.swing.JLabel;
import rs.ui.components.shadowlabel.JShadowedLabelUI;

public class a
extends JLabel {
    private Color a = Color.BLACK;
    private Point b = new Point(1, 1);

    public a() {
        this.setUI(new JShadowedLabelUI());
    }

    public a(String string) {
        super(string);
        this.setUI(new JShadowedLabelUI());
    }

    public void a(Color color) {
        this.a = color;
        this.repaint();
    }

    public void a(Point point) {
        this.b = point;
        this.revalidate();
        this.repaint();
    }

    public Color a() {
        return this.a;
    }

    public Point b() {
        return this.b;
    }
}

