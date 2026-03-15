package com.example;

public class Operators {
  public static void main(String[] args) {
    //
  }

  public static void arirthmeticOperators() {
    int number1 = 12;
    int number2 = 6;

    int addition = number1 + number2;
    int subtraction = number1 - number2;
    int division = number1 / number2;
    int remainder = number1 % number2;

    number1 += number1; // Plus itself

    System.out.println("addition (12, 6): " + addition);
    System.out.println("subtraction (12, 6): " + subtraction);
    System.out.println("division (12, 6): " + division);
    System.out.println("remainder (12, 6): " + remainder);

    System.out.println("plusEquals 12 (plus itself): " + number1);
  }

  public static void relationalOperators() {
    int number1 = 12;
    int number2 = 15;

    System.out.println("equality operator (12,15): " + (number1 == number2));
    System.out.println("inequality operator (12,15): " + (number1 != number2));
    System.out.println("greater than operator (12,15): " + (number1 > number2));
    System.out.println("less than operator (12,15): " + (number1 < number2));
    System.out.println("greater than or equal operator (12,15): " + (number1 >= number2));
    System.out.println("less than or equal operator (12,15): " + (number1 <= number2));
  }

  public static void logicalOperators() {
    int number1 = 25;

    System.out.println("25 is grater than 18 AND less than 40: " + (number1 >= 18 && number1 <= 40));
    System.out.println("negate the above result above (!result): " + !((number1 >= 18 && number1 <= 40)));

    number1++;
    System.out.println("Using number++: " + number1);
    System.out.println("Using number++ doesn't work inline: " + (number1++));
    // The inline doesn't work becaue the compiler reads it from left-to-right
  }
}
