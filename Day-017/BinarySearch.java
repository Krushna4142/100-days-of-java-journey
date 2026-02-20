public class BinarySearch {

  // Method for Binary Search
  public static int binarySearch(int[] arr, int key) {

    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {

      int mid = start + (end - start) / 2;

      if (arr[mid] == key) {
        return mid;
      }

      if (key < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return -1; // element not found
  }

  public static void main(String[] args) {

    int[] sortedNumbers = { 5, 10, 15, 20, 25, 30, 35 };
    int key = 25;

    int result = binarySearch(sortedNumbers, key);

    if (result != -1) {
      System.out.println("Element found at index: " + result);
    } else {
      System.out.println("Element not found");
    }
  }
}