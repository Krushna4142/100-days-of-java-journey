import java.util.HashSet;

public class HashSetDemo {

  public static void main(String[] args) {

    // Creating HashSet
    HashSet<String> cities = new HashSet<>();

    // Adding elements
    cities.add("Pune");
    cities.add("Mumbai");
    cities.add("Delhi");
    cities.add("Pune"); // duplicate value

    // Display set
    System.out.println("Cities in HashSet:");
    System.out.println(cities);

    // Check element
    if (cities.contains("Mumbai")) {
      System.out.println("Mumbai is present in the set.");
    }

    // Remove element
    cities.remove("Delhi");

    System.out.println("Updated HashSet:");
    System.out.println(cities);
  }
}