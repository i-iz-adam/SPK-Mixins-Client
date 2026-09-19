/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.f.b.cc
 */
package rs.n.b;

import gnu.trove.f.b.cc;
import java.util.ArrayList;
import java.util.List;
import rs.n.b.a;

public class b<T extends a> {
    private final cc<List<T>> a = new cc();

    public void a(int n2, T t2) {
        if (this.a.b(n2) == null) {
            this.a.a(n2, new ArrayList());
        }
        ((List)this.a.b(n2)).add(t2);
    }

    public void a(int n2) {
        if (this.a.b(n2) != null) {
            for (a a2 : (List)this.a.b(n2)) {
                a2.b();
            }
        }
    }

    public void a() {
        this.a.clear();
    }

    public cc<List<T>> b() {
        return this.a;
    }
}

