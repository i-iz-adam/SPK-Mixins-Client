/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

public class ObjectInteraction {
    int id;
    int x;
    int y;
    int z;
    int hash;

    public int getId() {
        return this.id;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public int getHash() {
        return this.hash;
    }

    public void setId(int n2) {
        this.id = n2;
    }

    public void setX(int n2) {
        this.x = n2;
    }

    public void setY(int n2) {
        this.y = n2;
    }

    public void setZ(int n2) {
        this.z = n2;
    }

    public void setHash(int n2) {
        this.hash = n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ObjectInteraction)) {
            return false;
        }
        ObjectInteraction objectInteraction = (ObjectInteraction)object;
        if (!objectInteraction.canEqual(this)) {
            return false;
        }
        if (this.getId() != objectInteraction.getId()) {
            return false;
        }
        if (this.getX() != objectInteraction.getX()) {
            return false;
        }
        if (this.getY() != objectInteraction.getY()) {
            return false;
        }
        if (this.getZ() != objectInteraction.getZ()) {
            return false;
        }
        return this.getHash() == objectInteraction.getHash();
    }

    protected boolean canEqual(Object object) {
        return object instanceof ObjectInteraction;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + this.getId();
        n3 = n3 * 59 + this.getX();
        n3 = n3 * 59 + this.getY();
        n3 = n3 * 59 + this.getZ();
        n3 = n3 * 59 + this.getHash();
        return n3;
    }

    public String toString() {
        return "ObjectInteraction(id=" + this.getId() + ", x=" + this.getX() + ", y=" + this.getY() + ", z=" + this.getZ() + ", hash=" + this.getHash() + ")";
    }
}

