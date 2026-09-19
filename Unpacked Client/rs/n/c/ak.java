/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class ak
extends c {
    public ak(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.ak.d(48999);
        rs.n.c.ak.c(48998, 5, "construction/sprite");
        String string = "LOGS/ICON";
        rs.n.c.ak.a(48002, string, 1, 16, 16, "Close Window", 0, 48003, 1);
        rs.n.c.ak.a(48003, string, 2, 16, 16, 48004);
        rs.n.c.ak.b(48997, 6, "construction/sprite", "Edgeville teleport");
        rs.n.c.ak.b(48996, 7, "construction/sprite", "Home teleport");
        rs.n.c.ak.b(48995, 8, "construction/sprite", "Bounty teleport");
        e2.k(6);
        e2.b(0, 48998, 0, 0);
        e2.b(1, 48002, 493, 9);
        e2.b(2, 48003, 493, 9);
        e2.b(3, 48997, 51, 52);
        e2.b(4, 48996, 133, 52);
        e2.b(5, 48995, 215, 52);
        e.H[48997].bf = false;
        e.H[48996].bf = false;
        e.H[48995].bf = false;
    }
}

