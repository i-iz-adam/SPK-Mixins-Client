/*
 * Decompiled with CFR 0.152.
 */
package rs.l.d;

import rs.Client;
import rs.l.f_0;

public class b {
    private int a;
    private Client b;
    private String c;
    private String d;
    private f_0 e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;

    public b(Client client, f_0 f_02, String string, String string2, boolean bl) {
        this.b = client;
        this.e = f_02;
        this.c = string;
        this.d = string2;
        this.k = bl;
        this.a = bl ? 1 : 255;
        this.f = 225;
        this.g = 50;
        this.i = true;
        this.j = true;
    }

    public void a() {
        this.a = this.k ? 1 : 255;
        this.i = true;
    }

    public void b() {
        if (this.a > 0) {
            int n2 = 175;
            if (this.k && this.i) {
                if (this.a < n2) {
                    this.a += 2;
                } else {
                    this.i = false;
                }
            }
            if (this.b.gm != null) {
                if (this.k) {
                    this.e.g(this.f, this.g, this.a);
                } else {
                    this.e.c(this.f, this.g);
                }
                if (this.j) {
                    this.b.gm.d(this.c, this.f + 175, this.g + 20, 0xFFFFFF, 0, this.a);
                    this.b.gm.d(this.d, this.f + 175, this.g + 36, 0xFFFFFF, 0, this.a);
                } else {
                    this.b.gm.c(this.c, this.f + 15, this.g + 20, 0xFFFFFF, 0, this.a);
                    this.b.gm.c(this.d, this.f + 15, this.g + 36, 0xFFFFFF, 0, this.a);
                }
            }
        }
    }

    public boolean c() {
        return this.a > 0;
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    public void a(String string, String string2) {
        this.c = string;
        this.d = string2;
    }

    public void a(int n2) {
        this.f = n2;
    }

    public void b(int n2) {
        this.g = n2;
    }

    public void b(boolean bl) {
        this.j = bl;
    }

    public boolean d() {
        return this.j;
    }
}

