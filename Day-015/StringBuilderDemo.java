public class StringBuilderDemo {

  public static void main(String[] args) {

    // 🔹 StringBuilder Example
    StringBuilder sb = new StringBuilder("Hello");

    System.out.println("Initial: " + sb);

    // append()
    sb.append(" World");
    System.out.println("After append: " + sb);

    // insert()
    sb.insert(5, " Java");
    System.out.println("After insert: " + sb);

    // replace()
    sb.replace(6, 10, "Programming");
    System.out.println("After replace: " + sb);

    // delete()
    sb.delete(6, 18);
    System.out.println("After delete: " + sb);

    // reverse()
    sb.reverse();
    System.out.println("After reverse: " + sb);

    // convert to String
    String finalString = sb.toString();
    System.out.println("Converted to String: " + finalString);

    System.out.println("\n============================\n");

    // 🔹 StringBuffer Example (Thread-safe version)

    StringBuffer sbf = new StringBuffer("Java");

    System.out.println("Initial: " + sbf);

    sbf.append(" Developer");
    System.out.println("After append: " + sbf);

    sbf.insert(4, " Full Stack");
    System.out.println("After insert: " + sbf);

    sbf.replace(5, 15, " Backend");
    System.out.println("After replace: " + sbf);

    sbf.delete(5, 13);
    System.out.println("After delete: " + sbf);

    sbf.reverse();
    System.out.println("After reverse: " + sbf);
  }
}
