/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

import java.awt.Color;
import javax.swing.JPanel;

public class f
extends JPanel {
    private boolean a = false;
    private Color b = null;
    private Color c = null;
    private Color d = null;
    private Color e = null;

    @Override
    public void setForeground(Color color) {
        this.d = color;
        this.b = color.darker();
        super.setForeground(color);
    }

    @Override
    public void setBackground(Color color) {
        this.e = color;
        this.c = color.darker();
        super.setBackground(color);
    }

    @Override
    public Color getForeground() {
        return this.a ? this.b : this.d;
    }

    @Override
    public Color getBackground() {
        return this.a ? this.c : this.e;
    }

    public void a(boolean bl) {
        this.a = bl;
        if (bl) {
            super.setBackground(this.c);
            super.setForeground(this.b);
        } else {
            super.setBackground(this.e);
            super.setForeground(this.d);
        }
    }

    public boolean a() {
        return this.a;
    }
}

