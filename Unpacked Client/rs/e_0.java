/*
 * Decompiled with CFR 0.152.
 */
package rs;

import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JFrame;
import rs.c_0;
import rs.f.a;

/*
 * Renamed from rs.E
 */
public final class e_0
extends JFrame {
    private final c_0 a;

    public e_0(c_0 c_02) {
        this.a = c_02;
    }

    public e_0(c_0 c_02, int n2, int n3) {
        this.a = c_02;
        this.setTitle("Jagex");
        this.setResizable(true);
        this.setFocusTraversalKeysEnabled(false);
        this.setVisible(true);
        this.toFront();
        this.setSize(n2 + 8, n3 + 28);
    }

    @Override
    public Graphics getGraphics() {
        Graphics graphics = super.getGraphics();
        return graphics;
    }

    @Override
    public void update(Graphics graphics) {
        super.update(graphics);
        this.a.update(graphics);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.a.paint(graphics);
    }

    @Override
    public void setCursor(Cursor cursor) {
        if (rs.f.a.ai == a.c.b) {
            super.setCursor(cursor);
        } else {
            super.setCursor(Cursor.getDefaultCursor());
        }
    }
}

