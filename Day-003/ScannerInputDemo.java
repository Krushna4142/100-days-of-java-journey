import java.util.Scanner;

public class ScannerInputDemo {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Taking double input
        System.out.print("Enter your height (in feet): ");
        double height = sc.nextDouble();

        // Taking decimal input
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Taking boolean input
        System.out.print("Are you learning Java? (true/false): ");
        boolean isLearningJava = sc.nextBoolean();

        // Displaying output
        System.out.println("\n----- User Details -----");
        System.out.println("Name            : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Height          : " + height);
        System.out.println("Salary          : " + salary);
        System.out.println("Learning Java   : " + isLearningJava);

        // Closing scanner (important)
        sc.close();
    }
}
