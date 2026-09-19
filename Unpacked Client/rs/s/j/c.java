/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 */
package rs.s.j;

import com.google.inject.Provides;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import rs.Client;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.runelite.events.GameStateChanged;
import rs.s.e;
import rs.s.j.a;
import rs.s.j.b;

@e(a="Key Remapping", b="keyRemapping", c="Allows use of WASD keys for camera movement with 'Press Enter to Chat'", d={"enter", "chat", "wasd", "camera"}, f=false)
public class c
extends rs.s.a {
    private boolean b;
    @Inject
    private rs.g.a.b c;
    @Inject
    private b d;
    @Inject
    private Client e;

    @Provides
    a a(i i2) {
        return i2.a(a.class);
    }

    @Override
    protected void a() {
        this.b = false;
        this.c.a(this.d);
        rs.h.c.a(() -> {
            if (this.e.fc) {
                this.f();
            }
        });
    }

    @Override
    protected void b() {
        this.c.b(this.d);
        rs.h.c.a(() -> {
            if (this.e.fc) {
                this.g();
            }
        });
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == rs.runelite.a.c.g) {
            this.f();
        }
    }

    public void f() {
        Client.dk = "";
        this.e.dl = "Press Enter to Chat...";
        SwingUtilities.invokeLater(() -> this.a(false));
    }

    public void g() {
        this.e.dl = null;
        SwingUtilities.invokeLater(() -> this.a(true));
    }

    public boolean h() {
        if (Client.w != null) {
            if (Client.w.b) {
                return false;
            }
        }
        if (this.e.gp != -1 && this.e.gp != 4882 && this.e.gp != 4887 && this.e.gp != 4893 && this.e.gp != 4900 && this.e.gp != 2459 && this.e.gp != 2469 && this.e.gp != 2480 && this.e.gp != 2492 && this.e.gp != 6179) {
            return false;
        }
        if (this.e.gb) {
            return false;
        }
        if (this.e.fN != 0) {
            return false;
        }
        return this.e.cc && this.e.cd && this.e.fc;
    }

    public boolean i() {
        return this.e.gb || this.e.fN > 0 || this.e.gp > -1;
    }

    boolean j() {
        return this.b;
    }

    void a(boolean bl) {
        this.b = bl;
    }
}

