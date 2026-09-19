/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.Collection;
import rs.l.f.l;

final class c {
    private final Rectangle a;
    private final Rectangle b;
    private final Rectangle c;
    private final Rectangle d;
    private final Rectangle e;
    private final Rectangle f;
    private final Rectangle g;

    c(c c2) {
        this.a = new Rectangle(c2.a);
        this.b = new Rectangle(c2.b);
        this.c = new Rectangle(c2.c);
        this.d = new Rectangle(c2.d);
        this.e = new Rectangle(c2.e);
        this.f = new Rectangle(c2.f);
        this.g = new Rectangle(c2.g);
    }

    c a(int n2, int n3) {
        c c2 = new c(this);
        c2.d().translate(n2, 0);
        c2.c().translate(n2 / 2, 0);
        c2.e().translate(0, n3);
        c2.f().translate(n2, n3);
        c2.g().translate(n2, n3);
        c2.h().translate(n2, 0);
        return c2;
    }

    Rectangle a(l l2) {
        switch (l2) {
            case c: {
                return this.a;
            }
            case d: {
                return this.b;
            }
            case e: {
                return this.c;
            }
            case f: {
                return this.d;
            }
            case g: {
                return this.e;
            }
            case h: {
                return this.f;
            }
            case i: {
                return this.g;
            }
        }
        throw new IllegalArgumentException();
    }

    l a(Rectangle rectangle) {
        if (rectangle == this.a) {
            return l.c;
        }
        if (rectangle == this.b) {
            return l.d;
        }
        if (rectangle == this.c) {
            return l.e;
        }
        if (rectangle == this.d) {
            return l.f;
        }
        if (rectangle == this.e) {
            return l.g;
        }
        if (rectangle == this.f) {
            return l.h;
        }
        if (rectangle == this.g) {
            return l.i;
        }
        throw new IllegalArgumentException();
    }

    Collection<Rectangle> a() {
        return Arrays.asList(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public Rectangle b() {
        return this.a;
    }

    public Rectangle c() {
        return this.b;
    }

    public Rectangle d() {
        return this.c;
    }

    public Rectangle e() {
        return this.d;
    }

    public Rectangle f() {
        return this.e;
    }

    public Rectangle g() {
        return this.f;
    }

    public Rectangle h() {
        return this.g;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        c c2 = (c)object;
        Rectangle rectangle = this.b();
        Rectangle rectangle2 = c2.b();
        if (rectangle == null ? rectangle2 != null : !((Object)rectangle).equals(rectangle2)) {
            return false;
        }
        Rectangle rectangle3 = this.c();
        Rectangle rectangle4 = c2.c();
        if (rectangle3 == null ? rectangle4 != null : !((Object)rectangle3).equals(rectangle4)) {
            return false;
        }
        Rectangle rectangle5 = this.d();
        Rectangle rectangle6 = c2.d();
        if (rectangle5 == null ? rectangle6 != null : !((Object)rectangle5).equals(rectangle6)) {
            return false;
        }
        Rectangle rectangle7 = this.e();
        Rectangle rectangle8 = c2.e();
        if (rectangle7 == null ? rectangle8 != null : !((Object)rectangle7).equals(rectangle8)) {
            return false;
        }
        Rectangle rectangle9 = this.f();
        Rectangle rectangle10 = c2.f();
        if (rectangle9 == null ? rectangle10 != null : !((Object)rectangle9).equals(rectangle10)) {
            return false;
        }
        Rectangle rectangle11 = this.g();
        Rectangle rectangle12 = c2.g();
        if (rectangle11 == null ? rectangle12 != null : !((Object)rectangle11).equals(rectangle12)) {
            return false;
        }
        Rectangle rectangle13 = this.h();
        Rectangle rectangle14 = c2.h();
        return !(rectangle13 == null ? rectangle14 != null : !((Object)rectangle13).equals(rectangle14));
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        Rectangle rectangle = this.b();
        n3 = n3 * 59 + (rectangle == null ? 43 : ((Object)rectangle).hashCode());
        Rectangle rectangle2 = this.c();
        n3 = n3 * 59 + (rectangle2 == null ? 43 : ((Object)rectangle2).hashCode());
        Rectangle rectangle3 = this.d();
        n3 = n3 * 59 + (rectangle3 == null ? 43 : ((Object)rectangle3).hashCode());
        Rectangle rectangle4 = this.e();
        n3 = n3 * 59 + (rectangle4 == null ? 43 : ((Object)rectangle4).hashCode());
        Rectangle rectangle5 = this.f();
        n3 = n3 * 59 + (rectangle5 == null ? 43 : ((Object)rectangle5).hashCode());
        Rectangle rectangle6 = this.g();
        n3 = n3 * 59 + (rectangle6 == null ? 43 : ((Object)rectangle6).hashCode());
        Rectangle rectangle7 = this.h();
        n3 = n3 * 59 + (rectangle7 == null ? 43 : ((Object)rectangle7).hashCode());
        return n3;
    }

    public String toString() {
        return "OverlayBounds(topLeft=" + String.valueOf(this.b()) + ", topCenter=" + String.valueOf(this.c()) + ", topRight=" + String.valueOf(this.d()) + ", bottomLeft=" + String.valueOf(this.e()) + ", bottomRight=" + String.valueOf(this.f()) + ", aboveChatboxRight=" + String.valueOf(this.g()) + ", canvasTopRight=" + String.valueOf(this.h()) + ")";
    }

    public c(Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3, Rectangle rectangle4, Rectangle rectangle5, Rectangle rectangle6, Rectangle rectangle7) {
        this.a = rectangle;
        this.b = rectangle2;
        this.c = rectangle3;
        this.d = rectangle4;
        this.e = rectangle5;
        this.f = rectangle6;
        this.g = rectangle7;
    }
}

