plugins {
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation("com.google.devtools.ksp:symbol-processing-api:1.9.20-1.0.14")
    implementation("com.squareup:kotlinpoet-ksp:1.15.1")
    implementation("com.github.javaparser:javaparser-symbol-solver-core:3.25.6")
    implementation("com.github.javaparser:javaparser-core:3.25.6")
    implementation("com.github.javaparser:javaparser-core-serialization:3.25.6")
}