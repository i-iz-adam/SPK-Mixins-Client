/*
 * Decompiled with CFR 0.152.
 */
package rs.l;

import rs.l.f_0;

public class b {
    private final int a = 1;
    private final int b = 45;
    private f_0 c;
    private f_0 d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private long j;

    public b(f_0 f_02, f_0 f_03, int n2) {
        this.c = f_02;
        this.d = f_03;
        this.g = n2;
    }

    public void a(int n2, int n3) {
        this.c.c(n2, n3);
        if (this.e) {
            if (System.currentTimeMillis() - this.j >= 45L) {
                if (this.h != this.g * (this.f / 1)) {
                    this.h += this.f;
                } else {
                    this.e = false;
                }
                this.j = System.currentTimeMillis();
            }
        } else {
            this.i = 0;
            if (System.currentTimeMillis() - this.j >= 45L) {
                if (this.h != 0) {
                    this.h += this.f * -1;
                    this.j = System.currentTimeMillis();
                } else if (Math.random() * 100.0 <= 2.0 || System.currentTimeMillis() - this.j >= 1000L) {
                    this.f = this.f < 0 ? 1 : -1;
                    this.e = true;
                }
            }
        }
        this.d.c(n2 + this.h, n3 + this.i);
    }
}

