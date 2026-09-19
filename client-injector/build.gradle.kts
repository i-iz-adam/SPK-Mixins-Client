plugins {
    `java-library`
    application
}

dependencies {
    implementation(project(":client-api"))
    implementation(project(":client-mappings"))
    implementation("org.ow2.asm:asm:9.6")
    implementation("org.ow2.asm:asm-commons:9.6")
    implementation("org.ow2.asm:asm-tree:9.6")
    implementation("org.ow2.asm:asm-util:9.6")
}

application {
    mainClass.set("com.spk.mixins.injector.Launcher")
}
