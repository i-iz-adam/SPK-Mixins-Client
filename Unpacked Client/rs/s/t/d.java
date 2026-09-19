/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package rs.s.t;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.annotation.Nullable;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import rs.A.p;
import rs.a.g_0;
import rs.a.j_0;
import rs.gui.w;
import rs.s.t.c;
import rs.s.t.e;
import rs.s.t.f;
import rs.s.t.i;
import rs.s.t.m;
import rs.ui.components.y;

public class d
extends JPanel {
    private static final int a = 45;
    private static final String b = "FACE_CARD";
    private static final String c = "DETAILS_CARD";
    private static final ImageIcon d;
    private static final ImageIcon e;
    private final i f;
    private final JPanel g = new JPanel();
    private final CardLayout h = new CardLayout();
    private final JLabel i = new JLabel();
    private final JLabel j = new JLabel();
    private final JLabel k = new JLabel();
    private final JLabel l = new JLabel();
    private final JLabel m = new JLabel();
    private final y n = new y();
    private boolean o = true;
    private int p;

    d(i i2) {
        this.f = i2;
        this.setLayout(new BorderLayout());
        this.setBackground(rs.gui.d.d);
        this.setBorder(new EmptyBorder(7, 0, 0, 0));
        e e2 = new e(this);
        this.g.setLayout(this.h);
        this.g.setBackground(rs.gui.d.c);
        JPanel jPanel = new JPanel();
        jPanel.setBackground(rs.gui.d.c);
        jPanel.setLayout(new BorderLayout());
        jPanel.addMouseListener(e2);
        this.i.setVerticalAlignment(0);
        this.i.setHorizontalAlignment(0);
        this.i.setPreferredSize(new Dimension(45, 45));
        this.j.setForeground(Color.WHITE);
        this.j.setVerticalAlignment(3);
        this.j.setFont(w.b());
        this.k.setForeground(rs.gui.d.f);
        this.k.setVerticalAlignment(1);
        this.k.setFont(w.b());
        JLabel jLabel = new JLabel();
        jLabel.setIcon(d);
        jLabel.setVerticalAlignment(0);
        jLabel.setHorizontalAlignment(0);
        jLabel.setPreferredSize(new Dimension(30, 45));
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(rs.gui.d.c);
        jPanel2.setLayout(new GridLayout(2, 1, 0, 2));
        jPanel2.add(this.j);
        jPanel2.add(this.k);
        jPanel.add((Component)jPanel2, "Center");
        jPanel.add((Component)this.i, "West");
        jPanel.add((Component)jLabel, "East");
        JPanel jPanel3 = new JPanel();
        jPanel3.setBackground(rs.gui.d.c);
        jPanel3.setLayout(new BorderLayout());
        jPanel3.setBorder(new EmptyBorder(0, 15, 0, 0));
        jPanel3.addMouseListener(e2);
        this.l.setForeground(Color.WHITE);
        this.l.setVerticalAlignment(3);
        this.l.setFont(w.b());
        this.m.setForeground(Color.WHITE);
        this.m.setVerticalAlignment(1);
        this.m.setFont(w.b());
        JLabel jLabel2 = new JLabel();
        jLabel2.setIcon(e);
        jLabel2.setVerticalAlignment(0);
        jLabel2.setHorizontalAlignment(0);
        jLabel2.setPreferredSize(new Dimension(30, 45));
        JPanel jPanel4 = new JPanel();
        jPanel4.setBackground(rs.gui.d.c);
        jPanel4.setLayout(new BoxLayout(jPanel4, 3));
        jPanel4.setPreferredSize(new Dimension(0, 45));
        JPanel jPanel5 = new JPanel();
        jPanel5.setBackground(rs.gui.d.c);
        jPanel5.setLayout(new BoxLayout(jPanel5, 3));
        jPanel5.add(this.l);
        jPanel5.add(this.m);
        jPanel4.add(Box.createVerticalGlue());
        jPanel4.add(jPanel5);
        jPanel4.add(Box.createVerticalGlue());
        jPanel3.add((Component)jPanel4, "Center");
        jPanel3.add((Component)jLabel2, "East");
        this.g.add((Component)jPanel, b);
        this.g.add((Component)jPanel3, c);
        this.h.show(this.g, b);
        this.add((Component)this.g, "Center");
        this.add((Component)this.n, "South");
    }

    void a(@Nullable c c2) {
        if (c2 == null) {
            return;
        }
        this.h.show(this.g, b);
        this.j.setText(c2.a());
        Image image = this.f.a(c2.f());
        if (image == null) {
            rs.h.c.a("TPOS" + System.nanoTime(), new f(this, c2));
        } else {
            this.i.setIcon(new ImageIcon(image));
        }
        String string = "Sold: " + rs.A.p.a(c2.g()) + " / " + rs.A.p.a(c2.h());
        this.k.setText(string);
        this.l.setIcon(new ImageIcon(c2.j().c()));
        this.l.setText(this.a("Price each: ", rs.A.p.b(c2.i())));
        String string2 = "Received: ";
        String string3 = rs.A.p.b(c2.b()) + " / " + rs.A.p.b((long)c2.i() * (long)c2.h());
        if (c2.j().b() > 1) {
            string3 = string3 + " <font color='" + g_0.b(rs.gui.d.i) + "''>(" + rs.A.p.a((long)c2.g() * (long)c2.i() * (long)c2.j().b()) + ")</font>";
        }
        this.m.setIcon(rs.s.t.m.a);
        this.m.setText(this.a(string2, string3));
        this.n.setForeground(this.b(c2));
        this.n.a(c2.h());
        this.n.b(c2.g());
        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.setBorder(new EmptyBorder(5, 5, 5, 5));
        for (Component component : this.g.getComponents()) {
            if (!(component instanceof JPanel)) continue;
            JPanel jPanel = (JPanel)component;
            jPanel.setToolTipText(this.a((int)this.n.a() + "%"));
            jPanel.setComponentPopupMenu(jPopupMenu);
        }
        this.p = c2.f();
        this.revalidate();
    }

    private String a(String string) {
        return "<html><body style = 'color:" + g_0.b(rs.gui.d.f) + "'>Progress: <span style = 'color:white'>" + string + "</span></body></html>";
    }

    private String a(String string, String string2) {
        return "<html><body style = 'color:white'>" + string + "<span style = 'color:" + g_0.b(rs.gui.d.f) + "'>" + string2 + "</span></body></html>";
    }

    private void b() {
        this.o = !this.o;
        this.h.show(this.g, this.o ? b : c);
    }

    private Color b(c c2) {
        if (c2.g() >= c2.h()) {
            return rs.gui.d.i;
        }
        return rs.gui.d.k;
    }

    public int a() {
        return this.p;
    }

    static /* synthetic */ void a(d d2) {
        d2.b();
    }

    static /* synthetic */ JPanel b(d d2) {
        return d2.g;
    }

    static /* synthetic */ i c(d d2) {
        return d2.f;
    }

    static /* synthetic */ JLabel d(d d2) {
        return d2.i;
    }

    static {
        BufferedImage bufferedImage = j_0.a((Image)j_0.b(d.class, "/util/arrow_right.png"), 0.25f);
        d = new ImageIcon(bufferedImage);
        e = new ImageIcon(j_0.a(bufferedImage, true, false));
    }
}

