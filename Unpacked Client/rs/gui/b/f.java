/*
 * Decompiled with CFR 0.152.
 */
package rs.gui.b;

import rs.gui.b.g;
import rs.gui.x;

public class f {
    private final int a;
    private final int b;

    public f(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public f(int n2) {
        this.a = n2;
        this.b = 1;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public x c() {
        g g2 = new g(this.a);
        return g2.b();
    }
}

