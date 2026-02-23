public class StringRevision {

  public static void main(String[] args) {

    String str = "madam";

    reverseString(str);
    checkPalindrome(str);
    countVowels("programming");
  }

  static void reverseString(String str) {

    String reversed = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }

    System.out.println("Reversed = " + reversed);
  }

  static void checkPalindrome(String str) {

    String reversed = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }

    if (str.equals(reversed))
      System.out.println("Palindrome");
    else
      System.out.println("Not Palindrome");
  }

  static void countVowels(String str) {

    int count = 0;

    for (char ch : str.toCharArray()) {

      if ("aeiouAEIOU".indexOf(ch) != -1) {
        count++;
      }
    }

    System.out.println("Vowel Count = " + count);
  }
}