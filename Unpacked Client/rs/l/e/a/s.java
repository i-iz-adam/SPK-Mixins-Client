/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e.a;

import rs.Client;
import rs.f.a;
import rs.l.a.b;
import rs.l.c;
import rs.l.e.a;
import rs.l.e.f;
import rs.l.f_0;

public abstract class s
extends a {
    private static final int r = 40;
    private static final int s = 40;
    private static final int t = 4;
    private static final int u = 200;
    private static final int v = 100;
    private boolean w;
    private int x;
    private int y;
    private boolean z = true;
    private boolean A = false;
    private int B = 200;
    protected f_0 p;
    protected f_0 q;

    public abstract void f();

    public abstract int g();

    public abstract int h();

    public abstract String i();

    @Override
    public boolean a(Client client) {
        return this.w && Client.ed != 197;
    }

    @Override
    public void b(Client client, f.a a2) {
        if (a2 != f.a.a) {
            return;
        }
        ++rs.l.e.f.o;
        this.x = 465;
        this.y = 8;
        if (rs.f.a.ai == a.c.b) {
            this.x = Client.aj - 280;
        }
        int n2 = this.x + this.j();
        if (!rs.l.b.a.a()) {
            if (this.z) {
                this.B -= 4;
                if (this.B <= 100) {
                    this.z = false;
                }
            } else {
                this.B += 4;
                if (this.B >= 200) {
                    this.z = true;
                }
            }
        }
        rs.l.c.b(40, this.y, n2, this.g(), 40, this.B - 25);
        rs.l.c.b(34, this.y + 3, n2 + 3, this.h(), 34, this.B - 100);
        (this.k() ? this.q : this.p).g(n2 + 2, this.y + 1, this.B + 50);
        for (int i2 = 0; i2 < 2; ++i2) {
            int n3 = this.B - 50;
            rs.l.a.b.a.a(n2 - 4, this.y - 1 + i2 * 30, n3);
            rs.l.a.b.a.a(n2 + 31, this.y - 1 + i2 * 30, n3);
        }
        Client.fE[106].g(n2 + 21, this.y + 21, this.B - 25);
        if (this.k()) {
            client.b(Client.hP - 40 - 20, Client.hQ + 40 - 30, this.i());
        }
    }

    @Override
    public void c() {
        this.w = false;
    }

    @Override
    public boolean a(int n2) {
        if (!this.k()) {
            this.A = false;
            return false;
        }
        if (Client.cH == -1) {
            if (n2 == 0) {
                this.A = true;
            }
            if (n2 == 1 && this.A) {
                this.f();
                this.A = false;
            }
        } else {
            this.A = false;
        }
        return true;
    }

    private boolean k() {
        if (Client.cH != -1) {
            return false;
        }
        return Client.hP >= this.x + this.j() && Client.hP <= this.x + this.j() + 40 && Client.hQ >= this.y && Client.hQ <= this.y + 40;
    }

    protected int j() {
        return -(Math.max(rs.l.e.f.o - 1, 0) * 50);
    }

    public void a(boolean bl) {
        this.w = bl;
    }
}

