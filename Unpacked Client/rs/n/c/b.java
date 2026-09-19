/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import rs.Client;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

public class b
extends c {
    public static f_0 c;
    public static final List<a> d;
    public static k_0[] e;

    public b(k_0[] k_0Array) {
        super(k_0Array);
        e = k_0Array;
    }

    public static void m(int n2) {
        if (n2 >= 44105 && n2 <= 44220) {
            for (int i2 = 0; i2 < d.size(); ++i2) {
                a a2 = d.get(i2);
                if (a2 != null && n2 == 44105 + i2 * 12) {
                    Client.ap = "::claimchallenge " + a2.a;
                    break;
                }
                if (a2 == null || n2 != 44112 + i2 * 12) continue;
                Client.ap = "::infochallenge " + a2.a;
                break;
            }
        }
    }

    public static void a(String string, String string2, int n2, int n3, int n4, int n5) {
        a a2 = new a();
        a2.a = string;
        a2.b = string2;
        a2.c = n2;
        a2.d = n3;
        a2.e = n4;
        a2.f = n5;
        d.add(a2);
    }

    public static void b(String string) {
        ArrayList<a> arrayList = new ArrayList<a>();
        for (a a2 : d) {
            if (!a2.a.equalsIgnoreCase(string)) continue;
            arrayList.add(a2);
        }
        for (a a2 : arrayList) {
            d.remove(a2);
        }
    }

    public static void a(String string, int n2, int n3) {
        int n4 = 44103;
        for (a a2 : d) {
            if (a2.a.equalsIgnoreCase(string)) {
                a2.e = n2;
                a2.f = n3;
                double d2 = (double)a2.e / (double)a2.f * 100.0;
                if (d2 >= 100.0) {
                    d2 = 100.0;
                }
                DecimalFormat decimalFormat = new DecimalFormat("###.#");
                rs.n.e.H[n4 + 6].E = new f_0("gameframe/tab/bar1", (int)((double)rs.n.c.b.c.n * (d2 / 100.0)), rs.n.c.b.c.o);
                rs.n.e.H[n4 + 7].at = "@gre@" + a2.e + "/" + a2.f + " (" + decimalFormat.format(d2) + "%)";
                break;
            }
            n4 += 12;
        }
        Client.fb = true;
    }

    public static void h() {
        e e2 = rs.n.e.H[44101];
        int n2 = 44103;
        int n3 = 1;
        for (int i2 = 0; i2 < 10; ++i2) {
            int n4 = 23 + i2 * 80;
            if (i2 >= d.size() || d.get(i2) == null) {
                if (i2 == 0) {
                    rs.n.c.b.a(n2++, "<col=FF9B00>You don't have any challenges!", e, 0, 16750623, false, true);
                    rs.n.c.b.a(n2++, "", e, 0, 16750623, false, true);
                    rs.n.c.b.a(n2++, "", e, 0, 16750623, false, true);
                    rs.n.c.b.a(n2++, "", e, 0, 16750623, false, true);
                    e2.b(n3++, n2 - 4, 2, 1 + n4);
                    e2.b(n3++, n2 - 3, 2, 25 + n4);
                    e2.b(n3++, n2 - 2, 2, 40 + n4);
                    e2.b(n3++, n2 - 1, 2, 55 + n4);
                    rs.n.e.H[n2++].bf = false;
                    rs.n.e.H[n2++].bf = false;
                    rs.n.e.H[n2++].bf = false;
                    rs.n.e.H[n2++].bf = false;
                    rs.n.e.H[n2++].bf = false;
                    rs.n.e.H[n2++].bf = false;
                    rs.n.e.H[n2++].bf = false;
                    rs.n.e.H[n2++].bf = false;
                    continue;
                }
                rs.n.e.H[n2++].bf = false;
                rs.n.e.H[n2++].bf = false;
                rs.n.e.H[n2++].bf = false;
                rs.n.e.H[n2++].bf = false;
                rs.n.e.H[n2++].bf = false;
                rs.n.e.H[n2++].bf = false;
                rs.n.e.H[n2++].bf = false;
                rs.n.e.H[n2++].bf = false;
                rs.n.e.H[n2++].bf = false;
                rs.n.e.H[n2++].bf = false;
                rs.n.e.H[n2++].bf = false;
                rs.n.e.H[n2++].bf = false;
            } else {
                a a2 = d.get(i2);
                rs.n.c.b.a(n2++, a2.a, e, 1, 16750623, false, true);
                rs.n.c.b.a(n2++, a2.b, e, 0, 0xFFFFFF, false, true);
                rs.n.c.b.a(n2++, "gameframe/tab/button", 1, 35, 19, "Collect reward", -1, n2, 1);
                rs.n.c.b.a(n2++, "gameframe/tab/button", 2, 35, 19, n2);
                ++n2;
                double d2 = (double)a2.e / (double)a2.f * 100.0;
                if (d2 >= 100.0) {
                    d2 = 100.0;
                }
                DecimalFormat decimalFormat = new DecimalFormat("###.#");
                rs.n.c.b.h(n2++, "gameframe/tab/bar2");
                rs.n.e.H[n2 - 1].bn = false;
                rs.n.c.b.h(n2++, "null");
                rs.n.e.H[n2 - 1].bn = false;
                rs.n.e.H[n2 - 1].E = new f_0("gameframe/tab/bar1", (int)((double)rs.n.c.b.c.n * (d2 / 100.0)), rs.n.c.b.c.o);
                rs.n.c.b.a(n2++, "@gre@" + a2.e + "/" + a2.f + " (" + decimalFormat.format(d2) + "%)", e, 0, 0xFFFFFF, false, true);
                rs.n.e.H[n2 - 1].bn = false;
                rs.n.c.b.h(n2++, "gameframe/tab/divider");
                rs.n.e.H[n2 - 1].bn = false;
                rs.n.c.b.a(n2++, "gameframe/tab/button", 3, 35, 12, "View information", -1, n2, 1);
                rs.n.c.b.a(n2++, "gameframe/tab/button", 4, 35, 12, n2);
                ++n2;
            }
            e2.b(n3++, n2 - 12, 39, 1 + n4);
            e2.b(n3++, n2 - 11, 39, 16 + n4);
            e2.b(n3++, n2 - 10, 0, 6 + n4 - 5);
            e2.b(n3++, n2 - 9, 0, 6 + n4 - 5);
            e2.b(n3++, n2 - 7, 0, 6 + n4 + 35 + 4);
            e2.b(n3++, n2 - 6, 0, 6 + n4 + 35 + 4);
            e2.b(n3++, n2 - 5, 0, 6 + n4 + 46 + 4);
            e2.b(n3++, n2 - 4, 0, 6 + n4 + 63);
            e2.b(n3++, n2 - 3, 0, 6 + n4 + 23);
            e2.b(n3++, n2 - 2, 0, 6 + n4 + 23);
        }
    }

    @Override
    public void a() {
        d.clear();
        e e2 = rs.n.c.b.d(44100);
        e e3 = rs.n.c.b.j(44101);
        rs.n.c.b.h(44099, "gameframe/tab/background");
        int n2 = 50;
        e3.P = 168;
        e3.aR = 225 - n2;
        e3.aH = 850;
        e3.k(101);
        c = new f_0("gameframe/tab/bar2");
        int n3 = 44102;
        int n4 = 0;
        rs.n.c.b.a(n3++, "<img=217> <u=16754944>Daily Challenges", e, 2, 16750623, false, true);
        e3.b(n4++, n3 - 1, 0, 4);
        for (int i2 = 0; i2 < 10; ++i2) {
            rs.n.c.b.a(n3++, "Deep wild pking", e, 1, 16750623, false, true);
            rs.n.c.b.a(n3++, "Kill 50 players in\\nlevel 30+ wild", e, 0, 0xFFFFFF, false, true);
            rs.n.c.b.a(n3++, "gameframe/tab/button", 1, 35, 19, "Collect reward", -1, n3, 1);
            rs.n.c.b.a(n3++, "gameframe/tab/button", 2, 35, 19, n3);
            int n5 = ++n3;
            rs.n.c.b.h(n5, "gameframe/tab/bar2");
            int n6 = ++n3;
            rs.n.c.b.h(n6, "gameframe/tab/bar1");
            int n7 = ++n3;
            rs.n.c.b.a(n7, "@gre@0/" + i2 + " (0.0%)", e, 0, 0xFFFFFF, false, true);
            int n8 = ++n3;
            rs.n.c.b.h(n8, "gameframe/tab/divider");
            rs.n.c.b.a(++n3, "gameframe/tab/button", 3, 35, 12, "View information", -1, ++n3, 1);
            rs.n.c.b.a(n3++, "gameframe/tab/button", 4, 35, 12, n3);
            int n9 = 23 + i2 * 80;
            e3.b(n4++, ++n3 - 12, 39, 1 + n9);
            e3.b(n4++, n3 - 11, 39, 16 + n9);
            e3.b(n4++, n3 - 10, 0, 6 + n9 - 5);
            e3.b(n4++, n3 - 9, 0, 6 + n9 - 5);
            e3.b(n4++, n3 - 7, 0, 6 + n9 + 35 + 4);
            e3.b(n4++, n3 - 6, 0, 6 + n9 + 35 + 4);
            e3.b(n4++, n3 - 5, 0, 6 + n9 + 46 + 4);
            e3.b(n4++, n3 - 4, 0, 6 + n9 + 63);
            e3.b(n4++, n3 - 3, 0, 6 + n9 + 23);
            e3.b(n4++, n3 - 2, 0, 6 + n9 + 23);
        }
        e2.k(9);
        e2.b(0, 32000, 0, 0);
        e2.b(1, 44099, 0, 31 + n2);
        e2.b(2, 16022, 0, 28 + n2);
        e2.b(3, 44101, 6, 30 + n2);
        e2.b(4, 16022, -1, 205 + n2);
        e2.b(5, 16018, 11, 54);
        e2.b(6, 16019, 37, 55);
        e2.b(7, 16020, 37, 55);
        e2.b(8, 640, 106, 59);
    }

    static {
        d = new ArrayList<a>();
    }

    static class a {
        public String a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;

        a() {
        }
    }
}

