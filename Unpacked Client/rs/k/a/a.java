/*
 * Decompiled with CFR 0.152.
 */
package rs.k.a;

public final class a
extends Enum<a> {
    public static final /* enum */ a a = new a("Disabled", 0);
    public static final /* enum */ a b = new a("MSAA x2", 2);
    public static final /* enum */ a c = new a("MSAA x4", 4);
    public static final /* enum */ a d = new a("MSAA x8", 8);
    public static final /* enum */ a e = new a("MSAA x16", 16);
    private final String f;
    private final int g;
    private static final /* synthetic */ a[] h;

    public static a[] values() {
        return (a[])h.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private a(String string2, int n3) {
        this.f = string2;
        this.g = n3;
    }

    public String toString() {
        return this.f;
    }

    public int a() {
        return this.g;
    }

    private static /* synthetic */ a[] b() {
        return new a[]{a, b, c, d, e};
    }

    static {
        h = rs.k.a.a.b();
    }
}

