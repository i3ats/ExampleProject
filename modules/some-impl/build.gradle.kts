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
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")

}

tasks.test {
    useJUnitPlatform()
}