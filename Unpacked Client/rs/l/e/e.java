/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e;

import java.util.ArrayList;
import java.util.List;
import rs.Client;
import rs.l.b.a;
import rs.l.e.d;
import rs.l.f_0;

public class e {
    private static final int b = 460;
    private static final int c = 30;
    private static final long d = 650L;
    private static final double e = 1.05;
    private static final double f = 1.25;
    private long g;
    private Client h;
    public f_0[] a = new f_0[23];
    private List<d> i = new ArrayList<d>();
    private List<d> j = new ArrayList<d>();

    public e(Client client) {
        this.h = client;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new f_0(f_0.a(f_0.b("skills/" + i2), 13, 13));
        }
    }

    public void a(int n2, int n3) {
        if (n3 < 0) {
            return;
        }
        int[] nArray = new int[]{0, 1, 2, 4, 6};
        boolean bl = false;
        for (int n4 : nArray) {
            if (n2 != n4) continue;
            bl = true;
        }
        if (n3 == 0) {
            return;
        }
        d d2 = new d(n3, n2);
        d2.b = 460;
        d2.c = 0;
        if ((bl || n2 == 3) && System.currentTimeMillis() - this.g <= 650L && !this.i.isEmpty()) {
            d d3 = this.i.get(this.i.size() - 1);
            d3.d += n3;
            if (!d3.a.contains(n2)) {
                d3.a.add(n2);
            }
            this.g = System.currentTimeMillis();
            return;
        }
        this.g = System.currentTimeMillis();
        if (!this.b()) {
            this.j.add(d2);
        } else {
            this.i.add(d2);
        }
    }

    public void a() {
        int n2;
        ArrayList<d> arrayList = new ArrayList<d>();
        if (this.b() && !this.j.isEmpty()) {
            d d2 = this.j.get(0);
            this.i.add(d2);
            this.j.remove(d2);
            this.g = System.currentTimeMillis();
        }
        for (n2 = 0; n2 < this.i.size(); ++n2) {
            int n3;
            d d3 = this.i.get(n2);
            if (!rs.l.b.a.a()) {
                if (d3.f) {
                    d3.e = (int)((double)d3.e + 15.75);
                    if (d3.e >= 255) {
                        d3.e = 255;
                        d3.f = false;
                    }
                } else {
                    d3.e = (int)(255.0 - (double)d3.c * 1.05);
                }
                if (d3.e < 0) {
                    d3.e = 0;
                }
                d3.c = (int)((double)d3.c + 1.25);
            }
            int n4 = d3.d;
            String string = "+" + n4;
            if (n4 >= 10000) {
                string = "+" + Client.g(n4);
            }
            e e2 = this;
            int n5 = e2.h.ai() ? Client.ai - 750 : 4;
            e e3 = this;
            int n6 = e3.h.ai() ? 0 : 4;
            int n7 = 0;
            if (string.length() >= 6) {
                n5 -= 5;
                n7 -= 3;
            }
            if (string.length() == 5) {
                n5 -= 3;
                --n7;
            }
            if (this.h.v.g()) {
                for (n3 = 0; n3 < d3.a.size(); ++n3) {
                    this.a[d3.a.get(n3)].g(n5 + d3.b - n3 * 15 - (int)((double)string.length() * 0.75) + 9 + n7, n6 + d3.c + 3, d3.e);
                }
            }
            n3 = 35 + n5;
            int n8 = 15 + n6;
            if (this.h.v.g()) {
                Client.gl.d(string, d3.b + n3, d3.c + n8, 0xFFFFFF, 100, d3.e);
            }
            if (!(255.0 - (double)d3.c * 1.05 <= -10.0)) continue;
            arrayList.add(d3);
        }
        for (n2 = 0; n2 < arrayList.size(); ++n2) {
            this.i.remove(arrayList.get(n2));
        }
    }

    private boolean b() {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            if (this.i.get((int)i2).c > 40) continue;
            return false;
        }
        return true;
    }
}

