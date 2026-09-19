/*
 * Decompiled with CFR 0.152.
 */
package rs.q.a.a.a;

import rs.l.e.a.o;
import rs.q.a.a.a;

public class d
extends a {
    @Override
    public void a() {
        int n2;
        int n3 = this.e();
        if (n3 == 1) {
            n2 = this.e();
            while (n2 != 0) {
                if (n2 == 1) {
                    int n4 = this.c();
                    o.q = "<img=233> Players in lobby: @or1@" + n4;
                    o.r = o.p + " @whi@" + o.q;
                } else if (n2 == 2) {
                    String string = this.h();
                    o.p = "<img=37> Starting in: @or1@" + string;
                    o.r = o.p + " @whi@" + o.q;
                } else if (n2 == 3) {
                    int n5 = this.e();
                    o.p = "<img=73> Waiting for @or1@" + n5 + "+@whi@ players..";
                    o.r = o.p + " @whi@" + o.q;
                } else if (n2 == 4) {
                    o.r = "<img=24> Starting a match, please wait..";
                } else if (n2 == 5) {
                    String string = this.h();
                    o.s = string.toString();
                }
                n2 = this.e();
            }
        }
        if (n3 == 2) {
            n2 = this.e();
            while (n2 != 0) {
                if (n2 == 1) {
                    int n6 = this.e();
                    o.t = "Survivors: @yel@" + n6;
                }
                if (n2 == 2) {
                    int n7 = this.e();
                    o.u = "Kills: @yel@" + n7;
                }
                if (n2 >= 3 && n2 <= 5) {
                    o.A = true;
                }
                if (n2 == 3) {
                    long l2 = this.c();
                    o.x = l2 > 0L ? System.currentTimeMillis() + l2 * 1000L : 0L;
                }
                if (n2 == 4) {
                    long l3 = this.c();
                    o.y = l3 > 0L ? System.currentTimeMillis() + l3 * 1000L : 0L;
                }
                if (n2 == 5) {
                    o.C = this.e();
                    long l4 = this.c();
                    if (l4 > 0L) {
                        o.z = System.currentTimeMillis() + l4 * 1000L;
                        o.F = o.C;
                    } else {
                        if (o.C == 1) {
                            o.C = 2;
                        }
                        o.z = 0L;
                    }
                }
                if (n2 == 6) {
                    o.A = false;
                }
                if (n2 == 7) {
                    o.J = "<img=128> Match style: @cya@" + this.h() + " <img=128>";
                }
                if (n2 == 8) {
                    o.B = this.e() == 1;
                }
                n2 = this.e();
            }
        }
    }
}

