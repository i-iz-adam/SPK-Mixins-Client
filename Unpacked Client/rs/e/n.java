/*
 * Decompiled with CFR 0.152.
 */
package rs.e;

public final class n
extends Enum<n> {
    public static final /* enum */ n a = new n("Off");
    public static final /* enum */ n b = new n("Flash for 2 seconds");
    public static final /* enum */ n c = new n("Solid for 2 seconds");
    public static final /* enum */ n d = new n("Flash until cancelled");
    public static final /* enum */ n e = new n("Solid until cancelled");
    private final String f;
    private static final /* synthetic */ n[] g;

    public static n[] values() {
        return (n[])g.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    public String toString() {
        return this.f;
    }

    public String a() {
        return this.f;
    }

    private n(String string2) {
        this.f = string2;
    }

    private static /* synthetic */ n[] b() {
        return new n[]{a, b, c, d, e};
    }

    static {
        g = n.b();
    }
}

