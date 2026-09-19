/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

import rs.ui.l;

public final class NavigationButtonAdded {
    private final l button;

    public NavigationButtonAdded(l l2) {
        this.button = l2;
    }

    public l getButton() {
        return this.button;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof NavigationButtonAdded)) {
            return false;
        }
        NavigationButtonAdded navigationButtonAdded = (NavigationButtonAdded)object;
        l l2 = this.getButton();
        l l3 = navigationButtonAdded.getButton();
        return !(l2 == null ? l3 != null : !((Object)l2).equals(l3));
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        l l2 = this.getButton();
        n3 = n3 * 59 + (l2 == null ? 43 : ((Object)l2).hashCode());
        return n3;
    }

    public String toString() {
        return "NavigationButtonAdded(button=" + String.valueOf(this.getButton()) + ")";
    }
}

