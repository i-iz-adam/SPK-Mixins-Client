/*
 * Decompiled with CFR 0.152.
 */
package rs.s.g;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import rs.d.k;
import rs.gui.Launcher;
import rs.gui.d;
import rs.h.c;
import rs.ui.m;

public class a
extends m {
    private AtomicBoolean a = new AtomicBoolean(false);
    private JScrollPane b;
    private final JTextArea c = new JTextArea();
    private final JTextField d = new JTextField();

    public void b() {
        this.getParent().setLayout(new BorderLayout());
        this.getParent().add((Component)this, "Center");
        this.setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout(5, 5));
        jPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        jPanel.setBackground(rs.gui.d.d);
        this.c.setBackground(rs.gui.d.a);
        this.c.setEditable(false);
        this.b = new JScrollPane(this.c);
        this.b.getVerticalScrollBar().setPreferredSize(new Dimension(12, 0));
        this.b.getVerticalScrollBar().setBorder(new EmptyBorder(0, 5, 0, 0));
        JPanel jPanel2 = new JPanel();
        this.d.setPreferredSize(new Dimension(200, 25));
        this.d.addActionListener(actionEvent -> this.c());
        JButton jButton = new JButton("Search");
        jButton.addActionListener(actionEvent -> this.c());
        jPanel2.add(this.d);
        jPanel2.add(jButton);
        jPanel.add((Component)jPanel2, "North");
        jPanel.add((Component)this.b, "Center");
        this.add(jPanel);
    }

    private void c() {
        if (this.a.get()) {
            return;
        }
        if (k.ad == 0) {
            JOptionPane.showMessageDialog(null, "Please wait until the client has loaded the item database!");
            return;
        }
        if (this.d.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "Please have at least 3 letters in your search term!");
            return;
        }
        if (!Launcher.n().o().fc) {
            JOptionPane.showMessageDialog(null, "Please login before searching items!");
            return;
        }
        this.a.set(true);
        this.e();
        rs.h.c.a(() -> {
            String string = this.f();
            SwingUtilities.invokeLater(() -> {
                this.c.setText(string);
                this.a.set(false);
            });
        });
    }

    private void e() {
        this.d.setCaretPosition(0);
        this.b.getVerticalScrollBar().setValue(0);
        this.c.setText("");
    }

    private String f() {
        Object object = "";
        for (int i2 = 0; i2 < k.a; ++i2) {
            k k2 = (k)k.c.b(i2);
            if (k2 == null || k2.w == null || k2.i == 11283 || !k2.w.toLowerCase().contains(this.d.getText().toLowerCase()) || k2.w.contains("@red@")) continue;
            String string = k2.w;
            string = string.replace("@gre@", "");
            string = string.replace("@red@", "");
            string = string.replace("@blu@", "");
            string = string.replace("@whi@", "");
            object = (String)(((String)object).equals("") ? "" : (String)object + "\n") + k2.i + "\t" + string + " " + (k2.b() ? "(noted)" : "");
        }
        if (((String)object).equals("")) {
            object = "No results found for \"" + this.d.getText() + "!\"";
        }
        return object;
    }
}

