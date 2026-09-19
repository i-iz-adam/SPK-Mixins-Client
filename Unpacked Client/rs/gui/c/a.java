/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.c;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import rs.Client;
import rs.gui.c.b;
import rs.gui.c.c;

public class a
extends JPanel {
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JLabel i;
    private JLabel j;
    private JLabel k;
    private JLabel l;
    private JLabel m;
    private JLabel n;
    private JLabel o;
    private JLabel p;
    private JLabel q;
    private JLabel r;
    private JLabel s;
    private JLabel t;
    private JLabel u;
    private JLabel v;
    private ImageIcon w;
    private ImageIcon x;
    private ImageIcon y;
    private ImageIcon z;
    private ImageIcon A;

    public a() {
        this.b();
        this.a();
    }

    public void a() {
        this.removeAll();
        this.setLayout(new BoxLayout(this, 1));
        JPanel jPanel = new JPanel();
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 28));
        jPanel.add(new JLabel("<html><p style='font-size: 9px'><font style='bold' color='rgb(150,150,255)'>Type ::pvptracker to view overlay in-game</font></p></html>"));
        this.add(jPanel);
        this.add(Box.createRigidArea(new Dimension(0, 2)));
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(new Color(15, 15, 15));
        jPanel2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        jPanel2.add(new JLabel("<html><p style='font-size: 10px'><font style='bold' color='rgb(255,100,100)'><u>Most Recent 1v1 Fight</u></font></p></html>"));
        this.add(jPanel2);
        this.add(Box.createRigidArea(new Dimension(0, 5)));
        this.c = new JLabel("<html><font style='bold'>N/A</font></html>");
        this.a(this.w, this.c, 16);
        this.g = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>");
        this.a(this.y, this.g, 20, new Dimension(10, 0));
        this.i = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>");
        this.a(this.A, this.i, 20, new Dimension(10, 0));
        this.k = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>");
        this.a(this.z, this.k, 20, new Dimension(10, 0));
        this.add(Box.createRigidArea(new Dimension(0, 3)));
        this.add(Box.createRigidArea(new Dimension(0, 5)));
        this.m = new JLabel("<html><font style='bold'>N/A</font></html>");
        this.a(this.w, this.m, 16);
        this.q = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>");
        this.a(this.y, this.q, 20, new Dimension(10, 0));
        this.s = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>");
        this.a(this.A, this.s, 20, new Dimension(10, 0));
        this.u = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>");
        this.a(this.z, this.u, 20, new Dimension(10, 0));
        this.add(Box.createRigidArea(new Dimension(0, 5)));
        JPanel jPanel3 = new JPanel();
        jPanel3.setBackground(new Color(15, 15, 15));
        jPanel3.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        jPanel3.add(new JLabel("<html><p style='font-size: 10px'><font style='bold' color='rgb(255,100,100)'><u>Previous 1v1 Fight</u></font></p></html>"));
        this.add(jPanel3);
        this.add(Box.createRigidArea(new Dimension(0, 5)));
        this.d = new JLabel("<html><font style='bold'>N/A</font></html>");
        this.a(this.w, this.d, 16);
        this.h = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>");
        this.a(this.y, this.h, 20, new Dimension(10, 0));
        this.j = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>");
        this.a(this.A, this.j, 20, new Dimension(10, 0));
        this.l = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>");
        this.a(this.z, this.l, 20, new Dimension(10, 0));
        this.add(Box.createRigidArea(new Dimension(0, 3)));
        this.add(Box.createRigidArea(new Dimension(0, 5)));
        this.n = new JLabel("<html><font style='bold'>N/A</font></html>");
        this.a(this.w, this.n, 16);
        this.r = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>");
        this.a(this.y, this.r, 20, new Dimension(10, 0));
        this.t = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>");
        this.a(this.A, this.t, 20, new Dimension(10, 0));
        this.v = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>");
        this.a(this.z, this.v, 20, new Dimension(10, 0));
        this.add(Box.createRigidArea(new Dimension(0, 5)));
    }

    public void a(int n2, String string, String string2, String string3, String string4) {
        EventQueue.invokeLater(new b(this, n2, string, string2, string3, string4));
    }

    public void b(int n2, String string, String string2, String string3, String string4) {
        EventQueue.invokeLater(new c(this, n2, string, string2, string3, string4));
    }

    private void a(ImageIcon imageIcon, JLabel jLabel, int n2, Dimension dimension) {
        JPanel jPanel = new JPanel();
        jPanel.setBackground(new Color(15, 15, 15));
        jPanel.setLayout(new BoxLayout(jPanel, 0));
        jPanel.add(Box.createRigidArea(dimension));
        if (imageIcon != null) {
            jLabel.setIcon(imageIcon);
        }
        jPanel.add(jLabel);
        jPanel.add(Box.createHorizontalGlue());
        this.add(jPanel);
    }

    private void a(ImageIcon imageIcon, JLabel jLabel, int n2) {
        this.a(imageIcon, jLabel, n2, new Dimension(3, 0));
    }

    private void b() {
        if (Client.class.getResource("Client.class").toString().startsWith("file")) {
            this.w = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_user.png"));
            this.x = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_skull.png"));
            this.y = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_pray.png"));
            this.z = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_damage.png"));
            this.A = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_magic.png"));
        } else {
            try {
                this.w = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_user.png")));
                this.x = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_skull.png")));
                this.y = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_pray.png")));
                this.z = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_damage.png")));
                this.A = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_magic.png")));
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    static /* synthetic */ JLabel a(a a2) {
        return a2.c;
    }

    static /* synthetic */ JLabel b(a a2) {
        return a2.m;
    }

    static /* synthetic */ JLabel c(a a2) {
        return a2.g;
    }

    static /* synthetic */ JLabel d(a a2) {
        return a2.q;
    }

    static /* synthetic */ JLabel e(a a2) {
        return a2.i;
    }

    static /* synthetic */ JLabel f(a a2) {
        return a2.s;
    }

    static /* synthetic */ JLabel g(a a2) {
        return a2.k;
    }

    static /* synthetic */ JLabel h(a a2) {
        return a2.u;
    }

    static /* synthetic */ ImageIcon i(a a2) {
        return a2.x;
    }

    static /* synthetic */ ImageIcon j(a a2) {
        return a2.w;
    }

    static /* synthetic */ JLabel k(a a2) {
        return a2.d;
    }

    static /* synthetic */ JLabel l(a a2) {
        return a2.n;
    }

    static /* synthetic */ JLabel m(a a2) {
        return a2.h;
    }

    static /* synthetic */ JLabel n(a a2) {
        return a2.r;
    }

    static /* synthetic */ JLabel o(a a2) {
        return a2.j;
    }

    static /* synthetic */ JLabel p(a a2) {
        return a2.t;
    }

    static /* synthetic */ JLabel q(a a2) {
        return a2.l;
    }

    static /* synthetic */ JLabel r(a a2) {
        return a2.v;
    }
}

