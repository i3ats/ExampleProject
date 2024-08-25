plugins {
    id("java")
    id("io.freefair.lombok")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.guice)
    implementation("javax.inject:javax.inject:1")
    implementation(libs.auto.service.annotations)
    annotationProcessor(libs.auto.service)
    implementation(project(":modules:some-api"))
    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)

    // Logging
    implementation(libs.log4j.core)
    implementation(libs.log4j.api)

}

tasks.test {
    useJUnitPlatform()
}