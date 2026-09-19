/*
 * Decompiled with CFR 0.152.
 */
package rs.s.q.a;

public class b {
    private String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g = false;

    public b(String string) {
        this.a = string;
    }

    public void a(int n2) {
        this.d += n2;
    }

    public void a(boolean bl) {
        ++this.c;
        if (bl) {
            ++this.b;
        }
    }

    public void b(boolean bl) {
        ++this.e;
        if (bl) {
            ++this.f;
        }
    }

    public void a(int n2, int n3) {
        this.e = n3;
        this.f = n2;
    }

    public void b(int n2, int n3) {
        this.c = n3;
        this.b = n2;
    }

    public float a() {
        return Math.min(1.0f, this.f == 0 && this.e == 0 ? 0.0f : (float)this.f / (float)this.e);
    }

    public float b() {
        return Math.min(1.0f, this.b == 0 && this.c == 0 ? 0.0f : (float)this.b / (float)this.c);
    }

    public String b(int n2) {
        if (this.d < n2) {
            return this.d + " (" + (this.d - n2) + ")";
        }
        return this.d + " (+" + (this.d - n2) + ")";
    }

    public String c() {
        int n2 = (int)Math.ceil(this.a() * 100.0f);
        return this.f + "/" + this.e + " (" + n2 + "%)";
    }

    public String d() {
        int n2 = (int)Math.ceil(this.b() * 100.0f);
        return this.b + "/" + this.c + " (" + n2 + "%)";
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int i() {
        return this.f;
    }

    public boolean j() {
        return this.g;
    }

    public String k() {
        return this.a;
    }

    public void a(String string) {
        this.a = string;
    }

    public void c(int n2) {
        this.b = n2;
    }

    public void d(int n2) {
        this.c = n2;
    }

    public void e(int n2) {
        this.d = n2;
    }

    public void f(int n2) {
        this.e = n2;
    }

    public void g(int n2) {
        this.f = n2;
    }

    public void c(boolean bl) {
        this.g = bl;
    }
}

