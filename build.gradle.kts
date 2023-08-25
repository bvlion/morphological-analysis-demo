import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.9.0"
  application
}

group = "net.ambitious"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.atilika.kuromoji:kuromoji-ipadic:0.9.0")
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}

tasks.register<JavaExec>("firstDemo") {
  classpath = sourceSets["main"].runtimeClasspath
  mainClass.set("FirstDemoKt")
}

tasks.register<JavaExec>("secondDemo") {
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("SecondDemoKt")
}

tasks.register<JavaExec>("thirdDemo") {
  classpath = sourceSets["main"].runtimeClasspath
  mainClass.set("ThirdDemoKt")
}

tasks.register<JavaExec>("fourthDemo") {
  classpath = sourceSets["main"].runtimeClasspath
  mainClass.set("FourthDemoKt")
}
