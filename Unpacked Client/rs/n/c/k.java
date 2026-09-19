/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class k
extends c {
    public k(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.k.d(18546);
        rs.n.c.k.c(60008, 11, "fountain/SPRITE");
        rs.n.c.k.a(60009, "@or1@Blood Shard Salvaging Kit", this.a, 0, 16751360, true, true);
        rs.n.c.k.a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        rs.n.c.k.a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        rs.n.c.k.a(60010, "Items you'll salvage into shards..", this.a, 0, 16751360, false, true);
        e e3 = rs.n.c.k.d(60011);
        e3.al = new int[1];
        e3.am = new int[1];
        e3.bc = new int[1];
        e3.aH = 250;
        e3.P = 175;
        e3.aR = 132;
        e3.bj = 87;
        rs.n.c.k.a(60012, true);
        rs.n.c.k.H[60012].W = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", "Remove X"};
        rs.n.c.k.H[60012].P = 4;
        rs.n.c.k.H[60012].ac = 11;
        rs.n.c.k.H[60012].ap = 10;
        e3.b(0, 60012, 11, 5);
        rs.n.c.k.a(60013, false);
        rs.n.c.k.H[60013].P = 4;
        rs.n.c.k.H[60013].ac = 11;
        rs.n.c.k.H[60013].ap = 10;
        rs.n.c.k.a(60014, "fountain/SPRITE", 4, 100, 32, "Salvage", -1, 60015, 1);
        rs.n.c.k.a(60015, "fountain/SPRITE", 5, 100, 32, 60016);
        rs.n.c.k.a(60017, "Salvage", this.a, 0, 16751360, true, true);
        rs.n.c.k.a(60018, "", this.a, 0, 16751360, false, true);
        rs.n.c.k.a(60019, "fountain/SPRITE", 12, 100, 20, "Read guide", -1, 60020, 1);
        rs.n.c.k.a(60020, "fountain/SPRITE", 13, 100, 20, 60021);
        rs.n.c.k.a(60022, "Item guide", this.a, 0, 16751360, true, true);
        e2.k(14);
        e2.b(0, 60008, 98, 64);
        e2.b(1, 60009, 261, 73);
        e2.b(2, 65418, 401, 71);
        e2.b(3, 65419, 401, 71);
        e2.b(4, 60010, 112, 100);
        e2.b(5, 60011, 105, 115);
        e2.b(6, 60013, 378, 151);
        e2.b(7, 60014, 307, 200);
        e2.b(8, 60015, 307, 200);
        e2.b(9, 60017, 357, 210);
        e2.b(10, 60018, 300, 133);
        int n2 = 10;
        e2.b(11, 60019, 319, 107 + n2);
        e2.b(12, 60020, 319, 107 + n2);
        e2.b(13, 60022, 357, 110 + n2);
    }
}

