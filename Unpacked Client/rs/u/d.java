/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.a.b.a.b
 */
package rs.u;

import com.a.b.a.b;
import rs.x.e;

public class d {
    boolean a = true;
    boolean b = true;
    b c = new b();
    b d = new b();
    b e = new b();
    b[] f;
    b[] g;
    float[][] h;
    float[][] i;
    float[][] j;
    float[][] k;
    final b[] l;
    public d m;
    public final int n;

    public d(int n2, e e2, boolean bl) {
        this.n = e2.B();
        this.l = new b[n2];
        this.f = new b[this.l.length];
        this.g = new b[this.l.length];
        this.k = new float[this.l.length][3];
        for (int i2 = 0; i2 < this.l.length; ++i2) {
            this.l[i2] = new b(e2, bl);
            this.k[i2][0] = e2.s();
            this.k[i2][1] = e2.s();
            this.k[i2][2] = e2.s();
        }
        this.a();
    }

    void a() {
        this.i = new float[this.l.length][3];
        this.h = new float[this.l.length][3];
        this.j = new float[this.l.length][3];
        b b2 = com.a.b.a.b.a();
        for (int i2 = 0; i2 < this.l.length; ++i2) {
            b b3 = this.a(i2);
            b2.a(b3);
            b2.h();
            this.i[i2] = b2.d();
            this.h[i2][0] = b3.e[12];
            this.h[i2][1] = b3.e[13];
            this.h[i2][2] = b3.e[14];
            this.j[i2] = b3.i();
        }
        b2.b();
    }

    b a(int n2) {
        return this.l[n2];
    }

    b b(int n2) {
        if (null == this.f[n2]) {
            this.f[n2] = new b(this.a(n2));
            if (null != this.m) {
                this.f[n2].c(this.m.b(n2));
            } else {
                this.f[n2].c(com.a.b.a.b.a);
            }
        }
        return this.f[n2];
    }

    b c(int n2) {
        if (null == this.g[n2]) {
            this.g[n2] = new b(this.b(n2));
            this.g[n2].h();
        }
        return this.g[n2];
    }

    void a(b b2) {
        this.e.a(b2);
        this.b = true;
        this.a = true;
    }

    b b() {
        return this.e;
    }

    b c() {
        try {
            if (this.b) {
                this.c.a(this.b());
                if (this.m != null) {
                    this.c.c(this.m.c());
                }
                this.b = false;
            }
        }
        catch (StackOverflowError stackOverflowError) {
            System.out.println("parent " + this.n + ", " + String.valueOf(this.m) + ", parent parent: " + (this.m != null ? this.m.n : -1) + ", bone_pose_transform: " + String.valueOf(this.c));
            System.exit(1);
        }
        return this.c;
    }

    public b d(int n2) {
        if (this.a) {
            this.d.a(this.c(n2));
            this.d.c(this.c());
            this.a = false;
        }
        return this.d;
    }

    float[] e(int n2) {
        return this.i[n2];
    }

    float[] f(int n2) {
        return this.h[n2];
    }

    float[] g(int n2) {
        return this.j[n2];
    }
}

