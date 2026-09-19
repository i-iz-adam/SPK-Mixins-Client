/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.f;

public final class b
extends Enum<b> {
    public static final /* enum */ b a = new b();
    public static final /* enum */ b b = new b();
    private static final /* synthetic */ b[] c;

    public static b[] values() {
        return (b[])c.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static /* synthetic */ b[] a() {
        return new b[]{a, b};
    }

    static {
        c = rs.l.f.a.f.b.a();
    }
}

