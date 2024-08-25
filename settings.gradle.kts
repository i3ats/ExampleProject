rootProject.name = "ExampleProject"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("de.fayard.refreshVersions") version "0.60.5"
    }
}

plugins {
    id("de.fayard.refreshVersions")
}

include(":modules:some-api")
include(":modules:some-impl")
