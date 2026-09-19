/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class an
extends c {
    public an(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.an.d(26700);
        rs.n.c.an.c(26701, 0, "misc/BAG");
        rs.n.c.an.a(26702, "misc/BAG", 1, 16, 16, "Close", 0, 26703, 1);
        rs.n.c.an.a(26703, "misc/BAG", 2, 16, 16, 26704);
        rs.n.c.an.a(26705, "Looting bag", this.a, 2, 0xFF9900, true, true);
        rs.n.c.an.b(26706, 4, 7, 13, 0);
        rs.n.c.an.H[26706].W = new String[]{"Deposit 1", "Deposit 5", "Deposit 10", "Deposit All"};
        rs.n.c.an.a(26707, "This bag is empty.", this.a, 1, 0xFF9900, true, true);
        rs.n.c.an.b(26708, 3, "misc/BAG", "Deposit all to bank");
        e2.k(7);
        e2.b(0, 26701, 9, 21);
        e2.b(1, 26702, 168, 4);
        e2.b(2, 26703, 168, 4);
        e2.b(3, 26705, 95, 4);
        e2.b(4, 26706, 12, 23);
        e2.b(5, 26707, 95, 113);
        e2.b(6, 26708, 10, 1);
    }
}

