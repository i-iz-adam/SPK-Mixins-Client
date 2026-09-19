/*
 * Decompiled with CFR 0.152.
 */
package rs.i;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import rs.Client;
import rs.f.a;
import rs.gui.Launcher;
import rs.l.f_0;
import rs.l.h;
import rs.n.d;
import rs.n.e;

public class b {
    private Client l;
    private f_0[] m = new f_0[5];
    public f_0[] a = new f_0[14];
    public f_0[] b = new f_0[29];
    private int n = 1;
    private final int o = 6;
    public f_0 c;
    public f_0 d;
    public f_0 e;
    public f_0 f;
    public f_0 g;
    public boolean h;
    private f_0 p;
    private f_0 q;
    private f_0 r;
    private f_0 s;
    public boolean i;
    private int t = -1;
    private int u = -1;
    private int v = -1;
    private int w = -1;
    private static final int x = 50;
    private static final int y = 100;
    private static final Color z = rs.i.b.c(10159875);
    private static final Color A = rs.i.b.c(2004400);
    private static final Color B = new Color(255, 255, 255, 60);
    private static final String[] C = new String[]{"All", "Game", "Yell", "Public", "Private", "Clan", "Trade", "News"};
    private static final String[] D = new String[]{"On", "Friends", "Off", "Hide", "Filtered"};
    private static final int[] E = new int[]{65280, 0xFFFF00, 0xFF0000, 65535, 0xFFFF00};
    public long j;
    public long k;
    private static final double F = 26.0;
    private static final int G = 27;

    public b(Client client) {
        int n2;
        this.l = client;
        for (n2 = 0; n2 < this.m.length; ++n2) {
            this.m[n2] = new f_0("gameframe/redstone " + n2);
            this.m[n2].c(255, 255, 255);
        }
        for (n2 = 0; n2 < this.a.length; ++n2) {
            this.a[n2] = new f_0("gameframe/icons/icon " + n2);
            this.a[n2].c(255, 255, 255);
        }
        this.p = new f_0("orbs/orb_drain");
        this.q = new f_0("orbs/orb_drain");
        this.r = new f_0("orbs/orb_drain");
        this.s = new f_0("orbs/orb_drain");
        this.f = new f_0("orbs/adventure_orb");
        this.g = new f_0("orbs/adventure_orb_hover");
        this.b[0] = new f_0("orbs/orb_drain");
        this.b[1] = new f_0("orbs/orb_bg");
        this.b[2] = new f_0("orbs/hp_fill");
        this.b[3] = new f_0("orbs/hp_icon");
        this.b[4] = new f_0("orbs/pray_fill");
        this.b[5] = new f_0("orbs/pray_icon");
        this.b[6] = new f_0("orbs/run_fill");
        this.b[7] = new f_0("orbs/run_icon");
        this.b[8] = new f_0("orbs/run_fill_active");
        this.b[9] = new f_0("orbs/run_icon_active");
        this.b[10] = new f_0("orbs/orb_bg_hover");
        this.b[11] = new f_0("orbs/hit_toggle");
        this.b[12] = new f_0("orbs/hit_toggle_hover");
        this.b[13] = new f_0("orbs/hit_toggle_active");
        this.b[14] = new f_0("orbs/exp_toggle_active");
        this.b[15] = new f_0("orbs/right_arrow");
        this.b[16] = new f_0("orbs/left_arrow");
        this.b[17] = new f_0("orbs/heal_toggle_active");
        this.b[18] = new f_0("orbs/refill_toggle_active");
        this.b[19] = new f_0("orbs/run_icon_stamina");
        this.b[20] = new f_0("orbs/boss_toggle_active");
        this.b[21] = new f_0("orbs/bank_inv_active");
        this.b[22] = new f_0("orbs/bank_equip_active");
        this.b[23] = new f_0("orbs/promo_orb");
        this.b[24] = new f_0("orbs/promo_orb_hover");
        this.b[25] = new f_0("orbs/event_orb");
        this.b[26] = new f_0("orbs/event_orb_hover");
        this.b[27] = new f_0("orbs/spec_fill");
        this.b[28] = new f_0("orbs/spec_icon");
        this.c = new f_0("gameframe/chatbutton");
        this.d = new f_0("gameframe/hoverchat");
        this.e = new f_0("gameframe/hoverchat2");
    }

