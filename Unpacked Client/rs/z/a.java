/*
 * Decompiled with CFR 0.152.
 */
package rs.z;

import rs.z.b;

public class a
extends b {
    private long b;
    private long c;

    public a(long l2) {
        this.c = l2;
    }

    @Override
    public void a() {
        this.b = System.currentTimeMillis();
    }

    @Override
    public boolean b() {
        return System.currentTimeMillis() - this.b < this.c;
    }

    @Override
    public long c() {
        return !this.b() ? 0L : this.c - (System.currentTimeMillis() - this.b);
    }
}

