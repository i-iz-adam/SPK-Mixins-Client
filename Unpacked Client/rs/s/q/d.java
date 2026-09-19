/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.c.C
 *  com.google.c.l
 *  com.google.inject.Provides
 *  javax.inject.Inject
 */
package rs.s.q;

import com.google.c.C;
import com.google.c.l;
import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import rs.a.j_0;
import rs.e.i;
import rs.s.e;
import rs.s.q.a;
import rs.s.q.b;

@e(a="PvP Tracker", b="pvptracker")
public class d
extends rs.s.a {
    public static String b = "pvptracker";
    public static l c;
    public static a d;
    public static d e;
    @Inject
    private rs.ui.e f;
    @Inject
    private i g;
    @Inject
    private ScheduledExecutorService h;
    @Inject
    private a i;
    @Inject
    private l j;
    private rs.s.q.a.a k;
    private ArrayList<rs.s.q.a.a> l;
    private b m;
    private rs.ui.l n;

    @Provides
    a a(i i2) {
        return i2.a(a.class);
    }

    @Override
    protected void a() {
        d = this.i;
        e = this;
        c = this.j.a().b().a(Double.class, (d2, type, d3) -> d2.isNaN() ? new C((Number)0) : new C((Number)BigDecimal.valueOf(d2).setScale(3, RoundingMode.HALF_UP))).j();
        this.l = new ArrayList();
        this.k = new rs.s.q.a.a();
        this.m = (b)this.a.getInstance(b.class);
        BufferedImage bufferedImage = j_0.b(this.getClass(), "pvp_icon.png");
        this.n = rs.ui.l.a().a("PvP Tracker").a(bufferedImage).a(2).a(this.m).a();
        this.f.a(this.n);
    }

    @Override
    protected void b() {
        this.f.b(this.n);
    }

    public void f() {
        if (this.k != null && !this.k.c()) {
            rs.s.q.a.a a2 = new rs.s.q.a.a();
            a2.a(new rs.s.q.a.b(this.k.d().k()));
            a2.d().e(this.k.d().g());
            a2.d().a(this.k.d().i(), this.k.d().h());
            a2.d().b(this.k.d().e(), this.k.d().f());
            a2.d().c(this.k.d().j());
            a2.b(new rs.s.q.a.b(this.k.e().k()));
            a2.e().e(this.k.e().g());
            a2.e().a(this.k.e().i(), this.k.e().h());
            a2.e().b(this.k.e().e(), this.k.e().f());
            a2.e().c(this.k.e().j());
            this.l.add(a2);
            this.m.a(a2);
            this.k = new rs.s.q.a.a();
            this.m.c().a(this.k);
            this.m.c().a();
        }
    }

    public void a(String string) {
        this.g.b(b, "nameFilter", string.trim().toLowerCase());
    }

    public void g() {
    }

    public void b(String string) {
    }

    public void h() {
        this.l.clear();
        this.m.b();
    }

    public rs.s.q.a.a i() {
        return this.k;
    }

    public ArrayList<rs.s.q.a.a> j() {
        return this.l;
    }

    public b k() {
        return this.m;
    }
}

