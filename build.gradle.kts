plugins {
	java
	id("io.spring.dependency-management") version "1.1.7"
	id("maven-publish")
}

group = "com.jjmoey.warehousedemo"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.boot:spring-boot-dependencies:3.4.4")
	}
}

dependencies {
    // Spring Boot (for annotations and utilities)
    implementation("org.springframework:spring-core")
    implementation("org.springframework:spring-context")
    
    // Database (for JPA annotations)
    implementation("jakarta.persistence:jakarta.persistence-api")
    
    // Utilities
    implementation("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    implementation("org.mapstruct:mapstruct:1.5.5.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")
    
    // JSON Processing
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
    
    // Logging
    implementation("ch.qos.logback:logback-classic")
    implementation("net.logstash.logback:logstash-logback-encoder:7.4")
    
    // Testing
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.mockito:mockito-core")
    testImplementation("org.assertj:assertj-core")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<JavaCompile>().configureEach {
	options.compilerArgs.add("-parameters")
}

// Configure Lombok and MapStruct to work together
tasks.withType<JavaCompile> {
    options.compilerArgs = listOf("-Amapstruct.defaultComponentModel=spring")
}

// Configure Maven publishing
publishing {
    publications {
        create<MavenPublication>("gpr") {
            from(components["java"])
            
            groupId = project.findProperty("publish.group") as String? ?: project.group as String
            artifactId = project.findProperty("publish.artifactId") as String? ?: project.name
            version = project.findProperty("publish.version") as String? ?: project.version as String
        }
    }
    
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/${project.findProperty("github.owner") ?: "pul_s4r"}/${project.findProperty("github.repo") ?: "warehousedemo"}")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
