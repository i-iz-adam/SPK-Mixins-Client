/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.d.ag
 */
package rs.ui;

import com.google.a.d.ag;
import java.awt.Component;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JPanel;
import rs.ui.d;
import rs.ui.l;

class c
extends JPanel {
    private static final int a = 23;
    private static final int b = 4;
    private final Map<l, Component> c = new TreeMap<l, Component>((l2, l3) -> ag.a().a(l2.i(), l3.i()).a((Comparable)((Object)l2.d()), (Comparable)((Object)l3.d())).b());

    c() {
        this.setLayout(new d(this));
    }

    void a(l l2, Component component) {
        if (this.c.put(l2, component) == null) {
            this.a();
        }
    }

    void a(l l2) {
        if (this.c.remove(l2) != null) {
            this.a();
        }
    }

    private void a() {
        this.removeAll();
        this.c.values().forEach(this::add);
        this.repaint();
    }
}

