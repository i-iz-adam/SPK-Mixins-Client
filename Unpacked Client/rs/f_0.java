/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.a;
import rs.b_0;
import rs.o;

/*
 * Renamed from rs.F
 */
public final class f_0 {
    private final a c = new a();
    private final int d;
    public o a;
    private final b_0 e = new b_0();
    public int b;

    public f_0(int n2) {
        this.d = n2;
        this.b = n2;
        this.a = new o();
    }

    public a a(long l2) {
        a a2 = (a)this.a.a(l2);
        if (a2 != null) {
            this.e.a(a2);
        }
        return a2;
    }

    public void a(a a2, long l2) {
        try {
            if (this.b == 0) {
                a a3 = this.e.a();
                a3.b();
                a3.a();
                if (a3 == this.c) {
                    a3 = this.e.a();
                    a3.b();
                    a3.a();
                }
            } else {
                --this.b;
            }
            this.a.a(a2, l2);
            this.e.a(a2);
            return;
        }
        catch (RuntimeException runtimeException) {
            rs.v.a.e("47547, " + String.valueOf(a2) + ", " + l2 + ", 2, " + runtimeException.toString());
            throw new RuntimeException();
        }
    }

    public void a() {
        a a2;
        while ((a2 = this.e.a()) != null) {
            a2.b();
            a2.a();
        }
        this.b = this.d;
    }
}

