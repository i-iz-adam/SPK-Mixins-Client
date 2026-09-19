/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.runelite.a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.runelite.a.k;
import rs.runelite.a.l;
import rs.runelite.a.m;

public class j {
    private static final Logger b = LoggerFactory.getLogger(j.class);

    private j() {
    }

    @Nullable
    public static l<m> a(List<c> list) {
        if (list.size() == 0) {
            return null;
        }
        boolean bl = b.isTraceEnabled();
        list.sort(Comparator.comparingInt(c::a));
        ArrayList<c> arrayList = new ArrayList<c>(list);
        arrayList.sort(Comparator.comparingInt(c::c));
        e e2 = new e();
        l<m> l2 = new l<m>(new ArrayList());
        a a2 = new a(l2);
        int n2 = 0;
        int n3 = 0;
        while (true) {
            c c2;
            boolean bl2;
            c c3 = null;
            c c4 = null;
            if (n2 < list.size()) {
                c3 = list.get(n2);
            }
            if (n3 < arrayList.size()) {
                c4 = (c)arrayList.get(n3);
            }
            if (c3 == null && c4 == null) break;
            boolean bl3 = bl2 = c3 == null || c4 != null && c4.c < c3.a;
            if (bl2) {
                a2.c = -1;
                a2.b = c4.c;
                ++n3;
                c2 = c4;
            } else {
                a2.c = 1;
                a2.b = c3.a;
                ++n2;
                c2 = c3;
            }
            if (bl) {
                b.trace("{}{}", (Object)(bl2 ? "-" : "+"), (Object)c2);
            }
            int n4 = c2.b;
            int n5 = c2.d;
            d d2 = e2.a(n4);
            if (d2 == null) {
                d2 = e2.a(null, n4);
            }
            if (d2.e != n4) {
                d2 = e2.a(d2, n4);
                d2.f = d2.b.f;
            }
            do {
                if (d2.a == null || d2.a.e > n5) {
                    e2.a(d2, n5);
                }
                a2.a(d2);
                d2 = d2.a;
            } while (d2.e != n5);
            a2.b(d2);
            if (!bl) continue;
            d d3 = e2.a;
            while (d3 != null) {
                Object object = "";
                if (d3.c != null) {
                    object = (d3.d ? ">" : "[") + System.identityHashCode(d3.c) + (d3.d ? "]" : "<");
                }
                b.trace("{} = {} {}", new Object[]{d3.e, d3.f, object});
                d3 = d3.a;
            }
            b.trace("");
        }
        assert (e2.a());
        return l2;
    }

    private static class e {
        d a;

        d a(int n2) {
            d d2 = this.a;
            if (d2 == null || d2.e > n2) {
                return null;
            }
            while (d2.e != n2) {
                d d3 = d2.a;
                if (d3 == null || d3.e > n2) {
                    return d2;
                }
                d2 = d3;
            }
            return d2;
        }

        d a(d d2, int n2) {
            d d3 = new d();
            d3.e = n2;
            if (d2 != null) {
                if (d2.a != null) {
                    d3.a = d2.a;
                    d3.a.b = d3;
                }
                d3.f = d2.f;
                d2.a = d3;
                d3.b = d2;
            } else {
                if (this.a != null) {
                    d3.a = this.a;
                    this.a.b = d3;
                }
                this.a = d3;
            }
            return d3;
        }

        boolean a() {
            d d2 = this.a;
            while (d2 != null) {
                if (d2.f != 0 || d2.c != null) {
                    return false;
                }
                d2 = d2.a;
            }
            return true;
        }
    }

    private static class a {
        final l<m> a;
        int b;
        int c;
        d d;

        void a(d d2) {
            int n2 = d2.f;
            d2.f += this.c;
            if (n2 <= 0 ^ d2.f <= 0) {
                if (this.d == null) {
                    this.d = d2;
                }
            } else {
                this.b(d2);
            }
        }

        void b(d d2) {
            if (this.d == null) {
                return;
            }
            if (this.d.c != null && d2.c != null) {
                this.c(this.d);
                this.c(d2);
                if (this.d.c == d2.c) {
                    b b2 = this.d.c;
                    this.d.c = null;
                    d2.c = null;
                    b2.a = null;
                    b2.b = null;
                    this.a.a().add(b2);
                } else {
                    b b3;
                    b b4;
                    if (!d2.d) {
                        b4 = d2.c;
                        b3 = this.d.c;
                    } else {
                        b4 = this.d.c;
                        b3 = d2.c;
                    }
                    b.trace("Joining {} onto {}", (Object)System.identityHashCode(b3), (Object)System.identityHashCode(b4));
                    if (this.d.d == d2.d) {
                        b.trace("reverse");
                        if (this.d.d) {
                            b4.a();
                        } else {
                            b3.a();
                        }
                    }
                    b.trace("{} {}", (Object)this.d.e, (Object)d2.e);
                    b3.a(b4);
                    this.d.c = null;
                    d2.c = null;
                    b4.b.c = null;
                    b3.a.c = null;
                    b4.b = b3.b;
                    b4.a.c = b4;
                    b4.b.c = b4;
                }
            } else if (this.d.c == null && d2.c == null) {
                this.d.c = new b(null);
                this.d.c.b = this.d;
                this.d.d = false;
                d2.c = this.d.c;
                this.d.c.a = d2;
                d2.d = true;
                this.c(this.d);
                this.c(d2);
            } else if (this.d.c == null) {
                this.c(d2);
                this.a(this.d, d2);
                this.c(this.d);
            } else {
                this.c(this.d);
                this.a(d2, this.d);
                this.c(d2);
            }
            this.d = null;
        }

        private void a(d d2, d d3) {
            d2.c = d3.c;
            d2.d = d3.d;
            d3.c = null;
            if (d2.d) {
                assert (d2.c.a == d3);
                d2.c.a = d2;
            } else {
                assert (d2.c.b == d3);
                d2.c.b = d2;
            }
        }

        private void c(d d2) {
            if (d2.d) {
                d2.c.a(this.b, d2.e);
                assert (d2.c.a == d2);
            } else {
                d2.c.b(this.b, d2.e);
                assert (d2.c.b == d2);
            }
        }

        public a(l<m> l2) {
            this.a = l2;
        }
    }

    public static class c {
        private final int a;
        private final int b;
        private final int c;
        private final int d;

        public c(int n2, int n3, int n4, int n5) {
            this.a = n2;
            this.b = n3;
            this.c = n4;
            this.d = n5;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public String toString() {
            return "RectangleUnion.Rectangle(x1=" + this.a() + ", y1=" + this.b() + ", x2=" + this.c() + ", y2=" + this.d() + ")";
        }
    }

    private static class d {
        d a;
        d b;
        b c;
        boolean d;
        int e;
        int f;
    }

    private static class b
    extends m {
        d a;
        d b;

        private b() {
        }

        @Override
        public void a() {
            super.a();
            assert (!this.b.d);
            assert (this.a.d);
            d d2 = this.a;
            this.a = this.b;
            this.b = d2;
            this.b.d = false;
            this.a.d = true;
        }

        /* synthetic */ b(k k2) {
            this();
        }
    }
}

