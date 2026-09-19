/*
 * Decompiled with CFR 0.152.
 */
package rs.l.d;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import rs.Client;
import rs.gui.Launcher;
import rs.l.b;
import rs.l.d.d;
import rs.l.d.e;
import rs.l.f_0;
import rs.l.g;
import rs.o_0;

public class c
implements Runnable {
    private static final String k = "/assets/";
    public static boolean a = true;
    public static boolean b = true;
    private static final int l = 25;
    private static final int m = 125;
    private static final int n = 405;
    private static final int o = 280;
    private static final int p = 130;
    private static final int q = 50;
    private static final int r = 82;
    private static final int s = 10;
    public static int c = 225;
    public static int d = 75;
    public static final int e = 0;
    public static final String f = "@or1@";
    public static final String g = "@yel@";
    public static final Color h = new Color(34, 255, 0);
    public static final Color[] i = new Color[]{Color.WHITE, Color.YELLOW};
    private List<rs.l.d.a> t = new ArrayList<rs.l.d.a>();
    private a u;
    private Client v;
    private rs.l.d.b w;
    private rs.l.d.b x;
    private rs.l.d.b y;
    private rs.l.d.b z;
    private int A;
    private boolean B;
    private String C;
    private f_0 D;
    private f_0 E;
    private f_0 F;
    private f_0 G;
    private f_0 H;
    private f_0 I;
    private b J;
    private g K;
    private g L;
    private g M;
    private g N;
    private g O;
    private g P;
    private g Q;
    private g R;
    private g S;
    private String T;
    private String U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private int ae;
    private int af;
    private int ag = 0;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    public boolean j = false;
    private boolean al;
    private String am = null;
    private String an = null;
    private String ao = null;
    private boolean ap = true;
    private long aq = System.currentTimeMillis();
    private int ar = 3;
    private int as = 410;
    private int at = 0;
    private boolean au = false;
    private int av;

    public c(Client client) {
        String string = !h.equals(new Color(34, 255, 0)) ? "custom/" : "";
        this.u = rs.l.d.c$a.a;
        this.U = "@or1@Login";
        this.T = "@or1@Exit";
        this.v = client;
        this.aa = true;
        this.ab = true;
        this.J = new b(new f_0(k, "bg"), new f_0(k, "bg 2"), 6);
        this.I = new f_0(k, "glow");
        f_0 f_02 = new f_0(k + string, "textbox 2", new Color(34, 255, 0), h);
        f_02 = new f_0(k, "textbox");
        this.O = new g(client, new f_0(k, "textbox"), new f_0(k + string, "textbox 2", new Color(34, 255, 0), h), 50, 2);
        this.P = new g(client, new f_0(k, "textbox"), new f_0(k + string, "textbox 2", new Color(34, 255, 0), h), 50, 2);
        this.R = new g(client, new f_0(k, "textbox"), new f_0(k + string, "textbox 2", new Color(34, 255, 0), h), 50, 2);
        this.Q = new g(client, new f_0(k, "textbox"), new f_0(k + string, "textbox 2", new Color(34, 255, 0), h), 50, 2);
        f_0 f_03 = new f_0(k + string, "button", new Color(34, 255, 0), h);
        f_03 = new f_0(k + string, "button", new Color(34, 255, 0), h);
        f_03.c(255, 255, 255);
        f_02 = new f_0(k + string, "button 2", new Color(34, 255, 0), h);
        this.L = new g(client, f_03, new f_0(k + string, "button 2", new Color(34, 255, 0), h), 85, 4);
        this.M = new g(client, f_03, new f_0(k + string, "button 2", new Color(34, 255, 0), h), 85, 4);
        this.K = new g(client, new f_0(k, "box"), new f_0(k, "box 2"), 85, 4);
        f_02 = new f_0(k + string, "box 3", new Color(34, 255, 0), h);
        this.N = new g(client, new f_0(k, "box 2"), new f_0(k + string, "box 3", new Color(34, 255, 0), h), 85, 4);
        this.S = new g(client, new f_0(k, "updatebar"), new f_0(k, "updatebar2"), 45, 1);
        Color color = new Color(71, 213, 71);
        Color color2 = new Color(34, 255, 0).equals(h) ? color : h;
        f_0 f_04 = new f_0(k + string, "loadbar", color, color2);
        this.E = new f_0(k + string, "loadbar", color, color2);
        this.G = new f_0(k, "newsbar");
        this.H = new f_0(k, "updatebaricon");
        this.D = new f_0(k, "messagebox");
        this.F = new f_0(k, "loadframe");
        this.z = new rs.l.d.b(client, this.D, "It will be your account's PIN before October 2024", "If you do not remember it, request help on our forums!", false);
    }

    @Override
    public void run() {
        if (!rs.l.b.a.d.c) {
            Launcher.n().i().addMouseListener(new d(this));
        }
        while (true) {
            if (this.v == null || !a) {
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                continue;
            }
            this.a();
        }
    }

    public void a() {
        try {
            if (a) {
                if (Client.bR || Client.i) {
                    // empty if block
                }
                if (!this.v.fc && !this.v.bZ) {
                    this.al = true;
                    if (!this.v.bt) {
                        this.b();
                    }
                } else if (this.al) {
                    this.w = null;
                    this.al = false;
                }
                try {
                    Thread.sleep(25L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            } else {
                this.b();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void d() {
        boolean bl;
        this.J.a(0, 0);
        this.I.g(0, 0, this.at);
        boolean bl2 = bl = Client.ff % 3 == 0;
        if (this.au) {
            if (bl) {
                this.at -= 2;
            }
            if (this.at <= 0) {
                this.at = 0;
                this.au = false;
            }
        } else {
            if (bl) {
                ++this.at;
            }
            if (this.at >= 100) {
                this.au = true;
            }
        }
        if (this.t.size() == 0) {
            int n2 = 0;
            int n3 = 0;
            int n4 = 75;
            for (int i2 = 0; i2 < n4; ++i2) {
                f_0 f_02 = new f_0(k, "orb 1");
                if ((n2 += 200) >= this.v.hE) {
                    n3 += Client.c(0, f_02.o * 2);
                    n2 = Client.c(0, f_02.n * 2);
                }
                this.t.add(new rs.l.d.a(this.v, n2, n3, i2 * 2048 / n4));
            }
        }
        for (rs.l.d.a a2 : this.t) {
            if (a2.c() != 1) continue;
            this.a(a2);
        }
        this.g();
        if (this.A == 0 && this.C != null) {
            this.A = (int)((double)this.C.length() * 3.75);
        }
        this.W = 480;
        if (this.V < -1 * this.A) {
            this.V = 800;
        }
        --this.V;
        this.G.c(0, this.W - 18);
        if (Client.gl != null) {
            Client.gl.b(this.C, this.V, this.W, 0xFFFFFF, 0);
        }
        for (rs.l.d.a a3 : this.t) {
            if (a3.c() != 2) continue;
            this.a(a3);
        }
        if (this.v.gn != null && this.v.gm != null) {
            if (this.am != null) {
                if (rs.f.a.bg.equals(this.ao)) {
                    this.ap = false;
                } else {
                    if (System.currentTimeMillis() - this.aq >= 5000L || this.S.c() == 0 && !this.ap || this.S.c() >= this.S.d() - 1 && this.ap) {
                        this.ap = !this.ap;
                        this.aq = System.currentTimeMillis();
                    }
                    if (this.S.b(this.ar, this.as)) {
                        this.aq = System.currentTimeMillis() - 10000L;
                        this.ap = true;
                    }
                }
                this.S.a(this.ar, this.as, this.ap || this.S.b(this.ar, this.as));
                this.H.f(this.ar + 2, this.as + 2);
                this.v.gn.b("@or2@<u=16742912>Latest Update</u> <img=329>", this.ar + 50, this.as + 15 + 2, 0xFFFFFF, 0);
                this.v.gm.b(this.am, this.ar + 50, this.as + 34 + 2, 0xFFFFFF, 0);
            } else {
                this.S.a(this.ar, this.as, false);
                this.H.f(this.ar + 2, this.as + 2);
                this.v.gn.b("@or2@<u=16742912>Latest Update", this.ar + 50, this.as + 15 + 2, 0xFFFFFF, 0);
                this.v.gm.b("<img=291> Loading..", this.ar + 50, this.as + 34 + 2, 0xFFFFFF, 0);
            }
        }
    }

    public void b() {
        int n2;
        int n3;
        this.h();
        this.e();
        if (!this.aa && this.Y != 62 && this.Y != 125) {
            return;
        }
        if (rs.l.b.a.d.c) {
            if (this.u == rs.l.d.c$a.a) {
                this.v.w();
                this.v.gZ.a();
                int n4 = 145;
                int n5 = 200;
                if (this.x != null) {
                    this.x.a(n4 + 80);
                    this.x.b(n5 - 65);
                    this.x.b();
                }
                this.F.c(n4, n5);
                int n6 = (int)((double)this.E.n * ((double)this.X / 100.0));
                this.E.a(n4, n5, n6, this.E.o);
                this.v.gZ.a(0, this.v.hG, 0);
                this.aa = true;
            } else {
                if (rs.l.b.a.d.b == null) {
                    rs.l.b.a.d.b = new rs.l.b.a.d(this.v);
                }
                rs.l.b.a.d.b.d();
            }
            return;
        }
        this.v.w();
        this.v.gZ.a();
        this.d();
        if (this.u == rs.l.d.c$a.a) {
            n3 = 145;
            n2 = 200;
            if (this.x != null) {
                this.x.a(n3 + 80);
                this.x.b(n2 - 65);
                this.x.b();
            }
            this.F.c(n3, n2);
            int n7 = (int)((double)this.E.n * ((double)this.X / 100.0));
            this.E.a(n3, n2, n7, this.E.o - 5);
        } else {
            n3 = 280;
            n2 = 130;
            Object object = this.v.fk;
            Object object2 = o_0.e(this.v.fl);
            Object object3 = Client.fn;
            Object object4 = this.v.fm;
            if (this.w != null && this.w.c()) {
                if (b) {
                    this.w.b(d);
                    this.w.a(c);
                } else {
                    this.w.b(200);
                    this.w.a(225);
                }
                this.w.b();
            }
            if (b) {
                int n8;
                if (this.Y <= 62 && this.ab) {
                    if (this.v.fD == 0) {
                        object = (String)object + "@yel@|";
                    } else if (this.v.fD == 1) {
                        object2 = (String)object2 + "@yel@|";
                    } else if (this.v.fD == 2) {
                        object3 = (String)object3 + "<col=@or1@>|";
                    } else if (this.v.fD == 3) {
                        object4 = (String)object4 + "@yel@|";
                    }
                }
                n2 += 0;
                int n9 = n8 = rs.f.a.h != false ? 70 : 80;
                if (this.j) {
                    int n10 = 75;
                    this.Q.a(n3, n2 + n10, this.v.fD == 3);
                    this.v.gm.b("@or1@<img=144> 5-digit PIN:", n3 + 10, n2 + 16 + n10, 0xFFFFFF, 0);
                    this.v.gm.b("@whi@" + (String)object4, n3 + 10, n2 + 44 + n10, 0xFFFFFF, 0);
                    this.z.b(135);
                    this.z.b();
                } else {
                    this.O.a(n3, n2, this.v.fD == 0);
                    this.P.a(n3, n2 + n8, this.v.fD == 1);
                    if (rs.f.a.h.booleanValue()) {
                        this.R.a(n3, n2 + n8 + n8, this.v.fD == 2);
                    }
                    this.v.gm.b("@or1@<img=179> Username:", n3 + 10, n2 + 16, 0xFFFFFF, 0);
                    this.v.gm.b("@whi@" + (String)object, n3 + 10, n2 + 44, 0xFFFFFF, 0);
                    this.v.gm.b("@or1@<img=144> Password", n3 + 10, n2 + 16 + n8, 0xFFFFFF, 0);
                    this.v.gm.b("@whi@" + (String)object2, n3 + 10, n2 + 44 + n8, 0xFFFFFF, 0);
                    if (rs.f.a.h.booleanValue()) {
                        this.v.gm.b("<col=@or1@>Invitation code:", n3 + 10, n2 + 16 + n8 + n8, 1048320, 0);
                        this.v.gm.b("@whi@" + (String)object3, n3 + 10, n2 + 44 + n8 + n8, 1048320, 0);
                    }
                }
                this.L.a(n3 += 125, (n2 += 150) + (rs.f.a.h != false ? 60 : 0));
                this.v.gm.b("@or1@Log in", n3 + 30, n2 + 30 + (rs.f.a.h != false ? 60 : 0), 0xFFFFFF, 0);
            }
        }
        for (rs.l.d.a a2 : this.t) {
            if (a2.c() < 3) continue;
            this.a(a2);
        }
        this.v.gZ.a(0, this.v.hG, 0);
        this.aa = true;
    }

    private void e() {
        int n2 = 280 + (rs.f.a.h != false ? 60 : 0);
        this.ai = n2 + 25;
        boolean bl = this.ac = this.u == rs.l.d.c$a.b && b && this.L.b(405, n2);
        if (this.ac) {
            this.ae = this.ae + 10 & 0x7FF;
        }
        this.aj = Client.hP;
        this.ak = Client.hQ;
        boolean bl2 = this.ad = this.u == rs.l.d.c$a.b && b && this.v.bj() && this.aj >= 0 && this.ak >= 0;
        if (this.ad) {
            this.af = this.af + 10 & 0x7FF;
        }
        int n3 = this.v.bk();
        if (this.ad && n3 != this.ah && this.f()) {
            this.ag = (this.ag + 1) % 5;
        }
        this.ah = n3;
    }

    private boolean f() {
        for (rs.l.d.a a2 : this.t) {
            if (!a2.a()) continue;
            return true;
        }
        return false;
    }

    private void a(rs.l.d.a a2) {
        a2.a(this.ac, this.ae, 470, this.ai, 82, this.ad, this.af, this.aj, this.ak, 82, this.ag);
    }

    public void a(int n2, int n3, int n4, int n5, int n6) {
        String string = "@whi@";
        this.T = "@or1@Exit";
        if (n4 >= 281 && n4 <= 330 && n3 >= 273 && n3 <= 400) {
            this.T = string + "Exit";
        }
        if (n2 == 1) {
            if (n4 >= 281 + (rs.f.a.h != false ? 80 : 0) + 0 && n4 <= 330 + (rs.f.a.h != false ? 80 : 0) + 0 && n3 >= 408 && n3 <= 535) {
                this.a(false);
            }
            if (this.am != null && this.an != null && this.S.b(this.ar, this.as)) {
                Client.f(this.an);
                if (this.ao != null) {
                    rs.f.a.bg = this.ao;
                    rs.f.a.d();
                }
            }
            if (this.T.startsWith(string)) {
                // empty if block
            }
            if (!this.j) {
                if (n5 >= 278 && n5 <= 539 && n6 >= 133 && n6 <= 192) {
                    this.v.fD = 0;
                }
                if (n5 >= 278 && n5 <= 539 && n6 >= 210 && n6 <= 266) {
                    this.v.fD = 1;
                }
                if (rs.f.a.h.booleanValue() && n5 >= 278 && n5 <= 539 && n6 >= 290 && n6 <= 346) {
                    this.v.fD = 2;
                }
            }
        }
    }

    public void a(boolean bl) {
        if (this.v.fc) {
            return;
        }
        if (!Launcher.n().f().a("LOGIN_COOLDOWN", 500L)) {
            return;
        }
        this.a("<img=291> Attempting to login to game server", "Please wait..", false);
        this.b();
        this.ab = false;
        this.w = null;
        this.v.el = 0;
        this.v.a(this.v.fk, this.v.fl, bl);
        this.ab = true;
    }

    public void a(int n2) {
        this.z.a("It will be your account's PIN before October 2024", "If you do not remember it, request help on our forums!");
        if (n2 == 0) {
            this.a("This username registered before SPK's Fresh Start!", "@yel@Please enter your Recovery PIN to verify ownership", false);
            this.z.a(false);
            this.z.a();
        } else if (n2 == 1) {
            this.a("@yel@Invalid Recovery PIN!", "Please try again..", true);
            this.z.a(true);
            this.z.a();
        } else if (n2 == 2) {
            this.a("@yel@Invalid Recovery PIN!", "You have exceeded the maximum attempts", true);
            this.z.a(true);
            this.z.a();
            this.z.a("Please try again in a few minutes..", "If you do not remember it, request help on our forums!");
        }
        this.v.fD = 3;
        this.ab = true;
        this.j = true;
    }

    public void a(int n2, String string, String string2) {
        this.X = n2;
        this.x = new rs.l.d.b(this.v, this.D, string, string2, false);
    }

    public void a(String object, String string) {
        if (((String)object).contains("new players")) {
            object = "<img=286> " + (String)object;
            c = 3;
            d = 354;
        } else {
            d = 75;
            c = 225;
        }
        this.w = new rs.l.d.b(this.v, this.D, (String)object, string, true);
    }

    public void a(String object, String string, boolean bl) {
        if (((String)object).contains("new players")) {
            object = "<img=286> " + (String)object;
            c = 0;
            d = 350;
        } else {
            d = 75;
            c = 225;
        }
        this.w = new rs.l.d.b(this.v, this.D, (String)object, string, bl);
    }

    private void g() {
        if (this.C == null && !this.B) {
            e e2 = new e(this);
            e2.start();
            this.B = true;
        }
    }

    private void h() {
        this.Y = this.Y > 0 ? --this.Y : 125;
    }

    public void a(a a2) {
        this.u = a2;
    }

    public boolean c() {
        return this.al;
    }

    static /* synthetic */ Client a(c c2) {
        return c2.v;
    }

    static /* synthetic */ String b(c c2) {
        return c2.am;
    }

    static /* synthetic */ String a(c c2, String string) {
        c2.am = string;
        return c2.am;
    }

    static /* synthetic */ String b(c c2, String string) {
        c2.an = string;
        return c2.an;
    }

    static /* synthetic */ String c(c c2) {
        return c2.an;
    }

    static /* synthetic */ String c(c c2, String string) {
        c2.ao = string;
        return c2.ao;
    }

    static /* synthetic */ String d(c c2) {
        return c2.ao;
    }

    static /* synthetic */ String d(c c2, String string) {
        c2.C = string;
        return c2.C;
    }

    static /* synthetic */ int a(c c2, int n2) {
        c2.A = n2;
        return c2.A;
    }

    static /* synthetic */ String e(c c2) {
        return c2.C;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = rs.l.d.c$a.a();
        }
    }
}

