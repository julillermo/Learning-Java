package com.example.starter;

public class LogicalOperatorsDemo {
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;

    System.out.println("Logical operators demo");
    printOperation("a && b", a && b);
    printOperation("a || b", a || b);
    printOperation("a ^ b", a ^ b);
    printOperation("!a", !a);
    printOperation("!(a && b)", !(a && b));

    demonstrateIfElse(a, b);
    demonstrateTernary(a, b);
  }

  private static void printOperation(String label, boolean result) {
    System.out.printf("%s => %b%n", label, result);
  }

  private static void demonstrateIfElse(boolean a, boolean b) {
    if (a && b) {
      System.out.println("Both sides true: action A");
    } else if (a || b) {
      System.out.println("One side true: action B");
    } else {
      System.out.println("Neither true: action C");
    }
  }

  private static void demonstrateTernary(boolean a, boolean b) {
    String message = (a && b) ? "both true" : "at least one false";
    System.out.printf("Ternary message => %s%n", message);
  }
}
