/*
 * Decompiled with CFR 0.152.
 */
package rs.s.r;

import java.awt.Color;
import rs.e.b;
import rs.e.e;
import rs.e.g;
import rs.e.l;

@e(a="tileindicators")
public interface a
extends b {
    @l(a="Destination Tile", b="Destination tile configuration", c=0)
    public static final String a = "destinationTile";
    @l(a="Hovered Tile", b="Hovered tile configuration", c=1)
    public static final String b = "hoveredTile";
    @l(a="Current Tile", b="Current tile configuration", c=2)
    public static final String c = "currentTile";

    @g(b="highlightDestinationTile", c="Highlight destination tile", d="Highlights tile player is walking to", a=1, h="destinationTile")
    default public boolean a() {
        return true;
    }

    @rs.e.a
    @g(b="highlightDestinationColor", c="Highlight color", d="Configures the highlight color of current destination", a=2, h="destinationTile")
    default public Color b() {
        return Color.GRAY;
    }

    @rs.e.a
    @g(b="destinationTileFillColor", c="Fill color", d="Configures the fill color of destination tile", a=3, h="destinationTile")
    default public Color c() {
        return new Color(0, 0, 0, 50);
    }

    @g(b="destinationTileBorderWidth", c="Border width", d="Width of the destination tile marker border", a=4, h="destinationTile")
    default public double d() {
        return 2.0;
    }

    @g(b="highlightHoveredTile", c="Highlight hovered tile", d="Highlights tile player is hovering with mouse", a=1, h="hoveredTile")
    default public boolean e() {
        return false;
    }

    @rs.e.a
    @g(b="highlightHoveredColor", c="Highlight color", d="Configures the highlight color of hovered tile", a=2, h="hoveredTile")
    default public Color f() {
        return new Color(0, 0, 0, 0);
    }

    @rs.e.a
    @g(b="hoveredTileFillColor", c="Fill color", d="Configures the fill color of hovered tile", a=3, h="hoveredTile")
    default public Color g() {
        return new Color(0, 0, 0, 50);
    }

    @g(b="hoveredTileBorderWidth", c="Border width", d="Width of the hovered tile marker border", a=4, h="hoveredTile")
    default public double h() {
        return 2.0;
    }

    @g(b="highlightCurrentTile", c="Highlight true tile", d="Highlights true tile player is on as seen by server", a=1, h="currentTile")
    default public boolean i() {
        return false;
    }

    @rs.e.a
    @g(b="highlightCurrentColor", c="Highlight color", d="Configures the highlight color of current true tile", a=2, h="currentTile")
    default public Color j() {
        return Color.CYAN;
    }

    @rs.e.a
    @g(b="currentTileFillColor", c="Fill color", d="Configures the fill color of current true tile", a=3, h="currentTile")
    default public Color k() {
        return new Color(0, 0, 0, 50);
    }

    @g(b="currentTileBorderWidth", c="Border width", d="Width of the true tile marker border", a=4, h="currentTile")
    default public double l() {
        return 2.0;
    }
}

