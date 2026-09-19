/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.c;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.inject.Inject;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import rs.a.j_0;
import rs.s.b.q;
import rs.s.c.c;
import rs.s.c.d;
import rs.ui.components.b.a;
import rs.ui.components.b.e;
import rs.ui.m;

public class g
extends m {
    private final d a;
    private final c b;
    private final e c;
    private final CardLayout d;
    private final JPanel e;
    private final a f;
    private final a g;
    private m k;
    private boolean l = false;
    private boolean m;
    private final q n;

    @Inject
    public g(q q2, c c2) {
        super(false);
        this.n = q2;
        this.b = c2;
        this.c = new e();
        this.c.setLayout(new GridLayout(1, 0, 7, 7));
        this.c.setBorder(new EmptyBorder(10, 10, 0, 10));
        this.e = new JPanel();
        this.d = new CardLayout();
        this.e.setLayout(this.d);
        this.setLayout(new BorderLayout());
        this.add((Component)this.c, "North");
        this.add((Component)this.e, "Center");
        this.a = rs.s.c.c.b;
        this.f = this.a(this.a, "palette.png", "Recolor models");
        this.g = this.a(q2.b(c2), "interface.png", "Interfaces");
        this.c.b(this.f);
    }

    private a a(m m2, String string, String string2) {
        a a2 = new a(new ImageIcon(j_0.b(g.class, string)), this.c, null);
        a2.setToolTipText(string2);
        this.c.a(a2);
        this.e.add(string, m2.l());
        a2.a(() -> {
            this.a(string, m2, false);
            return true;
        });
        return a2;
    }

    private void a(String string, m m2, boolean bl) {
        boolean bl2 = this.m;
        m m3 = this.k;
        if (this.l) {
            m3.K_();
            m2.J_();
        }
        this.k = m2;
        this.m = bl;
        this.d.show(this.e, string);
        if (bl2) {
            this.e.remove(m3.l());
        }
        this.e.revalidate();
    }

    @Override
    public void J_() {
        this.l = true;
        this.k.J_();
    }

    @Override
    public void K_() {
        this.l = false;
        this.k.K_();
    }
}

