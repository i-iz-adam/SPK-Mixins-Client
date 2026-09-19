/*
 * Decompiled with CFR 0.152.
 */
package rs.s.a;

public final class d
extends Enum<d> {
    public static final /* enum */ d a = new d();
    public static final /* enum */ d b = new d();
    private static final /* synthetic */ d[] c;

    public static d[] values() {
        return (d[])c.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static /* synthetic */ d[] a() {
        return new d[]{a, b};
    }

    static {
        c = d.a();
    }
}

