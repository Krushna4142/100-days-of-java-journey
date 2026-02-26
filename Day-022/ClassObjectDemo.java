// Day 022 - Class & Object

class Car {

  // Instance variables (attributes)
  String brand;
  String model;
  int year;

  // Method (behavior)
  void displayCarInfo() {
    System.out.println("Brand : " + brand);
    System.out.println("Model : " + model);
    System.out.println("Year  : " + year);
    System.out.println("---------------------------");
  }
}

public class ClassObjectDemo {

  public static void main(String[] args) {

    // Creating first object
    Car car1 = new Car();
    car1.brand = "Toyota";
    car1.model = "Camry";
    car1.year = 2022;

    // Creating second object
    Car car2 = new Car();
    car2.brand = "Tesla";
    car2.model = "Model 3";
    car2.year = 2024;

    // Calling methods using objects
    car1.displayCarInfo();
    car2.displayCarInfo();
  }
}