    private static Color c(int n2) {
        float[] fArray = new float[3];
        Color.RGBtoHSB(n2 >>> 16, n2 >> 8 & 0xFF, n2 & 0xFF, fArray);
        return Color.getHSBColor(fArray[0], 1.0f, 1.0f);
    }

    public void a() {
        if (rs.f.a.ai == a.c.b) {
            this.o();
        }
        this.i();
        this.l();
        this.m();
        this.n();
        this.p();
        this.j();
        this.k();
        this.q();
        this.t();
        this.s();
        this.u();
        this.r();
        if (rs.f.a.ai == a.c.a) {
            this.o();
        }
    }

    private void i() {
        int n2 = 34;
        int n3 = 34;
        int n4 = 684;
        int n5 = 87;
        if (rs.f.a.ai != a.c.a) {
            n4 = Client.ai - 85;
            n5 = 155;
        }
        this.h = false;
        if (rs.f.a.ai == a.c.b) {
            if (Client.hP >= Client.ai - 85) {
                if (Client.hP <= Client.ai - 85 + n2) {
                    if (Client.hQ >= 201) {
                        if (Client.hQ <= 201 + n3) {
                            this.h = true;
                        }
                    }
                }
            }
            (this.h ? this.g : this.f).f(-2 + n4, 44 + n5);
            if (this.h) {
                this.l.b(Client.hP - 50, Client.hQ - 15, " Adventure book   ");
            }
        } else {
            if (Client.hP >= 680) {
                if (Client.hP <= 712) {
                    if (Client.hQ >= 134) {
                        if (Client.hQ <= 162) {
                            this.h = true;
                        }
                    }
                }
            }
            (this.h ? this.g : this.f).f(-2 + n4, 44 + n5);
            if (this.h) {
                this.l.b(Client.hP - Client.aj - 20, Client.hQ - 10, " Adventure Book   ");
            }
        }
        if (Client.ff % 20 < 10 && this.l.cY == 6) {
            this.l.cX.f(n4 - 34, n5 + 45);
        }
    }

    private void j() {
        int n2 = 723;
        int n3 = 10;
        if (rs.f.a.ai != a.c.a) {
            n2 = Client.ai - 118;
            n3 = 120;
        }
        boolean bl = false;
        if (rs.f.a.ai == a.c.b) {
            if (Client.hP >= Client.ai - 119) {
                if (Client.hP <= Client.ai - 96) {
                    if (Client.hQ >= 166) {
                        if (Client.hQ <= 188) {
                            bl = true;
                        }
                    }
                }
            }
            this.b[bl ? 26 : 25].f(-2 + n2, 44 + n3);
            if (bl) {
                this.l.b(Client.hP - 50, Client.hQ - 15, " Donate");
            }
        } else {
            if (Client.hP >= 718) {
                if (Client.hP <= 744) {
                    if (Client.hQ >= 57) {
                        if (Client.hQ <= 79) {
                            bl = true;
                            this.l.b(Client.hP - 50, Client.hQ + 10, " Donate");
                        }
                    }
                }
            }
            this.b[bl ? 26 : 25].f(-2 + n2, 44 + n3);
        }
    }

    private void k() {
        int n2 = 714;
        int n3 = -20;
        if (rs.f.a.ai != a.c.a) {
            n2 = Client.ai - 85;
            n3 = 125;
        }
        boolean bl = false;
        if (rs.f.a.ai == a.c.b) {
            if (Client.hP >= Client.ai - 86) {
                if (Client.hP <= Client.ai - 62) {
                    if (Client.hQ >= 172) {
                        if (Client.hQ <= 198) {
                            bl = true;
                        }
                    }
                }
            }
            this.b[bl ? 24 : 23].f(-2 + n2, 44 + n3);
            if (bl) {
                this.l.b(Client.hP - 50, Client.hQ - 15, " View item guides  ");
            }
        } else {
            if (Client.hP >= 710) {
                if (Client.hP <= 733) {
                    if (Client.hQ >= 22) {
                        if (Client.hQ <= 48) {
                            bl = true;
                            this.l.b(Client.hP - 50, Client.hQ + 10, " View item guides  ");
                        }
                    }
                }
            }
            this.b[bl ? 24 : 23].f(-2 + n2, 44 + n3);
        }
    }

