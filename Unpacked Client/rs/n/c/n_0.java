/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.N
 */
public class n_0
extends c {
    public static f_0 c = null;
    public static f_0 d = null;

    public n_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = n_0.d(60600);
        c = new f_0("fountain/glow");
        d = new f_0("fountain/glow2");
        n_0.h(60601, "fountain/event 1");
        n_0.a(60602, true);
        n_0.H[60602].K = new int[175];
        n_0.H[60602].ax = new int[175];
        n_0.H[60602].az = new int[175];
        n_0.H[60602].as = new int[175];
        n_0.H[60602].P = 7;
        n_0.H[60602].aR = 25;
        n_0.H[60602].ac = 32;
        n_0.H[60602].ap = 16;
        e e3 = n_0.d(60603);
        e3.al = new int[1];
        e3.am = new int[1];
        e3.bc = new int[1];
        e3.aH = 1000;
        e3.P = 449;
        e3.aR = 185;
        e3.bj = 87;
        e3.k(1);
        e3.b(0, 60602, 12, 10);
        n_0.a(60611, true);
        n_0.H[60611].K = new int[4];
        n_0.H[60611].ax = new int[4];
        n_0.H[60611].az = new int[4];
        n_0.H[60611].as = new int[4];
        n_0.H[60611].P = 2;
        n_0.H[60611].aR = 2;
        n_0.H[60611].ac = 32;
        n_0.H[60611].ap = 16;
        n_0.a(60612, true);
        n_0.H[60612].K = new int[4];
        n_0.H[60612].ax = new int[4];
        n_0.H[60612].az = new int[4];
        n_0.H[60612].as = new int[4];
        n_0.H[60612].P = 2;
        n_0.H[60612].aR = 2;
        n_0.H[60612].ac = 17;
        n_0.H[60612].ap = 16;
        n_0.a(60613, true);
        n_0.H[60613].K = new int[4];
        n_0.H[60613].ax = new int[4];
        n_0.H[60613].az = new int[4];
        n_0.H[60613].as = new int[4];
        n_0.H[60613].P = 2;
        n_0.H[60613].aR = 2;
        n_0.H[60613].ac = 32;
        n_0.H[60613].ap = 16;
        n_0.a(60604, "fountain/button", 1, 70, 41, "Exchange", -1, 60605, 1);
        n_0.a(60605, "fountain/button", 2, 70, 41, 60606);
        n_0.h(60607, "fountain/icon 3");
        n_0.a(60608, "Roll", this.a, 1, 16750623);
        n_0.a(60609, "Tier I Prize", this.a, 2, 16750623, false, true);
        n_0.a(60610, "Roll all of the items in\\nthe tier for a prize!", this.a, 0, 16750623, false, true);
        n_0.a(60617, 5, 0, 60618, 4, "fountain/event", 100, 21, "Event Chest Tier I");
        n_0.a(60618, 3, "fountain/event", 100, 21, 60619);
        n_0.a(60620, "@or1@Tier I", this.a, 0, 16751360, false, true);
        n_0.a(60621, 5, 0, 60622, 4, "fountain/event", 100, 21, "Event Chest Tier II");
        n_0.a(60622, 3, "fountain/event", 100, 21, 60623);
        n_0.a(60624, "@or1@Tier II", this.a, 0, 16751360, false, true);
        n_0.a(60616, "Tier I - @yel@Halloween Event 2020", this.a, 2, 16750623, true);
        n_0.a(60625, "@yel@0 / 25 rolls @or1@(0 / 50,000 tokens)", this.a, 0, 16750623, true, true);
        n_0.a(60626, "fountain/sprite", 16, 120, 35, "Enter next tier", -1, 60628, 1);
        n_0.a(60628, "fountain/sprite", 15, 120, 35, 60629);
        n_0.a(60630, "@yel@Event Guide", this.a, 1, 16750623, true);
        n_0.a(60631, "fountain/sprite", 16, 120, 35, "Reset event items", -1, 60632, 1);
        n_0.a(60632, "fountain/sprite", 15, 120, 35, 60633);
        n_0.a(60634, "Reset exchange", this.a, 1, 16750623, true);
        e2.k(24);
        e2.b(0, 60601, 12, 11);
        e2.b(1, 60603, 27, 47);
        e2.b(2, 60604, 191, 240);
        e2.b(3, 60605, 191, 240);
        e2.b(4, 60608, 204, 252);
        e2.b(5, 60607, 231, 251);
        e2.b(6, 60611, 272, 246);
        e2.b(7, 60612, 394, 246);
        e2.b(8, 63740, 476, 14);
        e2.b(9, 63741, 476, 14);
        e2.b(10, 60616, 344, 23);
        e2.b(11, 60625, 331, 306);
        e2.b(12, 60626, 24, 282);
        e2.b(13, 60628, 24, 282);
        e2.b(14, 60630, 85, 291);
        e2.b(15, 60609, 67, 239);
        e2.b(16, 60610, 67, 256);
        e2.b(17, 60613, 27, 242);
        e2.b(18, 60621, 118, 27);
        e2.b(19, 60622, 118, 27);
        e2.b(20, 60624, 127, 33);
        e2.b(21, 60617, 18, 27);
        e2.b(22, 60618, 18, 27);
        e2.b(23, 60620, 27, 33);
    }
}

