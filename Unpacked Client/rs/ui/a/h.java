/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.a;

public final class h
extends Enum<h> {
    public static final /* enum */ h a = new h();
    public static final /* enum */ h b = new h();
    public static final /* enum */ h c = new h();
    public static final /* enum */ h d = new h();
    private static final /* synthetic */ h[] e;

    public static h[] values() {
        return (h[])e.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private static /* synthetic */ h[] a() {
        return new h[]{a, b, c, d};
    }

    static {
        e = h.a();
    }
}

