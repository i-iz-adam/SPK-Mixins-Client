/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package rs.l.f;

import java.util.function.Consumer;
import javax.annotation.Nullable;
import rs.j.b.b;

public class f {
    private final int b;
    private final String c;
    private final String d;
    @Nullable
    Consumer<b> a;

    public f(int n2, String string, String string2) {
        this.b = n2;
        this.c = string;
        this.d = string2;
    }

    public String toString() {
        return "OverlayMenuEntry(menuAction=" + this.a() + ", option=" + this.b() + ", target=" + this.c() + ")";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        f f2 = (f)object;
        if (!f2.a(this)) {
            return false;
        }
        if (this.a() != f2.a()) {
            return false;
        }
        String string = this.b();
        String string2 = f2.b();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.c();
        String string4 = f2.c();
        return !(string3 == null ? string4 != null : !string3.equals(string4));
    }

    protected boolean a(Object object) {
        return object instanceof f;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + this.a();
        String string = this.b();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.c();
        n3 = n3 * 59 + (string2 == null ? 43 : string2.hashCode());
        return n3;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }
}

