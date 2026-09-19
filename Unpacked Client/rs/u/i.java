/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.a.a.a.a
 */
package rs.u;

import com.a.a.a.a;

public class i
implements a {
    public static final i a = new i(0, 0);
    public static final i b = new i(1, 1);
    public static final i c = new i(4, 4);
    public static final i d = new i(3, 3);
    public static final i e = new i(2, 2);
    final int f;
    final int g;

    static i[] b() {
        return new i[]{a, b, e, d, c};
    }

    i(int n2, int n3) {
        this.f = n2;
        this.g = n3;
    }

    public static i a(int n2) {
        i i2 = (i)com.a.a.a.a.a((a[])i.b(), (int)n2);
        if (null == i2) {
            i2 = a;
        }
        return i2;
    }

    public int a() {
        return this.g;
    }
}

