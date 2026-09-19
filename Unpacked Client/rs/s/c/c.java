/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 */
package rs.s.c;

import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import javax.inject.Inject;
import rs.Client;
import rs.a.j_0;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.runelite.events.ConfigChanged;
import rs.s.c.a;
import rs.s.c.b;
import rs.s.c.d;
import rs.s.c.e;
import rs.s.c.f;
import rs.s.c.g;
import rs.ui.l;

@rs.s.e(a="Developer Tools", b="devtools", d={"panel"}, h=true)
public class c
extends rs.s.a {
    public static d b = null;
    public static HashMap<Integer, rs.n.d.c> c = new HashMap();
    @Inject
    private Client h;
    @Inject
    private rs.ui.e i;
    @Inject
    private a j;
    @Inject
    private rs.g.a.b k;
    private e l;
    private b m;
    private f n;
    private l o;
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;

    @Override
    protected void a() {
        b = new d();
        g g2 = (g)this.a.getInstance(g.class);
        this.l = (e)this.a.getInstance(e.class);
        this.m = (b)this.a.getInstance(b.class);
        this.n = (f)this.a.getInstance(f.class);
        this.k.a(this.m);
        BufferedImage bufferedImage = j_0.b(this.getClass(), "devtools_icon.png");
        this.o = rs.ui.l.a().a("Developer Tools").a(bufferedImage).a(1).a(g2).a();
        this.i.a(this.o);
        rs.l.f.e.d().e().add(this.l);
        rs.l.f.e.d().a(this.m);
        rs.l.f.e.d().a(this.n);
        this.i();
        Launcher.n().p().m().setAlwaysOnTop(this.j.e());
    }

    @Override
    protected void b() {
        this.i.b(this.o);
        rs.l.f.e.d().e().remove(this.l);
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        this.i();
        if (configChanged.getKey().equalsIgnoreCase("showObjectIds")) {
            rs.h.c.a(() -> this.h.b());
        }
        if (configChanged.getKey().equalsIgnoreCase("alwaysOnTop")) {
            Launcher.n().p().m().setAlwaysOnTop(this.j.e());
        }
    }

    @Provides
    a a(i i2) {
        return i2.a(a.class);
    }

    private void i() {
        d = this.j.d();
        e = this.j.a();
        f = this.j.b();
        g = this.j.k();
    }

    public e f() {
        return this.l;
    }

    public b g() {
        return this.m;
    }

    public f h() {
        return this.n;
    }
}

