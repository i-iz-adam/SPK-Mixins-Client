/*
 * Decompiled with CFR 0.152.
 */
package rs.a.a;

import java.util.HashMap;
import rs.a.d;
import rs.f_0;
import rs.s_0;

public class a
extends rs.a {
    public HashMap<b, Object> f;
    public int g;
    public int h;
    public s_0 i;
    public s_0 j;
    public d k;
    public int[][] l;
    public int[][] m;
    public transient float[] n;
    public boolean o = true;
    public boolean p = false;
    private long q = System.currentTimeMillis();
    private boolean r;

    public static a a(f_0 f_02, int n2) {
        if (f_02.a(n2) == null) {
            return new a(true);
        }
        return (a)f_02.a(n2);
    }

    public a(boolean bl) {
        if (bl) {
            this.f = new HashMap();
        }
    }

    public d a(int n2) {
        if (!this.f() || this.k == null || this.k.a() != n2) {
            this.k = new d(n2);
        } else if (this.p) {
            for (int i2 = 0; i2 < n2; ++i2) {
                this.k.a(i2, 0);
                this.k.b(i2, 0);
                this.k.c(i2, 0);
            }
        }
        return this.k;
    }

    public s_0 b(int n2) {
        if (!this.f() || this.i == null || this.i.a() != n2) {
            this.i = new s_0(n2);
        } else if (this.p) {
            for (int i2 = 0; i2 < n2; ++i2) {
                this.i.a(i2, 0);
                this.i.b(i2, 0);
                this.i.c(i2, 0);
                this.i.d(i2, 0);
            }
        }
        return this.i;
    }

    public s_0 c(int n2) {
        if (!this.f() || this.j == null || this.j.a() != n2) {
            this.j = new s_0(n2);
        } else if (this.p) {
            for (int i2 = 0; i2 < n2; ++i2) {
                this.j.a(i2, 0);
                this.j.b(i2, 0);
                this.j.c(i2, 0);
                this.j.d(i2, 0);
            }
        }
        return this.j;
    }

    public void c() {
        this.n = new float[this.h * 6];
    }

    public int[] a(b b2) {
        if (this.f != null && this.f.containsKey((Object)b2) && b2.s == rs.a.a.a$c.a) {
            return (int[])this.f.get((Object)b2);
        }
        return new int[this.a(b2.r)];
    }

    public boolean[] b(b b2) {
        if (this.f != null && this.f.containsKey((Object)b2) && b2.s == rs.a.a.a$c.b) {
            return (boolean[])this.f.get((Object)b2);
        }
        return new boolean[this.a(b2.r)];
    }

    public byte[] c(b b2) {
        if (this.f != null && this.f.containsKey((Object)b2) && b2.s == rs.a.a.a$c.c) {
            return (byte[])this.f.get((Object)b2);
        }
        return new byte[this.a(b2.r)];
    }

    public void d() {
        if (this.f == null) {
            return;
        }
        int n2 = this.a(rs.a.a.a$a.a);
        int n3 = this.a(rs.a.a.a$a.b);
        for (int i2 = 0; i2 < Math.max(n2, n3); ++i2) {
            if (i2 < n2) {
                this.d(i2);
            }
            if (i2 >= n3) continue;
            this.e(i2);
        }
    }

    public void d(int n2) {
        if (this.f == null) {
            return;
        }
        this.a(rs.a.a.a$b.j, n2);
        this.a(rs.a.a.a$b.d, n2);
        this.a(rs.a.a.a$b.e, n2);
        this.a(rs.a.a.a$b.f, n2);
        this.a(rs.a.a.a$b.a, n2);
        this.a(rs.a.a.a$b.b, n2);
        this.a(rs.a.a.a$b.c, n2);
        this.a(rs.a.a.a$b.i, n2);
        this.a(rs.a.a.a$b.h, n2);
        this.a(rs.a.a.a$b.g, n2);
        this.a(rs.a.a.a$b.k, n2);
    }

    public void e(int n2) {
        this.a(rs.a.a.a$b.l, n2);
        this.a(rs.a.a.a$b.p, n2);
        this.a(rs.a.a.a$b.q, n2);
        this.a(rs.a.a.a$b.m, n2);
        this.a(rs.a.a.a$b.n, n2);
        this.a(rs.a.a.a$b.o, n2);
    }

    public void e() {
        this.a(rs.a.a.a$a.a, rs.a.a.a$b.j);
        this.a(rs.a.a.a$a.a, rs.a.a.a$b.d);
        this.a(rs.a.a.a$a.a, rs.a.a.a$b.e);
        this.a(rs.a.a.a$a.a, rs.a.a.a$b.f);
        this.a(rs.a.a.a$a.a, rs.a.a.a$b.a);
        this.a(rs.a.a.a$a.a, rs.a.a.a$b.b);
        this.a(rs.a.a.a$a.a, rs.a.a.a$b.c);
        this.a(rs.a.a.a$a.a, rs.a.a.a$b.i);
        this.a(rs.a.a.a$a.a, rs.a.a.a$b.h);
        this.a(rs.a.a.a$a.a, rs.a.a.a$b.g);
        this.a(rs.a.a.a$a.a, rs.a.a.a$b.k);
        this.a(rs.a.a.a$a.b, rs.a.a.a$b.l);
        this.a(rs.a.a.a$a.b, rs.a.a.a$b.p);
        this.a(rs.a.a.a$a.b, rs.a.a.a$b.q);
        this.a(rs.a.a.a$a.b, rs.a.a.a$b.m);
        this.a(rs.a.a.a$a.b, rs.a.a.a$b.n);
        this.a(rs.a.a.a$a.b, rs.a.a.a$b.o);
    }

    public void a(a a2, b b2) {
        if (this.f == null || !this.f()) {
            return;
        }
        if (!this.f.containsKey((Object)b2)) {
            this.f.put(b2, new int[this.a(a2)]);
        }
    }

    public void b(a a2, b b2) {
        if (this.f == null) {
            return;
        }
        if (!this.f.containsKey((Object)b2)) {
            int n2 = this.a(a2);
            switch (b2.s) {
                case a: {
                    this.f.put(b2, new int[n2]);
                    break;
                }
                case b: {
                    this.f.put(b2, new boolean[n2]);
                    break;
                }
                case c: {
                    this.f.put(b2, new byte[n2]);
                }
            }
        } else {
            block10: for (int i2 = 0; i2 < this.a(a2); ++i2) {
                switch (b2.s) {
                    case a: {
                        ((int[])this.f.get((Object)((Object)b2)))[i2] = 0;
                        continue block10;
                    }
                    case b: {
                        ((boolean[])this.f.get((Object)((Object)b2)))[i2] = false;
                        continue block10;
                    }
                    case c: {
                        ((byte[])this.f.get((Object)((Object)b2)))[i2] = 0;
                    }
                }
            }
        }
    }

    private void a(b b2, int n2) {
        if (!this.f.containsKey((Object)b2)) {
            return;
        }
        switch (b2.s) {
            case a: {
                ((int[])this.f.get((Object)((Object)b2)))[n2] = 0;
                break;
            }
            case b: {
                ((boolean[])this.f.get((Object)((Object)b2)))[n2] = false;
                break;
            }
            case c: {
                ((byte[])this.f.get((Object)((Object)b2)))[n2] = 0;
            }
        }
    }

    public void a(int n2, int n3) {
        if (this.g != n3 || this.h != n2) {
            this.g = n3;
            this.h = n2;
            if (this.f()) {
                this.h();
            }
        }
    }

    public void b(int n2, int n3) {
        this.g = n3;
        this.h = n2;
    }

    public boolean f() {
        return this.f != null;
    }

    public boolean g() {
        return System.currentTimeMillis() - this.q <= 1000L;
    }

    private void h() {
        if (this.f == null) {
            return;
        }
        this.f.clear();
        this.n = null;
        this.i = null;
        this.j = null;
    }

    private int a(a a2) {
        switch (a2) {
            case a: {
                return this.h;
            }
            case b: {
                return this.g;
            }
        }
        return 0;
    }

    public void a(boolean bl) {
        this.r = bl;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(rs.a.a.a$a.a);
        public static final /* enum */ b b = new b(rs.a.a.a$a.a);
        public static final /* enum */ b c = new b(rs.a.a.a$a.a);
        public static final /* enum */ b d = new b(rs.a.a.a$a.a);
        public static final /* enum */ b e = new b(rs.a.a.a$a.a);
        public static final /* enum */ b f = new b(rs.a.a.a$a.a);
        public static final /* enum */ b g = new b(rs.a.a.a$a.a);
        public static final /* enum */ b h = new b(rs.a.a.a$a.a);
        public static final /* enum */ b i = new b(rs.a.a.a$a.a);
        public static final /* enum */ b j = new b(rs.a.a.a$a.a);
        public static final /* enum */ b k = new b(rs.a.a.a$a.a);
        public static final /* enum */ b l = new b(rs.a.a.a$a.b);
        public static final /* enum */ b m = new b(rs.a.a.a$a.b);
        public static final /* enum */ b n = new b(rs.a.a.a$a.b);
        public static final /* enum */ b o = new b(rs.a.a.a$a.b);
        public static final /* enum */ b p = new b(rs.a.a.a$a.b);
        public static final /* enum */ b q = new b(rs.a.a.a$a.b, rs.a.a.a$c.c);
        a r;
        c s;
        private static final /* synthetic */ b[] t;

        public static b[] values() {
            return (b[])t.clone();
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        private b(a a2) {
            this(a2, rs.a.a.a$c.a);
        }

        private b(a a2, c c2) {
            this.r = a2;
            this.s = c2;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q};
        }

        static {
            t = rs.a.a.a$b.a();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            d = rs.a.a.a$c.a();
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = rs.a.a.a$a.a();
        }
    }
}

