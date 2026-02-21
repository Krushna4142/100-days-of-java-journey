<div align="center">

# 📅 Day 018 — Sorting (Bubble Sort & Selection Sort)

### Understanding How Data Gets Ordered Efficiently

<img src="https://img.shields.io/badge/Day-18-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Easy--Medium-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Sorting%20Algorithms-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🛠️ What I Built](#️-what-i-built)
- [📁 Folder Structure](#-folder-structure)
- [🧩 Bubble Sort vs Selection Sort](#-bubble-sort-vs-selection-sort)
- [💻 Code Implementation](#-code-implementation)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation (Day 018 Level)](#-interview-preparation-day-018-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 018** was to understand how sorting algorithms work internally and how different approaches affect performance.

This day focused on:

- Bubble Sort
- Selection Sort
- Swapping logic
- Comparing time complexity
- Writing clean modular code

---

## 🧠 Concepts Practiced

### Bubble Sort

- Repeatedly compares adjacent elements
- Pushes largest element to the end in each pass
- Simple but not efficient for large datasets

### Selection Sort

- Finds the minimum element
- Places it at the correct position
- Reduces unnecessary swaps

---

## 🛠️ What I Built

Implemented:

- Bubble Sort with optimization
- Selection Sort
- Ascending order sorting
- Reusable sorting methods

The focus was on **understanding the algorithm step-by-step**, not memorizing.

---

## 📁 Folder Structure

Day-018/  
├─ README.md  
├─ BubbleSort.java  
├─ SelectionSort.java  
└─ notes.md

---

## 🧩 Bubble Sort vs Selection Sort

| Feature    | Bubble Sort         | Selection Sort |
| ---------- | ------------------- | -------------- |
| Swaps      | Many swaps          | Fewer swaps    |
| Approach   | Adjacent comparison | Select minimum |
| Best Case  | O(n) (optimized)    | O(n²)          |
| Worst Case | O(n²)               | O(n²)          |
| Stability  | Stable              | Not stable     |

---

## 💻 Code Implementation

### ✔ Bubble Sort

👉 [BubbleSort.java](./BubbleSort.java)

### ✔ Selection Sort

👉 [SelectionSort.java](./SelectionSort.java)

---

## 📝 Notes & Observations

- Sorting helps in faster searching (Binary Search)
- Bubble sort is good for learning but not for production
- Selection sort minimizes swaps
- Understanding iteration flow is key

---

## 💡 Key Takeaways

- Sorting is one of the most important DSA foundations
- Time complexity is a frequent interview topic
- Writing sorting logic improves array mastery
- Clean code structure matters

---

## 🎯 Interview Preparation (Day 018 Level)

**Q1. What is Bubble Sort?**  
Bubble sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

**Q2. Why is Bubble Sort called Bubble Sort?**  
Because the largest elements “bubble up” to the end after each pass.

**Q3. What is Selection Sort?**  
Selection sort selects the minimum element and places it at the correct position.

**Q4. Which performs fewer swaps?**  
Selection sort.

**Q5. What is the time complexity of both algorithms?**  
Worst case → O(n²)

---

## ⏭️ What’s Next?

<div align="center">

### 👉 **Day 019 – Insertion Sort**

Next, I will:

- Learn how shifting works instead of swapping
- Understand adaptive sorting
- Compare all basic sorting algorithms

<br/>

[➡️ Go to Day 019](../Day-019/README.md)

</div>

---
