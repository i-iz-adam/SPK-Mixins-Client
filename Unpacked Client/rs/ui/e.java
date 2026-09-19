/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 */
package rs.ui;

import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import rs.eventbus.EventBus;
import rs.runelite.events.NavigationButtonAdded;
import rs.runelite.events.NavigationButtonRemoved;
import rs.ui.l;

@Singleton
public class e {
    private final EventBus a;
    private final Set<l> b = new HashSet<l>();

    @Inject
    private e(EventBus eventBus) {
        this.a = eventBus;
    }

    public void a(l l2) {
        if (this.b.contains(l2)) {
            return;
        }
        if (this.b.add(l2)) {
            this.a.post(new NavigationButtonAdded(l2));
        }
    }

    public void b(l l2) {
        if (this.b.remove(l2)) {
            this.a.post(new NavigationButtonRemoved(l2));
        }
    }
}

