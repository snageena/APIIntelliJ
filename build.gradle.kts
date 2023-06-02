plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.rest-assured:rest-assured:4.5.1")
    implementation("org.apache.poi:poi:4.1.2")
    implementation("org.testng:testng:7.4.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.2")
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("com.aventstack:extentreports:5.0.9")
    implementation("com.github.javafaker:javafaker:1.0.2")
    implementation("org.projectlombok:lombok-utils:1.18.12")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")


}

tasks.test {
    useJUnitPlatform()
}