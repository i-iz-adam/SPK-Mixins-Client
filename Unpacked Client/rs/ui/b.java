/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.d.ag
 */
package rs.ui;

import com.google.a.d.ag;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.Box;
import javax.swing.JToolBar;
import rs.ui.l;

public class b
extends JToolBar {
    private static final int a = 36;
    private static final int b = 503;
    private final Map<l, Component> c = new TreeMap<l, Component>((l2, l3) -> ag.a().a(l2.c(), l3.c()).a(l2.i(), l3.i()).a((Comparable)((Object)l2.d()), (Comparable)((Object)l3.d())).b());

    b() {
        super(1);
        this.setFloatable(false);
        this.setSize(new Dimension(36, 503));
        this.setMinimumSize(new Dimension(36, 503));
        this.setPreferredSize(new Dimension(36, 503));
        this.setMaximumSize(new Dimension(36, Integer.MAX_VALUE));
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
        boolean bl = false;
        for (Map.Entry<l, Component> entry : this.c.entrySet()) {
            if (!entry.getKey().c() && !bl) {
                bl = true;
                this.add(Box.createVerticalGlue());
                this.addSeparator();
            }
            this.add(entry.getValue());
        }
        this.repaint();
    }
}

