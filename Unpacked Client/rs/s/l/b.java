/*
 * Decompiled with CFR 0.152.
 */
package rs.s.l;

import rs.e.e;
import rs.e.g;
import rs.e.l;

@e(a="menuentryswapper")
public interface b
extends rs.e.b {
    public static final String a = "menuentryswapper";
    @l(a="Item Swaps", b="All options that swap item menu entries", c=0, d=true)
    public static final String b = "items";
    @l(a="NPC Swaps", b="All options that swap NPC menu entries", c=1, d=true)
    public static final String c = "npcs";

    @g(a=-3, b="leftClickCustomization", c="Customizable left-click", d="Allows customization of left-clicks on items", h="items")
    default public boolean a() {
        return true;
    }

    @g(a=-2, b="shiftClickCustomization", c="Customizable shift-click", d="Allows customization of shift-clicks on items", h="items")
    default public boolean b() {
        return true;
    }

    @g(a=-3, b="npcLeftClickCustomization", c="Customizable left and shift click", d="Allows customization of left-clicks on NPCs", h="npcs")
    default public boolean c() {
        return true;
    }
}

