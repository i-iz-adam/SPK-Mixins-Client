/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class ad
extends c {
    public ad(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.ad.d(45900);
        rs.n.c.ad.h(45901, "popups/repair");
        rs.n.c.ad.a(45902, "Item repairing coffer", this.a, 2, 16751360, true, true);
        rs.n.c.ad.a(45903, "Gold stored: @yel@0 gp", this.a, 1, 16751360, false, true);
        rs.n.c.ad.a(45904, "teleport/SPRITE", 10, 100, 32, "Store gold", -1, 45905, 1);
        rs.n.c.ad.a(45905, "teleport/SPRITE", 11, 100, 32, 45906);
        rs.n.c.ad.a(45907, "Deposit", this.a, 0, 16751360, true, true);
        rs.n.c.ad.a(45908, "teleport/SPRITE", 10, 100, 32, "Withdraw gold", -1, 45909, 1);
        rs.n.c.ad.a(45909, "teleport/SPRITE", 11, 100, 32, 45910);
        rs.n.c.ad.a(45911, "Withdraw", this.a, 0, 16751360, true, true);
        rs.n.c.ad.c(45912, 1, "gambling/SPRITE");
        rs.n.c.ad.a(45913, "Auto-repair (gold)", "Toggle gold auto repair", this.a, 0, 16750623, false, true, 150);
        rs.n.c.ad.a(45914, "Blood shards stored: @yel@0", this.a, 1, 16751360, false, true);
        rs.n.c.ad.a(45915, "teleport/SPRITE", 10, 100, 32, "Store shards", -1, 45916, 1);
        rs.n.c.ad.a(45916, "teleport/SPRITE", 11, 100, 32, 45917);
        rs.n.c.ad.a(45918, "Deposit", this.a, 0, 16751360, true, true);
        rs.n.c.ad.a(45919, "teleport/SPRITE", 10, 100, 32, "Withdraw shards", -1, 45920, 1);
        rs.n.c.ad.a(45920, "teleport/SPRITE", 11, 100, 32, 45921);
        rs.n.c.ad.a(45922, "Withdraw", this.a, 0, 16751360, true, true);
        rs.n.c.ad.c(45923, 1, "gambling/SPRITE");
        rs.n.c.ad.a(45924, "Auto-repair (shard)", "Toggle shard auto repair", this.a, 0, 16750623, false, true, 150);
        rs.n.c.ad.a(45925, "Repair scrolls stored: @yel@0", this.a, 1, 16751360, false, true);
        rs.n.c.ad.a(45926, "teleport/SPRITE", 10, 100, 32, "Store shards", -1, 45927, 1);
        rs.n.c.ad.a(45927, "teleport/SPRITE", 11, 100, 32, 45928);
        rs.n.c.ad.a(45929, "Deposit", this.a, 0, 16751360, true, true);
        rs.n.c.ad.a(45930, "teleport/SPRITE", 10, 100, 32, "Withdraw shards", -1, 45931, 1);
        rs.n.c.ad.a(45931, "teleport/SPRITE", 11, 100, 32, 45932);
        rs.n.c.ad.a(45933, "Withdraw", this.a, 0, 16751360, true, true);
        rs.n.c.ad.a(45934, "@yel@Scrolls will auto-repair\\n@yel@over shards and coins!", this.a, 0, 16751360, true, true);
        e2.k(30);
        e2.b(0, 45901, 86, 89);
        e2.b(1, 63740, 412, 99);
        e2.b(2, 63741, 412, 99);
        e2.b(3, 45902, 269, 99);
        e2.b(4, 45903, 97, 129);
        e2.b(5, 45904, 95, 148);
        e2.b(6, 45905, 95, 148);
        e2.b(7, 45907, 143, 158);
        e2.b(8, 45908, 200, 148);
        e2.b(9, 45909, 200, 148);
        e2.b(10, 45911, 248, 158);
        e2.b(11, 45912, 305, 157);
        e2.b(12, 45913, 323, 160);
        int n2 = 65;
        e2.b(13, 45914, 97, 129 + n2);
        e2.b(14, 45915, 95, 148 + n2);
        e2.b(15, 45916, 95, 148 + n2);
        e2.b(16, 45918, 143, 158 + n2);
        e2.b(17, 45919, 200, 148 + n2);
        e2.b(18, 45920, 200, 148 + n2);
        e2.b(19, 45922, 248, 158 + n2);
        e2.b(20, 45923, 305, 157 + n2);
        e2.b(21, 45924, 323, 160 + n2);
        int n3 = 130;
        e2.b(22, 45925, 97, 129 + n3);
        e2.b(23, 45926, 95, 148 + n3);
        e2.b(24, 45927, 95, 148 + n3);
        e2.b(25, 45929, 143, 158 + n3);
        e2.b(26, 45930, 200, 148 + n3);
        e2.b(27, 45931, 200, 148 + n3);
        e2.b(28, 45933, 248, 158 + n3);
        e2.b(29, 45934, 365, 154 + n3);
        int n4 = 0;
        while (n4 < 30) {
            int n5 = n4++;
            e2.bc[n5] = e2.bc[n5] - 45;
        }
    }
}

