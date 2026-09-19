/*
 * Decompiled with CFR 0.152.
 */
package rs.m;

public final class a {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 256;
    private final a[] g = rs.m.a.a();
    private int h;
    private int i;
    private long j;

    public static a[] a() {
        a[] aArray = new a[256];
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            aArray[i2] = new a();
        }
        return aArray;
    }

    public synchronized void a(int n2, int n3, int n4, int n5, long l2) {
        if (n2 == 3 && this.i > 0) {
            a a2 = this.g[(this.h + this.i - 1) % this.g.length];
            if (a2.a == 3) {
                a2.c = n4;
                a2.d = n5;
                a2.i = l2;
                a2.e = Math.min(a2.e, n4);
                a2.f = Math.max(a2.f, n4);
                a2.g = Math.min(a2.g, n5);
                a2.h = Math.max(a2.h, n5);
                return;
            }
        }
        if (this.i == this.g.length) {
            ++this.j;
            this.c();
            return;
        }
        this.g[(this.h + this.i++) % this.g.length].a(n2, n3, n4, n5, l2);
    }

    public synchronized void b() {
        this.i = 0;
        this.h = 0;
    }

    public synchronized void c() {
        this.b();
        this.a(4, 0, 0, 0, 0L);
    }

    public synchronized int a(a[] aArray) {
        int n2 = Math.min(this.i, aArray.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            a a2 = this.g[this.h];
            aArray[i2].a(a2.a, a2.b, a2.c, a2.d, a2.i);
            aArray[i2].e = a2.e;
            aArray[i2].f = a2.f;
            aArray[i2].g = a2.g;
            aArray[i2].h = a2.h;
            this.h = (this.h + 1) % this.g.length;
        }
        this.i -= n2;
        return n2;
    }

    public synchronized long d() {
        return this.j;
    }

    public static final class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public long i;

        private void a(int n2, int n3, int n4, int n5, long l2) {
            this.a = n2;
            this.b = n3;
            this.c = n4;
            this.d = n5;
            this.i = l2;
            this.e = this.f = n4;
            this.g = this.h = n5;
        }
    }
}

