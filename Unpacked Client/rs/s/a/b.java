/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 */
package rs.s.a;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.runelite.events.ConfigChanged;
import rs.s.a;
import rs.s.a.c;
import rs.s.a.d;
import rs.s.e;

@e(a="Combat overlays", b="combatInfo", i=true, l=true, d={"combat", "hits", "hit", "splat", "health", "bar"})
public class b
extends a {
    @Inject
    private rs.s.a.a b;

    @Provides
    rs.s.a.a a(i i2) {
        return i2.a(rs.s.a.a.class);
    }

    @Override
    public void a() {
        this.g();
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        this.g();
    }

    private void g() {
        rs.h.c.a(() -> {
            rs.f.a.ap = this.b.f() == rs.s.a.e.c;
            rs.f.a.al = this.b.g() == d.b;
            rs.f.a.aq = this.b.f() == rs.s.a.e.a;
            rs.f.a.as = this.b.d() == c.b;
            rs.f.a.ar = this.b.c() == c.b;
            rs.f.a.aB = this.b.a();
            rs.f.a.at = this.b.b();
            rs.f.a.ak = this.b.h();
        });
    }

    public rs.s.a.a f() {
        return this.b;
    }
}

