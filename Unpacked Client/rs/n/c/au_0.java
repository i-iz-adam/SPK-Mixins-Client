/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.aU
 */
public class au_0
extends c {
    private static final int c = 18516;
    private static final int d = 18517;
    private static final int e = 18518;

    public au_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = au_0.d(18516);
        au_0.c(63739, 0, "teleport/SPRITE");
        au_0.a(63740, 1, 0, 63741, 1, "teleport/SPRITE", 46, 20, "Close Window");
        au_0.a(63741, 2, "teleport/SPRITE", 46, 20, 63742);
        au_0.b(18705, 75, 50);
        au_0.a(63745, "teleport/SPRITE", 3, 100, 32, "Teleport", -1, 63746, 1);
        au_0.a(63746, "teleport/SPRITE", 4, 100, 32, 63747);
        au_0.a(18519, "Teleport <img=149>", this.a, 0, 16751360, true, true);
        au_0.a(18520, "Title of Location", this.a, 0, 16751360, true, true);
        int n2 = 10;
        e2.al = new int[n2];
        e2.am = new int[n2];
        e2.bc = new int[n2];
        int n3 = 5;
        int n4 = 20;
        e2.b(0, 63739, n3, n4);
        e2.b(1, 63740, 473 + n3, 8 + n4);
        e2.b(2, 63741, 473 + n3, 8 + n4);
        e2.b(3, 18705, n3 + 140, n4 + 80);
        e2.b(4, 63745, 365 + n3, 253 + n4);
        e2.b(5, 63746, 365 + n3, 253 + n4);
        e2.b(6, 18519, 415 + n3, 263 + n4);
        e2.b(7, 18520, 175 + n3, 134 + n4);
        e2.b(8, 18517, 341 + n3, 30 + n4);
        e2.b(9, 18518, 45 + n3, 157 + n4);
        this.h();
    }

    private void h() {
        int n2;
        int n3;
        e e2 = au_0.d(18517);
        e2.aH = 250;
        e2.P = 125;
        e2.aR = 215;
        e2.bj = 87;
        int n4 = 10;
        int n5 = 18521;
        for (n3 = 0; n3 < n4; ++n3) {
            au_0.a(n5 + n3, "Teleport @yel@#" + n3, "Select this teleport", this.a, 0, 16750623, false, false, 125);
        }
        n3 = 10;
        int n6 = 5;
        int n7 = 15;
        e2.al = new int[n4];
        e2.am = new int[n4];
        e2.bc = new int[n4];
        for (int i2 = 0; i2 < n4; ++i2) {
            e2.b(i2, n5 + i2, n3, n6 + n7 * i2);
        }
        e e3 = au_0.d(18518);
        e3.aH = 250;
        e3.P = 260;
        e3.aR = 120;
        e3.bj = 87;
        n5 = 18521 + n4;
        n4 = 15;
        for (n2 = 0; n2 < n4; ++n2) {
            String string = " blahblahblahblahblahblahblah";
            au_0.a(n5 + n2, "Line " + n2 + string + string.length(), "Select this teleport", this.a, 0, 0xFFFFFF, false, false, 125);
        }
        n3 = 10;
        n6 = 5;
        n7 = 15;
        e3.al = new int[n4];
        e3.am = new int[n4];
        e3.bc = new int[n4];
        for (n2 = 0; n2 < n4; ++n2) {
            e3.b(n2, n5 + n2, n3, n6 + n7 * n2);
        }
    }
}

