/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.i;

import rs.gui.Launcher;
import rs.l.f_0;

public final class e
extends Enum<e> {
    public static final /* enum */ e a = new e();
    public static final /* enum */ e b = new e();
    public static final /* enum */ e c = new e();
    public static final /* enum */ e d = new e();
    private static final /* synthetic */ e[] e;

    public static e[] values() {
        return (e[])e.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public f_0 a() {
        switch (this) {
            case a: {
                return Launcher.n().o().cW;
            }
            case b: {
                return Launcher.n().o().cX;
            }
            case c: {
                return Launcher.n().o().cV;
            }
            case d: {
                return Launcher.n().o().cU;
            }
        }
        return Launcher.n().o().cU;
    }

    private static /* synthetic */ e[] b() {
        return new e[]{a, b, c, d};
    }

    static {
        e = rs.l.f.a.i.e.b();
    }
}

