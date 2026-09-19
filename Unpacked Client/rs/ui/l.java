/*
 * Decompiled with CFR 0.152.
 */
package rs.ui;

import java.awt.image.BufferedImage;
import java.util.Map;
import rs.ui.m;

public class l {
    private final BufferedImage a;
    private boolean b;
    private final String c;
    private boolean d;
    private Runnable e;
    private Runnable f;
    private m g;
    private int h;
    private Map<String, Runnable> i;

    private static boolean m() {
        return true;
    }

    private static String n() {
        return "";
    }

    l(BufferedImage bufferedImage, boolean bl, String string, boolean bl2, Runnable runnable, Runnable runnable2, m m2, int n2, Map<String, Runnable> map) {
        this.a = bufferedImage;
        this.b = bl;
        this.c = string;
        this.d = bl2;
        this.e = runnable;
        this.f = runnable2;
        this.g = m2;
        this.h = n2;
        this.i = map;
    }

    public static a a() {
        return new a();
    }

    public BufferedImage b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public Runnable f() {
        return this.e;
    }

    public Runnable g() {
        return this.f;
    }

    public m h() {
        return this.g;
    }

    public int i() {
        return this.h;
    }

    public Map<String, Runnable> j() {
        return this.i;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    public void a(Runnable runnable) {
        this.e = runnable;
    }

    public void b(Runnable runnable) {
        this.f = runnable;
    }

    public void a(m m2) {
        this.g = m2;
    }

    public void a(int n2) {
        this.h = n2;
    }

    public void a(Map<String, Runnable> map) {
        this.i = map;
    }

    public String toString() {
        return "NavigationButton(icon=" + String.valueOf(this.b()) + ", tab=" + this.c() + ", tooltip=" + this.d() + ", selected=" + this.e() + ", onClick=" + String.valueOf(this.f()) + ", onSelect=" + String.valueOf(this.g()) + ", panel=" + String.valueOf(this.h()) + ", priority=" + this.i() + ", popup=" + String.valueOf(this.j()) + ")";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        l l2 = (l)object;
        if (!l2.a(this)) {
            return false;
        }
        String string = this.d();
        String string2 = l2.d();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    protected boolean a(Object object) {
        return object instanceof l;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        String string = this.d();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        return n3;
    }

    public static class a {
        private BufferedImage a;
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private boolean f;
        private Runnable g;
        private Runnable h;
        private m i;
        private int j;
        private Map<String, Runnable> k;

        a() {
        }

        public a a(BufferedImage bufferedImage) {
            this.a = bufferedImage;
            return this;
        }

        public a a(boolean bl) {
            this.c = bl;
            this.b = true;
            return this;
        }

        public a a(String string) {
            this.e = string;
            this.d = true;
            return this;
        }

        public a b(boolean bl) {
            this.f = bl;
            return this;
        }

        public a a(Runnable runnable) {
            this.g = runnable;
            return this;
        }

        public a b(Runnable runnable) {
            this.h = runnable;
            return this;
        }

        public a a(m m2) {
            this.i = m2;
            return this;
        }

        public a a(int n2) {
            this.j = n2;
            return this;
        }

        public a a(Map<String, Runnable> map) {
            this.k = map;
            return this;
        }

        public l a() {
            boolean bl = this.c;
            if (!this.b) {
                bl = l.m();
            }
            String string = this.e;
            if (!this.d) {
                string = l.n();
            }
            return new l(this.a, bl, string, this.f, this.g, this.h, this.i, this.j, this.k);
        }

        public String toString() {
            return "NavigationButton.NavigationButtonBuilder(icon=" + String.valueOf(this.a) + ", tab$value=" + this.c + ", tooltip$value=" + this.e + ", selected=" + this.f + ", onClick=" + String.valueOf(this.g) + ", onSelect=" + String.valueOf(this.h) + ", panel=" + String.valueOf(this.i) + ", priority=" + this.j + ", popup=" + String.valueOf(this.k) + ")";
        }
    }
}

