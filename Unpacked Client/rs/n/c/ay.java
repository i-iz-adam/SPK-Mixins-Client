/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.Client;
import rs.l.c;
import rs.l.f.a.f.b;
import rs.l.f.b.d;
import rs.n.e;

public class ay
extends d {
    public static final int h = 457;
    public static final int i = 15;
    public static int j = 0;
    public static int k = 0;
    private long m = 0L;
    private boolean n = false;
    private int o = 0;
    private int p = 0;
    private int q = 0;
    private int r = 0;
    public static a[] l = new a[]{rs.n.c.ay$a.a, null, null};

    @Override
    public void a() {
        if (System.currentTimeMillis() - this.m > 25L) {
            this.n = true;
            this.m = System.currentTimeMillis();
        } else {
            this.n = false;
        }
        if (j > 0) {
            this.b(this.e, 0xFFF700, j);
        }
        if (k - j > 0) {
            this.b(this.e + j, 9109758, k - j);
        }
        e e2 = rs.n.e.H[60249];
        if (Client.br == 60249) {
            if (this.n) {
                this.b(e2.bB + 5, e2.bC + 5, e2.P - 5, e2.aR - 5, 1, 0xFFF700, 0xFFF700);
            }
        } else {
            this.o = 1;
        }
        e e3 = rs.n.e.H[60251];
        if (this.n) {
            for (int i2 = 0; i2 < l.length; ++i2) {
                a a2 = l[i2];
                if (a2 == null) continue;
                int n2 = 111;
                if (i2 == 1) {
                    n2 = 210;
                }
                if (i2 == 2) {
                    n2 = 300;
                }
                this.b(this.e + 335, n2 + (this.f - 375), a2.c, a2.d, a2.e, a2.f, a2.g);
            }
        }
    }

    private void b(int n2, int n3, int n4) {
        rs.l.c.d(n2, this.f + 1, n4, 13, n3, 125);
        if (this.n) {
            this.b(n2, this.f, n4, 15, 3, n3, n3);
        }
    }

    private void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n6 <= 1 && Client.d(3) == 0) {
            return;
        }
        int n9 = Math.min(n6 - 1, 4);
        n9 = Math.max(n9, 1);
        for (int i2 = 0; i2 < n9; ++i2) {
            int n10 = Client.c(n2, n2 + n4);
            int n11 = Client.c(n3, n3 + n5);
            int n12 = n7;
            if (Client.d(6) == 0) {
                n12 = n8;
            }
            rs.l.f.a.f.a a2 = this.c(n10, n11, n12);
            if (n6 < 3) {
                a2.b(-0.075);
            } else {
                a2.b(i2 % 2 == 0 ? -0.075 : 0.075);
            }
            rs.l.f.e.d().g().a(a2);
        }
    }

    private rs.l.f.a.f.a c(int n2, int n3, int n4) {
        rs.l.f.a.f.a a2 = new rs.l.f.a.f.a(n2, n3, n4);
        a2.a(rs.l.f.a.f.b.a);
        a2.a((double)(1 + Client.d(25)));
        a2.b(3, 3);
        a2.e(1);
        a2.b(250L + 100L * (long)Client.d(3));
        return a2;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(311, 44, 1, 0xFFF700, 0xFFF700);
        public static final /* enum */ a b = new a(311, 44, 2, 0xFF00FF, 9765119);
        final int c;
        final int d;
        final int e;
        final int f;
        final int g;
        private static final /* synthetic */ a[] h;

        public static a[] values() {
            return (a[])h.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private a(int n3, int n4, int n5, int n6, int n7) {
            this.c = n3;
            this.d = n4;
            this.e = n5;
            this.f = n6;
            this.g = n7;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            h = rs.n.c.ay$a.a();
        }
    }
}

