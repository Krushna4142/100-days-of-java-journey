import java.util.Scanner;

public class DecisionMakingDemo {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    /*
     * -------------------------------
     * Program 1: Student Grade System
     * Using Else-If Ladder
     * -------------------------------
     */

    System.out.print("Enter student marks (0 - 100): ");
    int marks = scanner.nextInt();

    if (marks >= 90 && marks <= 100) {
      System.out.println("Grade: A");
    } else if (marks >= 75) {
      System.out.println("Grade: B");
    } else if (marks >= 60) {
      System.out.println("Grade: C");
    } else if (marks >= 40) {
      System.out.println("Grade: D");
    } else if (marks >= 0) {
      System.out.println("Grade: Fail");
    } else {
      System.out.println("Invalid marks entered");
    }

    /*
     * -------------------------------
     * Program 2: Menu Driven Program
     * Using Switch Statement
     * -------------------------------
     */

    System.out.println("\nChoose an option:");
    System.out.println("1. Check Even or Odd");
    System.out.println("2. Check Positive or Negative");
    System.out.print("Enter your choice: ");

    int choice = scanner.nextInt();

    switch (choice) {

      case 1:
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
          System.out.println("Result: Even number");
        } else {
          System.out.println("Result: Odd number");
        }
        break;

      case 2:
        System.out.print("Enter a number: ");
        int value = scanner.nextInt();

        if (value > 0) {
          System.out.println("Result: Positive number");
        } else if (value < 0) {
          System.out.println("Result: Negative number");
        } else {
          System.out.println("Result: Zero");
        }
        break;

      default:
        System.out.println("Invalid choice selected");
    }

    scanner.close();
  }
}
