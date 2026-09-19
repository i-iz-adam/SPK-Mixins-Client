/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.l.p;

final class o {
    static final int a = 0xFFFFFF;
    static final int b = 2;
    private static final int c = 256;
    private static final String[] d = new String[256];
    private static final int[] e = new int[256];
    private static final int[] f = new int[256];
    private static final a[] g = new a[256];

    private o() {
    }

    static a a(String string, int n2, int n3) {
        if (string == null || n3 <= n2 + 5 || string.charAt(n2 + 1) != 'i' || string.charAt(n2 + 2) != 'm' || string.charAt(n2 + 3) != 'g' || string.charAt(n2 + 4) != '=') {
            return null;
        }
        return o.b(string, n2 + 5, n3);
    }

    static a b(String string, int n2, int n3) {
        int n4 = System.identityHashCode(string) * 31 + n2 * 17 + n3 & 0xFF;
        if (d[n4] == string && e[n4] == n2 && f[n4] == n3) {
            return g[n4];
        }
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        for (int i2 = n2; i2 < n3; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == ':') {
                if (n11 == 0 || n10 == 4) {
                    return null;
                }
                ++n10;
                n11 = 0;
                continue;
            }
            int n12 = Character.digit(c2, n10 >= 3 ? 16 : 10);
            if (n12 < 0) {
                return null;
            }
            if (n10 == 0) {
                n5 = n5 * 10 + n12;
            } else if (n10 == 1) {
                n6 = n6 * 10 + n12;
            } else if (n10 == 2) {
                n7 = n7 * 10 + n12;
            } else if (n10 == 3) {
                n8 = n8 * 16 + n12;
            } else {
                n9 = n9 * 16 + n12;
            }
            if (++n11 <= 6) continue;
            return null;
        }
        if (n11 == 0 || n5 > 100000 || n6 > 511 || n7 > 99 || n10 >= 3 && n8 > 0xFFFFFF || n10 >= 4 && n9 > 0xFFFFFF) {
            return null;
        }
        a a2 = new a(n5, n6, n7, n10 >= 3 ? n8 : -1, n10 >= 4 ? n9 : 0xFFFFFF, null);
        o.d[n4] = string;
        o.e[n4] = n2;
        o.f[n4] = n3;
        o.g[n4] = a2;
        return a2;
    }

    static final class a {
        final int a;
        final int b;
        final int c;
        final int d;
        final int e;

        private a(int n2, int n3, int n4, int n5, int n6) {
            this.a = n2;
            this.b = n3;
            this.c = n4;
            this.d = n5;
            this.e = n6;
        }

        boolean a() {
            return this.d >= 0;
        }

        int b() {
            return this.a() ? 2 : 0;
        }

        /* synthetic */ a(int n2, int n3, int n4, int n5, int n6, p p2) {
            this(n2, n3, n4, n5, n6);
        }
    }
}

