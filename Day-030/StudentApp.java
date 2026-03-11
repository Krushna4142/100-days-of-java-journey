import java.util.Scanner;

public class StudentApp {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    StudentManager manager = new StudentManager();

    while (true) {

      System.out.println("\n===== Student Management System =====");
      System.out.println("1. Add Student");
      System.out.println("2. View Students");
      System.out.println("3. Remove Student");
      System.out.println("4. Exit");
      System.out.print("Choose option: ");

      int choice = scanner.nextInt();

      switch (choice) {

        case 1:
          System.out.print("Enter ID: ");
          int id = scanner.nextInt();

          scanner.nextLine(); // clear buffer

          System.out.print("Enter Name: ");
          String name = scanner.nextLine();

          System.out.print("Enter Age: ");
          int age = scanner.nextInt();

          Student student = new Student(id, name, age);
          manager.addStudent(student);
          break;

        case 2:
          manager.displayStudents();
          break;

        case 3:
          System.out.print("Enter Student ID to remove: ");
          int removeId = scanner.nextInt();
          manager.removeStudent(removeId);
          break;

        case 4:
          System.out.println("Exiting program...");
          scanner.close();
          return;

        default:
          System.out.println("Invalid option. Try again.");
      }
    }
  }
}