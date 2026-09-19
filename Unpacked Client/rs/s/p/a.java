/*
 * Decompiled with CFR 0.152.
 */
package rs.s.p;

import java.awt.Color;
import rs.e.b;
import rs.e.e;
import rs.e.g;
import rs.e.o;

@e(a="playeroutline")
public interface a
extends b {
    public static final String a = "playeroutline";

    @rs.e.a
    @g(b="playerOutlineColor", c="Outline Color", d="The color for the players outline", a=0)
    default public Color a() {
        return new Color(0x3D000000, true);
    }

    @g(b="petOutline", c="Outline your pet", d="Display the player outline for your active pet as well", a=10)
    default public boolean b() {
        return true;
    }

    @g(b="borderWidth", c="Border Width", d="Width of the player outline border", a=20)
    default public int c() {
        return 4;
    }

    @g(b="outlineFeather", c="Outline Feather", d="Specify between 0-4 how much the player outline should be faded", a=30)
    @o(b=4)
    default public int d() {
        return 4;
    }
}