    public void a(int n2) {
        int n3 = this.l.fi;
        this.l.fi = n2;
        if (n3 == n2) {
            this.a(!rs.f.a.bc);
        } else if (rs.f.a.bc) {
            this.a(false);
        }
        Client.fM = true;
    }

    /*
     * Unable to fully structure code
     */
    public void b() {
        block35: {
            block41: {
                block40: {
                    block39: {
                        block38: {
                            block37: {
                                block36: {
                                    v0 = this;
                                    var1_1 = v0.l.ai() == false ? 338 : Client.ah - 165;
                                    var2_2 = 141;
                                    var2_2 = rs.f.a.ai == a.c.b ? (var2_2 += var1_1) : (var2_2 += 338);
                                    if (this.l.fi == 0) {
                                        this.c.f(4, var2_2);
                                    } else if (this.l.fi == 12) {
                                        this.c.f(69, var2_2);
                                    } else if (this.l.fi == 5) {
                                        this.c.f(135, var2_2);
                                    } else if (this.l.fi == 1) {
                                        this.c.f(201, var2_2);
                                    } else if (this.l.fi == 2) {
                                        this.c.f(267, var2_2);
                                    } else if (this.l.fi == 11) {
                                        this.c.f(333, var2_2);
                                    } else if (this.l.fi == 3) {
                                        this.c.f(399, var2_2);
                                    } else if (this.l.fi == 20) {
                                        this.c.f(459, var2_2);
                                    }
                                    var3_3 = Client.ah - 503;
                                    if (Client.hQ < 481 + var3_3) break block35;
                                    if (Client.hQ > 502 + var3_3) break block35;
                                    if (Client.hP < 4) break block36;
                                    if (Client.hP > 59) break block36;
                                    if (this.l.fi == rs.i.a.b) {
                                        this.e.f(4, var2_2);
                                    } else {
                                        this.d.f(4, var2_2);
                                    }
                                    break block35;
                                }
                                if (Client.hP < 69) break block37;
                                if (Client.hP > 125) break block37;
                                if (this.l.fi == rs.i.a.h) {
                                    this.e.f(69, var2_2);
                                } else {
                                    this.d.f(69, var2_2);
                                }
                                break block35;
                            }
                            if (Client.hP < 135) break block38;
                            if (Client.hP > 193) break block38;
                            if (this.l.fi == rs.i.a.f) {
                                this.e.f(135, var2_2);
                            } else {
                                this.d.f(135, var2_2);
                            }
                            break block35;
                        }
                        if (Client.hP < 201) break block39;
                        if (Client.hP > 257) break block39;
                        if (this.l.fi == rs.i.a.c) {
                            this.e.f(201, var2_2);
                        } else {
                            this.d.f(201, var2_2);
                        }
                        break block35;
                    }
                    if (Client.hP < 267) break block40;
                    if (Client.hP > 323) break block40;
                    if (this.l.fi == rs.i.a.d) {
                        this.e.f(267, var2_2);
                    } else {
                        this.d.f(267, var2_2);
                    }
                    break block35;
                }
                if (Client.hP < 333) break block41;
                if (Client.hP > 389) break block41;
                if (this.l.fi == rs.i.a.g) {
                    this.e.f(335, var2_2);
                } else {
                    this.d.f(335, var2_2);
                }
                break block35;
            }
            if (Client.hP < 400) ** GOTO lbl-1000
            if (Client.hP <= 456) {
                if (this.l.fi == rs.i.a.e) {
                    this.e.f(401, var2_2);
                } else {
                    this.d.f(401, var2_2);
                }
            } else if (Client.hP >= 460) {
                if (Client.hP <= 516) {
                    if (this.l.fi == rs.i.a.i) {
                        this.e.f(461, var2_2);
                    } else {
                        this.d.f(461, var2_2);
                    }
                }
            }
        }
        var4_4 = 63;
        Client.gh.a(true, 26, 0xFFFFFF, rs.i.b.C[0], 157 + var1_1);
        Client.gh.a(true, 85, 0xFFFFFF, rs.i.b.C[1], 152 + var1_1);
        Client.gh.a(true, 92 + var4_4, 0xFFFFFF, rs.i.b.C[2], 152 + var1_1);
        Client.gh.a(true, 152 + var4_4, 0xFFFFFF, rs.i.b.C[3], 152 + var1_1);
        Client.gh.a(true, 214 + var4_4, 0xFFFFFF, rs.i.b.C[4], 152 + var1_1);
        Client.gh.a(true, 288 + var4_4, 0xFFFFFF, rs.i.b.C[5], 152 + var1_1);
        Client.gh.a(true, 351 + var4_4, 0xFFFFFF, rs.i.b.C[6], 152 + var1_1);
        Client.gh.a(true, 412 + var4_4, 0xFFFFFF, rs.i.b.C[7], 152 + var1_1);
        Client.gh.a(rs.i.b.E[this.l.gx], 97, rs.i.b.D[this.l.gx], 162 + var1_1, true);
        Client.gh.a(rs.i.b.E[this.l.gw], var4_4 + 100, rs.i.b.D[this.l.gw], 162 + var1_1, true);
        Client.gh.a(rs.i.b.E[this.l.gu], var4_4 + 166, rs.i.b.D[this.l.gu], 162 + var1_1, true);
        Client.gh.a(rs.i.b.E[this.l.cE], var4_4 + 232, rs.i.b.D[this.l.cE], 162 + var1_1, true);
        Client.gh.a(rs.i.b.E[this.l.gy], var4_4 + 298, rs.i.b.D[this.l.gy], 162 + var1_1, true);
        Client.gh.a(rs.i.b.E[this.l.fZ], var4_4 + 364, rs.i.b.D[this.l.fZ], 162 + var1_1, true);
        Client.gh.a(rs.i.b.E[this.l.gv], var4_4 + 364 + 61, rs.i.b.D[this.l.gv], 162 + var1_1, true);
    }

