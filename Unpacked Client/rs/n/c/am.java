/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.d.d;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class am
extends c {
    public am(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.am.d(50600);
        String string = "Solar Event: Summer 2026";
        String string2 = "May 15th, 2026";
        int n2 = 0;
        int n3 = 4965;
        int n4 = 450;
        int n5 = 150;
        int n6 = 150;
        int n7 = d.c((int)n3).w;
        rs.n.c.am.h(50601, "misc/login 5");
        rs.n.c.am.a(50602, "Welcome back, Username!", this.a, 2, 0xFFFF00, true);
        rs.n.c.am.a(50603, "<u=16750623>" + string + "</u> <img=82>", this.a, 1, 0xFFFF00, false);
        rs.n.c.am.a(50604, "Check out this year's latest holiday event!", "Select", this.a, 0, 0xFFFFFF, false, true, 250);
        rs.n.c.am.a(50605, "And, for a limited time only, you'll receive", "Select", this.a, 0, 0xFFFFFF, false, true, 250);
        rs.n.c.am.a(50606, "one of the rewards below for logging in daily!", "Select", this.a, 0, 0xFFFFFF, false, true, 250);
        rs.n.c.am.a(50607, "", "Select", this.a, 0, 0xFFFFFF, false, false, 250);
        rs.n.c.am.a(50608, "", "Select", this.a, 0, 0xFFFFFF, false, false, 250);
        rs.n.c.am.a(50609, "", "Select", this.a, 0, 0xFFFFFF, false, false, 250);
        rs.n.c.am.a(50610, "", "Select", this.a, 0, 0xFFFFFF, false, false, 250);
        rs.n.c.am.a(50611, "", "Select", this.a, 0, 0xFFFFFF, false, false, 250);
        rs.n.c.am.a(50612, "", "Select", this.a, 0, 0xFFFFFF, false, false, 250);
        rs.n.c.am.b(50613, 100, 100);
        e.H[50613].af = n3;
        e.H[50613].aT = n4;
        e.H[50613].aU = n5;
        e.H[50613].aV = n6;
        e.H[50613].ar = 0;
        e.H[50613].F = 0;
        e.H[50613].aD = n7;
        rs.n.c.am.a(50614, "<img=209> Welcome back to SpawnPK! Limited Time Event <img=209>", this.a, 2, 0xFFFF00, true);
        rs.n.c.am.a(50615, true);
        rs.n.c.am.H[50615].K = new int[20];
        rs.n.c.am.H[50615].ax = new int[20];
        rs.n.c.am.H[50615].az = new int[20];
        rs.n.c.am.H[50615].as = new int[20];
        rs.n.c.am.H[50615].P = 4;
        rs.n.c.am.H[50615].aR = 5;
        rs.n.c.am.H[50615].ac = 30;
        rs.n.c.am.H[50615].ap = 7;
        e e3 = rs.n.c.am.d(50616);
        e3.al = new int[1];
        e3.am = new int[1];
        e3.bc = new int[1];
        e3.aH = 300;
        e3.P = 242;
        e3.aR = 89;
        e3.bj = 87;
        e3.k(1);
        e3.b(0, 50615, 12, 10);
        rs.n.c.am.a(50617, "Event expires on: @yel@" + string2, this.a, 1, 16750623, true);
        rs.n.c.am.a(50618, "misc/login", 2, 130, 32, "Play now", -1, 50619, 1);
        rs.n.c.am.a(50619, "misc/login", 3, 130, 32, 50620);
        rs.n.c.am.a(50621, "Play now", this.a, 0, 16750623, true);
        rs.n.c.am.a(50622, "Your next daily reward: @yel@24h 0m 0s", this.a, 1, 16750623, true);
        e2.k(19);
        e2.b(0, 50601, 12, 16);
        e2.b(1, 63740, 476, 19);
        e2.b(2, 63741, 476, 19);
        e2.b(3, 50613, 74, 195 + n2);
        e2.b(4, 50602, 360, 60);
        e2.b(5, 50603, 230, 80);
        e2.b(6, 50604, 230, 96);
        e2.b(7, 50605, 230, 109);
        e2.b(8, 50606, 230, 122);
        e2.b(9, 50607, -230, 135);
        e2.b(10, 50608, -230, 157);
        e2.b(11, 50609, -230, 170);
        e2.b(12, 50610, -230, 183);
        e2.b(13, 50611, -230, 196);
        e2.b(14, 50612, -230, 209);
        e2.b(15, 50614, 262, 21);
        e2.b(16, 50616, 225, 147);
        e2.b(17, 50617, 352, 248);
        e2.b(18, 50622, 351, 265);
    }
}

