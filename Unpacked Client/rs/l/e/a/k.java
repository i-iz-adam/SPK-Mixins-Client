/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e.a;

import rs.Client;
import rs.l.c;
import rs.l.e.a.l;
import rs.l.e.f;
import rs.q.a.a.a;

public class k
extends f {
    public static final a p = new l();
    private int q = 0;
    private int r = 0;
    private long s = 0L;

    @Override
    public void b() {
    }

    @Override
    public boolean a(Client client) {
        return this.r != 0;
    }

    @Override
    public void b(Client client, f.a a2) {
        long l2;
        long l3;
        if (a2 != f.a.b) {
            return;
        }
        if (this.r == 0) {
            return;
        }
        if (this.s == 0L) {
            this.s = System.currentTimeMillis();
        }
        if ((l3 = ((l2 = this.s + 1000L * (long)this.q) - this.s) / 100L) > 0L) {
            int n2 = client.ai() ? 0 : 4;
            int n3 = client.ai() ? 0 : 4;
            long l4 = (System.currentTimeMillis() - this.s) / l3;
            int n4 = (int)(l4 * 1L * 2L);
            if (this.r < 0) {
                n4 = 255 - n4;
            }
            if (n4 > 255) {
                n4 = 255;
                this.f();
            }
            if (n4 < 0) {
                n4 = 0;
                this.f();
            }
            rs.l.c.b(Client.ak, n3, n2, 0, Client.aj, n4);
        }
    }

    @Override
    public void c() {
        this.f();
    }

    public void a(int n2, int n3) {
        this.r = n2;
        this.q = n3;
        this.s = 0L;
    }

    public void f() {
        this.r = 0;
        this.s = 0L;
    }
}

