/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;
import rs.A.s;
import rs.gui.d;

public final class c<T>
extends JLabel
implements ListCellRenderer<T> {
    @Override
    public Component getListCellRendererComponent(JList<? extends T> jList, T t2, int n2, boolean bl, boolean bl2) {
        if (bl) {
            this.setBackground(d.d);
            this.setForeground(Color.WHITE);
        } else {
            this.setBackground(jList.getBackground());
            this.setForeground(d.f);
        }
        this.setBorder(new EmptyBorder(5, 5, 5, 0));
        String string = t2 instanceof Enum ? s.a((Enum)t2) : t2.toString();
        this.setText(string);
        return this;
    }
}

