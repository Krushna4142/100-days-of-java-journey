<div align="center">

# 📅 Day 034 — LinkedList in Java

### Understanding Doubly Linked Lists in the Java Collections Framework

<img src="https://img.shields.io/badge/Day-34-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-LinkedList%20%26%20Collections-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🛠️ What I Practiced](#️-what-i-practiced)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Understanding LinkedList](#-understanding-linkedlist)
- [💻 Code Implementation](#-code-implementation)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation (Day 34 Level)](#-interview-preparation-day-34-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 034** was to understand how **LinkedList** works in Java and learn when it is a better choice than **ArrayList**.

This day focused on:

- Understanding LinkedList structure
- Learning common LinkedList operations
- Comparing LinkedList with ArrayList
- Identifying real-world use cases

---

## 🧠 Concepts Practiced

### Java Collections Framework

- List Interface
- LinkedList Class

### LinkedList Operations

- Creating a LinkedList
- Adding elements
- Accessing elements
- Updating elements
- Removing elements
- Traversing the list

### Performance Comparison

- Insertion
- Deletion
- Memory usage
- Access time

---

## 🛠️ What I Practiced

Today I implemented programs that demonstrate:

- Creating a LinkedList
- Adding elements at different positions
- Updating values
- Removing elements
- Iterating through the LinkedList

The goal was to understand how LinkedList behaves differently from ArrayList.

---

## 📁 Folder Structure

Day-034/  
├─ README.md  
├─ LinkedListDemo.java  
└─ notes.md

---

## 🧩 Understanding LinkedList

A **LinkedList** is a linear data structure where each element (node) contains:

- Data
- Reference to the next node
- Reference to the previous node (Doubly LinkedList)

Unlike ArrayList, LinkedList **does not store elements in contiguous memory locations**.

This makes insertion and deletion operations more efficient.

---

## 💻 Code Implementation

### ✔ LinkedList Demonstration Program

The program demonstrates:

- Creating a LinkedList
- Adding elements
- Removing elements
- Updating elements
- Iterating through the list

📄 **Java Source File:**  
👉 [LinkedListDemo.java](./LinkedListDemo.java)

---

## 📝 Notes & Observations

- LinkedList performs well for frequent insertions and deletions.
- Random access is slower than ArrayList.
- Java's LinkedList implements both the **List** and **Deque** interfaces.
- Choosing the right collection improves application performance.

---

## 💡 Key Takeaways

- LinkedList stores elements as connected nodes.
- Better for insertion and deletion operations.
- ArrayList is faster for accessing elements by index.
- Understanding collection selection is important for efficient programming.

---

## 🎯 Interview Preparation (Day 34 Level)

**Q1. What is LinkedList in Java?**  
LinkedList is a class in the Java Collections Framework that stores elements as linked nodes.

**Q2. What is the difference between ArrayList and LinkedList?**  
ArrayList uses a dynamic array, while LinkedList uses linked nodes. ArrayList provides faster random access, whereas LinkedList provides faster insertion and deletion.

**Q3. Which package contains LinkedList?**  
`java.util`

**Q4. When should you use LinkedList?**  
When the application frequently inserts or deletes elements from the beginning or middle of the collection.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 **Day 035 – Stack & Queue using Collections**

Next, I will:

- Learn Stack operations
- Learn Queue operations
- Compare Stack and Queue
- Understand LIFO vs FIFO

<br/>

[➡️ Go to Day 035](../Day-035/README.md)

</div>

---
