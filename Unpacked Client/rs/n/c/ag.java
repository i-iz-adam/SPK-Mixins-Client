/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.c.ah;
import rs.n.e;
import rs.q.a.a.a;

public class ag
extends c {
    public static f_0 c;
    public static final Set<Integer> d;
    public static a e;

    public ag(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        rs.n.c.ag.b(this.a);
        rs.n.c.ag.c(this.a);
    }

    public static void b(k_0[] k_0Array) {
        c = new f_0("icons/death");
        e e2 = rs.n.c.ag.d(17115);
        rs.n.c.ag.a(17109, "", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17110, "At the moment nearly all", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17111, "items are tradeable", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17112, "and can be lost on death.", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17113, "", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17114, "If you are red-skulled,", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17117, "you will lose all your", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17118, "items regardless of", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17119, "what you are praying.", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17120, "", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17121, "", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17122, "", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17123, "", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17124, "", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17125, "", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17126, "", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17127, "", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17128, "", k_0Array, 0, 16750623);
        rs.n.c.ag.a(17129, "", k_0Array, 0, 16750623);
        e2.ah = 17115;
        e2.aw = 17115;
        e2.aI = 0;
        e2.M = 0;
        e2.J = 0;
        e2.P = 130;
        e2.aR = 197;
        e2.aC = 0;
        e2.ab = -1;
        e2.aH = 280;
        e2.al = new int[19];
        e2.am = new int[19];
        e2.bc = new int[19];
        e2.al[0] = 17109;
        e2.am[0] = 0;
        e2.bc[0] = 0;
        e2.al[1] = 17110;
        e2.am[1] = 0;
        e2.bc[1] = 12;
        e2.al[2] = 17111;
        e2.am[2] = 0;
        e2.bc[2] = 24;
        e2.al[3] = 17112;
        e2.am[3] = 0;
        e2.bc[3] = 36;
        e2.al[4] = 17113;
        e2.am[4] = 0;
        e2.bc[4] = 48;
        e2.al[5] = 17114;
        e2.am[5] = 0;
        e2.bc[5] = 60;
        e2.al[6] = 17117;
        e2.am[6] = 0;
        e2.bc[6] = 72;
        e2.al[7] = 17118;
        e2.am[7] = 0;
        e2.bc[7] = 84;
        e2.al[8] = 17119;
        e2.am[8] = 0;
        e2.bc[8] = 96;
        e2.al[9] = 17120;
        e2.am[9] = 0;
        e2.bc[9] = 108;
        e2.al[10] = 17121;
        e2.am[10] = 0;
        e2.bc[10] = 120;
        e2.al[11] = 17122;
        e2.am[11] = 0;
        e2.bc[11] = 132;
        e2.al[12] = 17123;
        e2.am[12] = 0;
        e2.bc[12] = 144;
        e2.al[13] = 17124;
        e2.am[13] = 0;
        e2.bc[13] = 156;
        e2.al[14] = 17125;
        e2.am[14] = 0;
        e2.bc[14] = 168;
        e2.al[15] = 17126;
        e2.am[15] = 0;
        e2.bc[15] = 180;
        e2.al[16] = 17127;
        e2.am[16] = 0;
        e2.bc[16] = 192;
        e2.al[17] = 17128;
        e2.am[17] = 0;
        e2.bc[17] = 204;
        e2.al[18] = 17129;
        e2.am[18] = 0;
        e2.bc[18] = 216;
    }

    public static void c(k_0[] k_0Array) {
        e e2 = rs.n.c.ag.d(17100);
        rs.n.c.ag.d(17101, 2, 2);
        rs.n.c.ag.a(17102, 3, 0, 10601, 1, "equipment/SPRITE", 17, 17, "Close Window");
        rs.n.c.ag.a(10601, 3, "equipment/SPRITE", 17, 17, 10602);
        rs.n.c.ag.a(17103, "Items kept on death", k_0Array, 2, 16750623);
        rs.n.c.ag.a(17104, "Items I will keep...", k_0Array, 1, 16750623);
        rs.n.c.ag.a(17105, "Items I will lose...", k_0Array, 1, 16750623);
        rs.n.c.ag.a(17106, "Info", k_0Array, 1, 16750623);
        rs.n.c.ag.a(17107, "Items I will auto-keep...", k_0Array, 1, 16750623);
        rs.n.c.ag.a(17108, true);
        int n2 = rs.n.e.H[10600].az.length;
        rs.n.e.H[17108].az = new int[n2];
        rs.n.e.H[17108].ax = new int[n2];
        rs.n.e.H[17108].K = new int[n2];
        rs.n.e.H[17108].as = new int[n2];
        rs.n.e.H[17108].ac = rs.n.e.H[10600].ac + 3;
        rs.n.e.H[17108].ap = rs.n.e.H[10600].ap;
        rs.n.e.H[17108].P = rs.n.e.H[10600].P;
        rs.n.e.H[17108].aR = rs.n.e.H[10600].aR;
        e e3 = rs.n.c.ag.d(17130);
        e3.aH = 75;
        e3.P = 290;
        e3.aR = 50;
        e3.bj = 87;
        e3.k(1);
        e3.b(0, 17108, 0, 9);
        e2.aH = 0;
        e2.aQ = false;
        e2.al = new int[12];
        e2.am = new int[12];
        e2.bc = new int[12];
        e2.al[0] = 17101;
        e2.am[0] = 7;
        e2.bc[0] = 8;
        e2.al[1] = 17102;
        e2.am[1] = 480;
        e2.bc[1] = 17;
        e2.al[2] = 17103;
        e2.am[2] = 185;
        e2.bc[2] = 18;
        e2.al[3] = 17104;
        e2.am[3] = 22;
        e2.bc[3] = 50;
        e2.al[4] = 17105;
        e2.am[4] = 22;
        e2.bc[4] = 170;
        e2.al[5] = 17106;
        e2.am[5] = 347;
        e2.bc[5] = 47;
        e2.al[6] = 17107;
        e2.am[6] = 22;
        e2.bc[6] = 110;
        e2.al[7] = 17130;
        e2.am[7] = 24;
        e2.bc[7] = 124;
        e2.al[8] = 17115;
        e2.am[8] = 348;
        e2.bc[8] = 64;
        e2.al[9] = 10494;
        e2.am[9] = 26;
        e2.bc[9] = 74;
        e2.al[10] = 10600;
        e2.am[10] = 26;
        e2.bc[10] = 193;
        e2.al[11] = 10601;
        e2.am[11] = 480;
        e2.bc[11] = 17;
    }

    static {
        d = ConcurrentHashMap.newKeySet();
        e = new ah();
    }
}

