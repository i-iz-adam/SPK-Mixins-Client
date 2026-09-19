/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.g;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import rs.l.f.a;
import rs.l.f.g;
import rs.l.f.l;

public class c
extends g {
    private static final Dimension t = new Dimension(504, 20);
    public static int r;
    public static int s;

    public c() {
        this.a(rs.l.f.a.o);
        this.d(true);
        this.a("RaidTheatreBar");
        this.a(t);
        this.a(rs.l.f.l.d);
        this.c(false);
        this.b(new Point(-1, -6));
        this.a(t);
    }

    @Override
    public Dimension a(Graphics2D graphics2D) {
        s = graphics2D.getClipBounds().y;
        r = graphics2D.getClipBounds().x;
        return t;
    }
}

