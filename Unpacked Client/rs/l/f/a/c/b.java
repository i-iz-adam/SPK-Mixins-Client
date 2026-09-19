/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.l.f.a.c;

import javax.inject.Inject;
import rs.e.i;
import rs.l.f.a.c.a;
import rs.l.f.e;

public class b
extends rs.q.a.a.a {
    @Inject
    private i d;
    private a e;

    @Override
    public void a() {
        int n2;
        if (this.e == null || this.e.M()) {
            this.e = new a(this.d.a(rs.s.a.a.class));
            rs.l.f.e.d().a(this.e);
        }
        if ((n2 = this.e()) == 1) {
            this.e.L();
            this.e.k(this.e() == 1);
        } else if (n2 == 2) {
            this.e.s = this.g();
            this.e.t = this.g();
        } else if (n2 == 4) {
            int n3;
            int n4 = this.g();
            this.e.r = n4 == (n3 = this.g()) ? 100 : (n4 == 0 ? 0 : (int)((float)n4 / (float)n3 * 100.0f));
            this.e.u = n4 + " / " + n3 + " @yel@(" + this.e.r + "%)";
            this.e.v = n4 + " @yel@(" + this.e.r + "%)";
        } else if (n2 == 5) {
            this.e.w = this.h();
        } else if (n2 == 6) {
            int n5 = this.g();
            this.e.x = "<img=381>" + n5;
        } else if (n2 == 7) {
            String string;
            int n6;
            int n7 = this.g();
            this.e.r = n7 == (n6 = this.g()) ? 100 : (n7 == 0 ? 0 : (int)((float)n7 / (float)n6 * 100.0f));
            this.e.u = this.e.v = (string = this.h());
        }
    }
}

