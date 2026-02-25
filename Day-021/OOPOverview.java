// Day 021 - OOP Concepts Overview

class Student {

  // Attributes (Data)
  int id;
  String name;

  // Method (Behavior)
  void displayDetails() {
    System.out.println("Student ID   : " + id);
    System.out.println("Student Name : " + name);
    System.out.println("---------------------------");
  }
}

public class OOPOverview {

  public static void main(String[] args) {

    // Creating first object
    Student s1 = new Student();
    s1.id = 101;
    s1.name = "Krushna";

    // Creating second object
    Student s2 = new Student();
    s2.id = 102;
    s2.name = "Rahul";

    // Calling methods
    s1.displayDetails();
    s2.displayDetails();
  }
}