/*
 * Decompiled with CFR 0.152.
 */
package rs.d;

import rs.a.h;
import rs.d.d;
import rs.d.r;
import rs.f_0;
import rs.l.c;
import rs.l.e_0;

public class e {
    public static f_0 a = new f_0(20);
    public static f_0 b = new f_0(20);

    public static void a() {
        a.a();
        b.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static rs.l.f_0 a(a a2, int n2, int n3) {
        int n4;
        int n5;
        Object object;
        f_0 f_02 = null;
        switch (a2) {
            case a: {
                f_02 = a;
                break;
            }
            case b: {
                f_02 = b;
            }
        }
        rs.l.f_0 f_03 = (rs.l.f_0)f_02.a(n2);
        if (f_03 != null && f_03.s != n3 && f_03.s != -1) {
            f_03.b();
            f_03 = null;
        }
        if (f_03 != null) {
            return f_03;
        }
        h h2 = null;
        int n6 = 2750;
        int n7 = 40;
        int n8 = 1882;
        boolean bl = false;
        boolean bl2 = false;
        int n9 = 0;
        switch (a2) {
            case a: {
                d d2 = d.c(n2);
                if (d2 == null) {
                    return null;
                }
                h2 = d2.b();
                n9 = 25;
                break;
            }
            case b: {
                r.I = true;
                try {
                    object = r.c(n2);
                    if (object == null) {
                        rs.l.f_0 f_04 = null;
                        return f_04;
                    }
                    h2 = ((r)object).a(10, -1, 0, -1);
                    if (h2 == null) {
                        rs.l.f_0 f_05 = null;
                        return f_05;
                    }
                    n9 = h2.g / 2;
                    break;
                }
                finally {
                    r.I = false;
                }
            }
        }
        if (h2 == null) {
            return null;
        }
        int n10 = n3 > 32 ? n3 : 32;
        object = new rs.l.f_0(n10, n10);
        int n11 = e_0.s;
        int n12 = e_0.t;
        int[] nArray = e_0.x;
        int[] nArray2 = c.g;
        int n13 = c.h;
        int n14 = c.i;
        int n15 = c.l;
        int n16 = c.m;
        int n17 = c.j;
        int n18 = c.k;
        e_0.p = false;
        e_0.q = false;
        c.a(n10, n10, ((rs.l.f_0)object).m, null);
        c.a(0, 0, n10, n10, 0, true);
        e_0.f();
        n6 = (int)Math.floor((float)n6 * (32.0f / (float)n3));
        int n19 = e_0.v[n7] * n6 >> 16;
        int n20 = e_0.w[n7] * n6 >> 16;
        e_0.h = true;
        try {
            if (a2 == rs.d.e$a.a) {
                h2.b(64, 768, -50, -10, -50, true);
            }
            h2.a(n8, 0, n7, 0, n19 + n9, n20 + n9);
        }
        finally {
            e_0.h = false;
        }
        int n21 = n5 = n3 > 32 ? n3 - 1 : 31;
        while (n5 >= 0) {
            int n22 = n4 = n3 > 32 ? n3 - 1 : 31;
            while (n4 >= 0) {
                if (((rs.l.f_0)object).m[n5 + n4 * (n3 > 32 ? n3 : 32)] == 0) {
                    if (n5 > 0 && ((rs.l.f_0)object).m[n5 - 1 + n4 * (n3 > 32 ? n3 : 32)] > 1) {
                        ((rs.l.f_0)object).m[n5 + n4 * (n3 > 32 ? n3 : 32)] = 0;
                    } else if (n4 > 0 && ((rs.l.f_0)object).m[n5 + (n4 - 1) * (n3 > 32 ? n3 : 32)] > 1) {
                        ((rs.l.f_0)object).m[n5 + n4 * (n3 > 32 ? n3 : 32)] = 0;
                    } else if (n5 < (n3 > 32 ? n3 - 1 : 31) && ((rs.l.f_0)object).m[n5 + 1 + n4 * (n3 > 32 ? n3 : 32)] > 1) {
                        ((rs.l.f_0)object).m[n5 + n4 * (n3 > 32 ? n3 : 32)] = 0;
                    } else if (n4 < (n3 > 32 ? n3 - 1 : 31) && ((rs.l.f_0)object).m[n5 + (n4 + 1) * (n3 > 32 ? n3 : 32)] > 1) {
                        ((rs.l.f_0)object).m[n5 + n4 * (n3 > 32 ? n3 : 32)] = 0;
                    }
                }
                --n4;
            }
            --n5;
        }
        if (n3 <= 32) {
            int n23 = n5 = n3 > 32 ? n3 - 1 : 31;
            while (n5 >= 0) {
                int n24 = n4 = n3 > 32 ? n3 - 1 : 31;
                while (n4 >= 0) {
                    if (((rs.l.f_0)object).m[n5 + n4 * (n3 > 32 ? n3 : 32)] == 0 && n5 > 0 && n4 > 0 && ((rs.l.f_0)object).m[n5 - 1 + (n4 - 1) * 32] > 0) {
                        ((rs.l.f_0)object).m[n5 + n4 * (n3 > 32 ? n3 : 32)] = 0x302020;
                    }
                    --n4;
                }
                --n5;
            }
        }
        f_02.a((rs.a)object, n2);
        c.a(n13, n14, nArray2, null);
        c.c(n18, n15, n16, n17);
        e_0.s = n11;
        e_0.t = n12;
        e_0.x = nArray;
        e_0.p = true;
        e_0.q = true;
        ((rs.l.f_0)object).r = n3;
        ((rs.l.f_0)object).s = n3;
        ((rs.l.f_0)object).h = n3;
        return object;
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
            c = rs.d.e$a.a();
        }
    }
}

