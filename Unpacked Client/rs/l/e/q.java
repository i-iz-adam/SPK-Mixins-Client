/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import rs.Client;
import rs.d.k;
import rs.f.a;
import rs.gui.Launcher;
import rs.l.f_0;

public class q {
    private static final int b = 3;
    private static final int c = 180;
    private static final int d = 35;
    private static String e;
    public static boolean a;
    private static boolean f;
    private static f_0 g;
    private static f_0 h;
    private static f_0 i;
    private static f_0 j;
    private static f_0 k;
    private f_0 l;
    private final Client m;
    private final a n;
    private final int o;
    private final int p;
    private String q;
    private long r;
    private int s;
    private int t;
    private int u;
    private final String v;

    public q(Client client, a a2, int n2) {
        this.v = a2.name();
        this.m = client;
        this.n = a2;
        this.o = a2.ao;
        this.p = a2.ap;
        this.s = n2;
        this.t = 0;
        this.q = a2.an;
        this.r = System.currentTimeMillis();
        if (a2.am == null) {
            this.u = a2.aq;
            this.c();
        } else {
            this.l = new f_0(a2.am);
        }
    }

    public q(Client client, String string, String string2, int n2, int n3) {
        this.v = string;
        this.m = client;
        this.n = rs.l.e.q$a.a;
        this.s = n3;
        this.t = 0;
        this.u = n2;
        this.o = 4;
        this.p = 0;
        this.q = string2;
        this.r = System.currentTimeMillis();
        this.c();
    }

    public static void a(List<q> list) {
        a = false;
        if (list.size() == 0) {
            return;
        }
        if (!f) {
            rs.l.e.q.d();
        }
        Launcher.n().o();
        int n2 = 508 + (Client.ai() ? 0 : 5);
        Launcher.n().o();
        int n3 = 297 + (Client.ai() ? 0 : 4);
        if (rs.f.a.ai == a.c.b) {
            n3 += Client.ah - 499;
            n2 += 8;
        }
        e = null;
        if (rs.f.a.aD) {
            ArrayList<q> arrayList = new ArrayList<q>();
            j.g(n2, n3, 180);
            n2 -= 35;
            for (q q2 : list) {
                if (q2.a(n2, n3)) {
                    n2 -= 35;
                    continue;
                }
                arrayList.add(q2);
            }
            for (q q2 : arrayList) {
                list.remove(q2);
            }
            h.b(n2 + 25, n3 + 1, 180);
        } else {
            g.b((n2 -= 38) + 25, n3, 180);
        }
        Launcher.n().o();
        int n4 = Client.hP;
        Launcher.n().o();
        int n5 = Client.hQ;
        if (n4 >= n2 + 25 && n4 <= n2 + 45 && n5 >= n3 && n5 <= n3 + 40) {
            a = true;
        }
        if (e != null) {
            Launcher.n().o().b(n4 - 55, n5 - 15, e);
        }
    }

    public boolean a(int n2, int n3) {
        i.g(n2, n3, 180);
        if (this.l == null) {
            this.c();
            return true;
        }
        this.l.g(n2 + this.o, n3 + this.p, 180);
        if (this.s == -1) {
            k.f(n2 + 11, n3 + 22);
        } else {
            long l2 = System.currentTimeMillis() - this.r;
            long l3 = (long)this.s - l2 / 1000L;
            int n4 = 3;
            if (!rs.l.b.a.a()) {
                if (l3 >= 3L && this.t != 255) {
                    this.t += 3;
                } else if (l3 < 3L) {
                    if (this.t > 0) {
                        this.t -= 3;
                    } else {
                        return false;
                    }
                }
            }
            Date date = new Date(l3 * 1000L);
            Object object = new SimpleDateFormat("m:ss").format(date);
            if (l3 >= 3600L) {
                object = l3 >= 36000L ? " " + (int)Math.floor(l3 / 3600L) + "h" : " " + (int)Math.floor(l3 / 3600L) + "h" + ((int)Math.floor(l3 / 60L) - (int)Math.floor(l3 / 3600L * 60L)) + "m";
            }
            Client.gl.c((String)object, n2 + 19, n3 + 34, 0xFFFFFF, 1);
        }
        if (Client.hP >= n2) {
            if (Client.hP <= n2 + 43) {
                if (Client.hQ >= n3) {
                    if (Client.hQ <= n3 + 34) {
                        Object object = this.q;
                        if (object == null) {
                            String string = this.n.name().toLowerCase().substring(0, 1).toUpperCase() + this.n.name().toLowerCase().substring(1);
                            object = string + "  ";
                        }
                        e = " " + (String)object + " ";
                    }
                }
            }
        }
        return true;
    }

    public void a(int n2) {
        this.r = System.currentTimeMillis();
        this.s = n2;
    }

    private void c() {
        this.l = rs.d.k.a(this.u, 1, -1, 21);
    }

    private static void d() {
        h = new f_0("popups/timer 0");
        g = new f_0("popups/timer 1");
        i = new f_0("popups/timer 2");
        j = new f_0("popups/timer 3");
        k = new f_0("icons/infinite white", false);
        f = true;
    }

