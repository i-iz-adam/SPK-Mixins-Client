/*
 * Decompiled with CFR 0.152.
 */
package rs.k;

public final class j
extends Enum<j> {
    public static final /* enum */ j a = new j();
    public static final /* enum */ j b = new j();
    public static final /* enum */ j c = new j();
    public static final /* enum */ j d = new j();
    private static final j e;
    private static final /* synthetic */ j[] f;

    public static j[] values() {
        return (j[])f.clone();
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    public static j a() {
        return e;
    }

    private static /* synthetic */ j[] b() {
        return new j[]{a, b, c, d};
    }

    static {
        f = j.b();
        String string = System.getProperty("os.name", "generic").toLowerCase();
        e = string.contains("mac") || string.contains("darwin") ? b : (string.contains("win") ? a : (string.contains("nux") ? c : d));
    }
}

