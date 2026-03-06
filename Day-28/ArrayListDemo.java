import java.util.ArrayList;

public class ArrayListDemo {

  public static void main(String[] args) {

    // Creating ArrayList
    ArrayList<String> students = new ArrayList<>();

    // Adding elements
    students.add("Krushna");
    students.add("Amit");
    students.add("Rohit");
    students.add("Sneha");

    // Displaying list
    System.out.println("Student List: " + students);

    // Access element
    System.out.println("First Student: " + students.get(0));

    // Remove element
    students.remove("Rohit");

    // Updated list
    System.out.println("Updated List: " + students);

    // Iterating using loop
    System.out.println("\nIterating through ArrayList:");

    for (String student : students) {
      System.out.println(student);
    }
  }
}