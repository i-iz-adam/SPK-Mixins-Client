/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.d;

import rs.a.b.c;
import rs.d.r;
import rs.gui.Launcher;
import rs.l.f.a;
import rs.l.f.a.d.b;

public class d
extends b {
    private int n;
    private r o;

    public d() {
        this.a(rs.l.f.a.d);
    }

    @Override
    public int[] k() {
        return this.o.ax;
    }

    @Override
    public c l() {
        return null;
    }

    @Override
    public void a() {
        if (this.n == -1) {
            return;
        }
        if (this.m == null || !(this.m instanceof r)) {
            return;
        }
        if (((r)this.m).aa != this.n) {
            return;
        }
        int n2 = this.h.size();
        this.s();
        for (int i2 = 0; i2 < this.l.ah; ++i2) {
            if (this.g && this.i.a_(this.l.ar[i2])) continue;
            this.h.add(this.l.ar[i2]);
        }
        if (n2 != this.h.size()) {
            this.n();
        }
        super.a();
    }

    @Override
    public void a(Object object, boolean bl) {
        int n2 = (Integer)object;
        if (this.n == n2) {
            if (bl) {
                this.p();
            } else {
                this.m();
                return;
            }
        }
        if (this.n != -1 && this.n != n2 && !bl) {
            this.m();
        }
        this.n = n2;
        if (this.n != -1) {
            this.o = r.c(n2);
            Launcher.n().o().l();
        } else {
            this.m();
        }
    }

    public void m() {
        this.o();
        this.r().c();
        this.n = -1;
    }

    public boolean a(int n2) {
        return this.n == n2;
    }
}

