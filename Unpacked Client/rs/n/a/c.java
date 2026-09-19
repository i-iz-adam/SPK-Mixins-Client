/*
 * Decompiled with CFR 0.152.
 */
package rs.n.a;

import rs.n.e;

public class c
extends e {
    public c(int n2) {
        this.W = new String[5];
        this.K = new int[20];
        this.ax = new int[30];
        this.az = new int[30];
        this.as = new int[20];
        this.al = new int[0];
        this.am = new int[0];
        this.bc = new int[0];
        this.t = false;
        this.ac = 24;
        this.ap = 24;
        this.aR = 5;
        this.P = 6;
        this.ah = 5292;
        this.aw = n2;
        this.aI = 2;
        c.H[n2] = this;
    }

    public static c g(int n2, int n3) {
        c c2 = new c(n2);
        c.H[n2].az = new int[n3];
        c.H[n2].ax = new int[n3];
        c.H[n2].K = new int[n3];
        c.H[n2].as = new int[n3];
        c.H[n2].P = 5;
        c.H[n2].aR = (int)Math.ceil(c.H[n2].P);
        return c2;
    }

    public c a(int n2) {
        this.P = n2;
        this.aR = (int)Math.ceil(this.az.length / n2);
        c.H[this.aw].P = n2;
        c.H[this.aw].aR = (int)Math.ceil(this.az.length / n2);
        return this;
    }

    public c h(int n2, int n3) {
        this.ac = n2;
        this.ap = n3;
        return this;
    }
}

