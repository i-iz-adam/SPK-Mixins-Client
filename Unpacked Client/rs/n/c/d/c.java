/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.d;

import java.util.Locale;
import rs.n.a.d;
import rs.n.a.e;
import rs.n.a.f;
import rs.n.c.d.a;

public class c {
    static final String a = "---";
    static final String b = "--------";
    static final int c = 0;
    static final int d = 1;
    static final int e = 2;
    static final int f = 3;
    static final int g = 4;

    public static void a(int n2) {
        switch (n2) {
            case 0: {
                rs.n.c.d.a.l((int)32425).at = "<img=375> Ready";
                rs.n.c.d.a.l((int)32419).Q = "Mark yourself as ready for the raid!";
                break;
            }
            case 1: {
                rs.n.c.d.a.l((int)32425).at = "<img=376> Cancel";
                rs.n.c.d.a.l((int)32419).Q = "Cancel your ready status";
                break;
            }
            case 2: {
                rs.n.c.d.a.l((int)32425).at = "<img=378> Enter Raid";
                rs.n.c.d.a.l((int)32419).Q = "Enter the raid instance lobby";
                break;
            }
            case 3: {
                rs.n.c.d.a.l((int)32425).at = "<img=378> Start Mass";
                rs.n.c.d.a.l((int)32419).Q = "Start the raid mass (lobby stage)";
                break;
            }
            case 4: {
                rs.n.c.d.a.l((int)32425).at = "<img=291> Waiting";
                rs.n.c.d.a.l((int)32419).Q = "Waiting for leader..\nYou will be able to join once the\nleader of the mass starts the raid!";
            }
        }
    }

    public static void a(int n2, String string, String string2) {
        int n3 = 32318;
        if (n2 == 0) {
            ++n3;
        } else {
            if (!rs.n.c.d.a.l((int)(n3 += 3 + (n2 - 1) * 5)).E.t.equalsIgnoreCase(rs.n.c.d.a.dy.t)) {
                rs.n.c.d.c.c(n3);
            }
            if (string2.toLowerCase(Locale.ROOT).contains("max")) {
                rs.n.c.d.a.l((int)n3).bf = false;
            } else {
                rs.n.c.d.a.l((int)n3).Q = string2.toLowerCase().contains("invit") ? "Cancel invitation" : "Kick player";
                rs.n.c.d.a.l((int)n3).bf = true;
            }
            n3 += 3;
        }
        rs.n.c.d.a.l((int)n3).at = string;
        if (string2.toLowerCase(Locale.ROOT).contains("max")) {
            rs.n.c.d.a.l((int)(n3 + 1)).bf = false;
        } else {
            rs.n.c.d.a.l((int)(n3 + 1)).bf = true;
            rs.n.c.d.a.l((int)(n3 + 1)).at = string2;
        }
    }

    public static void a() {
        int n2 = 32318;
        for (int i2 = 0; i2 < 20; ++i2) {
            if (i2 != 0) {
                rs.n.c.d.c.b(n2);
                rs.n.c.d.a.l((int)n2).bf = true;
                n2 += 3;
            }
            int n3 = ++n2;
            rs.n.c.d.a.l((int)n3).at = a;
            int n4 = ++n2;
            rs.n.c.d.a.l((int)n4).at = b;
            rs.n.c.d.a.l((int)(++n2 - 1)).bf = true;
        }
    }

    public static void b(int n2) {
        rs.n.a.a.a(n2++, rs.n.c.d.a.dw, "Invite a player").a().b(n2, rs.n.c.d.a.dx);
    }

    public static void c(int n2) {
        rs.n.a.a.a(n2++, rs.n.c.d.a.dy, "Kick player").a().b(n2, rs.n.c.d.a.dz);
    }

