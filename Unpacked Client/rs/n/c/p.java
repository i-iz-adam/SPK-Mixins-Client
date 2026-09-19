/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class p
extends c {
    public p(k_0[] k_0Array) {
        super(k_0Array);
    }

    private void m(int n2) {
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Only me", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "General+", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Captain+", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Lieutenant+", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Sergeant+", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Corporal+", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Recruit+", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Any friends", 17256, 1, 150, 30);
    }

    private void n(int n2) {
        rs.n.c.p.a(n2++, 3, "clan/sprite", "General+", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Captain+", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Lieutenant+", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Sergeant+", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Corporal+", 17256, 1, 150, 30);
        rs.n.c.p.a(n2++, 3, "clan/sprite", "Recruit+", 17256, 1, 150, 30);
    }

    @Override
    public void a() {
        int n2;
        int n3;
        int n4;
        int n5;
        e e2 = rs.n.c.p.j(25744);
        rs.n.c.p.c(17251, 1, "clan/sprite");
        rs.n.c.p.a(17252, "clan/sprite", 2, 150, 30, "Set name", -1, 17253, 1);
        rs.n.c.p.a(17253, "clan/sprite", 3, 150, 30, 17254);
        rs.n.c.p.a(17255, "clan/sprite", 2, 150, 30, "Anyone", -1, 17256, 1);
        rs.n.c.p.a(17256, "clan/sprite", 3, 150, 30, 65359);
        this.m(65359);
        rs.n.c.p.a(17258, "clan/sprite", 2, 150, 30, "Anyone", -1, 17259, 1);
        rs.n.c.p.a(17259, "clan/sprite", 3, 150, 30, 17260);
        this.m(65367);
        rs.n.c.p.a(17261, "clan/sprite", 2, 150, 30, "Only me", -1, 17262, 1);
        rs.n.c.p.a(17262, "clan/sprite", 3, 150, 30, 17263);
        this.n(65375);
        rs.n.c.p.a(17264, "clan/sprite", 2, 150, 30, "Only me", -1, 17265, 1);
        rs.n.c.p.a(17265, "clan/sprite", 3, 150, 30, 17266);
        this.n(65380);
        rs.n.c.p.a(17267, "clan/close", 0, 50, 50, "Close", -1, 17268, 1);
        rs.n.c.p.a(17268, "clan/close", 1, 40, 50, 17269);
        rs.n.c.p.a(17800, "Clan name:", this.a, 0, 16750623, false, true);
        rs.n.c.p.a(17802, "Enter Name", this.a, 2, 0xFFFFFF, true, true);
        rs.n.c.p.a(17801, "Who can enter chat?", this.a, 0, 16750623, false, true);
        rs.n.c.p.a(17803, "Any friends", this.a, 2, 0xFFFFFF, true, true);
        rs.n.c.p.a(17812, "Who can talk on chat?", this.a, 0, 16750623, false, true);
        rs.n.c.p.a(17804, "Anyone", this.a, 2, 0xFFFFFF, true, true);
        rs.n.c.p.a(17813, "Who can kick/mute?", this.a, 0, 16750623, false, true);
        rs.n.c.p.a(17805, "Only me", this.a, 2, 0xFFFFFF, true, true);
        rs.n.c.p.a(17814, "Who can ban on chat?", this.a, 0, 16750623, false, true);
        rs.n.c.p.a(17806, "Only me", this.a, 2, 0xFFFFFF, true, true);
        rs.n.c.p.a(17807, "Right click on\\nwhite text to\\nchange options.", this.a, 2, 12171349, true, true);
        rs.n.c.p.c(54000, 1, "gambling/SPRITE");
        rs.n.c.p.a(54001, "Add co-owner privileges\\nto the General rank", "Select", this.a, 0, 12171349, true, true, 160);
        e2.k(52);
        int n6 = 0;
        for (n5 = 65359; n5 < 65367; ++n5) {
            e2.b(n6++, n5, 25, 87);
        }
        for (n5 = 65367; n5 < 65375; ++n5) {
            e2.b(n6++, n5, 25, 128);
        }
        for (n5 = 65375; n5 < 65380; ++n5) {
            e2.b(n6++, n5, 25, 168);
        }
        for (n5 = 65380; n5 < 65385; ++n5) {
            e2.b(n6++, n5, 25, 209);
        }
        e2.b(n6++, 17251, 15, 15);
        e2.b(n6++, 17252, 25, 47);
        e2.b(n6++, 17253, 25, 47);
        e2.b(n6++, 17255, 25, 87);
        e2.b(n6++, 17256, 25, 87);
        e2.b(n6++, 17258, 25, 128);
        e2.b(n6++, 17259, 25, 128);
        e2.b(n6++, 17261, 25, 168);
        e2.b(n6++, 17262, 25, 168);
        e2.b(n6++, 17264, 25, 209);
        e2.b(n6++, 17265, 25, 209);
        e2.b(n6++, 17800, 76, 51);
        e2.b(n6++, 17801, 52, 91);
        e2.b(n6++, 14000, 0, 94);
        e2.b(n6++, 17812, 48, 133);
        e2.b(n6++, 17813, 52, 172);
        e2.b(n6++, 17814, 48, 213);
        e2.b(n6++, 17267, 476, 23);
        e2.b(n6++, 17268, 476, 23);
        e2.b(n6++, 17802, 102, 63);
        e2.b(n6++, 17803, 102, 103);
        e2.b(n6++, 17804, 100, 144);
        e2.b(n6++, 17805, 101, 184);
        e2.b(n6++, 17806, 101, 225);
        e2.b(n6++, 54000, 28, 255);
        e2.b(n6++, 54001, 28, 252);
        e2 = rs.n.c.p.j(14000);
        e2.P = 474;
        e2.aR = 210;
        e2.aH = 3050;
        n5 = 402;
        for (n4 = 26024; n4 < 26024 + n5 / 2; ++n4) {
            rs.n.c.p.a(n4, "", this.a, 2, 0xFFFFFF, false, true);
        }
        for (n4 = 26024 + n5 / 2; n4 < 26024 + n5; ++n4) {
            rs.n.c.p.a(n4, "", this.a, 2, 0xFFFFFF, false, true);
        }
        n4 = 20201;
        int n7 = 14;
        boolean bl = false;
        for (n3 = 0; n3 < 201; ++n3) {
            rs.n.c.p.a(n4++, 3, "test/clan/sprite", "General" + (String)(bl ? " " + (n4 - 1) : ""), -1, 1, 150, n7 - 3);
            rs.n.c.p.a(n4++, 3, "test/clan/sprite", "Captain" + (String)(bl ? " " + (n4 - 1) : ""), -1, 1, 150, n7 - 3);
            rs.n.c.p.a(n4++, 3, "test/clan/sprite", "Lieutenant" + (String)(bl ? " " + (n4 - 1) : ""), -1, 1, 150, n7 - 3);
            rs.n.c.p.a(n4++, 3, "test/clan/sprite", "Sergeant" + (String)(bl ? " " + (n4 - 1) : ""), -1, 1, 150, n7 - 3);
            rs.n.c.p.a(n4++, 3, "test/clan/sprite", "Corporal" + (String)(bl ? " " + (n4 - 1) : ""), -1, 1, 150, n7 - 3);
            rs.n.c.p.a(n4++, 3, "test/clan/sprite", "Recruit" + (String)(bl ? " " + (n4 - 1) : ""), -1, 1, 150, n7 - 3);
            rs.n.c.p.a(n4++, 3, "test/clan/sprite", "Banned" + (String)(bl ? " " + (n4 - 1) : ""), -1, 1, 150, n7 - 3);
            rs.n.c.p.a(n4++, 3, "test/clan/sprite", "Not ranked" + (String)(bl ? " " + (n4 - 1) : ""), -1, 1, 150, n7 - 3);
        }
        e2.k(n5 + 1608);
        n3 = 0;
        int n8 = 0;
        for (n2 = 26024; n2 < 26024 + n5 / 2; ++n2) {
            e2.b(n3, n2, 200, n8);
            ++n3;
            n8 += 15;
        }
        n8 = 0;
        for (n2 = 26024 + n5 / 2; n2 < 26024 + n5; ++n2) {
            e2.b(n3, n2, 337, n8);
            ++n3;
            n8 += 15;
        }
        n8 = 0;
        n4 = 20201;
        for (n2 = 0; n2 < 201; ++n2) {
            for (int i2 = 0; i2 < 8; ++i2) {
                e2.b(n3, n4++, 337, n8);
                ++n3;
            }
            n8 += n7 + 1;
        }
    }
}

