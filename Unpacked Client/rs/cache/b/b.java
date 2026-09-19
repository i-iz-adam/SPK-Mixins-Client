/*
 * Decompiled with CFR 0.152.
 */
package rs.cache.b;

public final class b
extends Enum<b> {
    public static final /* enum */ b a = new b("Error in version check!\nCould not retrieve remote version file. Server is either offline or the remote file is corrupt.\n\nPlease try again in a few minutes.");
    public static final /* enum */ b b = new b("There has been an issue downloading a game asset!\nPlease try again in a few minutes.\nIf the issue continues, post a ticket on our website!");
    private String c;
    private static final /* synthetic */ b[] d;

    public static b[] values() {
        return (b[])d.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private b(String string2) {
        this.c = string2;
    }

    public String a() {
        return this.c;
    }

    private static /* synthetic */ b[] b() {
        return new b[]{a, b};
    }

    static {
        d = rs.cache.b.b.b();
    }
}

