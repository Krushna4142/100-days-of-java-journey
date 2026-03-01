
class MethodOverloading {

  int add(int a, int b) {
    return a + b;
  }

  double add(double a, double b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    MethodOverloading obj = new MethodOverloading();

    System.out.println("Sum of 2 integers: " + obj.add(10, 20));
    System.out.println("Sum of 2 doubles: " + obj.add(5.5, 6.5));
    System.out.println("Sum of 3 integers: " + obj.add(1, 2, 3));
  }
}