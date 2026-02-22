public class TimeComplexityDemo {

  // O(1)
  static void constantTime() {
    int x = 10;
    System.out.println(x);
  }

  // O(n)
  static void linearTime(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(i + " ");
    }
  }

  // O(n²)
  static void quadraticTime(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    int n = 5;

    constantTime();
    linearTime(n);
    quadraticTime(n);
  }
}