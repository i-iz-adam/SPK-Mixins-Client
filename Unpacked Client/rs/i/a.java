/*
 * Decompiled with CFR 0.152.
 */
package rs.i;

import java.util.Locale;
import rs.l.j;

public class a {
    public static final int a = 200;
    public static int b = 0;
    public static int c = 1;
    public static int d = 2;
    public static int e = 3;
    public static int f = 5;
    public static int g = 11;
    public static int h = 12;
    public static int i = 20;
    public static int j = 0;
    public static int k = 1;
    public static int l = 2;
    public static int m = 5;
    public static int n = 4;
    public static int o = 6;
    public static int p = 7;
    public static int q = 3;
    public static int r = 8;
    public static int s = 15;
    public static int t = 16;
    public static int u = 17;
    public static int v = 0;
    public static int w = 1;
    public static int x = 2;
    public static int y = 3;
    public static int z = 4;
    private static final String[] A = new String[]{"you can", "you must", "you do", "you need", "is full", "not enough", "<item=", "rules", "costs", "requires", "players online"};
    private static final String[] B = new String[]{" received ", " successfully enchanted ", " has killed ", "killstreak", "has encountered", "just captured"};
    private static final String C = "<y>";
    private static final String D = "<c>";

    public static int a(String string, int n2) {
        if (n2 == j) {
            if (string.startsWith("<img=2><shad=FFFF3F><col=FE610C> News: </shad></col>")) {
                return s;
            }
            if (string.startsWith(C)) {
                return u;
            }
            if (string.startsWith("Please wait at least") && string.endsWith("each yell message!")) {
                return u;
            }
            if (string.startsWith(D)) {
                return t;
            }
            if (string.contains("Clan Chat channel-mate")) {
                return t;
            }
        }
        return n2;
    }

    public static String b(String string, int n2) {
        if (n2 == t) {
            return string.replace(D, "");
        }
        if (n2 == u) {
            return string.replace(C, "");
        }
        return string;
    }

    public static boolean c(String string, int n2) {
        if (n2 == j && rs.i.a.a(string)) {
            return true;
        }
        if (n2 == s && rs.i.a.b(string)) {
            return true;
        }
        if (n2 == u || n2 == t) {
            for (int i2 = 0; i2 < rs.l.j.e.length; ++i2) {
                if (!string.contains("<img=" + rs.l.j.e[i2] + ">")) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private static boolean a(String string) {
        String string2 = string.toLowerCase(Locale.ROOT);
        if (string2.startsWith("<img")) {
            return false;
        }
        for (String string3 : A) {
            if (!string2.contains(string3)) continue;
            return false;
        }
        return true;
    }

    private static boolean b(String string) {
        String string2 = string.toLowerCase(Locale.ROOT);
        for (String string3 : B) {
            if (!string2.contains(string3)) continue;
            return true;
        }
        return false;
    }
}

