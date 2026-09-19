/*
 * Decompiled with CFR 0.152.
 */
package rs.d;

import java.io.File;
import java.nio.ByteBuffer;
import rs.Client;
import rs.d.h;
import rs.v.a;
import rs.x.e;

public class t {
    public boolean a;
    public static t[] b;
    public int c = -1;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public static h.a x;

    public static void a(h.a a2) {
        ByteBuffer byteBuffer = null;
        switch (a2) {
            case a: {
                byteBuffer = ByteBuffer.wrap(Client.a(rs.v.a.f() + "flo2.dat"));
                break;
            }
            case b: {
                byteBuffer = ByteBuffer.wrap(Client.a(rs.v.a.f() + "osrs_flo2.dat"));
                break;
            }
            case c: {
                byteBuffer = ByteBuffer.wrap(Client.a(rs.v.a.f() + "osrs_config" + File.separator + "flo2.dat"));
            }
        }
        int n2 = byteBuffer.getShort();
        b = new t[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            if (b[i2] == null) {
                rs.d.t.b[i2] = new t();
            }
            b[i2].a(byteBuffer);
            b[i2].a();
        }
    }

    public void a() {
        if (this.f != -1) {
            this.a(this.f);
            this.r = this.o;
            this.s = this.p;
            this.t = this.q;
        }
        this.a(this.d);
    }

    public void a(e e2) {
        int n2;
        while ((n2 = e2.y()) != 0) {
            if (n2 == 1) {
                this.d = (e2.y() << 16) + (e2.y() << 8) + e2.y();
                continue;
            }
            if (n2 == 2) {
                this.c = e2.y();
                continue;
            }
            if (n2 == 5) {
                this.e = false;
                continue;
            }
            if (n2 == 7) {
                this.f = (e2.y() << 16) + (e2.y() << 8) + e2.y();
                continue;
            }
            System.out.println("Error unrecognised overlay code: " + n2);
        }
    }

    private void a(ByteBuffer byteBuffer) {
        byte by;
        while ((by = byteBuffer.get()) != 0) {
            if (by == 1) {
                this.d = ((byteBuffer.get() & 0xFF) << 16) + ((byteBuffer.get() & 0xFF) << 8) + (byteBuffer.get() & 0xFF);
                continue;
            }
            if (by == 2) {
                this.c = byteBuffer.get() & 0xFF;
                continue;
            }
            if (by == 3) {
                this.c = byteBuffer.getShort() & 0xFFFF;
                if (this.c != 65535) continue;
                this.c = -1;
                continue;
            }
            if (by == 4) continue;
            if (by == 5) {
                this.e = false;
                continue;
            }
            if (by == 6) continue;
            if (by == 7) {
                this.f = ((byteBuffer.get() & 0xFF) << 16) + ((byteBuffer.get() & 0xFF) << 8) + (byteBuffer.get() & 0xFF);
                continue;
            }
            if (by == 8) continue;
            if (by == 9) {
                this.g = byteBuffer.getShort() & 0xFFFF;
                continue;
            }
            if (by == 10) {
                this.h = false;
                continue;
            }
            if (by == 11) {
                this.i = byteBuffer.get() & 0xFF;
                continue;
            }
            if (by == 12) {
                this.j = true;
                continue;
            }
            if (by == 13) {
                this.k = ((byteBuffer.get() & 0xFF) << 16) + ((byteBuffer.get() & 0xFF) << 8) + (byteBuffer.get() & 0xFF);
                continue;
            }
            if (by == 14) {
                this.l = byteBuffer.get() & 0xFF;
                continue;
            }
            if (by == 15) {
                this.m = byteBuffer.getShort() & 0xFFFF;
                if (this.m != 65535) continue;
                this.m = -1;
                continue;
            }
            if (by == 16) {
                this.n = byteBuffer.get() & 0xFF;
                continue;
            }
            System.err.println("[OverlayFloor] Missing AttributeId: " + by);
        }
    }

    private void a(int n2) {
        double d2;
        double d3 = (double)(n2 >> 16 & 0xFF) / 256.0;
        double d4 = (double)(n2 >> 8 & 0xFF) / 256.0;
        double d5 = (double)(n2 & 0xFF) / 256.0;
        double d6 = d3;
        if (d4 < d6) {
            d6 = d4;
        }
        if (d5 < d6) {
            d6 = d5;
        }
        if (d4 > (d2 = d3)) {
            d2 = d4;
        }
        if (d5 > d2) {
            d2 = d5;
        }
        double d7 = 0.0;
        double d8 = 0.0;
        double d9 = (d6 + d2) / 2.0;
        if (d6 != d2) {
            if (d9 < 0.5) {
                d8 = (d2 - d6) / (d2 + d6);
            }
            if (d9 >= 0.5) {
                d8 = (d2 - d6) / (2.0 - d2 - d6);
            }
            if (d3 == d2) {
                d7 = (d4 - d5) / (d2 - d6);
            } else if (d4 == d2) {
                d7 = 2.0 + (d5 - d3) / (d2 - d6);
            } else if (d5 == d2) {
                d7 = 4.0 + (d3 - d4) / (d2 - d6);
            }
        }
        this.o = (int)((d7 /= 6.0) * 256.0);
        this.p = (int)(d8 * 256.0);
        this.q = (int)(d9 * 256.0);
        if (this.p < 0) {
            this.p = 0;
        } else if (this.p > 255) {
            this.p = 255;
        }
        if (this.q < 0) {
            this.q = 0;
        } else if (this.q > 255) {
            this.q = 255;
        }
        this.v = d9 > 0.5 ? (int)((1.0 - d9) * d8 * 512.0) : (int)(d9 * d8 * 512.0);
        if (this.v < 1) {
            this.v = 1;
        }
        this.u = (int)(d7 * (double)this.v);
        this.w = rs.d.t.a(this.o, this.p, this.q);
    }

    static final int a(int n2, int n3, int n4) {
        if (n4 > 179) {
            n3 /= 2;
        }
        if (n4 > 192) {
            n3 /= 2;
        }
        if (n4 > 217) {
            n3 /= 2;
        }
        if (n4 > 243) {
            n3 /= 2;
        }
        int n5 = (n2 / 4 << 10) + (n3 / 32 << 7) + n4 / 2;
        return n5;
    }

    static {
        x = h.a.a;
    }
}

