<div align="center">

# 📅 Day 036 — HashMap Basics

### Understanding Key-Value Pair Storage in Java Collections

<img src="https://img.shields.io/badge/Day-36-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-HashMap%20Basics-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🛠️ What I Practiced](#️-what-i-practiced)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Understanding HashMap](#-understanding-hashmap)
- [💻 Code Implementation](#-code-implementation)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation (Day 36 Level)](#-interview-preparation-day-36-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 036** was to understand how **HashMap** stores data using **key-value pairs** and why it is one of the most widely used collection classes in Java.

This day focused on:

- Understanding the Map interface
- Learning key-value pair storage
- Performing common HashMap operations
- Exploring real-world use cases

---

## 🧠 Concepts Practiced

### Java Collections Framework

- Map Interface
- HashMap Class

### HashMap Operations

- Creating a HashMap
- Adding key-value pairs
- Updating values
- Removing entries
- Searching by key
- Iterating through entries

### Collection Characteristics

- Unique keys
- Duplicate values allowed
- Fast lookup using keys

---

## 🛠️ What I Practiced

Today I implemented programs that demonstrate:

- Creating a HashMap
- Inserting data using `put()`
- Retrieving values using `get()`
- Updating existing entries
- Removing entries
- Iterating through keys and values

The goal was to understand how HashMap efficiently manages data using unique keys.

---

## 📁 Folder Structure

Day-036/  
├─ README.md  
├─ HashMapDemo.java  
└─ notes.md

---

## 🧩 Understanding HashMap

A **HashMap** is a class in the Java Collections Framework that stores data as **key-value pairs**.

Each key is unique, while multiple keys can have the same value.

Example:

```text
101 → Krushna
102 → Rahul
103 → Priya
```

HashMap is ideal when data needs to be retrieved quickly using a unique identifier.

---

## 💻 Code Implementation

### ✔ HashMap Demonstration Program

The program demonstrates:

- Creating a HashMap
- Adding key-value pairs
- Updating values
- Removing entries
- Searching using keys
- Iterating through the map

📄 **Java Source File:**  
👉 [HashMapDemo.java](./HashMapDemo.java)

---

## 📝 Notes & Observations

- HashMap stores data in key-value pairs.
- Keys must be unique.
- Values can be duplicated.
- Lookup operations are very fast.
- HashMap does not maintain insertion order.

Understanding HashMap is essential before learning advanced Map implementations such as TreeMap and LinkedHashMap.

---

## 💡 Key Takeaways

- HashMap stores data using keys and values.
- Duplicate keys are not allowed.
- Duplicate values are allowed.
- Retrieval using keys is very efficient.
- One of the most commonly used classes in Java development.

---

## 🎯 Interview Preparation (Day 36 Level)

**Q1. What is HashMap in Java?**  
HashMap is a class that implements the Map interface and stores data as key-value pairs.

**Q2. Can HashMap have duplicate keys?**  
No. Keys must always be unique.

**Q3. Can HashMap have duplicate values?**  
Yes. Multiple keys can store the same value.

**Q4. Does HashMap maintain insertion order?**  
No. HashMap does not guarantee insertion order.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 **Day 037 – TreeMap**

Next, I will:

- Learn sorted key-value storage
- Compare TreeMap with HashMap
- Understand natural ordering
- Explore Map implementations

<br/>

[➡️ Go to Day 037](../Day-037/README.md)

</div>

---
