/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 *  com.google.a.d.ch
 *  com.google.inject.Provides
 *  javax.inject.Inject
 */
package rs.s.l;

import com.google.a.b.as;
import com.google.a.d.ch;
import com.google.inject.Provides;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import rs.Client;
import rs.a.j;
import rs.d.k;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.j.b.d;
import rs.runelite.a.g;
import rs.runelite.events.MenuHover;
import rs.runelite.events.MenuOpened;
import rs.s.e;
import rs.s.l.a;
import rs.s.l.b;

@e(a="Menu Entry Swapper", b="menuSwapper", c="Change the default option that is displayed when hovering over objects", d={"npcs", "inventory", "items", "objects"}, f=false)
public class c
extends rs.s.a {
    public static boolean b = false;
    private static final String c = "shiftclick";
    private static final String d = "item_";
    private static final String e = "object_";
    private static final String f = "object_shift_";
    private static final String g = "npc_";
    private static final String h = "npc_shift_";
    private static final String i = "wornitem_";
    private static final String j = "wornitem_shift_";
    @Inject
    private i k;
    @Inject
    private d l;
    @Inject
    private b m;
    @Inject
    private Client n;
    private final a o = (n2, n3) -> rs.runelite.a.g.e(n3) == n2;
    private Map<Integer, Integer> p = new HashMap<Integer, Integer>();
    private Map<Integer, Integer> q = new HashMap<Integer, Integer>();
    private final a r = (n2, n3) -> Launcher.n().o().eJ[n3] == n2;
    private Map<Integer, Integer> s = new HashMap<Integer, Integer>();
    private Map<Integer, Integer> t = new HashMap<Integer, Integer>();
    private final a u = (n2, n3) -> Launcher.n().o().eH[n3] == n2;
    private Map<Integer, Integer> v = new HashMap<Integer, Integer>();
    private Map<Integer, Integer> w = new HashMap<Integer, Integer>();
    private static final List<Integer> x = ch.a((Object)20, (Object)412, (Object)225, (Object)965, (Object)478);
    private static final List<Integer> y = ch.a((Object)74, (Object)454, (Object)539, (Object)493, (Object)847);

    @Provides
    b a(i i2) {
        return i2.a(b.class);
    }

    @Override
    protected void a() {
        rs.h.c.a(() -> {
            b = true;
        });
    }

    @Override
    protected void b() {
        rs.h.c.a(() -> {
            b = false;
        });
    }

    @Subscribe
    public void onMenuHover(MenuHover menuHover) {
        if (this.n.eV - 1 <= 0) {
            return;
        }
        int n2 = this.n.eV - 1;
        int n3 = this.n.eI[n2];
        if (rs.runelite.a.g.a(n3)) {
            j j2 = rs.runelite.a.g.f(n2);
            if (j2 != null) {
                Integer n4 = this.a(this.i(), j2.n());
                if (n4 != null && n4 == 516) {
                    for (int i2 = 0; i2 < this.n.eV; ++i2) {
                        if (rs.runelite.a.g.f(i2) == null || rs.runelite.a.g.e(i2) == j2.n() || this.n.eI[i2] != n3) continue;
                        rs.j.b.d.a(n2, i2);
                        return;
                    }
                }
                if (n4 != null && n4 != -1) {
                    this.a(this.o, j2.n(), (int)n4);
                }
            }
        } else if (!rs.runelite.a.g.c(n3) && rs.runelite.a.g.d(n3)) {
            int n5 = this.n.eJ[n2];
            Integer n6 = this.b(this.i(), n5);
            if (rs.f.a.aC && this.i() && n6 == -1) {
                n6 = 847;
            }
            if (n6 != null && n6 != -1) {
                this.a(this.r, n5, (int)n6);
            }
        }
    }

    @Subscribe
    public void onMenuOpened(MenuOpened menuOpened) {
        this.f();
        this.g();
    }

    private void f() {
        if (!this.i() || !this.m.c()) {
            return;
        }
        for (int i2 = this.n.eV - 1; i2 >= 0; --i2) {
            rs.d.d d2;
            j j2;
            int n2 = this.n.eI[i2];
            if (n2 != 1025 || (j2 = rs.runelite.a.g.f(i2)) == null || j2.aG == null || (d2 = rs.d.d.c(j2.n())) == null || d2.o == null) continue;
            rs.j.b.a a2 = this.l.a("Swap left click", this.l.c("Swap left click @yel@" + d2.o, () -> {}));
            rs.j.b.a a3 = this.l.a("Swap shift click", this.l.c("Swap shift click @yel@" + d2.o, () -> {}));
            int n3 = this.a(false, j2.n());
            int n4 = this.a(true, j2.n());
            if (n3 != -1) {
                a2.a("Reset", () -> this.c(false, j2.n()));
            }
            if (n4 != -1) {
                a3.a("Reset", () -> this.c(true, j2.n()));
            }
            a2.a("Walk here", () -> this.a(false, j2.n(), 516));
            a3.a("Walk here", () -> this.a(true, j2.n(), 516));
            for (int i3 = 0; i3 < d2.p.length; ++i3) {
                String string = d2.p[i3];
                int n5 = i3;
                if (as.c((String)string) || string.equalsIgnoreCase("Attack") || n4 == x.get(i3) || n3 == x.get(i3) || i3 == 0) continue;
                a2.a(string, () -> this.a(false, j2.n(), (int)x.get(n5)));
                a3.a(string, () -> this.a(true, j2.n(), (int)x.get(n5)));
            }
        }
    }

    private void g() {
        if (!this.i() || !this.m.a() && !this.m.b()) {
            return;
        }
        for (int i2 = this.n.eV - 1; i2 >= 0; --i2) {
            rs.j.b.a a2;
            int n2;
            k k2;
            int n3 = this.n.eI[i2];
            if (n3 != 1125 || (k2 = rs.d.k.f(n2 = this.n.eJ[i2])) == null || k2.w == null) continue;
            int n4 = this.b(false, n2);
            int n5 = this.b(true, n2);
            rs.j.b.a a3 = this.m.a() ? this.l.a(k2.x + " left click", this.l.c("Swap left click @lre@" + k2.x, () -> {})) : null;
            rs.j.b.a a4 = a2 = this.m.b() ? this.l.a(k2.x + " shift click", this.l.c("Swap shift click @lre@" + k2.x, () -> {})) : null;
            if (n4 != -1 && this.m.a()) {
                a3.a("Reset", () -> this.d(false, n2));
            }
            if (n5 != -1 && this.m.b()) {
                a2.a("Reset", () -> this.d(true, n2));
            }
            for (int i3 = 0; i3 < k2.L.length; ++i3) {
                String string = k2.L[i3];
                int n6 = i3;
                if (n5 == y.get(i3) || n4 == y.get(i3) || i3 == 0 || as.c((String)string)) continue;
                if (this.m.a() && y.get(i3) != 454) {
                    a3.a(string, () -> this.b(false, n2, y.get(n6)));
                }
                if (!this.m.b()) continue;
                a2.a(string, () -> this.b(true, n2, y.get(n6)));
            }
            if (this.m.a() && n4 != 447) {
                a3.a("Use", () -> this.b(false, n2, 447));
            }
            if (!this.m.b() || n5 == 447) continue;
            a2.a("Use", () -> this.b(true, n2, 447));
        }
    }

    private void a(a a2, int n2, int n3) {
        int n4 = this.n.eV - 1;
        int n5 = -1;
        for (int i2 = 0; i2 < this.n.eV; ++i2) {
            int n6 = this.n.eI[i2];
            if (n3 != 516 && !a2.isMatchingEntity(n2, i2) || n6 != n3) continue;
            n5 = i2;
            break;
        }
        if (n5 == -1 || n4 == -1) {
            return;
        }
        rs.j.b.d.a(n5, n4);
    }

    private void h() {
    }

    private boolean i() {
        return Client.ag;
    }

    private Integer a(boolean bl, int n2) {
        Map<Integer, Integer> map;
        Map<Integer, Integer> map2 = map = bl ? this.q : this.p;
        if (map.containsKey(n2)) {
            return map.get(n2);
        }
        String string = this.k.a("menuentryswapper", (bl ? h : g) + n2);
        if (string == null || string.isEmpty()) {
            return -1;
        }
        int n3 = Integer.parseInt(string);
        map.put(n2, n3);
        return n3;
    }

    private Integer b(boolean bl, int n2) {
        Map<Integer, Integer> map;
        Map<Integer, Integer> map2 = map = bl ? this.t : this.s;
        if (map.containsKey(n2)) {
            return map.get(n2);
        }
        String string = this.k.a(bl ? c : "menuentryswapper", d + n2);
        if (string == null || string.isEmpty()) {
            return -1;
        }
        return Integer.parseInt(string);
    }

    private void a(boolean bl, int n2, int n3) {
        if (n2 == -1) {
            return;
        }
        (bl ? this.q : this.p).put(n2, n3);
        this.k.a("menuentryswapper", (bl ? h : g) + n2, n3);
    }

    private void c(boolean bl, int n2) {
        if (n2 == -1) {
            return;
        }
        (bl ? this.q : this.p).remove(n2);
        this.k.b("menuentryswapper", (bl ? h : g) + n2);
    }

    private void b(boolean bl, int n2, int n3) {
        (bl ? this.t : this.s).put(n2, n3);
        this.k.a(bl ? c : "menuentryswapper", d + n2, n3);
    }

    private void d(boolean bl, int n2) {
        (bl ? this.t : this.s).remove(n2);
        this.k.b(bl ? c : "menuentryswapper", d + n2);
    }
}

