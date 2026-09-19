/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.a.g;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import rs.Client;
import rs.l.c;
import rs.l.f.g;
import rs.l.f.l;

public class a
extends g {
    private static final int r = 125;
    private static final int s = 33;
    private static final Dimension t = new Dimension(127, 34);
    private static final String u = "Your points:";
    private static final String v = "Time:";
    private String w = "0";
    private String x = "0:00";
    private long y = 0L;
    private boolean z = false;

    public a() {
        this.a("RaidPartyOverlay");
        this.a(rs.l.f.a.p);
        this.a(rs.l.f.l.c);
        this.e.a(new Rectangle(2, 2, 2, 2));
        this.e.b(new Point(0, 2));
    }

    @Override
    public Dimension a(Graphics2D graphics2D) {
        int n2 = this.f.x;
        int n3 = this.f.y;
        this.a(t);
        rs.l.c.b(33, n3, n2, 4077096, 125, 125);
        rs.l.c.d(n2, 125, 33, 5918522, n3);
        rs.l.c.d(n2 - 1, 127, 33, 2367511, n3 - 1);
        Client.gl.b(u, n2 + 4, n3 + 13, 16750623, 0);
        Client.gl.a(this.w, n2 + 125 - 3, n3 + 13, 0xFFFFFF, 0);
        Client.gl.b(v, n2 + 4, n3 + 27, 16750623, 0);
        Client.gl.a(this.x, n2 + 125 - 3, n3 + 27, 0xFFFFFF, 0);
        if (!this.z && System.currentTimeMillis() - this.y > 1000L) {
            long l2 = System.currentTimeMillis() - this.y;
            int n4 = (int)(l2 / 1000L);
            int n5 = n4 % 3600 / 60;
            int n6 = n4 % 60;
            this.x = String.format("%d:%02d", n5, n6);
        }
        return this.j;
    }

    public void b(String string) {
        this.w = string;
    }

    public void c(String string) {
        this.x = string;
    }

    public void a(long l2) {
        this.y = l2;
    }

    public void k(boolean bl) {
        this.z = bl;
    }
}

