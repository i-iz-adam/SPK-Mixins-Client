/*
 * Decompiled with CFR 0.152.
 */
package rs.gui;

public final class v
extends Enum<v> {
    public static final /* enum */ v a = new v("Keep window size");
    public static final /* enum */ v b = new v("Keep game size");
    private final String c;
    private static final /* synthetic */ v[] d;

    public static v[] values() {
        return (v[])d.clone();
    }

    public static v valueOf(String string) {
        return Enum.valueOf(v.class, string);
    }

    private v(String string2) {
        this.c = string2;
    }

    public String toString() {
        return this.c;
    }

    private static /* synthetic */ v[] a() {
        return new v[]{a, b};
    }

    static {
        d = v.a();
    }
}

