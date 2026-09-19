/*
 * Decompiled with CFR 0.152.
 */
package rs.s.h;

import rs.e.e;
import rs.e.g;
import rs.e.l;
import rs.e.q;

@e(a="infoBoxes")
public interface b
extends rs.e.b {
    public static final String a = "infoBoxes";
    @l(a="Timers", b="Info boxes for timers", c=1)
    public static final String b = "timers";
    @l(a="Counters", b="Info boxes for counters", c=2)
    public static final String c = "counters";
    @l(a="Statuses", b="Info boxes for statuses", c=3)
    public static final String d = "statuses";
    @l(a="Appearence", b="The appearence of infoboxes", c=0)
    public static final String e = "appearence";

    @g(b="antifireTimer", c="Antifire timer", d="Display this timer as an infobox when active", h="timers", a=0)
    default public boolean a() {
        return true;
    }

    @g(b="antipoisonTimer", c="Antipoison timer", d="Display this timer as an infobox when active", h="timers", a=1)
    default public boolean b() {
        return true;
    }

    @g(b="antiVenomTimer", c="Anti-venom timer", d="Display this timer as an infobox when active", h="timers", a=2)
    default public boolean c() {
        return true;
    }

    @g(b="dfsTimer", c="Dragonfire shield timer", d="Display this timer as an infobox when active", h="timers", a=3)
    default public boolean d() {
        return true;
    }

    @g(b="freezeTimer", c="Freeze timer", d="Display this timer as an infobox when active", h="timers", a=4)
    default public boolean e() {
        return true;
    }

    @g(b="teleblockTimer", c="Teleblock duration", d="Display this timer as an infobox when active", h="timers", a=5)
    default public boolean f() {
        return true;
    }

    @g(b="bloodSlayerTimer", c="Blood slayer task duration", d="Display this timer as an infobox when active", h="timers", a=6)
    default public boolean g() {
        return true;
    }

    @g(b="counterTimeout", c="Counter Expiry", d="Set the time until counter info boxes expire", h="counters", a=0)
    @q(a=" mins")
    default public int h() {
        return 5;
    }

    @g(b="slayerCounter", c="Slayer task progress", d="Display this counter as an infobox when active", h="counters", a=1)
    default public boolean i() {
        return true;
    }

    @g(b="taskScroll", c="Task scroll progress", d="Display this counter as an infobox when active", h="counters", a=2, e=true)
    default public boolean j() {
        return true;
    }

    @g(b="soulHunter", c="Soul hunter progress", d="Display this counter as an infobox when active", h="counters", a=3)
    default public boolean k() {
        return true;
    }

    @g(b="wanderCounter", c="Wanderer's task progress", d="Display this counter as an infobox when active", h="counters", a=4)
    default public boolean l() {
        return true;
    }

    @g(b="showCombatSkillBoosts", c="Combat buffs / debuffs", d="Display this status as an infobox when active", h="statuses", a=0)
    default public boolean m() {
        return false;
    }

    @g(b="showStatResetTimer", c="Buff change timer", d="Display this status as an infobox when active", h="statuses", a=1)
    default public boolean n() {
        return false;
    }

    @g(b="raidAfflictionStatus", c="Raid afflictions", d="Display this status as an infobox when active", h="statuses", a=3)
    default public boolean o() {
        return true;
    }

    @g(b="infoBoxVertical", c="Display infoboxes vertically", d="Toggles the infoboxes to display vertically", a=40, h="appearence", e=true)
    default public boolean p() {
        return false;
    }

    @g(b="infoBoxSize", c="Infobox size", d="Configures the size of each infobox in pixels", a=42, h="appearence")
    @q(a="px")
    default public int q() {
        return 32;
    }

    @g(b="infoBoxTextOutline", c="Outline infobox text", d="Draw a full outline instead of a simple shadow for infobox text", a=43, h="appearence")
    default public boolean r() {
        return false;
    }

    @g(b="infoBoxTooltips", c="Display infobox hover tooltips", d="Whether to display the tooltips of infoboxes when hovering over them", a=44, h="appearence")
    default public boolean s() {
        return true;
    }
}

