package com.spk.mixins.plugins.sample;

import com.spk.mixins.api.event.Event;
import com.spk.mixins.api.event.Subscribe;
import com.spk.mixins.api.plugin.Plugin;
import com.spk.mixins.api.plugin.PluginDescriptor;

/**
 * Sample event for client tick.
 */
class ClientTickEvent extends Event {}

@PluginDescriptor(
    name = "SamplePlugin",
    version = "1.0.0",
    description = "Demonstration plugin showing event subscription and custom logic.",
    author = "Kestral Pair Programmer"
)
public class SamplePlugin implements Plugin {

    @Override
    public void onEnable() {
        System.out.println("[SamplePlugin] Enabled successfully!");
    }

    @Override
    public void onDisable() {
        System.out.println("[SamplePlugin] Disabled.");
    }

    @Override
    public String getName() {
        return "SamplePlugin";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Subscribe
    public void onClientTick(ClientTickEvent event) {
        System.out.println("[SamplePlugin] Client tick event received!");
    }
}
