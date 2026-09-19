/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.c;

import rs.Client;
import rs.n.a.f;
import rs.n.e;

public class b {
    private int a = 0;

    public void a() {
        rs.n.c.c.a.d.b();
        e.l((int)32023).V = 0;
        this.a = 0;
    }

    public void a(a a2, String string) {
        int n2 = this.a++;
        int n3 = 32026 + n2 * 4;
        rs.n.a.b b2 = rs.n.a.a.a(n3, rs.n.c.c.a.cb, "View inbox message").b(n3 + 1, rs.n.c.c.a.cc).h(149, 30);
        rs.n.c.c.a.d.a(n3).a(0, 30 * n2);
        rs.n.c.c.a.d.a(n3 + 1).a(0, 30 * n2);
        rs.n.c.c.a.d.a(f.a(n3 + 3, string).a()).a(3, 30 * n2 + 10);
        this.a(n2, string);
        this.a(n2, a2);
    }

    public void b() {
        e e2 = rs.n.c.c.a.l(32023);
        e2.aH = Math.max(rs.n.c.c.a.d.d().size() * 30, 300);
        e2.V = 0;
        rs.n.c.c.a.d.a();
    }

    public void a(int n2, a a2) {
        int n3 = 32026 + n2 * 4 + 3;
        f f2 = (f)e.l(n3);
        f2.m(a2.a());
        if (a2 == rs.n.c.c.b$a.a) {
            if (!f2.at.contains("<img=50>")) {
                f2.at = "<img=50> " + f2.at;
            }
        } else {
            f2.at = f2.at.replace("<img=50> ", "");
        }
    }

    public void a(int n2, String string) {
        int n3 = 32026 + n2 * 4 + 3;
        f f2 = (f)e.l(n3);
        f2.at = string = Client.gl.a(string, "", 130, 0, 1);
        if (string.contains("\\n")) {
            rs.n.c.c.a.d.b(n3).a(3, 30 * n2 + 3);
        } else {
            rs.n.c.c.a.d.b(n3).a(3, 30 * n2 + 10);
        }
    }

    public void a(int n2, boolean bl) {
        int n3 = 32026 + n2 * 4;
        int n4 = 32026 + n2 * 4 + 1;
        if (e.l(n3) == null || e.l(n4) == null || e.l(n4 + 1) == null) {
            return;
        }
        if (bl) {
            e.l((int)n3).E = rs.n.c.c.a.cd;
            e.l((int)n3).aG = rs.n.c.c.a.cd;
            e.l((int)n4).E = rs.n.c.c.a.ce;
            e.l((int)n4).aG = rs.n.c.c.a.ce;
            e.l((int)(n4 + 1)).E = rs.n.c.c.a.ce;
            e.l((int)(n4 + 1)).aG = rs.n.c.c.a.ce;
        } else {
            e.l((int)n3).E = rs.n.c.c.a.cb;
            e.l((int)n3).aG = rs.n.c.c.a.cb;
            e.l((int)n4).E = rs.n.c.c.a.cc;
            e.l((int)n4).aG = rs.n.c.c.a.cc;
            e.l((int)(n4 + 1)).E = rs.n.c.c.a.cc;
            e.l((int)(n4 + 1)).aG = rs.n.c.c.a.cc;
        }
    }

    public void c() {
        for (int i2 = 0; i2 < this.a; ++i2) {
            this.a(i2, false);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(3145498);
        public static final /* enum */ a b = new a(12171349);
        private final int c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public int a() {
            return this.c;
        }

        private a(int n3) {
            this.c = n3;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            d = rs.n.c.c.b$a.b();
        }
    }
}

