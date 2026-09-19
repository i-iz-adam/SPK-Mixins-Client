/*
 * Decompiled with CFR 0.152.
 */
package rs.s.e;

public final class e
extends Enum<e> {
    public static final /* enum */ e a = new e("Nearest Neighbor", 0);
    public static final /* enum */ e b = new e("Bilinear", 0);
    public static final /* enum */ e c = new e("Bicubic (Mitchell)", 1);
    public static final /* enum */ e d = new e("Bicubic (Catmull-Rom)", 2);
    public static final /* enum */ e e = new e("xBR", 3);
    private final String f;
    private final int g;
    private static final /* synthetic */ e[] h;

    public static e[] values() {
        return (e[])h.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public String toString() {
        return this.f;
    }

    public String a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    private e(String string2, int n3) {
        this.f = string2;
        this.g = n3;
    }

    private static /* synthetic */ e[] c() {
        return new e[]{a, b, c, d, e};
    }

    static {
        h = rs.s.e.e.c();
    }
}

