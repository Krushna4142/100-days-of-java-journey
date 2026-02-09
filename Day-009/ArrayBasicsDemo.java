/**
 * Day 009 - Arrays Basics
 * Focus: Declaration, traversal, sum, max
 *
 * Author: Krushna Nawale
 */

public class ArrayBasicsDemo {

  public static void main(String[] args) {

    int[] numbers = { 10, 25, 30, 15, 40 };

    System.out.println("Array Elements:");
    printArray(numbers);

    int sum = calculateSum(numbers);
    System.out.println("\nSum of elements: " + sum);

    int max = findMax(numbers);
    System.out.println("Maximum element: " + max);
  }

  // Print all array elements
  static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Calculate sum of array elements
  static int calculateSum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  // Find maximum element
  static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}
