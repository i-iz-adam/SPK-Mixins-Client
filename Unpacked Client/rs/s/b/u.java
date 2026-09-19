/*
 * Decompiled with CFR 0.152.
 */
package rs.s.b;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import rs.a.j_0;
import rs.gui.m_0;
import rs.s.b.a;

class u
extends JToggleButton {
    private static final ImageIcon a;
    private static final ImageIcon b;
    private String c = "";

    public u() {
        super(b);
        this.setSelectedIcon(a);
        m_0.a(this);
        this.setPreferredSize(new Dimension(25, 0));
        this.addItemListener(itemEvent -> this.a());
        this.a();
    }

    private void a() {
        this.setToolTipText((String)(this.isSelected() ? "Disable plugin" : "<html>Enable plugin" + this.c));
    }

    public void a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder("<br>Plugin conflicts: ");
            for (int i2 = 0; i2 < list.size() - 2; ++i2) {
                stringBuilder.append(list.get(i2));
                stringBuilder.append(", ");
            }
            if (list.size() >= 2) {
                stringBuilder.append(list.get(list.size() - 2));
                stringBuilder.append(" and ");
            }
            stringBuilder.append(list.get(list.size() - 1));
            this.c = stringBuilder.toString();
        } else {
            this.c = "";
        }
        this.a();
    }

    static {
        BufferedImage bufferedImage = j_0.b(a.class, "switcher_on.png");
        a = new ImageIcon(bufferedImage);
        b = new ImageIcon(j_0.a(j_0.b((Image)j_0.a(bufferedImage), 0.61f), true, false));
    }
}

