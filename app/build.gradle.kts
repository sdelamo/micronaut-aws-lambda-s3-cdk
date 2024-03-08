plugins {
    id("io.micronaut.library") version "4.3.3"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

version = "0.1"
group = "com.example"

repositories {
    mavenCentral()
}

dependencies {
//    annotationProcessor("io.micronaut.serde:micronaut-serde-processor")
//    implementation("io.micronaut.serde:micronaut-serde-jackson")
    // implementation("io.micronaut.aws:micronaut-aws-lambda-events-serde")
    implementation("io.micronaut:micronaut-jackson-databind")

    implementation("com.amazonaws:aws-lambda-java-events")

    implementation("io.micronaut.aws:micronaut-function-aws")
    implementation("io.micronaut.crac:micronaut-crac")

    runtimeOnly("ch.qos.logback:logback-classic")
    annotationProcessor("io.micronaut.validation:micronaut-validation-processor")
    implementation("io.micronaut.validation:micronaut-validation")
    implementation("net.coobird:thumbnailator:0.4.17")

    implementation("io.micronaut.aws:micronaut-aws-sdk-v2")
    implementation("software.amazon.awssdk:s3")
}


java {
    sourceCompatibility = JavaVersion.toVersion("21")
    targetCompatibility = JavaVersion.toVersion("21")
}


micronaut {
    runtime("lambda_java")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("com.example.*")
    }
}



