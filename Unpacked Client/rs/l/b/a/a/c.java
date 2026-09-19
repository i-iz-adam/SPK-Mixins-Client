/*
 * Decompiled with CFR 0.152.
 */
package rs.l.b.a.a;

import java.awt.Color;
import java.awt.Polygon;
import java.util.Iterator;
import rs.Client;
import rs.a.h;
import rs.c_0;
import rs.l.b.a.a.a;
import rs.l.b.a.d;
import rs.l.e.j;
import rs.v_0;

public class c
extends a {
    private int t;
    private rs.d.d u;

    public c(int n2) {
        this.t = n2;
        this.u = rs.d.d.c(n2);
    }

    @Override
    protected void b() {
        this.d(this.u.w);
    }

    @Override
    protected void c() {
        rs.d.a a2 = rs.d.a.a[this.h];
        int n2 = a2.e[this.i];
        h h2 = this.u.a(-1, n2, null, this.h);
        if (this.n) {
            // empty if block
        }
        if (h2 != null) {
            Polygon polygon = h2.b(this.b, this.c, this.d - v_0.k + Client.cK, 0);
            j j2 = new j(this, polygon, Color.GREEN, Color.BLACK, this.f);
            j2.f = Color.GREEN;
            Client.ab.c.a(this.f, (Object)j2);
            h2.a(this.e, v_0.m, v_0.n, v_0.o, v_0.p, this.b - v_0.j, this.d - v_0.k, this.c - v_0.l, this.f, 0);
            h2.K = (short)256;
            rs.a.h.H = -1;
            if (j2.g && rs.l.b.a.d.b.j) {
                if (rs.l.b.a.d.b.k == 1) {
                    rs.l.b.a.d.b.c("Selected @gre@NPC entity #" + (this.m + 1));
                    this.n = true;
                    rs.l.b.a.d.b.f();
                } else {
                    this.o = false;
                    rs.l.b.a.d.b.c("Deleted @red@NPC entity #" + (this.m + 1));
                }
                rs.l.b.a.d.b.j = false;
            }
            if (j2.g) {
                c_0.a(rs.l.b.a.d.b.l, polygon, new Color(0, 255, 0, 150), new Color(0, 255, 0, 25));
            }
            this.c(h2.g + 10);
            if (rs.l.b.a.d.e) {
                Client.gl.a((this.n ? "@gre@" : "") + (this.m + 1), this.k, this.l);
            }
            if (this.n) {
                try {
                    int n3 = 10;
                    int n4 = rs.l.b.a.d.b.f.B().getHeight() - 65;
                    Object object = "[ ";
                    int n5 = 0;
                    Iterator iterator = this.q.keySet().iterator();
                    while (iterator.hasNext()) {
                        int n6 = (Integer)iterator.next();
                        if (n5 == this.r) {
                            object = (String)object + "<u=0>";
                        }
                        object = this.k().contains(n6) ? (String)object + "@gre@" + n6 : (this.p.containsKey(n6) ? (String)object + "@whi@" + n6 : (String)object + "@red@" + n6);
                        if (n5 == this.r) {
                            object = (String)object + "</u>";
                        }
                        object = (String)object + " ";
                        ++n5;
                    }
                    object = (String)object + "@whi@]";
                    rs.l.b.a.d.b.f.gm.a((String)object, n3, n4, 0xFFFFFF, 0, false);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            h2 = null;
        }
    }

    public void g(int n2) {
        this.t = n2;
        this.u = rs.d.d.c(n2);
        this.d(this.u.w);
        this.a(false);
    }

    public rs.d.d n() {
        return this.u;
    }

    public int o() {
        return this.t;
    }

    public void p() {
        this.b();
    }

    public void q() {
        this.d(this.u.q);
    }

    public void r() {
        this.d(this.u.w);
    }
}

