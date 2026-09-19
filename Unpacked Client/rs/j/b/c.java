/*
 * Decompiled with CFR 0.152.
 */
package rs.j.b;

import java.util.HashMap;
import java.util.Map;
import rs.Client;
import rs.gui.Launcher;
import rs.h.b;

public class c {
    private static final Map<Integer, b> a = new HashMap<Integer, b>();
    private final int b;

    public c(int n2) {
        this.b = n2;
    }

    public static void a() {
        if (!a.isEmpty()) {
            a.clear();
        }
    }

    public c a(String string) {
        this.d().fx[this.b] = string;
        return this;
    }

    public c a(b b2) {
        a.put(this.b, b2);
        return this;
    }

    private Client d() {
        return Launcher.n().o();
    }

    public static Map<Integer, b> b() {
        return a;
    }

    public int c() {
        return this.b;
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
            d = rs.j.b.c$a.a();
        }
    }
}

