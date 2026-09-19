/*
 * Decompiled with CFR 0.152.
 */
package rs.s.c;

import java.util.Set;
import rs.e.b;
import rs.e.e;
import rs.e.g;
import rs.e.l;
import rs.s.c.h;

@e(a="devtools")
public interface a
extends b {
    @l(a="General", b="General dev settings and toggles", c=0)
    public static final String a = "general";
    @l(a="Interfaces", b="Dev settings for interfaces", c=1)
    public static final String b = "interfaces";
    @l(a="Interface Tools", b="Dev tools for interfaces", c=2)
    public static final String c = "interfaces2";

    @g(b="showObjectIds", c="Label object IDs", d="Include IDs in the name of the entity", h="general", a=0)
    default public boolean a() {
        return true;
    }

    @g(b="showNpcIds", c="Label NPC IDs", d="Include IDs in the name of the entity", h="general", a=0)
    default public boolean b() {
        return true;
    }

    @g(b="showSceneInfo", c="Show scene info", d="Render scene info graphics", h="general", a=0)
    default public boolean c() {
        return true;
    }

    @g(b="showColorOptions", c="Show color options", d="Show color options when right-clicking items/objects/npcs", h="general", a=0)
    default public boolean d() {
        return true;
    }

    @g(b="alwaysOnTop", c="Always on top", d="Set window to always on top", h="general", a=0)
    default public boolean e() {
        return false;
    }

    @g(b="labelIds", c="Label widget IDs", d="Label the ID of parent widgets", h="interfaces", a=0)
    default public boolean f() {
        return false;
    }

    @g(b="labelTypes", c="Label widget types", h="interfaces", d="", a=1)
    default public boolean g() {
        return false;
    }

    @g(b="showParents", c="Show parent IDs", h="interfaces", d="", a=5)
    default public boolean h() {
        return true;
    }

    @g(b="showChildren", c="Show children IDs", h="interfaces", d="", a=10)
    default public boolean i() {
        return true;
    }

    @g(b="showTypes", c="Display widget types", h="interfaces", d="", a=15)
    default public Set<h> j() {
        return Set.of(h.values());
    }

    @g(b="mouseCoordinates", c="Mouse tool", d="", h="interfaces2", a=20)
    default public boolean k() {
        return false;
    }

    @g(b="builderId", c="Interface Builder", d="", h="interfaces2", a=21)
    default public int l() {
        return 0;
    }

    @g(b="builderChildId", c="Builder child ID", d="", h="interfaces2", a=22)
    default public int m() {
        return 0;
    }
}

