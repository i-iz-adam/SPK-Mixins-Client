/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

public final class l {
    static final int a = -11;
    static final int b = -12;
    private static final String d = "@fla@";
    private static final String e = "@fla2@";
    private static final String f = "<fla>";
    private static final String g = "<fla2>";
    private static final String h = "<fla=";
    private static final String i = "<fla2=";
    private static final String j = "</fla>";
    private static final String k = "</fla2>";
    static final int c = 65535;
    private static final long l = 200L;
    private static final long m = 600L;
    private static final long n = 1200L;
    private long o;
    private long p;
    private boolean q;
    private boolean r;

    public String a(String string) {
        if (string == null || !rs.l.l.e(string)) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length());
        int n2 = 0;
        while (n2 < string.length()) {
            int n3;
            if (string.startsWith(d, n2)) {
                n2 += d.length();
                continue;
            }
            if (string.startsWith(e, n2)) {
                n2 += e.length();
                continue;
            }
            if (string.startsWith(f, n2)) {
                n2 += f.length();
                continue;
            }
            if (string.startsWith(g, n2)) {
                n2 += g.length();
                continue;
            }
            if (string.startsWith(j, n2)) {
                n2 += j.length();
                continue;
            }
            if (string.startsWith(k, n2)) {
                n2 += k.length();
                continue;
            }
            if (string.startsWith(h, n2)) {
                n3 = string.indexOf(62, n2 + h.length());
                if (n3 == -1) {
                    stringBuilder.append(string.charAt(n2++));
                    continue;
                }
                n2 = n3 + 1;
                continue;
            }
            if (string.startsWith(i, n2)) {
                n3 = string.indexOf(62, n2 + i.length());
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
        if (string == null || !rs.l.l.d(string)) {
            return string;
        }
        long l2 = rs.l.l.c();
        boolean bl2 = false;
        boolean bl3 = false;
        StringBuilder stringBuilder = new StringBuilder(string.length() + 24);
        int n2 = 0;
        while (n2 < string.length()) {
            int n3;
            int n4;
            if (string.startsWith(d, n2)) {
                rs.l.l.a(stringBuilder, 65535, l2);
                n2 += d.length();
                bl2 = true;
                continue;
            }
            if (string.startsWith(e, n2)) {
                rs.l.l.b(stringBuilder, 65535, l2);
                n2 += e.length();
                bl2 = true;
                bl3 = true;
                continue;
            }
            if (string.startsWith(f, n2)) {
                rs.l.l.a(stringBuilder, 65535, l2);
                n2 += f.length();
                bl2 = true;
                continue;
            }
            if (string.startsWith(g, n2)) {
                rs.l.l.b(stringBuilder, 65535, l2);
                n2 += g.length();
                bl2 = true;
                bl3 = true;
                continue;
            }
            if (string.startsWith(h, n2)) {
                n4 = n2 + h.length();
                n3 = string.indexOf(62, n4);
                if (n3 != -1 && rs.l.l.c(string, n4, n3)) {
                    stringBuilder.append(h).append(string, n4, n3).append(':').append(l2).append('>');
                    n2 = n3 + 1;
                    bl2 = true;
                    continue;
                }
                stringBuilder.append(string.charAt(n2++));
                continue;
            }
            if (string.startsWith(i, n2)) {
                n4 = n2 + i.length();
                n3 = string.indexOf(62, n4);
                if (n3 != -1 && rs.l.l.c(string, n4, n3)) {
                    stringBuilder.append(i).append(string, n4, n3).append(':').append(l2).append('>');
                    n2 = n3 + 1;
                    bl2 = true;
                    bl3 = true;
                    continue;
                }
                stringBuilder.append(string.charAt(n2++));
                continue;
            }
            stringBuilder.append(string.charAt(n2++));
        }
        if (!bl2) {
            return string;
        }
        if (bl) {
            this.p = l2 + (bl3 ? 1200L : 600L);
            this.r = true;
        }
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, int n2, long l2) {
        stringBuilder.append(h).append(n2).append(':').append(l2).append('>');
    }

    private static void b(StringBuilder stringBuilder, int n2, long l2) {
        stringBuilder.append(i).append(n2).append(':').append(l2).append('>');
    }

    private static boolean d(String string) {
        return string.contains(d) || string.contains(e) || string.contains(f) || string.contains(g) || string.contains(h) || string.contains(i);
    }

    private static boolean e(String string) {
        return rs.l.l.d(string) || string.contains(j) || string.contains(k);
    }

    private static boolean c(String string, int n2, int n3) {
        if (n2 == n3) {
            return false;
        }
        int n4 = n3 - n2 >= 6 ? 16 : 10;
        for (int i2 = n2; i2 < n3; ++i2) {
            if (Character.digit(string.charAt(i2), n4) != -1) continue;
            return false;
        }
        return true;
    }

    public void a() {
        this.o = rs.l.l.c();
        this.q = true;
    }

    public int a(int n2) {
        int n3 = rs.l.l.a(this.o, 65535);
        return n3 == -11 ? n2 : n3;
    }

    public boolean b() {
        long l2 = rs.l.l.c();
        if (rs.l.l.a(this.o, l2) || l2 < this.p) {
            return true;
        }
        if (!this.q && !this.r) {
            return false;
        }
        this.q = false;
        this.r = false;
        return true;
    }

    static int a(long l2, int n2) {
        return rs.l.l.a(l2, n2, false);
    }

    static int a(long l2, int n2, boolean bl) {
        long l3 = rs.l.l.c();
        if (!rs.l.l.a(l2, l3, bl ? 1200L : 600L)) {
            return -11;
        }
        long l4 = (l3 - l2) / 200L;
        return l4 % 2L == 0L ? n2 : -11;
    }

    static boolean a(String string, int n2, int n3) {
        return n2 > n3 + 6 && string.charAt(n3 + 1) == 'f' && string.charAt(n3 + 2) == 'l' && string.charAt(n3 + 3) == 'a' && string.charAt(n3 + 4) == '2' && string.charAt(n3 + 5) == '=';
    }

    static long b(String string, int n2, int n3) {
        int n4;
        for (n4 = n3 + 6; n4 < n2 && string.charAt(n4) != ':'; ++n4) {
        }
        if (n4 == n2 || n4 + 1 == n2) {
            return 0L;
        }
        long l2 = 0L;
        for (int i2 = n4 + 1; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 < '0' || c2 > '9') {
                return 0L;
            }
            l2 = l2 * 10L + (long)c2 - 48L;
        }
        return l2;
    }

    static int b(long l2, int n2) {
        long l3 = rs.l.l.c();
        if (!rs.l.l.a(l2, l3, 1200L)) {
            return 0;
        }
        long l4 = l3 - l2;
        double d2 = 5.0;
        if (l4 > 600L) {
            d2 *= (double)(1200L - l4) / 600.0;
        }
        return (int)Math.round(Math.sin((double)n2 / 2.0 + (double)l4 / 100.0) * d2);
    }

    private static boolean a(long l2, long l3) {
        return rs.l.l.a(l2, l3, 600L);
    }

    private static boolean a(long l2, long l3, long l4) {
        long l5 = l3 - l2;
        return l2 != 0L && l5 >= 0L && l5 < l4;
    }

    private static long c() {
        return System.nanoTime() / 1000000L;
    }
}

