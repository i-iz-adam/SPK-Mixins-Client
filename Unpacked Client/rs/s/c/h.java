/*
 * Decompiled with CFR 0.152.
 */
package rs.s.c;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public final class h
extends Enum<h> {
    public static final /* enum */ h a = new h(-1, Color.RED.getRGB());
    public static final /* enum */ h b = new h(5, Color.GREEN.getRGB());
    public static final /* enum */ h c = new h(4, Color.WHITE.getRGB());
    public static final /* enum */ h d = new h(3, Color.ORANGE.getRGB());
    public static final /* enum */ h e = new h(5, Color.YELLOW.getRGB());
    public static final /* enum */ h f = new h(42, Color.CYAN.getRGB());
    public static final /* enum */ h g = new h(2, Color.BLUE.getRGB());
    int h;
    int i;
    public static final Map<Integer, h> j;
    private static final /* synthetic */ h[] k;

    public static h[] values() {
        return (h[])k.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private h(int n3, int n4) {
        this.h = n3;
        this.i = n4;
    }

    private static /* synthetic */ h[] a() {
        return new h[]{a, b, c, d, e, f, g};
    }

    static {
        k = rs.s.c.h.a();
        j = new HashMap<Integer, h>();
        for (h h2 : rs.s.c.h.values()) {
            j.put(h2.h, h2);
        }
    }
}

