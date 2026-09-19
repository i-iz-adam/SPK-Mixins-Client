/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.d.k;
import rs.l.k_0;
import rs.n.c;
import rs.n.c.b_0;
import rs.n.e;

/*
 * Renamed from rs.n.c.A
 */
public class a_0
extends c {
    private final int[] d = new int[]{6179, 2459, 2469, 2480, 2492};
    public static final rs.q.a.a.a c = new b_0();

    public a_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        a_0.a(true);
        this.j();
        e.H[14175].Q = "Confirm";
    }

    public static void a(boolean bl) {
        int n2 = 5;
        int n3 = 0;
        int n4 = 0;
        int n5 = 10;
        int n6 = -10;
        int n7 = 0;
        if (!bl) {
            n2 = -55;
            n5 = 25;
            n4 = -82;
            n5 += 10;
            n2 += 10;
            n6 -= 15;
            n6 += 26;
            n4 += 41;
            n3 += 41;
        } else {
            n7 -= 10;
        }
        e.H[14170].al = new int[]{14171, 14172, 14173, 14174, 14175, 14176, 14178, 14179, 14180, 14181, 14184};
        e.H[14170].am = new int[]{n6, 225 + n4, 358 + n4, 0, 226 + n4, 362 + n4, 408, 15, 0 + n3, 0 + n3, 62 + n3};
        e.H[14170].bc = new int[]{n7, 24 + n5, 25 + n5, -1, 32 + n5, 32 + n5, 0, 1, 50 + n2, 60 + n2, 32 + n2};
        a_0.i();
    }

    public static void h() {
        e.H[14170].al = new int[]{14172, 14173, 14174, 14175, 14176, 14178, 14179, 14180, 14181, 14184};
        e.H[14170].am = new int[]{145, 278, 0, 146, 282, 408, 15, 0, 0, 62};
        e.H[14170].bc = new int[]{49, 50, -1, 54, 54, 0, 1, 50, 5, 32};
        int n2 = 0;
        while (n2 < e.H[14170].al.length) {
            int n3 = n2++;
            e.H[14170].bc[n3] = e.H[14170].bc[n3] + 5;
        }
        e.H[14174].at = "Please confirm your choice.";
        e.H[14183].at = "";
        a_0.i();
    }

    public static void i() {
        e.H[14172].af = 8685;
        e.H[14172].aI = 6;
        e.H[14172].P = 32;
        e.H[14172].aR = 32;
        e.H[14172].aN = 0;
        e.H[14172].aU = 291;
        e.H[14172].aV = 2032;
        e.H[14172].aK = false;
        e.H[14172].aM = 0;
        e.H[14172].aL = 0;
        e.H[14172].ae = 1;
        e.H[14172].aT = 1463;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, boolean bl) {
        e.a(n2, n3, n5, n6, (int)((double)rs.d.k.f((int)n3).G * 0.4));
        k k2 = rs.d.k.f(n3);
        e.H[n2].bq = n4;
        e.H[n2].aN = n3;
        e.H[n2].aU = k2.M;
        e.H[n2].aV = k2.Z;
        if (bl) {
            e.H[n2].aK = true;
            e.H[n2].aM = rs.d.k.f((int)n3).Z;
            e.H[n2].aL = rs.d.k.f((int)n3).M;
        } else {
            e.H[n2].aK = false;
        }
    }

    private void j() {
        boolean bl = true;
        for (int n2 : this.d) {
            int n3;
            e e2 = e.H[n2];
            int[] nArray = new int[e2.al.length + 1];
            int[] nArray2 = new int[e2.al.length + 1];
            int[] nArray3 = new int[e2.al.length + 1];
            int n4 = 0;
            for (n3 = 0; n3 < e2.al.length; ++n3) {
                nArray[n3] = e2.am[n3];
                nArray2[n3] = e2.bc[n3];
                nArray3[n3] = e2.al[n3];
                ++n4;
            }
            a_0.a(54195, "<img=25> Close window", "Cancel", this.a, 0, 0x880000, false, false, 300);
            n3 = 400;
            int n5 = 1;
            e2.am = nArray;
            e2.bc = nArray2;
            e2.al = nArray3;
            e2.b(n4++, 54195, n3, n5);
        }
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
            d = rs.n.c.A$a.a();
        }
    }
}

