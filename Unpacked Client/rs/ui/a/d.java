/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 */
package rs.ui.a;

import com.google.a.b.as;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import rs.gui.w;
import rs.ui.a.c;
import rs.ui.components.a;
import rs.ui.components.q;
import rs.ui.components.x;

public class d
implements q {
    private static final int a = 3;
    private static final int b = 32;
    private String c;
    private final Rectangle d = new Rectangle();
    private Point e = new Point();
    private Dimension f = new Dimension(32, 32);
    private String g;
    private Color h = Color.WHITE;
    private Font i;
    private boolean j;
    private Color k = rs.ui.components.d.c;
    private BufferedImage l;
    private c m;

    @Override
    public Dimension a(Graphics2D graphics2D) {
        if (this.l == null) {
            return new Dimension();
        }
        graphics2D.setFont(this.d() < 32 ? w.b() : this.i);
        int n2 = this.e.x;
        int n3 = this.e.y;
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n4 = this.d();
        Rectangle rectangle = new Rectangle(n2, n3, n4, n4);
        a a2 = new a();
        a2.a(this.k);
        a2.a(rectangle);
        a2.a(graphics2D);
        graphics2D.drawImage((Image)this.l, n2 + (n4 - this.l.getWidth(null)) / 2, n3 + (n4 - this.l.getHeight(null)) / 2, null);
        if (!as.c((String)this.g)) {
            x x2 = new x();
            x2.a(this.h);
            x2.a(this.j);
            x2.a(this.g);
            x2.a(new Point(n2 + (n4 - fontMetrics.stringWidth(this.g)) / 2, n3 + n4 - 3));
            x2.a(graphics2D);
        }
        this.d.setBounds(rectangle);
        return rectangle.getSize();
    }

    private int d() {
        return Math.max(this.f.width, this.f.height);
    }

    public void a(String string) {
        this.c = string;
    }

    @Override
    public void a(Point point) {
        this.e = point;
    }

    @Override
    public void a(Dimension dimension) {
        this.f = dimension;
    }

    public void b(String string) {
        this.g = string;
    }

    public void a(Color color) {
        this.h = color;
    }

    public void a(Font font) {
        this.i = font;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public void b(Color color) {
        this.k = color;
    }

    public void a(BufferedImage bufferedImage) {
        this.l = bufferedImage;
    }

    public void a(c c2) {
        this.m = c2;
    }

    public String b() {
        return this.c;
    }

    @Override
    public Rectangle a() {
        return this.d;
    }

    public c c() {
        return this.m;
    }
}

