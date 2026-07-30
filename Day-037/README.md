<div align="center">

# 📅 Day 037 — HashMap with Custom Objects

### Storing and Managing Real-World Objects Using Key-Value Pairs

<img src="https://img.shields.io/badge/Day-37-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-HashMap%20%26%20Custom%20Objects-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🛠️ What I Practiced](#️-what-i-practiced)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Understanding the Concept](#-understanding-the-concept)
- [💻 Code Implementation](#-code-implementation)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation (Day 37 Level)](#-interview-preparation-day-37-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 037** was to understand how a `HashMap` can store **custom Java objects** as values.

Instead of storing simple values like `String` or `Integer`, I practiced storing objects created from my own class.

---

## 🧠 Concepts Practiced

### HashMap

- Key-value pair storage
- Unique keys
- `put()` and `get()`
- Iterating through entries

### Custom Objects

- Creating a custom class
- Creating objects
- Storing objects inside a HashMap
- Accessing object data using methods

---

## 🛠️ What I Practiced

I created a simple custom class and used a `HashMap` to store multiple objects.

For example:

```text
Student ID → Student Object
```

This makes HashMap more useful for real applications because the value can contain multiple pieces of information.

---

## 📁 Folder Structure

Day-037/  
├─ README.md  
├─ Student.java  
├─ HashMapCustomObjectDemo.java  
└─ notes.md

---

## 🧩 Understanding the Concept

A HashMap doesn't only have to store simple values.

For example:

```java
HashMap<Integer, Student> students = new HashMap<>();
```

Here:

- `Integer` → Student ID
- `Student` → Custom object

So one key can point to an object containing details like:

- Name
- Age
- Course

This is closer to how data is represented in real applications.

---

## 💻 Code Implementation

### ✔ HashMap with Custom Student Objects

The program demonstrates:

- Creating a `Student` class
- Creating Student objects
- Storing them in HashMap
- Accessing objects using their ID
- Displaying student information

📄 **Java Source Files:**

👉 [Student.java](./Student.java)

👉 [HashMapCustomObjectDemo.java](./HashMapCustomObjectDemo.java)

---

## 📝 Notes & Observations

- HashMap can store complete objects as values.
- The key can be used as a unique identifier.
- Custom objects make collections more useful.
- This approach is commonly used in real-world applications.

---

## 💡 Key Takeaways

- HashMap works with custom classes.
- Objects can be stored as values.
- Keys can represent unique IDs.
- Collections become more powerful when combined with OOP.

---

## 🎯 Interview Preparation (Day 37 Level)

**Q1. Can HashMap store custom objects?**  
Yes. A custom object can be used as a key or value in a HashMap.

**Q2. Why use custom objects with HashMap?**  
It allows us to store multiple related properties together.

**Q3. Can a HashMap have duplicate keys?**  
No. Each key must be unique.

**Q4. Can HashMap values be duplicate?**  
Yes. Multiple keys can point to objects with the same data.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 **Day 038 – TreeMap**

Next, I will:

- Learn how TreeMap stores key-value pairs
- Understand sorted keys
- Compare TreeMap with HashMap

<br/>

[➡️ Go to Day 038](../Day-038/README.md)

</div>

---
