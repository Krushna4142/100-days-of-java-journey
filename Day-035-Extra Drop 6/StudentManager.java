import java.util.ArrayList;

public class StudentManager {

  private ArrayList<Student> students = new ArrayList<>();

  public void addStudent(Student student) {
    students.add(student);
    System.out.println("Student added successfully.");
  }

  public void displayStudents() {

    if (students.isEmpty()) {
      System.out.println("No student records found.");
      return;
    }

    System.out.println("\n========== Student Records ==========");

    for (Student student : students) {
      student.display();
    }
  }

  public void searchStudent(int id) {

    for (Student student : students) {

      if (student.getId() == id) {
        System.out.println("\nStudent Found");
        student.display();
        return;
      }
    }

    System.out.println("Student not found.");
  }

  public void updateStudent(int id, String name, int age, String course) {

    for (Student student : students) {

      if (student.getId() == id) {

        student.setName(name);
        student.setAge(age);
        student.setCourse(course);

        System.out.println("Student updated successfully.");
        return;
      }
    }

    System.out.println("Student not found.");
  }

  public void deleteStudent(int id) {

    for (Student student : students) {

      if (student.getId() == id) {

        students.remove(student);

        System.out.println("Student deleted successfully.");
        return;
      }
    }

    System.out.println("Student not found.");
  }
}