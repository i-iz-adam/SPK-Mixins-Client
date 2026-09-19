/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.a;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import rs.Client;
import rs.gui.Launcher;
import rs.k.b;
import rs.k.e;
import rs.l.c;

public class a
extends JPanel {
    private JCheckBox a;
    private JCheckBox b;
    private JCheckBox c;
    private JComboBox d;
    private JComboBox e;
    private JComboBox f;
    private JCheckBox g;
    private JCheckBox h;
    private JComboBox i;

    public a() {
        this.a();
    }

    public void a() {
        if (!rs.k.b.g()) {
            rs.k.b.e();
        }
        this.setLayout(new BoxLayout(this, 1));
        this.add(Box.createRigidArea(new Dimension(0, 10)));
        if (rs.v.a.i()) {
            JPanel jPanel = new JPanel();
            jPanel.setAlignmentX(0.0f);
            jPanel.setBackground(new Color(15, 15, 15));
            jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
            jPanel.add(new JLabel("<html><center><p style='font-size: 12px'><font style='bold' color='rgb(255,100,100)'><u>Error Warning, PLEASE READ!</p></u><p style='font-size: 9px'><font color='rgb(255,150,150)'>You are running 32-bit Java on a 64-bit machine!<br>This can cause performance issues, and even crashes.<br>Please <u>uninstall Java</u>, and then <u>install the 64-bit version</u></font></p></center></html>"));
            this.add(jPanel);
            this.add(Box.createRigidArea(new Dimension(0, 5)));
        }
        this.d();
        this.e();
        this.f();
        this.b();
        this.add(Box.createVerticalGlue());
    }

    private void d() {
        JPanel jPanel = new JPanel();
        jPanel.setAlignmentX(0.0f);
        jPanel.setBackground(new Color(15, 15, 15));
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        jPanel.add(new JLabel("<html><p style='font-size: 9px'><font style='bold' color='rgb(150,150,255)'>GPU Settings</font></p></html>"));
        this.add(jPanel);
        this.add(Box.createRigidArea(new Dimension(0, 5)));
        this.a = new JCheckBox("GPU Mode");
        this.add(this.a);
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        jPanel2.setAlignmentX(0.0f);
        jPanel2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        jPanel2.add(new JLabel("Anti Aliasing:"));
        this.d = new JComboBox<rs.k.a.a>(rs.k.a.a.values());
        jPanel2.add(this.d);
        this.add(jPanel2);
        JPanel jPanel3 = new JPanel(new FlowLayout(0));
        jPanel3.setAlignmentX(0.0f);
        jPanel3.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        jPanel3.add(new JLabel("VSync Mode:"));
        this.e = new JComboBox<rs.k.a.c>(rs.k.a.c.values());
        jPanel3.add(this.e);
        this.add(jPanel3);
        JPanel jPanel4 = new JPanel(new FlowLayout(0));
        jPanel4.setAlignmentX(0.0f);
        jPanel4.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        jPanel4.add(new JLabel("Colorblind Mode:"));
        this.f = new JComboBox<rs.k.a.b>(rs.k.a.b.values());
        jPanel4.add(this.f);
        this.add(jPanel4);
        this.b = new JCheckBox("Anisotropic filtering");
        this.add(this.b);
        this.c = new JCheckBox("Smooth banding");
        this.add(this.c);
        this.add(Box.createRigidArea(new Dimension(0, 10)));
    }

    private void e() {
        JPanel jPanel = new JPanel();
        jPanel.setAlignmentX(0.0f);
        jPanel.setBackground(new Color(15, 15, 15));
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        jPanel.add(new JLabel("<html><p style='font-size: 9px'><font style='bold' color='rgb(150,150,255)'>Stretched Mode Settings</font></p></html>"));
        this.add(jPanel);
        this.add(Box.createRigidArea(new Dimension(0, 5)));
        this.g = new JCheckBox("Stretched Mode");
        this.add(this.g);
        this.h = new JCheckBox("Maintain aspect ratio");
        this.add(this.h);
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        jPanel2.setAlignmentX(0.0f);
        jPanel2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        this.i = new JComboBox<String>(new String[]{"Bilinear", "Bicubic (Mitchell)", "Bicubic (Catmull-Rom)", "xBR"});
        jPanel2.add(new JLabel("UI Scaling:"));
        jPanel2.add(this.i);
        this.add(jPanel2);
        this.add(Box.createRigidArea(new Dimension(0, 10)));
    }

    private void f() {
        this.d.setSelectedItem((Object)rs.k.b.b);
        this.e.setSelectedItem((Object)rs.k.b.d);
        this.f.setSelectedItem((Object)rs.k.b.e);
        this.b.setSelected(rs.k.b.c > 0);
        this.g.setSelected(rs.k.b.i);
        this.h.setSelected(rs.k.b.j);
        this.i.setSelectedIndex(rs.k.b.k);
        this.c.setSelected(rs.k.b.f);
        this.a.addActionListener(actionEvent -> rs.h.c.a(() -> {
            rs.k.b.a();
            rs.f.a.Q = rs.k.e.a();
            if (rs.k.e.a() && rs.k.b.i) {
                rs.k.b.f();
            }
            rs.k.b.d();
            SwingUtilities.invokeLater(() -> this.b());
        }));
        this.d.addActionListener(actionEvent -> rs.h.c.a(() -> {
            rs.k.b.b = (rs.k.a.a)((Object)((Object)((Object)this.d.getSelectedItem())));
            rs.k.b.d();
            SwingUtilities.invokeLater(() -> this.b());
        }));
        this.e.addActionListener(actionEvent -> rs.h.c.a(() -> {
            rs.k.b.d = (rs.k.a.c)((Object)((Object)((Object)this.e.getSelectedItem())));
            rs.k.b.d();
            Launcher.n().o().a.e();
            SwingUtilities.invokeLater(() -> this.b());
        }));
        this.f.addActionListener(actionEvent -> rs.h.c.a(() -> {
            rs.k.b.e = (rs.k.a.b)((Object)((Object)((Object)this.f.getSelectedItem())));
            rs.k.b.d();
            SwingUtilities.invokeLater(() -> this.b());
        }));
        this.b.addActionListener(actionEvent -> rs.h.c.a(() -> {
            rs.k.b.c = this.b.isSelected() ? 2 : 0;
            rs.k.b.d();
            SwingUtilities.invokeLater(() -> this.b());
        }));
        this.c.addActionListener(actionEvent -> rs.h.c.a(() -> {
            rs.k.b.f = this.c.isSelected();
            rs.k.b.d();
            SwingUtilities.invokeLater(() -> this.b());
        }));
        this.g.addActionListener(actionEvent -> rs.h.c.a(() -> {
            Client client = Launcher.n().o();
            rs.k.b.i = this.g.isSelected();
            if (!rs.k.b.i) {
                Launcher.n().o().at = "::stretchflagoff";
                client.a(rs.f.a.ai);
                client.gZ.a();
                rs.l.c.d();
            } else if (!client.ai()) {
                rs.k.b.f();
                Launcher.n().o().at = "::stretchflagon";
            }
            rs.k.b.d();
            SwingUtilities.invokeLater(() -> this.b());
        }));
        this.i.addActionListener(actionEvent -> rs.h.c.a(() -> {
            rs.k.b.k = this.i.getSelectedIndex();
            rs.k.b.d();
            SwingUtilities.invokeLater(() -> this.b());
        }));
        this.h.addActionListener(actionEvent -> rs.h.c.a(() -> {
            rs.k.b.j = this.h.isSelected();
            Launcher.n().o().a(rs.f.a.ai);
            rs.k.b.d();
            SwingUtilities.invokeLater(() -> this.b());
        }));
    }

    public void b() {
        if (Launcher.n().o() == null || !Launcher.n().o().cd || !Launcher.n().o().fc) {
            this.c();
            return;
        }
        this.g();
        if (this.a.isSelected() != rs.k.e.a()) {
            this.a.setSelected(rs.k.e.a());
        }
        if (this.g.isSelected() != rs.k.b.i) {
            this.g.setSelected(rs.k.b.i);
        }
        if (this.a.isSelected()) {
            this.a(false, true);
        } else {
            this.a(false, false);
        }
    }

    public void c() {
        this.a(true, false);
    }

    private void g() {
        this.a(true, true);
    }

    private void a(boolean bl, boolean bl2) {
        if (bl) {
            this.a.setEnabled(bl2);
        }
        this.d.setEnabled(bl2);
        this.e.setEnabled(bl2);
        this.f.setEnabled(bl2);
        this.b.setEnabled(bl2);
        this.g.setEnabled(bl2);
        this.h.setEnabled(bl2);
        this.i.setEnabled(bl2);
        this.c.setEnabled(bl2);
    }
}

