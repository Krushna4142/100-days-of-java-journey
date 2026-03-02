
abstract class Animal {

  Animal() {
    System.out.println("Animal constructor called");
  }

  abstract void sound();

  void sleep() {
    System.out.println("Animal is sleeping");
  }
}

class Dog extends Animal {

  @Override
  void sound() {
    System.out.println("Dog barks");
  }
}

public class AbstractionDemo {

  public static void main(String[] args) {
    Dog d = new Dog();
    d.sound();
    d.sleep();
  }
}