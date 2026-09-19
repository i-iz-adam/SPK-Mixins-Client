/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.a;
import rs.k.e;

/*
 * Renamed from rs.l.B
 */
public class b_0
extends a {
    public static void b(int[] nArray, int n2, int n3, int n4, int n5) {
        if (!rs.k.e.a()) {
            nArray[n2] = n3;
            return;
        }
        if (n5 <= 0 || n2 >= nArray.length || n2 < 0) {
            return;
        }
        int n6 = nArray[n2];
        if ((n6 & 0xFF000000) == 0 || n5 == 255) {
            nArray[n2] = n4 & 0xFFFFFF | n5 << 24;
            return;
        }
        if ((n6 & 0xFF000000) == -16777216) {
            nArray[n2] = n3 | 0xFF000000;
            return;
        }
        int n7 = (n6 >>> 24) * (255 - n5) >>> 8;
        int n8 = n5 + n7;
        int n9 = (n5 << 8) / n8;
        int n10 = (n7 << 8) / n8;
        int n11 = ((n4 & 0xFF00FF) * n9 + (n6 & 0xFF00FF) * n10 & 0xFF00FF00 | (n4 & 0xFF00) * n9 + (n6 & 0xFF00) * n10 & 0xFF0000) >>> 8;
        nArray[n2] = n11 | n8 << 24;
    }
}

