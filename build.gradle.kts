plugins {
    kotlin("jvm") version "1.5.10"
    id("org.jetbrains.dokka") version "1.4.32"
}

group = "tools.aqua"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}
