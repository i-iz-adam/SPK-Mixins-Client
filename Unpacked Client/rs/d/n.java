/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 */
package rs.d;

import gnu.trove.f.b.cc;
import rs.Client;
import rs.d.k;
import rs.l.f_0;
import rs.l.j;

public class n {
    public static cc<n> a = new cc();
    public a b;
    public int c;
    public int d;
    public int e;

    public f_0 a() {
        switch (this.b) {
            case a: {
                if (j.b.w_(this.c)) {
                    return Client.fE[((rs.l.a.a)j.b.b(this.c)).b()];
                }
                return Client.fE[this.c];
            }
            case b: {
                return k.g(this.c);
            }
        }
        return null;
    }

    public static f_0 a(int n2) {
        return ((n)a.b(n2)).a();
    }

    public static void a(int n2, int n3, int n4) {
        n n5 = (n)a.b(n2);
        f_0 f_02 = n5.a();
        if (f_02 != null) {
            f_02.f(n3 + n5.d, n4 + n5.e);
        }
    }

    public static void a(int n2, int n3, int n4, int n5) {
        n n6 = (n)a.b(n2);
        f_0 f_02 = n6.a();
        if (f_02 != null) {
            f_02.g(n3 + n6.d, n4 + n6.e, n5);
        }
    }

    public static boolean b(int n2) {
        return a.w_(n2);
    }

    public n(a a2, int n2, int n3, int n4) {
        this.b = a2;
        this.c = n2;
        this.d = n3;
        this.e = n4;
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
            c = rs.d.n$a.a();
        }
    }
}

