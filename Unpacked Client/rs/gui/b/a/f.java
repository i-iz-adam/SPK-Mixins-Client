/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.a;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import rs.gui.b.a;
import rs.gui.b.a.k;
import rs.gui.d;

class f
extends DefaultListCellRenderer {
    private final rs.gui.b.d a;
    private final k b;

    public f(rs.gui.b.d d2, k k2) {
        this.setOpaque(true);
        this.b = k2;
        this.a = d2;
    }

    @Override
    public Component getListCellRendererComponent(JList jList, Object object, int n2, boolean bl, boolean bl2) {
        jList.setSelectionBackground(d.d);
        JLabel jLabel = (JLabel)super.getListCellRendererComponent((JList<?>)jList, object, n2, bl, bl2);
        a a2 = null;
        if (n2 >= 0) {
            if (this.a.d() != null && n2 < this.a.d().size() && this.a.d().get(n2) != null) {
                a2 = (a)this.a.d().get(n2);
            }
        } else if (this.b.getSelectedIndex() >= 0 && this.a.d() != null && this.b.getSelectedIndex() < this.a.d().size() && this.a.d().get(this.b.getSelectedIndex()) != null) {
            a2 = (a)this.a.d().get(this.b.getSelectedIndex());
        }
        if (a2 != null) {
            jLabel.setForeground(a2.j());
            if (a2.k() != null) {
                jLabel.setIcon(a2.k().a());
            }
        }
        return jLabel;
    }
}

