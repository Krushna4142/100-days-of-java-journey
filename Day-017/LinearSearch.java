public class LinearSearch {

  // Method for Linear Search
  public static int linearSearch(int[] arr, int key) {

    for (int i = 0; i < arr.length; i++) {

      if (arr[i] == key) {
        return i; // element found
      }
    }

    return -1; // element not found
  }

  public static void main(String[] args) {

    int[] numbers = { 12, 45, 7, 34, 19, 50 };
    int key = 34;

    int result = linearSearch(numbers, key);

    if (result != -1) {
      System.out.println("Element found at index: " + result);
    } else {
      System.out.println("Element not found");
    }
  }
}