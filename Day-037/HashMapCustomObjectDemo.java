import java.util.HashMap;
import java.util.Map;

public class HashMapCustomObjectDemo {

  public static void main(String[] args) {

    HashMap<Integer, Student> students = new HashMap<>();

    // Adding Student objects
    students.put(101, new Student(101, "Krushna", "Computer Engineering"));
    students.put(102, new Student(102, "Rahul", "Information Technology"));
    students.put(103, new Student(103, "Sneha", "Computer Engineering"));

    System.out.println("Student Records:\n");

    // Displaying all students
    for (Map.Entry<Integer, Student> entry : students.entrySet()) {

      System.out.println("Student ID: " + entry.getKey());
      entry.getValue().displayStudent();
    }

    // Accessing a particular student
    System.out.println("Student with ID 102:");

    Student student = students.get(102);

    if (student != null) {
      student.displayStudent();
    }
  }
}