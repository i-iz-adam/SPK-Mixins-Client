/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import java.util.Arrays;
import java.util.Map;
import rs.Client;
import rs.l.c;
import rs.l.f.a.f.a;
import rs.l.f.a.f.b;
import rs.l.f.e;
import rs.l.u;

public final class t {
    public static final int a = -1;
    public static final int b = -2;
    public static final int c = 0;
    private static final int d = 0x1000000;
    private static final int e = 50;
    private static final int f = 512;
    private static final int[] g = new int[0];
    private static final int[][] h = new int[][]{{0xFF3030, 0xFFA000, 0xFFFF30, 3211104, 3203071, 5267711, 12599551, 16728256}, {16717824, 16730112, 16742400, 0xFFB000, 0xFFFF20}, {1477887, 0x3434FF, 7874815, 12595455, 0xFF4FCF}, {0x20C020, 5303856, 10288944, 14221104, 0xFFFF40}, {0xFFFF30, 16764960, 16752656, 16740368, 0xFF4000}, {0, 328965, 0x101010, 0x1C1C1C, 0x282828}, {0xFFFFFF, 0xF8F8FF, 0xF0FFFF, 0xE8E8E8}, {0, 0x303030, 0x707070, 0xB0B0B0, 0xFFFFFF}};
    private static final Map<Long, Long> i = new u(64, 0.75f, true);

    private t() {
    }

    public static int a(String string, int n2) {
        char c2;
        if (string.startsWith("@par@", n2)) {
            return 0;
        }
        if (n2 + 5 < string.length() && string.charAt(n2) == '@' && string.charAt(n2 + 1) == 'p' && string.charAt(n2 + 2) == 'a' && string.charAt(n2 + 3) == 'r' && string.charAt(n2 + 5) == '@' && (c2 = string.charAt(n2 + 4)) >= '2' && c2 <= '8') {
            return c2 - 49;
        }
        return -1;
    }

    public static int a(String string, int n2, int n3) {
        int n4;
        int n5 = n2 - n3 - 1;
        if (n5 == 3 && t.a(string, n3 + 1, "par")) {
            return 0;
        }
        if (n5 == 4 && t.a(string, n3 + 1, "par") && (n4 = string.charAt(n3 + 4)) >= 50 && n4 <= 56) {
            return n4 - 49;
        }
        if (n5 == 4 && string.charAt(n3 + 1) == '/' && t.a(string, n3 + 2, "par")) {
            return -2;
        }
        if (n5 == 5 && string.charAt(n3 + 1) == '/' && t.a(string, n3 + 2, "par") && (n4 = string.charAt(n3 + 5)) >= 50 && n4 <= 56) {
            return -2;
        }
        if (n5 > 4 && t.a(string, n3 + 1, "par") && string.charAt(n3 + 4) == '=' && (n4 = t.e(string, n3 + 5, n2)) != -1) {
            return 0x1000000 | n4;
        }
        return -1;
    }

    public static int b(String string, int n2, int n3) {
        if (n2 - n3 > 5 && string.charAt(n3 + 1) == 'p' && t.a(string, n3 + 2, "img") && string.charAt(n3 + 5) == '=') {
            return 0;
        }
        if (n2 - n3 > 6 && string.charAt(n3 + 1) == 'p' && string.charAt(n3 + 2) >= '2' && string.charAt(n3 + 2) <= '8' && t.a(string, n3 + 3, "img") && string.charAt(n3 + 6) == '=') {
            return string.charAt(n3 + 2) - 49;
        }
        return -1;
    }

