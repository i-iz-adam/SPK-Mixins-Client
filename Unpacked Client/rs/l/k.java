/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.Client;
import rs.l.a_0;
import rs.l.h;
import rs.l.i;
import rs.l.l;
import rs.l.m_0;
import rs.l.o;
import rs.l.t;

public class k {
    public static int a = -10;
    public static i b = new i(25);
    public static i c = new i(50);
    public static i d = new i(125);
    public static i e = new i(250);

    public static int a(String string, int n2, int n3) {
        int n4 = Client.bN;
        if (string.length() < n3 + 2 + 1) {
            return a;
        }
        char c2 = string.charAt(n3);
        char c3 = string.charAt(n3 + 1);
        char c4 = string.charAt(n3 + 2);
        if (c2 == 'p' && c3 == 'u' && c4 == '1') {
            int n5 = 1;
            int n6 = 4784273 + 256 * n5 * e.b();
            return n6;
        }
        if (c2 == 'p' && c3 == 'u' && c4 == '2') {
            int n7 = 4784273 + 1 * Math.min(100, n4 / 2) + 131072 * (n4 / 2);
            return n7;
        }
        return a;
    }

    public static int b(String string, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        if (n2 == n3 + 5 && string.charAt(n3 + 1) == '/' && string.charAt(n3 + 2) == 'f' && string.charAt(n3 + 3) == 'l' && string.charAt(n3 + 4) == 'a') {
            return -12;
        }
        if (n2 == n3 + 6 && string.charAt(n3 + 1) == '/' && string.charAt(n3 + 2) == 'f' && string.charAt(n3 + 3) == 'l' && string.charAt(n3 + 4) == 'a' && string.charAt(n3 + 5) == '2') {
            return -12;
        }
        boolean bl = n2 > n3 + 5 && string.charAt(n3 + 4) == '2' && string.charAt(n3 + 5) == '=';
        int n7 = n6 = bl ? n3 + 5 : n3 + 4;
        if (n2 <= n6 + 1 || string.charAt(n3 + 1) != 'f' || string.charAt(n3 + 2) != 'l' || string.charAt(n3 + 3) != 'a' || string.charAt(n6) != '=') {
            return a;
        }
        for (n5 = n4 = n6 + 1; n5 < n2 && string.charAt(n5) != ':'; ++n5) {
        }
        if (n5 == n4) {
            return a;
        }
        int n8 = 0;
        boolean bl2 = n5 - n4 >= 6;
        int n9 = bl2 ? 16 : 10;
        for (int i2 = n4; i2 < n5; ++i2) {
            char c2 = string.charAt(i2);
            if (Character.digit(c2, n9) == -1) {
                return a;
            }
            n8 = bl2 ? h.a(n8, c2, n9) : h.a(n8, c2);
        }
        if (bl2) {
            n8 = -n8;
        }
        if (n5 == n2 || n5 + 1 == n2) {
            return a;
        }
        long l2 = 0L;
        for (int i3 = n5 + 1; i3 < n2; ++i3) {
            char c3 = string.charAt(i3);
            if (c3 < '0' || c3 > '9') {
                return a;
            }
            l2 = l2 * 10L + (long)c3 - 48L;
        }
        return l.a(l2, n8, bl);
    }

    public static int c(String string, int n2, int n3) {
        return m_0.a(string, n2, n3);
    }

    public static int d(String string, int n2, int n3) {
        return a_0.a(string, n2, n3);
    }

    public static int e(String string, int n2, int n3) {
        int n4 = t.c(string, n2, n3);
        if (n4 != -1) {
            return n4;
        }
        o.a a2 = o.a(string, n3, n2);
        return a2 == null ? a : a2.a;
    }

    public static int f(String string, int n2, int n3) {
        o.a a2 = o.a(string, n3, n2);
        return a2 == null ? 0 : a2.b;
    }

    public static int g(String string, int n2, int n3) {
        if (n2 <= n3 + 5) {
            return a;
        }
        if (string.charAt(n3 + 1) == 'i' && string.charAt(n3 + 2) == 't' && string.charAt(n3 + 3) == 'e' && string.charAt(n3 + 4) == 'm' && string.charAt(n3 + 5) == '=') {
            int n4 = 0;
            for (int i2 = n3 + 5 + 1; i2 < n2; ++i2) {
                n4 = h.a(n4, string.charAt(i2));
            }
            return n4;
        }
        return a;
    }

    public static int h(String string, int n2, int n3) {
        if (n2 <= n3 + 4) {
            return a;
        }
        if (string.charAt(n3 + 1) == '/' && string.charAt(n3 + 2) == 'c' && string.charAt(n3 + 3) == 'o' && string.charAt(n3 + 4) == 'l') {
            return h.ac;
        }
        if (string.charAt(n3 + 1) == 'c' && string.charAt(n3 + 2) == 'o' && string.charAt(n3 + 3) == 'l' && string.charAt(n3 + 4) == '=') {
            int n4 = k.a(string, n2, n3 + 5);
            if (n4 != a) {
                return n4;
            }
            int n5 = 0;
            boolean bl = n2 - (n3 + 4 + 1) >= 6;
            for (int i2 = n3 + 4 + 1; i2 < n2; ++i2) {
                n5 = bl ? h.a(n5, string.charAt(i2), 16) : h.a(n5, string.charAt(i2));
            }
            return bl ? -n5 : n5;
        }
        return a;
    }

