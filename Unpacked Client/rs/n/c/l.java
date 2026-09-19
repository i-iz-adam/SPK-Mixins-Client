/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class l
extends c {
    public l(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.l.d(54100);
        rs.n.c.l.h(54101, "skills/image 7");
        rs.n.c.l.a(54102, "Blood Slayer", this.a, 2, 16750623, true, true);
        rs.n.c.l.a(54103, "Choose a Task", this.a, 2, 16750623, true, true);
        rs.n.c.l.a(54104, "Easy task monsters", this.a, 2, 16750623, false, true);
        rs.n.c.l.c(54105, 1, "gambling/SPRITE");
        rs.n.c.l.c(54106, 1, "gambling/SPRITE");
        rs.n.c.l.c(54107, 1, "gambling/SPRITE");
        rs.n.c.l.c(54108, 1, "gambling/SPRITE");
        rs.n.c.l.a(54109, "<tab=20>Monster hunter @yel@(PvM)", "Select timed task", this.a, 0, 16750623, false, true, 150);
        rs.n.c.l.a(54110, "<tab=20>Boss hunter @yel@(PvM)", "Select boss hunter task", this.a, 0, 16750623, false, true, 150);
        rs.n.c.l.a(54111, "<tab=20>Bounty hunter @yel@(PK)", "Select man hunter task", this.a, 0, 16750623, false, true, 150);
        rs.n.c.l.a(54112, "<tab=20>Slaughter @yel@(PK)", "Select man slaughter task", this.a, 0, 16750623, false, true, 150);
        rs.n.c.l.a(54113, "skills/button", 1, 120, 41, "Get a blood slayer task", -1, 54114, 1);
        rs.n.c.l.a(54114, "skills/button", 2, 120, 41, 54115);
        rs.n.c.l.a(54116, "<img=24> Get a task", this.a, 1, 16751360, true, true);
        rs.n.c.l.a(54117, "<u=16776960>Reward points", this.a, 0, 16750623, true, true);
        rs.n.c.l.a(54118, "@yel@5 <col=FF9B00>Blood slayer points", this.a, 0, 16751360, true, true);
        rs.n.c.l.a(54119, "@yel@5 <col=FF9B00>Slayer points", this.a, 0, 16751360, true, true);
        rs.n.c.l.a(54120, "", this.a, 0, 16751360, true, true);
        int n2 = 170;
        e2.k(20);
        e2.b(0, 54101, 16 + n2, 42);
        e2.b(1, 54102, 106 + n2, 51);
        e2.b(2, 63740, 172 + n2, 50);
        e2.b(3, 63741, 170 + n2, 50);
        e2.b(4, 54103, 102 + n2, 82);
        e2.b(5, 54117, 106 + n2, 211);
        int n3 = 4;
        e2.b(6, 54105, 30 + n2, 110 + n3);
        e2.b(7, 54109, 29 + n2, 112 + n3);
        e2.b(8, 54106, 30 + n2, 130 + n3);
        e2.b(9, 54110, 29 + n2, 132 + n3);
        e2.b(10, 54107, 30 + n2, 150 + n3);
        e2.b(11, 54111, 29 + n2, 152 + n3);
        e2.b(12, 54108, 30 + n2, 170 + n3);
        e2.b(13, 54112, 29 + n2, 172 + n3);
        e2.b(14, 54113, 46 + n2, 263);
        e2.b(15, 54114, 46 + n2, 263);
        e2.b(16, 54116, 102 + n2, 275);
        e2.b(17, 54118, 106 + n2, 227);
        e2.b(18, 54119, 106 + n2, 240);
        e2.b(19, 54120, 106 + n2, 253);
        int n4 = 0;
        while (n4 < e2.al.length) {
            int n5 = n4++;
            e2.bc[n5] = e2.bc[n5] - 15;
        }
    }
}

