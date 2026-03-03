class Student {

  // private data members (data hiding)
  private String name;
  private int age;

  // Getter for name
  public String getName() {
    return name;
  }

  // Setter for name
  public void setName(String name) {
    this.name = name;
  }

  // Getter for age
  public int getAge() {
    return age;
  }

  // Setter for age with validation
  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    } else {
      System.out.println("Invalid age!");
    }
  }
}

public class EncapsulationDemo {
  public static void main(String[] args) {

    Student s1 = new Student();

    s1.setName("Krushna");
    s1.setAge(20);

    System.out.println("Name: " + s1.getName());
    System.out.println("Age: " + s1.getAge());
  }
}