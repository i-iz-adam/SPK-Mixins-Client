/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 */
package rs.d;

import gnu.trove.f.b.cc;
import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import rs.Client;
import rs.a.h;
import rs.d.p;
import rs.f.a;
import rs.f_0;
import rs.gui.Launcher;
import rs.l.b.a.a.a;
import rs.l.b.a.a.b;
import rs.l.c;
import rs.l.e_0;
import rs.t;
import rs.t.a.d;
import rs.x.e;
import rs.x.f;

public final class k {
    public static int a = 30000;
    public static d b;
    public static cc<k> c;
    public static String d;
    private static long[][][] ay;
    public static long e;
    private static String[] az;
    private static String[][] aA;
    public int f;
    public int[] g;
    public int[] h;
    public int i;
    public static f_0 j;
    public static f_0 k;
    public static f_0 l;
    public static f_0 m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String[] u;
    public int v;
    public String w;
    public String x;
    public static k[] y;
    public int z;
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public byte[] E;
    public int F;
    private static int aB;
    public int G;
    public static boolean H;
    private static e aC;
    private static e aD;
    private static e aE;
    public int I;
    public int J;
    public int K;
    public String[] L;
    public int M;
    public int N;
    public int O;
    public int[] P;
    public int[][][] Q;
    public int R;
    public int[] S;
    public int[] T;
    public boolean U;
    public boolean V;
    public int W;
    private static int[] aF;
    public int X;
    public int Y;
    public int Z;
    public int aa;
    public int[] ab;
    public int ac;
    public static int ad;
    public int ae;
    public byte af;
    public byte ag;
    public byte ah;
    public byte ai;
    public byte aj;
    public byte ak;
    public byte al;
    public byte am;
    public byte an;
    public byte ao;
    public byte ap;
    public byte aq;
    public boolean ar = false;
    public int as = -1;
    public int at = -1;
    public int au = -3;
    public int av = -1;
    public rs.a.b.c aw;
    public boolean ax = false;

