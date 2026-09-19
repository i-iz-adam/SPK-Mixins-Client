/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;
import rs.gui.d;
import rs.ui.components.j;

public class i
extends JPanel {
    private final JTextField a;
    private Color b = rs.gui.d.c;
    private Color c;
    private boolean d;

    public i() {
        this.setLayout(new BorderLayout());
        this.setBorder(new EmptyBorder(0, 10, 0, 0));
        this.a = new JTextField();
        this.a.setBorder(null);
        this.a.setOpaque(false);
        this.a.setSelectedTextColor(Color.WHITE);
        this.a.setSelectionColor(rs.gui.d.b);
        this.add((Component)this.a, "Center");
        this.a.addMouseListener(new j(this));
    }

    public void a(ActionListener actionListener) {
        this.a.addActionListener(actionListener);
    }

    public String a() {
        return this.a.getText();
    }

    public void a(String string) {
        this.a.setText(string);
    }

    @Override
    public void addKeyListener(KeyListener keyListener) {
        this.a.addKeyListener(keyListener);
    }

    @Override
    public void removeKeyListener(KeyListener keyListener) {
        this.a.removeKeyListener(keyListener);
    }

    @Override
    public void setBackground(Color color) {
        this.a(color, true);
    }

    @Override
    public boolean requestFocusInWindow() {
        return this.a.requestFocusInWindow();
    }

    public void a(Color color, boolean bl) {
        if (color == null) {
            return;
        }
        super.setBackground(color);
        if (bl) {
            this.b = color;
        }
    }

    public void a(Color color) {
        if (color == null) {
            return;
        }
        this.c = color;
    }

    public void a(boolean bl) {
        this.d = !bl;
        this.a.setEditable(bl);
        this.a.setFocusable(bl);
        if (!bl) {
            super.setBackground(this.b);
        }
    }

    public Document b() {
        return this.a.getDocument();
    }

    public JTextField c() {
        return this.a;
    }

    public Color d() {
        return this.b;
    }

    public Color e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }

    static /* synthetic */ boolean a(i i2) {
        return i2.d;
    }

    static /* synthetic */ Color b(i i2) {
        return i2.c;
    }

    static /* synthetic */ Color c(i i2) {
        return i2.b;
    }
}

