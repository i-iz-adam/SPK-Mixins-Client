/*
 * Decompiled with CFR 0.152.
 */
package rs.s.i;

import java.awt.Color;
import rs.e.b;
import rs.e.e;
import rs.e.g;
import rs.e.l;
import rs.e.o;

@e(a="interacthighlight")
public interface a
extends b {
    @l(a="NPCs", b="Settings for NPC highlight", c=0)
    public static final String a = "npcSection";
    @l(a="Objects", b="Settings for object highlight", c=1)
    public static final String b = "objectSection";

    @g(b="npcShowHover", c="Show on hover", d="Outline NPCs when hovered", a=1, h="npcSection")
    default public boolean a() {
        return true;
    }

    @g(b="npcShowInteract", c="Show on interact", d="Outline NPCs when interacted", a=2, h="npcSection")
    default public boolean b() {
        return true;
    }

    @rs.e.a
    @g(b="npcHoverHighlightColor", c="NPC hover", d="The color of the hover outline for NPCs", a=3, h="npcSection")
    default public Color c() {
        return new Color(-1862271232, true);
    }

    @rs.e.a
    @g(b="npcAttackHoverHighlightColor", c="NPC attack hover", d="The color of the attack hover outline for NPCs", a=4, h="npcSection")
    default public Color d() {
        return new Color(-1862271232, true);
    }

    @rs.e.a
    @g(b="npcInteractHighlightColor", c="NPC interact", d="The color of the target outline for NPCs", a=5, h="npcSection")
    default public Color e() {
        return new Color(-1862336512, true);
    }

    @rs.e.a
    @g(b="npcAttackHighlightColor", c="NPC attack", d="The color of the outline on attacked NPCs", a=6, h="npcSection")
    default public Color f() {
        return new Color(-1862336512, true);
    }

    @g(b="objectShowHover", c="Show on hover", d="Outline objects when hovered", a=1, h="objectSection")
    default public boolean g() {
        return true;
    }

    @g(b="objectShowInteract", c="Show on interact", d="Outline objects when interacted", a=2, h="objectSection")
    default public boolean h() {
        return true;
    }

    @rs.e.a
    @g(b="objectHoverHighlightColor", c="Object hover", d="The color of the hover outline for objects", a=4, h="objectSection")
    default public Color i() {
        return new Color(-1878982657, true);
    }

    @rs.e.a
    @g(b="objectInteractHighlightColor", c="Object interact", d="The color of the target outline for objects", a=6, h="objectSection")
    default public Color j() {
        return new Color(-1862336512, true);
    }

    @g(b="borderWidth", c="Border Width", d="Width of the outlined border", a=7)
    default public int k() {
        return 4;
    }

    @g(b="outlineFeather", c="Outline feather", d="Specify between 0-4 how much of the model outline should be faded", a=8)
    @o(b=4)
    default public int l() {
        return 4;
    }
}

