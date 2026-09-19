/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.ArrayList;
import java.util.List;
import rs.n.c;
import rs.n.c.k_0;
import rs.n.c.l_0;
import rs.n.e;

/*
 * Renamed from rs.n.c.J
 */
public class j_0
extends c {
    private static final int d = 30333;
    private static final int e = 6;
    private static int f;
    private static List<a> g;
    public static rs.q.a.a.a c;

    public j_0(rs.l.k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        e e2 = j_0.d(30072);
        rs.n.b.a.a.c.a(30072, new l_0(this, 500L));
        j_0.h(30330, "popups/activities 1");
        j_0.h(30331, "popups/activities 2");
        e e3 = j_0.d(30332);
        e3.al = new int[1];
        e3.am = new int[1];
        e3.bc = new int[1];
        e3.aH = 750;
        e3.P = 449;
        e3.aR = 235;
        e3.bj = 87;
        for (n2 = 30333; n2 <= 30369; n2 += 6) {
            j_0.a(n2, "", this.a, 2, 16750623, false, true);
            j_0.a(n2 + 1, 440, 14, 1, 1, 0x797979, 0xFFC000, 16721949);
            j_0.a(n2 + 2, "", this.a, 0, 1, true, false);
            j_0.a(n2 + 3, "", this.a, 0, 12171349, false, true);
            j_0.a(n2 + 4, "", this.a, 0, 12171349, false, true);
            j_0.a(n2 + 5, "", this.a, 0, 12171349, false, true);
        }
        j_0.a(30375, "Event Activity Viewer", this.a, 2, 16750623, true, true);
        j_0.a(30376, "<img=50> To prevent excessive farming, activities have timed limits on token earnings", this.a, 1, 16750623, false, true);
        j_0.a(30377, "<img=78> @cya@The limit on an activity resets once its timer reaches <img=37> @whi@0:00", this.a, 1, 16750623, false, true);
        e2.k(7);
        e2.b(0, 30330, 10, 11);
        e2.b(1, 30332, 25, 47);
        e2.b(2, 30375, 260, 27);
        e2.b(3, 30376, 23, 287);
        e2.b(4, 30377, 110, 304);
        e2.b(5, 63740, 474, 25);
        e2.b(6, 63741, 474, 25);
        n2 = 0;
        while (n2 < e2.al.length) {
            int n3 = n2++;
            e2.bc[n3] = e2.bc[n3] - 10;
        }
    }

    private static void j() {
        e e2 = rs.n.e.H[30332];
        e2.k(f * 7);
        int n2 = 0;
        int n3 = 10;
        int n4 = 0;
        for (int i2 = 0; i2 < f * 7; i2 += 7) {
            int n5 = 30333 + n4++ * 6;
            e2.b(i2, n5, n2 + 1, n3);
            int n6 = 0;
            for (int i3 = 0; i3 < 3; ++i3) {
                e2.b(i2 + 3 + i3, n5 + 3 + i3, n2 + 1, n3 + 40 + 1 + n6 - 22);
                if (rs.n.e.H[n5 + 3 + i3].at.equalsIgnoreCase("")) continue;
                n6 += 15;
            }
            e2.b(i2 + 1, n5 + 1, n2 + 1, n3 + 20 + n6 + 3);
            e2.b(i2 + 2, n5 + 2, n2 + 229, n3 + 22 + n6 + 3);
            e2.b(i2 + 6, 30331, n2 + 20, n3 + 40 + n6 + 10);
            n3 = n3 + 40 + 15 + 15 + n6;
        }
    }

    private static void b(String string, String[] stringArray, int n2, int n3, long l2) {
        a a2 = new a(string, l2);
        rs.n.e.H[30333 + j_0.f * 6].at = a2.a();
        for (int i2 = 0; i2 < 3; ++i2) {
            rs.n.e.H[30333 + j_0.f * 6 + 3 + i2].at = i2 >= stringArray.length ? "" : stringArray[i2];
        }
        if (n3 == -1) {
            rs.n.e.H[30333 + j_0.f * 6 + 1].z = 16746752;
            rs.n.e.H[30333 + j_0.f * 6 + 1].w = 100;
            rs.n.e.H[30333 + j_0.f * 6 + 2].at = "<img=81> Activity locked! <img=81>";
            a2.b = "<img=81>";
        } else if (n3 == 0) {
            rs.n.e.H[30333 + j_0.f * 6 + 1].z = 7788154;
            rs.n.e.H[30333 + j_0.f * 6 + 1].w = 100;
            rs.n.e.H[30333 + j_0.f * 6 + 2].at = "No token limit!";
        } else {
            rs.n.e.H[30333 + j_0.f * 6 + 2].at = n2 >= n3 ? "@whi@<shad=1>Limit reached! Token earnings are locked until the limit timer ends.." : n2 + " / " + n3 + " token limit";
            rs.n.e.H[30333 + j_0.f * 6 + 2].z = 16721949;
            rs.n.e.H[30333 + j_0.f * 6 + 1].w = (int)((float)n2 / (float)n3 * 100.0f);
        }
        g.add(a2);
        ++f;
    }

    private static void k() {
        f = 0;
    }

    static /* synthetic */ List h() {
        return g;
    }

    static /* synthetic */ int m(int n2) {
        f = n2;
        return f;
    }

    static /* synthetic */ void a(String string, String[] stringArray, int n2, int n3, long l2) {
        j_0.b(string, stringArray, n2, n3, l2);
    }

    static /* synthetic */ void i() {
        j_0.j();
    }

    static {
        g = new ArrayList<a>();
        c = new k_0();
    }

    static class a {
        public String a;
        public String b = "<img=82>";
        public long c;
        public long d;

        public a(String string, long l2) {
            this.a = string;
            this.c = l2;
            this.d = System.currentTimeMillis();
        }

        public String a() {
            Object object = "";
            if (this.c > 0L) {
                long l2 = this.c - (System.currentTimeMillis() - this.d);
                if (l2 <= 0L) {
                    l2 = 0L;
                }
                long l3 = l2 / 1000L;
                object = " <img=46> <img=37> @or1@";
                if (l3 >= 3600L) {
                    long l4 = l3 / 3600L;
                    long l5 = l3 / 60L % 60L;
                    object = (String)object + l4 + ":" + String.valueOf(l5 < 10L ? "0" + l5 : Long.valueOf(l5)) + ":" + String.valueOf(l3 < 10L ? "0" + l3 : Long.valueOf(l3 %= 60L));
                } else {
                    long l6 = l3 / 60L;
                    object = (String)object + l6 + ":" + String.valueOf((l3 %= 60L) < 10L ? "0" + l3 : Long.valueOf(l3));
                }
            }
            return this.b + " @yel@" + this.a + (String)object;
        }
    }
}

