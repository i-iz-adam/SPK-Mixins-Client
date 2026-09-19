/*
 * Decompiled with CFR 0.152.
 */
package rs.s.t;

import java.awt.image.BufferedImage;
import rs.a.j_0;

public final class b
extends Enum<b> {
    public static final /* enum */ b a = new b("Gold", 1, j_0.b(b.class, "gold.png"));
    public static final /* enum */ b b = new b("Bags", 100000000, j_0.b(b.class, "bags.png"));
    private final String c;
    private final int d;
    private final BufferedImage e;
    private static final /* synthetic */ b[] f;

    public static b[] values() {
        return (b[])f.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public String toString() {
        return this.c;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public BufferedImage c() {
        return this.e;
    }

    private b(String string2, int n3, BufferedImage bufferedImage) {
        this.c = string2;
        this.d = n3;
        this.e = bufferedImage;
    }

    private static /* synthetic */ b[] d() {
        return new b[]{a, b};
    }

    static {
        f = rs.s.t.b.d();
    }
}

