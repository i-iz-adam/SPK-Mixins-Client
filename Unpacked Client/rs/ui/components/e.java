/*
 * Decompiled with CFR 0.152.
 */
package rs.ui.components;

public final class e
extends Enum<e> {
    public static final /* enum */ e a = new e();
    public static final /* enum */ e b = new e();
    private static final /* synthetic */ e[] c;

    public static e[] values() {
        return (e[])c.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static /* synthetic */ e[] a() {
        return new e[]{a, b};
    }

    static {
        c = e.a();
    }
}

