/*
 * Decompiled with CFR 0.152.
 */
package rs.q.a.a.a;

import java.util.ArrayList;
import java.util.List;
import rs.n.a.a.c;
import rs.n.a.a.d;
import rs.n.e;
import rs.q.a.a.a;

public class b
extends a {
    @Override
    public void a() {
        Object object;
        int n2;
        int n3;
        int n4 = this.e();
        if (n4 == 0) {
            rs.n.a.a.c.b();
        }
        if (n4 == 1) {
            n3 = this.g();
            n2 = this.e();
            object = new ArrayList(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                boolean bl;
                String string = "Select";
                String string2 = this.h();
                boolean bl2 = bl = this.e() == 1;
                if (bl) {
                    string = this.h();
                }
                object.add(new d(string2, string));
            }
            rs.n.a.a.a a2 = (rs.n.a.a.a)e.l(n3);
            a2.a((List<d>)object);
            a2.at = ((d)object.get(0)).a();
        }
        if (n4 == 2) {
            n3 = this.g();
            n2 = this.e();
            object = (rs.n.a.a.a)e.l(n3);
            ((rs.n.a.a.a)object).at = ((rs.n.a.a.a)object).i().get(n2).a();
        }
    }
}

