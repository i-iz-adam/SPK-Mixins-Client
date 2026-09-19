/*
 * Decompiled with CFR 0.152.
 */
package rs.k.a;

public final class c
extends Enum<c> {
    public static final /* enum */ c a = new c();
    public static final /* enum */ c b = new c();
    public static final /* enum */ c c = new c();
    private static final /* synthetic */ c[] d;

    public static c[] values() {
        return (c[])d.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static /* synthetic */ c[] a() {
        return new c[]{a, b, c};
    }

    static {
        d = rs.k.a.c.a();
    }
}

