/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class aa
extends c {
    public aa(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        k_0[] k_0Array = this.a;
        e e2 = rs.n.c.aa.j(638);
        e e3 = rs.n.c.aa.j(16025);
        rs.n.c.aa.a(640, "Achievement Diary", k_0Array, 0, 0xFFFFFF, true, true);
        rs.n.c.aa.a(663, "", k_0Array, 2, 0xFF9900, false, true);
        rs.n.c.aa.c(16018, 3, "gameframe/SPRITE");
        rs.n.c.aa.a(16019, 1, 0, 16020, 1, "gameframe/SPRITE", 142, 20, "Open achievements");
        rs.n.c.aa.a(16020, 2, "gameframe/SPRITE", 142, 20, 16021);
        rs.n.c.aa.c(16022, 4, "gameframe/SPRITE");
        rs.n.c.aa.a(16023, "", k_0Array, 0, 15439903, false, true);
        rs.n.c.aa.c(16024, 6, "gameframe/SPRITE");
        rs.n.c.aa.a(39868, "Monster drop tables", k_0Array, 0, 0xFFFFFF, true, true);
        rs.n.c.aa.c(39869, 1337, "gameframe/SPRITE");
        rs.n.c.aa.a(39870, 1, 0, 39871, 1, "gameframe/SPRITE", 142, 20, "Open monster drop tables");
        rs.n.c.aa.a(39871, 2, "gameframe/SPRITE", 142, 20, 39872);
        rs.n.c.aa.a(62150, "Hotspot: @or2@N/A", k_0Array, 0, 16750623, true, true);
        rs.n.c.aa.a(62151, "@yel@N/A", k_0Array, 0, 16750623, true, true);
        rs.n.c.aa.a(62152, false);
        rs.n.c.aa.H[62152].P = 4;
        rs.n.c.aa.H[62152].ac = 11;
        int n3 = 24;
        int n4 = 0;
        e2.k(6);
        e2.b(0, 16024, 0, 31 + n3 + n4);
        e2.b(1, 16025, 6, 30 + n3 + n4);
        e2.b(2, 16022, 0, 28 + n3 + n4);
        e2.b(3, 16022, 0, 255 + n4);
        e2.b(4, 16023, 4, 251 + n4);
        e2.b(5, 32000, 0, 0);
        n4 = 24;
        for (n2 = 16026; n2 <= 16125; ++n2) {
            rs.n.c.aa.a(n2, "", "Select", this.a, 0, 0xFFFFFF, false, false, 125);
        }
        e3.k(101);
        e3.b(0, 663, 4, 6);
        n2 = 1;
        for (int i2 = 16026; n2 <= 100 && i2 <= 16125; ++n2, ++i2) {
            if (n2 == 1) {
                e3.b(n2, i2, 6, 6);
                continue;
            }
            e3.b(n2, i2, 6, e3.bc[n2 - 1] + 13);
        }
        e3.P = 168;
        e3.aR = 225 - n3;
        e3.aH = 1320;
    }
}

