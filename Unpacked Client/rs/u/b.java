/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.a.a.a.a
 *  com.a.b.a.b
 *  com.a.b.a.c
 */
package rs.u;

import com.a.a.a.a;
import rs.Client;
import rs.k;
import rs.k_0;
import rs.u.c;
import rs.u.d;
import rs.u.e;
import rs.u.g;

public class b {
    boolean a;
    g[][] b = null;
    int c;
    int d = 0;
    public g[][] e = null;
    public k_0 base;
    public static b[] f;

    public b a() {
        try {
            if (f[this.c] == null) {
                k.a(this.c, true);
            }
            return f[this.c];
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static b a(int n2) {
        try {
            String string = "";
            int n3 = n2 >>> 16;
            int n4 = n2 & 0xFFFF;
            if (f[n3] == null) {
                k.a(n3, true);
            }
            return f[n3];
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static final void b(int n2) {
        boolean bl = rs.cache.osrs.c.a();
        try {
            rs.cache.osrs.c.a(true);
            Client.ew.a(1, n2);
        }
        finally {
            rs.cache.osrs.c.a(bl);
        }
    }

    public static void b() {
        f = new b[5000];
    }

    public static void a(int n2, byte[] byArray) {
        try {
            rs.x.e e2 = new rs.x.e(byArray);
            if (e2.A() != 420) {
                System.err.println("Not a keyframe file!");
            }
            int n3 = e2.D();
            byte[] byArray2 = new byte[n3];
            e2.a(n3, 0, byArray2);
            rs.x.e e3 = new rs.x.e(byArray2);
            int n4 = e2.y();
            int n5 = e2.A();
            b b2 = rs.u.b.f[n2] = new b();
            b2.c = n2;
            try {
                b2.base = new k_0(e3, false, n3);
            }
            catch (RuntimeException runtimeException) {
                rs.u.b.f[n2] = null;
                System.err.println(runtimeException.getMessage());
                System.err.println("Error1 unpacking base for keyframe " + n2);
                runtimeException.printStackTrace();
            }
            try {
                b2.a(e2, n4);
            }
            catch (RuntimeException runtimeException) {
                rs.u.b.f[n2] = null;
                System.err.println("Error1 unpacking keyframes " + n2 + " file size from cache = " + byArray.length);
                runtimeException.printStackTrace();
            }
        }
        catch (Exception exception) {
            System.err.println("Error2 unpacking keyframes " + n2);
            exception.printStackTrace();
        }
    }

    void a(rs.x.e e2, int n2) {
        int n3;
        int n4 = e2.r();
        int n5 = e2.h;
        e2.o();
        e2.o();
        this.d = e2.y();
        int n6 = e2.o();
        this.b = new g[this.base.b().b()][];
        this.e = new g[this.base.a()][];
        for (n3 = 0; n3 < n6; ++n3) {
            a[] aArray = new c[]{rs.u.c.f, rs.u.c.d, rs.u.c.b, rs.u.c.c, rs.u.c.a, rs.u.c.e};
            int n7 = e2.y();
            c c2 = (c)com.a.a.a.a.a((a[])aArray, (int)n7);
            if (c2 == null) {
                c2 = rs.u.c.f;
            }
            int n8 = e2.t();
            e e3 = rs.u.e.a(e2.y());
            g g2 = new g();
            g2.a(e2, n2);
            int n9 = c2.b();
            g[][] gArray = rs.u.c.d == c2 ? this.b : this.e;
            if (gArray[n8] == null) {
                gArray[n8] = new g[n9];
            }
            gArray[n8][e3.c()] = g2;
            if (rs.u.c.a != c2) continue;
            this.a = true;
        }
        n3 = e2.h - n5;
        if (n3 != n4) {
            throw new RuntimeException("AnimKeyFrameSet size mismatch! keyframe " + this.d + ", frame size: " + n4 + ", actual read: " + n3);
        }
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.a;
    }

    public void a(int n2, d d2, int n3, int n4) {
        com.a.b.a.b b2 = com.a.b.a.b.a();
        this.a(b2, n3, d2, n2);
        this.c(b2, n3, d2, n2);
        this.b(b2, n3, d2, n2);
        d2.a(b2);
        b2.b();
    }

    void a(com.a.b.a.b b2, int n2, d d2, int n3) {
        Object object;
        Object object2;
        Object object3;
        float[] fArray = d2.e(this.d);
        float f2 = fArray[0];
        float f3 = fArray[1];
        float f4 = fArray[2];
        if (null != this.b[n2]) {
            object3 = this.b[n2][0];
            object2 = this.b[n2][1];
            object = this.b[n2][2];
            if (object3 != null) {
                f2 = ((g)object3).a(n3);
            }
            if (object2 != null) {
                f3 = ((g)object2).a(n3);
            }
            if (object != null) {
                f4 = ((g)object).a(n3);
            }
        }
        object3 = com.a.b.a.c.a();
        object3.b(1.0f, 0.0f, 0.0f, f2);
        object2 = com.a.b.a.c.a();
        object2.b(0.0f, 1.0f, 0.0f, f3);
        object = com.a.b.a.c.a();
        object.b(0.0f, 0.0f, 1.0f, f4);
        com.a.b.a.c c2 = com.a.b.a.c.a();
        c2.a((com.a.b.a.c)object);
        c2.a((com.a.b.a.c)object3);
        c2.a((com.a.b.a.c)object2);
        com.a.b.a.b b3 = com.a.b.a.b.a();
        b3.a(c2);
        b2.c(b3);
        object3.b();
        object2.b();
        object.b();
        c2.b();
        b3.b();
    }

    void b(com.a.b.a.b b2, int n2, d d2, int n3) {
        float[] fArray = d2.f(this.d);
        float f2 = fArray[0];
        float f3 = fArray[1];
        float f4 = fArray[2];
        if (this.b[n2] != null) {
            g g2 = this.b[n2][3];
            g g3 = this.b[n2][4];
            g g4 = this.b[n2][5];
            if (g2 != null) {
                f2 = g2.a(n3);
            }
            if (null != g3) {
                f3 = g3.a(n3);
            }
            if (null != g4) {
                f4 = g4.a(n3);
            }
        }
        b2.e[12] = f2;
        b2.e[13] = f3;
        b2.e[14] = f4;
    }

    void c(com.a.b.a.b b2, int n2, d d2, int n3) {
        Object object;
        float[] fArray = d2.g(this.d);
        float f2 = fArray[0];
        float f3 = fArray[1];
        float f4 = fArray[2];
        if (this.b[n2] != null) {
            object = this.b[n2][6];
            g g2 = this.b[n2][7];
            g g3 = this.b[n2][8];
            if (object != null) {
                f2 = ((g)object).a(n3);
            }
            if (g2 != null) {
                f3 = g2.a(n3);
            }
            if (g3 != null) {
                f4 = g3.a(n3);
            }
        }
        object = com.a.b.a.b.a();
        object.a(f2, f3, f4);
        b2.c((com.a.b.a.b)object);
        object.b();
    }
}

