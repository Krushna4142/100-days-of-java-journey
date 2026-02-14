public class RecursionBasics {

  // 1️⃣ Print numbers from 1 to N
  static void printNumbers(int n) {
    if (n == 0) {
      return;
    }

    printNumbers(n - 1);
    System.out.println(n);
  }

  // 2️⃣ Factorial using recursion
  static int factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }

    return n * factorial(n - 1);
  }

  // 3️⃣ Sum of first N natural numbers
  static int sum(int n) {
    if (n == 1) {
      return 1;
    }

    return n + sum(n - 1);
  }

  public static void main(String[] args) {

    System.out.println("Print numbers from 1 to 5:");
    printNumbers(5);

    System.out.println("\nFactorial of 5: " + factorial(5));

    System.out.println("Sum of first 5 numbers: " + sum(5));
  }
}
