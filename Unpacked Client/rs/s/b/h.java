/*
 * Decompiled with CFR 0.152.
 */
package rs.s.b;

import java.awt.Dimension;
import javax.swing.JPanel;

class h
extends JPanel {
    h() {
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(350, super.getPreferredSize().height);
    }
}

