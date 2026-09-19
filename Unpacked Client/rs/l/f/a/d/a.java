/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.d;

import rs.Client;
import rs.a.b.c;
import rs.d.k;
import rs.l.f.a.d.b;

public class a
extends b {
    private int n;
    private k o;

    public a() {
        this.a(rs.l.f.a.a);
    }

    @Override
    public int[] k() {
        return this.o.g;
    }

    @Override
    public c l() {
        return this.o.aw;
    }

    @Override
    public void a() {
        if (this.n == -1) {
            return;
        }
        if (this.m == null || !(this.m instanceof k)) {
            return;
        }
        if (((k)this.m).i != this.n) {
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
            Client.eR.i = true;
            this.o = rs.d.k.f(n2);
            Client.eR.i = true;
            Client.ba = true;
            Client.bb = n2;
            Client.fb = true;
            Client.bd = this.o.Z;
            Client.be = this.o.G;
            Client.bc = this.o.M;
            Client.bf = this.o.v;
            Client.bg = this.o.W;
        } else {
            this.n = -1;
            this.m();
        }
    }

    public void m() {
        this.o();
        this.r().c();
        this.n = -1;
        Client.eR.i = false;
        Client.ba = false;
    }
}

