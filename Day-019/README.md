<div align="center">

# 📅 Day 019 — Time & Space Complexity

### Understanding How Efficient an Algorithm Really Is

<img src="https://img.shields.io/badge/Day-19-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Conceptual-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Big%20O%20Analysis-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Learned](#-concepts-learned)
- [🛠️ What I Practiced](#️-what-i-practiced)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Why Time & Space Complexity Matters](#-why-time--space-complexity-matters)
- [📊 Types of Time Complexity](#-types-of-time-complexity)
- [💻 Code Examples](#-code-examples)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation (Day 019 Level)](#-interview-preparation-day-019-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 019** was to understand how to measure the efficiency of an algorithm using:

- Time Complexity
- Space Complexity
- Big-O Notation

This is a **core DSA concept** and one of the most frequently asked topics in interviews.

---

## 🧠 Concepts Learned

### Time Complexity

Time complexity represents how the execution time of an algorithm grows with input size.

It helps in:

- Comparing multiple approaches
- Choosing the optimal solution
- Writing scalable programs

---

### Space Complexity

Space complexity represents the amount of extra memory used by an algorithm.

It includes:

- Variables
- Data structures
- Function calls (recursion stack)

---

### Big-O Notation

Big-O describes the **worst-case scenario** of an algorithm.

Common Big-O values:

- O(1) → Constant time
- O(n) → Linear time
- O(log n) → Logarithmic time
- O(n²) → Quadratic time

---

## 🛠️ What I Practiced

- Calculating time complexity of loops
- Analyzing nested loops
- Understanding constant vs linear growth
- Writing simple examples for each Big-O case

The focus was on **thinking in terms of efficiency**, not just writing code.

---

## 📁 Folder Structure

Day-019/  
├─ README.md  
├─ TimeComplexityExamples.java  
└─ notes.md

---

## 🧩 Why Time & Space Complexity Matters

Two solutions may give the same output, but:

- One may take 1 second
- Another may take 1 hour

Complexity analysis helps us choose the better approach.

This becomes critical when working with:

- Large datasets
- Real-world applications
- Performance-sensitive systems

---

## 📊 Types of Time Complexity

### ✔ Constant Time – O(1)

Execution time does not depend on input size.

### ✔ Linear Time – O(n)

Time grows linearly with input size.

### ✔ Quadratic Time – O(n²)

Common in nested loops and simple sorting algorithms.

### ✔ Logarithmic Time – O(log n)

Used in Binary Search and divide-and-conquer algorithms.

---

## 💻 Code Examples

The code for today includes:

- O(1) example
- O(n) example
- O(n²) example
- O(log n) example

📄 **Java Source File:**  
👉 [TimeComplexityExamples.java](./TimeComplexityExamples.java)

---

## 📝 Notes & Observations

- Efficiency matters more than syntax in DSA
- Nested loops usually mean O(n²)
- Binary Search is fast because of O(log n)
- Constants are ignored in Big-O

---

## 💡 Key Takeaways

- Big-O measures scalability, not exact time
- Best, average, and worst cases are important
- Space complexity is also asked in interviews
- Writing optimal solutions is the real goal

---

## 🎯 Interview Preparation (Day 019 Level)

**Q1. What is time complexity?**  
Time complexity measures how the running time of an algorithm grows with input size.

**Q2. What is Big-O notation?**  
It represents the worst-case complexity of an algorithm.

**Q3. What is the time complexity of a single loop?**  
O(n)

**Q4. What is the time complexity of a nested loop?**  
O(n²)

**Q5. Why is O(log n) efficient?**  
Because the input size reduces by half in each step.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 **Day 020 – ArrayList in Java**

Next, I will:

- Learn dynamic arrays in Java
- Understand resizing mechanism
- Compare Array vs ArrayList
- Perform CRUD operations

<br/>

[➡️ Go to Day 020](../Day-020/README.md)

</div>

---
