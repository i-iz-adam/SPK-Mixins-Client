/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.aK
 */
public class ak_0
extends c {
    public ak_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = ak_0.d(29600);
        ak_0.h(29601, "raids/sprite 5");
        ak_0.a(29613, "Raiding party invitations", this.a, 2, 16750623);
        ak_0.a(29614, "Party invitations", this.a, 2, 16750623);
        e e3 = ak_0.d(29602);
        e3.P = 169;
        e3.aR = 208;
        e3.aH = 600;
        e3.k(10);
        ak_0.a(29603, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
        ak_0.a(29604, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
        ak_0.a(29605, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
        ak_0.a(29606, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
        ak_0.a(29607, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
        ak_0.a(29608, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
        ak_0.a(29609, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
        ak_0.a(29610, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
        ak_0.a(29611, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
        ak_0.a(29612, "", "Selected invitation", this.a, 0, 16750623, false, true, 150);
        for (int i2 = 0; i2 < 10; ++i2) {
            e3.b(i2, 29603 + i2, 5, 5 + i2 * 15);
        }
        e2.k(6);
        e2.b(0, 29601, 144, 19);
        e2.b(1, 29602, 177, 89);
        e2.b(2, 29614, 212, 60);
        e2.b(3, 29613, 181, 25);
        e2.b(4, 63740, 361, 25);
        e2.b(5, 63741, 361, 25);
    }
}

