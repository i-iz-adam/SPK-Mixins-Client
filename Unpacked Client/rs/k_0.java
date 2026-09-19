/*
 * Decompiled with CFR 0.152.
 */
package rs;

import rs.cache.osrs.c;
import rs.u.j;
import rs.x.e;

/*
 * Renamed from rs.K
 */
public final class k_0 {
    j a;
    public int b;
    public int c;
    public final int[] d;
    public final int[][] e;

    public k_0(e e2, boolean bl, int n2) {
        int n3;
        int n4;
        int n5 = e2.h;
        this.b = bl ? e2.o() : e2.y();
        this.d = new int[this.b];
        this.e = new int[this.b][];
        for (n4 = 0; n4 < this.b; ++n4) {
            this.d[n4] = bl ? e2.o() : e2.y();
        }
        for (n4 = 0; n4 < this.b; ++n4) {
            this.e[n4] = new int[bl ? e2.o() : e2.y()];
        }
        for (n4 = 0; n4 < this.b; ++n4) {
            for (n3 = 0; n3 < this.e[n4].length; ++n3) {
                this.e[n4][n3] = bl ? e2.o() : e2.y();
            }
        }
        n4 = e2.h - n5;
        if (!bl) {
            int n6;
            if (n4 != n2) {
                try {
                    n3 = e2.o();
                    if (n3 > 0) {
                        this.a = new j(e2, n3);
                    }
                }
                catch (Throwable throwable) {
                    System.err.println("Tried to load base because there was extra base data but skeletal failed to load.");
                    throwable.printStackTrace();
                }
            }
            if ((n6 = e2.h - n5) != n2) {
                throw new RuntimeException("base data size mismatch: " + n6 + ", expected " + n2);
            }
        }
    }

    public k_0(int[] nArray, int[][] nArray2) {
        this.d = nArray;
        this.e = nArray2;
    }

    public k_0(e e2) {
        this(e2, rs.cache.osrs.c.a());
    }

    public k_0(e e2, boolean bl) {
        int n2;
        this.c = bl ? e2.y() : e2.A();
        this.d = new int[this.c];
        this.e = new int[this.c][];
        for (n2 = 0; n2 < this.c; ++n2) {
            this.d[n2] = bl ? e2.y() : e2.A();
        }
        for (n2 = 0; n2 < this.c; ++n2) {
            this.e[n2] = new int[bl ? e2.y() : e2.A()];
        }
        for (n2 = 0; n2 < this.c; ++n2) {
            for (int i2 = 0; i2 < this.e[n2].length; ++i2) {
                this.e[n2][i2] = bl ? e2.y() : e2.A();
            }
        }
    }

    public int a() {
        return this.b;
    }

    public j b() {
        return this.a;
    }
}

