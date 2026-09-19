/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.a;

import rs.c_0;

public class o {
    private final int a;
    private final int b;
    private final int c;

    public o(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public o a(int n2) {
        if ((n2 = (n2 + 1024) % 2048) == 0) {
            return this;
        }
        int n3 = c_0.hA[n2];
        int n4 = c_0.hB[n2];
        return new o(this.a * n4 + this.c * n3 >> 16, this.b, this.c * n4 - this.a * n3 >> 16);
    }
}

