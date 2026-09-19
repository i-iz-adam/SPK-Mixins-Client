/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.c;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import rs.Client;
import rs.l.f.a;
import rs.l.f.e;
import rs.l.f.g;
import rs.l.f.l;
import rs.l.f_0;

public class c
extends g {
    private static final int T = 1;
    private static final Dimension U = new Dimension();
    private static final Dimension V = new Dimension(142, 14);
    private static final Dimension W = new Dimension(190, 46);
    private static final Dimension X = new Dimension(190, 84);
    private static final Dimension Y = new Dimension(190, 31);
    private static final Dimension Z = new Dimension(190, 65);
    private static final String aa = "None";
    private static final String ab = "Searching";
    private static final String ac = "Searching.";
    private static final String ad = "Searching..";
    private static final String ae = "Searching...";
    public f_0 r;
    public f_0 s;
    public f_0 t;
    public f_0 u;
    public f_0 v;
    public f_0 w;
    public f_0 x;
    public f_0 y;
    public f_0[] z;
    public f_0[] A;
    private boolean af = true;
    public boolean B = false;
    public boolean C = false;
    public boolean D = true;
    public boolean E = false;
    public boolean F = false;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    private int ag;
    private int ah;
    public long R;
    public long S;

    public c() {
        this.a("BountyOverlay");
        this.a(rs.l.f.a.q);
        this.j(true);
        this.c(rs.l.f.a.A);
        this.a(rs.l.f.l.e);
        this.a(10.0f);
        this.e.a(new Rectangle(2, 2, 2, 2));
        this.e.b(new Point(0, 2));
        this.U();
        this.c(false);
    }

    @Override
    public Dimension a(Graphics2D graphics2D) {
        String string;
        block28: {
            block27: {
                if (!this.af) {
                    return U;
                }
                if (!rs.f.a.bo) break block27;
                if (Client.ed == 197) break block28;
            }
            return U;
        }
        this.ag = this.f.x;
        this.ah = this.f.y;
        if (this.C) {
            this.w.c(this.ag + rs.l.f.a.c.c.V.width - 13, this.ah);
            this.a(V);
            return this.j;
        }
        boolean bl = this.O();
        if (this.E) {
            (bl ? this.u : this.v).c(this.ag, this.ah);
        } else {
            (bl ? this.t : this.s).c(this.ag, this.ah);
        }
        String string2 = ab;
        if (Client.ff % 200 < 50) {
            string2 = ac;
        } else if (Client.ff % 200 >= 50 && Client.ff % 200 < 100) {
            string2 = ad;
        } else if (Client.ff % 200 >= 100 && Client.ff % 200 < 150) {
            string2 = ae;
        }
        boolean bl2 = this.I != null;
        String string3 = this.G == null ? aa : this.G;
        String string4 = this.H == null ? aa : this.H;
        String string5 = string = this.I == null ? string2 : this.I;
        if (bl) {
            if (bl2) {
                this.a.gm.b(string3, this.ag + 17, this.ah + 15, 12171349, 0);
                Client.gl.a("<img=303> <yoff=1>" + string4, this.ag + 187, this.ah + 14 + 13, 16750623, 0);
                Client.gl.b(string, this.ag + 20, this.ah + 14 + 16, 2096965, 0);
                if (this.y != null) {
                    this.y.c(this.ag + 150, this.ah + 5);
                }
            } else {
                this.a.gm.b(string2, this.ag + 66, this.ah + 20, 12171349, 0);
            }
            if (this.L()) {
                int n2 = -15;
                this.r.c(this.ag + 20, this.ah + 50 + n2);
                Client.gl.b("<u=16777215>@whi@" + this.J, this.ag + 25, this.ah + 63 + n2, 0xFFFF1F, 0);
                Client.gl.b("Kills: @whi@" + this.K, this.ag + 25, this.ah + 63 + 12 + 3 + n2, 0xFFFF1F, 0);
                Client.gl.b("Time Left: @whi@" + Client.d(this.R - System.currentTimeMillis()), this.ag + 25 + 60, this.ah + 63 + 12 + 3 + n2, 0xFFFF1F, 0);
                this.a(Z);
            } else {
                this.a(Y);
            }
            return this.j;
        }
        Client.gl.c("Risk: " + string4, this.ag + 45, this.ah + 42, 0xFFFF1F, 0);
        Client.gl.c("Target:", this.ag + 140, this.ah + 13, 0xFFFF1F, 0);
        this.a.gm.c(string3, this.ag + 139, this.ah + 26, 0xFFFFFF, 0);
        Client.gl.c(string, this.ag + 138, this.ah + 41, 2096965, 0);
        int n3 = this.G == null ? 0 : this.L;
        int n4 = 32;
        if (n3 > 0) {
            int n5 = 0;
            if (n3 == 9) {
                n5 += 2;
            }
            if (n3 == 8) {
                ++n5;
            }
            if (n3 == 3) {
                n5 += 3;
            }
            if (n3 == 2) {
                n5 += 2;
            }
            this.A[n3 - 1].c(this.ag + 14, this.ah + n5);
            n4 += 14;
            Client.gl.c("" + n3, this.ag + 30, this.ah + 30, 0xFFFF1F, 0);
        }
        this.z[this.M].c(this.ag + n4, this.ah + 10);
        if (this.y != null) {
            this.y.c(this.ag + n4 + 32, this.ah + 10);
        }
        if (this.L()) {
            this.a(X);
            this.r.c(this.ag + 20, this.ah + 50);
            Client.gl.b("<u=16777215>@whi@" + this.J, this.ag + 25, this.ah + 63, 0xFFFF1F, 0);
            Client.gl.b("Kills: @whi@" + this.K, this.ag + 25, this.ah + 63 + 12 + 3, 0xFFFF1F, 0);
            Client.gl.b("Time Left: @whi@" + Client.d(this.R - System.currentTimeMillis()), this.ag + 25 + 60, this.ah + 63 + 12 + 3, 0xFFFF1F, 0);
        } else {
            this.a(W);
        }
        return this.j;
    }

    @Override
    public void m() {
        if (this.P()) {
            rs.l.f.e.d().f().a(this.C ? "Maximize" : "Minimize", false);
        } else if (this.Q()) {
            rs.l.f.e.d().f().a(this.J != null ? "Hide/show task" : "Receive task", false);
        } else if (this.T()) {
            rs.l.f.e.d().f().a("Task info", false);
        } else if (this.R()) {
            rs.l.f.e.d().f().a("Skip target", false);
        } else if (this.S()) {
            rs.l.f.e.d().f().a("Skip bounty hunter task", false);
        }
    }

    @Override
    public boolean n() {
        this.ag = this.f.x;
        this.ah = this.f.y;
        if (this.P()) {
            rs.h.c.a(() -> {
                this.C = !this.C;
            });
        } else if (this.Q()) {
            rs.h.c.a(() -> {
                if (this.J != null) {
                    this.D = !this.D;
                } else {
                    rs.n.a.a("::bhtask");
                }
            });
        } else if (this.R()) {
            rs.h.c.a(() -> rs.n.a.a("::skipbh"));
        } else if (this.S()) {
            rs.h.c.a(() -> rs.n.a.a("::bhtaskskip"));
        } else if (this.T()) {
            rs.h.c.a(() -> rs.n.a.a("::bhtaskinfo"));
        } else {
            return false;
        }
        return true;
    }

    private boolean O() {
        return rs.f.a.as;
    }

    private boolean P() {
        if (this.C) {
            return Client.hP >= this.ag + rs.l.f.a.c.c.V.width - 14 && Client.hP <= this.ag + rs.l.f.a.c.c.V.width && Client.hQ >= this.ah && Client.hQ <= this.ah + 13;
        }
        return Client.hP >= this.ag && Client.hP <= this.ag + 14 && Client.hQ >= this.ah && Client.hQ <= this.ah + 13;
    }

    private boolean Q() {
        int n2 = 0;
        boolean bl = false;
        if (this.O()) {
            this.ah += 5;
        }
        return this.af && !this.C && Client.hP >= this.ag && Client.hP <= this.ag + 14 && Client.hQ >= this.ah + 12 + n2 && Client.hQ <= this.ah + 26 + n2;
    }

    private boolean R() {
        int n2 = this.ag + 166;
        int n3 = this.ah;
        return this.af && !this.C && Client.hP >= n2 && Client.hP <= n2 + 21 && Client.hQ >= n3 && Client.hQ <= n3 + 16;
    }

    private boolean S() {
        int n2 = this.ag + 166;
        int n3 = this.ah + 52;
        if (this.O()) {
            n3 -= 17;
        }
        return this.af && !this.C && this.L() && Client.hP >= n2 && Client.hP <= n2 + 21 && Client.hQ >= n3 && Client.hQ <= n3 + 16;
    }

    private boolean T() {
        int n2 = this.ag + 166;
        int n3 = this.ah + 52 + 17;
        if (this.O()) {
            n3 -= 15;
        }
        return this.af && !this.C && this.L() && Client.hP >= n2 && Client.hP <= n2 + 21 && Client.hQ >= n3 && Client.hQ <= n3 + 16;
    }

    public boolean L() {
        return this.D && this.J != null;
    }

    public boolean M() {
        return rs.n.e.H[199].at.equals("@or1@3-126") || rs.n.e.H[199].at.contains("Tourney") || rs.n.e.H[199].at.contains("@or1@PvP") || rs.n.e.H[199].at.contains("LMS") || rs.n.e.H[199].at.contains("War") || rs.n.e.H[199].at.contains("HG");
    }

    private void U() {
        int n2;
        this.r = new f_0("popups/bh record bg");
        this.s = new f_0("popups/bh target bg");
        this.t = new f_0("popups/bhcompact1");
        this.u = new f_0("popups/bhcompact2");
        this.v = new f_0("popups/bh target bg cursed");
        this.w = new f_0("popups/bh maximimize");
        this.x = new f_0("popups/bh combat");
        this.z = new f_0[8];
        this.A = new f_0[10];
        this.y = null;
        this.R = 0L;
        this.E = false;
        for (n2 = 0; n2 < this.z.length; ++n2) {
            this.z[n2] = new f_0("popups/bh skull" + n2);
        }
        for (n2 = 0; n2 < 10; ++n2) {
            this.A[n2] = new f_0("popups/t" + (n2 + 1));
        }
    }

    public void k(boolean bl) {
        this.af = bl;
    }

    public boolean N() {
        return this.af;
    }
}

