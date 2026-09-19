/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.E
 */
public class e_0
extends c {
    public e_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = e_0.d(25754);
        e_0.h(25755, "popups/duel");
        e_0.c(25756, 1, "gambling/SPRITE");
        e_0.c(25757, 1, "gambling/SPRITE");
        e_0.c(25758, 1, "gambling/SPRITE");
        e_0.a(25759, "Standard duel", "Select", this.a, 0, 12171349, false, true, 160);
        e_0.a(25760, "Whip only", "Select", this.a, 0, 12171349, false, true, 160);
        e_0.a(25761, "Whip + dds only", "Select", this.a, 0, 12171349, false, true, 160);
        e_0.a(25762, "Select a duel type..", this.a, 2, 16751360, false, true);
        e_0.a(25763, "Invite", "Select", this.a, 0, 65280, false, true, 160);
        e_0.a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        e_0.a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        int n2 = 20;
        e2.k(11);
        e2.b(0, 25755, 171, 85);
        e2.b(1, 25762, 181, 96);
        e2.b(2, 25756, 184, 129);
        e2.b(3, 25759, 204, 131);
        e2.b(4, 25757, 184, 129 + n2);
        e2.b(5, 25760, 204, 131 + n2);
        e2.b(6, 25758, 184, 129 + n2 * 2);
        e2.b(7, 25761, 204, 131 + n2 * 2);
        e2.b(8, 25763, 252, 208);
        e2.b(9, 65418, 330, 95);
        e2.b(10, 65419, 330, 95);
    }
}

