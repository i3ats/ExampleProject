import java.util.*

plugins {
    id("java")
    alias(libs.plugins.org.jetbrains.kotlin.jvm)
    alias(libs.plugins.io.freefair.lombok)
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.guice)
    implementation(libs.guava)
    implementation(libs.auto.service.annotations)
    annotationProcessor(libs.auto.service)
    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)

    // Our modules -- we define a Service in the API and then implement it in the Impl module
    implementation(project(":modules:some-api"))
    runtimeOnly(project(":modules:some-impl"))

    // Logging
    implementation(libs.log4j.core)
    implementation(libs.log4j.api)
}

tasks.test {
    useJUnitPlatform()
}



// Check if gradle-local.properties exists and load it
val localPropertiesFile = file("gradle-local.properties")

if (localPropertiesFile.exists()) {
    val localProperties = Properties()
    localPropertiesFile.inputStream().use { inputStream ->
        localProperties.load(inputStream)
    }
    localProperties.forEach { key, value ->
        project.extensions.extraProperties[key.toString()] = value
    }
}