    public a a() {
        return this.n;
    }

    public String b() {
        return this.v;
    }

    static {
        a = false;
        f = false;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("", 0);
        public static final /* enum */ a b = new a("Hunter elixir\nDouble blood slayer points\n(Does not stack with streak bonus)", 27456);
        public static final /* enum */ a c = new a("Hunter elixir\nDouble soul shards", 27455);
        public static final /* enum */ a d = new a("Dfs cooldown", 11284);
        public static final /* enum */ a e = new a("Twisted heart\nCooldown duration", 21092);
        public static final /* enum */ a f = new a("Vote Boost\n+10% PvM damage\n+10% Drop rate bonus", 26982);
        public static final /* enum */ a g = new a("Vengeance cooldown", "popups/vengtimer", 13, 4);
        public static final /* enum */ a h = new a("Antifire duration", "popups/antitimer", 13, 2);
        public static final /* enum */ a i = new a("Anti-venom duration", "popups/venomtimer", 13, 2);
        public static final /* enum */ a j = new a("Charge duration", "popups/chargetimer", 12, 4);
        public static final /* enum */ a k = new a("Stamina duration", "popups/staminatimer", 13, 2);
        public static final /* enum */ a l = new a("Teleblock duration", "popups/teleblocktimer", 9, 2);
        public static final /* enum */ a m = new a("Pet silence\nWhile under silence, your \npet's effects are disabled and \nyou can't release other pets!", "popups/petblocktimer", 9, 2);
        public static final /* enum */ a n = new a("Blood lust\nEarn +10 blood money\nfrom player kills.", "popups/bloodlust", 12, 4);
        public static final /* enum */ a o = new a("Survival timer\nAfter this duration, you lose.\nYou can gain more time by\nplayer kills and chest loots.", "popups/minigame", 12, 5);
        public static final /* enum */ a p = new a("Amnesty\nWhile under amnesty, \nplayers can't harm you.\nAttacking a player or the\njungle demon will cancel it.", "popups/amnestyskull", 11, 2);
        public static final /* enum */ a q = new a("Magic sickness\nYou can't teleport in 20+ wild\nwith your spellbook, items, or\npets during sickness.", "popups/sicknesstimer", 9, 2);
        public static final /* enum */ a r = new a("Kharazi safe bank\nAfter this duration\nyou will be removed\nfrom the bank hut.", "popups/banktimer", 11, 4);
        public static final /* enum */ a s = new a("Freeze duration", "popups/freeze", 11, 4);
        public static final /* enum */ a t = new a("Imbued heart\nCooldown duration", "popups/imbued", 10, 3);
        public static final /* enum */ a u = new a("Enchanted heart\nCooldown duration", "popups/enchantedheart", 10, 3);
        public static final /* enum */ a v = new a("Infernal heart\nCooldown duration", "popups/infernal", 10, 3);
        public static final /* enum */ a w = new a("Drop rate bonus\nChaos elemental", "popups/drbonus", 10, 4);
        public static final /* enum */ a x = new a("Drop rate bonus\nBarrelchest", "popups/drbonus", 10, 4);
        public static final /* enum */ a y = new a("Drop rate bonus\nKraken", "popups/drbonus", 10, 4);
        public static final /* enum */ a z = new a("Drop rate bonus\nVet'ion", "popups/drbonus", 10, 4);
        public static final /* enum */ a A = new a("Drop rate bonus\nCrazy archaeologist", "popups/drbonus", 10, 4);
        public static final /* enum */ a B = new a("Blood slayer task\nComplete the task in time!", "popups/slayer", 11, 4);
        public static final /* enum */ a C = new a("Drop rate bonus\nDemonic gorilla", "popups/drbonus", 10, 4);
        public static final /* enum */ a D = new a("Drop rate bonus\nWildywyrm", "popups/drbonus", 10, 4);
        public static final /* enum */ a E = new a("Thief scroll\n@gre@2x@whi@ loot from\nthieving.", "popups/drbonus", 10, 4);
        public static final /* enum */ a F = new a("Larran's loot\n@gre@2x@whi@ larrans keys from\nblood slayer tasks.", "popups/drbonus", 10, 4);
        public static final /* enum */ a G = new a("Drop rate bonus\nDrop rate increased by +5%", "popups/drbonus", 10, 4);
        public static final /* enum */ a H = new a("Event booster\nGives @gre@25%@whi@ more @yel@event\n@yel@currency@whi@ from @or1@World events!", "popups/eventboost", 10, 4);
        public static final /* enum */ a I = new a("Event booster\nGives @gre@25%@whi@ more @yel@event\n@yel@currency@whi@ from @or1@World events!", "popups/eventboost", 10, 4);
        public static final /* enum */ a J = new a("Hunger games perk\nTemporary power-up perk", "popups/eventboost", 10, 4);
        public static final /* enum */ a K = new a("Coin bonus\nPvM GP increased by +25%", "popups/drbonus", 10, 4);
        public static final /* enum */ a L = new a("Luck scroll\nDrop rate bonus @gre@+10%", "popups/drbonus", 10, 4);
        public static final /* enum */ a M = new a("Super luck scroll\nDrop rate bonus @gre@+15%", "popups/drbonus", 10, 4);
        public static final /* enum */ a N = new a("Minigame scroll\n2x minigame points & +25%\nKharazi drop rate", "popups/drbonus", 10, 4);
        public static final /* enum */ a O = new a("Blood discount\n@gre@10%@whi@ cheaper purchases\nfrom Blood fountain shops!", "popups/drbonus", 10, 4);
        public static final /* enum */ a P = new a("Hotspot bonus\n@gre@2x@whi@ Hotspot Points <img=158>\nfrom hotspots for limited time", "popups/drbonus", 10, 4);
        public static final /* enum */ a Q = new a("Vintage bonus\n2X Vintage points and\n+25% ticket drops", "popups/drbonus", 10, 4);
        public static final /* enum */ a R = new a("Raid scroll\nRaids reward chance @gre@+10%", "popups/drbonus", 10, 4);
        public static final /* enum */ a S = new a("Slayer crystal\nDouble slayer and\nblood slayer points", "popups/drbonus", 10, 4);
        public static final /* enum */ a T = new a("Hotspot crystal\nDouble chance for\nhot spot caskets", "popups/drbonus", 10, 4);
        public static final /* enum */ a U = new a("Raids chart\nIncreased chance for\nraids chest rares!", "popups/drbonus", 10, 4);
        public static final /* enum */ a V = new a("Seasonal boost\nGives @gre@+15%@whi@ more @yel@drop\n@yel@rate bonus@whi@ during Seasonal event!", "popups/eventboost", 10, 4);
        public static final /* enum */ a W = new a("Seasonal double\nGives @gre@+5%@whi@ chance for @yel@doubled\n@yel@drops@whi@ during Seasonal event!", "popups/eventboost", 10, 4);
        public static final /* enum */ a X = new a("Seasonal hotspot\nGives @gre@25%@whi@ more @yel@hotspot\n@yel@caskets@whi@ during Seasonal event!", "popups/eventboost", 10, 4);
        public static final /* enum */ a Y = new a("Seasonal revs\nGives @gre@25%@whi@ more @yel@superior\n@yel@revenants@whi@ during Seasonal event!", "popups/eventboost", 10, 4);
        public static final /* enum */ a Z = new a("Adventure Scroll\n+10 blood money from PKs\n+15% PvM damage\n+25% Drop rate bonus", "popups/drbonus", 11, 4);
        public static final /* enum */ a aa = new a("Dragon Boost\n+10% PvM damage\nagainst Dragons", "popups/pvmboost", 11, 4);
        public static final /* enum */ a ab = new a("Revenant Boost\n+10% PvM damage\nagainst Revenants", "popups/pvmboost", 11, 4);
        public static final /* enum */ a ac = new a("Deep Wild Boost\n+10% PvM damage\nin Deep Wild", "popups/pvmboost", 11, 4);
        public static final /* enum */ a ad = new a("Raid Boost\n+10% PvM damage\nagainst Raid monsters", "popups/pvmboost", 11, 4);
        public static final /* enum */ a ae = new a("Maledictus Boost\n+20% Superior Blood\nRevenant chance", "popups/drbonus", 11, 4);
        public static final /* enum */ a af = new a("Slayer speed pass\nAssigned slayer tasks\nhave kill requirements\nreduced by 50%", "popups/slayer", 11, 4);
        public static final /* enum */ a ag = new a("Donator elixir\n2X zone tokens for\n all donator zones", "popups/dzone_elixir", 11, 4);
        public static final /* enum */ a ah = new a("Cosmic gold\nReceive @gre@+25%@whi@ more gold\nfrom all PvM drops", "popups/drbonus", 10, 4);
        public static final /* enum */ a ai = new a("Cosmic luck\nDrop rate bonus @gre@+5%", "popups/drbonus", 10, 4);
        public static final /* enum */ a aj = new a("Cosmic strength\nDeal @gre@+5%@whi@ more PvM damage", "popups/pvmboost", 11, 4);
        public static final /* enum */ a ak = new a("Frenzy\nDeal +10% melee damage in PvM\n(+5% in PvP)", "popups/werewolf", 9, 2);
        public static final /* enum */ a al = new a("Blood Satiation\nGrants +10% PvM damage & accuarcy\nfor magic and range (+5% in PvP)", "popups/vampyre", 9, 2);
        private String am;
        private String an;
        private int ao;
        private int ap;
        private int aq;
        private static final /* synthetic */ a[] ar;

        public static a[] values() {
            return (a[])ar.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private a(String string2, String string3, int n3, int n4) {
            this.an = string2;
            this.am = string3;
            this.ao = n3;
            this.ap = n4;
        }

        private a(String string2, int n3) {
            this.an = string2;
            this.aq = n3;
            this.ao = 4;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, aa, ab, ac, ad, ae, af, ag, ah, ai, aj, ak, al};
        }

        static {
            ar = rs.l.e.q$a.a();
        }
    }
}

