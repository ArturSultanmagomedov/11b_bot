plugins {
    kotlin("jvm") version "1.4.0"
}

group = "com.nemo.11b_bot"
version = "0.0.1"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.github.elbekD:kt-telegram-bot:1.3.5")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}