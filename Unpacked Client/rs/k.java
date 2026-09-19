/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.bU
 *  gnu.trove.f.b.cc
 */
package rs;

import gnu.trove.f.b.bU;
import gnu.trove.f.b.cc;
import java.io.File;
import java.io.IOException;
import rs.Client;
import rs.cache.osrs.c;
import rs.i;
import rs.k_0;
import rs.u.b;
import rs.v.a;
import rs.x.e;

public final class k {
    public static final cc<Boolean> a = new cc();
    public static final bU b = new bU();
    private static final int[] p = new int[]{3502, 3353, 382, 55780, 13, 57784, 182};
    public static final int[] c = new int[]{4674, 4675, 7351, 8081, 8080};
    public static k[][] d;
    public static k[][] e;
    public int f;
    public k_0 g;
    public int h;
    public static byte[][] i;
    public static byte[][] j;
    public int[] k;
    public int[] l;
    public int[] m;
    public int[] n;
    public static boolean[] o;

    public static byte[] a(int n2, int n3) {
        if (n2 == 0) {
            return i[n3];
        }
        return j[n3];
    }

    public static void a(int n2) {
        d = new k[4000][0];
        e = new k[4000][0];
        rs.cache.osrs.c.a(new k[15000][0]);
    }

    public static void a(int n2, byte[] byArray, boolean bl) {
        try {
            e e2 = new e(byArray);
            k_0 k_02 = new k_0(e2, bl);
            int n3 = 0;
            if (bl) {
                n3 = e2.A();
            }
            int n4 = e2.A();
            rs.k.a((boolean)bl)[n2] = new k[n4 * 3];
            int[] nArray = new int[500];
            int[] nArray2 = new int[500];
            int[] nArray3 = new int[500];
            int[] nArray4 = new int[500];
            for (int i2 = 0; i2 < n4; ++i2) {
                int n5;
                int n6 = bl ? e2.o() : e2.A();
                k k2 = new k();
                rs.k.a((boolean)bl)[n2][n6] = k2;
                k k3 = k2;
                k3.g = k_02;
                int n7 = e2.y();
                int n8 = -1;
                int n9 = 0;
                for (n5 = 0; n5 < n7; ++n5) {
                    int n10;
                    int n11 = e2.y();
                    if (n11 <= 0) continue;
                    if (k_02.d[n5] != 0) {
                        for (n10 = n5 - 1; n10 > n8; --n10) {
                            if (k_02.d[n10] != 0) continue;
                            nArray[n9] = n10;
                            nArray2[n9] = 0;
                            nArray3[n9] = 0;
                            nArray4[n9] = 0;
                            ++n9;
                            break;
                        }
                    }
                    nArray[n9] = n5;
                    n10 = 0;
                    if (k_02.d[n5] == 3) {
                        n10 = 128;
                    }
                    nArray2[n9] = (n11 & 1) != 0 ? e2.x() : n10;
                    nArray3[n9] = (n11 & 2) != 0 ? e2.x() : n10;
                    nArray4[n9] = (n11 & 4) != 0 ? e2.x() : n10;
                    n8 = n5;
                    ++n9;
                }
                k3.h = n9;
                k3.k = new int[n9];
                k3.l = new int[n9];
                k3.m = new int[n9];
                k3.n = new int[n9];
                for (n5 = 0; n5 < n9; ++n5) {
                    k3.k[n5] = nArray[n5];
                    k3.l[n5] = nArray2[n5];
                    k3.m[n5] = nArray3[n5];
                    k3.n[n5] = nArray4[n5];
                }
            }
        }
        catch (Exception exception) {
            System.out.println("Anim error for file: " + n2 + " [osrs=" + bl + "]");
            exception.printStackTrace();
        }
    }

