/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.bU
 *  gnu.trove.g
 *  gnu.trove.i.a.i
 */
package rs.l.f.a.d;

import gnu.trove.f.b.bU;
import gnu.trove.g;
import gnu.trove.i.a.i;
import java.util.HashSet;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import rs.a.b.c;
import rs.l.f.b.a;
import rs.s.c.d;

public abstract class b
extends a {
    protected HashSet<Integer> e;
    protected boolean f;
    protected boolean g;
    protected HashSet<Integer> h = new HashSet();
    protected i i;
    protected i j;
    protected i k;

    public b() {
        this.e = new HashSet();
        this.i = new i();
        this.k = new i();
        this.j = new i();
    }

    public abstract int[] k();

    public abstract c l();

    @Override
    public void a() {
        boolean bl;
        if (this.l == null || this.l.ar == null) {
            return;
        }
        boolean bl2 = bl = this.h.size() == 0;
        if (bl) {
            this.s();
        }
        for (int i2 = 0; i2 < this.l.ah; ++i2) {
            if (this.g && this.i.a_(this.l.ar[i2])) continue;
            if (bl) {
                this.h.add(this.l.ar[i2]);
            }
            this.a(i2, this.l.ar);
        }
        if (bl) {
            this.n();
        }
    }

    public void b(boolean bl) {
        this.g = bl;
        this.p();
    }

    public void a(Object object, boolean bl) {
    }

    protected void n() {
        SwingUtilities.invokeLater(() -> {
            for (Integer n2 : this.h) {
                if (this.j.a_(n2.intValue())) {
                    this.q().addElement(n2 + " (texture)");
                    continue;
                }
                if (this.k.a_(n2.intValue())) {
                    this.q().addElement(n2 + " (texturized)");
                    continue;
                }
                if (this.i.a_(n2.intValue())) {
                    this.q().addElement(n2 + " (recolored)");
                    continue;
                }
                this.q().addElement("" + n2);
            }
            rs.s.c.c.b.g().ensureIndexIsVisible(this.h.size());
        });
    }

    protected void o() {
        this.p();
        this.i.clear();
        this.e.clear();
    }

    protected void p() {
        this.i.clear();
        this.h.clear();
        if (this.q().getSize() > 0) {
            SwingUtilities.invokeLater(() -> this.q().removeAllElements());
        }
    }

    protected DefaultListModel q() {
        return (DefaultListModel)rs.s.c.c.b.g().getModel();
    }

    protected d r() {
        return rs.s.c.c.b;
    }

    private void a(int n2, int[] nArray) {
        if (this.e.contains(nArray[n2])) {
            nArray[n2] = -1;
        } else if (this.f) {
            nArray[n2] = 1;
        }
    }

    protected void s() {
        if (this.l() != null) {
            if (this.l().b()) {
                this.i.b((g)this.l().h().b());
            }
            if (this.l().c()) {
                this.i.b((g)this.l().g().b());
                this.k.b((g)this.l().g().b());
                for (bU bU2 : this.l().g().c()) {
                    this.i.b(bU2.e());
                    this.j.b(bU2.e());
                }
            }
            if (this.l().d()) {
                this.i.b(this.l().f().a());
            }
        } else if (this.k() != null) {
            for (int i2 = 0; i2 < this.k().length; ++i2) {
                this.i.b(this.k()[i2]);
            }
        }
    }

    public HashSet<Integer> t() {
        return this.e;
    }

    public void c(boolean bl) {
        this.f = bl;
    }
}

