public class MethodOverloadingDemo {

  // 1️⃣ Different number of parameters
  static int add(int a, int b) {
    return a + b;
  }

  static int add(int a, int b, int c) {
    return a + b + c;
  }

  // 2️⃣ Different data types
  static double multiply(double a, double b) {
    return a * b;
  }

  static int multiply(int a, int b) {
    return a * b;
  }

  // 3️⃣ Different order of parameters
  static void display(int number, String name) {
    System.out.println("Number: " + number + ", Name: " + name);
  }

  static void display(String name, int number) {
    System.out.println("Name: " + name + ", Number: " + number);
  }

  public static void main(String[] args) {

    // Calling add methods
    System.out.println("Add (2 numbers): " + add(5, 10));
    System.out.println("Add (3 numbers): " + add(5, 10, 15));

    // Calling multiply methods
    System.out.println("Multiply (int): " + multiply(4, 5));
    System.out.println("Multiply (double): " + multiply(2.5, 3.5));

    // Calling display methods
    display(101, "Krushna");
    display("Nawale", 202);
  }
}
