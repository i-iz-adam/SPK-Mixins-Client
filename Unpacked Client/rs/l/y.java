/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.l.o;
import rs.l.z;

public final class y {
    private static final String a = "</timg>";
    private static final int b = 256;
    private static final String[] c = new String[256];
    private static final int[] d = new int[256];
    private static final int[] e = new int[256];
    private static final a[] f = new a[256];

    private y() {
    }

    public static a a(String string, int n2, int n3) {
        if (string == null || n3 <= n2 + 6 || string.charAt(n2 + 1) != 't' || string.charAt(n2 + 2) != 'i' || string.charAt(n2 + 3) != 'm' || string.charAt(n2 + 4) != 'g' || string.charAt(n2 + 5) != '=') {
            return null;
        }
        int n4 = System.identityHashCode(string) * 31 + n2 * 17 + n3 & 0xFF;
        if (c[n4] == string && d[n4] == n2 && e[n4] == n3) {
            return f[n4];
        }
        o.a a2 = o.b(string, n2 + 6, n3);
        if (a2 == null) {
            return null;
        }
        int n5 = string.indexOf(a, n3 + 1);
        if (n5 == -1) {
            return null;
        }
        a a3 = new a(a2, string.substring(n3 + 1, n5), n5 + a.length() - 1, null);
        y.c[n4] = string;
        y.d[n4] = n2;
        y.e[n4] = n3;
        y.f[n4] = a3;
        return a3;
    }

    public static final class a {
        public final int a;
        public final int b;
        final o.a c;
        public final String d;
        public final int e;

        private a(o.a a2, String string, int n2) {
            this.c = a2;
            this.a = a2.a;
            this.b = a2.b;
            this.d = string;
            this.e = n2;
        }

        /* synthetic */ a(o.a a2, String string, int n2, z z2) {
            this(a2, string, n2);
        }
    }
}

