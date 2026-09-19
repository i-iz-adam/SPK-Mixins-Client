/*
 * Decompiled with CFR 0.152.
 */
package rs.j.b;

import rs.Client;
import rs.c_0;
import rs.j.b.b;

public class a {
    private String a;
    private int b;
    private int c;
    private b[] d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public a(String string, int n2) {
        this.a = string;
        this.b = n2;
        this.d = new b[10];
        this.i = -1;
    }

    public a a(String string, rs.h.b b2) {
        if (this.c == this.d.length) {
            return this;
        }
        b b3 = new b();
        b3.a(string);
        b3.a(b2);
        this.d[this.c++] = b3;
        this.a(string);
        return this;
    }

    public void a(String string) {
        int n2 = Client.gj.a(this.a);
        int n3 = Client.gj.a(string);
        if (this.e < n2) {
            this.e = n2 + 10;
        }
        if (this.e < n3) {
            this.e = n3 + 10;
        }
        this.f = 15 * this.c + 22;
    }

    public boolean a() {
        int n2 = this.g;
        int n3 = this.h;
        int n4 = c_0.hP;
        int n5 = c_0.hQ;
        int n6 = 25;
        return n4 >= n2 - n6 && n4 <= n2 + this.e + n6 && n5 >= n3 - n6 && n5 <= n3 + this.f + n6;
    }

    public b b() {
        if (this.i >= 0) {
            return this.d[this.i];
        }
        return null;
    }

    public String c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public int e() {
        return this.c;
    }

    public b[] f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public void b(int n2) {
        this.g = n2;
    }

    public int j() {
        return this.h;
    }

    public void c(int n2) {
        this.h = n2;
    }

    public int k() {
        return this.i;
    }

    public void d(int n2) {
        this.i = n2;
    }
}

