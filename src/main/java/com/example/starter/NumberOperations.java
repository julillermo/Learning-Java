package com.example.starter;

public class NumberOperations {
  public static void main(String[] args) {
    int first = 12;
    int second = 5;

    System.out.println("Number operations sample");
    printOperation("addition", first + second);
    printOperation("subtraction", first - second);
    printOperation("multiplication", first * second);
    printOperation("division", first / second);
    printDecimalDivision(first, second);
  }

  private static void printOperation(String name, int result) {
    System.out.printf("%s result: %d%n", name, result);
  }

  private static void printDecimalDivision(int numerator, int denominator) {
    double quotient = (double) numerator / denominator;
    System.out.printf("decimal division result: %.2f%n", quotient);
  }
}
