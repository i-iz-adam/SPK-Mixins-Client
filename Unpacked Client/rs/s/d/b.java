/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 */
package rs.s.d;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.Client;
import rs.a.c;
import rs.a.j;
import rs.a.k;
import rs.a.l;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.runelite.b.a;
import rs.runelite.events.ConfigChanged;
import rs.s.a;
import rs.s.e;

@e(a="Entity Hider", c="Hide players, NPCs, and/or projectiles", d={"npcs", "players", "projectiles", "pet"}, f=false)
public class b
extends a {
    @Inject
    private rs.s.d.a b;
    @Inject
    private Client c;
    private a.a d;
    private a.a e;

    @Provides
    rs.s.d.a a(i i2) {
        return i2.a(rs.s.d.a.class);
    }

    @Override
    protected void a() {
        this.a(true);
    }

    @Override
    protected void b() {
        this.a(false);
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        if (configChanged.getGroup().equals("entityhider")) {
            this.a(true);
        }
    }

    private a.a f() {
        boolean bl = this.b.a();
        boolean bl2 = this.b.d();
        boolean bl3 = this.b.c();
        boolean bl4 = this.b.f();
        boolean bl5 = this.b.g();
        boolean bl6 = this.b.i();
        boolean bl7 = this.b.j();
        boolean bl8 = this.b.k();
        boolean bl10 = this.b.h();
        return (a2, bl9) -> {
            c c2;
            boolean bl10;
            boolean bl11 = bl10 = Client.ed == 197;
            if (a2 instanceof k) {
                c2 = (k)a2;
                if (((k)c2).q()) {
                    return !bl;
                }
                if (!bl10 && bl2) {
                    return false;
                }
            }
            if (a2 instanceof j) {
                c2 = (j)a2;
                if (((j)c2).aG == null) {
                    return false;
                }
                if (c2.j() || c2.k()) {
                    return !bl3;
                }
                if (((j)c2).aG.x == 2012L) {
                    return !bl7;
                }
                if (((j)c2).aG.x == 4437L) {
                    return !bl8;
                }
                if (c2.i()) {
                    return !bl5;
                }
                if (!bl10 && c2.h()) {
                    return !bl4;
                }
            }
            if (a2 instanceof l) {
                return !bl6;
            }
            return true;
        };
    }

    private a.a g() {
        boolean bl = this.b.e();
        return (a2, bl2) -> {
            k k2;
            boolean bl3;
            boolean bl4 = bl3 = Client.ed == 197;
            return !(a2 instanceof k) || bl3 || (k2 = (k)a2).q() || !bl;
        };
    }

    private void a(boolean bl) {
        this.h();
        if (bl) {
            rs.f.a.bq = this.b.a();
            rs.f.a.bp = !this.b.h();
            a.a a2 = this.f();
            rs.runelite.b.a.a().add(a2);
            this.d = a2;
            a.a a3 = this.g();
            rs.runelite.b.a.b().add(a3);
            this.e = a3;
        } else {
            rs.f.a.bq = false;
        }
    }

    private void h() {
        if (this.d != null) {
            rs.runelite.b.a.a().remove(this.d);
            this.d = null;
        }
        if (this.e != null) {
            rs.runelite.b.a.b().remove(this.e);
            this.e = null;
        }
    }
}

