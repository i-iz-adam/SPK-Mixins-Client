/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.t;
import rs.v.a;

public final class o {
    public final int a;
    public final t[] b;

    public o() {
        int n2;
        this.a = n2 = 1024;
        this.b = new t[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            t t2;
            t2.d = t2 = (this.b[i2] = new t());
            t2.e = t2;
        }
    }

    public t a(long l2) {
        t t2 = this.b[(int)(l2 & (long)(this.a - 1))];
        t t3 = t2.d;
        while (t3 != t2) {
            if (t3.c == l2) {
                return t3;
            }
            t3 = t3.d;
        }
        return null;
    }

    public void a(t t2, long l2) {
        try {
            if (t2.e != null) {
                t2.b();
            }
            t t3 = this.b[(int)(l2 & (long)(this.a - 1))];
            t2.e = t3.e;
            t2.d = t3;
            t2.e.d = t2;
            t2.d.e = t2;
            t2.c = l2;
            return;
        }
        catch (RuntimeException runtimeException) {
            rs.v.a.e("91499, " + String.valueOf(t2) + ", " + l2 + ", 7, " + runtimeException.toString());
            throw new RuntimeException();
        }
    }
}

