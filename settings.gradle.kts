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

// Include the module located in the 'modules/some-api' folder
include(":modules:some-api")
include(":modules:some-impl")

//// Set the project directory for the ':some-api' module
//project(":some-api").projectDir = file("modules/some-api")
