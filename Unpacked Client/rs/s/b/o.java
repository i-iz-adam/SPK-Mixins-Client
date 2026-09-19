/*
 * Decompiled with CFR 0.152.
 */
package rs.s.b;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import rs.a.j_0;
import rs.gui.m_0;
import rs.s.b.a;
import rs.s.b.n;
import rs.s.b.p;
import rs.s.b.q;
import rs.s.b.u;
import rs.s.b.v;
import rs.s.e;

public class o
extends JPanel
implements v {
    private static final ImageIcon a;
    private static final ImageIcon b;
    private static final ImageIcon c;
    private static final ImageIcon d;
    private final q e;
    private final n f;
    private final List<String> g = new ArrayList<String>();
    private final JToggleButton h;
    private final u i;

    o(q q2, n n2) {
        JButton jButton;
        this.e = q2;
        this.f = n2;
        Collections.addAll(this.g, n2.d().toLowerCase().split(" "));
        Collections.addAll(this.g, n2.e().toLowerCase().split(" "));
        Collections.addAll(this.g, n2.f());
        String string = n2.c();
        if (string != null) {
            this.g.add("pluginhub");
            this.g.add(string);
        } else {
            this.g.add("plugin");
        }
        this.setLayout(new BorderLayout(3, 0));
        this.setPreferredSize(new Dimension(350, 20));
        JLabel jLabel = new JLabel(n2.d());
        jLabel.setForeground(Color.WHITE);
        if (!n2.e().isEmpty()) {
            jLabel.setToolTipText("<html>" + n2.d() + ":<br>" + n2.e() + "</html>");
        }
        this.h = new JToggleButton(d);
        this.h.setSelectedIcon(c);
        m_0.a(this.h);
        m_0.a(this.h, "Unpin plugin", "Pin plugin");
        this.h.setPreferredSize(new Dimension(21, 0));
        this.add((Component)this.h, "Before");
        this.h.addActionListener(actionEvent -> {
            q2.c();
            q2.b();
        });
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 2));
        this.add((Component)jPanel, "After");
        JMenuItem jMenuItem = null;
        if (n2.a()) {
            jButton = new JButton(a);
            jButton.setRolloverIcon(b);
            m_0.a(jButton);
            jButton.setPreferredSize(new Dimension(25, 0));
            jButton.setVisible(false);
            jPanel.add(jButton);
            jButton.addActionListener(actionEvent -> {
                jButton.setIcon(a);
                this.e();
            });
            jButton.setVisible(true);
            jButton.setToolTipText("Edit plugin configuration");
            jMenuItem = new JMenuItem("Configure");
            jMenuItem.addActionListener(actionEvent -> this.e());
        }
        jButton = null;
        this.add((Component)jLabel, "Center");
        this.i = new u();
        this.i.a(n2.i());
        jPanel.add(this.i);
        if (n2.j() != null) {
            this.i.addActionListener(actionEvent -> {
                if (this.i.isSelected()) {
                    q2.c(n2.j());
                } else if (!n2.j().getClass().getAnnotation(e.class).l()) {
                    q2.d(n2.j());
                }
            });
        } else {
            this.i.setVisible(false);
        }
        if (n2.j().getClass().getAnnotation(e.class).l()) {
            this.i.setVisible(false);
        }
    }

    @Override
    public String a() {
        return this.f.d();
    }

    @Override
    public boolean b() {
        return this.h.isSelected();
    }

    void a(boolean bl) {
        this.h.setSelected(bl);
    }

    void b(boolean bl) {
        this.i.setSelected(bl);
    }

    private void e() {
        this.e.a(this.f);
    }

    static void a(JLabel jLabel, JMenuItem ... jMenuItemArray) {
        JPopupMenu jPopupMenu = new JPopupMenu();
        Color color = jLabel.getForeground();
        jPopupMenu.setBorder(new EmptyBorder(5, 5, 5, 5));
        for (JMenuItem jMenuItem : jMenuItemArray) {
            if (jMenuItem == null) continue;
            jMenuItem.addActionListener(actionEvent -> jLabel.setForeground(color));
            jPopupMenu.add(jMenuItem);
        }
        jLabel.addMouseListener(new p(jPopupMenu, jLabel));
    }

    public n c() {
        return this.f;
    }

    @Override
    public List<String> d() {
        return this.g;
    }

    static {
        BufferedImage bufferedImage = j_0.b(a.class, "config_edit_icon.png");
        BufferedImage bufferedImage2 = j_0.b(a.class, "star_on.png");
        a = new ImageIcon(bufferedImage);
        c = new ImageIcon(bufferedImage2);
        b = new ImageIcon(j_0.b((Image)bufferedImage, -100));
        BufferedImage bufferedImage3 = j_0.b((Image)j_0.a(bufferedImage2), 0.77f);
        d = new ImageIcon(bufferedImage3);
    }
}

