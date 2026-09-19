/*
 * Decompiled with CFR 0.152.
 */
package rs.q.a.a.a;

import java.util.ArrayList;
import rs.d.s;
import rs.q.a.a.a;

public class k
extends a {
    @Override
    public void a() {
        int n2;
        int n3 = this.e();
        if (n3 == 0) {
            n2 = this.c();
            int n4 = this.c();
            int n5 = this.e();
            int n6 = this.e();
            String string = n2 + "," + n4 + "," + n5;
            s.a.remove(string);
            this.c.a(n2, n4, -1, 0, 10, n5);
        }
        if (n3 == 1) {
            s.a a2 = new s.a();
            a2.a = this.g();
            a2.b = this.c();
            a2.c = this.c();
            a2.d = this.e();
            a2.f = this.e();
            a2.e = this.e();
            String string = a2.b + "," + a2.c + "," + a2.d;
            s.a.put(string, a2);
            this.c.a(a2.b, a2.c, a2.a, a2.e, a2.f, a2.d);
        }
        if (n3 == 2) {
            n2 = this.g();
            ArrayList<String> arrayList = new ArrayList<String>();
            for (String string : s.a.keySet()) {
                if (s.a.get((Object)string).a != n2) continue;
                arrayList.add(string);
                this.c.a(s.a.get((Object)string).b, s.a.get((Object)string).c, -1, 0, 10, s.a.get((Object)string).d);
            }
            for (String string : arrayList) {
                s.a.remove(string);
            }
        }
    }
}

