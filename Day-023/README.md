<div align="center">

# 📅 Day 023 — Inheritance

### Achieving Code Reusability Using Parent–Child Relationship

<img src="https://img.shields.io/badge/Day-23-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Intermediate-yellow?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Inheritance-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🛠️ What I Practiced](#️-what-i-practiced)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Understanding Inheritance](#-understanding-inheritance)
- [💻 Code Implementation](#-code-implementation)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation (Day 23 Level)](#-interview-preparation-day-23-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 023** was to understand how **inheritance enables code reusability** and how a **child class can access the properties and behaviors of a parent class**.

This day focused on:

- Creating parent and child classes
- Using the `extends` keyword
- Reusing existing code
- Establishing an **IS-A relationship**

---

## 🧠 Concepts Practiced

### Core Inheritance Concepts

- Parent class (Superclass)
- Child class (Subclass)
- `extends` keyword
- Method inheritance
- Variable inheritance

### Types of Inheritance in Java

- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance

_(Multiple inheritance is not supported with classes in Java)_

---

## 🛠️ What I Practiced

- Created a parent class with common properties
- Created a child class that inherits from the parent
- Accessed parent class members using child object
- Observed how code duplication is reduced

This demonstrated how **Java supports real-world hierarchical relationships**.

---

## 📁 Folder Structure

Day-023/  
├─ README.md  
├─ InheritanceDemo.java  
└─ notes.md

---

## 🧩 Understanding Inheritance

Inheritance allows one class to **acquire the properties and methods of another class**.

### 🔹 Syntax

```java
class Child extends Parent {
}

```

🔹 Real-World Example

Parent → Vehicle
Child → Car

Car IS-A Vehicle.

So the Car class automatically gets:

Speed

Fuel type

Start method

This improves:

Reusability

Maintainability

Code organization

## 💻 Code Implementation

✔ Inheritance Demo Program

The program demonstrates:

Parent class creation

Child class inheriting parent

Accessing inherited members

Adding child-specific behavior

## 📄 Java Source File:

👉 InheritanceDemo.java

## 📝 Notes & Observations

Inheritance represents an IS-A relationship

Child class can use parent class methods directly

Common code should always be placed in parent class

It reduces redundancy and improves clarity

Forms the base for polymorphism

## 💡 Key Takeaways

Inheritance promotes code reusability

extends is used to inherit a class

Java supports single, multilevel, and hierarchical inheritance

Proper class hierarchy is important for clean design

Real-world systems heavily use inheritance

## 🎯 Interview Preparation (Day 23 Level)

Q1. What is inheritance in Java?
Inheritance is the mechanism by which one class acquires the properties and methods of another class.

Q2. Which keyword is used for inheritance?
extends

Q3. What is an IS-A relationship?
It represents inheritance. Example: Dog IS-A Animal.

Q4. Does Java support multiple inheritance?
No, Java does not support multiple inheritance with classes.

Q5. Why is inheritance used?
To achieve code reusability and establish relationships between classes.

## ⏭️ What’s Next?

<div align="center">
👉 Day 024 – Polymorphism

Next, I will:

Understand method overloading and method overriding

Learn compile-time vs runtime polymorphism

See how one interface can behave in multiple ways

<br/>

[➡️ Go to Day 024](#-Day-024/README.md)

</div>
```
