/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.a;

import java.util.List;
import rs.runelite.a.i;
import rs.runelite.a.m;

public class e {
    @Deprecated
    public static List<i> a(List<i> list) {
        int[] nArray = new int[list.size()];
        int[] nArray2 = new int[nArray.length];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            i i3 = list.get(i2);
            nArray[i2] = i3.a();
            nArray2[i2] = i3.b();
        }
        m m2 = e.a(nArray, nArray2);
        if (m2 == null) {
            return null;
        }
        return m2.e();
    }

    public static m a(int[] nArray, int[] nArray2) {
        int n2;
        int n3;
        int n4 = nArray.length;
        int n5 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            if (nArray[n3] != Integer.MIN_VALUE) continue;
            ++n5;
            ++n3;
            break;
        }
        while (n3 < n4) {
            if (nArray[n3] == Integer.MIN_VALUE) {
                ++n5;
            } else {
                nArray[n3 - n5] = nArray[n3];
                nArray2[n3 - n5] = nArray2[n3];
            }
            ++n3;
        }
        if ((n4 -= n5) < 3) {
            return null;
        }
        n5 = n3 = e.a(nArray, nArray2, n4);
        m m2 = new m(new int[16], new int[16], 0);
        do {
            int n6 = nArray[n5];
            int n7 = nArray2[n5];
            m2.b(n6, n7);
            if (m2.d() > n4) {
                return null;
            }
            n2 = 0;
            int n8 = nArray[n2];
            int n9 = nArray2[n2];
            for (int i2 = 1; i2 < n4; ++i2) {
                long l2 = e.a(n6, n7, nArray[i2], nArray2[i2], n8, n9);
                if (l2 <= 0L && (l2 != 0L || e.a(n6 - nArray[i2]) + e.a(n7 - nArray2[i2]) <= e.a(n6 - n8) + e.a(n7 - n9))) continue;
                n2 = i2;
                n8 = nArray[n2];
                n9 = nArray2[n2];
            }
        } while ((n5 = n2) != n3);
        return m2;
    }

    private static int a(int n2) {
        return n2 * n2;
    }

    private static int a(int[] nArray, int[] nArray2, int n2) {
        int n3 = 0;
        int n4 = nArray[n3];
        int n5 = nArray2[n3];
        for (int i2 = 1; i2 < n2; ++i2) {
            int n6 = nArray[i2];
            if (n6 >= n4 && (n6 != n4 || nArray2[i2] >= n5)) continue;
            n3 = i2;
            n4 = nArray[n3];
            n5 = nArray2[n3];
        }
        return n3;
    }

    private static long a(int n2, int n3, int n4, int n5, int n6, int n7) {
        long l2 = (long)(n5 - n3) * (long)(n6 - n4) - (long)(n4 - n2) * (long)(n7 - n5);
        return l2;
    }
}

