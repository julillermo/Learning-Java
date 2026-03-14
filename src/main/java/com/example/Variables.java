package com.example;

/* GENERAL NOTES
- Java generally follows the same naming convention as TypeScript
*/

public class Variables {
  static int age;

  public static void main(String[] args) {
    //
  }

  public static void variables() {
    int age = 27;

    // modify the value
    age = 28;

    // redeclaration is not allowed
    // should be caught by the linter/compiler
    // int age = 29;

    System.out.println("I am " + age + " years old.");
  }

  public static void autoAssignedValue() {
    // No value was given within the method / function
    System.out.println("This is an auto-assigned value: " + age);

  }
}