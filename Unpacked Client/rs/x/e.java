/*
 * Decompiled with CFR 0.152.
 */
package rs.x;

import java.math.BigInteger;
import rs.a;
import rs.h;

public class e
extends a {
    public static boolean f = false;
    private static final BigInteger o = new BigInteger("123170234790352841533577494407893223569302106554965186549402391077147181466197671542829166332684626271320491745377079903632972493287208295934209630330171676570669957737571832140453287345512507359611793323427155597542898117089254383474063942936848736827745480785742742903200182056548823040146163971138329485819");
    private static final BigInteger p = new BigInteger("65537");
    public byte[] g;
    public int h;
    public int i;
    public int j;
    public static final int[] k = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, Short.MAX_VALUE, 65535, 131071, 262143, 524287, 1048575, 0x1FFFFF, 0x3FFFFF, 0x7FFFFF, 0xFFFFFF, 0x1FFFFFF, 0x3FFFFFF, 0x7FFFFFF, 0xFFFFFFF, 0x1FFFFFFF, 0x3FFFFFFF, Integer.MAX_VALUE, -1};
    public rs.q.a l;
    public static int m;
    public static final h n;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static e c() {
        Object object = n;
        synchronized (object) {
            e e2 = null;
            if (m > 0) {
                --m;
                e2 = (e)n.a();
            }
            if (e2 != null) {
                e2.h = 0;
                return e2;
            }
        }
        object = new e();
        ((e)object).h = 0;
        ((e)object).g = new byte[rs.f.a.bt.intValue()];
        return object;
    }

    public e() {
    }

    public int d() {
        int n2 = 0;
        int n3 = this.e();
        while (n3 == Short.MAX_VALUE) {
            n2 += Short.MAX_VALUE;
            n3 = this.e();
        }
        return n2 += n3;
    }

    public int e() {
        int n2 = this.g[this.h] & 0xFF;
        return n2 < 128 ? this.y() : this.o() - 32768;
    }

    public int f() {
        int n2 = this.g[this.h] & 0xFF;
        if (n2 < 128) {
            return this.y();
        }
        return this.A() - 32768;
    }

    public int g() {
        this.h += 3;
        return ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
    }

    public byte[] a(byte[] byArray) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            byArray[i2] = this.g[this.h++];
        }
        return byArray;
    }

    public e(byte[] byArray) {
        this.g = byArray;
        this.h = 0;
    }

    public void b(byte[] byArray) {
        this.g = byArray;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.l = null;
    }

    public void a(int n2) {
        this.g[this.h++] = (byte)(n2 + this.l.a());
    }

    public void b(int n2) {
        this.g[this.h++] = (byte)n2;
    }

    public int h() {
        int n2 = this.h;
        return n2;
    }

    public void i() {
        this.h = 0;
    }

    public final int c(int n2) {
        this.h += 3;
        return (0xFF & this.g[this.h - 3] << 16) + (0xFF & this.g[this.h - 2] << 8) + (0xFF & this.g[this.h - 1]);
    }

    public int j() {
        return 1795;
    }

    public int k() {
        return -263;
    }

    public int l() {
        this.h += 2;
        return ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
    }

    public int m() {
        this.h += 4;
        return ((this.g[this.h - 4] & 0xFF) << 24) + ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
    }

    public int n() {
        try {
            int n2 = this.g[this.h] & 0xFF;
            if (n2 < 128) {
                return this.y() - 64;
            }
            return this.A() - 49152;
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public int o() {
        this.h += 2;
        return ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
    }

    public int p() {
        this.h += 4;
        return ((this.g[this.h - 4] & 0xFF) << 24) + ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
    }

    public int q() {
        this.h += 2;
        int n2 = ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
        if (n2 > 60000) {
            n2 = -65535 + n2;
        }
        return n2;
    }

    public int r() {
        this.h += 4;
        return ((this.g[this.h - 4] & 0xFF) << 24) + ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
    }

    public float s() {
        return Float.intBitsToFloat(this.r());
    }

    public int t() {
        int n2 = this.g[this.h] & 0xFF;
        if (n2 < 128) {
            return this.y() - 64;
        }
        return this.o() - 49152;
    }

    public int u() {
        this.h += 2;
        int n2 = ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
        if (n2 > Short.MAX_VALUE) {
            n2 -= 65536;
        }
        return n2;
    }

    public int v() {
        int n2 = 0;
        int n3 = 0;
        while ((n3 = this.f()) == Short.MAX_VALUE) {
            n2 += Short.MAX_VALUE;
        }
        return n2 + n3;
    }

    public String w() {
        int n2 = this.h;
        while (this.g[this.h++] != 0) {
        }
        return new String(this.g, n2, this.h - n2 - 1);
    }

    public int x() {
        this.h += 2;
        int n2 = ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
        if (n2 > 60000) {
            n2 = -65535 + n2;
        }
        return n2;
    }

    public void d(int n2) {
        this.g[this.h++] = (byte)(n2 >> 8);
        this.g[this.h++] = (byte)n2;
    }

    public void e(int n2) {
        this.g[this.h++] = (byte)n2;
        this.g[this.h++] = (byte)(n2 >> 8);
    }

    public void f(int n2) {
        this.g[this.h++] = (byte)(n2 >> 16);
        this.g[this.h++] = (byte)(n2 >> 8);
        this.g[this.h++] = (byte)n2;
    }

    public void g(int n2) {
        if (n2 == 42333) {
            n2 = 95233;
        }
        this.g[this.h++] = (byte)(n2 >> 24);
        this.g[this.h++] = (byte)(n2 >> 16);
        this.g[this.h++] = (byte)(n2 >> 8);
        this.g[this.h++] = (byte)n2;
    }

    public void h(int n2) {
        this.g[this.h++] = (byte)n2;
        this.g[this.h++] = (byte)(n2 >> 8);
        this.g[this.h++] = (byte)(n2 >> 16);
        this.g[this.h++] = (byte)(n2 >> 24);
    }

    public void a(long l2) {
        try {
            this.g[this.h++] = (byte)(l2 >> 56);
            this.g[this.h++] = (byte)(l2 >> 48);
            this.g[this.h++] = (byte)(l2 >> 40);
            this.g[this.h++] = (byte)(l2 >> 32);
            this.g[this.h++] = (byte)(l2 >> 24);
            this.g[this.h++] = (byte)(l2 >> 16);
            this.g[this.h++] = (byte)(l2 >> 8);
            this.g[this.h++] = (byte)l2;
        }
        catch (RuntimeException runtimeException) {
            rs.v.a.e("14395, 5, " + l2 + ", " + runtimeException.toString());
            throw new RuntimeException();
        }
    }

    public void a(String string) {
        System.arraycopy(string.getBytes(), 0, this.g, this.h, string.length());
        this.h += string.length();
        this.g[this.h++] = 10;
    }

    public void a(byte[] byArray, int n2, int n3) {
        for (int i2 = n3; i2 < n3 + n2; ++i2) {
            this.g[this.h++] = byArray[i2];
        }
    }

    public void i(int n2) {
        this.g[this.h++] = (byte)n2;
    }

    public void j(int n2) {
        this.g[this.h - n2 - 1] = (byte)n2;
    }

    public int y() {
        return this.g[this.h++] & 0xFF;
    }

    public byte z() {
        return this.g[this.h++];
    }

    public int A() {
        try {
            this.h += 2;
            return ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
        }
        catch (Exception exception) {
            return this.j();
        }
    }

    public int B() {
        this.h += 2;
        int n2 = ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
        if (n2 > Short.MAX_VALUE) {
            n2 -= 65536;
        }
        return n2;
    }

    public int C() {
        this.h += 3;
        return ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
    }

    public int D() {
        this.h += 4;
        return ((this.g[this.h - 4] & 0xFF) << 24) + ((this.g[this.h - 3] & 0xFF) << 16) + ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] & 0xFF);
    }

    public long E() {
        long l2 = (long)this.D() & 0xFFFFFFFFL;
        long l3 = (long)this.D() & 0xFFFFFFFFL;
        return (l2 << 32) + l3;
    }

    public String F() {
        int n2 = this.h;
        while (this.g[this.h++] != 10) {
        }
        return new String(this.g, n2, this.h - n2 - 1);
    }

    public void G() {
        int n2 = this.h;
        while (this.g[this.h++] != 10) {
        }
    }

    public byte[] H() {
        int n2 = this.h;
        while (this.g[this.h++] != 10) {
        }
        byte[] byArray = new byte[this.h - n2 - 1];
        System.arraycopy(this.g, n2, byArray, n2 - n2, this.h - 1 - n2);
        return byArray;
    }

    public void I() {
        int n2 = this.h;
        while (this.g[this.h++] != 10) {
        }
    }

    public void a(int n2, int n3, byte[] byArray) {
        for (int i2 = n3; i2 < n3 + n2; ++i2) {
            byArray[i2] = this.g[this.h++];
        }
    }

    public void J() {
        this.i = this.h * 8;
    }

    public int k(int n2) {
        if (f) {
            System.out.println(this.g.length);
        }
        int n3 = this.i >> 3;
        int n4 = 8 - (this.i & 7);
        int n5 = 0;
        this.i += n2;
        while (n2 > n4) {
            n5 += (this.g[n3++] & k[n4]) << n2 - n4;
            n2 -= n4;
            n4 = 8;
        }
        n5 = n2 == n4 ? (n5 += this.g[n3] & k[n4]) : (n5 += this.g[n3] >> n4 - n2 & k[n2]);
        return n5;
    }

    public void K() {
        this.h = (this.i + 7) / 8;
    }

    public int L() {
        try {
            int n2 = this.g[this.h] & 0xFF;
            if (n2 < 128) {
                return this.y() - 64;
            }
            return this.A() - 49152;
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public void M() {
        BigInteger bigInteger;
        int n2 = this.h;
        this.h = 0;
        byte[] byArray = new byte[n2];
        this.a(n2, 0, byArray);
        BigInteger bigInteger2 = bigInteger = new BigInteger(byArray);
        byte[] byArray2 = bigInteger2.toByteArray();
        this.h = 0;
        this.b(byArray2.length);
        this.a(byArray2, byArray2.length, 0);
    }

    public void l(int n2) {
        this.g[this.h++] = (byte)(-n2);
    }

    public void m(int n2) {
        this.g[this.h++] = (byte)(128 - n2);
    }

    public int N() {
        return this.g[this.h++] - 128 & 0xFF;
    }

    public int O() {
        return -this.g[this.h++] & 0xFF;
    }

    public int P() {
        return 128 - this.g[this.h++] & 0xFF;
    }

    public byte Q() {
        return -this.g[this.h++];
    }

    public byte R() {
        return (byte)(128 - this.g[this.h++]);
    }

    public void n(int n2) {
        this.g[this.h++] = (byte)n2;
        this.g[this.h++] = (byte)(n2 >> 8);
    }

    public void o(int n2) {
        this.g[this.h++] = (byte)(n2 >> 8);
        this.g[this.h++] = (byte)(n2 + 128);
    }

    public void p(int n2) {
        this.g[this.h++] = (byte)(n2 + 128);
        this.g[this.h++] = (byte)(n2 >> 8);
    }

    public int S() {
        this.h += 2;
        return ((this.g[this.h - 1] & 0xFF) << 8) + (this.g[this.h - 2] & 0xFF);
    }

    public int T() {
        this.h += 2;
        return ((this.g[this.h - 2] & 0xFF) << 8) + (this.g[this.h - 1] - 128 & 0xFF);
    }

    public int U() {
        this.h += 2;
        return ((this.g[this.h - 1] & 0xFF) << 8) + (this.g[this.h - 2] - 128 & 0xFF);
    }

    public int V() {
        this.h += 2;
        int n2 = ((this.g[this.h - 1] & 0xFF) << 8) + (this.g[this.h - 2] & 0xFF);
        if (n2 > Short.MAX_VALUE) {
            n2 -= 65536;
        }
        return n2;
    }

    public int W() {
        this.h += 2;
        int n2 = ((this.g[this.h - 1] & 0xFF) << 8) + (this.g[this.h - 2] - 128 & 0xFF);
        if (n2 > Short.MAX_VALUE) {
            n2 -= 65536;
        }
        return n2;
    }

    public int X() {
        this.h += 4;
        return ((this.g[this.h - 2] & 0xFF) << 24) + ((this.g[this.h - 1] & 0xFF) << 16) + ((this.g[this.h - 4] & 0xFF) << 8) + (this.g[this.h - 3] & 0xFF);
    }

    public int Y() {
        this.h += 4;
        return ((this.g[this.h - 3] & 0xFF) << 24) + ((this.g[this.h - 4] & 0xFF) << 16) + ((this.g[this.h - 1] & 0xFF) << 8) + (this.g[this.h - 2] & 0xFF);
    }

    public void a(int n2, byte[] byArray, int n3) {
        for (int i2 = n2 + n3 - 1; i2 >= n2; --i2) {
            this.g[this.h++] = (byte)(byArray[i2] + 128);
        }
    }

    public void b(int n2, int n3, byte[] byArray) {
        for (int i2 = n3 + n2 - 1; i2 >= n3; --i2) {
            byArray[i2] = this.g[this.h++];
        }
    }

    public final void b(byte[] byArray, int n2, int n3) {
        for (int i2 = n2; i2 < n3 + n2; ++i2) {
            byArray[i2] = this.g[this.h++];
        }
    }

    public int Z() {
        return this.h;
    }

    public int aa() {
        return this.h;
    }

    public int ab() {
        return this.j;
    }

    public byte[] ac() {
        return this.g;
    }

    static {
        n = new h();
    }
}

