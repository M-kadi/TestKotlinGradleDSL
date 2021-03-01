buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath( "com.android.tools.build:gradle:4.1.0")
        classpath(kotlin("gradle-plugin", version = Versions.kotlin_version))
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}