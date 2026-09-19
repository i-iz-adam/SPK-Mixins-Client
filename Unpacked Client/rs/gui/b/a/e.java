/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.a;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;

class e
extends DefaultListCellRenderer {
    private static final long b = -1L;
    private Color[] c;
    private String[] d;
    JComboBox a;

    public e(JComboBox jComboBox) {
        this.a = jComboBox;
        this.setOpaque(true);
    }

    public void a(Color[] colorArray) {
        this.c = colorArray;
    }

    public void a(String[] stringArray) {
        this.d = stringArray;
    }

    public Color[] a() {
        return this.c;
    }

    public String[] b() {
        return this.d;
    }

    @Override
    public Component getListCellRendererComponent(JList jList, Object object, int n2, boolean bl, boolean bl2) {
        if (this.c.length != this.d.length) {
            System.out.println("colors.length does not equal strings.length");
            return this;
        }
        if (this.c == null) {
            System.out.println("use setColors first.");
            return this;
        }
        if (this.d == null) {
            System.out.println("use setStrings first.");
            return this;
        }
        JLabel jLabel = (JLabel)super.getListCellRendererComponent((JList<?>)jList, object, n2, bl, bl2);
        if (n2 == -1) {
            jLabel.setForeground(this.c[this.a.getSelectedIndex()]);
        } else {
            jLabel.setForeground(this.c[n2]);
        }
        return jLabel;
    }
}

