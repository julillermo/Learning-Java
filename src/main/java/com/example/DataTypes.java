package com.example;

public class DataTypes {
  public static void main(String[] args) {
    //
  }

  public static void dataTypes() {
    // ===== Primitive types =====

    // ===== Non-primitive (a.k.a reference type) =====
    // These refer to the location in memory

    // Everything discussed here are primitive types (?)
    byte aSingleByte = 100; // -128 to 127
    short aSmallNumber = 20_000; // 32,768 to 32,767
    int anInteger = 2147483647; // -2147483648 to 2147483647
    long aLargeNumber = 9223372036854775807L; // just search for the range online

    double aDouble = 1.7976; // just search for the range online
    float aFloat = 3.402F; // just search for the range online

    boolean isWeekend = false;

    char copyrightSymol = '\u00A9';

    System.out.println("byte: " + aSingleByte);
    System.out.println("short: " + aSmallNumber);
    System.out.println("int: " + anInteger);
    System.out.println("long: " + aLargeNumber);
    System.out.println("double: " + aDouble);
    System.out.println("flaot: " + aFloat);
    System.out.println("boolean: " + isWeekend);
    System.out.println("char: " + copyrightSymol);

  }

  public static void typeConversion() {
    int number1 = 5;
    double number2 = number1;

    // Specific steps to convert from a larger datatype to a smaller one
    double number3 = 5.8;
    int number4 = (int) number3;

    System.out.println("This is a double (5.0) converted from an int (5): " + number2);
    System.out.println("This is an int (5) converted from a double (5.8): " + number4);
  }
}
