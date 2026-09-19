/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e.a;

import rs.Client;
import rs.f.a;
import rs.l.c;
import rs.l.e.a.n;
import rs.l.e.f;
import rs.q.a.a.a;

public class m
extends f {
    public static final int p = 54484;
    public static final int q = 9765;
    public static final int r = 13960709;
    public static final int s = 30976;
    public static final int t = 13960709;
    public static final int u = 30976;
    public int v = 500;
    public int w = 500;
    public int x = 18;
    public int y = 0;
    public int z = 13960709;
    public int A = 30976;
    public String B;
    public String C;
    public String D;
    public boolean E;
    public static a F = new n();

    @Override
    public void b() {
        this.z = 13960709;
        this.A = 30976;
        this.w = 0;
        this.y = 0;
        this.B = "100%";
        this.C = "";
    }

    @Override
    public boolean a(Client client) {
        return this.E;
    }

    @Override
    public void b(Client client, f.a a2) {
        if (Client.cH != -1 || a2 != f.a.b) {
            return;
        }
        int n2 = 220;
        int n3 = 40;
        int n4 = 150;
        int n5 = 10;
        if (rs.f.a.ai == a.c.b) {
            n4 = Client.aj / 2 - n2 / 2;
            n5 = 23;
        }
        n5 -= 4;
        if (!client.ai()) {
            n4 += 4;
            n5 += 4;
        }
        double d2 = (double)this.y / 100.0;
        rs.l.c.b(n3, n5, n4, 5129018, n2, 255);
        rs.l.c.d(n4, n2, n3, 5918522, n5);
        int n6 = 1;
        rs.l.c.d(n4 - n6, n2 + n6 * 2, n3 + n6 * 2, 2367511, n5 - n6);
        Client.gl.c(this.C, n4 + (n2 + 4) / 2, n5 + 14, 16750623, 0);
        Client.gl.a(this.D, n4 + n2 - 3, n5 + 14, 3135999, 0);
        n3 = 20;
        int n7 = (int)Math.ceil((double)(n2 -= 6) * d2);
        rs.l.c.b(n3, n5 += 18, n4 += 2, 0, n2 + 2, 255);
        rs.l.c.b(n3 - 2, n5 + 1, n4 + 1, this.A, n2, 255);
        rs.l.c.b(n3 - 2, n5 + 1, n4 + 1, this.z, n7, 255);
        Client.gl.c(this.B, n4 + (n2 + 6) / 2, n5 + 15, 0xFFFFFF, 0);
    }

    @Override
    public void c() {
        this.E = false;
    }

    public void a(boolean bl) {
        this.E = bl;
    }
}

