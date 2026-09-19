/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 */
package rs.s.h;

import com.google.inject.Provides;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import rs.Client;
import rs.a.a_0;
import rs.a.d_0;
import rs.e.i;
import rs.eventbus.Subscribe;
import rs.runelite.events.ConfigChanged;
import rs.runelite.events.SkillLevelChanged;
import rs.s.e;
import rs.s.h.b;
import rs.ui.a.c;
import rs.ui.a.f;
import rs.ui.a.h;
import rs.ui.a.j;

@e(a="Timers / Info Boxes", b="infoBoxes", i=true, d={"potions", "boost", "buff", "skill"})
public class a
extends rs.s.a {
    public static boolean b = true;
    public static final ConcurrentHashMap.KeySetView<String, Boolean> c = ConcurrentHashMap.newKeySet();
    public static final ConcurrentHashMap.KeySetView<String, Boolean> d = ConcurrentHashMap.newKeySet();
    public static int e = 5;
    @Inject
    private b f;
    @Inject
    private f g;
    @Inject
    private a_0 h;

    @Provides
    b a(i i2) {
        return i2.a(b.class);
    }

    @Override
    public void a() {
        b = true;
        this.h();
    }

    @Override
    public void b() {
        b = false;
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged configChanged) {
        this.h();
        if (configChanged.getKey().equalsIgnoreCase("infoBoxSize")) {
            this.h.a();
            this.g.c().values().forEach(g2 -> g2.M().forEach(c2 -> this.g.d((c)c2)));
        }
        if (configChanged.getKey().equalsIgnoreCase("counterTimeout")) {
            this.g.c().values().forEach(g2 -> g2.M().forEach(c2 -> {
                if (c2.q() > 0 && c2 instanceof rs.ui.a.b) {
                    c2.c(this.f.h());
                }
            }));
        }
    }

    @Subscribe
    public void onSkillLevelChanged(SkillLevelChanged skillLevelChanged) {
        if (skillLevelChanged.getSkillId() != 0 && skillLevelChanged.getSkillId() != 2 && skillLevelChanged.getSkillId() != 4 && skillLevelChanged.getSkillId() != 1 && skillLevelChanged.getSkillId() != 6) {
            return;
        }
        if (!this.f.m()) {
            return;
        }
        int n2 = skillLevelChanged.getSkillId();
        int n3 = skillLevelChanged.getCurrentLevel();
        int n4 = skillLevelChanged.getMaximumLevel();
        String string = rs.f.e.b[skillLevelChanged.getSkillId()];
        String string2 = string.substring(0, 1).toUpperCase() + string.substring(1) + " boost";
        if (skillLevelChanged.getCurrentLevel() == skillLevelChanged.getMaximumLevel()) {
            List<c> list;
            this.g.b(string2);
            if (this.g.c().get("Combat boosts") != null && (list = this.g.c().get("Combat boosts").M()).size() == 1 && list.get(0) instanceof j) {
                this.g.b("Next buff change");
            }
            return;
        }
        d_0 d_02 = this.h.a("skills/" + n2, -1);
        c c2 = this.g.a(string2);
        if (c2 != null) {
            ((rs.ui.a.a)c2).a(n3 - n4);
        } else {
            rs.ui.a.a a2 = new rs.ui.a.a(d_02, "Combat boosts", string2, n3 - n4, n2);
            a2.a(rs.ui.a.e.b);
            a2.a("@lre@" + string2);
            this.g.b(a2);
        }
        this.g();
    }

    private void g() {
        if (Client.dx > 0) {
            d_0 d_02 = this.h.a("skills/1338", -1);
            c c2 = this.g.a("Next buff change");
            if (c2 != null) {
                ((j)c2).b(Duration.of(Client.dx, ChronoUnit.SECONDS));
            } else {
                j j2 = new j(Client.dx, ChronoUnit.SECONDS, d_02, "Combat boosts", "Next buff change");
                j2.a("@lre@Next buff change");
                j2.a(rs.ui.a.h.d);
                this.g.b(j2);
            }
        }
    }

    private void h() {
        rs.h.c.a(() -> {
            this.i();
            e = this.f.h();
        });
    }

    private void i() {
        c.clear();
        d.clear();
        this.j();
        this.k();
    }

    private void j() {
        if (!this.f.g()) {
            c.add("Blood slayer");
        }
        if (!this.f.d()) {
            c.add("DFS Cooldown");
        }
        if (!this.f.e()) {
            c.add("Freeze timer");
        }
        if (!this.f.a()) {
            c.add("Antifire");
        }
        if (!this.f.b()) {
            c.add("Antipoison");
        }
        if (!this.f.c()) {
            c.add("Antivenom");
        }
        if (!this.f.f()) {
            c.add("Teleport block");
        }
        if (!this.f.n()) {
            c.add("Next buff change");
        }
        if (!this.f.i()) {
            c.add("Slayer task");
            c.add("Blood slayer task");
            c.add("Slayer task (normal)");
        }
        if (!this.f.k()) {
            c.add("Soul hunter task");
        }
        if (!this.f.m()) {
            c.add("Ranged boost");
            c.add("Magic boost");
            c.add("Attack boost");
            c.add("Defence boost");
            c.add("Strength boost");
        }
        if (!this.f.k()) {
            c.add("Soul hunter task");
        }
        if (!this.f.j()) {
            c.add("Task scroll (primary)");
            c.add("Task scroll (secondary)");
            c.add("Task scroll (req. #1)");
            c.add("Task scroll (req. #2)");
        }
        if (!this.f.o()) {
            d.add("raid_affs");
        }
    }

    private void k() {
        if (!this.f.l()) {
            d.add("Wanderer");
        }
    }

    public b f() {
        return this.f;
    }
}

