/*
 * Decompiled with CFR 0.152.
 */
package rs;

/*
 * Renamed from rs.R
 */
public class r_0 {
    public static final r_0 a = new r_0(0, 0, 0);
    private int b;
    private int c;
    private int d;

    public r_0(int n2, int n3, int n4) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public r_0 a(r_0 r_02) {
        return new r_0(this.b - r_02.b, this.c - r_02.c, this.d - r_02.d);
    }

    public r_0 a(float f2) {
        return new r_0((int)((float)this.b / f2), (int)((float)this.c / f2), (int)((float)this.d / f2));
    }

    public r_0 b(r_0 r_02) {
        this.b += r_02.b;
        this.c += r_02.c;
        this.d += r_02.d;
        return this;
    }

    public r_0 a(r_0 r_02, float f2, float f3, float f4) {
        return new r_0(this.b + (int)((float)r_02.b * f2), this.c + (int)((float)r_02.c * f3), this.d + (int)((float)r_02.d * f4));
    }

    public r_0 d() {
        return new r_0(this.b, this.c, this.d);
    }

    public int a(int n2, int n3) {
        int n4 = n3 - n2 + 1;
        return (int)(Math.random() * (double)n4) + n2;
    }

    public String toString() {
        return "Vector{x=" + this.b + ", y=" + this.c + ", z=" + this.d + "}";
    }

    public /* synthetic */ Object clone() {
        return this.d();
    }
}

