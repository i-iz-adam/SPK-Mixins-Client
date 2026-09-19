/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import rs.h.a;

/*
 * Renamed from rs.A.d
 */
public class d_0
extends BufferedImage {
    private final List<Runnable> a = new ArrayList<Runnable>();
    private boolean b;

    public d_0(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public synchronized void a() {
        this.b = true;
        for (Runnable runnable : this.a) {
            runnable.run();
        }
        this.a.clear();
    }

    public synchronized void a(Runnable runnable) {
        if (this.b) {
            rs.h.a.a(runnable::run);
            return;
        }
        this.a.add(runnable);
    }

    public void a(JButton jButton) {
        jButton.setIcon(this.a((JComponent)jButton));
    }

    public void a(JLabel jLabel) {
        jLabel.setIcon(this.a((JComponent)jLabel));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private ImageIcon a(JComponent jComponent) {
        d_0 d_02 = this;
        synchronized (d_02) {
            if (!this.b) {
                this.a.add(() -> SwingUtilities.invokeLater(jComponent::repaint));
            }
        }
        return new ImageIcon(this);
    }
}

