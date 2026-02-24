import java.util.Scanner;

public class StudentManagementSystem {

  static Student[] students = new Student[100];
  static int count = 0;

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int choice;

    do {
      showMenu();
      choice = sc.nextInt();

      switch (choice) {
        case 1 -> addStudent();
        case 2 -> viewStudents();
        case 3 -> searchStudent();
        case 4 -> updateStudent();
        case 5 -> deleteStudent();
        case 6 -> System.out.println("Exiting system...");
        default -> System.out.println("Invalid choice!");
      }

    } while (choice != 6);
  }

  static void showMenu() {
    System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
    System.out.println("1. Add Student");
    System.out.println("2. View All Students");
    System.out.println("3. Search Student");
    System.out.println("4. Update Student");
    System.out.println("5. Delete Student");
    System.out.println("6. Exit");
    System.out.print("Enter your choice: ");
  }

  static void addStudent() {

    System.out.print("Enter Roll Number: ");
    int roll = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Marks: ");
    int marks = sc.nextInt();

    students[count++] = new Student(roll, name, marks);

    System.out.println("✅ Student added successfully!");
  }

  static void viewStudents() {

    if (count == 0) {
      System.out.println("No records found.");
      return;
    }

    for (int i = 0; i < count; i++) {
      students[i].displayStudent();
    }
  }

  static void searchStudent() {

    System.out.print("Enter Roll Number to search: ");
    int roll = sc.nextInt();

    for (int i = 0; i < count; i++) {
      if (students[i].getRollNumber() == roll) {
        students[i].displayStudent();
        return;
      }
    }

    System.out.println("❌ Student not found.");
  }

  static void updateStudent() {

    System.out.print("Enter Roll Number to update: ");
    int roll = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < count; i++) {

      if (students[i].getRollNumber() == roll) {

        System.out.print("Enter new name: ");
        students[i].setName(sc.nextLine());

        System.out.print("Enter new marks: ");
        students[i].setMarks(sc.nextInt());

        System.out.println("✅ Student updated.");
        return;
      }
    }

    System.out.println("❌ Student not found.");
  }

  static void deleteStudent() {

    System.out.print("Enter Roll Number to delete: ");
    int roll = sc.nextInt();

    for (int i = 0; i < count; i++) {

      if (students[i].getRollNumber() == roll) {

        for (int j = i; j < count - 1; j++) {
          students[j] = students[j + 1];
        }

        count--;
        System.out.println("✅ Student deleted.");
        return;
      }
    }

    System.out.println("❌ Student not found.");
  }
}