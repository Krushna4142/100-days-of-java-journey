import java.util.ArrayList;

public class ArrayListDemo {

  public static void main(String[] args) {

    // Creating an ArrayList
    ArrayList<String> fruits = new ArrayList<>();

    // Adding elements
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");

    System.out.println("Initial List: " + fruits);

    // Accessing elements
    System.out.println("First Fruit: " + fruits.get(0));

    // Updating element
    fruits.set(1, "Grapes");
    System.out.println("After Update: " + fruits);

    // Removing element
    fruits.remove("Mango");
    System.out.println("After Removal: " + fruits);

    // Size of ArrayList
    System.out.println("Size of List: " + fruits.size());

    // Iterating through ArrayList
    System.out.println("\nIterating through ArrayList:");

    for (String fruit : fruits) {
      System.out.println(fruit);
    }
  }
}