/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e;

import rs.l.b.a;
import rs.l.f_0;

public class g {
    public static final double a = 1.05;
    public static final double b = 1.25;
    private static boolean o;
    private static f_0 p;
    private static f_0 q;
    public static f_0 c;
    public static f_0 d;
    public static f_0 e;
    public f_0 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;

    public g(int n2, int n3) {
        this.i = n2;
        this.j = n3;
        this.n = true;
        this.k = 0;
        if (!o) {
            p = new f_0("popups/block drop");
            q = new f_0("popups/hit drop");
            c = new f_0("popups/protmelee");
            e = new f_0("popups/protrange");
            d = new f_0("popups/protmagic");
            o = true;
        }
        this.f = n2 == 0 ? p : q;
    }

    public void a() {
        if (rs.l.b.a.a()) {
            return;
        }
        if (this.n) {
            this.k = (int)((double)this.k + 15.75);
            if (this.k >= 255) {
                this.k = 255;
                this.n = false;
            }
        } else {
            this.k = (int)(255.0 - (double)this.h * 1.05);
        }
        if (this.k < 0) {
            this.k = 0;
        }
        this.h = (int)((double)this.h + 1.25);
    }
}

