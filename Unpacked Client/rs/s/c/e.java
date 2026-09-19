/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.c;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.inject.Inject;
import rs.l.f.b.d;
import rs.s.c.h;

public class e
extends d {
    private final rs.s.c.a h;
    private final Queue<a> i = new ArrayDeque<a>();

    @Inject
    public e(rs.s.c.a a2) {
        this.h = a2;
    }

    @Override
    public void a() {
        if (!this.h.f()) {
            return;
        }
        rs.n.e e2 = rs.n.e.H[this.g];
        h h2 = rs.s.c.h.j.get(e2.aI);
        if (e2.aH > 0) {
            h2 = rs.s.c.h.a;
        }
        if (h2 == null) {
            return;
        }
        if (!this.h.j().contains((Object)h2)) {
            return;
        }
        String string = "[" + h2.name() + "]";
        String string2 = this.g + (String)(this.h.g() ? string : "");
        if (this.h.h() && e2.al != null) {
            this.i.add(new a(string2, this.e, this.f, h2));
        }
        if (this.h.i() && e2.al == null) {
            this.i.add(new a(string2, this.e, this.f, h2));
        }
    }

    public Queue<a> k() {
        return this.i;
    }

    static final class a {
        private final String a;
        private final int b;
        private final int c;
        private final h d;

        public a(String string, int n2, int n3, h h2) {
            this.a = string;
            this.b = n2;
            this.c = n3;
            this.d = h2;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public h d() {
            return this.d;
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            a a2 = (a)object;
            if (this.b() != a2.b()) {
                return false;
            }
            if (this.c() != a2.c()) {
                return false;
            }
            String string = this.a();
            String string2 = a2.a();
            if (string == null ? string2 != null : !string.equals(string2)) {
                return false;
            }
            h h2 = this.d();
            h h3 = a2.d();
            return !(h2 == null ? h3 != null : !((Object)((Object)h2)).equals((Object)h3));
        }

        public int hashCode() {
            int n2 = 59;
            int n3 = 1;
            n3 = n3 * 59 + this.b();
            n3 = n3 * 59 + this.c();
            String string = this.a();
            n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
            h h2 = this.d();
            n3 = n3 * 59 + (h2 == null ? 43 : ((Object)((Object)h2)).hashCode());
            return n3;
        }

        public String toString() {
            return "DevToolsWidgetOverlay.WidgetDisplay(text=" + this.a() + ", x=" + this.b() + ", y=" + this.c() + ", type=" + String.valueOf((Object)this.d()) + ")";
        }
    }
}

