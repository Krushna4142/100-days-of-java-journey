import java.util.Scanner;

public class StringBasics {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 1️⃣ Taking string input
    System.out.print("Enter your name: ");
    String name = sc.nextLine();

    // 2️⃣ Printing string
    System.out.println("Hello, " + name);

    // 3️⃣ Length of string
    System.out.println("Length: " + name.length());

    // 4️⃣ Character at index
    System.out.println("First character: " + name.charAt(0));

    // 5️⃣ Convert to uppercase
    System.out.println("Uppercase: " + name.toUpperCase());

    // 6️⃣ Convert to lowercase
    System.out.println("Lowercase: " + name.toLowerCase());

    // 7️⃣ Trim spaces
    String strWithSpaces = "   Java Programming   ";
    System.out.println("Trimmed: " + strWithSpaces.trim());

    // 8️⃣ Substring
    if (name.length() >= 3) {
      System.out.println("Substring (0-3): " + name.substring(0, 3));
    }

    // 9️⃣ String comparison
    String s1 = "Java";
    String s2 = "java";

    System.out.println("equals(): " + s1.equals(s2));
    System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));

    // 🔟 Contains
    System.out.println("Contains 'a': " + name.contains("a"));

    // 1️⃣1️⃣ Replace
    System.out.println("Replace a with *: " + name.replace('a', '*'));

    sc.close();
  }
}
