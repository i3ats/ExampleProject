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