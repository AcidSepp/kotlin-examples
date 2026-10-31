plugins {
  alias(libs.plugins.kotlin)
  application
}

repositories {
  mavenCentral()
}

application {
  mainClass = "HelloWorldKt"
}

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(25)
  }
}
