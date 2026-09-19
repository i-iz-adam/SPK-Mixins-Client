/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.ArrayList;
import java.util.List;
import rs.l.k_0;
import rs.n.a.f;
import rs.n.c.d;
import rs.n.e;

public class c
extends rs.n.c {
    public static final int c = 30378;
    public static rs.n.d.c d;
    public static rs.n.d.c e;
    private static final int bM = 30394;
    private static final int bN = 30379;
    private static final int bO = 25;
    private static final int bP = 11;
    private static final String bQ = "<str=3145472>                                                    ";
    public static List<b> f;
    public static List<b> g;
    public static int bI;
    public static int bJ;
    public static int bK;
    private static rs.l.f.a.k.a bR;
    public static rs.q.a.a.a bL;

    public c(k_0[] k_0Array) {
        super(k_0Array);
    }

    private static void a(b b2, int n2) {
        int n3;
        int n4;
        int n5 = 25;
        int n6 = n2 * 70 + 5;
        int n7 = n4 = bI == 0 ? 30395 : bI;
        if (b2.h) {
            rs.n.a.e.a(++n4, "teleport/sprite 31");
        } else if (b2.f >= b2.g) {
            rs.n.a.e.a(++n4, "teleport/sprite 32");
        } else {
            rs.n.a.e.a(++n4, "teleport/sprite 20");
        }
        e.a(n4).a(n5, n6);
        switch (b2.a) {
            case a: {
                rs.n.c.c.a(++n4, b2.b, 10000, 32);
                break;
            }
            case b: {
                rs.n.c.c.d(++n4, 32);
                rs.n.e.H[n4].af = b2.b;
                break;
            }
            case c: {
                rs.n.c.c.d(++n4, 32);
                rs.n.e.H[n4].af = b2.b;
                rs.n.e.H[n4].aI = 22;
            }
        }
        e.a(n4).a(n5 + 5, n6 + 3);
        if (b2.d == null) {
            e.a(rs.n.a.f.a(++n4, b2.a(1)).m(0xFFFFFF).i()).a(n5 + 43, n6 + 12);
            e.a(rs.n.a.f.a(++n4, " ").m(0xFFFFFF).a()).a(n5 + 43, n6 + 6 + 15);
        } else {
            e.a(rs.n.a.f.a(++n4, b2.a(1)).m(0xFFFFFF).a()).a(n5 + 43, n6 + 6);
            e.a(rs.n.a.f.a(++n4, b2.a(2)).m(0xFFFFFF).a()).a(n5 + 43, n6 + 6 + 15);
        }
        rs.n.a.a.b(++n4, "teleport/sprite 23", "Tips & Information").a(++n4, "teleport/sprite 24");
        int n8 = n4 - 1;
        e.a(n4 - 1).a(n5 + 318, n6 + 3);
        e.a(n4).a(n5 + 318, n6 + 3);
        ++n4;
        rs.n.a.a.b(++n4, "teleport/sprite 25", "Teleport to Task").a(++n4, "teleport/sprite 26");
        int n9 = n4 - 1;
        e.a(n4 - 1).a(n5 + 318, n6 + 21);
        e.a(n4).a(n5 + 318, n6 + 21);
        ++n4;
        rs.n.a.c.g(++n4, 4).a(4).h(0, 0);
        rs.n.e.H[n4].bD = 20;
        if (b2.e.length > 0) {
            for (n3 = 0; n3 < Math.min(3, b2.e.length); ++n3) {
                rs.n.e.H[n4].az[n3] = b2.e[n3][0] + 1;
                rs.n.e.H[n4].ax[n3] = b2.e[n3][1];
            }
        }
        e.a(n4).a(n5 + 80, n6 + 35);
        if (b2.h) {
            e.a(rs.n.a.f.a(++n4, "<img=24> @gre@CLAIMED").j().b()).a(n5 + 285, n6 + 45);
            n4 += 3;
            rs.n.e.H[n9].bf = false;
            rs.n.e.H[n9 + 1].bf = false;
            rs.n.e.H[n8].bf = false;
            rs.n.e.H[n8 + 1].bf = false;
        } else {
            rs.n.e.H[n9].bf = true;
            rs.n.e.H[n9 + 1].bf = true;
            rs.n.e.H[n8].bf = true;
            rs.n.e.H[n8 + 1].bf = true;
            if (b2.f >= b2.g) {
                n3 = n4++;
                rs.n.a.a.b(n4, "teleport/sprite 21", "Claim reward").a(++n4, "teleport/sprite 22");
                e.a(n4 - 1).a(n5 + 236, n6 + 38);
                e.a(n4).a(n5 + 236, n6 + 38);
                ++n4;
                e.a(rs.n.a.f.a(++n4, "@yel@CLAIM!").j().b()).a(n5 + 285, n6 + 44);
            } else {
                if (b2.g == 1) {
                    e.a(rs.n.a.f.a(++n4, "(In-progress)").a().b().m(12171349)).a(n5 + 285, n6 + 45);
                } else {
                    e.a(rs.n.a.f.a(++n4, "(" + (b2.g > 999 ? "Prog" : "Progress") + ": " + b2.a("{prog}") + ")").a().b().m(12171349)).a(n5 + 285, n6 + 45);
                }
                n4 += 3;
            }
        }
        bI = n4;
    }

    private static void b(a a2, int n2, String string, String string2, int[][] nArray, int n3, int n4, boolean bl) {
        if (g.size() + f.size() >= 25) {
            return;
        }
        b b2 = new b();
        b2.a = a2;
        b2.b = n2;
        b2.c = string;
        b2.d = string2;
        b2.e = nArray;
        b2.f = n3;
        b2.g = n4;
        b2.h = bl;
        if (bl) {
            g.add(b2);
        } else {
            f.add(b2);
        }
    }

    @Override
    public void a() {
        e e2 = rs.n.c.c.d(30378);
        d = new rs.n.d.c(e2);
        d.a(rs.n.a.e.a(30379, "teleport/sprite 19")).a(7, 14);
        rs.n.a.a.b(30380, "teleport/sprite 30", "Next chapter").a(30381, "teleport/sprite 27");
        d.a(30380).a(405, 25);
        d.a(30381).a(405, 25);
        rs.n.a.a.b(30383, "teleport/sprite 28", "Previous chapter").a(30384, "teleport/sprite 29");
        d.a(30383).a(30379, 125, 11);
        d.a(30384).a(30379, 125, 11);
        d.a(rs.n.a.f.a(30386, "No mail message selected!").i().m(12171349).b()).a(30379, 275, 13);
        d.a(rs.n.a.f.a(38387, "Chapter Progress").i().m(12171349).b()).a(30379, 67, 45);
        d.a(rs.n.a.f.a(38388, "0 / 5").j().m(12171349).b()).a(30379, 67, 99);
        if (bR.s() > 0) {
            try {
                rs.l.f.e.d().a(bR);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        rs.l.f.e.d().a(bR, 38388);
        d.a(rs.n.a.c.g(30389, 4).a(2).h(10, 5)).a(30379, 30, 170);
        for (int i2 = 0; i2 < 4; ++i2) {
            rs.n.e.H[30389].az[i2] = 996;
            rs.n.e.H[30389].ax[i2] = 10000;
        }
        rs.n.a.a.b(30390, "teleport/sprite 21", "Claim rewards").a(30391, "teleport/sprite 22");
        d.a(30390).a(30379, 17, 255);
        d.a(30391).a(30379, 17, 255);
        d.a(rs.n.a.f.a(30393, "<img=9> Claim all").a().b().m(12171349)).a(30379, 64, 262);
        e = new rs.n.d.c(rs.n.a.d.f(30394, 366, 250));
        e.a();
        rs.n.c.c.h();
        rs.n.c.c.b(rs.n.c.c$a.a, 1464, "Vote for SPK @or1@(::vote)@whi@ then @or1@(::redeem)@whi@ your vote points!", "Then, swap the vote points for @or1@vote tickets@whi@ (via shop)", new int[][]{{1464, 1}}, 0, 1, false);
        rs.n.c.c.b(rs.n.c.c$a.c, 12110, "List vote ticket(s) for sale via @or1@Trading Post", null, new int[][]{{20808, 1}}, 0, 1, false);
        rs.n.c.c.b(rs.n.c.c$a.b, 2831, "Complete the @or1@Undead PKer@whi@ daily activity", null, new int[][]{{4278, 25}, {10834, 10}}, 0, 1, false);
        rs.n.c.c.b(rs.n.c.c$a.a, 12926, "Purchase a @or1@Toxic Blowpipe@whi@ from the Trading Post.", "This is a great starter item for PvM!", new int[][]{{4278, 25}, {10834, 10}}, 0, 1, false);
        rs.n.c.c.b(rs.n.c.c$a.a, 24263, "Earn 50 @or1@Vintage tickets@whi@ at the @or1@Vintage cave", null, new int[][]{{4278, 50}, {24260, 3}}, 0, 50, false);
        rs.n.c.c.b(rs.n.c.c$a.c, 2654, "Unlock the @or1@Blood Vengeance I@whi@ perk", null, new int[][]{{10877, 1}}, 0, 1, false);
        rs.n.c.c.b(rs.n.c.c$a.a, 23912, "Kill {prog} blood-revenants", null, new int[][]{{4278, 50}}, 0, 10, false);
        rs.n.c.c.b(rs.n.c.c$a.c, 2654, "Unlock the @or1@Blood Whip@whi@ perk", null, new int[][]{{10834, 25}}, 0, 1, false);
        rs.n.c.c.b(rs.n.c.c$a.c, 2654, "Dip an abyssal whip in the blood fountain", "to create a Blood whip (perk required)", new int[][]{{20808, 1}}, 0, 1, false);
        rs.n.c.c.i();
        d.a(30394).a(30379, 110, 42);
        d.a(63740).a(30379, 475, 13);
        d.a(63741).a(30379, 475, 13);
        d.a();
    }

    public static void h() {
        e.b();
        f.clear();
        g.clear();
        bI = 0;
    }

    public static void i() {
        int n2 = 0;
        for (b b2 : f) {
            rs.n.c.c.a(b2, n2++);
        }
        for (b b2 : g) {
            rs.n.c.c.a(b2, n2++);
        }
        int n3 = f.size() + g.size();
        rs.n.c.c.j().aH = n3 * 74;
        e.a();
    }

    public static e j() {
        return rs.n.e.H[30394];
    }

    static /* synthetic */ void a(a a2, int n2, String string, String string2, int[][] nArray, int n3, int n4, boolean bl) {
        rs.n.c.c.b(a2, n2, string, string2, nArray, n3, n4, bl);
    }

    static {
        f = new ArrayList<b>();
        g = new ArrayList<b>();
        bI = 0;
        bJ = 0;
        bK = 0;
        bR = new rs.l.f.a.k.a();
        bL = new d();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = rs.n.c.c$a.a();
        }
    }

    static class b {
        public a a;
        public int b;
        public String c;
        public String d;
        public int[][] e;
        public int f;
        public int g;
        public boolean h;

        b() {
        }

        public String a(int n2) {
            String string = null;
            if (n2 == 1) {
                string = this.a(this.c);
            }
            if (n2 == 2 && this.d != null) {
                string = this.a(this.d);
            }
            return string;
        }

        private String a(String string) {
            string = string.replace("{prog}", this.f + "/" + this.g);
            return string;
        }
    }
}

