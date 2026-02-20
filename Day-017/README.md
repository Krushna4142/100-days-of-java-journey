<div align="center">

# 📅 Day 017 — Searching (Linear & Binary Search)

### Understanding How Data is Found Efficiently

<img src="https://img.shields.io/badge/Day-17-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Easy--Medium-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Searching%20Algorithms-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🛠️ What I Built](#️-what-i-built)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Linear vs Binary Search](#-linear-vs-binary-search)
- [💻 Code Implementation](#-code-implementation)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation (Day 017 Level)](#-interview-preparation-day-017-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 017** was to understand how searching works and how performance improves using better algorithms.

This day focused on:

- Linear Search
- Binary Search
- Time complexity comparison
- Writing clean reusable methods

---

## 🧠 Concepts Practiced

### Linear Search

- Works on unsorted arrays
- Checks each element one by one
- Simple but slower

### Binary Search

- Works only on sorted arrays
- Uses divide and conquer
- Much faster than linear search

---

## 🛠️ What I Built

Implemented:

- Linear Search program
- Binary Search program
- Element existence check
- Index finding

Focus was on **logic clarity and clean code**.

---

## 📁 Folder Structure

Day-017/
├─ README.md  
├─ LinearSearch.java  
├─ BinarySearch.java  
└─ notes.md

---

## 🧩 Linear vs Binary Search

| Feature               | Linear Search | Binary Search    |
| --------------------- | ------------- | ---------------- |
| Works on sorted array | ❌ No         | ✅ Yes           |
| Approach              | Sequential    | Divide & Conquer |
| Time Complexity       | O(n)          | O(log n)         |
| Speed                 | Slow          | Fast             |

Binary search reduces the search space by half every step.

---

## 💻 Code Implementation

### ✔ Linear Search

👉 [LinearSearch.java](./LinearSearch.java)

### ✔ Binary Search

👉 [BinarySearch.java](./BinarySearch.java)

---

## 📝 Notes & Observations

- Binary search is extremely efficient for large datasets
- Sorting is mandatory before applying binary search
- Writing searching logic using methods improves reusability
- Time complexity is a key interview topic

---

## 💡 Key Takeaways

- Searching is a fundamental DSA operation
- Binary search is one of the most asked interview algorithms
- Algorithm choice impacts performance
- Clean logic > complex code

---

## 🎯 Interview Preparation (Day 017 Level)

**Q1. What is Linear Search?**  
Linear search checks each element sequentially until the key is found.

**Q2. What is Binary Search?**  
Binary search finds an element in a sorted array by repeatedly dividing the search space into half.

**Q3. Why is Binary Search faster?**  
Because it eliminates half of the remaining elements in each step → O(log n).

**Q4. What is the condition to apply Binary Search?**  
The array must be sorted.

**Q5. Which search is better for small datasets?**  
Linear search (simpler and sorting is not required).

---

## ⏭️ What’s Next?

<div align="center">

### 👉 **Day 018 – Sorting Basics (Bubble Sort)**

Next, I will:

- Learn how sorting works
- Implement Bubble Sort
- Understand swapping & comparisons
- Analyze time complexity

<br/>

[➡️ Go to Day 018](../Day-018/README.md)

</div>

---
