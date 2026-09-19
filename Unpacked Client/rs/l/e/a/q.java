/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e.a;

import rs.Client;
import rs.l.e.a;
import rs.l.e.f;
import rs.n.e;

public class q
extends a {
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;

    @Override
    public void b() {
    }

    @Override
    public boolean a(Client client) {
        return this.p;
    }

    @Override
    public void b(Client client, f.a a2) {
        int n2 = (rs.l.b.a.b() ? 765 : Client.aj) / 2;
        int n3 = (rs.l.b.a.b() ? 503 : Client.ak) - 4;
        int n4 = this.u + (rs.l.b.a.b() ? 5 : 0);
        Client.gl.c("@gre@X: " + this.t + "   @cya@Y: " + n4 + "        @yel@Hovered: " + client.ef + "     @mag@(ID: " + this.q + " - Parent: " + this.r + ")", n2, n3, 16750623, 0);
    }

    @Override
    public boolean a(int n2) {
        return true;
    }

    @Override
    public void c() {
    }

    public boolean f() {
        return this.p;
    }

    public void a(boolean bl) {
        this.p = bl;
    }

    public void b(int n2) {
        if (Client.cH <= 0) {
            System.out.println("[ERROR] No opened interface to reference!");
            this.p = false;
            return;
        }
        this.r = 0;
        e e2 = rs.n.e.H[Client.cH];
        for (int i2 = 0; i2 < e2.al.length; ++i2) {
            e e3 = rs.n.e.H[e2.al[i2]];
            if (e3.al != null && e3.al.length > 0) {
                for (int i3 = 0; i3 < e3.al.length; ++i3) {
                    if (e3.al[i3] != n2) continue;
                    this.t = e3.am[i3];
                    this.u = e3.bc[i3];
                    this.r = e3.aw;
                    this.s = i3;
                    break;
                }
            }
            if (this.r != 0) break;
            if (e2.al[i2] != n2) continue;
            this.r = e2.aw;
            this.s = i2;
            this.t = e2.am[i2];
            this.u = e2.bc[i2];
            break;
        }
        if (this.r == 0) {
            this.p = false;
            System.out.println("[ERROR] Could not find child ID " + n2 + " in interface " + Client.cH + "!");
            return;
        }
        this.q = n2;
    }

    public int g() {
        return this.r;
    }

    public int h() {
        return this.s;
    }

    public int i() {
        return this.t;
    }

    public int j() {
        return this.u;
    }

    public void c(int n2) {
        this.t += n2;
    }

    public void d(int n2) {
        this.u += n2;
    }
}

