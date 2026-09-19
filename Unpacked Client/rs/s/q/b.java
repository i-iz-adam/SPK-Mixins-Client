/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.q;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import rs.s.q.a;
import rs.s.q.c;
import rs.s.q.d;
import rs.ui.m;

public class b
extends m {
    private final JPanel a = new JPanel();
    private final rs.s.q.b.a b = new rs.s.q.b.a(rs.s.q.d.e.i());
    private final a c;
    private final d d;

    @Inject
    private b(d d2, a a2) {
        super(false);
        this.d = d2;
        this.c = a2;
        this.setLayout(new BoxLayout(this, 1));
        this.setBackground(rs.gui.d.d);
        this.setBorder(new EmptyBorder(8, 8, 8, 8));
        JPanel jPanel = new JPanel(new BorderLayout());
        this.add(new rs.s.q.b.b("Current Fight", false));
        JPanel jPanel2 = new JPanel(new BorderLayout());
        jPanel2.setMaximumSize(new Dimension(350, (int)jPanel2.getPreferredSize().getHeight()));
        jPanel2.add((Component)this.b, "Center");
        this.add(jPanel2);
        this.a.setLayout(new BoxLayout(this.a, 1));
        JPanel jPanel3 = new JPanel(new BorderLayout());
        rs.s.q.b.b b2 = new rs.s.q.b.b("Fight History (Filter by Usernames):", true);
        this.add(b2);
        JLabel jLabel = new JLabel("Filter Usernames:");
        jLabel.setHorizontalAlignment(0);
        JTextField jTextField = new JTextField("");
        jPanel3.setMaximumSize(new Dimension(350, (int)jPanel3.getPreferredSize().getHeight()));
        jTextField.getDocument().addDocumentListener(new c(this, d2, jTextField));
        jPanel3.add((Component)jTextField, "Center");
        this.add(Box.createRigidArea(new Dimension(0, 4)));
        b2.add(jPanel3);
        this.add(b2);
        this.add(Box.createRigidArea(new Dimension(0, 4)));
        JScrollPane jScrollPane = new JScrollPane(jPanel);
        jScrollPane.setBackground(rs.gui.d.d);
        jScrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(6, 0));
        jPanel.add((Component)this.a, "North");
        this.add(Box.createRigidArea(new Dimension(0, 4)));
        this.add(jScrollPane);
    }

    public void a(rs.s.q.a.a a2) {
        if (!this.c.c().isEmpty() && (this.c.b() ? !a2.e().k().toLowerCase().equals(this.c.c()) : !a2.e().k().toLowerCase().startsWith(this.c.c()))) {
            return;
        }
        SwingUtilities.invokeLater(() -> {
            this.a.add((Component)new rs.s.q.b.a(a2), 0);
            if (this.a.getComponentCount() > this.c.a()) {
                int n2 = this.a.getComponentCount() - this.c.a();
                for (int i2 = 0; i2 < n2 && this.a.getComponentCount() > 0; ++i2) {
                    this.a.remove(this.a.getComponentCount() - 1);
                }
            }
            this.updateUI();
        });
    }

    public void a(ArrayList<rs.s.q.a.a> arrayList) {
        if (!this.c.c().isEmpty()) {
            arrayList.removeIf(a2 -> this.c.b() ? !a2.e().k().toLowerCase().equals(this.c.c()) : !a2.e().k().toLowerCase().startsWith(this.c.c()));
        }
        SwingUtilities.invokeLater(() -> {
            if (arrayList.size() > this.c.a()) {
                int n2 = arrayList.size() - this.c.a();
                arrayList.removeIf(a2 -> arrayList.indexOf(a2) < n2);
                this.a.removeAll();
            } else {
                int n3 = arrayList.size();
                int n4 = this.a.getComponentCount() - this.c.a() + n3;
                if (n4 > 0) {
                    for (int i2 = 0; i2 < n4 && this.a.getComponentCount() > 0; ++i2) {
                        this.a.remove(this.a.getComponentCount() - 1);
                    }
                }
            }
            arrayList.forEach(a2 -> this.a.add((Component)new rs.s.q.b.a((rs.s.q.a.a)a2), 0));
            this.updateUI();
        });
    }

    public void b() {
        this.a.removeAll();
        if (!this.d.j().isEmpty()) {
            ArrayList<rs.s.q.a.a> arrayList = new ArrayList<rs.s.q.a.a>(this.d.j());
            this.a(arrayList);
        }
        SwingUtilities.invokeLater(this::updateUI);
    }

    public rs.s.q.b.a c() {
        return this.b;
    }
}

