/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.k;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import rs.l.f.b.d;
import rs.n.c.c;

public class a
extends d {
    private static final double h = 26.0;
    private static final int i = 0;

    @Override
    public void a() {
        if (rs.n.c.c.bJ > 0) {
            float f2 = (float)rs.n.c.c.bJ / (float)rs.n.c.c.bK;
            if (this.a.gZ == null || this.a.gZ.e == null || this.a.gZ.e.getGraphics() == null) {
                return;
            }
            this.a((Graphics2D)this.a.gZ.e.getGraphics(), this.e, this.f, f2, Color.GREEN);
        }
    }

    private void a(Graphics2D graphics2D, int n2, int n3, double d2, Color color) {
        if (d2 < 0.01) {
            return;
        }
        double d3 = 68.0;
        double d4 = 68.0;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        Rectangle rectangle = new Rectangle((int)((double)n2 - d3 / 2.0), (int)((double)n3 - d4 / 2.0), 45, 45);
        Arc2D.Double double_ = new Arc2D.Double(rectangle.x + 0, (double)rectangle.y + ((double)(rectangle.height / 2) - 13.0) - 1.0, d3, d4, 90.0, -360.0 * d2, 0);
        BasicStroke basicStroke = new BasicStroke(3.0f, 0, 0);
        graphics2D.setStroke(basicStroke);
        graphics2D.setColor(color);
        graphics2D.draw(double_);
    }
}

