
/**
 * Day 010 - Arrays with User Input
 * Focus: Dynamic array input and processing
 *
 * Author: Krushna Nawale
 */

import java.util.Scanner;

public class ArrayInputDemo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("\nArray Elements:");
    printArray(arr);

    int sum = calculateSum(arr);
    System.out.println("\nSum: " + sum);

    double average = calculateAverage(arr);
    System.out.println("Average: " + average);

    int max = findMax(arr);
    System.out.println("Maximum Element: " + max);

    sc.close();
  }

  // Print array elements
  static void printArray(int[] arr) {
    for (int value : arr) {
      System.out.print(value + " ");
    }
    System.out.println();
  }

  // Calculate sum
  static int calculateSum(int[] arr) {
    int sum = 0;
    for (int value : arr) {
      sum += value;
    }
    return sum;
  }

  // Calculate average
  static double calculateAverage(int[] arr) {
    return (double) calculateSum(arr) / arr.length;
  }

  // Find maximum value
  static int findMax(int[] arr) {
    int max = arr[0];
    for (int value : arr) {
      if (value > max) {
        max = value;
      }
    }
    return max;
  }
}
