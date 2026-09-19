/*
 * Decompiled with CFR 0.152.
 */
package rs.l.e;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rs.l.e.n;
import rs.l.e.p;
import rs.q.a.a.a;

public class o {
    public static a a = new p();
    public Map<String, n> b = new HashMap<String, n>();
    public List<n> c = new ArrayList<n>();

    public n a(String string, int n2, int n3, Color color, Color color2) {
        n n4 = n.a(n2, n3, color, color2);
        this.b.put(string, n4);
        return n4;
    }

    public void a(String string, int n2, int n3, Color color) {
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), 75);
        this.a(string, n2, n3, color, color2);
    }

    public void a(int n2, int n3, Color color, Color color2) {
        this.a(n2 + "," + n3, n2, n3, color, color2);
    }

    public void a(int n2, int n3, Color color) {
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), 75);
        this.a(n2, n3, color, color2);
    }

    public void a(int n2, int n3) {
        this.a(n2, n3, Color.MAGENTA);
    }

    public void b(int n2, int n3) {
        this.b.remove(n2 + "," + n3);
    }
}

