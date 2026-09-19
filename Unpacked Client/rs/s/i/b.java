/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.i;

import java.awt.Color;
import javax.inject.Inject;
import rs.Client;
import rs.a.g_0;
import rs.a.j;
import rs.h_0;
import rs.q_0;
import rs.runelite.a.g;
import rs.runelite.events.EntityInteraction;
import rs.runelite.events.ObjectInteraction;
import rs.s.i.a;

public class b
extends rs.l.f.b {
    private static final Color e = new Color(-1862270977);
    private final a f;
    private Object g = null;
    private int h = -1;
    private boolean i = false;
    private int j = -1;
    private int k = -1;

    @Inject
    public b(a a2) {
        this.f = a2;
        this.a(rs.l.f.a.n);
    }

    @Override
    public void a() {
        this.k();
        this.m();
        this.n();
    }

    public void k() {
    }

    public void a(EntityInteraction entityInteraction) {
        if (entityInteraction.getEntity() instanceof j && !this.f.b()) {
            return;
        }
        this.g = entityInteraction.getEntity();
        this.i = entityInteraction.isCombat();
        this.h = Client.ff;
        this.j = this.a.gd;
        this.k = this.a.ge;
    }

    public void a(ObjectInteraction objectInteraction) {
        if (!this.f.h()) {
            return;
        }
        this.g = this.b(objectInteraction.getX(), objectInteraction.getY(), objectInteraction.getZ(), objectInteraction.getHash());
        if (this.g == null) {
            this.l();
            return;
        }
        this.i = false;
        this.h = Client.ff;
        this.j = this.a.gd;
        this.k = this.a.ge;
    }

    private void m() {
        int n2;
        int n3;
        int n4;
        q_0 q_02;
        int n5;
        int n6 = this.a.eV - 1;
        if (n6 < 0) {
            return;
        }
        int n7 = this.a.eI[n6];
        if (rs.runelite.a.g.a(n7) && this.f.a()) {
            n5 = this.a.eJ[n6];
            if (n5 < 0 || n5 >= this.a.cA.length) {
                return;
            }
            j j2 = this.a.cA[n5];
            if (j2 != null && j2 != this.g) {
                rs.ui.b.b.a().a(j2, this.f.k(), this.f.c(), this.f.l());
            }
        }
        if (rs.runelite.a.g.c(n7) && this.f.g() && (q_02 = this.b(n4 = this.a.eF[n6], n3 = this.a.eG[n6], n2 = Client.dw, n5 = this.a.eJ[n6])) != null && q_02 != this.g) {
            rs.ui.b.b.a().a(q_02, this.f.k(), this.f.i(), this.f.l());
        }
    }

    private void n() {
        if (this.g == null) {
            return;
        }
        if (Client.ff - this.h >= 30 && (this.a.gd != this.j || this.a.ge != this.k)) {
            this.l();
            return;
        }
        if (Client.ff - this.h >= 30 * (this.i ? 4 : 10)) {
            this.l();
            return;
        }
        if (this.g instanceof j) {
            j j2 = (j)this.g;
            Color color = this.i ? this.f.d() : this.f.c();
            Color color2 = this.i ? this.f.f() : this.f.e();
            Color color3 = this.a(color, color2);
            rs.ui.b.b.a().a(j2, this.f.k(), color3, this.f.l());
        } else if (this.g instanceof q_0) {
            Color color = this.f.i();
            Color color4 = this.f.j();
            Color color5 = this.a(color, color4);
            rs.ui.b.b.a().a((q_0)this.g, this.f.k(), color5, this.f.l());
        }
    }

    private Color a(Color color, Color color2) {
        int n2 = Client.ff - this.h;
        if (n2 < 5) {
            return g_0.a(color, e, (float)n2 / 5.0f);
        }
        if (n2 < 10) {
            return g_0.a(e, color2, (float)(n2 - 5) / 5.0f);
        }
        return color2;
    }

    public void l() {
        this.i = false;
        this.g = null;
        this.h = Client.ff;
        this.j = -1;
        this.k = -1;
    }

    private q_0 b(int n2, int n3, int n4, int n5) {
        h_0 h_02 = this.a.dF.i[n4][n2][n3];
        if (h_02 == null) {
            return null;
        }
        if (h_02.j != null && h_02.j.m == n5) {
            return h_02.j;
        }
        if (h_02.k != null && h_02.k.m == n5) {
            return h_02.k;
        }
        if (h_02.l != null && h_02.l.m == n5) {
            return h_02.l;
        }
        for (int i2 = 0; i2 < h_02.n; ++i2) {
            if (h_02.o[i2].m != n5) continue;
            return h_02.o[i2];
        }
        return null;
    }
}

