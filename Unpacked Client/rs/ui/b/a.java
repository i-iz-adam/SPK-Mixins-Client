/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.b;

import java.util.Arrays;

class a {
    public static final int a = 10;
    public static final int b = 1024;
    private int[] c = new int[0];
    private int[] d = new int[0];
    private int e;

    a() {
    }

    private void c() {
        int n2 = this.c.length >> 10;
        int n3 = Math.max(1, n2 * 2);
        this.c = Arrays.copyOf(this.c, n3 * 1024);
        this.d = Arrays.copyOf(this.d, n3);
        int n4 = n2;
        while (n4 < n3) {
            this.d[this.e++] = n4++;
        }
    }

    public int[] a() {
        return this.c;
    }

    public int b() {
        if (this.e == 0) {
            this.c();
        }
        return this.d[--this.e];
    }

    public void a(int n2) {
        this.d[this.e++] = n2;
    }
}

