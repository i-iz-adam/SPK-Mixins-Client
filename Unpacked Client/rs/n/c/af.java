/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rs.Client;
import rs.d.k;
import rs.l.j;
import rs.l.k_0;
import rs.n.c;
import rs.n.e;
import rs.s;

public class af
extends c {
    public static final int c = 200;
    public static List<s> d = new ArrayList<s>();
    public static Map<Integer, s> e = new HashMap<Integer, s>();

    public af(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        this.i();
        this.h();
    }

    private void h() {
        e e2 = rs.n.c.af.d(67027);
        rs.n.c.af.a(64029, 4, 0, 64030, 13, "bank/BANK", 35, 25, "Search");
        rs.n.c.af.a(64030, 15, "bank/BANK", 35, 25, 64031);
        rs.n.c.af.a(64033, "Click the search button", this.a, 0, 0xFF9933, false, true);
        rs.n.c.af.h(64036, "/gameframe/spawntabbar");
        int n2 = 5;
        int n3 = 5;
        int n4 = 5;
        e2.al = new int[n2];
        e2.am = new int[n2];
        e2.bc = new int[n2];
        int n5 = 0;
        e2.b(n5++, 64036, n4 - 4, n3 - 10);
        e2.b(n5++, 64071, 8, 39);
        e2.b(n5++, 64029, n4 + 10, n3);
        e2.b(n5++, 64030, n4 + 10, n3);
        e2.b(n5++, 64033, n4 + 55, n3 + 4 + 3);
        rs.n.c.af.a(null, "nothing that exists");
        rs.n.c.af.a(64033, "Click the search button", this.a, 0, 0xFF9933, false, true);
    }

    private void i() {
        int n2;
        e e2 = rs.n.c.af.d(64071);
        e2.P = 170;
        e2.aR = 220;
        e2.bj = 87;
        int n3 = 20;
        int n4 = n2 = 64072;
        boolean bl = false;
        e2.aH = n3 * 32;
        int n5 = 5;
        boolean bl2 = true;
        int n6 = 15;
        e2.al = new int[n3 * 3];
        e2.am = new int[n3 * 3];
        e2.bc = new int[n3 * 3];
    }

    public static void a(Client client, String string) {
        if (rs.d.k.ad == 0) {
            return;
        }
        if (string.length() < 3) {
            if (client != null) {
                client.a("Please have at least 3 letters in your search term!", 0, "");
            }
            return;
        }
        Object object = string;
        if (((String)object).length() > 8) {
            object = string.substring(0, 7) + "..";
        }
        rs.n.e.H[64033].at = "Results for: \"@whi@" + (String)object + "@or1@\"";
        d.clear();
        e.clear();
        for (int i2 = 1; i2 < rs.d.k.a; ++i2) {
            k k2 = (k)rs.d.k.c.b(i2);
            if (k2 == null || k2.w == null || k2.i == 11283 || k2.i == 4178 || k2.w.contains(" axe head") || k2.w.contains(" pick head") || k2.w.contains("kitten") || k2.w.contains("Pet cat") || k2.w.contains("@red@") || k2.w.contains("Clue scroll") || !k2.w.toLowerCase().contains(string.toLowerCase())) continue;
            if (!rs.l.j.b(Client.cT) && k2.w.contains("@gre@") && !k2.w.contains("flask (")) {
                d.add(new s("<img=25> <str=16711680>" + k2.w + (String)(rs.l.j.b(Client.cT) ? " [" + k2.i + "]" : ""), k2.i));
                continue;
            }
            d.add(new s(k2.w + (String)(rs.l.j.b(Client.cT) ? " [" + k2.i + "]" : ""), k2.i));
        }
    }

    public static void b(k_0[] k_0Array) {
        int n2;
        e e2 = rs.n.e.H[64071];
        e2.V = 0;
        e2.P = 170;
        e2.aR = 215;
        e2.bj = 87;
        int n3 = d.size();
        if (n3 > 200) {
            n3 = 200;
        }
        int n4 = n2 = 70000;
        int n5 = 0;
        e2.aH = n3 * 32;
        if (e2.aH < 250) {
            e2.aH = 250;
        }
        int n6 = 5;
        int n7 = 1;
        int n8 = 15;
        e2.al = new int[n3 * 3];
        e2.am = new int[n3 * 3];
        e2.bc = new int[n3 * 3];
        int n9 = 2;
        for (int i2 = 0; i2 < n3; ++i2) {
            rs.n.c.af.h(n4, "/clan/sprite 4");
            e2.b(n5, n4, n6 - 13, n7 + n8 * i2 * 2 + 28);
            rs.n.c.af.c(++n4, d.get(i2).b(), 27);
            rs.n.e.H[n4].aj = 64071;
            e2.b(++n5, n4, n6, n7 + n8 * i2 * 2 - 2);
            rs.n.c.af.a(++n4, d.get(i2).a(), "Spawn this item", k_0Array, 0, 16750623, false, false, 125);
            e2.b(++n5, n4, n6 + 35, n7 + n8 * i2 * 2 + 9);
            e.put(n4, d.get(i2));
            ++n4;
            ++n5;
        }
    }
}

