/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

import rs.a.c;

public class EntityInteraction {
    c entity;
    boolean combat = false;

    public c getEntity() {
        return this.entity;
    }

    public boolean isCombat() {
        return this.combat;
    }

    public void setEntity(c c2) {
        this.entity = c2;
    }

    public void setCombat(boolean bl) {
        this.combat = bl;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof EntityInteraction)) {
            return false;
        }
        EntityInteraction entityInteraction = (EntityInteraction)object;
        if (!entityInteraction.canEqual(this)) {
            return false;
        }
        if (this.isCombat() != entityInteraction.isCombat()) {
            return false;
        }
        c c2 = this.getEntity();
        c c3 = entityInteraction.getEntity();
        return !(c2 == null ? c3 != null : !c2.equals(c3));
    }

    protected boolean canEqual(Object object) {
        return object instanceof EntityInteraction;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + (this.isCombat() ? 79 : 97);
        c c2 = this.getEntity();
        n3 = n3 * 59 + (c2 == null ? 43 : c2.hashCode());
        return n3;
    }

    public String toString() {
        return "EntityInteraction(entity=" + String.valueOf(this.getEntity()) + ", combat=" + this.isCombat() + ")";
    }
}

