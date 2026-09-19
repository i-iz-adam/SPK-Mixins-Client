/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.t;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.inject.Inject;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import rs.gui.d;
import rs.s.t.g;
import rs.s.t.l;
import rs.ui.components.b.a;
import rs.ui.components.b.e;
import rs.ui.m;

public class h
extends m {
    private final JPanel a = new JPanel();
    private final e b = new e(this.a);
    private final a c;
    private final l d;
    private final g e;

    @Inject
    h(l l2, g g2) {
        super(false);
        this.d = l2;
        this.e = g2;
        this.setLayout(new BorderLayout());
        this.setBackground(rs.gui.d.d);
        a a2 = new a("Your Listings", this.b, (JComponent)g2);
        this.c = new a("Search", this.b, (JComponent)l2);
        this.b.setBorder(new EmptyBorder(5, 0, 0, 0));
        this.b.a(a2);
        this.b.a(this.c);
        this.b.b(a2);
        this.add((Component)this.b, "North");
        this.add((Component)this.a, "Center");
    }

    void b() {
        if (this.d.isShowing()) {
            return;
        }
        this.b.b(this.c);
        this.revalidate();
    }

    public l c() {
        return this.d;
    }

    public g e() {
        return this.e;
    }
}

