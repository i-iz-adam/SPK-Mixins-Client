/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e.a;

import rs.Client;
import rs.l.b.a.d;
import rs.l.e.a;
import rs.l.e.f;
import rs.l.e_0;

public class u
extends a {
    public static int p = 8;
    public static int q = 5;
    public boolean r = false;
    public int s;

    @Override
    public void b() {
    }

    @Override
    public void b(Client client, f.a a2) {
        if (a2 == f.a.a) {
            return;
        }
        if (this.s >= e_0.y.length) {
            return;
        }
        if (rs.l.b.a.d.d) {
            p = Client.ai / 64 - 2;
            q = Client.ah / 64 - 2;
        }
        int n2 = 1;
        int n3 = 1;
        int n4 = 0;
        for (int i2 = this.s; i2 < this.s + p * q && i2 < e_0.y.length; ++i2) {
            if (i2 >= 40) {
                try {
                    client.a(i2, 50L);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            e_0.y[i2].b(n2, n3);
            client.gn.c("@gre@ID " + i2, n2 + 32, n3 + 62, 0, 0);
            n2 += 65;
            if (++n4 < p) continue;
            n4 = 0;
            n2 = 0;
            n3 += 65;
        }
    }

    @Override
    public boolean a(int n2) {
        if (n2 == 1) {
            return true;
        }
        return n2 == 2;
    }

    @Override
    public boolean a(Client client) {
        return this.r;
    }

    @Override
    public void c() {
    }
}