    private void l() {
        int n2;
        int n3 = 524;
        int n4 = -3;
        if (rs.f.a.ai != a.c.a) {
            n3 = 5 + Client.ai - 210;
            n4 = -4;
        } else {
            n4 -= 2;
        }
        int n5 = this.l.a(rs.n.e.H[4016], 0);
        int n6 = this.l.a(rs.n.e.H[4017], 0);
        int n7 = (int)((double)n5 / (double)n6 * 100.0);
        double d2 = 1.0;
        if (n5 < 99) {
            d2 = (double)(System.currentTimeMillis() - this.k) / 60000.0;
        }
        if ((n2 = this.e(n7)) != this.t) {
            this.p = new f_0("orbs/orb_drain", 27, n2);
            this.t = n2;
        }
        this.b[1].f(-2 + n3, 44 + n4);
        int n8 = this.b[2].n == 28 ? 0 : 2;
        this.b[2].f(25 + n3 + n8, 48 + n4 + n8);
        this.p.f(25 + n3, 48 + n4);
        this.b[3].f(31 + n3, 55 + n4);
        Client.gh.a(this.d(n7), 15 + n3, "" + n5, 71 + n4, true);
        if (n5 < 99) {
            this.a((Graphics2D)this.l.gZ.e.getGraphics(), n3 - 1, 46 + n4, d2, z);
        }
    }

    public void c() {
        this.b[4] = new f_0(this.l.cp ? "orbs/pray_fill_active" : "orbs/pray_fill");
    }

    private void m() {
        int n2 = 524;
        int n3 = 39;
        if (rs.f.a.ai != a.c.a) {
            n2 = 5 + Client.ai - 210;
            n3 = 28;
        } else {
            n3 -= 11;
        }
        int n4 = this.l.a(rs.n.e.H[4012], 0);
        int n5 = this.l.a(rs.n.e.H[4013], 0);
        int n6 = (int)((double)n4 / (double)n5 * 100.0);
        int n7 = this.e(n6);
        if (n7 != this.v) {
            this.q = new f_0("orbs/orb_drain", 27, this.e(n6));
            this.v = n7;
        }
        boolean bl = false;
        if (rs.f.a.ai == a.c.b) {
            if (Client.hQ >= 75) {
                if (Client.hQ <= 107) {
                    if (Client.hP >= Client.ai - 192 - 20) {
                        if (Client.hP <= Client.ai - 133 - 20) {
                            bl = true;
                        }
                    }
                }
            }
        } else if (Client.hQ >= 75) {
            if (Client.hQ <= 107) {
                if (Client.hP >= 518) {
                    if (Client.hP <= 575) {
                        bl = true;
                    }
                }
            }
        }
        this.b[bl ? 10 : 1].f(-2 + n2, 44 + n3);
        this.b[4].f(25 + n2, 48 + n3);
        this.q.f(25 + n2, 48 + n3);
        this.b[5].f(28 + n2, 51 + n3);
        Client.gh.a(this.d(n6), 15 + n2, "" + n4, 71 + n3, true);
    }

