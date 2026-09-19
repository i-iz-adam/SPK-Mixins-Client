/*
 * Decompiled with CFR 0.152.
 */
package rs;

/*
 * Renamed from rs.S
 */
public final class s_0 {
    public int[] a;

    public s_0(int n2) {
        this.a = new int[n2 * 4];
    }

    public int a() {
        return this.a.length / 4;
    }

    public int a(int n2) {
        return this.a[n2 * 4];
    }

    public int b(int n2) {
        return this.a[n2 * 4 + 1];
    }

    public int c(int n2) {
        return this.a[n2 * 4 + 2];
    }

    public int d(int n2) {
        return this.a[n2 * 4 + 3];
    }

    public void a(int n2, int n3) {
        this.a[n2 * 4] = n3;
    }

    public void b(int n2, int n3) {
        this.a[n2 * 4 + 1] = n3;
    }

    public void c(int n2, int n3) {
        this.a[n2 * 4 + 2] = n3;
    }

    public void d(int n2, int n3) {
        this.a[n2 * 4 + 3] = n3;
    }

    public void e(int n2, int n3) {
        int n4 = n2 * 4;
        this.a[n4] = this.a[n4] + n3;
    }

    public void f(int n2, int n3) {
        int n4 = n2 * 4 + 1;
        this.a[n4] = this.a[n4] + n3;
    }

    public void g(int n2, int n3) {
        int n4 = n2 * 4 + 2;
        this.a[n4] = this.a[n4] + n3;
    }

    public void h(int n2, int n3) {
        int n4 = n2 * 4 + 3;
        this.a[n4] = this.a[n4] + n3;
    }

    public boolean e(int n2) {
        return this.a(n2) == -2147483647;
    }
}

