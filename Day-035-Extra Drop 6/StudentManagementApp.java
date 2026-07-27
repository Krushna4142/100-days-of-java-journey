import java.util.Scanner;

public class StudentManagementApp {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    StudentManager manager = new StudentManager();

    while (true) {

      System.out.println("\n========== Student Management System ==========");
      System.out.println("1. Add Student");
      System.out.println("2. View Students");
      System.out.println("3. Search Student");
      System.out.println("4. Update Student");
      System.out.println("5. Delete Student");
      System.out.println("6. Exit");

      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {

        case 1:

          System.out.print("Enter Student ID: ");
          int id = scanner.nextInt();

          scanner.nextLine();

          System.out.print("Enter Name: ");
          String name = scanner.nextLine();

          System.out.print("Enter Age: ");
          int age = scanner.nextInt();

          scanner.nextLine();

          System.out.print("Enter Course: ");
          String course = scanner.nextLine();

          manager.addStudent(new Student(id, name, age, course));
          break;

        case 2:

          manager.displayStudents();
          break;

        case 3:

          System.out.print("Enter Student ID: ");
          manager.searchStudent(scanner.nextInt());
          break;

        case 4:

          System.out.print("Enter Student ID: ");
          int updateId = scanner.nextInt();

          scanner.nextLine();

          System.out.print("Enter New Name: ");
          String newName = scanner.nextLine();

          System.out.print("Enter New Age: ");
          int newAge = scanner.nextInt();

          scanner.nextLine();

          System.out.print("Enter New Course: ");
          String newCourse = scanner.nextLine();

          manager.updateStudent(updateId, newName, newAge, newCourse);
          break;

        case 5:

          System.out.print("Enter Student ID: ");
          manager.deleteStudent(scanner.nextInt());
          break;

        case 6:

          System.out.println("Thank you for using Student Management System.");
          scanner.close();
          return;

        default:

          System.out.println("Invalid choice.");
      }
    }
  }
}