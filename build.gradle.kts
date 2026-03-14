import org.gradle.api.tasks.JavaExec

plugins {
    application
}

application {
    mainClass.set("com.example.LearningJava")
}

tasks.register<JavaExec>("runNumberOperations") {
    group = "application"
    description = "Run the NumberOperations sample to try arithmetic shortcuts."
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.example.starter.NumberOperations")
}

tasks.register<JavaExec>("runLogicalOperators") {
    group = "application"
    description = "Run the LogicalOperatorsDemo sample to experiment with if/else and logical operators."
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.example.starter.LogicalOperatorsDemo")
}

tasks.register<JavaExec>("runOperatorsRunner") {
    group = "application"
    description = "Run OperatorsRunner to show how classes import and call each other."
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.example.starter.OperatorsRunner")
}
