/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.dg
 */
package rs.n.c.b;

import gnu.trove.f.b.dg;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.a.d;
import rs.n.c;
import rs.n.e;

public class a
extends c {
    public static final dg<String> c = new dg();
    public static rs.n.d.c d;
    public static rs.n.d.c e;
    public static final String f = "<str=8683352>                                                                                                                                                    </str>";
    public static final String g = "                                                                                                                                                    </str>";
    public static String bI;
    public static int bJ;
    public static final int bK = 57016;

    public a(k_0[] k_0Array) {
        super(k_0Array);
    }

    public static void h() {
        c.clear();
    }

    public static void m(int n2) {
        switch (n2) {
            case 57000: {
                rs.n.c.b.a.l((int)57016).P = 454;
                rs.n.c.b.a.l((int)57016).aR = 193;
                rs.n.c.b.a.l((int)57016).bf = true;
                break;
            }
            case 56998: {
                rs.n.c.b.a.l((int)57016).P = 454;
                rs.n.c.b.a.l((int)57016).aR = 285;
                rs.n.c.b.a.l((int)57016).bf = true;
                break;
            }
            case 32600: {
                rs.n.c.b.a.l((int)57016).P = 480;
                rs.n.c.b.a.l((int)57016).aR = 280;
                rs.n.c.b.a.l((int)57016).bf = true;
                break;
            }
            case 32019: {
                rs.n.c.b.a.l((int)57016).P = 325;
                rs.n.c.b.a.l((int)57016).aR = rs.n.c.c.a.cf;
                boolean bl = rs.n.c.b.a.l((int)57016).bf = !rs.n.c.c.a.i().f();
            }
        }
        if ((n2 == 56998 || n2 == 57000) && bI != null) {
            int n3 = rs.n.c.b.a.l((int)57016).V;
            c.a((Object)bI, n3);
        }
    }

    @Override
    public void a() {
        int n2;
        e e2 = rs.n.c.b.a.d(57000);
        rs.n.c.b.a.h(57001, "event/task 1");
        rs.n.c.b.a.a(57002, "Gladiator's Vindication (World Event)", this.a, 2, 16750623, true);
        rs.n.c.b.a.a(57003, "Event duration ends in: @yel@<img=37> 14 days", this.a, 0, 16750623, true);
        rs.n.c.b.a.a(57004, 5, 0, 57005, 16, "fountain/sprite", 120, 34, "Select button");
        rs.n.c.b.a.a(57005, 15, "fountain/sprite", 120, 34, 57006);
        rs.n.c.b.a.a(57007, 5, 0, 57008, 16, "fountain/sprite", 120, 34, "Select button");
        rs.n.c.b.a.a(57008, 15, "fountain/sprite", 120, 34, 57009);
        rs.n.c.b.a.a(57010, 5, 0, 57011, 16, "fountain/sprite", 120, 34, "Select button");
        rs.n.c.b.a.a(57011, 15, "fountain/sprite", 120, 34, 57012);
        rs.n.c.b.a.a(57013, "Button 1", this.a, 1, 16750623, true);
        rs.n.c.b.a.a(57014, "Button 2", this.a, 1, 16750623, true);
        rs.n.c.b.a.a(57015, "Button 3", this.a, 1, 16750623, true);
        e = new rs.n.d.c(rs.n.a.d.a(57016));
        e e3 = H[57016];
        e3.aH = 1250;
        e3.P = 454;
        e3.aR = 193;
        e3.bj = 87;
        int n3 = 3;
        for (n2 = 57017; n2 <= 57217; n2 += 2) {
            rs.n.c.b.a.a(n2, "Test " + n2, "Select this option", this.a, 0, 16750623, false, true, 300);
            rs.n.c.b.a.c(n2 + 1, 14484, 32);
            rs.n.e.H[n2 + 1].bf = false;
            e.a(n2).a(35, n3 + 12);
            e.a(n2 + 1).a(0, n3);
            n3 += 30;
        }
        e.a();
        rs.n.c.b.a.a(57220, "Progress bar description", this.a, 0, 16750623, true);
        rs.n.c.b.a.a(57221, "0% (0/100)", this.a, 0, 0, true, false);
        rs.n.c.b.a.c(57222, 21, "event/task");
        rs.n.e.H[57222].E = new f_0("event/task 2", 92, 15);
        rs.n.c.b.a.a(57223, "drops/sprite", 3, 17, 17, "Go back", -1, 57224, 1);
        rs.n.c.b.a.a(57224, "drops/sprite", 4, 17, 17, 57225);
        rs.n.e.H[57223].bf = false;
        e2.k(20);
        n2 = 0;
        e2.b(n2++, 57001, 12, 7);
        e2.b(n2++, 57002, 262, 11);
        e2.b(n2++, 57003, 262, 28);
        e2.b(n2++, 57004, 41, 278);
        e2.b(n2++, 57005, 41, 278);
        e2.b(n2++, 57013, 100, 287);
        e2.b(n2++, 57007, 196, 278);
        e2.b(n2++, 57008, 196, 278);
        e2.b(n2++, 57014, 255, 287);
        e2.b(n2++, 57010, 351, 278);
        e2.b(n2++, 57011, 351, 278);
        e2.b(n2++, 57015, 410, 287);
        e2.b(n2++, 57016, 22, 43);
        e2.b(n2++, 57220, 256, 242);
        e2.b(n2++, 57222, 72, 255);
        e2.b(n2++, 57221, 256, 257);
        e2.b(n2++, 65418, 476, 15);
        e2.b(n2++, 65419, 476, 15);
        e2.b(n2++, 57223, 18, 15);
        e2.b(n2++, 57224, 18, 15);
        this.i();
    }

    public void i() {
        e e2 = rs.n.c.b.a.d(56998);
        d = new rs.n.d.c(e2);
        rs.n.c.b.a.h(56999, "event/task 3");
        e e3 = rs.n.c.b.a.d(56997);
        d.a(56999).a(12, 7);
        d.a(57002).a(262, 13);
        d.a(57016).a(22, 32);
        d.a(65418).a(476, 12);
        d.a(65419).a(476, 12);
        d.a(57223).a(18, 12);
        d.a(57224).a(18, 12);
        d.a();
    }

    static {
        bI = null;
        bJ = 0;
    }
}

