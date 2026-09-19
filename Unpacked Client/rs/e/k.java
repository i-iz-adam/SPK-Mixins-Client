/*
 * Decompiled with CFR 0.152.
 */
package rs.e;

public class k {
    private final long a;
    private String b;
    private boolean c;
    private boolean d;
    private long e;

    public boolean a() {
        return this.b.startsWith("$");
    }

    k(long l2) {
        this.a = l2;
    }

    public String toString() {
        return "ConfigProfile(id=" + this.b() + ", name=" + this.c() + ", sync=" + this.d() + ", active=" + this.e() + ", rev=" + this.f() + ")";
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    void a(String string) {
        this.b = string;
    }

    public boolean d() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public boolean e() {
        return this.d;
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    long f() {
        return this.e;
    }

    void a(long l2) {
        this.e = l2;
    }
}

