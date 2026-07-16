import java.util.HashSet;

public class HashSetDemo {

  public static void main(String[] args) {

    // Creating HashSet
    HashSet<String> programmingLanguages = new HashSet<>();

    // Adding elements
    programmingLanguages.add("Java");
    programmingLanguages.add("Python");
    programmingLanguages.add("C++");
    programmingLanguages.add("JavaScript");

    // Adding duplicate elements
    programmingLanguages.add("Java");
    programmingLanguages.add("Python");

    System.out.println("HashSet Elements:");
    System.out.println(programmingLanguages);

    // Checking if an element exists
    System.out.println("\nContains Java? " + programmingLanguages.contains("Java"));

    // Removing an element
    programmingLanguages.remove("C++");

    System.out.println("\nAfter Removing C++:");
    System.out.println(programmingLanguages);

    // Size of HashSet
    System.out.println("\nSize: " + programmingLanguages.size());

    // Iterating through HashSet
    System.out.println("\nIterating through HashSet:");

    for (String language : programmingLanguages) {
      System.out.println(language);
    }
  }
}