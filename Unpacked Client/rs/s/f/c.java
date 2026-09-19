/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 *  javax.annotation.Nullable
 *  javax.inject.Inject
 */
package rs.s.f;

import com.google.a.b.as;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Stroke;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;
import javax.inject.Inject;
import rs.Client;
import rs.runelite.a.f;
import rs.runelite.a.h;
import rs.runelite.a.p;
import rs.s.f.a;
import rs.s.f.b;
import rs.s.f.d;

public class c
extends rs.l.f.b {
    private static final int e = 32;
    private final b f;
    private final d g;

    @Inject
    public c(b b2, d d2) {
        this.f = b2;
        this.g = d2;
        this.a(rs.l.f.a.o);
    }

    @Override
    public void a() {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.g.g();
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        BasicStroke basicStroke = new BasicStroke((float)this.f.d());
        for (a a2 : copyOnWriteArrayList) {
            p p2 = a2.a();
            if (p2.g() != Client.dw) continue;
            Color color = a2.b();
            if (color == null) {
                color = this.f.a();
            }
            this.a(p2, color, a2.c(), (Stroke)basicStroke);
        }
    }

    private void a(p p2, Color color, @Nullable String string, Stroke stroke) {
        p p3 = Client.eR.g();
        if (p2.a(p3) >= 32) {
            return;
        }
        f f2 = rs.runelite.a.f.a(p2);
        if (f2 == null) {
            return;
        }
        Polygon polygon = h.a(f2);
        if (polygon != null) {
            this.a(polygon, color, new Color(0, 0, 0, this.f.e()), stroke);
        }
        if (!as.c((String)string)) {
            this.a(f2, string, color, 0);
        }
    }
}

