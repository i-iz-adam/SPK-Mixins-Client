package com.spk.mixins.plugins;

import com.spk.mixins.api.event.EventBus;
import com.spk.mixins.api.plugin.Plugin;
import com.spk.mixins.api.plugin.PluginDescriptor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Manages plugin lifecycle (loading, enabling, disabling, registering event listeners).
 */
public class PluginManager {

    private final EventBus eventBus;
    private final List<Plugin> activePlugins = new ArrayList<>();

    public PluginManager(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void registerPlugin(Plugin plugin) {
        PluginDescriptor descriptor = plugin.getClass().getAnnotation(PluginDescriptor.class);
        String name = descriptor != null ? descriptor.name() : plugin.getName();
        System.out.println("[PluginManager] Registering plugin: " + name);
        
        eventBus.register(plugin);
        activePlugins.add(plugin);
        plugin.onEnable();
    }

    public void disablePlugin(Plugin plugin) {
        System.out.println("[PluginManager] Disabling plugin: " + plugin.getName());
        plugin.onDisable();
        eventBus.unregister(plugin);
        activePlugins.remove(plugin);
    }

    public List<Plugin> getActivePlugins() {
        return Collections.unmodifiableList(activePlugins);
    }
}
