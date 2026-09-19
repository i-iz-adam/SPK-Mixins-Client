/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.HashMap;
import java.util.Map;
import rs.Client;
import rs.f.a;
import rs.l.k_0;
import rs.n.c;
import rs.n.c.v_0;
import rs.n.e;

public class ai
extends c {
    public static final Map<Integer, String> c = new HashMap<Integer, String>();
    public static final String[] d = new String[]{"Depends on combat lvl", "Always right-click", "Left-click where avail.", "Hidden"};
    public static int e = -1;

    public ai(k_0[] k_0Array) {
        super(k_0Array);
        c.put(-1, "None");
        c.put(112, "F1");
        c.put(113, "F2");
        c.put(114, "F3");
        c.put(115, "F4");
        c.put(116, "F5");
        c.put(117, "F6");
        c.put(118, "F7");
        c.put(119, "F8");
        c.put(120, "F9");
        c.put(121, "F10");
        c.put(122, "F11");
        c.put(123, "F12");
    }

    public static void m(int n2) {
        if (n2 == 35004 && e == -1) {
            rs.f.a.bd = 10;
            rs.f.a.e();
            rs.f.a.d();
            rs.n.c.ai.h();
            return;
        }
        int n3 = -600;
        int n4 = -600;
        if (Client.br == 35062 && n2 >= 35010 && n2 <= 35046 && e != -1) {
            return;
        }
        if (n2 == 35116) {
            rs.f.a.aS = !rs.f.a.aS;
            rs.n.e.H[35115].E = rs.f.a.aS ? v_0.f : v_0.g;
            rs.n.e.H[35115].aG = rs.f.a.aS ? v_0.f : v_0.g;
            rs.f.a.d();
        }
        if (n2 == 35079) {
            n3 = 372;
            n4 = 132;
            rs.n.e.H[35000].b(54, 35089, n3, n4);
            rs.n.e.H[35000].b(55, 35087, n3 - 57, n4 + 4);
            rs.n.e.H[35000].b(52, 35062, -600, -600);
            rs.n.e.H[35000].b(53, 35077, -600, -600);
            rs.n.e.H[35000].b(46, 35091, -600, -600);
            rs.n.e.H[35000].b(47, 35096, -600, -600);
            rs.n.e.H[35000].b(41, 35102, -600, -600);
            rs.n.e.H[35000].b(42, 35107, -600, -600);
            return;
        }
        if (n2 == 35098) {
            n3 = 388;
            n4 = 182;
            rs.n.e.H[35000].b(54, 35089, -600, -600);
            rs.n.e.H[35000].b(55, 35087, -600, -600);
            rs.n.e.H[35000].b(52, 35062, -600, -600);
            rs.n.e.H[35000].b(53, 35077, -600, -600);
            rs.n.e.H[35000].b(41, 35102, -600, -600);
            rs.n.e.H[35000].b(42, 35107, -600, -600);
            rs.n.e.H[35000].b(46, 35091, n3 - 55, n4);
            rs.n.e.H[35000].b(47, 35096, n3 - 67, n4 + 4);
            rs.n.e.H[35112].b(5, 35102, -600, -600);
            rs.n.e.H[35112].b(6, 35107, -600, -600);
            rs.n.e.H[35112].b(10, 35091, rs.n.e.H[35112].am[9] - 70, rs.n.e.H[35112].bc[9] + 19);
            rs.n.e.H[35112].b(11, 35096, rs.n.e.H[35112].am[9] - 12 - 70, rs.n.e.H[35112].bc[9] + 4 + 19);
            return;
        }
        if (n2 == 35109) {
            n3 = 388;
            n4 = 232;
            rs.n.e.H[35000].b(54, 35089, -600, -600);
            rs.n.e.H[35000].b(55, 35087, -600, -600);
            rs.n.e.H[35000].b(52, 35062, -600, -600);
            rs.n.e.H[35000].b(53, 35077, -600, -600);
            rs.n.e.H[35000].b(41, 35102, n3 - 55, n4);
            rs.n.e.H[35000].b(42, 35107, n3 - 67, n4 + 4);
            rs.n.e.H[35000].b(46, 35091, -600, -600);
            rs.n.e.H[35000].b(47, 35096, -600, -600);
            rs.n.e.H[35112].b(5, 35102, rs.n.e.H[35112].am[4] - 70 - 1, rs.n.e.H[35112].bc[4] + 19);
            rs.n.e.H[35112].b(6, 35107, rs.n.e.H[35112].am[4] - 12 - 70, rs.n.e.H[35112].bc[4] + 4 + 19);
            rs.n.e.H[35112].b(10, 35091, -600, -600);
            rs.n.e.H[35112].b(11, 35096, -600, -600);
            return;
        }
        if (e == -1 && Client.br != 35062) {
            switch (n2) {
                case 35092: {
                    rs.n.c.ai.o(0);
                    break;
                }
                case 35093: {
                    rs.n.c.ai.o(1);
                    break;
                }
                case 35094: {
                    rs.n.c.ai.o(2);
                    break;
                }
                case 35095: {
                    rs.n.c.ai.o(3);
                    break;
                }
                case 35103: {
                    rs.n.c.ai.p(0);
                    break;
                }
                case 35104: {
                    rs.n.c.ai.p(1);
                    break;
                }
                case 35105: {
                    rs.n.c.ai.p(2);
                    break;
                }
                case 35106: {
                    rs.n.c.ai.p(3);
                    break;
                }
                case 35083: {
                    rs.n.c.ai.n(5);
                    break;
                }
                case 35084: {
                    rs.n.c.ai.n(10);
                    break;
                }
                case 35085: {
                    rs.n.c.ai.n(15);
                    break;
                }
                case 35086: {
                    rs.n.c.ai.n(20);
                    break;
                }
                case 35010: {
                    n3 = 86;
                    n4 = 65;
                    e = 0;
                    break;
                }
                case 35014: {
                    n3 = 86;
                    n4 = 110;
                    e = 1;
                    break;
                }
                case 35018: {
                    n3 = 86;
                    n4 = 155;
                    e = 2;
                    break;
                }
                case 35022: {
                    n3 = 86;
                    n4 = 22;
                    e = 3;
                    break;
                }
                case 35026: {
                    n3 = 86;
                    n4 = 67;
                    e = 4;
                    break;
                }
                case 35030: {
                    n3 = 248;
                    n4 = 65;
                    e = 5;
                    break;
                }
                case 35034: {
                    n3 = 248;
                    n4 = 110;
                    e = 6;
                    break;
                }
                case 35038: {
                    n3 = 248;
                    n4 = 155;
                    e = 8;
                    break;
                }
                case 35042: {
                    n3 = 248;
                    n4 = 22;
                    e = 9;
                    break;
                }
                case 35046: {
                    n3 = 410;
                    n4 = 65;
                    e = 7;
                }
            }
        }
        if (e >= 0 && e <= 10) {
            switch (n2) {
                case 35063: {
                    rs.n.c.ai.q(-1);
                    break;
                }
                case 35064: {
                    rs.n.c.ai.q(112);
                    break;
                }
                case 35065: {
                    rs.n.c.ai.q(113);
                    break;
                }
                case 35066: {
                    rs.n.c.ai.q(114);
                    break;
                }
                case 35067: {
                    rs.n.c.ai.q(115);
                    break;
                }
                case 35068: {
                    rs.n.c.ai.q(116);
                    break;
                }
                case 35069: {
                    rs.n.c.ai.q(117);
                    break;
                }
                case 35070: {
                    rs.n.c.ai.q(118);
                    break;
                }
                case 35071: {
                    rs.n.c.ai.q(119);
                    break;
                }
                case 35072: {
                    rs.n.c.ai.q(120);
                    break;
                }
                case 35073: {
                    rs.n.c.ai.q(121);
                    break;
                }
                case 35074: {
                    rs.n.c.ai.q(122);
                    break;
                }
                case 35075: {
                    rs.n.c.ai.q(123);
                }
            }
        }
        if (n3 == -600 && n4 == -600) {
            e = -1;
        }
        rs.n.e.H[35000].b(52, 35062, n3, n4);
        rs.n.e.H[35000].b(53, 35077, n3 - 57, n4 + 4);
        rs.n.e.H[35000].b(54, 35089, -600, -600);
        rs.n.e.H[35000].b(55, 35087, -600, -600);
        rs.n.e.H[35000].b(46, 35091, -600, -600);
        rs.n.e.H[35000].b(47, 35096, -600, -600);
        rs.n.e.H[35000].b(41, 35102, -600, -600);
        rs.n.e.H[35000].b(42, 35107, -600, -600);
        if (rs.n.e.H[35112] != null && rs.n.e.H[35112].al.length >= 10) {
            rs.n.e.H[35112].b(5, 35102, -600, -600);
            rs.n.e.H[35112].b(6, 35107, -600, -600);
            rs.n.e.H[35112].b(10, 35091, -600, -600);
            rs.n.e.H[35112].b(11, 35096, -600, -600);
        }
    }

    public static void h() {
        for (int i2 = 0; i2 < rs.f.a.G.length; ++i2) {
            int n2 = i2;
            if (i2 == 7) {
                n2 = 9;
            }
            if (i2 == 8) {
                n2 = 7;
            }
            if (i2 == 9) {
                n2 = 8;
            }
            int n3 = 35009 + n2 * 4;
            rs.n.e.H[n3].at = c.get(rs.f.a.G[i2]);
        }
        rs.n.e.H[35078].at = "" + rs.f.a.bd;
        rs.n.e.H[35097].at = d[rs.f.a.bh];
        rs.n.e.H[35108].at = d[rs.f.a.bi];
    }

    public static void n(int n2) {
        rs.f.a.bd = n2;
        rs.n.e.H[35078].at = "" + n2;
        rs.f.a.d();
    }

    public static void o(int n2) {
        rs.f.a.bh = n2;
        rs.n.e.H[35097].at = d[n2];
        rs.f.a.d();
    }

    public static void p(int n2) {
        rs.f.a.bi = n2;
        rs.n.e.H[35108].at = d[n2];
        rs.f.a.d();
    }

    public static void q(int n2) {
        int n3 = e;
        String string = c.get(n2);
        if (e == 7) {
            n3 = 9;
        }
        if (e == 8) {
            n3 = 7;
        }
        if (e == 9) {
            n3 = 8;
        }
        int n4 = 35009 + n3 * 4;
        if (n2 != -1 && e != -1) {
            for (int i2 = 0; i2 < rs.f.a.G.length; ++i2) {
                if (rs.f.a.G[i2] != n2) continue;
                rs.f.a.G[i2] = rs.f.a.G[e];
                rs.n.c.ai.h();
                break;
            }
        }
        rs.f.a.G[rs.n.c.ai.e] = n2;
        rs.n.e.H[n4].at = string;
        rs.f.a.d();
    }

    @Override
    public void a() {
        int n2;
        e e2 = rs.n.c.ai.d(35000);
        rs.n.c.ai.h(35001, "options/keybind 1");
        rs.n.c.ai.h(35002, "options/keybind 2");
        rs.n.c.ai.a(35003, "Restore default", this.a, 0, 16751360, true, true);
        rs.n.c.ai.a(35004, "teleport/SPRITE", 10, 100, 32, "Restore to default key bindings", -1, 35005, 1);
        rs.n.c.ai.a(35005, "teleport/SPRITE", 11, 100, 32, 35006);
        rs.n.c.ai.a(35007, "Control Options Menu", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35009, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35010, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35011, 1);
        rs.n.c.ai.a(35011, "options/dropdown", 2, 100, 32, 35012);
        rs.n.c.ai.a(35013, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35014, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35015, 1);
        rs.n.c.ai.a(35015, "options/dropdown", 2, 100, 32, 35016);
        rs.n.c.ai.a(35017, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35018, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35019, 1);
        rs.n.c.ai.a(35019, "options/dropdown", 2, 100, 32, 35020);
        rs.n.c.ai.a(35021, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35022, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35023, 1);
        rs.n.c.ai.a(35023, "options/dropdown", 2, 100, 32, 35024);
        rs.n.c.ai.a(35025, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35026, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35027, 1);
        rs.n.c.ai.a(35027, "options/dropdown", 2, 100, 32, 35028);
        rs.n.c.ai.a(35029, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35030, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35031, 1);
        rs.n.c.ai.a(35031, "options/dropdown", 2, 100, 32, 35032);
        rs.n.c.ai.a(35033, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35034, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35035, 1);
        rs.n.c.ai.a(35035, "options/dropdown", 2, 100, 32, 35036);
        rs.n.c.ai.a(35037, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35038, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35039, 1);
        rs.n.c.ai.a(35039, "options/dropdown", 2, 100, 32, 35040);
        rs.n.c.ai.a(35041, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35042, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35043, 1);
        rs.n.c.ai.a(35043, "options/dropdown", 2, 100, 32, 35044);
        rs.n.c.ai.a(35045, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35046, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35047, 1);
        rs.n.c.ai.a(35047, "options/dropdown", 2, 100, 32, 35048);
        rs.n.c.ai.a(35049, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35050, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35051, 1);
        rs.n.c.ai.a(35051, "options/dropdown", 2, 100, 32, 35052);
        rs.n.c.ai.a(35053, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35054, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35055, 1);
        rs.n.c.ai.a(35055, "options/dropdown", 2, 100, 32, 35056);
        rs.n.c.ai.a(35057, "F1", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35058, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35059, 1);
        rs.n.c.ai.a(35059, "options/dropdown", 2, 100, 32, 35060);
        rs.n.c.ai.a(35078, "10", this.a, 2, 16751360, true, true);
        rs.n.c.ai.a(35079, "options/dropdown", 1, 100, 32, "Select dropdown", -1, 35080, 1);
        rs.n.c.ai.a(35080, "options/dropdown", 2, 100, 32, 35081);
        e e3 = rs.n.c.ai.d(35061);
        rs.n.c.ai.h(35062, "options/dropdown 3");
        rs.n.e.H[35062].P = 70;
        rs.n.c.ai.a(35063, "None", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35064, "F1", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35065, "F2", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35066, "F3", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35067, "F4", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35068, "F5", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35069, "F6", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35070, "F7", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35071, "F8", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35072, "F9", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35073, "F10", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35074, "F11", "Select key binding", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35075, "F12", "Select key binding", this.a, 2, 16750623, true, true, 150);
        e e4 = rs.n.c.ai.d(35077);
        e4.aH = 250;
        e4.P = 100;
        e4.aR = 193;
        e4.bj = 87;
        e4.k(13);
        for (int i2 = 0; i2 < 13; ++i2) {
            e4.b(i2, 35063 + i2, 5, 2 + i2 * 17);
        }
        e3.k(2);
        e3.b(0, 35062, 0, 0);
        e3.b(1, 35077, -100, 0);
        e e5 = rs.n.c.ai.d(35082);
        rs.n.c.ai.h(35089, "options/dropdown 3");
        rs.n.e.H[35089].P = 70;
        rs.n.c.ai.a(35083, "5", "Select option", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35084, "10", "Select option", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35085, "15", "Select option", this.a, 2, 16750623, true, true, 150);
        rs.n.c.ai.a(35086, "20", "Select option", this.a, 2, 16750623, true, true, 150);
        e e6 = rs.n.c.ai.d(35087);
        e6.aH = 250;
        e6.P = 100;
        e6.aR = 193;
        e6.bj = 87;
        e6.k(4);
        for (int i3 = 0; i3 < 4; ++i3) {
            e6.b(i3, 35083 + i3, 5, 2 + i3 * 17);
        }
        e5.k(2);
        e5.b(0, 35062, 0, 0);
        e5.b(1, 35087, -100, 0);
        rs.n.c.ai.a(35088, "Item Drag", this.a, 1, 16751360, true, true);
        rs.n.c.ai.a(35090, "Player 'attack' options", this.a, 1, 16751360, true, true);
        rs.n.c.ai.h(35091, "options/dropdown 6");
        rs.n.e.H[35091].P = 70;
        rs.n.c.ai.a(35092, "Depends on combat lvl", "Select option", this.a, 0, 16750623, true, true, 150);
        rs.n.c.ai.a(35093, "Always right-click", "Select option", this.a, 0, 16750623, true, true, 150);
        rs.n.c.ai.a(35094, "Left-click where avail.", "Select option", this.a, 0, 16750623, true, true, 150);
        rs.n.c.ai.a(35095, "Hidden", "Select option", this.a, 0, 16750623, true, true, 150);
        e e7 = rs.n.c.ai.d(35096);
        e7.aH = 250;
        e7.P = 140;
        e7.aR = 193;
        e7.bj = 87;
        e7.k(4);
        for (int i4 = 0; i4 < 4; ++i4) {
            e7.b(i4, 35092 + i4, 5, 2 + i4 * 17);
        }
        rs.n.c.ai.a(35097, "Left-click where avail.", this.a, 0, 16751360, true, true);
        rs.n.c.ai.a(35098, "options/dropdown", 4, 145, 32, "Select dropdown", -1, 35099, 1);
        rs.n.c.ai.a(35099, "options/dropdown", 5, 145, 32, 35100);
        rs.n.c.ai.a(35101, "NPC/Bot 'attack' options", this.a, 1, 16751360, true, true);
        rs.n.c.ai.h(35102, "options/dropdown 6");
        rs.n.e.H[35102].P = 70;
        rs.n.c.ai.a(35103, "Depends on combat lvl", "Select option", this.a, 0, 16750623, true, true, 150);
        rs.n.c.ai.a(35104, "Always right-click", "Select option", this.a, 0, 16750623, true, true, 150);
        rs.n.c.ai.a(35105, "Left-click where avail.", "Select option", this.a, 0, 16750623, true, true, 150);
        rs.n.c.ai.a(35106, "Hidden", "Select option", this.a, 0, 16750623, true, true, 150);
        e e8 = rs.n.c.ai.d(35107);
        e8.aH = 250;
        e8.P = 140;
        e8.aR = 193;
        e8.bj = 87;
        e8.k(4);
        for (n2 = 0; n2 < 4; ++n2) {
            e8.b(n2, 35103 + n2, 5, 2 + n2 * 17);
        }
        rs.n.c.ai.a(35108, "Left-click where avail.", this.a, 0, 16751360, true, true);
        rs.n.c.ai.a(35109, "options/dropdown", 4, 145, 32, "Select dropdown", -1, 35110, 1);
        rs.n.c.ai.a(35110, "options/dropdown", 5, 145, 32, 35111);
        rs.n.c.ai.h();
        e2.k(56);
        e2.b(0, 35001, 20, 12);
        e2.b(1, 63740, 467, 20);
        e2.b(2, 63741, 467, 20);
        e2.b(3, 35002, 33, 53);
        e2.b(4, 35004, 377, 278);
        e2.b(5, 35005, 377, 278);
        e2.b(6, 35003, 427, 288);
        e2.b(7, 35007, 266, 21);
        e2.b(8, 35010, 86, 65);
        e2.b(9, 35011, 86, 65);
        e2.b(10, 35009, 110, 68);
        n2 = 45;
        e2.b(11, 35014, 86, 65 + n2);
        e2.b(12, 35015, 86, 65 + n2);
        e2.b(13, 35013, 110, 68 + n2 + 1);
        e2.b(14, 35018, 86, 65 + (n2 += 45));
        e2.b(15, 35019, 86, 65 + n2);
        e2.b(16, 35017, 110, 68 + n2 + 1);
        e2.b(17, 35022, 86, 65 + (n2 += 45));
        e2.b(18, 35023, 86, 65 + n2);
        e2.b(19, 35021, 110, 68 + n2 + 1);
        e2.b(20, 35026, 86, 65 + (n2 += 45));
        e2.b(21, 35027, 86, 65 + n2);
        e2.b(22, 35025, 110, 68 + n2 + 1);
        n2 = 0;
        e2.b(23, 35030, 248, 65 + n2);
        e2.b(24, 35031, 248, 65 + n2);
        e2.b(25, 35029, 272, 68 + n2 + 1);
        e2.b(26, 35034, 248, 65 + (n2 += 45));
        e2.b(27, 35035, 248, 65 + n2);
        e2.b(28, 35033, 272, 68 + n2 + 1);
        e2.b(29, 35038, 248, 65 + (n2 += 45));
        e2.b(30, 35039, 248, 65 + n2);
        e2.b(31, 35037, 272, 68 + n2 + 1);
        e2.b(32, 35042, 248, 65 + (n2 += 45));
        e2.b(33, 35043, 248, 65 + n2);
        e2.b(34, 35041, 272, 68 + n2 + 1);
        n2 = 0;
        e2.b(35, 35046, 410, 65 + n2);
        e2.b(36, 35047, 410, 65 + n2);
        e2.b(37, 35045, 434, 68 + n2 + 1);
        int n3 = 410;
        int n4 = 165;
        e2.b(38, 35109, 333, 132 + n2 + 50 + 50);
        e2.b(39, 35108, 399, 137 + n2 + 50 + 50);
        e2.b(40, 35101, 405, 136 + n2 + 30 + 50);
        e2.b(41, 35102, n3 - 5, n4);
        e2.b(42, 35107, n3 - 57 - 5, n4 + 4);
        n3 = 410;
        n4 = 115;
        e2.b(43, 35098, 333, 132 + n2 + 50);
        e2.b(44, 35097, 399, 137 + n2 + 50);
        e2.b(45, 35090, 405, 136 + n2 + 30);
        e2.b(46, 35091, n3 - 5, n4);
        e2.b(47, 35096, n3 - 57 - 5, n4 + 4);
        n2 = 0;
        e2.b(48, 35079, 372, 132 + n2);
        e2.b(49, 35080, 372, 132 + n2);
        e2.b(50, 35078, 396, 136 + n2);
        e2.b(51, 35088, 402, 112 + n2);
        n3 = 410;
        n4 = 65;
        e2.b(52, 35062, n3, n4);
        e2.b(53, 35077, n3 - 57, n4 + 4);
        n3 = 410;
        n4 = 65;
        e2.b(54, 35089, n3 - 55, n4);
        e2.b(55, 35087, n3 - 57 - 55, n4 + 4);
        rs.n.c.ai.m(-1);
    }
}

