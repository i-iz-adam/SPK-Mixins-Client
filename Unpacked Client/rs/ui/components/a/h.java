/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.m.l
 */
package rs.ui.components.a;

import com.google.a.m.l;
import java.awt.Color;
import java.awt.Graphics;
import java.util.function.Consumer;
import javax.swing.JPanel;
import rs.ui.components.a.i;
import rs.ui.components.a.j;

public class h
extends JPanel {
    static final int a = 4;
    private static final int b = 14;
    private static final Color c = new Color(20, 20, 20);
    private static final Color d = new Color(150, 150, 150);
    private int e = 259;
    private Consumer<Integer> f;

    h() {
        this.addMouseMotionListener(new i(this));
        this.addMouseListener(new j(this));
    }

    public void a(int n2) {
        this.a(n2 + 4, false);
    }

    private void a(int n2, boolean bl) {
        this.e = l.a((int)n2, (int)4, (int)259);
        this.paintImmediately(0, 0, this.getWidth(), this.getHeight());
        if (bl && this.f != null) {
            this.f.accept(this.a());
        }
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.setColor(c);
        graphics.fillRect(0, this.getHeight() / 2 - 2, 263, 5);
        graphics.setColor(d);
        graphics.fillRect(this.e - 2, this.getHeight() / 2 - 7, 4, 14);
    }

    int a() {
        return this.e - 4;
    }

    public void a(Consumer<Integer> consumer) {
        this.f = consumer;
    }

    static /* synthetic */ void a(h h2, int n2, boolean bl) {
        h2.a(n2, bl);
    }
}

