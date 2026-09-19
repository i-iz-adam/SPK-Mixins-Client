/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.t;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import rs.s.t.c;
import rs.s.t.d;
import rs.s.t.i;
import rs.ui.components.u;

public class g
extends JPanel {
    private static final String a = "ERROR_PANEL";
    private static final String b = "OFFERS_PANEL";
    private GridBagConstraints c = new GridBagConstraints();
    private final CardLayout d = new CardLayout();
    private final JPanel e = new JPanel();
    private final JPanel f = new JPanel(this.d);
    private final i g;
    private final ScheduledExecutorService h;
    private final ArrayList<d> i = new ArrayList();

    @Inject
    public g(ScheduledExecutorService scheduledExecutorService, i i2) {
        this.g = i2;
        this.h = scheduledExecutorService;
        this.setLayout(new BorderLayout());
        this.setBackground(rs.gui.d.d);
        this.c.fill = 2;
        this.c.weightx = 1.0;
        this.c.gridx = 0;
        this.c.gridy = 0;
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.setBackground(rs.gui.d.d);
        jPanel.add((Component)this.e, "North");
        this.e.setLayout(new GridBagLayout());
        this.e.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.e.setBackground(rs.gui.d.d);
        JScrollPane jScrollPane = new JScrollPane(jPanel);
        jScrollPane.setBackground(rs.gui.d.d);
        jScrollPane.getVerticalScrollBar().setUnitIncrement(8);
        jScrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(12, 0));
        jScrollPane.getVerticalScrollBar().setBorder(new EmptyBorder(0, 5, 0, 0));
        jScrollPane.setVisible(false);
        JPanel jPanel2 = new JPanel(new BorderLayout());
        jPanel2.setBackground(rs.gui.d.d);
        u u2 = new u();
        jPanel2.add((Component)u2, "North");
        u2.setBorder(new EmptyBorder(50, 20, 20, 20));
        u2.a("No listings detected", "No trading post listings were found on your account.");
        this.f.add((Component)jScrollPane, b);
        this.f.add((Component)jPanel2, a);
        this.add((Component)this.f, "Center");
        this.a();
    }

    void a() {
        this.e.removeAll();
        this.i.clear();
        this.c();
    }

    d a(int n2) {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            d d2 = this.i.get(i2);
            if (d2 == null || d2.a() != n2) continue;
            return d2;
        }
        return null;
    }

    void b(int n2) {
        SwingUtilities.invokeLater(() -> {
            d d2 = this.a(n2);
            if (d2 != null) {
                this.e.remove(d2);
                this.i.remove(d2);
                this.revalidate();
                this.repaint();
                this.c();
            }
        });
    }

    void a(c c2) {
        this.h.execute(() -> {
            Image image;
            for (int i2 = 0; i2 <= 5 && (image = this.g.a(c2.f())) == null; ++i2) {
                try {
                    Thread.sleep(100L);
                    continue;
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
            SwingUtilities.invokeLater(() -> {
                d d2 = this.a(c2.f());
                if (d2 == null) {
                    d2 = new d(this.g);
                    this.i.add(d2);
                    this.e.add((Component)d2, this.c);
                    ++this.c.gridy;
                }
                d2.a(c2);
                this.b();
                this.revalidate();
                this.repaint();
                this.c();
            });
        });
    }

    private void b() {
        if (this.e.getComponentCount() <= 0) {
            return;
        }
        JPanel jPanel = (JPanel)this.e.getComponent(0);
        jPanel.setBorder(null);
    }

    private void c() {
        if (this.i.isEmpty()) {
            this.e.removeAll();
            SwingUtilities.invokeLater(() -> this.d.show(this.f, a));
        } else {
            SwingUtilities.invokeLater(() -> this.d.show(this.f, b));
        }
    }
}

