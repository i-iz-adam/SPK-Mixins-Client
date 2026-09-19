/*
 * Decompiled with CFR 0.152.
 */
package rs.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import rs.gui.d;
import rs.ui.j;

public class m
extends JPanel {
    public static final int h = 350;
    public static final int i = 17;
    public static final int j = 6;
    private static final EmptyBorder a = new EmptyBorder(6, 6, 6, 6);
    private static final Dimension b = new Dimension(367, 0);
    private final JScrollPane c;
    private final JPanel d;

    protected m() {
        this(true);
    }

    protected m(boolean bl) {
        if (bl) {
            this.setBorder(a);
            this.setLayout(new j(0, 1, 0, 3));
            this.setBackground(rs.gui.d.d);
            JPanel jPanel = new JPanel();
            jPanel.setLayout(new BorderLayout());
            jPanel.add((Component)this, "North");
            jPanel.setBackground(rs.gui.d.d);
            this.c = new JScrollPane(jPanel);
            this.c.setHorizontalScrollBarPolicy(31);
            this.d = new JPanel();
            this.d.setPreferredSize(b);
            this.d.setLayout(new BorderLayout());
            this.d.add((Component)this.c, "Center");
        } else {
            this.c = null;
            this.d = this;
        }
    }

    @Override
    public Dimension getPreferredSize() {
        int n2 = this == this.d ? 367 : 350;
        return new Dimension(n2, super.getPreferredSize().height);
    }

    public void J_() {
    }

    public void K_() {
    }

    protected JScrollPane k() {
        return this.c;
    }

    public JPanel l() {
        return this.d;
    }
}

