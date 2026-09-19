/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Provider
 *  javax.inject.Singleton
 */
package rs.s.b;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import rs.a.j_0;
import rs.eventbus.EventBus;
import rs.s.a;
import rs.s.b.q;
import rs.ui.components.b.e;
import rs.ui.m;

@Singleton
class w
extends m {
    private final e a;
    private final CardLayout b;
    private final JPanel c;
    private final EventBus d;
    private final q e;
    private final rs.ui.components.b.a f;
    private boolean g = false;
    private m k;
    private boolean l;

    @Inject
    w(EventBus eventBus, q q2) {
        super(false);
        this.d = eventBus;
        this.a = new e();
        this.a.setLayout(new GridLayout(1, 0, 7, 7));
        this.a.setBorder(new EmptyBorder(10, 10, 0, 10));
        this.c = new JPanel();
        this.b = new CardLayout();
        this.c.setLayout(this.b);
        this.setLayout(new BorderLayout());
        this.add((Component)this.c, "Center");
        this.e = q2;
        this.c.add(q2);
        this.f = this.a(q2.e(), "config_icon_lg.png", "Configuration");
    }

    private rs.ui.components.b.a a(m m2, String string, String string2) {
        rs.ui.components.b.a a2 = new rs.ui.components.b.a(new ImageIcon(j_0.b(w.class, string)), this.a, null);
        a2.setToolTipText(string2);
        this.a.a(a2);
        this.c.add(string, m2.l());
        this.d.register(m2);
        a2.a(() -> {
            this.a(string, m2, false);
            return true;
        });
        return a2;
    }

    private rs.ui.components.b.a a(Provider<? extends m> provider, String string, String string2) {
        rs.ui.components.b.a a2 = new rs.ui.components.b.a(new ImageIcon(j_0.b(w.class, string)), this.a, null);
        a2.setToolTipText(string2);
        this.a.a(a2);
        a2.a(() -> {
            m m2 = (m)provider.get();
            this.c.add(string, m2.l());
            this.d.register(m2);
            this.a(string, m2, true);
            return true;
        });
        return a2;
    }

    private void a(String string, m m2, boolean bl) {
        boolean bl2 = this.l;
        m m3 = this.k;
        if (this.g) {
            m3.K_();
            m2.J_();
        }
        this.k = m2;
        this.l = bl;
        this.b.show(this.c, string);
        if (bl2) {
            this.c.remove(m3.l());
            this.d.unregister(m3);
        }
        this.c.revalidate();
    }

    @Override
    public void J_() {
        this.g = true;
        this.e.J_();
    }

    @Override
    public void K_() {
        this.g = false;
        this.e.K_();
    }

    public void a(String string) {
        this.a.b(this.f);
        this.e.b(string);
    }

    public void a(a a2) {
        this.a.b(this.f);
        this.e.a(a2);
    }

    public void b(String string) {
        this.a.b(this.f);
        this.e.a(string);
    }
}

