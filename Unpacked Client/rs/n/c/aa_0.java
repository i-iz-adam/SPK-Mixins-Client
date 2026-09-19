/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.aA
 */
public class aa_0
extends c {
    public aa_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        e e2 = aa_0.d(53500);
        int n3 = 18;
        int n4 = -5;
        int n5 = 3;
        int n6 = 160;
        int n7 = 6;
        e2.k(n3);
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = 53501 + i2;
            aa_0.a(n2, "Selecting this option Toggle " + (i2 + 1), "Select option", this.a, 0, 0, true, false, n6);
            e.H[n2].bo = true;
            e2.b(i2, n2, n4, n5);
            if ((n5 += 17) <= 17 * n7) continue;
            n5 = 3;
            n4 += n6;
        }
        e e3 = aa_0.d(53519);
        e3.k(n3);
        n4 = -5;
        n5 = 3;
        for (n2 = 0; n2 < n3; ++n2) {
            int n8 = 53501 + n2;
            aa_0.a(n8, "Selecting this option Toggle " + (n2 + 1), "Select option", this.a, 0, 0, true, false, n6);
            e.H[n8].bo = true;
            e3.b(n2, n8, n4, n5);
            if ((n4 += n6) < n6 * 2) continue;
            n5 += 17;
            n4 = -5;
        }
    }
}

