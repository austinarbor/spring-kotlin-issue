import dev.aga.gradle.versioncatalogs.Generator.generate
import dev.aga.gradle.versioncatalogs.GeneratorConfig

plugins {
  id("dev.aga.gradle.version-catalog-generator") version "3.3.0"
}
rootProject.name = "kotlin-spring-project"

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
  versionCatalogs {
    generate("spring") {
      fromToml("spring-dependencies")
    }
    generate("komapper") {
      fromToml("komapper-platform") {
        aliasPrefixGenerator = GeneratorConfig.NO_PREFIX
      }
    }
  }
}
