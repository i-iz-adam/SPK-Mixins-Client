/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.c;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import rs.Client;
import rs.l.c;
import rs.l.f.g;
import rs.l.f.l;

public class a
extends g {
    private static final Dimension y = new Dimension(220, 40);
    private static final Dimension z = new Dimension(220, 22);
    private static final Dimension A = new Dimension();
    private static final int B = 13960709;
    private static final int C = 30976;
    private final rs.s.a.a D;
    int r = 0;
    int s = 13960709;
    int t = 30976;
    String u;
    String v;
    String w;
    String x;
    private boolean E;
    private boolean F;

    public a(rs.s.a.a a2) {
        this.a("BossBarOverlay");
        this.a(rs.l.f.a.A);
        this.a(rs.l.f.l.d);
        this.a(10.0f);
        this.e.a(new Rectangle(2, 2, 2, 2));
        this.e.b(new Point(0, 2));
        this.D = a2;
    }

    public void L() {
        this.s = 13960709;
        this.t = 30976;
        this.r = 0;
        this.v = "100%";
        this.u = "100%";
        this.x = "";
        this.w = "";
    }

    @Override
    public Dimension a(Graphics2D graphics2D) {
        if (Client.cH != -1) {
            return A;
        }
        if (!this.E) {
            return A;
        }
        int n2 = 220;
        int n3 = 40;
        int n4 = this.f.x;
        int n5 = this.f.y;
        double d2 = (double)this.r / 100.0;
        if (this.D.e() == rs.s.a.c.b) {
            n3 -= 18;
            this.a(z);
            this.j = z;
        } else {
            this.a(y);
            this.j = y;
        }
        rs.l.c.b(n3, n5, n4, 5129018, n2, 255);
        rs.l.c.d(n4, n2, n3, 5918522, n5);
        rs.l.c.d(n4 - 1, n2 + 2, n3 + 2, 2367511, n5 - 1);
        if (this.D.e() == rs.s.a.c.a) {
            Client.gl.c(this.w, n4 + (n2 + 4) / 2, n5 + 14, 16750623, 0);
            Client.gl.a(this.x, n4 + n2 - 3, n5 + 14, 3135999, 0);
        }
        if (this.D.e() == rs.s.a.c.b) {
            n5 -= 17;
        }
        n3 = 20;
        int n6 = (int)Math.ceil((double)(n2 -= 6) * d2);
        rs.l.c.b(n3, n5 += 18, n4 += 2, 0, n2 + 2, 255);
        rs.l.c.b(n3 - 2, n5 + 1, n4 + 1, this.t, n2, 255);
        rs.l.c.b(n3 - 2, n5 + 1, n4 + 1, this.s, n6, 255);
        String string = this.D.e() == rs.s.a.c.b ? this.v : this.u;
        Client.gl.c(string, n4 + (n2 + 6) / 2, n5 + 15, 0xFFFFFF, 0);
        if (this.D.e() == rs.s.a.c.b) {
            Client.gl.a(this.x, n4 + n2 - 3, n5 + 15, 3135999, 0);
        }
        return this.j;
    }

    @Override
    public void c() {
        this.E = false;
        this.F = true;
    }

    public void k(boolean bl) {
        this.E = bl;
    }

    public boolean M() {
        return this.F;
    }
}

