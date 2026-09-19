/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class z
extends c {
    public z(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.z.d(19993);
        rs.n.c.z.a(4, e2);
        rs.n.c.z.c(39985, 2, "construction/sprite");
        int n2 = 35;
        int n3 = 15;
        rs.n.c.z.a(0, 39985, n2 + 0, n3 + 0, e2);
        rs.n.c.z.a(1, 65418, n2 + 429, n3 + 4, e2);
        rs.n.c.z.a(2, 65419, n2 + 429, n3 + 4, e2);
        rs.n.c.z.a(3, 19992, n2 + 51, n3 + 60, e2);
        e e3 = rs.n.c.z.j(19992);
        int n4 = 23;
        e3.aH = n4 * 65;
        e3.P = 330;
        e3.aR = 220;
        String[] stringArray = new String[]{"Parlour: Lvl 1", "Garden: Lvl 1", "Kitchen: lvl 5", "Dining room: lvl 10", "Workshop: lvl 15", "Bedroom: Lvl 20", "Hall - Skill Trophies: Lvl 25", "Games Room: Lvl 30", "Combat room: Lvl 32", "Hall - Quest trophies: Lvl 35", "Menagerie: Lvl 37", "Study: Lvl 40", "Costume room: Lvl 42", "Chapel: Lvl 45", "Boss portal room: Lvl 50", "Formal garden: Lvl 55", "Throne room: Lvl 60", "Superior garden: Lvl 65", "Dungeon - corridor: Lvl 70", "Dungeon - junction: Lvl 70", "Dungeon - stairs: Lvl 70", "Dungeon - pit: Lvl 70", "Treasure room: Lvl 75"};
        int[] nArray = new int[]{1000, 1000, 5000, 5000, 10000, 10000, 15000, 25000, 25000, 25000, 30000, 50000, 50000, 50000, 100000, 75000, 150000, 150000, 7500, 7500, 7500, 10000, 250000};
        String[] stringArray2 = new String[]{"30k", "30k", "150k", "150k", "300k", "300k", "450k", "750k", "750k", "750k", "900k", "1500k", "1500k", "1500k", "300M", "2250k", "4500k", "500M", "300k", "300k", "300k", "350k", "1000k"};
        int n5 = 8;
        int n6 = 4;
        int n7 = 0;
        int n8 = 39879;
        rs.n.c.z.a(n4 * 4, e3);
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (n8 == 39967) {
                n8 = 40300;
            }
            String string = stringArray[i2];
            string = string.split(":")[0];
            rs.n.c.z.a(n8, 0, 0x333333, false, 238, 61, string);
            rs.n.c.z.a(n7++, n8++, n6, n5, e3);
            rs.n.c.z.h(n8, "construction/" + (i2 + 4));
            int n9 = 13;
            int n10 = 5;
            if (i2 == 0) {
                n9 = 23;
            }
            if (i2 == 1) {
                n9 = 8;
                n10 = 7;
            }
            if (i2 == 2) {
                n9 = 11;
                n10 = 7;
            }
            if (i2 == 3) {
                n10 = 17;
            }
            if (i2 == 7) {
                n10 = 11;
            }
            if (i2 == 8) {
                n9 = 11;
            }
            if (i2 == 10) {
                n9 = 9;
            }
            if (i2 == 11) {
                n9 = 12;
                n10 = 1;
            }
            if (i2 == 12) {
                n9 = 25;
            }
            if (i2 == 14) {
                n9 = 9;
                n10 = 7;
            }
            if (i2 == 15) {
                n9 = 7;
            }
            if (i2 == 16) {
                n9 = 19;
                n10 = 0;
            }
            if (i2 == 17) {
                n9 = 5;
                n10 = 3;
            }
            if (i2 >= 18) {
                n9 = 6;
                n10 = 3;
            }
            if (i2 == 8) {
                n9 = 11;
            }
            rs.n.c.z.a(n7++, n8++, n6 + n9, n5 + n10, e3);
            rs.n.c.z.a(n8, stringArray[i2], stringArray[i2], 0xFFFFFF, 0xFFFFFF, false, true, 0, 1);
            rs.n.c.z.a(n7++, n8++, n6 + (i2 == 9 ? 75 : 82), n5 + 22, e3);
            rs.n.c.z.a(n8, "<img=9> " + stringArray2[i2] + " gp", stringArray2[i2], 16769316, 16769316, false, true, 0, 1);
            rs.n.c.z.H[n8].X = new int[1][];
            rs.n.c.z.H[n8].bk = new int[1];
            rs.n.c.z.H[n8].bl = new int[1];
            rs.n.c.z.H[n8].X[0] = new int[4];
            rs.n.c.z.H[n8].X[0][0] = 4;
            rs.n.c.z.H[n8].X[0][1] = 3214;
            rs.n.c.z.H[n8].X[0][2] = 995;
            rs.n.c.z.H[n8].X[0][3] = 0;
            rs.n.c.z.H[n8].bk[0] = nArray[i2];
            rs.n.c.z.H[n8].bl[0] = 10;
            rs.n.c.z.a(n7++, n8++, n6 + 243, n5 + 25, e3);
            n5 += 64;
        }
    }
}

