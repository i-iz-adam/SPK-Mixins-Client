/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.Client;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.a.a;
import rs.n.c;
import rs.n.e;

public class h
extends c {
    private static final int bM = 4000;
    public static f_0 c;
    public static f_0 d;
    public static f_0 e;
    public static f_0 f;
    public static f_0 g;
    public static final int[][] bI;
    public static String[] bJ;
    public static String[] bK;
    public static String[] bL;

    public static void m(int n2) {
        rs.n.c.h.bK[5] = "Withdraw " + n2;
        rs.n.c.h.bL[5] = "Withdraw " + n2;
    }

    public static void a(Client client) {
        client.ev = 0;
        Client.fM = true;
        client.fN = 25;
        client.gb = true;
        client.fB = "";
        client.eQ = "Enter name of item to search";
    }

    public h(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        c = new f_0("bank/TAB 0");
        d = new f_0("bank/TAB 1");
        e = new f_0("bank/TAB 2");
        f = new f_0("bank/TAB 3");
        g = new f_0("bank/TAB 4");
        int n2 = (int)Math.ceil(400.0);
        int n3 = 10;
        int n4 = n3 * n2;
        e e2 = H[5385];
        e2.aH = n2 * 38;
        e e3 = H[5382];
        e3.az = new int[n4];
        e3.ax = new int[n4];
        e3.aR = n2;
        e3.e();
        e3.P = n3;
        e e4 = H[5292];
        rs.n.c.h.a(5384, "", this.a, 0, 0xFFB000, false);
        int n5 = 92;
        while (n5 < e4.am.length) {
            int n6 = 40;
            if (n5 >= 92 && n5 <= 95 || n5 == 97) {
                n6 = 90;
            }
            int n7 = n5++;
            e4.am[n7] = e4.am[n7] - n6;
        }
        e4.am[90] = 410;
        e4.bc[90] = 288;
        e e5 = rs.n.c.h.j(23000);
        e5.az = new int[n4];
        e5.ax = new int[n4];
        e5.al = new int[1];
        e5.am = new int[1];
        e5.bc = new int[1];
        e5.al[0] = 5292;
        e5.am[0] = 0;
        e5.bc[0] = 0;
        rs.n.c.h.c(this.a);
        rs.n.c.h.b(this.a);
    }

    public static void b(int n2, Boolean bl) {
        e e2 = H[n2];
        e2.W = new String[5];
        e2.K = new int[20];
        e2.ax = new int[30];
        e2.az = new int[30];
        e2.as = new int[20];
        e2.al = new int[0];
        e2.am = new int[0];
        e2.bc = new int[0];
        e2.t = false;
        e2.ac = 24;
        e2.ap = 24;
        e2.aR = 5;
        e2.P = 6;
        e2.ah = 5292;
        e2.aw = n2;
        e2.aI = 2;
    }

    public static void b(k_0[] k_0Array) {
        e e2 = H[5385];
        rs.n.c.h.a(19, e2);
        rs.n.c.h.c(43604, 1, "bank/SEP");
        rs.n.c.h.a(43605, "Tab 1", k_0Array, 0, 16750623, true, false);
        rs.n.c.h.c(43606, 1, "bank/SEP");
        rs.n.c.h.a(43607, "Tab 2", k_0Array, 0, 16750623, true, false);
        rs.n.c.h.c(43608, 1, "bank/SEP");
        rs.n.c.h.a(43609, "Tab 3", k_0Array, 0, 16750623, true, false);
        rs.n.c.h.c(43610, 1, "bank/SEP");
        rs.n.c.h.a(43611, "Tab 4", k_0Array, 0, 16750623, true, false);
        rs.n.c.h.c(43612, 1, "bank/SEP");
        rs.n.c.h.a(43613, "Tab 5", k_0Array, 0, 16750623, true, false);
        rs.n.c.h.c(43614, 1, "bank/SEP");
        rs.n.c.h.a(43615, "Tab 6", k_0Array, 0, 16750623, true, false);
        rs.n.c.h.c(43616, 1, "bank/SEP");
        rs.n.c.h.a(43617, "Tab 7", k_0Array, 0, 16750623, true, false);
        rs.n.c.h.c(43618, 1, "bank/SEP");
        rs.n.c.h.a(43619, "Tab 8", k_0Array, 0, 16750623, true, false);
        rs.n.c.h.c(43620, 1, "bank/SEP");
        rs.n.c.h.a(43621, "Tab 9", k_0Array, 0, 16750623, true, false);
        rs.n.c.h.b(43604, 30, -10, 1, e2);
        rs.n.c.h.b(43605, 40, -19, 2, e2);
        rs.n.c.h.b(43606, 30, -10, 3, e2);
        rs.n.c.h.b(43607, 40, -19, 4, e2);
        rs.n.c.h.b(43608, 30, -10, 5, e2);
        rs.n.c.h.b(43609, 40, -19, 6, e2);
        rs.n.c.h.b(43610, 30, -10, 7, e2);
        rs.n.c.h.b(43611, 40, -19, 8, e2);
        rs.n.c.h.b(43612, 30, -10, 9, e2);
        rs.n.c.h.b(43613, 40, -19, 10, e2);
        rs.n.c.h.b(43614, 30, -10, 11, e2);
        rs.n.c.h.b(43615, 40, -19, 12, e2);
        rs.n.c.h.b(43616, 30, -10, 13, e2);
        rs.n.c.h.b(43617, 40, -19, 14, e2);
        rs.n.c.h.b(43618, 30, -10, 15, e2);
        rs.n.c.h.b(43619, 40, -19, 16, e2);
        rs.n.c.h.b(43620, 30, -10, 17, e2);
        rs.n.c.h.b(43621, 40, -19, 0, e2);
        rs.n.c.h.b(5382, 38, 3, 18, e2);
    }

    public static void c(k_0[] k_0Array) {
        e e2 = rs.n.c.h.d(5292);
        int n2 = 0;
        rs.n.c.h.a(43, e2);
        rs.n.c.h.c(5293, 0, "bank/BANK");
        rs.n.c.h.b(5293, 13, 13, n2++, e2);
        rs.n.c.h.a(5383, "The Bank of SpawnPK", k_0Array, 2, 16750623, true, true);
        rs.n.c.h.b(5383, 265, 17, n2++, e2);
        rs.n.c.h.a(5384, 3, 0, 5380, 1, "bank/BANK", 17, 17, "Close Window");
        rs.n.c.h.a(5380, 2, "bank/BANK", 17, 17, 5379);
        rs.n.c.h.b(5384, 476, 16, n2++, e2);
        rs.n.c.h.b(5380, 476, 16, n2++, e2);
        rs.n.a.a.b(5294, "bank/BANK 3", "Repair items\n@gre@[CTRL+R]").a().a("bank/BANK 4");
        rs.n.c.h.b(5294, 150, 285, n2++, e2);
        rs.n.c.h.a(26000, 4, 26001, 5, 8, "bank/BANK", 35, 25, 304, 1, "Swap Withdraw Mode", 26002, 7, 6, "bank/BANK", 26003, "Switch to insert items \nmode", "Switch to swap items \nmode.", 12, 20);
        rs.n.c.h.b(26000, 25, 285, n2++, e2);
        rs.n.c.h.b(26001, 10, 225, n2++, e2);
        rs.n.a.a.b(26004, "bank/BANK 13", "Search for item\n@gre@[CTRL+S]").a().a("bank/BANK 15");
        rs.n.c.h.b(26004, 65, 285, n2++, e2);
        rs.n.c.h.a(26008, 4, 26009, 9, 11, "bank/BANK", 35, 25, 115, 1, "Toggle note", 26010, 10, 12, "bank/BANK", 26011, "Switch to note withdrawal \nmode", "Switch to item withdrawal \nmode", 12, 20);
        rs.n.c.h.b(26008, 250, 285, n2++, e2);
        rs.n.c.h.b(26009, 235, 225, n2++, e2);
        rs.n.c.h.a(26012, 5, 26013, 17, "bank/BANK", 35, 25, "Deposit carried tems", 26014, 18, "bank/BANK", 26015, "Empty your backpack into\nyour bank", 0, 20);
        rs.n.c.h.b(26012, 375, 285, n2++, e2);
        rs.n.c.h.b(26013, 360, 225, n2++, e2);
        rs.n.c.h.a(26016, 5, 26017, 19, "bank/BANK", 35, 25, "Deposit worn items", 26018, 20, "bank/BANK", 26019, "Empty the items your are\nwearing into your bank", 0, 20);
        rs.n.c.h.b(26016, 415, 285, n2++, e2);
        rs.n.c.h.b(26017, 400, 225, n2++, e2);
        rs.n.c.h.a(26020, 5, 26021, 21, "bank/BANK", 35, 25, "Decant potions", 26022, 22, "bank/BANK", 26023, "Decant all potions in your bank", 0, 20);
        rs.n.c.h.b(26020, 455, 285, n2++, e2);
        rs.n.c.h.b(26021, 440, 225, n2++, e2);
        rs.n.c.h.b(10325, 4, "bank/TAB", "Drag an item here to create a new tab");
        rs.n.c.h.b(10325, 70, 36, n2++, e2);
        rs.n.c.h.b(10326, 4, "bank/TAB", "Drag an item here to create a new tab");
        rs.n.c.h.b(10326, 118, 36, n2++, e2);
        rs.n.c.h.b(10327, 4, "bank/TAB", "Drag an item here to create a new tab");
        rs.n.c.h.b(10327, 166, 36, n2++, e2);
        rs.n.c.h.b(10328, 4, "bank/TAB", "Drag an item here to create a new tab");
        rs.n.c.h.b(10328, 214, 36, n2++, e2);
        rs.n.c.h.b(10329, 4, "bank/TAB", "Drag an item here to create a new tab");
        rs.n.c.h.b(10329, 262, 36, n2++, e2);
        rs.n.c.h.b(10330, 4, "bank/TAB", "Drag an item here to create a new tab");
        rs.n.c.h.b(10330, 310, 36, n2++, e2);
        rs.n.c.h.b(10331, 4, "bank/TAB", "Drag an item here to create a new tab");
        rs.n.c.h.b(10331, 358, 36, n2++, e2);
        rs.n.c.h.b(10332, 4, "bank/TAB", "Drag an item here to create a new tab");
        rs.n.c.h.b(10332, 406, 36, n2++, e2);
        rs.n.c.h.a(19995, "0", k_0Array, 0, 11834970, true, false);
        rs.n.c.h.b(19995, 474, 43, n2++, e2);
        rs.n.c.h.a(19996, "495", k_0Array, 0, 11834970, true, false);
        rs.n.c.h.b(19996, 474, 56, n2++, e2);
        rs.n.c.h.a(19997, "Repairs", k_0Array, 0, 16750623, false, true);
        rs.n.c.h.b(19997, -1476, 301, n2++, e2);
        rs.n.c.h.c(10335, true);
        rs.n.c.h.b(10335, 77, 39, n2++, e2);
        rs.n.c.h.c(10336, false);
        rs.n.c.h.b(10336, 125, 39, n2++, e2);
        rs.n.c.h.c(10337, false);
        rs.n.c.h.b(10337, 173, 39, n2++, e2);
        rs.n.c.h.c(10338, false);
        rs.n.c.h.b(10338, 221, 39, n2++, e2);
        rs.n.c.h.c(10339, false);
        rs.n.c.h.b(10339, 269, 39, n2++, e2);
        rs.n.c.h.c(10340, false);
        rs.n.c.h.b(10340, 317, 39, n2++, e2);
        rs.n.c.h.c(10341, false);
        rs.n.c.h.b(10341, 365, 39, n2++, e2);
        rs.n.c.h.c(10342, false);
        rs.n.c.h.b(10342, 413, 39, n2++, e2);
        rs.n.c.h.b(10324, 0, "bank/TAB", "Click here to view the full contents of your bank");
        rs.n.c.h.b(10324, 22, 36, n2++, e2);
        rs.n.c.h.a(27000, "1", k_0Array, 0, 0xFFEE33);
        rs.n.c.h.a(27001, "0", k_0Array, 0, 0xFFEE33);
        rs.n.c.h.a(27002, "0", k_0Array, 0, 0xFFEE33);
        rs.n.c.h.b(5385, -4, 74, n2++, e2);
        rs.n.c.h.a(39971, 4, 39970, 24, 26, "bank/BANK", 35, 25, 116, 1, "Toggle placeholders", 39969, 25, 27, "bank/BANK", 39968, "Always set as placeholders", "Do not set as placeholders", 12, 20);
        rs.n.c.h.b(39971, 290, 285, n2++, e2);
        rs.n.c.h.b(39970, 275, 225, n2++, e2);
        rs.n.c.h.b(19997, 187, 292, n2++, e2);
        rs.n.c.h.a(38976, 5, 38977, 28, "bank/BANK", 35, 25, "Deposit pet", 38978, 29, "bank/BANK", 38979, "Deposit your pet to your bank", 0, 20);
        rs.n.c.h.b(38976, 335, 285, n2++, e2);
        rs.n.c.h.b(38977, 320, 225, n2++, e2);
        rs.n.a.a.b(38980, "bank/BANK 14", "Filter by currencies\n@gre@[CTRL+C]").a().a("bank/BANK 16");
        rs.n.c.h.b(38980, 106, 285, n2++, e2);
        e2 = H[5385];
        e2.aR = 206;
        e2.P = 480;
        e2 = H[5382];
        e2.ac = 12;
    }

    public static void c(int n2, Boolean bl) {
        e e2 = H[n2];
        e2.W = new String[]{null, "Select tab", "Collapse tab", null, null};
        e2.K = new int[20];
        e2.ax = new int[30];
        e2.az = new int[30];
        e2.as = new int[20];
        e2.al = new int[0];
        e2.am = new int[0];
        e2.bc = new int[0];
        e2.t = false;
        e2.ag = true;
        e2.aF = true;
        e2.ac = 24;
        e2.ap = 24;
        e2.aR = 5;
        e2.P = 6;
        e2.ah = 5292;
        e2.aw = n2;
        e2.aI = 2;
    }

    static {
        bI = new int[][]{{10325, 10335}, {10326, 10336}, {10327, 10337}, {10328, 10338}, {10329, 10339}, {10330, 10340}, {10331, 10341}, {10332, 10342}};
        bJ = new String[]{"Release"};
        bK = new String[]{"Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All", "Withdraw X", "Withdraw 14", "Withdraw All But One"};
        bL = new String[]{"Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All", "Withdraw X", "Withdraw 14", "Bag-exchange"};
    }
}

