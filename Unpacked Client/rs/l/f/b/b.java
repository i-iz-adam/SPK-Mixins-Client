/*
 * Decompiled with CFR 0.152.
 */
package rs.l.f.b;

import java.awt.Polygon;
import rs.Client;
import rs.a.h;
import rs.a.j;
import rs.d.d;
import rs.runelite.a.m;

public abstract class b
extends rs.l.f.b {
    protected j e;
    protected d f;
    protected h g;
    protected int h;

    public void a(j j2) {
        this.e = j2;
        this.f = j2.aG;
    }

    @Override
    public void b() {
        this.e = null;
        this.f = null;
    }

    public m l() {
        return this.g.a(this.e.ac, this.e.ad, this.e.ae, this.e.as + Client.cK);
    }

    public Polygon m() {
        return this.g.b(this.e.ac, this.e.ad, this.e.as + Client.cK, this.e.ae);
    }

    public j n() {
        return this.e;
    }

    public d o() {
        return this.f;
    }

    public h p() {
        return this.g;
    }

    public void a(h h2) {
        this.g = h2;
    }

    public int q() {
        return this.h;
    }

    public void b(int n2) {
        this.h = n2;
    }
}

