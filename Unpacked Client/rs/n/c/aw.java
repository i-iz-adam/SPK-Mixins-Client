/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.a.d;
import rs.n.a.f;
import rs.n.c;
import rs.n.c.ax;
import rs.n.c.ay;
import rs.n.e;
import rs.q.a.a.a;

public class aw
extends c {
    public static rs.n.d.c c;
    public static final a d;
    private static final int e = 60201;
    private static final int f = 60203;
    private static final int g = 60204;
    private static final int bI = 60205;
    private static final int[] bJ;
    private static final int[] bK;
    private static final int[] bL;
    private static final int[] bM;
    private static final String[] bN;
    private static final int[] bO;
    private static final int bP = 60238;
    private static final int[] bQ;
    private static final int bR = 60246;
    private static final int bS = 60247;
    private static final int bT = 60248;
    private static final int bU = 60249;
    private static final int bV = 60250;
    private static final int bW = 60251;
    private static final int bX = 60252;
    private static final int bY = 60253;
    private static final int bZ = 60254;
    private static final int ca = 60255;
    private static final int cb = 60256;
    private static final int cc = 60257;
    private static final int cd = 60258;
    private static final int ce = 60259;
    private static final int cf = 60260;
    private static final int cg = 60261;
    private static final int ch = 60262;
    private static final int ci = 60263;
    private static ay cj;

    public aw(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = rs.n.c.aw.d(60200);
        e2.f();
        c = new rs.n.d.c(e2);
        c.a(rs.n.a.e.a(60201, "misc/cart 0").g(740, 480)).a(13, 13);
        c.a(rs.n.a.f.a(60262, "@or1@Donation Shopping Cart").j().b()).a(388, 21);
        this.k();
        this.j();
        this.i();
        this.h();
        c.a();
    }

    private void h() {
        int[] nArray;
        int n2 = 0;
        int n3 = 3 + n2;
        rs.n.a.c.g(60082, 3).h(0, 12).a(3);
        rs.n.a.c.g(60085, 3).h(0, 12).a(3);
        rs.n.a.c.g(60088, 3).h(0, 12).a(3);
        for (int n4 : nArray = new int[]{60082, 60085, 60088}) {
            if (n4 == 60088) {
                rs.n.e.H[n4].az = new int[]{-1, 21666, 21666};
                rs.n.e.H[n4].ax = new int[]{1, 1, 1};
                continue;
            }
            if (n4 == 60082) {
                rs.n.e.H[n4].az = new int[]{-1, 21677, -1};
                rs.n.e.H[n4].ax = new int[]{1, 3, 1};
                continue;
            }
            rs.n.e.H[n4].az = new int[]{-1, 21606, -1};
            rs.n.e.H[n4].ax = new int[]{1, 1, 1};
        }
        int n5 = -32;
        c.a(60069).a(58, 343);
        c.a(60064).a(54, 377);
        c.a(60065).a(54, 377);
        if (cj.s() > 0) {
            try {
                rs.l.f.e.d().a(cj);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        rs.l.f.e.d().a(cj, 60065);
        c.a(60081).a(211, 422 + n3);
        c.a(60082).a(196 + n5, 369 + n3);
        c.a(60084).a(341, 422 + n3);
        c.a(60085).a(326 + n5, 369 + n3);
        c.a(60087).a(570, 425);
        c.a(60088).a(451 + n5, 369 + n3);
        c.a(60090).a(41, 371 + n2);
        c.a(60091).a(57, 409 + n2);
        c.a(60270).a(61, 409 + n2);
        c.a(60092).a(222, 390 + n3);
        c.a(60093).a(352, 390 + n3);
        c.a(60094).a(509, 390 + n3);
        c.a(60066).a(37, 461);
        c.a(60067).a(37, 445);
        c.a(60096).a(522, 364 + n3);
        c.a(60097).a(566, 364 + n3);
        c.a(60098).a(527, 369 + n3);
        c.a(60099).a(612, 369 + n3 + 2);
        c.a(60100).a(612, 369 + n3 + 15 + 2);
        c.a(60094).a(553, 390 + n3);
        c.a(65418).a(731, 21);
        c.a(65419).a(731, 21);
    }

    private void i() {
        c.a(rs.n.a.f.a(60251, "Daily Offer").j().m(16750623)).a(413, 58);
        c.a(rs.n.a.f.a(60252, "Exclusive Offers").j().m(16750623)).a(413, 156);
        this.c(561, 82, 60253, 60254, 60255);
        this.c(561, 181, 60256, 60257, 60258);
        this.c(561, 261, 60259, 60260, 60261);
    }

    private void c(int n2, int n3, int n4, int n5, int n6) {
        String string = "@whi@Earn one grand promo package, and get one FREE!";
        String string2 = "Offer expires in: @cya@<img=37> 24:00:00";
        int n7 = 21665;
        rs.n.a.c c2 = rs.n.a.c.g(n6, 6).h(12, 0);
        c2.P = 6;
        c2.aR = 1;
        c2.aA = true;
        if (n4 == 60256) {
            string = "@whi@Seasonal fuse boxes obtainable from seasonal packs!";
            string2 = "Pulls remaining: <item=24238> @red@0/3 <item=24050>@yel@2/3 <item=25425>@gre@3/3";
            c2.az = new int[]{24176, 24239, 24176, 24051, 24176, 25426};
        } else {
            if (n4 == 60259) {
                string = "";
                string2 = "No other promotions available at this time";
                n7 = -1;
            }
            for (int i2 = 0; i2 < 6; ++i2) {
                c2.az[i2] = n7 + 1;
                c2.ax[i2] = 1;
            }
        }
        c.a(rs.n.a.f.a(n4, string).i().b()).a(n2, n3);
        c.a(rs.n.a.f.a(n5, string2).a().b().m(12171349)).a(n2, n3 + 18);
        c.a(c2).a(n2 - 125, n3 + 34);
    }

    private void j() {
        c.a(rs.n.a.f.a(60238, "Shopping Cart").j().m(16750623)).a(243, 58);
        d d2 = rs.n.a.d.f(60246, 150, 177);
        d2.aH = 150;
        for (int i2 = 0; i2 < bQ.length; ++i2) {
            String string = i2 == bQ.length - 1 ? "@or1@Subtotal: @yel@$0.00" : "Empty";
            rs.n.a.f.a(bQ[i2], string).a().m(12171349);
            d2.n(bQ[i2]).a(5, 5 + i2 * 15);
        }
        d2.a();
        c.a(d2).a(216, 82);
        c.a(rs.n.a.f.a(60247, "<img=90><tab=20>PayPal (Card / Bank)").a(200).a().m(16750623)).a(223, 264);
        c.a(rs.n.a.f.a(60248, "<img=88><tab=20>OSRS GP").a(200).a().m(16750623)).a(223, 283);
        c.a(rs.n.a.a.b(60249, "misc/login 2", "Checkout").g(130, 32).a("misc/login 3")).a(230, 297);
        c.a(rs.n.a.f.a(60250, "Checkout @yel@($0.00)").a().b().m(16750623)).a(292, 307);
    }

    private void k() {
        int n2;
        int n3;
        int n4;
        c.a(rs.n.a.f.a(60263, "Purchase Options").j().m(16750623)).a(59, 58);
        d d2 = rs.n.a.d.f(60203, 239, 270);
        d2.bj = 87;
        d2.aH = 260;
        rs.n.a.e e2 = rs.n.a.e.a(60205, "misc/cart 1");
        rs.n.a.c c2 = rs.n.a.c.g(60204, 20);
        c2.h(47, 28);
        c2.P = 2;
        int n5 = n4 = -5;
        for (n3 = 0; n3 < bJ.length; ++n3) {
            n2 = n3 % 2 == 0 ? 0 : 79;
            d2.n(60205).a(n2, 10 + n5);
            c2.az[n3] = bO[n3] + 1;
            c2.ax[n3] = 1;
            rs.n.a.f.a(bJ[n3], "0").b().a().m(16751360);
            rs.n.a.f.a(bM[n3], bN[n3]).a().m(12171349).b();
            d2.n(bJ[n3]).a(36 + n2, 49 + n5);
            int n6 = bK[n3];
            int n7 = bL[n3];
            rs.n.a.a.b(n6, "misc/donor 11", "Reduce quantity").g(16, 16).a("misc/donor 12");
            rs.n.a.a.b(n7, "misc/donor 9", "Increase quantity").g(16, 16).a("misc/donor 10");
            d2.n(n6).a(12 + n2, 46 + n5);
            d2.n(n7).a(45 + n2, 46 + n5);
            if ((n3 + 1) % 2 != 0) continue;
            n5 += 60;
        }
        d2.n(60204).a(21, 13 + n4);
        n5 = n4;
        for (n3 = 0; n3 < bJ.length; ++n3) {
            n2 = n3 % 2 == 0 ? 0 : 79;
            d2.n(bM[n3]).a(33 + n2, 12 + n5);
            if ((n3 + 1) % 2 != 0) continue;
            n5 += 60;
        }
        d2.a();
        c.a(d2).a(41, 83);
    }

    static {
        d = new ax();
        bJ = new int[]{60206, 60207, 60208, 60209, 60210, 60211, 60212, 60213};
        bK = new int[]{60214, 60215, 60216, 60217, 60218, 60219, 60220, 60221};
        bL = new int[]{60222, 60223, 60224, 60225, 60226, 60227, 60228, 60229};
        bM = new int[]{60230, 60231, 60232, 60233, 60234, 60235, 60236, 60237};
        bN = new String[]{"<img=84>@yel@$5", "<img=84>@yel@$10", "<img=84>@yel@$20", "<img=84>@yel@$30", "<img=84>@yel@$45", "<img=84>@yel@$75", "<img=84>@yel@$100", "<img=84>@yel@$500"};
        bO = new int[]{16000, 16001, 16002, 16003, 16004, 16005, 16006, 16007};
        bQ = new int[]{60239, 60240, 60241, 60242, 60243, 60244, 60244, 60245};
        cj = new ay();
    }
}

