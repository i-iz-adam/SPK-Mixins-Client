/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 */
package rs.ui.components.b;

import com.google.a.b.as;
import java.awt.Color;
import java.util.function.BooleanSupplier;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import rs.ui.components.b.b;
import rs.ui.components.b.c;
import rs.ui.components.b.d;
import rs.ui.components.b.e;

public class a
extends JLabel {
    private static final Border a = new CompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, rs.gui.d.a), BorderFactory.createEmptyBorder(5, 10, 4, 10));
    private static final Border b = BorderFactory.createEmptyBorder(5, 10, 5, 10);
    private final JComponent c;
    private BooleanSupplier d;
    private boolean e;

    public a(String string, e e2, JComponent jComponent) {
        super(string);
        this.c = jComponent;
        if (this.e) {
            this.a();
        } else {
            this.b();
        }
        this.addMouseListener(new b(this, e2));
        if (!as.c((String)string)) {
            this.addMouseListener(new c(this));
        }
    }

    public a(ImageIcon imageIcon, e e2, JComponent jComponent) {
        this("", e2, jComponent);
        this.setIcon(imageIcon);
        this.setOpaque(true);
        this.setVerticalAlignment(0);
        this.setHorizontalAlignment(0);
        this.setBackground(rs.gui.d.c);
        this.addMouseListener(new d(this));
    }

    public boolean a() {
        if (this.d != null && !this.d.getAsBoolean()) {
            return false;
        }
        this.setBorder(a);
        this.setForeground(Color.WHITE);
        this.e = true;
        return true;
    }

    public void b() {
        this.setBorder(b);
        this.setForeground(Color.GRAY);
        this.e = false;
    }

    public JComponent c() {
        return this.c;
    }

    public void a(BooleanSupplier booleanSupplier) {
        this.d = booleanSupplier;
    }

    public boolean d() {
        return this.e;
    }
}

