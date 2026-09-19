# SPK-Mixins-Client

A modular, mixin-styled bytecode injection and plugin framework for the SpawnPK game client (`C:\Users\naxos\.spawnpk-data\client.jar`). Designed with update-resilient deobfuscation mappings, access transformers, custom event dispatching, and RuneLite-style plugin APIs.

---

## 🎯 Project Goals

- **Mixin Bytecode Injection Engine**: Inject custom logic into obfuscated ProGuard client classes seamlessly using annotations (`@Mixin`, `@Inject`, `@Shadow`).
- **Resilient Deobfuscation Mapping System**: Decouple plugin development from ProGuard scramble updates using JSON mapping layer abstractions (`MappingSet`, `MappingParser`, `ClientRemapper`).
- **Access Transformer Pipeline**: Modify class, method, and field visibility dynamically (e.g., converting `private` or `package-private` members to `public` and stripping `final` modifiers).
- **High-Performance EventBus**: Low-overhead priority-based event system to dispatch client hooks (`ClientTickEvent`, rendering, packet events) to plugins.
- **RuneLite-Style Plugin Framework**: Extensible plugin management architecture (`PluginManager`, `@PluginDescriptor`, `Plugin` interface) enabling modular client features.

---

## 🏗️ Project Architecture

```
SPK-Mixins-Client/
├── client-api/         # Public annotations (@Mixin, @Inject, @Shadow, @Subscribe), EventBus, Plugin interfaces
├── client-mappings/    # Deobfuscation mapping parser, symbol remapper, and Access Transformer definitions
├── client-injector/    # ASM Bytecode Transformer engine, Mixin processor, Java Agent, and Jar Launcher
└── client-plugins/     # Plugin Manager runtime and sample plugin implementations
```

### Module Overview

1. **`client-api`**: Core contracts used by plugin authors to write mixins, subscribe to events, and define plugins.
2. **`client-mappings`**: Parses symbol mappings and Access Transformers (`mappings.json`) to keep code operational across client updates.
3. **`client-injector`**: Uses ASM 9 to instrument bytecode at launch or via Java Instrumentation Agent (`ClientAgent`).
4. **`client-plugins`**: Runtime plugin loader and event dispatcher managing plugin lifecycles.

---

## 🚀 Getting Started

### Prerequisites
- **JDK 17** or higher
- **Gradle 8.x** (or included Gradle wrapper)

### Build Instructions

To build all subprojects and assemble JAR artifacts:

```bash
gradle clean build
```

### Launching the Client

To launch the injector pointing to the SpawnPK client JAR:

```bash
gradle :client-injector:run
```

---

## 💡 Usage Examples

### 1. Defining a Mixin

```java
@Mixin(target = "Client")
public class ClientMixin {

    @Inject(method = "mainLoop", at = Inject.At.HEAD)
    public void onMainLoopHead() {
        // Injected code executing at the start of the client main loop
    }
}
```

### 2. Subscribing to Client Events

```java
@PluginDescriptor(
    name = "SamplePlugin",
    version = "1.0.0",
    description = "Custom overlay & event listener plugin"
)
public class SamplePlugin implements Plugin {

    @Override
    public void onEnable() {
        System.out.println("SamplePlugin enabled!");
    }

    @Subscribe
    public void onClientTick(ClientTickEvent event) {
        // Handle tick event
    }

    @Override
    public void onDisable() {}
}
```

---

## 🛠️ Built With

Built with [Kestral](https://github.com/i-iz-adam/kestral) — an advanced agentic coding pair programmer.

💬 Join the **Kestral Community Discord**: [https://discord.gg/qg9VwWNnPk](https://discord.gg/qg9VwWNnPk)

---

## 📄 License

MIT License.
