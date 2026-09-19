/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e;

import java.awt.Color;
import java.awt.Polygon;

public class j {
    public Polygon a;
    public Object b;
    public Color c;
    public Color d;
    public Color e = new Color(0, 0, 0, 50);
    public Color f = new Color(0, 0, 0, 50);
    public boolean g;
    public int h;

    public j(Object object, Polygon polygon, Color color, Color color2, int n2) {
        this.a = polygon;
        this.c = color;
        this.d = color2;
        this.h = n2;
        this.b = object;
    }

    public Color a() {
        return this.g ? this.d : this.c;
    }

    public Color b() {
        return this.g ? this.f : this.e;
    }
}

