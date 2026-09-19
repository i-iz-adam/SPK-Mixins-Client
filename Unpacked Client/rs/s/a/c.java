/*
 * Decompiled with CFR 0.152.
 */
package rs.s.a;

public final class c
extends Enum<c> {
    public static final /* enum */ c a = new c();
    public static final /* enum */ c b = new c();
    private static final /* synthetic */ c[] c;

    public static c[] values() {
        return (c[])c.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static /* synthetic */ c[] a() {
        return new c[]{a, b};
    }

    static {
        c = rs.s.a.c.a();
    }
}

