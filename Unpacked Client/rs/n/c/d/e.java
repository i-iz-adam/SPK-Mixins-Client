/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.d;

import rs.n.a.a;
import rs.n.a.f;
import rs.n.d.c;

public class e {
    public static void a(c c2) {
        c2.a(rs.n.a.e.a(32525, "raids/tomes1")).b(32301, 25, 45);
        rs.n.a.c c3 = rs.n.a.c.g(32529, 20).a(10);
        c3.h(12, 20);
        c3.bE = true;
        c3.bF = true;
        c3.W = new String[0];
        for (int i2 = 21234; i2 <= 21250; ++i2) {
            c3.az[i2 - 21234] = i2 + 1;
            c3.ax[i2 - 21234] = 0;
        }
        c2.a(c3).b(32525, 12, 11);
        c2.a(a.b(32537, "raids/btn2a", "Select").d("@whi@Buy x10 random modifiers @gre@(10% discount)\nThey'll will be added to your coffer above.").c("raids/btn2b")).b(32525, 311, 111);
        c2.a(a.b(32540, "raids/btn1a", "Select").d("@whi@Buy a random modifier\nIt be added to your coffer above.").c("raids/btn1b")).b(32525, 179, 111);
        c2.a(a.b(32543, "raids/btn1a", "Select").d("@whi@Buy x5 random modifiers\nThey'll be added to your coffer above.").c("raids/btn1b")).b(32525, 179, 138);
        c2.a(f.a(32555, "Roll x1: @cya@<img=469> 1,000").a().b().m()).b(32525, 241, 117);
        c2.a(f.a(32556, "Roll x5: @cya@<img=469> 5,000").a().b().m()).b(32525, 241, 145);
        c2.a(f.a(32557, "Roll x10\\n\\n@cya@<img=469>@gre@ 9,000\\n@gre@(10% Discount)").a().b().m()).b(32525, 362, 115);
        c2.a(f.a(32558, "What are Modifier tomes?").n().l()).b(32525, 77, 119);
        c2.a(f.a(32559, "Click here to learn more").o().m().a(155)).b(32525, 0, 135);
        c2.a(rs.n.a.e.a(32526, "raids/tomes2")).b(32525, -12, 172);
        rs.n.a.c c4 = rs.n.a.c.g(32530, 1).a(1);
        c4.az[0] = 6750;
        c4.ax[0] = 0;
        c4.bE = true;
        c4.bF = true;
        c4.W = new String[0];
        c2.a(c4).b(32526, 171, 51);
        c2.a(f.a(32560, "Affliction Tomes").o().m()).b(32526, 202, 22);
        c2.a(a.b(32588, "bank/bank 17", "Deposit all tomes from inventory").a().c("bank/bank 18")).b(32526, 222, 41);
        c2.a(a.b(32591, "bank/bank 35", "Deposit all tomes from bank").a().c("bank/bank 46")).b(32526, 222, 67);
        c2.a(a.b(32595, "raids/close1", "Close interface").b("raids/close2")).b(32301, 493, 3);
    }
}

