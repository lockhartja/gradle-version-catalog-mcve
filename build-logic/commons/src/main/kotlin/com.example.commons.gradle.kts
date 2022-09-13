plugins {
    id("java")
    id("com.example.jacoco")
}

group = "com.example.myproduct"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation(platform("com.example.platform:product-platform"))

    testImplementation(platform("com.example.platform:test-platform"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
