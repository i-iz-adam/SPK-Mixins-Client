/*
 * Decompiled with CFR 0.152.
 */
package rs.ui;

import java.awt.CardLayout;
import java.awt.Component;
import rs.ui.m;

public class k
extends m {
    private final CardLayout a = new CardLayout();
    private boolean b = false;
    private m d;

    public k(m m2) {
        super(false);
        this.setLayout(this.a);
        this.c(m2);
    }

    public void b() {
        for (int i2 = this.getComponentCount() - 1; i2 > 0; --i2) {
            this.b((m)this.getComponent(i2));
            this.remove(i2);
        }
    }

    public void c(m m2) {
        int n2 = -1;
        for (int i2 = this.getComponentCount() - 1; i2 >= 0; --i2) {
            if (this.getComponent(i2) != m2) continue;
            n2 = i2;
            break;
        }
        if (this.b) {
            this.d.K_();
            m2.J_();
        }
        this.d = m2;
        String string = "" + System.identityHashCode(m2);
        if (n2 != -1) {
            for (int i3 = this.getComponentCount() - 1; i3 > n2; --i3) {
                this.c();
            }
        } else {
            this.add((Component)m2, string);
            this.a(m2);
        }
        this.a.show(this, string);
        this.revalidate();
    }

    public void c() {
        int n2 = this.getComponentCount();
        if (n2 <= 1) {
            assert (false) : "Cannot pop last component";
            return;
        }
        m m2 = (m)this.getComponent(n2 - 2);
        if (this.b) {
            this.d.K_();
            m2.J_();
            this.d = m2;
        }
        this.a.show(this, "" + System.identityHashCode(m2));
        this.b((m)this.getComponent(n2 - 1));
        this.remove(n2 - 1);
        this.revalidate();
    }

    protected void a(m m2) {
    }

    protected void b(m m2) {
    }

    @Override
    public void J_() {
        this.b = true;
        this.d.J_();
    }

    @Override
    public void K_() {
        this.b = false;
        this.d.K_();
    }
}

