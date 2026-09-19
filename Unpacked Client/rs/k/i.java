/*
 * Decompiled with CFR 0.152.
 */
package rs.k;

import rs.a.h;
import rs.k.c;
import rs.k.c.a;
import rs.k.c.b;
import rs.k.d;
import rs.k.e;
import rs.l.f;

public class i {
    private static final int[] c = new int[12];
    private static final float[] d = new float[12];
    private static final int[] e = new int[12];
    private static final float[] f = new float[12];
    public static final int a = 12;
    public static final int b = 4;

    public void a() {
    }

    public int a(h h2, d d2, c c2, long l2) {
        this.a();
        rs.k.c.d d3 = null;
        if (rs.f.a.az && !rs.f.a.ah && (d3 = rs.k.c.c.a((int)l2, false)) != null) {
            d3.c();
        }
        int[] nArray = h2.ae;
        int[] nArray2 = h2.af;
        int[] nArray3 = h2.ag;
        int[] nArray4 = h2.ai;
        int[] nArray5 = h2.aj;
        int[] nArray6 = h2.ak;
        int[] nArray7 = h2.al;
        int[] nArray8 = h2.am;
        int[] nArray9 = h2.an;
        int[] nArray10 = h2.aq;
        short[] sArray = h2.Y;
        int[] nArray11 = h2.ap;
        byte by = h2.V;
        byte by2 = h2.S;
        byte by3 = h2.T;
        byte by4 = h2.U;
        boolean bl = h2.d();
        boolean bl2 = rs.k.e.a && (sArray != null || h2.d());
        int n2 = Math.min(6144, h2.ah);
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4;
            int n5 = nArray4[i2];
            int n6 = nArray5[i2];
            int n7 = nArray6[i2];
            int n8 = nArray7[i2];
            int n9 = nArray8[i2];
            int n10 = nArray9[i2];
            if (h.H != -1) {
                n9 = n10 = h.H;
                n8 = n10;
            }
            int n11 = 0;
            if (nArray10 != null && (sArray == null || sArray[i2] == -1)) {
                n4 = nArray10[i2];
                if (h2.K != 256) {
                    n4 = h2.K;
                }
                n11 = (n4 & 0xFF) << 24;
                if (n4 == 255) {
                    n10 = -2;
                }
            }
            n4 = 0;
            if (nArray11 != null) {
                n4 = (nArray11[i2] & 0xFF) << 16;
            }
            if (n10 == -1) {
                n9 = n10 = n8;
            } else if (n10 == -2) continue;
            if ((sArray == null || sArray[i2] == -1) && by > 0) {
                n8 = i.a(n8, by2, by3, by4, by);
                n9 = i.a(n9, by2, by3, by4, by);
                n10 = i.a(n10, by2, by3, by4, by);
            }
            i.c[0] = nArray[n5];
            i.c[1] = nArray2[n5];
            i.c[2] = nArray3[n5];
            i.c[3] = n11 | n4 | n8;
            i.c[4] = nArray[n6];
            i.c[5] = nArray2[n6];
            i.c[6] = nArray3[n6];
            i.c[7] = n11 | n4 | n9;
            i.c[8] = nArray[n7];
            i.c[9] = nArray2[n7];
            i.c[10] = nArray3[n7];
            i.c[11] = n11 | n4 | n10;
            d2.a(c);
            if (bl2) {
                if (h2.e() != null && h.H <= 1) {
                    float f2 = 0.0f;
                    f2 = h2.ao != null && h2.d() && (sArray == null || sArray[i2] <= 0) ? ((h2.ao[i2] & 1) == 1 ? (h2.ao[i2] >= 3 ? (h2.ao[i2] > 0 ? (float)h2.ar[i2] + 1.0f : 0.0f) : 0.0f) : (h2.ao[i2] > 0 ? (float)h2.ar[i2] + 1.0f : 0.0f)) : (float)sArray[i2] + 1.0f;
                    i.d[0] = f2;
                    i.d[1] = h2.a(i2, 0);
                    i.d[2] = h2.b(i2, 0);
                    i.d[3] = 0.0f;
                    i.d[4] = f2;
                    i.d[5] = h2.a(i2, 1);
                    i.d[6] = h2.b(i2, 1);
                    i.d[7] = 0.0f;
                    i.d[8] = f2;
                    i.d[9] = h2.a(i2, 2);
                    i.d[10] = h2.b(i2, 2);
                    i.d[11] = 0.0f;
                    c2.a(d);
                } else {
                    c2.a(f);
                }
            }
            n3 += 3;
        }
        return n3;
    }

    public int a(h h2, d d2, a a2, boolean bl) {
        int n2 = (h2.ap[a2.n()] & 0xFF) << 16;
        int n3 = 255 - (int)(255.0f * a2.g());
        int n4 = (n3 & 0xFF) << 24;
        int n5 = rs.l.f.a(a2.e());
        int n6 = !bl ? 18 : 6;
        int n7 = 3 * n6;
        int n8 = (int)(3.5f + a2.f());
        int n9 = a2.j();
        int n10 = a2.k() * -1;
        int n11 = a2.l();
        if (bl) {
            d2.a(rs.k.c.b.b(n9, n10, n11, n8, n4 | n2 | n5));
        } else {
            d2.a(rs.k.c.b.a(n9, n10, n11, n8, n4 | n2 | n5));
        }
        return n7;
    }

    public static int a(int n2, byte by, byte by2, byte by3, byte by4) {
        int n3 = n2 >> 10 & 0x3F;
        int n4 = n2 >> 7 & 7;
        int n5 = n2 & 0x7F;
        int n6 = by4 & 0xFF;
        if (by != -1) {
            n3 += n6 * (by - n3) >> 7;
        }
        if (by2 != -1) {
            n4 += n6 * (by2 - n4) >> 7;
        }
        if (by3 != -1) {
            n5 += n6 * (by3 - n5) >> 7;
        }
        return (n3 << 10 | n4 << 7 | n5) & 0xFFFF;
    }
}

