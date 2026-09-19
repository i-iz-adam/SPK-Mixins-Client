/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 */
package rs.s.i;

import com.google.inject.Inject;
import com.google.inject.Provides;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.runelite.events.EntityInteraction;
import rs.runelite.events.ObjectInteraction;
import rs.s.a;
import rs.s.e;
import rs.s.i.b;

@e(a="Interact Highlight", b="interacthighlight", c="Outlines npcs and objects you interact with or hover over", f=false)
public class c
extends a {
    @Inject
    private b b;

    @Provides
    rs.s.i.a a(i i2) {
        return i2.a(rs.s.i.a.class);
    }

    @Override
    protected void a() {
        rs.l.f.e.d().a(this.b);
    }

    @Override
    protected void b() {
        this.b.l();
        rs.l.f.e.d().b(this.b);
    }

    @Subscribe
    private void onEntityInteraction(EntityInteraction entityInteraction) {
        this.b.a(entityInteraction);
    }

    @Subscribe
    private void onObjectInteraction(ObjectInteraction objectInteraction) {
        this.b.a(objectInteraction);
    }
}

