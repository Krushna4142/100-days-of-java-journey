# 🧠 Day 021 — OOP Concepts Overview Notes

## 🔹 What is OOP?

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of **objects**.

An object contains:

- Data (variables)
- Behavior (methods)

OOP helps in structuring programs in a way that is:

- Modular
- Reusable
- Scalable
- Easy to maintain

---

## 🔹 Procedural vs Object-Oriented

### Procedural Programming

- Focus on functions
- Data is shared
- Hard to manage in large applications

### Object-Oriented Programming

- Focus on objects
- Data + methods together
- More secure and structured

---

## 🔹 Class

A class is a **blueprint** for creating objects.

It defines:

- Variables → attributes
- Methods → behaviors

Example:

```java
class Student {
    int id;
    String name;
}
🔹 Object

An object is an instance of a class.

It represents a real-world entity.

Example:

Student s1 = new Student();
🔹 Four Pillars of OOP
1️⃣ Encapsulation

Wrapping data and methods together

Achieved using private variables and getters/setters

Provides data security

2️⃣ Inheritance

One class acquires properties of another class

Promotes code reusability

3️⃣ Polymorphism

One name, many forms

Method overloading

Method overriding

4️⃣ Abstraction

Hiding implementation details

Showing only essential features

Achieved using abstract classes and interfaces

🔹 Why OOP is Important?

Models real-world entities

Makes code reusable

Reduces duplication

Improves maintainability

Used in all large-scale applications

🔹 Real-World Example

Class → Car

Attributes:

color

model

Methods:

start()

stop()

Object:

BMW

Audi

🔹 Key Observations

OOP is about design thinking

Proper class planning makes code clean

Objects interact with each other

This is the foundation of backend development

🔹 Interview Tips

Always explain OOP using real-world examples

Remember the 4 pillars definition

Know difference between class and object
```
