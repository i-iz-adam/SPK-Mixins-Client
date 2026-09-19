/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import rs.gui.w;
import rs.ui.components.shadowlabel.a;

public class u
extends JPanel {
    private final JLabel a = new a();
    private final JLabel b = new a();

    public u() {
        this.setOpaque(false);
        this.setBorder(new EmptyBorder(50, 10, 0, 10));
        this.setLayout(new BorderLayout());
        this.a.setForeground(Color.WHITE);
        this.a.setHorizontalAlignment(0);
        this.b.setFont(w.b());
        this.b.setForeground(Color.GRAY);
        this.b.setHorizontalAlignment(0);
        this.add((Component)this.a, "North");
        this.add((Component)this.b, "Center");
        this.setVisible(false);
    }

    public void a(String string, String string2) {
        this.a.setText(string);
        this.b.setText("<html><body style = 'text-align:center'>" + string2 + "</body></html>");
        this.setVisible(true);
    }
}

