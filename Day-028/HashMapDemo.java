import java.util.HashMap;

public class HashMapDemo {

  public static void main(String[] args) {

    // Creating HashMap
    HashMap<Integer, String> students = new HashMap<>();

    // Adding key-value pairs
    students.put(101, "Krushna");
    students.put(102, "Amit");
    students.put(103, "Sneha");
    students.put(104, "Rohit");

    // Display map
    System.out.println("Student Map:");
    System.out.println(students);

    // Access value using key
    System.out.println("Student with ID 102: " + students.get(102));

    // Remove entry
    students.remove(103);

    System.out.println("Updated Map:");
    System.out.println(students);

    // Iterating through map
    System.out.println("\nIterating through HashMap:");

    for (Integer key : students.keySet()) {
      System.out.println(key + " : " + students.get(key));
    }
  }
}