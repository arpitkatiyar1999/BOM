plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    constraints {
        api("com.github.arpitkatiyar1999:Country-Picker:2.1.1")
    }
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                groupId = "com.github.arpitkatiyar1999"
                artifactId = "BOM"
                version = "1.0.0"
                from(components["java"])
            }
        }
    }
}