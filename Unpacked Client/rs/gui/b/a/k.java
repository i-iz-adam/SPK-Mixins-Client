/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b.a;

import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.ListCellRenderer;
import rs.gui.b.a.f;
import rs.gui.b.a.l;
import rs.gui.b.a.m;
import rs.gui.b.d;
import rs.ui.components.c;

public class k
extends JComboBox<String> {
    private final ListCellRenderer<Enum<?>> a = new c();
    private final d b;

    public k(d d2, String[] stringArray) {
        super(stringArray);
        this.b = d2;
        this.setRenderer(new f(d2, this));
        this.setInheritsPopupMenu(true);
        this.setPreferredSize(new Dimension(150, 25));
        this.a();
    }

    private void a() {
        this.addPopupMenuListener(new l(this));
        this.addActionListener(new m(this));
    }

    static /* synthetic */ d a(k k2) {
        return k2.b;
    }
}

