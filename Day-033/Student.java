
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

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Display method
  public void displayStudent() {
    System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
  }
}