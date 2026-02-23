public class ArrayRevision {

  public static void main(String[] args) {

    int[] arr = { 10, 20, 30, 40, 50 };

    int sum = 0;
    int max = arr[0];
    int min = arr[0];

    for (int num : arr) {
      sum += num;

      if (num > max)
        max = num;
      if (num < min)
        min = num;
    }

    System.out.println("Sum = " + sum);
    System.out.println("Max = " + max);
    System.out.println("Min = " + min);

    // Reverse Array
    System.out.print("Reversed Array: ");
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
}