/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

import rs.runelite.a.c;

public class GameStateChanged {
    private c gameState;

    public c getGameState() {
        return this.gameState;
    }

    public void setGameState(c c2) {
        this.gameState = c2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof GameStateChanged)) {
            return false;
        }
        GameStateChanged gameStateChanged = (GameStateChanged)object;
        if (!gameStateChanged.canEqual(this)) {
            return false;
        }
        c c2 = this.getGameState();
        c c3 = gameStateChanged.getGameState();
        return !(c2 == null ? c3 != null : !((Object)((Object)c2)).equals((Object)c3));
    }

    protected boolean canEqual(Object object) {
        return object instanceof GameStateChanged;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        c c2 = this.getGameState();
        n3 = n3 * 59 + (c2 == null ? 43 : ((Object)((Object)c2)).hashCode());
        return n3;
    }

    public String toString() {
        return "GameStateChanged(gameState=" + String.valueOf((Object)this.getGameState()) + ")";
    }
}