    private void n() {
        int n2;
        int n3;
        int n4;
        int n5 = 542;
        int n6 = 76;
        if (rs.f.a.ai != a.c.a) {
            n5 = 23 + Client.ai - 210 - 5;
            n6 = 60;
        } else {
            n5 -= 10;
            n6 -= 15;
        }
        int n7 = 0;
        if (rs.n.e.H[149].at.length() > 0) {
            for (n4 = 0; n4 < rs.n.e.H[149].at.length() - 1; ++n4) {
                n7 = rs.l.h.a(n7, rs.n.e.H[149].at.charAt(n4));
            }
        }
        if ((n3 = this.e(n4 = (int)((double)n7 / 100.0 * 100.0))) != this.u) {
            this.r = new f_0("orbs/orb_drain", 27, n3);
            this.u = n3;
        }
        boolean bl = false;
        if (rs.f.a.ai == a.c.b) {
            if (Client.hQ >= 120) {
                if (Client.hQ <= 153) {
                    if (Client.hP >= Client.ai - 192) {
                        if (Client.hP <= Client.ai - 133) {
                            bl = true;
                        }
                    }
                }
            }
        } else if (Client.hQ >= 109) {
            if (Client.hQ <= 142) {
                if (Client.hP >= 540) {
                    if (Client.hP <= 575) {
                        bl = true;
                    }
                }
            }
        }
        boolean bl2 = this.l.dP[173] == 1 && n4 > 0;
        int n8 = n2 = !bl2 ? 7 : 9;
        if (this.i) {
            n2 = 19;
        }
        this.b[bl ? 10 : 1].f(-2 + n5, 44 + n6);
        this.b[!bl2 ? 6 : 8].f(25 + n5, 48 + n6);
        this.r.f(25 + n5, 48 + n6);
        this.b[n2].f(31 + n5, 52 + n6);
        Client.gh.a(this.d(n4), 15 + n5, "" + n7, 71 + n6, true);
    }

    public void d() {
        this.j = System.currentTimeMillis();
        this.k = System.currentTimeMillis();
    }

    private void o() {
        int n2 = 183;
        int n3 = -30;
        b b2 = this;
        if (!b2.l.ai()) {
            n2 += 516;
        }
        double d2 = Client.F;
        double d3 = 10.0;
        double d4 = 1.0;
        int n4 = (int)(d2 / d3 * 100.0);
        if (d2 < 10.0) {
            d4 = (double)(System.currentTimeMillis() - this.j) / 30000.0;
        }
        String string = "" + (int)(d2 * 10.0);
        int n5 = this.e(n4);
        if (this.w != n5) {
            this.s = new f_0("orbs/orb_drain", 27, n5);
            this.w = n5;
        }
        if (rs.f.a.ai != a.c.a) {
            n2 += Client.ai - 353;
            n3 += 118;
        } else {
            n2 -= 148;
            n3 += 119;
        }
        this.b[1].f(-2 + n2, 44 + n3);
        this.b[27].f(26 + n2, 48 + n3);
        this.s.f(25 + n2, 48 + n3);
        this.b[28].f(31 + n2, 53 + n3);
        Client.gh.a(this.d(n4), 14 + n2, string, 71 + n3, true);
        if (n4 < 100) {
            this.a((Graphics2D)this.l.gZ.e.getGraphics(), n2 - 1, 46 + n3, d4, A);
        }
    }

