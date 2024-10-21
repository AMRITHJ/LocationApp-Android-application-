pluginManagement {
    repositories {
        google()  // Make sure to include Google's Maven repository
        mavenCentral()  // Include Maven Central
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "EndsemLab" // Change this to your project name
include(":app") // Include your app module or other modules as needed
