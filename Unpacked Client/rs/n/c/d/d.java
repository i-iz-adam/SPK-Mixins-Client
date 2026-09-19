/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.d;

import rs.Client;
import rs.n.c.d.a;
import rs.n.c.d.b;
import rs.n.c.d.c;
import rs.n.e;

public class d
extends rs.q.a.a.a {
    private rs.l.f.a.g.a d = new rs.l.f.a.g.a();
    private rs.l.f.a.g.b e = new rs.l.f.a.g.b();
    private rs.l.f.b f = new rs.l.f.a.g.c();

    @Override
    public void a() {
        Object object;
        int n2;
        int n3 = this.e();
        if (n3 == 0) {
            n2 = this.e();
            rs.n.c.d.a.m(n2);
        }
        if (n3 == 1) {
            rs.n.c.d.c.a();
        }
        if (n3 == 2) {
            rs.n.c.d.c.a(this.e());
        }
        if (n3 == 3) {
            n2 = this.e();
            String string = this.h();
            object = this.h();
            rs.n.c.d.c.a(n2, string, (String)object);
        }
        if (n3 == 4) {
            rs.n.c.d.b.a();
        }
        if (n3 == 5) {
            rs.n.c.d.b.b();
        }
        if (n3 == 6) {
            n2 = this.e();
            rs.n.c.d.a.dD.a(n2);
        }
        if (n3 == 7) {
            n2 = this.e() == 1 ? 1 : 0;
            rs.n.e.l((int)19611).bf = n2;
            rs.n.e.l((int)32587).bf = n2;
        }
        if (n3 == 15) {
            n2 = this.e();
            this.b();
            if (n2 == 0) {
                this.b();
            } else if (n2 != 1 && n2 == 2) {
                rs.l.f.e.d().a(this.e);
                rs.l.f.e.d().a(this.f);
            }
        }
        if (n3 == 16) {
            // empty if block
        }
        if (n3 == 17) {
            this.e.c(this.g(), this.g());
            this.e.b(this.e() == 1);
        }
        if (n3 == 18) {
            n2 = this.e();
            if (n2 == 0) {
                rs.l.f.e.d().b(this.d);
            } else {
                this.d.k(false);
                this.d.c("0:00");
                if (n2 == 1) {
                    this.d.a(System.currentTimeMillis());
                } else if (n2 == 2) {
                    this.d.a(System.currentTimeMillis() + (long)this.g() * 1000L);
                }
                rs.l.f.e.d().a(this.d);
            }
        }
        if (n3 == 19) {
            n2 = this.g();
            this.d.b(Client.a(n2));
        }
        if (n3 == 20) {
            n2 = this.g();
            long l2 = (long)n2 * 1000L;
            int n4 = (int)(l2 / 1000L);
            int n5 = n4 % 3600 / 60;
            int n6 = n4 % 60;
            this.d.c("@gre@" + String.format("%d:%02d", n5, n6));
            this.d.k(true);
        }
        if (n3 == 21) {
            n2 = rs.n.c.d.a.dB ? 1 : 0;
            boolean bl = rs.n.c.d.a.dB = this.e() == 1;
            if (n2 != rs.n.c.d.a.dB) {
                rs.n.c.d.a.m(rs.n.c.d.a.dC);
            }
        }
        if (n3 == 22) {
            boolean bl;
            String string = "raids";
            boolean bl2 = bl = this.e() == 0;
            if (!bl) {
                string = this.h();
            }
            object = (rs.n.a.a.a)rs.n.e.l(32430);
            ((rs.n.a.a.a)object).i().get(1).a("Adept (Req. 10+ " + string + ")");
            ((rs.n.a.a.a)object).i().get(2).a("Expert (Req. 50+ " + string + ")");
            ((rs.n.a.a.a)object).i().get(3).a("Master (Req. 100+ " + string + ")");
        }
    }

    private void b() {
        if (this.e != null) {
            rs.l.f.e.d().b(this.e);
        }
        if (this.f != null) {
            rs.l.f.e.d().b(this.f);
        }
    }
}

