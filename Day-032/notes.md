# 🧠 Day 032 – ArrayList with Custom Objects

## 📌 Introduction

In this topic, we used **ArrayList with custom objects** instead of simple data types.

This helps in storing **structured and real-world data**.

---

# 🔹 Why Use Custom Objects?

Primitive values store only one piece of data.

Example:

int id = 101;

But real-world data needs multiple fields:

- ID
- Name
- Age

So we create a **class (Student)** to represent it.

---

# 🔹 ArrayList with Objects

Syntax:

```java
ArrayList<Student> students = new ArrayList<>();

Each element in the list is a Student object.

🔹 Operations Performed
Add Object
students.add(new Student(101, "Krushna", 21));
Display Objects
for(Student s : students){
    s.display();
}
Search Object

Loop through list and match ID.

Remove Object

Find object and remove it using:

students.remove(s);
🔹 Key Concepts Used
Classes and Objects
Constructors
Encapsulation
ArrayList (Collections)
Loops
🔹 Real-World Use

This concept is used in:

Student Management Systems
Banking Systems
E-commerce Applications
Backend APIs
🔹 Important Observations
Collections + Objects = Powerful combination
Helps in building scalable applications
Improves code structure and readability
🚀 Learning Outcome

After this topic I can:

✔ Store objects in ArrayList
✔ Manage structured data
✔ Perform CRUD operations (Add, Search, Delete)
✔ Build small real-world systems

This is a major step toward real Java development.
```
