/*
 * Decompiled with CFR 0.152.
 */
package rs.q.a.a.a;

import rs.n.c.ac;
import rs.n.d.b;
import rs.n.e;
import rs.q.a.a.a;

public class h
extends a {
    @Override
    public void a() {
        int n2 = this.e();
        switch (n2) {
            case 0: {
                ac.h();
                break;
            }
            case 1: {
                int n3 = this.e();
                ac.o(n3);
                break;
            }
            case 2: {
                ac.e(this.e() == 1);
                break;
            }
            case 3: {
                ac.a(this.e() == 1);
                break;
            }
            case 4: {
                int n4 = this.e();
                if (n4 == 0) {
                    ac.j();
                    break;
                }
                int n5 = this.g();
                int n6 = this.g();
                ac.e(n5, n6, n4 == 2 ? this.h() : "");
                break;
            }
            case 5: {
                String string = this.h();
                ac.c(string);
                break;
            }
            case 6: {
                e.l((int)36026).bg = this.e() == 1;
                break;
            }
            case 7: {
                ac.k();
                break;
            }
            case 8: {
                ac.f(this.e() == 1);
                break;
            }
            case 9: {
                e.l((int)36002).at = this.h();
                break;
            }
            case 10: {
                e.l((int)36003).at = this.h();
                break;
            }
            case 11: {
                e.l((int)36019).at = this.h();
                b b2 = ac.c.b(36019);
                int n7 = 293;
                if (e.l((int)36019).at.contains("\\n")) {
                    n7 = 288;
                }
                if (b2.g() == n7) break;
                b2.a(b2.f(), n7);
                ac.c.a();
                break;
            }
            case 12: {
                int n8 = this.e();
                for (int i2 = 0; i2 < 5; ++i2) {
                    ac.bR[i2] = i2 + 1 > n8 ? null : this.h();
                }
                break;
            }
            case 13: {
                ac.b(this.h());
                break;
            }
            case 14: {
                ac.m(this.e());
                break;
            }
            case 15: {
                ac.d(this.e() == 1);
                break;
            }
            case 16: {
                ac.i();
                break;
            }
            case 17: {
                e.l((int)36026).V = 0;
                break;
            }
            case 18: {
                ac.c(this.e() == 1);
                break;
            }
            case 19: {
                ac.g(this.e(), this.e());
                break;
            }
            case 20: {
                ac.bJ = this.e() == 1;
                break;
            }
            case 21: {
                ac.n(this.e());
                break;
            }
            case 22: {
                int n9 = this.c();
                int n10 = this.g();
                int n11 = this.g();
                ac.l((int)36025).az[n9] = n10 + 1;
                ac.l((int)36025).ax[n9] = n11;
                break;
            }
            case 23: {
                int n12 = this.e();
                for (int i3 = 0; i3 < 5; ++i3) {
                    ac.bS[i3] = i3 + 1 > n12 ? null : this.h();
                }
                ac.b(true);
                break;
            }
            case 24: {
                ac.bK = this.c();
                break;
            }
            case 25: {
                ac.bL = this.c();
            }
        }
    }
}

