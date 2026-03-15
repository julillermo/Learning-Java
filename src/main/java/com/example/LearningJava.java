package com.example;

public class LearningJava {
  public static void main(String[] args) {
    // Hello world
    System.out.println("===== Hello World! =====");
    HelloWorld.printGreeting();
    System.out.println();

    // Variables
    System.out.println("===== Variables =====");
    Variables.variables();
    Variables.autoAssignedValue();
    System.out.println();

    // Data Types
    System.out.println("===== Data Types =====");
    DataTypes.dataTypes();
    DataTypes.typeConversion();
    System.out.println();

    // Operators
    System.out.println("===== Operators =====");
    Operators.arirthmeticOperators();
    Operators.relationalOperators();
    Operators.logicalOperators();
    System.out.println();

    // Strings
    System.out.println("===== Strings =====");
    Strings.strings();
    Strings.stringDeclaration();
    Strings.stringTemplate();
    Strings.stringMethods();
    System.out.println();

    // // User Inputs
    // System.out.println("===== User Inputs =====");
    // System.out.println();
  }
}
