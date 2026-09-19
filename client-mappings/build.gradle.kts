plugins {
    `java-library`
}

dependencies {
    implementation(project(":client-api"))
    implementation("org.ow2.asm:asm:9.6")
    implementation("org.ow2.asm:asm-commons:9.6")
    implementation("org.ow2.asm:asm-tree:9.6")
    implementation("com.google.code.gson:gson:2.10.1")
}
