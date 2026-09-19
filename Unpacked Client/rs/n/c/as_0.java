/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.aS
 */
public class as_0
extends c {
    public static final int c = 18559;

    public as_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        e e2 = as_0.d(18559);
        as_0.c(55732, 0, "tasks/SPRITE");
        as_0.a(55733, "@or1@Task Scroll Title", this.a, 2, 16751360, true, true);
        as_0.a(55734, "@or1@Task Information", this.a, 2, 16751360, false, true);
        as_0.a(55735, "@or1@Potential Rewards", this.a, 2, 16751360, false, true);
        as_0.a(55736, "@or1@Completion Progress", this.a, 2, 16751360, false, true);
        e e3 = as_0.d(55737);
        e3.aH = 250;
        e3.P = 235;
        e3.aR = 170;
        e3.k(20);
        int n3 = 20;
        int n4 = 4;
        int n5 = 15;
        for (int i2 = 0; i2 < 20; ++i2) {
            as_0.a(55738 + i2, "Description " + (i2 + 1) + " (" + (55738 + i2) + ")", this.a, 0, 0xFFFFFF, false, false);
            e3.b(i2, 55738 + i2, n3, n4 + n5 * i2);
        }
        e e4 = as_0.d(55758);
        e4.aH = 750;
        e4.P = 178;
        e4.aR = 170;
        e4.k(1);
        as_0.a(55759, false);
        as_0.H[55759].az = new int[100];
        as_0.H[55759].ax = new int[100];
        as_0.H[55759].aR = 25;
        as_0.H[55759].P = 4;
        as_0.H[55759].ac = 10;
        as_0.H[55759].ap = 10;
        for (n2 = 0; n2 < 10; ++n2) {
            as_0.H[55759].az[n2] = 1337;
            as_0.H[55759].ax[n2] = n2 + 1;
        }
        e4.b(0, 55759, 18, 6);
        as_0.c(55760, 1, "tasks/SPRITE");
        as_0.c(55761, 2, "tasks/SPRITE");
        e.H[55761].E = new f_0("tasks/SPRITE 2", 0, 15);
        as_0.a(55762, "@yel@This meter indicates your progress for the objective.\\nOnce complete, you'll receive a casket.", this.a, 0, 16751360, true, true);
        as_0.a(55763, "0% (0/100)", this.a, 0, 0, true, false);
        as_0.a(55764, 4, 0, 55765, 3, "tasks/SPRITE", 70, 13, "Collect reward");
        as_0.a(55765, 4, "tasks/SPRITE", 70, 13, 55766);
        as_0.a(55767, "@yel@Collect", this.a, 0, 0, true, true);
        as_0.a(55768, 4, 0, 55769, 5, "tasks/SPRITE", 70, 13, "Track progress");
        as_0.a(55769, 6, "tasks/SPRITE", 70, 13, 55770);
        as_0.a(55771, "  @yel@Track<img=39>", this.a, 0, 0, true, true);
        n2 = -10;
        int n6 = -5;
        e2.k(19);
        e2.b(0, 55732, 40, 7);
        e2.b(1, 55733, 290, 18);
        e2.b(2, 64275, 464, 18);
        e2.b(3, 64276, 464, 18);
        e2.b(4, 55734, 85, 55);
        e2.b(5, 55735, 325, 55);
        e2.b(6, 55736, 85, 254);
        e2.b(7, 55737, 40, 74);
        e2.b(8, 55758, 281, 74);
        e2.b(9, 55760, 111, 278);
        e2.b(10, 55761, 111, 278);
        e2.b(11, 55762, 256, 295);
        e2.b(12, 55763, 258, 280);
        e2.b(13, 55764, 402, 255);
        e2.b(14, 55765, 402, 255);
        e2.b(15, 55767, 431, 256);
        e2.b(16, 55768, 327, 255);
        e2.b(17, 55769, 327, 255);
        e2.b(18, 55771, 361, 256);
        int n7 = 0;
        while (n7 < e2.al.length) {
            int n8 = n7;
            e2.am[n8] = e2.am[n8] + -10;
            int n9 = n7++;
            e2.bc[n9] = e2.bc[n9] + -5;
        }
    }
}

