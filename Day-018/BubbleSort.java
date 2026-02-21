import java.util.Arrays;

public class BubbleSort {

  public static void bubbleSort(int[] arr) {

    int n = arr.length;
    boolean swapped;

    for (int i = 0; i < n - 1; i++) {

      swapped = false;

      for (int j = 0; j < n - i - 1; j++) {

        if (arr[j] > arr[j + 1]) {

          // swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

          swapped = true;
        }
      }

      // optimization
      if (!swapped) {
        break;
      }
    }
  }

  public static void main(String[] args) {

    int[] numbers = { 64, 34, 25, 12, 22, 11, 90 };

    bubbleSort(numbers);

    System.out.println("Sorted Array: " + Arrays.toString(numbers));
  }
}