/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

public class MenuOpened {
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof MenuOpened)) {
            return false;
        }
        MenuOpened menuOpened = (MenuOpened)object;
        return menuOpened.canEqual(this);
    }

    protected boolean canEqual(Object object) {
        return object instanceof MenuOpened;
    }

    public int hashCode() {
        boolean bl = true;
        return 1;
    }

    public String toString() {
        return "MenuOpened()";
    }
}

