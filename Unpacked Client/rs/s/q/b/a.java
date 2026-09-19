/*
 * Decompiled with CFR 0.152.
 */
package rs.s.q.b;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import rs.a.j_0;
import rs.s.q.d;

public class a
extends JPanel {
    private static final SimpleDateFormat t = new SimpleDateFormat("HH:mm:ss 'on' yyyy/MM/dd");
    private static final Border u = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, rs.gui.d.d), new EmptyBorder(4, 6, 4, 6));
    private static final Border v = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, rs.gui.d.d), BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(rs.gui.d.g), new EmptyBorder(3, 5, 3, 5)));
    static ImageIcon a;
    static ImageIcon b;
    static ImageIcon c;
    static ImageIcon d;
    static ImageIcon e;
    rs.s.q.a.a f;
    JPanel g;
    JPanel h;
    JLabel i;
    JLabel j;
    JPanel k;
    JLabel l;
    JLabel m;
    JPanel n;
    JLabel o;
    JLabel p;
    JPanel q;
    JLabel r;
    JLabel s;

    public a(rs.s.q.a.a a2) {
        if (a == null) {
            a = new ImageIcon(j_0.b(d.class, "ico_skull.png"));
            b = new ImageIcon(j_0.b(d.class, "ico_user.png").getScaledInstance(14, 14, 1));
            e = new ImageIcon(j_0.b(d.class, "ico_damage.png").getScaledInstance(14, 14, 1));
            c = new ImageIcon(j_0.b(d.class, "ico_magic.png").getScaledInstance(14, 14, 1));
            d = new ImageIcon(j_0.b(d.class, "ico_pray.png"));
        }
        this.f = a2;
        this.setLayout(new BorderLayout(5, 0));
        this.setBackground(rs.gui.d.c);
        this.setBorder(u);
        this.g = new JPanel();
        this.g.setLayout(new BoxLayout(this.g, 1));
        this.g.setBackground(null);
        this.h = new JPanel();
        this.h.setLayout(new BorderLayout());
        this.h.setBackground(rs.gui.d.g);
        this.i = new JLabel();
        this.h.add((Component)this.i, "West");
        this.j = new JLabel();
        this.h.add((Component)this.j, "East");
        this.k = new JPanel();
        this.k.setLayout(new BorderLayout());
        this.k.setBackground(null);
        this.l = new JLabel();
        this.k.add((Component)this.l, "West");
        this.m = new JLabel();
        this.k.add((Component)this.m, "East");
        this.n = new JPanel();
        this.n.setLayout(new BorderLayout());
        this.n.setBackground(null);
        this.o = new JLabel();
        this.n.add((Component)this.o, "West");
        this.p = new JLabel();
        this.n.add((Component)this.p, "East");
        this.q = new JPanel();
        this.q.setLayout(new BorderLayout());
        this.q.setBackground(null);
        this.r = new JLabel();
        this.q.add((Component)this.r, "West");
        this.s = new JLabel();
        this.q.add((Component)this.s, "East");
        this.a();
        this.g.add(this.h);
        this.g.add(this.k);
        this.g.add(this.n);
        this.g.add(this.q);
        this.add((Component)this.g, "North");
        this.setMaximumSize(new Dimension(350, (int)this.getPreferredSize().getHeight()));
    }

    public void a() {
        this.i.setIcon(this.f.d().j() ? a : b);
        this.i.setText(this.f.d().k());
        this.i.setForeground(this.f.d().j() ? Color.RED : rs.gui.d.n);
        this.j.setIcon(this.f.e().j() ? a : b);
        this.j.setText(this.f.e().k());
        this.j.setForeground(this.f.e().j() ? Color.RED : rs.gui.d.n);
        this.l.setIcon(d);
        this.l.setText(this.f.d().c());
        this.l.setForeground(this.f.a() ? Color.GREEN : Color.WHITE);
        this.m.setIcon(d);
        this.m.setText(this.f.e().c());
        this.m.setForeground(!this.f.a() ? Color.GREEN : Color.WHITE);
        this.o.setIcon(c);
        this.o.setText(this.f.d().d());
        this.o.setForeground(this.f.b() ? Color.GREEN : Color.WHITE);
        this.p.setIcon(c);
        this.p.setText(this.f.e().d());
        this.p.setForeground(!this.f.b() ? Color.GREEN : Color.WHITE);
        this.r.setIcon(e);
        this.r.setText(this.f.d().b(this.f.e().g()));
        this.r.setToolTipText(this.f.d().k() + " dealt " + this.f.d().g() + " damage (" + (this.f.d().g() - this.f.e().g()) + " vs opponent)");
        this.r.setForeground(this.f.d().g() > this.f.e().g() ? Color.GREEN : Color.WHITE);
        this.s.setIcon(e);
        this.s.setText(this.f.e().b(this.f.d().g()));
        this.s.setToolTipText(this.f.e().k() + " dealt " + this.f.e().g() + " damage (" + (this.f.e().g() - this.f.d().g()) + " vs opponent)");
        this.s.setForeground(this.f.e().g() > this.f.e().g() ? Color.GREEN : Color.WHITE);
    }

    public rs.s.q.a.a b() {
        return this.f;
    }

    public void a(rs.s.q.a.a a2) {
        this.f = a2;
    }
}

