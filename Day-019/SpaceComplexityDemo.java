public class SpaceComplexityDemo {

  // O(1) space
  static int constantSpace(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    return sum;
  }

  // O(n) space
  static int[] linearSpace(int n) {
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = i * 2;
    }

    return arr;
  }

  public static void main(String[] args) {

    System.out.println(constantSpace(5));

    int[] result = linearSpace(5);

    for (int num : result) {
      System.out.print(num + " ");
    }
  }
}