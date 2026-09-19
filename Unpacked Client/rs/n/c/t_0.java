/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.T
 */
public class t_0
extends c {
    public t_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        this.i();
        this.h();
    }

    private void h() {
        e e2 = t_0.d(41000);
        t_0.c(41001, 0, "factory/SPRITE");
        t_0.a(41002, 1, 0, 41004, 1, "factory/SPRITE", 46, 20, "Close Window");
        t_0.a(41004, 2, "factory/SPRITE", 46, 20, 41005);
        t_0.b(41006, 75, 50);
        t_0.a(41007, "/fountain/sprite", 16, 120, 34, "Toggle spawner", -1, 41008, 1);
        t_0.a(41008, "/fountain/sprite", 15, 120, 34, 41009);
        t_0.a(41010, "Monster Spawner", this.a, 2, 16751360, true, true);
        t_0.a(41011, "Monster Selections", this.a, 1, 12171349, true, true);
        t_0.a(41012, "This spawner will provide you with 5 spawns", this.a, 0, 12171349, true, true);
        t_0.a(41013, "before requiring you to re-activate it again.", this.a, 0, 12171349, true, true);
        t_0.a(41014, "", this.a, 0, 12171349, true, true);
        t_0.a(41016, "<img=57> Activate @gre@(x5)", this.a, 0, 16751360, true, true);
        t_0.a(41017, "Spawn distanced", this.a, 0, 16751360, true, true);
        t_0.a(41018, "Spawn x3", this.a, 0, 16751360, true, true);
        t_0.a(41019, "You have selected: @yel@NPC Name", this.a, 0, 16751360, true, true);
        int n2 = 14;
        e2.al = new int[n2];
        e2.am = new int[n2];
        e2.bc = new int[n2];
        int n3 = 7;
        int n4 = 30;
        e2.b(0, 41001, n3, n4);
        e2.b(1, 41002, 476 + n3, 8 + n4 - 2);
        e2.b(2, 41004, 476 + n3, 8 + n4 - 2);
        e2.b(3, 41006, n3 + 140, n4 + 80 + 23);
        int n5 = 58;
        e2.b(4, 41007, n3 + n5 + 56, n4 + 169 - 10 + 23);
        e2.b(5, 41008, n3 + n5 + 56, n4 + 169 - 10 + 23);
        e2.b(6, 41016, n3 + n5 + 49 + 66, n4 + 170 + 10 - 10 + 23);
        e2.b(7, 41010, n3 + 255, n4 + 7);
        e2.b(8, 41011, n3 + 414, n4 + 32);
        e2.b(9, 41012, n3 + n5 + 49 + 66, n4 + 168 + 10 - 10 + 53);
        e2.b(10, 41013, n3 + n5 + 49 + 66, n4 + 168 + 10 - 10 + 53 + 13);
        e2.b(11, 41014, n3 + n5 + 49 + 66, n4 + 168 + 10 - 10 + 53 + 13 + 13);
        e2.b(12, 41019, 172 + n3, 136 + n4 + 23);
        e2.b(13, 41020, 343 + n3 - 13, 29 + n4 + 21);
    }

    private void i() {
        int n2;
        e e2 = t_0.d(41020);
        e2.aH = 350;
        e2.P = 143;
        e2.aR = 211;
        e2.bj = 87;
        int n3 = 22;
        int n4 = 41021;
        for (n2 = 0; n2 < n3; ++n2) {
            t_0.a(n4 + n2, "NPC IDX @yel@" + n2 + " (" + (n4 + n2) + ")", "Spawn this NPC", this.a, 0, 16750623, false, false, 125);
        }
        n2 = 10;
        int n5 = 3;
        int n6 = 15;
        e2.al = new int[n3];
        e2.am = new int[n3];
        e2.bc = new int[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            e2.b(i2, n4 + i2, n2, n5 + n6 * i2);
        }
    }
}

