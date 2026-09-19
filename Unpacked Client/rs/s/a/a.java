/*
 * Decompiled with CFR 0.152.
 */
package rs.s.a;

import rs.e.b;
import rs.e.g;
import rs.e.l;
import rs.s.a.c;
import rs.s.a.d;
import rs.s.a.e;

@rs.e.e(a="combatInfo")
public interface a
extends b {
    public static final String a = "combatInfo";
    @l(a="Opponent overlays", b="", c=0)
    public static final String b = "opponentOverlay";
    @l(a="Hits and health", b="", c=4)
    public static final String c = "hitOverlay";

    @g(b="showOpponentOverlay", c="Show opponent overlay", d="Display the overlay with opponent information", h="opponentOverlay", a=0)
    default public boolean a() {
        return true;
    }

    @g(b="animatedOverlayBar", c="Animate overlay health bar", d="Animate health loss on the overlay (or disable to keep changes instant)", h="opponentOverlay", a=1)
    default public boolean b() {
        return true;
    }

    @g(b="opponentOverlayStyle", c="Opponent overlay style", d="The style of opponent overlay to display", h="opponentOverlay", a=2)
    default public c c() {
        return rs.s.a.c.a;
    }

    @g(b="bhOverlayStyle", c="Bounty hunter overlay style", d="The style of bounty hunter overlay to display", h="opponentOverlay", a=3)
    default public c d() {
        return rs.s.a.c.a;
    }

    @g(b="bossOverlayStyle", c="Boss overlay style", d="The style of boss overlay to display", h="opponentOverlay", a=3)
    default public c e() {
        return rs.s.a.c.a;
    }

    @g(b="hitMarkStyle", c="Hitsplats", d="The style of health bar to display", h="hitOverlay", a=0)
    default public e f() {
        return e.a;
    }

    @g(b="healthBarStyle", c="Health bars", d="The style of health bar to display", h="hitOverlay", a=1)
    default public d g() {
        return d.a;
    }

    @g(b="multipliedHits", c="Multiplied 10x hits", d="Display damage at a 10X multiple (e.g. 10 instead of 1)", h="hitOverlay", a=4)
    default public boolean h() {
        return false;
    }
}

