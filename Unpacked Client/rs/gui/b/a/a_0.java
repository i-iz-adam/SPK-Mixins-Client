/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.a;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import rs.gui.Launcher;
import rs.gui.b.d;

/*
 * Renamed from rs.gui.b.a.A
 */
public class a_0
extends JFrame {
    private final d a;
    private final int b;
    private JButton c;
    private JTextField d;

    public a_0(d d2, int n2) {
        this.a = d2;
        this.b = n2;
    }

    public void a() {
        this.setTitle("Set " + this.c() + " level");
        this.setSize(250, 70);
        this.setResizable(false);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.c = new JButton("Apply");
        this.d = new JTextField(2);
        JPanel jPanel = new JPanel();
        jPanel.add(this.d);
        jPanel.add(this.c);
        this.add(jPanel);
        this.d.addActionListener(actionEvent -> this.b());
        this.c.addActionListener(actionEvent -> this.b());
        this.setVisible(true);
    }

    private void b() {
        int n2 = 99;
        try {
            n2 = Integer.parseInt(this.d.getText());
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        if (n2 < 1) {
            n2 = 1;
        }
        if (n2 > 99) {
            n2 = 99;
        }
        this.a.c().c()[this.b] = n2;
        this.a.a();
        Launcher.n().d();
        this.dispose();
    }

    private String c() {
        switch (this.b) {
            case 0: {
                return "Attack";
            }
            case 1: {
                return "Range";
            }
            case 2: {
                return "Strength";
            }
            case 3: {
                return "Prayer";
            }
            case 4: {
                return "Defence";
            }
            case 5: {
                return "Magic";
            }
            case 6: {
                return "Hitpoints";
            }
        }
        return "Null";
    }
}

