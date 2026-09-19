/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

import rs.a.j;

public class NpcSpawned {
    private j npc;

    public j getNpc() {
        return this.npc;
    }

    public void setNpc(j j2) {
        this.npc = j2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof NpcSpawned)) {
            return false;
        }
        NpcSpawned npcSpawned = (NpcSpawned)object;
        if (!npcSpawned.canEqual(this)) {
            return false;
        }
        j j2 = this.getNpc();
        j j3 = npcSpawned.getNpc();
        return !(j2 == null ? j3 != null : !j2.equals(j3));
    }

    protected boolean canEqual(Object object) {
        return object instanceof NpcSpawned;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        j j2 = this.getNpc();
        n3 = n3 * 59 + (j2 == null ? 43 : j2.hashCode());
        return n3;
    }

    public String toString() {
        return "NpcSpawned(npc=" + String.valueOf(this.getNpc()) + ")";
    }
}

