/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package rs.s.f;

import java.awt.Color;
import javax.annotation.Nullable;

final class f {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    @Nullable
    private final Color e;
    @Nullable
    private final String f;

    public f(int n2, int n3, int n4, int n5, @Nullable Color color, @Nullable String string) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = color;
        this.f = string;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    @Nullable
    public Color e() {
        return this.e;
    }

    @Nullable
    public String f() {
        return this.f;
    }

    public String toString() {
        return "GroundMarkerPoint(regionId=" + this.a() + ", regionX=" + this.b() + ", regionY=" + this.c() + ", z=" + this.d() + ", color=" + String.valueOf(this.e()) + ", label=" + this.f() + ")";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        f f2 = (f)object;
        if (this.a() != f2.a()) {
            return false;
        }
        if (this.b() != f2.b()) {
            return false;
        }
        if (this.c() != f2.c()) {
            return false;
        }
        return this.d() == f2.d();
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + this.a();
        n3 = n3 * 59 + this.b();
        n3 = n3 * 59 + this.c();
        n3 = n3 * 59 + this.d();
        return n3;
    }
}

