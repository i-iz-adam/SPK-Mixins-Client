/*
 * Decompiled with CFR 0.152.
 */
package rs.q.b;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import rs.gui.Launcher;
import rs.gui.d;
import rs.k.j;
import rs.q.b.b;
import rs.q.b.c;

public class a
extends JFrame {
    private JTextArea a;
    private JLabel b;
    private JTextField c;
    private JDialog d;

    public a() {
        this.b();
    }

    private void b() {
        this.setDefaultCloseOperation(2);
        this.setTitle("Report Request Results");
        this.setSize(800, 600);
        this.setLocationRelativeTo(Launcher.n().i());
        if (j.a() == j.a) {
            this.setUndecorated(true);
            this.getRootPane().setWindowDecorationStyle(1);
        }
        this.a = new JTextArea();
        this.a.setText("Waiting for results..\n");
        this.a.addKeyListener(new b(this));
        JScrollPane jScrollPane = new JScrollPane(this.a);
        jScrollPane.setBackground(rs.gui.d.c);
        this.getContentPane().add((Component)jScrollPane, "Center");
        this.d = this.c();
        this.setVisible(true);
    }

    private JDialog c() {
        JDialog jDialog = new JDialog(this, "Find Text", false);
        jDialog.setSize(300, 100);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(this);
        ActionListener actionListener = actionEvent -> jDialog.setVisible(false);
        jDialog.getRootPane().registerKeyboardAction(actionListener, KeyStroke.getKeyStroke(27, 0), 2);
        Container container = jDialog.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(new JLabel("Find:"));
        this.b = new JLabel("Match results: N/A");
        this.c = new JTextField(20);
        this.c.addKeyListener(new c(this));
        container.add(this.c);
        container.add(this.b);
        return jDialog;
    }

    private void a(boolean bl) {
        int n2;
        int n3;
        String string = this.c.getText();
        String string2 = this.a.getText();
        if (string.isEmpty() || string2.isEmpty()) {
            return;
        }
        int n4 = n3 = bl ? this.a.getCaretPosition() - string.length() : this.a.getCaretPosition();
        if (n3 < 0) {
            n3 = 0;
        }
        int n5 = n2 = bl ? string2.lastIndexOf(string, n3) : string2.indexOf(string, n3);
        if (n2 == -1) {
            n2 = bl ? string2.lastIndexOf(string) : string2.indexOf(string);
        }
        this.a(n2, bl ? n2 + 1 : n2 + string.length());
    }

    private void a(int n2, int n3) {
        Highlighter highlighter = this.a.getHighlighter();
        highlighter.removeAllHighlights();
        String string = this.c.getText();
        String string2 = this.a.getText();
        if (n2 != -1) {
            this.a(string, n2);
            try {
                highlighter.addHighlight(n2, n2 + string.length(), DefaultHighlighter.DefaultPainter);
                this.a.setCaretPosition(n3);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        } else {
            this.b.setText("Match results: N/A");
        }
    }

    private void a(String string, int n2) {
        String string2 = this.a.getText();
        if (string.isEmpty() || string2.isEmpty()) {
            return;
        }
        int n3 = 0;
        int n4 = 0;
        int n5 = -1;
        while ((n3 = string2.indexOf(string, n3)) != -1) {
            ++n4;
            if (n3 == n2) {
                n5 = n4;
            }
            n3 += string.length();
        }
        this.b.setText("Match results: " + n5 + "/" + n4);
    }

    public JTextArea a() {
        return this.a;
    }

    static /* synthetic */ JDialog a(a a2) {
        return a2.d;
    }

    static /* synthetic */ void a(a a2, boolean bl) {
        a2.a(bl);
    }

    static /* synthetic */ JTextField b(a a2) {
        return a2.c;
    }

    static /* synthetic */ JTextArea c(a a2) {
        return a2.a;
    }

    static /* synthetic */ void a(a a2, int n2, int n3) {
        a2.a(n2, n3);
    }
}

