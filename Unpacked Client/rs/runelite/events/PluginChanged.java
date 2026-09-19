/*
 * Decompiled with CFR 0.152.
 */
package rs.runelite.events;

import rs.s.a;

public class PluginChanged {
    private final a plugin;
    private final boolean loaded;

    public PluginChanged(a a2, boolean bl) {
        this.plugin = a2;
        this.loaded = bl;
    }

    public a getPlugin() {
        return this.plugin;
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof PluginChanged)) {
            return false;
        }
        PluginChanged pluginChanged = (PluginChanged)object;
        if (!pluginChanged.canEqual(this)) {
            return false;
        }
        if (this.isLoaded() != pluginChanged.isLoaded()) {
            return false;
        }
        a a2 = this.getPlugin();
        a a3 = pluginChanged.getPlugin();
        return !(a2 == null ? a3 != null : !((Object)a2).equals(a3));
    }

    protected boolean canEqual(Object object) {
        return object instanceof PluginChanged;
    }

    public int hashCode() {
        int n2 = 59;
        int n3 = 1;
        n3 = n3 * 59 + (this.isLoaded() ? 79 : 97);
        a a2 = this.getPlugin();
        n3 = n3 * 59 + (a2 == null ? 43 : ((Object)a2).hashCode());
        return n3;
    }

    public String toString() {
        return "PluginChanged(plugin=" + String.valueOf(this.getPlugin()) + ", loaded=" + this.isLoaded() + ")";
    }
}

