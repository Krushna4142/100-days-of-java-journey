public class MethodsDemo {

  // 1️⃣ Method without return type and parameters
  static void greetUser() {
    System.out.println("Welcome to Day 011 - Methods in Java!");
  }

  // 2️⃣ Method with parameters (no return)
  static void printSum(int a, int b) {
    int sum = a + b;
    System.out.println("Sum: " + sum);
  }

  // 3️⃣ Method with return type
  static int multiply(int a, int b) {
    return a * b;
  }

  // 4️⃣ Method returning boolean
  static boolean isEven(int number) {
    return number % 2 == 0;
  }

  // 5️⃣ Method Overloading Example
  static int add(int a, int b) {
    return a + b;
  }

  static int add(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {

    greetUser();

    printSum(10, 20);

    int product = multiply(5, 4);
    System.out.println("Multiplication: " + product);

    boolean check = isEven(8);
    System.out.println("Is 8 even? " + check);

    System.out.println("Add (2 numbers): " + add(5, 6));
    System.out.println("Add (3 numbers): " + add(5, 6, 7));
  }
}
