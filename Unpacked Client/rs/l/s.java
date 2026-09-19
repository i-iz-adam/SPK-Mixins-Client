/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

public final class s {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = Integer.MIN_VALUE;
    public static final int g = -2147483647;
    private static final int h = 40;
    private static final double i = 180.0;
    private static volatile long j;
    private static boolean k;

    private s() {
    }

    public static int a(String string, int n2) {
        if (string.startsWith("@hov@", n2)) {
            return 1;
        }
        if (string.startsWith("@shi@", n2)) {
            return 3;
        }
        return 0;
    }

    public static int a(String string, int n2, int n3) {
        int n4 = n2 - n3 - 1;
        if (n4 == 5 && s.a(string, n3 + 1, "hover")) {
            return 1;
        }
        if (n4 == 6 && string.charAt(n3 + 1) == '/' && s.a(string, n3 + 2, "hover")) {
            return 2;
        }
        if (n4 == 5 && s.a(string, n3 + 1, "shift")) {
            return 3;
        }
        if (n4 == 6 && string.charAt(n3 + 1) == '/' && s.a(string, n3 + 2, "shift")) {
            return 4;
        }
        return 0;
    }

    public static int b(String string, int n2, int n3) {
        if (n2 - n3 == 6 && string.charAt(n3 + 1) == '/' && s.a(string, n3 + 2, "lift")) {
            return -2147483647;
        }
        if (n2 <= n3 + 6 || !s.a(string, n3 + 1, "lift=")) {
            return Integer.MIN_VALUE;
        }
        int n4 = n3 + 6;
        boolean bl = false;
        if (string.charAt(n4) == '-' || string.charAt(n4) == '+') {
            bl = string.charAt(n4) == '-';
            ++n4;
        }
        if (n4 >= n2) {
            return Integer.MIN_VALUE;
        }
        int n5 = 0;
        while (n4 < n2) {
            char c2 = string.charAt(n4);
            if (c2 < '0' || c2 > '9') {
                return Integer.MIN_VALUE;
            }
            n5 = Math.min(40, n5 * 10 + c2 - 48);
            ++n4;
        }
        return bl ? -n5 : n5;
    }

    public static int a() {
        return (int)Math.round(Math.sin((double)s.e() / 180.0) * 2.0);
    }

    public static int b() {
        return (int)Math.round(Math.sin((double)s.e() / 180.0) * 3.0);
    }

    public static void c() {
        j = s.e();
        k = true;
    }

    public static boolean d() {
        if (s.e() - j < 100L) {
            return true;
        }
        if (!k) {
            return false;
        }
        k = false;
        return true;
    }

    private static boolean a(String string, int n2, String string2) {
        if (n2 < 0 || n2 + string2.length() > string.length()) {
            return false;
        }
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            if (string.charAt(n2 + i2) == string2.charAt(i2)) continue;
            return false;
        }
        return true;
    }

    private static long e() {
        return System.nanoTime() / 1000000L;
    }
}

