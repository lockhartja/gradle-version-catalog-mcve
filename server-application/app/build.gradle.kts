plugins {
    id("com.example.spring-boot-application")
    id("com.example.version-catalog")
}

println("from main build script: ${libs.versions.bb.get()}")
println("from group = $group ")

group = "${group}.server-application"

dependencies {
    implementation("com.example.myproduct.user-feature:table")
    implementation("com.example.myproduct.admin-feature:config")

    implementation("org.apache.juneau:juneau-marshall")
}
