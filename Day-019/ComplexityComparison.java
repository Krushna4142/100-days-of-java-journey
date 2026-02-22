public class ComplexityComparison {

  static void printFirstElement(int[] arr) {
    System.out.println(arr[0]); // O(1)
  }

  static void printAllElements(int[] arr) {
    for (int num : arr) { // O(n)
      System.out.print(num + " ");
    }
  }

  public static void main(String[] args) {

    int[] arr = { 10, 20, 30, 40, 50 };

    printFirstElement(arr);
    printAllElements(arr);
  }
}