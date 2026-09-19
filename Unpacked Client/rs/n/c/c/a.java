/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.c;

import rs.l.f_0;
import rs.l.k_0;
import rs.n.a.d;
import rs.n.a.f;
import rs.n.c.c.b;
import rs.n.c.c.c;
import rs.n.e;

public class a
extends rs.n.c {
    public static rs.n.d.c c;
    public static rs.n.d.c d;
    public static final int e = 32019;
    static final int f = 32020;
    static final int g = 32021;
    static final int bI = 32022;
    static final int bJ = 32023;
    static final int bK = 32024;
    static final int bL = 32025;
    static final int bM = 32026;
    static final int bN = 32165;
    static final int bO = 32166;
    static final int bP = 32167;
    static final int bQ = 32168;
    static final int bR = 32169;
    static final int bS = 32170;
    static final int bT = 32175;
    static final int bU = 32176;
    static final int bV = 32177;
    static final int bW = 32178;
    static final int bX = 32181;
    static final int bY = 32184;
    static final int bZ = 32185;
    static final int ca = 32188;
    static f_0 cb;
    static f_0 cc;
    static f_0 cd;
    static f_0 ce;
    public static int cf;
    private static final b cg;
    private static final c ch;

    public a(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        cb = new f_0(true, "misc/mail 4");
        cc = new f_0(true, "misc/mail 5");
        cd = new f_0(true, "misc/mail 11");
        ce = new f_0(true, "misc/mail 12");
        e e2 = rs.n.c.c.a.d(32019);
        c = new rs.n.d.c(e2);
        c.a(rs.n.a.e.a(32020, "misc/mail 1").a()).a(3, 2);
        c.a(rs.n.a.f.a(32021, "No mail message selected!").i().b().m(12171349)).a(32020, 337, 154);
        c.a(rs.n.a.f.a(32022, "Inbox (35 / 35)").j().m(16750623)).a(32020, 52, 11);
        rs.n.a.a.b(32185, "misc/refresh 1", "").a(32186, "misc/refresh 2");
        c.a(32185).a(32020, 8, 8);
        c.a(32186).a(32020, 8, 8);
        d d2 = rs.n.a.d.f(32023, 134, 288);
        d = new rs.n.d.c(d2);
        d.a();
        cg.a();
        for (int i2 = 0; i2 < 35; ++i2) {
            cg.a(b.a.a, "Test message #" + i2);
        }
        cg.b();
        c.a(32023).a(32020, 8, 35);
        c.a(rs.n.a.e.a(32166, "misc/mail 2")).a(32020, 163, 8);
        c.a(rs.n.a.f.a(32168, "Mail Subject").j().m(16750623)).a(32166, 171, 13);
        c.a(rs.n.a.f.a(32169, "<img=37> Sent 'x' time ago (Expires in 'x' time)").i().m(12171349)).a(32166, 169, 36);
        c.a(rs.n.a.a.b(32184, "misc/mail 6", "Delete this message").a()).a(32166, 472, 31);
        c.a(57016).a(32020, 162, 57);
        c.a(rs.n.a.e.a(32167, "misc/mail 3")).a(32020, 163, 241);
        c.a(rs.n.a.f.a(32170, "<img=209> Items / Rewards").j().m(16750623)).a(32167, 171, 254);
        d d3 = rs.n.a.d.f(32177, 321, 44);
        rs.n.a.c c2 = rs.n.a.c.g(32175, 28).a(7);
        rs.n.d.c c3 = new rs.n.d.c(d3);
        c3.a(c2).a(5, 7);
        c3.a();
        c.a(d3).a(32167, 167, 280);
        c.a(rs.n.a.e.a(32188, "misc/mail 10").a()).a(32167, 167, 280);
        rs.n.c.c.a.l((int)32188).bf = false;
        c.a(rs.n.a.f.a(32176, "No items attached to this message!").i().m(12171349).b()).a(32167, 341, 295);
        rs.n.a.a.b(32181, "bank/bank 17", "Deposit items to inventory").a(32182, "bank/bank 18");
        c.a(32181).a(32167, 428, 249);
        c.a(32182).a(32167, 428, 249);
        rs.n.a.a.b(32178, "bank/bank 31", "Deposit items to bank").a(32179, "bank/bank 32");
        c.a(32178).a(32167, 466, 249);
        c.a(32179).a(32167, 466, 249);
        ch.a(c.a.c);
        ch.b();
        c.a(63740).a(32020, 485, 8);
        c.a(63741).a(32020, 485, 8);
        c.a();
    }

    public static b h() {
        return cg;
    }

    public static c i() {
        return ch;
    }

    static {
        cf = 184;
        cg = new b();
        ch = new c();
    }
}

