// Day 023 - Inheritance

// Parent class
class Vehicle {

    String brand;
    int speed;

    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Child class
class Car extends Vehicle {

    int numberOfDoors;

    void displayCarInfo() {
        System.out.println("Brand          : " + brand);
        System.out.println("Speed          : " + speed + " km/h");
        System.out.println("Number ofDoors : " + numberOfDoors);
        System.out.println("-------------------------------");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        // Creating object of child class
        Car car = new Car();

        // Accessing parent class variables
        car.brand = "Toyota";
        car.speed = 180;

        // Accessing child class variable
        car.numberOfDoors = 4;

        // Calling parent class methods
        car.start();

        // Calling child class method
        car.displayCarInfo();

        car.stop();
    }
}