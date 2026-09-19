/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.e.f;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.c.w_0;
import rs.n.c.x_0;
import rs.n.e;
import rs.q.a.a.a;

/*
 * Renamed from rs.n.c.V
 */
public class v_0
extends c {
    public static boolean c = false;
    public static long d = 0L;
    public static f_0 e;
    public static f_0 f;
    public static f_0 g;
    public static final a bI;
    public static final f bJ;

    public v_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        this.h();
        this.i();
    }

    public void h() {
        e e2 = v_0.d(59835);
        v_0.c(59836, 0, "gambling/SPRITE");
        v_0.a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
        v_0.a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
        e = new f_0("misc/warn");
        e e3 = v_0.d(59837);
        e e4 = this.m(59838).e();
        e3.k(1);
        e3.b(0, 59838, 5, 5);
        e e5 = v_0.d(59839);
        e e6 = this.m(59840).e();
        e6.W = new String[5];
        e5.k(1);
        e5.b(0, 59840, 5, 5);
        e3.aH = 450;
        e5.aH = 450;
        e3.P = 140;
        e5.P = 140;
        e3.aR = 121;
        e5.aR = 121;
        e3.bj = 87;
        e5.bj = 87;
        v_0.a(59830, "Est. Value: N/A", this.a, 0, 12171349, false);
        v_0.c(59831, "Est. Value: N/A", this.a, 0, 12171349, true);
        v_0.a(59832, "@gra@NOTE: Prices are just estimates!", this.a, 0, 16750623, true);
        v_0.a(59841, "Accept", "Accept this offer", this.a, 0, 65280, false, false, 50);
        v_0.a(59842, "Decline", "Decline this offer", this.a, 0, 0xFF0000, false, false, 50);
        v_0.a(59843, "Waiting for other player..", this.a, 0, 0xFFFFFF, true, true);
        v_0.a(59844, "Select a game type..", this.a, 1, 16751360, false, true);
        v_0.a(59845, "Rules for \"BJ (P1 hosting)\"", this.a, 1, 16751360, false, true);
        v_0.a(59846, "Gambling with P1..", this.a, 2, 16751360, false, true);
        f = rs.n.e.j(2, "gambling/SPRITE");
        g = rs.n.e.j(1, "gambling/SPRITE");
        v_0.c(59847, 1, "gambling/SPRITE");
        v_0.c(59848, 1, "gambling/SPRITE");
        v_0.c(59849, 1, "gambling/SPRITE");
        v_0.c(59850, 1, "gambling/SPRITE");
        v_0.c(59851, 1, "gambling/SPRITE");
        v_0.c(59852, 1, "gambling/SPRITE");
        v_0.a(59853, "55x2 (P1 host)", "Select", this.a, 0, 12171349, false, true, 160);
        v_0.a(59854, "55x2 (P2 host)", "Select", this.a, 0, 12171349, false, true, 160);
        v_0.a(59855, "BJ (P1 host)", "Select", this.a, 0, 12171349, false, true, 160);
        v_0.a(59856, "BJ (P2 host)", "Select", this.a, 0, 12171349, false, true, 160);
        v_0.a(59857, "Dice duel", "Select", this.a, 0, 12171349, false, true, 160);
        v_0.a(59858, "Flower poker", "Select", this.a, 0, 12171349, false, true, 160);
        v_0.a(59859, "Both players will plant five flowers each. The player with", this.a, 0, 0xFFFFFF, false, true);
        v_0.a(59860, "the best pairs of colors will win the pot.", this.a, 0, 0xFFFFFF, false, true);
        v_0.a(59861, "", this.a, 0, 0xFFFFFF, false, true);
        v_0.a(59862, "If anyone plants a white or black flower (rare chance) a", this.a, 0, 0xFFFFFF, false, true);
        v_0.a(59863, "\"replant\" will occur and the game will auto-restart.", this.a, 0, 0xFFFFFF, false, true);
        v_0.a(59864, "", this.a, 0, 0xFFFFFF, false, true);
        v_0.a(59865, "<col=8B88FF><img=6> Safety:@whi@ If you logout or DC during the game, your", this.a, 0, 0xFFFFFF, false, true);
        v_0.a(59866, "player will stay logged in until the game is complete.", this.a, 0, 0xFFFFFF, false, true);
        v_0.a(59867, "The server will continue planting flowers for you.", this.a, 0, 0xFFFFFF, false, true);
        e2.k(35);
        e2.b(0, 59836, 13, 4);
        e2.b(1, 59837, 18, 48);
        e2.b(2, 59839, 341, 48);
        e2.b(3, 65418, 477, 22);
        e2.b(4, 65419, 477, 22);
        e2.b(5, 59841, 242, 67);
        e2.b(6, 59842, 241, 119);
        e2.b(7, 59843, 259, 153);
        e2.b(8, 59844, 22, 180);
        e2.b(9, 59845, 202, 180);
        e2.b(10, 59846, 23, 23);
        e2.b(11, 59847, 23, 204);
        e2.b(12, 59848, 23, 224);
        e2.b(13, 59849, 23, 244);
        e2.b(14, 59850, 23, 264);
        e2.b(15, 59851, 23, 284);
        e2.b(16, 59852, 23, 304);
        e2.b(17, 59853, 45, 206);
        e2.b(18, 59854, 45, 226);
        e2.b(19, 59855, 45, 246);
        e2.b(20, 59856, 45, 266);
        e2.b(21, 59857, 45, 286);
        e2.b(22, 59858, 45, 306);
        e2.b(23, 59859, 202, 206);
        e2.b(24, 59860, 202, 218);
        e2.b(25, 59861, 202, 230);
        e2.b(26, 59862, 202, 242);
        e2.b(27, 59863, 202, 254);
        e2.b(28, 59864, 202, 266);
        e2.b(29, 59865, 202, 278);
        e2.b(30, 59866, 202, 290);
        e2.b(31, 59867, 202, 302);
        e2.b(32, 59830, 21, 165);
        e2.b(33, 59831, 490, 165);
        e2.b(34, 59832, 256, 165);
        for (int i2 = 1; i2 < 32; ++i2) {
            int n2 = i2;
            e2.bc[n2] = e2.bc[n2] - 9;
            if (e2.al[i2] > 60000 || e2.al[i2] < 59844 || e2.al[i2] == 59846) continue;
            int n3 = i2;
            e2.bc[n3] = e2.bc[n3] + 13;
        }
    }

    public void i() {
        e e2 = v_0.d(59868);
        v_0.c(59869, 3, "gambling/SPRITE");
        e e3 = v_0.d(59870);
        e3.k(1);
        v_0.a(59871, "Your offer", this.a, 0, 0xFFFFFF, true, true);
        e3.b(0, 59871, 70, 5);
        e e4 = v_0.d(59872);
        e4.k(1);
        v_0.a(59873, "Their offer", this.a, 0, 0xFFFFFF, true, true);
        e4.b(0, 59873, 70, 5);
        e3.aH = 450;
        e4.aH = 450;
        e3.P = 140;
        e4.P = 140;
        e3.aR = 200;
        e4.aR = 200;
        e3.bj = 87;
        e4.bj = 87;
        v_0.a(59874, "Accept", "Accept this offer", this.a, 0, 65280, false, false, 50);
        v_0.a(59875, "Decline", "Decline this offer", this.a, 0, 0xFF0000, false, false, 50);
        v_0.a(59876, "Are you sure you want to play this? Read carefully!", this.a, 2, 0xFFFFFF, false, true);
        v_0.a(59877, "You'll be playing..", this.a, 2, 16751360, false, true);
        v_0.a(59878, "55x2 (P1 host)", this.a, 1, 16751360, true, false);
        v_0.a(59879, "Waiting for other player..", this.a, 0, 0xFFFFFF, true, true);
        e2.k(11);
        int n2 = 40;
        e2.b(0, 59869, 13, 13 + n2);
        e2.b(1, 59870, 16, 48 + n2);
        e2.b(2, 59872, 339, 48 + n2);
        e2.b(3, 65418, 477, 22 + n2);
        e2.b(4, 65419, 477, 22 + n2);
        e2.b(5, 59874, 242, 67 + n2);
        e2.b(6, 59875, 241, 119 + n2);
        e2.b(7, 59876, 23, 23 + n2);
        e2.b(8, 59877, 198, 180 + n2);
        e2.b(9, 59878, 256, 216 + n2);
        e2.b(10, 59879, 258, 192);
    }

    private e m(int n2) {
        e e2 = v_0.H[n2] = new e();
        e2.W = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", "Remove X"};
        e2.K = new int[20];
        e2.ax = new int[30];
        e2.az = new int[30];
        e2.as = new int[20];
        e2.al = new int[0];
        e2.am = new int[0];
        e2.bc = new int[0];
        for (int i2 = 0; i2 < 28; ++i2) {
            e2.az[i2] = 995;
            e2.ax[i2] = i2 + 1;
        }
        e2.t = true;
        e2.ac = 12;
        e2.ap = 12;
        e2.aR = 10;
        e2.P = 3;
        e2.aw = n2;
        e2.aI = 2;
        return e2;
    }

    static {
        bI = new w_0();
        bJ = new x_0();
    }
}

