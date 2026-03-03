class AccessModifiers {

  public int publicVar = 10;
  private int privateVar = 20;
  int defaultVar = 30;
  protected int protectedVar = 40;

  public void showPrivateVar() {
    System.out.println("Private Variable: " + privateVar);
  }
}

public class AccessModifierDemo {
  public static void main(String[] args) {

    AccessModifiers obj = new AccessModifiers();

    System.out.println("Public: " + obj.publicVar);
    System.out.println("Default: " + obj.defaultVar);
    System.out.println("Protected: " + obj.protectedVar);

    obj.showPrivateVar(); // accessing private via public method
  }
}