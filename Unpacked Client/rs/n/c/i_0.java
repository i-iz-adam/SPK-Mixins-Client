/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.I
 */
public class i_0
extends c {
    public i_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = H[1644];
        i_0.c(15101, 0, "equipment/bl");
        i_0.c(15102, 1, "equipment/bl");
        i_0.c(15109, 2, "equipment/bl");
        i_0.g(15103);
        i_0.g(15104);
        e2.al[23] = 15101;
        e2.am[23] = 40;
        e2.bc[23] = 205;
        e2.al[24] = 15102;
        e2.am[24] = 110;
        e2.bc[24] = 205;
        e2.al[25] = 15109;
        e2.am[25] = 39;
        e2.bc[25] = 240;
        e2.al[26] = 27650;
        e2.am[26] = 0;
        e2.bc[26] = 0;
        e2 = i_0.d(27650);
        i_0.a(27653, 1, "equipment/BOX", "Show Equipment Stats", 27655, 1, 40, 39);
        i_0.f(27655, "Show Equipment Stats");
        i_0.a(27654, 2, "equipment/BOX", "Show Items Kept on Death", 27657, 1, 40, 39);
        i_0.f(27657, "Show Items Kept on Death");
        i_0.h(27700, "equipment/outline");
        i_0.a(27701, false);
        i_0.H[27701].W = new String[]{"Remove", null, null, null, null};
        i_0.H[27701].ac = 11;
        i_0.a(6, e2);
        i_0.b(27700, 78, 207, 0, e2);
        i_0.b(27701, 80, 209, 1, e2);
        i_0.b(27653, 29, 205, 2, e2);
        i_0.b(27654, 124, 205, 3, e2);
        i_0.b(27655, 39, 240, 4, e2);
        i_0.b(27657, 39, 220, 5, e2);
    }
}

