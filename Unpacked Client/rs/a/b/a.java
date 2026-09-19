/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.i.a.i
 */
package rs.a.b;

import gnu.trove.i.a.i;
import java.util.ArrayList;
import java.util.List;
import rs.a.b.b;
import rs.a.h;
import rs.s.c.d;

public class a
extends b {
    private i a;
    private i b;
    private List<a> c = new ArrayList<a>();

    public a(int[][][] nArray) {
        this.a = new i();
        if (d.b()) {
            this.b = new i();
        }
        for (int[][] nArray2 : nArray) {
            a a2 = new a();
            a2.c = new i();
            rs.a.b.a$a.a(a2, nArray2[1]);
            for (int n2 : nArray2[0]) {
                if (d.b()) {
                    this.b.b(n2);
                }
                this.a.b(n2);
                a2.c.b(n2);
            }
            this.c.add(a2);
        }
    }

    @Override
    public void a(h h2) {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            this.c.get((int)i2).a = 0;
        }
    }

    @Override
    public void a(h h2, int n2) {
        if (!this.a.a_(h2.ar[n2])) {
            return;
        }
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (!this.c.get(i2).c.a_(h2.ar[n2])) continue;
            h2.ar[n2] = this.c.get(i2).a();
            break;
        }
    }

    public i a() {
        return this.a;
    }

    public i b() {
        return this.b;
    }

    class a {
        int a;
        private i c;
        private int[] d;

        a() {
        }

        public int a() {
            int n2 = this.d[this.a++];
            if (this.a >= this.d.length) {
                this.a = 0;
            }
            return n2;
        }

        static /* synthetic */ int[] a(a a2, int[] nArray) {
            a2.d = nArray;
            return nArray;
        }
    }
}

