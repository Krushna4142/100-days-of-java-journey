# 🧠 Day 022 — Class & Object Notes

## 🔹 What is a Class?

A class is a **blueprint or template** used to create objects.

It is a user-defined data type that groups:

- Variables → data (attributes)
- Methods → behavior (functions)

Example:

```java
class Car {
    String brand;
    String model;
}
```

🔹 What is an Object?

An object is an instance of a class.

It represents a real-world entity and contains:

Actual values

Ability to access class methods

Example:

Car car1 = new Car();
🔹 Key Components
1️⃣ Instance Variables

Declared inside class

Each object gets its own copy

Stored in heap memory

2️⃣ Methods

Define behavior of objects

Shared among all objects

🔹 How Object is Created?
Step 1: Declaration
Car car1;
Step 2: Instantiation
car1 = new Car();

OR

Car car1 = new Car();
🔹 Memory Representation

Object → stored in Heap memory

Reference variable → stored in Stack

Reference variable stores the address of the object

🔹 Accessing Object Members

Using dot (.) operator:

car1.brand = "Tesla";
car1.displayCarInfo();
🔹 Multiple Objects

We can create multiple objects from one class.

Each object:

Has separate data

Shares same method structure

🔹 Real-World Mapping

Class → Car
Objects →

Toyota

Tesla

BMW

Each has:

Different data

Same behavior

🔹 Why Class & Object is Important?

Enables real-world modeling

Makes code reusable

Provides modular structure

Foundation for inheritance and polymorphism

🔹 Common Mistakes

❌ Thinking class allocates memory
✔ Memory is allocated when object is created

❌ Confusing reference with object
✔ Reference stores address, object stores data

🔹 Interview Tips

Class → logical entity

Object → physical entity

Objects are stored in heap

One class → many objects

Each object has its own state
