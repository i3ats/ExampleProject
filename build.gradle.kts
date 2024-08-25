import java.util.*

plugins {
    id("java")
    alias(libs.plugins.org.jetbrains.kotlin.jvm)
    alias(libs.plugins.io.freefair.lombok)
}

group = "com.joevno.exampleproject"
version = "0.0.2"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.guice)
    implementation(libs.guava)
    implementation(libs.auto.service.annotations)
    implementation(project(":modules:some-api"))
    implementation(libs.log4j.core)
    implementation(libs.log4j.api)

    runtimeOnly(project(":modules:some-impl"))

    annotationProcessor(libs.auto.service)

    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)
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