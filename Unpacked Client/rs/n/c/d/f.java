/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.d;

import rs.Client;
import rs.l.f.a.f.a;
import rs.l.f.a.f.b;
import rs.l.f.b.d;
import rs.l.f.e;
import rs.l.f_0;

public class f
extends d {
    private f_0 h;
    private int i = 0;
    private String j = "0/1";
    private int k = 0;
    private long l = 0L;

    @Override
    public void a() {
        if (this.h == null) {
            this.h = new f_0("raids/affbar2");
        }
        if (this.i == 0) {
            Client.gl.b(this.j, this.e - 42, this.f + this.h.o / 2 - 20, 0xFFFFFF, 0);
            return;
        }
        if (this.i < 5) {
            this.k = 2;
        }
        this.h.r = (int)((double)this.h.n * ((double)this.i / 5.0));
        this.h.a(this.e, this.f, this.h.r, this.h.o);
        if (System.currentTimeMillis() - this.l > 25L) {
            if (this.k() && --this.k >= 0) {
                for (int i2 = 0; i2 <= 4; ++i2) {
                    int n2 = i2 * 24;
                    rs.l.f.e.d().g().b(3, this.e + n2, this.f + this.h.o / 2, 0xFF32FF);
                }
            }
            this.l();
            this.l = System.currentTimeMillis();
        }
        Client.gl.b(this.j, this.e - 42, this.f + this.h.o / 2 - 20, 0xFFFFFF, 0);
    }

    public boolean k() {
        return this.i >= 5;
    }

    public void a(int n2) {
        this.i = n2;
        switch (this.i) {
            case 0: {
                this.j = "@whi@" + this.i + "/5";
                break;
            }
            case 1: {
                this.j = "@yel@" + this.i + "/5";
                break;
            }
            case 2: {
                this.j = "@or2@" + this.i + "/5";
                break;
            }
            case 3: {
                this.j = "@or3@" + this.i + "/5";
                break;
            }
            case 4: {
                this.j = "@red@" + this.i + "/5";
                break;
            }
            case 5: {
                this.j = "<col=FF00FF><shad=pu2>" + this.i + "/5";
            }
        }
    }

    private void l() {
        if (this.i <= 1 && Client.d(3) == 0) {
            return;
        }
        int n2 = Math.min(this.i - 1, 4);
        n2 = Math.max(n2, 1);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            int n4 = Client.c(this.e, this.e + this.h.r);
            int n5 = Client.c(this.f, this.f + this.h.o);
            int n6 = 16724509;
            int n7 = n3 = this.k() ? 3 : 7;
            if (this.i == 4) {
                n3 = 5;
            }
            if (this.i >= 3 && Client.d(n3) == 0) {
                n6 = 0xFF32FF;
            }
            a a2 = this.b(n4, n5, n6);
            if (this.i < 3) {
                a2.b(-0.075);
            } else {
                a2.b(i2 % 2 == 0 ? -0.075 : 0.075);
            }
            rs.l.f.e.d().g().a(a2);
        }
    }

    private a b(int n2, int n3, int n4) {
        a a2 = new a(n2, n3, n4);
        a2.a(rs.l.f.a.f.b.a);
        a2.a((double)(1 + Client.d(25)));
        a2.b(3, 3);
        a2.e(1);
        a2.b(250L + 100L * (long)Client.d(3));
        return a2;
    }
}

