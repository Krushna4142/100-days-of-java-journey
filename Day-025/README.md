<div align="center">

# 📅 Day 025 — Abstraction & Interfaces

### Designing Contracts and Hiding Implementation

<img src="https://img.shields.io/badge/Day-25-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Abstraction%20%26%20Interfaces-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🛠️ What I Practiced](#️-what-i-practiced)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Understanding Abstraction & Interfaces](#-understanding-abstraction--interfaces)
- [💻 Code Implementation](#-code-implementation)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation (Day 25 Level)](#-interview-preparation-day-25-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 025** was to understand how to **hide implementation details** and expose only **essential behavior** using:

- Abstract classes
- Interfaces

This is a major step toward writing **scalable and loosely coupled Java applications**.

---

## 🧠 Concepts Practiced

### Abstraction

- Abstract classes and abstract methods
- Constructors in abstract classes
- Concrete methods inside abstract classes
- Achieving partial abstraction

### Interfaces

- Defining interfaces
- Implementing interfaces
- Multiple inheritance using interfaces
- Default methods
- Static methods

### Design Perspective

- Contract-based programming
- Loose coupling
- Code flexibility and extensibility

---

## 🛠️ What I Practiced

- Creating an **abstract class** with both abstract and concrete methods
- Implementing abstraction using **real-world examples**
- Designing and implementing **interfaces**
- Achieving **multiple inheritance** using interfaces
- Understanding when to use abstract class vs interface

The focus was on **design thinking**, not just syntax.

---

## 📁 Folder Structure

Day-025/  
├─ README.md  
├─ AbstractionDemo.java  
├─ InterfaceDemo.java  
├─ MultipleInheritanceDemo.java  
└─ notes.md

---

## 🧩 Understanding Abstraction & Interfaces

Abstraction helps in:

- Hiding internal implementation
- Showing only required functionality
- Improving maintainability

Abstract class is used when:

- Classes share a strong relationship
- Some common behavior should be reused

Interface is used when:

- Only a contract is required
- Multiple inheritance is needed
- Loose coupling is a priority

This is the foundation of:

- System design
- Framework architecture
- Clean code practices

---

## 💻 Code Implementation

### ✔ Abstraction Demo

- Abstract class with abstract & concrete methods
- Child class providing implementation

### ✔ Interface Implementation

- Interface definition
- Class implementing interface
- Runtime polymorphism

### ✔ Multiple Inheritance Demo

- One class implementing multiple interfaces

📄 **Java Source Files:**  
👉 [AbstractionDemo.java](./AbstractionDemo.java)  
👉 [InterfaceDemo.java](./InterfaceDemo.java)  
👉 [MultipleInheritanceDemo.java](./MultipleInheritanceDemo.java)

---

## 📝 Notes & Observations

- Abstraction focuses on **what to do**, not **how to do**
- Interfaces provide full design flexibility
- Default methods help in backward compatibility
- Abstract class vs interface is a common interview topic
- These concepts are heavily used in real-world projects and frameworks

---

## 💡 Key Takeaways

- Abstraction improves scalability
- Interfaces enable multiple inheritance
- Loose coupling makes systems flexible
- Design matters more than implementation
- These concepts are core to writing production-level Java code

---

## 🎯 Interview Preparation (Day 25 Level)

**Q1. What is abstraction?**  
Abstraction is the process of hiding implementation details and showing only essential functionality.

**Q2. Difference between abstract class and interface?**  
Abstract class can have constructors and concrete methods, while interface defines a contract and supports multiple inheritance.

**Q3. Can an abstract class have a constructor?**  
Yes, it is used to initialize common data.

**Q4. Why are interfaces important?**  
They provide loose coupling and allow multiple inheritance.

**Q5. What is a default method in an interface?**  
A method with a body inside an interface introduced in Java 8 to maintain backward compatibility.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 **Day 026 – Encapsulation & Access Modifiers**

Next, I will:

- Learn data hiding using encapsulation
- Use getters and setters
- Understand access modifiers in detail
- Build secure and maintainable classes

<br/>

[➡️ Go to Day 026](../Day-026/README.md)

</div>

---
