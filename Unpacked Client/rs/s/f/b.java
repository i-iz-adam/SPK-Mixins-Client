/*
 * Decompiled with CFR 0.152.
 */
package rs.s.f;

import java.awt.Color;
import rs.e.a;
import rs.e.e;
import rs.e.g;
import rs.e.o;

@e(a="groundMarker")
public interface b
extends rs.e.b {
    public static final String a = "groundMarker";
    public static final String b = "showImportExport";

    @a
    @g(b="markerColor", c="Tile color", d="The default color for marked tiles")
    default public Color a() {
        return Color.YELLOW;
    }

    @g(b="drawOnMinimap", c="Draw tiles on minimap", d="Configures whether marked tiles should be drawn on minimap")
    default public boolean b() {
        return false;
    }

    @g(b="showImportExport", c="Show Import/Export/Clear options", d="Show the Import, Export, and Clear options on the world map right-click menu")
    default public boolean c() {
        return true;
    }

    @g(b="borderWidth", c="Border Width", d="Width of the marked tile border")
    default public double d() {
        return 2.0;
    }

    @g(b="fillOpacity", c="Fill Opacity", d="Opacity of the tile fill color")
    @o(b=255)
    default public int e() {
        return 50;
    }
}

