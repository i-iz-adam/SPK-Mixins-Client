/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.a;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import rs.gui.b.e;

class j
extends DefaultListCellRenderer {
    private final JComboBox a;

    public j(JComboBox jComboBox) {
        this.setOpaque(true);
        this.a = jComboBox;
    }

    @Override
    public Component getListCellRendererComponent(JList jList, Object object, int n2, boolean bl, boolean bl2) {
        int n3;
        JLabel jLabel = (JLabel)super.getListCellRendererComponent((JList<?>)jList, object, n2, bl, bl2);
        int n4 = n3 = n2 > 0 ? n2 : this.a.getSelectedIndex();
        if (jLabel.getText().startsWith("None")) {
            return jLabel;
        }
        if (n3 > 0) {
            jLabel.setIcon(e.values()[n3 - 1].a());
        } else {
            jLabel.setIcon(null);
        }
        return jLabel;
    }
}

