/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components.a;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.function.Consumer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import rs.a.g_0;
import rs.gui.d;
import rs.ui.components.a.f;
import rs.ui.components.a.g;
import rs.ui.components.a.h;

public class e
extends JPanel {
    private static final int a = 255;
    private final h b = new h();
    private final JTextField c = new JTextField();
    private Consumer<Integer> d;

    void a(Consumer<Integer> consumer) {
        this.d = consumer;
        this.b.a(consumer);
    }

    e(String string) {
        this.setLayout(new BorderLayout(10, 0));
        this.setBackground(rs.gui.d.d);
        this.c.setBackground(rs.gui.d.c);
        this.c.setPreferredSize(new Dimension(35, 30));
        this.c.setBorder(new EmptyBorder(5, 5, 5, 5));
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter(new f(this));
        this.c.addFocusListener(new g(this));
        this.c.addActionListener(actionEvent -> this.b());
        JLabel jLabel = new JLabel(string);
        jLabel.setPreferredSize(new Dimension(45, 0));
        jLabel.setForeground(Color.WHITE);
        this.b.setBackground(rs.gui.d.d);
        this.b.setBorder(new EmptyBorder(0, 0, 5, 0));
        this.b.setPreferredSize(new Dimension(259, 30));
        this.a(255);
        this.add((Component)jLabel, "West");
        this.add((Component)this.b, "Center");
        this.add((Component)this.c, "East");
    }

    private void b() {
        int n2 = Integer.parseInt(this.c.getText());
        this.a(n2);
        if (this.d != null) {
            this.d.accept(this.a());
        }
    }

    public void a(int n2) {
        n2 = g_0.a(n2);
        this.b.a(n2);
        this.c.setText("" + n2);
    }

    public int a() {
        return this.b.a();
    }

    static /* synthetic */ void a(e e2) {
        e2.b();
    }
}

