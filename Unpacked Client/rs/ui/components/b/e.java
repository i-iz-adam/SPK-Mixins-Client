/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components.b;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import rs.ui.components.b.a;

public class e
extends JPanel {
    private final JPanel a;
    private final List<a> b = new ArrayList<a>();

    public e(JPanel jPanel) {
        this.a = jPanel;
        if (jPanel != null) {
            this.a.setLayout(new BorderLayout());
        }
        this.setLayout(new FlowLayout(1, 8, 0));
        this.setOpaque(false);
    }

    public e() {
        this((JPanel)null);
    }

    public a a(int n2) {
        if (this.b == null || this.b.isEmpty()) {
            return null;
        }
        return this.b.get(n2);
    }

    public void a(a a2) {
        this.b.add(a2);
        this.add((Component)a2, "North");
    }

    public boolean b(a a2) {
        if (!this.b.contains(a2) || a2.d()) {
            return false;
        }
        if (!a2.a()) {
            return false;
        }
        if (this.a != null) {
            this.a.removeAll();
            this.a.add(a2.c());
            this.a.revalidate();
            this.a.repaint();
        }
        for (a a3 : this.b) {
            if (a3.equals(a2)) continue;
            a3.b();
        }
        return true;
    }
}

