/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.Client;
import rs.l.f_0;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.aD
 */
public class ad_0
extends c {
    public static f_0 c = null;
    public static f_0 d = null;
    public static f_0 e = null;
    public static f_0 f = null;
    public static f_0 g = null;
    public static int bI = 317;
    public static int bJ = 45602;
    public static int bK = 45602;

    public ad_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    public static void a(int n2, boolean bl) {
        if (n2 >= bJ && n2 <= bK) {
            rs.n.e.H[n2].E = bl ? e : c;
            rs.n.e.H[n2].aG = bl ? e : c;
        }
    }

    public static void b(int n2, boolean bl) {
        if (n2 >= bJ && n2 <= bK) {
            for (int i2 = bJ; i2 <= bK; ++i2) {
                rs.n.e.H[i2].m = false;
            }
            rs.n.e.H[n2].m = true;
            if (bl) {
                Client.ap = "::selectperk " + (n2 - bJ);
            }
        }
    }

    @Override
    public void a() {
        e e2 = ad_0.d(bI);
        ad_0.c(65303, 0, "fountain/sprite");
        ad_0.a(65304, "<img=186> Blood Fountain Perk Tree <img=186>", this.a, 2, 16751360, true, true);
        ad_0.a(65313, "fountain/sprite", 4, 100, 32, "Purchase", -1, 65306, 1);
        ad_0.a(65306, "fountain/sprite", 5, 100, 32, 65307);
        ad_0.a(65308, "Purchase", this.a, 0, 16751360, true, true);
        ad_0.a(65309, "fountain/sprite", 4, 100, 32, "Close", -1, 65310, 1);
        ad_0.a(65310, "fountain/sprite", 5, 100, 32, 65311);
        ad_0.a(65312, "Close", this.a, 0, 16751360, true, true);
        ad_0.c(65314, 6, "fountain/sprite");
        ad_0.a(65315, "@whi@Selected perk: @gre@Blood vengeance", this.a, 0, 16751360, true, true);
        ad_0.c(65601, 18, "fountain/sprite");
        rs.n.e.H[65601].l = true;
        c = new f_0("fountain/sprite 1");
        e = new f_0("fountain/sprite 2");
        d = new f_0("fountain/sprite 3");
        f = new f_0("fountain/sprite 19");
        g = new f_0("fountain/sprite 20");
        e e3 = ad_0.d(65600);
        e3.aH = 600;
        e3.P = 475;
        e3.aR = 268;
        e3.k(45);
        e3.b(0, 65601, 3, 5);
        int n2 = 0;
        int n3 = 0;
        ad_0.a(45602, 1, "fountain/sprite", "Blood vengeance I");
        e3.b(1, 45602, 243 + n2, 546 + n3);
        ad_0.a(45603, 1, "fountain/sprite", "Blood vengeance II");
        e3.b(2, 45603, 243 + n2, 485 + n3);
        ad_0.a(45604, 1, "fountain/sprite", "Treasure hunter I");
        e3.b(3, 45604, 361 + n2, 506 + n3);
        ad_0.a(45605, 1, "fountain/sprite", "Treasure hunter II");
        e3.b(4, 45605, 427 + n2, 506 + n3);
        ad_0.a(45606, 1, "fountain/sprite", "Blood whip");
        e3.b(5, 45606, 362 + n2, 433 + n3);
        ad_0.a(45607, 1, "fountain/sprite", "Blood rune c'bow");
        e3.b(6, 45607, 420 + n2, 398 + n3);
        ad_0.a(45608, 1, "fountain/sprite", "Blood dark bow");
        e3.b(7, 45608, 303 + n2, 398 + n3);
        ad_0.a(45609, 1, "fountain/sprite", "Diamonds are forever");
        e3.b(8, 45609, 362 + n2, 369 + n3);
        ad_0.a(45610, 1, "fountain/sprite", "Bloodthirsty I");
        e3.b(9, 45610, 119 + n2, 505 + n3);
        ad_0.a(45611, 1, "fountain/sprite", "Bloodthirsty II");
        e3.b(10, 45611, 54 + n2, 469 + n3);
        ad_0.a(45612, 1, "fountain/sprite", "Killjoy I");
        e3.b(11, 45612, 119 + n2, 428 + n3);
        ad_0.a(45613, 1, "fountain/sprite", "Killjoy II");
        e3.b(12, 45613, 54 + n2, 397 + n3);
        ad_0.a(45614, 1, "fountain/sprite", "Blood pool");
        e3.b(13, 45614, 119 + n2, 359 + n3);
        ad_0.a(45615, 1, "fountain/sprite", "Blood staff");
        e3.b(14, 45615, 303 + n2, 467 + n3);
        ad_0.a(45616, 1, "fountain/sprite", "Blood ring");
        e3.b(15, 45616, 420 + n2, 467 + n3);
        ad_0.a(45617, 1, "fountain/sprite", "Treasure buddy");
        e3.b(16, 45617, 427 + n2, 552 + n3);
        ad_0.a(45618, 1, "fountain/sprite", "Emblem snatcher");
        e3.b(17, 45618, 177 + n2, 397 + n3);
        ad_0.a(45619, 1, "fountain/sprite", "Augury");
        e3.b(18, 45619, 216 + n2, 434 + n3);
        ad_0.a(45620, 1, "fountain/sprite", "Rigour");
        e3.b(19, 45620, 270 + n2, 434 + n3);
        ad_0.a(45621, 1, "fountain/sprite", "Bloodlust");
        e3.b(20, 45621, 13 + n2, 519 + n3);
        ad_0.a(45622, 1, "fountain/sprite", "Excavator");
        e3.b(21, 45622, 176 + n2, 475 + n3);
        ad_0.a(45623, 1, "fountain/sprite", "War diamonds");
        e3.b(22, 45623, 10 + n2, 430 + n3);
        ad_0.a(45624, 1, "fountain/sprite", "Unholy smite");
        e3.b(23, 45624, 242 + n2, 396 + n3);
        ad_0.a(45625, 1, "fountain/sprite", "Eternal recoil");
        e3.b(24, 45625, 198 + n2, 354 + n3);
        ad_0.a(45626, 1, "fountain/sprite", "Eternal blood cape");
        e3.b(25, 45626, 285 + n2, 354 + n3);
        ad_0.a(45627, 1, "fountain/sprite", "Vampiric damage");
        e3.b(26, 45627, 59 + n2, 330 + n3);
        ad_0.a(45628, 1, "fountain/sprite", "Vampiric defence");
        e3.b(27, 45628, 421 + n2, 331 + n3);
        ad_0.a(45629, 1, "fountain/sprite", "Vampiric accuracy");
        e3.b(28, 45629, 59 + n2, 277 + n3);
        ad_0.a(45630, 1, "fountain/sprite", "Archaeologist I");
        e3.b(29, 45630, 321 + n2, 330 + n3);
        ad_0.a(45631, 1, "fountain/sprite", "Archaeologist II");
        e3.b(30, 45631, 321 + n2, 277 + n3);
        ad_0.a(45632, 1, "fountain/sprite", "Archaeologist III");
        e3.b(31, 45632, 362 + n2, 307 + n3);
        ad_0.a(45633, 1, "fountain/sprite", "Blood archer ring");
        e3.b(32, 45633, 156 + n2, 324 + n3);
        ad_0.a(45634, 1, "fountain/sprite", "Blood seers ring");
        e3.b(33, 45634, 238 + n2, 324 + n3);
        ad_0.a(45635, 1, "fountain/sprite", "Blood berserker ring");
        e3.b(34, 45635, 198 + n2, 304 + n3);
        ad_0.a(45636, 1, "fountain/sprite", "Death's accomplice");
        e3.b(35, 45636, 96 + n2, 242 + n3);
        ad_0.a(45637, 1, "fountain/sprite", "Death's door");
        e3.b(36, 45637, 421 + n2, 281 + n3);
        ad_0.a(45638, 1, "fountain/sprite", "Blood alchemy");
        e3.b(37, 45638, 119 + n2, 305 + n3);
        ad_0.a(45639, 1, "fountain/sprite", "Blood alchemy II");
        e3.b(38, 45639, 150 + n2, 275 + n3);
        ad_0.a(45640, 1, "fountain/sprite", "Grand treasure");
        e3.b(39, 45640, 361 + n2, 506 + n3 + 46);
        ad_0.a(45641, 1, "fountain/sprite", "Blood alchemy III");
        e3.b(40, 45641, 150 + n2 + 32, 275 + n3 - 33);
        ad_0.a(45642, 1, "fountain/sprite", "Bounty teleport");
        e3.b(41, 45642, 18 + n2, 365 + n3);
        ad_0.a(45643, 1, "fountain/sprite", "Mercenary I");
        e3.b(42, 45643, 20 + n2, 242 + n3);
        ad_0.a(45644, 1, "fountain/sprite", "Mercenary II");
        e3.b(43, 45644, 20 + n2, 192 + n3);
        ad_0.a(45645, 1, "fountain/sprite", "Escape Artist");
        e3.b(44, 45645, 96 + n2, 192 + n3);
        bK = e3.al[e3.al.length - 1];
        int n4 = 11;
        e2.al = new int[11];
        e2.am = new int[11];
        e2.bc = new int[11];
        e2.b(0, 65303, 5, 20);
        e2.b(1, 65304, 265, 25);
        e2.b(2, 63740, 479, 24);
        e2.b(3, 63741, 479, 24);
        e2.b(4, 65308, -72000, 287);
        e2.b(5, 65309, -138000, 277);
        e2.b(6, 65310, -138000, 277);
        e2.b(7, 65312, -188000, 287);
        e2.b(8, 65314, -276000, 285);
        e2.b(9, 65315, -371000, 289);
        e2.b(10, 65600, 4, 44);
    }
}

