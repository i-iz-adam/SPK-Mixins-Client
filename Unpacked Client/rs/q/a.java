/*
 * Decompiled with CFR 0.152.
 */
package rs.q;

public final class a {
    private int a;
    private final int[] b;
    private final int[] c = new int[256];
    private int d;
    private int e;
    private int f;

    public a(int[] nArray) {
        this.b = new int[256];
        System.arraycopy(nArray, 0, this.b, 0, nArray.length);
        this.c();
    }

    public int a() {
        if (this.a-- == 0) {
            this.b();
            this.a = 255;
        }
        return this.b[this.a];
    }

    private void b() {
        this.e += ++this.f;
        for (int i2 = 0; i2 < 256; ++i2) {
            int n2;
            int n3 = this.c[i2];
            if ((i2 & 3) == 0) {
                this.d ^= this.d << 13;
            } else if ((i2 & 3) == 1) {
                this.d ^= this.d >>> 6;
            } else if ((i2 & 3) == 2) {
                this.d ^= this.d << 2;
            } else if ((i2 & 3) == 3) {
                this.d ^= this.d >>> 16;
            }
            this.d += this.c[i2 + 128 & 0xFF];
            this.c[i2] = n2 = this.c[(n3 & 0x3FC) >> 2] + this.d + this.e;
            this.b[i2] = this.e = this.c[(n2 >> 8 & 0x3FC) >> 2] + n3;
        }
    }

    private void c() {
        int n2;
        int n3 = -1640531527;
        int n4 = -1640531527;
        int n5 = -1640531527;
        int n6 = -1640531527;
        int n7 = -1640531527;
        int n8 = -1640531527;
        int n9 = -1640531527;
        int n10 = -1640531527;
        for (n2 = 0; n2 < 4; ++n2) {
            n7 += (n10 ^= n9 << 11);
            n9 += n8;
            n6 += (n9 ^= n8 >>> 2);
            n8 += n7;
            n5 += (n8 ^= n7 << 8);
            n7 += n6;
            n4 += (n7 ^= n6 >>> 16);
            n6 += n5;
            n3 += (n6 ^= n5 << 10);
            n5 += n4;
            n10 += (n5 ^= n4 >>> 4);
            n4 += n3;
            n9 += (n4 ^= n3 << 8);
            n3 += n10;
            n8 += (n3 ^= n10 >>> 9);
            n10 += n9;
        }
        for (n2 = 0; n2 < 256; n2 += 8) {
            n10 += this.b[n2];
            n9 += this.b[n2 + 1];
            n8 += this.b[n2 + 2];
            n7 += this.b[n2 + 3];
            n6 += this.b[n2 + 4];
            n5 += this.b[n2 + 5];
            n4 += this.b[n2 + 6];
            n3 += this.b[n2 + 7];
            n7 += (n10 ^= n9 << 11);
            n9 += n8;
            n6 += (n9 ^= n8 >>> 2);
            n8 += n7;
            n5 += (n8 ^= n7 << 8);
            n7 += n6;
            n4 += (n7 ^= n6 >>> 16);
            n6 += n5;
            n3 += (n6 ^= n5 << 10);
            n5 += n4;
            n10 += (n5 ^= n4 >>> 4);
            n4 += n3;
            n9 += (n4 ^= n3 << 8);
            n3 += n10;
            n8 += (n3 ^= n10 >>> 9);
            this.c[n2] = n10 += n9;
            this.c[n2 + 1] = n9;
            this.c[n2 + 2] = n8;
            this.c[n2 + 3] = n7;
            this.c[n2 + 4] = n6;
            this.c[n2 + 5] = n5;
            this.c[n2 + 6] = n4;
            this.c[n2 + 7] = n3;
        }
        for (n2 = 0; n2 < 256; n2 += 8) {
            n10 += this.c[n2];
            n9 += this.c[n2 + 1];
            n8 += this.c[n2 + 2];
            n7 += this.c[n2 + 3];
            n6 += this.c[n2 + 4];
            n5 += this.c[n2 + 5];
            n4 += this.c[n2 + 6];
            n3 += this.c[n2 + 7];
            n7 += (n10 ^= n9 << 11);
            n9 += n8;
            n6 += (n9 ^= n8 >>> 2);
            n8 += n7;
            n5 += (n8 ^= n7 << 8);
            n7 += n6;
            n4 += (n7 ^= n6 >>> 16);
            n6 += n5;
            n3 += (n6 ^= n5 << 10);
            n5 += n4;
            n10 += (n5 ^= n4 >>> 4);
            n4 += n3;
            n9 += (n4 ^= n3 << 8);
            n3 += n10;
            n8 += (n3 ^= n10 >>> 9);
            this.c[n2] = n10 += n9;
            this.c[n2 + 1] = n9;
            this.c[n2 + 2] = n8;
            this.c[n2 + 3] = n7;
            this.c[n2 + 4] = n6;
            this.c[n2 + 5] = n5;
            this.c[n2 + 6] = n4;
            this.c[n2 + 7] = n3;
        }
        this.b();
        this.a = 256;
    }
}

