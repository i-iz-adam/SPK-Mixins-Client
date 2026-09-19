/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.l.h;

public class x {
    private static final x a = new x();
    private a b;
    private int c;

    public static x a(String string) {
        a.c();
        int n2 = -1;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '<') {
                n2 = i2;
                continue;
            }
            if (n2 != -1) {
                a.a(string, n2, i2);
                a.b(string, n2, i2);
            }
            if (c2 != '>' || n2 == -1 || i2 <= n2 + 5 || string.charAt(n2 + 1) != 'a' || string.charAt(n2 + 2) != 'l' || string.charAt(n2 + 3) != 'i' || string.charAt(n2 + 4) != 'g' || string.charAt(n2 + 5) != 'n') continue;
            a.a(rs.l.x$a.a);
        }
        return a;
    }

    public a a() {
        return this.b;
    }

    public void a(a a2) {
        this.b = a2;
    }

    public int b() {
        return this.c;
    }

    public void a(int n2) {
        this.c = n2;
    }

    public void c() {
        this.b = null;
        this.c = -1;
    }

    public boolean a(String string, int n2, int n3) {
        char c2 = string.charAt(n3);
        if (c2 == '>' && n3 > n2 + 5 && string.charAt(n2 + 1) == 'a' && string.charAt(n2 + 2) == 'l' && string.charAt(n2 + 3) == 'i' && string.charAt(n2 + 4) == 'g' && string.charAt(n2 + 5) == 'n') {
            this.a(rs.l.x$a.a);
            return true;
        }
        return false;
    }

    public boolean b(String string, int n2, int n3) {
        char c2 = string.charAt(n3);
        if (c2 == '>' && n3 > n2 + 4 && string.charAt(n2 + 1) == 'h' && string.charAt(n2 + 2) == 'o' && string.charAt(n2 + 3) == 'v' && string.charAt(n2 + 4) == '=') {
            int n4 = 0;
            boolean bl = n3 - (n2 + 4 + 1) >= 6;
            for (int i2 = n2 + 4 + 1; i2 < n3; ++i2) {
                n4 = bl ? h.a(n4, string.charAt(i2), 16) : h.a(n4, string.charAt(i2));
            }
            this.a(n4);
            return true;
        }
        return false;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = rs.l.x$a.a();
        }
    }
}

