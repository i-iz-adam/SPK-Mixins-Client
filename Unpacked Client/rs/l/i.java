/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

public class i {
    private final int a;
    private int b = 0;
    private int c = 1;

    public i(int n2) {
        this.a = n2;
    }

    public void a() {
        this.b += this.c;
        if (this.b >= this.a) {
            this.c = -1;
        } else if (this.b <= 0) {
            this.c = 1;
        }
    }

    public int b() {
        return this.b;
    }
}

