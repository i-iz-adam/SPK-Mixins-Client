/*
 * Decompiled with CFR 0.152.
 */
package rs.s.e;

public final class a
extends Enum<a> {
    public static final /* enum */ a a = new a();
    public static final /* enum */ a b = new a();
    public static final /* enum */ a c = new a();
    public static final /* enum */ a d = new a();
    private static final /* synthetic */ a[] e;

    public static a[] values() {
        return (a[])e.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static /* synthetic */ a[] a() {
        return new a[]{a, b, c, d};
    }

    static {
        e = rs.s.e.a.a();
    }
}

