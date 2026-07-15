import java.util.LinkedList;

public class LinkedListDemo {

  public static void main(String[] args) {

    // Creating LinkedList
    LinkedList<String> languages = new LinkedList<>();

    // Adding elements
    languages.add("Java");
    languages.add("Python");
    languages.add("C++");
    languages.add("JavaScript");

    System.out.println("Initial LinkedList:");
    System.out.println(languages);

    // Add element at beginning
    languages.addFirst("C");

    // Add element at end
    languages.addLast("Go");

    System.out.println("\nAfter Adding Elements:");
    System.out.println(languages);

    // Access first and last element
    System.out.println("\nFirst Element: " + languages.getFirst());
    System.out.println("Last Element: " + languages.getLast());

    // Update element
    languages.set(2, "Kotlin");

    System.out.println("\nAfter Updating:");
    System.out.println(languages);

    // Remove elements
    languages.removeFirst();
    languages.removeLast();

    System.out.println("\nAfter Removing First & Last:");
    System.out.println(languages);

    // Iterating LinkedList
    System.out.println("\nIterating through LinkedList:");

    for (String language : languages) {
      System.out.println(language);
    }
  }
}