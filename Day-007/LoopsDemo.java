import java.util.Scanner;

public class LoopsDemo {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    /*
     * --------------------------------
     * FOR LOOP EXAMPLE
     * --------------------------------
     * Used when the number of iterations is known
     */

    System.out.println("For Loop: Printing numbers from 1 to 5");
    for (int i = 1; i <= 5; i++) {
      System.out.println("Number: " + i);
    }

    /*
     * --------------------------------
     * WHILE LOOP EXAMPLE
     * --------------------------------
     * Used when iterations depend on a condition
     */

    System.out.print("\nEnter a number to calculate sum up to that number: ");
    int n = scanner.nextInt();

    int sum = 0;
    int counter = 1;

    while (counter <= n) {
      sum += counter;
      counter++;
    }

    System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);

    /*
     * --------------------------------
     * DO-WHILE LOOP EXAMPLE
     * --------------------------------
     * Executes at least once
     */

    int choice;

    do {
      System.out.println("\nMenu:");
      System.out.println("1. Print Hello");
      System.out.println("2. Print Java");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");

      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Hello");
          break;
        case 2:
          System.out.println("Java");
          break;
        case 3:
          System.out.println("Exiting program...");
          break;
        default:
          System.out.println("Invalid choice");
      }

    } while (choice != 3);

    scanner.close();
  }
}
