/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import rs.gui.b.c.c;
import rs.gui.b.e;
import rs.gui.b.f;

public class a {
    public static final int a = 0;
    public static final int b = 1;
    private String c;
    private Color d;
    private e e;
    private a f = rs.gui.b.a$a.a;
    private int g;
    private int h;
    private int i = 1;
    private final f[] j = new f[28];
    private final Map<c, f> k = new HashMap<c, f>();
    private int l;
    private final int[] m = new int[7];

    public a(String string) {
        this.c = string;
        this.g = 0;
        this.h = 0;
        this.l = 0;
        this.d = Color.WHITE;
        for (int i2 = 0; i2 < this.m.length; ++i2) {
            this.m[i2] = 99;
        }
    }

    public Map<c, f> a() {
        return this.k;
    }

    public int b() {
        return this.g;
    }

    public void a(int n2) {
        this.g = n2;
    }

    public int[] c() {
        return this.m;
    }

    public f[] d() {
        return this.j;
    }

    public void a(int n2, f f2) {
        this.j[n2] = f2;
    }

    public int e() {
        return this.i;
    }

    public void b(int n2) {
        this.i = n2;
    }

    public String f() {
        return this.c;
    }

    public void a(String string) {
        this.c = string;
    }

    public a g() {
        return this.f;
    }

    public void a(a a2) {
        this.f = a2;
    }

    public void a(c c2, int n2) {
        this.k.put(c2, new f(n2));
    }

    public void a(c c2, f f2) {
        this.k.put(c2, f2);
    }

    public int h() {
        return this.h;
    }

    public void c(int n2) {
        this.h = n2;
    }

    public void d(int n2) {
        this.l = n2;
    }

    public int i() {
        return this.l;
    }

    public Color j() {
        return this.d;
    }

    public void a(Color color) {
        this.d = color;
    }

    public e k() {
        return this.e;
    }

    public void a(e e2) {
        this.e = e2;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0, "/assets/gui/lunar.png", "Lunar");
        public static final /* enum */ a b = new a(1, "/assets/gui/ancients.png", "Ancients");
        public static final /* enum */ a c = new a(2, "/assets/gui/modern.png", "Modern");
        private String d;
        private String e;
        private int f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private a(int n3, String string2, String string3) {
            this.f = n3;
            this.e = string2;
            this.d = string3;
        }

        public String a() {
            return this.e;
        }

        public String b() {
            return this.d;
        }

        public int c() {
            return this.f;
        }

        public static a a(int n2) {
            for (a a2 : rs.gui.b.a$a.values()) {
                if (a2.c() != n2) continue;
                return a2;
            }
            return a;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{a, b, c};
        }

        static {
            g = rs.gui.b.a$a.d();
        }
    }
}

