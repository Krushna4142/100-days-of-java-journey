# 🧠 Day 033 – CRUD Operations using ArrayList

## 📌 Introduction

CRUD operations are the foundation of most software applications.

CRUD stands for:

- Create
- Read
- Update
- Delete

Today I implemented these operations using:

- ArrayList
- Custom Objects
- Java OOP concepts

---

# 🔹 Why CRUD is Important?

Most applications need data management.

Examples:

- Banking systems
- Student management systems
- E-commerce applications
- Hospital systems

CRUD operations allow applications to manage records efficiently.

---

# 🔹 Technologies Used

## ArrayList

Used for dynamic data storage.

Benefits:

- Dynamic resizing
- Easy insertion and deletion
- Built-in methods

---

## Custom Objects

A `Student` class was created to represent:

- ID
- Name
- Age

This improves code organization and readability.

---

# 🔹 CRUD Operations Explained

## 1️⃣ Create

Add new student records.

```java
students.add(new Student(id, name, age));
2️⃣ Read

Display all student records.

for(Student s : students){
    s.displayStudent();
}
3️⃣ Update

Search student by ID and modify details.

s.setName(newName);
s.setAge(newAge);
4️⃣ Delete

Remove student from ArrayList.

students.remove(s);
🔹 Concepts Practiced
ArrayList
Loops
Conditions
Encapsulation
Object handling
Search logic
🔹 Important Observation

CRUD operations are heavily used in:

Backend development
APIs
Database systems
Web applications

Understanding CRUD is an important step toward full-stack and backend development.

🚀 Learning Outcome

After this topic I can:

✔ Build CRUD-based console applications
✔ Manage records dynamically
✔ Combine OOP with collections
✔ Create simple data management systems

This topic moves learning closer to real-world application development.
```
