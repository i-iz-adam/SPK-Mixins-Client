/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.NonNull
 */
package rs.s.o;

import java.awt.Color;
import java.util.function.Predicate;
import lombok.NonNull;
import rs.a.j;

public final class a {
    @NonNull
    private final j a;
    @NonNull
    private final Color b;
    private final Color c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final float l;
    private final int m;
    private final Predicate<j> n;

    private static Color r() {
        return new Color(0, 0, 0, 50);
    }

    private static float s() {
        return 2.0f;
    }

    a(@NonNull j j2, @NonNull Color color, Color color2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, float f2, int n2, Predicate<j> predicate) {
        if (j2 == null) {
            throw new NullPointerException("npc is marked non-null but is null");
        }
        if (color == null) {
            throw new NullPointerException("highlightColor is marked non-null but is null");
        }
        this.a = j2;
        this.b = color;
        this.c = color2;
        this.d = bl;
        this.e = bl2;
        this.f = bl3;
        this.g = bl4;
        this.h = bl5;
        this.i = bl6;
        this.j = bl7;
        this.k = bl8;
        this.l = f2;
        this.m = n2;
        this.n = predicate;
    }

    public static a a() {
        return new a();
    }

    @NonNull
    public j b() {
        return this.a;
    }

    @NonNull
    public Color c() {
        return this.b;
    }

    public Color d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    public boolean i() {
        return this.h;
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.k;
    }

    public float m() {
        return this.l;
    }

    public int n() {
        return this.m;
    }

    public Predicate<j> o() {
        return this.n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        if (this.e() != a2.e()) {
            return false;
        }
        if (this.f() != a2.f()) {
            return false;
        }
        if (this.g() != a2.g()) {
            return false;
        }
        if (this.h() != a2.h()) {
            return false;
        }
        if (this.i() != a2.i()) {
            return false;
        }
        if (this.j() != a2.j()) {
            return false;
        }
        if (this.k() != a2.k()) {
            return false;
        }
        if (this.l() != a2.l()) {
            return false;
        }
        if (Float.compare(this.m(), a2.m()) != 0) {
            return false;
        }
        if (this.n() != a2.n()) {
            return false;
        }
        j j2 = this.b();
        j j3 = a2.b();
        if (j2 == null ? j3 != null : !j2.equals(j3)) {
            return false;
        }
        Color color = this.c();
        Color color2 = a2.c();
        if (color == null ? color2 != null : !((Object)color).equals(color2)) {
            return false;
        }
        Color color3 = this.d();
        Color color4 = a2.d();
        if (color3 == null ? color4 != null : !((Object)color3).equals(color4)) {
            return false;
        }
        Predicate<j> predicate = this.o();
        Predicate<j> predicate2 = a2.o();
        return !(predicate == null ? predicate2 != null : !predicate.equals(predicate2));
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + (this.e() ? 79 : 97);
        n3 = n3 * 59 + (this.f() ? 79 : 97);
        n3 = n3 * 59 + (this.g() ? 79 : 97);
        n3 = n3 * 59 + (this.h() ? 79 : 97);
        n3 = n3 * 59 + (this.i() ? 79 : 97);
        n3 = n3 * 59 + (this.j() ? 79 : 97);
        n3 = n3 * 59 + (this.k() ? 79 : 97);
        n3 = n3 * 59 + (this.l() ? 79 : 97);
        n3 = n3 * 59 + Float.floatToIntBits(this.m());
        n3 = n3 * 59 + this.n();
        j j2 = this.b();
        n3 = n3 * 59 + (j2 == null ? 43 : j2.hashCode());
        Color color = this.c();
        n3 = n3 * 59 + (color == null ? 43 : ((Object)color).hashCode());
        Color color2 = this.d();
        n3 = n3 * 59 + (color2 == null ? 43 : ((Object)color2).hashCode());
        Predicate<j> predicate = this.o();
        n3 = n3 * 59 + (predicate == null ? 43 : predicate.hashCode());
        return n3;
    }

    public String toString() {
        return "HighlightedNpc(npc=" + String.valueOf(this.b()) + ", highlightColor=" + String.valueOf(this.c()) + ", fillColor=" + String.valueOf(this.d()) + ", hull=" + this.e() + ", tile=" + this.f() + ", trueTile=" + this.g() + ", swTile=" + this.h() + ", swTrueTile=" + this.i() + ", outline=" + this.j() + ", name=" + this.k() + ", nameOnMinimap=" + this.l() + ", borderWidth=" + this.m() + ", outlineFeather=" + this.n() + ", render=" + String.valueOf(this.o()) + ")";
    }

    public static class a {
        private j a;
        private Color b;
        private boolean c;
        private Color d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private float n;
        private int o;
        private Predicate<j> p;

        a() {
        }

        public a a(@NonNull j j2) {
            if (j2 == null) {
                throw new NullPointerException("npc is marked non-null but is null");
            }
            this.a = j2;
            return this;
        }

        public a a(@NonNull Color color) {
            if (color == null) {
                throw new NullPointerException("highlightColor is marked non-null but is null");
            }
            this.b = color;
            return this;
        }

        public a b(Color color) {
            this.d = color;
            this.c = true;
            return this;
        }

        public a a(boolean bl) {
            this.e = bl;
            return this;
        }

        public a b(boolean bl) {
            this.f = bl;
            return this;
        }

        public a c(boolean bl) {
            this.g = bl;
            return this;
        }

        public a d(boolean bl) {
            this.h = bl;
            return this;
        }

        public a e(boolean bl) {
            this.i = bl;
            return this;
        }

        public a f(boolean bl) {
            this.j = bl;
            return this;
        }

        public a g(boolean bl) {
            this.k = bl;
            return this;
        }

        public a h(boolean bl) {
            this.l = bl;
            return this;
        }

        public a a(float f2) {
            this.n = f2;
            this.m = true;
            return this;
        }

        public a a(int n2) {
            this.o = n2;
            return this;
        }

        public a a(Predicate<j> predicate) {
            this.p = predicate;
            return this;
        }

        public a a() {
            Color color = this.d;
            if (!this.c) {
                color = rs.s.o.a.r();
            }
            float f2 = this.n;
            if (!this.m) {
                f2 = rs.s.o.a.s();
            }
            return new a(this.a, this.b, color, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, f2, this.o, this.p);
        }

        public String toString() {
            return "HighlightedNpc.HighlightedNpcBuilder(npc=" + String.valueOf(this.a) + ", highlightColor=" + String.valueOf(this.b) + ", fillColor$value=" + String.valueOf(this.d) + ", hull=" + this.e + ", tile=" + this.f + ", trueTile=" + this.g + ", swTile=" + this.h + ", swTrueTile=" + this.i + ", outline=" + this.j + ", name=" + this.k + ", nameOnMinimap=" + this.l + ", borderWidth$value=" + this.n + ", outlineFeather=" + this.o + ", render=" + String.valueOf(this.p) + ")";
        }
    }
}

