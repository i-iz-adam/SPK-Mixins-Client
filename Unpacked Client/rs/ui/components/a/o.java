/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.d.aN
 */
package rs.ui.components.a;

import com.google.a.d.aN;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.function.Consumer;
import javax.swing.JPanel;
import rs.A.s;
import rs.a.g_0;
import rs.e.i;
import rs.ui.components.a.p;

final class o {
    private static final String a = "recentColors";
    private static final int b = 16;
    private static final int c = 16;
    private final aN<String> d = aN.a((int)16);
    private final i e;

    o(i i2) {
        this.e = i2;
    }

    private void a() {
        String string = this.e.a("colorpicker", a);
        if (string != null) {
            this.d.addAll(s.a(string));
        }
    }

    void a(String string) {
        if (g_0.c(string) == null) {
            return;
        }
        this.d.remove((Object)string);
        this.d.add((Object)string);
        this.e.b("colorpicker", a, s.a(this.d));
    }

    JPanel a(Consumer<Color> consumer, boolean bl) {
        this.a();
        JPanel jPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(0, 1, 4, 2);
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = 17;
        for (String string : this.d) {
            if (gridBagConstraints.gridx == 8) {
                ++gridBagConstraints.gridy;
                gridBagConstraints.gridx = 0;
            }
            if (jPanel.getComponentCount() == this.d.size() - 1) {
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.gridwidth = 8 - gridBagConstraints.gridx;
            }
            jPanel.add((Component)o.a(g_0.c(string), consumer, bl), gridBagConstraints);
            ++gridBagConstraints.gridx;
        }
        return jPanel;
    }

    private static JPanel a(Color color, Consumer<Color> consumer, boolean bl) {
        JPanel jPanel = new JPanel();
        String string = bl ? g_0.c(color) : g_0.d(color);
        jPanel.setBackground(color);
        jPanel.setOpaque(true);
        jPanel.setPreferredSize(new Dimension(16, 16));
        jPanel.setToolTipText("#" + string.toUpperCase());
        jPanel.addMouseListener(new p(consumer, color));
        return jPanel;
    }
}

