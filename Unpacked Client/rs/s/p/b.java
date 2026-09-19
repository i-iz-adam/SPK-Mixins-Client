/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.p;

import javax.inject.Inject;
import rs.Client;
import rs.l.f.b.c;
import rs.s.p.a;

public class b
extends c {
    private final a f;

    @Inject
    public b(a a2) {
        this.f = a2;
        this.a(rs.l.f.a.n);
    }

    @Override
    public void a() {
        if (Client.eR == null) {
            return;
        }
        boolean bl = rs.f.a.N;
        rs.f.a.N = true;
        rs.ui.b.b.a().a(Client.eR, this.f.c(), this.f.a(), this.f.d());
        rs.f.a.N = bl;
    }
}

