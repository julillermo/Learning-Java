package com.example;

public class Strings {
  public static void main(String[] args) {
    //
  }

  public static void strings() {
    char percentSign = '%';
    // Notice that the String type was declared w/ capitalization
    // I believe this is because String may be treated as an Object in java
    String someString = "Some String";

    // You can also create a string by the `new String()` syntax
    String newString = new String("new string");

    System.out.println("Printing a char: " + percentSign);
    System.out.println("Printing a String: " + someString);
    System.out.println("Printing a new String(): " + newString);

  }

  public static void stringDeclaration() {
    // Declaring a string like this sets them to something like a
    // "string constant pool" shared across the applicaiton and
    // likely handled by the JVM
    String literalString1 = "abc";
    String literalString2 = "abc";

    // Note that this method always results in objects in the heap
    // Actual objects will always get assigned to the heap (handled by JVM)
    String objectString1 = new String("xyx");
    String objectString2 = new String("xyx");
    String objectString3 = objectString1;

    // I think Java still treats both as an Object with methods still.

    System.out.println("Equality check on string variables (same value) declared via `String varName = 'abc'`: "
        + (literalString1 == literalString2));
    System.out
        .println("Equality check on string variables (same value) declared via `String varName = new String('abc')`: "
            + (objectString1 == objectString2));
    // The following works because `objectString3` is only a reference to the
    // original object
    System.out.println("Note that String objectString3 = objectString1 works: " + (objectString1 == objectString3));
  }

  public static void stringTemplate() {
    String currentLangauge = "Java";
    String previousLanguage = "TypeScript";

    int prevLangYears = 2;
    double currentLangRating = 8.5; // use %f for double (which is really 2x float)
    char someChar = '@';
    boolean someBoolean = true;

    // Note that printf() doesn't automatically newline
    System.out.printf(
        "I worked as a %s developer for %d years. I'm currently learning %s. I am giving this tutorial a grade of %f%n",
        previousLanguage,
        prevLangYears,
        currentLangauge,
        currentLangRating);
    System.out.printf("I really like the %c char.%n", someChar);
    System.out.printf("Printing bolean via format uses %%b: %b%n", someBoolean);
  }

  public static void stringMethods() {
    String someString = "The quick brown fox jumped over the lazy dog";
    String emptyString = "";

    // If you setup the common Java extensions in VScode, you should also
    // get intellisence similar to JavaScript for what methods are available.
    System.out.println("string.length(): " + someString.length());
    System.out.println("emptyString.isEmpty(): " + emptyString.isEmpty());

    // Interesting. You can also call the string methods inline
    System.out.println("inline ABC.length(): " + "ABC".length());

    String someObjString1 = new String("XYZ");
    String someObjString2 = new String("XYZ");

    System.out.println("use stringVar1.equals(stringVar2) if you want to compare 2 distinct string objects: "
        + someObjString1.equals((someObjString2)));

    // I imagine that the methods are about the same as with JS / Python
    // https://www.w3schools.com/java/java_ref_string.asp
  }
}
