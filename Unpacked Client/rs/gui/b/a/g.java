/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.a;

import javax.swing.Icon;
import javax.swing.JButton;
import rs.gui.b.a.h;
import rs.gui.b.a.i;
import rs.gui.b.a.y;
import rs.gui.b.d;

public class g
extends JButton {
    private final d a;

    public g(Icon icon, d d2) {
        super("", icon);
        this.a = d2;
        this.addActionListener(new h(this));
    }

    public void a() {
        y y2 = new y(this.a, "Name Your Loadout", "Create");
        y2.a(new i(this, y2));
        y2.setVisible(true);
    }

    static /* synthetic */ d a(g g2) {
        return g2.a;
    }
}

