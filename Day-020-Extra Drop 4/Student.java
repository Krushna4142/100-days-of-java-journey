public class Student {

  private int rollNumber;
  private String name;
  private int marks;

  public Student(int rollNumber, String name, int marks) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.marks = marks;
  }

  public int getRollNumber() {
    return rollNumber;
  }

  public String getName() {
    return name;
  }

  public int getMarks() {
    return marks;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  public void displayStudent() {
    System.out.println("Roll No : " + rollNumber);
    System.out.println("Name    : " + name);
    System.out.println("Marks   : " + marks);
    System.out.println("---------------------------");
  }
}