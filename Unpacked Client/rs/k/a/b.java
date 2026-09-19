/*
 * Decompiled with CFR 0.152.
 */
package rs.k.a;

public final class b
extends Enum<b> {
    public static final /* enum */ b a = new b();
    public static final /* enum */ b b = new b();
    public static final /* enum */ b c = new b();
    public static final /* enum */ b d = new b();
    private static final /* synthetic */ b[] e;

    public static b[] values() {
        return (b[])e.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static /* synthetic */ b[] a() {
        return new b[]{a, b, c, d};
    }

    static {
        e = rs.k.a.b.a();
    }
}

