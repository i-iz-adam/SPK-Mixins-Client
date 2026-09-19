/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.H
 */
public class h_0
extends c {
    public h_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2;
        int n2;
        int n3;
        int n4;
        e e3 = h_0.j(15106);
        h_0.c(15107, 7, "equipment/CUSTOM");
        h_0.a(15210, "equipment/CUSTOM", 8, 21, 21, "Close", 250, 15211, 3);
        h_0.a(15211, "equipment/CUSTOM", 9, 21, 21, 15212);
        h_0.a(48087, "equipment/CUSTOM", 10, 21, 21, "View bonuses / unlocks", -1, 48088, 1);
        h_0.a(48088, "equipment/CUSTOM", 11, 21, 21, 48089);
        h_0.a(15111, "Equip Your Character...", this.a, 2, 14983494, false, true);
        h_0.a(15112, "Attack bonus", this.a, 2, 14983494, false, true);
        h_0.a(15113, "Defence bonus", this.a, 2, 14983494, false, true);
        h_0.a(15114, "Other bonuses", this.a, 2, 14983494, false, true);
        h_0.a(15115, "Drop rate bonus:", this.a, 1, 14983494, false, true);
        h_0.a(15116, "Blood money bonus:", this.a, 1, 14983494, false, true);
        h_0.a(15117, "Range strength:", this.a, 1, 14983494, false, true);
        h_0.a(15118, "Magic damage:", this.a, 1, 14983494, false, true);
        h_0.a(15119, "Risk value: ", this.a, 1, 14983494, false, true);
        for (n4 = 1675; n4 <= 1684; ++n4) {
            h_0.a(n4, this.a, 1);
        }
        h_0.a(1686, this.a, 1);
        h_0.a(1687, this.a, 1);
        h_0.h(15125);
        e3.k(51);
        e3.b(0, 15107, 4, 20);
        e3.b(1, 15210, 476, 29);
        e3.b(2, 15211, 476, 29);
        e3.c(3, 15111, -100, -100);
        n4 = 4;
        int n5 = 69;
        for (n3 = 1675; n3 <= 1679; ++n3) {
            e3.c(n4, n3, 20, n5);
            ++n4;
            n5 += 14;
        }
        e3.c(9, 1680, 20, 161);
        e3.c(10, 1681, 20, 177);
        e3.c(11, 1682, 20, 192);
        e3.c(12, 1683, 20, 207);
        e3.c(13, 1684, 20, 221);
        e3.c(14, 1686, 20, 262);
        e3.b(15, 15125, 170, 200);
        e3.c(16, 15112, 16, 55);
        e3.c(17, 1687, 20, 306);
        e3.c(18, 15113, 16, 147);
        e3.c(19, 15114, 16, 248);
        e3.b(20, 1645, 399, 97);
        e3.b(21, 1646, 399, 163);
        e3.b(22, 1647, 399, 163);
        e3.b(23, 1648, 399, 204);
        e3.b(24, 1649, 343, 176);
        e3.b(25, 1650, 343, 212);
        e3.b(26, 1651, 455, 176);
        e3.b(27, 1652, 455, 212);
        e3.b(28, 1653, 369, 139);
        e3.b(29, 1654, 428, 139);
        e3.b(30, 1655, 379, 100);
        e3.b(31, 1656, 433, 99);
        e3.b(32, 1657, 399, 62);
        e3.b(33, 1658, 358, 101);
        e3.b(34, 1659, 399, 101);
        e3.b(35, 1660, 440, 101);
        e3.b(36, 1661, 343, 140);
        e3.b(37, 1662, 399, 140);
        e3.b(38, 1663, 455, 140);
        e3.b(39, 1664, 399, 180);
        e3.b(40, 1665, 399, 220);
        e3.b(41, 1666, 343, 220);
        e3.b(42, 1667, 455, 220);
        e3.b(43, 1688, 345, 102);
        n3 = -3;
        e3.b(44, 15115, 343, 262);
        e3.b(45, 15116, 343, 277);
        e3.c(46, 15117, 20, 276);
        e3.c(47, 15118, 20, 291);
        e3.b(48, 15119, 343, 292);
        e3.b(49, 48087, 450, 29);
        e3.b(50, 48088, 450, 29);
        for (n2 = 1675; n2 <= 1684; ++n2) {
            e2 = H[n2];
            e2.ad = 14983494;
            e2.S = false;
        }
        for (n2 = 1686; n2 <= 1687; ++n2) {
            e2 = H[n2];
            e2.ad = 14983494;
            e2.S = false;
        }
    }
}

