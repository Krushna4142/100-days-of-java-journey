// Custom Exception Class
class InvalidAgeException extends Exception {

  public InvalidAgeException(String message) {
    super(message);
  }
}

public class CustomExceptionDemo {

  static void checkAge(int age) throws InvalidAgeException {

    if (age < 18) {
      throw new InvalidAgeException("Age must be 18 or above.");
    } else {
      System.out.println("You are eligible to vote.");
    }
  }

  public static void main(String[] args) {

    try {
      checkAge(16);
    } catch (InvalidAgeException e) {
      System.out.println("Exception caught: " + e.getMessage());
    }

    System.out.println("Program ended.");
  }
}