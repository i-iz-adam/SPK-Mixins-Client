/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.bU
 *  gnu.trove.i.a.i
 */
package rs.a.b;

import gnu.trove.f.b.bU;
import gnu.trove.i.a.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import rs.a.b.b;
import rs.a.h;

public class e
extends b {
    private final i b;
    private final List<bU> c;
    private int[] d;
    HashSet<Integer> a = new HashSet();
    private int e;
    private int f;

    public e() {
        this.b = new i();
        this.c = new ArrayList<bU>();
    }

    public void a(int[][][] nArray) {
        for (int[][] nArray2 : nArray) {
            bU bU2 = new bU();
            int[] nArray3 = nArray2[0];
            int[] nArray4 = nArray2[1];
            for (int i2 = 0; i2 < nArray3.length && i2 < nArray4.length; ++i2) {
                this.a.add(nArray4[i2]);
                this.b.b(nArray3[i2]);
                bU2.a(nArray3[i2], nArray4[i2]);
            }
            this.c.add(bU2);
        }
    }

    public void a(int n2, int[] nArray) {
        bU bU2 = new bU();
        for (int n3 : nArray) {
            this.a.add(n2);
            this.b.b(n3);
            bU2.a(n3, n2);
        }
        this.c.add(bU2);
    }

    public int[] a() {
        if (this.d != null) {
            return this.d;
        }
        this.d = this.a.stream().mapToInt(Number::intValue).toArray();
        return this.d;
    }

    @Override
    public void a(h h2) {
        int n2 = 0;
        this.e = 0;
        this.f = 0;
        for (int i2 = 0; i2 < h2.ar.length; ++i2) {
            if (!this.b.a_(h2.ar[i2])) continue;
            ++n2;
        }
        h2.av = n2;
        if (h2.ao == null) {
            h2.ao = new int[h2.ah];
        }
        if (h2.ar == null) {
            h2.ar = new int[n2];
        }
        h2.aw = new int[n2];
        h2.ax = new int[n2];
        h2.ay = new int[n2];
        h2.as = new boolean[h2.ah];
    }

    @Override
    public void a(h h2, int n2) {
        if (h2.as != null && h2.as[n2]) {
            return;
        }
        if (h2.Z != null) {
            return;
        }
        if (!this.b.a_(h2.ar[n2])) {
            return;
        }
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (!this.c.get(i2).r_(h2.ar[n2])) continue;
            int n3 = this.c.get(i2).c(h2.ar[n2]);
            h2.as[n2] = true;
            h2.ar[n2] = n3;
            h2.ao[n2] = 3 + this.f;
            this.f += 4;
            h2.aw[this.e] = h2.ai[n2];
            h2.ax[this.e] = h2.aj[n2];
            h2.ay[this.e] = h2.ak[n2];
            ++this.e;
            break;
        }
    }

    public i b() {
        return this.b;
    }

    public List<bU> c() {
        return this.c;
    }
}

