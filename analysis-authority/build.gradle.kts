plugins {
    alias(libs.plugins.kotlin.allopen)
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.noarg)
    alias(libs.plugins.kotlin.spring)

    alias(libs.plugins.spring.boot)
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation(libs.jackson)

    implementation(libs.spring.boot.starter)
    implementation(libs.spring.boot.starter.actuator)
    implementation(libs.spring.boot.starter.web)
    implementation(libs.springdoc.web.mvc.ui)
    implementation(libs.swagger.annotation)

    testImplementation(testLibs.io.kotest.kotestRunnerJunitJvm)
    testImplementation(testLibs.io.kotest.kotestSpring)
    testImplementation(testLibs.io.kotest.kotestTestcontainers)

    testImplementation(testLibs.org.testcontainers.junit.jupiter)
    testImplementation(testLibs.org.testcontainers.testcontainers)

    testImplementation(testLibs.spring.boot.starter.test)
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

group = "dev.leachryan.mtg.deck.assistant"
version = "0.0.1-SNAPSHOT"