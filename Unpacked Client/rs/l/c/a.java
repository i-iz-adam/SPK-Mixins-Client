/*
 * Decompiled with CFR 0.152.
 */
package rs.l.c;

import rs.Client;
import rs.d.k;
import rs.f.a;
import rs.l.c.c;
import rs.l.c.d;
import rs.l.f_0;
import rs.n.c.j;

public class a
extends d {
    private f_0 c;
    private c[] d = new c[3];
    private final int[][][] e = new int[][][]{new int[][]{{172, 116}, {328, 116}}, new int[][]{{114, 179}, {389, 179}}, new int[][]{{172, 242}, {328, 242}}};

    public a(Client client) {
        super(client);
    }

    @Override
    public void a() {
        if (Client.cH != j.c) {
            return;
        }
        if (this.c == null) {
            this.c = k.a(6643, 0, 0, 32);
        }
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            c c2 = this.d[i2];
            if (c2 == null) continue;
            if (c2.a() == null) {
                c2.a(k.a(c2.b(), 0, 0, 32));
            }
            if (c2.a() != null) {
                this.a(c2.a(), c2.d() == 1 ? 0 : c2.d(), this.e[i2][0][0], this.e[i2][0][1]);
            }
            this.a(this.c, c2.c(), this.e[i2][1][0], this.e[i2][1][1]);
        }
    }

    @Override
    public boolean b() {
        return false;
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.d[n2] = new c(n3, n5, n4);
    }

    private void a(f_0 f_02, int n2, int n3, int n4) {
        int n5 = rs.f.a.ai == a.c.a ? 0 : Client.ai / 2 - 356;
        int n6 = rs.f.a.ai == a.c.a ? 0 : Client.ah / 2 - 230;
        int n7 = 9;
        int n8 = 0;
        n7 += n6;
        n8 += n5;
        if (f_02 == null) {
            return;
        }
        f_02.f(n3 + n5, n4 + n6);
        if (n2 >= 1) {
            Client.gh.b(0xFFFF00, Client.g(n2), n4 + n7, n3 + n8);
        } else if (n2 >= 100000) {
            Client.gh.b(0xFFFFFF, Client.g(n2), n4 + n7, n3 + n8);
        } else if (n2 >= 10000000) {
            Client.gh.b(65408, Client.g(n2), n4 + n7, n3 + n8);
        }
    }
}

