/*
 * Decompiled with CFR 0.152.
 */
package rs.a;

public class d {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public d(int n2) {
        this.a = new int[n2 * 3];
    }

    public int a(int n2) {
        return this.a[n2 * 3];
    }

    public int b(int n2) {
        return this.a[n2 * 3 + 1];
    }

    public int c(int n2) {
        return this.a[n2 * 3 + 2];
    }

    public void a(int n2, int n3) {
        this.a[n2 * 3] = n3;
    }

    public void b(int n2, int n3) {
        this.a[n2 * 3 + 1] = n3;
    }

    public void c(int n2, int n3) {
        this.a[n2 * 3 + 2] = n3;
    }

    public void d(int n2, int n3) {
        int n4 = n2 * 3;
        this.a[n4] = this.a[n4] + n3;
    }

    public void e(int n2, int n3) {
        int n4 = n2 * 3 + 1;
        this.a[n4] = this.a[n4] + n3;
    }

    public void f(int n2, int n3) {
        int n4 = n2 * 3 + 2;
        this.a[n4] = this.a[n4] + n3;
    }

    public int a() {
        return this.a.length / 3;
    }
}

