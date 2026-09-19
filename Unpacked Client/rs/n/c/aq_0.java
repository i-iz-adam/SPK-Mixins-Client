/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.aQ
 */
public class aq_0
extends c {
    public static final String[] c = new String[]{"Attack", "Defence", "Strength", "Hitpoints", "Range", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblore", "Agility", "Thieving", "Slayer", "Farming", "Runecrafting", "Construction", "Hunter", "Summoning"};

    private static int b(String string) {
        for (int i2 = 0; i2 < c.length; ++i2) {
            if (!string.equals(c[i2])) continue;
            return i2;
        }
        return -1;
    }

    public aq_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = aq_0.d(3917);
        aq_0.c(19999, 1, "skills/SKILL");
        aq_0.a(50240, "Total Level: 0", 0xFFFF00, false, true, 52, this.a, 2);
        aq_0.a(3, e2);
        aq_0.b(19999, 5, 17, 0, e2);
        aq_0.b(20001, 7, 20, 1, e2);
        aq_0.b(50240, 7, 1, 2, e2);
        e2 = aq_0.d(20001);
        e2.aR = 226;
        e2.P = 163;
        e2.aH = 258;
        aq_0.a(97, e2);
        int n2 = 1;
        int[] nArray = new int[]{3, 3, 3, 34, 34, 34, 66, 66, 66, 98, 98, 98, 131, 131, 131, 162, 162, 162, 195, 195, 195, 228, 228, 228};
        int[] nArray2 = new int[]{24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132, 24, 78, 132};
        int[] nArray3 = new int[]{15, 15, 15, 48, 48, 48, 80, 80, 80, 111, 111, 111, 145, 145, 145, 175, 175, 175, 208, 208, 208, 241, 241, 241};
        int[] nArray4 = new int[]{36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144, 36, 90, 144};
        int[] nArray5 = new int[]{4004, 4016, 4028, 4006, 4018, 4030, 4008, 4020, 4032, 4010, 4022, 4034, 4012, 4024, 4036, 4014, 4026, 4038, 4152, 12166, 13926, 50204, 50206, 50208};
        int[] nArray6 = new int[]{4005, 4017, 4029, 4007, 4019, 4031, 4009, 4021, 4033, 4011, 4023, 4035, 4013, 4025, 4037, 4015, 4027, 4039, 4153, 12167, 13927, 50205, 50207, 50209};
        int[] nArray7 = new int[]{2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109, 2, 56, 109};
        int[] nArray8 = new int[]{0, 0, 0, 32, 32, 32, 64, 64, 64, 96, 96, 96, 128, 128, 128, 160, 160, 160, 192, 192, 192, 224, 224, 224};
        int[] nArray9 = new int[]{50002, 50003, 50004, 50005, 50006, 50007, 50008, 50009, 50010, 50011, 50012, 50013, 50014, 50015, 50016, 50017, 50018, 50019, 50020, 50021, 50022, 50210, 50220, 50230};
        int[] nArray10 = new int[]{50023, 50030, 50037, 50044, 50051, 50058, 50065, 50072, 50080, 50087, 50094, 50101, 50108, 50115, 50122, 50129, 50136, 50143, 50150, 50157, 50164, 50215, 50225, 50235};
        String[] stringArray = new String[]{"Combat", "Combat", "Mining", "Combat", "Agility", "Smithing", "Combat", "Herblore", "Fishing", "Range", "Thieving", "Cooking", "Prayer", "Crafting", "Firemaking", "Magic", "Fletching", "Woodcutting", "Runecrafting", "Slayer", "Farming", "Construction", "Hunter", "Summoning"};
        String[] stringArray2 = new String[]{"Attack", "Hitpoints", "Mining", "Strength", "Agility", "Smithing", "Defence", "Herblore", "Fishing", "Range", "Thieving", "Cooking", "Prayer", "Crafting", "Firemaking", "Magic", "Fletching", "Woodcutting", "Runecrafting", "Slayer", "Farming", "Construction", "Hunter", "Summoning"};
        int[] nArray11 = new int[]{15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28, 15, 25, 28};
        int[] nArray12 = new int[]{34, 34, 34, 66, 66, 66, 98, 98, 98, 130, 130, 130, 162, 162, 162, 83, 83, 83, 118, 118, 118, 153, 153, 153};
        int n3 = 0;
        for (int n4 : nArray5) {
            aq_0.a(n4, "%1", 0xFFFF00, true, true, 52, this.a, 0);
            if (n4 == 50208) {
                aq_0.b(n4, 99999, 999999, n2, e2);
            } else {
                aq_0.b(n4, nArray2[n2 - 1] + 7, nArray[n2 - 1] + 1, n2, e2);
            }
            int[][] nArray13 = new int[1][3];
            nArray13[0][0] = 1;
            nArray13[0][1] = aq_0.b(stringArray2[n3++]);
            nArray13[0][2] = 0;
            aq_0.H[n4].X = nArray13;
            ++n2;
        }
        int n5 = 0;
        n3 = 0;
        for (int n6 : nArray6) {
            aq_0.a(n6, "%1", 0xFFFF00, true, true, 52, this.a, 0);
            if (n6 == 50209) {
                aq_0.b(n6, 99999, 999999, n2, e2);
            } else {
                aq_0.b(n6, nArray4[n5] + 7, nArray3[n5] + 1, n2, e2);
            }
            int[][] nArray14 = new int[1][3];
            nArray14[0][0] = 2;
            nArray14[0][1] = aq_0.b(stringArray2[n3++]);
            nArray14[0][2] = 0;
            aq_0.H[n6].X = nArray14;
            ++n2;
            ++n5;
        }
        int n7 = 0;
        for (int n8 : nArray9) {
            aq_0.a(n8, 0, "", stringArray[n7], 1, nArray10[n7], this.a, stringArray2[n7]);
            if (n8 == 50230) {
                aq_0.b(n8, 9999999, 99999999, n2, e2);
            } else {
                aq_0.b(n8, nArray7[n7], nArray8[n7], n2, e2);
            }
            ++n2;
            ++n7;
        }
        int n9 = 0;
        for (int n10 : nArray10) {
            if (n10 == 50235) {
                aq_0.b(n10, 9999999, 99999999, n2, e2);
            } else {
                aq_0.b(n10, nArray11[n9], nArray12[n9], n2, e2);
            }
            ++n2;
            ++n9;
        }
        aq_0.c(20200, 0, "skills/SKILL");
        aq_0.b(20200, 0, 0, 0, e2);
    }

    public static void a(int n2, int n3, String string, String string2, int n4, int n5, k_0[] k_0Array, String string3) {
        e e2 = aq_0.d(n2);
        e2.aw = n2;
        e2.ah = n2;
        e2.aI = 5;
        e2.M = n4;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = n5;
        e2.E = new f_0("skills/" + string);
        e2.aG = new f_0("skills/" + string);
        e2.P = 53;
        e2.aR = 32;
        e2.Q = "View " + string2 + " Guide";
        e2 = aq_0.d(n5);
        e2.aQ = true;
        e2.aI = 0;
        e2.M = 0;
        e2.ab = -1;
        e2.P = 512;
        e2.aR = 334;
        e2.ah = n5;
        e2.aw = n5;
        aq_0.a(n5 + 1, 0, false, 0, string3 + " Lvl:\nCurrentXP:\nNext Lvl:\nRemainder:");
        aq_0.a(1, e2);
        aq_0.b(n5 + 1, 0, 0, 0, e2);
    }

    public static void b(int n2, String string, int n3, boolean bl, boolean bl2, int n4, k_0[] k_0Array, int n5) {
        e e2 = aq_0.j(n2);
        e2.ah = n2;
        e2.aw = n2;
        e2.aI = 4;
        e2.M = 0;
        e2.P = 0;
        e2.aR = 0;
        e2.J = 0;
        e2.aC = 0;
        e2.ab = n4;
        e2.S = bl;
        e2.aS = bl2;
        e2.ao = k_0Array[n5];
        e2.at = string;
        e2.ad = n3;
    }
}

