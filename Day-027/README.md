<div align="center">

# 📅 Day 027 — Exception Handling

### Writing Robust and Error-Resilient Java Programs

<img src="https://img.shields.io/badge/Day-27-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Exception%20Handling-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🛠️ What I Practiced](#️-what-i-practiced)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Understanding Exception Handling](#-understanding-exception-handling)
- [💻 Code Implementation](#-code-implementation)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation (Day 27 Level)](#-interview-preparation-day-27-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 027** was to understand how Java handles runtime errors and how to:

- Prevent program crashes
- Handle exceptions gracefully
- Write stable and production-ready code

Exception handling is essential for building **robust applications**.

---

## 🧠 Concepts Practiced

### Core Concepts

- What is an exception?
- Difference between error and exception
- Checked vs Unchecked exceptions
- Exception hierarchy

### Exception Handling Keywords

- `try`
- `catch`
- `finally`
- `throw`
- `throws`

### Advanced Concepts

- Multiple catch blocks
- Custom exceptions
- Stack trace understanding

---

## 🛠️ What I Practiced

- Handling runtime exceptions using try-catch
- Using multiple catch blocks
- Implementing finally block
- Creating and throwing custom exceptions
- Understanding exception propagation

The focus was on writing **safe and maintainable code**.

---

## 📁 Folder Structure

Day-027/  
├─ README.md  
├─ TryCatchDemo.java  
├─ MultipleCatchDemo.java  
├─ CustomExceptionDemo.java  
└─ notes.md

---

## 🧩 Understanding Exception Handling

An exception is:

- An event that disrupts normal program flow
- Occurs during runtime

Java provides:

- A built-in exception hierarchy
- Structured handling using try-catch blocks

Proper exception handling:

- Prevents abrupt termination
- Improves user experience
- Helps debugging

---

## 💻 Code Implementation

### ✔ Try-Catch Demo

- Handling arithmetic exception
- Preventing program crash

### ✔ Multiple Catch Demo

- Handling different exception types

### ✔ Custom Exception Demo

- Creating user-defined exception
- Using throw keyword

📄 **Java Source Files:**  
👉 [TryCatchDemo.java](./TryCatchDemo.java)  
👉 [MultipleCatchDemo.java](./MultipleCatchDemo.java)  
👉 [CustomExceptionDemo.java](./CustomExceptionDemo.java)

---

## 📝 Notes & Observations

- Exception handling improves reliability
- Checked exceptions must be handled or declared
- finally block always executes
- Custom exceptions improve clarity
- Never ignore exceptions silently

---

## 💡 Key Takeaways

- Exceptions prevent sudden program failure
- try-catch ensures smooth execution
- finally is used for cleanup
- throw is used to create exceptions
- throws declares exception responsibility

---

## 🎯 Interview Preparation (Day 27 Level)

**Q1. What is the difference between checked and unchecked exceptions?**  
Checked exceptions are checked at compile time, while unchecked exceptions occur at runtime.

**Q2. What is the purpose of finally block?**  
It executes whether an exception occurs or not.

**Q3. Can we have multiple catch blocks?**  
Yes, to handle different types of exceptions.

**Q4. What is exception propagation?**  
When an exception is passed up the call stack to be handled.

**Q5. Why create custom exceptions?**  
To provide meaningful error handling specific to business logic.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 **Day 028 – Collections Framework Basics**

Next, I will:

- Learn about List, Set, and Map
- Understand ArrayList and LinkedList
- Explore basic collection operations
- Strengthen Java data structure knowledge

<br/>

[➡️ Go to Day 028](../Day-028/README.md)

</div>

---
