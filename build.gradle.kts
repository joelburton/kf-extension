plugins {
    kotlin("jvm") version "2.1.10"
}

group = "joel"
version = "1.0"
tasks.test { useJUnitPlatform() }

kotlin {
    jvmToolchain(23)
}
repositories {
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test"))
    implementation(files("/Users/joel/src/kf/src/foo/kf-public.jar"))
}

