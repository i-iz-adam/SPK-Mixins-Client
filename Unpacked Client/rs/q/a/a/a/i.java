/*
 * Decompiled with CFR 0.152.
 */
package rs.q.a.a.a;

import java.util.HashSet;
import rs.d.d;
import rs.q.a.a.a;

public class i
extends a {
    public static HashSet<Integer> d = new HashSet();

    @Override
    public void a() {
        int n2;
        int n3;
        int n4 = this.e();
        if (n4 == 0) {
            n3 = this.e() == 0 ? 1 : 0;
            n2 = this.g();
            if (n3 != 0) {
                d.add(n2);
            } else {
                d.remove(n2);
            }
        }
        if (n4 == 1) {
            n3 = this.g();
            n2 = (byte)this.e();
            if (n2 <= 0) {
                rs.d.d.c((int)n3).P = 0;
                rs.d.d.c((int)n3).Q = -1;
                rs.d.d.c((int)n3).R = -1;
            } else {
                rs.d.d.c((int)n3).P = (byte)n2;
            }
        }
        if (n4 == 2) {
            n3 = this.g();
            n2 = this.g();
            int n5 = this.g();
            rs.d.d.c((int)n3).P = (byte)-1;
            rs.d.d.c((int)n3).Q = n2;
            rs.d.d.c((int)n3).R = n5;
        }
    }
}

