/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b;

import rs.Client;
import rs.d.e;
import rs.d.k;
import rs.d.n;
import rs.l.b.a;
import rs.l.c;
import rs.l.e.f;
import rs.l.e.i;
import rs.l.e_0;
import rs.l.f_0;
import rs.l.h;
import rs.l.k_0;
import rs.n.a.a.b;
import rs.n.c.ab;
import rs.n.c.ac;
import rs.n.c.ad_0;
import rs.n.c.ag;
import rs.n.c.n_0;
import rs.n.e;
import rs.q.a.a.a.g;

public class d {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(Client client, int n2, int n3, e e2, int n4) {
        int n5;
        if (e2.aI != 0 || e2.al == null) {
            return;
        }
        if (e2.aQ && client.ef != e2.aw && client.ep != e2.aw && client.em != e2.aw) {
            return;
        }
        int n6 = c.l;
        int n7 = c.j;
        int n8 = c.m;
        int n9 = c.k;
        int n10 = 0;
        rs.n.c.b.a.m(e2.aw);
        n2 += e2.bb;
        e2.bB = n3 += e2.ba;
        e2.bC = n4;
        int n11 = e2.P;
        int n12 = e2.aR;
        c.c(n4 + n12, n3, n3 + n11, n4 - n10);
        int n13 = e2.al.length;
        boolean bl = false;
        if (e2.aw == 1151) {
            e e3 = e.H[3214];
            for (n5 = 0; n5 < e3.az.length; ++n5) {
                if (e3.az[n5] != 6820 && e3.az[n5] != 23112) continue;
                bl = true;
                break;
            }
        }
        rs.n.b.a.d.d.a(e2.aw);
        e2.g();
        e2.f(n3, n4);
        for (int i2 = 0; i2 < n13; ++i2) {
            int n14;
            int n15;
            e e4;
            int n16;
            block133: {
                block144: {
                    block147: {
                        int n17;
                        int n18;
                        block146: {
                            block145: {
                                block143: {
                                    Object object;
                                    block142: {
                                        block141: {
                                            block140: {
                                                int n19;
                                                rs.a.h h2;
                                                block139: {
                                                    f_0 f_02;
                                                    block138: {
                                                        block137: {
                                                            block136: {
                                                                block135: {
                                                                    int n20;
                                                                    block134: {
                                                                        block132: {
                                                                            n5 = e2.am[i2] + n3;
                                                                            n16 = e2.bc[i2] + n4 - n2;
                                                                            e4 = e.H[e2.al[i2]];
                                                                            e4.g();
                                                                            n5 += e4.ba;
                                                                            n16 += e4.bb;
                                                                            if (e4 == null) {
                                                                                System.out.println("Nulled child of I" + e2.aw + ": " + i2);
                                                                                continue;
                                                                            }
                                                                            if (!e4.bf || !e2.bg || e4.aw == 32431 && ((b)e4).i() != i2 || e4.aw == 26708 && !e.H[26705].at.contains("Bank") || (e4.aw == 40603 || e4.aw == 40604) && e.H[40602].at.equalsIgnoreCase("Hunger games loot chest") || !client.j(e4.aw)) continue;
                                                                            if (e4.af == 2043 && e4.aI == 6) {
                                                                                n16 -= 7;
                                                                            }
                                                                            boolean bl2 = false;
                                                                            for (n15 = 0; n15 < rs.n.c.h.bI.length; ++n15) {
                                                                                object = rs.n.c.h.bI[n15];
                                                                                if (object[0] != e4.aw || client.i(n15)) continue;
                                                                                bl2 = true;
                                                                                break;
                                                                            }
                                                                            if (bl2) continue;
                                                                            n5 += e4.aJ;
                                                                            n16 += e4.aP;
                                                                            if (e4.J > 0) {
                                                                                client.a(e4);
                                                                            }
                                                                            for (n15 = 0; n15 < client.cm.length; ++n15) {
                                                                                if (e4.aw != client.cm[n15] + 1) continue;
                                                                                if (n15 > 61) {
                                                                                    client.f(n5 + 1, n16);
                                                                                    continue;
                                                                                }
                                                                                client.f(n5, n16 + 1);
                                                                            }
                                                                            for (n15 = 0; n15 < client.cn.length; ++n15) {
                                                                                if (e4.aw != client.cn[n15]) continue;
                                                                                e4.aT = 775;
                                                                            }
                                                                            e4.f(n5, n16);
                                                                            if (e4.bG != null) {
                                                                                e4.bG.draw(n5, n16);
                                                                            }
                                                                            d.a(client, e4);
                                                                            if (e4.aI != 0) break block132;
                                                                            if (e4.V > e4.aH - e4.aR) {
                                                                                e4.V = e4.aH - e4.aR;
                                                                            }
                                                                            if (e4.V < 0) {
                                                                                e4.V = 0;
                                                                            }
                                                                            d.a(client, e4.V, n5, e4, n16);
                                                                            if (e4.aH > e4.aR) {
                                                                                client.b(e4.aR, e4.V, n16, n5 + e4.P, e4.aH);
                                                                            }
                                                                            break block133;
                                                                        }
                                                                        if (e4.aI == 1) break block133;
                                                                        if (e4.aI != 2) break block134;
                                                                        d.a(client, e2, e4, n5, n16, n2, n3);
                                                                        break block133;
                                                                    }
                                                                    if (e4.aI != 3) break block135;
                                                                    n15 = 0;
                                                                    if (client.em == e4.aw || client.ep == e4.aw || client.ef == e4.aw) {
                                                                        n15 = 1;
                                                                    }
                                                                    if (client.b(e4)) {
                                                                        n20 = e4.O;
                                                                        if (n15 != 0 && e4.ak != 0) {
                                                                            n20 = e4.ak;
                                                                        }
                                                                    } else {
                                                                        n20 = e4.ad;
                                                                        if (n15 != 0 && e4.L != 0) {
                                                                            n20 = e4.L;
                                                                        }
                                                                    }
                                                                    if (e4.aC == 0) {
                                                                        if (e4.Y) {
                                                                            c.a(e4.aR, n16, n5, n20, e4.P);
                                                                        } else {
                                                                            c.d(n5, e4.P, e4.aR, n20, n16);
                                                                        }
                                                                    } else if (e4.Y) {
                                                                        c.d(n5, n16, e4.P, e4.aR, n20, 256 - (e4.aC & 0xFF));
                                                                    } else {
                                                                        c.f(n16, e4.aR, 256 - (e4.aC & 0xFF), n20, e4.P, n5);
                                                                    }
                                                                    break block133;
                                                                }
                                                                if (e4.aI != 15) break block136;
                                                                n15 = e4.w >= 100 ? e4.z : e4.y;
                                                                int n21 = e4.B;
                                                                int n22 = e4.w >= 100 ? e4.P : (int)((double)e4.w / 100.0 * (double)e4.P);
                                                                c.a(n5 - n21, n16 - n21, e4.P + n21 * 2, e4.aR + n21 * 2, e4.A, 255);
                                                                c.a(n5, n16, e4.P, e4.aR, e4.x, 255);
                                                                c.a(n5, n16, n22, e4.aR, n15, 255);
                                                                break block133;
                                                            }
                                                            if (e4.aI != 4) break block137;
                                                            d.a(client, e2, e4, n5, n16);
                                                            break block133;
                                                        }
                                                        if (e4.aI != 42 || !(e4 instanceof rs.n.a.a.a)) break block138;
                                                        rs.n.a.a.c.a((rs.n.a.a.a)e4, n5, n16, e2.aH > 0);
                                                        break block133;
                                                    }
                                                    if (e4.aI != 5) break block139;
                                                    if (bl || e4.bz && Client.br == e4.aw || client.b(e4)) {
                                                        f_02 = e4.aG;
                                                        object = e4.j;
                                                    } else {
                                                        f_02 = e4.E;
                                                        object = e4.i;
                                                    }
                                                    if (f_02 != null) {
                                                        e4.bB = n5;
                                                        e4.bC = n16;
                                                        if (client.eW == 1 && e4.aw == client.bq && client.bq != 0) {
                                                            f_02.f(n5, n16, 0xFFFFFF);
                                                        } else if (e4.l) {
                                                            if (e4.m) {
                                                                ad_0.d.c(n5, n16);
                                                            } else {
                                                                f_02.c(n5, n16);
                                                            }
                                                        } else {
                                                            f_02.f(n5, n16);
                                                        }
                                                        if (object != null) {
                                                            if (Client.br == e4.aw) {
                                                                object.f(n5, n16);
                                                            }
                                                        }
                                                    }
                                                    if (client.U) {
                                                        if (e4.aw == Client.T && e4.aw == client.S) {
                                                            client.Y.f(n5 - 3, n16 - 3);
                                                        }
                                                    }
                                                    break block133;
                                                }
                                                if (e4.aI != 6) break block140;
                                                n15 = e_0.s;
                                                int n23 = e_0.t;
                                                e_0.s = n5 + e4.P / 2;
                                                e_0.t = n16 + e4.aR / 2;
                                                int n24 = e_0.v[e4.aU] * e4.aT >> 16;
                                                int n25 = e_0.w[e4.aU] * e4.aT >> 16;
                                                boolean bl3 = client.b(e4);
                                                int n26 = bl3 ? e4.aE : e4.aD;
                                                if (n26 == -1 || e4.aN > 0) {
                                                    e_0.h = true;
                                                    try {
                                                        h2 = e4.a(-1, -1, bl3, -1, -1);
                                                    }
                                                    finally {
                                                        e_0.h = false;
                                                    }
                                                }
                                                rs.d.a a2 = rs.d.a.a[n26];
                                                e_0.h = true;
                                                try {
                                                    if (a2.f != null) {
                                                        if (e4.ar >= a2.f.length || e4.ar >= a2.e.length) {
                                                            h2 = e4.a(-1, -1, bl3, -1, -1);
                                                        } else {
                                                            n19 = e4.ar;
                                                            if (a2.r == 8233) {
                                                                n19 = 2;
                                                                client.a(62, 20L);
                                                            }
                                                            h2 = e4.a(a2.f[n19], a2.e[n19], bl3, a2.r, a2.r);
                                                        }
                                                    } else {
                                                        h2 = e4.a(-1, a2.b() ? e4.ar : a2.e[e4.ar], bl3, a2.r, a2.r);
                                                    }
                                                }
                                                finally {
                                                    e_0.h = false;
                                                }
                                                if (h2 != null) {
                                                    int n27 = 0;
                                                    if (e4.aK) {
                                                        if (e4.aM == 0) {
                                                            e4.aV = (int)((ab.bM ? 1050.0 : 0.0) + Math.sin((double)Client.ff / 40.0) * 256.0) & 0x7FF;
                                                            e4.aU = 150;
                                                            n27 = -150;
                                                        } else {
                                                            e4.aV = (int)((double)e4.aM + Math.sin((double)Client.ff / 40.0) * 256.0) & 0x7FF;
                                                            n27 = -10;
                                                        }
                                                        h2.F = true;
                                                        client.a(51, 20L);
                                                        client.a(52, 20L);
                                                        client.a(53, 20L);
                                                        client.a(54, 20L);
                                                        client.a(57, 20L);
                                                        client.a(60, 20L);
                                                        client.a(61, 20L);
                                                        client.a(62, 20L);
                                                    }
                                                    e_0.h = true;
                                                    e_0.q = false;
                                                    n19 = c.k;
                                                    try {
                                                        if (e4.aY) {
                                                            if (e2.aw == 57016) {
                                                                c.k = n19 - 1;
                                                                h2.O = 0;
                                                                h2.F = true;
                                                            } else {
                                                                c.k = n19 - 32;
                                                            }
                                                            h2.a(e4.aV, 0, e4.aU, 0, n24, n25, e4.P, e4.aR);
                                                        } else if (e4.aN == 0) {
                                                            if (e4.aw == 4883 || e4.aw == 4888 || e4.aw == 4894 || e4.aw == 4901) {
                                                                c.k = n19 - 32;
                                                            }
                                                            h2.a(e4.aV, 0, e4.aU, 0, n24, n25 + n27);
                                                        } else {
                                                            c.k = n19 - 32;
                                                            k k2 = k.f(e4.aN);
                                                            h2.a(e4.aV, k2.ae, e4.aU, k2.v, n24 + h2.g / 2 + k2.W, n25 + k2.W);
                                                        }
                                                    }
                                                    finally {
                                                        e_0.h = false;
                                                        e_0.q = true;
                                                        c.k = n19;
                                                    }
                                                }
                                                if (e4.af == 4907 && Client.cH == 47500) {
                                                    Client.gl.b("@or1@(Male)", n5 + 33 + 5, n16 + 1, 0xFFFFFF, 0);
                                                }
                                                if (e4.af == 4908 && Client.cH == 47500) {
                                                    Client.gl.b("@or1@(Female)", n5 + 26 + 8, n16 + 1, 0xFFFFFF, 0);
                                                }
                                                e_0.s = n15;
                                                e_0.t = n23;
                                                break block133;
                                            }
                                            if (e4.aI != 7) break block141;
                                            k_0 k_02 = e4.ao;
                                            int n28 = 0;
                                            for (int i3 = 0; i3 < e4.aR; ++i3) {
                                                for (int i4 = 0; i4 < e4.P; ++i4) {
                                                    if (e4.az[n28] > 0) {
                                                        k k3 = k.f(e4.az[n28] - 1);
                                                        Object object2 = k3.w;
                                                        if (k3.C || e4.ax[n28] != 1) {
                                                            object2 = (String)object2 + " x" + Client.o(e4.ax[n28]);
                                                        }
                                                        int n29 = n5 + i4 * (115 + e4.ac);
                                                        n14 = n16 + i3 * (12 + e4.ap);
                                                        if (e4.S) {
                                                            k_02.a(e4.ad, n29 + e4.P / 2, (String)object2, n14, e4.aS);
                                                        } else {
                                                            k_02.a(e4.aS, n29, e4.ad, (String)object2, n14);
                                                        }
                                                    }
                                                    ++n28;
                                                }
                                            }
                                            break block133;
                                        }
                                        if (e4.aI != 21) break block142;
                                        n15 = e4.P;
                                        if (e4.af >= 0 && n5 >= c.l - n15 && n5 < c.m && n16 > c.j - n15 && n16 < c.k && (object = rs.d.e.a(e.a.a, e4.af, e4.P)) != null) {
                                            object.f(n5, n16);
                                        }
                                        break block133;
                                    }
                                    if (e4.aI != 22) break block143;
                                    n15 = e4.P;
                                    if (e4.af >= 0 && n5 >= c.l - n15 && n5 < c.m && n16 > c.j - n15 && n16 < c.k && (object = rs.d.e.a(e.a.b, e4.af, e4.P)) != null) {
                                        object.f(n5, n16);
                                    }
                                    break block133;
                                }
                                if (e4.aI != 20) break block144;
                                n15 = e4.bq;
                                n18 = 0;
                                n17 = e4.P;
                                if (Client.cH == 39975) break block145;
                                if (Client.cH == 24535) break block145;
                                if (Client.cH != 38975) break block146;
                            }
                            n15 = 100000;
                        }
                        if (e4.aj == 64071) {
                            n15 = 100000;
                        }
                        if (e4.af < 0) break block133;
                        if (e4.T) {
                            n5 += Math.max(5, e.l((int)57016).P / 2) - n17 / 2;
                        }
                        if (n5 < c.l - n17 || n5 >= c.m || n16 <= c.j - n17 || n16 >= c.k) break block133;
                        f_0 f_03 = k.a(e4.af, n15, n18, n17);
                        if (f_03 != null) {
                            f_03.f(n5, n16);
                        }
                        if (n15 <= 1) break block133;
                        if (Client.cH == 57000) break block147;
                        if (Client.cH != 56998) break block133;
                    }
                    if (n15 >= 1) {
                        Client.gh.b(0xFFFF00, Client.g(n15), n16 + 9, n5);
                    }
                    if (n15 >= 100000) {
                        Client.gh.b(0xFFFFFF, Client.g(n15), n16 + 9, n5);
                    }
                    if (n15 >= 10000000) {
                        Client.gh.b(65408, Client.g(n15), n16 + 9, n5);
                    }
                    break block133;
                }
                if (e4.aI == 11) {
                    c.c(e4.bd, 0, 765, 503, 256 - (e4.bi & 0xFF), 0);
                }
            }
            if (e4.aI == 8) {
                int n30 = 0;
                int n31 = 0;
                k_0 k_03 = e4.ao;
                String string = e4.at;
                while (string.length() > 0) {
                    String string2;
                    int n32 = string.indexOf("\\n");
                    if (n32 != -1) {
                        string2 = string.substring(0, n32);
                        string = string.substring(n32 + 2);
                    } else {
                        string2 = string;
                        string = "";
                    }
                    if (string2 == null || k_03 == null) continue;
                    int n33 = k_03.a(string2);
                    if (n33 > n30) {
                        n30 = n33;
                    }
                    n31 += k_03.r + 1;
                }
                n31 += 7;
                int n34 = n5 + e4.P - 5 - (n30 += 6);
                int n35 = n16 + e4.aR + 5;
                if (n34 < n5 + 5) {
                    n34 = n5 + 5;
                }
                if (n34 + n30 > n3 + e2.P) {
                    n34 = n3 + e2.P - n30;
                }
                if (n35 + n31 > n4 + e2.aR) {
                    n35 = n4 + e2.aR - n31;
                }
                switch (e4.aw) {
                    case 9217: 
                    case 9220: 
                    case 9223: 
                    case 9226: 
                    case 9229: 
                    case 9232: 
                    case 9235: 
                    case 9238: {
                        n34 -= 80;
                        break;
                    }
                    case 9239: {
                        n35 -= 100;
                    }
                }
                c.e(n34, n35, n30, n31, 0xFFFFA0);
                c.d(n34, n30, n31, 0, n35);
                String string3 = e4.at;
                if (k_03 == null) {
                    System.out.println("Nulled: " + e4.aw);
                }
                int n36 = n35 + k_03.r + 2;
                while (string3.length() > 0) {
                    String string4;
                    int n37 = string3.indexOf("\\n");
                    if (n37 != -1) {
                        string4 = string3.substring(0, n37);
                        string3 = string3.substring(n37 + 2);
                    } else {
                        string4 = string3;
                        string3 = "";
                    }
                    k_03.a(false, n34 + 3, 0, string4, n36);
                    n36 += k_03.r + 1;
                }
                c.c(n9, n6, n8, n7);
            }
            if (e4.aI == 12) {
                f_0 f_04 = client.b(e4) ? e4.aG : e4.E;
                if (f_04 != null) {
                    f_04.c(n5, n16);
                }
            } else if (e4.aI == 9) {
                client.c(n5, n16, e4.at);
            }
            if (e4.aI == 10) {
                int n38 = 0;
                int n39 = 0;
                k_0 k_04 = client.gi;
                String string = e4.at;
                while (string.length() > 0) {
                    String string5;
                    int n40 = string.indexOf("\\n");
                    if (n40 != -1) {
                        string5 = string.substring(0, n40);
                        string = string.substring(n40 + 2);
                    } else {
                        string5 = string;
                        string = "";
                    }
                    int n41 = k_04.a(string5);
                    if (n41 > n38) {
                        n38 = n41;
                    }
                    n39 += k_04.r + 1;
                }
                n39 += 7;
                int n42 = n5 + e4.P - 5 - (n38 += 6);
                int n43 = n16 + e4.aR + 5;
                if (n42 < n5 + 5) {
                    n42 = n5 + 5;
                }
                if (n42 + n38 > n3 + e2.P) {
                    n42 = n3 + e2.P - n38;
                }
                if (n43 + n39 > n4 + e2.aR) {
                    n43 = n4 + e2.aR - n39;
                }
                if (e4.bh) {
                    if (n42 + n38 + n3 > 249) {
                        n42 = 251 - n38 - n3;
                    }
                    if (n43 + n39 + n4 > 261) {
                        n43 = 245 - n39 - n4;
                    }
                }
                c.a(n39, n43, n42, 0xFFFFA0, n38);
                c.d(n42, n38, n39, 0, n43);
                String string6 = e4.at;
                int n44 = n43 + k_04.r + 2;
                while (string6.length() > 0) {
                    String string7;
                    n14 = string6.indexOf("\\n");
                    if (n14 != -1) {
                        string7 = string6.substring(0, n14);
                        string6 = string6.substring(n14 + 2);
                    } else {
                        string7 = string6;
                        string6 = "";
                    }
                    k_04.a(false, n42 + 3, 0, string7, n44);
                    n44 += k_04.r + 1;
                }
            }
            if (rs.f.a.am) {
                if (Client.cT == 2) {
                    Client.gl.a("" + e4.aw, n5, n16);
                }
            }
            for (n15 = 0; n15 < f.m.size(); ++n15) {
                if (!f.m.get(n15).e() || f.m.get(n15).d().b(e4.aw) == null) continue;
                f f2 = f.m.get(n15);
                ((i)f2.d().b(e4.aw)).a(e4, n5, n16);
            }
            rs.l.f.e.d().a(e2.al[i2], n5, n16);
            if (rs.f.a.an) {
                if (e4.al != null) {
                    Client.gl.b("@or1@" + e4.aw, n5, n16, 0xFFFFFF, 0);
                } else {
                    Client.gl.b("@cya@" + e4.aw, n5, n16, 0xFFFFFF, 0);
                }
            }
            if (e4.bH == null) continue;
            e4.bH.draw(n5, n16);
        }
        rs.l.f.e.d().a(e2.aw, n3, n2);
        c.c(n9, n6, n8, n7);
    }