    public static int c(String string, int n2, int n3) {
        int n4 = t.b(string, n2, n3);
        if (n4 == -1) {
            return -1;
        }
        int n5 = n3 + (n4 == 0 ? 6 : 7);
        if (n5 >= n2) {
            return -1;
        }
        int n6 = 0;
        for (int i2 = n5; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 < '0' || c2 > '9') {
                return -1;
            }
            n6 = n6 * 10 + c2 - 48;
        }
        return n6;
    }

    public static int[] d(String string, int n2, int n3) {
        e e2 = rs.l.f.e.d();
        if (e2 == null || rs.l.b.a.a()) {
            return g;
        }
        long l2 = string.hashCode();
        l2 = l2 * 31L + (long)n2;
        l2 = l2 * 31L + (long)n3;
        long l3 = System.nanoTime() / 1000000L;
        Long l4 = i.get(l2);
        if (l4 != null && l3 - l4 < 50L) {
            return g;
        }
        i.put(l2, l3);
        int n4 = t.a(string);
        int n5 = Math.min(3, n4);
        int[] nArray = new int[n5];
        for (int i2 = 0; i2 < n5; ++i2) {
            int n6;
            boolean bl;
            block1: do {
                n6 = Client.d(n4 - 1);
                bl = false;
                for (int i3 = 0; i3 < i2; ++i3) {
                    if (nArray[i3] != n6) continue;
                    bl = true;
                    continue block1;
                }
            } while (bl);
            nArray[i2] = n6;
        }
        Arrays.sort(nArray);
        return nArray;
    }

    private static int a(String string) {
        int n2 = 0;
        int n3 = -1;
        int n4 = 0;
        while (n4 < string.length()) {
            int n5;
            int n6;
            if (string.charAt(n4) == '@') {
                n6 = t.a(string, n4);
                if (n6 != -1) {
                    n3 = n6;
                    n4 += n6 == 0 ? 5 : 6;
                    continue;
                }
                n5 = string.indexOf(64, n4 + 1);
                if (n5 > n4 && n5 - n4 <= 6) {
                    n4 = n5 + 1;
                    continue;
                }
            }
            if (string.charAt(n4) == '<' && (n6 = string.indexOf(62, n4 + 1)) != -1) {
                n5 = t.a(string, n6, n4);
                if (n5 != -1) {
                    n3 = n5 == -2 ? -1 : n5;
                } else if (t.b(string, n6, n4) != -1) {
                    ++n2;
                }
                n4 = n6 + 1;
                continue;
            }
            if (n3 != -1 && !Character.isWhitespace(string.charAt(n4))) {
                ++n2;
            }
            ++n4;
        }
        return n2;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        e e2 = rs.l.f.e.d();
        if (e2 == null || n4 <= 0 || n5 <= 0 || n2 >= rs.l.c.m || n2 + n4 <= rs.l.c.l || n3 >= rs.l.c.k || n3 + n5 <= rs.l.c.j) {
            return;
        }
        int n7 = n2 + Client.d(Math.max(0, n4 - 1));
        int n8 = n3 + Client.d(Math.max(0, n5 - 1));
        a a2 = new a(n7, n8, t.a(n6));
        a2.a(Client.d(1) == 0 ? rs.l.f.a.f.b.b : rs.l.f.a.f.b.a);
        a2.b(Client.d(1) == 0 ? -0.075 : 0.075);
        a2.a((double)(1 + Client.d(25)));
        int n9 = Client.d(4) == 0 ? 3 : 2;
        a2.b(n9, n9);
        a2.e(1);
        a2.i(220);
        a2.b(250L + 100L * (long)Client.d(3));
        e2.g().a(a2);
    }

    private static int a(int n2) {
        if ((n2 & 0x1000000) != 0) {
            return n2 & 0xFFFFFF;
        }
        int n3 = Math.max(0, Math.min(h.length - 1, n2));
        int[] nArray = h[n3];
        return nArray[Client.d(nArray.length - 1)];
    }

    private static int e(String string, int n2, int n3) {
        if (n2 >= n3) {
            return -1;
        }
        int n4 = n3 - n2 >= 6 ? 16 : 10;
        int n5 = 0;
        for (int i2 = n2; i2 < n3; ++i2) {
            int n6 = Character.digit(string.charAt(i2), n4);
            if (n6 == -1) {
                return -1;
            }
            if ((n5 = n5 * n4 + n6) <= 0xFFFFFF) continue;
            return -1;
        }
        return n5;
    }

    private static boolean a(String string, int n2, String string2) {
        return n2 >= 0 && n2 + string2.length() <= string.length() && string.regionMatches(n2, string2, 0, string2.length());
    }
}

