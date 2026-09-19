/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.f;

import java.util.ArrayList;
import java.util.List;
import rs.Client;
import rs.l.f.a;
import rs.l.f.a.f.b;

public class c
extends rs.l.f.b {
    private static final int e = 1000;
    private final List<rs.l.f.a.f.a> f = new ArrayList<rs.l.f.a.f.a>();
    private final List<rs.l.f.a.f.a> g = new ArrayList<rs.l.f.a.f.a>();

    public c() {
        this.a(rs.l.f.a.A);
    }

    @Override
    public void a() {
        int n2;
        if (this.f.size() == 0) {
            return;
        }
        for (n2 = 0; n2 < this.f.size(); ++n2) {
            rs.l.f.a.f.a a2 = this.f.get(n2);
            a2.a();
            if (!rs.l.b.a.a()) {
                a2.b();
            }
            if (a2.c()) continue;
            this.g.add(a2);
        }
        for (n2 = 0; n2 < this.g.size(); ++n2) {
            this.f.remove(this.g.get(n2));
        }
        this.g.clear();
    }

    public void c(int n2, int n3) {
        if (Client.cH == -1) {
            return;
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6) {
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < n2; ++i3) {
                rs.l.f.a.f.a a2 = new rs.l.f.a.f.a(n3, n4, n5);
                if (i2 == 0 || i2 == 2) {
                    a2.a(rs.l.f.a.f.b.b);
                } else {
                    a2.a(rs.l.f.a.f.b.a);
                }
                a2.b(i2 >= 2 ? -0.25 : 0.25);
                a2.a((double)(1 + Client.d(25)));
                a2.b(3, 3);
                a2.e(1 + Client.d(2));
                a2.i(n6);
                this.a(a2);
            }
        }
    }

    public void b(int n2, int n3, int n4, int n5) {
        this.a(n2, n3, n4, n5, 255);
    }

    public void a(rs.l.f.a.f.a a2) {
        if (this.f.size() >= 1000) {
            return;
        }
        this.f.add(a2);
    }
}

