plugins {
    id("java")
    alias(libs.plugins.io.freefair.lombok)
}

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

    annotationProcessor(libs.auto.service)

    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)
}

tasks.test {
    useJUnitPlatform()
}