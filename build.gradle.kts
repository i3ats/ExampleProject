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
//    implementation(project(":one"))
//    implementation(project(":two"))
    annotationProcessor(libs.auto.service)
    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)

    // Logging
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")
}

tasks.test {
    useJUnitPlatform()
}