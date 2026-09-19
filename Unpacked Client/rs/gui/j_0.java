/*
 * Decompiled with CFR 0.152.
 */
package rs.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import rs.gui.b.h;
import rs.gui.c.a;
import rs.gui.d;
import rs.gui.e;
import rs.gui.g_0;
import rs.gui.k_0;
import rs.gui.l_0;

/*
 * Renamed from rs.gui.J
 */
public class j_0
extends JPanel {
    private static final long b = 5486814990120132059L;
    public static boolean a = true;
    private JTabbedPane c;
    private a d;
    private rs.gui.a.a e;
    private g_0 f;
    private h g;
    private e h;
    private rs.s.c.d i;

    public j_0() {
        this.addMouseListener(new k_0(this));
        this.g = new h();
        this.f = new g_0();
        this.c = new JTabbedPane();
        this.h = new e();
        this.d = new a();
        this.e = new rs.gui.a.a();
        if (rs.s.c.d.b()) {
            this.i = new rs.s.c.d();
        }
        this.setBackground(rs.gui.d.a);
        this.g.setBackground(rs.gui.d.c);
        this.f.setBackground(rs.gui.d.c);
        this.h.setBackground(rs.gui.d.c);
        this.c.setBackground(new Color(10, 10, 10));
        this.c.setForeground(rs.gui.d.f);
        l_0 l_02 = new l_0(this);
        this.c.addChangeListener(l_02);
        this.c.setTabLayoutPolicy(1);
        this.c.setBorder(BorderFactory.createLineBorder(rs.gui.d.d));
        this.g.setPreferredSize(new Dimension(344, 480));
        this.c.addTab("Loadouts", null, this.g);
        this.d.setPreferredSize(new Dimension(344, 480));
        this.c.addTab("PvP Tracker", null, this.d);
        this.e.setPreferredSize(new Dimension(344, 480));
        this.c.addTab("GPU (Beta)", null, this.e);
        this.c.setBackgroundAt(this.c.getTabCount() - 1, Color.GREEN.darker());
        this.c.setForegroundAt(this.c.getTabCount() - 1, Color.GREEN);
        if (rs.s.c.d.b()) {
            this.i.setPreferredSize(new Dimension(344, 480));
            this.c.addTab("Development", this.i);
        } else {
            this.f.setPreferredSize(new Dimension(344, 480));
            this.c.addTab("Item Search", null, this.f);
        }
        this.c.setPreferredSize(new Dimension(354, 490));
        this.add((Component)this.c, "Center");
    }

    public void a(int n2) {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        JLabel jLabel = new JLabel("This is the panel for tab #" + n2);
        JLabel jLabel2 = new JLabel("This was added as a placeholder.");
        JLabel jLabel3 = new JLabel("By the way, I'm going to theme this whole side panel.");
        JLabel jLabel4 = new JLabel("It'll look nice as fuck, nigga.");
        jPanel.add(jLabel);
        jPanel.add(jLabel2);
        jPanel.add(jLabel3);
        jPanel.add(jLabel4);
        this.c.addTab("Tab #" + n2, jPanel);
    }

    public void a(Graphics graphics) {
        this.g.a(graphics);
    }

    public h a() {
        return this.g;
    }

    public a b() {
        return this.d;
    }

    public JTabbedPane c() {
        return this.c;
    }

    public rs.gui.a.a d() {
        return this.e;
    }

    public rs.s.c.d e() {
        return this.i;
    }
}

