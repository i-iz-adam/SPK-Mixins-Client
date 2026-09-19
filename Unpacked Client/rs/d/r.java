/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 */
package rs.d;

import gnu.trove.f.b.cc;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rs.Client;
import rs.a.h;
import rs.cache.d;
import rs.d.v;
import rs.d.y;
import rs.f.a;
import rs.f_0;
import rs.k;
import rs.s.c.c;
import rs.x.e;
import rs.x.f;

public final class r {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 10;
    public static final int n = 11;
    public static final int o = 12;
    public static final int p = 13;
    public static final int q = 14;
    public static final int r = 15;
    public static final int s = 16;
    public static final int t = 17;
    public static final int u = 18;
    public static final int v = 19;
    public static final int w = 20;
    public static final int x = 21;
    public static final int y = 22;
    public static rs.t.a.f z;
    public static int A;
    public static cc<r> B;
    public static Map<Integer, Boolean> C;
    public static final int[] D;
    public static a E;
    public static boolean F;
    public static List<Integer> G;
    public static final String H = "E:\\Users\\dariu\\Desktop\\Files\\Documents\\OSRS Dumps\\177 dump\\index1\\";
    public static boolean I;
    public static f_0 J;
    public static f_0 K;
    public static f_0 L;
    public static f_0 M;
    public static f_0 N;
    public static f_0 O;
    private static e az;
    public boolean P;
    public byte Q;
    private int aA;
    public String R;
    public int S;
    private static final h[] aB;
    public byte T;
    public int U;
    private int aC;
    public int V;
    public int[] W;
    public int X;
    public int Y;
    private boolean aD;
    public static boolean Z;
    private static e aE;
    public int aa;
    private static int[] aF;
    public boolean ab;
    public int ac;
    public int[] ad;
    public int ae;
    public int af;
    public boolean ag;
    public boolean ah;
    public static Client ai;
    private boolean aG;
    public boolean aj;
    public int ak;
    public boolean al;
    private static int aH;
    public int am;
    public int[] an;
    public int ao;
    public int ap;
    private int[] aI;
    public byte[] aq;
    public boolean ar;
    public boolean as;
    public boolean at;
    public int au;
    public int av;
    public boolean aw;
    private static r[] aJ;
    private int aK;
    public int[] ax;
    public String[] ay;

    public static boolean a(h h2, int n2, int n3) {
        if (!rs.f.a.M) {
            return false;
        }
        if (rs.f.a.r == a.b.d) {
            if (n2 == 982 || n2 == 1394 || n2 == 321 || n2 == 320 || n2 == 319 || n2 == 4735 || n2 == 9484 || n2 == 26900 || n2 == 26901 || n2 == 26902 || n2 == 26903 || n2 == 26904 || n2 == 23926) {
                h2.a(new int[]{16, 14, 13});
            }
            if (n2 == 26883 || n2 == 26887 || n2 == 26891 || n2 == 26972 || n2 == 26889 || n2 == 26892 || n2 == 26890 || n2 == 26885) {
                h2.a(new int[]{8, 7, 6});
            }
            if (n2 == 26979 || n2 == 26977 || n2 == 26975 || n2 == 26978 || n2 == 26973 || n2 == 26974 || n2 == 27018 || n2 == 27019 || n2 == 27020) {
                h2.a(new int[]{4010, 4025, 3995});
            }
            if (n2 == 27018 || n2 == 27019 || n2 == 27020 || n2 == 4470) {
                h2.a(new int[]{4000});
            }
            if (n2 == 2474 || n2 == 26922) {
                h2.a(new int[]{4000, 5});
            }
        }
        if (rs.f.a.r == a.b.b || rs.f.a.r == a.b.c) {
            if (n2 == 982 || n2 == 1394 || n2 == 321 || n2 == 320 || n2 == 319 || n2 == 4735 || n2 == 9484 || n2 == 26900 || n2 == 26901 || n2 == 26902 || n2 == 26903 || n2 == 26904 || n2 == 23926) {
                int[] nArray;
                if (rs.f.a.r == a.b.c) {
                    int[] nArray2 = new int[3];
                    nArray2[0] = 10;
                    nArray2[1] = 9;
                    nArray = nArray2;
                    nArray2[2] = 8;
                } else {
                    int[] nArray3 = new int[2];
                    nArray3[0] = 36150;
                    nArray = nArray3;
                    nArray3[1] = 127;
                }
                h2.a(nArray);
            }
            if (n2 == 26883 || n2 == 26887 || n2 == 26891 || n2 == 26972 || n2 == 26889 || n2 == 26892 || n2 == 26890 || n2 == 26885) {
                int[] nArray;
                if (rs.f.a.r == a.b.c) {
                    int[] nArray4 = new int[3];
                    nArray4[0] = 10;
                    nArray4[1] = 9;
                    nArray = nArray4;
                    nArray4[2] = 8;
                } else {
                    int[] nArray5 = new int[2];
                    nArray5[0] = 80;
                    nArray = nArray5;
                    nArray5[1] = 95;
                }
                h2.a(nArray);
            }
            if (n2 == 26979 || n2 == 26977 || n2 == 26975 || n2 == 26978 || n2 == 26973 || n2 == 26974 || n2 == 27018 || n2 == 27019 || n2 == 27020) {
                int[] nArray;
                if (rs.f.a.r == a.b.c) {
                    int[] nArray6 = new int[2];
                    nArray6[0] = 910;
                    nArray = nArray6;
                    nArray6[1] = 912;
                } else {
                    int[] nArray7 = new int[3];
                    nArray7[0] = 127;
                    nArray7[1] = 121;
                    nArray = nArray7;
                    nArray7[2] = 115;
                }
                h2.a(nArray);
            }
            if (n2 == 27018 || n2 == 27019 || n2 == 27020 || n2 == 4470) {
                h2.a(new int[]{125});
            }
            if (n2 == 2474 || n2 == 26922) {
                int[] nArray;
                if (rs.f.a.r == a.b.c) {
                    int[] nArray8 = new int[2];
                    nArray8[0] = 945;
                    nArray = nArray8;
                    nArray8[1] = 10;
                } else {
                    int[] nArray9 = new int[2];
                    nArray9[0] = 36150;
                    nArray = nArray9;
                    nArray9[1] = 127;
                }
                h2.a(nArray);
            }
        }
        switch (n2) {
            case 24500: {
                h2.b(new int[]{22535, 22533}, new int[]{62, 62});
                break;
            }
            case 21464: {
                h2.b(new int[]{10270, 10285}, new int[]{63, 71});
                break;
            }
            case 2879: {
                h2.b(new int[]{17, 1}, new int[]{53, 61});
                break;
            }
            case 9666: {
                int n4 = 17;
                h2.b(new int[]{17, 1}, new int[]{24, 24});
                break;
            }
            case 2501: {
                h2.a(new int[]{350770, 350770, 933, 933, 933});
                break;
            }
            case 3752: {
                h2.a(new int[]{36150, 36150});
                break;
            }
            case 13291: {
                if (rs.f.a.r == a.b.d) {
                    h2.a(8128, new int[]{12, 10, 5});
                    h2.a(51111, new int[]{4053, 4040, 4055});
                    break;
                }
                h2.a(8128, new int[]{12, 25, 50});
                h2.a(51111, new int[]{45121, 45122, 51160, 51210, 51110, 51170, 51180});
                break;
            }
            case 16999: {
                h2.a(6707, new int[]{8120, 8130, 8140});
                h2.a(7952, new int[]{6707});
                h2.a(7585, new int[]{6707});
                break;
            }
            case 29240: {
                h2.a(new int[]{62127, 62131, 62135, 62011, 61888}, 53);
                break;
            }
            case 29241: {
                h2.a(new int[]{61718, 61714, 61594, 61598, 61603}, 54);
                break;
            }
            case 29227: 
            case 29422: {
                h2.a(new int[]{127, 7446}, 30);
                break;
            }
            case 3192: {
                h2.b(new int[]{7626, 7490}, new int[]{53, 53});
                break;
            }
            case 153: {
                h2.b(new int[]{1, 17}, new int[]{53, 1});
                break;
            }
            case 2805: 
            case 5857: {
                h2.a(new int[]{15, 16, 15});
                break;
            }
            case 6487: {
                h2.a(new int[]{10, 15, 5});
                break;
            }
            case 6493: {
                h2.a(new int[]{10, 15, 5});
                break;
            }
            case 26193: {
                if (h2 == null) break;
                h2.b(new int[]{7626, 7626, 6563, 6682, 49, 24, 7514}, new int[]{62, 62, 62, 62, 258, 258, 258});
                break;
            }
            case 16474: {
                h2.b(new int[]{10142, 10153, 10159, 10006, 10155, 10163, 10023, 10027, 43067}, new int[]{30, 30, 58, 30, 30, 30, 30, 30, 5});
                break;
            }
            case 11501: {
                if (h2 != null) {
                    h2.b(new int[]{32803}, new int[]{58});
                }
                return true;
            }
            case 2816: {
                if (h2 != null) {
                    h2.b(new int[]{12969}, new int[]{60});
                }
                return true;
            }
        }
        return false;
    }

