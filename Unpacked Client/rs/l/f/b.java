/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f;

import java.awt.Color;
import java.awt.Shape;
import java.awt.Stroke;
import rs.Client;
import rs.l.c;
import rs.l.e_0;
import rs.l.f.a;
import rs.l.f.e;
import rs.l.f.m;
import rs.l.h;
import rs.runelite.a.f;
import rs.runelite.a.i;

public abstract class b {
    protected Client a;
    protected boolean b = true;
    private int e;
    private a f;
    private a g;
    protected int c;
    protected int d;

    public abstract void a();

    public void b() {
    }

    public void c() {
    }

    public void a(a a2) {
        this.f = a2;
        this.g = a2;
    }

    protected void a(f f2, String string, Color color, int n2) {
        i i2 = rs.runelite.a.h.a(rs.l.f.e.d().b(this.f), f2, string, 0);
        if (i2 != null) {
            m.a(rs.l.f.e.d().b(this.f), i2, string, color);
        }
    }

    protected void a(Shape shape, Color color) {
        m.a(rs.l.f.e.d().b(this.f), shape, color, m.a());
    }

    protected void a(Shape shape, Color color, Color color2) {
        m.a(rs.l.f.e.d().b(this.f), shape, color, color2, m.a());
    }

    protected void a(Shape shape, Color color, Color color2, Stroke stroke) {
        m.a(rs.l.f.e.d().b(this.f), shape, color, color2, stroke);
    }

    protected void b(Shape shape, Color color, Color color2, Stroke stroke) {
        m.b(rs.l.f.e.d().b(this.f), shape, color, color2, stroke);
    }

    protected void a(i i2, String string, Color color) {
        if (i2 == null) {
            return;
        }
        m.a(rs.l.f.e.d().b(this.f), i2, string, color);
    }

    protected void a(int n2, int n3, int n4, int n5) {
        this.a(n2, n3, n4, n5, rs.s.s.b.p, rs.s.s.b.r, rs.s.s.b.q);
    }

    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        rs.l.c.b(n5, n3, n2, n6, n4, h.ap != 256 ? h.ap : 200);
        if (h.ap != 256) {
            rs.l.c.e(n2, n4, n5, n8, n3, h.ap);
        } else {
            rs.l.c.d(n2, n4, n5, n8, n3);
        }
        int n9 = 1;
        if (h.ap != 256) {
            rs.l.c.e(n2 - n9, n4 + n9 * 2, n5 + n9 * 2, n7, n3 - n9, h.ap);
        } else {
            rs.l.c.d(n2 - n9, n4 + n9 * 2, n5 + n9 * 2, n7, n3 - n9);
        }
    }

    protected void a(int n2, int n3, int n4) {
        if (n2 < 128 || n3 < 128 || n2 > 13056 || n3 > 13056) {
            this.c = -1;
            this.d = -1;
            return;
        }
        int n5 = this.a.c(Client.dw, n3, n2) - n4;
        n2 -= Client.cJ;
        n5 -= Client.cK;
        int n6 = rs.a.h.bA[this.a.cR];
        int n7 = rs.a.h.bB[this.a.cR];
        int n8 = rs.a.h.bA[this.a.cS];
        int n9 = rs.a.h.bB[this.a.cS];
        int n10 = (n3 -= Client.cL) * n8 + n2 * n9 >> 16;
        n3 = n3 * n9 - n2 * n8 >> 16;
        n2 = n10;
        n10 = n5 * n7 - n3 * n6 >> 16;
        n3 = n5 * n6 + n3 * n7 >> 16;
        n5 = n10;
        if (n3 >= 50) {
            this.c = e_0.s + (n2 << 9) / n3;
            this.d = e_0.t + (n5 << 9) / n3;
        } else {
            this.c = -1;
            this.d = -1;
        }
    }

    protected int a(int n2, int n3) {
        int n4 = this.d() - n2;
        int n5 = this.e() - n3;
        return (int)Math.ceil(Math.sqrt(n4 * n4 + n5 * n5));
    }

    protected boolean b(int n2, int n3) {
        return n2 >= 128 && n3 >= 128 && n2 <= 13056 && n3 <= 13056;
    }

    protected int d() {
        return Client.eh + (Client.eR.ac - 6 >> 7);
    }

    protected int e() {
        return Client.ei + (Client.eR.ad - 6 >> 7);
    }

    public void a(Client client) {
        this.a = client;
    }

    public Client f() {
        return this.a;
    }

    public boolean g() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public int h() {
        return this.e;
    }

    public a i() {
        return this.f;
    }

    public void b(a a2) {
        this.f = a2;
    }

    public a j() {
        return this.g;
    }
}

