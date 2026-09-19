/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b.a.a;

import java.util.Iterator;
import rs.d.k;
import rs.l.b.a.a.a;
import rs.l.b.a.d;
import rs.l.f_0;

public class b
extends a {
    protected int t;

    public b(int n2) {
        this.t = n2;
    }

    @Override
    protected void b() {
    }

    @Override
    protected void c() {
        int n2 = 15;
        int n3 = 15;
        int n4 = 32;
        int n5 = n4 + 10;
        int n6 = n4 + 10;
        f_0 f_02 = rs.d.k.a(391, 1, 0, n4);
        f_0 f_03 = rs.d.k.a(this.t, 1, 0, 32);
        if (f_02 == null || f_03 == null) {
            return;
        }
        f_02.f(n2, n3);
        f_02.f(n2 + n5, n3);
        f_02.f(n2 + n5 + n5, n3);
        f_02.f(n2, n3 + n6);
        f_03.f(n2 + n5, n3 + n6);
        f_02.f(n2 + n5 + n5, n3 + n6);
        f_02.f(n2, n3 + n6 + n6);
        f_02.f(n2 + n5, n3 + n6 + n6);
        f_02.f(n2 + n5 + n5, n3 + n6 + n6);
        n2 = 10;
        n3 = rs.l.b.a.d.b.f.B().getHeight() - 65;
        Object object = "[ ";
        int n7 = 0;
        Iterator iterator = this.q.keySet().iterator();
        while (iterator.hasNext()) {
            int n8 = (Integer)iterator.next();
            if (n7 == this.r) {
                object = (String)object + "<u=0>";
            }
            object = this.k().contains(n8) ? (String)object + "@gre@" + n8 : (this.p.containsKey(n8) ? (String)object + "@whi@" + n8 : (String)object + "@red@" + n8);
            if (n7 == this.r) {
                object = (String)object + "</u>";
            }
            object = (String)object + " ";
            ++n7;
        }
        object = (String)object + "@whi@]";
        rs.l.b.a.d.b.f.gm.a((String)object, n2, n3, 0xFFFFFF, 0, false);
    }

    public int n() {
        return this.t;
    }

    public void g(int n2) {
        this.t = n2;
    }
}

