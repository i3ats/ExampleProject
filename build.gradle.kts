plugins {
    id("java")
    kotlin("jvm")
    id("io.freefair.lombok")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.guice)
    implementation(libs.auto.service.annotations)
    annotationProcessor(libs.auto.service)
    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)

    // Our modules -- we define a Service in the API and then implement it in the Impl module
    implementation(project(":modules:some-api"))
    runtimeOnly(project(":modules:some-impl"))

    // Logging
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")
}

tasks.test {
    useJUnitPlatform()
}