package com.spk.mixins.api.event;

/**
 * Base interface or class for all client events.
 */
public abstract class Event {
    private boolean cancelled = false;

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
