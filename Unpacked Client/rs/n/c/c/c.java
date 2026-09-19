/*
 * Decompiled with CFR 0.152.
 */
package rs.n.c.c;

import rs.n.e;

public class c {
    private boolean a = false;
    private static final int[] b = new int[]{32177, 32167, 32166, 32184, 32181, 32178, 32176, 32170, 32169, 32168};

    public void a() {
        e.l((int)32177).V = 0;
    }

    public void b() {
        e.l((int)32021).bf = true;
        e.l((int)32188).bf = false;
        for (int n2 : b) {
            e.l((int)n2).bf = false;
        }
        this.a = true;
    }

    public void c() {
        this.a();
        e.l((int)32021).bf = false;
        for (int n2 : b) {
            e.l((int)n2).bf = true;
        }
        this.a = false;
    }

    public void a(a a2) {
        switch (a2) {
            case a: {
                this.a(false);
                e.l((int)32177).bf = false;
                e.l((int)32178).bf = false;
                e.l((int)32181).bf = false;
                e.l((int)32188).bf = false;
                break;
            }
            case c: {
                this.a(true);
                e.l((int)32177).bf = true;
                e.l((int)32177).aH = 0;
                e.l((int)32176).at = "@gre@Items have been claimed!";
                e.l((int)32178).bf = false;
                e.l((int)32181).bf = false;
                e.l((int)32188).bf = true;
                break;
            }
            case b: {
                this.a(true);
                this.a(184);
                e.l((int)32177).bf = true;
                e.l((int)32177).aH = 500;
                e.l((int)32176).at = "";
                e.l((int)32178).bf = true;
                e.l((int)32181).bf = true;
                e.l((int)32188).bf = false;
            }
        }
    }

    public void d() {
        e.l((int)32177).aH = 0;
    }

    public void e() {
        e.l((int)32177).aH = 500;
    }

    private void a(boolean bl) {
        e.l((int)32170).bf = bl;
        e.l((int)32176).bf = bl;
        e.l((int)32167).bf = bl;
        if (bl) {
            this.a(184);
        } else {
            this.a(265);
        }
    }

    private void a(int n2) {
        rs.n.c.c.a.cf = n2;
    }

    public boolean f() {
        return this.a;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = rs.n.c.c.c$a.a();
        }
    }
}