    private void p() {
        int n2 = 524;
        int n3 = 22;
        if (rs.f.a.ai != a.c.a) {
            n2 = 5 + Client.ai - 25 - 2;
            n3 = 152;
        }
        boolean bl = false;
        if (rs.f.a.ai == a.c.b) {
            if (Client.hQ >= 154) {
                if (Client.hQ <= 173) {
                    if (Client.hP >= Client.ai - 23) {
                        if (Client.hP <= Client.ai - 6) {
                            bl = true;
                        }
                    }
                }
            }
        } else if (Client.hQ >= 25) {
            if (Client.hQ <= 43) {
                if (Client.hP >= 515) {
                    if (Client.hP <= 545) {
                        bl = true;
                    }
                }
            }
        }
        this.b[bl ? 12 : 11].f(n2, n3);
        if (this.n > 0) {
            this.b[this.f() ? 13 : 14].f(n2, n3);
        }
    }

    private void q() {
        if (rs.f.a.v) {
            int n2 = 742;
            int n3 = 8;
            if (Launcher.n() == null) {
                return;
            }
            if (rs.f.a.ai != a.c.a) {
                n2 = 223 + Client.ai - 245;
                n3 = 183;
            }
            boolean bl = false;
            if (rs.f.a.ai == a.c.b) {
                if (Client.hQ >= 186) {
                    if (Client.hQ <= 205) {
                        if (Client.hP >= Client.ai - 23) {
                            if (Client.hP <= Client.ai - 6) {
                                bl = true;
                            }
                        }
                    }
                }
            } else if (Client.hQ >= 11) {
                if (Client.hQ <= 30) {
                    if (Client.hP >= 736) {
                        if (Client.hP <= 757) {
                            bl = true;
                            this.l.b(Client.hP - 50, Client.hQ + 15, " Side panel");
                        }
                    }
                }
            }
            this.b[bl ? 12 : 11].c(n2, n3);
            this.b[Launcher.e() ? 16 : 15].c(n2, n3);
        }
    }

    private void r() {
        int n2 = 747;
        int n3 = 114;
        if (rs.f.a.ai != a.c.a) {
            n3 = 87;
            n2 = 228;
            if (Client.ah <= 670) {
                n2 += Client.ai - 275;
                n3 += 77;
            } else {
                n2 += Client.ai - 250;
                n3 += 228;
            }
        }
        boolean bl = false;
        if (rs.f.a.ai == a.c.b) {
            if (Client.ah <= 670) {
                if (Client.hQ >= 166) {
                    if (Client.hQ <= 182) {
                        if (Client.hP >= Client.ai - 23 - 23) {
                            if (Client.hP <= Client.ai - 6 - 23) {
                                bl = true;
                                this.l.b(Client.hP - 25, Client.hQ - 15, " Bank all items");
                            }
                        }
                    }
                }
            } else if (Client.hQ >= 313) {
                if (Client.hQ <= 333) {
                    if (Client.hP >= Client.ai - 23) {
                        if (Client.hP <= Client.ai - 6) {
                            bl = true;
                            this.l.b(Client.hP - 25, Client.hQ - 15, " Bank all items");
                        }
                    }
                }
            }
        } else if (Client.hQ >= 116) {
            if (Client.hQ <= 134) {
                if (Client.hP >= 744) {
                    if (Client.hP <= 759) {
                        bl = true;
                        this.l.b(180, Client.hQ, " Bank all items");
                    }
                }
            }
        }
        this.b[bl ? 12 : 11].f(n2, n3);
        this.b[21].c(n2, n3 + 4);
    }

    private void s() {
        int n2 = 747;
        int n3 = 87;
        if (rs.f.a.ai != a.c.a) {
            n2 = 205;
            n3 = 140;
            n2 += Client.ai - 227;
            n3 += 76;
        }
        boolean bl = false;
        if (rs.f.a.ai == a.c.b) {
            if (Client.hQ >= 219) {
                if (Client.hQ <= 238) {
                    if (Client.hP >= Client.ai - 23) {
                        if (Client.hP <= Client.ai - 6) {
                            bl = true;
                            this.l.b(Client.hP - 25, Client.hQ - 15, " Epic bosses");
                        }
                    }
                }
            }
        } else if (Client.hQ >= 89) {
            if (Client.hQ <= 107) {
                if (Client.hP >= 744) {
                    if (Client.hP <= 759) {
                        bl = true;
                        this.l.b(180, Client.hQ, " Epic bosses");
                    }
                }
            }
        }
        this.b[bl ? 12 : 11].f(n2, n3);
        this.b[20].f(n2, n3);
    }

