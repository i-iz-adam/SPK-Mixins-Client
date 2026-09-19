/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
package rs.s.c;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.event.KeyEvent;
import javax.inject.Inject;
import rs.Client;
import rs.s.c.a;
import rs.s.c.c;
import rs.s.c.e;

public class b
extends rs.l.f.b
implements rs.g.a.a {
    private final a e;
    private final c f;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private long l = 0L;

    @Inject
    public b(c c2, a a2) {
        this.f = c2;
        this.e = a2;
        this.a(rs.l.f.a.A);
    }

    @Override
    public void a() {
        e.a a2;
        int n2 = Client.hP + 5;
        int n3 = Client.hQ + 15;
        if (this.k != this.e.m()) {
            this.k = this.e.m();
            this.i = 0;
            this.j = 0;
        }
        if (this.e.k()) {
            Client.gl.b("@gre@m:" + Client.hP + "," + Client.hQ, n2, n3, 0, 0);
            n3 -= 15;
            if (Client.ag) {
                int n4 = Client.hP - this.g;
                int n5 = Client.hQ - this.h;
                Client.gl.b("@red@drag:" + n4 + "," + n5, n2, n3, 0, 0);
                n3 -= 15;
                Polygon polygon = new Polygon();
                polygon.addPoint(this.g, this.h);
                if (Client.hP > this.g) {
                    polygon.addPoint(this.g, Client.hQ);
                    polygon.addPoint(Client.hP, Client.hQ);
                    polygon.addPoint(Client.hP, this.h);
                }
                this.a(polygon, Color.RED, new Color(255, 0, 0, 50));
            } else {
                this.g = Client.hP;
                this.h = Client.hQ;
            }
        }
        if (this.m()) {
            Client.gl.b("@mag@intf:" + this.i + "," + this.j, n2, n3, 0, 0);
            n3 -= 15;
        }
        while ((a2 = this.f.f().k().poll()) != null) {
            Polygon polygon = new Polygon();
            polygon.addPoint(a2.b(), a2.c());
            polygon.addPoint(a2.b(), a2.c() + 1);
            polygon.addPoint(a2.b() + 1, a2.c() + 1);
            polygon.addPoint(a2.b() + 1, a2.c());
            int n6 = Math.max(Math.abs(a2.b() - Client.hP), Math.abs(a2.c() - Client.hQ));
            this.a(polygon, n6 <= 1 ? Color.green : Color.magenta);
            Client.gl.b(a2.a(), a2.b(), a2.c(), n6 <= 1 ? Color.green.getRGB() : a2.d().i, 0);
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int n2;
        if (!this.m()) {
            return;
        }
        int n3 = n2 = keyEvent.isControlDown() ? 10 : 1;
        if (keyEvent.getKeyCode() == 39) {
            this.i += n2;
            this.k();
            keyEvent.consume();
        } else if (keyEvent.getKeyCode() == 37) {
            this.i -= n2;
            this.k();
            keyEvent.consume();
        }
        if (keyEvent.getKeyCode() == 38) {
            this.j -= n2;
            this.k();
            keyEvent.consume();
        } else if (keyEvent.getKeyCode() == 40) {
            this.j += n2;
            this.k();
            keyEvent.consume();
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    private void k() {
        if (this.l() == null || System.currentTimeMillis() - this.l < 10L) {
            return;
        }
        this.l = System.currentTimeMillis();
        this.l().a();
    }

    private rs.n.d.c l() {
        if (this.e.l() > 0) {
            return rs.s.c.c.c.get(this.e.l());
        }
        if (this.e.m() > 0 && Client.cH > 0) {
            return rs.s.c.c.c.get(Client.cH);
        }
        return null;
    }

    private boolean m() {
        return this.l() != null;
    }
}

