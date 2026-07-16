<div align="center">

# 📅 Day 035 — HashSet in Java

### Understanding Unique Collections in the Java Collections Framework

<img src="https://img.shields.io/badge/Day-35-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-HashSet%20%26%20Collections-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🛠️ What I Practiced](#️-what-i-practiced)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Understanding HashSet](#-understanding-hashset)
- [💻 Code Implementation](#-code-implementation)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation (Day 35 Level)](#-interview-preparation-day-35-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 035** was to understand how **HashSet** stores **unique elements** and how it differs from other collection classes like **ArrayList** and **LinkedList**.

This day focused on:

- Learning the Set interface
- Understanding uniqueness of elements
- Exploring common HashSet operations
- Comparing HashSet with List collections

---

## 🧠 Concepts Practiced

### Java Collections Framework

- Set Interface
- HashSet Class

### HashSet Operations

- Creating a HashSet
- Adding elements
- Removing elements
- Searching elements
- Iterating through HashSet

### Collection Characteristics

- Unique elements
- No indexing
- Unordered storage

---

## 🛠️ What I Practiced

Today I implemented programs that demonstrate:

- Creating a HashSet
- Adding duplicate values
- Checking uniqueness
- Removing elements
- Iterating through the collection

The goal was to understand how HashSet automatically prevents duplicate entries.

---

## 📁 Folder Structure

Day-035/  
├─ README.md  
├─ HashSetDemo.java  
└─ notes.md

---

## 🧩 Understanding HashSet

A **HashSet** is a collection that stores **only unique elements**.

Unlike ArrayList:

- Duplicate values are not allowed.
- Elements are not stored in insertion order.
- There is no indexing.

HashSet is internally based on a **HashMap** for fast insertion and lookup.

---

## 💻 Code Implementation

### ✔ HashSet Demonstration Program

The program demonstrates:

- Creating a HashSet
- Adding elements
- Ignoring duplicate values
- Removing elements
- Searching elements
- Iterating through the collection

📄 **Java Source File:**  
👉 [HashSetDemo.java](./HashSetDemo.java)

---

## 📝 Notes & Observations

- HashSet automatically removes duplicate entries.
- Elements are stored in an unordered manner.
- Searching is very efficient.
- Useful when uniqueness is required.

Understanding HashSet is important before learning **TreeSet** and **Map collections**.

---

## 💡 Key Takeaways

- HashSet stores only unique values.
- Duplicate elements are ignored.
- No indexing is available.
- Fast insertion, deletion, and searching.

---

## 🎯 Interview Preparation (Day 35 Level)

**Q1. What is HashSet in Java?**  
HashSet is a class that implements the Set interface and stores unique elements.

**Q2. Does HashSet allow duplicate elements?**  
No. Duplicate values are automatically ignored.

**Q3. Does HashSet maintain insertion order?**  
No. The order of elements is not guaranteed.

**Q4. Which package contains HashSet?**  
`java.util`

---

## ⏭️ What’s Next?

<div align="center">

### 👉 **Day 036 – HashMap in Java**

Next, I will:

- Learn key-value pair storage
- Explore HashMap operations
- Understand map-based collections
- Compare HashMap with HashSet

<br/>

[➡️ Go to Day 036](../Day-036/README.md)

</div>

---
