/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import rs.Client;
import rs.a.f;
import rs.f.a;

public class e {
    CopyOnWriteArrayList<f> a = new CopyOnWriteArrayList();
    f[] b = new f[4];

    public boolean a(int n2, int n3, int n4, int n5, boolean bl) {
        if (rs.f.a.ak && (n3 *= rs.f.a.ak && n3 > 0 ? 10 : 1) > 0 && n2 != 3 && n2 != 2) {
            n3 += new Random().nextInt(9);
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            if (this.b[i2] != null && this.b[i2].g() > n4) continue;
            if (this.b[i2] == null) {
                this.b[i2] = new f(n2, n3, n5);
            } else {
                this.b[i2].e(n3);
                this.b[i2].c(n5);
                this.b[i2].d(n2);
            }
            this.b[i2].a(0);
            this.b[i2].b(230);
            this.b[i2].g(n4 + 70);
            return true;
        }
        if (bl) {
            this.a.add(new f(n2, n3, n5));
        }
        return false;
    }

    public final void a() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            f f2 = this.a.get(i2);
            if (!this.a(f2.d(), f2.e(), Client.ff, f2.c(), false)) continue;
            this.a.remove(f2);
        }
    }

    public boolean a(int n2) {
        if (this.b[n2] == null) {
            return false;
        }
        return this.b[n2].g() > Client.ff;
    }

    public void b() {
        this.b = new f[4];
        this.a.clear();
    }

    public CopyOnWriteArrayList<f> c() {
        return this.a;
    }

    public f[] d() {
        return this.b;
    }
}

