/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

import rs.ui.l;

public final class NavigationButtonRemoved {
    private final l button;

    public NavigationButtonRemoved(l l2) {
        this.button = l2;
    }

    public l getButton() {
        return this.button;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof NavigationButtonRemoved)) {
            return false;
        }
        NavigationButtonRemoved navigationButtonRemoved = (NavigationButtonRemoved)object;
        l l2 = this.getButton();
        l l3 = navigationButtonRemoved.getButton();
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
        return "NavigationButtonRemoved(button=" + String.valueOf(this.getButton()) + ")";
    }
}

