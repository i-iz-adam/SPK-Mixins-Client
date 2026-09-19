/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package rs.s.f;

import java.awt.Color;
import javax.annotation.Nullable;
import rs.runelite.a.p;

public final class a {
    private final p a;
    @Nullable
    private final Color b;
    @Nullable
    private final String c;

    public a(p p2, @Nullable Color color, @Nullable String string) {
        this.a = p2;
        this.b = color;
        this.c = string;
    }

    public p a() {
        return this.a;
    }

    @Nullable
    public Color b() {
        return this.b;
    }

    @Nullable
    public String c() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        p p2 = this.a();
        p p3 = a2.a();
        if (p2 == null ? p3 != null : !((Object)p2).equals(p3)) {
            return false;
        }
        Color color = this.b();
        Color color2 = a2.b();
        if (color == null ? color2 != null : !((Object)color).equals(color2)) {
            return false;
        }
        String string = this.c();
        String string2 = a2.c();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        p p2 = this.a();
        n3 = n3 * 59 + (p2 == null ? 43 : ((Object)p2).hashCode());
        Color color = this.b();
        n3 = n3 * 59 + (color == null ? 43 : ((Object)color).hashCode());
        String string = this.c();
        n3 = n3 * 59 + (string == null ? 43 : string.hashCode());
        return n3;
    }

    public String toString() {
        return "ColorTileMarker(worldPoint=" + String.valueOf(this.a()) + ", color=" + String.valueOf(this.b()) + ", label=" + this.c() + ")";
    }
}

