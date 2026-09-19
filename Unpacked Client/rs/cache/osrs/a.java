/*
 * Decompiled with CFR 0.152.
 */
package rs.cache.osrs;

public final class a
extends Enum<a> {
    public static final /* enum */ a a = new a(1, "Model");
    public static final /* enum */ a b = new a(2, "Animation");
    public static final /* enum */ a c = new a(3, "Sounds");
    public static final /* enum */ a d = new a(4, "Map");
    private int e;
    private String f;
    private String g;
    private static final /* synthetic */ a[] h;

    public static a[] values() {
        return (a[])h.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private a(int n3, String string2) {
        this.e = n3;
        this.f = string2;
        this.g = rs.v.a.f() + "osrs_idx" + n3;
    }

    public int a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    private static /* synthetic */ a[] d() {
        return new a[]{a, b, c, d};
    }

    static {
        h = rs.cache.osrs.a.d();
    }
}

