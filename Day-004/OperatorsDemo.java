package Day-004;

public class OperatorsDemo {

  public static void main(String[] args) {

    // Arithmetic Operators
    int a = 10;
    int b = 3;

    System.out.println("Arithmetic Operators:");
    System.out.println("Addition: " + (a + b));
    System.out.println("Subtraction: " + (a - b));
    System.out.println("Multiplication: " + (a * b));
    System.out.println("Division: " + (a / b));
    System.out.println("Modulus: " + (a % b));

    // Relational Operators
    System.out.println("\nRelational Operators:");
    System.out.println("a > b : " + (a > b));
    System.out.println("a == b : " + (a == b));
    System.out.println("a != b : " + (a != b));

    // Logical Operators
    boolean hasLicense = true;
    boolean hasCar = false;

    System.out.println("\nLogical Operators:");
    System.out.println("Can drive: " + (hasLicense && hasCar));
    System.out.println("Has license or car: " + (hasLicense || hasCar));
    System.out.println("No car: " + (!hasCar));

    // Assignment Operators
    int x = 5;
    x += 2;
    System.out.println("\nAssignment Operator:");
    System.out.println("x after += : " + x);

    // Unary Operators
    int y = 7;
    System.out.println("\nUnary Operators:");
    System.out.println("y++ : " + (y++));
    System.out.println("++y : " + (++y));
  }
}