    public static int i(String string, int n2, int n3) {
        if (n2 <= n3 + 6) {
            return a;
        }
        if (string.charAt(n3 + 1) == '/' && string.charAt(n3 + 2) == 't' && string.charAt(n3 + 3) == 'r' && string.charAt(n3 + 4) == 'a' && string.charAt(n3 + 5) == 'n' && string.charAt(n3 + 6) == 's') {
            return h.af;
        }
        if (string.charAt(n3 + 1) == 't' && string.charAt(n3 + 2) == 'r' && string.charAt(n3 + 3) == 'a' && string.charAt(n3 + 4) == 'n' && string.charAt(n3 + 5) == 's' && string.charAt(n3 + 6) == '=') {
            int n4 = 0;
            boolean bl = n2 - (n3 + 5 + 1) >= 6;
            for (int i2 = n3 + 5 + 1; i2 < n2; ++i2) {
                n4 = bl ? h.a(n4, string.charAt(i2), 16) : h.a(n4, string.charAt(i2));
            }
            return bl ? -n4 : n4;
        }
        return a;
    }

    public static int j(String string, int n2, int n3) {
        if (n2 <= n3 + 5) {
            return a;
        }
        if (string.charAt(n3 + 1) == '/' && string.charAt(n3 + 2) == 's' && string.charAt(n3 + 3) == 'h' && string.charAt(n3 + 4) == 'a' && string.charAt(n3 + 5) == 'd') {
            return h.ai;
        }
        if (string.charAt(n3 + 1) == 's' && string.charAt(n3 + 2) == 'h' && string.charAt(n3 + 3) == 'a' && string.charAt(n3 + 4) == 'd' && string.charAt(n3 + 5) == '=') {
            int n4 = k.a(string, n2, n3 + 6);
            if (n4 != a) {
                return n4;
            }
            int n5 = 0;
            boolean bl = n2 - (n3 + 5 + 1) >= 6;
            for (int i2 = n3 + 5 + 1; i2 < n2; ++i2) {
                n5 = bl ? h.a(n5, string.charAt(i2), 16) : h.a(n5, string.charAt(i2));
            }
            return bl ? -n5 : n5;
        }
        return a;
    }

    public static int k(String string, int n2, int n3) {
        if (n2 > n3 + 2 && string.charAt(n3 + 1) == '/' && string.charAt(n3 + 2) == 'u') {
            return -1;
        }
        if (n2 > n3 + 1 && string.charAt(n3 + 1) == 'u') {
            if (n2 > n3 + 2 && string.charAt(n3 + 2) == '=') {
                int n4 = 0;
                for (int i2 = n3 + 2 + 1; i2 < n2; ++i2) {
                    n4 = h.a(n4, string.charAt(i2));
                }
                return n4;
            }
            return 1;
        }
        return a;
    }

    public static int l(String string, int n2, int n3) {
        if (n2 > n3 + 4 && string.charAt(n3 + 1) == '/' && string.charAt(n3 + 2) == 's' && string.charAt(n3 + 3) == 't' && string.charAt(n3 + 4) == 'r') {
            return -1;
        }
        if (n2 > n3 + 3 && string.charAt(n3 + 1) == 's' && string.charAt(n3 + 2) == 't' && string.charAt(n3 + 3) == 'r') {
            if (n2 > n3 + 4 && string.charAt(n3 + 4) == '=') {
                int n4 = 0;
                for (int i2 = n3 + 4 + 1; i2 < n2; ++i2) {
                    n4 = h.a(n4, string.charAt(i2));
                }
                return n4;
            }
            return 0x800000;
        }
        return a;
    }

    public static int m(String string, int n2, int n3) {
        if (n2 <= n3 + 4) {
            return a;
        }
        if (string.charAt(n3 + 1) == 't' && string.charAt(n3 + 2) == 'a' && string.charAt(n3 + 3) == 'b' && string.charAt(n3 + 4) == '=') {
            boolean bl = false;
            int n4 = 0;
            for (int i2 = n3 + 4 + 1; i2 < n2; ++i2) {
                n4 = h.a(n4, string.charAt(i2));
            }
            return n4;
        }
        return a;
    }

    public static int n(String string, int n2, int n3) {
        if (n2 <= n3 + 5) {
            return a;
        }
        if (string.charAt(n3 + 1) == 'y' && string.charAt(n3 + 2) == 'o' && string.charAt(n3 + 3) == 'f' && string.charAt(n3 + 4) == 'f' && string.charAt(n3 + 5) == '=') {
            boolean bl = false;
            int n4 = 0;
            for (int i2 = n3 + 5 + 1; i2 < n2; ++i2) {
                n4 = h.a(n4, string.charAt(i2));
            }
            return n4;
        }
        return a;
    }
}

