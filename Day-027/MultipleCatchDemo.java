public class MultipleCatchDemo {

  public static void main(String[] args) {

    try {
      int[] arr = new int[3];
      arr[5] = 10; // ArrayIndexOutOfBoundsException

      int result = 10 / 0; // ArithmeticException
      System.out.println(result);

    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception occurred!");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index Out Of Bounds!");
    } catch (Exception e) {
      System.out.println("General Exception occurred!");
    }

    System.out.println("Program executed successfully.");
  }
}