    private static void a(Client client, e e2) {
        if (e2.at != e2.au) {
            e2.au = e2.at = client.b(e2.at);
        }
        if (e2.Z != e2.aa) {
            e2.aa = e2.Z = client.b(e2.Z);
        }
    }

    public static void a(Client client, e e2, e e3, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        k_0 k_02 = e3.ao;
        Object object = e3.at;
        if (e3.aw == 47812 && client.gb && client.fN == 31) {
            object = "<img=39> " + client.fB + "*";
        }
        boolean bl = false;
        if (client.em == e3.aw || client.ep == e3.aw || client.ef == e3.aw) {
            bl = true;
        }
        boolean bl2 = false;
        if (client.b(e3)) {
            n7 = e3.O;
            if (bl && e3.ak != 0) {
                n7 = e3.ak;
            }
            if (e3.Z.length() > 0 && e3.aw != 199) {
                object = e3.Z;
            }
        } else {
            n7 = e3.ad;
            if (bl && e3.L != 0) {
                n7 = e3.L;
            }
        }
        if (e3.M == 6 && client.eZ) {
            object = "Please wait...";
            n7 = e3.ad;
        }
        if (!(client.gp == -1 && client.en == -1 && !e3.at.contains("Click here to continue") || e2.aw != client.gp && e2.aw != client.en)) {
            if (n7 == 0xFFFF00) {
                n7 = 255;
            }
            if (n7 == 49152) {
                bl2 = true;
                n7 = 0xFFFFFF;
            }
        }
        if (Client.cH == 64272 && e3.ah >= 60000 && e3.ah <= 65000 && (e3.aw < 64287 || e3.aw > 64290) && n7 == 0xFFFFFF) {
            bl2 = true;
            n7 = 0xFFFFFF;
        }
        if (e3.bo && n7 == 0xFFFFFF) {
            bl2 = true;
            n7 = e3.L;
        }
        if (e3.ah == 1151 || e3.ah == 12855) {
            switch (n7) {
                case 0xFFF000: {
                    n7 = 16685087;
                    break;
                }
                case 7040819: {
                    n7 = 11495962;
                }
            }
        }
        if (e3.br != 0) {
            n6 = 400;
            n5 = e3.bt == 0 ? e3.aR : (int)e3.bt;
            n4 = 0;
            if (e3.bt != 0 && e3.bt > e3.aR) {
                n4 = e3.bt - e3.aR;
            }
            if (e3.bu > -1) {
                n6 = e3.bu;
            }
            c.b(n5 + n4 / 2, n3 - n4 / 2, n2 - n6 / 2, e3.br, n6 * 2, e3.bs);
        }
        n6 = n3 + k_02.r;
        while (((String)object).length() > 0) {
            Object object2;
            if (((String)object).indexOf("%") != -1) {
                while ((n5 = ((String)object).indexOf("%1")) != -1) {
                    if (e3.aw < 4000 || e3.aw > 5000 && e3.aw != 13921 && e3.aw != 13922 && e3.aw != 12171 && e3.aw != 12172) {
                        object = ((String)object).substring(0, n5) + client.k(client.a(e3, 0)) + ((String)object).substring(n5 + 2);
                        continue;
                    }
                    object = ((String)object).substring(0, n5) + client.h(client.a(e3, 0)) + ((String)object).substring(n5 + 2);
                }
                while ((n5 = ((String)object).indexOf("%2")) != -1) {
                    object = ((String)object).substring(0, n5) + client.h(client.a(e3, 1)) + ((String)object).substring(n5 + 2);
                }
                while ((n5 = ((String)object).indexOf("%3")) != -1) {
                    object = ((String)object).substring(0, n5) + client.h(client.a(e3, 2)) + ((String)object).substring(n5 + 2);
                }
                while ((n5 = ((String)object).indexOf("%4")) != -1) {
                    object = ((String)object).substring(0, n5) + client.h(client.a(e3, 3)) + ((String)object).substring(n5 + 2);
                }
                while ((n5 = ((String)object).indexOf("%5")) != -1) {
                    object = ((String)object).substring(0, n5) + client.h(client.a(e3, 4)) + ((String)object).substring(n5 + 2);
                }
            }
            n5 = ((String)object).contains("\\n") ? 1 : 0;
            n4 = ((String)object).indexOf("\\n");
            if (n4 != -1) {
                object2 = ((String)object).substring(0, n4);
                object = ((String)object).substring(n4 + 2);
            } else {
                object2 = object;
                object = "";
            }
            h h2 = null;
            if (k_02 == Client.gh) {
                h2 = Client.gl;
            } else if (k_02 == client.gi) {
                h2 = client.gm;
            } else if (k_02 == Client.gj) {
                h2 = client.gn;
            } else if (k_02 == client.gk) {
                h2 = client.go;
            }
            boolean bl3 = false;
            boolean bl4 = false;
            if (e3.aw == 49988 || e3.bv) {
                int n8;
                if (Client.br == 49991 || e3.bv) {
                    bl4 = true;
                    if (e3.bv) {
                        bl3 = true;
                    }
                } else {
                    Client.bP = 149;
                    Client.bQ = -1;
                }
                if ((n8 = 150 - Client.bN) < 50) {
                    n7 = 0xFF0000 + 1280 * n8;
                } else if (n8 < 100) {
                    n7 = 0xFFFF00 - 327680 * (n8 - 50);
                } else if (n8 < 150) {
                    n7 = 65280 + 5 * (n8 - 100);
                }
            }
            if (e3.S) {
                if (e3.T && e3.ah > 0) {
                    n2 += Math.max(15, e.l((int)57016).P - 372);
                }
                if (n5 != 0) {
                    if (Client.cH == 39975) {
                        n6 -= 5;
                    }
                }
                if (bl4) {
                    Client.gj.a(150 - Client.bP, (String)object2, Client.gg, n6 + 1, n2 + e3.P / 2, 0);
                    Client.gj.a(150 - Client.bP, (String)object2, Client.gg, n6, n2 + e3.P / 2, n7);
                } else if (bl3) {
                    Client.gj.b(n2 + e3.P / 2, (String)object2, Client.gg, n6 + 1, 0);
                    Client.gj.b(n2 + e3.P / 2, (String)object2, Client.gg, n6, n7);
                } else {
                    h2.b((String)object2, n2 + e3.P / 2, n6, n7, e3.aS ? 0 : -1, bl2);
                }
            } else if (e3.U) {
                if (e3.T && e3.ah > 0) {
                    n2 += Math.max(15, e.l((int)57016).P - 10);
                }
                h2.b((String)object2, n2 - h2.a((String)object2, true), n6, n7, e3.aS ? 0 : -1);
            } else {
                h2.a((String)object2, n2, n6, n7, e3.aS ? 0 : -1, bl2);
            }
            n6 += k_02.r;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void a(Client var0, e var1_1, e var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        var7_7 = 0;
        if (rs.f.a.an) {
            var0.gn.b("@gre@" + var2_2.aw, var3_3, var4_4, 0xFFFFFF, 0);
        }
        if (var2_2.aA && !a.a() && Client.ff % 15 == 0) {
            ++var2_2.aB;
            if (var2_2.aB >= var2_2.az.length) {
                var2_2.aB = 0;
            }
        }
        for (var8_8 = 0; var8_8 < var2_2.aR; ++var8_8) {
            for (var9_9 = 0; var9_9 < var2_2.P; ++var9_9) {
                block158: {
                    block157: {
                        block160: {
                            block165: {
                                block164: {
                                    block163: {
                                        block162: {
                                            block161: {
                                                block159: {
                                                    var10_10 = var3_3 + var9_9 * (32 + var2_2.ac);
                                                    var11_11 = var4_4 + var8_8 * (32 + var2_2.ap);
                                                    var12_12 = var7_7;
                                                    if (var2_2.aA) {
                                                        var12_12 = var2_2.aB + var7_7 >= var2_2.az.length ? var2_2.aB + var7_7 - var2_2.az.length : var2_2.aB + var7_7;
                                                    }
                                                    if (var12_12 < 20) {
                                                        var10_10 += var2_2.K[var12_12];
                                                        var11_11 += var2_2.as[var12_12];
                                                    }
                                                    if (var2_2.az[var12_12] <= 0) break block157;
                                                    var13_13 = 0;
                                                    var14_15 = 0;
                                                    var15_16 = var2_2.az[var12_12] - 1;
                                                    if ((var10_10 <= c.l - 32 || var10_10 >= c.m || var11_11 <= c.j - 32 || var11_11 >= c.k) && (var0.eA == 0 || var0.ey != var12_12)) break block158;
                                                    var16_17 = 0;
                                                    if (var0.gr == 1 && var0.gs == var12_12 && var0.gt == var2_2.aw) {
                                                        var16_17 = 0xFFFFFF;
                                                    }
                                                    if (var16_17 == 0) {
                                                        if (var15_16 == 21071 || var15_16 == 21676 || var15_16 == 21665 || var15_16 == 20558 || var15_16 == 6200 || var15_16 == 14523 || var15_16 == 10524 || var15_16 == 20539 || var15_16 == 21095 || var15_16 == 20807 || var15_16 == 20798 || var15_16 == 22085) {
                                                            var0.a(54, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23907) {
                                                            var0.a(213, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 24180) {
                                                            var0.a(74, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 24181) {
                                                            var0.a(55, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 24182) {
                                                            var0.a(71, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22076) {
                                                            var0.a(121, 20L);
                                                            var0.a(54, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22118) {
                                                            var0.a(60, 20L);
                                                            var0.a(75, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23620) {
                                                            var0.a(185, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23621) {
                                                            var0.a(51, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23622) {
                                                            var0.a(61, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23624) {
                                                            var0.a(74, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23625) {
                                                            var0.a(157, 20L);
                                                            var0.a(172, 20L);
                                                            var0.a(76, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23984) {
                                                            var0.a(207, 20L);
                                                            var0.a(159, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23626) {
                                                            var0.a(157, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23627) {
                                                            var0.a(148, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23628) {
                                                            var0.a(179, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23629) {
                                                            var0.a(254, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23988) {
                                                            var0.a(197, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23630) {
                                                            var0.a(159, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23631) {
                                                            var0.a(157, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23632) {
                                                            var0.a(159, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23633) {
                                                            var0.a(152, 20L);
                                                            var0.a(172, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23653) {
                                                            var0.a(142, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23635 || var15_16 == 23638 || var15_16 == 23650) {
                                                            var0.a(124, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 >= 21834 && var15_16 <= 21843) {
                                                            var0.a(60, 20L);
                                                            var0.a(62, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 21805 || var15_16 == 21781 || var15_16 == 21773 || var15_16 == 21779 | var15_16 == 21778 || var15_16 == 21786 || var15_16 == 21785 || var15_16 == 21783 || var15_16 == 21780 || var15_16 == 21780 || var15_16 == 21784 || var15_16 == 21775 || var15_16 == 21776 || var15_16 == 21774 || var15_16 == 21777 || var15_16 == 21801 || var15_16 == 21802 || var15_16 == 21803 || var15_16 == 21820) {
                                                            var0.a(70, 20L);
                                                            var0.a(120, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 25022 || var15_16 == 25023 || var15_16 == 25024) {
                                                            var0.a(54, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 24222 || var15_16 == 24223 || var15_16 == 24224 || var15_16 == 24220 || var15_16 == 24212 || var15_16 == 24209 || var15_16 == 24208) {
                                                            var0.a(283, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 21880 || var15_16 == 21940 || var15_16 == 21899 || var15_16 == 21946 || var15_16 == 21924 || var15_16 == 21923) {
                                                            var0.a(55, 20L);
                                                            var0.a(56, 20L);
                                                            var0.a(72, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22843 || var15_16 == 6203 || var15_16 == 22949 || var15_16 == 22100) {
                                                            var0.a(61, 20L);
                                                            var0.a(62, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22852 || var15_16 == 22850) {
                                                            var0.a(40, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22034 || var15_16 == 22035) {
                                                            var0.a(87, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23674) {
                                                            var0.a(61, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22040 || var15_16 == 22059 || var15_16 == 23660 || var15_16 == 23661 || var15_16 == 23662) {
                                                            var0.a(212, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22825) {
                                                            var0.a(58, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 20701 || var15_16 == 24175 || var15_16 == 24179) {
                                                            var0.a(53, 20L);
                                                            var0.a(55, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22033) {
                                                            var0.a(80, 20L);
                                                            var0.a(62, 20L);
                                                            var0.a(63, 20L);
                                                            var0.a(34, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22786 || var15_16 == 22779 || var15_16 == 22780 || var15_16 == 22799 || var15_16 == 22777 || var15_16 == 22778 || var15_16 == 22786 || var15_16 == 22787 || var15_16 == 20955 || var15_16 == 22801 || var15_16 == 22803 || var15_16 == 22804 || var15_16 == 22810 || var15_16 == 20737 || var15_16 == 22853 || var15_16 == 22851) {
                                                            var0.a(56, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22790 || var15_16 == 22789 || var15_16 == 22783 || var15_16 == 22791 || var15_16 == 22789 || var15_16 == 22784 || var15_16 == 22798 || var15_16 == 22781 || var15_16 == 22782 || var15_16 == 22800 || var15_16 == 22686 || var15_16 == 22805 || var15_16 == 22806 || var15_16 == 22809 || var15_16 == 21665 || var15_16 == 21676 || var15_16 == 21605) {
                                                            var0.a(70, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 21732) {
                                                            var0.a(56, 20L);
                                                            var0.a(54, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 >= 21710 && var15_16 <= 21712 || var15_16 == 6202 || var15_16 == 21702 || var15_16 == 21704 || var15_16 == 21709 || var15_16 == 22878 || var15_16 == 22879 || var15_16 >= 21706 && var15_16 <= 21708 || var15_16 == 22123 || var15_16 == 22125 || var15_16 == 22129) {
                                                            var0.a(54, 20L);
                                                            var0.a(60, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 21702) {
                                                            var0.a(56, 20L);
                                                            var0.a(63, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 21691 || var15_16 == 21692 || var15_16 == 21690 || var15_16 == 21699 || var15_16 == 21700 || var15_16 == 23229) {
                                                            var0.a(60, 20L);
                                                            var0.a(68, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23218 || var15_16 == 23219 || var15_16 == 23210 || var15_16 == 23211 || var15_16 == 23212 || var15_16 == 23212 || var15_16 == 23224) {
                                                            var0.a(60, 20L);
                                                            var0.a(61, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23203) {
                                                            var0.a(75, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 23205 || var15_16 == 23209 || var15_16 == 23217) {
                                                            var0.a(60, 20L);
                                                            var0.a(68, 20L);
                                                            var0.a(110, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 21069) {
                                                            var0.a(56, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 16000) {
                                                            var0.a(34, 50L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 25424) {
                                                            var0.a(58, 50L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 >= 16001 && var15_16 <= 16006) {
                                                            var0.a(34, 50L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 16007) {
                                                            var0.a(208, 50L);
                                                            var0.a(249, 50L);
                                                            var0.a(240, 50L);
                                                            var0.a(34, 50L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 21040 || var15_16 == 21133 || var15_16 == 21134 || var15_16 == 21563 || var15_16 == 23072 || var15_16 == 22067 || var15_16 == 23073 || var15_16 == 23074 || var15_16 == 23075 || var15_16 == 23071 || var15_16 == 23069 || var15_16 == 23067 || var15_16 == 23068 || var15_16 == 22023 || var15_16 == 22025 || var15_16 == 22024 || var15_16 == 22014) {
                                                            var0.a(62, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22055 || var15_16 == 22056 || var15_16 == 22015 || var15_16 == 22027) {
                                                            var0.a(109, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 22028) {
                                                            var0.a(75, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 20743 || var15_16 == 21072) {
                                                            var0.a(62, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 20731 || var15_16 == 21087 || var5_5 == 20701) {
                                                            var0.a(53, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 15005 || var15_16 == 21041 || var15_16 == 21605) {
                                                            var0.a(58, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 20722 || var15_16 == 21675) {
                                                            var0.a(60, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 21674) {
                                                            var0.a(61, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 20695) {
                                                            var0.a(58, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 20558) {
                                                            var0.a(52, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 20540 || var15_16 == 21063) {
                                                            var0.a(55, 40L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 20541) {
                                                            var0.a(55, 24L);
                                                            var16_17 = 16705;
                                                        }
                                                        if (var15_16 == 20524 || var15_16 == 20577 || var15_16 == 13999) {
                                                            var0.a(55, 20L);
                                                            var16_17 = 16705;
                                                        }
                                                    }
                                                    if ((var17_18 = k.a(var15_16, var2_2.ax[var12_12], var16_17, var2_2.bD)) == null) break block158;
                                                    if (var0.eA == 0 || var0.ey != var12_12 || var0.ex != var2_2.aw) break block159;
                                                    var13_13 = Client.hP - var0.eB;
                                                    var14_15 = Client.hQ - var0.eC;
                                                    if (var13_13 < 5 && var13_13 > -5) {
                                                        var13_13 = 0;
                                                    }
                                                    if (var14_15 < 5 && var14_15 > -5) {
                                                        var14_15 = 0;
                                                    }
                                                    if (var0.dT < rs.f.a.bd) {
                                                        var13_13 = 0;
                                                        var14_15 = 0;
                                                    }
                                                    if (var2_2.aw == 5382) {
                                                        c.j -= 50;
                                                        c.i += 50;
                                                    }
                                                    var17_18.e(var10_10 + var13_13, var11_11 + var14_15);
                                                    if (var15_16 >= 21834 && var15_16 <= 21843 || var15_16 == 24043 || var15_16 == 24237) {
                                                        var0.J[3].f(var10_10 + var13_13 - (var15_16 == 21834 || var15_16 == 21838 ? 3 : 5), var11_11 + var14_15 - 1);
                                                    }
                                                    if (var15_16 == 24175) {
                                                        Client.fE[82].f(var10_10 + var13_13 + 15, var11_11 + var14_15 + 20);
                                                    }
                                                    if (var15_16 >= 23673 && var15_16 <= 23674) {
                                                        Client.fE[93].f(var10_10 + var13_13 - 3, var11_11 + var14_15 - 1);
                                                    }
                                                    if (n.b(var15_16)) {
                                                        n.a(var15_16, var10_10 + var13_13, var11_11 + var14_15);
                                                    }
                                                    if (var15_16 == 21964) {
                                                        var0.o.a[6].f(var10_10 + var13_13 - 3, var11_11 + var14_15 - 1);
                                                    }
                                                    if (var15_16 == 21963) {
                                                        var0.o.a[4].f(var10_10 + var13_13 - 3, var11_11 + var14_15 - 1);
                                                    }
                                                    if (var15_16 == 23063) {
                                                        var0.o.a[0].f(var10_10 + var13_13 - 1, var11_11 + var14_15 - 1);
                                                    }
                                                    if (var11_11 + var14_15 < c.j && var1_1.V > 0) {
                                                        var18_19 = var0.dE * (c.j - var11_11 - var14_15) / 3;
                                                        if (var18_19 > var0.dE * 10) {
                                                            var18_19 = var0.dE * 10;
                                                        }
                                                        if (var18_19 > var1_1.V) {
                                                            var18_19 = var1_1.V;
                                                        }
                                                        var1_1.V -= var18_19;
                                                        var0.eC += var18_19;
                                                    }
                                                    if (var11_11 + var14_15 + 32 > c.k && var1_1.V < var1_1.aH - var1_1.aR) {
                                                        var18_19 = var0.dE * (var11_11 + var14_15 + 32 - c.k) / 3;
                                                        if (var18_19 > var0.dE * 10) {
                                                            var18_19 = var0.dE * 10;
                                                        }
                                                        if (var18_19 > var1_1.aH - var1_1.aR - var1_1.V) {
                                                            var18_19 = var1_1.aH - var1_1.aR - var1_1.V;
                                                        }
                                                        var1_1.V += var18_19;
                                                        var0.eC -= var18_19;
                                                    }
                                                    break block160;
                                                }
                                                if (var0.fX == 0 || var0.fW != var12_12 || var0.fV != var2_2.aw) break block161;
                                                var17_18.e(var10_10, var11_11);
                                                if (var15_16 >= 21834 && var15_16 <= 21843 || var15_16 == 24043 || var15_16 == 24237) {
                                                    var0.J[3].f(var10_10 - (var15_16 == 21834 || var15_16 == 21838 ? 3 : 5), var11_11 - 1);
                                                }
                                                if (var15_16 == 24175) {
                                                    Client.fE[82].f(var10_10 + var13_13 + 15, var11_11 + var14_15 + 20);
                                                }
                                                if (var15_16 >= 23673 && var15_16 <= 23674) {
                                                    Client.fE[93].f(var10_10 + var13_13 - 3, var11_11 + var14_15 - 1);
                                                }
                                                if (n.b(var15_16)) {
                                                    n.a(var15_16, var10_10 + var13_13, var11_11 + var14_15);
                                                }
                                                if (var15_16 == 21964) {
                                                    var0.o.a[6].f(var10_10 - 3, var11_11 - 1);
                                                }
                                                if (var15_16 == 21963) {
                                                    var0.o.a[4].f(var10_10 - 3, var11_11 - 1);
                                                }
                                                if (var15_16 == 23063) {
                                                    var0.o.a[0].f(var10_10 - 1, var11_11 - 1);
                                                }
                                                break block160;
                                            }
                                            if (Client.cH == 60600 && var2_2.aw == 60602 && rs.l.e.a.h.C.get(var12_12) != null) {
                                                n_0.c.c(var10_10 - 6, var11_11 - 5);
                                            }
                                            if (Client.cH == 60200) {
                                                if (var2_2.aw == 60255 || var2_2.aw == 60258 || var2_2.aw == 60261) {
                                                    n_0.d.c(var10_10 - 6, var11_11 - 6);
                                                }
                                                if (var2_2.aw == 60082 || var2_2.aw == 60085) {
                                                    if (var7_7 == 1) {
                                                        n_0.c.c(var10_10 - 6, var11_11 - 6);
                                                    } else {
                                                        n_0.d.c(var10_10 - 6, var11_11 - 6);
                                                    }
                                                }
                                                if (var2_2.aw == 60088) {
                                                    if (var7_7 == 2) {
                                                        n_0.c.c(var10_10 - 6, var11_11 - 6);
                                                    } else {
                                                        n_0.d.c(var10_10 - 6, var11_11 - 6);
                                                    }
                                                }
                                            }
                                            if (Client.cH == 50600 && var2_2.aw == 50615 && var12_12 == var0.P) {
                                                n_0.c.c(var10_10 - 6, var11_11 - 5);
                                            }
                                            var18_19 = 0;
                                            if (Client.cH == 3824 && var2_2.aw == 3900 && var0.ad.size() > 0) {
                                                var19_20 = 0;
                                                var20_21 = var0.ad.iterator();
                                                while (var20_21.hasNext()) {
                                                    var21_23 = var20_21.next();
                                                    if (var21_23 != var12_12) continue;
                                                    var19_20 = 1;
                                                }
                                                if (var19_20 == 0) {
                                                    var18_19 = 1;
                                                }
                                            }
                                            if (Client.cH == 36000 && ac.bJ && var2_2.ax[var12_12] == 0) {
                                                var18_19 = 1;
                                            }
                                            if (Client.cH == 3824) break block162;
                                            if (Client.cH != 54300) break block163;
                                        }
                                        if (var2_2.ax[var12_12] == 0) {
                                            var18_19 = 1;
                                        }
                                    }
                                    if (var2_2.bE && var2_2.ax[var12_12] == 0) {
                                        var18_19 = 1;
                                    }
                                    if (Client.cH == 60600) break block164;
                                    if (Client.cH != 23000) break block165;
                                }
                                if (var2_2.ax[var12_12] == 0) ** GOTO lbl-1000
                            }
                            if (Client.cH == 50600 && var2_2.aw == 50615 && var12_12 < var0.P || var18_19 != 0) lbl-1000:
                            // 2 sources

                            {
                                var17_18.g(var10_10, var11_11, Client.cH == 36000 ? 50 : 100);
                                if (var15_16 >= 21834 && var15_16 <= 21843 || var15_16 == 24043 || var15_16 == 24237) {
                                    var0.J[3].g(var10_10 - (var15_16 == 21834 || var15_16 == 21838 ? 3 : 5), var11_11 - 1, 100);
                                }
                                if (var15_16 == 24175) {
                                    Client.fE[82].f(var10_10 + var13_13 + 15, var11_11 + var14_15 + 20);
                                }
                                if (var15_16 >= 23673 && var15_16 <= 23674) {
                                    Client.fE[93].g(var10_10 + var13_13 - 3, var11_11 + var14_15 - 1, 100);
                                }
                                if (n.b(var15_16)) {
                                    n.a(var15_16, var10_10 + var13_13, var11_11 + var14_15);
                                }
                                if (var15_16 == 21964) {
                                    var0.o.a[6].g(var10_10 - 3, var11_11 - 1, 100);
                                }
                                if (var15_16 == 21963) {
                                    var0.o.a[4].g(var10_10 - 3, var11_11 - 1, 100);
                                }
                                if (var15_16 == 23063) {
                                    var0.o.a[0].g(var10_10 - 1, var11_11 - 1, 100);
                                }
                            } else if (var2_2.aw == 26706 && (var2_2.az[var12_12] == 20692 || var2_2.az[var12_12] == 23149 || var2_2.az[var12_12] == 22103 || var2_2.az[var12_12] == 22104 || var2_2.az[var12_12] == 22530 || var2_2.az[var12_12] == 22531 || var2_2.az[var12_12] == 24246 || var2_2.az[var12_12] == 24247)) {
                                var17_18.g(var10_10, var11_11, 120);
                                if (var15_16 >= 21834 && var15_16 <= 21843 || var15_16 == 24043 || var15_16 == 24237) {
                                    var0.J[3].g(var10_10 - (var15_16 == 21834 || var15_16 == 21838 ? 3 : 5), var11_11 - 1, 100);
                                }
                                if (var15_16 == 24175) {
                                    Client.fE[82].f(var10_10 + var13_13 + 15, var11_11 + var14_15 + 20);
                                }
                                if (var15_16 >= 23673 && var15_16 <= 23674) {
                                    Client.fE[93].g(var10_10 + var13_13 - 3, var11_11 + var14_15 - 1, 100);
                                }
                                if (n.b(var15_16)) {
                                    n.a(var15_16, var10_10 + var13_13, var11_11 + var14_15);
                                }
                                if (var15_16 == 21964) {
                                    var0.o.a[6].g(var10_10 - 3, var11_11 - 1, 100);
                                }
                                if (var15_16 == 21963) {
                                    var0.o.a[4].g(var10_10 - 3, var11_11 - 1, 100);
                                }
                                if (var15_16 == 23063) {
                                    var0.o.a[0].g(var10_10 - 1, var11_11 - 1, 100);
                                }
                            } else {
                                var17_18.f(var10_10, var11_11);
                                if (Client.cH == 17100 && var2_2.aw == 10494 && ag.d.contains(var12_12)) {
                                    ag.c.g(var10_10 - 3, var11_11 - 1, 175);
                                }
                                if (var15_16 >= 21834 && var15_16 <= 21843 || var15_16 == 24043 || var15_16 == 24237) {
                                    var0.J[3].f(var10_10 - (var15_16 == 21834 || var15_16 == 21838 ? 3 : 5), var11_11 - 1);
                                }
                                if (var15_16 == 24175) {
                                    Client.fE[82].f(var10_10 + var13_13 + 15, var11_11 + var14_15 + 20);
                                }
                                if (var15_16 >= 23673 && var15_16 <= 23674) {
                                    Client.fE[93].f(var10_10 + var13_13 - 3, var11_11 + var14_15 - 1);
                                }
                                if (n.b(var15_16)) {
                                    n.a(var15_16, var10_10 + var13_13, var11_11 + var14_15);
                                }
                                if (var15_16 == 21964) {
                                    var0.o.a[6].f(var10_10 - 3, var11_11 - 1);
                                }
                                if (var15_16 == 21963) {
                                    var0.o.a[4].f(var10_10 - 3, var11_11 - 1);
                                }
                                if (var15_16 == 23063) {
                                    var0.o.a[0].f(var10_10 - 1, var11_11 - 1);
                                }
                            }
                        }
                        if (var17_18.r == 33 || var2_2.ax[var12_12] != 1 || var2_2.bF) {
                            var18_19 = 0;
                            var19_20 = var2_2.ax[var12_12];
                            if (Client.cH == 23000 && var19_20 == 0) {
                                Client.gh.b(0xFFFF00, Client.g(var19_20), var11_11 + 9 + var14_15, var10_10 + var13_13);
                            }
                            if (var2_2.bD < 32) {
                                var18_19 = (32 - var2_2.bD) / 2 - 3;
                            }
                            v0 = var20_22 = var2_2.aw == 36025 && var19_20 == 1;
                            if (!var20_22) {
                                if (var19_20 >= 10000000) {
                                    Client.gh.b(65408, Client.g(var19_20), var11_11 + 9 + var14_15 + var18_19, var10_10 + var13_13);
                                } else if (var19_20 >= 100000) {
                                    Client.gh.b(0xFFFFFF, Client.g(var19_20), var11_11 + 9 + var14_15 + var18_19, var10_10 + var13_13);
                                } else if (var19_20 >= 1 || var2_2.bF) {
                                    Client.gh.b(0xFFFF00, Client.g(var19_20), var11_11 + 9 + var14_15 + var18_19, var10_10 + var13_13);
                                }
                            }
                        }
                        if (var2_2.ay != null && var2_2.ay[var12_12] != null) {
                            Client.gl.c(var2_2.ay[var12_12], var10_10 + var17_18.n / 2, var11_11 + var17_18.o + 8, 16750623, 0);
                        }
                        if ((var2_2.aw == 3214 || var2_2.aw == 2006 || var2_2.aw == 3823 || var2_2.aw == 30074 || var2_2.aw == 3322 || var2_2.aw == 26706 || var2_2.aw == 1688) && g.d.r_(var18_19 = var2_2.az[var12_12] - 1)) {
                            var19_20 = g.d.c(var18_19);
                            var20_21 = var19_20 == -1 ? "?" : String.valueOf(var19_20);
                            Client.gl.c((String)var20_21, var10_10 + 8 + var13_13, var11_11 + 10 + var14_15, 0xFFFFFF, 0);
                        }
                        break block158;
                    }
                    if (var2_2.G != null && var12_12 < 20 && (var13_14 = var2_2.G[var12_12]) != null) {
                        var13_14.f(var10_10, var11_11);
                    }
                }
                if (Client.cH == 50600 && var2_2.aw == 50615 && var2_2.az[var12_12] > 0 && var12_12 < var0.P) {
                    Client.gl.c("<img=24>", var10_10 + 28, var11_11 + 32, 0xFFFFFF, 0);
                }
                ++var7_7;
            }
        }
    }
}

