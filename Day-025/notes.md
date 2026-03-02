# 🧠 Day 025 – Abstraction & Interfaces Notes

## 🔹 What is Abstraction?

Abstraction means:
➡️ Hiding implementation details  
➡️ Showing only essential functionality

It focuses on **what to do**, not **how to do**.

Example:
When we drive a car, we use the steering and pedals without knowing the internal engine working.

---

## 🔹 Ways to Achieve Abstraction in Java

1. Abstract class (0–100%)
2. Interface (100%)

---

## 🔹 Abstract Class

### Key Points

- Declared using `abstract` keyword
- Can have:
  - Abstract methods
  - Concrete methods
- Cannot be instantiated
- Can have constructors
- Supports single inheritance

### Syntax

```java
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}
🔹 Interface
Key Points

Blueprint of a class

Contains:

Abstract methods (by default)

Default methods

Static methods

Achieves 100% abstraction

Supports multiple inheritance

Variables are:
public static final by default

Syntax
interface Vehicle {
    void start();
}
🔹 Abstract Class vs Interface
Feature	Abstract Class	Interface
Constructor	✅ Yes	❌ No
Multiple Inheritance	❌ No	✅ Yes
Method Types	Abstract + Concrete	Abstract + Default + Static
Fields	Instance variables allowed	Only constants
🔹 When to Use What?
Use Abstract Class When:

Classes share a strong relationship

Code reuse is required

Use Interface When:

Only a contract is needed

Multiple inheritance is required

Loose coupling is required

🔹 Real-World Usage

Spring Framework

JDBC

Collections Framework

System Design

🔹 Interview Tips

✔ Interface supports multiple inheritance
✔ Abstract class can have constructor
✔ A class can implement multiple interfaces
✔ A class can extend only one abstract class

🚀 Key Takeaway

Abstraction helps in:

Writing flexible code

Reducing dependency

Designing scalable systems
```
