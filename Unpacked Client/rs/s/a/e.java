/*
 * Decompiled with CFR 0.152.
 */
package rs.s.a;

public final class e
extends Enum<e> {
    public static final /* enum */ e a = new e();
    public static final /* enum */ e b = new e();
    public static final /* enum */ e c = new e();
    private static final /* synthetic */ e[] d;

    public static e[] values() {
        return (e[])d.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static /* synthetic */ e[] a() {
        return new e[]{a, b, c};
    }

    static {
        d = e.a();
    }
}

