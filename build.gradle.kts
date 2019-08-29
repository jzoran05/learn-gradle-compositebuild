import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.3.50"
    idea
    //application
}

group = "com.learn.gradle.compositebuild"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.learn.gradle.compositeBuild:project01:1.0-SNAPSHOT")
    implementation("com.learn.gradle.compositeBuild:project02:1.0-SNAPSHOT")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}