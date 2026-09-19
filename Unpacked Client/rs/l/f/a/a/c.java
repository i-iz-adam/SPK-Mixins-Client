/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.a;

import java.util.ArrayList;
import java.util.List;
import rs.l.f.a;
import rs.l.f.b;

public class c
extends b {
    private static final int e = 3;
    private rs.l.f.a.a.a f = null;
    private List<rs.l.f.a.a.a> g = new ArrayList<rs.l.f.a.a.a>();

    public c() {
        this.a(rs.l.f.a.v);
    }

    @Override
    public void a() {
        if (this.f == null) {
            if (this.g.size() > 0) {
                this.f = this.g.get(this.g.size() - 1);
                this.f.a(System.currentTimeMillis());
                this.g.remove(this.g.size() - 1);
            } else {
                return;
            }
        }
        this.f.a();
        if (System.currentTimeMillis() - this.f.e() >= 5000L) {
            this.f = null;
        }
    }

    public void a(String string, String string2, String string3) {
        if (this.f == null) {
            this.f = new rs.l.f.a.a.a(string, string2, string3);
        } else {
            this.b(string, string2, string3);
        }
    }

    public void b(String string, String string2, String string3) {
        for (rs.l.f.a.a.a a2 : this.g) {
            if (!a2.b().equals(string) || !a2.c().equals(string2) || !a2.d().equals(string3)) continue;
            return;
        }
        if (this.g.size() >= 3) {
            this.g.remove(0);
        }
        this.g.add(new rs.l.f.a.a.a(string, string2, string3));
    }
}

