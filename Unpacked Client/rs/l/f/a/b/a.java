/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.b;

import java.awt.Dimension;
import java.awt.Graphics2D;
import rs.Client;
import rs.l.c;
import rs.l.f.a.b.b;
import rs.l.f.g;
import rs.l.f.l;
import rs.l.f_0;

public class a
extends g {
    private static final Dimension r = new Dimension(40, 40);
    private static final int s = 4;
    private static final int t = 200;
    private static final int u = 100;
    private boolean v = true;
    private final String w;
    private final String x;
    private final String y;
    private final int z;
    private final int A;
    private f_0 B;
    private f_0 C;
    private boolean D = true;
    private int E = 200;
    private rs.l.f.a.b.c F;
    private b G;

    public a(String string, String string2, String string3, int n2, int n3) {
        this.y = string;
        this.w = string2;
        this.x = string3;
        this.z = n2;
        this.A = n3;
        this.a(rs.l.f.a.q);
        this.a(rs.l.f.l.e);
        this.a(r);
        this.c(false);
        this.h(false);
    }

    @Override
    public Dimension a(Graphics2D graphics2D) {
        boolean bl;
        if (Client.ed == 197) {
            return null;
        }
        if (this.B == null || this.C == null) {
            this.B = new f_0(this.w);
            this.C = new f_0(this.x);
        }
        int n2 = this.f.x;
        int n3 = this.f.y;
        boolean bl2 = bl = this.f.contains(Client.hP, Client.hQ) && this.l();
        if (!rs.l.b.a.a()) {
            if (this.D) {
                this.E -= 4;
                if (this.E <= 100) {
                    this.D = false;
                }
            } else {
                this.E += 4;
                if (this.E >= 200) {
                    this.D = true;
                }
            }
        }
        rs.l.c.b(rs.l.f.a.b.a.r.height, n3, n2, this.z, rs.l.f.a.b.a.r.width, this.E - 25);
        rs.l.c.b(rs.l.f.a.b.a.r.height - 6, n3 + 3, n2 + 3, this.A, rs.l.f.a.b.a.r.width - 6, this.E - 100);
        (bl ? this.C : this.B).g(n2 + 2, n3 + 1, this.E + 50);
        if (this.v) {
            for (int i2 = 0; i2 < 2; ++i2) {
                int n4 = this.E - 50;
                rs.l.a.b.a.a(n2 - 4, n3 - 1 + i2 * 30, n4);
                rs.l.a.b.a.a(n2 + 31, n3 - 1 + i2 * 30, n4);
            }
        }
        if (bl) {
            this.a.b(Client.hP - rs.l.f.a.b.a.r.width - 20, Client.hQ + rs.l.f.a.b.a.r.height - 30, " " + this.y);
        }
        if (this.F != null) {
            this.F.draw(n2, n3, this.E, bl);
        }
        return r;
    }

    @Override
    public boolean n() {
        if (this.G != null) {
            rs.h.c.a(() -> this.G.execute());
        }
        return true;
    }

    public a a(rs.l.f.a.b.c c2) {
        this.F = c2;
        return this;
    }

    public a a(b b2) {
        this.G = b2;
        return this;
    }

    public boolean L() {
        return this.v;
    }

    public void k(boolean bl) {
        this.v = bl;
    }
}

