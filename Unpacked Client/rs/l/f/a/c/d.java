/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.c;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import rs.Client;
import rs.a.j;
import rs.a.k;
import rs.l.c;
import rs.l.e.f;
import rs.l.f.a;
import rs.l.f.g;
import rs.l.f.l;

public class d
extends g {
    private static final int x = 1;
    private static final Dimension y = new Dimension();
    private static final Dimension z = new Dimension(142, 33);
    private static final Dimension A = new Dimension(142, 21);
    public String r;
    public int s;
    public int t;
    public int u;
    public int v;
    public long w;

    public d() {
        this.a("CombatOverlay");
        this.a(rs.l.f.a.p);
        this.c(rs.l.f.a.A);
        this.a(rs.l.f.l.c);
        this.a(10.0f);
        this.e.a(new Rectangle(2, 2, 2, 2));
        this.e.b(new Point(0, 2));
    }

    @Override
    public Dimension a(Graphics2D graphics2D) {
        j j2;
        if (this.r == null || this.s <= 0) {
            return y;
        }
        if (rs.l.e.a.c.f()) {
            return y;
        }
        if (System.currentTimeMillis() - this.w >= 20000L) {
            return y;
        }
        if (!rs.f.a.aB) {
            return y;
        }
        if (rs.l.e.f.e.E) {
            return y;
        }
        int n2 = 140;
        int n3 = 32;
        int n4 = this.f.x + 1;
        int n5 = this.f.y;
        int n6 = 0;
        if (rs.f.a.ar) {
            this.a(A);
        } else {
            this.a(z);
        }
        if (Client.eR.m != -1) {
            this.v = Client.eR.m;
        }
        if (this.v != -1 && this.v < 32768 && (j2 = this.a.cA[this.v]) != null && j2.aG.o.equalsIgnoreCase(this.r)) {
            n6 = j2.M;
            if (j2.N * 2 == this.s) {
                n6 *= 2;
            }
        }
        if (this.v >= 32768) {
            int n7 = this.v - 32768;
            k k2 = Client.do[n7];
            if (k2 != null && k2.aZ.equalsIgnoreCase(this.r)) {
                n6 = k2.M;
            }
        }
        if (n6 > 0 && n6 != this.t) {
            this.u = this.c((int)((float)(n2 - 4) * ((float)this.t / (float)this.s)), n2);
            this.t = n6;
        }
        if (this.t == 0 && System.currentTimeMillis() - this.w < 17000L) {
            this.w = System.currentTimeMillis() - 17000L;
        }
        int n8 = (int)((float)(n2 - 4) * ((float)this.t / (float)this.s));
        if (rs.f.a.at) {
            if (!rs.l.b.a.a() && this.u > n8) {
                this.u -= 2;
            }
        } else {
            this.u = n8;
        }
        if (rs.f.a.ar) {
            rs.l.c.b(n3 -= 12, n5, n4, 4077096, n2, 125);
            rs.l.c.d(n4, n2, n3, 5918522, n5);
            rs.l.c.d(n4 - 1, n2 + 2, n3 + 2, 2367511, n5 - 1);
            rs.l.c.b(15, (n5 -= 13) + 15, n4 + 2, 13960709, n2 - 4, 150);
            rs.l.c.b(15, n5 + 15, n4 + 2, 11297536, this.c(this.u, n2), 255);
            rs.l.c.b(15, n5 + 15, n4 + 2, 39186, this.c(n8, n2), 255);
            int n9 = this.t;
            int n10 = this.s;
            if (rs.f.a.ak) {
                n9 *= 10;
                n10 *= 10;
            }
            Object object = this.r;
            int n11 = 12;
            if (n10 >= 1000) {
                n11 = 10;
            }
            if (n10 >= 10000) {
                n11 = 8;
            }
            object = ((String)object).length() > n11 ? ((String)object).substring(0, n11).trim() + ".." : (String)object + ":";
            Client.gl.c((String)object + " @yel@" + n9 + " / " + n10, n4 + n2 / 2, n5 + 27, 0xFFFFFF, 0);
        } else {
            rs.l.c.b(n3, n5, n4, 4077096, n2, 125);
            rs.l.c.d(n4, n2, n3, 5918522, n5);
            rs.l.c.d(n4 - 1, n2 + 2, n3 + 2, 2367511, n5 - 1);
            Client.gl.c(this.r, n4 + n2 / 2, n5 + 12, 0xFFFFFF, 0);
            rs.l.c.b(15, n5 + 15, n4 + 2, 13960709, n2 - 4, 150);
            rs.l.c.b(15, n5 + 15, n4 + 2, 11297536, this.c(this.u, n2), 255);
            rs.l.c.b(15, n5 + 15, n4 + 2, 39186, this.c(n8, n2), 255);
            int n12 = this.t;
            int n13 = this.s;
            if (rs.f.a.ak) {
                n12 *= 10;
                n13 *= 10;
            }
            Client.gl.c(n12 + " / " + n13, n4 + n2 / 2, n5 + 27, 0xFFFFFF, 0);
        }
        return this.j;
    }

    public int c(int n2, int n3) {
        int n4 = n2;
        if (this.t > 0 && n4 <= 0) {
            n4 = 1;
        }
        if (n4 > n3 - 4) {
            n4 = n3 - 4;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        return n4;
    }
}

