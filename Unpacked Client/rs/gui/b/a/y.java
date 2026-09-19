/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.a;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import rs.gui.Launcher;
import rs.gui.b.a.e;
import rs.gui.b.a.j;
import rs.gui.b.a.z;
import rs.gui.b.d;

public class y
extends JFrame {
    static Color[] a = new Color[]{Color.WHITE, new Color(255, 50, 50), new Color(255, 150, 50), Color.CYAN, Color.GREEN, Color.YELLOW, Color.MAGENTA};
    static String[] b = new String[]{"Default", "Red", "Orange", "Blue", "Green", "Yellow", "Magenta"};
    private String c;
    private d d;
    private final JTextField e = new JTextField(14);
    private JButton f;
    private JComboBox<String> g;
    private JComboBox<String> h;

    public y(d d2, String string, String string2) {
        super(string);
        this.d = d2;
        this.c = string2;
    }

    public void a(ActionListener actionListener) {
        this.setSize(400, 100);
        this.setResizable(false);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocationRelativeTo(Launcher.n().i().getContentPane());
        this.f = new JButton(this.c);
        this.g = new JComboBox<String>(b);
        e e2 = new e(this.g);
        e2.a(a);
        e2.a(b);
        this.g.setRenderer(e2);
        String[] stringArray = new String[rs.gui.b.e.values().length + 1];
        stringArray[0] = "None (Default)";
        for (int i2 = 0; i2 < rs.gui.b.e.values().length; ++i2) {
            stringArray[i2 + 1] = rs.gui.b.e.values()[i2].D;
        }
        this.h = new JComboBox<String>(stringArray);
        j j2 = new j(this.h);
        this.h.setRenderer(j2);
        JPanel jPanel = new JPanel();
        jPanel.add(this.e);
        jPanel.add(this.f);
        JPanel jPanel2 = new JPanel();
        jPanel2.add(new JLabel("Color: "));
        jPanel2.add(this.g);
        jPanel2.add(new JSeparator(1));
        jPanel2.add(new JLabel("Icon: "));
        jPanel2.add(this.h);
        this.getContentPane().add((Component)jPanel, "Center");
        jPanel.getRootPane().setDefaultButton(this.f);
        this.getContentPane().add((Component)jPanel2, "South");
        this.f.addActionListener(actionListener);
        this.f.addActionListener(new z(this));
        this.setVisible(true);
    }

    public void a(Color color) {
        if (color == null) {
            return;
        }
        for (int i2 = 0; i2 < a.length; ++i2) {
            if (a[i2].getRGB() != color.getRGB()) continue;
            this.g.setSelectedIndex(i2);
        }
    }

    public void a(rs.gui.b.e e2) {
        if (e2 == null) {
            return;
        }
        for (int i2 = 0; i2 < rs.gui.b.e.values().length; ++i2) {
            if (!rs.gui.b.e.values()[i2].D.equalsIgnoreCase(e2.D)) continue;
            this.h.setSelectedIndex(i2 + 1);
        }
    }

    @Override
    public void setName(String string) {
        if (string == null) {
            return;
        }
        this.e.setText(string);
    }

    public Color a() {
        return a[this.g.getSelectedIndex()];
    }

    public rs.gui.b.e b() {
        for (rs.gui.b.e e2 : rs.gui.b.e.values()) {
            if (!e2.D.equals(this.h.getSelectedItem())) continue;
            return e2;
        }
        return null;
    }

    public String c() {
        return this.e.getText();
    }
}

