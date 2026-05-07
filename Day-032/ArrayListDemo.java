import java.util.ArrayList;

public class StudentManager {

  private ArrayList<Student> students = new ArrayList<>();

  // Add student
  public void addStudent(Student student) {
    students.add(student);
    System.out.println("Student added successfully.");
  }

  // Display all students
  public void displayStudents() {

    if (students.isEmpty()) {
      System.out.println("No students available.");
      return;
    }

    System.out.println("\nStudent List:");

    for (Student s : students) {
      s.display();
    }
  }

  // Search student by ID
  public void searchStudent(int id) {

    for (Student s : students) {
      if (s.getId() == id) {
        System.out.println("Student Found:");
        s.display();
        return;
      }
    }

    System.out.println("Student not found.");
  }

  // Remove student
  public void removeStudent(int id) {

    for (Student s : students) {
      if (s.getId() == id) {
        students.remove(s);
        System.out.println("Student removed successfully.");
        return;
      }
    }

    System.out.println("Student not found.");
  }
}