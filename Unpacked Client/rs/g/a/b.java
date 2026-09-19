/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.g.a;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.g.a.a;

@Singleton
public class b {
    private static final Logger a = LoggerFactory.getLogger(b.class);
    private final Client b;
    private final List<a> c = new CopyOnWriteArrayList<a>();

    @Inject
    private b(@Nullable Client client) {
        this.b = client;
    }

    public void a(a a2) {
        if (!this.c.contains(a2)) {
            a.debug("Registering key listener: {}", (Object)a2);
            this.c.add(a2);
        }
    }

    public void b(a a2) {
        boolean bl = this.c.remove(a2);
        if (bl) {
            a.debug("Unregistered key listener: {}", (Object)a2);
        }
    }

    public void a(KeyEvent keyEvent) {
        if (keyEvent.isConsumed()) {
            return;
        }
        for (a a2 : this.c) {
            if (!this.c(a2)) continue;
            a.trace("Processing key pressed {} for key listener {}", (Object)keyEvent.paramString(), (Object)a2);
            a2.keyPressed(keyEvent);
            if (!keyEvent.isConsumed()) continue;
            a.debug("Consuming key pressed {} for key listener {}", (Object)keyEvent.paramString(), (Object)a2);
            break;
        }
    }

    public void b(KeyEvent keyEvent) {
        if (keyEvent.isConsumed()) {
            return;
        }
        for (a a2 : this.c) {
            if (!this.c(a2)) continue;
            a.trace("Processing key released {} for key listener {}", (Object)keyEvent.paramString(), (Object)a2);
            a2.keyReleased(keyEvent);
            if (!keyEvent.isConsumed()) continue;
            a.debug("Consuming key released {} for listener {}", (Object)keyEvent.paramString(), (Object)a2);
            break;
        }
    }

    public void c(KeyEvent keyEvent) {
        if (keyEvent.isConsumed()) {
            return;
        }
        for (a a2 : this.c) {
            if (!this.c(a2)) continue;
            a.trace("Processing key typed {} for key listener {}", (Object)keyEvent.paramString(), (Object)a2);
            a2.keyTyped(keyEvent);
            if (!keyEvent.isConsumed()) continue;
            a.debug("Consuming key typed {} for key listener {}", (Object)keyEvent.paramString(), (Object)a2);
            break;
        }
    }

    private boolean c(a a2) {
        if (this.b == null) {
            return true;
        }
        return true;
    }
}

