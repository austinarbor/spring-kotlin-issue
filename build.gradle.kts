plugins {
  kotlin("jvm") version "2.2.20"
  kotlin("plugin.spring") version "2.2.20"
  id("org.springframework.boot") version "3.5.5"
  id("com.google.devtools.ksp") version "2.2.20-2.0.3"
}

dependencies {
  implementation(spring.spring.springBootStarterWeb)
  implementation(spring.spring.springBootStarterJdbc)
  implementation(komapper.komapperCore)
  implementation(komapper.komapperSpringJdbc)
  implementation(komapper.komapperSpringBootStarterJdbc)
  implementation(komapper.komapperDialectPostgresqlJdbc)

  ksp(komapper.komapperProcessor)
}