    public static void a(rs.n.d.c c2) {
        c2.a(rs.n.a.e.a(32309, "raids/bgparty")).a(32301, 7, 43);
        c2.a(rs.n.a.f.a(32310, "Raid Selection").o().m()).a(32309, 88, 55);
        c2.a(rs.n.a.f.a(32311, "Raid Difficulty").o().m()).a(32309, 246, 55);
        c2.a(rs.n.a.f.a(32312, "Aff. Tome Coffer").o().m()).a(32309, 419, 55);
        c2.a(rs.n.a.f.a(32313, "Party Afflictions").o().m()).a(32309, 439, 225);
        c2.a(rs.n.a.f.a(32314, "Members (1/5)").i().m()).a(32309, 14, 108);
        c2.a(rs.n.a.f.a(32315, "Current Status").i().c().m()).a(32309, 312, 108);
        c2.a(rs.n.a.f.a(32308, "Raid: @yel@Grandmaster ToB @gre@(4A)").j().m()).a(32309, 11, 289);
        c2.a(rs.n.a.f.a(32418, "<img=88> Public").a().l().a(51)).a(32309, 11, 307);
        c2.a(rs.n.a.f.a(32585, "<img=88> Friends only").a().l().a(100)).a(32309, 67, 307);
        c2.a(rs.n.a.f.a(32586, "<img=88> Invite only").a().l().a(100)).a(32309, 154, 307);
        d d2 = rs.n.a.d.a(32316).g(299, 147);
        d2.m(364);
        int n2 = 32317;
        d2.n(rs.n.a.f.a((int)n2++, (String)"").aw).a(0, 0);
        for (int i2 = 0; i2 < 20; ++i2) {
            if (i2 == 0) {
                rs.n.a.e.b(n2, rs.n.c.d.a.dA);
                d2.n(n2++).a(2, i2 + 4);
            } else {
                rs.n.c.d.c.b(n2);
                d2.n(n2).a(1, i2 * 18 + 4);
                d2.n(n2 + 1).a(1, i2 * 18 + 4);
                n2 += 3;
            }
            rs.n.a.f.a(n2++, a).a().l();
            d2.n(n2 - 1).a(18, i2 * 18 + 5);
            rs.n.a.f.a(n2++, b).a().l().c();
            d2.n(n2 - 1).a(296, i2 * 18 + 5);
        }
        c2.a(d2).a(32309, 13, 126);
        rs.n.a.a.b(32419, "raids/sprite 8", "Enter the raid instance lobby").a().a(32420, "raids/sprite 9");
        rs.n.a.f.a(32425, "<img=401> Enter Raid").n().m();
        c2.a(32419).a(32301, 261, 292);
        c2.a(32420).a(32301, 261, 292);
        c2.a(32425).a(32301, 315, 297);
        rs.n.a.a.b(32422, "raids/sprite 8", "Leave the party (disbands if empty)").a().a(32423, "raids/sprite 9");
        rs.n.a.f.a(32426, "<img=377> Leave").n().m();
        c2.a(32422).a(32301, 383, 292);
        c2.a(32423).a(32301, 383, 292);
        c2.a(32426).a(32301, 437, 297);
        c2.a(rs.n.a.a.a.a(32429, new String[]{"Chambers of Xeric <img=185>", "Theatre of Blood <img=184>"}).h(155, 0).g(0xFFFFFF, 16750623)).a(32309, 12, 74);
        c2.a(rs.n.a.a.a.a(32430, "Normal (No reqs.)", "Adept (Req. 10+ raids)", "Expert (Req. 50+ raids)", "Master (Req. 100+ raids)", "Grandmaster (Req. 250+)").h(155, 0).g(0xFFFFFF, 16750623)).a(32309, 171, 74);
        rs.n.a.a.a a2 = (rs.n.a.a.a)rs.n.c.d.a.l(32430);
        a2.i().get(1).b(" Adept difficulty\n- +5% rare reward chance\n- Bosses have 50% more HP\n- Bosses have 10% more defence\n- Bosses deal 5% more damage\n- You deal 5% less damage");
        a2.i().get(2).b(" Expert difficulty\n- +25% rare reward chance\n- Bosses have 200% more HP\n- Bosses have 20% more defence\n- Bosses deal 7.5% more damage\n- You deal 7.5% less damage");
        a2.i().get(3).b(" Master difficulty\n- Receive +2 common rewards\n- +50% rare reward chance\n- Bosses have 300% more HP\n- Bosses have 30% more defence\n- Bosses deal 10% more damage\n- You deal 10% less damage");
        a2.i().get(4).b(" Grandmaster difficulty\n- Receive +3 common rewards\n- +75% rare reward chance\n- Bosses have 400% more HP\n- Bosses have 50% more defence\n- Bosses deal 15% more damage\n- You deal 15% less damage");
        rs.n.a.c c3 = rs.n.a.c.g(32427, 1).a(1);
        c3.bE = true;
        c3.bF = true;
        c3.az[0] = 6750;
        c3.ax[0] = 0;
        c2.a(32427).a(32301, 383, 82);
        c2.a(rs.n.a.a.b(32531, "bank/bank 17", "Deposit all tomes from inventory").a().c("bank/bank 18")).a(32301, 437, 73);
        c2.a(rs.n.a.a.b(32534, "bank/bank 31", "Deposit all tomes from bank").a().c("bank/bank 32")).a(32301, 437, 98);
        c2.a(rs.n.a.a.b(32546, "raids/btn1a", "Select").c("raids/btn1b")).a(32301, 356, 130);
        c2.a(rs.n.a.f.a(32561, "Buy x25:@gre@ <tab=55><item=10834>2,500").a().m()).b(32546, 7, 7);
        c2.a(rs.n.a.a.b(32549, "raids/btn1a", "Select").c("raids/btn1b")).a(32301, 356, 158);
        c2.a(rs.n.a.f.a(32562, "Buy x50:@gre@ <tab=55><item=10834>4,500").a().m()).b(32549, 7, 7);
        c2.a(rs.n.a.f.a(32564, "What are Afflictions?").a(133).o().l()).a(32301, 352, 192);
        c2.a(rs.n.a.a.b(32596, "raids/refresh 1", "Reload last settings").d("Reload last settings\nApply the same raid type and\ndifficulty as your last instance").a("raids/refresh 2")).b(32301, 487, 43);
        rs.n.a.c c4 = rs.n.a.c.g(32458, 1).a(1);
        c4.bE = true;
        c4.bF = true;
        c4.az[0] = 6750;
        c4.ax[0] = 0;
        c2.a(32458).a(32301, 341, 227);
        c2.a(rs.n.a.a.b(32459, "misc/donor 11", "Remove affliction tome(s)").a().c("misc/donor 12")).b(32458, -2, 32);
        c2.a(rs.n.a.a.b(32462, "misc/donor 9", "Add affliction tome(s)").a().c("misc/donor 10")).b(32458, 19, 32);
        c2.a(rs.n.a.e.a(32465, "raids/affbar1")).b(32458, 42, 16);
        c2.a(rs.n.a.a.b(32595, "raids/close1", "Close interface").b("raids/close2")).b(32301, 493, 3);
    }

