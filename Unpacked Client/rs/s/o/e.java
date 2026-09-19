/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.a.d
 *  com.google.a.b.L
 *  com.google.inject.Provides
 *  javax.inject.Inject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.s.o;

import com.google.a.b.L;
import com.google.inject.Provides;
import java.awt.Color;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.A.s;
import rs.A.t;
import rs.Client;
import rs.a.j;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.runelite.a.g;
import rs.runelite.events.ConfigChanged;
import rs.runelite.events.GameStateChanged;
import rs.runelite.events.MenuHover;
import rs.runelite.events.NpcSpawned;
import rs.s.o.a;
import rs.s.o.c;
import rs.s.o.d;

@rs.s.e(a="NPC Indicators", c="Highlight NPCs on-screen", d={"highlight", "minimap", "npcs", "overlay", "respawn", "tags"})
public class e
extends rs.s.a {
    private static final Logger b = LoggerFactory.getLogger(e.class);
    private static final int c = 15;
    private static final String d = "Tag";
    private static final String e = "Un-tag";
    private static final String f = "Tag-All";
    private static final String g = "Un-tag-All";
    private static final String h = "hull";
    private static final String i = "tile";
    private static final String j = "truetile";
    private static final String k = "swtile";
    private static final String l = "swtruetile";
    private static final String m = "outline";
    @Inject
    private Client n;
    @Inject
    private d o;
    @Inject
    private c p;
    @Inject
    private i q;
    @Inject
    private rs.ui.components.a.d r;
    @Inject
    private rs.j.b.d s;
    private final Map<j, a> t = new HashMap<j, a>();
    private List<String> u = new ArrayList<String>();

    @Provides
    d a(i i2) {
        return i2.a(d.class);
    }

    @Override
    protected void a() {
        rs.h.c.a(() -> {
            rs.l.f.e.d().a(this.p);
            this.g();
        });
    }

    @Override
    protected void b() {
        rs.h.c.a(() -> {
            rs.l.f.e.d().b(this.p);
            this.t.clear();
        });
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        if (!configChanged.getGroup().equals("npcindicators")) {
            return;
        }
        boolean bl = this.o.n();
        rs.h.c.a(() -> {
            rs.s.o.c.i = bl;
        });
        rs.h.c.a(this::g);
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged gameStateChanged) {
        if (gameStateChanged.getGameState() == rs.runelite.a.c.f || gameStateChanged.getGameState() == rs.runelite.a.c.c) {
            this.g();
        }
    }

    @Subscribe
    private void onNpcSpawned(NpcSpawned npcSpawned) {
        j j2 = npcSpawned.getNpc();
        if (j2.o() == null) {
            return;
        }
        if (this.a(j2.o())) {
            a a2 = this.c(j2);
            this.t.put(j2, a2);
        }
    }

    @Subscribe
    private void onMenuHover(MenuHover menuHover) {
        if (Client.dj) {
            return;
        }
        if (!rs.runelite.a.g.a(menuHover.getMenuId())) {
            return;
        }
        if (!Client.ag) {
            return;
        }
        int n2 = this.n.eJ[menuHover.getRow()];
        if (n2 < 0 || n2 >= this.n.cA.length) {
            return;
        }
        j j2 = this.n.cA[n2];
        if (j2 == null) {
            return;
        }
        boolean bl = this.a(j2) != null;
        this.s.c(bl ? "<img=360> <img=25> Untag-All @yel@" + j2.o() : "<img=360> Tag-All @yel@" + j2.o(), () -> this.b(j2));
        if (bl) {
            int n3 = this.s.c("<img=360> <img=326> Tag color", () -> System.out.println("Change color"));
            this.s.b(n3).a("<img=78> Reset", () -> this.a(j2.n())).a("@mag@Magenta", () -> this.a(j2.n(), Color.MAGENTA)).a("@yel@Yellow", () -> this.a(j2.n(), Color.YELLOW)).a("@gre@Green", () -> this.a(j2.n(), Color.GREEN)).a("@red@Red", () -> this.a(j2.n(), Color.RED));
            String[] stringArray = new String[]{"Hull", "Tile", "True tile", "South-west tile", "South-west true tile", "Outline"};
            String[] stringArray2 = new String[]{h, i, j, k, l, m};
            int n4 = this.s.c("<img=360> <img=327> Tag style", () -> System.out.println("Change style"));
            rs.j.b.a a2 = this.s.b(n4);
            a2.a("<img=138> Reset", () -> this.c(j2.n()));
            for (int i2 = stringArray.length - 1; i2 >= 0; --i2) {
                String string = stringArray2[i2];
                a2.a(stringArray[i2], () -> this.a(j2.n(), string));
            }
        }
    }

    public a a(j j2) {
        if (j2.o() == null) {
            return null;
        }
        if (this.t.get(j2) != null) {
            return this.t.get(j2);
        }
        return null;
    }

    private void b(j j2) {
        String string = j2.o();
        ArrayList<String> arrayList = new ArrayList<String>(this.u);
        if (!arrayList.removeIf(string::equalsIgnoreCase)) {
            arrayList.add(string);
        }
        SwingUtilities.invokeLater(() -> {
            this.o.a(rs.A.s.a(arrayList));
            rs.h.c.a(this::g);
        });
    }

    @com.google.a.a.d
    List<String> f() {
        String string = this.o.l();
        if (string.isEmpty()) {
            return Collections.emptyList();
        }
        return rs.A.s.a(string);
    }

    void g() {
        this.u = this.f();
        this.t.clear();
        if (!this.n.fc || !this.n.cc || Client.ee != 2) {
            return;
        }
        for (j j2 : this.n.aK()) {
            String string;
            if (j2 == null || (string = j2.o()) == null || !this.a(string)) continue;
            this.t.put(j2, this.c(j2));
        }
    }

    private boolean a(String string) {
        for (String string2 : this.u) {
            if (!rs.A.t.a(string2, string)) continue;
            return true;
        }
        return false;
    }

    private a c(j j2) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        int n2 = j2.n();
        String string = this.d(n2);
        if (string != null) {
            bl6 = h.equals(string);
            bl5 = i.equals(string);
            bl4 = j.equals(string);
            bl3 = k.equals(string);
            bl2 = l.equals(string);
            bl = m.equals(string);
        } else {
            bl6 = this.o.a();
            bl5 = this.o.b();
            bl4 = this.o.c();
            bl3 = this.o.d();
            bl2 = this.o.e();
            bl = this.o.f();
        }
        return rs.s.o.a.a().a(j2).a((Color)L.a((Object)this.b(n2), (Object)this.o.h())).b(this.o.i()).a(bl6).b(bl5).c(bl4).d(bl3).e(bl2).f(bl).g(this.o.g()).a((float)this.o.j()).a(this.o.k()).a(this::d).a();
    }

    private boolean d(j j2) {
        rs.d.d d2 = j2.aG;
        return d2 == null || !d2.h || !this.o.m();
    }

    private void a(int n2, Color color) {
        SwingUtilities.invokeLater(() -> {
            this.q.a("npcindicators", "highlightcolor_" + n2, color);
            rs.h.c.a(this::g);
        });
    }

    private void a(int n2) {
        SwingUtilities.invokeLater(() -> {
            this.q.b("npcindicators", "highlightcolor_" + n2);
            rs.h.c.a(this::g);
        });
    }

    private Color b(int n2) {
        return (Color)this.q.a("npcindicators", "highlightcolor_" + n2, (Type)((Object)Color.class));
    }

    private void a(int n2, String string) {
        SwingUtilities.invokeLater(() -> {
            this.q.b("npcindicators", "tagstyle_" + n2, string);
            rs.h.c.a(this::g);
        });
    }

    private void c(int n2) {
        SwingUtilities.invokeLater(() -> {
            this.q.b("npcindicators", "tagstyle_" + n2);
            rs.h.c.a(this::g);
        });
    }

    private String d(int n2) {
        return this.q.a("npcindicators", "tagstyle_" + n2);
    }

    private List<Color> i() {
        ArrayList<Color> arrayList = new ArrayList<Color>();
        for (j j2 : this.n.aK()) {
            Color color = this.b(j2.n());
            if (color == null || arrayList.contains(color)) continue;
            arrayList.add(color);
            if (arrayList.size() >= 5) break;
        }
        return arrayList;
    }

    Map<j, a> h() {
        return this.t;
    }
}

