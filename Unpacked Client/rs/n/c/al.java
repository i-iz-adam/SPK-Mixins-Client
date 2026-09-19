/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.Client;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class al
extends c {
    public al(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.al.d(33000);
        rs.n.c.al.h(33001, "equipment/loadout 1");
        rs.n.c.al.a(33002, false);
        e e3 = e.H[33002];
        e3.az = new int[28];
        e3.ax = new int[28];
        e3.aR = 7;
        e3.P = 4;
        e3.ac = 5;
        e3.ap = 3;
        e3.aF = true;
        rs.n.c.al.a(33003, false);
        e e4 = e.H[33003];
        e4.az = new int[15];
        e4.ax = new int[15];
        e4.aR = 5;
        e4.P = 3;
        e4.ac = 20;
        e4.ap = 8;
        e4.aF = true;
        rs.n.c.al.a(33004, "Item Loadout Modification Interface", this.a, 2, 16750623, true, true);
        rs.n.c.al.a(33005, "LMS Loadout", this.a, 2, 16750623, true, true);
        rs.n.c.al.a(33006, "fountain/sprite", 16, 120, 34, "Save loadout", -1, 33007, 1);
        rs.n.c.al.a(33007, "fountain/sprite", 15, 120, 34, 33008);
        rs.n.c.al.a(33009, "fountain/sprite", 16, 120, 34, "Set as default", -1, 33010, 1);
        rs.n.c.al.a(33010, "fountain/sprite", 15, 120, 34, 33011);
        rs.n.c.al.a(33012, "@yel@Save loadout", this.a, 1, 16750623, true, true);
        rs.n.c.al.a(33013, "@yel@Reset to default", this.a, 1, 16750623, true, true);
        e2.k(13);
        e2.b(0, 33001, 8, 6);
        e2.b(1, 33002, 178, 51);
        e2.b(2, 33003, 25, 73);
        e2.b(3, 33004, 255, 15);
        e2.b(4, 33005, 412, 60);
        e2.b(5, 33006, 354, 109);
        e2.b(6, 33007, 354, 109);
        e2.b(7, 33009, 354, 159);
        e2.b(8, 33010, 354, 159);
        e2.b(9, 33012, 414, 118);
        e2.b(10, 33013, 414, 168);
        e2.b(11, 65418, 479, 14);
        e2.b(12, 65419, 479, 14);
    }

    public static void h() {
        Object object = "";
        e e2 = e.H[33002];
        e e3 = e.H[33003];
        for (int i2 = 0; i2 < 28; ++i2) {
            object = (String)object + (e2.az[i2] - 1) + "," + e2.ax[i2];
            if (i2 >= 27) continue;
            object = (String)object + " ";
        }
        Object object2 = "";
        object2 = (String)object2 + (e3.az[1] - 1) + "," + e3.ax[1] + " ";
        object2 = (String)object2 + (e3.az[3] - 1) + "," + e3.ax[3] + " ";
        object2 = (String)object2 + (e3.az[4] - 1) + "," + e3.ax[4] + " ";
        object2 = (String)object2 + (e3.az[6] - 1) + "," + e3.ax[6] + " ";
        object2 = (String)object2 + (e3.az[7] - 1) + "," + e3.ax[7] + " ";
        object2 = (String)object2 + (e3.az[8] - 1) + "," + e3.ax[8] + " ";
        object2 = (String)object2 + "0,0 ";
        object2 = (String)object2 + (e3.az[10] - 1) + "," + e3.ax[10] + " ";
        object2 = (String)object2 + "0,0 ";
        object2 = (String)object2 + (e3.az[12] - 1) + "," + e3.ax[12] + " ";
        object2 = (String)object2 + (e3.az[13] - 1) + "," + e3.ax[13] + " ";
        object2 = (String)object2 + "0,0 ";
        object2 = (String)object2 + (e3.az[14] - 1) + "," + e3.ax[14] + " ";
        object2 = (String)object2 + (e3.az[5] - 1) + "," + e3.ax[5];
        Client.ap = "::cld1 " + (String)object;
        Client.ao = "::cld2 " + (String)object2;
    }
}

