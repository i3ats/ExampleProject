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
    annotationProcessor(libs.auto.service)
    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)
}

tasks.test {
    useJUnitPlatform()
}