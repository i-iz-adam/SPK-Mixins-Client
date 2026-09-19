/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.Client;
import rs.l.f_0;

public class g {
    protected Client a;
    protected f_0 b;
    protected f_0 c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected boolean i;
    protected boolean j;

    public g(Client client, f_0 f_02, f_0 f_03, int n2, int n3, int n4) {
        this.a = client;
        this.b = f_02;
        this.c = f_03;
        this.e = n2;
        this.f = n3;
        this.g = n4;
    }

    public g(Client client, f_0 f_02, f_0 f_03, int n2, int n3) {
        this(client, f_02, f_03, n2, n3, 0);
    }

    public void a(int n2, int n3) {
        boolean bl = this.b(n2, n3);
        this.a(n2, n3, bl);
    }

    public boolean b(int n2, int n3) {
        if (Client.hP >= n2) {
            if (Client.hP <= n2 + this.b.n) {
                if (Client.hQ >= n3) {
                    if (Client.hQ <= n3 + this.b.o) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(int n2, int n3, boolean bl) {
        this.b.c(n2, n3);
        this.j = this.i = bl;
        if (this.g > 0 && this.h < this.g) {
            ++this.h;
        } else {
            this.h = 0;
            if (this.i) {
                if (this.j) {
                    if (this.d < this.e) {
                        this.d += this.f;
                    } else {
                        this.j = false;
                    }
                } else {
                    if (this.d > 0) {
                        this.d -= this.f;
                    }
                    if (this.d < 0) {
                        this.d = 0;
                    }
                }
            } else {
                if (this.d > 0) {
                    this.d -= this.f;
                }
                if (this.d < 0) {
                    this.d = 0;
                }
            }
        }
        this.c.g(n2, n3, this.d);
    }

    public boolean a() {
        return this.j;
    }

    public boolean b() {
        return this.i;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }
}

