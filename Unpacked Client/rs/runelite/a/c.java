/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.a;

public final class c
extends Enum<c> {
    public static final /* enum */ c a = new c(-1);
    public static final /* enum */ c b = new c(0);
    public static final /* enum */ c c = new c(10);
    public static final /* enum */ c d = new c(11);
    public static final /* enum */ c e = new c(20);
    public static final /* enum */ c f = new c(25);
    public static final /* enum */ c g = new c(30);
    public static final /* enum */ c h = new c(40);
    public static final /* enum */ c i = new c(45);
    private final int j;
    private static final /* synthetic */ c[] k;

    public static c[] values() {
        return (c[])k.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(int n3) {
        this.j = n3;
    }

    public static c a(int n2) {
        for (c c2 : rs.runelite.a.c.values()) {
            if (c2.j != n2) continue;
            return c2;
        }
        return a;
    }

    public int a() {
        return this.j;
    }

    private static /* synthetic */ c[] b() {
        return new c[]{a, b, c, d, e, f, g, h, i};
    }

    static {
        k = rs.runelite.a.c.b();
    }
}

