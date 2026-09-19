/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.p;

import javax.inject.Inject;
import rs.l.f.b.b;
import rs.s.p.a;

public class c
extends b {
    private final a i;

    @Inject
    public c(a a2) {
        this.i = a2;
        this.a(rs.l.f.a.e);
    }

    @Override
    public void a() {
        if (this.e != null && this.e.aG == null || !this.e.aG.h) {
            return;
        }
        if (this.e.k() || this.e.j()) {
            rs.ui.b.b.a().a(this.e, this.i.c(), this.i.a(), this.i.d());
        }
    }
}

