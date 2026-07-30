public class Student {

  private int id;
  private String name;
  private String course;

  public Student(int id, String name, String course) {
    this.id = id;
    this.name = name;
    this.course = course;
  }

  public void displayStudent() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Course: " + course);
    System.out.println("-------------------");
  }
}