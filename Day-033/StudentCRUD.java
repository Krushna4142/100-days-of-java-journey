import java.util.ArrayList;
import java.util.Scanner;

public class StudentCRUD {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    while (true) {

      System.out.println("\n===== Student CRUD System =====");
      System.out.println("1. Add Student");
      System.out.println("2. View Students");
      System.out.println("3. Update Student");
      System.out.println("4. Delete Student");
      System.out.println("5. Exit");

      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {

        case 1:
          // Add Student
          System.out.print("Enter ID: ");
          int id = scanner.nextInt();

          scanner.nextLine();

          System.out.print("Enter Name: ");
          String name = scanner.nextLine();

          System.out.print("Enter Age: ");
          int age = scanner.nextInt();

          students.add(new Student(id, name, age));

          System.out.println("Student added successfully.");
          break;

        case 2:
          // View Students
          if (students.isEmpty()) {
            System.out.println("No students found.");
          } else {

            System.out.println("\nStudent Records:");

            for (Student s : students) {
              s.displayStudent();
            }
          }
          break;

        case 3:
          // Update Student
          System.out.print("Enter Student ID to update: ");
          int updateId = scanner.nextInt();

          boolean updated = false;

          for (Student s : students) {

            if (s.getId() == updateId) {

              scanner.nextLine();

              System.out.print("Enter New Name: ");
              String newName = scanner.nextLine();

              System.out.print("Enter New Age: ");
              int newAge = scanner.nextInt();

              s.setName(newName);
              s.setAge(newAge);

              System.out.println("Student updated successfully.");

              updated = true;
              break;
            }
          }

          if (!updated) {
            System.out.println("Student not found.");
          }

          break;

        case 4:
          // Delete Student
          System.out.print("Enter Student ID to delete: ");
          int deleteId = scanner.nextInt();

          boolean removed = false;

          for (Student s : students) {

            if (s.getId() == deleteId) {
              students.remove(s);

              System.out.println("Student deleted successfully.");

              removed = true;
              break;
            }
          }

          if (!removed) {
            System.out.println("Student not found.");
          }

          break;

        case 5:
          // Exit
          System.out.println("Exiting program...");
          scanner.close();
          return;

        default:
          System.out.println("Invalid choice.");
      }
    }
  }
}