public class Student {

  private int id;
  private String name;
  private int age;

  // Constructor
  public Student(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // Display student details
  public void displayStudent() {
    System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
  }
}