/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.Client;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.U
 */
public class u_0
extends c {
    public static final int c = 100;

    public u_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        int n2;
        int n3;
        int n4;
        e e2 = u_0.d(51200);
        u_0.h(51201, "misc/matcher 1");
        e e3 = u_0.d(51202);
        e3.aH = 1750;
        e3.P = 477;
        e3.aR = 224;
        e3.k(100);
        int n5 = n4 = 51203;
        for (n3 = 0; n3 < 100; ++n3) {
            n2 = 5 + Client.d(100);
            String string = "<col=0xB9B855>Test" + (n3 + 1) + " <tab=360>@lre@(" + Client.d(n2) + "/" + n2 + " logins)";
            if (Client.d(10) == 0) {
                string = "@red@[BANNED]</col> " + string;
            } else if (Client.d(10) == 0) {
                string = (Client.d(2) == 0 ? "@gre@[ONLINE]</col> " : "@gre@[ONLINE (Non-match)]</col> ") + string;
            }
            u_0.b(n5++, string, "Action", this.a, 1, 12171349, false, true, 500);
            e3.b(n3, n5 - 1, 3, 3 + n3 * 16);
        }
        n3 = n5++;
        u_0.a(n3, "Player IP / UID Matcher", this.a, 2, 16750623, true, true);
        n2 = n5++;
        u_0.a(n2, "@whi@IP Address: @gre@Not banned", this.a, 0, 0xFFFFFF, false, true);
        int n6 = n5++;
        u_0.a(n6, "@whi@UID: @gre@Not banned", this.a, 0, 0xFFFFFF, false, true);
        int n7 = n5++;
        u_0.a(n7, "misc/login", 2, 130, 27, "Ban all", -1, n5++, 1);
        u_0.a(n5 - 1, "misc/login", 3, 130, 27, n5++);
        int n8 = n5++;
        u_0.a(n8, "Ban ALL", this.a, 1, 16750623, true, true);
        int n9 = n5++;
        u_0.b(n9, "<tab=17>@yel@Order by total matches", "Order by total matches", this.a, 0, 16750623, false, true, 130);
        u_0.c(n5++, 2, "gambling/SPRITE");
        int n10 = n5++;
        u_0.b(n10, "<tab=17>@yel@Order by most recent", "Order by recent matches", this.a, 0, 16750623, false, true, 150);
        u_0.c(n5++, 1, "gambling/SPRITE");
        int n11 = n5++;
        u_0.b(n11, "<img=39>@yel@ Search new name", "Search a new name", this.a, 0, 16750623, false, true, 150);
        int n12 = n5;
        u_0.a(n5++, "drops/sprite", 3, 17, 17, "Go back", -1, n5, 1);
        u_0.a(n5++, "drops/sprite", 4, 17, 17, n5++);
        u_0.a(52050, "@whi@Geolocation: @gre@N/A", this.a, 0, 0xFFFFFF, false, true);
        u_0.a(52051, "misc/login", 2, 130, 27, "Ban this IP/UID", -1, 52052, 1);
        u_0.a(52052, "misc/login", 3, 130, 27, 52053);
        u_0.a(52054, "Ban *this* IP/UID", this.a, 1, 16750623, true, true);
        e2.k(19);
        e2.b(0, 51201, 0, 0);
        e2.b(1, 51202, 13, 52);
        e2.b(2, n3, 256, 8);
        e2.b(3, n2, 14, 285);
        e2.b(4, n6, 14, 299);
        e2.b(5, n7, 377, 279);
        e2.b(6, n7 + 1, 377, 279);
        e2.b(7, n8, 440, 287);
        int n13 = 224;
        e2.b(8, n9, n13 + 12, 36);
        e2.b(9, n9 + 1, n13 + 12 - 2, 34);
        e2.b(10, n10, n13 + 12 + 140, 36);
        e2.b(11, n10 + 1, n13 + 12 - 2 + 140, 34);
        e2.b(12, n11, 10, 36);
        e2.b(13, n12, 7, 7);
        e2.b(14, n12 + 1, 7, 7);
        e2.b(15, 52050, 14, 313);
        e2.b(16, 52051, 377, 303);
        e2.b(17, 52052, 377, 303);
        e2.b(18, 52054, 440, 311);
    }
}

