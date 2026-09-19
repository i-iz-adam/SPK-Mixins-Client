/*
 * Decompiled with CFR 0.152.
 */
package rs.s.o;

import java.awt.Color;
import rs.e.a;
import rs.e.b;
import rs.e.e;
import rs.e.g;
import rs.e.l;
import rs.e.o;

@e(a="npcindicators")
public interface d
extends b {
    public static final String a = "npcindicators";
    @l(a="Render style", b="The render style of NPC highlighting", c=0)
    public static final String b = "renderStyleSection";

    @g(a=0, b="highlightHull", c="Highlight hull", d="Configures whether or not NPC should be highlighted by hull", h="renderStyleSection")
    default public boolean a() {
        return true;
    }

    @g(a=1, b="highlightTile", c="Highlight tile", d="Configures whether or not NPC should be highlighted by tile", h="renderStyleSection")
    default public boolean b() {
        return false;
    }

    @g(a=2, b="highlightTrueTile", c="Highlight true tile", d="Configures whether or not NPC should be highlighted by true tile", h="renderStyleSection")
    default public boolean c() {
        return false;
    }

    @g(a=3, b="highlightSouthWestTile", c="Highlight south west tile", d="Configures whether or not NPC should be highlighted by south western tile", h="renderStyleSection")
    default public boolean d() {
        return false;
    }

    @g(a=4, b="highlightSouthWestTrueTile", c="Highlight south west true tile", d="Configures whether or not NPC should be highlighted by south western true tile", h="renderStyleSection")
    default public boolean e() {
        return false;
    }

    @g(a=5, b="highlightOutline", c="Highlight outline", d="Configures whether or not the model of the NPC should be highlighted by outline", h="renderStyleSection")
    default public boolean f() {
        return false;
    }

    @g(a=8, b="drawNames", c="Draw names above NPC", d="Configures whether or not NPC names should be drawn above the NPC")
    default public boolean g() {
        return false;
    }

    @a
    @g(a=10, b="npcColor", c="Highlight Color", d="Color of the NPC highlight border, menu, and text", h="renderStyleSection")
    default public Color h() {
        return Color.CYAN;
    }

    @a
    @g(a=11, b="fillColor", c="Fill Color", d="Color of the NPC highlight fill", h="renderStyleSection")
    default public Color i() {
        return new Color(0, 255, 255, 20);
    }

    @g(a=12, b="borderWidth", c="Border Width", d="Width of the highlighted NPC border", h="renderStyleSection")
    default public double j() {
        return 2.0;
    }

    @g(a=13, b="outlineFeather", c="Outline feather", d="Specify between 0-4 how much of the model outline should be faded", h="renderStyleSection")
    @o(a=0, b=4)
    default public int k() {
        return 0;
    }

    @g(a=7, b="npcToHighlight", c="NPCs to Highlight", d="List of NPC names to highlight. Format: (NPC), (NPC)")
    default public String l() {
        return "";
    }

    @g(b="npcToHighlight", c="", d="")
    public void a(String var1);

    @g(a=14, b="ignorePets", c="Ignore pets", d="Excludes pets from being highlighted")
    default public boolean m() {
        return true;
    }

    @g(a=15, b="hullClickBox", c="Extend clickbox to hull", d="Extends the clickbox to the hull of the NPC (when hull highlighting is enabled)")
    default public boolean n() {
        return true;
    }
}

