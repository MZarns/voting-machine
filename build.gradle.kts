import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.1"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.7.21"
	kotlin("plugin.spring") version "1.4.32"
	kotlin("plugin.allopen") version "1.4.32"
	kotlin("plugin.jpa") version "1.4.32"
	kotlin("kapt") version "1.4.32"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.jetbrains.lets-plot:lets-plot-common:2.5.1")
	implementation("org.jetbrains.lets-plot:lets-plot-kotlin-jvm:4.1.1")
	implementation("org.jetbrains.lets-plot:lets-plot-kotlin-jvm:4.1.1")
	implementation("org.springframework.boot:spring-boot-starter-websocket")
	implementation("org.webjars:webjars-locator-core")
	implementation("org.webjars:sockjs-client:1.5.1")
	implementation("org.webjars:stomp-websocket:2.3.4")
	implementation("org.webjars:bootstrap:5.2.2")
	implementation("org.webjars:jquery:3.6.1")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.0")
	implementation("org.jetbrains.kotlin:kotlin-allopen")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	runtimeOnly("com.h2database:h2")
	runtimeOnly("org.springframework.boot:spring-boot-devtools")
	kapt("org.springframework.boot:spring-boot-configuration-processor")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
		exclude(group = "junit", module = "junit")
	}
	testImplementation("org.junit.jupiter:junit-jupiter-api")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
	testImplementation("com.ninja-squad:springmockk:3.1.1")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

allOpen {
	annotation("javax.persistence.Entity")
	annotation("javax.persistence.Embeddable")
	annotation("javax.persistence.MappedSuperclass")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
