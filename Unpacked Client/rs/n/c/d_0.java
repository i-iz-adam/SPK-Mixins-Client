/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c;

import rs.l.k_0;
import rs.n.c;
import rs.n.e;

/*
 * Renamed from rs.n.c.D
 */
public class d_0
extends c {
    public d_0(k_0[] k_0Array) {
        super(k_0Array);
    }

    @Override
    public void a() {
        e e2 = e.H[6575];
        int[] nArray = e2.al;
        int[] nArray2 = e2.am;
        int[] nArray3 = e2.bc;
        int n2 = 2;
        d_0.h(68439, "misc/duel load");
        d_0.a(68440, "Load last rules", "Load last duel", this.a, 0, 16750623, false, false, 68439);
        int[] nArray4 = new int[nArray.length + n2];
        int[] nArray5 = new int[nArray2.length + n2];
        int[] nArray6 = new int[nArray3.length + n2];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            nArray4[i2] = nArray[i2];
            nArray5[i2] = nArray2[i2];
            nArray6[i2] = nArray3[i2];
        }
        nArray4[nArray.length + 0] = 68439;
        nArray5[nArray.length + 0] = 394;
        nArray6[nArray.length + 0] = 304;
        nArray4[nArray.length + 1] = 68440;
        nArray5[nArray.length + 1] = 415;
        nArray6[nArray.length + 1] = 306;
        e2.al = nArray4;
        e2.am = nArray5;
        e2.bc = nArray6;
    }
}

