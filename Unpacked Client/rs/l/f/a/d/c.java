/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.i.a.i
 */
package rs.l.f.a.d;

import gnu.trove.i.a.i;
import java.util.HashSet;
import rs.a.j;
import rs.d.d;
import rs.l.f.a;
import rs.l.f.a.d.b;

public class c
extends b {
    private j n;
    private int o;
    private d p;

    public c() {
        this.a(rs.l.f.a.c);
        this.h = new HashSet();
        this.e = new HashSet();
        this.i = new i();
    }

    @Override
    public int[] k() {
        return this.p.v;
    }

    @Override
    public rs.a.b.c l() {
        return this.p.i;
    }

    @Override
    public void a() {
        if (!(this.m instanceof j)) {
            return;
        }
        j j2 = (j)this.m;
        if (j2.aG.x != (long)this.o) {
            return;
        }
        this.p = rs.d.d.c(this.o);
        j2.i = true;
        super.a();
    }

    @Override
    public void a(Object object, boolean bl) {
        j j2 = (j)object;
        if (j2 == this.n) {
            if (bl) {
                this.p();
            } else {
                j2.av = true;
                this.m();
                return;
            }
        }
        if (this.n != null && this.n != j2 && !bl) {
            this.m();
        }
        this.n = j2;
        if (this.n != null && this.n.aG != null) {
            this.n.i = true;
            this.o = (int)j2.aG.x;
        } else {
            this.o = -1;
        }
    }

    public void m() {
        this.o();
        this.r().c();
        this.n = null;
        this.o = -1;
    }

    public j u() {
        return this.n;
    }
}

