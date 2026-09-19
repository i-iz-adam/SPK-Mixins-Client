/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

/*
 * Renamed from rs.l.A
 */
public final class a_0 {
    public static final int a = -1;
    public static final int b = -2;
    private static final String c = "@type@";
    private static final String d = "<type>";
    private static final String e = "<type=";
    private static final String f = "</type>";
    private static final int g = 75;
    private static final int h = 10;
    private static final int i = 2000;
    private long j;
    private boolean k;

    public String a(String string) {
        if (string == null || !a_0.e(string)) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length());
        int n2 = 0;
        while (n2 < string.length()) {
            if (string.startsWith(c, n2)) {
                n2 += c.length();
                continue;
            }
            if (string.startsWith(d, n2)) {
                n2 += d.length();
                continue;
            }
            if (string.startsWith(f, n2)) {
                n2 += f.length();
                continue;
            }
            if (string.startsWith(e, n2)) {
                int n3 = string.indexOf(62, n2 + e.length());
                if (n3 == -1) {
                    stringBuilder.append(string.charAt(n2++));
                    continue;
                }
                n2 = n3 + 1;
                continue;
            }
            stringBuilder.append(string.charAt(n2++));
        }
        return stringBuilder.toString();
    }

    public String b(String string) {
        return this.a(string, true);
    }

    public String c(String string) {
        return this.a(string, false);
    }

    private String a(String string, boolean bl) {
        if (string == null || !a_0.d(string)) {
            return string;
        }
        long l2 = a_0.b();
        int n2 = 0;
        boolean bl2 = false;
        StringBuilder stringBuilder = new StringBuilder(string.length() + 24);
        int n3 = 0;
        while (n3 < string.length()) {
            if (string.startsWith(c, n3)) {
                a_0.a(stringBuilder, 75, l2);
                n2 = Math.max(n2, 75);
                n3 += c.length();
                bl2 = true;
                continue;
            }
            if (string.startsWith(d, n3)) {
                a_0.a(stringBuilder, 75, l2);
                n2 = Math.max(n2, 75);
                n3 += d.length();
                bl2 = true;
                continue;
            }
            if (string.startsWith(e, n3)) {
                int n4;
                int n5 = n3 + e.length();
                int n6 = a_0.c(string, n5, n4 = string.indexOf(62, n5));
                if (n6 != -1) {
                    n6 = Math.max(10, Math.min(2000, n6));
                    a_0.a(stringBuilder, n6, l2);
                    n2 = Math.max(n2, n6);
                    n3 = n4 + 1;
                    bl2 = true;
                    continue;
                }
                stringBuilder.append(string.charAt(n3++));
                continue;
            }
            stringBuilder.append(string.charAt(n3++));
        }
        if (!bl2) {
            return string;
        }
        if (bl) {
            this.j = l2 + (long)n2 * (long)a_0.f(string);
            this.k = true;
        }
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, int n2, long l2) {
        stringBuilder.append(e).append(n2).append(':').append(l2).append('>');
    }

    public static int a(String string, int n2, int n3) {
        int n4;
        if (n2 - n3 == 6 && string.charAt(n3 + 1) == '/' && string.charAt(n3 + 2) == 't' && string.charAt(n3 + 3) == 'y' && string.charAt(n3 + 4) == 'p' && string.charAt(n3 + 5) == 'e') {
            return -2;
        }
        if (n2 - n3 <= 7 || string.charAt(n3 + 1) != 't' || string.charAt(n3 + 2) != 'y' || string.charAt(n3 + 3) != 'p' || string.charAt(n3 + 4) != 'e' || string.charAt(n3 + 5) != '=') {
            return -1;
        }
        for (n4 = n3 + 6; n4 < n2 && string.charAt(n4) != ':'; ++n4) {
        }
        int n5 = a_0.c(string, n3 + 6, n4);
        if (n5 == -1 || n4 == n2) {
            return -1;
        }
        long l2 = a_0.d(string, n4 + 1, n2);
        if (l2 == 0L) {
            return -1;
        }
        long l3 = Math.max(0L, a_0.b() - l2);
        return (int)Math.min(Integer.MAX_VALUE, l3 / (long)n5 + 1L);
    }

    public static boolean b(String string, int n2, int n3) {
        if (n2 - n3 == 5 && string.charAt(n3 + 1) == 't' && string.charAt(n3 + 2) == 'y' && string.charAt(n3 + 3) == 'p' && string.charAt(n3 + 4) == 'e') {
            return true;
        }
        return a_0.a(string, n2, n3) != -1;
    }

    public boolean a() {
        long l2 = a_0.b();
        if (l2 < this.j) {
            return true;
        }
        if (!this.k) {
            return false;
        }
        this.k = false;
        return true;
    }

    private static boolean d(String string) {
        return string.contains(c) || string.contains(d) || string.contains(e);
    }

    private static boolean e(String string) {
        return a_0.d(string) || string.contains(f);
    }

    private static int f(String string) {
        int n2 = 0;
        boolean bl = false;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '<') {
                bl = true;
                continue;
            }
            if (c2 == '>' && bl) {
                bl = false;
                continue;
            }
            if (bl) continue;
            if (string.startsWith(c, i2)) {
                i2 += c.length() - 1;
                continue;
            }
            if (c2 == '@' && i2 + 4 < string.length() && string.charAt(i2 + 4) == '@') {
                i2 += 4;
                continue;
            }
            ++n2;
        }
        return Math.max(1, n2);
    }

    private static int c(String string, int n2, int n3) {
        if (n3 <= n2) {
            return -1;
        }
        int n4 = 0;
        for (int i2 = n2; i2 < n3; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 < '0' || c2 > '9') {
                return -1;
            }
            if ((n4 = n4 * 10 + c2 - 48) <= 2000) continue;
            return 2000;
        }
        return n4 <= 0 ? -1 : n4;
    }

    private static long d(String string, int n2, int n3) {
        if (n3 <= n2) {
            return 0L;
        }
        long l2 = 0L;
        for (int i2 = n2; i2 < n3; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 < '0' || c2 > '9') {
                return 0L;
            }
            l2 = l2 * 10L + (long)c2 - 48L;
        }
        return l2;
    }

    private static long b() {
        return System.nanoTime() / 1000000L;
    }
}