    public static boolean a(k k2, int n2) {
        if (n2 == 22146 || n2 == 22147) {
            Launcher.n().o().a(60, 20L);
            Launcher.n().o().a(61, 20L);
            return true;
        }
        if (n2 == 24043 || n2 == 24237) {
            Launcher.n().o().a(58, 20L);
            Launcher.n().o().a(62, 20L);
            return true;
        }
        if (n2 >= 23941 && n2 <= 23944 || n2 == 23955) {
            Launcher.n().o().a(261, 20L);
            return true;
        }
        if (n2 == 22273 || n2 == 22274 || n2 == 22276) {
            Launcher.n().o().a(105, 20L);
            return true;
        }
        if (n2 == 22282) {
            Launcher.n().o().a(56, 20L);
            return true;
        }
        if (n2 == 22260 || n2 == 22261 || n2 == 28789) {
            Launcher.n().o().a(61, 20L);
            Launcher.n().o().a(60, 20L);
            Launcher.n().o().a(70, 20L);
            Launcher.n().o().a(55, 20L);
            Launcher.n().o().a(68, 20L);
            Launcher.n().o().a(337, 20L);
            Launcher.n().o().a(261, 20L);
            return true;
        }
        if (n2 > 0 && k2 != null && k2.U) {
            if (k2.R > 0) {
                Launcher.n().o().a(k2.R, 20L);
                return true;
            }
            if (k2.T != null && k2.T.length > 0) {
                for (int n3 : k2.T) {
                    Launcher.n().o().a(n3, 20L);
                }
                return true;
            }
            if (k2.aw != null && k2.aw.c()) {
                for (int n4 : k2.aw.g().a()) {
                    Launcher.n().o().a(n4, 20L);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(h h2, int n2) {
        try {
            return rs.d.k.c(null, h2, n2);
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static boolean a(k k2, h h2, int n2) {
        if (n2 == 28789) {
            if (rs.f.a.n == a.d.f || rs.f.a.n == a.d.e) {
                rs.d.k.a(h2, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{56, 56, 56, 56, 72, 56});
            } else if (rs.f.a.n == a.d.d) {
                rs.d.k.a(h2, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{60, 60, 60, 60, 68, 60});
            } else if (rs.f.a.n == a.d.b) {
                rs.d.k.a(h2, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{179, 179, 179, 179, 56, 179});
            } else {
                rs.d.k.a(h2, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{337, 261, 337, 337, 261, 337});
            }
            return true;
        }
        return false;
    }

    public static boolean b(k k2, h h2, int n2) {
        if (!rs.f.a.M) {
            return false;
        }
        if (h2 == null) {
            return true;
        }
        switch (n2) {
            case 24238: {
                h2.a(new int[]{898}, new int[]{0});
                h2.b(new int[]{156, 278, 3509, 6323, 7500, 8410, 3621, 3501, 167, 972, 2576, 2368, 38119, 163, 6323, 8410, 2368, 3621}, new int[]{339, 339, 262, 339, 339, 339, 262, 262, 262, 262, 262, 339, 262, 262, 339, 339, 339, 339});
                break;
            }
            case 24170: {
                h2.a(new int[]{20288, 0, 6466, -17221, 5318, 5202, 5330, 5210, 6241, 289, 6439, 6445, 1327, 1139, 6453, 5305, -15164, 5309}, new int[]{1});
                h2.a(new int[]{1226, 204, -18381, -15193, 214, -15202, -4004, 6245, 1319, 293, 6443, 6447, 6451}, new int[]{2});
                h2.a(new int[]{-15185, 6449, -15189, 277, 6435, 6261, -4024, 6455, 1209, 313, 6457, -15168}, new int[]{5});
                h2.b(new int[]{1, 2}, new int[]{208, 277});
                break;
            }
            case 24145: {
                h2.b(new int[]{5524, 5400, 5404, 4013, 5014, 4009, 3889, 5648, 2977, 4783, 4665, 4903, 43086, 43094, 4669, 4674, 5002, 5840, 5832, 4653, 4005, 3881, 3757, 3761, 4001, 4003, 4785, 4779, 3982, 4657, 6717, 6713, 6709, 3885, 4649, 6722, 4661, 4781, 4777, 3765}, new int[]{180, 180, 180, 180, 212, 180, 212, 60, 60, 212, 60, 212, 180, 212, 180, 212, 180, 60, 180, 212, 212, 60, 60, 180, 212, 180, 212, 180, 212, 212, 212, 212, 212, 60, 212, 60, 81, 60, 60, 60});
                h2.h(5);
                break;
            }
            case 24050: {
                h2.a(new int[]{43119}, new int[]{374770});
                h2.a(new int[]{43123}, new int[]{15});
                h2.a(new int[]{43183, 43105, 7322, 33595, 33604, 34927, 43059, 43063}, new int[]{1});
                h2.a(new int[]{38119, 37099, 35955, 35949}, new int[]{2});
                h2.b(new int[]{1, 2}, new int[]{120, 277});
                return true;
            }
            case 24020: 
            case 24021: 
            case 24022: {
                h2.b(new int[]{0, 45, 28, 16, 37, 410, 412, 5400, 3346, 268, 398, 4550, 278}, new int[]{140, 221, 221, 140, 221, 221, 221, 140, 221, 221, 221, 221, 140});
                return true;
            }
            case 23945: {
                h2.b(new int[]{110343, 15413, 15421, 15405, 16433, 900, 0, 908, 907, 904, 903, 911, 915, 899, 31420, 16441, 16656}, new int[]{261, 261, 60, 68, 60, 60, 68, 60, 80, 60, 80, 60, 60, 68, 70, 261, 261});
                h2.h(5, 265);
                h2.g(35, -1);
                return true;
            }
            case 25405: {
                h2.a(61718, new int[]{491752});
                h2.a(new int[]{43086, 43076}, new int[]{491765, 491765});
                h2.a(new int[]{38036, 38044}, new int[]{359770, 359770});
                h2.a(new int[]{62748, 58642, 38049}, new int[]{491770, 491770, 491770});
                return true;
            }
            case 24210: {
                h2.a(61718, new int[]{17});
                h2.a(new int[]{43086, 43076}, new int[]{20, 20});
                h2.a(new int[]{38036, 38044}, new int[]{35, 35});
                h2.a(new int[]{62748, 58642, 38049}, new int[]{25, 25, 25});
                rs.d.k.a(h2, new int[]{35, 20}, new int[]{279, 279});
                return true;
            }
            case 24211: {
                h2.a(61718, new int[]{17});
                h2.a(new int[]{43086, 43076}, new int[]{20, 20});
                h2.a(new int[]{38036, 38044}, new int[]{35, 35});
                h2.a(new int[]{62748, 58642, 38049}, new int[]{25, 25, 25});
                rs.d.k.a(h2, new int[]{35, 20}, new int[]{180, 180});
                return true;
            }
            case 22098: {
                rs.d.k.a(h2, new int[]{7748, 7892, 7739, 7752, 7888, 7756}, new int[]{71, 71, 54, 54, 54, 54});
                return true;
            }
            case 22096: 
            case 22097: {
                rs.d.k.a(h2, new int[]{50062, 48035, 8, 41, 34, 24, 31, 18, 50078}, new int[]{71, 71, 71, 71, 71, 71, 71, 71, 71});
                return true;
            }
            case 22094: 
            case 22095: {
                rs.d.k.a(h2, new int[]{22424}, new int[]{71});
                return true;
            }
            case 22074: {
                rs.d.k.a(h2, new int[]{43150, 43034, 37, 33}, new int[]{62, 62, 62, 62});
                return true;
            }
            case 22073: {
                rs.d.k.a(h2, new int[]{2983, 914, 6082, 23492, 23483, 4013, 4011, 8150, 4013, 2733, 4011, 2880, 28, 10167, 1946, 2983, 914, 4013, 2733, 4011, 2880, 28, 29867, 6084}, new int[]{60, 109, 109, 109, 109, 109, 109, 60, 109, 109, 109, 60, 109, 109, 109, 109, 109, 60, 109, 109, 109, 109, 109, 109});
                return true;
            }
            case 22072: 
            case 22075: {
                if (h2 != null) {
                    h2.a(new int[]{302770, 302770, 302770, 306770, 306770, 296770});
                }
                if (n2 == 22075) {
                    rs.d.k.a(h2, new int[]{296770, 306770, 302770}, new int[]{72, 72, 79});
                }
                return true;
            }
            case 22068: {
                int n3 = 62;
                int n4 = 109;
                if (h2 != null) {
                    h2.g(70, -1);
                }
                rs.d.k.a(h2, new int[]{9779, 9803, 9772, 9797, 9786, 9806, 9781, 9764, 9793, 9810, 9789, 9799, 9778, 9773, 9792, 9808, 9828, 9827, 9756, 9782, 9790}, new int[]{109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109});
                return true;
            }
            case 22069: {
                int n5 = 109;
                if (h2 != null) {
                    h2.g(70, -1);
                }
                rs.d.k.a(h2, new int[]{21779, 21777, 21775, 21787, 21797}, new int[]{109, 109, 109, 109, 109});
                return true;
            }
            case 22001: {
                rs.d.k.a(h2, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{60, 109, 109, 109, 109, 60, 109});
                return true;
            }
            case 22002: {
                rs.d.k.a(h2, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{60, 62, 62, 62, 62, 60, 62});
                return true;
            }
            case 22160: {
                rs.d.k.a(h2, new int[]{5219, 910, 1938, 1690, 912, 962, 8, 78, 910, 912}, 60);
                return true;
            }
            case 21956: {
                if (h2 != null) {
                    h2.a(new int[]{25, 24});
                    h2.b(new int[]{25, 24}, new int[]{55, 72});
                }
                return true;
            }
            case 24016: {
                h2.a(new int[]{1, 1, 1, 1, 1, 2});
                h2.b(new int[]{1, 2}, new int[]{60, 66});
                return true;
            }
            case 24017: {
                h2.a(new int[]{1, 1, 2});
                h2.b(new int[]{1, 2}, new int[]{69, 57});
                return true;
            }
            case 24018: {
                h2.a(new int[]{1, 1, 2});
                h2.b(new int[]{1, 2}, new int[]{63, 72});
                return true;
            }
            case 24019: {
                h2.a(new int[]{1, 1, 1, 1, 2});
                h2.b(new int[]{1, 2}, new int[]{140, 76});
                return true;
            }
            case 25415: {
                h2.a(43063, new int[]{5});
                h2.a(8404, new int[]{15});
                h2.a(43084, new int[]{15});
                h2.a(7378, new int[]{15});
                h2.a(43072, new int[]{5});
                h2.a(43224, new int[]{5});
                h2.a(49, new int[]{25});
                h2.a(57, new int[]{25});
                h2.a(8398, new int[]{15});
                h2.a(43080, new int[]{5});
                h2.a(66, new int[]{15});
                h2.a(7362, new int[]{15});
                h2.a(8377, new int[]{15});
                h2.b(new int[]{8286, 8390, 25, 15, 5}, new int[]{91, 91, 91, 61, 62});
                h2.g(0, -1);
                h2.g(950);
                h2.a(950, new int[]{926, 936, 946});
                return true;
            }
            case 25425: {
                h2.a(43063, new int[]{5});
                h2.a(8404, new int[]{15});
                h2.a(43084, new int[]{15});
                h2.a(7378, new int[]{15});
                h2.a(43072, new int[]{5});
                h2.a(43224, new int[]{5});
                h2.a(49, new int[]{25});
                h2.a(57, new int[]{25});
                h2.a(8398, new int[]{15});
                h2.a(43080, new int[]{5});
                h2.a(66, new int[]{15});
                h2.a(7362, new int[]{15});
                h2.a(8377, new int[]{15});
                h2.b(new int[]{8286, 15, 25, 15, 5}, new int[]{91, 61, 61, 60, 60});
                h2.g(10);
                return true;
            }
            case 22159: {
                if (h2 != null) {
                    h2.b(new int[]{7114, 3018, 7112, 2756, 9166}, new int[]{62, 62, 60, 60, 60});
                }
                return true;
            }
            case 22161: {
                if (h2 != null) {
                    h2.b(new int[]{32850, 8410, 8660, 8404, 32834, 10318, 7607, 8396, 8388, 7624, 10326, 10334, 8412, 32786, 555, 10339, 280}, new int[]{62, 62, 60, 60, 60, 62, 62, 60, 60, 60, 62, 62, 60, 60, 60, 60, 60});
                }
                return true;
            }
            case 22029: {
                if (h2 != null) {
                    h2.a(new int[]{25, 24});
                    h2.b(new int[]{25, 24}, new int[]{60, 62});
                }
                return true;
            }
            case 22128: {
                if (h2 != null) {
                    h2.a(new int[]{44938, 44948});
                }
                return true;
            }
            case 22129: {
                if (h2 != null) {
                    h2.a(new int[]{25, 24});
                    h2.b(new int[]{25, 24}, new int[]{60, 54});
                }
                return true;
            }
            case 22030: {
                if (h2 != null) {
                    h2.a(new int[]{25, 24});
                    h2.b(new int[]{25, 24}, new int[]{81, 109});
                }
                return true;
            }
            case 22157: {
                if (h2 != null) {
                    h2.a(90, new int[]{95, 70, 95, 70, 95});
                    h2.a(10304, new int[]{95, 70, 95, 70, 95});
                    h2.b(new int[]{70, 95, 10291, 10304}, new int[]{62, 60, 62, 60});
                }
                return true;
            }
            case 22158: {
                if (h2 != null) {
                    h2.b(new int[]{61, 57, 53, 49, 41, 37, 33, 28, 7208, 7233, 7231, 7213, 7221, 7226, 7228, 7223}, new int[]{62, 60, 62, 60, 60, 60, 60, 60, 62, 60, 60, 60, 61, 60, 62, 60});
                }
                return true;
            }
            case 22083: 
            case 22084: {
                if (h2 != null) {
                    h2.a(61962, new int[]{52122});
                    h2.a(61718, new int[]{52106});
                    h2.b(new int[]{18215, 18200, 18229, 18118, 18000, 16, 18, 39, 35, 28}, new int[]{60, 60, 107, 107, 60, 60, 108, 60, 102, 102});
                }
                return true;
            }
            case 21873: {
                if (h2 != null) {
                    h2.a(5018, new int[]{100, 100, 127, 127, 100});
                }
                rs.d.k.a(h2, new int[]{11177, 61, 10351, 127, 100}, new int[]{60, 60, 60, 80, 80});
                return true;
            }
            case 21872: {
                if (h2 != null) {
                    h2.a(3008, new int[]{3010, 3011, 3012, 3013, 3014});
                }
                rs.d.k.a(h2, new int[]{43164, 5056, 43061, 43053, 43026, 3010, 3011, 3012, 3013, 3014}, new int[]{60, 89, 58, 89, 58, 58, 91, 91, 58, 91});
                return true;
            }
            case 21767: {
                rs.d.k.a(h2, new int[]{38350, 37295, 40094}, new int[]{62, 62, 62});
                return true;
            }
            case 21819: {
                rs.d.k.a(h2, new int[]{41, 16, 8, 24, 33, 13223, 14236}, new int[]{56, 72, 72, 101, 56, 81, 81});
                return true;
            }
            case 21818: {
                rs.d.k.a(h2, new int[]{11144}, new int[]{56});
                return true;
            }
            case 21809: 
            case 21810: 
            case 21811: {
                rs.d.k.a(h2, new int[]{54546, 105, 24}, new int[]{n2 == 21811 ? 102 : 118, 118, 72});
                return true;
            }
            case 21812: 
            case 21813: 
            case 21814: {
                rs.d.k.a(h2, new int[]{54546, 105, 24}, new int[]{118, 102, 62});
                return true;
            }
            case 21815: 
            case 21816: 
            case 21817: {
                rs.d.k.a(h2, new int[]{54546, 105, 24}, new int[]{n2 == 21817 ? 102 : 118, 118, 58});
                return true;
            }
            case 21661: {
                rs.d.k.a(h2, new int[]{37, 49, 41, 57, 33, 16, 156, 142, 20}, new int[]{62, 61, 62, 62, 62, 62, 61, 62, 61});
                return true;
            }
            case 21662: {
                rs.d.k.a(h2, new int[]{43150, 43034, 43047, 43059, 43030, 43090, 43113}, new int[]{61, 60, 60, 60, 60, 61, 61});
                return true;
            }
            case 21664: {
                rs.d.k.a(h2, 43117, 62);
                return true;
            }
        }
        return false;
    }

    /*
     * Opcode count of 39036 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    public static boolean c(k k2, h h2, int n2) {
        if (h2 == null) {
            return true;
        }
        if (k2 != null) {
            if (k2.R != 0) {
                rs.d.k.b(h2, k2.R);
                return true;
            }
            if (k2.S != null && k2.S.length > 0) {
                if (k2.S.length != k2.T.length) {
                    return false;
                }
                rs.d.k.a(h2, k2.S, k2.T);
            }
        }
        if (rs.d.k.b(k2, h2, n2)) {
            return true;
        }
        if (rs.d.k.a(k2, h2, n2)) {
            return true;
        }
        switch (n2) {
            case 21663: {
                rs.d.k.a(h2, new int[]{12, 57, 28, 20, 24, 16}, new int[]{61, 61, 62, 62, 62, 62});
                return true;
            }
            case 23228: {
                rs.d.k.b(h2, 53);
                return true;
            }
            case 23109: {
                rs.d.k.a(h2, new int[]{33569, 24474}, new int[]{56, 58});
                return true;
            }
            case 22006: {
                rs.d.k.a(h2, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{93, 60, 86, 60, 60});
                return true;
            }
            case 22007: {
                rs.d.k.a(h2, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{89, 78, 86, 60, 60});
                return true;
            }
            case 22008: {
                rs.d.k.a(h2, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{58, 83, 83, 60, 60});
                return true;
            }
            case 22115: {
                rs.d.k.a(h2, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{54, 60, 54, 54, 54});
                return true;
            }
            case 21660: {
                rs.d.k.b(h2, 61);
                return true;
            }
            case 23110: {
                rs.d.k.a(h2, new int[]{43115, 41783, 127}, new int[]{72, 81, 72});
                return true;
            }
            case 23112: {
                rs.d.k.a(h2, new int[]{929, 918, 924, 935, 24}, new int[]{62, 62, 62, 62, 60});
                return true;
            }
            case 23075: {
                rs.d.k.a(h2, new int[]{35251, 35247, 32856, 32852, 35255, 16462, 17500, 35259, 35264, 22464, 35270, 15434, 16450, 16466, 58419, 16470, 54313, 54317, 54309, 54290, 58539, 54302, 54298, 40757, 40637, 37828, 40871}, new int[]{62, 62, 62, 62, 62, 62, 60, 61, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62});
                return true;
            }
            case 23074: {
                rs.d.k.a(h2, new int[]{1938, 912, 910, 809, 1814, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{62, 60, 62, 60, 62, 60, 60, 60, 60, 60, 60, 60});
                return true;
            }
            case 23170: {
                rs.d.k.a(h2, new int[]{37403, 8004, 8136, 38672, 38305, 38313, 38309, 38424, 38300, 37526, 62371, 62375, 7872, 7995, 6978, 7991, 7110, 13, 63405, 63411}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54});
                if (h2 != null) {
                    h2.g(311770);
                    h2.g(0, -1);
                }
                return true;
            }
            case 14486: 
            case 14487: 
            case 22041: 
            case 22042: 
            case 22043: 
            case 22044: 
            case 22045: 
            case 22046: 
            case 22047: 
            case 22048: 
            case 22049: 
            case 22050: 
            case 22051: 
            case 22052: {
                if (h2 != null) {
                    h2.g(30, -1);
                }
                return true;
            }
            case 21834: 
            case 21835: 
            case 21836: 
            case 21837: 
            case 21838: 
            case 21839: 
            case 21840: 
            case 21841: 
            case 21842: 
            case 21843: 
            case 22156: {
                rs.d.k.a(h2, new int[]{43906, 41366, 20, 8, 12, 24, 926, 941, 918}, new int[]{60, 60, 60, 60, 60, 60, 62, 62, 62});
                h2.g(10);
                h2.g(0, -1);
                return true;
            }
            case 23068: {
                rs.d.k.a(h2, new int[]{9529, 5008}, new int[]{62, 62});
                return true;
            }
            case 23067: {
                rs.d.k.a(h2, new int[]{9529, 5008}, new int[]{59, 59});
                return true;
            }
            case 23069: {
                rs.d.k.a(h2, new int[]{61, 57, 70, 5912, 6930}, new int[]{59, 59, 59, 62, 62});
                return true;
            }
            case 23073: {
                rs.d.k.a(h2, new int[]{7690}, new int[]{62});
                return true;
            }
            case 23072: {
                rs.d.k.a(h2, new int[]{61, 924, 916, 932}, new int[]{60, 62, 60, 60});
                return true;
            }
            case 23071: {
                rs.d.k.a(h2, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989}, new int[]{60, 62, 60, 62, 62, 60, 60});
                return true;
            }
            case 22124: {
                h2.a(22428, new int[]{7114});
                h2.a(22433, new int[]{44948});
                h2.a(22437, new int[]{5});
                h2.a(19129, new int[]{44948});
                h2.a(19119, new int[]{44948});
                h2.a(12853, new int[]{7114});
                h2.a(12989, new int[]{5});
                h2.a(933, new int[]{44948});
                h2.a(939, new int[]{44948});
                return true;
            }
            case 22125: {
                rs.d.k.a(h2, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{60, 54, 60, 54, 54, 60, 60, 54, 54});
                return true;
            }
            case 23225: {
                rs.d.k.a(h2, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{60, 68, 60, 68, 68, 60, 60, 60, 60});
                return true;
            }
            case 22113: {
                rs.d.k.a(h2, new int[]{32889, 32875, 33891, 32844, 32858, 24, 33, 13223, 14236, 15256}, new int[]{54, 60, 60, 60, 60, 54, 54, 76, 76, 76});
                return true;
            }
            case 22114: {
                rs.d.k.a(h2, new int[]{12484, 16, 12475, 12, 28, 20, 37, 41, 30643, 13493, 0, 29601, 24, 33, 29609}, new int[]{54, 60, 60, 60, 60, 60, 60, 60, 76, 76, 76, 76, 60, 60, 76});
                return true;
            }
            case 22116: {
                rs.d.k.a(h2, new int[]{35255, 17500, 16462, 35247, 35251, 35259, 35270, 35264, 16450, 54317, 58419, 16466, 15434, 58539, 54302, 40757, 40871, 35012, 103, 34991, 0, 10291, 37060, 10279, 6028, 929, 28, 33}, new int[]{60, 54, 54, 60, 60, 76, 76, 60, 54, 65, 54, 65, 60, 65, 60, 54, 60, 54, 77, 60, 76, 60, 76, 54, 76, 54, 77, 77});
                return true;
            }
            case 22286: {
                rs.d.k.a(h2, new int[]{35255, 17500, 16462, 35247, 35251, 35259, 35270, 35264, 16450, 54317, 58419, 16466, 15434, 58539, 54302, 40757, 40871, 35012, 103, 34991, 0, 10291, 37060, 10279, 6028, 929, 28, 33}, new int[]{105, 56, 56, 105, 105, 76, 76, 105, 56, 65, 56, 65, 105, 65, 105, 56, 105, 56, 77, 105, 76, 105, 76, 56, 76, 56, 77, 77});
                return true;
            }
            case 22450: 
            case 22451: 
            case 22452: {
                h2.g(100, -1);
                h2.a(8650, new int[]{36190, 36195, 36185});
                h2.a(43047, new int[]{36190, 36195, 36185});
                h2.a(43088, new int[]{36190, 36195, 36185});
                h2.a(43047, new int[]{36190, 36195, 36185});
                h2.a(43072, new int[]{36170, 36195, 36185});
                h2.a(43063, new int[]{36180, 36195, 36185});
                h2.a(43096, new int[]{36155, 36165, 36150});
                h2.b(new int[]{8650, 43096, 43047, 43088, 0, 43072, 43063, 43080, 8658, 43030, 43084, 43076}, new int[]{101, 56, 101, 101, 101, 56, 101, 56, 101, 101, 56, 101});
                return true;
            }
            case 23160: {
                rs.d.k.a(h2, new int[]{22, 21656, 21656, 18, 16656, 14259}, 80);
                return true;
            }
            case 22243: 
            case 23065: {
                h2.a(new int[]{347770, 311770, 347770, 311770});
                return true;
            }
            case 23064: {
                rs.d.k.a(h2, new int[]{10462, 10448, 127, 10475, 52797, 52919, 51763, 55207, 52777}, new int[]{60, 62, 61, 40, 57, 57, 62, 57, 40});
                return true;
            }
            case 23062: {
                rs.d.k.a(h2, new int[]{33690, 33701, 6067, 68, 51, 39}, new int[]{60, 62, 61, 40, 57, 40});
                return true;
            }
            case 24262: {
                rs.d.k.a(h2, new int[]{37403, 8004, 8136, 38672, 38305, 38313, 38309, 38424, 38300, 37526, 62371, 62375, 7872, 7995, 6978, 7991, 7110, 13, 63405, 63411}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 71, 71, 71, 71, 71, 71, 71, 71, 71, 71});
                h2.g(7114);
                return true;
            }
            case 23049: 
            case 23050: 
            case 23051: 
            case 23052: {
                rs.d.k.b(h2, 66);
                return true;
            }
            case 21282: {
                rs.d.k.a(h2, new int[]{5405, 6449, 5409, 7390}, new int[]{60, 60, 30, 29});
                return true;
            }
            case 21276: {
                rs.d.k.a(h2, new int[]{7079, 8111, 8107, 11175}, new int[]{30, 29, 29, 60});
                return true;
            }
            case 24095: {
                rs.d.k.a(h2, new int[]{7079, 8111, 8107}, new int[]{53, 61, 61});
                return true;
            }
            case 23047: {
                rs.d.k.a(h2, new int[]{10270, 10285}, new int[]{63, 71});
                return true;
            }
            case 23038: {
                rs.d.k.a(h2, new int[]{5268, 5392}, 54);
                return true;
            }
            case 23039: {
                rs.d.k.a(h2, new int[]{10403, 10407}, 54);
                return true;
            }
            case 23040: {
                rs.d.k.a(h2, new int[]{5276, 5293, 5289, 5285}, 54);
                return true;
            }
            case 23041: {
                rs.d.k.a(h2, new int[]{5169, 5161}, 54);
                return true;
            }
            case 24126: {
                h2.a(7335, new int[]{36172});
                h2.a(202, new int[]{59724});
                h2.a(7343, new int[]{59724});
                h2.a(5165, new int[]{59724});
                h2.a(7376, new int[]{36172});
                h2.a(7339, new int[]{59724});
                h2.a(5161, new int[]{36172});
                h2.a(5169, new int[]{59724});
                h2.a(910, new int[]{36172});
                h2.a(65535, new int[]{36172});
                return true;
            }
            case 24127: {
                h2.a(7343, new int[]{59734});
                h2.a(5165, new int[]{36172});
                h2.a(7339, new int[]{36172});
                h2.a(5161, new int[]{36172});
                h2.a(5169, new int[]{59744});
                h2.a(910, new int[]{36172});
                h2.a(65535, new int[]{36172});
                rs.d.k.a(h2, new int[]{7335, 202, 7376}, new int[]{72, 72, 72});
                return true;
            }
            case 24128: {
                rs.d.k.a(h2, new int[]{7335, 202, 7343, 5165, 7376, 7339, 5161, 5169, 910, 65535}, new int[]{55, 72, 55, 72, 55, 72, 55, 72, 55, 72});
                return true;
            }
            case 23033: {
                rs.d.k.a(h2, new int[]{7335, 203, 7343, 5166, 7376, 7340, 5162, 5170, 911, 65535}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60});
                return true;
            }
            case 23030: {
                rs.d.k.a(h2, new int[]{127, 476, 960, 0, 9672}, new int[]{72, 55, 72, 55, 55});
                return true;
            }
            case 22282: {
                h2.a(61, new int[]{62, 63});
                h2.b(new int[]{62, 63, 8757}, new int[]{56, 101, 90});
                return true;
            }
            case 23480: {
                h2.g(45000);
                return true;
            }
            case 23481: {
                h2.g(64);
                return true;
            }
            case 23482: {
                h2.g(6100);
                return true;
            }
            case 23483: {
                h2.g(58000);
                return true;
            }
            case 22270: 
            case 22271: 
            case 22272: {
                if (h2 != null) {
                    h2.g(70, -1);
                    h2.a(4382, new int[]{36190, 36195, 36185});
                    h2.a(4785, new int[]{36185, 36192, 36180});
                    h2.a(4661, new int[]{36170, 36175, 36160});
                    h2.a(4626, new int[]{36190, 36195});
                    h2.a(4781, new int[]{127});
                    h2.a(8427, new int[]{127});
                    h2.b(new int[]{127}, new int[]{116});
                }
                return true;
            }
            case 22455: {
                h2.a(33680, new int[]{6926});
                h2.a(33690, new int[]{6926});
                h2.a(33674, new int[]{6926});
                h2.a(48055, new int[]{6926});
                h2.a(48045, new int[]{6926});
                h2.a(49083, new int[]{6926});
                h2.b(new int[]{29603, 33680, 33692, 29656, 33690, 33674, 33668, 48055, 49069, 48045, 50114, 49083}, new int[]{60, 54, 60, 60, 54, 54, 60, 54, 60, 54, 60, 54});
                return true;
            }
            case 22456: {
                h2.a(33680, new int[]{6920});
                h2.a(33690, new int[]{6920});
                h2.a(33674, new int[]{6920});
                h2.b(new int[]{29603, 33680, 33692, 29656, 33690, 33674, 33668, 48055, 49069, 48045, 50114, 49083}, new int[]{60, 96, 60, 60, 96, 96, 60, 96, 60, 96, 60, 96});
                return true;
            }
            case 22457: {
                h2.b(new int[]{29603, 33680, 33692, 29656, 33690, 33674, 33668, 48055, 49069, 48045, 50114, 49083}, new int[]{60, 96, 60, 60, 96, 96, 60, 96, 60, 96, 60, 96});
                return true;
            }
            case 23003: {
                h2.a(5712, new int[]{2391});
                h2.a(10714, new int[]{90});
                return true;
            }
            case 22122: {
                h2.a(new int[]{44948, 44940, 44935});
                return true;
            }
            case 22123: {
                h2.a(71, new int[]{90});
                h2.a(72, new int[]{90});
                h2.a(97, new int[]{95});
                h2.a(98, new int[]{95});
                h2.a(88, new int[]{110});
                h2.a(89, new int[]{110});
                rs.d.k.a(h2, new int[]{90, 95, 110}, new int[]{60, 60, 54});
                return true;
            }
            case 23465: {
                h2.a(71, new int[]{1});
                h2.a(72, new int[]{1});
                h2.a(97, new int[]{3});
                h2.a(98, new int[]{22});
                h2.a(88, new int[]{127});
                h2.a(89, new int[]{127});
                rs.d.k.a(h2, new int[]{3, 22}, new int[]{60, 60});
                h2.g(0, -1);
                return true;
            }
            case 23485: {
                rs.d.k.a(h2, new int[]{10283, 8377, 24, 7333, 8390}, new int[]{57, 57, 57, 57, 57});
                return true;
            }
            case 23490: {
                h2.a(71, new int[]{1});
                h2.a(72, new int[]{1});
                h2.a(97, new int[]{3});
                h2.a(98, new int[]{22});
                h2.a(88, new int[]{4});
                h2.a(89, new int[]{4});
                rs.d.k.a(h2, new int[]{3, 22, 4}, new int[]{57, 57, 57});
                return true;
            }
            case 23492: {
                h2.a(43113, new int[]{4});
                h2.a(43092, new int[]{4});
                h2.a(43121, new int[]{4});
                h2.a(43117, new int[]{4});
                h2.a(43096, new int[]{4});
                rs.d.k.a(h2, new int[]{4}, new int[]{93});
                return true;
            }
            case 24195: {
                h2.a(43113, new int[]{4});
                h2.a(43092, new int[]{4});
                h2.a(43121, new int[]{4});
                h2.a(43117, new int[]{4});
                h2.a(43096, new int[]{4});
                rs.d.k.a(h2, new int[]{4, 41372, 43328, 41257}, new int[]{60, 54, 54, 54});
                return true;
            }
            case 23466: {
                h2.a(7721, new int[]{127});
                h2.a(20, new int[]{1});
                h2.a(0, new int[]{127});
                h2.a(6932, new int[]{3});
                h2.g(0, -1);
                return true;
            }
            case 23467: {
                h2.a(20, new int[]{7114});
                h2.a(6932, new int[]{7114});
                return true;
            }
            case 23468: {
                h2.a(7721, new int[]{1});
                h2.a(20, new int[]{7114});
                h2.a(0, new int[]{127});
                h2.a(6932, new int[]{7114});
                rs.d.k.a(h2, new int[]{7114}, new int[]{54});
                return true;
            }
            case 22220: {
                rs.d.k.a(h2, new int[]{20, 924, 30, 10308, 14395, 39, 47}, new int[]{60, 75, 60, 77, 77, 75, 75});
                return true;
            }
            case 23008: 
            case 23009: 
            case 23010: 
            case 23011: 
            case 23012: {
                rs.d.k.a(h2, new int[]{10351, 2361, 2378, 220}, new int[]{55, 55, 55, 55});
                return true;
            }
            case 23026: 
            case 23027: 
            case 23028: {
                rs.d.k.a(h2, new int[]{43992, 924, 11200, 78, 3738, 1556, 528, 4750}, new int[]{72, 55, 55, 55, 27, 72, 27, 27});
                return true;
            }
            case 22888: {
                rs.d.k.a(h2, new int[]{8602, 49, 10520, 10529, 8722}, new int[]{60, 62, 60, 62, 62});
                return true;
            }
            case 22870: {
                rs.d.k.b(h2, 53);
                return true;
            }
            case 22842: {
                rs.d.k.a(h2, new int[]{21652, 21658}, 62);
                return true;
            }
            case 22105: 
            case 22106: 
            case 22107: {
                h2.a(0, new int[]{1});
                h2.b(new int[]{43449, 36007, 20, 8418, 1, 935, 28969, 43116, 43340, 43450, 43440, 6573, 411, 10258, 24, 12, 20, 16}, new int[]{54, 54, 60, 60, 54, 54, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54});
                h2.g(80);
                h2.a(80, new int[]{7, 8, 10});
                h2.a(94, new int[]{20, 25, 30});
                return true;
            }
            case 28709: 
            case 28710: 
            case 28711: {
                h2.a(0, new int[]{1});
                h2.b(new int[]{43449, 36007, 20, 8418, 1, 935, 28969, 43116, 43340, 43450, 43440, 6573, 411, 10258, 24, 12, 20, 16}, new int[]{53, 53, 60, 60, 53, 53, 60, 60, 60, 60, 60, 60, 60, 60, 60, 53, 53, 53});
                h2.g(80);
                h2.a(80, new int[]{7, 8, 10});
                h2.a(94, new int[]{20, 25, 30});
                return true;
            }
            case 22262: 
            case 22263: 
            case 22264: {
                h2.a(6356, new int[]{16});
                h2.a(6364, new int[]{12});
                h2.a(6348, new int[]{10});
                h2.a(6323, new int[]{8});
                h2.a(43305, new int[]{8});
                rs.d.k.a(h2, new int[]{49218, 6331, 43311, 7108, 49197, 6973, 43301, 5268, 49209, 43544, 6340}, new int[]{102, 102, 54, 60, 54, 102, 102, 54, 54, 102, 54, 54, 60});
                return true;
            }
            case 22189: 
            case 22190: {
                h2.a(74, new int[]{33031});
                h2.a(57, new int[]{1});
                h2.a(86, new int[]{33031});
                h2.a(90, new int[]{1});
                h2.a(66, new int[]{33031});
                h2.a(33030, new int[]{1});
                h2.a(10262, new int[]{1});
                rs.d.k.a(h2, new int[]{33031, 2, 10264}, new int[]{54, 60, 60});
                return true;
            }
            case 22191: {
                h2.a(78, new int[]{33031});
                h2.a(86, new int[]{1});
                h2.a(94, new int[]{33031});
                h2.a(33030, new int[]{1});
                rs.d.k.a(h2, new int[]{33031, 2, 10264}, new int[]{54, 60, 60});
                return true;
            }
            case 22250: {
                h2.a(90, new int[]{33031});
                h2.a(21766, new int[]{1});
                h2.a(28, new int[]{1});
                h2.a(37, new int[]{1});
                h2.a(20, new int[]{1});
                h2.a(43150, new int[]{1});
                h2.a(43146, new int[]{1});
                h2.a(43270, new int[]{1});
                h2.a(26, new int[]{1});
                h2.a(18, new int[]{1});
                rs.d.k.a(h2, new int[]{33031, 91, 72, 82, 65, 25, 45, 65, 3230, 3226, 26, 18, 88}, new int[]{54, 60, 60, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54});
                return true;
            }
            case 22251: {
                h2.a(17069, new int[]{5});
                h2.a(8755, new int[]{4007});
                h2.a(8631, new int[]{4020});
                h2.a(8635, new int[]{4030});
                h2.a(9901, new int[]{12});
                h2.a(10149, new int[]{4040});
                h2.a(957, new int[]{25});
                h2.a(559, new int[]{40});
                h2.a(941, new int[]{35});
                rs.d.k.a(h2, new int[]{12}, new int[]{60});
                return true;
            }
            case 22119: 
            case 22120: {
                rs.d.k.a(h2, new int[]{947, 3776, 3546, 305, 3996, 3895, 5051, 945}, new int[]{61, 61, 61, 61, 61, 61, 61, 61});
                h2.a(22, new int[]{16});
                h2.a(74, new int[]{12});
                h2.a(49, new int[]{8});
                h2.a(37, new int[]{10});
                h2.a(28, new int[]{4});
                h2.a(57, new int[]{5});
                h2.a(20, new int[]{3});
                h2.a(24, new int[]{7});
                h2.a(33, new int[]{2});
                h2.a(41, new int[]{11});
                h2.a(45, new int[]{14});
                h2.a(99, new int[]{14});
                h2.a(101, new int[]{11});
                h2.a(103, new int[]{10});
                h2.a(86, new int[]{10});
                h2.a(82, new int[]{9});
                h2.a(78, new int[]{10});
                h2.a(51, new int[]{8});
                h2.a(53, new int[]{12});
                h2.a(18, new int[]{3});
                h2.a(26, new int[]{6});
                return true;
            }
            case 22136: 
            case 22138: {
                h2.a(16, new int[]{8, 10, 11});
                h2.a(20, new int[]{14});
                h2.b(new int[]{12, 24, 920, 7104, 7097}, new int[]{180, 180, 61, 71, 71});
                return true;
            }
            case 22137: {
                h2.a(20, new int[]{10});
                h2.b(new int[]{12, 24, 16}, new int[]{180, 180, 61});
                return true;
            }
            case 22146: 
            case 22147: {
                h2.b(new int[]{8367, 8384, 8375, 10266, 9523, 10502, 9515, 22, 21662, 17566, 10275, 21782, 274, 163, 142, 9403, 8076, 21902, 21772, 21658, 10291, 21667, 9152, 9147, 7378, 898, 26, 8379, 8390, 39, 55244, 10283, 10287}, new int[]{61, 61, 61, 60, 85, 85, 60, 60, 55, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 61, 61, 60, 0, 60, 61, 61, 60, 60, 60, 60});
                return true;
            }
            case 22139: {
                h2.a(40, new int[]{74});
                h2.a(924, new int[]{12});
                h2.a(6032, new int[]{34});
                return true;
            }
            case 23666: {
                h2.a(40, new int[]{212});
                h2.a(924, new int[]{12});
                h2.a(6032, new int[]{34});
                return true;
            }
            case 23663: 
            case 23664: 
            case 23665: {
                h2.a(8741, new int[]{25092});
                h2.a(25238, new int[]{25092});
                h2.a(38814, new int[]{25092});
                h2.a(24, new int[]{37642});
                rs.d.k.a(h2, new int[]{37642}, new int[]{156});
                return true;
            }
            case 1481: {
                rs.d.k.b(h2, 55);
                return true;
            }
            case 1482: {
                rs.d.k.b(h2, 53);
                return true;
            }
            case 1483: {
                rs.d.k.b(h2, 61);
                return true;
            }
            case 1484: {
                rs.d.k.b(h2, 60);
                return true;
            }
            case 22825: {
                rs.d.k.b(h2, 58);
                return true;
            }
            case 22812: {
                h2.b(new int[]{63, 63, 56, 56, 56});
                return true;
            }
            case 23933: {
                h2.b(new int[]{256, 256, 71, 71, 71});
                return true;
            }
            case 22948: {
                h2.b(new int[]{38119, 127, 9118, 76, 9121, 68, 8097, 64, 198, 8092, 59, 4, 107, 10638, 61625, 10142}, new int[]{54, 54, 54, 60, 60, 60, 60, 54, 60, 54, 60, 54, 54, 60, 60, 60});
                return true;
            }
            case 23141: 
            case 23142: 
            case 23143: {
                rs.d.k.a(h2, new int[]{36253, 36133, 37165, 51111, 51133, 10502, 52122, 36257}, new int[]{60, 60, 60, 54, 54, 54, 54, 54});
                return true;
            }
            case 24176: 
            case 24177: 
            case 24178: {
                h2.a(8, new int[]{10});
                h2.a(12, new int[]{12});
                h2.a(16, new int[]{19});
                h2.a(new int[]{43059, 43067, 36252, 43049}, new int[]{15});
                rs.d.k.a(h2, new int[]{36253, 36133, 37165, 51111, 51133, 10502, 52122, 36257, 20}, new int[]{140, 60, 140, 60, 140, 60, 60, 60, 140});
                return true;
            }
            case 23174: {
                rs.d.k.a(h2, new int[]{52, 103, 1945, 50, 42, 162, 5301, 5293, 10281}, new int[]{2, 60, 5, 2, 2, 2, 2, 60, 60});
                h2.g(0, -1);
                return true;
            }
            case 20952: {
                rs.d.k.a(h2, 43117, 62);
                return true;
            }
            case 22121: {
                rs.d.k.a(h2, new int[]{4382, 4502, 7616, 7731}, new int[]{96, 96, 95, 95});
                return true;
            }
            case 23472: {
                h2.a(6439, new int[]{3});
                h2.a(6323, new int[]{2});
                h2.a(33001, new int[]{3, 4, 5, 6, 7});
                rs.d.k.a(h2, new int[]{3, 4, 5, 6, 7}, new int[]{76, 60, 60, 105, 60});
                return true;
            }
            case 23471: {
                h2.a(33001, new int[]{9});
                h2.a(6430, new int[]{9});
                h2.a(6435, new int[]{29});
                h2.a(6439, new int[]{29});
                h2.a(6315, new int[]{29});
                h2.a(6554, new int[]{29});
                rs.d.k.a(h2, new int[]{32995, 9}, new int[]{76, 105});
                return true;
            }
            case 23478: {
                h2.a(new int[]{5, 15, 25});
                return true;
            }
            case 23479: {
                h2.a(new int[]{33001});
                return true;
            }
            case 16428: {
                if (rs.f.a.aj) {
                    h2.a(new int[]{2839, 2826, 2837});
                }
                return true;
            }
            case 22358: {
                if (rs.f.a.aj) {
                    h2.a(new int[]{10, 15, 20, 10, 5810, 5810});
                }
                return true;
            }
            case 22362: 
            case 22366: {
                if (rs.f.a.aj) {
                    h2.a(new int[]{10, 15, 20, 10, 5810});
                }
                return true;
            }
            case 27422: {
                h2.a(new int[]{5, 10, 5, 347770});
                return true;
            }
            case 27423: {
                h2.a(new int[]{5, 10, 5, 51136});
                return true;
            }
            case 27424: {
                h2.a(new int[]{5, 10, 5, 461770});
                return true;
            }
            case 22359: {
                if (rs.f.a.aj) {
                    h2.a(new int[]{64585, 64590, 64595, 64585, 5810, 5810});
                }
                return true;
            }
            case 22363: 
            case 22367: {
                if (rs.f.a.aj) {
                    h2.a(new int[]{64585, 64590, 64595, 64585, 5810});
                }
                return true;
            }
            case 22360: {
                if (rs.f.a.aj) {
                    h2.a(new int[]{9767, 9772, 9777, 9767, 5810, 5810});
                }
                return true;
            }
            case 22364: 
            case 22368: {
                if (rs.f.a.aj) {
                    h2.a(new int[]{9767, 9772, 9777, 9767, 5810});
                }
                return true;
            }
            case 22361: {
                if (rs.f.a.aj) {
                    h2.a(new int[]{65046, 65051, 65056, 65046, 5810, 5810});
                }
                return true;
            }
            case 22365: 
            case 22369: {
                if (rs.f.a.aj) {
                    h2.a(new int[]{65046, 65051, 65056, 65046, 5810});
                }
                return true;
            }
            case 10506: 
            case 22807: {
                h2.a(new int[]{50, 55, 60});
                return true;
            }
            case 21734: {
                rs.d.k.a(h2, new int[]{2983, 914, 6082, 23492, 23483, 4013, 4011, 8150, 4013, 2733, 4011, 2880, 28, 10167, 1946, 2983, 914, 29867, 6084}, new int[]{62, 62, 62, 62, 62, 62, 61, 61, 61, 61, 61, 61, 61, 62, 62, 62, 62, 62, 62});
                return true;
            }
            case 21732: {
                rs.d.k.a(h2, new int[]{22410, 2999}, new int[]{56, 54});
                return true;
            }
            case 21729: {
                rs.d.k.b(h2, 53);
                return true;
            }
            case 21713: {
                rs.d.k.a(h2, new int[]{5219, 910, 1938, 1690, 912, 962, 8, 78, 910, 912}, 54);
                return true;
            }
            case 21710: {
                rs.d.k.a(h2, new int[]{1955, 127, 929, 0, 6994}, new int[]{54, 60, 60, 60, 54});
                return true;
            }
            case 21711: {
                rs.d.k.a(h2, new int[]{1955, 794, 792, 929, 127, 6994}, new int[]{54, 60, 60, 60, 54, 60});
                return true;
            }
            case 21712: {
                rs.d.k.a(h2, new int[]{852, 935, 9152, 9015, 10060, 9019, 9174}, new int[]{54, 60, 54, 60, 54, 60, 60});
                return true;
            }
            case 23048: {
                rs.d.k.a(h2, new int[]{852, 935, 9152, 9015, 10060, 9019, 9174}, new int[]{71, 63, 71, 63, 71, 63, 63});
                return true;
            }
            case 21702: {
                h2.b(new int[]{63, 56, 56, 56, 63});
                return true;
            }
            case 16000: {
                h2.b(new int[]{22464}, new int[]{34});
                return true;
            }
            case 21691: {
                h2.b(new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 68, 60, 68, 60, 68});
                return true;
            }
            case 21692: {
                h2.b(new int[]{5404, 8481, 6554}, new int[]{60, 68, 60});
                return true;
            }
            case 21690: {
                h2.b(new int[]{4510, 4502, 8128, 7093}, new int[]{60, 60, 68, 68});
                return true;
            }
            case 23460: {
                h2.b(new int[]{4510, 4502, 8128, 7093}, new int[]{60, 62, 62, 60});
                return true;
            }
            case 21700: {
                rs.d.k.a(h2, new int[]{926}, new int[]{68});
                return true;
            }
            case 24123: {
                rs.d.k.a(h2, new int[]{926}, new int[]{259});
                return true;
            }
            case 21629: {
                rs.d.k.a(h2, new int[]{5784, 9152, 11187, 5404}, new int[]{56, 54, 54, 60});
                return true;
            }
            case 21630: {
                rs.d.k.a(h2, new int[]{9017, 6715, 10345, 4391, 8879, 5322}, new int[]{56, 54, 54, 56, 54, 54});
                return true;
            }
            case 23172: {
                h2.b(new int[]{10266, 21662, 10270, 10274, 10280, 10282, 9402, 10288, 10284, 10277, 10296, 10291, 10262, 21657, 7176, 11320, 7217, 11333, 11343, 7208}, new int[]{54, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 69, 54});
                h2.g(3);
                h2.g(0, -1);
                return true;
            }
            case 21625: {
                h2.a(6707, new int[]{8120, 8130, 8140});
                h2.a(7952, new int[]{6707});
                h2.a(7585, new int[]{6707});
                return true;
            }
            case 21607: {
                rs.d.k.a(h2, new int[]{62127, 62131, 62135, 62011, 61888}, 53);
                return true;
            }
            case 21608: {
                rs.d.k.a(h2, new int[]{61718, 61714, 61594, 61598, 61603}, 54);
                return true;
            }
            case 21604: {
                rs.d.k.a(h2, new int[]{284, 960, 939}, new int[]{54, 54, 54});
                return true;
            }
            case 21602: {
                rs.d.k.a(h2, new int[]{-11234, -11238, -10719, 54298, 54298, 54817}, new int[]{54, 54, 54, 54, 54, 54});
                return true;
            }
            case 24250: {
                rs.d.k.a(h2, new int[]{984}, new int[]{54});
                return true;
            }
            case 21603: {
                rs.d.k.a(h2, new int[]{59449, 43294, 43311, 59437, 43088, 43105, 6736}, new int[]{54, 54, 54, 54, 54, 54, 54});
                return true;
            }
            case 23910: {
                rs.d.k.a(h2, new int[]{284, 960, 939, 53, 33, 12, 28, 284, 417, 555, 20, 960, 939}, new int[]{213, 213, 213, 102, 102, 61, 102, 102, 102, 102, 102, 102, 102});
                return true;
            }
            case 23908: {
                rs.d.k.a(h2, new int[]{54298, 54298, 54817, 16, 12, 54302, 54294, 54290, 54298, 54817, 16, -11234, -11242, -11246, -11238, -10719}, new int[]{213, 213, 213, 102, 60, 61, 102, 102, 102, 102, 213, 213, 102, 102, 213, 213});
                return true;
            }
            case 23909: {
                rs.d.k.a(h2, new int[]{59449, 43294, 43311, 59437, 43088, 43105, 6736, 43096, 6736, 6709, 59449, 6602, 43294, 43311, 3346, 6699, 59437, 43088, 43105, 7124}, new int[]{213, 213, 213, 61, 213, 213, 61, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102});
                return true;
            }
            case 23907: {
                rs.d.k.a(h2, new int[]{61, 8757}, new int[]{213, 60});
                return true;
            }
            case 21599: {
                rs.d.k.b(h2, 60);
                return true;
            }
            case 23953: {
                rs.d.k.a(h2, new int[]{5813, 26006, 9139}, new int[]{60, 59, 59});
                return true;
            }
            case 21709: {
                rs.d.k.a(h2, new int[]{44948, 7104, 9152}, new int[]{60, 54, 54});
                return true;
            }
            case 21703: {
                rs.d.k.a(h2, new int[]{10052, 8119, 9152, 13, 51111, 50972}, new int[]{60, 60, 60, 54, 54, 54});
                return true;
            }
            case 21704: {
                rs.d.k.b(h2, 54);
                return true;
            }
            case 22040: {
                rs.d.k.b(h2, 212);
                return true;
            }
            case 22059: {
                rs.d.k.b(h2, 212);
                return true;
            }
            case 22118: {
                h2.a(12, new int[]{6});
                h2.a(47653, new int[]{11});
                h2.a(8, new int[]{10});
                rs.d.k.a(h2, new int[]{16, 43286, 43282, 47772, 47777, 63, 67, 47657, 47708, 43292, 47533}, new int[]{75, 75, 60, 60, 60, 75, 60, 75, 60, 60, 60});
                h2.g(8);
                return true;
            }
            case 22060: {
                if (h2 != null) {
                    h2.a(35, new int[]{32});
                    h2.a(72, new int[]{6});
                    h2.a(76, new int[]{11});
                    h2.a(8635, new int[]{904});
                    h2.a(68, new int[]{904});
                    rs.d.k.a(h2, new int[]{8636, 73, 77, 80, 36, 0, 8625, 68, 8644, 8646, 55, 119, 123}, new int[]{61, 61, 61, 60, 60, 76, 60, 54, 62, 62, 61, 61});
                }
                return true;
            }
            case 24115: {
                h2.a(35, new int[]{36172});
                h2.a(72, new int[]{59728});
                h2.a(76, new int[]{59708});
                h2.a(8635, new int[]{59728});
                h2.a(68, new int[]{59708});
                rs.d.k.a(h2, new int[]{8636, 73, 77, 80, 36, 0, 8625, 68, 8644, 8646, 55, 119, 123}, new int[]{132, 132, 132, 132, 132, 72, 132, 132, 132, 132, 132, 132});
                return true;
            }
            case 23486: {
                if (h2 != null) {
                    h2.a(35, new int[]{12});
                    h2.a(72, new int[]{3});
                    h2.a(76, new int[]{6});
                    h2.a(8635, new int[]{22});
                    rs.d.k.a(h2, new int[]{8636, 73, 77, 80, 36, 0, 8625, 68, 8644, 8646, 55, 119, 123}, new int[]{57, 57, 57, 60, 60, 76, 60, 57, 57, 40, 57, 57});
                }
                return true;
            }
            case 21706: 
            case 21707: 
            case 21708: {
                rs.d.k.a(h2, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411}, 60);
                return true;
            }
            case 23487: 
            case 23488: 
            case 23489: {
                rs.d.k.a(h2, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411}, 57);
                return true;
            }
            case 23660: 
            case 23661: 
            case 23662: {
                rs.d.k.a(h2, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411, 960}, new int[]{93, 93, 93, 93, 93, 93, 93, 93, 93, 212});
                return true;
            }
            case 21283: 
            case 21284: 
            case 21285: {
                rs.d.k.a(h2, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411, 960}, new int[]{63, 63, 63, 63, 63, 63, 63, 63, 63, 34});
                return true;
            }
            case 22167: 
            case 22168: 
            case 22169: {
                rs.d.k.a(h2, new int[]{10960, 14554, 12500, 12492, 13541, 14532, 13532, 13545, 10411}, new int[]{77, 77, 77, 77, 77, 77, 77, 77, 77});
                return true;
            }
            case 22933: {
                rs.d.k.a(h2, new int[]{960}, 52);
                return true;
            }
            case 22934: {
                rs.d.k.a(h2, new int[]{960}, 54);
                return true;
            }
            case 22935: {
                rs.d.k.a(h2, new int[]{5018}, 54);
                return true;
            }
            case 22134: {
                h2.a(278, new int[]{266});
                h2.a(412, new int[]{422});
                h2.a(156, new int[]{412});
                h2.a(28, new int[]{16});
                h2.a(20, new int[]{14});
                h2.a(22, new int[]{12});
                return true;
            }
            case 21101: {
                h2.a(127, new int[]{1});
                h2.a(0, new int[]{1});
                return true;
            }
            case 23137: {
                h2.a(127, new int[]{1});
                h2.a(90, new int[]{5});
                h2.a(107, new int[]{10});
                h2.a(115, new int[]{15});
                rs.d.k.a(h2, new int[]{38333}, new int[]{61});
                return true;
            }
            case 23940: {
                h2.a(78, new int[]{925});
                h2.a(5790, new int[]{2});
                return true;
            }
            case 23930: {
                h2.a(0, new int[]{5});
                h2.a(8, new int[]{461745});
                h2.a(20, new int[]{461745});
                h2.a(new int[]{918, 941, 931, 926, 41366, 43906}, new int[]{461745});
                h2.g(-10, -1);
                return true;
            }
            case 24236: 
            case 24237: 
            case 28790: 
            case 28791: {
                h2.a(0, new int[]{350770, 933, 933, 350770, 350770, 933});
                h2.a(8, new int[]{933});
                h2.a(20, new int[]{350770});
                h2.a(new int[]{918, 941, 931, 926, 41366, 43906}, new int[]{933});
                if (n2 == 24237) {
                    h2.b(new int[]{933, 350770}, new int[]{58, 62});
                }
                return true;
            }
            case 24042: 
            case 24043: {
                h2.a(0, new int[]{34770, 380770, 380770, 34770, 34770, 380770});
                h2.a(8, new int[]{380770});
                h2.a(20, new int[]{34770});
                h2.a(new int[]{918, 941, 931, 926, 41366, 43906}, new int[]{380770});
                if (n2 == 24043) {
                    h2.b(new int[]{380770, 34770}, new int[]{72, 55});
                }
                return true;
            }
            case 23935: 
            case 23936: 
            case 23937: 
            case 23938: 
            case 23939: {
                h2.a(127, new int[]{6});
                h2.a(111, new int[]{4});
                h2.a(0, new int[]{930});
                h2.a(557, new int[]{900});
                h2.a(563, new int[]{930});
                h2.a(571, new int[]{915});
                h2.a(43456, new int[]{8});
                h2.a(10948, new int[]{11});
                h2.a(43445, new int[]{10});
                h2.a(43462, new int[]{7});
                h2.a(21941, new int[]{6});
                h2.a(21956, new int[]{5});
                h2.a(11059, new int[]{14});
                h2.a(10939, new int[]{14});
                h2.a(21947, new int[]{11});
                h2.a(8, new int[]{905});
                h2.a(16, new int[]{910});
                return true;
            }
            case 23202: {
                h2.a(24, new int[]{1});
                h2.a(16, new int[]{1});
                h2.a(33, new int[]{1});
                h2.a(41, new int[]{1});
                h2.a(61, new int[]{62});
                h2.a(20, new int[]{1});
                h2.a(28, new int[]{1});
                h2.a(37, new int[]{1});
                h2.b(new int[]{1}, 10);
                rs.d.k.a(h2, new int[]{790, 796, 784, 536, 78, 49, 62}, new int[]{61, 61, 61, 61, 61, 53, 53});
                return true;
            }
            case 24025: {
                h2.b(new int[]{61}, new int[]{140});
                return true;
            }
            case 24023: 
            case 24024: {
                h2.a(61, new int[]{62});
                if (n2 == 24024) {
                    h2.a(24, new int[]{1});
                    h2.a(16, new int[]{1});
                    h2.a(33, new int[]{1});
                    h2.a(41, new int[]{1});
                    h2.a(20, new int[]{790});
                    h2.a(28, new int[]{1});
                    h2.a(37, new int[]{1});
                    h2.b(new int[]{1}, 10);
                    rs.d.k.a(h2, new int[]{790, 796, 784, 536, 78, 49, 62}, new int[]{140, 140, 140, 140, 140, 140, 140});
                } else {
                    rs.d.k.a(h2, new int[]{790, 796, 784, 536, 49, 62}, new int[]{58, 58, 58, 58, 58, 58});
                }
                return true;
            }
            case 23203: {
                rs.d.k.a(h2, new int[]{5231, 0}, new int[]{75, 60});
                return true;
            }
            case 23934: {
                h2.a(5231, new int[]{3, 4});
                rs.d.k.a(h2, new int[]{3, 4, 0}, new int[]{60, 57, 60});
                return true;
            }
            case 23205: {
                rs.d.k.a(h2, new int[]{933, 10351}, new int[]{68, 60});
                return true;
            }
            case 23942: {
                rs.d.k.a(h2, new int[]{933, 10351}, new int[]{261, 258});
                return true;
            }
            case 24124: {
                rs.d.k.a(h2, new int[]{933, 10351}, new int[]{259, 256});
                return true;
            }
            case 23943: {
                rs.d.k.a(h2, new int[]{926, 10349, 0, 127}, new int[]{261, 258, 258, 258});
                return true;
            }
            case 23944: {
                rs.d.k.a(h2, new int[]{926}, new int[]{261});
                return true;
            }
            case 23905: {
                rs.d.k.a(h2, new int[]{933, 10351}, new int[]{156, 102});
                return true;
            }
            case 23906: {
                h2.a(6674, new int[]{25092});
                h2.a(6430, new int[]{25092});
                h2.a(6554, new int[]{25092});
                h2.a(6550, new int[]{25092});
                rs.d.k.a(h2, new int[]{18}, new int[]{156});
                return true;
            }
            case 23206: {
                if (h2 != null) {
                    h2.a(8741, new int[]{3});
                }
                if (h2 != null) {
                    h2.a(7281, new int[]{15, 16, 17});
                }
                if (h2 != null) {
                    rs.d.k.a(h2, new int[]{28318, 8078, 4550}, new int[]{61, 60, 60});
                }
                return true;
            }
            case 23207: {
                if (h2 != null) {
                    h2.a(4626, new int[]{3});
                }
                if (h2 != null) {
                    h2.a(908, new int[]{3});
                }
                if (h2 != null) {
                    rs.d.k.a(h2, new int[]{25238}, new int[]{60});
                }
                return true;
            }
            case 23208: {
                if (h2 != null) {
                    h2.a(22412, new int[]{3, 4});
                }
                if (h2 != null) {
                    h2.a(26520, new int[]{10, 11, 12});
                }
                if (h2 != null) {
                    h2.a(25490, new int[]{15, 16, 17});
                }
                if (h2 != null) {
                    rs.d.k.a(h2, new int[]{90}, new int[]{97});
                }
                return true;
            }
            case 21833: {
                if (h2 != null) {
                    h2.a(111, new int[]{7114});
                    h2.a(918, new int[]{7114});
                    h2.a(912, new int[]{7114});
                    h2.a(914, new int[]{7114});
                    h2.a(931, new int[]{7114});
                }
                return true;
            }
            case 21823: 
            case 21824: 
            case 21825: 
            case 21826: {
                if (h2 != null) {
                    h2.a(14395, new int[]{7, 8, 9});
                    rs.d.k.a(h2, new int[]{14387, 127, 85}, new int[]{62, 62, 62});
                }
                return true;
            }
            case 23209: {
                rs.d.k.a(h2, new int[]{6963, 6959, 7083, 7073, 2700, 7081, 21539, 10266}, new int[]{68, 68, 68, 60, 76, 76, 76, 76});
                return true;
            }
            case 23210: {
                if (h2 != null) {
                    h2.a(12, new int[]{1});
                    h2.a(0, new int[]{10});
                    rs.d.k.a(h2, new int[]{127, 107}, new int[]{61, 61});
                }
                return true;
            }
            case 23211: 
            case 23212: {
                if (h2 != null) {
                    h2.a(12, new int[]{1});
                    h2.a(0, new int[]{10});
                    rs.d.k.a(h2, new int[]{16}, new int[]{61});
                }
                return true;
            }
            case 23224: {
                h2.a(12, new int[]{1});
                rs.d.k.a(h2, new int[]{127, 107, 0}, new int[]{61, 61, 60});
                return true;
            }
            case 23633: {
                rs.d.k.a(h2, new int[]{6464, 25129}, new int[]{152, 172});
                return true;
            }
            case 23653: {
                rs.d.k.a(h2, new int[]{5318}, new int[]{142});
                return true;
            }
            case 23635: {
                rs.d.k.a(h2, new int[]{43059}, new int[]{124});
                return true;
            }
            case 23638: {
                if (h2 != null) {
                    h2.g(23);
                    h2.a(23, new int[]{24, 23});
                    h2.b(new int[]{23, 24}, new int[]{124, 102});
                }
                return true;
            }
            case 23650: {
                rs.d.k.a(h2, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{102, 124, 118, 124, 102, 118, 102, 124, 124});
                return true;
            }
            case 23956: {
                h2.a(new int[]{2225, 2229, 2237, 2221}, new int[]{1});
                h2.a(new int[]{3235, 3239, 3230, 3243, 43074, 43090}, new int[]{2});
                h2.b(new int[]{1, 2}, new int[]{261, 186});
                return true;
            }
            case 23651: {
                if (h2 != null) {
                    h2.g(23);
                    h2.a(23, new int[]{24, 23});
                    h2.b(new int[]{23, 24}, new int[]{156, 102});
                }
                return true;
            }
            case 24122: {
                if (h2 != null) {
                    h2.g(23);
                    h2.a(23, new int[]{24, 23});
                    h2.b(new int[]{23, 24}, new int[]{256, 259});
                }
                return true;
            }
            case 24110: {
                if (h2 != null) {
                    h2.b(new int[]{5525, 5401, 5405, 4013, 5014, 4009, 3889, 5648, 2977, 4783, 4665, 4903, 43086, 43094, 4669, 4674, 5002, 5840, 5832, 4653, 4005, 3881, 3757, 3761, 4001, 4003, 4785, 4779, 3982, 4657, 6717, 6713, 6709, 3885, 4649, 6722, 4661, 4781, 4777, 3765}, new int[]{104, 132, 132, 132, 132, 132, 132, 128, 128, 55, 128, 55, 132, 132, 132, 132, 132, 104, 132, 128, 55, 128, 128, 132, 132, 132, 132, 132, 55, 55, 55, 55, 55, 128, 55, 128, 81, 128, 128, 128});
                    h2.h(37226);
                }
                return true;
            }
            case 24116: {
                if (h2 != null) {
                    h2.a(107, new int[]{7646});
                    h2.a(910, new int[]{37216});
                    h2.a(912, new int[]{37212});
                    h2.a(1814, new int[]{37222});
                    h2.a(1938, new int[]{37212});
                    h2.a(1690, new int[]{37212});
                    h2.a(43908, new int[]{37162});
                }
                return true;
            }
            case 24117: {
                if (h2 != null) {
                    h2.a(12, new int[]{7896});
                    h2.a(8, new int[]{7886});
                    h2.a(4, new int[]{7876});
                    h2.a(8412, new int[]{59738});
                    h2.a(900, new int[]{59738});
                    h2.a(0, new int[]{7646});
                    h2.a(898, new int[]{7646});
                    h2.a(55207, new int[]{59738});
                }
                return true;
            }
            case 23955: {
                if (h2 != null) {
                    h2.b(new int[]{16425, 14490, 4515, 7349, 8361}, new int[]{261, 261, 68, 68, 68});
                }
                return true;
            }
            case 23941: {
                if (h2 != null) {
                    h2.g(23);
                    h2.b(new int[]{23}, new int[]{261});
                }
                return true;
            }
            case 24125: {
                if (h2 != null) {
                    h2.g(7646);
                }
                return true;
            }
            case 24119: 
            case 24120: 
            case 24121: {
                if (h2 != null) {
                    h2.a(929, new int[]{7896});
                    h2.a(914, new int[]{7616});
                    h2.a(2954, new int[]{7606});
                    h2.a(127, new int[]{126});
                }
                return true;
            }
            case 23652: {
                rs.d.k.a(h2, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{102, 156, 118, 156, 102, 118, 102, 156, 156});
                return true;
            }
            case 23213: 
            case 23214: 
            case 23215: 
            case 23216: {
                if (h2 != null) {
                    h2.a(11200, new int[]{3});
                    h2.a(19367, new int[]{3});
                    h2.a(11177, new int[]{8, 9});
                    h2.a(9917, new int[]{3, 4});
                    rs.d.k.a(h2, new int[]{939}, new int[]{61});
                }
                return true;
            }
            case 21261: {
                if (h2 != null) {
                    h2.a(51111, new int[]{8});
                    h2.a(8398, new int[]{8});
                    h2.a(8390, new int[]{8});
                    h2.a(8386, new int[]{8});
                    h2.a(8394, new int[]{8});
                    h2.a(8384, new int[]{8});
                    h2.a(8377, new int[]{8});
                    h2.a(7349, new int[]{8});
                    h2.a(54534, new int[]{955});
                    rs.d.k.a(h2, new int[]{61340, 54534, 51111}, new int[]{60, 40, 60});
                }
                return true;
            }
            case 22109: 
            case 22111: {
                if (h2 != null) {
                    h2.a(43164, new int[]{15});
                    h2.a(43061, new int[]{3});
                    h2.a(43053, new int[]{3});
                    h2.a(43026, new int[]{3});
                    h2.a(5056, new int[]{902});
                    h2.a(3008, new int[]{950});
                    h2.a(24, new int[]{950});
                    h2.a(576, new int[]{920});
                    h2.a(594, new int[]{902});
                    h2.a(687, new int[]{905});
                    h2.a(703, new int[]{920});
                    h2.a(691, new int[]{920});
                    h2.a(671, new int[]{920});
                }
                return true;
            }
            case 24204: {
                if (h2 != null) {
                    h2.a(43164, new int[]{15});
                    h2.a(43061, new int[]{3});
                    h2.a(43053, new int[]{3});
                    h2.a(43026, new int[]{3});
                    h2.a(5056, new int[]{902});
                    h2.a(3008, new int[]{950});
                    h2.a(24, new int[]{950});
                    h2.a(576, new int[]{920});
                    h2.a(594, new int[]{902});
                    h2.a(687, new int[]{905});
                    h2.a(703, new int[]{920});
                    h2.a(691, new int[]{920});
                    h2.a(671, new int[]{920});
                    rs.d.k.a(h2, new int[]{950}, new int[]{113});
                }
                return true;
            }
            case 24205: {
                if (h2 != null) {
                    h2.a(43164, new int[]{15});
                    h2.a(43061, new int[]{3});
                    h2.a(43053, new int[]{3});
                    h2.a(43026, new int[]{3});
                    h2.a(5056, new int[]{902});
                    h2.a(3008, new int[]{950});
                    h2.a(24, new int[]{950});
                    h2.a(576, new int[]{920});
                    h2.a(594, new int[]{902});
                    h2.a(687, new int[]{905});
                    h2.a(703, new int[]{920});
                    h2.a(691, new int[]{920});
                    h2.a(671, new int[]{920});
                    rs.d.k.a(h2, new int[]{950}, new int[]{136});
                }
                return true;
            }
            case 24206: {
                if (h2 != null) {
                    h2.a(43164, new int[]{15});
                    h2.a(43061, new int[]{3});
                    h2.a(43053, new int[]{3});
                    h2.a(43026, new int[]{3});
                    h2.a(5056, new int[]{902});
                    h2.a(3008, new int[]{950});
                    h2.a(24, new int[]{950});
                    h2.a(576, new int[]{920});
                    h2.a(594, new int[]{902});
                    h2.a(687, new int[]{905});
                    h2.a(703, new int[]{920});
                    h2.a(691, new int[]{920});
                    h2.a(671, new int[]{920});
                    rs.d.k.a(h2, new int[]{950}, new int[]{138});
                }
                return true;
            }
            case 24207: {
                if (h2 != null) {
                    h2.a(43164, new int[]{15});
                    h2.a(43061, new int[]{3});
                    h2.a(43053, new int[]{3});
                    h2.a(43026, new int[]{3});
                    h2.a(5056, new int[]{902});
                    h2.a(3008, new int[]{950});
                    h2.a(24, new int[]{950});
                    h2.a(576, new int[]{920});
                    h2.a(594, new int[]{902});
                    h2.a(687, new int[]{905});
                    h2.a(703, new int[]{920});
                    h2.a(691, new int[]{920});
                    h2.a(671, new int[]{920});
                    rs.d.k.a(h2, new int[]{950}, new int[]{283});
                }
                return true;
            }
            case 21262: {
                if (h2 != null) {
                    h2.a(8398, new int[]{5});
                    h2.a(8390, new int[]{5});
                    h2.a(8386, new int[]{5});
                    h2.a(8394, new int[]{5});
                    h2.a(8384, new int[]{5});
                    h2.a(8377, new int[]{5});
                    h2.a(7349, new int[]{5});
                    rs.d.k.a(h2, new int[]{61340, 54534, 51111, 5}, new int[]{60, 62, 60, 77});
                }
                return true;
            }
            case 21263: {
                if (h2 != null) {
                    h2.a(8398, new int[]{5});
                    h2.a(8390, new int[]{5});
                    h2.a(8386, new int[]{5});
                    h2.a(8394, new int[]{5});
                    h2.a(8384, new int[]{5});
                    h2.a(8377, new int[]{5});
                    h2.a(7349, new int[]{5});
                    rs.d.k.a(h2, new int[]{61340, 54534, 51111, 5}, new int[]{60, 61, 60, 63});
                }
                return true;
            }
            case 21648: {
                if (h2 != null) {
                    h2.a(10283, new int[]{7100});
                    h2.a(10287, new int[]{7124});
                    h2.a(10279, new int[]{7110});
                    h2.a(10291, new int[]{7144});
                    h2.a(10275, new int[]{7114});
                }
                return true;
            }
            case 22218: {
                if (h2 != null) {
                    h2.a(127, new int[]{4382});
                }
                return true;
            }
            case 21783: {
                rs.d.k.a(h2, new int[]{7079}, 70);
                return true;
            }
            case 22183: {
                rs.d.k.a(h2, new int[]{7079, 11175}, new int[]{61, 60});
                return true;
            }
            case 22184: {
                rs.d.k.a(h2, new int[]{7079, 11175}, new int[]{60, 60});
                return true;
            }
            case 22185: {
                rs.d.k.a(h2, new int[]{7079, 11175}, new int[]{54, 60});
                return true;
            }
            case 21774: {
                if (h2 != null) {
                    h2.a(6554, new int[]{127, 120});
                    h2.a(5404, new int[]{930, 940});
                    rs.d.k.a(h2, new int[]{8481}, new int[]{70});
                }
                return true;
            }
            case 21776: {
                rs.d.k.a(h2, new int[]{528, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 70);
                return true;
            }
            case 21777: {
                rs.d.k.a(h2, new int[]{119, 103, 127, 111}, new int[]{155, 155, 155, 155});
                return true;
            }
            case 21780: {
                rs.d.k.a(h2, new int[]{5784, 9152, 11187, 5405}, new int[]{56, 93, 70, 10});
                return true;
            }
            case 21782: {
                rs.d.k.a(h2, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{93, 56, 56, 56, 56, 93, 56});
                return true;
            }
            case 24118: {
                h2.a(9127, new int[]{36202});
                h2.a(14990, new int[]{59755});
                h2.a(14746, new int[]{59765});
                h2.a(14742, new int[]{59735});
                h2.a(14622, new int[]{59765});
                h2.a(962, new int[]{59705});
                h2.a(14866, new int[]{59755});
                return true;
            }
            case 21805: {
                rs.d.k.a(h2, new int[]{9127, 14990, 14746, 14742, 14622, 962, 14866}, new int[]{60, 56, 56, 56, 56, 60, 56});
                return true;
            }
            case 21784: {
                rs.d.k.a(h2, new int[]{119, 103, 127, 111}, new int[]{70, 93, 70, 93});
                return true;
            }
            case 21785: {
                rs.d.k.a(h2, new int[]{668, 0, 4, 8, 673, 12, 16, 20, 24, 549, 553}, new int[]{120, 70, 70, 70, 119, 70, 70, 70, 70, 119, 119});
                return true;
            }
            case 21786: {
                rs.d.k.a(h2, new int[]{933, 127}, new int[]{119, 119});
                return true;
            }
            case 21778: {
                rs.d.k.a(h2, new int[]{926, 10350, 0, 128}, new int[]{155, 97, 93, 97});
                return true;
            }
            case 21779: {
                rs.d.k.a(h2, new int[]{926}, new int[]{155});
                return true;
            }
            case 21771: 
            case 21772: {
                if (h2 != null) {
                    h2.a(5169, new int[]{940, 945});
                    h2.a(55172, new int[]{920, 915});
                    h2.a(9133, new int[]{940, 930});
                    h2.a(11187, new int[]{920, 915});
                    h2.a(105, new int[]{127, 115, 120});
                    h2.a(88, new int[]{930, 940});
                    h2.a(26, new int[]{935, 945});
                    h2.a(64, new int[]{110, 100, 95});
                    h2.a(35, new int[]{107, 95, 100});
                }
                return true;
            }
            case 22023: 
            case 22024: 
            case 22025: {
                if (h2 != null) {
                    h2.a(24, new int[]{3});
                    h2.a(41, new int[]{3});
                    h2.a(12, new int[]{3});
                    h2.a(0, new int[]{1});
                    h2.a(926, new int[]{3});
                    rs.d.k.a(h2, new int[]{41, 61}, new int[]{40, 62});
                }
                return true;
            }
            case 22017: {
                rs.d.k.a(h2, new int[]{10417, 3974, 3594, 2576, 2454, 1571, 1436, 1575, 6808, 7331}, new int[]{60, 62, 62, 60, 62, 62, 60, 60, 40, 40});
                return true;
            }
            case 22018: {
                rs.d.k.a(h2, new int[]{47168}, new int[]{62});
                return true;
            }
            case 22019: {
                rs.d.k.a(h2, new int[]{47168}, new int[]{109});
                return true;
            }
            case 22027: {
                rs.d.k.a(h2, new int[]{61, 924, 916, 932}, new int[]{60, 109, 60, 60});
                return true;
            }
            case 22028: {
                rs.d.k.a(h2, new int[]{61, 924, 916, 932}, new int[]{85, 75, 85, 85});
                return true;
            }
            case 22031: {
                rs.d.k.a(h2, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{75, 85, 75, 85, 85, 75, 75, 62, 62});
                return true;
            }
            case 22032: {
                rs.d.k.a(h2, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{109, 81, 109, 81, 109, 109, 109, 81, 81});
                return true;
            }
            case 22033: {
                rs.d.k.a(h2, new int[]{5421, 5334, 12459, 1455, 2733, 2613}, new int[]{62, 80, 63, 34, 62, 80});
                return true;
            }
            case 22034: 
            case 22035: {
                h2.g(3);
                rs.d.k.a(h2, new int[]{3}, new int[]{87});
                return true;
            }
            case 22055: 
            case 22056: {
                if (h2 != null) {
                    h2.a(105, new int[]{2});
                    rs.d.k.a(h2, new int[]{916, 90, 84, 115, 92}, new int[]{109, 81, 81, 109, 81});
                    h2.g(70, -1);
                }
                return true;
            }
            case 21768: 
            case 21769: 
            case 21770: {
                if (h2 != null) {
                    h2.a(7516, new int[]{117});
                    h2.a(8497, new int[]{127});
                    h2.a(8493, new int[]{80});
                    h2.a(7636, new int[]{70});
                    h2.a(0, new int[]{1});
                    rs.d.k.a(h2, new int[]{3489, 3369, 3373, 8377}, new int[]{93, 56, 56, 56});
                }
                return true;
            }
            case 21804: {
                if (h2 != null) {
                    h2.a(7516, new int[]{117});
                    h2.a(8497, new int[]{127});
                    h2.a(8493, new int[]{80});
                    h2.a(7636, new int[]{70});
                    h2.a(0, new int[]{1});
                    rs.d.k.a(h2, new int[]{3489, 3369, 3373, 8377, 39896, 39872, 7446, 7393}, new int[]{93, 56, 56, 56, 56, 56, 56, 56});
                }
                return true;
            }
            case 21801: {
                if (h2 != null) {
                    h2.a(5828, new int[]{117});
                    h2.a(5714, new int[]{127});
                    rs.d.k.a(h2, new int[]{24, 16, 33, 2768}, new int[]{70, 102, 70, 60});
                }
                return true;
            }
            case 21802: {
                if (h2 != null) {
                    h2.a(5828, new int[]{117});
                    h2.a(5714, new int[]{127});
                    rs.d.k.a(h2, new int[]{24, 16, 33, 2768}, new int[]{56, 101, 56, 60});
                }
                return true;
            }
            case 21803: {
                if (h2 != null) {
                    h2.a(5828, new int[]{117});
                    h2.a(5714, new int[]{127});
                    rs.d.k.a(h2, new int[]{24, 16, 33, 2768}, new int[]{119, 119, 119, 119});
                }
                return true;
            }
            case 21781: {
                rs.d.k.a(h2, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{93, 93, 70, 70, 70});
                return true;
            }
            case 21773: {
                rs.d.k.a(h2, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{70, 70, 93, 70, 70, 93, 93, 70, 70});
                return true;
            }
            case 21775: {
                rs.d.k.a(h2, new int[]{1718, 1150, 20906, 20891, 20902, 20895}, new int[]{56, 70, 70, 70, 70, 70});
                return true;
            }
            case 11674: 
            case 11676: {
                if (h2 != null) {
                    h2.a(12, new int[]{6});
                    h2.a(7050, new int[]{18});
                    h2.a(90, new int[]{12});
                    h2.a(85, new int[]{6});
                    h2.a(78, new int[]{4});
                    h2.a(74, new int[]{4});
                    h2.a(61, new int[]{4});
                    h2.a(53, new int[]{4});
                    h2.a(45, new int[]{4});
                    h2.a(0, new int[]{1});
                    rs.d.k.a(h2, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 70}, new int[]{62, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 62, 62});
                }
                return true;
            }
            case 24101: 
            case 24102: {
                if (h2 != null) {
                    h2.a(12, new int[]{6});
                    h2.a(7050, new int[]{18});
                    h2.a(90, new int[]{12});
                    h2.a(85, new int[]{6});
                    h2.a(78, new int[]{4});
                    h2.a(74, new int[]{4});
                    h2.a(61, new int[]{4});
                    h2.a(53, new int[]{4});
                    h2.a(45, new int[]{4});
                    h2.a(0, new int[]{1});
                    rs.d.k.a(h2, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 70}, new int[]{54, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54});
                }
                return true;
            }
            case 21640: {
                if (h2 != null) {
                    h2.a(0, new int[]{6});
                }
                return true;
            }
            case 21641: {
                if (h2 != null) {
                    h2.a(0, new int[]{1});
                    h2.a(19379, new int[]{127});
                    h2.a(26537, new int[]{127});
                    h2.a(49, new int[]{6810});
                    h2.a(66, new int[]{6810});
                }
                return true;
            }
            case 21642: {
                if (h2 != null) {
                    h2.a(0, new int[]{1});
                    h2.a(19379, new int[]{126});
                    h2.a(26537, new int[]{126});
                    h2.a(49, new int[]{960});
                    h2.a(66, new int[]{960});
                    h2.a(127, new int[]{78});
                    h2.a(103, new int[]{66});
                    h2.a(86, new int[]{62});
                }
                return true;
            }
            case 21937: {
                if (h2 != null) {
                    h2.a(22024, new int[]{5});
                    h2.a(21776, new int[]{905});
                    h2.a(22402, new int[]{905});
                    h2.b(new int[]{905, 904, 929, 103, 910}, new int[]{75, 75, 75, 75, 80});
                }
                return true;
            }
            case 23627: {
                if (h2 != null) {
                    h2.a(22024, new int[]{374390});
                    h2.a(21776, new int[]{905});
                    h2.a(22402, new int[]{905});
                    h2.b(new int[]{905, 904, 929, 103, 910, 374390}, new int[]{54, 54, 54, 54, 74, 148});
                }
                return true;
            }
            case 23628: {
                if (h2 != null) {
                    h2.a(22024, new int[]{47627});
                    h2.a(21776, new int[]{905});
                    h2.a(22402, new int[]{905});
                    h2.b(new int[]{905, 904, 929, 103, 910, 47627}, new int[]{52, 52, 52, 52, 63, 179});
                }
                return true;
            }
            case 23629: {
                if (h2 != null) {
                    h2.a(22024, new int[]{127});
                    h2.a(21776, new int[]{905});
                    h2.a(22402, new int[]{905});
                    h2.b(new int[]{905, 904, 929, 103, 910, 127}, new int[]{60, 60, 60, 60, 97, 254});
                    h2.g(0, -1);
                }
                return true;
            }
            case 23988: {
                if (h2 != null) {
                    h2.a(22024, new int[]{127, 126});
                    h2.a(21776, new int[]{905});
                    h2.a(22402, new int[]{905});
                    h2.b(new int[]{905, 904, 929, 103, 910, 127, 126}, new int[]{259, 259, 259, 259, 259, 197, 197});
                    h2.g(0, -1);
                }
                return true;
            }
            case 23625: 
            case 27525: 
            case 27526: {
                if (h2 != null) {
                    h2.b(new int[]{5916, 4882, 54177}, new int[]{76, 157, 172});
                }
                return true;
            }
            case 23984: 
            case 27527: 
            case 27528: {
                if (h2 != null) {
                    h2.b(new int[]{5916, 4882, 54177}, new int[]{207, 159, 159});
                }
                return true;
            }
            case 23626: 
            case 27529: 
            case 27530: {
                if (h2 != null) {
                    h2.b(new int[]{10283, 6829}, new int[]{157, 60});
                }
                return true;
            }
            case 23630: 
            case 27531: 
            case 27532: {
                if (h2 != null) {
                    h2.b(new int[]{10283, 6829}, new int[]{159, 76});
                }
                return true;
            }
            case 23631: {
                if (h2 != null) {
                    h2.g(23);
                    h2.a(23, new int[]{24, 23});
                    h2.b(new int[]{23, 24}, new int[]{157, 60});
                }
                return true;
            }
            case 23632: {
                if (h2 != null) {
                    h2.g(23);
                    h2.a(23, new int[]{24, 23});
                    h2.b(new int[]{23, 24}, new int[]{159, 76});
                }
                return true;
            }
            case 23624: {
                if (h2 != null) {
                    h2.g(23);
                    h2.b(new int[]{23}, new int[]{74});
                }
                return true;
            }
            case 21643: {
                if (h2 != null) {
                    h2.a(0, new int[]{1});
                    rs.d.k.a(h2, new int[]{49, 66, 19379, 26537}, new int[]{80, 80, 77, 77});
                }
                return true;
            }
            case 21644: {
                if (h2 != null) {
                    h2.a(0, new int[]{1});
                    rs.d.k.a(h2, new int[]{49, 66, 19379, 26537, 127, 103, 86}, new int[]{62, 62, 60, 60, 93, 93, 93});
                }
                return true;
            }
            case 23655: {
                if (h2 != null) {
                    h2.a(0, new int[]{1});
                    h2.a(24, new int[]{1});
                    h2.a(37, new int[]{1});
                    rs.d.k.a(h2, new int[]{49, 66, 19379, 26537, 128, 104, 87}, new int[]{194, 194, 60, 60, 58, 58, 58});
                }
                return true;
            }
            case 23656: {
                if (h2 != null) {
                    h2.a(0, new int[]{1});
                    h2.a(24, new int[]{1});
                    h2.a(37, new int[]{1});
                    rs.d.k.a(h2, new int[]{49, 66, 19379, 26537, 127, 103, 86}, new int[]{156, 156, 60, 60, 139, 139, 139});
                }
                return true;
            }
            case 23622: {
                if (h2 != null) {
                    h2.a(6583, new int[]{6});
                    h2.a(6604, new int[]{8, 7, 6});
                    h2.a(6587, new int[]{6, 5, 4});
                    h2.a(6464, new int[]{4});
                    h2.a(60065, new int[]{4});
                    h2.a(60184, new int[]{4});
                    rs.d.k.a(h2, new int[]{4, 5, 6, 7, 8}, new int[]{61, 61, 60, 60, 61});
                }
                return true;
            }
            case 23621: 
            case 26108: {
                if (h2 != null) {
                    h2.a(6583, new int[]{6});
                    h2.a(6604, new int[]{8, 7, 6});
                    h2.a(6587, new int[]{6, 5, 4});
                    h2.a(6464, new int[]{4});
                    h2.a(60065, new int[]{4});
                    h2.a(60184, new int[]{4});
                    rs.d.k.a(h2, new int[]{4, 5, 6, 7, 8}, new int[]{51, 51, 60, 60, 51});
                }
                return true;
            }
            case 21163: {
                if (h2 != null) {
                    h2.a(6583, new int[]{6});
                    h2.a(6604, new int[]{8, 7, 6});
                    h2.a(6587, new int[]{6, 5, 4});
                    h2.a(6464, new int[]{4});
                    h2.a(60065, new int[]{4});
                    h2.a(60184, new int[]{4});
                    rs.d.k.a(h2, new int[]{4, 5, 6, 7, 8}, new int[]{277, 82, 60, 60, 277});
                }
                return true;
            }
            case 22086: {
                if (h2 != null) {
                    rs.d.k.a(h2, new int[]{10351}, new int[]{231});
                }
                return true;
            }
            case 23493: {
                if (h2 != null) {
                    rs.d.k.a(h2, new int[]{10351}, new int[]{139});
                }
                return true;
            }
            case 23636: {
                if (h2 != null) {
                    rs.d.k.a(h2, new int[]{10351}, new int[]{131});
                }
                return true;
            }
            case 23637: {
                if (h2 != null) {
                    rs.d.k.a(h2, new int[]{10351}, new int[]{76});
                }
                return true;
            }
            case 25537: {
                if (h2 != null) {
                    rs.d.k.a(h2, new int[]{10351}, new int[]{124});
                }
                return true;
            }
            case 21868: {
                if (h2 != null) {
                    h2.a(12, new int[]{6});
                    h2.a(90, new int[]{8, 7, 6});
                    h2.a(84, new int[]{6, 5, 4});
                    h2.a(70, new int[]{4});
                    h2.a(61, new int[]{4});
                    h2.a(53, new int[]{4});
                    h2.a(45, new int[]{4});
                    h2.a(0, new int[]{1});
                    rs.d.k.a(h2, new int[]{8381, 6350, 6340, 8371, 38169, 38161, 38155, 91, 85, 547, 557, 842, 6345}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 62, 62, 62, 60});
                }
                return true;
            }
            case 11675: {
                if (h2 != null) {
                    h2.a(12, new int[]{6});
                    h2.a(90, new int[]{6});
                    h2.a(85, new int[]{6});
                    h2.a(70, new int[]{4});
                    h2.a(61, new int[]{4});
                    h2.a(53, new int[]{4});
                    h2.a(45, new int[]{4});
                    h2.a(0, new int[]{1});
                    rs.d.k.a(h2, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 74, 7050, 88, 78}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 62, 62, 62, 62});
                }
                return true;
            }
            case 24100: {
                if (h2 != null) {
                    h2.a(12, new int[]{6});
                    h2.a(90, new int[]{6});
                    h2.a(85, new int[]{6});
                    h2.a(70, new int[]{4});
                    h2.a(61, new int[]{4});
                    h2.a(53, new int[]{4});
                    h2.a(45, new int[]{4});
                    h2.a(0, new int[]{1});
                    rs.d.k.a(h2, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24, 74, 7050, 88, 78}, new int[]{60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 54, 54, 54, 54});
                }
                return true;
            }
            case 23217: {
                rs.d.k.a(h2, new int[]{61, 8757}, new int[]{110, 60});
                return true;
            }
            case 21880: 
            case 22517: 
            case 24112: {
                rs.d.k.a(h2, new int[]{61, 8757}, new int[]{55, 72});
                return true;
            }
            case 23218: {
                rs.d.k.a(h2, new int[]{926, 10349, 0, 127}, new int[]{61, 60, 60, 60});
                return true;
            }
            case 23219: {
                rs.d.k.a(h2, new int[]{926}, new int[]{61});
                return true;
            }
            case 23654: {
                rs.d.k.a(h2, new int[]{926}, new int[]{156});
                return true;
            }
            case 22494: {
                rs.d.k.a(h2, new int[]{4626}, new int[]{55});
                return true;
            }
            case 23954: {
                h2.g(23);
                h2.g(0, -1);
                return true;
            }
            case 22518: {
                rs.d.k.a(h2, new int[]{668, 673, 553, 549, 0, 4, 8, 12, 16, 20, 24}, new int[]{55, 55, 55, 55, 72, 72, 72, 72, 72, 72, 72});
                return true;
            }
            case 22152: {
                h2.g(23);
                h2.a(23, new int[]{302770, 419770, 419770, 302770});
                return true;
            }
            case 22153: {
                h2.g(23);
                h2.a(23, new int[]{127, 955, 955, 127});
                return true;
            }
            case 22154: {
                h2.g(23);
                h2.a(23, new int[]{461770, 76770});
                return true;
            }
            case 23952: {
                h2.a(new int[]{163, 167, 138, 70}, new int[]{1337});
                h2.a(new int[]{158, 154, 26, 30, 53, 61, 35}, new int[]{1338});
                h2.a(new int[]{66, 57}, new int[]{1339});
                h2.b(new int[]{1337, 1338, 1339}, new int[]{120, 262, 140});
                return true;
            }
            case 23950: {
                h2.a(new int[]{20}, new int[]{1, 1, 1, 1, 2, 2, 2});
                h2.b(new int[]{1, 2, 28, 127}, new int[]{262, 120, 140, 140});
                return true;
            }
            case 22155: {
                h2.g(23);
                h2.a(23, new int[]{920, 960});
                return true;
            }
            case 22144: 
            case 22149: 
            case 22150: 
            case 22151: 
            case 22255: {
                h2.g(4);
                h2.g(0, -1);
                return true;
            }
            case 23222: {
                if (h2 != null) {
                    h2.a(61, new int[]{3, 4});
                    h2.a(82, new int[]{3, 4});
                    rs.d.k.a(h2, new int[]{8757, 22459, 82, 926, 5012}, new int[]{68, 68, 68, 68, 68});
                    h2.g(0, -1);
                }
                return true;
            }
            case 23223: {
                h2.a(22410, new int[]{40});
                rs.d.k.a(h2, new int[]{2999}, new int[]{68});
                h2.g(0, -1);
                return true;
            }
            case 22928: {
                rs.d.k.a(h2, new int[]{21568, 0, 127, 55192, 54951, 55770, 54414, 52166, 55888, 55884, 56018, 56020}, new int[]{60, 54, 54, 60, 54, 54, 60, 60, 54, 54, 60, 60});
                return true;
            }
            case 21666: {
                rs.d.k.a(h2, new int[]{54371, 52323, 54348, 54484, 52446, 52442, 55527, 57575, 2588, 2469, 2593, 11815, 8377, 8381, 8390, 2595, 2590, 10324, 1934, 10332, 10295, 10308, 54480, 54472, 54476, 54488, 56545, 55646, 49226, 49234, 48198, 54443}, new int[]{60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60});
                return true;
            }
            case 21667: {
                rs.d.k.a(h2, new int[]{898, 54443, 54447, 54435, 59437, 54329, 528, 54321, 7362, 8381, 284, 280, 404, 8390, 2217, 2213, 51078, 24, 2221, 274, 8377, 7349, 8369, 7341, 8361, 2337, 45245, 45254, 45241, 45237, 45250, 54410, 50450, 50330, 50334, 45361, 8386, 8394, 278, 61, 49, 54333, 54338, 54342, 22, 18, 289, 165}, new int[]{60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 60, 60, 60, 60, 60, 54, 54, 54, 54, 54, 60, 60, 60, 60, 60, 54, 54, 54});
                return true;
            }
            case 21668: {
                rs.d.k.a(h2, new int[]{54319, 58526, 58646, 54315, 8421, 8425, 58539, 3414, 181, 35, 8417, 54323, 3406, 1329, 7628, 7632, 7764, 1709, 54311, 305, 301, 297, 417, 3604, 293, 2578, 2954}, new int[]{60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54});
                return true;
            }
            case 21669: {
                rs.d.k.a(h2, new int[]{3261, 3266, 301, 293, 3253, 59548, 59544, 59664, 3369, 3373, 8410, 8414, 59553, 7390, 7510, 59429, 7399, 59540, 198, 7403, 206, 202, 3365, 214, 111, 3377}, new int[]{60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54, 60, 60, 54, 60, 60, 60, 60, 60, 54, 54});
                return true;
            }
            case 21575: {
                h2.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                rs.d.k.a(h2, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355}, new int[]{60, 40, 60, 40, 60, 40, 60, 40, 60, 40, 40, 60});
                return true;
            }
            case 24093: {
                h2.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                rs.d.k.a(h2, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355}, new int[]{60, 53, 60, 53, 60, 53, 60, 53, 60, 53, 53, 60});
                return true;
            }
            case 21576: {
                h2.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                rs.d.k.a(h2, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355}, new int[]{60, 56, 60, 56, 60, 56, 60, 56, 60, 56, 56, 60});
                return true;
            }
            case 23054: {
                h2.a(11150, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160});
                rs.d.k.a(h2, new int[]{11151, 11152, 11153, 11154, 11155, 11156, 11157, 11158, 11159, 11160, 9108, 10355}, new int[]{60, 57, 60, 57, 60, 57, 60, 57, 60, 57, 57, 60});
                return true;
            }
            case 21670: {
                rs.d.k.b(h2, 61);
                return true;
            }
            case 21671: {
                rs.d.k.b(h2, 60);
                return true;
            }
            case 22179: {
                rs.d.k.b(h2, 57);
                return true;
            }
            case 21674: {
                rs.d.k.a(h2, new int[]{6032, 40, 920, 8, 937, 0, 43057, 924}, new int[]{61, 34, 61, 61, 61, 61, 61, 34});
                rs.d.k.b(h2, 61);
                return true;
            }
            case 21675: {
                rs.d.k.a(h2, new int[]{6032, 40, 920, 8, 937, 0, 43057, 924}, new int[]{60, 34, 60, 60, 60, 60, 60, 34});
                rs.d.k.b(h2, 60);
                return true;
            }
            case 21720: {
                rs.d.k.a(h2, new int[]{54306, 54311, 54288, 54313, 54320, 54310, 54315, 54327, 54299, 54829, 54843, 54301, 54298, 54302, 54318}, new int[]{61, 34, 51, 61, 51, 61, 61, 34, 60, 60, 60, 60, 60, 60, 60});
                return true;
            }
            case 22145: {
                rs.d.k.a(h2, new int[]{54306, 54312, 54289, 54313, 54321, 54310, 54315, 54328, 54299, 54829, 54843, 54301, 54298, 54302, 54318}, new int[]{76, 34, 51, 76, 51, 76, 76, 34, 76, 76, 76, 76, 60, 60, 60});
                h2.g(2);
                h2.g(50, -1);
                return true;
            }
            case 21721: {
                rs.d.k.a(h2, new int[]{5165, 5160, 5155, 1315, 1325, 5150, 5140, 26802, 26807, 26817, 26827, 1320, 1310, 5157}, new int[]{60, 60, 51, 51, 51, 61, 61, 51, 61, 51, 61, 60, 60, 60});
                return true;
            }
            case 21722: {
                rs.d.k.a(h2, new int[]{16459, 8598, 16465, 16474, 16471, 16468, 16464, 16484, 16481, 16461, 16439, 16434, 16429, 8592, 8595, 8601, 8604}, new int[]{61, 51, 60, 61, 60, 61, 60, 51, 60, 60, 60, 60, 60, 60, 60, 60, 60});
                return true;
            }
            case 21133: {
                rs.d.k.b(h2, 62);
                return true;
            }
            case 21134: {
                rs.d.k.a(h2, new int[]{11175}, new int[]{62});
                return true;
            }
            case 21127: 
            case 21559: {
                rs.d.k.a(h2, new int[]{280, 924, 920, 43166, 538, 43156, 520, 127}, new int[]{60, 60, 60, 54, 60, 60, 60, 54});
                return true;
            }
            case 22882: 
            case 27288: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{80, 61, 61, 61, 80, 80});
                return true;
            }
            case 21959: 
            case 21961: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{74, 54, 54, 54, 74, 74});
                return true;
            }
            case 22881: 
            case 27287: {
                rs.d.k.a(h2, new int[]{280, 924, 920, 43166, 538, 43156, 520, 127}, new int[]{60, 61, 60, 80, 60, 60, 60, 53});
                return true;
            }
            case 21960: 
            case 21962: {
                rs.d.k.a(h2, new int[]{280, 924, 920, 43166, 538, 43156, 520, 127}, new int[]{60, 74, 60, 54, 60, 60, 60, 54});
                return true;
            }
            case 22287: 
            case 22289: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{56, 105, 105, 105, 56, 56});
                return true;
            }
            case 22288: 
            case 22290: {
                rs.d.k.a(h2, new int[]{280, 924, 920, 43166, 538, 43156, 520, 127}, new int[]{60, 105, 60, 56, 60, 60, 60, 56});
                return true;
            }
            case 21090: {
                rs.d.k.a(h2, new int[]{10004, 25238, 8741, 4550, 908, 7073, 0, 5231, 5353, 10004, 61, 72, 98, 89}, new int[]{60, 60, 60, 60, 60, 60, 60, 62, 62, 62, 62, 62, 62, 62});
                return true;
            }
            case 21088: {
                rs.d.k.a(h2, new int[]{123, 127, 22410, 29113, 908, 937, 5933, 123, 22410, 4550, 947, 5813, 11200}, new int[]{60, 59, 59, 59, 59, 59, 60, 60, 60, 63, 60, 60, 59});
                return true;
            }
            case 21087: {
                rs.d.k.b(h2, 53);
                return true;
            }
            case 21084: {
                rs.d.k.a(h2, 10351, 61);
                return true;
            }
            case 21130: {
                rs.d.k.a(h2, new int[]{10343, 37929, 37925, 38044, 35720, 38049, 38040, 31419, 43059, 43057, 43916, 43076, 43908, 43061, 43043, 43113, 43220, 43080, 43055, 43038, 43051, 43034}, new int[]{56, 54, 54, 56, 56, 56, 54, 54, 54, 54, 54, 54, 54, 54, 56, 54, 54, 56, 54, 54, 56, 54});
                return true;
            }
            case 21083: {
                rs.d.k.a(h2, new int[]{8396, 8417, 20}, new int[]{55, 63, 62});
                return true;
            }
            case 22813: {
                rs.d.k.a(h2, new int[]{8396, 8417, 20}, new int[]{71, 71, 54});
                return true;
            }
            case 22814: {
                h2.b(new int[]{4363, 4375, 4369, 4357, 661, 258, 33817, 40003, 39996, 40967, 39992, 39999, 40007, 40000, 39995, 39988, 39953}, new int[]{71, 59, 59, 59, 71, 71, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54});
                return true;
            }
            case 16001: {
                rs.d.k.a(h2, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, 32830, 32839, 22464}, new int[]{52, 52, 52, 52, 52, 52, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 34});
                return true;
            }
            case 16002: {
                rs.d.k.a(h2, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, 32830, 32839, 22464}, new int[]{258, 258, 258, 258, 258, 258, 46, 46, 46, 46, 46, 10, 10, 10, 10, 10, 10, 34});
                return true;
            }
            case 16003: {
                rs.d.k.a(h2, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, 32830, 32839, 22464}, new int[]{138, 138, 138, 138, 138, 138, 46, 46, 46, 46, 46, 10, 10, 10, 10, 10, 10, 34});
                return true;
            }
            case 16004: {
                rs.d.k.a(h2, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, 32830, 32839, 22464}, new int[]{54, 54, 54, 54, 54, 54, 58, 58, 58, 58, 58, 10, 10, 10, 10, 10, 10, 34});
                return true;
            }
            case 16005: {
                rs.d.k.a(h2, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11093, 9152, 7087, 32822, 32847, 7998, 8118, 32830, 32839, 22464}, new int[]{273, 273, 273, 273, 273, 273, 60, 60, 60, 60, 60, 10, 10, 10, 10, 10, 10, 34});
                return true;
            }
            case 16006: {
                rs.d.k.a(h2, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, 32821, 32846, 7997, 8117, 32829, 32838, 22464}, new int[]{53, 53, 53, 53, 53, 53, 60, 60, 60, 60, 60, 60, 60, 60, 10, 10, 10, 34});
                return true;
            }
            case 16007: {
                rs.d.k.a(h2, new int[]{20416, 22451, 11224, 22181, 22449, 22305, 21435, 9164, 11092, 9152, 7087, 32821, 32846, 7997, 8117, 32829, 32838, 22464}, new int[]{208, 208, 208, 208, 208, 208, 249, 249, 249, 249, 249, 249, 249, 249, 240, 240, 240, 34});
                return true;
            }
            case 21943: {
                rs.d.k.a(h2, new int[]{71, 97, 72, 98}, new int[]{62, 62, 62, 62});
                return true;
            }
            case 21944: {
                if (h2 != null) {
                    h2.g(0, -1);
                }
                if (h2 != null) {
                    h2.g(3);
                }
                return true;
            }
            case 21077: {
                rs.d.k.a(h2, new int[]{33817, 40003, 39996, 40967, 39992, 39999, 40007, 40000, 39995, 39988, 39953, 4363, 4375, 4369, 4357, 661, 258}, new int[]{61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 61, 55, 55, 55, 55, 55, 55});
                return true;
            }
            case 21076: {
                rs.d.k.a(h2, new int[]{0, 528, 652, 43150, 7326, 7446, 16545, 16425, 16540, 7331}, new int[]{62, 62, 62, 62, 60, 60, 60, 60, 60, 62});
                return true;
            }
            case 21075: {
                rs.d.k.a(h2, new int[]{22418, 22451, 37}, new int[]{62, 62, 60});
                return true;
            }
            case 21074: {
                rs.d.k.a(h2, new int[]{5070, 5086, 5056, 5062, 5054, 5058, 5094, 5050, 5068, 5084, 5088, 5074, 5078, 5112, 5102, 5092}, 53);
                return true;
            }
            case 21601: {
                rs.d.k.a(h2, new int[]{5070, 5086, 5056, 5062, 5054, 5058, 5094, 5050, 5068, 5084, 5088, 5074, 5078, 5112, 5102, 5092}, 54);
                return true;
            }
            case 21072: {
                rs.d.k.b(h2, 62);
                return true;
            }
            case 21071: {
                rs.d.k.b(h2, 54);
                return true;
            }
            case 21067: {
                rs.d.k.b(h2, 5);
                return true;
            }
            case 21563: {
                rs.d.k.a(h2, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12}, new int[]{62, 55, 62, 55, 62, 55, 62, 55, 62, 55, 62, 55, 62});
                return true;
            }
            case 23017: {
                h2.a(new int[]{5084, 5088, 278, 266, 5074, 5078, 408, 5056, 5062, 4, 5070, 143, 273, 5054, 5058, 5094, 5050, 5068, 133, 2, 5086, 280, 7321, 267, 5092, 265, 5102, 5112, 270}, 5);
                return true;
            }
            case 23018: {
                h2.b(new int[]{5084, 5088, 278, 266, 5074, 5078, 408, 5056, 5062, 4, 5070, 143, 273, 5054, 5058, 5094, 5050, 5068, 133, 2, 5086, 280, 7321, 267, 5092, 265, 5102, 5112, 270, 409, 406, 414, 411, 139, 137, 135, 816}, new int[]{179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 338, 338, 338, 338, 338, 338, 338, 338});
                return true;
            }
            case 23007: {
                rs.d.k.a(h2, new int[]{11171, 11175, 14102}, new int[]{60, 72, 60});
                return true;
            }
            case 23029: {
                rs.d.k.a(h2, new int[]{10351, 7070}, new int[]{72, 55});
                return true;
            }
            case 21038: {
                rs.d.k.a(h2, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650}, new int[]{60, 40, 40, 40, 40, 40, 40, 60, 60});
                return true;
            }
            case 21039: {
                rs.d.k.a(h2, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650}, new int[]{60, 56, 56, 56, 56, 56, 56, 60, 60});
                return true;
            }
            case 21738: {
                rs.d.k.a(h2, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650}, new int[]{60, 58, 58, 58, 58, 58, 58, 60, 60});
                return true;
            }
            case 22885: 
            case 22886: {
                rs.d.k.a(h2, new int[]{127, 815, 914, 675, 784, 4820, 945, 685, 5458, 972}, 52);
                return true;
            }
            case 21024: {
                rs.d.k.a(h2, new int[]{127}, 40);
                return true;
            }
            case 21014: {
                rs.d.k.a(h2, 9164, 40);
                return true;
            }
            case 21015: {
                rs.d.k.a(h2, 9164, 56);
                return true;
            }
            case 22860: {
                rs.d.k.a(h2, 9164, 60);
                if (h2 != null) {
                    h2.g(0, -1);
                }
                if (h2 != null) {
                    h2.g(3);
                }
                return true;
            }
            case 21863: {
                rs.d.k.a(h2, new int[]{9164, 6583, 6604, 6587, 6464, 6742}, new int[]{60, 57, 60, 57, 57, 57});
                return true;
            }
            case 22861: {
                rs.d.k.a(h2, 9164, 60);
                if (h2 != null) {
                    h2.g(0, -1);
                }
                if (h2 != null) {
                    h2.g(127);
                }
                return true;
            }
            case 21013: {
                rs.d.k.a(h2, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{60, 60, 62, 62, 60, 60, 60, 62});
                return true;
            }
            case 21036: {
                rs.d.k.a(h2, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{40, 40, 40, 40, 40, 40, 40, 40});
                return true;
            }
            case 21739: {
                rs.d.k.a(h2, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{58, 58, 58, 58, 58, 58, 58, 58});
                return true;
            }
            case 21037: {
                rs.d.k.a(h2, new int[]{45534, 49707, 47382, 49946, 49088, 24, 49046, 38119}, new int[]{56, 56, 56, 56, 56, 56, 56, 56});
                return true;
            }
            case 21010: {
                rs.d.k.a(h2, new int[]{21, 24, 12, 941}, new int[]{60, 60, 60, 62});
                return true;
            }
            case 22832: {
                rs.d.k.a(h2, new int[]{21, 24, 12, 941}, new int[]{71, 71, 71, 54});
                return true;
            }
            case 20558: {
                rs.d.k.a(h2, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650, 10306, 7390, 935}, new int[]{60, 54, 54, 54, 54, 54, 54, 60, 60, 60, 60, 61});
                return true;
            }
            case 23491: {
                rs.d.k.a(h2, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650, 10306, 7390, 935}, new int[]{102, 109, 109, 109, 109, 109, 109, 102, 102, 102, 102, 81});
                return true;
            }
            case 21106: {
                rs.d.k.a(h2, new int[]{908, 54162, 41137, 41149, 41143, 6998, 40107, 14734}, new int[]{60, 60, 60, 60, 60, 60, 60, 60});
                return true;
            }
            case 21250: {
                rs.d.k.a(h2, new int[]{55180, 57228}, new int[]{60, 60});
                return true;
            }
            case 21253: {
                h2.a(5640, new int[]{915});
                h2.a(4502, new int[]{5});
                h2.a(4750, new int[]{15});
                h2.a(9135, new int[]{7114});
                h2.a(5388, new int[]{925});
                rs.d.k.a(h2, new int[]{8363}, new int[]{60});
                return true;
            }
            case 21107: 
            case 22839: 
            case 28044: {
                rs.d.k.a(h2, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24}, new int[]{62, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 62});
                return true;
            }
            case 21108: 
            case 22840: 
            case 28045: {
                rs.d.k.a(h2, new int[]{21563, 21580, 21559, 33678, 21555, 28, 82}, new int[]{60, 62, 60, 60, 60, 62, 62});
                return true;
            }
            case 22833: 
            case 22834: {
                rs.d.k.a(h2, new int[]{12, 0, 28, 941, 943, 406, 530, 280, 148, 152}, new int[]{71, 71, 71, 54, 54, 54, 71, 71, 71, 71});
                return true;
            }
            case 24083: {
                h2.a(61, new int[]{7, 8, 9});
                rs.d.k.a(h2, new int[]{7, 8, 9, 8757}, new int[]{54, 60, 60, 60});
                return true;
            }
            case 24192: 
            case 24193: {
                h2.a(61, new int[]{7, 8, 9});
                rs.d.k.a(h2, new int[]{7, 8, 9, 8757}, new int[]{60, 54, 60, 54});
                return true;
            }
            case 24072: 
            case 24074: 
            case 28046: {
                rs.d.k.a(h2, new int[]{115, 123, 103, 7442, 33678, 7446, 7322, 7326, 33554, 33306, 33430, 33182, 24}, new int[]{54, 60, 54, 60, 54, 60, 54, 60, 60, 60, 60, 60, 54});
                return true;
            }
            case 24073: 
            case 24075: 
            case 28047: {
                rs.d.k.a(h2, new int[]{21563, 21580, 21559, 33678, 21555, 28, 82}, new int[]{60, 54, 60, 60, 60, 54, 54});
                return true;
            }
            case 24069: 
            case 24076: {
                rs.d.k.a(h2, new int[]{21, 24, 12, 941}, new int[]{60, 54, 60, 54});
                return true;
            }
            case 24070: 
            case 24071: 
            case 24077: 
            case 24078: {
                rs.d.k.a(h2, new int[]{12, 0, 28, 941, 943, 406, 530, 280, 148, 152}, new int[]{54, 54, 54, 60, 60, 60, 54, 54, 54, 54});
                return true;
            }
            case 24079: 
            case 24080: 
            case 24081: 
            case 24082: {
                if (h2 != null) {
                    h2.a(14395, new int[]{7, 8, 9});
                    rs.d.k.a(h2, new int[]{14387, 127, 85}, new int[]{54, 54, 54});
                }
                return true;
            }
            case 22838: {
                rs.d.k.a(h2, new int[]{7607}, new int[]{71});
                return true;
            }
            case 21860: {
                rs.d.k.a(h2, new int[]{7607}, new int[]{29});
                return true;
            }
            case 21869: {
                rs.d.k.a(h2, new int[]{7607}, new int[]{62});
                return true;
            }
            case 21870: {
                rs.d.k.a(h2, new int[]{7607}, new int[]{108});
                return true;
            }
            case 21871: {
                rs.d.k.a(h2, new int[]{152, 274, 520, 268, 156, 33753, 33460, 33473, 33906}, new int[]{108, 108, 108, 108, 108, 108, 108, 108, 108});
                return true;
            }
            case 22112: {
                rs.d.k.a(h2, new int[]{152, 274, 520, 268, 156, 33753, 33460, 33473, 33906}, new int[]{76, 76, 76, 76, 76, 76, 76, 76, 76});
                return true;
            }
            case 21831: {
                h2.a(10351, new int[]{41257});
                return true;
            }
            case 21832: {
                h2.a(10351, new int[]{21541});
                return true;
            }
            case 21857: 
            case 21858: 
            case 21859: {
                rs.d.k.a(h2, new int[]{10351}, new int[]{54});
                return true;
            }
            case 21011: 
            case 21012: {
                rs.d.k.a(h2, new int[]{12, 0, 28, 941, 943, 406, 530, 280, 148, 152}, new int[]{60, 60, 60, 62, 62, 62, 60, 60, 60, 60});
                return true;
            }
            case 21004: {
                rs.d.k.a(h2, new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{102, 102, 102, 102, 102});
                h2.g(0, -1);
                return true;
            }
            case 21864: {
                rs.d.k.a(h2, new int[]{43063, 10339, 23876, 43080, 16912, 16912, 43080}, new int[]{72, 55, 55, 55, 72, 55, 55});
                h2.a(new int[]{43055}, new int[]{36170});
                h2.a(new int[]{16912, 14765}, new int[]{36170});
                h2.a(new int[]{43069, 43063, 43076}, new int[]{61889, 59728, 36170, 59734});
                return true;
            }
            case 21865: {
                rs.d.k.a(h2, new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{60, 52, 60, 60, 52});
                h2.g(0, -1);
                return true;
            }
            case 21001: 
            case 21002: 
            case 21003: {
                rs.d.k.b(h2, 61);
                return true;
            }
            case 23965: 
            case 23971: 
            case 23977: {
                rs.d.k.b(h2, 163);
                return true;
            }
            case 23966: 
            case 23972: 
            case 23978: {
                rs.d.k.b(h2, 56);
                return true;
            }
            case 23967: 
            case 23973: 
            case 23979: {
                rs.d.k.b(h2, 221);
                return true;
            }
            case 23968: 
            case 23974: 
            case 23980: {
                rs.d.k.b(h2, 63);
                return true;
            }
            case 23969: 
            case 23975: 
            case 23981: {
                rs.d.k.b(h2, 206);
                return true;
            }
            case 23970: 
            case 23976: 
            case 23982: {
                rs.d.k.b(h2, 71);
                return true;
            }
            case 22871: {
                rs.d.k.a(h2, new int[]{1938, 912, 910, 809, 1814, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{60, 54, 60, 54, 60, 54, 60, 54, 54, 60, 60, 60});
                return true;
            }
            case 20996: {
                rs.d.k.a(h2, new int[]{1938, 912, 910, 809, 1814, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{30, 60, 30, 60, 30, 29, 30, 29, 30, 60, 60, 60});
                return true;
            }
            case 20995: {
                rs.d.k.a(h2, new int[]{5813, 26006, 9139}, new int[]{30, 58, 58});
                return true;
            }
            case 22843: {
                rs.d.k.a(h2, new int[]{5813, 26006, 9139}, new int[]{62, 61, 61});
                return true;
            }
            case 22878: {
                rs.d.k.a(h2, new int[]{3346, 5058, 6084, 8134, 37, 1441, 82, 7834, 1321, 24, 20, 7700}, new int[]{60, 54, 60, 54, 60, 54, 60, 54, 60, 60, 60, 54});
                return true;
            }
            case 22879: {
                rs.d.k.a(h2, new int[]{61, 8758}, new int[]{60, 60});
                return true;
            }
            case 20992: 
            case 21558: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{60, 54, 54, 54, 60, 60});
                return true;
            }
            case 22117: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{108, 60, 60, 60, 108, 108});
                return true;
            }
            case 24188: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{91, 115, 115, 115, 91, 91});
                return true;
            }
            case 24189: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{86, 130, 130, 130, 86, 86});
                return true;
            }
            case 24190: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{256, 191, 191, 191, 256, 256});
                return true;
            }
            case 24191: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{134, 263, 263, 263, 134, 134});
                return true;
            }
            case 23494: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{109, 102, 102, 102, 109, 109});
                return true;
            }
            case 21714: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{61, 51, 51, 53, 53, 61});
                return true;
            }
            case 21715: {
                rs.d.k.a(h2, new int[]{7334, 46115, 7366, 7361, 7338, 7396, 7357, 7342, 7362, 46268, 7380, 46248, 46243, 7376, 7353, 7346, 7358, 7368, 7372, 7349, 7354, 43098, 43108, 46130, 46278, 10679, 10427, 46273, 20, 43118, 43077}, new int[]{61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 61, 51, 51, 51, 61, 51});
                return true;
            }
            case 21716: {
                rs.d.k.a(h2, new int[]{5272, 5276, 5392, 5281, 8656}, new int[]{51, 53, 61, 61, 61});
                return true;
            }
            case 21717: {
                rs.d.k.a(h2, new int[]{21568, 0, 127, 55192, 54951, 55770, 54414, 52166}, new int[]{51, 61, 51, 51, 61, 53, 53, 53});
                return true;
            }
            case 21718: {
                rs.d.k.a(h2, new int[]{36007}, new int[]{53});
                return true;
            }
            case 21719: {
                rs.d.k.a(h2, new int[]{914, 675, 784, 4820, 945, 685, 5458, 972}, new int[]{61, 61, 61, 51, 51, 51, 51, 51});
                return true;
            }
            case 21723: {
                h2.a(61, new int[]{11151});
                rs.d.k.a(h2, new int[]{11177, 5018, 10351, 11151}, new int[]{60, 53, 60, 60});
                return true;
            }
            case 21725: {
                rs.d.k.a(h2, new int[]{103, 10291, 0, 43280, 38040, 40094, 40210, 6028, 10279, 36007, 929, 28, 33}, new int[]{60, 53, 60, 51, 60, 53, 61, 61, 60, 61, 51, 60, 60, 53});
                return true;
            }
            case 21724: 
            case 21730: {
                rs.d.k.a(h2, new int[]{49946, 49701, 49723, 48708, 48604, 49837, 48918, 49829, 50650, 10306, 7390, 935}, new int[]{60, 53, 53, 53, 53, 53, 53, 60, 60, 60, 60, 53});
                return true;
            }
            case 20811: {
                rs.d.k.a(h2, new int[]{8128}, new int[]{40});
                return true;
            }
            case 22012: 
            case 22013: {
                rs.d.k.b(h2, 40);
                return true;
            }
            case 20807: {
                rs.d.k.b(h2, 54);
                return true;
            }
            case 22850: {
                rs.d.k.b(h2, 40);
                return true;
            }
            case 22851: {
                rs.d.k.b(h2, 56);
                return true;
            }
            case 22852: {
                rs.d.k.a(h2, new int[]{4027, 7105, 5056}, new int[]{40, 46, 40});
                return true;
            }
            case 23180: {
                rs.d.k.a(h2, new int[]{22447, 22451, 22457, 906, 898, 910, 908, 904, 902}, new int[]{61, 61, 61, 61, 61, 62, 61, 62, 61});
                return true;
            }
            case 22853: {
                rs.d.k.a(h2, new int[]{32878, 38015, 38101, 37980}, new int[]{56, 56, 56, 56});
                return true;
            }
            case 22847: 
            case 22848: 
            case 22849: {
                rs.d.k.a(h2, new int[]{82, 6709, 7073}, new int[]{60, 54, 54});
                return true;
            }
            case 20798: {
                rs.d.k.a(h2, new int[]{4515, 16425, 14490}, 54);
                return true;
            }
            case 23229: {
                rs.d.k.a(h2, new int[]{4515, 16425, 14490}, 68);
                return true;
            }
            case 21820: {
                rs.d.k.a(h2, new int[]{4515, 16425, 14490}, 120);
                return true;
            }
            case 21946: {
                rs.d.k.a(h2, new int[]{4515, 16425, 14490}, new int[]{56, 55, 56});
                return true;
            }
            case 22067: {
                rs.d.k.a(h2, new int[]{4515, 16425, 14490}, new int[]{55, 62, 55});
                return true;
            }
            case 20799: {
                rs.d.k.a(h2, new int[]{43123, 8877, 9024, 9015, 9009, 5652}, new int[]{55, 55, 55, 54, 54, 54});
                return true;
            }
            case 20796: {
                rs.d.k.a(h2, new int[]{32878, 38015, 38101, 37980, 21554, 32803, 21534, 38089, 10304, 10316}, new int[]{53, 55, 55, 55, 54, 54, 54, 55, 54, 61});
                return true;
            }
            case 20776: {
                rs.d.k.a(h2, new int[]{43069, 43063, 10339, 23876, 43080}, new int[]{61, 62, 60, 60, 60});
                return true;
            }
            case 20775: {
                rs.d.k.a(h2, new int[]{33300, 6573, 410}, new int[]{60, 60, 62});
                return true;
            }
            case 21574: {
                rs.d.k.a(h2, new int[]{33300, 6573, 410}, new int[]{63, 63, 62});
                return true;
            }
            case 20774: {
                rs.d.k.a(h2, new int[]{37, 7114, 933, 935}, new int[]{42, 56, 72, 56});
                return true;
            }
            case 22104: {
                if (h2 != null) {
                    rs.d.k.a(h2, new int[]{6589, 6674}, new int[]{60, 54});
                }
                return true;
            }
            case 22108: {
                if (h2 != null) {
                    h2.a(49, new int[]{11, 12, 11, 11, 11, 12});
                    rs.d.k.a(h2, new int[]{11, 12}, new int[]{60, 61});
                }
                return true;
            }
            case 22099: 
            case 22876: 
            case 22877: {
                rs.d.k.a(h2, new int[]{43059, 8128}, new int[]{59, 59});
                return true;
            }
            case 23462: {
                h2.a(7062, new int[]{16});
                rs.d.k.a(h2, new int[]{43059, 8128, 13248}, new int[]{53, 53, 53});
                return true;
            }
            case 21923: 
            case 21924: {
                rs.d.k.a(h2, new int[]{43059, 8128}, new int[]{55, 55});
                return true;
            }
            case 22070: 
            case 22071: {
                rs.d.k.a(h2, new int[]{43059, 8128}, new int[]{62, 62});
                return true;
            }
            case 22085: {
                rs.d.k.a(h2, new int[]{43059, 8128}, new int[]{54, 54});
                return true;
            }
            case 25424: {
                rs.d.k.a(h2, new int[]{43059, 8128}, new int[]{58, 58});
                if (h2 != null) {
                    h2.a(new int[]{4510, 4502, 7093}, new int[]{5, 10, 15});
                }
                return true;
            }
            case 22100: {
                rs.d.k.a(h2, new int[]{43059, 8128}, new int[]{61, 61});
                if (h2 != null) {
                    h2.a(new int[]{4510, 4502, 7093}, new int[]{5, 10, 15});
                }
                return true;
            }
            case 20743: {
                rs.d.k.a(h2, new int[]{22410, 2999}, new int[]{62, 58});
                return true;
            }
            case 20738: {
                rs.d.k.a(h2, new int[]{5799, 6594, 5559, 5524}, 56);
                return true;
            }
            case 21672: {
                rs.d.k.a(h2, new int[]{5799, 6594, 5559, 5524}, 61);
                return true;
            }
            case 21677: 
            case 21684: {
                rs.d.k.a(h2, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{53, 53, 61, 61, 61});
                return true;
            }
            case 21678: 
            case 21685: {
                rs.d.k.a(h2, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{52, 52, 54, 54, 54});
                return true;
            }
            case 21679: 
            case 21686: {
                rs.d.k.a(h2, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{57, 57, 60, 60, 60});
                return true;
            }
            case 21940: {
                rs.d.k.a(h2, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{55, 55, 56, 56, 56});
                return true;
            }
            case 23162: 
            case 23163: {
                rs.d.k.a(h2, new int[]{960, 6984, 4930, 1730, 1969}, new int[]{63, 63, 60, 60, 60});
                return true;
            }
            case 21680: {
                rs.d.k.a(h2, new int[]{5799, 6594, 5559, 5524}, 60);
                return true;
            }
            case 21682: {
                rs.d.k.a(h2, new int[]{5799, 6594, 5559, 5524}, 54);
                return true;
            }
            case 22180: {
                rs.d.k.a(h2, new int[]{5799, 6594, 5559, 5524}, 57);
                return true;
            }
            case 21673: {
                rs.d.k.a(h2, new int[]{11171, 11175, 14102}, new int[]{37, 61, 61});
                return true;
            }
            case 22181: {
                rs.d.k.a(h2, new int[]{11171, 11175, 14102}, new int[]{60, 57, 60});
                return true;
            }
            case 21681: {
                rs.d.k.a(h2, new int[]{11171, 11175, 14102}, new int[]{37, 60, 60});
                return true;
            }
            case 21683: {
                rs.d.k.a(h2, new int[]{11171, 11175, 14102}, new int[]{37, 54, 54});
                return true;
            }
            case 20737: {
                rs.d.k.a(h2, new int[]{933}, new int[]{56});
                return true;
            }
            case 23474: {
                h2.a(new int[]{712, 152}, new int[]{13});
                h2.a(new int[]{262, 167, 0, 980, 962, 272, 582, 158}, new int[]{5});
                h2.a(new int[]{955}, new int[]{1});
                h2.a(new int[]{65459, 43968, 20288}, new int[]{380770});
                h2.b(new int[]{846, 728, 945}, new int[]{74, 74, 54});
                return true;
            }
            case 21041: 
            case 21605: {
                rs.d.k.a(h2, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12}, new int[]{54, 58, 54, 58, 54, 58, 54, 58, 54, 58, 54, 58, 54});
                return true;
            }
            case 22261: {
                if (rs.f.a.n == a.d.f || rs.f.a.n == a.d.e) {
                    rs.d.k.a(h2, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12}, new int[]{56, 72, 56, 72, 56, 72, 56, 72, 56, 72, 56, 72, 56});
                } else if (rs.f.a.n == a.d.d) {
                    rs.d.k.a(h2, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12}, new int[]{60, 68, 60, 68, 60, 68, 68, 68, 60, 68, 60, 68, 60});
                } else if (rs.f.a.n == a.d.b) {
                    rs.d.k.a(h2, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12}, new int[]{179, 56, 179, 56, 179, 56, 179, 56, 179, 56, 179, 56, 179});
                } else {
                    rs.d.k.a(h2, new int[]{12581, 13194, 9523, 9511, 9517, 5413, 5532, 5417, 5656, 5537, 5652, 8481, 12}, new int[]{261, 261, 337, 261, 261, 261, 337, 261, 337, 261, 337, 261, 337});
                }
                return true;
            }
            case 21665: {
                rs.d.k.a(h2, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{54, 60, 54, 54, 60, 54});
                return true;
            }
            case 22260: {
                if (rs.f.a.n == a.d.f || rs.f.a.n == a.d.e) {
                    rs.d.k.a(h2, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{56, 56, 56, 56, 72, 56});
                } else if (rs.f.a.n == a.d.d) {
                    rs.d.k.a(h2, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{60, 60, 68, 60, 68, 60});
                } else if (rs.f.a.n == a.d.b) {
                    rs.d.k.a(h2, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{179, 179, 179, 179, 56, 179});
                } else {
                    rs.d.k.a(h2, new int[]{7324, 7330, 7327, 7335, 7322, 7320}, new int[]{337, 261, 337, 337, 261, 337});
                }
                return true;
            }
            case 24171: {
                rs.d.k.a(h2, new int[]{65207, 11078, 65209, 7364, 7496, 7500}, new int[]{66, 66, 66, 66, 96, 96});
                return true;
            }
            case 15005: {
                rs.d.k.a(h2, new int[]{9643, 9763, 8406, 8070, 9647, 9878}, 54);
                return true;
            }
            case 20725: {
                rs.d.k.a(h2, new int[]{3379, 3491, 78, 86, 3363, 18, 41, 109, 127, 59, 82, 75, 52, 57, 119, 97, 112, 73, 70, 48, 26}, new int[]{61, 61, 62, 61, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62});
                return true;
            }
            case 24249: {
                if (h2 != null) {
                    h2.g(0, -1);
                }
                rs.d.k.a(h2, new int[]{3379, 3491, 78, 86, 3363, 18, 41, 109, 127, 59, 82, 75, 52, 57, 119, 97, 112, 73, 70, 48, 26}, new int[]{76, 76, 74, 76, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74});
                if (h2 != null) {
                    h2.g(3);
                }
                return true;
            }
            case 20724: {
                rs.d.k.b(h2, 30);
                return true;
            }
            case 24130: {
                if (h2 != null) {
                    h2.a(7073, new int[]{36192});
                    h2.a(61, new int[]{59724});
                    h2.a(43117, new int[]{59724});
                }
                return true;
            }
            case 24131: {
                if (h2 != null) {
                    h2.a(43117, new int[]{59954});
                    h2.a(61, new int[]{59724});
                    h2.a(7073, new int[]{5, 6});
                }
                rs.d.k.a(h2, new int[]{5, 6}, new int[]{55, 72});
                return true;
            }
            case 24132: {
                rs.d.k.a(h2, new int[]{7073, 43117}, new int[]{55, 72});
                if (h2 != null) {
                    h2.a(61, new int[]{59724});
                }
                return true;
            }
            case 24133: {
                if (h2 != null) {
                    h2.a(33, new int[]{36192});
                    h2.a(37, new int[]{59724});
                    h2.a(24, new int[]{36192});
                    h2.a(922, new int[]{59724});
                    h2.a(933, new int[]{36192});
                }
                return true;
            }
            case 24134: {
                if (h2 != null) {
                    h2.a(922, new int[]{36192});
                    rs.d.k.a(h2, new int[]{933, 33, 37, 24}, new int[]{55, 55, 55, 55});
                }
                return true;
            }
            case 24135: {
                if (h2 != null) {
                    rs.d.k.a(h2, new int[]{933, 33, 37, 24, 922}, new int[]{72, 72, 72, 72, 55});
                }
                return true;
            }
            case 24139: {
                if (h2 != null) {
                    rs.d.k.a(h2, new int[]{55772, 55733, 33, 57, 37, 49, 61}, new int[]{55, 55, 72, 72, 72, 72, 72});
                    h2.a(9026, new int[]{36192});
                    h2.a(8406, new int[]{59724});
                }
                return true;
            }
            case 10954: {
                rs.d.k.a(h2, new int[]{8596, 8720}, new int[]{29, 29});
                if (h2 != null) {
                    h2.a(7566, new int[]{15252});
                    h2.a(7690, new int[]{15260});
                    h2.a(7446, new int[]{15250});
                    h2.a(8720, new int[]{15260});
                    h2.a(8596, new int[]{15209});
                    h2.a(7326, new int[]{15252});
                }
                return true;
            }
            case 10956: {
                rs.d.k.a(h2, new int[]{7566, 8070}, new int[]{29, 29});
                if (h2 != null) {
                    h2.a(7566, new int[]{15252});
                    h2.a(7690, new int[]{15260});
                    h2.a(7446, new int[]{15250});
                    h2.a(8720, new int[]{15260});
                    h2.a(8596, new int[]{15209});
                    h2.a(7326, new int[]{15252});
                }
                return true;
            }
            case 10958: {
                if (h2 != null) {
                    h2.a(6674, new int[]{15252, 10005, 15252, 10005, 15252});
                }
                rs.d.k.a(h2, new int[]{10005}, new int[]{29});
                return true;
            }
            case 21861: {
                rs.d.k.a(h2, new int[]{8596, 8720, 7566, 7690}, new int[]{180, 180, 62, 180});
                if (h2 != null) {
                    h2.a(7446, new int[]{6});
                    h2.a(8720, new int[]{12, 11});
                    h2.a(8596, new int[]{6});
                    h2.a(7326, new int[]{12, 11});
                }
                return true;
            }
            case 21862: {
                rs.d.k.a(h2, new int[]{7566, 8070, 7326}, new int[]{180, 180, 62});
                if (h2 != null) {
                    h2.a(7566, new int[]{6, 5});
                    h2.a(7690, new int[]{12, 10});
                    h2.a(7446, new int[]{6, 5});
                    h2.a(8596, new int[]{6, 5});
                }
                return true;
            }
            case 21866: {
                if (h2 != null) {
                    h2.a(914, new int[]{7114, 7115});
                    h2.a(918, new int[]{7114, 7115});
                    h2.a(37, new int[]{10, 11, 10, 11, 10, 11, 10, 11, 7110, 11, 10, 11, 10, 11, 7110});
                }
                return true;
            }
            case 21830: {
                rs.d.k.a(h2, new int[]{6806, 6563, 61, 6439, 6443}, new int[]{62, 62, 60, 60, 62});
                if (h2 != null) {
                    h2.a(6558, new int[]{3});
                    h2.a(6439, new int[]{3});
                }
                return true;
            }
            case 20723: {
                rs.d.k.a(h2, new int[]{10475, 33}, new int[]{30, 29});
                return true;
            }
            case 20997: {
                rs.d.k.a(h2, new int[]{920, 0, 103}, new int[]{30, 29, 30});
                return true;
            }
            case 20998: {
                rs.d.k.a(h2, new int[]{0, 78, 920}, new int[]{29, 30, 29});
                return true;
            }
            case 23060: {
                rs.d.k.a(h2, new int[]{86, 0, 103, 82, 90, 78, 66}, new int[]{60, 86, 60, 97, 97, 86, 86});
                h2.g(30, -1);
                h2.g(2);
                return true;
            }
            case 23061: {
                rs.d.k.a(h2, new int[]{10266, 10258, 10283, 10291, 10275, 10262}, new int[]{60, 60, 86, 86, 60, 86});
                h2.g(30, -1);
                h2.g(2);
                return true;
            }
            case 20999: {
                rs.d.k.a(h2, new int[]{78, 103, 920, 0}, new int[]{30, 29, 30, 29});
                return true;
            }
            case 23055: {
                rs.d.k.b(h2, 111);
                return true;
            }
            case 23056: {
                rs.d.k.a(h2, new int[]{920, 0, 103}, new int[]{111, 73, 111});
                return true;
            }
            case 23057: 
            case 25954: {
                rs.d.k.a(h2, new int[]{65535, 0, 78, 920}, new int[]{73, 73, 111, 73});
                return true;
            }
            case 23058: {
                rs.d.k.a(h2, new int[]{78, 103, 920, 0}, new int[]{111, 111, 73, 73});
                return true;
            }
            case 20701: 
            case 24175: {
                rs.d.k.a(h2, new int[]{22410, 2999}, new int[]{53, 55});
                return true;
            }
            case 20695: {
                rs.d.k.a(h2, new int[]{7502, 29976, 27819, 29980, 28302}, new int[]{54, 58, 54, 54, 54, 58, 54, 54, 54, 54});
                return true;
            }
            case 20694: {
                h2.a(20, new int[]{7});
                rs.d.k.a(h2, new int[]{8396, 8417}, new int[]{53, 53});
                return true;
            }
            case 23175: {
                h2.a(20, new int[]{7});
                rs.d.k.a(h2, new int[]{8396, 8417}, new int[]{52, 52});
                return true;
            }
            case 24114: {
                rs.d.k.a(h2, new int[]{3346, 5058, 6084, 8134, 37, 1441, 82, 7834, 1321, 24, 20, 7700}, new int[]{72, 55, 55, 72, 55, 72, 55, 72, 72, 72, 72, 72});
                return true;
            }
            case 20687: {
                rs.d.k.a(h2, new int[]{127}, new int[]{56});
                return true;
            }
            case 20571: {
                rs.d.k.b(h2, 57);
                return true;
            }
            case 21633: {
                h2.a(127, new int[]{1});
                h2.a(new int[]{89, 98, 72, 71, 97, 88, 72, 98, 89, 5056, 5066, 8, 12, 924, 57, 3005, 20, 24, 28, 16}, new int[]{80, 100, 100});
                return true;
            }
            case 22854: {
                if (h2 != null) {
                    h2.g(110, -1);
                    h2.g(8);
                }
                return true;
            }
            case 22951: 
            case 22952: 
            case 22953: {
                if (h2 != null) {
                    h2.g(926);
                    h2.a(926, new int[]{926, 910, 905, 918, 7114});
                }
                return true;
            }
            case 22947: {
                h2.b(new int[]{21652, 21658, 16904, 13248, 13204, 32920, 15320, 10448, 10462, 16656, 14259, 18, 22, 26}, new int[]{212, 212, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 212, 212});
                return true;
            }
            case 20570: {
                h2.a(127, new int[]{1});
                return true;
            }
            case 21026: 
            case 21560: {
                h2.a(127, new int[]{1});
                return true;
            }
            case 21695: 
            case 21696: 
            case 21697: 
            case 21698: {
                if (h2 != null) {
                    h2.g(0, -1);
                }
                rs.d.k.a(h2, new int[]{7073, 2700, 7081, 21539, 10266, 16, 82, 66, 99}, new int[]{68, 69, 69, 69, 69, 60, 60, 68, 60});
                if (h2 != null) {
                    h2.g(3);
                }
                return true;
            }
            case 24221: {
                if (h2 != null) {
                    h2.g(0, -1);
                }
                rs.d.k.a(h2, new int[]{7073, 2700, 7081, 21539, 10266, 16, 82, 66, 99}, new int[]{70, 70, 70, 70, 70, 60, 60, 70, 60});
                if (h2 != null) {
                    h2.g(925);
                }
                return true;
            }
            case 24225: {
                if (h2 != null) {
                    h2.g(50, -1);
                }
                rs.d.k.a(h2, new int[]{7073, 2700, 7081, 21539, 10266, 16, 82, 66, 99}, new int[]{70, 70, 70, 70, 70, 60, 60, 70, 60});
                if (h2 != null) {
                    h2.g(127);
                }
                return true;
            }
            case 21699: {
                rs.d.k.a(h2, new int[]{926, 10349, 0, 127}, new int[]{60, 68, 68, 68});
                return true;
            }
            case 21693: {
                h2.b(new int[]{10472, 655, 8845, 8610, 7104, 5056, 786, 4750, 790, 7452, 817, 906, 926, 933, 937, 7333, 8664, 8656, 8146, 0, 569, 37, 313, 7341, 7326, 7335, 7447, 905, 306, 63823, 432, 323, 11201, 228, 2472, 317, 2838, 142, 8421, 8660, 8524, 297, 2714, 2590, 2595, 65535, 20287}, new int[]{60, 60, 60, 60, 61, 61, 61, 61, 61, 61, 61, 61, 61, 60, 60, 60, 60, 60, 60, 61, 56, 60, 60, 60, 60, 60, 60, 60, 61, 60, 61, 57, 61, 57, 61, 61, 60, 56, 57, 61, 61, 61, 61, 61, 60, 60, 60});
                h2.g(3);
                return true;
            }
            case 25407: {
                h2.b(new int[]{5813, 26006, 9139}, new int[]{58, 72, 72});
                return true;
            }
            case 23019: {
                h2.b(new int[]{78, 5790, 5788}, new int[]{55, 72, 72});
                return true;
            }
            case 23020: {
                h2.b(new int[]{6032, 3994, 2974, 2983, 5010, 3990, 3996}, new int[]{55, 72, 55, 72, 72, 55, 55});
                return true;
            }
            case 23021: {
                h2.b(new int[]{8088, 7060, 5006, 528, 9123, 6034, 3982, 7845}, new int[]{55, 72, 55, 72, 72, 72, 59, 59});
                return true;
            }
            case 21701: {
                h2.g(0, -1);
                rs.d.k.a(h2, new int[]{61}, new int[]{68});
                h2.g(3);
                return true;
            }
            case 21694: {
                h2.g(0, -1);
                h2.b(new int[]{3862, 2842}, new int[]{68, 68});
                h2.g(3);
                return true;
            }
            case 20551: {
                return true;
            }
            case 22514: 
            case 22515: 
            case 22516: {
                h2.b(new int[]{10306, 10314, 1944, 1934, 0, 20, 12, 152, 43286, 1940, 1938, 3974, 70}, new int[]{72, 55, 72, 55, 72, 55, 55, 72, 55, 72, 72, 72, 72});
                return true;
            }
            case 21062: {
                rs.d.k.a(h2, new int[]{11171, 11175, 14102}, new int[]{56, 55, 56});
                return true;
            }
            case 21131: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{56, 54, 54, 56, 56, 56});
                return true;
            }
            case 23964: {
                rs.d.k.a(h2, new int[]{42693, 5150, 42669, 42305, 42315, 16536}, new int[]{57, 57, 57, 60, 60, 60});
                return true;
            }
            case 20729: 
            case 20730: {
                rs.d.k.a(h2, new int[]{10147, 10165, 10157, 10176, 10167, 9812, 22451, 36007, 6573}, new int[]{56, 54, 56, 54, 56, 54, 54, 54, 54});
                return true;
            }
            case 23962: 
            case 23963: {
                rs.d.k.a(h2, new int[]{10165, 10176, 9812, 22451, 36007, 6573, 410, 33300, 33676}, new int[]{57, 57, 57, 57, 57, 57, 60, 60, 60});
                return true;
            }
            case 21009: {
                rs.d.k.b(h2, 54);
                return true;
            }
            case 23961: {
                h2.a(new int[]{2, 1, 2});
                rs.d.k.a(h2, new int[]{1, 2}, new int[]{57, 60});
                return true;
            }
            case 21008: {
                rs.d.k.a(h2, new int[]{10279, 127, 11}, new int[]{54, 56, 56});
                return true;
            }
            case 23960: {
                rs.d.k.a(h2, new int[]{10279, 127, 11}, new int[]{60, 57, 57});
                return true;
            }
            case 20550: {
                rs.d.k.a(h2, 6573, 54);
                return true;
            }
            case 23959: {
                rs.d.k.a(h2, new int[]{6573, 410, 33300, 33676, 33036}, new int[]{57, 60, 60, 60, 57});
                return true;
            }
            case 20549: {
                rs.d.k.a(h2, new int[]{10147, 10165, 10157, 10176, 10167, 9812, 22451}, new int[]{56, 54, 56, 54, 56, 54, 54});
                return true;
            }
            case 23958: {
                rs.d.k.a(h2, new int[]{10147, 10165, 10157, 10176, 10167, 9812, 22451, 20416}, new int[]{57, 60, 57, 60, 57, 60, 60, 62});
                return true;
            }
            case 22014: {
                if (h2 != null) {
                    h2.a(new int[]{10147, 10157, 10167}, new int[]{6});
                }
                rs.d.k.a(h2, new int[]{10165, 10176, 9812, 22451}, new int[]{62, 62, 62, 62});
                return true;
            }
            case 22015: {
                if (h2 != null) {
                    h2.a(new int[]{10147, 10157, 10167}, new int[]{6});
                }
                rs.d.k.a(h2, new int[]{10165, 10176, 9812, 22451}, new int[]{109, 109, 109, 109});
                return true;
            }
            case 21068: {
                rs.d.k.a(h2, 10283, 56);
                return true;
            }
            case 20524: {
                rs.d.k.a(h2, new int[]{22410, 2999}, new int[]{55, 56});
                return true;
            }
            case 20577: {
                rs.d.k.a(h2, new int[]{22410, 2999}, new int[]{62, 55});
                return true;
            }
            case 20523: {
                rs.d.k.a(h2, new int[]{528, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 40);
                return true;
            }
            case 20689: {
                rs.d.k.a(h2, new int[]{528, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 56);
                return true;
            }
            case 20521: {
                rs.d.k.a(h2, 115, 40);
                return true;
            }
            case 25106: {
                rs.d.k.a(h2, new int[]{123, 127, 22410, 11200, 29113, 908, 937}, new int[]{54, 54, 54, 54, 54, 54, 54});
                return true;
            }
            case 20539: {
                rs.d.k.a(h2, new int[]{926}, new int[]{54});
                return true;
            }
            case 20540: {
                rs.d.k.a(h2, new int[]{926}, new int[]{40});
                return true;
            }
            case 20541: {
                rs.d.k.a(h2, new int[]{926}, new int[]{24});
                return true;
            }
            case 6202: {
                rs.d.k.a(h2, new int[]{2999}, new int[]{60});
                return true;
            }
            case 6203: {
                rs.d.k.a(h2, new int[]{2999}, new int[]{61});
                return true;
            }
            case 22949: 
            case 27519: {
                rs.d.k.a(h2, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{61, 60, 61, 60, 60});
                return true;
            }
            case 21958: 
            case 27520: 
            case 27524: {
                rs.d.k.a(h2, new int[]{54420, 55056, 54577, 55192, 0}, new int[]{61, 93, 61, 93, 93});
                return true;
            }
            case 22873: {
                rs.d.k.a(h2, new int[]{9152, 82, 123, 127}, new int[]{60, 54, 60, 54});
                return true;
            }
            case 22950: {
                h2.a(914, new int[]{7114});
                h2.a(918, new int[]{7114});
                h2.a(934, new int[]{7114});
                return true;
            }
            case 24049: {
                h2.a(914, new int[]{350770});
                h2.a(918, new int[]{350770});
                h2.a(934, new int[]{350770});
                return true;
            }
            case 24194: {
                h2.a(914, new int[]{350770});
                h2.a(918, new int[]{350770});
                h2.a(934, new int[]{350770});
                rs.d.k.a(h2, new int[]{922, 929, 350770}, new int[]{60, 60, 54});
                return true;
            }
            case 21286: {
                h2.a(new int[]{10, 15, 5});
                return true;
            }
            case 6200: {
                rs.d.k.a(h2, new int[]{22410}, new int[]{54});
                return true;
            }
            case 21095: {
                rs.d.k.b(h2, 54);
                return true;
            }
            case 13999: {
                rs.d.k.a(h2, new int[]{22410}, new int[]{55});
                return true;
            }
            case 21040: {
                rs.d.k.a(h2, new int[]{22410, 2999}, new int[]{56, 60});
                return true;
            }
            case 20722: {
                rs.d.k.a(h2, new int[]{22410, 2999}, new int[]{60, 59});
                return true;
            }
            case 14523: {
                rs.d.k.a(h2, new int[]{4510, 4502}, new int[]{54, 54});
                return true;
            }
            case 24179: {
                rs.d.k.a(h2, new int[]{4510, 4502, 8128, 7093}, new int[]{53, 55, 55, 53});
                return true;
            }
            case 24180: {
                rs.d.k.a(h2, new int[]{4510, 4502}, new int[]{74, 74});
                return true;
            }
            case 24181: {
                rs.d.k.a(h2, new int[]{4510, 4502, 8128, 7093}, new int[]{55, 89, 89, 55});
                return true;
            }
            case 24183: {
                rs.d.k.a(h2, new int[]{4510, 4502, 8128, 7093}, new int[]{22, 71, 71, 22});
                return true;
            }
            case 21069: {
                rs.d.k.a(h2, new int[]{4510, 8128, 7093}, new int[]{55, 56, 56});
                return true;
            }
            case 20731: {
                rs.d.k.a(h2, new int[]{4510, 4502, 8128, 7093}, new int[]{53, 53, 61, 60});
                return true;
            }
            case 10524: {
                rs.d.k.a(h2, new int[]{7587}, new int[]{54});
                return true;
            }
            case 25000: {
                rs.d.k.a(h2, new int[]{528, 944, 9359, 9240, 9395, 9412, 9254, 9239, 9216, 9385, 9221, 9371, 9255}, 53);
                return true;
            }
            case 25001: {
                rs.d.k.a(h2, new int[]{6447, 6443, 5652, 7479}, 53);
                return true;
            }
            case 25002: {
                rs.d.k.a(h2, new int[]{3974, 3594, 2576, 2454, 1571, 1436, 1575}, 53);
                return true;
            }
            case 21162: {
                rs.d.k.a(h2, new int[]{3974, 3594, 2576, 2454, 1571, 1436, 1575}, 30);
                return true;
            }
            case 25003: {
                rs.d.k.a(h2, new int[]{55180, 57228}, 53);
                return true;
            }
            case 24419: {
                rs.d.k.a(h2, new int[]{7608, 7624, 7632}, 53);
                return true;
            }
            case 20793: 
            case 20794: 
            case 20795: {
                rs.d.k.a(h2, new int[]{695, 9152, 41920, 8755, 43550, 46016}, new int[]{60, 54, 54, 54, 54, 54});
                return true;
            }
            case 25022: 
            case 25023: 
            case 25024: {
                rs.d.k.a(h2, new int[]{695, 9152, 41920, 8755, 43550, 46016, 55977, 24512, 35365, 58316}, new int[]{54, 54, 54, 54, 54, 54, 60, 60, 60, 60});
                return true;
            }
            case 21000: {
                rs.d.k.b(h2, 29);
                return true;
            }
            case 22810: {
                rs.d.k.b(h2, 56);
                return true;
            }
            case 22783: 
            case 22784: {
                rs.d.k.a(h2, new int[]{11187}, new int[]{70});
                return true;
            }
            case 22781: {
                rs.d.k.a(h2, new int[]{972}, new int[]{70});
                return true;
            }
            case 22782: {
                rs.d.k.a(h2, new int[]{984, 972}, new int[]{70, 70});
                return true;
            }
            case 22779: 
            case 22780: {
                rs.d.k.a(h2, new int[]{935}, new int[]{56});
                return true;
            }
            case 22777: {
                rs.d.k.a(h2, new int[]{7104}, new int[]{56});
                return true;
            }
            case 22778: {
                rs.d.k.a(h2, new int[]{6067, 7104}, new int[]{56, 56});
                return true;
            }
            case 22786: {
                rs.d.k.a(h2, new int[]{29456}, new int[]{56});
                return true;
            }
            case 22787: 
            case 22797: 
            case 22799: {
                rs.d.k.b(h2, 56);
                return true;
            }
            case 23932: {
                rs.d.k.a(h2, new int[]{7613, 7596, 133, 151, 35868, 35895, 35912, 35865, 35882, 35875, 35888, 35905, 35856, 35873, 35866, 6303, 35879, 35840, 35862, 35855, 6317, 35886, 6292, 1058, 1070, 1051, 1097, 54, 49, 39, 32, 64, 59, 45, 31, 6297, 40, 50, 85, 23, 6302, 35900}, new int[]{111, 111, 111, 111, 60, 60, 60, 111, 60, 60, 111, 60, 60, 111, 60, 111, 60, 60, 60, 60, 111, 60, 111, 111, 111, 111, 60, 111, 60, 60, 60, 60, 60, 60, 60, 111, 111, 111, 111, 111, 111, 60});
                return true;
            }
            case 22789: 
            case 22798: 
            case 22800: {
                rs.d.k.b(h2, 70);
                return true;
            }
            case 22801: {
                rs.d.k.a(h2, new int[]{61, 924, 916, 932}, new int[]{50, 56, 50, 50});
                return true;
            }
            case 22803: 
            case 22804: {
                rs.d.k.a(h2, new int[]{935, 939, 929, 931}, new int[]{56, 56, 56, 56});
                return true;
            }
            case 22805: 
            case 22806: {
                rs.d.k.a(h2, new int[]{935, 939, 929, 931}, new int[]{70, 70, 70, 70});
                return true;
            }
            case 22283: 
            case 22284: {
                h2.a(5652, new int[]{940, 935});
                h2.a(12820, new int[]{960, 955});
                h2.a(10543, new int[]{127});
                h2.a(43270, new int[]{100});
                h2.a(4550, new int[]{80});
                h2.b(new int[]{8}, new int[]{70});
                return true;
            }
            case 22130: {
                rs.d.k.a(h2, new int[]{926}, new int[]{74});
                return true;
            }
            case 22131: {
                rs.d.k.a(h2, new int[]{926}, new int[]{76});
                return true;
            }
            case 22132: {
                rs.d.k.a(h2, new int[]{926}, new int[]{80});
                return true;
            }
            case 22133: {
                rs.d.k.a(h2, new int[]{926}, new int[]{71});
                return true;
            }
            case 22790: {
                rs.d.k.a(h2, new int[]{926}, new int[]{70});
                return true;
            }
            case 22791: {
                rs.d.k.a(h2, new int[]{933}, new int[]{70});
                return true;
            }
            case 21867: {
                rs.d.k.a(h2, new int[]{930, 906, 927, 922, 926, 921, 925, 920, 911, 909, 917, 913, 915, 923, 919, 907, 908, 910, 916, 931, 936, 932}, new int[]{60, 102, 60, 102, 60, 60, 60, 60, 60, 60, 102, 102, 60, 102, 60, 102, 60, 60, 60, 60, 60, 60});
                h2.g(5);
                return true;
            }
            case 23657: 
            case 23658: 
            case 23659: {
                h2.i(7114);
                return true;
            }
            case 21899: {
                rs.d.k.a(h2, new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{55, 56, 55, 56, 56, 55, 55, 56, 56});
                return true;
            }
            case 22273: {
                h2.b(new int[]{926}, new int[]{105});
                return true;
            }
            case 22274: {
                h2.b(new int[]{933, 10351}, new int[]{105, 60});
                return true;
            }
            case 22276: {
                h2.b(new int[]{22428, 22433, 22437, 19129, 19119, 12853, 12989, 933, 939}, new int[]{105, 56, 105, 56, 56, 105, 105, 56, 56});
                return true;
            }
            case 21915: {
                h2.a(1938, new int[]{59730});
                h2.a(910, new int[]{59705});
                h2.a(1814, new int[]{59715});
                rs.d.k.a(h2, new int[]{1938, 912, 910, 809, 1814, 5198, 5206, 2469, 2588, 5219, 5214, 65535}, new int[]{55, 56, 55, 55, 24, 56, 56, 56, 55, 56, 55, 56});
                return true;
            }
            case 22964: {
                rs.d.k.b(h2, 54);
                return true;
            }
            case 22809: {
                rs.d.k.a(h2, new int[]{35868, 35895, 35912, 35865, 35882, 35875, 35889, 35906}, new int[]{70, 70, 70, 70, 70, 70, 70, 70});
                h2.g(127);
                return true;
            }
            case 23042: {
                rs.d.k.a(h2, new int[]{7613, 7596, 133, 151, 35868, 35895, 35912, 35865, 35882, 35875, 35888, 35905, 35856, 35873, 35866, 6303, 35879, 35840, 35862, 35855, 6317, 35886, 6292, 1058, 1070, 1051, 1097, 54, 49, 39, 32, 64, 59, 45, 31, 6297, 40, 50, 85, 23, 6302, 35900}, new int[]{55, 55, 55, 55, 72, 72, 72, 55, 72, 72, 55, 72, 72, 55, 72, 55, 72, 72, 72, 72, 55, 72, 55, 55, 55, 55, 72, 55, 72, 72, 72, 72, 72, 72, 72, 55, 55, 55, 55, 55, 55, 72});
                return true;
            }
            case 22522: {
                rs.d.k.a(h2, new int[]{37093, 39137, 38003, 7471, 7479, 40161, 6435, 7467, 7463}, new int[]{72, 72, 72, 55, 55, 72, 55, 55, 55});
                return true;
            }
        }
        return false;
    }

    public static void b(h h2, int n2) {
        if (h2 != null) {
            h2.b(n2);
        }
    }

    public static void a(h h2, int n2, int n3) {
        if (h2 != null) {
            h2.e(n2, n3);
        }
    }

    public static void a(h h2, int[] nArray, int n2) {
        if (h2 != null) {
            h2.a(nArray, n2);
        }
    }

    public static void a(h h2, int[] nArray, int[] nArray2) {
        if (h2 != null) {
            h2.b(nArray, nArray2);
        }
    }

    public static Image a(int n2, int n3) {
        rs.l.f_0 f_02 = rs.d.k.a(n2, n3, 0);
        if (f_02 == null) {
            return null;
        }
        for (int i2 = 0; i2 < f_02.m.length; ++i2) {
            if (f_02.m[i2] != 0 && f_02.m[i2] != -1) continue;
            f_02.m[i2] = 0;
        }
        Image image = f_02.a(32, 32);
        image = rs.l.f_0.a(image, new Color(0, 0, 0));
        return image;
    }

    public static void a() {
        l = null;
        k = null;
        aF = null;
        y = null;
        aC = null;
    }

    public boolean a(int n2) {
        int n3 = this.B;
        int n4 = this.s;
        if (n2 == 1) {
            n3 = this.Y;
            n4 = this.z;
        }
        if (n3 == -1) {
            return true;
        }
        boolean bl = true;
        if (!rs.a.h.b(n3, this.ar)) {
            bl = false;
        }
        if (n4 != -1 && !rs.a.h.b(n4, this.ar)) {
            bl = false;
        }
        return bl;
    }

    public static void a(f f2) {
        rs.d.k.a(f2, true);
    }

    public static void a(f f2, boolean bl) {
        int n2;
        aC = !bl ? new e(Client.a(rs.v.a.f() + "obj.dat")) : new e(f2.a("obj.dat"));
        e e2 = null;
        e2 = !bl ? new e(Client.a(rs.v.a.f() + "obj.idx")) : new e(f2.a("obj.idx"));
        ad = e2.A();
        aF = new int[a];
        int n3 = 2;
        for (n2 = 0; n2 < ad - 21; ++n2) {
            rs.d.k.aF[n2] = n3;
            n3 += e2.A();
        }
        y = new k[10];
        for (n2 = 0; n2 < 10; ++n2) {
            rs.d.k.y[n2] = new k();
        }
        if (b == null) {
            b = new d();
            b.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public h b(int n2) {
        int n3 = this.B;
        int n4 = this.s;
        if (n2 == 1) {
            n3 = this.Y;
            n4 = this.z;
        }
        if (n3 == -1) {
            return null;
        }
        rs.cache.osrs.c.a(this.ar);
        try {
            h h2;
            h h3 = rs.a.h.e(n3);
            if (n4 != -1) {
                h2 = rs.a.h.e(n4);
                h[] hArray = new h[]{h3, h2};
                h3 = new h(2, hArray);
            }
            if (this.g != null) {
                for (int i2 = 0; i2 < this.g.length; ++i2) {
                    h3.i(this.g[i2], this.h[i2]);
                }
            }
            h2 = h3;
            return h2;
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
    }

    public boolean b() {
        return this.p != -1 && this.F != -1;
    }

    public boolean c(int n2) {
        int n3 = this.r;
        int n4 = this.K;
        int n5 = this.J;
        if (n2 == 1) {
            n3 = this.aa;
            n4 = this.q;
            n5 = this.o;
        }
        if (n3 == -1) {
            return true;
        }
        boolean bl = true;
        if (!rs.a.h.b(n3, this.ar)) {
            bl = false;
        }
        if (n4 != -1 && !rs.a.h.b(n4, this.ar)) {
            bl = false;
        }
        if (n5 != -1 && !rs.a.h.b(n5, this.ar)) {
            bl = false;
        }
        return bl;
    }

    public h d(int n2) {
        int n3;
        Object object;
        int n4;
        int n5 = this.r;
        int n6 = this.K;
        int n7 = this.J;
        if (n2 == 1) {
            n5 = this.aa;
            n6 = this.q;
            n7 = this.o;
        }
        if (n5 == -1) {
            return null;
        }
        h h2 = rs.a.h.a(n5, this.ar);
        if (this.i == 19051 && !rs.f.a.ah) {
            for (n4 = 0; n4 < h2.L.length; ++n4) {
                if (h2.L[n4] != 11) continue;
                h2.L[n4] = 12;
            }
        }
        if (n6 != -1) {
            h[] hArray;
            if (n7 != -1) {
                h h3 = rs.a.h.a(n6, this.ar);
                hArray = rs.a.h.a(n7, this.ar);
                object = new h[]{h2, h3, hArray};
                h2 = new h(3, (h[])object);
            } else {
                h h4 = rs.a.h.a(n6, this.ar);
                hArray = new h[]{h2, h4};
                h2 = new h(2, hArray);
            }
        }
        if (h2 == null) {
            return null;
        }
        if (this.i == 19050 || this.i == 19051 || this.i == 23063 || this.i == 21963 || this.i == 21964) {
            h2.a(0, 0, 7);
        }
        if (this.i == 20473) {
            h2.a(0, 0, 3);
        }
        if (this.i == 15621 || this.i == 20570 || this.i == 21560) {
            h2.a(0, 0, 4);
        }
        if (this.i == 21633) {
            h2.a(0, 0, 6);
        }
        if (!(this.i != 21083 && this.i != 22813 || rs.f.a.aj)) {
            h2.a(0, 0, 4);
        }
        if (this.i == 20694 && !rs.f.a.aj) {
            h2.a(0, 0, 5);
        }
        if (this.i >= 20780 && this.i <= 20782 && !rs.f.a.aj) {
            h2.a(0, 0, 5);
        }
        n4 = n2 == 0 ? this.af : this.ai;
        if (this.i == 23174) {
            n4 = 7;
        }
        if (this.i == 21767) {
            n4 = 10;
        }
        boolean bl = false;
        if (!rs.f.a.aj) {
            byte by;
            if (this.ag == 0 && this.ak == 0 && rs.a.h.bG == 3 && !rs.a.h.p[n5]) {
                h2.a(n4, n2 == 0 ? 12 : -5, (int)(n2 == 0 ? this.ah : this.ah));
                bl = true;
            }
            byte by2 = n2 == 0 ? this.al : this.ao;
            n3 = n2 == 0 ? this.am : this.aq;
            byte by3 = by = n2 == 0 ? this.an : this.ap;
            if (by2 != 0 || n3 != 0 || by != 0) {
                h2.a((int)by2, n3, (int)by);
                bl = true;
            }
        }
        if (!bl) {
            if (this.i == 28759 || this.i == 28760) {
                h2.a(n4, this.ag - 450, (int)this.ah);
            } else {
                if (n2 == 0 && (this.ag != 0 || this.af != 0 || this.ah != 0)) {
                    h2.a(n4, (int)this.ag, (int)this.ah);
                }
                if (n2 == 1 && (this.ak != 0 || this.ai != 0 || this.aj != 0)) {
                    h2.a(n4, (int)this.ak, (int)this.aj);
                }
            }
        }
        object = null;
        if (rs.l.b.a.d.c) {
            for (a a2 : rs.l.b.a.d.b.h()) {
                b b2;
                if (!(a2 instanceof b) || (b2 = (b)a2).n() != this.i) continue;
                object = b2;
                ((a)object).i().clear();
                break;
            }
        }
        rs.l.f.e.d().a(rs.l.f.a.a, (Object)this, h2);
        if (this.aw != null) {
            this.aw.a(h2);
        } else {
            try {
                rs.d.k.c(this, h2, this.i);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (this.t != 128 || this.O != 128 || this.N != 128) {
            h2.b(this.t, this.N, this.O);
        }
        if (this.g != null) {
            for (n3 = 0; n3 < this.g.length; ++n3) {
                h2.i(this.g[n3], this.h[n3]);
            }
        }
        if (object != null) {
            h2.a(((a)object).i());
        }
        return h2;
    }

    public void c() {
        this.A = 0;
        this.w = null;
        this.x = null;
        this.E = null;
        this.g = null;
        this.h = null;
        this.G = 2000;
        this.M = 0;
        this.Z = 0;
        this.ae = 0;
        this.v = 0;
        this.W = 0;
        this.C = false;
        this.f = 1;
        this.n = false;
        this.u = null;
        this.L = null;
        this.r = -1;
        this.K = -1;
        this.ag = 0;
        this.af = 0;
        this.ah = 0;
        this.aa = -1;
        this.q = -1;
        this.ak = 0;
        this.ai = 0;
        this.aj = 0;
        this.J = -1;
        this.o = -1;
        this.B = -1;
        this.s = -1;
        this.Y = -1;
        this.z = -1;
        this.P = null;
        this.ab = null;
        this.F = -1;
        this.p = -1;
        this.t = 128;
        this.O = 128;
        this.N = 128;
        this.X = 0;
        this.I = 0;
        this.ac = 0;
        this.ar = false;
    }

    public static k e(int n2) {
        if (n2 >= aF.length) {
            return new k();
        }
        aB = (aB + 1) % 10;
        rs.d.k.aC.h = aF[n2];
        k k2 = new k();
        k2.i = n2;
        k2.c();
        k2.a(aC);
        return k2;
    }

    public static k f(int n2) {
        return rs.d.k.a(n2, true, true);
    }

    public static k a(int n2, boolean bl, boolean bl2) {
        if (!Client.ba) {
            for (int i2 = 0; i2 < 10; ++i2) {
                if (rs.d.k.y[i2].i != n2) continue;
                return y[i2];
            }
        }
        aB = (aB + 1) % 10;
        k k2 = y[aB];
        if (bl2 && b != null && n2 > 0 && b.a(n2) != null) {
            k2 = (k)b.a(n2);
        } else {
            rs.d.k.aC.h = aF[n2];
            k2.i = n2;
            k2.c();
            k2.a(aC);
        }
        if (Client.ba && k2.i == Client.bb) {
            k2.w = "Debugging " + Client.bb;
            k2.Z = Client.bd != 0 ? Client.bd : k2.Z;
            k2.G = Client.be != 0 ? Client.be : k2.G;
            k2.M = Client.bc != 0 ? Client.bc : k2.M;
            k2.v = Client.bf != 0 ? Client.bf : k2.v;
            int n3 = k2.W = Client.bg != 0 ? Client.bg : k2.W;
        }
        if (k2 != null && k2.w != null) {
            if (k2.w.contains("Goliath") && k2.w.contains("black")) {
                if (rs.f.a.aj) {
                    k2.r = 33207;
                    k2.aa = 33259;
                } else {
                    k2.r = 2301;
                    k2.aa = 2323;
                }
            }
            if (k2.w.contains("Goliath") && k2.w.contains("white")) {
                if (rs.f.a.aj) {
                    k2.r = 33207;
                    k2.aa = 33259;
                } else {
                    k2.r = 2301;
                    k2.aa = 2323;
                    k2.g = new int[]{10, 15, 20};
                    k2.h = new int[]{64585, 64590, 64595};
                }
            }
            if (k2.w.contains("Goliath") && k2.w.contains("yellow")) {
                if (rs.f.a.aj) {
                    k2.r = 33207;
                    k2.aa = 33259;
                } else {
                    k2.r = 2301;
                    k2.aa = 2323;
                    k2.g = new int[]{10, 15, 20};
                    k2.h = new int[]{9767, 9772, 9777};
                }
            }
            if (k2.w.contains("Goliath") && k2.w.contains("red")) {
                if (rs.f.a.aj) {
                    k2.r = 33207;
                    k2.aa = 33259;
                } else {
                    k2.r = 2301;
                    k2.aa = 2323;
                    k2.g = new int[]{10, 15, 20};
                    k2.h = new int[]{65046, 65051, 65056};
                }
            }
            if (k2.w.contains("Swift") && k2.w.contains("black")) {
                if (rs.f.a.aj) {
                    k2.r = 33207;
                    k2.aa = 33259;
                } else {
                    k2.r = 2302;
                    k2.aa = 2314;
                }
            }
            if (k2.w.contains("Swift") && k2.w.contains("white")) {
                if (rs.f.a.aj) {
                    k2.r = 33207;
                    k2.aa = 33259;
                } else {
                    k2.r = 2302;
                    k2.aa = 2314;
                    k2.g = new int[]{10, 15, 20};
                    k2.h = new int[]{64585, 64590, 64595};
                }
            }
            if (k2.w.contains("Swift") && k2.w.contains("yellow")) {
                if (rs.f.a.aj) {
                    k2.r = 33207;
                    k2.aa = 33259;
                } else {
                    k2.r = 2302;
                    k2.aa = 2314;
                    k2.g = new int[]{10, 15, 20};
                    k2.h = new int[]{9767, 9772, 9777};
                }
            }
            if (k2.w.contains("Swift") && k2.w.contains("red")) {
                if (rs.f.a.aj) {
                    k2.r = 33207;
                    k2.aa = 33259;
                } else {
                    k2.r = 2302;
                    k2.aa = 2314;
                    k2.g = new int[]{10, 15, 20};
                    k2.h = new int[]{65046, 65051, 65056};
                }
            }
            if (k2.w.contains("Spellcaster") && k2.w.contains("black")) {
                if (rs.f.a.aj) {
                    k2.r = 179;
                    k2.aa = 356;
                } else {
                    k2.r = 2300;
                    k2.aa = 2326;
                }
            }
            if (k2.w.contains("Spellcaster") && k2.w.contains("white")) {
                if (rs.f.a.aj) {
                    k2.r = 179;
                    k2.aa = 356;
                } else {
                    k2.r = 2300;
                    k2.aa = 2326;
                    k2.g = new int[]{10, 15, 20};
                    k2.h = new int[]{64585, 64590, 64595};
                }
            }
            if (k2.w.contains("Spellcaster") && k2.w.contains("yellow")) {
                if (rs.f.a.aj) {
                    k2.r = 179;
                    k2.aa = 356;
                } else {
                    k2.r = 2300;
                    k2.aa = 2326;
                    k2.g = new int[]{10, 15, 20};
                    k2.h = new int[]{9767, 9772, 9777};
                }
            }
            if (k2.w.contains("Spellcaster") && k2.w.contains("red")) {
                if (rs.f.a.aj) {
                    k2.r = 179;
                    k2.aa = 356;
                } else {
                    k2.r = 2300;
                    k2.aa = 2326;
                    k2.g = new int[]{10, 15, 20};
                    k2.h = new int[]{65046, 65051, 65056};
                }
            }
            if (k2.w.contains("Primal platebody") || k2.w.contains("Torva platebody")) {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-12;
                    k2.ak = (byte)-5;
                    k2.aj = (byte)-1;
                    k2.ah = 1;
                    k2.ai = (byte)-1;
                    k2.t = 120;
                    k2.O = 120;
                    k2.N = 120;
                } else {
                    k2.ag = 0;
                    k2.ak = 0;
                    k2.aj = 0;
                    k2.ah = 0;
                    k2.ai = 0;
                    k2.t = 128;
                    k2.O = 128;
                    k2.N = 128;
                }
            }
            if (k2.w.contains("Primal platelegs") || k2.w.contains("Torva platelegs")) {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-12;
                    k2.ak = (byte)-5;
                    k2.aj = (byte)-1;
                    k2.ah = 1;
                    k2.ai = (byte)-1;
                    k2.t = 120;
                    k2.O = 120;
                    k2.N = 120;
                } else {
                    k2.ag = 0;
                    k2.ak = 0;
                    k2.aj = 0;
                    k2.ah = 0;
                    k2.ai = 0;
                    k2.t = 128;
                    k2.O = 128;
                    k2.N = 128;
                }
            }
        }
        switch (n2) {
            case 21767: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-25;
                    k2.ak = (byte)-21;
                    break;
                }
                k2.ag = (byte)-8;
                k2.ak = (byte)-25;
                break;
            }
            case 21645: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-3;
                    k2.ak = (byte)-3;
                    break;
                }
                k2.ag = (byte)8;
                k2.ak = (byte)-3;
                break;
            }
            case 22218: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)7;
                    k2.ak = (byte)7;
                    break;
                }
                k2.ag = (byte)15;
                k2.ak = (byte)7;
                break;
            }
            case 22905: 
            case 22906: 
            case 22907: {
                k2.ac = 1337;
                break;
            }
            case 23174: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)20;
                    k2.ak = (byte)20;
                    break;
                }
                k2.ag = (byte)28;
                k2.ak = (byte)28;
                break;
            }
            case 25410: 
            case 25411: 
            case 25412: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)12;
                    k2.ak = (byte)20;
                    k2.af = (byte)14;
                    k2.ai = (byte)14;
                    k2.ah = (byte)12;
                    k2.aj = (byte)10;
                    break;
                }
                k2.ag = (byte)6;
                k2.ak = (byte)5;
                k2.af = (byte)10;
                k2.ai = (byte)12;
                k2.ah = (byte)15;
                k2.aj = (byte)15;
                break;
            }
            case 13887: 
            case 22041: {
                k2.r = rs.f.a.aj ? 35953 : 42624;
                k2.aa = rs.f.a.aj ? 35965 : 42644;
                break;
            }
            case 13899: 
            case 22157: {
                if (rs.f.a.aj) {
                    k2.ag = 0;
                    k2.ak = (byte)4;
                } else {
                    k2.ag = 0;
                    k2.ak = (byte)-9;
                }
                k2.r = rs.f.a.aj ? 35969 : 42615;
                k2.aa = rs.f.a.aj ? 35969 : 42615;
                break;
            }
            case 13902: 
            case 22158: {
                if (rs.f.a.aj) {
                    k2.ag = 0;
                    k2.ak = (byte)4;
                } else {
                    k2.ag = 0;
                    k2.ak = (byte)-9;
                }
                k2.r = rs.f.a.aj ? 35968 : 42623;
                k2.aa = rs.f.a.aj ? 35968 : 42623;
                break;
            }
            case 13893: 
            case 22042: {
                k2.r = rs.f.a.aj ? 35950 : 42633;
                k2.aa = rs.f.a.aj ? 35960 : 42649;
                break;
            }
            case 13896: {
                k2.r = rs.f.a.aj ? 35943 : 42639;
                k2.aa = rs.f.a.aj ? 35958 : 42655;
                break;
            }
            case 13884: {
                k2.r = rs.f.a.aj ? 35951 : 42625;
                k2.aa = rs.f.a.aj ? 35964 : 42641;
                break;
            }
            case 13890: {
                k2.r = rs.f.a.aj ? 35947 : 42632;
                k2.aa = rs.f.a.aj ? 35961 : 42647;
                break;
            }
            case 13876: {
                k2.r = rs.f.a.aj ? 35945 : 42636;
                k2.aa = rs.f.a.aj ? 35956 : 42652;
                break;
            }
            case 13870: 
            case 22045: {
                k2.r = rs.f.a.aj ? 35954 : 42626;
                k2.aa = rs.f.a.aj ? 35963 : 42643;
                break;
            }
            case 13873: 
            case 22046: {
                k2.r = rs.f.a.aj ? 35948 : 42631;
                k2.aa = rs.f.a.aj ? 35959 : 42646;
                break;
            }
            case 13864: {
                k2.r = rs.f.a.aj ? 35944 : 42638;
                k2.aa = rs.f.a.aj ? 35957 : 42653;
                break;
            }
            case 13861: 
            case 22044: {
                k2.r = rs.f.a.aj ? 35949 : 42634;
                k2.aa = rs.f.a.aj ? 35962 : 42645;
                break;
            }
            case 13858: 
            case 22043: {
                k2.r = rs.f.a.aj ? 35952 : 42627;
                k2.aa = rs.f.a.aj ? 35966 : 42642;
                break;
            }
            case 13859: {
                k2.r = rs.f.a.aj ? 35971 : 42617;
                k2.aa = rs.f.a.aj ? 35971 : 42617;
                break;
            }
            case 21633: {
                k2.K = 40024;
                break;
            }
            case 16427: {
                if (rs.f.a.aj) {
                    k2.r = 29250;
                    k2.aa = 29255;
                    k2.g = new int[]{280, 924, 920, 43166, 538, 43156, 520, 127};
                    k2.h = new int[]{2853, 2840, 2836, 2830, 2836, 2836, 2836, 0};
                    break;
                }
                k2.r = 55673;
                k2.aa = 56353;
                break;
            }
            case 21038: 
            case 21039: 
            case 21724: 
            case 21738: {
                k2.g = new int[]{50068};
                k2.h = new int[]{5};
                break;
            }
            case 21005: 
            case 23154: {
                k2.g = new int[]{5056, 8125, 16, 0, 33, 20};
                k2.h = new int[]{5, 8, 461770, 5, 5, 5};
                break;
            }
            case 9975: {
                k2.A = 1;
                break;
            }
            case 27686: 
            case 27687: 
            case 27688: 
            case 27689: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-50;
                    break;
                }
                k2.ag = (byte)-35;
                break;
            }
            case 20553: 
            case 21032: 
            case 21033: 
            case 21034: 
            case 21035: 
            case 21565: 
            case 21566: 
            case 21570: 
            case 21571: 
            case 21848: 
            case 21850: 
            case 21851: 
            case 21852: 
            case 21853: 
            case 21947: 
            case 21948: 
            case 21949: 
            case 24023: 
            case 24024: 
            case 24152: 
            case 25422: 
            case 25423: 
            case 27271: 
            case 27272: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)12;
                    k2.ak = (byte)-5;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 24029: 
            case 24030: 
            case 24031: 
            case 24032: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)12;
                    k2.ak = (byte)-5;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 15135: 
            case 21868: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-14;
                    k2.ak = (byte)3;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 20400: {
                k2.ag = (byte)12;
                k2.ak = (byte)10;
                break;
            }
            case 25105: {
                k2.G = 9500;
                break;
            }
            case 16843: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-12;
                    k2.ak = (byte)-10;
                    break;
                }
                k2.ag = 0;
                k2.ak = (byte)-8;
                break;
            }
            case 14990: 
            case 22145: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-12;
                    k2.ak = (byte)-12;
                    break;
                }
                k2.ag = 0;
                k2.ak = (byte)-12;
                break;
            }
            case 19335: {
                if (rs.f.a.aj) {
                    k2.G = 550;
                    k2.M = 340;
                    k2.Z = 26;
                    k2.v = 1;
                    k2.W = 29;
                    break;
                }
                k2.G = 676;
                k2.M = 539;
                k2.Z = 110;
                k2.v = 5;
                k2.W = 11;
                break;
            }
            case 19051: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)3;
                    k2.ak = (byte)10;
                    break;
                }
                k2.ag = (byte)3;
                k2.ak = (byte)5;
                break;
            }
            case 15621: 
            case 19050: 
            case 21963: 
            case 21964: 
            case 23063: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)3;
                    k2.ak = (byte)10;
                    break;
                }
                k2.ag = (byte)3;
                k2.ak = (byte)5;
                break;
            }
            case 17273: 
            case 20741: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-15;
                    k2.ak = (byte)5;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 20482: 
            case 21089: 
            case 21098: 
            case 21099: 
            case 23066: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)13;
                    k2.ak = (byte)2;
                    break;
                }
                k2.ag = 0;
                k2.ak = (byte)8;
                break;
            }
            case 12704: 
            case 12706: 
            case 20483: 
            case 20485: 
            case 20486: 
            case 20810: 
            case 21819: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)10;
                    k2.ak = (byte)-1;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 22134: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)30;
                    k2.ak = (byte)-1;
                    break;
                }
                k2.ag = (byte)18;
                k2.ak = 0;
                break;
            }
            case 5609: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)-15;
                    k2.ak = (byte)-15;
                } else {
                    k2.ag = 0;
                    k2.ak = 0;
                }
            }
            case 5608: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)-25;
                    k2.ak = (byte)-25;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 14491: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-12;
                    k2.ak = (byte)-5;
                    break;
                }
                k2.ag = (byte)2;
                k2.ak = (byte)-5;
                break;
            }
            case 7806: 
            case 7807: 
            case 16957: 
            case 20997: 
            case 20998: 
            case 22889: 
            case 23056: 
            case 23057: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-12;
                    k2.ak = (byte)-12;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 11730: 
            case 12424: 
            case 12899: 
            case 13045: 
            case 13047: 
            case 13576: 
            case 14490: 
            case 20567: 
            case 21059: 
            case 21712: 
            case 23062: 
            case 23180: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)15;
                    k2.ak = (byte)-3;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 20449: 
            case 20690: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)9;
                    k2.ak = (byte)-3;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 11785: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)20;
                    k2.ak = (byte)20;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 7808: 
            case 20999: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)10;
                    k2.ak = (byte)10;
                    break;
                }
                k2.ag = 1;
                k2.ak = 1;
                break;
            }
            case 12422: 
            case 12426: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)15;
                    k2.ak = (byte)15;
                    break;
                }
                k2.ag = 1;
                k2.ak = 1;
                break;
            }
            case 21582: 
            case 21583: 
            case 21584: 
            case 21585: 
            case 21586: 
            case 21587: 
            case 21602: 
            case 21603: 
            case 21604: 
            case 23202: 
            case 23908: 
            case 23909: 
            case 23910: 
            case 24250: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)15;
                    k2.ak = (byte)5;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 19918: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)15;
                    k2.ak = (byte)5;
                    break;
                }
                k2.ag = 1;
                k2.ak = 1;
                break;
            }
            case 11791: 
            case 11908: 
            case 12904: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)15;
                    k2.ak = (byte)15;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 19544: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)11;
                    k2.ak = (byte)-6;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 12926: 
            case 21577: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)2;
                    k2.ak = (byte)2;
                    break;
                }
                k2.ag = (byte)15;
                k2.ak = (byte)15;
                break;
            }
            case 13742: {
                if (rs.f.a.aj) {
                    k2.G = 1789;
                    k2.M = 431;
                    k2.Z = 27;
                    k2.v = 0;
                    k2.W = 13;
                } else {
                    k2.G = 1616;
                    k2.M = 396;
                    k2.Z = 1050;
                    k2.v = -3;
                    k2.W = 4;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 13738: 
            case 13744: {
                if (rs.f.a.aj) {
                    k2.G = 1600;
                    k2.M = 396;
                    k2.Z = 27;
                    k2.v = 0;
                    k2.W = 14;
                } else {
                    k2.G = 1616;
                    k2.M = 396;
                    k2.Z = 1050;
                    k2.v = -3;
                    k2.W = 4;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 13740: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-11;
                    k2.ak = (byte)3;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 20772: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)14;
                    k2.ak = (byte)6;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 12954: 
            case 20532: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)12;
                    k2.ak = (byte)-6;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 12006: 
            case 20679: 
            case 20680: 
            case 20684: 
            case 20685: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)10;
                    k2.ak = 0;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 14484: 
            case 14486: 
            case 22950: 
            case 24049: 
            case 24194: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-13;
                    k2.ak = (byte)-13;
                    break;
                }
                k2.ag = 0;
                k2.ak = (byte)-5;
                break;
            }
            case 11283: 
            case 11284: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)17;
                    k2.ak = (byte)5;
                    break;
                }
                k2.ag = (byte)5;
                k2.ak = (byte)10;
                break;
            }
            case 13905: 
            case 20696: 
            case 21720: 
            case 21721: 
            case 21722: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-13;
                    k2.ak = (byte)-6;
                    break;
                }
                k2.ag = 0;
                k2.ak = (byte)-8;
                break;
            }
            case 22826: {
                if (rs.f.a.aj) {
                    k2.ag = 0;
                    k2.ak = 0;
                    break;
                }
                k2.ag = (byte)14;
                k2.ak = (byte)14;
                break;
            }
            case 20992: 
            case 21714: 
            case 21959: 
            case 27288: {
                if (!rs.f.a.aj) break;
                k2.ag = 0;
                k2.ak = 0;
                break;
            }
            case 13879: 
            case 15034: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-24;
                    k2.ak = (byte)-24;
                    break;
                }
                k2.ag = (byte)-10;
                k2.ak = (byte)-25;
                break;
            }
            case 15037: 
            case 16955: 
            case 21073: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-12;
                    k2.ak = (byte)-12;
                    break;
                }
                k2.ag = 0;
                k2.ak = (byte)-10;
                break;
            }
            case 15038: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-12;
                    k2.ak = (byte)-12;
                    break;
                }
                k2.ag = 0;
                k2.ak = (byte)-12;
                break;
            }
            case 15039: 
            case 16425: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-10;
                    k2.ak = (byte)-10;
                    break;
                }
                k2.ag = 0;
                k2.ak = (byte)-10;
                break;
            }
            case 15040: {
                if (rs.f.a.aj) {
                    k2.ag = (byte)-10;
                    k2.ak = (byte)-10;
                    break;
                }
                k2.ag = 0;
                k2.ak = (byte)-15;
                break;
            }
            case 2653: {
                k2.o = 3381;
                break;
            }
            case 2669: {
                k2.o = 3380;
                break;
            }
            case 11694: 
            case 14487: {
                if (!rs.f.a.aj) {
                    k2.ag = (byte)15;
                    k2.ak = 0;
                    break;
                }
                k2.ag = 0;
                k2.ak = 0;
            }
        }
        if (k2.p != -1 && bl2) {
            k2.d();
        }
        if (k2.w != null) {
            k2.E = null;
            if (rs.d.p.a.w_(n2) && k2.w.contains("@gre@")) {
                k2.w = ((p.a)((Object)rs.d.p.a.b((int)n2))).d + k2.w.substring(5);
            }
        }
        if (k2.x == null) {
            k2.x = k2.w;
        }
        return k2;
    }

    private void d() {
        k k2 = rs.d.k.f(this.p);
        this.A = k2.A;
        this.G = k2.G;
        this.M = k2.M;
        this.Z = k2.Z;
        this.ae = k2.ae;
        this.v = k2.v;
        this.W = k2.W;
        this.g = k2.g;
        this.h = k2.h;
        k k3 = rs.d.k.f(this.F);
        this.w = k3.w;
        this.x = k3.x;
        this.n = k3.n;
        this.f = k3.f;
        String string = "a";
        this.C = true;
    }

    public static rs.l.f_0 g(int n2) {
        if (j.a(n2) != null) {
            return (rs.l.f_0)j.a(n2);
        }
        rs.l.f_0 f_02 = rs.d.k.a(n2, Integer.MAX_VALUE, 0, 19, true);
        if (f_02 != null) {
            j.a(f_02, n2);
            return f_02;
        }
        return null;
    }

    public static rs.l.f_0 a(int n2, int n3, int n4) {
        return rs.d.k.a(n2, n3, n4, 32);
    }

    public static rs.l.f_0 a(int n2, int n3, int n4, int n5) {
        return rs.d.k.a(n2, n3, n4, n5, false);
    }

    public static rs.l.f_0 a(int n2, int n3, int n4, int n5, boolean bl) {
        int n6;
        int n7;
        int n8;
        boolean bl2 = bl;
        int n9 = -1;
        if (!bl2) {
            if (n2 == 3241) {
                bl = true;
            }
            if (n2 == 28807) {
                bl = true;
            }
            for (long[][] lArray : ay) {
                if (lArray[0][0] != (long)n2) continue;
                if (System.currentTimeMillis() - lArray[0][1] >= 300L) {
                    long[] lArray2 = lArray[0];
                    lArray2[2] = lArray2[2] + 1L;
                    if (lArray[0][2] >= (long)lArray[1].length) {
                        lArray[0][2] = 0L;
                    }
                    lArray[0][1] = System.currentTimeMillis();
                }
                n9 = (int)lArray[1][(int)lArray[0][2]];
                bl = true;
            }
        }
        if (!(bl2 || n4 != 0 || Client.ba || bl)) {
            Object object = (rs.l.f_0)k.a(n2);
            if (object != null && ((rs.l.f_0)object).s != n3 && ((rs.l.f_0)object).s != -1) {
                ((t)object).b();
                object = null;
            }
            if (object != null && ((rs.l.f_0)object).h != null && ((rs.l.f_0)object).h instanceof Integer && (Integer)((rs.l.f_0)object).h != n5) {
                ((t)object).b();
                object = null;
            }
            if (object != null) {
                return object;
            }
        }
        int n10 = n8 = n9 != -1 ? n9 : n2;
        if (n8 < 0 || n8 >= aF.length) {
            return null;
        }
        k k2 = rs.d.k.f(n8);
        if (k2 == null) {
            return null;
        }
        if (k2.P == null) {
            n3 = -1;
        }
        if (n3 > 1) {
            int n11 = -1;
            for (int i2 = 0; i2 < 10; ++i2) {
                if (n3 < k2.ab[i2] || k2.ab[i2] == 0) continue;
                n11 = k2.P[i2];
            }
            if (n11 != -1) {
                k2 = rs.d.k.f(n11);
            }
        }
        e_0.h = true;
        h h2 = k2.h(1);
        e_0.h = false;
        if (h2 == null) {
            return null;
        }
        rs.l.f_0 f_02 = null;
        if (k2.p != -1 && (f_02 = rs.d.k.a(k2.F, 10, -1)) == null) {
            return null;
        }
        rs.l.f_0 f_03 = new rs.l.f_0(n5 > 32 ? n5 : 32, n5 > 32 ? n5 : 32);
        int n12 = e_0.s;
        int n13 = e_0.t;
        int[] nArray = e_0.x;
        int[] nArray2 = rs.l.c.g;
        int n14 = rs.l.c.h;
        int n15 = rs.l.c.i;
        int n16 = rs.l.c.l;
        int n17 = rs.l.c.m;
        int n18 = rs.l.c.j;
        int n19 = rs.l.c.k;
        e_0.p = false;
        e_0.q = false;
        rs.l.c.a(n5 > 32 ? n5 : 32, n5 > 32 ? n5 : 32, f_03.m, null);
        rs.l.c.a(0, 0, n5 > 32 ? n5 : 32, n5 > 32 ? n5 : 32, 0, true);
        e_0.f();
        int n20 = k2.G;
        if (n4 == -1) {
            n20 = (int)((double)n20 * 1.5);
        }
        if (n4 > 0) {
            n20 = (int)((double)n20 * 1.04);
        }
        if (n4 == 16705) {
            n4 = 0;
        }
        if (n5 != 32) {
            n20 = (int)Math.floor((float)k2.G * (32.0f / (float)n5));
        }
        int n21 = e_0.v[k2.M] * n20 >> 16;
        int n22 = e_0.w[k2.M] * n20 >> 16;
        e_0.h = true;
        h2.a(k2.Z, k2.ae, k2.M, k2.v, n21 + h2.g / 2 + k2.W, n22 + k2.W);
        e_0.h = false;
        int n23 = n7 = n5 > 32 ? n5 - 1 : 31;
        while (n7 >= 0) {
            int n24 = n6 = n5 > 32 ? n5 - 1 : 31;
            while (n6 >= 0) {
                if (f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] == 0) {
                    if (n7 > 0 && f_03.m[n7 - 1 + n6 * (n5 > 32 ? n5 : 32)] > 1) {
                        f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] = 1;
                    } else if (n6 > 0 && f_03.m[n7 + (n6 - 1) * (n5 > 32 ? n5 : 32)] > 1) {
                        f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] = 1;
                    } else if (n7 < (n5 > 32 ? n5 - 1 : 31) && f_03.m[n7 + 1 + n6 * (n5 > 32 ? n5 : 32)] > 1) {
                        f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] = 1;
                    } else if (n6 < (n5 > 32 ? n5 - 1 : 31) && f_03.m[n7 + (n6 + 1) * (n5 > 32 ? n5 : 32)] > 1) {
                        f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] = 1;
                    }
                }
                --n6;
            }
            --n7;
        }
        if (n5 <= 32) {
            if (n4 > 0) {
                int n25 = n7 = n5 > 32 ? n5 - 1 : 31;
                while (n7 >= 0) {
                    int n26 = n6 = n5 > 32 ? n5 - 1 : 31;
                    while (n6 >= 0) {
                        if (f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] == 0) {
                            if (n7 > 0 && f_03.m[n7 - 1 + n6 * (n5 > 32 ? n5 : 32)] == 1) {
                                f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] = n4;
                            } else if (n6 > 0 && f_03.m[n7 + (n6 - 1) * (n5 > 32 ? n5 : 32)] == 1) {
                                f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] = n4;
                            } else if (n7 < (n5 > 32 ? n5 - 1 : 31) && f_03.m[n7 + 1 + n6 * (n5 > 32 ? n5 : 32)] == 1) {
                                f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] = n4;
                            } else if (n6 < (n5 > 32 ? n5 - 1 : 31) && f_03.m[n7 + (n6 + 1) * (n5 > 32 ? n5 : 32)] == 1) {
                                f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] = n4;
                            }
                        }
                        --n6;
                    }
                    --n7;
                }
            } else if (n4 == 0) {
                int n27 = n7 = n5 > 32 ? n5 - 1 : 31;
                while (n7 >= 0) {
                    int n28 = n6 = n5 > 32 ? n5 - 1 : 31;
                    while (n6 >= 0) {
                        if (f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] == 0 && n7 > 0 && n6 > 0 && f_03.m[n7 - 1 + (n6 - 1) * 32] > 0) {
                            f_03.m[n7 + n6 * (n5 > 32 ? n5 : 32)] = 0x302020;
                        }
                        --n6;
                    }
                    --n7;
                }
            }
        }
        if (k2.p != -1) {
            n7 = f_02.r;
            n6 = f_02.s;
            f_02.r = n5 > 32 ? n5 : 32;
            int n29 = f_02.s = n5 > 32 ? n5 : 32;
            if (k2.p == 1850) {
                f_02.f(0, -1);
            } else {
                f_02.f(0, 0);
            }
            f_02.r = n7;
            f_02.s = n6;
        }
        if (!bl2 && n4 == 0) {
            k.a(f_03, n2);
        }
        rs.l.c.a(n14, n15, nArray2, null);
        rs.l.c.c(n19, n16, n17, n18);
        e_0.s = n12;
        e_0.t = n13;
        e_0.x = nArray;
        e_0.p = true;
        e_0.q = true;
        f_03.r = k2.C ? (n5 > 32 ? n5 + 1 : 33) : (n5 > 32 ? n5 : 32);
        f_03.s = n3;
        f_03.h = n5;
        if (n9 == -1 && rs.d.k.a(k2, n2)) {
            f_03.h = -1;
        }
        return f_03;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public h h(int n2) {
        h h2;
        int n3;
        block32: {
            int n4;
            if (this.P != null && n2 > 1) {
                n4 = -1;
                for (n3 = 0; n3 < 10; ++n3) {
                    if (n2 < this.ab[n3] || this.ab[n3] == 0) continue;
                    n4 = this.P[n3];
                }
                if (n4 != -1) {
                    return rs.d.k.f(n4).h(1);
                }
            }
            if (this.i == 3241 || this.i == 28807) {
                n4 = rs.f.a.N ? 1 : 0;
                try {
                    if (!rs.f.a.N) {
                        rs.f.a.N = true;
                    }
                    rs.a.k.aJ = true;
                    rs.a.k.aK = true;
                    if (Client.eR.c() == null) break block32;
                    h h3 = null;
                    try {
                        h3 = Client.eR.c(false);
                    }
                    finally {
                        rs.a.k.aK = false;
                        rs.a.k.aJ = false;
                    }
                    rs.f.a.N = n4;
                    h h4 = h3;
                    return h4;
                }
                finally {
                    rs.f.a.N = n4;
                    rs.a.k.aJ = false;
                    rs.a.k.aK = false;
                }
            }
        }
        f_0 f_02 = e_0.h && rs.k.e.a() ? m : l;
        n3 = Client.ba && Client.bb == this.i ? 1 : 0;
        h h5 = h2 = n3 != 0 ? null : (h)f_02.a(this.i);
        if (h2 != null) {
            h2.A = true;
            return h2;
        }
        rs.a.a.a a2 = rs.a.h.h;
        rs.cache.osrs.c.a(this.ar);
        try {
            h2 = rs.a.h.a(this.A, a2);
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
        if (h2 == null) {
            return null;
        }
        h2.A = true;
        rs.l.f.e.d().a(rs.l.f.a.a, (Object)this, h2);
        if (this.aw != null) {
            this.aw.a(h2);
        } else if (this.i >= 21706 && this.i <= 21708) {
            rs.d.k.b(h2, 60);
        } else {
            try {
                rs.d.k.c(this, h2, this.i);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (this.t != 128 || this.O != 128 || this.N != 128) {
            h2.b(this.t, this.N, this.O);
        }
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.length; ++i2) {
                h2.i(this.g[i2], this.h[i2]);
            }
        }
        if (this.V) {
            h2.b(20 + this.X, 768 + this.I, -50, -10, -50, true);
        } else if (this.w != null && (this.w.toLowerCase().contains("token (20") || this.w.toLowerCase().contains(" icon"))) {
            h2.b(90 + this.X, 768 + this.I, -50, -10, -50, true);
        } else if (this.i == 20698) {
            h2.b(120 + this.X, 768 + this.I, -50, -10, -50, true);
        } else {
            h2.b(74 + this.X, 768 + this.I, -50, -10, -50, true);
        }
        h2.aN = true;
        if (n3 == 0) {
            f_02.a(h2, this.i);
        }
        return h2;
    }

    public h i(int n2) {
        h h2;
        int n3;
        if (this.P != null && n2 > 1) {
            int n4 = -1;
            for (n3 = 0; n3 < 10; ++n3) {
                if (n2 < this.ab[n3] || this.ab[n3] == 0) continue;
                n4 = this.P[n3];
            }
            if (n4 != -1) {
                return rs.d.k.f(n4).i(1);
            }
        }
        if ((h2 = rs.a.h.a(this.A, this.ar)) == null) {
            return null;
        }
        if (this.g != null) {
            for (n3 = 0; n3 < this.g.length; ++n3) {
                h2.i(this.g[n3], this.h[n3]);
            }
        }
        return h2;
    }

    public static int j(int n2) {
        k k2 = rs.d.k.f(n2);
        int n3 = k2.A;
        return n3;
    }

    public void a(e e2) {
        int n2;
        block0: while ((n2 = e2.y()) != 0) {
            int n3;
            if (n2 == 1) {
                this.A = e2.A();
                continue;
            }
            if (n2 == 2) {
                if (rs.f.a.aa && c.w_(this.i)) {
                    this.w = this.x = ((k)rs.d.k.c.b((int)this.i)).w;
                    e2.G();
                    continue;
                }
                this.w = this.x = e2.F();
                continue;
            }
            if (n2 == 3) {
                e2.I();
                continue;
            }
            if (n2 == 4) {
                this.G = e2.A();
                continue;
            }
            if (n2 == 5) {
                this.M = e2.A();
                continue;
            }
            if (n2 == 6) {
                this.Z = e2.A();
                continue;
            }
            if (n2 == 7) {
                this.v = e2.A();
                if (this.v <= Short.MAX_VALUE) continue;
                this.v -= 65536;
                continue;
            }
            if (n2 == 8) {
                this.W = e2.A();
                if (this.W <= Short.MAX_VALUE) continue;
                this.W -= 65536;
                continue;
            }
            if (n2 == 10) {
                e2.A();
                continue;
            }
            if (n2 == 11) {
                this.C = true;
                continue;
            }
            if (n2 == 12) {
                this.f = e2.A();
                continue;
            }
            if (n2 == 16) {
                this.n = true;
                continue;
            }
            if (n2 == 23) {
                this.r = e2.A();
                this.ag = e2.z();
                continue;
            }
            if (n2 == 24) {
                this.K = e2.A();
                continue;
            }
            if (n2 == 25) {
                this.aa = e2.A();
                this.ak = e2.z();
                continue;
            }
            if (n2 == 26) {
                this.q = e2.A();
                continue;
            }
            if (n2 >= 30 && n2 < 35) {
                if (rs.f.a.aa && c.w_(this.i)) {
                    this.u = ((k)rs.d.k.c.b((int)this.i)).u;
                    e2.G();
                    continue;
                }
                if (this.u == null) {
                    this.u = new String[5];
                }
                this.u[n2 - 30] = e2.F();
                if (!this.u[n2 - 30].equalsIgnoreCase("hidden")) continue;
                this.u[n2 - 30] = null;
                continue;
            }
            if (n2 >= 35 && n2 < 40) {
                if (rs.f.a.aa && c.w_(this.i)) {
                    this.L = ((k)rs.d.k.c.b((int)this.i)).L;
                    e2.G();
                    continue;
                }
                if (this.L == null) {
                    this.L = new String[5];
                }
                this.L[n2 - 35] = e2.F();
                if (!this.L[n2 - 35].equalsIgnoreCase("null")) continue;
                this.L[n2 - 35] = null;
                continue;
            }
            if (n2 == 40) {
                n3 = e2.y();
                this.g = new int[n3];
                this.h = new int[n3];
                int n4 = 0;
                while (true) {
                    if (n4 >= n3) continue block0;
                    this.g[n4] = e2.A();
                    this.h[n4] = e2.A();
                    ++n4;
                }
            }
            if (n2 == 78) {
                this.J = e2.A();
                continue;
            }
            if (n2 == 79) {
                this.o = e2.A();
                continue;
            }
            if (n2 == 90) {
                this.B = e2.A();
                continue;
            }
            if (n2 == 91) {
                this.Y = e2.A();
                continue;
            }
            if (n2 == 92) {
                this.s = e2.A();
                continue;
            }
            if (n2 == 93) {
                this.z = e2.A();
                continue;
            }
            if (n2 == 95) {
                this.ae = e2.A();
                continue;
            }
            if (n2 == 97) {
                this.F = e2.A();
                continue;
            }
            if (n2 == 98) {
                this.p = e2.A();
                continue;
            }
            if (n2 >= 100 && n2 < 110) {
                if (this.P == null) {
                    this.P = new int[10];
                    this.ab = new int[10];
                }
                this.P[n2 - 100] = e2.A();
                this.ab[n2 - 100] = e2.A();
                continue;
            }
            if (n2 == 110) {
                this.t = e2.A();
                continue;
            }
            if (n2 == 111) {
                this.O = e2.A();
                continue;
            }
            if (n2 == 112) {
                this.N = e2.A();
                continue;
            }
            if (n2 == 113) {
                this.X = e2.z();
                continue;
            }
            if (n2 == 114) {
                this.I = e2.z() * 5;
                continue;
            }
            if (n2 == 115) {
                this.ac = e2.y();
                continue;
            }
            if (n2 == 116) {
                n3 = e2.A();
                continue;
            }
            if (n2 != 117) continue;
            n3 = e2.A();
        }
        return;
    }

    public k() {
        this.i = -1;
    }

    public k(k k2) {
        this.i = k2.i;
        this.ar = k2.ar;
        this.ak = k2.ak;
        this.aj = k2.aj;
        this.ai = k2.ai;
        this.ah = k2.ah;
        this.af = k2.af;
        this.f = k2.f;
        this.g = k2.g;
        this.h = k2.h;
        this.n = k2.n;
        this.o = k2.o;
        this.p = k2.p;
        this.q = k2.q;
        this.r = k2.r;
        this.s = k2.s;
        this.t = k2.t;
        this.u = k2.u;
        this.v = k2.v;
        this.w = k2.w;
        this.x = k2.x;
        this.z = k2.z;
        this.A = k2.A;
        this.B = k2.B;
        this.C = k2.C;
        this.E = k2.E;
        this.F = k2.F;
        this.G = k2.G;
        this.I = k2.I;
        this.J = k2.J;
        this.K = k2.K;
        this.L = k2.L;
        this.M = k2.M;
        this.N = k2.N;
        this.O = k2.O;
        this.P = k2.P;
        this.W = k2.W;
        this.X = k2.X;
        this.Y = k2.Y;
        this.Z = k2.Z;
        this.aa = k2.aa;
        this.ab = k2.ab;
        this.ac = k2.ac;
        this.ae = k2.ae;
        this.ag = k2.ag;
    }

    public void a(k k2) {
        this.ar = k2.ar;
        this.ak = k2.ak;
        this.aj = k2.aj;
        this.ai = k2.ai;
        this.ah = k2.ah;
        this.af = k2.af;
        this.f = k2.f;
        this.g = this.a(k2.g);
        this.h = this.a(k2.h);
        this.n = k2.n;
        this.o = k2.o;
        this.q = k2.q;
        this.r = k2.r;
        this.s = k2.s;
        this.t = k2.t;
        this.u = this.b(k2.u);
        this.v = k2.v;
        this.w = k2.w;
        this.x = k2.x;
        this.z = k2.z;
        this.A = k2.A;
        this.B = k2.B;
        this.C = k2.C;
        this.E = k2.E;
        this.G = k2.G;
        this.I = k2.I;
        this.J = k2.J;
        this.K = k2.K;
        this.L = k2.L;
        this.M = k2.M;
        this.N = k2.N;
        this.O = k2.O;
        this.W = k2.W;
        this.X = k2.X;
        this.Y = k2.Y;
        this.Z = k2.Z;
        this.aa = k2.aa;
        this.P = this.a(k2.P);
        this.ab = this.a(k2.ab);
        this.ac = k2.ac;
        this.ae = k2.ae;
        this.ag = k2.ag;
        this.as = k2.as;
        this.at = k2.at;
        this.au = k2.au;
        this.av = k2.av;
        this.ax = k2.ax;
    }

    public static void a(k k2, k k3) {
        for (String[] stringArray : aA) {
            if (!rs.d.k.a(k2.L, stringArray)) continue;
            k3.L = stringArray;
            return;
        }
        k3.L = new String[k2.L.length];
        System.arraycopy(k2.L, 0, k3.L, 0, k3.L.length);
    }

    public static void b(k k2, k k3) {
        if (rs.d.k.a(k2.u, az)) {
            k3.u = az;
        } else {
            k3.u = new String[k2.u.length];
            System.arraycopy(k2.u, 0, k3.u, 0, k3.u.length);
        }
    }

    private static boolean a(String[] stringArray, String[] stringArray2) {
        if (stringArray == null || stringArray2 == null || stringArray.length != stringArray2.length) {
            return false;
        }
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (stringArray[i2] == null && stringArray2[i2] == null || !(stringArray[i2] != null && stringArray2[i2] == null && !stringArray[i2].equals("null") || stringArray[i2] == null && stringArray2[i2] != null && !stringArray2[i2].equals("null")) && stringArray[i2].equals(stringArray2[i2])) continue;
            return false;
        }
        return true;
    }

    private int[] a(Object object) {
        if (object == null) {
            return null;
        }
        int[] nArray = (int[])object;
        return Arrays.copyOf(nArray, nArray.length);
    }

    private String[] b(Object object) {
        if (object == null) {
            return null;
        }
        String[] stringArray = (String[])object;
        return Arrays.copyOf(stringArray, stringArray.length);
    }

    static {
        c = new cc(a + 1, 1.0f);
        d = "Dwarf remains";
        ay = new long[][][]{new long[][]{{19042L, 0L, 0L}, {1038L, 1040L, 1042L, 1044L, 1046L, 1048L}}, new long[][]{{19043L, 0L, 0L}, {1053L, 1055L, 1057L}}, new long[][]{{20699L, 0L, 0L}, {20542L, 20543L, 20544L, 20545L, 20546L}}, new long[][]{{21096L, 0L, 0L}, {20539L, 20540L, 20541L}}};
        e = 0L;
        az = new String[]{null, null, "Take", null, null};
        aA = new String[][]{{null, "Wear", null, null, "Drop"}, {null, "Wield", null, null, "Drop"}, {null, null, null, null, "Drop"}, {null, "Wear", null, null, "Destroy"}, {null, "Wield", null, null, "Destroy"}, {null, null, null, null, "Destroy"}};
        j = new f_0(1000);
        k = new f_0(100);
        l = new f_0(50);
        m = new f_0(50);
        H = true;
    }
}

