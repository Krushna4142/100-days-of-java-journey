# 🧠 Day 023 — Inheritance Notes

## 🔹 What is Inheritance?

Inheritance is a mechanism in which one class **acquires the properties and methods** of another class.

It helps in:

- Code reusability
- Reducing duplication
- Creating logical hierarchy

---

## 🔹 Key Terminology

### Parent Class / Superclass

The class whose properties are inherited.

### Child Class / Subclass

The class that inherits from another class.

---

## 🔹 Syntax

```java
class Child extends Parent {
}
```

🔹 IS-A Relationship

Inheritance represents an IS-A relationship.

Example:

Car IS-A Vehicle

Dog IS-A Animal

## 🔹 Why Use Inheritance?

Avoid rewriting common code

Improve maintainability

Promote code reuse

Create structured and hierarchical programs

## 🔹 What Child Class Inherits?

✔ Variables
✔ Methods

❌ Constructors are not inherited

❌ Private members are not directly accessible

## 🔹 Types of Inheritance in Java

1️⃣ Single Inheritance

One child → one parent

2️⃣ Multilevel Inheritance

Grandparent → Parent → Child

3️⃣ Hierarchical Inheritance

Multiple children → one parent

❌ Multiple Inheritance (Not supported with classes)

Java does not support multiple inheritance using classes
to avoid ambiguity.

## 🔹 Memory Concept

Parent class members are loaded first

Child class gets access to parent members

Child object contains both parent and child data

## 🔹 Method Reusability

Child class can directly use parent methods:

car.start();

This avoids rewriting the same logic.

## 🔹 Real-World Example

Parent → Employee

Common properties:

id

name

salary

Child → Developer

Extra properties:

programmingLanguage

Child automatically gets all parent features.

## 🔹 Advantages of Inheritance

Code reusability

Method overriding (runtime polymorphism)

Better organization

Easier maintenance

## 🔹 Important Observations

Common code should always be placed in parent class

Inheritance creates a strong relationship between classes

It is the base for polymorphism

## 🔹 Interview Tips

Inheritance → IS-A relationship

extends keyword is used

Java does not support multiple inheritance with classes

Private members are not directly accessible

Constructors are not inherited
