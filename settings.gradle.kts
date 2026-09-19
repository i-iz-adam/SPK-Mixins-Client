pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "SPK-Mixins-Client"

include("client-api")
include("client-mappings")
include("client-injector")
include("client-plugins")
