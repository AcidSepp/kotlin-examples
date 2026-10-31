plugins {
    application
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

if (System.getProperty("idea.sync.active") == "true") {
    project.layout.projectDirectory.file(".idea/.name").asFile.apply {
        parentFile.mkdirs()
        writeText(project.name)
    }
}