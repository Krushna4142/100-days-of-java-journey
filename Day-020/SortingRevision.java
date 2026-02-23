import java.util.Arrays;

public class SortingRevision {

  public static void main(String[] args) {

    int[] arr1 = { 5, 3, 8, 4, 2 };
    int[] arr2 = { 9, 1, 6, 7, 3 };

    bubbleSort(arr1);
    selectionSort(arr2);
  }

  static void bubbleSort(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {

      for (int j = 0; j < arr.length - 1 - i; j++) {

        if (arr[j] > arr[j + 1]) {

          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    System.out.println("Bubble Sorted: " + Arrays.toString(arr));
  }

  static void selectionSort(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {

      int minIndex = i;

      for (int j = i + 1; j < arr.length; j++) {

        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }

      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }

    System.out.println("Selection Sorted: " + Arrays.toString(arr));
  }
}