/*
 * Decompiled with CFR 0.152.
 */
package rs.q.a.a.a;

import java.util.Arrays;
import rs.n.e;
import rs.q.a.a.a;

public class f
extends a {
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;

    @Override
    public void a() {
        int n2;
        int n3 = this.e();
        int n4 = this.g();
        e e2 = rs.n.e.H[n4];
        if (n3 == 0 && e2.ay != null) {
            Arrays.fill(e2.ay, null);
        }
        if (n3 == 1) {
            n2 = this.c();
            String string = this.h();
            if (e2.ay != null && n2 < e2.ay.length) {
                e2.ay[n2] = string;
            }
        }
        if (n3 == 2) {
            String string = this.h();
            if (e2.ay != null) {
                Arrays.fill(e2.ay, string);
            }
        }
        if (n3 == 3) {
            int n5 = n2 = this.e() == 1 ? 1 : 0;
            if (n2 != 0) {
                e2.ay = new String[e2.az.length];
                Arrays.fill(e2.ay, null);
            } else {
                e2.ay = null;
            }
        }
        if (n3 == 4) {
            n2 = this.c();
            int n6 = this.c();
            e2.ac = n2;
            e2.ap = n6;
        }
    }
}

