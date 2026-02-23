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

public class SearchingRevision {

  public static void main(String[] args) {

    int[] arr = { 10, 20, 30, 40, 50 };
    int target = 30;

    linearSearch(arr, target);
    binarySearch(arr, target);
  }

  static void linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        System.out.println("Linear Search → Found at index " + i);
        return;
      }
    }
    System.out.println("Linear Search → Not Found");
  }

  static void binarySearch(int[] arr, int key) {
    int start = 0, end = arr.length - 1;

    while (start <= end) {

      int mid = (start + end) / 2;

      if (arr[mid] == key) {
        System.out.println("Binary Search → Found at index " + mid);
        return;
      }

      if (key > arr[mid])
        start = mid + 1;
      else
        end = mid - 1;
    }

    System.out.println("Binary Search → Not Found");
  }
}