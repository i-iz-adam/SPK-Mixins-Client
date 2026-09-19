/*
 * Decompiled with CFR 0.152.
 */
package rs.j.a;

import java.util.function.Consumer;
import java.util.function.Predicate;
import rs.Client;
import rs.j.a.b;
import rs.l.h;

public class d
extends rs.j.a.a {
    public static final int a = 6;
    private final b b;
    private h c;
    private h d;
    private String e = "";
    private a f;
    private String g;
    private String h;
    private String i;
    private Predicate<String> j = null;
    private Consumer<String> k = null;

    public d(b b2) {
        this.b = b2;
        this.k();
    }

    @Override
    public void a() {
        Client client = this.b.b();
        client.gb = false;
        client.fN = 6;
        client.dY = this.e;
        Client.fM = true;
    }

    @Override
    public void b() {
        this.j.test(this.b.b().dY);
    }

    public d a(a a2) {
        this.f = a2;
        return this;
    }

    public d a(String string) {
        this.g = string;
        return this;
    }

    public d b(String string) {
        this.e = string;
        return this;
    }

    public d a(Consumer<String> consumer) {
        this.j = string -> {
            consumer.accept((String)string);
            return true;
        };
        return this;
    }

    public String c(String string) {
        if (this.h.isEmpty() && this.i.isEmpty()) {
            return string;
        }
        return this.h + string + this.i;
    }

    public h c() {
        return this.c == null ? this.b.b().gn : this.c;
    }

    public h d() {
        return this.d == null ? this.b.b().gn : this.d;
    }

    private void k() {
        this.g = "Enter text:";
        this.h = "";
        this.i = "";
        this.c = null;
        this.d = null;
        this.f = rs.j.a.d$a.a;
        this.e = "";
    }

    public a e() {
        return this.f;
    }

    public String f() {
        return this.g;
    }

    public String g() {
        return this.h;
    }

    public String h() {
        return this.i;
    }

    public Predicate<String> i() {
        return this.j;
    }

    public Consumer<String> j() {
        return this.k;
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
            d = rs.j.a.d$a.a();
        }
    }
}

