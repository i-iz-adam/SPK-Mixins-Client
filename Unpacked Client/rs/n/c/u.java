/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class u
extends c {
    public u(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.u.d(42100);
        rs.n.c.u.h(35612, "bank/bank 30");
        rs.n.c.u.a(42101, true);
        rs.n.c.u.H[42101].W = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", null};
        rs.n.c.u.H[42101].K = new int[70];
        rs.n.c.u.H[42101].ax = new int[70];
        rs.n.c.u.H[42101].az = new int[70];
        rs.n.c.u.H[42101].as = new int[70];
        rs.n.c.u.H[42101].P = 7;
        rs.n.c.u.H[42101].aR = 10;
        rs.n.c.u.H[42101].ac = 32;
        rs.n.c.u.H[42101].ap = 16;
        e e3 = rs.n.c.u.d(42102);
        e3.al = new int[1];
        e3.am = new int[1];
        e3.bc = new int[1];
        e3.aH = 500;
        e3.P = 445;
        e3.aR = 244;
        e3.bj = 87;
        e3.k(1);
        e3.b(0, 42101, 5, 10);
        rs.n.c.u.a(42103, "<img=131> Coffer of Unclaimed Rewards & Prizes <img=131>", this.a, 2, 16751360, true, true);
        rs.n.c.u.a(42104, 5, 42105, 17, "bank/bank", 35, 25, "Deposit items to your inventory", 42106, 18, "bank/bank", 42107, "Empty your backpack into\nyour bank", 0, 20);
        rs.n.c.u.a(42108, 5, 42109, 31, "bank/bank", 31, 25, "Deposit items to your bank", 42110, 31, "bank/bank", 42111, "Empty your backpack into\nyour bank", 0, 20);
        rs.n.c.u.a(42112, "<img=9> This coffer usually holds contest prizes, event rewards, etc.", this.a, 1, 16751360, false, true);
        rs.n.c.u.a(42113, "(Especially if you were offline when you received them)", this.a, 0, 12171349, false, true);
        e2.k(11);
        e2.b(0, 35612, 13, 13);
        e2.b(1, 42102, 31, 38);
        e2.b(2, 65418, 476, 17);
        e2.b(3, 65419, 476, 17);
        e2.b(4, 42103, 258, 18);
        e2.b(5, 42104, 455, 284);
        e2.b(6, 42105, 455, 284);
        e2.b(7, 42108, 415, 284);
        e2.b(8, 42109, 415, 284);
        e2.b(9, 42112, 25, 283);
        e2.b(10, 42113, 25, 299);
    }
}

