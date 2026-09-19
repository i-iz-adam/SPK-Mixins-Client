/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e;

import java.awt.Color;
import java.awt.Polygon;
import rs.Client;
import rs.a.c;
import rs.a.j;
import rs.gui.Launcher;
import rs.runelite.a.f;

public class n {
    public Polygon a;
    public Color b;
    public Color c;
    public String d;
    public int e;
    public int f;

    public n(Polygon polygon, Color color, Color color2) {
        this.a = polygon;
        this.b = color;
        this.c = color2;
    }

    public static n a(c c2, Color color, Color color2) {
        int n2 = 1;
        if (c2 instanceof j) {
            j j2 = (j)c2;
            if (j2.aG != null) {
                n2 = j2.aG.r;
            }
        }
        return new n(c2.a(n2), color, color2);
    }

    public static n a(int n2, int n3, Color color, Color color2) {
        int n4 = (n2 - Client.eh) * 128;
        int n5 = (n3 - Client.ei) * 128;
        Polygon polygon = Launcher.n().o().a(new f(n4, n5), 1);
        n n6 = new n(polygon, color, color2);
        n6.e = n2;
        n6.f = n3;
        return n6;
    }

    public void a() {
        if (this.e == 0 && this.f == 0) {
            return;
        }
        int n2 = (this.e - Client.eh) * 128 + 64;
        int n3 = (this.f - Client.ei) * 128 + 64;
        this.a = Launcher.n().o().a(new f(n2, n3), 1);
    }

    public Color b() {
        return this.b;
    }

    public Color c() {
        return this.c;
    }
}

