/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package rs.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import rs.ui.components.w;

public class x
implements w {
    private static final Pattern a = Pattern.compile("<col=([0-9a-fA-F]{2,6})>");
    private String b;
    private Point c = new Point();
    private Color d = Color.WHITE;
    private boolean e;
    @Nullable
    private Font f;

    @Override
    public Dimension a(Graphics2D graphics2D) {
        String string;
        Font font = null;
        if (this.f != null) {
            font = graphics2D.getFont();
            graphics2D.setFont(this.f);
        }
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        Matcher matcher = a.matcher(this.b);
        Color color = this.d;
        int n2 = 0;
        int n3 = 0;
        while (matcher.find()) {
            string = matcher.group(1);
            String string2 = this.b.substring(n2, matcher.start());
            n2 = matcher.end();
            this.a(graphics2D, color, this.c.x + n3, this.c.y, string2);
            n3 += fontMetrics.stringWidth(string2);
            color = Color.decode("#" + string);
        }
        string = this.b.substring(n2);
        this.a(graphics2D, color, this.c.x + n3, this.c.y, string);
        n3 += fontMetrics.stringWidth(string);
        int n4 = fontMetrics.getHeight();
        if (font != null) {
            graphics2D.setFont(font);
        }
        return new Dimension(n3, n4);
    }

    private void a(Graphics2D graphics2D, Color color, int n2, int n3, String string) {
        if (string.isEmpty()) {
            return;
        }
        graphics2D.setColor(Color.BLACK);
        if (this.e) {
            graphics2D.drawString(string, n2, n3 + 1);
            graphics2D.drawString(string, n2, n3 - 1);
            graphics2D.drawString(string, n2 + 1, n3);
            graphics2D.drawString(string, n2 - 1, n3);
        } else {
            graphics2D.drawString(string, n2 + 1, n3 + 1);
        }
        graphics2D.setColor(color);
        graphics2D.drawString(string, n2, n3);
    }

    public void a(String string) {
        this.b = string;
    }

    public void a(Point point) {
        this.c = point;
    }

    public void a(Color color) {
        this.d = color;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public void a(@Nullable Font font) {
        this.f = font;
    }
}

