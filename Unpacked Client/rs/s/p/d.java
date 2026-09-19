/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 */
package rs.s.p;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.runelite.events.ConfigChanged;
import rs.s.e;
import rs.s.p.a;
import rs.s.p.b;
import rs.s.p.c;

@e(a="Player Outline", b="playeroutline", c="A simple plugin that outlines the player allowing you to see the player behind objects.", d={"highlight, player, outline, color"}, f=false)
public class d
extends rs.s.a {
    @Inject
    private a b;
    @Inject
    private b c;
    @Inject
    private c d;

    @Provides
    a a(i i2) {
        return i2.a(a.class);
    }

    @Override
    protected void a() {
        rs.l.f.e.d().a(this.c);
        if (this.b.b()) {
            rs.l.f.e.d().a(this.d);
        } else {
            rs.l.f.e.d().b(this.d);
        }
    }

    @Override
    protected void b() {
        rs.l.f.e.d().b(this.c);
        rs.l.f.e.d().b(this.d);
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        if (configChanged.getKey().equalsIgnoreCase("petOutline")) {
            if (this.b.b()) {
                rs.l.f.e.d().a(this.d);
            } else {
                rs.l.f.e.d().b(this.d);
            }
        }
    }
}

