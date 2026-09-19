/*
 * Decompiled with CFR 0.152.
 */
package rs.s.q;

import rs.e.b;
import rs.e.e;
import rs.e.g;
import rs.e.o;

@e(a="pvptracker")
public interface a
extends b {
    @o(a=1, b=1000)
    @g(b="fightHistoryRenderLimit", c="Max Rendered Fights", d="Maximum number of previous fights to be displayed in the fight history side-panel.<br>WILL cause lag spikes at very high numbers. This should be small if you have low RAM", a=205)
    default public int a() {
        return 10;
    }

    @g(b="exactNameFilter", c="Exact Name Filter", d="Makes the username filter look for an exact match (case-insensitive), rather than any name starting with the filter.", a=220)
    default public boolean b() {
        return false;
    }

    @g(b="nameFilter", c="Name Filter", d="Hidden config used to save user's selected name filter for the panel views.", a=1000, e=true)
    default public String c() {
        return "";
    }
}

