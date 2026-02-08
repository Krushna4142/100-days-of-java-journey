/**
 * Day 008 - Loop Practice & Pattern Programs
 * Focus: Nested loops, pattern logic, clean structure
 *
 * Author: Krushna Nawale
 */

public class PatternPrograms {

  public static void main(String[] args) {

    System.out.println("Pattern 1: Square Star Pattern");
    squareStarPattern(5);

    System.out.println("\nPattern 2: Right Triangle Star Pattern");
    rightTriangleStarPattern(5);

    System.out.println("\nPattern 3: Inverted Right Triangle Star Pattern");
    invertedRightTriangleStarPattern(5);

    System.out.println("\nPattern 4: Number Triangle Pattern");
    numberTrianglePattern(5);
  }

  // Pattern 1: Square Star Pattern
  /*
   * * * * *
   * * * * *
   * * * * *
   * * * * *
   * * * * *
   */
  static void squareStarPattern(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= n; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  // Pattern 2: Right Triangle Star Pattern
  /*
   * *
   * * *
   * * * *
   * * * * *
   */
  static void rightTriangleStarPattern(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  // Pattern 3: Inverted Right Triangle Star Pattern
  /*
   * * * * *
   * * * *
   * * *
   * *
   *
   */
  static void invertedRightTriangleStarPattern(int n) {
    for (int row = n; row >= 1; row--) {
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  // Pattern 4: Number Triangle Pattern
  /*
   * 1
   * 1 2
   * 1 2 3
   * 1 2 3 4
   * 1 2 3 4 5
   */
  static void numberTrianglePattern(int n) {
    for (int row = 1; row <= n; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
}
