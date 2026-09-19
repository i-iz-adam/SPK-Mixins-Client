/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.g;

import rs.Client;
import rs.l.f.a;
import rs.l.f.a.g.c;
import rs.l.f.e;

public class b
extends rs.l.f.b {
    private c e;
    private String f;
    private int g;
    private int h;
    private double i;
    private boolean j;

    public b() {
        this.a(rs.l.f.a.A);
    }

    @Override
    public void a() {
        int n2 = 500;
        int n3 = 18;
        int n4 = 6 - (Client.ai() ? 5 : 1) - rs.l.f.a.g.c.r;
        int n5 = 15 - rs.l.f.a.g.c.s - n3 / 2;
        double d2 = this.i / 100.0;
        int n6 = this.j ? 4095 : 13960709;
        int n7 = this.j ? 50431 : 30976;
        int n8 = (int)Math.ceil((double)n2 * d2);
        rs.l.c.b(n3, n5, n4, 0, n2 + 4, 125);
        rs.l.c.b(14, n5 + 2, n4 + 2, n6, n2, 255);
        rs.l.c.b(14, n5 + 2, n4 + 2, n7, n8, 255);
        Client.gl.c(this.f, n4 + (n2 + 4) / 2, n5 + 14, 0xFFFFFF, 0);
    }

    @Override
    public void c() {
        rs.l.f.e.d().b(this);
    }

    public void c(int n2, int n3) {
        this.g = n2;
        this.h = n3;
        this.i = (double)this.g / (double)n3 * 100.0;
        this.f = Client.a(this.g) + " / " + Client.a(this.h) + " @yel@(" + (int)this.i + "%)";
    }

    public void b(boolean bl) {
        this.j = bl;
    }
}

