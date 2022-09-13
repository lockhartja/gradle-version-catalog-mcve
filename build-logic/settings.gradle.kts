dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        google()
    }

 versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

includeBuild("../platforms")

rootProject.name = "build-logic"
include("commons")
include("java-library")
include("kotlin-library")
include("android-application")
include("spring-boot-application")
include("report-aggregation")
