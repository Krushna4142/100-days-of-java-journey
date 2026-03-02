interface Vehicle {

  void start();

  default void fuelType() {
    System.out.println("Fuel type: Petrol/Diesel");
  }

  static void company() {
    System.out.println("Vehicle belongs to transport industry");
  }
}

class Car implements Vehicle {

  @Override
  public void start() {
    System.out.println("Car starts with key");
  }
}

public class InterfaceDemo {

  public static void main(String[] args) {

    Car c = new Car();
    c.start();
    c.fuelType();

    Vehicle.company();
  }
}