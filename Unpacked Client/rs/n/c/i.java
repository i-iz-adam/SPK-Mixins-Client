/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class i
extends c {
    public i(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.i.d(3320);
        rs.n.c.i.c(60000, 10, "fountain/SPRITE");
        rs.n.c.i.a(60001, "@or1@The Blood Fountain", this.a, 1, 16751360, true, true);
        rs.n.c.i.a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        rs.n.c.i.a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        rs.n.c.i.a(60002, "<img=186> Blood perk tree (abilities)", "Select blood perk tree", this.a, 0, 16751360, false, true, 180);
        rs.n.c.i.a(60003, "<img=118> Blood pool store", "Select blood pool shop", this.a, 0, 16751360, false, true, 180);
        rs.n.c.i.a(60004, "<img=67> Blood diamond fuser", "Select diamond fusing", this.a, 0, 16751360, false, true, 180);
        rs.n.c.i.a(60005, "<img=117> Blood diamond store", "Select diamond shop", this.a, 0, 16751360, false, true, 180);
        rs.n.c.i.a(60006, "<img=68> Blood shard salvaging", "Select shard salvaging", this.a, 0, 16751360, false, true, 180);
        rs.n.c.i.a(60007, "<img=116> Blood shard store", "Select shard shop", this.a, 0, 16751360, false, true, 180);
        e2.k(10);
        e2.b(0, 60000, 140, 64);
        e2.b(1, 60001, 275, 73);
        e2.b(2, 65418, 373, 72);
        e2.b(3, 65419, 373, 72);
        e2.b(4, 60002, 197, 110);
        e2.b(5, 60003, 197, 128);
        e2.b(6, 60004, 197, 166);
        e2.b(7, 60005, 197, 184);
        e2.b(8, 60006, 197, 222);
        e2.b(9, 60007, 197, 240);
    }
}

