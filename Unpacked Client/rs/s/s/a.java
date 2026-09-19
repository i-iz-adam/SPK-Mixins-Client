/*
 * Decompiled with CFR 0.152.
 */
package rs.s.s;

import java.awt.Color;
import rs.e.b;
import rs.e.e;
import rs.e.g;
import rs.e.l;

@e(a="tooltip")
public interface a
extends b {
    public static final String a = "tooltip";
    @l(a="Color scheme", b="", c=1)
    public static final String b = "colors";
    @l(a="Item hovers", b="", c=2)
    public static final String c = "items";
    @l(a="Entity hovers", b="", c=3)
    public static final String d = "entities";

    @g(b="backgroundColor", c="Background color", d="The background color for tooltip overlays", a=10, h="colors")
    default public Color a() {
        return new Color(4077096);
    }

    @g(b="borderColor", c="Inner border color", d="The inner border color for tooltip overlays", a=11, h="colors")
    default public Color b() {
        return new Color(5918522);
    }

    @g(b="outerBorderColor", c="Outer border color", d="The outer border color for tooltip overlays", a=12, h="colors")
    default public Color c() {
        return new Color(2367511);
    }

    @g(b="hideItemsWildy", c="Hide item hovers in wild", d="Whether to hide item tooltips when in the wilderness", a=0, h="items")
    default public boolean d() {
        return true;
    }

    @g(b="hideDescWildy", c="Hide descriptions in wild", d="Whether to hide item tooltips when in the wilderness", a=0, h="items", e=true)
    default public boolean e() {
        return false;
    }

    @g(b="showInInventory", c="Show hovers on inventory", d="Whether to show item tooltips on your inventory items", a=5, h="items")
    default public boolean f() {
        return false;
    }

    @g(b="showInBank", c="Descriptions on bank screen", d="Whether to show item tooltip descriptions in the bank", a=20, h="items")
    default public boolean g() {
        return true;
    }

    @g(b="showInEquip", c="Descriptions on equipment screen", d="Whether to show item tooltips on the equipment screen", a=30, h="items")
    default public boolean h() {
        return true;
    }

    @g(b="descInInventory", c="Descriptions on inventory", d="Whether to show item tooltips on the inventory items", a=30, h="items")
    default public boolean i() {
        return false;
    }

    @g(b="showCurrencies", c="Show sink values (Blood diamonds, shards, etc.)", d="Whether to show the sink value of an item in the tooltip", a=40, h="items")
    default public boolean j() {
        return true;
    }

    @g(b="showWandering", c="Display wandering merchant", d="Whether to include an icon on the tooltip if the item is a potential task from the wandering merchant", a=45, h="items")
    default public boolean k() {
        return true;
    }

    @g(b="hideWildEntity", c="Hide all entity hovers in wild", d="Whether to hide entity tooltip hovers when in the wilderness", a=0, h="entities")
    default public boolean l() {
        return false;
    }

    @g(b="showPlayers", c="Display hovers for Players", d="Whether to show tooltips with the hover menu for Players", a=14, h="entities")
    default public boolean m() {
        return false;
    }

    @g(b="showNpcs", c="Display hovers for NPCs", d="Whether to show tooltips with the hover menu for NPCs", a=15, h="entities")
    default public boolean n() {
        return false;
    }

    @g(b="showObjects", c="Display hovers for Objects", d="Whether to show tooltips with the hover menu for objects", a=16, h="entities")
    default public boolean o() {
        return false;
    }

    @g(b="showGuides", c="Display hovers for Guides", d="Whether to show knowledgebase guide shortcuts with the hover menu", a=17, h="entities")
    default public boolean p() {
        return true;
    }
}

