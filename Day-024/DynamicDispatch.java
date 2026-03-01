class Animal {
  void sound() {
    System.out.println("Animal makes a sound");
  }
}

class Cat extends Animal {
  @Override
  void sound() {
    System.out.println("Cat meows");
  }
}

class Cow extends Animal {
  @Override
  void sound() {
    System.out.println("Cow moos");
  }
}

public class DynamicDispatch {
  public static void main(String[] args) {

    Animal obj;

    obj = new Cat(); // Upcasting
    obj.sound();

    obj = new Cow(); // Upcasting
    obj.sound();
  }
}