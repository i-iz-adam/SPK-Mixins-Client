/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

public class ClientStartUp {
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ClientStartUp)) {
            return false;
        }
        ClientStartUp clientStartUp = (ClientStartUp)object;
        return clientStartUp.canEqual(this);
    }

    protected boolean canEqual(Object object) {
        return object instanceof ClientStartUp;
    }

    public int hashCode() {
        boolean bl = true;
        return 1;
    }

    public String toString() {
        return "ClientStartUp()";
    }
}

