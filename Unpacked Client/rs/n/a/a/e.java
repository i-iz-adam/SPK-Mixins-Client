/*
 * Decompiled with CFR 0.152.
 */
package rs.n.a.a;

import rs.Client;
import rs.l.c;
import rs.n.a.a.a;
import rs.n.a.f;

public class e
extends f {
    @Override
    public void f(int n2, int n3) {
        if (Client.cI <= 0) {
            return;
        }
        a a2 = (a)rs.n.e.l(Client.cI);
        if (a2 == null) {
            return;
        }
        n2 -= 3;
        n3 = n3 - this.ao.r / 4 - 3;
        int n4 = 20 - this.ao.r / 4;
        if (a2.k() == 1) {
            n3 += 3;
            n4 += 6;
        }
        boolean bl = this.aw % 2 != 0;
        int n5 = bl ? 4668980 : 3814187;
        c.a(n2 + 1, n3, 3 + a2.P - 2, n4 + 2, n5, 255);
        if (this.aw == 32432 + a2.h() - 1) {
            return;
        }
        c.a(n2 + 1, n3 + n4 + 1, 3 + a2.P - 2, 1, 3156516, 255);
    }

    public static e k(int n2, String string) {
        e e2 = new e();
        e.H[n2] = e2;
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 4;
        e2.M = 0;
        e2.P = 0;
        e2.aR = 11;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = -1;
        e2.S = false;
        e2.aS = true;
        e2.at = string;
        e2.Z = "";
        e2.O = 0;
        e2.L = 0;
        e2.ak = 0;
        e2.a();
        return e2;
    }
}

