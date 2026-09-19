/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b;

import rs.Client;
import rs.f.a;
import rs.gui.Launcher;
import rs.l.c;
import rs.l.e.f;
import rs.l.e.q;
import rs.l.f.a;
import rs.l.f_0;
import rs.l.j_0;
import rs.n.c.g_0;
import rs.n.c.s;
import rs.n.e;

public class b {
    public static f_0 a;
    public static f_0 b;

    /*
     * Unable to fully structure code
     */
    public static void a(Client var0) {
        var0.D();
        if (var0.dv == 1) {
            var1_1 = 0;
            var0.fa[var0.du / 100].f(var0.ds - 8 - var1_1, var0.dt - 8 - var1_1);
            if (++Client.eX > 67) {
                Client.eX = 0;
            }
        }
        if (var0.dv == 2) {
            var1_1 = 0;
            var0.fa[4 + var0.du / 100].f(var0.ds - 8 - var1_1, var0.dt - 8 - var1_1);
        }
        if (Client.ed != -1) {
            var0.j(var0.dE, Client.ed);
            if (Client.ed == 197 && rs.f.a.ai != a.c.a) {
                var1_1 = 40;
                var2_15 = 7;
                var3_24 = e.H[199].at.replace("@yel@", "");
                var4_35 = var0.gi.a((String)var3_24);
                var0.eK[0].f(Client.ai - 200 + var1_1 + 15, 168 + var2_15 + 10);
                var0.gm.c((String)var3_24, Client.ai - 174 + (var3_24.length() == 8 ? 2 : 0) + var1_1, 207 + var2_15 + 10, 0xFFFF00, 0);
            } else if (Client.ed == 201 && rs.f.a.ai != a.c.a) {
                var0.a(0, Client.ai - 560, e.H[Client.ed], -109);
            } else {
                var1_1 = 4;
                var2_15 = 4;
                if (!Client.ai() && rs.f.a.aD) {
                    var2_15 -= 25;
                }
                if (var0.v.h() && !var0.f()) {
                    var2_15 += 125;
                }
                var0.a(0, rs.f.a.ai == a.c.a ? var1_1 : Client.ai / 2 - 356, e.H[Client.ed], rs.f.a.ai == a.c.a ? var2_15 : Client.ah / 2 - 230);
            }
        }
        if (var0.es >= 1 && var0.es <= 3) {
            var1_1 = 0;
            var2_15 = 0;
            if (Client.ai()) {
                var1_1 = -65;
                var2_15 = 30;
            } else {
                var1_1 = 4;
                var2_15 = 4;
                if (var0.v.h() && !var0.f()) {
                    var2_15 += 131;
                }
            }
            if (!Client.ai() && rs.f.a.aD) {
                var2_15 -= 25;
            }
            v0 = var3_24 = var0.es == 1 ? var0.bs : j_0.a;
            if (var0.es == 3) {
                var3_24 = j_0.b;
            }
            var3_24.f(rs.f.a.ai == a.c.a ? 472 + var1_1 : Client.ai - 80 + var1_1, rs.f.a.ai == a.c.a ? 296 + var2_15 : 200 + var2_15);
        }
        if (Client.cH != -1) {
            q.a(var0.u);
        }
        f.o = 0;
        for (var1_1 = 0; var1_1 < f.k.size(); ++var1_1) {
            f.k.get(var1_1).a(var0, f.a.a);
        }
        rs.l.f.e.d().a(rs.l.f.a.p);
        rs.l.f.e.d().a(rs.l.f.a.q);
        if (Client.cH != -1) {
            var1_2 = e.H[Client.cH];
            var0.j(var0.dE, Client.cH);
            if (Client.cH == 15944 && rs.f.a.ai == a.c.b) {
                c.b(Client.ah, 0, 0, 110, Client.ai, 130);
                c.d(0, Client.ai, Client.ah, 0, 0);
            }
            var2_15 = 4;
            var3_25 = 4;
            if (Client.ai()) {
                var2_15 = Client.ai / 2 - 356;
                var3_25 = Client.ah / 2 - 230;
            } else if (var0.v.h() && !var0.f()) {
                var3_25 += 50;
            }
            if (var1_2.C != 0x7FFFFFFF) {
                var2_15 = e.H[Client.cH].C;
            }
            if (var1_2.D != 0x7FFFFFFF) {
                var3_25 = e.H[Client.cH].D;
            }
            Client.cq = var2_15;
            Client.cr = var3_25;
            if (Client.aj()) {
                Client.cq -= 4;
                Client.cr -= 4;
            }
            var0.a(0, var2_15, e.H[Client.cH], var3_25);
        }
        if (var0.ae && (Client.cH == -1 || Client.cH == 18551)) {
            var1_3 = 15;
            if (Client.aj() && var0.v.h() && !var0.f()) {
                var1_3 += 138;
            }
            var2_15 = 14;
            var3_26 = Client.aj() != false ? 295 + var1_3 : Client.ah - 205 + var1_3;
            var0.a(0, var2_15, e.H[55008], var3_26);
            var4_36 = "Tracking: @yel@" + var0.af;
            if (e.H[55011].at.contains("100%")) {
                var4_36 = var4_36 + " @gre@(COMPLETE)";
            }
            Client.gl.c(var4_36, var2_15 + 246, var3_26 + 3, 0xFFFFFF, 0);
            if (Client.hP >= var2_15 + 96) {
                if (Client.hP <= var2_15 + 386) {
                    if (Client.hQ >= var3_26) {
                        if (Client.hQ <= var3_26 + 20) {
                            // empty if block
                        }
                    }
                }
            }
        }
        var0.y();
        f.o = 0;
        for (var1_4 = 0; var1_4 < f.k.size(); ++var1_4) {
            f.k.get(var1_4).a(var0, f.a.b);
        }
        rs.l.f.e.d().a(rs.l.f.a.v);
        rs.l.f.e.d().a(rs.l.f.a.y);
        if (!Client.dj) {
            var0.H();
            var0.X();
        } else if (var0.dH == 0) {
            // empty if block
        }
        f.o = 0;
        for (var1_4 = 0; var1_4 < f.l.size(); ++var1_4) {
            f.l.get(var1_4).a(var0, f.a.b);
        }
        rs.l.f.e.d().a(rs.l.f.a.w);
        if (Client.ba) {
            var0.gi.b(0xFFFF00, "Debug Item: " + Client.bb, 201, 5);
            var0.gi.b(0xFFFF00, "Debug RotX: " + Client.bc, 215, 5);
            var0.gi.b(0xFFFF00, "Debug RotY: " + Client.bd, 229, 5);
            var0.gi.b(0xFFFF00, "Debug Zoom: " + Client.be, 243, 5);
            var0.gi.b(0xFFFF00, "Debug Offset1: " + Client.bf, 257, 5);
            var0.gi.b(0xFFFF00, "Debug Offset2: " + Client.bg, 271, 5);
        } else if (Client.aW != -1) {
            var0.gi.b(0xFFFF00, "Debug Interface: " + Client.aW, 201, 5);
            var0.gi.b(0xFFFF00, "Debug Interface Position X: " + Client.aX, 215, 5);
            var0.gi.b(0xFFFF00, "Debug Interface Position tY: " + Client.aY, 229, 5);
        }
        if (rs.f.a.am) {
            var1_4 = 507;
            var2_15 = Client.eh + (Client.eR.ac - 6 >> 7);
            var3_27 = Client.ei + (Client.eR.ad - 6 >> 7);
            var4_35 = 20;
            var0.gi.a("RUNTIME INFORMATION", var1_4, 0xFF4444, var4_35);
            var0.gi.a("Fps: " + Client.gR, var1_4, 0xFFFF00, var4_35 += 15);
            var5_37 = Runtime.getRuntime();
            var6_42 = (int)((var5_37.totalMemory() - var5_37.freeMemory()) / 1024L);
            var0.gi.a("Mem: " + var6_42 + "k", var1_4, 0xFFFF00, var4_35 += 15);
            var0.gi.a("COORDINATE INFORMATION", var1_4, 0xFF4444, var4_35 += 30);
            var0.gi.a("Mouse X: " + Client.hP + " , Mouse Y: " + Client.hQ, var1_4, 0xFFFF00, var4_35 += 15);
            var0.gi.a("FW: " + Client.ai + " , FH: " + Client.ah, var1_4, 0xFFFF00, var4_35 += 15);
            var0.gi.a("Coords: " + var2_15 + ", " + var3_27, var1_4, 0xFFFF00, var4_35 += 15);
            var7_43 = var2_15 >> 6;
            var8_46 = var3_27 >> 6;
            var9_47 = var7_43 * 256 + var8_46;
            var0.gi.a("Region ID: " + var9_47, var1_4, 0xFFFF00, var4_35 += 15);
        } else if (rs.f.a.bm) {
            var1_4 = rs.f.a.ai == a.c.b ? Client.ai - 700 : 0;
            var0.gm.b("FPS: " + Client.gR, 460 + var1_4, 20, 0xFFFF00, 0);
            if (rs.f.a.bn) {
                var2_16 = "Ping: " + Client.bh + "ms";
                var0.gm.b(var2_16, 460 + var1_4 + 41 - var0.gm.c(var2_16), 38, 0xFFFF00, 0);
            }
        } else if (rs.f.a.bn) {
            var1_4 = rs.f.a.ai == a.c.b ? Client.ai - 700 : 0;
            var2_17 = "Ping: " + Client.bh + "ms";
            var0.gm.b(var2_17, 460 + var1_4 + 41 - var0.gm.c(var2_17), 20, 0xFFFF00, 0);
        }
        if (var0.eN != 0L) {
            var1_5 = var0.c() / 1000L;
            var3_28 = var1_5 / 60L;
            var5_38 = Client.aj() != false ? 4 : 0;
            v1 = var6_42 = rs.f.a.ai == a.c.a ? 4 : Client.ah - 499;
            if (var0.v.h() && !var0.f()) {
                var6_42 += 136;
            }
            v2 = var7_44 = (var1_5 %= 60L) < 10L ? var3_28 + ":0" + var1_5 : var3_28 + ":" + var1_5;
            if (var7_44.equalsIgnoreCase("0:00")) {
                var7_44 = "Soon";
                if (Client.ff % 200 < 50) {
                    var7_44 = (String)var7_44 + ".";
                } else if (Client.ff % 200 >= 50 && Client.ff % 200 < 100) {
                    var7_44 = (String)var7_44 + "..";
                } else if (Client.ff % 200 >= 100 && Client.ff % 200 < 150) {
                    var7_44 = (String)var7_44 + "...";
                }
                var7_44 = ": @gre@" + (String)var7_44;
                if (Client.eR != null) {
                    if (Client.eR.aZ != null) {
                        if (Client.eR.aZ.equalsIgnoreCase("Ryan") && var0.eO == 2 && !var0.eP) {
                            Launcher.n().a("SpawnPK", "System update warning timer is complete!", true);
                            var0.eP = true;
                        }
                    }
                }
            } else {
                var7_44 = " in: @gre@" + (String)var7_44;
            }
            if (var0.eO == 1) {
                var0.gm.b("@or2@[Warning] <img=37> @yel@System update" + (String)var7_44, 4 + var5_38, 329 + var6_42, 0, 0);
            } else {
                var0.gm.b("@or2@[Warning] <img=37> @yel@System update @or1@(5 min timer)@yel@ starts" + (String)var7_44, 4 + var5_38, 329 + var6_42, 0, 0);
            }
            if (++Client.cF > 75) {
                Client.cF = 0;
                Client.fv.a(148);
            }
        }
        if (var0.k != null) {
            var1_6 = 144;
            var2_18 = 22;
            var3_29 = 26;
            var4_35 = 200;
            c.b(var3_29, var2_18, var1_6, 0, var4_35, 125);
            var0.gm.c(var0.k, var1_6 + 97, var2_18 + 17, 0xFFFFFF, 0);
        }
        if (var0.aC) {
            var1_7 = 140;
            var2_19 = 35;
            var3_30 = 4;
            var4_35 = 60;
            if (!rs.f.a.aB || var0.z.r == null || var0.z.s <= 0 || System.currentTimeMillis() - var0.z.w >= 20000L) {
                var4_35 = 23;
            }
            c.b(var2_19, var4_35, var3_30, 0, var1_7, 125);
            Client.gl.b("@or2@Your points: @whi@" + var0.aM, var3_30 + 5, var4_35 + 14, 0xFFFF00, 0);
            Client.gl.b("@or2@Total: @whi@" + var0.aN, var3_30 + 5, var4_35 + 14 + 15, 0xFFFF00, 0);
        }
        if (Client.cH == 6575 && var0.cG > 0) {
            var1_8 = "<img=40> @whi@WHIP + DDS ONLY <img=40>";
            var2_20 = 130;
            var3_31 = 195;
            if (var0.cG == 2) {
                var1_8 = "<img=40> @whi@WHIP ONLY <img=40>";
                var3_31 += 19;
            }
            var0.gn.a(var1_8, var3_31, var2_20);
            var0.gn.a(var1_8, var3_31, var2_20 + 25);
            var0.gn.a(var1_8, var3_31, var2_20 + 50);
            var0.gn.a(var1_8, var3_31, var2_20 + 75);
        }
        if (var0.aF && e.H[199].at.contains("LMS")) {
            if (Client.ed == 197) {
                var0.aA.c(0, 0);
                if (Client.aj > 800) {
                    var0.aA.c(800, 0);
                }
                if (Client.aj > 1600) {
                    var0.aA.c(1600, 0);
                }
            }
        }
        if (!e.H[199].at.contains("LMS")) ** GOTO lbl-1000
        if (Client.ed != 197) ** GOTO lbl-1000
        if (Client.eR.ay != 6095) ** GOTO lbl-1000
        if (Client.eR.aT != null) {
            var0.fu = 3209;
        } else if (var0.fu == 3209) {
            var0.fu = -1;
            Client.fb = true;
            Client.eM = true;
        }
        if (var0.aE) {
            var1_9 = 12;
            var2_21 = 12;
            c.b(55, var1_9, var2_21, 12884294, 180, 50);
            c.b(49, var1_9 + 3, var2_21 + 3, 4863488, 174, 100);
            Client.gl.b(var0.aG, var1_9 + 8, var2_21 + 18, 0xFFFFFF, 0);
            Client.gl.b(var0.aH, var1_9 + 8, var2_21 + 18 + 14, 0xFFFFFF, 0);
            Client.gl.b(var0.aI, var1_9 + 8, var2_21 + 18 + 14 + 14, 0xFFFFFF, 0);
        }
        if (e.H[199].at.contains("LMS")) {
            if (Client.ed == 197) {
                var1_10 = 397;
                var2_22 = 2;
                c.b(56, var2_22, var1_10, 12884294, 113, 50);
                c.b(50, var2_22 + 3, var1_10 + 3, 4863488, 107, 100);
                Client.gl.b(var0.aG, var1_10 + 8, var2_22 + 18, 0xFFFFFF, 0);
                Client.gl.b(var0.aH, var1_10 + 8, var2_22 + 18 + 14, 0xFFFFFF, 0);
                Client.gl.b(var0.aI, var1_10 + 8, var2_22 + 18 + 14 + 14, 0xFFFFFF, 0);
            }
        }
        if (var0.aC && var0.aL > 0.0) {
            var1_11 = 500;
            var2_23 = 18;
            var3_32 = 4;
            var4_35 = 3;
            if (rs.f.a.ai == a.c.b) {
                var3_32 = 150;
                var4_35 = 23;
            }
            var5_39 = var0.aK != false ? 4095 : 13960709;
            var6_42 = var0.aK != false ? 50431 : 30976;
            var7_45 = var0.aL / 100.0;
            var9_47 = (int)Math.ceil((double)var1_11 * var7_45);
            c.b(var2_23, var4_35, var3_32, 0, var1_11 + 4, 125);
            c.b(14, var4_35 + 2, var3_32 + 2, var5_39, var1_11, 255);
            c.b(14, var4_35 + 2, var3_32 + 2, var6_42, var9_47, 255);
            Client.gl.c(var0.aL + "%", var3_32 + (var1_11 + 4) / 2, var4_35 + 14, 0xFFFFFF, 0);
        } else {
            var0.aL = 0.0;
        }
        if (Client.ed == 197 && e.H[199].at.contains("Tourney")) {
            if (var0.R == -1L) {
                var1_12 = "Waiting for more players";
                if (Client.ff % 200 < 50) {
                    var1_12 = (String)var1_12 + ".";
                } else if (Client.ff % 200 >= 50 && Client.ff % 200 < 100) {
                    var1_12 = (String)var1_12 + "..";
                } else if (Client.ff % 200 >= 100 && Client.ff % 200 < 150) {
                    var1_12 = (String)var1_12 + "...";
                }
                s.d.c(195, 5);
                Client.gl.c((String)var1_12, 268, 24, 16750623, 1);
            } else {
                s.d.c(195, 5);
                var1_13 = (var0.R - System.currentTimeMillis()) / 1000L;
                var3_33 = var1_13 - var1_13 / 60L * 60L;
                var5_40 = var1_13 / 60L;
                if (var0.Q == 1) {
                    Client.gl.c("Round starts in:", 270, 18, 16750623, 1);
                } else if (var0.Q == 2) {
                    Client.gl.c("Round ends in:", 270, 18, 16750623, 1);
                } else {
                    Client.gl.c("Tournament starts in:", 270, 18, 16750623, 1);
                }
                var0.gm.c("@yel@" + var5_40 + ":" + (var3_33 < 10L ? "0" : "") + var3_33, 270, 31, 16750623, 1);
            }
        }
        if (var0.K) {
            if (var0.O - System.currentTimeMillis() > 0L) {
                s.c.c(230, 5);
                var0.go.c("Begin in..", 270, 25, 0xFFFFFF, 1);
                var1_14 = (var0.O - System.currentTimeMillis()) / 1000L;
                var3_34 = var1_14 - var1_14 / 60L * 60L;
                var5_41 = var1_14 / 60L;
                var0.go.c(var5_41 + ":" + (var3_34 < 10L ? "0" : "") + var3_34, 270, 45, 16750623, 1);
            }
            s.d.c(360, 5);
            Client.gl.c(var0.L == 0 ? "Fighters:" : "Kills:", 386, 29, 16750623, 1);
            Client.gl.c("Your clan", 417, 18, 0xFF0000, 1);
            Client.gl.c("" + var0.M, 417, 29, 0xFF0000, 1);
            Client.gl.c("Opponents", 472, 18, 4550143, 1);
            Client.gl.c("" + var0.N, 472, 29, 4550143, 1);
        }
        g_0.h();
        var0.m.a();
        var0.o.a();
        var0.n.a();
        q.a(var0.u);
        var0.y.a();
        if (Client.w.b) {
            Client.w.b();
        }
        if (!rs.k.e.a()) {
            rs.l.b.c.b(var0);
        }
    }
}