    public static void b(int n2) {
        try {
            e e2 = new e(rs.i.a(rs.v.a.f() + "/old_osrs_anims/" + n2 + ".dat"));
            k_0 k_02 = new k_0(e2);
            int n3 = e2.A();
            rs.k.e[n2] = new k[(int)((double)n3 * 1.5)];
            int[] nArray = new int[500];
            int[] nArray2 = new int[500];
            int[] nArray3 = new int[500];
            int[] nArray4 = new int[500];
            for (int i2 = 0; i2 < n3; ++i2) {
                int n4;
                int n5 = e2.A();
                k k2 = new k();
                rs.k.e[n2][n5] = k2;
                k k3 = k2;
                k3.g = k_02;
                int n6 = e2.y();
                int n7 = 0;
                int n8 = -1;
                for (n4 = 0; n4 < n6; ++n4) {
                    int n9;
                    int n10 = e2.y();
                    if (n10 <= 0) continue;
                    if (k_02.d[n4] != 0) {
                        for (n9 = n4 - 1; n9 > n8; --n9) {
                            if (k_02.d[n9] != 0) continue;
                            nArray[n7] = n9;
                            nArray2[n7] = 0;
                            nArray3[n7] = 0;
                            nArray4[n7] = 0;
                            ++n7;
                            break;
                        }
                    }
                    nArray[n7] = n4;
                    n9 = 0;
                    if (k_02.d[n4] == 3) {
                        n9 = 128;
                    }
                    nArray2[n7] = (n10 & 1) != 0 ? (int)((short)e2.x()) : n9;
                    nArray3[n7] = (n10 & 2) != 0 ? e2.x() : n9;
                    nArray4[n7] = (n10 & 4) != 0 ? e2.x() : n9;
                    n8 = n4;
                    ++n7;
                }
                k3.h = n7;
                k3.k = new int[n7];
                k3.l = new int[n7];
                k3.m = new int[n7];
                k3.n = new int[n7];
                for (n4 = 0; n4 < n7; ++n4) {
                    k3.k[n4] = nArray[n4];
                    k3.l[n4] = nArray2[n4];
                    k3.m[n4] = nArray3[n4];
                    k3.n[n4] = nArray4[n4];
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void c(int n2) {
        try {
            e e2 = new e(rs.i.a(rs.v.a.f() + "/misc/" + n2 + ".dat"));
            k_0 k_02 = new k_0(e2);
            int n3 = e2.A();
            rs.k.a()[n2] = new k[(int)((double)n3 * 3.0)];
            int[] nArray = new int[500];
            int[] nArray2 = new int[500];
            int[] nArray3 = new int[500];
            int[] nArray4 = new int[500];
            for (int i2 = 0; i2 < n3; ++i2) {
                int n4;
                int n5 = e2.A();
                k k2 = new k();
                rs.k.a()[n2][n5] = k2;
                k k3 = k2;
                k3.g = k_02;
                int n6 = e2.y();
                int n7 = 0;
                int n8 = -1;
                for (n4 = 0; n4 < n6; ++n4) {
                    int n9;
                    int n10 = e2.y();
                    if (n10 <= 0) continue;
                    if (k_02.d[n4] != 0) {
                        for (n9 = n4 - 1; n9 > n8; --n9) {
                            if (k_02.d[n9] != 0) continue;
                            nArray[n7] = n9;
                            nArray2[n7] = 0;
                            nArray3[n7] = 0;
                            nArray4[n7] = 0;
                            ++n7;
                            break;
                        }
                    }
                    nArray[n7] = n4;
                    n9 = 0;
                    if (k_02.d[n4] == 3) {
                        n9 = 128;
                    }
                    nArray2[n7] = (n10 & 1) != 0 ? (int)((short)e2.q()) : n9;
                    nArray3[n7] = (n10 & 2) != 0 ? e2.q() : n9;
                    nArray4[n7] = (n10 & 4) != 0 ? e2.q() : n9;
                    n8 = n4;
                    ++n7;
                }
                k3.h = n7;
                k3.k = new int[n7];
                k3.l = new int[n7];
                k3.m = new int[n7];
                k3.n = new int[n7];
                for (n4 = 0; n4 < n7; ++n4) {
                    k3.k[n4] = nArray[n4];
                    k3.l[n4] = nArray2[n4];
                    k3.m[n4] = nArray3[n4];
                    k3.n[n4] = nArray4[n4];
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static k[][] a() {
        return rs.k.a(rs.cache.osrs.c.a());
    }

    public static k[][] a(boolean bl) {
        return bl ? rs.cache.osrs.c.c() : d;
    }

    public static void b() {
        d = null;
        e = null;
        rs.cache.osrs.c.a(null);
    }

    public static boolean b(int n2, int n3) {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static k c(int n2, int n3) {
        boolean bl = rs.d.a.a[n3].w;
        int n4 = n2 >> 16;
        int n5 = n2 & 0xFFF;
        if (n4 == 0) {
            System.out.println(n4 + " " + n3 + " " + bl);
        }
        if (a.b(n3) != null && n4 < e.length && !rs.cache.osrs.c.a()) {
            if (e[n4].length == 0) {
                System.out.println("Loading OSRS: " + n4);
                File file = new File(rs.v.a.f() + "/old_osrs_anims/" + n4 + ".dat");
                if (file.exists()) {
                    rs.k.b(n4);
                } else {
                    System.out.println("[Animations] Could not find OSRS animation file " + n4);
                }
            }
            if (e[n4].length != 0 && n5 < e[n4].length) {
                return e[n4][n5];
            }
        }
        if (n4 >= rs.k.a().length) {
            return null;
        }
        if (rs.k.a()[n4].length == 0) {
            boolean bl2 = false;
            if (!rs.cache.osrs.c.a()) {
                for (int n6 : p) {
                    if (n4 != n6) continue;
                    rs.k.c(n4);
                    bl2 = true;
                    break;
                }
            }
            if (!bl2) {
                rs.cache.osrs.c.a(bl);
                try {
                    rs.k.a(n4, bl);
                }
                finally {
                    rs.cache.osrs.c.a(false);
                }
            }
        }
        if (n4 >= rs.k.a(bl).length || n5 >= rs.k.a(bl)[n4].length) {
            return null;
        }
        return rs.k.a(bl)[n4][n5];
    }

    public static void a(int n2, boolean bl) {
        byte[] byArray;
        try {
            byArray = Client.ew.a(1, n2, bl ? 1 : 0);
        }
        catch (IOException iOException) {
            return;
        }
        if (byArray == null) {
            return;
        }
        int n3 = (byArray[1] & 0xFF) + ((byArray[0] & 0xFF) << 8);
        if (n3 == 420) {
            rs.u.b.a(n2, byArray);
        } else {
            rs.k.a(n2, byArray, bl);
        }
    }

    public static k[][] d(int n2) {
        if (a.b(n2) != null && !rs.cache.osrs.c.a()) {
            return e;
        }
        return rs.k.a();
    }

    public static int e(int n2) {
        String string = Integer.toHexString(n2);
        int n3 = Integer.parseInt(string.substring(0, string.length() - 4), 16);
        return n3;
    }

    public boolean f(int n2) {
        return rs.k.g(n2);
    }

    public static boolean g(int n2) {
        return n2 == -1;
    }

    static {
        i = null;
        j = null;
    }
}

