/*
 * Decompiled with CFR 0.152.
 */
package rs.l.a;

import rs.l.f_0;

public class b {
    public static b a;
    protected final long b;
    protected final f_0[] c;
    protected int d;
    protected long e;

    public static void a() {
        a = new b("glitter", 4, 100L);
    }

    public b(f_0[] f_0Array, long l2) {
        this.c = f_0Array;
        this.b = l2;
    }

    public b(String string, int n2, long l2) {
        this.c = new f_0[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.c[i2] = new f_0("anim/" + string + " " + i2);
        }
        this.b = l2;
    }

    public void b() {
        if (this.c == null) {
            return;
        }
        if (System.currentTimeMillis() > this.e) {
            ++this.d;
            if (this.d >= this.c.length) {
                this.d = 0;
            }
            this.e = System.currentTimeMillis() + this.b;
        }
    }

    public f_0 c() {
        if (this.c == null) {
            return null;
        }
        this.b();
        return this.c[this.d];
    }

    public void a(int n2, int n3) {
        if (this.c() == null) {
            return;
        }
        this.c().f(n2, n3);
    }

    public void a(int n2, int n3, int n4) {
        if (this.c() == null) {
            return;
        }
        this.c().g(n2, n3, n4);
    }

    public void b(int n2, int n3) {
        if (this.c() == null) {
            return;
        }
        this.c().c(n2, n3);
    }
}

