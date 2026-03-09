# 🎤 Day 029 – Mock Interview Questions (Core Java)

This file contains commonly asked **Core Java interview questions** used for revision and self-assessment.

---

# 🔹 Basic Java Questions

### 1. What is Java?

Java is a **high-level, object-oriented, platform-independent programming language** used to build applications.

---

### 2. Why is Java platform independent?

Java code is compiled into **bytecode**, which runs on the **Java Virtual Machine (JVM)**.  
This allows Java programs to run on any system with JVM.

---

### 3. What is JVM, JRE, and JDK?

| Component | Description                                    |
| --------- | ---------------------------------------------- |
| JVM       | Java Virtual Machine – runs Java bytecode      |
| JRE       | Java Runtime Environment – JVM + libraries     |
| JDK       | Java Development Kit – JRE + development tools |

---

# 🔹 OOP Questions

### 4. What are the four pillars of OOP?

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

### 5. What is Encapsulation?

Encapsulation is **wrapping data and methods into a single unit** and restricting direct access to data.

Example: Using **private variables with getters and setters**.

---

### 6. What is Inheritance?

Inheritance allows a class to **reuse properties and behavior from another class**.

Example:

```java
class Animal {}
class Dog extends Animal {}

```

7. What is Polymorphism?

Polymorphism means one object behaving in different ways.

Types:

Compile-time polymorphism (Method Overloading)

Runtime polymorphism (Method Overriding)

8. What is Abstraction?

Abstraction means hiding implementation details and showing only functionality.

Achieved using:

Abstract classes

Interfaces

🔹 Exception Handling 9. What is an Exception?

An exception is an event that disrupts the normal flow of a program during runtime.

10. Difference between Checked and Unchecked Exception
    Checked Unchecked
    Checked at compile time Occurs at runtime
    Must be handled Optional to handle
    Example: IOException Example: NullPointerException
11. What is finally block?

The finally block always executes, whether an exception occurs or not.

Used for:

Closing files

Database connections

Cleanup tasks

🔹 Collections Framework 12. What is Java Collections Framework?

A set of classes and interfaces used to store and manipulate groups of objects dynamically.

13. Difference between ArrayList and LinkedList
    ArrayList LinkedList
    Dynamic array Doubly linked list
    Faster for access Faster for insertion/deletion
14. Difference between List and Set
    List Set
    Allows duplicates No duplicates
    Maintains order Usually unordered
15. What is HashMap?

HashMap stores key-value pairs where:

Keys must be unique

Values can be duplicated

Example:

101 → Krushna
102 → Amit
🔹 Important Coding Questions

Practice explaining these problems:

Reverse a string

Find largest number in array

Check palindrome

Remove duplicates from array

Count vowels in string

🎯 Self-Evaluation

Ask yourself:

✔ Can I explain OOP clearly?
✔ Can I explain exception handling?
✔ Do I know when to use collections?
✔ Can I write small Java programs confidently?

If yes → You're improving as a Java developer 🚀

```

```
