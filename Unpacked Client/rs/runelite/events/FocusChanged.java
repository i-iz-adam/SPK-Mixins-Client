/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

public class FocusChanged {
    private boolean focused;

    public boolean isFocused() {
        return this.focused;
    }

    public void setFocused(boolean bl) {
        this.focused = bl;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof FocusChanged)) {
            return false;
        }
        FocusChanged focusChanged = (FocusChanged)object;
        if (!focusChanged.canEqual(this)) {
            return false;
        }
        return this.isFocused() == focusChanged.isFocused();
    }

    protected boolean canEqual(Object object) {
        return object instanceof FocusChanged;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + (this.isFocused() ? 79 : 97);
        return n3;
    }

    public String toString() {
        return "FocusChanged(focused=" + this.isFocused() + ")";
    }
}

