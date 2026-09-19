/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.Client;
import rs.l.f.e;
import rs.l.r;

public final class q {
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 3;
    static final int e = 4;
    private static final int f = 256;
    private static final a[] g = q.e();
    private static final a[] h = q.e();
    private static int i;
    private static int j;
    private static boolean k;
    private static boolean l;
    private static int m;
    private static a n;

    private q() {
    }

    private static a[] e() {
        a[] aArray = new a[256];
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            aArray[i2] = new a(null);
        }
        return aArray;
    }

    static int a(String string, int n2, int n3) {
        if (q.b(string, n2, n3, "</link>")) {
            return 2;
        }
        if (q.b(string, n2, n3, "</tool>")) {
            return 4;
        }
        if (q.a(string, n2, n3, "<link=")) {
            return 1;
        }
        if (q.a(string, n2, n3, "<tool=")) {
            return 3;
        }
        return 0;
    }

    static int a(int n2) {
        return n2 + 6;
    }

    static boolean a(String string, int n2, int n3, int n4, int n5, int n6, int n7) {
        return q.a(string, n2, n3, n4, n5, n6, n7, true);
    }

    static boolean b(String string, int n2, int n3, int n4, int n5, int n6, int n7) {
        return q.a(string, n2, n3, n4, n5, n6, n7, false);
    }

    private static boolean a(String string, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        int n8;
        if (string == null || n3 <= n2 || n6 <= n4 || n7 <= n5) {
            return false;
        }
        a[] aArray = k ? g : h;
        int n9 = n8 = k ? i : j;
        if (n8 >= 256) {
            return false;
        }
        a a2 = aArray[n8];
        a2.a(string, n2, n3, n4, n5, n6, n7, bl);
        if (k) {
            ++i;
        } else {
            ++j;
        }
        return a2.a(Client.hP, Client.hQ);
    }

    public static void a(boolean bl) {
        j = 0;
        n = null;
        l = bl;
    }

    public static void a() {
        k = true;
        i = 0;
    }

    public static void b() {
        k = false;
    }

    public static boolean c() {
        int n2 = l ? q.a(g, i, Client.hP, Client.hQ) : -1;
        boolean bl = n2 != m;
        m = n2;
        n = q.b(h, j, Client.hP, Client.hQ);
        if (n == null && l) {
            n = q.b(g, i, Client.hP, Client.hQ);
        }
        return bl;
    }

    public static void d() {
        n = q.b(h, j, Client.hP, Client.hQ);
        if (n == null && l) {
            n = q.b(g, i, Client.hP, Client.hQ);
        }
        if (n != null && n.i != null) {
            rs.l.f.e.d().f().a(n.i);
        }
    }

    public static boolean a(Client client, int n2, int n3) {
        a a2 = q.c(h, j, n2, n3);
        if (a2 == null && l) {
            a2 = q.c(g, i, n2, n3);
        }
        if (a2 == null) {
            return false;
        }
        String string = a2.a.substring(a2.b, a2.c);
        return client.c(string);
    }

    private static int a(a[] aArray, int n2, int n3, int n4) {
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            if (!aArray[i2].h || !aArray[i2].a(n3, n4)) continue;
            return i2;
        }
        return -1;
    }

    private static a b(a[] aArray, int n2, int n3, int n4) {
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            if (aArray[i2].h || !aArray[i2].a(n3, n4)) continue;
            return aArray[i2];
        }
        return null;
    }

    private static a c(a[] aArray, int n2, int n3, int n4) {
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            if (!aArray[i2].h || !aArray[i2].a(n3, n4)) continue;
            return aArray[i2];
        }
        return null;
    }

    private static boolean a(String string, int n2, int n3, String string2) {
        if (n3 - n2 < string2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            if (string.charAt(n2 + i2) == string2.charAt(i2)) continue;
            return false;
        }
        return true;
    }

    private static boolean b(String string, int n2, int n3, String string2) {
        if (n3 - n2 + 1 != string2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            if (string.charAt(n2 + i2) == string2.charAt(i2)) continue;
            return false;
        }
        return true;
    }

    static {
        l = true;
        m = -1;
    }

    private static final class a {
        private String a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private boolean h;
        private rs.l.f.a.j.a i;

        private a() {
        }

        private void a(String string, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
            boolean bl2 = this.a != string || this.b != n2 || this.c != n3 || this.h != bl;
            this.a = string;
            this.b = n2;
            this.c = n3;
            this.d = n4;
            this.e = n5;
            this.f = n6;
            this.g = n7;
            this.h = bl;
            if (bl) {
                this.i = null;
            } else if (bl2) {
                this.i = new rs.l.f.a.j.a(string.substring(n2, Math.min(n3, n2 + 240)), false);
            }
        }

        private boolean a(int n2, int n3) {
            return n2 >= this.d && n2 < this.f && n3 >= this.e && n3 < this.g;
        }

        /* synthetic */ a(r r2) {
            this();
        }
    }
}