    private void t() {
        int n2 = 724;
        int n3 = 140;
        if (rs.f.a.ai != a.c.a) {
            n2 = 228;
            n3 = 114;
            if (Client.ah <= 649) {
                n2 += Client.ai - 275;
                n3 += 76;
            } else {
                n2 += Client.ai - 250;
                n3 += 168;
            }
        }
        boolean bl = false;
        if (rs.f.a.ai == a.c.b) {
            if (Client.ah <= 649) {
                if (Client.hQ >= 192) {
                    if (Client.hQ <= 211) {
                        if (Client.hP >= Client.ai - 23 - 23) {
                            if (Client.hP <= Client.ai - 6 - 23) {
                                bl = true;
                                this.l.b(Client.hP - 25, Client.hQ - 15, " Heal");
                            }
                        }
                    }
                }
            } else if (Client.hQ >= 281) {
                if (Client.hQ <= 301) {
                    if (Client.hP >= Client.ai - 23) {
                        if (Client.hP <= Client.ai - 6) {
                            bl = true;
                            this.l.b(Client.hP - 25, Client.hQ - 15, " Heal");
                        }
                    }
                }
            }
        } else if (Client.hQ >= 141) {
            if (Client.hQ <= 161) {
                if (Client.hP >= 721) {
                    if (Client.hP <= 736) {
                        bl = true;
                        this.l.b(180, Client.hQ, " Heal");
                    }
                }
            }
        }
        this.b[bl ? 12 : 11].f(n2, n3);
        this.b[17].f(n2 + 1, n3 + 5);
    }

    private void u() {
        int n2 = 747;
        int n3 = 140;
        if (rs.f.a.ai != a.c.a) {
            n2 = 228;
            n3 = 140;
            if (Client.ah <= 609) {
                n2 += Client.ai - 275;
                n3 += 76;
            } else {
                n2 += Client.ai - 250;
                n3 += 108;
            }
        }
        boolean bl = false;
        if (rs.f.a.ai == a.c.b) {
            if (Client.ah <= 609) {
                if (Client.hQ >= 219) {
                    if (Client.hQ <= 238) {
                        if (Client.hP >= Client.ai - 23 - 23) {
                            if (Client.hP <= Client.ai - 6 - 23) {
                                bl = true;
                                this.l.b(Client.hP - 15, Client.hQ - 15, " Refill potions");
                            }
                        }
                    }
                }
            } else if (Client.hQ >= 250) {
                if (Client.hQ <= 269) {
                    if (Client.hP >= Client.ai - 23) {
                        if (Client.hP <= Client.ai - 6) {
                            bl = true;
                            this.l.b(Client.hP - 15, Client.hQ - 15, " Refill potions");
                        }
                    }
                }
            }
        } else if (Client.hQ >= 141) {
            if (Client.hQ <= 161) {
                if (Client.hP >= 744) {
                    if (Client.hP <= 759) {
                        bl = true;
                        this.l.b(180, Client.hQ, " Refill potions");
                    }
                }
            }
        }
        this.b[bl ? 12 : 11].f(n2, n3);
        this.b[18].f(n2, n3 + 4);
    }

    private int d(int n2) {
        if (n2 >= 75) {
            return 65280;
        }
        if (n2 >= 50 && n2 <= 74) {
            return 0xFFFF00;
        }
        if (n2 >= 25 && n2 <= 49) {
            return 16750623;
        }
        return 0xFF0000;
    }