    public static void a(int n2) {
        try {
            Files.copy(Paths.get(H + n2 + ".gz", new String[0]), Paths.get(rs.v.a.f() + "index1/" + n2 + ".gz", new String[0]), new CopyOption[0]);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void b(r r2) {
        if (Client.ee != 1) {
            return;
        }
        if (r2.an != null) {
            for (int n2 : r2.an) {
                if (C.get(n2) != null) continue;
                System.out.print(n2 + ",");
                C.put(n2, true);
                rs.d.r.a(n2);
            }
        }
    }

    public static void a(boolean bl) {
        if (rs.f.a.a == a.a.a) {
            return;
        }
        F = bl;
        if (bl) {
            int n2;
            az = new e(Client.a(rs.v.a.f() + "loc667.dat"));
            e e2 = new e(Client.a(rs.v.a.f() + "loc667.idx"));
            int n3 = e2.A();
            aF = new int[n3 + 40000];
            int n4 = 2;
            for (n2 = 0; n2 < n3; ++n2) {
                rs.d.r.aF[n2] = n4;
                n4 += e2.A();
            }
            aJ = new r[20];
            for (n2 = 0; n2 < 20; ++n2) {
                rs.d.r.aJ[n2] = new r();
            }
        } else {
            int n5;
            az = new e(Client.a(rs.v.a.f() + "loc.dat"));
            e e3 = new e(Client.a(rs.v.a.f() + "loc.idx"));
            int n6 = e3.A();
            aF = new int[n6 + 40000];
            int n7 = 2;
            for (n5 = 0; n5 < n6; ++n5) {
                rs.d.r.aF[n5] = n7;
                n7 += e3.A();
            }
            aJ = new r[20];
            for (n5 = 0; n5 < 20; ++n5) {
                rs.d.r.aJ[n5] = new r();
            }
        }
    }

    public static void a(a a2) {
        block9: {
            int n2;
            block11: {
                int n3;
                block10: {
                    int n4;
                    block8: {
                        int n5;
                        E = a2;
                        if (E != rs.d.r$a.c) break block8;
                        az = new e(Client.a(rs.v.a.f() + "loc667.dat"));
                        e e2 = new e(Client.a(rs.v.a.f() + "loc667.idx"));
                        int n6 = e2.A();
                        aF = new int[n6 + 40000];
                        int n7 = 2;
                        for (n5 = 0; n5 < n6; ++n5) {
                            rs.d.r.aF[n5] = n7;
                            n7 += e2.A();
                        }
                        aJ = new r[20];
                        for (n5 = 0; n5 < 20; ++n5) {
                            rs.d.r.aJ[n5] = new r();
                        }
                        break block9;
                    }
                    if (E != rs.d.r$a.a) break block10;
                    az = new e(Client.a(rs.v.a.f() + "loc.dat"));
                    e e3 = new e(Client.a(rs.v.a.f() + "loc.idx"));
                    int n8 = e3.A();
                    aF = new int[n8 + 40000];
                    int n9 = 2;
                    for (n4 = 0; n4 < n8; ++n4) {
                        rs.d.r.aF[n4] = n9;
                        n9 += e3.A();
                    }
                    aJ = new r[20];
                    for (n4 = 0; n4 < 20; ++n4) {
                        rs.d.r.aJ[n4] = new r();
                    }
                    break block9;
                }
                if (E != rs.d.r$a.b) break block11;
                az = new e(Client.a(rs.v.a.f() + "osrs_loc.dat"));
                e e4 = new e(Client.a(rs.v.a.f() + "osrs_loc.idx"));
                int n10 = e4.A();
                aF = new int[n10 + 40000];
                int n11 = 2;
                for (n3 = 0; n3 < n10; ++n3) {
                    rs.d.r.aF[n3] = n11;
                    n11 += e4.A();
                }
                aJ = new r[20];
                for (n3 = 0; n3 < 20; ++n3) {
                    rs.d.r.aJ[n3] = new r();
                }
                break block9;
            }
            if (E != rs.d.r$a.d) break block9;
            az = new e(Client.a(rs.v.a.f() + "osrs_config" + File.separator + "loc.dat"));
            e e5 = new e(Client.a(rs.v.a.f() + "osrs_config" + File.separator + "loc.idx"));
            int n12 = e5.A();
            aF = new int[n12 + 40000];
            int n13 = 2;
            for (n2 = 0; n2 < n12; ++n2) {
                rs.d.r.aF[n2] = n13;
                n13 += e5.A();
            }
            aJ = new r[20];
            for (n2 = 0; n2 < 20; ++n2) {
                rs.d.r.aJ[n2] = new r();
            }
        }
    }

    public static void a(a a2, byte[] byArray, byte[] byArray2) {
        int n2;
        e e2 = new e(byArray2);
        int n3 = e2.A();
        int[] nArray = new int[n3];
        int n4 = 2;
        for (n2 = 0; n2 < n3; ++n2) {
            nArray[n2] = n4;
            n4 = Math.addExact(n4, e2.A());
        }
        if (n4 > byArray.length) {
            throw new IllegalArgumentException("Object definition data/index length mismatch");
        }
        E = a2;
        az = new e(byArray);
        aF = nArray;
        A = n3;
        aJ = new r[20];
        aH = 0;
        for (n2 = 0; n2 < aJ.length; ++n2) {
            rs.d.r.aJ[n2] = new r();
        }
    }

    public static r b(int n2) {
        if (n2 > aF.length) {
            n2 = aF.length - 1;
        }
        r r2 = new r();
        r2.aa = n2;
        r2.a();
        try {
            rs.d.r.az.h = aF[n2];
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (E == rs.d.r$a.c) {
            r2.d(az);
        } else if (E == rs.d.r$a.b || E == rs.d.r$a.d) {
            r2.a(az);
        } else {
            r2.c(az);
        }
        return r2;
    }

    public static r c(int n2) {
        int n3;
        int[] nArray;
        if (B.b(n2) != null) {
            return (r)B.b(n2);
        }
        if (z.b(n2)) {
            r r2 = (r)z.a(n2);
            if (r2.aw || r2.av == 1 && E == rs.d.r$a.d) {
                return r2;
            }
        }
        if (n2 > aF.length) {
            n2 = aF.length - 1;
        }
        for (int i2 = 0; i2 < 20; ++i2) {
            if (rs.d.r.aJ[i2].aa != n2) continue;
            return aJ[i2];
        }
        aH = (aH + 1) % 20;
        r r3 = aJ[aH];
        try {
            rs.d.r.az.h = aF[n2];
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        r3.aa = n2;
        r3.a();
        if (E == rs.d.r$a.c) {
            r3.d(az);
        } else if (E == rs.d.r$a.b || E == rs.d.r$a.d) {
            r3.a(az);
        } else {
            r3.c(az);
        }
        if (rs.f.a.r == a.b.d && (n2 == 1276 || n2 == 1278)) {
            r3.R = "Decoration";
            r3.an = new int[]{rs.d.r.a(1284, 0)};
        }
        switch (n2) {
            case 23735: {
                r3.au = -1;
                break;
            }
            case 31299: {
                r3.au = -1;
            }
        }
        if (E == rs.d.r$a.b) {
            rs.c.a.a.a(r3, n2);
        }
        switch (n2) {
            case 9522: {
                r3.R = "Enchanted crystals";
                r3.ay = new String[]{"Mine", null, null, null, null};
                r3.an = new int[]{32448, 32503};
                r3.X = 50;
                r3.S = 50;
                r3.am = 50;
                r3.U = 1;
                r3.af = 1;
                break;
            }
            case 9521: {
                r3.R = null;
                r3.an = new int[]{32466};
                r3.X = 220;
                r3.S = 220;
                r3.am = 220;
                r3.U = 4;
                r3.af = 4;
                break;
            }
            case 15946: {
                r3.R = "Sand mound";
                r3.ay = new String[]{"Dig", null, null, null, null};
            }
        }
        if (E != rs.d.r$a.d) {
            switch (n2) {
                case 19039: {
                    r3.ay = new String[]{"Climb-down", "Peek", null, null, null};
                    break;
                }
                case 23113: 
                case 23115: {
                    r3.ay = new String[]{"Search", null, null, null, null};
                    break;
                }
                case 10384: {
                    r3.R = "Magical pumpkin";
                    r3.ay = new String[]{"Take-from", null, null, null, null};
                    r3.ar = true;
                    r3.ax = new int[0];
                    r3.W = new int[0];
                    r3.an = new int[]{58432};
                    r3.au = 8775;
                    break;
                }
                case 10694: {
                    r3.R = "Regular imp box table";
                    r3.ay = new String[]{"Craft", null, null, null, null};
                    break;
                }
                case 10690: {
                    r3.R = "Looty imp box table";
                    r3.ay = new String[]{"Craft", null, null, null, null};
                    break;
                }
                case 10686: {
                    r3.R = "Swift imp box table";
                    r3.ay = new String[]{"Craft", null, null, null, null};
                    break;
                }
                case 19036: {
                    r3.R = "Giant snowglobe";
                    r3.ay = new String[]{"Exchange", null, null, null, null};
                    r3.an = new int[]{30309};
                    r3.X = 700;
                    r3.S = 700;
                    r3.am = 2000;
                    r3.U = 1;
                    r3.af = 1;
                    break;
                }
                case 18641: {
                    r3.R = "Event armory";
                    break;
                }
                case 9762: {
                    r3.R = "Kharazi chest <img=248>";
                    break;
                }
                case 4458: {
                    r3.R = "<img=49> Bandage table";
                    break;
                }
                case 4463: {
                    r3.R = "<img=53> Upgrade potion table";
                    break;
                }
                case 14736: {
                    r3.ay = new String[]{"Climb-down", null, null, null, null};
                    break;
                }
                case 27226: {
                    r3.ay = new String[]{null, null, null, null, null};
                    break;
                }
                case 32457: {
                    r3.aj = false;
                    r3.ar = false;
                    break;
                }
                case 13957: {
                    r3.a();
                    r3.a(rs.d.r.c(4470));
                    r3.R = "Barrier";
                    r3.aa = 13957;
                    r3.aj = false;
                    r3.ar = false;
                    break;
                }
                case 32687: {
                    r3.al = false;
                    r3.aj = true;
                    r3.ar = true;
                    break;
                }
                case 31299: {
                    r3.au = -1;
                    break;
                }
                case 15477: {
                    if (rs.f.a.r == a.b.d) {
                        r3.ax = new int[]{50072, 49948, 49953, 49829, 49705, 628, 28, 24, 33, 37, 41};
                        r3.W = new int[]{461745, 461745, 461745, 461745, 461745, 2, 10, 5, 10, 5, 10};
                        break;
                    }
                    if (rs.f.a.r == a.b.e) {
                        r3.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                        r3.W = new int[]{305745, 305745, 305745, 305745, 305745};
                        break;
                    }
                    if (rs.f.a.r == a.b.b) {
                        r3.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                        r3.W = new int[]{36150, 36150, 127, 127, 127};
                        break;
                    }
                    if (rs.f.a.r == a.b.c) {
                        r3.ax = new int[]{50072, 49948, 49953, 49829, 49705, 628, 28, 24, 33, 37, 41};
                        r3.W = new int[]{925, 935, 127, 127, 127, 5, 13, 8, 13, 8, 13};
                        break;
                    }
                    r3.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                    r3.W = new int[]{50072, 49948, 49953, 49829, 49705};
                    break;
                }
                case 6487: {
                    r3.R = "Wildy obelisk";
                    r3.ay = new String[]{"Teleport", null, null, null, "Remove"};
                    break;
                }
                case 2908: 
                case 2909: {
                    r3.ar = false;
                    r3.aj = false;
                    r3.ar = false;
                    break;
                }
                case 21464: {
                    r3.R = "Throne of the gods";
                    r3.ay = new String[]{"Sit", "Claim-sceptre", null, null, "Remove"};
                    break;
                }
                case 20298: {
                    r3.a(rs.d.r.c(13661));
                    r3.R = "Slayer crystal";
                    r3.ay = new String[]{"Rub", null, null, null, "Remove"};
                    r3.ax = new int[]{6682, 8128, 38123, 43129};
                    r3.W = new int[]{5, 965, 965, 965};
                    break;
                }
                case 20299: {
                    r3.a(rs.d.r.c(13661));
                    r3.R = "Hotspot crystal";
                    r3.ay = new String[]{"Rub", null, null, null, "Remove"};
                    r3.ax = new int[]{6682, 8128, 38123, 43129};
                    r3.W = new int[]{8127, 87770, 87770, 87770};
                    break;
                }
                case 9391: {
                    r3.ax = new int[]{0};
                    r3.W = new int[]{1};
                    break;
                }
                case 9392: {
                    r3.R = "Blood obelisk";
                    r3.aj = false;
                    r3.ay = new String[]{"Rub", null, null, null, null};
                    r3.ar = true;
                    r3.ax = new int[]{0, 916, 42217, 920};
                    r3.W = new int[]{926, 1, 1, 1};
                    break;
                }
                case 20300: {
                    r3.a(rs.d.r.c(13661));
                    r3.R = "Grand crystal";
                    r3.ay = new String[]{"Rub", null, null, null, "Remove"};
                    break;
                }
                case 20301: {
                    r3.a(rs.d.r.c(13664));
                    r3.R = "Raids chart";
                    r3.ay = new String[]{"Study", null, null, null, "Remove"};
                    r3.ax = new int[]{4510, 4502, 5652, 8530};
                    r3.W = new int[]{51136, 51136, 51136, 10};
                    break;
                }
                case 9522: {
                    r3.R = "Enchanted crystals";
                    r3.ay = new String[]{"Mine", null, null, null, null};
                    r3.an = new int[]{32448, 32503};
                    r3.X = 50;
                    r3.S = 50;
                    r3.am = 50;
                    r3.U = 1;
                    r3.af = 1;
                    break;
                }
                case 13840: {
                    r3.R = "Blood thorn bush";
                    r3.X = 50;
                    r3.S = 50;
                    r3.am = 50;
                    r3.U = 1;
                    r3.af = 1;
                    r3.ax = new int[]{5772};
                    r3.W = new int[]{921};
                    r3.aj = false;
                    r3.ar = false;
                    break;
                }
                case 9521: {
                    r3.R = null;
                    r3.an = new int[]{32466};
                    r3.X = 220;
                    r3.S = 220;
                    r3.am = 220;
                    r3.U = 4;
                    r3.af = 4;
                    break;
                }
                case 24500: {
                    r3.R = "Summer comet";
                    r3.ay = new String[]{"Mine", null, null, null, null};
                    r3.an = new int[]{42165};
                    r3.X = 200;
                    r3.S = 200;
                    r3.am = 200;
                    r3.U = 4;
                    r3.af = 4;
                    break;
                }
                case 2501: 
                case 3752: {
                    r3.aj = false;
                    r3.ar = false;
                    break;
                }
                case 26938: {
                    r3.R = "Equipment coffer";
                    r3.ay = new String[]{"Open", null, null, null, null};
                    r3.ax = new int[]{22412, 10281, 10285, 10277, 10270, 10275, 5165, 5161};
                    r3.W = new int[]{7114, 7114, 7114, 266770, 15, 1, 7114, 7114};
                    break;
                }
                case 10654: {
                    r3.an = new int[]{10491, 10495, 10496, 10497};
                    r3.X = 30;
                    r3.S = 30;
                    r3.am = 30;
                    r3.U = 1;
                    r3.af = 1;
                    r3.aj = false;
                    r3.ar = false;
                    break;
                }
                case 10660: {
                    r3.X = 100;
                    r3.S = 100;
                    r3.am = 100;
                    r3.U = 4;
                    r3.af = 4;
                    break;
                }
                case 19035: {
                    r3.am = 250;
                    break;
                }
                case 32812: {
                    r3.R = "Large door";
                    r3.ay = new String[]{"Enter", null, null, null, null};
                    r3.ar = true;
                    break;
                }
                case 21465: {
                    r3.R = "Well of Goodwill";
                    r3.ay = new String[]{"Contribute", "Point-shop", null, null, null};
                    r3.ar = true;
                    r3.an = new int[]{29561};
                    r3.U = 2;
                    r3.af = 2;
                    if (rs.f.a.r == a.b.d) {
                        r3.ax = new int[]{35891, 28727, 26665, 21522, 10262, 10275, 49, 38305, 38300, 38420, 38189, 38424, 38313, 38309, 38195, 38197, 37175, 39116, 39450, 35895, 37925, 37933, 35904, 35899, 37941, 35912, 35908, 37970, 10396, 10388, 7341, 7326, 49218};
                        r3.W = new int[]{32, 5, 15, 5, 15, 5, 4023, 4015, 4000, 4040, 4020, 4010, 4015, 4000, 4040, 4010, 4020, 4040, 4040, 10, 10, 15, 10, 15, 10, 10, 15, 10, 5, 5, 2, 2, 32};
                    }
                    if (rs.f.a.r != a.b.b && rs.f.a.r != a.b.c) break;
                    r3.ax = new int[]{35891, 28727, 26665, 21522, 10262, 10275, 49, 38305, 38300, 38420, 38189, 38424, 38313, 38309, 38195, 38197, 37175, 39116, 39450, 35895, 37925, 37933, 35904, 35899, 37941, 35912, 35908, 37970, 10396, 10388, 7341, 7326, 49218};
                    r3.W = new int[]{36150, 127, 125, 127, 125, 127, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 36150, 115, 115, 125, 115, 125, 115, 115, 125, 115, 127, 127, 127, 127, 36150};
                    break;
                }
                case 2879: {
                    r3.R = "Blood synthesis pool";
                    r3.ay = new String[]{"Look-into", null, null, null, null};
                    r3.X = 130;
                    r3.S = 130;
                    r3.am = 130;
                    r3.U = 2;
                    r3.af = 2;
                    break;
                }
                case 9666: {
                    r3.R = "Summer oasis";
                    r3.an = new int[]{39691};
                    r3.ay = new String[]{"Teleport", null, null, null, null};
                    r3.X = 175;
                    r3.S = 175;
                    r3.am = 130;
                    r3.U = 3;
                    r3.af = 3;
                    break;
                }
                case 12356: {
                    r3.R = "Oasis 2";
                    r3.an = new int[]{39691};
                    r3.ay = new String[]{null, null, null, null, null};
                    r3.X = 175;
                    r3.S = 175;
                    r3.am = 130;
                    r3.U = 3;
                    r3.af = 3;
                    break;
                }
                case 29227: 
                case 29362: 
                case 29422: {
                    if (n2 == 29362) {
                        r3.af = 2;
                        r3.U = 2;
                    }
                    r3.ay = new String[]{"Teleport", null, null, null, "Remove"};
                    break;
                }
                case 29237: 
                case 29238: 
                case 29239: 
                case 29240: 
                case 29241: {
                    if (n2 == 29238) {
                        r3.R = "Blood pool";
                    } else if (n2 == 29239) {
                        r3.R = "Dragon pool";
                    } else if (n2 == 29240) {
                        r3.R = "Blood pool";
                    } else if (n2 == 29241) {
                        r3.R = "Enchanted pool";
                    }
                    r3.ay = new String[]{"Drink", null, null, null, "Remove"};
                    r3.au = -1;
                    break;
                }
                case 29254: 
                case 29255: 
                case 29256: 
                case 29257: 
                case 29258: 
                case 29259: 
                case 29260: 
                case 29261: 
                case 29276: 
                case 29277: {
                    if (r3.ax != null) {
                        int[] nArray2 = r3.ax;
                        nArray = r3.W;
                        r3.ax = new int[nArray2.length + 1];
                        r3.W = new int[nArray.length + 1];
                        for (n3 = 0; n3 < nArray2.length; ++n3) {
                            r3.ax[n3] = nArray2[n3];
                            r3.W[n3] = nArray[n3];
                        }
                        r3.ax[r3.ax.length - 1] = 0;
                        r3.W[r3.W.length - 1] = 1;
                        break;
                    }
                    r3.ax = new int[]{0};
                    r3.W = new int[]{1};
                    break;
                }
                case 2942: {
                    r3.ay = new String[]{"Drink-from", null, null, null, null};
                    break;
                }
                case 5857: {
                    r3.R = "Cave exit";
                    break;
                }
                case 2805: {
                    r3.R = "Revenant cave entrance";
                    break;
                }
                case 6493: {
                    r3.ay = new String[]{"Teleport", null, null, null, null};
                    break;
                }
                case 6492: {
                    r3.R = "Blood totem";
                    r3.ay = new String[]{"Give-offerings", null, null, null, null};
                    r3.an[0] = rs.d.r.a(6493, 0);
                    r3.ax = new int[]{61, 7481, 8501, 8732, 8493, 8613, 7485};
                    r3.W = new int[]{945, 10, 5, 5, 10, 920, 920};
                    break;
                }
                case 16474: {
                    r3.R = "Kharazi storage chest";
                    r3.ay = new String[]{"Look-in", null, null, null, null};
                    break;
                }
                case 2816: {
                    r3.R = "Dark altar";
                    r3.ay = new String[]{"Craft-rune", null, null, null, null};
                    r3.ax = new int[]{11813, 11937};
                    r3.W = new int[]{15, 25};
                    r3.aq = "Dark altar offers runecrafting and prayer regeneration.".getBytes();
                    break;
                }
                case 8988: {
                    r3.R = "Rogue's chest";
                    break;
                }
                case 26193: {
                    r3.R = "Event reward chest";
                    r3.ay = new String[]{"Reward exchange", null, null, null, null};
                    break;
                }
                case 10653: {
                    r3.R = "Christmas tree";
                    r3.X = 65;
                    r3.S = 65;
                    r3.am = 65;
                    r3.U = 3;
                    r3.af = 4;
                    break;
                }
                case 1303: 
                case 1304: 
                case 1305: {
                    r3.ay = new String[]{"Chop down", null, null, null, null};
                    break;
                }
                case 7393: {
                    r3.R = "Upgrade tent";
                    r3.ay = new String[]{"Open", null, null, null, null};
                    break;
                }
                case 13291: {
                    r3.ay = new String[]{"Enchant", null, null, null, null};
                    break;
                }
                case 4469: 
                case 4470: {
                    r3.ar = false;
                    r3.ab = false;
                    r3.aj = false;
                    r3.ay = new String[]{null, null, null, null, null};
                    break;
                }
                case 2732: {
                    r3.au = 475;
                    break;
                }
                case 2361: {
                    r3.R = "Larran's chest <img=17>";
                    break;
                }
                case 12110: {
                    r3.R = "Trading post";
                    r3.ay = new String[]{"View-marketplace", null, null, null, null};
                    r3.an = new int[]{27610};
                    break;
                }
                case 11501: {
                    r3.an = new int[]{28859};
                    r3.R = "Jungle essence rock";
                    r3.ay = new String[]{"Mine", null, null, null, null};
                    r3.af = 3;
                    r3.U = 3;
                    break;
                }
                case 9538: {
                    r3.R = "Row boat";
                    r3.ay = new String[]{"Ferry", null, null, null, null};
                    break;
                }
                case 3192: {
                    r3.ax = new int[]{6932, 6689, 7626, 8662, 7490};
                    r3.W = new int[]{7, 7, 932, 7, 932};
                    break;
                }
                case 11698: {
                    r3.an = rs.d.r.c((int)5072).an;
                    r3.aI = rs.d.r.c((int)5072).aI;
                    r3.ax = new int[]{6697, 7580, 6817, 6693, 929, 5056, 9152, 0};
                    r3.W = new int[]{10266, 10270, 10279, 10275, 10283, 10279, 10279, 0};
                    break;
                }
                case 153: {
                    r3.ay = new String[]{null, null, null, null, null};
                    r3.X = 75;
                    r3.S = 75;
                    r3.am = 75;
                    r3.U = 1;
                    r3.af = 1;
                    break;
                }
                case 2654: {
                    r3.R = "Blood fountain";
                    r3.U = 3;
                    r3.af = 3;
                    r3.ay = new String[]{"Make-offerings", null, null, null, null};
                    r3.ax = new int[]{10266, 10270, 10279, 10275, 10283, 33325, 33222};
                    r3.W = new int[]{10266, 10270, 10279, 10275, 10283, 926, 926};
                    break;
                }
                case 579: {
                    r3.ay = new String[]{"Open", null, null, null, null};
                    r3.R = "Mystic gem statue";
                    break;
                }
                case 2474: {
                    r3.R = "Duel arena portal";
                    break;
                }
                case 2473: {
                    r3.R = "Donator zone portal";
                    break;
                }
                case 2475: {
                    r3.R = "Gamble zone portal";
                    break;
                }
                case 4874: {
                    r3.R = "250k Stall";
                    break;
                }
                case 4875: {
                    r3.R = "350k Stall";
                    break;
                }
                case 4876: {
                    r3.R = "450k Stall";
                    break;
                }
                case 4877: {
                    r3.R = "650k Stall";
                    break;
                }
                case 4878: {
                    r3.R = "850k Stall";
                    break;
                }
                case 6552: {
                    r3.ay = new String[]{"Switch-modern <img=59>", "Switch-ancients <img=55>", "Switch-lunar <img=56>", null, null};
                    r3.R = "Spell-book altar";
                    break;
                }
                case 5816: {
                    r3.ay = new String[]{"<img=57> Spawn", "<img=57> Toggle-hide", null, null, null};
                    r3.R = "@gre@Monster spawn orb";
                    r3.aj = false;
                    break;
                }
                case 5817: {
                    r3.ay = new String[]{"Heal", null, null, null, null};
                    r3.R = "@gre@Restore orb";
                    break;
                }
                case 6856: {
                    r3.R = "Safespot barricade";
                    break;
                }
                case 3193: {
                    r3.an = new int[]{1249};
                    break;
                }
                case 6282: {
                    r3.R = "Skotizo portal";
                    r3.ax = new int[]{784, 41, 49, 916, 910};
                    r3.W = new int[]{51096, 6, 10, 374770, 7};
                    break;
                }
                case 31560: {
                    r3.an = new int[]{44131};
                    break;
                }
                case 31559: {
                    r3.an = new int[]{44127, 44124, 44133};
                    break;
                }
                case 31561: {
                    r3.an = new int[]{44135};
                    break;
                }
                case 31562: {
                    r3.an = new int[]{44129};
                    break;
                }
                case 31567: {
                    r3.an = new int[]{44130};
                    break;
                }
                case 31563: {
                    r3.an = new int[]{44128};
                    break;
                }
                case 31564: {
                    r3.an = new int[]{44137};
                    break;
                }
                case 31568: {
                    r3.an = new int[]{44125};
                    break;
                }
                case 31566: {
                    r3.an = new int[]{44139};
                    break;
                }
                case 31565: {
                    r3.an = new int[]{44138};
                    break;
                }
                case 27787: {
                    r3.an = new int[]{40742};
                    break;
                }
                case 33028: {
                    r3.R = "Barrier";
                    r3.ay = new String[]{"Pass-through", null, null, null, null};
                    r3.ar = true;
                    break;
                }
                case 154: {
                    if (E != rs.d.r$a.b) break;
                    r3.an = new int[]{789, 790};
                    break;
                }
                case 13616: 
                case 13623: 
                case 13630: {
                    r3.R = "Chaos elemental portal";
                    r3.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                    r3.W = new int[]{374770, 374770, 374770, 374770, 374770};
                    break;
                }
                case 13620: 
                case 13627: 
                case 13634: {
                    r3.R = "Demonic gorilla portal";
                    break;
                }
                case 27266: {
                    r3.ay = new String[]{null, null, null, null, null};
                    break;
                }
                case 13617: 
                case 13624: 
                case 13631: {
                    r3.R = "Barrelchest portal";
                    r3.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                    r3.W = new int[]{7322, 7326, 7320, 7322, 7326};
                    break;
                }
                case 13619: 
                case 13626: 
                case 13633: {
                    r3.R = "Wildywyrm portal";
                    r3.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                    r3.W = new int[]{935, 939, 815, 819, 695};
                    break;
                }
                case 13621: 
                case 13628: 
                case 13635: {
                    r3.R = "Vet'ion portal";
                    r3.ax = new int[]{50072, 49948, 49953, 49829, 49705};
                    r3.W = new int[]{51136, 51139, 51134, 51136, 51139};
                    break;
                }
                case 13618: 
                case 13625: 
                case 13632: {
                    r3.R = "Crazy archaeologist portal";
                    break;
                }
                case 13615: 
                case 13622: 
                case 13629: {
                    r3.R = "Kraken portal";
                    break;
                }
                case 17000: {
                    r3.R = "Gilded burner";
                    r3.an = new int[]{13116, 13114};
                    r3.ay = new String[]{null, null, null, null, "Remove"};
                    r3.ax = new int[]{127, 4502, 4510, 8128, 33, 0};
                    r3.W = new int[]{127, 8128, 4510, 8128, 8128, 1};
                    r3.au = 3573;
                    break;
                }
                case 16999: {
                    r3.R = "Gilded repair bench";
                    r3.an = new int[]{12187};
                    r3.ay = new String[]{null, null, null, null, "Remove"};
                    r3.ax = new int[]{127, 4502, 4510, 8128, 33, 0};
                    r3.W = new int[]{127, 8128, 4510, 8128, 8128, 1};
                    r3.au = 3573;
                    r3.U = 2;
                    break;
                }
                case 16998: {
                    r3.an = new int[]{24520, 24521};
                    r3.au = 6023;
                    r3.X = 115;
                    r3.S = 115;
                    r3.am = 125;
                    r3.R = "Blood fountain";
                    r3.U = 2;
                    r3.af = 2;
                    r3.ay = new String[]{"Make-offerings", null, null, null, "Remove"};
                    r3.ax = new int[]{10266, 10270, 10279, 10275, 10283, 33325, 33222};
                    r3.W = new int[]{10266, 10270, 10279, 10275, 10283, 926, 926};
                    break;
                }
                case 3918: {
                    r3.au = -1;
                    break;
                }
                case 13655: {
                    r3.ay = new String[]{"Teleport", null, null, null, "Remove"};
                    break;
                }
                case 17003: {
                    r3.ay = new String[]{"Teleport", null, null, null, "Remove"};
                    r3.R = "Dark orrery";
                    r3.an = new int[]{12970};
                    r3.au = 3579;
                    r3.U = 3;
                    r3.af = 3;
                    r3.ax = new int[]{6682, 6443, 6798, 107, 70, 8128, 38119, 8299, 1950, 65535};
                    r3.W = new int[]{10, 15, 10, 5, 20, 926, 10, 15, 17, 65535};
                    break;
                }
                case 9075: {
                    r3.aj = false;
                    r3.ar = false;
                    r3.R = "Jack-o-lantern";
                    int n4 = -25;
                    r3.an = new int[]{19201};
                    r3.ax = new int[]{0, 6963, 6959, 7083, 7073, 2700, 7081, 21539, 10266};
                    r3.W = new int[]{1, 6963 + n4, 6959 + n4, 7083 + n4, 7073 + n4, 2700 + n4, 7081 + n4, 350755, 350755};
                    r3.X = 300;
                    r3.S = 275;
                    r3.am = 275;
                    break;
                }
                case 9046: {
                    r3.aj = false;
                    r3.ar = false;
                    r3.R = "Jack-o-lantern";
                    r3.an = new int[]{19201};
                    r3.ax = new int[]{0, 6963, 6959, 7083, 7073, 2700, 7081, 21539, 10266};
                    r3.W = new int[]{1, 6963, 6959, 7083, 7048, 2675, 7056, 350755, 350755};
                    r3.X = 600;
                    r3.S = 600;
                    r3.am = 600;
                    r3.U = 2;
                    r3.af = 2;
                    break;
                }
                case 5949: {
                    r3.X = 175;
                    r3.S = 175;
                    r3.am = 175;
                    break;
                }
                case 18856: {
                    r3.X = 150;
                    r3.S = 150;
                    r3.am = 175;
                    break;
                }
                case 9076: {
                    r3.aj = false;
                    r3.ar = false;
                    r3.R = "Beach ball";
                    r3.an = new int[]{2755};
                    int n5 = -25;
                    r3.X = 295;
                    r3.S = 295;
                    r3.am = 295;
                    break;
                }
                case 9074: {
                    r3.aj = false;
                    r3.ar = false;
                    r3.R = "Shell";
                    r3.an = new int[]{14142};
                    int n6 = -25;
                    r3.X = 95;
                    r3.S = 95;
                    r3.am = 95;
                    break;
                }
                case 1276: 
                case 1278: {
                    if (rs.f.a.r == a.b.e) {
                        r3.an = new int[1];
                        r3.an[0] = rs.d.r.a(8088, 0);
                        r3.R = "Palm tree";
                    }
                    if (rs.f.a.r != a.b.b && rs.f.a.r != a.b.c) break;
                    r3.an = new int[1];
                    r3.R = "Evergreen";
                    r3.an[0] = rs.d.r.a(1316, 0);
                    r3.X = 128;
                    r3.S = 128;
                    r3.am = 128;
                    break;
                }
                case 1315: 
                case 1316: {
                    if (rs.f.a.r == a.b.e) {
                        r3.an = new int[1];
                        r3.an[0] = rs.d.r.a(8088, 0);
                        r3.R = "Big palm tree";
                        r3.X = 155;
                        r3.S = 155;
                        r3.am = 155;
                        break;
                    }
                    r3.an = new int[]{1688};
                    break;
                }
                case 445: 
                case 1185: 
                case 1392: {
                    if (rs.f.a.r == a.b.e) {
                        r3.an = new int[1];
                        r3.R = "Shell";
                        r3.an[0] = 14142;
                        r3.X = 129;
                        r3.S = 129;
                        r3.am = 129;
                        break;
                    }
                    r3.X = 128;
                    r3.S = 128;
                    r3.am = 128;
                    break;
                }
                case 1393: {
                    if (rs.f.a.r == a.b.e) {
                        r3.an = new int[1];
                        r3.R = "Oyster";
                        r3.an[0] = 2377;
                        r3.X = 175;
                        r3.S = 175;
                        r3.am = 175;
                        break;
                    }
                    r3.X = 128;
                    r3.S = 128;
                    r3.am = 128;
                    break;
                }
                case 446: {
                    if (rs.f.a.r == a.b.e) {
                        r3.an = new int[1];
                        r3.R = "Beach ball";
                        r3.an[0] = 2755;
                        r3.X = 222;
                        r3.S = 222;
                        r3.am = 222;
                        break;
                    }
                    r3.X = 128;
                    r3.S = 128;
                    r3.am = 128;
                    break;
                }
                case 9665: {
                    r3.an = new int[1];
                    r3.R = "Beach shovel";
                    r3.an[0] = rs.d.r.a(9662, 0);
                    r3.X = 222;
                    r3.S = 222;
                    r3.am = 222;
                    r3.U = 2;
                    r3.af = 2;
                    r3.aj = false;
                    r3.ar = false;
                    break;
                }
                case 444: {
                    r3.X = 128;
                    r3.S = 128;
                    r3.am = 128;
                    break;
                }
                case 1189: {
                    if (rs.f.a.r == a.b.e) {
                        r3.an = new int[1];
                        r3.R = "Seaweed";
                        r3.an[0] = 2370;
                        r3.X = 128;
                        r3.S = 128;
                        r3.am = 128;
                        break;
                    }
                    if (rs.f.a.r == a.b.b || rs.f.a.r == a.b.c) {
                        r3.an = new int[1];
                        r3.R = "Snowdrops";
                        r3.an[0] = rs.d.r.a(9231, 0);
                        r3.X = 90;
                        r3.S = 90;
                        r3.am = 90;
                        break;
                    }
                    r3.X = 128;
                    r3.S = 128;
                    r3.am = 128;
                    break;
                }
                case 1257: {
                    if (rs.f.a.r == a.b.e) {
                        r3.an = new int[1];
                        r3.R = "Gravel";
                        r3.an[0] = rs.d.r.a(325, 0);
                        r3.X = 64;
                        r3.S = 64;
                        r3.am = 64;
                        break;
                    }
                    r3.X = 128;
                    r3.S = 128;
                    r3.am = 128;
                    break;
                }
                case 1281: {
                    if (rs.f.a.r != a.b.e) break;
                    r3.an = new int[1];
                    r3.R = "Oak tree";
                    r3.an[0] = rs.d.r.a(13413, 0);
                    r3.X = 122;
                    r3.S = 122;
                    r3.am = 122;
                    r3.ax = new int[]{4762, 5908};
                    r3.W = new int[]{4772, 5908};
                    break;
                }
                case 1244: 
                case 1245: 
                case 1248: {
                    if (rs.f.a.r == a.b.e) {
                        r3.an = new int[1];
                        r3.R = "Seaweed";
                        r3.an[0] = 2370;
                        r3.X = 100;
                        r3.S = 100;
                        r3.am = 100;
                        break;
                    }
                    r3.X = 128;
                    r3.S = 128;
                    r3.am = 128;
                    break;
                }
                case 23735: 
                case 23780: 
                case 23818: {
                    if (rs.f.a.r != a.b.e) break;
                    r3.an[0] = rs.d.r.a(1616, 0);
                    r3.an[1] = rs.d.r.a(1616, 3);
                    r3.an[3] = rs.d.r.a(1616, 4);
                    r3.au = -1;
                    break;
                }
                case 1620: 
                case 1631: 
                case 1902: 
                case 1904: 
                case 1911: 
                case 9153: 
                case 9154: 
                case 9473: 
                case 26883: {
                    if (rs.f.a.r != a.b.e) break;
                    r3.an[0] = rs.d.r.a(1616, 0);
                    r3.an[2] = rs.d.r.a(1616, 0);
                    r3.an[4] = rs.d.r.a(1616, 4);
                    r3.an[1] = rs.d.r.a(1616, 3);
                    r3.an[3] = rs.d.r.a(1616, 3);
                    break;
                }
                case 9474: 
                case 23826: {
                    if (rs.f.a.r != a.b.e) break;
                    r3.an[0] = rs.d.r.a(1616, 0);
                    break;
                }
                case 23738: {
                    if (rs.f.a.r != a.b.e) break;
                    r3.an[0] = rs.d.r.a(1616, 0);
                    r3.an[2] = rs.d.r.a(1616, 4);
                    break;
                }
                case 23742: {
                    if (rs.f.a.r != a.b.e) break;
                    r3.an[0] = rs.d.r.a(1616, 0);
                    r3.an[2] = rs.d.r.a(1616, 0);
                    break;
                }
                case 23740: 
                case 23825: {
                    if (rs.f.a.r != a.b.e) break;
                    r3.an[1] = rs.d.r.a(1616, 0);
                    break;
                }
                case 1854: {
                    if (rs.f.a.r != a.b.e) break;
                    r3.an[1] = rs.d.r.a(1616, 4);
                    break;
                }
                case 1853: 
                case 23743: 
                case 23744: 
                case 23746: 
                case 23747: 
                case 23829: {
                    if (rs.f.a.r != a.b.e) break;
                    r3.an[0] = rs.d.r.a(1855, 0);
                    break;
                }
                case 26887: 
                case 26891: 
                case 26892: {
                    if (rs.f.a.r != a.b.e) break;
                    r3.an[0] = rs.d.r.a(1855, 0);
                    break;
                }
                case 13830: {
                    if (rs.f.a.af.equalsIgnoreCase("RIMMINGTON")) {
                        r3.an = new int[]{13264};
                    }
                    if (rs.f.a.af.equalsIgnoreCase("POLLNIVERNEACH")) {
                        r3.an = new int[]{13229};
                    }
                    if (rs.f.a.af.equalsIgnoreCase("TAVERLY")) {
                        r3.an = new int[]{12357};
                    }
                    if (rs.f.a.af.equalsIgnoreCase("RELLEKA")) {
                        r3.an = new int[]{13242};
                    }
                    if (rs.f.a.af.equalsIgnoreCase("FALADOR")) {
                        r3.an = new int[]{13294};
                    }
                    if (rs.f.a.af.equalsIgnoreCase("ARDOUGNE")) {
                        r3.an = new int[]{12664};
                    }
                    r3.Q = (byte)20;
                    break;
                }
                case 29879: {
                    r3.au = -1;
                    break;
                }
                case 29889: {
                    r3.ay = new String[5];
                }
            }
        }
        if (rs.d.v.a(Client.cT) && rs.s.c.c.e) {
            r3.R = r3.R + " @whi@[" + n2 + "]";
        }
        if (n2 >= 29000 && n2 <= 30000 || n2 == 31560 || n2 == 31559 || n2 == 31561 || n2 == 27787 || n2 == 31567 || n2 == 31566 || n2 == 31565 || n2 == 31562 || n2 == 31563) {
            if (r3.ax != null) {
                int[] nArray3 = r3.ax;
                nArray = r3.W;
                r3.ax = new int[nArray3.length + 1];
                r3.W = new int[nArray.length + 1];
                for (n3 = 0; n3 < nArray3.length; ++n3) {
                    r3.ax[n3] = nArray3[n3];
                    r3.W[n3] = nArray[n3];
                }
                r3.ax[r3.ax.length - 1] = 0;
                r3.W[r3.W.length - 1] = 1;
            } else {
                r3.ax = new int[]{0};
                r3.W = new int[]{1};
            }
        }
        if (rs.f.a.d.booleanValue()) {
            // empty if block
        }
        return r3;
    }

    public void a(e e2) {
        int n2;
        int n3 = -1;
        while ((n2 = e2.y()) != 0) {
            int n4;
            int n5;
            if (n2 == 1) {
                n5 = e2.y();
                if (n5 <= 0) continue;
                if (this.an == null || Z) {
                    this.aI = new int[n5];
                    this.an = new int[n5];
                    for (int i2 = 0; i2 < n5; ++i2) {
                        this.an[i2] = e2.A();
                        this.aI[i2] = e2.y();
                    }
                    continue;
                }
                e2.h += n5 * 3;
                continue;
            }
            if (n2 == 2) {
                this.R = e2.F();
                continue;
            }
            if (n2 == 3) {
                this.aq = e2.H();
                continue;
            }
            if (n2 == 5) {
                n5 = e2.y();
                if (n5 <= 0) continue;
                if (this.an == null || Z) {
                    this.aI = null;
                    this.an = new int[n5];
                    for (int i3 = 0; i3 < n5; ++i3) {
                        this.an[i3] = e2.A();
                    }
                    continue;
                }
                e2.h += n5 * 2;
                continue;
            }
            if (n2 == 14) {
                this.U = e2.y();
                continue;
            }
            if (n2 == 15) {
                this.af = e2.y();
                continue;
            }
            if (n2 == 17) {
                this.aj = false;
                this.ab = false;
                continue;
            }
            if (n2 == 18) {
                this.ab = false;
                continue;
            }
            if (n2 == 19) {
                this.ar = e2.y() == 1;
                continue;
            }
            if (n2 == 21) {
                this.ag = true;
                continue;
            }
            if (n2 == 22) {
                this.al = true;
                continue;
            }
            if (n2 == 23) {
                this.ah = true;
                continue;
            }
            if (n2 == 24) {
                this.au = e2.A();
                if (this.au != 65535) continue;
                this.au = -1;
                continue;
            }
            if (n2 == 27) continue;
            if (n2 == 28) {
                this.ap = e2.y();
                continue;
            }
            if (n2 == 29) {
                this.Q = e2.z();
                continue;
            }
            if (n2 == 39) {
                this.T = e2.z();
                continue;
            }
            if (n2 >= 30 && n2 < 39) {
                if (this.ay == null) {
                    this.ay = new String[5];
                }
                this.ay[n2 - 30] = e2.F();
                if (!this.ay[n2 - 30].equalsIgnoreCase("hidden")) continue;
                this.ay[n2 - 30] = null;
                continue;
            }
            if (n2 == 40) {
                n5 = e2.y();
                this.ax = new int[n5];
                this.W = new int[n5];
                for (int i4 = 0; i4 < n5; ++i4) {
                    this.ax[i4] = E == rs.d.r$a.d ? e2.B() : e2.A();
                    this.W[i4] = E == rs.d.r$a.d ? e2.B() : e2.A();
                }
                continue;
            }
            if (n2 == 41) {
                n5 = e2.y();
                int[] nArray = new int[n5];
                int[] nArray2 = new int[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    nArray[n4] = e2.A();
                    nArray2[n4] = e2.A();
                }
                continue;
            }
            if (n2 == 60) {
                this.V = e2.A();
                continue;
            }
            if (n2 == 61) {
                n5 = e2.A();
                continue;
            }
            if (n2 == 62) {
                this.aD = true;
                continue;
            }
            if (n2 == 64) {
                this.as = false;
                continue;
            }
            if (n2 == 65) {
                this.X = e2.A();
                continue;
            }
            if (n2 == 66) {
                this.am = e2.A();
                continue;
            }
            if (n2 == 67) {
                this.S = e2.A();
                continue;
            }
            if (n2 == 68) {
                this.ac = e2.A();
                continue;
            }
            if (n2 == 69) {
                this.ak = e2.y();
                continue;
            }
            if (n2 == 70) {
                this.aA = e2.B();
                continue;
            }
            if (n2 == 71) {
                this.aC = e2.B();
                continue;
            }
            if (n2 == 72) {
                this.aK = e2.B();
                continue;
            }
            if (n2 == 73) {
                this.P = true;
                continue;
            }
            if (n2 == 74) {
                this.aG = true;
                continue;
            }
            if (n2 == 75) {
                this.ae = e2.y();
                continue;
            }
            if (n2 == 77 || n2 == 92) {
                this.ao = e2.A();
                if (this.ao == 65535) {
                    this.ao = -1;
                }
                this.Y = e2.A();
                if (this.Y == 65535) {
                    this.Y = -1;
                }
                n5 = -1;
                if (n2 == 92 && (n5 = e2.A()) == 65535) {
                    n5 = -1;
                }
                int n6 = e2.y();
                this.ad = new int[n6 + 2];
                for (int i5 = 0; i5 <= n6; ++i5) {
                    this.ad[i5] = e2.A();
                    if (this.ad[i5] != 65535) continue;
                    this.ad[i5] = -1;
                }
                this.ad[n6 + 1] = n5;
                continue;
            }
            if (n2 == 78) {
                e2.A();
                e2.y();
                continue;
            }
            if (n2 == 79) {
                e2.A();
                e2.A();
                e2.y();
                n5 = e2.y();
                for (int i6 = 0; i6 < n5; ++i6) {
                    e2.A();
                }
                continue;
            }
            if (n2 == 81) {
                e2.y();
                this.ag = true;
                continue;
            }
            if (n2 == 82) {
                n5 = e2.A();
                continue;
            }
            if (n2 == 89) {
                this.at = false;
                continue;
            }
            if (n2 != 249) continue;
            n5 = e2.y();
            HashMap<Integer, Object> hashMap = new HashMap<Integer, Object>(n5);
            for (int i7 = 0; i7 < n5; ++i7) {
                n4 = e2.y() == 1 ? 1 : 0;
                int n7 = e2.g();
                Object object = n4 != 0 ? e2.F() : Integer.valueOf(e2.p());
                hashMap.put(n7, object);
            }
        }
        if (n3 == -1 && this.R != null && !this.R.equals("null")) {
            boolean bl = this.ar = this.an != null && (this.aI == null || this.aI[0] == 10);
            if (this.ay != null) {
                this.ar = true;
            }
        }
        if (this.aG) {
            this.aj = false;
            this.ab = false;
        }
        if (this.ae == -1) {
            this.ae = this.aj ? 1 : 0;
        }
    }

    private void b(e e2) {
        int n2;
        int n3 = -1;
        while ((n2 = e2.y()) != 0) {
            int n4;
            int n5;
            if (n2 == 1) {
                n5 = e2.y();
                if (n5 <= 0) continue;
                if (this.an == null || Z) {
                    this.aI = new int[n5];
                    this.an = new int[n5];
                    for (n4 = 0; n4 < n5; ++n4) {
                        this.an[n4] = e2.A();
                        this.aI[n4] = e2.y();
                    }
                    continue;
                }
                e2.h += n5 * 3;
                continue;
            }
            if (n2 == 2) {
                this.R = e2.F();
                continue;
            }
            if (n2 == 3) {
                this.aq = e2.H();
                continue;
            }
            if (n2 == 5) {
                n5 = e2.y();
                if (n5 <= 0) continue;
                if (this.an == null || Z) {
                    this.aI = null;
                    this.an = new int[n5];
                    for (n4 = 0; n4 < n5; ++n4) {
                        this.an[n4] = e2.A();
                    }
                    continue;
                }
                e2.h += n5 * 2;
                continue;
            }
            if (n2 == 14) {
                this.U = e2.y();
                continue;
            }
            if (n2 == 15) {
                this.af = e2.y();
                continue;
            }
            if (n2 == 17) {
                this.aj = false;
                continue;
            }
            if (n2 == 18) {
                this.ab = false;
                continue;
            }
            if (n2 == 19) {
                n3 = e2.y();
                if (n3 != 1) continue;
                this.ar = true;
                continue;
            }
            if (n2 == 21) {
                this.ag = true;
                continue;
            }
            if (n2 == 22) {
                this.al = true;
                continue;
            }
            if (n2 == 23) {
                this.ah = true;
                continue;
            }
            if (n2 == 24) {
                this.au = e2.A();
                if (this.au != 65535) continue;
                this.au = -1;
                continue;
            }
            if (n2 == 28) {
                this.ap = e2.y();
                continue;
            }
            if (n2 == 29) {
                this.Q = e2.z();
                continue;
            }
            if (n2 == 39) {
                this.T = e2.z();
                continue;
            }
            if (n2 >= 30 && n2 < 39) {
                if (this.ay == null) {
                    this.ay = new String[5];
                }
                this.ay[n2 - 30] = e2.F();
                if (!this.ay[n2 - 30].equalsIgnoreCase("hidden")) continue;
                this.ay[n2 - 30] = null;
                continue;
            }
            if (n2 == 40) {
                n5 = e2.y();
                this.ax = new int[n5];
                this.W = new int[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    this.ax[n4] = e2.A();
                    this.W[n4] = e2.A();
                }
                continue;
            }
            if (n2 == 60) {
                this.V = e2.A();
                continue;
            }
            if (n2 == 62) {
                this.aD = true;
                continue;
            }
            if (n2 == 64) {
                this.as = false;
                continue;
            }
            if (n2 == 65) {
                this.X = e2.A();
                continue;
            }
            if (n2 == 66) {
                this.am = e2.A();
                continue;
            }
            if (n2 == 67) {
                this.S = e2.A();
                continue;
            }
            if (n2 == 68) {
                this.ac = e2.A();
                continue;
            }
            if (n2 == 69) {
                this.ak = e2.y();
                continue;
            }
            if (n2 == 70) {
                this.aA = e2.B();
                continue;
            }
            if (n2 == 71) {
                this.aC = e2.B();
                continue;
            }
            if (n2 == 72) {
                this.aK = e2.B();
                continue;
            }
            if (n2 == 73) {
                this.P = true;
                continue;
            }
            if (n2 == 74) {
                this.aG = true;
                continue;
            }
            if (n2 == 75) {
                this.ae = e2.y();
                continue;
            }
            if (n2 != 77) continue;
            this.ao = e2.A();
            if (this.ao == 65535) {
                this.ao = -1;
            }
            this.Y = e2.A();
            if (this.Y == 65535) {
                this.Y = -1;
            }
            n5 = e2.y();
            this.ad = new int[n5 + 1];
            for (n4 = 0; n4 <= n5; ++n4) {
                this.ad[n4] = e2.A();
                if (this.ad[n4] != 65535) continue;
                this.ad[n4] = -1;
            }
        }
        if (n3 == -1) {
            boolean bl = this.ar = this.an != null && (this.aI == null || this.aI[0] == 10);
            if (this.ay != null) {
                this.ar = true;
            }
        }
        if (this.aG) {
            this.aj = false;
            this.ab = false;
        }
        if (this.ae == -1) {
            this.ae = this.aj ? 1 : 0;
        }
    }

    private void c(e e2) {
        int n2;
        int n3 = -1;
        while ((n2 = e2.y()) != 0) {
            int n4;
            int n5;
            if (n2 == 1) {
                n5 = e2.y();
                if (n5 <= 0) continue;
                if (this.an == null || Z) {
                    this.aI = new int[n5];
                    this.an = new int[n5];
                    for (n4 = 0; n4 < n5; ++n4) {
                        this.an[n4] = e2.A();
                        this.aI[n4] = e2.y();
                    }
                    continue;
                }
                e2.h += n5 * 3;
                continue;
            }
            if (n2 == 2) {
                this.R = e2.w();
                continue;
            }
            if (n2 == 3) {
                this.aq = e2.H();
                continue;
            }
            if (n2 == 5) {
                n5 = e2.y();
                if (n5 <= 0) continue;
                if (this.an == null || Z) {
                    this.aI = null;
                    this.an = new int[n5];
                    for (n4 = 0; n4 < n5; ++n4) {
                        this.an[n4] = e2.A();
                    }
                    continue;
                }
                e2.h += n5 * 2;
                continue;
            }
            if (n2 == 14) {
                this.U = e2.y();
                continue;
            }
            if (n2 == 15) {
                this.af = e2.y();
                continue;
            }
            if (n2 == 17) {
                this.aj = false;
                continue;
            }
            if (n2 == 18) {
                this.ab = false;
                continue;
            }
            if (n2 == 19) {
                this.ar = e2.y() == 1;
                continue;
            }
            if (n2 == 21) {
                this.ag = true;
                continue;
            }
            if (n2 == 22) {
                this.al = true;
                continue;
            }
            if (n2 == 23) {
                this.ah = true;
                continue;
            }
            if (n2 == 24) {
                this.au = e2.A();
                if (this.au != 65535) continue;
                this.au = -1;
                continue;
            }
            if (n2 == 28) {
                this.ap = e2.y();
                continue;
            }
            if (n2 == 29) {
                this.Q = e2.z();
                continue;
            }
            if (n2 == 39) {
                this.T = e2.z();
                continue;
            }
            if (n2 >= 30 && n2 < 39) {
                if (this.ay == null) {
                    this.ay = new String[5];
                }
                this.ay[n2 - 30] = e2.w();
                if (!this.ay[n2 - 30].equalsIgnoreCase("hidden")) continue;
                this.ay[n2 - 30] = null;
                continue;
            }
            if (n2 == 40) {
                n5 = e2.y();
                this.ax = new int[n5];
                this.W = new int[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    this.ax[n4] = e2.A();
                    this.W[n4] = e2.A();
                }
                continue;
            }
            if (n2 == 60) {
                this.V = e2.A();
                continue;
            }
            if (n2 == 62) {
                this.aD = true;
                continue;
            }
            if (n2 == 64) {
                this.as = false;
                continue;
            }
            if (n2 == 65) {
                this.X = e2.A();
                continue;
            }
            if (n2 == 66) {
                this.am = e2.A();
                continue;
            }
            if (n2 == 67) {
                this.S = e2.A();
                continue;
            }
            if (n2 == 68) {
                this.ac = e2.A();
                continue;
            }
            if (n2 == 69) {
                this.ak = e2.y();
                continue;
            }
            if (n2 == 70) {
                this.aA = e2.B();
                continue;
            }
            if (n2 == 71) {
                this.aC = e2.B();
                continue;
            }
            if (n2 == 72) {
                this.aK = e2.B();
                continue;
            }
            if (n2 == 73) {
                this.P = true;
                continue;
            }
            if (n2 == 74) {
                this.aG = true;
                continue;
            }
            if (n2 == 75) {
                this.ae = e2.y();
                continue;
            }
            if (n2 != 77) continue;
            this.ao = e2.A();
            if (this.ao == 65535) {
                this.ao = -1;
            }
            this.Y = e2.A();
            if (this.Y == 65535) {
                this.Y = -1;
            }
            n5 = e2.y();
            this.ad = new int[n5 + 1];
            for (n4 = 0; n4 <= n5; ++n4) {
                this.ad[n4] = e2.A();
                if (this.ad[n4] != 65535) continue;
                this.ad[n4] = -1;
            }
        }
        if (n3 == -1 && this.R != "null" && this.R != null) {
            boolean bl = this.ar = this.an != null && (this.aI == null || this.aI[0] == 10);
            if (this.ay != null) {
                this.ar = true;
            }
        }
        if (this.aG) {
            this.aj = false;
            this.ab = false;
        }
        if (this.ae == -1) {
            this.ae = this.aj ? 1 : 0;
        }
    }

    public void a() {
        this.an = null;
        this.aI = null;
        this.R = null;
        this.aq = null;
        this.ax = null;
        this.W = null;
        this.U = 1;
        this.af = 1;
        this.aj = true;
        this.ab = true;
        this.ar = false;
        this.ag = false;
        this.al = false;
        this.ah = false;
        this.au = -1;
        this.ap = 16;
        this.Q = 0;
        this.T = 0;
        this.ay = null;
        this.V = -1;
        this.ac = -1;
        this.aD = false;
        this.as = true;
        this.at = true;
        this.X = 128;
        this.am = 128;
        this.S = 128;
        this.ak = 0;
        this.aA = 0;
        this.aC = 0;
        this.aK = 0;
        this.P = false;
        this.aG = false;
        this.ae = -1;
        this.ao = -1;
        this.Y = -1;
        this.ad = null;
    }

    public void a(d d2) {
        if (this.an == null) {
            return;
        }
        for (int i2 = 0; i2 < this.an.length; ++i2) {
            try {
                rs.cache.osrs.c.a(this.e());
                d2.b(this.an[i2] & 0xFFFF, 0);
                continue;
            }
            finally {
                rs.cache.osrs.c.a(false);
            }
        }
    }

    public static void b() {
        J = null;
        K = null;
        M = null;
        N = null;
        aF = null;
        aJ = null;
        az = null;
    }

    public static void a(f f2) {
        int n2;
        int n3;
        e e2 = null;
        az = new e(Client.a(rs.v.a.f() + "loc.dat"));
        e2 = new e(Client.a(rs.v.a.f() + "loc.idx"));
        A = n3 = e2.A();
        aF = new int[n3];
        int n4 = 2;
        for (n2 = 0; n2 < n3; ++n2) {
            rs.d.r.aF[n2] = n4;
            n4 += e2.A();
        }
        aJ = new r[20];
        for (n2 = 0; n2 < 20; ++n2) {
            rs.d.r.aJ[n2] = new r();
        }
        if (z == null) {
            z = new rs.t.a.f();
            z.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d(int n2) {
        rs.cache.osrs.c.a(this.e());
        try {
            if (this.aI == null) {
                int n3;
                if (this.an == null) {
                    boolean bl = true;
                    return bl;
                }
                if (n2 != 10) {
                    boolean bl = true;
                    return bl;
                }
                int n4 = 1;
                for (n3 = 0; n3 < this.an.length; ++n3) {
                    n4 &= rs.a.h.f(this.an[n3] & 0xFFFF);
                }
                n3 = n4;
                return n3 != 0;
            }
            for (int i2 = 0; i2 < this.aI.length; ++i2) {
                if (this.aI[i2] != n2) continue;
                boolean bl = rs.a.h.f(this.an[i2] & 0xFFFF);
                return bl;
            }
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
        return true;
    }

    public static int a(int n2, int n3) {
        r r2 = rs.d.r.c(n2);
        int n4 = r2.an[n3];
        return n4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public h a(int n2, int n3, int[][] nArray, int n4, int n5, int n6, boolean bl, int n7) {
        h h2;
        rs.cache.osrs.c.a(this.e());
        try {
            h2 = this.a(n2, -1, n3, -1);
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
        if (h2 == null) {
            return null;
        }
        if (this.ag || this.al) {
            h2 = new h(this.ag, this.al, h2);
        }
        if (h2 == null) {
            return null;
        }
        if (this.ag) {
            h2.a(nArray, n4, n5, n6, bl, n7);
        }
        if (rs.k.e.a() && (h2.d() || h2.Y != null) && h2.m == null) {
            h2.f();
        }
        h2.L = null;
        return h2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public h a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        h h2;
        rs.cache.osrs.c.a(E == rs.d.r$a.d && !I || this.av == 1);
        try {
            h2 = this.a(n2, n8, n3, n9);
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
        if (h2 == null) {
            return null;
        }
        if (this.ag || this.al) {
            h2 = new h(this.ag, this.al, h2);
        }
        if (h2 == null) {
            return null;
        }
        if (this.ag) {
            int n10 = (n4 + n5 + n6 + n7) / 4;
            int n11 = 0;
            while (n11 < h2.ad) {
                int n12 = h2.ae[n11];
                int n13 = h2.ag[n11];
                int n14 = n4 + (n5 - n4) * (n12 + 64) / 128;
                int n15 = n7 + (n6 - n7) * (n12 + 64) / 128;
                int n16 = n14 + (n15 - n14) * (n13 + 64) / 128;
                int n17 = n11++;
                h2.af[n17] = h2.af[n17] + (n16 - n10);
            }
            h2.l();
        }
        if (rs.k.e.a() && (h2.d() || h2.Y != null) && h2.m == null) {
            h2.f();
        }
        h2.L = null;
        return h2;
    }

    public boolean c() {
        if (this.an == null) {
            return true;
        }
        boolean bl = true;
        rs.cache.osrs.c.a(this.e());
        try {
            for (int i2 = 0; i2 < this.an.length; ++i2) {
                bl &= rs.a.h.f(this.an[i2] & 0xFFFF);
            }
        }
        finally {
            rs.cache.osrs.c.a(false);
        }
        return bl;
    }

    public r d() {
        int n2 = -1;
        if (this.ao != -1) {
            y y2 = rs.d.y.a[this.ao];
            int n3 = y2.b;
            int n4 = y2.c;
            int n5 = y2.d;
            int n6 = Client.fQ[n5 - n4];
            n2 = rs.d.r.ai.dP[n3] >> n4 & n6;
        } else if (this.Y != -1) {
            n2 = rs.d.r.ai.dP[this.Y];
        }
        int n7 = n2 >= 0 && n2 < this.ad.length ? this.ad[n2] : this.ad[this.ad.length - 1];
        return n7 != -1 ? rs.d.r.c(this.ad[n2]) : null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public h a(int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        boolean bl;
        long l2;
        h h2 = null;
        if (this.aI == null) {
            if (n2 != 10) {
                return null;
            }
            l2 = (long)((this.aa << 6) + n4) + ((long)(n3 + 1) << 32);
            h h3 = (h)(this.e() ? N : K).a(l2);
            if (h3 != null) {
                return h3;
            }
            if (this.an == null) {
                return null;
            }
            bl = this.aD ^ n4 > 3;
            n8 = this.an.length;
            for (n7 = 0; n7 < n8; ++n7) {
                n6 = this.an[n7];
                if (bl) {
                    n6 += 65536;
                }
                if ((h2 = (h)(this.e() ? M : J).a(n6)) == null) {
                    rs.cache.osrs.c.a(this.e());
                    try {
                        h2 = rs.a.h.e(n6 & 0xFFFF);
                    }
                    finally {
                        rs.cache.osrs.c.a(false);
                    }
                    if (h2 == null) {
                        return null;
                    }
                    if (bl) {
                        h2.p();
                    }
                    rs.d.r.a(h2, this.aa, n6 & 0xFFFF);
                    h2.L = null;
                    (this.e() ? M : J).a(h2, n6);
                }
                if (n8 <= 1) continue;
                rs.d.r.aB[n7] = h2;
            }
            if (n8 > 1) {
                h2 = new h(n8, aB);
            }
        } else {
            int n9 = -1;
            for (int i2 = 0; i2 < this.aI.length; ++i2) {
                if (this.aI[i2] != n2) continue;
                n9 = i2;
                break;
            }
            if (n9 == -1) {
                return null;
            }
            l2 = (long)((this.aa << 8) + (n9 << 3) + n4) + ((long)(n3 + 1) << 32);
            h h4 = (h)(this.e() ? N : K).a(l2);
            if (h4 != null) {
                return h4;
            }
            n8 = this.an[n9];
            n7 = this.aD ^ (n4 > 3 ? 1 : 0);
            if (n7 != 0) {
                n8 += 65536;
            }
            if ((h2 = (h)(this.e() ? M : J).a(n8)) == null) {
                rs.cache.osrs.c.a(this.e());
                try {
                    h2 = rs.a.h.e(n8 & 0xFFFF);
                }
                finally {
                    rs.cache.osrs.c.a(false);
                }
                if (h2 == null) {
                    return null;
                }
                if (n7 != 0) {
                    h2.p();
                }
                h2.L = null;
                rs.d.r.a(h2, this.aa, n8 & 0xFFFF);
                (this.e() ? M : J).a(h2, n8);
            }
        }
        boolean bl2 = this.X != 128 || this.am != 128 || this.S != 128;
        bl = this.aA != 0 || this.aC != 0 || this.aK != 0;
        rs.a.a.a a2 = rs.a.h.h;
        n7 = 0;
        n6 = 0;
        if (n3 != -1 && rs.k.b(n3, n5)) {
            n6 = 1;
        }
        h h5 = new h(this.ax == null, rs.k.g(n3), n4 == 0 && n3 == -1 && !bl2 && !bl, h2, a2);
        h5.i = a2;
        h5.L = null;
        h5.z = true;
        if (n3 != -1 && (this.R != null || this.e())) {
            if (rs.d.a.a[n5].b()) {
                h5 = rs.d.a.a[n5].a(h5, n3);
            } else {
                h5.n();
                if (h5.aL == null) {
                    n6 = 0;
                }
                h5.f(n3, n5);
            }
            h5.aM = null;
            h5.aL = null;
        }
        while (n4-- > 0) {
            h5.o();
        }
        if (this.ax != null) {
            for (int i3 = 0; i3 < this.ax.length; ++i3) {
                h5.i(this.ax[i3], this.W[i3]);
            }
        }
        if (bl2) {
            h5.b(this.X, this.S, this.am);
        }
        if (bl) {
            h5.a(this.aA, this.aC, this.aK);
        }
        if (this.aa == 9075 || this.aa == 24500) {
            h5.b(84, 1000, -90, -580, -90, !this.al);
        } else {
            h5.b(64 + this.Q, 768 + this.T * 5, -50, -10, -50, !this.al);
        }
        if (this.ae == 1) {
            h5.aH = h5.g;
        }
        if (n6 == 0) {
            (this.e() ? N : K).a(h5, l2);
        }
        return h5;
    }

    private void d(e e2) {
        int n2;
        int n3 = -1;
        while ((n2 = e2.y()) != 0) {
            int n4;
            int n5;
            if (n2 == 1) {
                n5 = e2.y();
                if (n5 <= 0) continue;
                if (this.an == null || Z) {
                    this.aI = new int[n5];
                    this.an = new int[n5];
                    for (n4 = 0; n4 < n5; ++n4) {
                        this.an[n4] = e2.A();
                        this.aI[n4] = e2.y();
                    }
                    continue;
                }
                e2.h += n5 * 3;
                continue;
            }
            if (n2 == 2) {
                this.R = e2.F();
                continue;
            }
            if (n2 == 3) {
                this.aq = e2.H();
                continue;
            }
            if (n2 == 5) {
                n5 = e2.y();
                if (n5 <= 0 || this.an != null && !Z) continue;
                this.aI = null;
                this.an = new int[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    this.an[n4] = e2.A();
                }
                continue;
            }
            if (n2 == 14) {
                this.U = e2.y();
                continue;
            }
            if (n2 == 15) {
                this.af = e2.y();
                continue;
            }
            if (n2 == 17) {
                this.aj = false;
                continue;
            }
            if (n2 == 18) {
                this.ab = false;
                continue;
            }
            if (n2 == 19) {
                n3 = e2.y();
                if (n3 != 1 || this.R == null) continue;
                this.ar = true;
                continue;
            }
            if (n2 == 21) {
                this.ag = true;
                continue;
            }
            if (n2 == 22) {
                this.al = true;
                continue;
            }
            if (n2 == 23) {
                this.ah = true;
                continue;
            }
            if (n2 == 24) {
                this.au = e2.A();
                if (this.au != 65535) continue;
                this.au = -1;
                continue;
            }
            if (n2 == 28) {
                this.ap = e2.y();
                continue;
            }
            if (n2 == 29) {
                this.Q = e2.z();
                continue;
            }
            if (n2 == 39) {
                this.T = e2.z();
                continue;
            }
            if (n2 >= 30 && n2 < 39) {
                if (this.ay == null) {
                    this.ay = new String[10];
                }
                this.ay[n2 - 30] = e2.F();
                if (!this.ay[n2 - 30].equalsIgnoreCase("hidden")) continue;
                this.ay[n2 - 30] = null;
                continue;
            }
            if (n2 == 40) {
                n5 = e2.y();
                this.ax = new int[n5];
                this.W = new int[n5];
                for (n4 = 0; n4 < n5; ++n4) {
                    this.ax[n4] = e2.A();
                    this.W[n4] = e2.A();
                }
                continue;
            }
            if (n2 == 60) {
                this.V = e2.A();
                continue;
            }
            if (n2 == 62) {
                this.aD = true;
                continue;
            }
            if (n2 == 64) {
                this.as = false;
                continue;
            }
            if (n2 == 65) {
                this.X = e2.A();
                continue;
            }
            if (n2 == 66) {
                this.am = e2.A();
                continue;
            }
            if (n2 == 67) {
                this.S = e2.A();
                continue;
            }
            if (n2 == 68) {
                this.ac = e2.A();
                continue;
            }
            if (n2 == 69) {
                this.ak = e2.y();
                continue;
            }
            if (n2 == 70) {
                this.aA = e2.B();
                continue;
            }
            if (n2 == 71) {
                this.aC = e2.B();
                continue;
            }
            if (n2 == 72) {
                this.aK = e2.B();
                continue;
            }
            if (n2 == 73) {
                this.P = true;
                continue;
            }
            if (n2 == 74) {
                this.aG = true;
                continue;
            }
            if (n2 == 75) {
                this.ae = e2.y();
                continue;
            }
            if (n2 != 77) continue;
            this.ao = e2.A();
            if (this.ao == 65535) {
                this.ao = -1;
            }
            this.Y = e2.A();
            if (this.Y == 65535) {
                this.Y = -1;
            }
            n5 = e2.y();
            this.ad = new int[n5 + 1];
            for (n4 = 0; n4 <= n5; ++n4) {
                this.ad[n4] = e2.A();
                if (this.ad[n4] != 65535) continue;
                this.ad[n4] = -1;
            }
        }
        if (n3 == -1) {
            boolean bl = this.ar = this.an != null && (this.aI == null || this.aI[0] == 10);
            if (this.ay != null) {
                this.ar = true;
            }
        }
        if (this.aG) {
            this.aj = false;
            this.ab = false;
        }
        if (this.ae == -1) {
            this.ae = this.aj ? 1 : 0;
        }
    }

    private r() {
        this.aa = -1;
    }

    public void a(r r2) {
        this.P = r2.P;
        this.Q = r2.Q;
        this.aA = r2.aA;
        this.R = r2.R;
        this.S = r2.S;
        this.T = r2.T;
        this.U = r2.U;
        this.aC = r2.aC;
        this.V = r2.V;
        this.W = r2.W;
        this.X = r2.X;
        this.Y = r2.Y;
        this.aD = r2.aD;
        this.ab = r2.ab;
        this.ac = r2.ac;
        this.ad = r2.ad;
        this.ae = r2.ae;
        this.af = r2.af;
        this.ag = r2.ag;
        this.ah = r2.ah;
        this.aG = r2.aG;
        this.aj = r2.aj;
        this.ak = r2.ak;
        this.al = r2.al;
        this.am = r2.am;
        this.an = r2.an;
        this.ao = r2.ao;
        this.ap = r2.ap;
        this.aI = r2.aI;
        this.aq = r2.aq;
        this.ar = r2.ar;
        this.as = r2.as;
        this.at = r2.at;
        this.au = r2.au;
        this.aK = r2.aK;
        this.ax = r2.ax;
        this.ay = r2.ay;
    }

    public r(r r2) {
        this.P = r2.P;
        this.Q = r2.Q;
        this.aA = r2.aA;
        this.R = r2.R;
        this.S = r2.S;
        this.T = r2.T;
        this.U = r2.U;
        this.aC = r2.aC;
        this.V = r2.V;
        this.W = r2.W;
        this.X = r2.X;
        this.Y = r2.Y;
        this.aD = r2.aD;
        this.aa = r2.aa;
        this.ab = r2.ab;
        this.ac = r2.ac;
        this.ad = r2.ad;
        this.ae = r2.ae;
        this.af = r2.af;
        this.ag = r2.ag;
        this.ah = r2.ah;
        this.aG = r2.aG;
        this.aj = r2.aj;
        this.ak = r2.ak;
        this.al = r2.al;
        this.am = r2.am;
        this.an = r2.an;
        this.ao = r2.ao;
        this.ap = r2.ap;
        this.aI = r2.aI;
        this.aq = r2.aq;
        this.ar = r2.ar;
        this.as = r2.as;
        this.at = r2.at;
        this.au = r2.au;
        this.aK = r2.aK;
        this.ax = r2.ax;
        this.ay = r2.ay;
    }

    public boolean e() {
        if (this.aw && this.av != 1) {
            return false;
        }
        if (this.aw && this.av == 1) {
            return true;
        }
        if (I) {
            return false;
        }
        return E == rs.d.r$a.d;
    }

    static {
        B = new cc();
        C = new HashMap<Integer, Boolean>();
        D = new int[]{29131, 29132, 29133, 29113, 29136, 29137, 29138, 29139, 29120, 29130, 29122, 29121, 29123, 29124, 29125, 29126, 29127, 29128, 29129, 29254, 29255, 29256, 29257, 29258, 29259, 29260, 29261, 29253, 29252, 29251, 29250, 29249, 29248, 29247, 29246, 29245, 29244, 29243, 29242, 29237, 29238, 29239, 29240, 29241, 29262, 29263, 29264, 29267, 29268, 29269, 29230, 29270, 29271, 29272, 29273, 29274, 29275, 29276, 29277, 29231, 29232, 29233, 29234, 29422, 29362, 29227};
        E = rs.d.r$a.a;
        F = false;
        G = new ArrayList<Integer>();
        I = false;
        J = new f_0(500);
        K = new f_0(500);
        L = new f_0(1000);
        M = new f_0(500);
        N = new f_0(500);
        O = new f_0(1000);
        aB = new h[4];
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = rs.d.r$a.a();
        }
    }
}

