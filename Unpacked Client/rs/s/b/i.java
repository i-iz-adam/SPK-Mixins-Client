/*
 * Decompiled with CFR 0.152.
 */
package rs.s.b;

import javax.swing.JButton;
import rs.gui.w;
import rs.s.b.j;
import rs.s.b.k;
import rs.s.b.l;

public class i
extends JButton {
    private l a;

    public i(l l2, boolean bl) {
        this.setFont(w.d().deriveFont(12.0f));
        this.a(l2);
        this.addMouseListener(new j(this));
        this.addKeyListener(new k(this, bl));
    }

    public void a(l l2) {
        if (l2 == null) {
            l2 = l.a;
        }
        this.a = l2;
        this.setText(l2.toString());
    }

    public l a() {
        return this.a;
    }
}

