/*
 * Decompiled with CFR 0.152.
 */
package rs.gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import rs.d.k;
import rs.gui.d;
import rs.gui.h_0;
import rs.gui.i_0;

/*
 * Renamed from rs.gui.G
 */
public class g_0
extends JPanel {
    private static final long a = 3542151008013032998L;
    private JScrollPane b = new JScrollPane();
    private JTextField c = new JTextField();
    private JTextArea d = new JTextArea();

    public g_0() {
        this.setLayout(new BoxLayout(this, 1));
        this.d.setBackground(rs.gui.d.a);
        this.d.setEditable(false);
        this.d.setPreferredSize(new Dimension(this.d.getWidth(), 10000));
        this.b = new JScrollPane(this.d);
        JPanel jPanel = new JPanel();
        this.b.getViewport().getView().setBackground(rs.gui.d.a);
        jPanel.setBackground(new Color(10, 10, 10));
        this.c.setPreferredSize(new Dimension(200, 25));
        this.c.addActionListener(new h_0(this));
        JButton jButton = new JButton("Search");
        jButton.addActionListener(new i_0(this));
        jPanel.add(this.c);
        jPanel.add(jButton);
        this.add(jPanel);
        this.add(this.b);
    }

    private void a() {
        if (k.ad == 0) {
            JOptionPane.showMessageDialog(null, "Please wait until the client has loaded the item database!");
            return;
        }
        if (this.c.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "Please have at least 3 letters in your search term!");
            return;
        }
        this.c.setCaretPosition(0);
        this.b.getVerticalScrollBar().setValue(0);
        this.d.setText("");
        Object object = "";
        for (int i2 = 0; i2 < k.a; ++i2) {
            k k2 = (k)k.c.b(i2);
            if (k2 == null || k2.w == null || k2.i == 11283 || !k2.w.toLowerCase().contains(this.c.getText().toLowerCase())) continue;
            String string = k2.w;
            string = string.replace("@gre@", "");
            string = string.replace("@red@", "");
            string = string.replace("@blu@", "");
            string = string.replace("@whi@", "");
            object = (String)(((String)object).equals("") ? "" : (String)object + "\n") + k2.i + " - " + string + " " + (k2.b() ? "(noted)" : "");
        }
        if (((String)object).equals("")) {
            object = "No results found for \"" + this.c.getText() + "!\"";
        }
        this.d.setText((String)object);
    }

    static /* synthetic */ void a(g_0 g_02) {
        g_02.a();
    }
}

