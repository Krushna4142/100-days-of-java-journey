import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

  public static void main(String[] args) {

    // Creating a HashMap
    HashMap<Integer, String> students = new HashMap<>();

    // Adding key-value pairs
    students.put(101, "Krushna");
    students.put(102, "Rahul");
    students.put(103, "Priya");
    students.put(104, "Sneha");

    System.out.println("Student Records:");
    System.out.println(students);

    // Accessing a value using a key
    System.out.println("\nStudent with ID 102: " + students.get(102));

    // Updating an existing value
    students.put(103, "Amit");

    System.out.println("\nAfter Updating Student 103:");
    System.out.println(students);

    // Removing an entry
    students.remove(104);

    System.out.println("\nAfter Removing Student 104:");
    System.out.println(students);

    // Checking if a key exists
    System.out.println("\nContains Key 101? " + students.containsKey(101));

    // Checking if a value exists
    System.out.println("Contains Value 'Rahul'? " + students.containsValue("Rahul"));

    // Size of HashMap
    System.out.println("\nTotal Records: " + students.size());

    // Iterating using entrySet()
    System.out.println("\nStudent Details:");

    for (Map.Entry<Integer, String> entry : students.entrySet()) {
      System.out.println(
          "ID: " + entry.getKey() +
              " | Name: " + entry.getValue());
    }
  }
}