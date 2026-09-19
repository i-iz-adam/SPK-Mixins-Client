/*
 * Decompiled with CFR 0.152.
 */
package rs.u;

import rs.u.b;
import rs.u.d;
import rs.x.e;

public class j {
    d[] a;
    int b;

    public j(e e2, int n2) {
        this.a = new d[n2];
        this.b = e2.y();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            d d2;
            this.a[i2] = d2 = new d(this.b, e2, false);
        }
        this.a();
    }

    void a() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            d d2 = this.a[i2];
            if (d2.n < 0) continue;
            d2.m = this.a[d2.n];
        }
    }

    public int b() {
        return this.a.length;
    }

    public d a(int n2) {
        return n2 >= this.b() ? null : this.a[n2];
    }

    d[] c() {
        return this.a;
    }

    public void a(b b2, int n2) {
        this.a(b2, n2, null, false);
    }

    public void a(b b2, int n2, boolean[] blArray, boolean bl) {
        int n3 = b2.c();
        int n4 = 0;
        d[] dArray = this.c();
        for (int i2 = 0; i2 < dArray.length; ++i2) {
            d d2 = dArray[i2];
            if (blArray == null || blArray[n4] == bl) {
                b2.a(n2, d2, n4, n3);
            }
            ++n4;
        }
    }
}

