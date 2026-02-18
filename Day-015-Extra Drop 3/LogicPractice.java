import java.util.Scanner;

public class LogicPractice {

  // 🔢 Reverse a Number
  static int reverseNumber(int number) {
    int reversed = 0;

    while (number != 0) {
      int digit = number % 10;
      reversed = reversed * 10 + digit;
      number = number / 10;
    }

    return reversed;
  }

  // 🔢 Check Palindrome Number
  static boolean isPalindromeNumber(int number) {
    return number == reverseNumber(number);
  }

  // 🔢 Armstrong Number (3-digit)
  static boolean isArmstrong(int number) {
    int original = number;
    int sum = 0;

    while (number != 0) {
      int digit = number % 10;
      sum += digit * digit * digit;
      number = number / 10;
    }

    return sum == original;
  }

  // 🔢 Count Digits
  static int countDigits(int number) {
    int count = 0;

    while (number != 0) {
      number = number / 10;
      count++;
    }

    return count;
  }

  // 🔤 Reverse String
  static String reverseString(String str) {
    String reversed = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }

    return reversed;
  }

  // 🔤 Check Palindrome String
  static boolean isPalindromeString(String str) {
    return str.equals(reverseString(str));
  }

  // 🔤 Count Vowels
  static int countVowels(String str) {
    int count = 0;
    str = str.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch == 'a' || ch == 'e' || ch == 'i' ||
          ch == 'o' || ch == 'u') {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 🔢 Number Logic
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("Reversed Number: " + reverseNumber(num));
    System.out.println("Is Palindrome Number? " + isPalindromeNumber(num));
    System.out.println("Is Armstrong Number? " + isArmstrong(num));
    System.out.println("Digit Count: " + countDigits(num));

    sc.nextLine(); // clear buffer

    // 🔤 String Logic
    System.out.print("\nEnter a string: ");
    String input = sc.nextLine();

    System.out.println("Reversed String: " + reverseString(input));
    System.out.println("Is Palindrome String? " + isPalindromeString(input));
    System.out.println("Vowel Count: " + countVowels(input));

    sc.close();
  }
}