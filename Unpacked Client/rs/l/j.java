/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 *  gnu.trove.i.a.i
 */
package rs.l;

import gnu.trove.f.b.cc;
import gnu.trove.i.a.i;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rs.Client;
import rs.l.a.a;
import rs.l.f_0;

public class j {
    public static final int a = 386;
    public static final cc<a> b = new cc();
    public static int[] c = new int[0];
    public static final i d;
    public static final int[] e;
    public static final Map<String, Integer> f;
    private static final String[] g;

    public static boolean a(int n2) {
        if (j.b(n2)) {
            return true;
        }
        for (int i2 = 0; i2 < e.length; ++i2) {
            if (e[i2] != n2) continue;
            return true;
        }
        return false;
    }

    public static boolean b(int n2) {
        return n2 == 2 || n2 == 204 || n2 == 26 || n2 == 205;
    }

    public static boolean c(int n2) {
        return n2 == 205 || n2 == 333 || n2 == 344 || n2 == 340 || n2 == 348;
    }

    public static int a(String string, int n2) {
        if (j.b(n2) || n2 == 38 || n2 == 94) {
            return 16750623;
        }
        if (j.a(n2)) {
            if (string.equals("Kellatha")) {
                return 0xFF02FF;
            }
            if (string.equals("Scooby Doo")) {
                return 0xFF1D1F;
            }
            if (string.equals("Goobymunch") || string.equals("Raiden")) {
                return 0xFF1010;
            }
            if (string.equals("Ascend")) {
                return 0xB50000;
            }
            if (string.equals("Bsouth")) {
                return 65280;
            }
            return 16750623;
        }
        return 65535;
    }

    public static void a() {
        Client.fE = new f_0[386];
        for (int i2 = 0; i2 < Client.fE.length; ++i2) {
            Client.fE[i2] = i2 >= 10 && i2 <= 17 ? new f_0("clan/icons/" + (i2 - 10), true) : (i2 >= 74 && i2 <= 77 ? new f_0("popups/bh skull" + (i2 - 70), true) : new f_0("icons/" + i2, true));
        }
    }

    public static int a(char c2, char c3, char c4) {
        for (int i2 = 0; i2 < g.length; ++i2) {
            String string = g[i2];
            if (c2 != string.charAt(0) || c3 != string.charAt(1) || c4 != string.charAt(2)) continue;
            return f.get(string);
        }
        return -1;
    }

    public static int a(String string) {
        return string.length() < 6 ? Color.decode(string).getRGB() : Integer.parseInt(string, 16);
    }

    public static void b() {
        j.a();
    }

    public static String b(String string) {
        String string2 = "<[^>]*>|@[^@]*@";
        Pattern pattern = Pattern.compile(string2);
        Matcher matcher = pattern.matcher(string);
        return matcher.replaceAll("").trim();
    }

    static {
        b.a(21, (Object)new a(27, 30).a(-3).c(1));
        b.a(32, (Object)new a(33, 36).a(-3).c(1));
        b.a(45, (Object)new a(41, 44).a(-3).c(1));
        b.a(291, (Object)new a(292, 297).a(-1).c(3));
        b.a(333, (Object)new a(333, 336).a(-1).c(2).d(-1).f(2));
        b.a(340, (Object)new a(340, 343).a(-1).c(2).b(1).d(-1));
        b.a(348, (Object)new a(348, 351).a(-1).c(2).b(1).d(-1));
        b.a(344, (Object)new a(344, 347).a(-1).c(2).b(1).d(-1));
        b.a(352, (Object)new a(352, 355).a(-1).c(2).b(1).d(-1));
        b.a(356, (Object)new a(356, 359).a(-1).c(2).b(1).d(-1));
        c = b.b();
        d = new i();
        d.b(333);
        d.b(340);
        d.b(348);
        d.b(344);
        d.b(352);
        e = new int[]{1, 18, 26, 6, 38, 333, 340, 348, 344, 352, 356, 2, 204, 26, 205};
        f = new HashMap<String, Integer>();
        f.put("red", j.a("ff0000"));
        f.put("gre", j.a("65280"));
        f.put("blu", j.a("255"));
        f.put("yel", j.a("ffff00"));
        f.put("dgr", j.a("115b0d"));
        f.put("cya", j.a("65535"));
        f.put("mag", j.a("ff00ff"));
        f.put("lpu", j.a("8842ad"));
        f.put("dpu", j.a("83008F"));
        f.put("whi", j.a("ffffff"));
        f.put("lre", j.a("ff9040"));
        f.put("dre", j.a("800000"));
        f.put("bla", j.a("0"));
        f.put("or0", j.a("FF981F"));
        f.put("or1", j.a("ffb000"));
        f.put("or2", j.a("ff7000"));
        f.put("or3", j.a("ff3000"));
        f.put("gr1", j.a("c0ff00"));
        f.put("gr2", j.a("80ff00"));
        f.put("gr3", j.a("40ff00"));
        f.put("bl1", j.a("85c7e2"));
        f.put("bl2", j.a("2F4780"));
        f.put("yl1", j.a("ffdd00"));
        f.put("gra", j.a("B9B855"));
        g = f.keySet().toArray(new String[f.keySet().size()]);
    }
}