    private int e(int n2) {
        if (n2 <= 100 && n2 >= 97) {
            return 0;
        }
        if (n2 <= 96 && n2 >= 93) {
            return 1;
        }
        if (n2 <= 92 && n2 >= 89) {
            return 2;
        }
        if (n2 <= 88 && n2 >= 85) {
            return 3;
        }
        if (n2 <= 84 && n2 >= 81) {
            return 4;
        }
        if (n2 <= 80 && n2 >= 77) {
            return 5;
        }
        if (n2 <= 76 && n2 >= 73) {
            return 6;
        }
        if (n2 <= 72 && n2 >= 69) {
            return 7;
        }
        if (n2 <= 68 && n2 >= 65) {
            return 8;
        }
        if (n2 <= 64 && n2 >= 61) {
            return 9;
        }
        if (n2 <= 60 && n2 >= 57) {
            return 10;
        }
        if (n2 <= 56 && n2 >= 53) {
            return 11;
        }
        if (n2 <= 52 && n2 >= 49) {
            return 12;
        }
        if (n2 <= 48 && n2 >= 45) {
            return 13;
        }
        if (n2 <= 44 && n2 >= 41) {
            return 14;
        }
        if (n2 <= 40 && n2 >= 37) {
            return 15;
        }
        if (n2 <= 36 && n2 >= 33) {
            return 16;
        }
        if (n2 <= 32 && n2 >= 29) {
            return 17;
        }
        if (n2 <= 28 && n2 >= 25) {
            return 18;
        }
        if (n2 <= 24 && n2 >= 21) {
            return 19;
        }
        if (n2 <= 20 && n2 >= 17) {
            return 20;
        }
        if (n2 <= 16 && n2 >= 13) {
            return 21;
        }
        if (n2 <= 12 && n2 >= 9) {
            return 22;
        }
        if (n2 <= 8 && n2 >= 7) {
            return 23;
        }
        if (n2 <= 6 && n2 >= 5) {
            return 24;
        }
        if (n2 <= 4 && n2 >= 3) {
            return 25;
        }
        if (n2 <= 2 && n2 >= 1) {
            return 26;
        }
        if (n2 <= 0) {
            return 27;
        }
        return 0;
    }

    private void a(Graphics2D graphics2D, int n2, int n3, double d2, Color color) {
        if (d2 < 0.01) {
            return;
        }
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        Rectangle rectangle = new Rectangle(n2, n3 - 7, 45, 45);
        Arc2D.Double double_ = new Arc2D.Double(rectangle.x + 27, (double)rectangle.y + ((double)(rectangle.height / 2) - 13.0), 26.0, 26.0, 90.0, -360.0 * d2, 0);
        BasicStroke basicStroke = new BasicStroke(2.0f, 0, 0);
        graphics2D.setStroke(basicStroke);
        graphics2D.setColor(color);
        graphics2D.draw(double_);
    }

    public int e() {
        return this.n;
    }

    public boolean f() {
        return this.n == 1;
    }

    public boolean g() {
        return this.n == 2;
    }

    public void b(int n2) {
        this.n = n2;
    }

    public boolean h() {
        return rs.f.a.bc;
    }

    public void a(boolean bl) {
        boolean bl2 = rs.f.a.bc;
        rs.f.a.bc = bl;
        if (bl2 != bl) {
            if (Client.aj()) {
                this.l.j();
            }
            rs.n.d.a();
        }
    }

    private static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(true, 0, 10, 9);
        public static final /* enum */ a b = new a(1, 6, 6);
        public static final /* enum */ a c = new a(2, 7, 7);
        public static final /* enum */ a d = new a(3, 4, 4);
        public static final /* enum */ a e = new a(4, 4, 2);
        public static final /* enum */ a f = new a(5, 5, 2);
        public static final /* enum */ a g = new a(true, 6, 6, 6);
        public static final /* enum */ a h = new a(true, 7, 8, 4);
        public static final /* enum */ a i = new a(8, 4, 6);
        public static final /* enum */ a j = new a(9, 5, 7);
        public static final /* enum */ a k = new a(10, 6, 3);
        public static final /* enum */ a l = new a(11, 4, 6);
        public static final /* enum */ a m = new a(12, 7, 4);
        public static final /* enum */ a n = new a(true, 13, 6, 5);
        private final boolean o;
        private final int p;
        private final int q;
        private final int r;
        private static final /* synthetic */ a[] s;

        public static a[] values() {
            return (a[])s.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private a(int n3, int n4, int n5) {
            this.o = false;
            this.p = n3;
            this.q = n4;
            this.r = n5;
        }

        private a(boolean bl, int n3, int n4, int n5) {
            this.o = bl;
            this.p = n3;
            this.q = n4;
            this.r = n5;
        }

        public static a a(int n2) {
            for (a a2 : rs.i.b$a.values()) {
                if (a2.p != n2) continue;
                return a2;
            }
            return null;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n};
        }

        static {
            s = rs.i.b$a.a();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = rs.i.b$b.a();
        }
    }
}

