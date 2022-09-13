import org.gradle.accessors.dm.LibrariesForLibs

val libs = the<LibrariesForLibs>()
println("from pre compiled script plugin: ${libs.versions.bb.get()}")