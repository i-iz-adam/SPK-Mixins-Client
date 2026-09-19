/*
 * Decompiled with CFR 0.152.
 */
package rs.s.d;

import rs.e.b;
import rs.e.e;
import rs.e.g;
import rs.e.l;

@e(a="entityhider")
public interface a
extends b {
    public static final String a = "entityhider";
    @l(a="Local player (You)", b="", c=1)
    public static final String b = "local";
    @l(a="Other players", b="", c=2)
    public static final String c = "others";
    @l(a="Miscellaneous", b="", c=3)
    public static final String d = "misc";

    @g(a=1, b="hideLocalPlayer", c="Hide local player", d="Configures whether or not the local player is hidden", h="local")
    default public boolean a() {
        return true;
    }

    @g(a=2, b="hideLocalPlayer2D", c="Hide local 2D (Non-wild)", d="Configures whether or not the local player's hitpoints, prayers, HP bar, etc. is hidden", h="local")
    default public boolean b() {
        return false;
    }

    @g(a=3, b="hideLocalPet", c="Hide local pet", d="Configures whether or not your pet is hidden", h="local")
    default public boolean c() {
        return true;
    }

    @g(a=1, b="hidePlayers", c="Hide others (Non-wild)", d="Configures whether or not other players are hidden in non-wilderness areas", h="others")
    default public boolean d() {
        return true;
    }

    @g(a=2, b="hidePlayers2D", c="Hide other 2D (Non-wild)", d="Configures whether or not other players HP bars, prayers, hitsplats, etc. are hidden in non-wilderness areas", h="others")
    default public boolean e() {
        return false;
    }

    @g(a=3, b="hideOtherPets", c="Hide other pets (Non-wild)", d="Configures whether or not other player pets are hidden", h="others")
    default public boolean f() {
        return true;
    }

    @g(a=4, b="hideOtherMinipets", c="Hide other mini-pets", d="Configures whether or not other player mini-pets are hidden", h="others")
    default public boolean g() {
        return true;
    }

    @g(a=0, b="hideEdgeBots", c="Hide edgeville bots", d="Configures whether or not to hide the PK bots in edgeville", h="misc")
    default public boolean h() {
        return false;
    }

    @g(a=1, b="hideProjectiles", c="Hide projectiles", d="Configures whether or not projectiles are hidden", h="misc")
    default public boolean i() {
        return true;
    }

    @g(a=2, b="hideYoshi", c="Hide standard yoshi pets (others)", d="Configures whether or not to hide yoshi pets everywhere", h="misc")
    default public boolean j() {
        return true;
    }

    @g(a=3, b="hideYoshi", c="Hide standard fairy pets (others)", d="Configures whether or not to hide treasure fairy pets everywhere", h="misc")
    default public boolean k() {
        return true;
    }
}

