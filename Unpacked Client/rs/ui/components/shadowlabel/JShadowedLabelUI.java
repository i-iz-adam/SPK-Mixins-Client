/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components.shadowlabel;

import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicLabelUI;
import rs.ui.components.shadowlabel.a;

class JShadowedLabelUI
extends BasicLabelUI {
    JShadowedLabelUI() {
    }

    @Override
    protected void paintEnabledText(JLabel jLabel, Graphics graphics, String string, int n2, int n3) {
        if (jLabel instanceof a) {
            a a2 = (a)jLabel;
            graphics.setColor(a2.a());
            graphics.drawString(string, n2 + a2.b().x, n3 + a2.b().y);
        }
        graphics.setColor(jLabel.getForeground());
        graphics.drawString(string, n2, n3);
    }
}