    public static void b(rs.n.d.c c2) {
        c2.a(rs.n.a.f.a(32570, "You're not currently in a raid party!").n().l()).b(32301, 250, 116);
        c2.a(rs.n.a.f.a(32571, "Would you like to create your own party? Or join an existing one..").o().l()).b(32570, 0, 21);
        c2.a(rs.n.a.a.b(32574, "raids/btn3a", "Select").d("<img=17> Create Public\nYour party will be publicly listed and\navailable to players via the \"Join\" tab.").c("raids/btn3b")).b(32570, -212, 51);
        c2.a(rs.n.a.f.a(32572, "<img=17> Create @gre@(Public)").o().m()).b(32574, 69, 17);
        c2.a(rs.n.a.a.b(32577, "raids/btn3a", "Select").d("<img=17> Create Private\nYour party will only be joinable by\nplayers in your friend's list").c("raids/btn3b")).b(32570, -67, 51);
        c2.a(rs.n.a.f.a(32573, "<img=17> Create @or3@(Private)").o().m()).b(32577, 69, 17);
        c2.a(rs.n.a.a.b(32580, "raids/btn3a", "Select").d("<img=80> Join Private\nEnter the username of a friend\nto join their private raid party").c("raids/btn3b")).b(32570, 78, 51);
        c2.a(rs.n.a.f.a(32583, "<img=80> Join Private").o().m()).b(32580, 69, 17);
        c2.a(rs.n.a.a.b(19611, "raids/btn3a", "Select").d("<img=2> Start Mass\nCreate a special public party with a huge capacity!\nIn addition, mass raids let all players\nparticipate in any difficulty (req. bypass)\n\nNOTE: This button is only visible\nto accounts with authorization").c("raids/btn3b")).b(32570, -67, 116);
        c2.a(rs.n.a.f.a(32587, "<img=2> Create @mag@(Mass)").o().m()).b(19611, 69, 17);
        c2.a(rs.n.a.a.b(32595, "raids/close1", "Close interface").b("raids/close2")).b(32301, 493, 3);
    }
}

